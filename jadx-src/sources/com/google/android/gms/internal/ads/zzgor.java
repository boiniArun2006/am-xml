package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgor extends zzgps {
    private final int zza;

    @Nullable
    private final String zzb;
    private final int zzc;

    /* synthetic */ zzgor(int i2, String str, int i3, byte[] bArr) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = i3;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgps) {
            zzgps zzgpsVar = (zzgps) obj;
            if (this.zza == zzgpsVar.zza() && ((str = this.zzb) != null ? str.equals(zzgpsVar.zzb()) : zzgpsVar.zzb() == null) && this.zzc == zzgpsVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgps
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgps
    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgps
    public final int zzc() {
        return this.zzc;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        int i2 = this.zza;
        int length = String.valueOf(i2).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i3 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i3).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i2);
        sb.append(", sessionToken=");
        sb.append(str);
        sb.append(", uiMode=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
