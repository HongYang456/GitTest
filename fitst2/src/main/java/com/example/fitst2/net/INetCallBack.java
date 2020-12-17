package com.example.fitst2.net;

public interface INetCallBack<T> {
    public void success(T t);

    public void onFail(String err);
}
