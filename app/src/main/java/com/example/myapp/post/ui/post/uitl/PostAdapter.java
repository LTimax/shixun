package com.example.myapp.post.ui.post.uitl;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.post.ui.post.Post;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private List<Post> posts;

    static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder( View itemView) {
            super(itemView);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }




}
