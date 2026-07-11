package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class zzcjw extends WebViewClient implements zzclj {
    public static final /* synthetic */ int zzc = 0;

    @Nullable
    private zzdxz zzA;

    @Nullable
    private zzczz zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;

    @Nullable
    private final zzejf zzH;
    private View.OnAttachStateChangeListener zzI;
    protected final zzcjl zza;

    @Nullable
    protected zzcce zzb;

    @Nullable
    private final zzbgd zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzclh zzi;
    private zzcli zzj;
    private zzbmx zzk;
    private zzbmz zzl;
    private zzdjm zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzad zzw;

    @Nullable
    private zzbww zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbwr zzz = null;
    private final HashSet zzG = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgG)).split(",")));

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.zzt.zzc();
        r1 = r13.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011a, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0120, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0122, code lost:
    
        r15 = r1.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012d, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        r1 = r13.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0138, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013a, code lost:
    
        r16 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013d, code lost:
    
        r1 = r1.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0142, code lost:
    
        if (r1.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0145, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0147, code lost:
    
        if (r2 >= r1.length) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0155, code lost:
    
        if (r1[r2].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0157, code lost:
    
        r3 = r1[r2].trim().split(com.safedk.android.analytics.brandsafety.l.ae);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0164, code lost:
    
        if (r3.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0166, code lost:
    
        r5 = r3[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016d, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016f, code lost:
    
        r0 = r13.getHeaderFields();
        r1 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0188, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018a, code lost:
    
        r2 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0194, code lost:
    
        if (r2.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019a, code lost:
    
        if (r2.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a6, code lost:
    
        if (r2.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a8, code lost:
    
        r1.put(r2.getKey(), r2.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01be, code lost:
    
        r9 = com.google.android.gms.ads.internal.zzt.zzf().zzc(r15, r16, com.safedk.android.internal.partials.AdMobNetworkBridge.httpUrlConnectionGetResponseCode(r13), r13.getResponseMessage(), r1, com.safedk.android.internal.partials.AdMobNetworkBridge.urlConnectionGetInputStream(r13));
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final WebResourceResponse zzaf(String str, Map map) throws Throwable {
        WebResourceResponse webResourceResponseZzc;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i2 = 0;
            while (true) {
                i2++;
                if (i2 > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                int i3 = zzfxs.zzb;
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                com.google.android.gms.ads.internal.util.zzs zzsVarZzc = com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    zzcjl zzcjlVar = this.zza;
                    zzsVarZzc.zzb(zzcjlVar.getContext(), zzcjlVar.zzs().afmaVersion, false, httpURLConnection, false, 60000);
                    webResourceResponseZzc = null;
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    zzlVar.zza(httpURLConnection, null);
                    int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    zzlVar.zzc(httpURLConnection, iHttpUrlConnectionGetResponseCode);
                    if (iHttpUrlConnectionGetResponseCode < 300 || iHttpUrlConnectionGetResponseCode >= 400) {
                        break;
                    }
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if (headerField.startsWith("tel:")) {
                        break;
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Protocol is null");
                        webResourceResponseZzc = zzae();
                        break;
                    }
                    if (!protocol.equals(g.f62375e) && !protocol.equals("https")) {
                        StringBuilder sb = new StringBuilder(protocol.length() + 20);
                        sb.append("Unsupported scheme: ");
                        sb.append(protocol);
                        String string = sb.toString();
                        int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                        webResourceResponseZzc = zzae();
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder(headerField.length() + 15);
                    sb2.append("Redirecting to ");
                    sb2.append(headerField);
                    String string2 = sb2.toString();
                    int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd(string2);
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    url = url2;
                } catch (Throwable th) {
                    th = th;
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            TrafficStats.clearThreadStatsTag();
            return webResourceResponseZzc;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcjw;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.f63168h, webView, str);
        safedk_zzcjw_onLoadResource_39e2883cec5d4d28e73317931cb8f527(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.f63168h, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcjw;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.f63168h, webView, i2, str, str2);
        safedk_zzcjw_onReceivedError_d3b36d2855b9d02d0c8d69a7aa0d8bd5(webView, i2, str, str2);
    }

    public void safedk_zzcjw_onReceivedError_d3b36d2855b9d02d0c8d69a7aa0d8bd5(WebView p0, int p1, String p2, String p3) {
        this.zzo = true;
        this.zzp = p1;
        this.zzq = p2;
        this.zzr = p3;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcjw;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.f63168h, webView, str, safedk_zzcjw_shouldInterceptRequest_718453b31cb24262c2fef41a6d6e1da1(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcjw;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3 = safedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.f63168h, webView, str, zSafedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3);
        return zSafedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzG(zzclh zzclhVar) {
        this.zzi = zzclhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzH(zzcli zzcliVar) {
        this.zzj = zzcliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final zzdxz zzI() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzJ(zzczz zzczzVar) {
        this.zzB = zzczzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final zzczz zzK() {
        return this.zzB;
    }

    public final void zzM(boolean z2) {
        this.zzn = false;
    }

    public final void zzO(boolean z2) {
        this.zzF = z2;
    }

    final /* synthetic */ void zzV(boolean z2, long j2) {
        zzY(true, j2);
    }

    final /* synthetic */ void zzZ(View view, zzcce zzcceVar, int i2) {
        zzac(view, zzcceVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzab(@Nullable com.google.android.gms.ads.internal.client.zza zzaVar, @Nullable zzbmx zzbmxVar, @Nullable com.google.android.gms.ads.internal.overlay.zzr zzrVar, @Nullable zzbmz zzbmzVar, @Nullable com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z2, @Nullable zzbok zzbokVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbwy zzbwyVar, @Nullable zzcce zzcceVar, @Nullable zzeiu zzeiuVar, @Nullable zzfqk zzfqkVar, @Nullable zzdxz zzdxzVar, @Nullable zzbpc zzbpcVar, @Nullable zzdjm zzdjmVar, @Nullable zzbpb zzbpbVar, @Nullable zzbov zzbovVar, @Nullable zzboi zzboiVar, @Nullable zzcrv zzcrvVar, @Nullable zzdzc zzdzcVar, @Nullable zzdae zzdaeVar, @Nullable zzczz zzczzVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zza.getContext(), zzcceVar, null) : zzbVar;
        zzcjl zzcjlVar = this.zza;
        this.zzz = new zzbwr(zzcjlVar, zzbwyVar);
        this.zzb = zzcceVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbz)).booleanValue()) {
            zzB("/adMetadata", new zzbmw(zzbmxVar));
        }
        if (zzbmzVar != null) {
            zzB("/appEvent", new zzbmy(zzbmzVar));
        }
        zzB("/backButton", zzbog.zzj);
        zzB("/refresh", zzbog.zzk);
        zzB("/canOpenApp", zzbog.zzb);
        zzB("/canOpenURLs", zzbog.zza);
        zzB("/canOpenIntents", zzbog.zzc);
        zzB("/close", zzbog.zzd);
        zzB("/customClose", zzbog.zze);
        zzB("/instrument", zzbog.zzn);
        zzB("/delayPageLoaded", zzbog.zzp);
        zzB("/delayPageClosed", zzbog.zzq);
        zzB("/getLocationInfo", zzbog.zzr);
        zzB("/log", zzbog.zzg);
        zzB("/mraid", new zzboo(zzbVar2, this.zzz, zzbwyVar));
        zzbww zzbwwVar = this.zzx;
        if (zzbwwVar != null) {
            zzB("/mraidLoaded", zzbwwVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbou(zzbVar3, this.zzz, zzeiuVar, zzdxzVar, zzcrvVar, zzdaeVar));
        zzB("/precache", new zzchs());
        zzB("/touch", zzbog.zzi);
        zzB("/video", zzbog.zzl);
        zzB("/videoMeta", zzbog.zzm);
        if (zzeiuVar == null || zzfqkVar == null) {
            zzB("/click", zzbog.zzb(zzdjmVar, zzcrvVar));
            zzB("/httpTrack", zzbog.zzf);
        } else {
            zzB("/click", zzfjv.zza(zzeiuVar, zzfqkVar, zzcrvVar, zzdjmVar));
            zzB("/httpTrack", zzfjv.zzb(zzeiuVar, zzfqkVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcjlVar.getContext())) {
            Map map = new HashMap();
            if (zzcjlVar.zzC() != null) {
                map = zzcjlVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbon(zzcjlVar.getContext(), map));
        }
        if (zzbokVar != null) {
            zzB("/setInterstitialProperties", new zzboj(zzbokVar));
        }
        if (zzbpcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbpcVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkJ)).booleanValue() && zzbpbVar != null) {
            zzB("/shareSheet", zzbpbVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue() && zzdzcVar != null) {
            zzB("/onDeviceStorageEvent", new zzbop(zzdzcVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkO)).booleanValue() && zzbovVar != null) {
            zzB("/inspectorOutOfContextTest", zzbovVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkT)).booleanValue() && zzboiVar != null) {
            zzB("/inspectorStorage", zzboiVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmW)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbog.zzu);
            zzB("/presentPlayStoreOverlay", zzbog.zzv);
            zzB("/expandPlayStoreOverlay", zzbog.zzw);
            zzB("/collapsePlayStoreOverlay", zzbog.zzx);
            zzB("/closePlayStoreOverlay", zzbog.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzee)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbog.zzA);
            zzB("/resetPAID", zzbog.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznq)).booleanValue() && zzcjlVar.zzC() != null && zzcjlVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbog.zzB);
            zzB("/clearLocalStorageKeys", zzbog.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbmxVar;
        this.zzl = zzbmzVar;
        this.zzw = zzadVar;
        this.zzy = zzbVar3;
        this.zzm = zzdjmVar;
        this.zzA = zzdxzVar;
        this.zzB = zzczzVar;
        this.zzn = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final com.google.android.gms.ads.internal.zzb zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzi(@Nullable com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzj(zzcce zzcceVar) {
        this.zzb = zzcceVar;
    }

    private final void zzad() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzI;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    @Nullable
    private static WebResourceResponse zzae() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbq)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzY(boolean z2, long j2) {
        this.zza.zzu(z2, j2);
    }

    private static final boolean zzaj(boolean z2, zzcjl zzcjlVar) {
        return (!z2 || zzcjlVar.zzN().zzg() || zzcjlVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            try {
                zzcjl zzcjlVar = this.zza;
                if (zzcjlVar.zzX()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                    zzcjlVar.zzY();
                    return;
                }
                this.zzC = true;
                zzcli zzcliVar = this.zzj;
                if (zzcliVar != null) {
                    zzcliVar.zza();
                    this.zzj = null;
                }
                zzu();
                zzcjl zzcjlVar2 = this.zza;
                if (zzcjlVar2.zzL() != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznr)).booleanValue()) {
                        zzcjlVar2.zzL().zzz(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public WebResourceResponse safedk_zzcjw_shouldInterceptRequest_718453b31cb24262c2fef41a6d6e1da1(WebView p0, String p1) {
        return zzL(p1, Collections.EMPTY_MAP);
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbwr zzbwrVar = this.zzz;
        boolean zZzd = zzbwrVar != null ? zzbwrVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza.getContext(), adOverlayInfoParcel, !zZzd, this.zzA);
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcceVar.zzb(str);
        }
    }

    public final void zzB(String str, zzboh zzbohVar) {
        synchronized (this.zzf) {
            try {
                HashMap map = this.zze;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(zzbohVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzC(String str, zzboh zzbohVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbohVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzE(String str, Predicate predicate) {
        synchronized (this.zzf) {
            try {
                List<zzboh> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzboh zzbohVar : list) {
                    if (predicate.apply(zzbohVar)) {
                        arrayList.add(zzbohVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzF() {
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcceVar.zzf();
            this.zzb = null;
        }
        zzad();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbwr zzbwrVar = this.zzz;
                if (zzbwrVar != null) {
                    zzbwrVar.zzb(true);
                    this.zzz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02e3 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01c8, B:50:0x017c, B:97:0x02cd, B:100:0x02dd, B:102:0x02e3, B:104:0x02f1, B:86:0x024b, B:87:0x027e, B:85:0x0219, B:49:0x014b, B:32:0x00db, B:88:0x027f, B:90:0x0289, B:92:0x028f, B:94:0x02c2), top: B:112:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020e A[Catch: all -> 0x01bb, TryCatch #12 {all -> 0x01bb, blocks: (B:71:0x01a0, B:73:0x01b2, B:77:0x01be, B:81:0x01fc, B:83:0x020e, B:84:0x0215), top: B:111:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cd A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01c8, B:50:0x017c, B:97:0x02cd, B:100:0x02dd, B:102:0x02e3, B:104:0x02f1, B:86:0x024b, B:87:0x027e, B:85:0x0219, B:49:0x014b, B:32:0x00db, B:88:0x027f, B:90:0x0289, B:92:0x028f, B:94:0x02c2), top: B:112:0x000c }] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final WebResourceResponse zzL(String str, Map map) throws Throwable {
        WebResourceResponse webResourceResponse;
        int i2;
        InputStream inputStream;
        InputStream inputStreamZzb;
        final boolean z2;
        final boolean z3;
        final boolean z4;
        String string;
        try {
            Map map2 = new HashMap();
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar.zzC() != null) {
                map2 = zzcjlVar.zzC().zzaw;
            }
            String strZza = zzccs.zza(str, zzcjlVar.getContext(), this.zzF, map2);
            if (!strZza.equals(str)) {
                return zzaf(strZza, map);
            }
            Parcelable.Creator<zzbfp> creator = zzbfp.CREATOR;
            zzbfp zzbfpVarZza = zzbfp.zza(Uri.parse(str));
            if (zzbfpVarZza != null) {
                HashMap map3 = new HashMap();
                map3.put("Access-Control-Allow-Origin", "*");
                Uri uri = Uri.parse(str);
                if (uri.getQueryParameterNames().contains("range")) {
                    List listZze = zzgrr.zza(zzgqq.zzc('-')).zze(uri.getQueryParameter("range"));
                    if (listZze.size() == 2) {
                        int i3 = Integer.parseInt((String) listZze.get(0));
                        int i5 = Integer.parseInt((String) listZze.get(1)) + 1;
                        if (i3 > 0) {
                            zzbfpVarZza.zzh = i3;
                        }
                        i2 = i5 - i3;
                    } else {
                        i2 = -1;
                    }
                    String str2 = "X-Afma-Gcache-CachedBytes";
                    webResourceResponse = null;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfj)).booleanValue()) {
                        zzbfpVarZza.zzi = zzgrt.zza(zzcjlVar.zzn());
                        zzbfpVarZza.zzj = zzcjlVar.zzp();
                        try {
                            long jLongValue = (zzbfpVarZza.zzg ? (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfl) : (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfk)).longValue();
                            long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                            com.google.android.gms.ads.internal.zzt.zzz();
                            Future futureZza = zzbga.zza(zzcjlVar.getContext(), zzbfpVarZza);
                            try {
                                zzbgb zzbgbVar = (zzbgb) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                                try {
                                    try {
                                        map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbgbVar.zzc()));
                                        map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbgbVar.zzd()));
                                        map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbgbVar.zzf()));
                                        map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbgbVar.zze()));
                                        inputStreamZzb = zzbgbVar.zzb();
                                        if (i2 != -1) {
                                            try {
                                                inputStreamZzb = zzgxf.zzb(inputStreamZzb, i2);
                                            } catch (InterruptedException e2) {
                                                e = e2;
                                                z4 = true;
                                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                                }
                                                futureZza.cancel(true);
                                                Thread.currentThread().interrupt();
                                                final long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjq
                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        this.zza.zzX(z4, jElapsedRealtime2);
                                                    }
                                                });
                                                StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 24);
                                                sb.append("Cache connection took ");
                                                sb.append(jElapsedRealtime2);
                                                sb.append("ms");
                                                string = sb.toString();
                                            } catch (ExecutionException e3) {
                                                e = e3;
                                                z3 = true;
                                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                                }
                                                futureZza.cancel(true);
                                                final long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        this.zza.zzW(z3, jElapsedRealtime3);
                                                    }
                                                });
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 24);
                                                sb2.append("Cache connection took ");
                                                sb2.append(jElapsedRealtime3);
                                                sb2.append("ms");
                                                string = sb2.toString();
                                            } catch (TimeoutException e4) {
                                                e = e4;
                                                z3 = true;
                                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                                }
                                                futureZza.cancel(true);
                                                final long jElapsedRealtime32 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        this.zza.zzW(z3, jElapsedRealtime32);
                                                    }
                                                });
                                                StringBuilder sb22 = new StringBuilder(String.valueOf(jElapsedRealtime32).length() + 24);
                                                sb22.append("Cache connection took ");
                                                sb22.append(jElapsedRealtime32);
                                                sb22.append("ms");
                                                string = sb22.toString();
                                            }
                                        }
                                        final long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                        final boolean z5 = true;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(z5, jElapsedRealtime4) { // from class: com.google.android.gms.internal.ads.zzcjo
                                            private final /* synthetic */ long zzb;

                                            {
                                                this.zzb = jElapsedRealtime4;
                                            }

                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                this.zza.zzV(true, this.zzb);
                                            }
                                        });
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 24);
                                        sb3.append("Cache connection took ");
                                        sb3.append(jElapsedRealtime4);
                                        sb3.append("ms");
                                        string = sb3.toString();
                                    } catch (Throwable th) {
                                        th = th;
                                        z2 = 1;
                                        final long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjr
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                this.zza.zzY(z2, jElapsedRealtime5);
                                            }
                                        });
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime5).length() + 24);
                                        sb4.append("Cache connection took ");
                                        sb4.append(jElapsedRealtime5);
                                        sb4.append("ms");
                                        com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                                        throw th;
                                    }
                                } catch (InterruptedException e5) {
                                    e = e5;
                                    inputStreamZzb = null;
                                } catch (ExecutionException e6) {
                                    e = e6;
                                    inputStreamZzb = null;
                                    z3 = true;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                    }
                                    futureZza.cancel(true);
                                    final long jElapsedRealtime322 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.zza.zzW(z3, jElapsedRealtime322);
                                        }
                                    });
                                    StringBuilder sb222 = new StringBuilder(String.valueOf(jElapsedRealtime322).length() + 24);
                                    sb222.append("Cache connection took ");
                                    sb222.append(jElapsedRealtime322);
                                    sb222.append("ms");
                                    string = sb222.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(string);
                                    inputStream = inputStreamZzb;
                                    if (inputStream != null) {
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (TimeoutException e7) {
                                    e = e7;
                                    inputStreamZzb = null;
                                    z3 = true;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                    }
                                    futureZza.cancel(true);
                                    final long jElapsedRealtime3222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.zza.zzW(z3, jElapsedRealtime3222);
                                        }
                                    });
                                    StringBuilder sb2222 = new StringBuilder(String.valueOf(jElapsedRealtime3222).length() + 24);
                                    sb2222.append("Cache connection took ");
                                    sb2222.append(jElapsedRealtime3222);
                                    sb2222.append("ms");
                                    string = sb2222.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(string);
                                    inputStream = inputStreamZzb;
                                    if (inputStream != null) {
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                }
                            } catch (InterruptedException e8) {
                                e = e8;
                                inputStreamZzb = null;
                                z4 = false;
                            } catch (ExecutionException e9) {
                                e = e9;
                                inputStreamZzb = null;
                                z3 = false;
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                }
                                futureZza.cancel(true);
                                final long jElapsedRealtime32222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.zza.zzW(z3, jElapsedRealtime32222);
                                    }
                                });
                                StringBuilder sb22222 = new StringBuilder(String.valueOf(jElapsedRealtime32222).length() + 24);
                                sb22222.append("Cache connection took ");
                                sb22222.append(jElapsedRealtime32222);
                                sb22222.append("ms");
                                string = sb22222.toString();
                                com.google.android.gms.ads.internal.util.zze.zza(string);
                                inputStream = inputStreamZzb;
                                if (inputStream != null) {
                                }
                                if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                }
                            } catch (TimeoutException e10) {
                                e = e10;
                                inputStreamZzb = null;
                                z3 = false;
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                }
                                futureZza.cancel(true);
                                final long jElapsedRealtime322222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.zza.zzW(z3, jElapsedRealtime322222);
                                    }
                                });
                                StringBuilder sb222222 = new StringBuilder(String.valueOf(jElapsedRealtime322222).length() + 24);
                                sb222222.append("Cache connection took ");
                                sb222222.append(jElapsedRealtime322222);
                                sb222222.append("ms");
                                string = sb222222.toString();
                                com.google.android.gms.ads.internal.util.zze.zza(string);
                                inputStream = inputStreamZzb;
                                if (inputStream != null) {
                                }
                                if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z2 = 0;
                            }
                            com.google.android.gms.ads.internal.util.zze.zza(string);
                        } catch (Throwable th3) {
                            th = th3;
                            z2 = str2;
                        }
                    } else {
                        zzbfm zzbfmVarZzc = com.google.android.gms.ads.internal.zzt.zzj().zzc(zzbfpVarZza);
                        if (zzbfmVarZzc == null || !zzbfmVarZzc.zza()) {
                            inputStream = null;
                            if (inputStream != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                            }
                        } else {
                            map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbfmVarZzc.zzd()));
                            map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbfmVarZzc.zzg()));
                            map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbfmVarZzc.zze()));
                            map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbfmVarZzc.zzf()));
                            inputStreamZzb = zzbfmVarZzc.zzb();
                            if (i2 != -1) {
                                inputStreamZzb = zzgxf.zzb(inputStreamZzb, i2);
                            }
                        }
                    }
                    inputStream = inputStreamZzb;
                    if (inputStream != null) {
                    }
                }
            } else {
                webResourceResponse = null;
            }
            return (com.google.android.gms.ads.internal.util.client.zzl.zzj() || !((Boolean) zzbja.zzb.zze()).booleanValue()) ? webResourceResponse : zzaf(str, map);
        } catch (Exception e11) {
            e = e11;
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest");
            return zzae();
        } catch (NoClassDefFoundError e12) {
            e = e12;
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest");
            return zzae();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzN() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcjl zzcjlVar = this.zza.zza;
                    zzcjlVar.zzah();
                    com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzcjlVar.zzL();
                    if (zzmVarZzL != null) {
                        zzmVarZzL.zzv();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzP(int i2, int i3) {
        zzbwr zzbwrVar = this.zzz;
        if (zzbwrVar != null) {
            zzbwrVar.zze(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzR(boolean z2) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzS(boolean z2) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzT(boolean z2) {
        synchronized (this.zzf) {
            this.zzv = z2;
        }
    }

    final /* synthetic */ void zzU(View view, zzcce zzcceVar, int i2) {
        zzac(view, zzcceVar, i2 - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zza(int i2, int i3, boolean z2) {
        zzbww zzbwwVar = this.zzx;
        if (zzbwwVar != null) {
            zzbwwVar.zzb(i2, i3);
        }
        zzbwr zzbwrVar = this.zzz;
        if (zzbwrVar != null) {
            zzbwrVar.zzc(i2, i3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzb(zzfir zzfirVar) {
        zzcjl zzcjlVar = this.zza;
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcjlVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbon(zzcjlVar.getContext(), zzfirVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzc(zzcrv zzcrvVar) {
        zzD("/click");
        zzB("/click", zzbog.zzb(this.zzm, zzcrvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzd(zzcrv zzcrvVar, @Nullable zzeiu zzeiuVar, @Nullable zzfqk zzfqkVar) {
        zzD("/click");
        if (zzeiuVar == null || zzfqkVar == null) {
            zzB("/click", zzbog.zzb(this.zzm, zzcrvVar));
        } else {
            zzB("/click", zzfjv.zza(zzeiuVar, zzfqkVar, zzcrvVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
        zzdjm zzdjmVar = this.zzm;
        if (zzdjmVar != null) {
            zzdjmVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzdjm zzdjmVar = this.zzm;
        if (zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zze(zzcrv zzcrvVar, @Nullable zzeiu zzeiuVar, @Nullable zzdxz zzdxzVar) {
        zzD("/open");
        zzB("/open", new zzbou(this.zzy, this.zzz, zzeiuVar, zzdxzVar, zzcrvVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final boolean zzk() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzs;
        }
        return z2;
    }

    public final boolean zzl() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzt;
        }
        return z2;
    }

    public final boolean zzm() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzu;
        }
        return z2;
    }

    public final boolean zzn() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzv;
        }
        return z2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzq() {
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcjl zzcjlVar = this.zza;
            WebView webViewZzD = zzcjlVar.zzD();
            if (ViewCompat.U(webViewZzD)) {
                zzac(webViewZzD, zzcceVar, 10);
                return;
            }
            zzad();
            zzcjm zzcjmVar = new zzcjm(this, zzcceVar);
            this.zzI = zzcjmVar;
            ((View) zzcjlVar).addOnAttachStateChangeListener(zzcjmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzE++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzs() {
        this.zzE--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzt() {
        zzbgd zzbgdVar = this.zzd;
        if (zzbgdVar != null) {
            zzbgdVar.zzc(10005);
        }
        this.zzD = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzC && this.zzE <= 0) || this.zzD || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue()) {
                zzcjl zzcjlVar = this.zza;
                if (zzcjlVar.zzq() != null) {
                    zzbhl.zza(zzcjlVar.zzq().zzc(), zzcjlVar.zzi(), "awfllc");
                }
            }
            zzclh zzclhVar = this.zzi;
            boolean z2 = false;
            if (!this.zzD && !this.zzo) {
                z2 = true;
            }
            zzclhVar.zza(z2, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z2, boolean z3, String str) {
        boolean z4;
        zzcjl zzcjlVar = this.zza;
        boolean zZzW = zzcjlVar.zzW();
        boolean z5 = false;
        boolean z6 = zzaj(zZzW, zzcjlVar) || z3;
        if (z6 || !z2) {
            z4 = zZzW;
            z5 = true;
        } else {
            z4 = zZzW;
        }
        zzA(new AdOverlayInfoParcel(zzcVar, z6 ? null : this.zzg, z4 ? null : this.zzh, this.zzw, zzcjlVar.zzs(), zzcjlVar, z5 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i2) {
        zzejf zzejfVar = this.zzH;
        zzcjl zzcjlVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzcjlVar, zzcjlVar.zzs(), str, str2, 14, zzejfVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.zzbxl] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final void zzx(boolean z2, int i2, boolean z3) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzdjm zzdjmVar;
        ?? r9;
        int i3;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z4;
        zzcjl zzcjlVar = this.zza;
        boolean zZzaj = zzaj(zzcjlVar.zzW(), zzcjlVar);
        boolean z5 = true;
        if (!zZzaj && z3) {
            z5 = false;
        }
        if (zZzaj) {
            zzaVar = null;
            zzdjmVar = null;
        } else {
            zzaVar = this.zzg;
            zzdjmVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzh;
        zzdjm zzdjmVar2 = zzdjmVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzs = zzcjlVar.zzs();
        zzdjm zzdjmVar3 = z5 ? zzdjmVar2 : this.zzm;
        if (zzai(zzcjlVar)) {
            r9 = this.zzH;
            z4 = z2;
            i3 = i2;
            zzaVar2 = zzaVar;
        } else {
            r9 = zzdjmVar2;
            i3 = i2;
            zzaVar2 = zzaVar;
            z4 = z2;
        }
        zzA(new AdOverlayInfoParcel(zzaVar2, zzrVar, zzadVar, zzcjlVar, z4, i3, versionInfoParcelZzs, zzdjmVar3, r9));
    }

    public final void zzy(boolean z2, int i2, String str, boolean z3, boolean z4) {
        zzcjl zzcjlVar = this.zza;
        boolean zZzW = zzcjlVar.zzW();
        boolean zZzaj = zzaj(zZzW, zzcjlVar);
        boolean z5 = true;
        if (!zZzaj && z3) {
            z5 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzaj ? null : this.zzg;
        zzcjv zzcjvVar = zZzW ? null : new zzcjv(zzcjlVar, this.zzh);
        zzbmx zzbmxVar = this.zzk;
        zzejf zzejfVar = null;
        zzbmz zzbmzVar = this.zzl;
        boolean z6 = z5;
        zzcjv zzcjvVar2 = zzcjvVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzs = zzcjlVar.zzs();
        zzdjm zzdjmVar = z6 ? null : this.zzm;
        if (zzai(zzcjlVar)) {
            zzejfVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzcjvVar2, zzbmxVar, zzbmzVar, zzadVar, zzcjlVar, z2, i2, str, versionInfoParcelZzs, zzdjmVar, zzejfVar, z4));
    }

    public final void zzz(boolean z2, int i2, String str, String str2, boolean z3) {
        zzcjl zzcjlVar = this.zza;
        boolean zZzW = zzcjlVar.zzW();
        boolean zZzaj = zzaj(zZzW, zzcjlVar);
        boolean z4 = true;
        if (!zZzaj && z3) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzaj ? null : this.zzg;
        zzcjv zzcjvVar = zZzW ? null : new zzcjv(zzcjlVar, this.zzh);
        zzbmx zzbmxVar = this.zzk;
        zzejf zzejfVar = null;
        zzbmz zzbmzVar = this.zzl;
        boolean z5 = z4;
        zzcjv zzcjvVar2 = zzcjvVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzs = zzcjlVar.zzs();
        zzdjm zzdjmVar = z5 ? null : this.zzm;
        if (zzai(zzcjlVar)) {
            zzejfVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzcjvVar2, zzbmxVar, zzbmzVar, zzadVar, zzcjlVar, z2, i2, str, str2, versionInfoParcelZzs, zzdjmVar, zzejfVar));
    }

    @VisibleForTesting
    public zzcjw(zzcjl zzcjlVar, @Nullable zzbgd zzbgdVar, boolean z2, zzbww zzbwwVar, @Nullable zzbwr zzbwrVar, @Nullable zzejf zzejfVar) {
        this.zzd = zzbgdVar;
        this.zza = zzcjlVar;
        this.zzs = z2;
        this.zzx = zzbwwVar;
        this.zzH = zzejfVar;
    }

    private final void zzac(final View view, final zzcce zzcceVar, final int i2) {
        if (zzcceVar.zzc() && i2 > 0) {
            zzcceVar.zzd(view);
            if (zzcceVar.zzc()) {
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcju
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzU(view, zzcceVar, i2);
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzaa(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzboh) it.next()).zza(this.zza, map);
        }
    }

    private static final boolean zzai(zzcjl zzcjlVar) {
        if (zzcjlVar.zzC() != null && zzcjlVar.zzC().zzb()) {
            return true;
        }
        return false;
    }

    public void safedk_zzcjw_onLoadResource_39e2883cec5d4d28e73317931cb8f527(WebView p0, String p1) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(p1)));
        Uri uri = Uri.parse(p1);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzQ(uri);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean safedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3(WebView p0, String p1) {
        String strZzn;
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(p1)));
        Uri uriZzd = Uri.parse(p1);
        if ("gmsg".equalsIgnoreCase(uriZzd.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZzd.getHost())) {
            zzQ(uriZzd);
        } else {
            if (this.zzn && p0 == this.zza.zzD()) {
                String scheme = uriZzd.getScheme();
                if (g.f62375e.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzcce zzcceVar = this.zzb;
                        if (zzcceVar != null) {
                            zzcceVar.zzb(p1);
                        }
                        this.zzg = null;
                    }
                    zzdjm zzdjmVar = this.zzm;
                    if (zzdjmVar != null) {
                        zzdjmVar.zzdu();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(p0, p1);
                }
            }
            zzcjl zzcjlVar = this.zza;
            if (!zzcjlVar.zzD().willNotDraw()) {
                try {
                    zzazh zzazhVarZzS = zzcjlVar.zzS();
                    zzfjo zzfjoVarZzT = zzcjlVar.zzT();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() && zzfjoVarZzT != null) {
                        if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                            uriZzd = zzfjoVarZzT.zza(uriZzd, zzcjlVar.getContext(), (View) zzcjlVar, zzcjlVar.zzj());
                        }
                    } else if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                        uriZzd = zzazhVarZzS.zzd(uriZzd, zzcjlVar.getContext(), (View) zzcjlVar, zzcjlVar.zzj());
                    }
                } catch (zzazi unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(p1)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar != null && !zzbVar.zzb()) {
                    zzbVar.zzc(p1);
                } else {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZzd.toString(), null, null, null, null, null, null);
                    zzcjl zzcjlVar2 = this.zza;
                    if (zzcjlVar2 != null) {
                        strZzn = zzcjlVar2.zzn();
                    } else {
                        strZzn = "";
                    }
                    zzv(zzcVar, true, false, strZzn);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(p1)));
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzQ(Uri uri) {
        final String strSubstring;
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgF)).booleanValue() && this.zzG.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgH)).intValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                    zzgzo.zzr(com.google.android.gms.ads.internal.zzt.zzc().zzf(uri), new zzcjn(this, list, path, uri), zzcei.zzf);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            zzaa(com.google.android.gms.ads.internal.util.zzs.zzV(uri), list, path);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhF)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzh().zza() != null) {
            if (path != null && path.length() >= 2) {
                strSubstring = path.substring(1);
            } else {
                strSubstring = V8ValueNull.NULL;
            }
            zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    int i2 = zzcjw.zzc;
                    com.google.android.gms.ads.internal.zzt.zzh().zza().zze(strSubstring);
                }
            });
        }
    }
}
