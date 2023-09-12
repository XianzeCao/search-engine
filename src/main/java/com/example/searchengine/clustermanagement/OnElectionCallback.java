package com.example.searchengine.clustermanagement;

public interface OnElectionCallback {

    void onElectionBecomeLeader();

    void onElectionBecomeWorker();
}
