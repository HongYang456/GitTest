package com.example.gittest.contract;

import com.example.gittest.bean.UserBean;
import com.example.mvplibrary.base.BaseView;
import com.example.mvplibrary.base.IBaseModel;
import com.example.mvplibrary.net.INetCallBack;

public class MainContract {
    public interface IMainModel extends IBaseModel {
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
