package com.google.firebase.auth;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class FirebaseAuthUserCollisionException extends FirebaseAuthException {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f60106O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AuthCredential f60107t;

    public final FirebaseAuthUserCollisionException O(String str) {
        this.f60106O = str;
        return this;
    }

    public final FirebaseAuthUserCollisionException nr(AuthCredential authCredential) {
        this.f60107t = authCredential;
        return this;
    }

    public final String rl() {
        return this.f60106O;
    }

    public final AuthCredential t() {
        return this.f60107t;
    }

    public FirebaseAuthUserCollisionException(String str, String str2) {
        super(str, str2);
    }
}
