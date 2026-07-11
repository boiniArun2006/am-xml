package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzahr {
    private final String zza;
    private final zzaiy zzb;

    public final zzaiy zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public zzahr(String str, zzaiy zzaiyVar) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = (zzaiy) Preconditions.checkNotNull(zzaiyVar);
    }
}
