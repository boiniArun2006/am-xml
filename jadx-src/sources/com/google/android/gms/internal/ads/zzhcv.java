package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhcv extends zzhch {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzhcu zze;
    private final zzhct zzf;

    /* synthetic */ zzhcv(int i2, int i3, int i5, int i7, zzhcu zzhcuVar, zzhct zzhctVar, byte[] bArr) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i5;
        this.zzd = i7;
        this.zze = zzhcuVar;
        this.zzf = zzhctVar;
    }

    public static zzhcs zzb() {
        return new zzhcs(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zze != zzhcu.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final zzhcu zzg() {
        return this.zze;
    }

    public final zzhct zzh() {
        return this.zzf;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhcv)) {
            return false;
        }
        zzhcv zzhcvVar = (zzhcv) obj;
        return zzhcvVar.zza == this.zza && zzhcvVar.zzb == this.zzb && zzhcvVar.zzc == this.zzc && zzhcvVar.zzd == this.zzd && zzhcvVar.zze == this.zze && zzhcvVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzhcv.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzhct zzhctVar = this.zzf;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(zzhctVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i2 = this.zzc;
        int length3 = String.valueOf(i2).length();
        int i3 = this.zzd;
        int length4 = String.valueOf(i3).length();
        int i5 = this.zza;
        int length5 = String.valueOf(i5).length();
        int i7 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i7).length() + 15);
        sb.append("AesCtrHmacAead Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", hashType: ");
        sb.append(strValueOf2);
        sb.append(", ");
        sb.append(i2);
        sb.append("-byte IV, and ");
        sb.append(i3);
        sb.append("-byte tags, and ");
        sb.append(i5);
        sb.append("-byte AES key, and ");
        sb.append(i7);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }
}
