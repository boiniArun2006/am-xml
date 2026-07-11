package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zztl implements zzto {
    zztl() {
    }

    @Override // com.google.android.gms.internal.ads.zzto
    public final int zzb(zzv zzvVar) {
        return zzvVar.zzs != null ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    @Nullable
    public final zzth zza(@Nullable zztj zztjVar, zzv zzvVar) {
        if (zzvVar.zzs == null) {
            return null;
        }
        return new zztp(new zztg(new zztq(1), 6001));
    }
}
