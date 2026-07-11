package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhmk extends zzhmn {
    private final int zza;
    private final int zzb;
    private final zzhmj zzc;
    private final zzhmi zzd;

    /* synthetic */ zzhmk(int i2, int i3, zzhmj zzhmjVar, zzhmi zzhmiVar, byte[] bArr) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = zzhmjVar;
        this.zzd = zzhmiVar;
    }

    public static zzhmh zzb() {
        return new zzhmh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzc != zzhmj.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzhmj zzf() {
        return this.zzc;
    }

    public final zzhmi zzg() {
        return this.zzd;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhmk)) {
            return false;
        }
        zzhmk zzhmkVar = (zzhmk) obj;
        return zzhmkVar.zza == this.zza && zzhmkVar.zze() == zze() && zzhmkVar.zzc == this.zzc && zzhmkVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhmk.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzhmi zzhmiVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhmiVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i2 = this.zzb;
        int length3 = String.valueOf(i2).length();
        int i3 = this.zza;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i3).length() + 10);
        sb.append("HMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", hashType: ");
        sb.append(strValueOf2);
        sb.append(", ");
        sb.append(i2);
        sb.append("-byte tags, and ");
        sb.append(i3);
        sb.append("-byte key)");
        return sb.toString();
    }

    public final int zze() {
        zzhmj zzhmjVar = this.zzc;
        if (zzhmjVar == zzhmj.zzd) {
            return this.zzb;
        }
        if (zzhmjVar == zzhmj.zza || zzhmjVar == zzhmj.zzb || zzhmjVar == zzhmj.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }
}
