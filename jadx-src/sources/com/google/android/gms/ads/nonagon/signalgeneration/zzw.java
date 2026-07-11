package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzdxt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzw implements zzdjy {
    private final zzdxt zza;
    private final zzv zzb;
    private final String zzc;
    private final int zzd;

    @VisibleForTesting
    public zzw(zzdxt zzdxtVar, zzv zzvVar, String str, int i2) {
        this.zza = zzdxtVar;
        this.zzb = zzvVar;
        this.zzc = str;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(@Nullable String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zzd(@Nullable zzbj zzbjVar) {
        String strOptString;
        if (zzbjVar == null || this.zzd == 2) {
            return;
        }
        if (TextUtils.isEmpty(zzbjVar.zzc)) {
            this.zzb.zza(this.zzc, zzbjVar.zzb, this.zza);
            return;
        }
        try {
            strOptString = new JSONObject(zzbjVar.zzc).optString("request_id");
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "RenderSignals.getRequestId");
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.zzb.zza(strOptString, zzbjVar.zzc, this.zza);
    }
}
