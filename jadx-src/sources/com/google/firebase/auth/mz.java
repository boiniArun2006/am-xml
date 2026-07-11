package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import oW.InterfaceC2316p;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class mz implements oW.Xo, InterfaceC2316p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f60212n;

    mz(FirebaseAuth firebaseAuth) {
        this.f60212n = firebaseAuth;
    }

    @Override // oW.InterfaceC2316p
    public final void n(zzahn zzahnVar, FirebaseUser firebaseUser) {
        this.f60212n.eF(firebaseUser, zzahnVar, true, true);
    }

    @Override // oW.Xo
    public final void zza(Status status) {
        int statusCode = status.getStatusCode();
        if (statusCode != 17011 && statusCode != 17021 && statusCode != 17005) {
            return;
        }
        this.f60212n.ViF();
    }
}
