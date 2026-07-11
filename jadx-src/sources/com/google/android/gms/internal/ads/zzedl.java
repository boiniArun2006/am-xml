package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzedl implements zzikg {
    private final zzikp zza;

    private zzedl(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzedl zza(zzikp zzikpVar) {
        return new zzedl(zzikpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strValueOf;
        zzfjk zzfjkVarZza = ((zzdaw) this.zza).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzij)).booleanValue()) {
            String str = zzfjkVarZza.zzd.zzx;
            if (!TextUtils.isEmpty(str)) {
                try {
                    strValueOf = new JSONObject(str).getString("request_id");
                } catch (JSONException unused) {
                }
                if (TextUtils.isEmpty(strValueOf)) {
                    com.google.android.gms.ads.internal.client.zzc zzcVar = zzfjkVarZza.zzd.zzs;
                    if (zzcVar != null) {
                        try {
                            strValueOf = new JSONObject(zzcVar.zza).getString("request_id");
                        } catch (JSONException unused2) {
                        }
                        if (TextUtils.isEmpty(strValueOf)) {
                            strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbb.zzh().nextInt() & Integer.MAX_VALUE);
                        }
                    }
                }
            }
        }
        zziko.zzb(strValueOf);
        return strValueOf;
    }
}
