package com.example.fitst2.contract;

import com.example.fitst2.base.BaseView;
import com.example.fitst2.bean.UserBean;
import com.example.fitst2.net.INetCallBack;

public class MainContract {
    public interface IMainModel {
        <T> void getLoginData(String url, INetCallBack<T> callBack);
    }

    public interface IMainPresenter {
        void login(String name, String password);

        void loginResult(String result);
    }

    public interface IMainView extends BaseView {
        String getUserName();
        String getPassword();
        void getLoginData(UserBean string);
    }
}
