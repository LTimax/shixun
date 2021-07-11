package com.example.myapp.myapplication;

public class ApplicationStatus {

    private static final ApplicationStatus instance = new ApplicationStatus();

    private Integer userId;

    private ApplicationStatus() {
        // 尝试获取sqlite中的userId
    }

    public static void setUserId(Integer userId) {
        instance.userId = userId;
        //更新sqlite相关
    }

    public static Integer getUserId() {
        return instance.userId;
    }


}
