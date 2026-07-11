package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.h;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class zzcky extends zzcjw {
    @Override // com.google.android.gms.internal.ads.zzcjw, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.f63168h, view, url);
    }

    public zzcky(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z2, @Nullable zzejf zzejfVar) {
        super(zzcjlVar, zzbgdVar, z2, new zzbww(zzcjlVar, zzcjlVar.zzK(), new zzbgl(zzcjlVar.getContext())), null, zzejfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    protected final WebResourceResponse zzac(WebView webView, String str, @Nullable Map map) {
        String str2;
        if (!(webView instanceof zzcjl)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcjl zzcjlVar = (zzcjl) webView;
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcceVar.zze(str, map, 1);
        }
        zzfxl.zza();
        zzfxq zzfxqVar = zzfxq.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return super.zzL(str, map);
        }
        if (zzcjlVar.zzP() != null) {
            zzcjlVar.zzP().zzN();
        }
        if (zzcjlVar.zzN().zzg()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzax);
        } else if (zzcjlVar.zzW()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaw);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzav);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzB(zzcjlVar.getContext(), zzcjlVar.zzs().afmaVersion, str2);
    }
}
