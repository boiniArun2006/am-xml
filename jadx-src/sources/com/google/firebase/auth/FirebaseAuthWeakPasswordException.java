package com.google.firebase.auth;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class FirebaseAuthWeakPasswordException extends FirebaseAuthInvalidCredentialsException {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f60108t;

    public FirebaseAuthWeakPasswordException(String str, String str2, String str3) {
        super(str, str2);
        this.f60108t = str3;
    }
}
