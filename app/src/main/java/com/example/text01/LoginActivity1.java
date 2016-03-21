package com.example.text01;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by 逍遥 on 2016/3/21.
 */
public class LoginActivity1 extends Activity {
    private EditText et_username;
    private EditText et_password;
    private Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login1);
        init();
    }

    private void init() {
        et_password=(EditText) findViewById(R.id.login_password);
        et_username=(EditText) findViewById(R.id.login_username);
        bt_login=(Button) findViewById(R.id.login_button);

    }
}
