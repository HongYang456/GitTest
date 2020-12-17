package com.example.gittest.contract;

import com.example.gittest.bean.UserBean;
import com.example.gittest.utils.net.INetCallBack;

public class MainContract {
    public interface IMainModel {
        <T> void getLoginData(String url, INetCallBack<T> callBack);
    }

    public interface IMainPresenter {
        void login(String name, String password);

        void loginResult(String result);
    }

    public interface IMainView {
        String getUserName();
        String getPassword();
        void getLoginData(UserBean string);
    }
}
