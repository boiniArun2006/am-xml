package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhdv extends zzhch {
    private final int zza;
    private final zzhdu zzb;

    /* synthetic */ zzhdv(int i2, zzhdu zzhduVar, byte[] bArr) {
        this.zza = i2;
        this.zzb = zzhduVar;
    }

    public static zzhdt zzb() {
        return new zzhdt(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzb != zzhdu.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhdu zzd() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhdv)) {
            return false;
        }
        zzhdv zzhdvVar = (zzhdv) obj;
        return zzhdvVar.zza == this.zza && zzhdvVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhdv.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        int length = strValueOf.length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i2).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }
}
