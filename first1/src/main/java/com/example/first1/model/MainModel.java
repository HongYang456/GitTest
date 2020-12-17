package com.example.first1.model;

import com.example.first1.contract.MainContract;
import com.example.first1.utils.net.INetCallBack;
import com.example.first1.utils.net.RetrofitUtils;

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
