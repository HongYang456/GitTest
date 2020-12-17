package com.example.first3.presenter;


import com.example.first3.MainActivity;
import com.example.first3.base.BasePresenter;
import com.example.first3.bean.UserBean;
import com.example.first3.contract.MainContract;
import com.example.first3.model.MainModel;
import com.example.first3.net.INetCallBack;

public class MainPresenter extends BasePresenter<MainContract.IMainView> implements MainContract.IMainPresenter {
    private MainContract.IMainModel mainModel;

    public MainPresenter(MainActivity mainModel) {
        this.mainModel = new MainModel(this);
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
