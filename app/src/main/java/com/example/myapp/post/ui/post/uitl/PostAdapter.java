package com.example.myapp.post.ui.post.uitl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.R;
import com.example.myapp.post.ui.post.Post;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private List<Post> posts;

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView createTime;
        TextView context;

        public ViewHolder( View itemView) {
            super(itemView);
            createTime = (TextView) itemView.findViewById(R.id.post_add_time);
            context = (TextView)itemView.findViewById(R.id.post_context);
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
