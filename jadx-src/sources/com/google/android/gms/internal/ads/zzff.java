package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzff {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzff() {
        throw null;
    }

    public final synchronized void zza(long j2, Object obj) {
        try {
            if (this.zzd > 0) {
                if (j2 <= this.zza[((this.zzc + r0) - 1) % this.zzb.length]) {
                    zzb();
                }
            }
            int length = this.zzb.length;
            if (this.zzd >= length) {
                int i2 = length + length;
                long[] jArr = new long[i2];
                Object[] objArr = new Object[i2];
                int i3 = this.zzc;
                int i5 = length - i3;
                System.arraycopy(this.zza, i3, jArr, 0, i5);
                System.arraycopy(this.zzb, this.zzc, objArr, 0, i5);
                int i7 = this.zzc;
                if (i7 > 0) {
                    System.arraycopy(this.zza, 0, jArr, i5, i7);
                    System.arraycopy(this.zzb, 0, objArr, i5, this.zzc);
                }
                this.zza = jArr;
                this.zzb = objArr;
                this.zzc = 0;
            }
            int i8 = this.zzc;
            int i9 = this.zzd;
            Object[] objArr2 = this.zzb;
            int length2 = (i8 + i9) % objArr2.length;
            this.zza[length2] = j2;
            objArr2[length2] = obj;
            this.zzd = i9 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        Arrays.fill(this.zzb, (Object) null);
    }

    public final synchronized int zzc() {
        return this.zzd;
    }

    @Nullable
    public final synchronized Object zzd() {
        if (this.zzd == 0) {
            return null;
        }
        return zzf();
    }

    @Nullable
    public final synchronized Object zze(long j2) {
        Object objZzf;
        objZzf = null;
        while (this.zzd > 0 && j2 - this.zza[this.zzc] >= 0) {
            objZzf = zzf();
        }
        return objZzf;
    }

    public zzff(int i2) {
        this.zza = new long[10];
        this.zzb = new Object[10];
    }

    @Nullable
    private final Object zzf() {
        zzgrc.zzi(this.zzd > 0);
        Object[] objArr = this.zzb;
        int i2 = this.zzc;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.zzc = (i2 + 1) % objArr.length;
        this.zzd--;
        return obj;
    }
}
