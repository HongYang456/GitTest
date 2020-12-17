package com.example.first3.model;


import com.example.first3.contract.MainContract;
import com.example.first3.net.INetCallBack;
import com.example.first3.net.RetrofitUtils;

public class MainModel implements MainContract.IMainModel {
    private MainContract.IMainPresenter presenter;

    public MainModel(MainContract.IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getLoginData(String url, INetCallBack<T> callBack) {
        RetrofitUtils.getInstance().get(url, callBack);
    }
}
