package com.example.gittest.mdoel;

import com.example.gittest.contract.MainContract;
import com.example.mvplibrary.net.INetCallBack;
import com.example.mvplibrary.net.RetrofitUtils;

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
//