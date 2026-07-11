package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbgy implements zzbju {
    final /* synthetic */ SharedPreferences zza;

    zzbgy(zzbhc zzbhcVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
        Objects.requireNonNull(zzbhcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final Boolean zza(String str, boolean z2) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z2));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final Long zzb(String str, long j2) {
        try {
            return Long.valueOf(this.zza.getLong(str, j2));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final Double zzc(String str, double d2) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d2));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
