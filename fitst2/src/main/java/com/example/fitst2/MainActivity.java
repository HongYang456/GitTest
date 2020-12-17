package com.example.fitst2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fitst2.base.BaseActivity;
import com.example.fitst2.contract.MainContract;
import com.example.fitst2.net.INetCallBack;
import com.example.fitst2.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.IMainModel {
    @Override
    protected MainPresenter getPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public <T> void getLoginData(String url, INetCallBack<T> callBack) {

    }
}