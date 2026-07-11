package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcla extends zzckz {
    @Override // com.google.android.gms.internal.ads.zzckz, com.google.android.gms.internal.ads.zzcky, com.google.android.gms.internal.ads.zzcjw, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.f63168h, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zza.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public zzcla(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z2, @Nullable zzejf zzejfVar) {
        super(zzcjlVar, zzbgdVar, z2, zzejfVar);
    }
}
