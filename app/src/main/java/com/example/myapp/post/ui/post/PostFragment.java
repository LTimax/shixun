package com.example.myapp.post.ui.post;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapp.databinding.FragmentPostBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class PostFragment extends Fragment {

    private PostViewModel postViewModel;
    private FragmentPostBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        postViewModel =
                new ViewModelProvider(this).get(PostViewModel.class);

        binding = FragmentPostBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //悬浮的加号按钮的点击监听
        FloatingActionButton fab = binding.addPost;

        fab.setOnClickListener(v -> startActivity(new Intent(root.getContext(),AddPostActivity.class)));

        final TextView textView = binding.textPost;
        postViewModel.getText().observe(getViewLifecycleOwner(), s -> textView.setText(s));
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}