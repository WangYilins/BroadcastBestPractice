package com.example.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity implements View.OnClickListener {


    private EditText mAccount;
    private EditText mPassword;
    /**
     * Login
     */
    private Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO:OnCreate Method has been created, run FindViewById again to generate code
        setContentView(R.layout.activity_login);
        initView();
    }

    public void initView() {
        mAccount = findViewById(R.id.account);
        mPassword = findViewById(R.id.password);
        mLogin = findViewById(R.id.login);
        mLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.login:

                String account = mAccount.getText().toString();
                String password = mPassword.getText().toString();

                if (account.equals("admin") && password.equals("123456")) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "account or password is invalid", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
