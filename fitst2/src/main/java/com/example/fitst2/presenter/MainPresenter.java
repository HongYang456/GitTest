package com.example.fitst2.presenter;


import com.example.fitst2.MainActivity;
import com.example.fitst2.base.BasePresenter;
import com.example.fitst2.bean.UserBean;
import com.example.fitst2.contract.MainContract;
import com.example.fitst2.mdoel.MainModel;
import com.example.fitst2.net.INetCallBack;

public class MainPresenter extends BasePresenter<MainContract.IMainView> implements MainContract.IMainPresenter {

    private MainContract.IMainModel mainModel;

    public MainPresenter(MainActivity mainView) {
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
}
