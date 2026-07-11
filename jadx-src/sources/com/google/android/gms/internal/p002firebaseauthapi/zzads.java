package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzam;
import oW.InterfaceC2316p;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@VisibleForTesting
final class zzads extends zzaex<Void, InterfaceC2316p> {

    @Nullable
    private final String zzaa;

    @Nullable
    private final String zzab;

    @Nullable
    private final String zzac;
    private final boolean zzad;
    private final String zzu;
    private final String zzv;

    @Nullable
    private final String zzw;
    private final long zzx;
    private final boolean zzy;
    private final boolean zzz;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
    }

    public zzads(zzam zzamVar, String str, @Nullable String str2, long j2, boolean z2, boolean z3, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z4) {
        super(8);
        Preconditions.checkNotNull(zzamVar);
        Preconditions.checkNotEmpty(str);
        this.zzu = Preconditions.checkNotEmpty(zzamVar.zzb());
        this.zzv = str;
        this.zzw = str2;
        this.zzx = j2;
        this.zzy = z2;
        this.zzz = z3;
        this.zzaa = str3;
        this.zzab = str4;
        this.zzac = str5;
        this.zzad = z4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzb);
    }
}
