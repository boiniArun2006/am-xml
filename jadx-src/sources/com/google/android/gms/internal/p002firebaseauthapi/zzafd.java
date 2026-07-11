package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzafd implements zzafe {
    private final /* synthetic */ String zza;

    zzafd(zzaez zzaezVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(PhoneAuthProvider.j jVar, Object... objArr) {
        jVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
