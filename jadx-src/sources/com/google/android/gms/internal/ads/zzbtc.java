package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbtc implements zzbox {
    final /* synthetic */ zzbtd zza;
    private final zzbsf zzb;
    private final zzcen zzc;

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zzd().zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e2) {
                this.zzc.zzd(e2);
            }
        } finally {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzb(@Nullable String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbso());
            } else {
                this.zzc.zzd(new zzbso(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.zzb.zza();
            throw th;
        }
        this.zzb.zza();
    }

    public zzbtc(zzbtd zzbtdVar, zzbsf zzbsfVar, zzcen zzcenVar) {
        Objects.requireNonNull(zzbtdVar);
        this.zza = zzbtdVar;
        this.zzb = zzbsfVar;
        this.zzc = zzcenVar;
    }
}
