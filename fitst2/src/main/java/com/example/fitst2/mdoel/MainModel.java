package com.example.fitst2.mdoel;


import com.example.fitst2.contract.MainContract;
import com.example.fitst2.net.INetCallBack;
import com.example.fitst2.net.RetrofitUtils;

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