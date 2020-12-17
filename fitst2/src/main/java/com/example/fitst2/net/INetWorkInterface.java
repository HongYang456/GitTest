package com.example.fitst2.net;

import java.util.HashMap;

public interface INetWorkInterface {
    public <T> void get(String url, INetCallBack<T> callBack);

    public <T> void post(String url, INetCallBack<T> callBack);

    public <T> void get(String url, HashMap<String, String> map, INetCallBack<T> callBack);
}
