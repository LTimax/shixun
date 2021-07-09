package com.example.myapp.post.ui.message.chat;

import java.io.Serializable;
import java.util.List;

public class MessageBox  {
    //聊天对象
    private ChatUser chatUser;
    //消息记录
    private List<Msg> msgList;
    //聊天对象
    private String title;
    public MessageBox(){

    }
    public MessageBox(ChatUser cUser,List<Msg> mList){
        chatUser = cUser;
        msgList  = mList;
        if(null!=cUser.getName()){
            title = cUser.getName();
        }else title = " ";
    }

    public ChatUser getChatUser() {
        return chatUser;
    }

    public List<Msg> getMsgList() {
        return msgList;
    }

    public String getTitle() {
        return title;
    }
}
