package com.google.firebase.auth;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class FirebaseAuthMultiFactorException extends FirebaseAuthException {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MultiFactorResolver f60105t;

    public FirebaseAuthMultiFactorException(String str, String str2, MultiFactorResolver multiFactorResolver) {
        super(str, str2);
        this.f60105t = multiFactorResolver;
    }
}
