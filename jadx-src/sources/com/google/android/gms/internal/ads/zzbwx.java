package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.FileUploadManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class zzbwx {
    private final zzcjl zza;
    private final String zzb;

    public zzbwx(zzcjl zzcjlVar, String str) {
        this.zza = zzcjlVar;
        this.zzb = str;
    }

    public final void zzg(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put(FileUploadManager.f61572j, this.zzb);
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar != null) {
                zzcjlVar.zzd("onError", jSONObjectPut);
            }
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching error event.", e2);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching ready Event.", e2);
        }
    }

    public final void zzi(int i2, int i3, int i5, int i7) {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put("x", i2).put("y", i3).put("width", i5).put("height", i7));
        } catch (JSONException e2) {
            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching size change.", e2);
        }
    }

    public final void zzj(int i2, int i3, int i5, int i7) {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put("x", i2).put("y", i3).put("width", i5).put("height", i7));
        } catch (JSONException e2) {
            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching default position.", e2);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching state change.", e2);
        }
    }

    public final void zzl(int i2, int i3, int i5, int i7, float f3, int i8) {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put("width", i2).put("height", i3).put("maxSizeWidth", i5).put("maxSizeHeight", i7).put("density", f3).put("rotation", i8));
        } catch (JSONException e2) {
            int i9 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining screen information.", e2);
        }
    }
}
