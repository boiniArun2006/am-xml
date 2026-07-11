package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Deprecated
public class zzaiu implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzaiu(long j2, long j3, long j4, long j5, long j6) {
        this.zza = j2;
        this.zzb = j3;
        this.zzc = j4;
        this.zzd = j5;
        this.zze = j6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaiu zzaiuVar = (zzaiu) obj;
            if (this.zza == zzaiuVar.zza && this.zzb == zzaiuVar.zzb && this.zzc == zzaiuVar.zzc && this.zzd == zzaiuVar.zzd && this.zze == zzaiuVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Long.hashCode(this.zza) + 527) * 31) + Long.hashCode(this.zzb)) * 31) + Long.hashCode(this.zzc)) * 31) + Long.hashCode(this.zzd)) * 31) + Long.hashCode(this.zze);
    }

    public final String toString() {
        long j2 = this.zza;
        int length = String.valueOf(j2).length();
        long j3 = this.zzb;
        int length2 = String.valueOf(j3).length();
        long j4 = this.zzc;
        int length3 = String.valueOf(j4).length();
        long j5 = this.zzd;
        int length4 = String.valueOf(j5).length();
        long j6 = this.zze;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j6).length());
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j2);
        sb.append(", photoSize=");
        sb.append(j3);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j4);
        sb.append(", videoStartPosition=");
        sb.append(j5);
        sb.append(", videoSize=");
        sb.append(j6);
        return sb.toString();
    }
}
