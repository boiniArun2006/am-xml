package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f60544n;

    public enum j {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(j jVar) {
        this.f60544n = jVar;
    }

    public FirebaseInstallationsException(String str, j jVar) {
        super(str);
        this.f60544n = jVar;
    }
}
