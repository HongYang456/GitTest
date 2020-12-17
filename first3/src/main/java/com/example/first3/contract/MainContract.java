package com.example.first3.contract;


import com.example.first3.base.BaseView;
import com.example.first3.bean.UserBean;
import com.example.first3.net.INetCallBack;

public class MainContract {
    public interface IMainModel{
        <T> void getLoginData(String url , INetCallBack<T> callBack);
    }

    public interface IMainPresenter{
        void login(String name, String password);
        void loginResult(String result);
    }

    public interface IMainView extends BaseView {
        String getUserName();
        String getPassWord();
        void getLoginData(UserBean userBean);
    }
}
