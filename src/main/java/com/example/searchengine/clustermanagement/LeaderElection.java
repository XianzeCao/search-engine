package com.example.searchengine.clustermanagement;

import org.apache.zookeeper.ZooKeeper;

public class LeaderElection {

    private static final String ELECTION_NAMESPACE = "/election";
    private String currentZnodeName;

    private final ZooKeeper zooKeeper;

    private OnElectionCallback onElectionCallback;

    public LeaderElection(ZooKeeper zooKeeper, OnElectionCallback onElectionCallback) {
        this.zooKeeper = zooKeeper;
        this.onElectionCallback = onElectionCallback;
    }

}
