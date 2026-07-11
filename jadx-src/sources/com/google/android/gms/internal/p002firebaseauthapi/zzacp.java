package com.google.android.gms.internal.p002firebaseauthapi;

import android.support.v4.media.j;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzz;
import com.google.firebase.auth.o;
import oW.InterfaceC2316p;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@VisibleForTesting
final class zzacp extends zzaex<AuthResult, InterfaceC2316p> {
    private final o zzu;
    private final String zzv;

    @Nullable
    private final String zzw;

    public zzacp(o oVar, String str, @Nullable String str2) {
        super(2);
        j.n(Preconditions.checkNotNull(oVar));
        this.zzv = Preconditions.checkNotEmpty(str);
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzv, (o) null, this.zzw, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        zzaf zzafVarZza = zzach.zza(this.zzc, this.zzk);
        FirebaseUser firebaseUser = this.zzd;
        if (firebaseUser != null && !firebaseUser.f().equalsIgnoreCase(zzafVarZza.f())) {
            zza(new Status(17024));
        } else {
            ((InterfaceC2316p) this.zze).n(this.zzj, zzafVarZza);
            zzb(new zzz(zzafVarZza));
        }
    }
}
