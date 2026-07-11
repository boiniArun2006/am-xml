package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzbf {
    public static final zzbf zza = new zzbc();

    protected zzbf() {
    }

    public final boolean equals(@Nullable Object obj) {
        int iZzj;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbf)) {
            return false;
        }
        zzbf zzbfVar = (zzbf) obj;
        if (zzbfVar.zza() == zza() && zzbfVar.zzc() == zzc()) {
            zzbe zzbeVar = new zzbe();
            zzbd zzbdVar = new zzbd();
            zzbe zzbeVar2 = new zzbe();
            zzbd zzbdVar2 = new zzbd();
            for (int i2 = 0; i2 < zza(); i2++) {
                if (!zzb(i2, zzbeVar, 0L).equals(zzbfVar.zzb(i2, zzbeVar2, 0L))) {
                    return false;
                }
            }
            for (int i3 = 0; i3 < zzc(); i3++) {
                if (!zzd(i3, zzbdVar, true).equals(zzbfVar.zzd(i3, zzbdVar2, true))) {
                    return false;
                }
            }
            int iZzk = zzk(true);
            if (iZzk == zzbfVar.zzk(true) && (iZzj = zzj(true)) == zzbfVar.zzj(true)) {
                while (iZzk != iZzj) {
                    int iZzh = zzh(iZzk, 0, true);
                    if (iZzh != zzbfVar.zzh(iZzk, 0, true)) {
                        return false;
                    }
                    iZzk = iZzh;
                }
                return true;
            }
        }
        return false;
    }

    public abstract int zza();

    public abstract zzbe zzb(int i2, zzbe zzbeVar, long j2);

    public abstract int zzc();

    public abstract zzbd zzd(int i2, zzbd zzbdVar, boolean z2);

    public abstract int zze(Object obj);

    public abstract Object zzf(int i2);

    public int zzh(int i2, int i3, boolean z2) {
        if (i3 == 0) {
            if (i2 == zzj(z2)) {
                return -1;
            }
            return i2 + 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == zzj(z2) ? zzk(z2) : i2 + 1;
        }
        throw new IllegalStateException();
    }

    public int zzi(int i2, int i3, boolean z2) {
        if (i2 == zzk(false)) {
            return -1;
        }
        return i2 - 1;
    }

    public final int zzl(int i2, zzbd zzbdVar, zzbe zzbeVar, int i3, boolean z2) {
        int i5 = zzd(i2, zzbdVar, false).zzc;
        if (zzb(i5, zzbeVar, 0L).zzo != i2) {
            return i2 + 1;
        }
        int iZzh = zzh(i5, i3, z2);
        if (iZzh == -1) {
            return -1;
        }
        return zzb(iZzh, zzbeVar, 0L).zzn;
    }

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final int hashCode() {
        int i2;
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        int iZza = zza() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        int i3 = 0;
        while (true) {
            i2 = iZza * 31;
            if (i3 >= zza()) {
                break;
            }
            iZza = i2 + zzb(i3, zzbeVar, 0L).hashCode();
            i3++;
        }
        int iZzc = i2 + zzc();
        for (int i5 = 0; i5 < zzc(); i5++) {
            iZzc = (iZzc * 31) + zzd(i5, zzbdVar, true).hashCode();
        }
        int iZzk = zzk(true);
        while (iZzk != -1) {
            iZzc = (iZzc * 31) + iZzk;
            iZzk = zzh(iZzk, 0, true);
        }
        return iZzc;
    }

    public final Pair zzm(zzbe zzbeVar, zzbd zzbdVar, int i2, long j2) {
        Pair pairZzn = zzn(zzbeVar, zzbdVar, i2, j2, 0L);
        pairZzn.getClass();
        return pairZzn;
    }

    public final boolean zzg() {
        if (zza() == 0) {
            return true;
        }
        return false;
    }

    public int zzj(boolean z2) {
        if (zzg()) {
            return -1;
        }
        return zza() - 1;
    }

    public int zzk(boolean z2) {
        if (zzg()) {
            return -1;
        }
        return 0;
    }

    @Nullable
    public final Pair zzn(zzbe zzbeVar, zzbd zzbdVar, int i2, long j2, long j3) {
        zzgrc.zzm(i2, zza(), "index");
        zzb(i2, zzbeVar, j3);
        if (j2 == -9223372036854775807L) {
            long j4 = zzbeVar.zzl;
            j2 = 0;
        }
        int i3 = zzbeVar.zzn;
        zzd(i3, zzbdVar, false);
        while (i3 < zzbeVar.zzo) {
            long j5 = zzbdVar.zze;
            if (j2 == 0) {
                break;
            }
            int i5 = i3 + 1;
            long j6 = zzd(i5, zzbdVar, false).zze;
            if (j2 < 0) {
                break;
            }
            i3 = i5;
        }
        zzd(i3, zzbdVar, true);
        long j7 = zzbdVar.zze;
        long j9 = zzbdVar.zzd;
        if (j9 != -9223372036854775807L) {
            j2 = Math.min(j2, j9 - 1);
        }
        long jMax = Math.max(0L, j2);
        Object obj = zzbdVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzbd zzo(Object obj, zzbd zzbdVar) {
        return zzd(zze(obj), zzbdVar, true);
    }
}
