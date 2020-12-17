package com.example.first1.presenter;

import com.example.first1.base.BasePresenter;
import com.example.first1.bean.UserBean;
import com.example.first1.contract.MainContract;
import com.example.first1.utils.net.INetCallBack;

public class MainPresenter extends BasePresenter<MainContract.IMainView> implements MainContract.IMainPresenter {
    private MainContract.IMainModel mainModel;

    public MainPresenter(MainContract.IMainModel mainModel) {
        this.mainModel = mainModel;
    }

    @Override
    public void login(String name, String password) {
        mainModel.getLoginData("", new INetCallBack<UserBean>() {
            @Override
            public void sunccess(UserBean userBean) {
                iview.getLoginData(userBean);
            }

            @Override
            public void onFiil(String err) {

            }
        });
    }

    @Override
    public void loginResult(String result) {

    }
}
