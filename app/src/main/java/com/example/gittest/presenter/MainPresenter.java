package com.example.gittest.presenter;

import com.example.gittest.contract.MainContract;
import com.example.gittest.mdoel.MainModel;

public class MainPresenter implements MainContract.IMainPresenter {

    private MainContract.IMainModel mainModel;
    private MainContract.IMainView mainView;

    public MainPresenter(MainContract.IMainView mainView) {
        this.mainModel = new MainModel(this);
        this.mainView = mainView;
    }

    @Override
    public void login(String name, String password) {
        mainModel.getLoginData();
    }

    @Override
    public void loginResult(String result) {
        mainView.getLoginData(result);
    }
}
