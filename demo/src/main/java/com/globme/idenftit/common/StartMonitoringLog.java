package com.globme.idenftit.common;

class StartMonitoringLog  {

    public static void main(String[] args) throws InterruptedException {

        Runnable r = new DeviceSdkBroker();
        Thread tr = new Thread(r);

        tr.start();
        tr.join();
    }

    static {
        System.loadLibrary("BS_SDK_V2_wrap");
    }
}


class Command {
    public int command;
    public long parameter1;
    public long parameter2;
}