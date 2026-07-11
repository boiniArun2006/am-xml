package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfsv {
    private final zzfsx zza;
    private final WebView zzb;
    private zzfuy zzc;
    private final HashMap zzd;
    private final zzftl zze;

    public static zzfsv zza(zzfsx zzfsxVar, WebView webView, boolean z2) {
        return new zzfsv(zzfsxVar, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        WebViewCompat.qie(this.zzb, "omidJsSessionService");
    }

    public final void zzb(zzfsu zzfsuVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfsj) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfss(this, zzfsuVar, timer), 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    final View zzc() {
        zzfuy zzfuyVar = this.zzc;
        if (zzfuyVar == null) {
            return null;
        }
        return (View) zzfuyVar.get();
    }

    public final void zzd(View view, zzfsq zzfsqVar, @Nullable String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfsj) it.next()).zzd(view, zzfsqVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfsqVar, "Ad overlay");
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zzf(String str) {
        zzfso zzfsoVar = zzfso.DEFINED_BY_JAVASCRIPT;
        zzfsr zzfsrVar = zzfsr.DEFINED_BY_JAVASCRIPT;
        zzfsw zzfswVar = zzfsw.JAVASCRIPT;
        zzfsn zzfsnVar = new zzfsn(zzfsk.zza(zzfsoVar, zzfsrVar, zzfswVar, zzfswVar, false), zzfsl.zza(this.zza, this.zzb, null, null), str);
        this.zzd.put(str, zzfsnVar);
        zzfsnVar.zzb(zzc());
        for (zzftk zzftkVar : this.zze.zza()) {
            zzfsnVar.zzd((View) zzftkVar.zza().get(), zzftkVar.zzc(), zzftkVar.zzd());
        }
        zzfsnVar.zza();
    }

    final /* synthetic */ void zzg(String str) {
        HashMap map = this.zzd;
        zzfsj zzfsjVar = (zzfsj) map.get(str);
        if (zzfsjVar != null) {
            zzfsjVar.zzc();
            map.remove(str);
        }
    }

    private zzfsv(zzfsx zzfsxVar, WebView webView, boolean z2) {
        HashMap map = new HashMap();
        this.zzd = map;
        this.zze = new zzftl();
        zzfuh.zza();
        this.zza = zzfsxVar;
        this.zzb = webView;
        if (zzc() != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzfsj) it.next()).zzb(webView);
            }
            this.zzc = new zzfuy(webView);
        }
        if (WebViewFeature.n("WEB_MESSAGE_LISTENER")) {
            zze();
            WebViewCompat.rl(this.zzb, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfst(this));
            return;
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }
}
