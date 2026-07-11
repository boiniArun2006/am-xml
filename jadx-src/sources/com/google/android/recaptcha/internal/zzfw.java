package com.google.android.recaptcha.internal;

import GJW.C;
import GJW.vd;
import android.webkit.WebView;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzfw {
    private final WebView zza;
    private final vd zzb;

    public final void zzb(String str, String... strArr) {
        C.nr(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3, null);
    }

    public zzfw(WebView webView, vd vdVar) {
        this.zza = webView;
        this.zzb = vdVar;
    }
}
