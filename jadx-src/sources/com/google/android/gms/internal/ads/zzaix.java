package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaix implements zzao {
    public final float zza;
    public final int zzb;

    public zzaix(float f3, int i2) {
        this.zza = f3;
        this.zzb = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaix.class == obj.getClass()) {
            zzaix zzaixVar = (zzaix) obj;
            if (this.zza == zzaixVar.zza && this.zzb == zzaixVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.zza) + 527) * 31) + this.zzb;
    }

    public final String toString() {
        float f3 = this.zza;
        int length = String.valueOf(f3).length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i2).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f3);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i2);
        return sb.toString();
    }
}
