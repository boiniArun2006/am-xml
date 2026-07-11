package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhlw extends zzhmn {
    private final int zza;
    private final int zzb;
    private final zzhlv zzc;

    /* synthetic */ zzhlw(int i2, int i3, zzhlv zzhlvVar, byte[] bArr) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = zzhlvVar;
    }

    public static zzhlu zzb() {
        return new zzhlu(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzc != zzhlv.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzhlv zzf() {
        return this.zzc;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhlw)) {
            return false;
        }
        zzhlw zzhlwVar = (zzhlw) obj;
        return zzhlwVar.zza == this.zza && zzhlwVar.zze() == zze() && zzhlwVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhlw.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int length = strValueOf.length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        int i3 = this.zza;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i3).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i2);
        sb.append("-byte tags, and ");
        sb.append(i3);
        sb.append("-byte key)");
        return sb.toString();
    }

    public final int zze() {
        zzhlv zzhlvVar = this.zzc;
        if (zzhlvVar == zzhlv.zzd) {
            return this.zzb;
        }
        if (zzhlvVar == zzhlv.zza || zzhlvVar == zzhlv.zzb || zzhlvVar == zzhlv.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }
}
