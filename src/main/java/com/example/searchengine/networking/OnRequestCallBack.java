package com.example.searchengine.networking;

public interface OnRequestCallBack {
    byte[] handleRequest(byte[] requestPayLoad);

    String getEndPoint();
}
