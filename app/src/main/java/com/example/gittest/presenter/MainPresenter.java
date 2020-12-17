package com.example.gittest.presenter;

import com.example.gittest.base.BasePresenter;
import com.example.gittest.bean.UserBean;
import com.example.gittest.contract.MainContract;
import com.example.gittest.mdoel.MainModel;
import com.example.gittest.utils.net.INetCallBack;

public class MainPresenter extends BasePresenter implements MainContract.IMainPresenter {

    private MainContract.IMainModel mainModel;
    private MainContract.IMainView mainView;

    public MainPresenter(MainContract.IMainView mainView) {
        this.mainModel = new MainModel(this);
        this.mainView = mainView;
    }

    @Override
    public void login(String name, String password) {
        mainModel.getLoginData("", new INetCallBack<UserBean>() {
            @Override
            public void success(UserBean userBean) {
                mainView.getLoginData(userBean);
            }

            @Override
            public void onFail(String err) {

            }
        });
    }

    @Override
    public void loginResult(String result) {
    }
}
