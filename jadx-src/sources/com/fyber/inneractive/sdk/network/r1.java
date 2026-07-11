package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public enum r1 {
    EVENT_TABLE("sdk_event_"),
    ERROR_TABLE("sdk_error_");

    private final String tableName;

    public final String a() {
        return this.tableName;
    }

    r1(String str) {
        this.tableName = str;
    }
}
