package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzcl {
    public static final zzcl zza = new zzcl(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcl)) {
            return false;
        }
        zzcl zzclVar = (zzcl) obj;
        return this.zzb == zzclVar.zzb && this.zzc == zzclVar.zzc && this.zzd == zzclVar.zzd;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i2 = this.zzb;
        int length = String.valueOf(i2).length();
        int i3 = this.zzc;
        int length2 = String.valueOf(i3).length();
        int i5 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i5).length() + 1);
        sb.append("AudioFormat[sampleRate=");
        sb.append(i2);
        sb.append(", channelCount=");
        sb.append(i3);
        sb.append(", encoding=");
        sb.append(i5);
        sb.append("]");
        return sb.toString();
    }

    public zzcl(int i2, int i3, int i5) {
        int iZzD;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i5;
        if (zzfj.zzA(i5)) {
            iZzD = zzfj.zzD(i5) * i3;
        } else {
            iZzD = -1;
        }
        this.zze = iZzD;
    }
}
