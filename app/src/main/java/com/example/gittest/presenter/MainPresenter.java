package com.example.gittest.presenter;

import com.example.gittest.bean.UserBean;
import com.example.gittest.contract.MainContract;
import com.example.gittest.mdoel.MainModel;
import com.example.mvplibrary.base.BasePresenter;
import com.example.mvplibrary.net.INetCallBack;

public class MainPresenter extends BasePresenter<MainContract.IMainView, MainContract.IMainModel> implements MainContract.IMainPresenter {

    private MainContract.IMainModel mainModel;

    public MainPresenter(MainContract.IMainView mainView) {
        this.mainModel = new MainModel(this);
    }

    @Override
    public void login(String name, String password) {
        mainModel.getLoginData("", new INetCallBack<UserBean>() {
            @Override
            public void success(UserBean userBean) {
                iview.getLoginData(userBean);
            }

            @Override
            public void onFail(String err) {

            }
        });
    }

    @Override
    public void loginResult(String result) {
    }

    @Override
    protected MainContract.IMainModel getModel() {
        return new MainModel(this);
    }
}
