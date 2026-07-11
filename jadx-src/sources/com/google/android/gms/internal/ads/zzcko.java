package com.google.android.gms.internal.ads;

import aT.dE.JLZo;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbgj;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@VisibleForTesting
final class zzcko extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcjl {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzckr zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbkf zzE;
    private zzbkc zzF;
    private zzber zzG;
    private int zzH;
    private int zzI;
    private zzbhq zzJ;
    private final zzbhq zzK;
    private zzbhq zzL;
    private final zzbhr zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzci zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbgd zzY;
    private boolean zzZ;
    private final zzcln zzb;
    private final zzazh zzc;
    private final zzfjo zzd;
    private final zzbil zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfir zzk;
    private zzfiu zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcjw zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzekb zzq;
    private zzejz zzr;
    private zzclv zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    @VisibleForTesting
    protected zzcko(zzcln zzclnVar, zzclv zzclvVar, String str, boolean z2, boolean z3, zzazh zzazhVar, zzbil zzbilVar, VersionInfoParcel versionInfoParcel, zzbht zzbhtVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbgd zzbgdVar, zzfir zzfirVar, zzfiu zzfiuVar, zzfjo zzfjoVar) {
        zzfiu zzfiuVar2;
        super(zzclnVar);
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzclnVar;
        this.zzs = zzclvVar;
        this.zzt = str;
        this.zzw = z2;
        this.zzc = zzazhVar;
        this.zzd = zzfjoVar;
        this.zze = zzbilVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzx = com.google.android.gms.ads.internal.util.zzs.zzx(windowManager);
        this.zzi = displayMetricsZzx;
        this.zzj = displayMetricsZzx.density;
        this.zzY = zzbgdVar;
        this.zzk = zzfirVar;
        this.zzl = zzfiuVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzci(zzclnVar.zzb(), this, this, null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzna)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmZ)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoG)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzc().zze(zzclnVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzr(getContext(), settings);
        setDownloadListener(this);
        zzbc();
        AdMobNetworkBridge.webviewAddJavascriptInterface(this, new zzckw(this, new zzckv() { // from class: com.google.android.gms.internal.ads.zzcku
            @Override // com.google.android.gms.internal.ads.zzckv
            public final /* synthetic */ void zza(Uri uri) {
                zzcjw zzcjwVarZzaS = ((zzcko) this).zzaS();
                if (zzcjwVarZzaS != null) {
                    zzcjwVarZzaS.zzQ(uri);
                } else {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                }
            }
        }), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbh();
        zzbhr zzbhrVar = new zzbhr(new zzbht(true, "make_wv", this.zzt));
        this.zzM = zzbhrVar;
        zzbhrVar.zzc().zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() && (zzfiuVar2 = this.zzl) != null && zzfiuVar2.zzb != null) {
            zzbhrVar.zzc().zzd("gqi", this.zzl.zzb);
        }
        zzbhrVar.zzc();
        zzbhq zzbhqVarZzf = zzbht.zzf();
        this.zzK = zzbhqVarZzf;
        zzbhrVar.zza("native:view_create", zzbhqVarZzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzclnVar);
        com.google.android.gms.ads.internal.zzt.zzh().zzj();
    }

    private void safedk_webview_zzcko_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(String p1, String p2, String p3, String p4, String p5) {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/google/android/gms/internal/ads/zzcko;->safedk_webview_zzcko_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: ", p1, ", WebView address : ", toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()), ", SDK_PACKAGE_NAME = ", h.f63168h);
            CreativeInfoManager.a(p1, p2, this, h.f63168h);
            SafeDKWebAppInterface.a(h.f63168h, (WebView) this, p2, true);
        }
        AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(h.f63168h);
        if (adNetworkDiscoveryJ != null) {
            p2 = adNetworkDiscoveryJ.a(this, p1, p2);
        }
        super.loadDataWithBaseURL(p1, p2, p3, p4, p5);
    }

    private void safedk_webview_zzcko_webviewLoadData_172d49d32092f6f80826f3dca3960029(String p1, String p2, String p3) {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/google/android/gms/internal/ads/zzcko;->safedk_webview_zzcko_webviewLoadData_172d49d32092f6f80826f3dca3960029(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        boolean z2 = SafeDK.getInstance() != null && SafeDK.getInstance().p();
        Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : ", this, ", isSafeDKInitialized = ", Boolean.valueOf(z2), ", SDK_PACKAGE_NAME = ", h.f63168h);
        if (z2) {
            CreativeInfoManager.a((String) null, p1, this, h.f63168h);
            SafeDKWebAppInterface.a(h.f63168h, (WebView) this, p1, true);
        }
        super.loadData(p1, p2, p3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: safedk_webview_zzcko_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e, reason: merged with bridge method [inline-methods] */
    public void zzaV(String p1) {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/google/android/gms/internal/ads/zzcko;->safedk_webview_zzcko_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(Ljava/lang/String;)V");
        String str = JLZo.UkF;
        Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", p1, ", WebView address : ", toString(), ", SDK_PACKAGE_NAME = ", str);
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            if (TextUtils.isEmpty(p1) || p1.startsWith("javascript:")) {
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", p1);
            } else {
                NetworkBridge.logWebviewLoadURLRequest(str, this, p1);
                AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
                if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                    CreativeInfoManager.a(p1, (String) null, this, str);
                }
                SafeDKWebAppInterface.a(str, (WebView) this, p1, true);
            }
        }
        super.loadUrl(p1);
    }

    private final synchronized void zzaZ(String str) {
        final String str2 = "about:blank";
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzckl
                private final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaW(this.zzb);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdWebViewImpl.loadUrlUnsafe");
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final synchronized void zzba() {
        Boolean boolZzc = com.google.android.gms.ads.internal.zzt.zzh().zzc();
        this.zzy = boolZzc;
        if (boolZzc == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    private final synchronized void zzbc() {
        zzfir zzfirVar = this.zzk;
        if (zzfirVar != null && zzfirVar.zzam) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Disabling hardware acceleration on an overlay.");
            zzbd();
            return;
        }
        if (!this.zzw && !this.zzs.zzg()) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbd() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, null);
            }
            this.zzx = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbf() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzh().zzk();
    }

    private final synchronized void zzbg() {
        try {
            Map map = this.zzW;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzchr) it.next()).release();
                }
            }
            this.zzW = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void destroy() {
        try {
            zzbh();
            this.zzQ.zzc();
            com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
            if (zzmVar != null) {
                zzmVar.zzb();
                this.zzp.zzq();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzF();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzB().zza(this);
            zzbg();
            this.zzv = true;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmk)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzY();
                return;
            }
            Activity activityZzb = this.zzb.zzb();
            if (activityZzb != null && activityZzb.isDestroyed()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzY();
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
                zzaZ("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.f63168h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzX()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzml)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcei.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaU(str, valueCallback);
                }
            });
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzF();
                        com.google.android.gms.ads.internal.zzt.zzB().zza(this);
                        zzbg();
                        zzbf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzX()) {
            safedk_webview_zzcko_webviewLoadData_172d49d32092f6f80826f3dca3960029(str, str2, str3);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (!zzX()) {
                    safedk_webview_zzcko_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(str, str2, str3, str4, str5);
                    return;
                } else {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void loadUrl(final String str) {
        if (zzX()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaV(str);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdWebViewImpl.loadUrl");
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl. ", th);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!zzX()) {
                this.zzQ.zzd();
            }
            if (this.zzZ) {
                onResume();
                this.zzZ = false;
            }
            boolean z2 = this.zzC;
            zzcjw zzcjwVar = this.zzo;
            if (zzcjwVar != null && zzcjwVar.zzl()) {
                if (!this.zzD) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = true;
                }
                zzaM();
                z2 = true;
            }
            zzbi(z2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcjw zzcjwVar;
        synchronized (this) {
            try {
                if (!zzX()) {
                    this.zzQ.zze();
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzcjwVar = this.zzo) != null && zzcjwVar.zzl() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzbi(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final synchronized void onMeasure(int i2, int i3) {
        int i5;
        int i7;
        int i8 = 0;
        if (zzX()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzw && !this.zzs.zzh()) {
            if (this.zzs.zzj()) {
                super.onMeasure(i2, i3);
                return;
            }
            if (this.zzs.zzi()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeJ)).booleanValue()) {
                    super.onMeasure(i2, i3);
                    return;
                }
                zzckr zzckrVarZzh = zzh();
                float fZzm = zzckrVarZzh != null ? zzckrVarZzh.zzm() : 0.0f;
                if (fZzm == 0.0f) {
                    super.onMeasure(i2, i3);
                    return;
                }
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                float f3 = size2 * fZzm;
                int i9 = (int) (size / fZzm);
                if (size2 != 0) {
                    int i10 = (int) f3;
                    if (size == 0) {
                        i8 = size;
                    } else if (i10 != 0) {
                        i9 = (int) (i10 / fZzm);
                        i5 = size2;
                        i7 = i10;
                        i8 = i7;
                    }
                    i5 = size2;
                    i7 = i10;
                } else if (i9 != 0) {
                    i7 = (int) (i9 * fZzm);
                    i8 = size;
                    i5 = i9;
                } else {
                    size2 = 0;
                    int i102 = (int) f3;
                    if (size == 0) {
                    }
                    i5 = size2;
                    i7 = i102;
                }
                setMeasuredDimension(Math.min(i7, i8), Math.min(i9, i5));
                return;
            }
            if (this.zzs.zzf()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeR)).booleanValue()) {
                    super.onMeasure(i2, i3);
                    return;
                }
                zzab("/contentHeight", new zzcki(this));
                zzaP("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f4 = this.zzi.density;
                int size3 = View.MeasureSpec.getSize(i2);
                int i11 = this.zzI;
                setMeasuredDimension(size3, i11 != -1 ? (int) (i11 * f4) : View.MeasureSpec.getSize(i3));
                return;
            }
            if (this.zzs.zzg()) {
                DisplayMetrics displayMetrics = this.zzi;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i2);
            int size4 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size5 = View.MeasureSpec.getSize(i3);
            int i12 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i13 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            zzclv zzclvVar = this.zzs;
            boolean z2 = zzclvVar.zzb > i12 || zzclvVar.zza > i13;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgw)).booleanValue()) {
                zzclv zzclvVar2 = this.zzs;
                float f5 = zzclvVar2.zzb;
                float f6 = this.zzj;
                z2 &= f5 / f6 <= ((float) i12) / f6 && ((float) zzclvVar2.zza) / f6 <= ((float) i13) / f6;
            }
            if (!z2) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.zzn) {
                    this.zzY.zzc(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE);
                    this.zzn = true;
                }
                zzclv zzclvVar3 = this.zzs;
                setMeasuredDimension(zzclvVar3.zzb, zzclvVar3.zza);
                return;
            }
            float f7 = this.zzs.zzb;
            float f8 = this.zzj;
            int i14 = (int) (f7 / f8);
            int i15 = (int) (r2.zza / f8);
            int i16 = (int) (size4 / f8);
            int i17 = (int) (size5 / f8);
            StringBuilder sb = new StringBuilder(String.valueOf(i14).length() + 36 + String.valueOf(i15).length() + 18 + String.valueOf(i16).length() + 1 + String.valueOf(i17).length() + 4);
            sb.append("Not enough space to show ad. Needs ");
            sb.append(i14);
            sb.append("x");
            sb.append(i15);
            sb.append(" dp, but only has ");
            sb.append(i16);
            sb.append("x");
            sb.append(i17);
            sb.append(" dp.");
            String string = sb.toString();
            int i18 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.zzm) {
                return;
            }
            this.zzY.zzc(10001);
            this.zzm = true;
            return;
        }
        super.onMeasure(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzA(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzB(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcjc
    public final zzfir zzC() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzclg
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcld
    public final synchronized zzclv zzN() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized String zzO() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final /* synthetic */ zzclj zzP() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final WebViewClient zzQ() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzR() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcle
    public final zzazh zzS() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final zzfjo zzT() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzekb zzU() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzejz zzV() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzW() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzX() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzY() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbf();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzckj(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzZ() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcks
    public final zzfiu zzaC() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaD(zzfir zzfirVar, zzfiu zzfiuVar) {
        this.zzk = zzfirVar;
        this.zzl = zzfiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaE(boolean z2) {
        if (z2) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzu(z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaG(boolean z2) {
        this.zzZ = true;
    }

    protected final synchronized void zzaN(String str) {
        if (!zzX()) {
            loadUrl(str);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final synchronized void zzaO(String str, ValueCallback valueCallback) {
        if (!zzX()) {
            evaluateJavascript(str, null);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @VisibleForTesting
    final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzb(bool);
    }

    @VisibleForTesting
    final synchronized Boolean zzaR() {
        return this.zzy;
    }

    public final zzcjw zzaS() {
        return this.zzo;
    }

    final /* synthetic */ int zzaX() {
        return this.zzI;
    }

    final /* synthetic */ void zzaY(int i2) {
        this.zzI = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzaa() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaf(zzclv zzclvVar) {
        this.zzs = zzclvVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzag(boolean z2) {
        try {
            boolean z3 = this.zzw;
            this.zzw = z2;
            zzbc();
            if (z2 != z3) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaz)).booleanValue()) {
                    if (!this.zzs.zzg()) {
                    }
                }
                new zzbwx(this, "").zzk(true != z2 ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaj(boolean z2) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzt(this.zzo.zzk(), z2);
        } else {
            this.zzu = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzak(zzekb zzekbVar) {
        this.zzq = zzekbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzal(zzejz zzejzVar) {
        this.zzr = zzejzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzam(int i2) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzw(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzao(boolean z2) {
        this.zzz = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaq(zzbkf zzbkfVar) {
        this.zzE = zzbkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzbkf zzar() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzas(boolean z2) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i2 = this.zzH + (true != z2 ? -1 : 1);
        this.zzH = i2;
        if (i2 > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzat() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzau(String str, String str2, String str3) throws Throwable {
        Throwable th;
        String str4;
        try {
            try {
                if (zzX()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzay);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put(NodeModuleProcess.PROPERTY_VERSION, str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (JSONException e2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to build MRAID_ENV", e2);
                    str4 = null;
                }
                safedk_webview_zzcko_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(str, zzclc.zza(str2, str4), "text/html", com.google.android.exoplayer2.C.UTF8_NAME, null);
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzax(zzbkc zzbkcVar) {
        this.zzF = zzbkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzay(zzber zzberVar) {
        this.zzG = zzberVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzber zzaz() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        boolean z2;
        synchronized (this) {
            z2 = zzbddVar.zzj;
            this.zzC = z2;
        }
        zzbi(z2);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdk() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdl() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final zzcft zzdm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final synchronized zzckr zzh() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final zzbhq zzi() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized String zzm() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized String zzn() {
        zzfiu zzfiuVar = this.zzl;
        if (zzfiuVar == null) {
            return null;
        }
        return zzfiuVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzo(int i2) {
        this.zzN = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized int zzp() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final zzbhr zzq() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized zzchr zzr(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzchr) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzclf, com.google.android.gms.internal.ads.zzcge
    public final VersionInfoParcel zzs() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzt(String str, zzchr zzchrVar) {
        try {
            if (this.zzW == null) {
                this.zzW = new HashMap();
            }
            this.zzW.put(str, zzchrVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzv(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzw(zzckr zzckrVar) {
        if (this.zzB == null) {
            this.zzB = zzckrVar;
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzz() {
        zzbkc zzbkcVar = this.zzF;
        if (zzbkcVar != null) {
            zzbkcVar.zza();
        }
    }

    private final void zzbb() {
        zzbhl.zza(this.zzM.zzc(), this.zzK, "aeh2");
    }

    private final void zzbh() {
        zzbhr zzbhrVar = this.zzM;
        if (zzbhrVar == null) {
            return;
        }
        zzbht zzbhtVarZzc = zzbhrVar.zzc();
        zzbhj zzbhjVarZza = com.google.android.gms.ads.internal.zzt.zzh().zza();
        if (zzbhjVarZza != null) {
            zzbhjVarZza.zzb(zzbhtVarZzc);
        }
    }

    private final void zzbi(boolean z2) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z2 ? "0" : "1");
        zze("onAdVisibilityChanged", map);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.onAdClicked();
        }
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmz)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzaa(getContext(), intent);
        } catch (ActivityNotFoundException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            String string = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzer)).booleanValue() && this.zzo.zzm();
        if ((!this.zzo.zzl() || this.zzo.zzn()) && !z2) {
            zzazh zzazhVar = this.zzc;
            if (zzazhVar != null) {
                zzazhVar.zzc(motionEvent);
            }
            zzbil zzbilVar = this.zze;
            if (zzbilVar != null) {
                zzbilVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbkf zzbkfVar = this.zzE;
                    if (zzbkfVar != null) {
                        zzbkfVar.zzb(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final List zzF() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzH(int i2) {
        if (i2 == 0) {
            zzbhr zzbhrVar = this.zzM;
            zzbhl.zza(zzbhrVar.zzc(), this.zzK, "aebb2");
        }
        zzbb();
        zzbhr zzbhrVar2 = this.zzM;
        zzbhrVar2.zzc();
        zzbhrVar2.zzc().zzd("close_type", String.valueOf(i2));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i2));
        map.put(NodeModuleProcess.PROPERTY_VERSION, this.zzf.afmaVersion);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzI() {
        if (this.zzJ == null) {
            zzbhr zzbhrVar = this.zzM;
            zzbhl.zza(zzbhrVar.zzc(), this.zzK, "aes2");
            zzbhrVar.zzc();
            zzbhq zzbhqVarZzf = zzbht.zzf();
            this.zzJ = zzbhqVarZzf;
            zzbhrVar.zza("native:view_show", zzbhqVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put(NodeModuleProcess.PROPERTY_VERSION, this.zzf.afmaVersion);
        zze("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzJ() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzd()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzb()));
        map.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzaa.zze(getContext())));
        zze("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final Context zzK() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final com.google.common.util.concurrent.Xo zzaF() {
        zzbil zzbilVar = this.zze;
        return zzbilVar == null ? zzgzo.zza(null) : zzbilVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z2, boolean z3, String str) {
        this.zzo.zzv(zzcVar, z2, z3, str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaI(boolean z2, int i2, boolean z3) {
        this.zzo.zzx(z2, i2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaJ(boolean z2, int i2, String str, boolean z3, boolean z4) {
        this.zzo.zzy(z2, i2, str, z3, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaK(boolean z2, int i2, String str, String str2, boolean z3) {
        this.zzo.zzz(z2, i2, str, str2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaL(String str, String str2, int i2) {
        this.zzo.zzw(str, str2, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r10.zzV != r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzaM() {
        int iZzA;
        int iZzA2;
        boolean z2 = false;
        if (this.zzo.zzk() || this.zzo.zzl()) {
            com.google.android.gms.ads.internal.client.zzbb.zza();
            DisplayMetrics displayMetrics = this.zzi;
            int iZzA3 = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            int iZzA4 = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, displayMetrics.heightPixels);
            Activity activityZzb = this.zzb.zzb();
            if (activityZzb == null || activityZzb.getWindow() == null) {
                iZzA = iZzA3;
                iZzA2 = iZzA4;
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] iArrZzX = com.google.android.gms.ads.internal.util.zzs.zzX(activityZzb);
                com.google.android.gms.ads.internal.client.zzbb.zza();
                iZzA = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, iArrZzX[0]);
                com.google.android.gms.ads.internal.client.zzbb.zza();
                iZzA2 = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, iArrZzX[1]);
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            int rotation = this.zzX.getDefaultDisplay().getRotation();
            if (this.zzS == iZzA3 && this.zzR == iZzA4 && this.zzT == iZzA && this.zzU == iZzA2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaB)).booleanValue()) {
                }
            }
            if (this.zzS == iZzA3 && this.zzR == iZzA4) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaB)).booleanValue() && this.zzV != rotation) {
                }
            } else {
                z2 = true;
            }
            this.zzS = iZzA3;
            this.zzR = iZzA4;
            this.zzT = iZzA;
            this.zzU = iZzA2;
            this.zzV = rotation;
            new zzbwx(this, "").zzl(iZzA3, iZzA4, iZzA, iZzA2, displayMetrics.density, rotation);
            return z2;
        }
        return false;
    }

    final /* synthetic */ void zzaW(String str) {
        zzaV("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzab(String str, zzboh zzbohVar) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzB(str, zzbohVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzac(String str, zzboh zzbohVar) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzC(str, zzbohVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzad(String str, Predicate predicate) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzE(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzah() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzai(Context context) {
        zzcln zzclnVar = this.zzb;
        zzclnVar.setBaseContext(context);
        this.zzQ.zza(zzclnVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzap() {
        if (this.zzL == null) {
            zzbhr zzbhrVar = this.zzM;
            zzbhrVar.zzc();
            zzbhq zzbhqVarZzf = zzbht.zzf();
            this.zzL = zzbhqVarZzf;
            zzbhrVar.zza("native:view_load", zzbhqVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzav() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaw(boolean z2) {
        this.zzo.zzO(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        String string2 = sb.toString();
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(string2));
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzdn(boolean z2) {
        this.zzo.zzM(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzckx, com.google.android.gms.internal.ads.zzcge
    public final Activity zzj() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzu(boolean z2, long j2) {
        HashMap map = new HashMap(2);
        map.put("success", true != z2 ? "0" : "1");
        map.put("duration", Long.toString(j2));
        zze("onCacheAccessComplete", map);
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzX()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zZzaM = zzaM();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL != null && zZzaM) {
            zzmVarZzL.zzC();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final void onPause() {
        if (!zzX()) {
            try {
                super.onPause();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoa)).booleanValue() && WebViewFeature.n("MUTE_AUDIO")) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Muting webview");
                    WebViewCompat.az(this, true);
                }
            } catch (Exception e2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not pause webview.", e2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzod)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AdWebViewImpl.onPause");
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final void onResume() {
        if (!zzX()) {
            try {
                super.onResume();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoa)).booleanValue() && WebViewFeature.n("MUTE_AUDIO")) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Unmuting webview");
                    WebViewCompat.az(this, false);
                }
            } catch (Exception e2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not resume webview.", e2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzod)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AdWebViewImpl.onResume");
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcjw) {
            this.zzo = (zzcjw) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not stop loading webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzG() {
        zzbb();
        HashMap map = new HashMap(1);
        map.put(NodeModuleProcess.PROPERTY_VERSION, this.zzf.afmaVersion);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zza(String str) {
        zzaP(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzaA(final boolean z2, final int i2) {
        destroy();
        zzbgc zzbgcVar = new zzbgc() { // from class: com.google.android.gms.internal.ads.zzckm
            @Override // com.google.android.gms.internal.ads.zzbgc
            public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar) {
                int i3 = zzcko.zza;
                zzbgj.zzbl.zza zzaVarZzq = zzbgj.zzbl.zzq();
                boolean zZzb = zzaVarZzq.zzb();
                boolean z3 = z2;
                if (zZzb != z3) {
                    zzaVarZzq.zzc(z3);
                }
                zzaVarZzq.zzg(i2);
                zzaVar.zzal(zzaVarZzq.zzbu());
            }
        };
        zzbgd zzbgdVar = this.zzY;
        zzbgdVar.zzb(zzbgcVar);
        zzbgdVar.zzc(10003);
        return true;
    }

    protected final void zzaP(String str) {
        if (zzaR() == null) {
            zzba();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN("javascript:".concat(str));
        }
    }

    final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzc(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zze(String str, Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzbb.zza().zzk(map));
        } catch (JSONException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final int zzy() {
        return getMeasuredWidth();
    }
}
