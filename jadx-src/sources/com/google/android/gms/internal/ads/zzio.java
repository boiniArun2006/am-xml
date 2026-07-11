package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzio {
    public final String zza;
    public final zzv zzb;
    public final zzv zzc;
    public final int zzd;
    public final int zze;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzio.class == obj.getClass()) {
            zzio zzioVar = (zzio) obj;
            if (this.zzd == zzioVar.zzd && this.zze == zzioVar.zze && this.zza.equals(zzioVar.zza) && this.zzb.equals(zzioVar.zzb) && this.zzc.equals(zzioVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }

    public zzio(String str, zzv zzvVar, zzv zzvVar2, int i2, int i3) {
        boolean z2;
        if (i2 != 0) {
            z2 = false;
            if (i3 == 0) {
                i3 = 0;
                z2 = true;
            }
        } else {
            z2 = true;
        }
        zzgrc.zza(z2);
        zzgrc.zza(true ^ TextUtils.isEmpty(str));
        this.zza = str;
        this.zzb = zzvVar;
        zzvVar2.getClass();
        this.zzc = zzvVar2;
        this.zzd = i2;
        this.zze = i3;
    }
}
