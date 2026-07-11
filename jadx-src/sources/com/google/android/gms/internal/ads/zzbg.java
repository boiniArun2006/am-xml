package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbg {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzv[] zzd;
    private int zze;

    private static String zzc(@Nullable String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbg.class == obj.getClass()) {
            zzbg zzbgVar = (zzbg) obj;
            if (this.zzb.equals(zzbgVar.zzb) && Arrays.equals(this.zzd, zzbgVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int zzb(zzv zzvVar) {
        int i2 = 0;
        while (true) {
            zzv[] zzvVarArr = this.zzd;
            if (i2 >= zzvVarArr.length) {
                return -1;
            }
            if (zzvVar == zzvVarArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    private static void zzd(String str, @Nullable String str2, @Nullable String str3, int i2) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i2).length() + 1);
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i2);
        sb.append(")");
        zzee.zzf("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final int hashCode() {
        int i2 = this.zze;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((this.zzb.hashCode() + 527) * 31) + Arrays.hashCode(this.zzd);
        this.zze = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string = Arrays.toString(this.zzd);
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length());
        sb.append(str);
        sb.append(": ");
        sb.append(string);
        return sb.toString();
    }

    public final zzv zza(int i2) {
        return this.zzd[i2];
    }

    public zzbg(String str, zzv... zzvVarArr) {
        boolean z2;
        int length = zzvVarArr.length;
        int i2 = 1;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zza(z2);
        this.zzb = str;
        this.zzd = zzvVarArr;
        this.zza = length;
        int iZzf = zzas.zzf(zzvVarArr[0].zzo);
        this.zzc = iZzf == -1 ? zzas.zzf(zzvVarArr[0].zzn) : iZzf;
        zzv zzvVar = zzvVarArr[0];
        String strZzc = zzc(zzvVar.zzd);
        int i3 = zzvVar.zzf | 16384;
        while (true) {
            zzv[] zzvVarArr2 = this.zzd;
            if (i2 < zzvVarArr2.length) {
                zzv zzvVar2 = zzvVarArr2[i2];
                String str2 = zzvVar2.zzd;
                if (!strZzc.equals(zzc(str2))) {
                    zzd("languages", zzvVarArr2[0].zzd, str2, i2);
                    return;
                } else {
                    if (i3 != (zzvVar2.zzf | 16384)) {
                        zzd("role flags", Integer.toBinaryString(zzvVarArr2[0].zzf), Integer.toBinaryString(this.zzd[i2].zzf), i2);
                        return;
                    }
                    i2++;
                }
            } else {
                return;
            }
        }
    }
}
