package com.example.first3.base;

public class BasePresenter<T extends BaseView>  {
    public T iview;
    public void attachView(T t){
        iview = t;
    }
}
