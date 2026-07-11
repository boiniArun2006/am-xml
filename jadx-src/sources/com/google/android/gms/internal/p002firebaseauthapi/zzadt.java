package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import oW.InterfaceC2316p;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@VisibleForTesting
final class zzadt extends zzaex<Void, InterfaceC2316p> {
    private final String zzu;
    private final String zzv;

    @Nullable
    private final String zzw;

    public zzadt(String str, String str2, @Nullable String str3) {
        super(2);
        this.zzu = Preconditions.checkNotEmpty(str);
        this.zzv = Preconditions.checkNotEmpty(str2);
        this.zzw = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "unenrollMfa";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzv, this.zzw, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        ((InterfaceC2316p) this.zze).n(this.zzj, zzach.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
