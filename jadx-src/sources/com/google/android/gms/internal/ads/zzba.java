package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzba {

    @Nullable
    public final Object zza;
    public final int zzb;

    @Nullable
    public final zzak zzc;

    @Nullable
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzba.class == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (this.zzb == zzbaVar.zzb && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && this.zzh == zzbaVar.zzh && this.zzi == zzbaVar.zzi && Objects.equals(this.zzc, zzbaVar.zzc) && Objects.equals(this.zza, zzbaVar.zza) && Objects.equals(this.zzd, zzbaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi));
    }

    public final String toString() {
        int i2 = this.zzb;
        int length = String.valueOf(i2).length();
        int i3 = this.zze;
        int length2 = String.valueOf(i3).length();
        long j2 = this.zzf;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j2).length());
        sb.append("mediaItem=");
        sb.append(i2);
        sb.append(", period=");
        sb.append(i3);
        sb.append(", pos=");
        sb.append(j2);
        String string = sb.toString();
        int i5 = this.zzh;
        if (i5 == -1) {
            return string;
        }
        long j3 = this.zzg;
        int i7 = this.zzi;
        int length3 = string.length();
        StringBuilder sb2 = new StringBuilder(length3 + 13 + String.valueOf(j3).length() + 10 + String.valueOf(i5).length() + 5 + String.valueOf(i7).length());
        sb2.append(string);
        sb2.append(", contentPos=");
        sb2.append(j3);
        sb2.append(YjqZUJsVmhcjko.bMgrWSPm);
        sb2.append(i5);
        sb2.append(", ad=");
        sb2.append(i7);
        return sb2.toString();
    }

    public zzba(@Nullable Object obj, int i2, @Nullable zzak zzakVar, @Nullable Object obj2, int i3, long j2, long j3, int i5, int i7) {
        boolean z2;
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zza(z2);
        zzgrc.zza(i3 >= 0);
        this.zza = obj;
        this.zzb = i2;
        this.zzc = zzakVar;
        this.zzd = obj2;
        this.zze = i3;
        this.zzf = j2;
        this.zzg = j3;
        this.zzh = i5;
        this.zzi = i7;
    }
}
