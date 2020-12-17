package com.example.first1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.first1.base.BaseActivity;
import com.example.first1.bean.UserBean;
import com.example.first1.contract.MainContract;
import com.example.first1.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.IMainView {

    TextView tv;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        tv = findViewById(R.id.tv);
    }

    @Override
    protected MainPresenter getPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getPassWord() {
        return null;
    }

    @Override
    public void getLoginData(UserBean userBean) {

    }
}