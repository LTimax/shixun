package com.example.myapp.post.ui.message.chat.util;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.R;
import com.example.myapp.post.PostActivity;
import com.example.myapp.post.ui.message.chat.ChatUser;
import com.example.myapp.post.ui.message.chat.MessageBox;
import com.example.myapp.post.ui.message.chat.Msg;
import com.example.myapp.post.ui.message.chat.ui.ChatActivity;


import java.util.ArrayList;
import java.util.List;

public class MsgBoxAdapter extends RecyclerView.Adapter<MsgBoxAdapter.ViewHolder> {

    private List<MessageBox> MsgBoxList;


    static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ChatUserIcon;
        TextView cUserName;
        TextView LatestMsg;
        View MsgBoxesView;
        Context context;

        public ViewHolder(View itemView) {
            super(itemView);
            MsgBoxesView = itemView;
            context = itemView.getContext();
            ChatUserIcon = (ImageView)itemView.findViewById(R.id.chat_user_icon);
            cUserName = (TextView)itemView.findViewById(R.id.cUser_name);
            LatestMsg = (TextView)itemView.findViewById(R.id.latest_msg);

        }
    }
    public MsgBoxAdapter(List<MessageBox> messageBoxList){

        MsgBoxList = messageBoxList;

    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.msgbox_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.MsgBoxesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getLayoutPosition();
                Context mContext = v.getContext();
                //获取点击的消息记录
                MessageBox messageBox = MsgBoxList.get(position);
                ChatUser chatUser = messageBox.getChatUser();
                List<Msg> msgList = messageBox.getMsgList();
                Toast.makeText(mContext,"chat with "+messageBox.getTitle()+" is on clicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext,ChatActivity.class);
                //传递聊天对象昵称
                intent.putExtra("title",messageBox.getTitle());
                //传递聊天对像id
                intent.putExtra("cUid",chatUser.getId());
                //传递信息记录
                intent.putExtra("msgList", (ArrayList<Msg>) msgList);

                mContext.startActivity(intent);


            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        MessageBox messageBox = MsgBoxList.get(position);
        holder.ChatUserIcon.setImageResource(messageBox.getChatUser().getIcon());
        holder.cUserName.setText(messageBox.getTitle());
        holder.LatestMsg.setText(messageBox.getMsgList().get(messageBox.getMsgList().size()-1).getContent());


    }

    @Override
    public int getItemCount() {
        return MsgBoxList.size();
    }



}
