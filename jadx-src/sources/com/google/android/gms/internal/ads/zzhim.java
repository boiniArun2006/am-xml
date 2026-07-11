package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhim {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    zzhim(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    zzhim() {
        this(new long[10], new long[10], new long[10]);
    }

    static zzhim zza(zzhim zzhimVar, zzhil zzhilVar) {
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = zzhimVar.zza;
        long[] jArr2 = zzhimVar2.zza;
        long[] jArr3 = zzhilVar.zzb;
        zzhiv.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhimVar.zzb;
        long[] jArr5 = zzhimVar2.zzb;
        long[] jArr6 = zzhimVar2.zzc;
        zzhiv.zze(jArr4, jArr5, jArr6);
        zzhiv.zze(zzhimVar.zzc, jArr6, jArr3);
        return zzhimVar;
    }

    final byte[] zzb() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        int i2 = zzhiv.zza;
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = this.zzc;
        zzhiv.zzf(jArr4, jArr14);
        zzhiv.zzf(jArr13, jArr4);
        zzhiv.zzf(jArr12, jArr13);
        zzhiv.zze(jArr5, jArr12, jArr14);
        zzhiv.zze(jArr6, jArr5, jArr4);
        zzhiv.zzf(jArr12, jArr6);
        zzhiv.zze(jArr7, jArr12, jArr5);
        zzhiv.zzf(jArr12, jArr7);
        zzhiv.zzf(jArr13, jArr12);
        zzhiv.zzf(jArr12, jArr13);
        zzhiv.zzf(jArr13, jArr12);
        zzhiv.zzf(jArr12, jArr13);
        zzhiv.zze(jArr8, jArr12, jArr7);
        zzhiv.zzf(jArr12, jArr8);
        zzhiv.zzf(jArr13, jArr12);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            zzhiv.zzf(jArr12, jArr13);
            zzhiv.zzf(jArr13, jArr12);
        }
        zzhiv.zze(jArr9, jArr13, jArr8);
        zzhiv.zzf(jArr12, jArr9);
        zzhiv.zzf(jArr13, jArr12);
        for (int i5 = 2; i5 < 20; i5 += 2) {
            zzhiv.zzf(jArr12, jArr13);
            zzhiv.zzf(jArr13, jArr12);
        }
        zzhiv.zze(jArr12, jArr13, jArr9);
        zzhiv.zzf(jArr13, jArr12);
        zzhiv.zzf(jArr12, jArr13);
        for (int i7 = 2; i7 < 10; i7 += 2) {
            zzhiv.zzf(jArr13, jArr12);
            zzhiv.zzf(jArr12, jArr13);
        }
        zzhiv.zze(jArr10, jArr12, jArr8);
        zzhiv.zzf(jArr12, jArr10);
        zzhiv.zzf(jArr13, jArr12);
        for (int i8 = 2; i8 < 50; i8 += 2) {
            zzhiv.zzf(jArr12, jArr13);
            zzhiv.zzf(jArr13, jArr12);
        }
        zzhiv.zze(jArr11, jArr13, jArr10);
        zzhiv.zzf(jArr13, jArr11);
        zzhiv.zzf(jArr12, jArr13);
        for (int i9 = 2; i9 < 100; i9 += 2) {
            zzhiv.zzf(jArr13, jArr12);
            zzhiv.zzf(jArr12, jArr13);
        }
        zzhiv.zze(jArr13, jArr12, jArr11);
        zzhiv.zzf(jArr12, jArr13);
        zzhiv.zzf(jArr13, jArr12);
        for (int i10 = 2; i10 < 50; i10 += 2) {
            zzhiv.zzf(jArr12, jArr13);
            zzhiv.zzf(jArr13, jArr12);
        }
        zzhiv.zze(jArr12, jArr13, jArr10);
        zzhiv.zzf(jArr13, jArr12);
        zzhiv.zzf(jArr12, jArr13);
        zzhiv.zzf(jArr13, jArr12);
        zzhiv.zzf(jArr12, jArr13);
        zzhiv.zzf(jArr13, jArr12);
        zzhiv.zze(jArr, jArr13, jArr6);
        zzhiv.zze(jArr2, this.zza, jArr);
        zzhiv.zze(jArr3, this.zzb, jArr);
        byte[] bArrZzh = zzhiv.zzh(jArr3);
        bArrZzh[31] = (byte) ((zzhio.zzf(jArr2) << 7) ^ bArrZzh[31]);
        return bArrZzh;
    }

    zzhim(zzhil zzhilVar) {
        this();
        zza(this, zzhilVar);
    }

    zzhim(zzhim zzhimVar) {
        this.zza = Arrays.copyOf(zzhimVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhimVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhimVar.zzc, 10);
    }
}
