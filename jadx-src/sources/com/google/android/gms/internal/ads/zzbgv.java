package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzbgv {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public abstract Object zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, Object obj);

    protected abstract Object zzc(JSONObject jSONObject);

    protected abstract Object zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final int zzm() {
        return this.zza;
    }

    public static zzbgv zzh(int i2, String str, int i3, int i5) {
        return new zzbgr(1, str, Integer.valueOf(i3), Integer.valueOf(i5));
    }

    public static zzbgv zzi(int i2, String str, long j2, long j3) {
        return new zzbgs(1, str, Long.valueOf(j2), Long.valueOf(j3));
    }

    public static zzbgv zzj(int i2, String str, float f3, float f4) {
        return new zzbgt(1, str, Float.valueOf(f3), Float.valueOf(f4));
    }

    public static zzbgv zzk(int i2, String str) {
        zzbgu zzbguVar = new zzbgu(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zzb().zzb(zzbguVar);
        return zzbguVar;
    }

    public static zzbgv zzl(int i2, String str) {
        zzbgu zzbguVar = new zzbgu(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zzb().zzc(zzbguVar);
        return zzbguVar;
    }

    /* synthetic */ zzbgv(int i2, String str, Object obj, Object obj2, byte[] bArr) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzbd.zzb().zza(this);
    }

    public final Object zzf() {
        if (com.google.android.gms.ads.internal.client.zzbd.zzc().zzb()) {
            return this.zzd;
        }
        return this.zzc;
    }

    public final Object zzg() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(this);
    }
}
