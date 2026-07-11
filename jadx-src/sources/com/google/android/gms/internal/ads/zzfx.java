package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfx implements zzao {
    public final float zza;
    public final float zzb;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfx.class == obj.getClass()) {
            zzfx zzfxVar = (zzfx) obj;
            if (this.zza == zzfxVar.zza && this.zzb == zzfxVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.zza) + 527) * 31) + Float.hashCode(this.zzb);
    }

    public final String toString() {
        float f3 = this.zza;
        int length = String.valueOf(f3).length();
        float f4 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f4).length());
        sb.append("xyz: latitude=");
        sb.append(f3);
        sb.append(", longitude=");
        sb.append(f4);
        return sb.toString();
    }

    public zzfx(@FloatRange float f3, @FloatRange float f4) {
        boolean z2 = false;
        if (f3 >= -90.0f && f3 <= 90.0f && f4 >= -180.0f && f4 <= 180.0f) {
            z2 = true;
        }
        zzgrc.zzb(z2, "Invalid latitude or longitude");
        this.zza = f3;
        this.zzb = f4;
    }
}
