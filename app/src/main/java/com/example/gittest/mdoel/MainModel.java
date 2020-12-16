package com.example.gittest.mdoel;

import com.example.gittest.contract.MainContract;

public class MainModel implements MainContract.IMainModel {

    private MainContract.IMainPresenter presenter;

    public MainModel(MainContract.IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getLoginData() {
        presenter.loginResult("YES");
    }
}
