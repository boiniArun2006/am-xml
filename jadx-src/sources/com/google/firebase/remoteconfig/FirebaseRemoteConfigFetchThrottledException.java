package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f60707t;

    public FirebaseRemoteConfigFetchThrottledException(long j2) {
        this("Fetch was throttled.", j2);
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j2) {
        super(str);
        this.f60707t = j2;
    }
}
