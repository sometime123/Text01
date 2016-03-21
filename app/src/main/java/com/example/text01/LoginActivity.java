package com.example.text01;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoginActivity extends Activity {
    private final long SPLASH_LENGTH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        handler.sendEmptyMessageDelayed(1,SPLASH_LENGTH);//指定多少毫秒发送空消息
    }

    Handler handler = new Handler(){
        public void handleMessage(android.os.Message msg){
            if (msg.what==1){
                Intent intent = new Intent(LoginActivity.this,LoginActivity1.class);
                startActivity(intent);
                finish();
            }
        }

    };
}








