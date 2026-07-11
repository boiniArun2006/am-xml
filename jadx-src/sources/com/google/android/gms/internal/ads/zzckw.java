package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzckw {
    private final zzckv zza;
    private final zzckx zzb;

    public zzckw(zzckx zzckxVar, zzckv zzckvVar) {
        this.zza = zzckvVar;
        this.zzb = zzckxVar;
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzckx zzckxVar = this.zzb;
        zzazh zzazhVarZzS = ((zzcle) zzckxVar).zzS();
        if (zzazhVarZzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzazc zzazcVarZzb = zzazhVarZzS.zzb();
        if (zzazcVarZzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzckxVar.getContext() != null) {
            return zzazcVarZzb.zzj(zzckxVar.getContext(), ((zzclg) zzckxVar).zzE(), zzckxVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        zzckx zzckxVar = this.zzb;
        zzbhe.zza(zzckxVar.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpi)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            zzclj zzcljVarZzP = ((zzcjl) zzckxVar).zzP();
            zzczz zzczzVarZzK = zzcljVarZzP != null ? zzcljVarZzP.zzK() : null;
            if (zzczzVarZzK != null) {
                long jZza = zzczzVarZzK.zza();
                if (jZza > 0) {
                    jSONObject.put("plcmtid", jZza);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Error constructing JSON.", e2);
            return "";
        }
    }

    final /* synthetic */ void zza(String str) {
        this.zza.zza(Uri.parse(str));
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzckx zzckxVar = this.zzb;
        zzazh zzazhVarZzS = ((zzcle) zzckxVar).zzS();
        if (zzazhVarZzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzazc zzazcVarZzb = zzazhVarZzS.zzb();
        if (zzazcVarZzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzckxVar.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        return zzazcVarZzb.zzf(zzckxVar.getContext(), str, ((zzclg) zzckxVar).zzE(), zzckxVar.zzj());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza(str);
                }
            });
        }
    }
}
