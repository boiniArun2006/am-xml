package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhin {
    final zzhim zza;
    final long[] zzb;

    zzhin(zzhim zzhimVar, long[] jArr) {
        this.zza = zzhimVar;
        this.zzb = jArr;
    }

    static /* synthetic */ zzhin zza(zzhin zzhinVar, zzhil zzhilVar) {
        zzb(zzhinVar, zzhilVar);
        return zzhinVar;
    }

    zzhin() {
        this(new zzhim(), new long[10]);
    }

    private static zzhin zzb(zzhin zzhinVar, zzhil zzhilVar) {
        zzhim zzhimVar = zzhilVar.zza;
        zzhim zzhimVar2 = zzhinVar.zza;
        long[] jArr = zzhimVar2.zza;
        long[] jArr2 = zzhimVar.zza;
        long[] jArr3 = zzhilVar.zzb;
        zzhiv.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhimVar2.zzb;
        long[] jArr5 = zzhimVar.zzb;
        long[] jArr6 = zzhimVar.zzc;
        zzhiv.zze(jArr4, jArr5, jArr6);
        zzhiv.zze(zzhimVar2.zzc, jArr6, jArr3);
        zzhiv.zze(zzhinVar.zzb, jArr2, jArr5);
        return zzhinVar;
    }

    zzhin(zzhil zzhilVar) {
        this();
        zzb(this, zzhilVar);
    }
}
