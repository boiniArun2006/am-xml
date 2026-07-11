package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f60708t;

    public FirebaseRemoteConfigServerException(int i2, String str) {
        super(str);
        this.f60708t = i2;
    }

    public int n() {
        return this.f60708t;
    }

    public FirebaseRemoteConfigServerException(int i2, String str, Throwable th) {
        super(str, th);
        this.f60708t = i2;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.j jVar) {
        super(str, jVar);
        this.f60708t = -1;
    }

    public FirebaseRemoteConfigServerException(int i2, String str, FirebaseRemoteConfigException.j jVar) {
        super(str, jVar);
        this.f60708t = i2;
    }
}
