package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f60700n;

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.f60700n = j.UNKNOWN;
    }

    public enum j {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f60706n;

        j(int i2) {
            this.f60706n = i2;
        }
    }

    public FirebaseRemoteConfigException(String str, Throwable th) {
        super(str, th);
        this.f60700n = j.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, j jVar) {
        super(str);
        this.f60700n = jVar;
    }

    public FirebaseRemoteConfigException(String str, Throwable th, j jVar) {
        super(str, th);
        this.f60700n = jVar;
    }
}
