package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzeg {
    private int zza;
    private int zzb;
    private int zzc;
    private long[] zzd;
    private int zze;

    public zzeg() {
        throw null;
    }

    public final boolean zzd() {
        return this.zzc == 0;
    }

    public final void zze() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
    }

    public zzeg(int i2) {
        int i3 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
        this.zzd = new long[i3];
        this.zze = r3.length - 1;
    }

    public final void zza(long j2) {
        int i2 = this.zzc;
        long[] jArr = this.zzd;
        int length = jArr.length;
        if (i2 == length) {
            int i3 = length + length;
            if (i3 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i3];
            int i5 = this.zza;
            int i7 = length - i5;
            System.arraycopy(jArr, i5, jArr2, 0, i7);
            System.arraycopy(this.zzd, 0, jArr2, i7, i5);
            this.zza = 0;
            this.zzb = this.zzc - 1;
            this.zzd = jArr2;
            this.zze = jArr2.length - 1;
            jArr = jArr2;
        }
        int i8 = (this.zzb + 1) & this.zze;
        this.zzb = i8;
        jArr[i8] = j2;
        this.zzc++;
    }

    public final long zzb() {
        int i2 = this.zzc;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.zzd;
        int i3 = this.zza;
        long j2 = jArr[i3];
        this.zza = this.zze & (i3 + 1);
        this.zzc = i2 - 1;
        return j2;
    }

    public final long zzc() {
        if (this.zzc != 0) {
            return this.zzd[this.zza];
        }
        throw new NoSuchElementException();
    }
}
