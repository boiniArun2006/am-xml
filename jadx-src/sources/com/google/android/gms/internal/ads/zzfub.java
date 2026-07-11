package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfub extends zzftx {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    final /* synthetic */ WebView zzq() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzftx
    public final void zza() {
        WebView webView = new WebView(zzftm.zza().zzb());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzftz(this));
        zzc(this.zza);
        zzfto.zzk(this.zza, null);
        Map map = this.zzc;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.zzb = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.zzftx
    public final void zzk(zzfsn zzfsnVar, zzfsl zzfslVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapZze = zzfslVar.zze();
        Iterator it = mapZze.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzl(zzfsnVar, zzfslVar, jSONObject);
    }

    public zzfub(String str, Map map, String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzftx
    public final void zzb() {
        long jConvert;
        super.zzb();
        if (this.zzb == null) {
            jConvert = 4000;
        } else {
            jConvert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzfua(this), Math.max(4000 - jConvert, 2000L));
        this.zza = null;
    }
}
