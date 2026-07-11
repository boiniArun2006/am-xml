package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzyn {
    public static final zzyn zza = new zzyn(new zzbg[0]);
    public final int zzb;
    private final zzguf zzc;
    private int zzd;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzyn.class == obj.getClass()) {
            zzyn zzynVar = (zzyn) obj;
            if (this.zzb == zzynVar.zzb && this.zzc.equals(zzynVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
    }

    public final int hashCode() {
        int i2 = this.zzd;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzbg zza(int i2) {
        return (zzbg) this.zzc.get(i2);
    }

    public final int zzb(zzbg zzbgVar) {
        int iIndexOf = this.zzc.indexOf(zzbgVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzguf zzc() {
        return zzguf.zzq(zzgvf.zzc(this.zzc, zzym.zza));
    }

    public zzyn(zzbg... zzbgVarArr) {
        this.zzc = zzguf.zzr(zzbgVarArr);
        this.zzb = zzbgVarArr.length;
        int i2 = 0;
        while (i2 < this.zzc.size()) {
            int i3 = i2 + 1;
            for (int i5 = i3; i5 < this.zzc.size(); i5++) {
                if (((zzbg) this.zzc.get(i2)).equals(this.zzc.get(i5))) {
                    zzee.zzf("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i2 = i3;
        }
    }
}
