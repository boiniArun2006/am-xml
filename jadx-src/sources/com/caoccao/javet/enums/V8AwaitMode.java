package com.caoccao.javet.enums;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum V8AwaitMode {
    RunNoWait(2),
    RunOnce(1),
    RunTillNoMoreTasks(0);

    private final int id;

    public int getId() {
        return this.id;
    }

    V8AwaitMode(int i2) {
        this.id = i2;
    }
}
