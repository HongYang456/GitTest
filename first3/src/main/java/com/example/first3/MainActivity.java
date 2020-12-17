package com.example.first3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.first3.base.BaseActivity;
import com.example.first3.contract.MainContract;
import com.example.first3.net.INetCallBack;
import com.example.first3.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.IMainModel {

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

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
    public <T> void getLoginData(String url, INetCallBack<T> callBack) {

    }
}