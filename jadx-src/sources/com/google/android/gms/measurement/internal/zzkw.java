package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class zzkw implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ Uri zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzkx zze;

    zzkw(zzkx zzkxVar, boolean z2, Uri uri, String str, String str2) {
        this.zza = z2;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
        Objects.requireNonNull(zzkxVar);
        this.zze = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleZzi;
        Bundle bundleZzi2;
        zzkx zzkxVar = this.zze;
        zzli zzliVar = zzkxVar.zza;
        zzliVar.zzg();
        String str = this.zzd;
        Uri uri = this.zzb;
        try {
            zzib zzibVar = zzliVar.zzu;
            zzpo zzpoVarZzk = zzibVar.zzk();
            if (TextUtils.isEmpty(str)) {
                bundleZzi = null;
            } else if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                bundleZzi = zzpoVarZzk.zzi(Uri.parse("https://google.com/search?".concat(str)));
                if (bundleZzi != null) {
                    bundleZzi.putString("_cis", "referrer");
                }
            } else {
                zzpoVarZzk.zzu.zzaV().zzj().zza("Activity created with data 'referrer' without required params");
                bundleZzi = null;
            }
            String str2 = this.zzc;
            if (this.zza && (bundleZzi2 = zzibVar.zzk().zzi(uri)) != null) {
                bundleZzi2.putString("_cis", "intent");
                if (!bundleZzi2.containsKey("gclid") && bundleZzi != null && bundleZzi.containsKey("gclid")) {
                    bundleZzi2.putString("_cer", String.format("gclid=%s", bundleZzi.getString("gclid")));
                }
                zzliVar.zzF(str2, "_cmp", bundleZzi2);
                zzliVar.zzb.zzb(str2, bundleZzi2);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            zzibVar.zzaV().zzj().zzb("Activity created with referrer", str);
            boolean zZzp = zzibVar.zzc().zzp(null, zzfx.zzaG);
            String str3 = qfEYuUHwj.lYKKugEmtNDT;
            if (zZzp) {
                if (bundleZzi != null) {
                    zzliVar.zzF(str2, "_cmp", bundleZzi);
                    zzliVar.zzb.zzb(str2, bundleZzi);
                } else {
                    zzibVar.zzaV().zzj().zzb("Referrer does not contain valid parameters", str);
                }
                zzliVar.zzK(TtmlNode.TEXT_EMPHASIS_AUTO, str3, null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                zzibVar.zzaV().zzj().zza("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                zzliVar.zzK(TtmlNode.TEXT_EMPHASIS_AUTO, str3, str, true);
            }
        } catch (RuntimeException e2) {
            zzkxVar.zza.zzu.zzaV().zzb().zzb("Throwable caught in handleReferrerForOnActivityCreated", e2);
        }
    }
}
