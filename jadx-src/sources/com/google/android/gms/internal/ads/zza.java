package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zza {
    public final long zza;
    public final int zzb;

    @Deprecated
    public final Uri[] zzc;
    public final zzak[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final String[] zzg;
    public final zzb[] zzh;
    public final long zzi;
    public final boolean zzj;

    public zza(long j2) {
        this(0L, -1, -1, new int[0], new zzak[0], new long[0], 0L, false, new String[0], new zzb[0], false);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zza.class == obj.getClass()) {
            zza zzaVar = (zza) obj;
            if (this.zzb == zzaVar.zzb && Arrays.equals(this.zzd, zzaVar.zzd) && Arrays.equals(this.zze, zzaVar.zze) && Arrays.equals(this.zzf, zzaVar.zzf) && Arrays.equals(this.zzg, zzaVar.zzg) && Arrays.equals(this.zzh, zzaVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int zza(@IntRange int i2) {
        int i3;
        int i5 = i2 + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i5 >= iArr.length || (i3 = iArr[i5]) == 0 || i3 == 1) {
                break;
            }
            i5++;
        }
        return i5;
    }

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
    }

    private zza(long j2, int i2, int i3, int[] iArr, zzak[] zzakVarArr, long[] jArr, long j3, boolean z2, String[] strArr, zzb[] zzbVarArr, boolean z3) {
        Uri uri;
        int length = iArr.length;
        int length2 = zzakVarArr.length;
        int i5 = 0;
        zzgrc.zza(length == length2);
        zzgrc.zza(length == zzbVarArr.length);
        this.zza = 0L;
        this.zzb = i2;
        this.zze = iArr;
        this.zzd = zzakVarArr;
        this.zzf = jArr;
        this.zzi = 0L;
        this.zzj = false;
        this.zzc = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.zzc;
            if (i5 >= uriArr.length) {
                this.zzg = strArr;
                this.zzh = zzbVarArr;
                return;
            }
            zzak zzakVar = zzakVarArr[i5];
            if (zzakVar == null) {
                uri = null;
            } else {
                zzag zzagVar = zzakVar.zzb;
                zzagVar.getClass();
                uri = zzagVar.zza;
            }
            uriArr[i5] = uri;
            i5++;
        }
    }

    public final int hashCode() {
        return ((((((((((((this.zzb * 31) - 1) * 961) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze)) * 31) + Arrays.hashCode(this.zzf)) * 29791) + Arrays.hashCode(this.zzg)) * 31) + Arrays.hashCode(this.zzh)) * 31;
    }

    @CheckResult
    public final zza zzb(int i2) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        zzak[] zzakVarArr = (zzak[]) Arrays.copyOf(this.zzd, 0);
        String[] strArr = (String[]) Arrays.copyOf(this.zzg, 0);
        zzb[] zzbVarArr = this.zzh;
        return new zza(0L, 0, -1, iArrCopyOf, zzakVarArr, jArrCopyOf, 0L, false, strArr, (zzb[]) Arrays.copyOf(zzbVarArr, Math.max(0, zzbVarArr.length)), false);
    }
}
