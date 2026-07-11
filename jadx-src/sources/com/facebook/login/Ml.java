package com.facebook.login;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum Ml {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f52925n;

    public final String rl() {
        return this.f52925n;
    }

    Ml(String str) {
        this.f52925n = str;
    }
}
