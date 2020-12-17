package com.example.first1.contract;

import com.example.first1.base.BaseView;
import com.example.first1.bean.UserBean;
import com.example.first1.utils.net.INetCallBack;

public class MainContract {
    public interface IMainModel{
        <T> void getLoginData(String url , INetCallBack<T> callBack);
    }

    public interface IMainPresenter{
        void login(String name, String password);
        void loginResult(String result);
    }

    public interface IMainView extends BaseView{
        String getUserName();
        String getPassWord();
        void getLoginData(UserBean userBean);
    }
}
