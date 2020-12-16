package com.example.gittest.base;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<T> extends AppCompatActivity {

    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        if (presenter == null){
            presenter = getPresenter();
        }
        initView();
        initData();
    }

    protected abstract T getPresenter();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayout();
}
