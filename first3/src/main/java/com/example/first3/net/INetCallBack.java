package com.example.first3.net;

public interface INetCallBack<T> {
    public void sunccess(T t);
    public void onFiil(String err);
}
