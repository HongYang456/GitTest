package com.example.first1.utils.net;

public interface INetCallBack<T> {
    public void sunccess(T t);
    public void onFiil(String err);
}
