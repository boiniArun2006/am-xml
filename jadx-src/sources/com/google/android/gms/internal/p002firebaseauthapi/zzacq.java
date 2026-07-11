package com.google.android.gms.internal.p002firebaseauthapi;

import android.support.v4.media.j;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.o;
import oW.InterfaceC2316p;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@VisibleForTesting
final class zzacq extends zzaex<Void, InterfaceC2316p> {
    private final o zzu;
    private final String zzv;

    @Nullable
    private final String zzw;

    @Nullable
    private final String zzx;

    public zzacq(o oVar, String str, @Nullable String str2, @Nullable String str3) {
        super(2);
        j.n(Preconditions.checkNotNull(oVar));
        this.zzv = Preconditions.checkNotEmpty(str);
        this.zzw = str2;
        this.zzx = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza((o) null, this.zzv, this.zzw, this.zzx, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        ((InterfaceC2316p) this.zze).n(this.zzj, zzach.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
