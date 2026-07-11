package com.google.android.gms.internal.ads;

import ScC.FuwU.XIvb;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzahy implements zzao {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    public zzahy(String str, String str2, long j2, long j3, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahy.class == obj.getClass()) {
            zzahy zzahyVar = (zzahy) obj;
            if (this.zzc == zzahyVar.zzc && this.zzd == zzahyVar.zzd && Objects.equals(this.zza, zzahyVar.zza) && Objects.equals(this.zzb, zzahyVar.zzb) && Arrays.equals(this.zze, zzahyVar.zze)) {
                return true;
            }
        }
        return false;
    }

    static {
        zzt zztVar = new zzt();
        zztVar.zzm("application/id3");
        zztVar.zzM();
        zzt zztVar2 = new zzt();
        zztVar2.zzm("application/x-scte35");
        zztVar2.zzM();
    }

    public final int hashCode() {
        int i2 = this.zzf;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
        long j2 = this.zzc;
        int iHashCode2 = (((((iHashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) this.zzd)) * 31) + Arrays.hashCode(this.zze);
        this.zzf = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        long j2 = this.zzd;
        int length = String.valueOf(j2).length();
        long j3 = this.zzc;
        int length2 = String.valueOf(j3).length();
        String str = this.zza;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length3 + 8 + str2.length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(XIvb.Lygijfgek);
        sb.append(j2);
        sb.append(", durationMs=");
        sb.append(j3);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }
}
