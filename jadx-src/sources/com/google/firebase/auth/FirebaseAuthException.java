package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class FirebaseAuthException extends FirebaseException {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60104n;

    public String n() {
        return this.f60104n;
    }

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        this.f60104n = Preconditions.checkNotEmpty(str);
    }
}
