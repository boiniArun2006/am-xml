package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzii extends zzbf {
    private final int zzb;
    private final zzyf zzc;

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd zzo(Object obj, zzbd zzbdVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzr = zzr(obj2);
        int iZzu = zzu(iZzr);
        zzs(iZzr).zzo(obj3, zzbdVar);
        zzbdVar.zzc += iZzu;
        zzbdVar.zzb = obj;
        return zzbdVar;
    }

    protected abstract int zzp(int i2);

    protected abstract int zzq(int i2);

    protected abstract int zzr(Object obj);

    protected abstract zzbf zzs(int i2);

    protected abstract int zzt(int i2);

    protected abstract int zzu(int i2);

    protected abstract Object zzv(int i2);

    private final int zzw(int i2, boolean z2) {
        if (z2) {
            return this.zzc.zzb(i2);
        }
        if (i2 >= this.zzb - 1) {
            return -1;
        }
        return i2 + 1;
    }

    private final int zzx(int i2, boolean z2) {
        if (z2) {
            return this.zzc.zzc(i2);
        }
        if (i2 <= 0) {
            return -1;
        }
        return i2 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        int iZze;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iZzr = zzr(obj2);
            if (iZzr != -1 && (iZze = zzs(iZzr).zze(obj3)) != -1) {
                return zzt(iZzr) + iZze;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzj(boolean z2) {
        int i2 = this.zzb;
        if (i2 != 0) {
            int iZzd = z2 ? this.zzc.zzd() : i2 - 1;
            while (zzs(iZzd).zzg()) {
                iZzd = zzx(iZzd, z2);
                if (iZzd == -1) {
                }
            }
            return zzu(iZzd) + zzs(iZzd).zzj(z2);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzk(boolean z2) {
        if (this.zzb != 0) {
            int iZze = z2 ? this.zzc.zze() : 0;
            while (zzs(iZze).zzg()) {
                iZze = zzw(iZze, z2);
                if (iZze == -1) {
                }
            }
            return zzu(iZze) + zzs(iZze).zzk(z2);
        }
        return -1;
    }

    public zzii(boolean z2, zzyf zzyfVar) {
        this.zzc = zzyfVar;
        this.zzb = zzyfVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i2, zzbe zzbeVar, long j2) {
        int iZzq = zzq(i2);
        int iZzu = zzu(iZzq);
        int iZzt = zzt(iZzq);
        zzs(iZzq).zzb(i2 - iZzu, zzbeVar, j2);
        Object objZzv = zzv(iZzq);
        if (!zzbe.zza.equals(zzbeVar.zzb)) {
            objZzv = Pair.create(objZzv, zzbeVar.zzb);
        }
        zzbeVar.zzb = objZzv;
        zzbeVar.zzn += iZzt;
        zzbeVar.zzo += iZzt;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i2, zzbd zzbdVar, boolean z2) {
        int iZzp = zzp(i2);
        int iZzu = zzu(iZzp);
        zzs(iZzp).zzd(i2 - zzt(iZzp), zzbdVar, z2);
        zzbdVar.zzc += iZzu;
        if (z2) {
            Object objZzv = zzv(iZzp);
            Object obj = zzbdVar.zzb;
            obj.getClass();
            zzbdVar.zzb = Pair.create(objZzv, obj);
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i2) {
        int iZzp = zzp(i2);
        return Pair.create(zzv(iZzp), zzs(iZzp).zzf(i2 - zzt(iZzp)));
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzh(int i2, int i3, boolean z2) {
        int i5;
        int iZzq = zzq(i2);
        int iZzu = zzu(iZzq);
        zzbf zzbfVarZzs = zzs(iZzq);
        int i7 = i2 - iZzu;
        if (i3 == 2) {
            i5 = 0;
        } else {
            i5 = i3;
        }
        int iZzh = zzbfVarZzs.zzh(i7, i5, z2);
        if (iZzh != -1) {
            return iZzu + iZzh;
        }
        int iZzw = zzw(iZzq, z2);
        while (iZzw != -1 && zzs(iZzw).zzg()) {
            iZzw = zzw(iZzw, z2);
        }
        if (iZzw != -1) {
            return zzu(iZzw) + zzs(iZzw).zzk(z2);
        }
        if (i3 != 2) {
            return -1;
        }
        return zzk(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzi(int i2, int i3, boolean z2) {
        int iZzq = zzq(i2);
        int iZzu = zzu(iZzq);
        int iZzi = zzs(iZzq).zzi(i2 - iZzu, 0, false);
        if (iZzi != -1) {
            return iZzu + iZzi;
        }
        int iZzx = zzx(iZzq, false);
        while (iZzx != -1 && zzs(iZzx).zzg()) {
            iZzx = zzx(iZzx, false);
        }
        if (iZzx == -1) {
            return -1;
        }
        return zzu(iZzx) + zzs(iZzx).zzj(false);
    }
}
