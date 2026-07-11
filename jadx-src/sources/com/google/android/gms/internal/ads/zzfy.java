package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfy implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfy(long j2, long j3, long j4) {
        this.zza = j2;
        this.zzb = j3;
        this.zzc = j4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfy)) {
            return false;
        }
        zzfy zzfyVar = (zzfy) obj;
        return this.zza == zzfyVar.zza && this.zzb == zzfyVar.zzb && this.zzc == zzfyVar.zzc;
    }

    public final int hashCode() {
        return ((((Long.hashCode(this.zza) + 527) * 31) + Long.hashCode(this.zzb)) * 31) + Long.hashCode(this.zzc);
    }

    public final String toString() {
        long j2 = this.zza;
        int length = String.valueOf(j2).length();
        long j3 = this.zzb;
        int length2 = String.valueOf(j3).length();
        long j4 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j4).length());
        sb.append("Mp4Timestamp: creation time=");
        sb.append(j2);
        sb.append(", modification time=");
        sb.append(j3);
        sb.append(", timescale=");
        sb.append(j4);
        return sb.toString();
    }
}
