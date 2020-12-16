package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.gittest.base.BaseActivity;
import com.example.gittest.contract.MainContract;
import com.example.gittest.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.IMainView {

    private EditText editTextTextPassword;
    private EditText editTextTextPassword2;

    @Override
    protected MainPresenter getPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void initData() {
        presenter.login(getUserName(), getPassword());
    }

    @Override
    protected void initView() {
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        editTextTextPassword2 = findViewById(R.id.editTextTextPassword2);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    //返回数据
    @Override
    public void getLoginData(String string) {

    }

    @Override
    public String getUserName() {
        return editTextTextPassword.getText().toString();
    }

    @Override
    public String getPassword() {
        return editTextTextPassword2.getText().toString();
    }

    /*
     * 登录
     * */
    public void loginButton(View view) {
        if (!TextUtils.isEmpty(getUserName()) && !TextUtils.isEmpty(getPassword())) {
            presenter.login(getUserName(), getPassword());
        }
    }
}