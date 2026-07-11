package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhil {
    final zzhim zza;
    final long[] zzb;

    zzhil(zzhim zzhimVar, long[] jArr) {
        this.zza = zzhimVar;
        this.zzb = jArr;
    }

    zzhil() {
        this(new zzhim(), new long[10]);
    }

    zzhil(zzhil zzhilVar) {
        this.zza = new zzhim(zzhilVar.zza);
        this.zzb = Arrays.copyOf(zzhilVar.zzb, 10);
    }
}
