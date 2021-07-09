package com.example.myapp.post.ui.message;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MessageViewModel extends ViewModel {
    // TODO: Implement the ViewModel
   private MutableLiveData<String> mText;
   public MessageViewModel(){
       mText = new MutableLiveData<String>();
       mText.setValue("This is message Fragment");
   }
   public LiveData<String> getText(){
       return mText;
   }

}