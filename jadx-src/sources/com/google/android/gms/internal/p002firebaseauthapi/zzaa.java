package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzaa extends zzac {
    private final /* synthetic */ zzf zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzac
    final int zza(int i2) {
        return i2 + 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaa(zzv zzvVar, CharSequence charSequence, zzf zzfVar) {
        super(zzvVar, charSequence);
        this.zzb = zzfVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzac
    final int zzb(int i2) {
        return this.zzb.zza(((zzac) this).zza, i2);
    }
}
