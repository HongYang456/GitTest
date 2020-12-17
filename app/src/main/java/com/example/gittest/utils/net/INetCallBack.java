package com.example.gittest.utils.net;

public interface INetCallBack<T> {
    public void success(T t);

    public void onFail(String err);
}
