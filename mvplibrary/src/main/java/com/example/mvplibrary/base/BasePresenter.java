package com.example.mvplibrary.base;


public abstract class BasePresenter<V extends BaseView , M extends IBaseModel> {

    public V iview;
    public M IModel;

    public void attachView(V v){
        iview = v;
        IModel = getModel();
    }

    public void detachView(){
        if (iview != null){
            iview = null;
            IModel = null;
        }
    }

    protected abstract M getModel();

}
