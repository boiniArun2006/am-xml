package com.safedk.android.analytics.brandsafety;

import WJ.phkN.HFAkacKHsU;
import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.ScreenshotHelper;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.SdksMapping;
import d8q.jqQ.QTafcm;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class BannerFinder extends com.safedk.android.analytics.brandsafety.b {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected static final int f61363I = 5;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected static final long f61364J = 1000;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected static final long f61365K = 500;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected static final long f61368N = 10;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected final LinkedHashSetWithItemLimit<String> f61373O;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final HashSet<d> f61374T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final Set<String> f61375U;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    protected static final Map<d, e> f61366L = new ConcurrentHashMap();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    protected static final Map<String, List<o>> f61367M = new ConcurrentHashMap();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static h f61369P = null;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final Map<String, List<WeakReference<MaxAdView>>> f61370Q = new ConcurrentHashMap();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final Map<String, BrandSafetyUtils.AdType> f61371R = new ConcurrentHashMap();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Map<String, d> f61372S = new ConcurrentHashMap();

    public static Map<String, BrandSafetyUtils.AdType> f() {
        return f61371R;
    }

    public Set<String> i() {
        return this.f61375U;
    }

    public BannerFinder(int maxAttemptsToCaptureImage) {
        super(BrandSafetyUtils.AdType.BANNER, Arrays.asList(BrandSafetyUtils.f61447m, BrandSafetyUtils.f61448n), "BannerFinder", maxAttemptsToCaptureImage);
        this.f61374T = new HashSet<>();
        this.f61375U = new HashSet();
        this.f61373O = new LinkedHashSetWithItemLimit<>(f61368N);
        l();
    }

    protected BannerFinder(BrandSafetyUtils.AdType adType, List<String> supportedAdFormats, String logTag, int maxAttemptsToCaptureImage) {
        super(adType, supportedAdFormats, logTag, maxAttemptsToCaptureImage);
        this.f61374T = new HashSet<>();
        this.f61375U = new HashSet();
        this.f61373O = new LinkedHashSetWithItemLimit<>(f61368N);
        l();
    }

    private void l() {
        e eVar;
        this.f61778H = new PersistentConcurrentHashMap("SafeDKRedirects." + com.safedk.android.utils.n.a(SafeDK.getInstance().m()));
        Logger.d("BannerFinder", "handle saved redirects from previous session, found ", Integer.valueOf(this.f61778H.size()), " redirects", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        ArrayList arrayList = new ArrayList();
        for (String str : this.f61778H.keySet()) {
            RedirectData redirectData = this.f61778H.get(str);
            if (redirectData != null && (redirectData.f61726i || redirectData.f61727j)) {
                redirectData.a("UnmatchedRedirectWebview=" + str);
                if (redirectData.f61737t == BrandSafetyEvent.AdFormatType.MREC) {
                    eVar = new r(redirectData.f61735r, redirectData.f61736s);
                } else {
                    if (redirectData.f61737t == null) {
                        redirectData.f61737t = BrandSafetyEvent.AdFormatType.BANNER;
                        redirectData.a("UnmatchedRedirectFallback=BANNER");
                    }
                    eVar = new e(redirectData.f61735r, redirectData.f61736s);
                }
                e eVar2 = eVar;
                eVar2.a(f61752F.get(str));
                BrandSafetyEvent brandSafetyEventA = a(eVar2, new k(redirectData), true, false, Long.MAX_VALUE, (String) null);
                brandSafetyEventA.c(true);
                brandSafetyEventA.a(SafeDK.getInstance().e());
                arrayList.add(brandSafetyEventA);
            }
        }
        if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
            this.f61778H.clear();
        } else {
            Logger.w("BannerFinder", "handle saved redirects from previous session, cannot report brand safety event");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new e(str, str2, str3, screenShotOrientation, str4, str5);
    }

    protected e a(Activity activity, String str, int i2, String str2, Bundle bundle, String str3) {
        e eVar = new e(a(com.safedk.android.internal.b.getInstance().getForegroundActivity()), str, i2, str2, bundle, str3);
        eVar.ag = new WeakReference<>(activity);
        return eVar;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        String string;
        String string2;
        d dVar;
        String str;
        String str2;
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().p() || SafeDK.getInstance() == null || !SafeDK.getInstance().q()) {
            return;
        }
        Bundle messageData = message.getMessageData();
        if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.f61780b.contains(messageData.getString("ad_format"))) {
            Logger.d(this.f61779a, "Revenue event detected : ", messageData);
            string = "revenue_event";
        } else {
            string = messageData.getString("type");
        }
        String string3 = messageData.getString("ad_format");
        String string4 = messageData.getString(BrandSafetyEvent.f62740k);
        String string5 = messageData.getString(BrandSafetyEvent.f62741l);
        String string6 = messageData.getString("id", null);
        if (string6 == null) {
            Logger.d(this.f61779a, "No eventId in data bundle, cannot match");
        }
        String string7 = messageData.getString(BrandSafetyEvent.ad);
        String strC = CreativeInfoManager.c(string7);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jB = com.safedk.android.utils.n.b(jCurrentTimeMillis);
        String str3 = obbPUqyhtS.cIhdfAuZ;
        if (!messageData.containsKey(str3)) {
            string2 = null;
        } else {
            string2 = messageData.getString(str3);
        }
        if (this.f61780b.contains(string3)) {
            Logger.d(this.f61779a, "Max message received, package: ", strC, ", ts (seconds): ", Long.valueOf(jB), ", message received: ", message.getMessageData(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            String str4 = string2;
            d dVar2 = new d(string5, string4, string6, strC, string7, BrandSafetyUtils.b(string3));
            if (!"WILL_DISPLAY".equals(string)) {
                if ("revenue_event".equals(string)) {
                    if (strC != null && f(string7, strC)) {
                        Logger.d(this.f61779a, "REVENUE_EVENT event for package=", strC, " banner key=", dVar2, ", slot count=", Integer.valueOf(this.f61782d));
                        a(string6, l.f62656k, new l.a("typ", messageData.getString("revenue_event")));
                    }
                    a(string7, strC, str4, dVar2, messageData);
                    return;
                }
                if ("DID_CLICKED".equals(string)) {
                    if (f(string7, strC)) {
                        e eVar = f61366L.get(dVar2);
                        Logger.d(this.f61779a, "DID_CLICKED event currentActivityBanner = ", eVar);
                        a(string6, l.f62653h, new l.a[0]);
                        if (eVar != null) {
                            String str5 = this.f61779a;
                            Object[] objArr = new Object[4];
                            objArr[0] = "DID_CLICKED event for package=";
                            objArr[1] = strC == null ? string7 : strC;
                            objArr[2] = ", slot count=";
                            objArr[3] = Integer.valueOf(this.f61782d);
                            Logger.d(str5, objArr);
                            d(dVar2);
                            return;
                        }
                        Logger.d(this.f61779a, "DID_CLICKED event cannot find banner key ", dVar2);
                        return;
                    }
                    return;
                }
                if ("WILL_LOAD".equals(string)) {
                    if (strC != null && f(string7, strC)) {
                        Logger.d(this.f61779a, "WILL_LOAD event for package=", strC, " banner key=", dVar2, ", slot count=", Integer.valueOf(this.f61782d));
                        a(string6, l.f62649d, new l.a(l.f62633N, string7));
                        return;
                    }
                    return;
                }
                if ("DID_HIDE".equals(string)) {
                    if (strC != null && f(string7, strC)) {
                        Logger.d(this.f61779a, "DID_HIDE event for package=", strC, " banner key=", dVar2, ", slot count=", Integer.valueOf(this.f61782d));
                        a(string6, l.f62654i, new l.a[0]);
                        c(dVar2);
                        return;
                    }
                    return;
                }
                if ("DID_LOAD".equals(string)) {
                    if (strC != null && f(string7, strC)) {
                        Logger.d(this.f61779a, "DID_LOAD event for package=", strC, " banner key=", dVar2, ", slot count=", Integer.valueOf(this.f61782d));
                        a(string6, l.f62650e, new l.a(l.f62633N, string7));
                        return;
                    }
                    return;
                }
                if ("DID_DISPLAY".equals(string)) {
                    if (strC != null && f(string7, strC)) {
                        Logger.d(this.f61779a, "DID_DISPLAY event for package=", strC, " banner key=", dVar2, ", slot count=", Integer.valueOf(this.f61782d));
                        a(string6, l.f62652g, new l.a[0]);
                        a(strC, dVar2, str4, messageData, jCurrentTimeMillis);
                        return;
                    }
                    return;
                }
                if ("DID_FAIL_DISPLAY".equals(string) && strC != null && f(string7, strC)) {
                    Logger.d(this.f61779a, "DID_FAIL_DISPLAY event for package=", strC, " banner key=", dVar2, ", slot count=", Integer.valueOf(this.f61782d));
                    a(string6, l.f62655j, new l.a[0]);
                    a(dVar2);
                    return;
                }
                return;
            }
            if (strC != null) {
                str2 = string7;
                if (!f(str2, strC)) {
                    dVar = dVar2;
                    str = str4;
                } else {
                    dVar = dVar2;
                    Logger.d(this.f61779a, "WILL_DISPLAY event for package=", strC, " banner key=", dVar, ", slot count=", Integer.valueOf(this.f61782d));
                    str = str4;
                    CreativeInfoManager.a(strC, string4, str, string6, string3);
                    a(string6, l.f62651f, new l.a(l.f62631L, BrandSafetyUtils.n(messageData.getString("ad_view"))));
                }
            } else {
                dVar = dVar2;
                str = str4;
                str2 = string7;
            }
            a(str2, strC, str, dVar, messageData, jCurrentTimeMillis);
        }
    }

    private void a(d dVar) {
        e eVar = f61366L.get(dVar);
        if (eVar != null) {
            eVar.f61821N = true;
        }
    }

    public boolean m(String str) {
        Set<d> setKeySet;
        if (str != null) {
            synchronized (f61366L) {
                setKeySet = f61366L.keySet();
            }
            if (!setKeySet.isEmpty()) {
                Iterator<d> it = setKeySet.iterator();
                while (it.hasNext()) {
                    e eVar = f61366L.get(it.next());
                    Logger.d(this.f61779a, "is banner web view address: banner view: ", eVar.f61818K, " given address: ", str, " view hierarchy: ", eVar.f61831m);
                    if ((eVar.f61818K != null && str.equals(eVar.f61818K)) || (eVar.f61831m != null && eVar.f61831m.contains(str))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f61411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f61412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f61413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        d f61414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f61415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f61416f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f61417g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ScheduledFuture<?> f61418h;

        public b(String str, String str2, d dVar, Bundle bundle) {
            this.f61411a = dVar.f62523e;
            this.f61412b = str;
            this.f61413c = str2;
            this.f61414d = dVar;
            this.f61415e = bundle;
            Logger.d(BannerFinder.this.f61779a, "web view scanner created, networkName = ", this.f61411a, ", packageName = ", str, ", maxCreativeId = ", str2, ", adInfoKey = ", dVar, ", applovinData = ", bundle, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0382 A[Catch: Exception -> 0x04ad, TryCatch #0 {Exception -> 0x04ad, blocks: (B:17:0x0058, B:19:0x0061, B:21:0x008c, B:23:0x00bd, B:24:0x00c3, B:26:0x00c9, B:28:0x00d7, B:30:0x00ee, B:33:0x00f7, B:35:0x00fb, B:107:0x0382, B:109:0x03b2, B:111:0x03c0, B:113:0x03d4, B:115:0x03db, B:117:0x03e1, B:132:0x0435, B:134:0x043b, B:118:0x03e7, B:125:0x0406, B:127:0x040c, B:129:0x0410, B:121:0x03fc, B:131:0x0425, B:108:0x03a4, B:36:0x011f, B:38:0x0125, B:40:0x015a, B:42:0x0164, B:45:0x01a1, B:66:0x022a, B:70:0x023c, B:71:0x023f, B:73:0x024e, B:76:0x025a, B:78:0x0260, B:79:0x0268, B:81:0x026e, B:82:0x027e, B:84:0x0287, B:87:0x02bf, B:89:0x02c3, B:91:0x02cb, B:93:0x02f3, B:95:0x0310, B:97:0x032a, B:99:0x0330, B:101:0x0351, B:103:0x0355, B:47:0x01a7, B:49:0x01ad, B:51:0x01ce, B:55:0x01e7, B:57:0x01ef, B:59:0x0207, B:61:0x020b, B:63:0x021b, B:65:0x0227, B:135:0x0448, B:137:0x044d, B:139:0x0453, B:143:0x045c, B:149:0x04a6, B:146:0x0462, B:148:0x0466), top: B:160:0x0058 }] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x03a4 A[Catch: Exception -> 0x04ad, TryCatch #0 {Exception -> 0x04ad, blocks: (B:17:0x0058, B:19:0x0061, B:21:0x008c, B:23:0x00bd, B:24:0x00c3, B:26:0x00c9, B:28:0x00d7, B:30:0x00ee, B:33:0x00f7, B:35:0x00fb, B:107:0x0382, B:109:0x03b2, B:111:0x03c0, B:113:0x03d4, B:115:0x03db, B:117:0x03e1, B:132:0x0435, B:134:0x043b, B:118:0x03e7, B:125:0x0406, B:127:0x040c, B:129:0x0410, B:121:0x03fc, B:131:0x0425, B:108:0x03a4, B:36:0x011f, B:38:0x0125, B:40:0x015a, B:42:0x0164, B:45:0x01a1, B:66:0x022a, B:70:0x023c, B:71:0x023f, B:73:0x024e, B:76:0x025a, B:78:0x0260, B:79:0x0268, B:81:0x026e, B:82:0x027e, B:84:0x0287, B:87:0x02bf, B:89:0x02c3, B:91:0x02cb, B:93:0x02f3, B:95:0x0310, B:97:0x032a, B:99:0x0330, B:101:0x0351, B:103:0x0355, B:47:0x01a7, B:49:0x01ad, B:51:0x01ce, B:55:0x01e7, B:57:0x01ef, B:59:0x0207, B:61:0x020b, B:63:0x021b, B:65:0x0227, B:135:0x0448, B:137:0x044d, B:139:0x0453, B:143:0x045c, B:149:0x04a6, B:146:0x0462, B:148:0x0466), top: B:160:0x0058 }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x03c0 A[Catch: Exception -> 0x04ad, TryCatch #0 {Exception -> 0x04ad, blocks: (B:17:0x0058, B:19:0x0061, B:21:0x008c, B:23:0x00bd, B:24:0x00c3, B:26:0x00c9, B:28:0x00d7, B:30:0x00ee, B:33:0x00f7, B:35:0x00fb, B:107:0x0382, B:109:0x03b2, B:111:0x03c0, B:113:0x03d4, B:115:0x03db, B:117:0x03e1, B:132:0x0435, B:134:0x043b, B:118:0x03e7, B:125:0x0406, B:127:0x040c, B:129:0x0410, B:121:0x03fc, B:131:0x0425, B:108:0x03a4, B:36:0x011f, B:38:0x0125, B:40:0x015a, B:42:0x0164, B:45:0x01a1, B:66:0x022a, B:70:0x023c, B:71:0x023f, B:73:0x024e, B:76:0x025a, B:78:0x0260, B:79:0x0268, B:81:0x026e, B:82:0x027e, B:84:0x0287, B:87:0x02bf, B:89:0x02c3, B:91:0x02cb, B:93:0x02f3, B:95:0x0310, B:97:0x032a, B:99:0x0330, B:101:0x0351, B:103:0x0355, B:47:0x01a7, B:49:0x01ad, B:51:0x01ce, B:55:0x01e7, B:57:0x01ef, B:59:0x0207, B:61:0x020b, B:63:0x021b, B:65:0x0227, B:135:0x0448, B:137:0x044d, B:139:0x0453, B:143:0x045c, B:149:0x04a6, B:146:0x0462, B:148:0x0466), top: B:160:0x0058 }] */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0425 A[Catch: Exception -> 0x04ad, TryCatch #0 {Exception -> 0x04ad, blocks: (B:17:0x0058, B:19:0x0061, B:21:0x008c, B:23:0x00bd, B:24:0x00c3, B:26:0x00c9, B:28:0x00d7, B:30:0x00ee, B:33:0x00f7, B:35:0x00fb, B:107:0x0382, B:109:0x03b2, B:111:0x03c0, B:113:0x03d4, B:115:0x03db, B:117:0x03e1, B:132:0x0435, B:134:0x043b, B:118:0x03e7, B:125:0x0406, B:127:0x040c, B:129:0x0410, B:121:0x03fc, B:131:0x0425, B:108:0x03a4, B:36:0x011f, B:38:0x0125, B:40:0x015a, B:42:0x0164, B:45:0x01a1, B:66:0x022a, B:70:0x023c, B:71:0x023f, B:73:0x024e, B:76:0x025a, B:78:0x0260, B:79:0x0268, B:81:0x026e, B:82:0x027e, B:84:0x0287, B:87:0x02bf, B:89:0x02c3, B:91:0x02cb, B:93:0x02f3, B:95:0x0310, B:97:0x032a, B:99:0x0330, B:101:0x0351, B:103:0x0355, B:47:0x01a7, B:49:0x01ad, B:51:0x01ce, B:55:0x01e7, B:57:0x01ef, B:59:0x0207, B:61:0x020b, B:63:0x021b, B:65:0x0227, B:135:0x0448, B:137:0x044d, B:139:0x0453, B:143:0x045c, B:149:0x04a6, B:146:0x0462, B:148:0x0466), top: B:160:0x0058 }] */
        /* JADX WARN: Removed duplicated region for block: B:134:0x043b A[Catch: Exception -> 0x04ad, TryCatch #0 {Exception -> 0x04ad, blocks: (B:17:0x0058, B:19:0x0061, B:21:0x008c, B:23:0x00bd, B:24:0x00c3, B:26:0x00c9, B:28:0x00d7, B:30:0x00ee, B:33:0x00f7, B:35:0x00fb, B:107:0x0382, B:109:0x03b2, B:111:0x03c0, B:113:0x03d4, B:115:0x03db, B:117:0x03e1, B:132:0x0435, B:134:0x043b, B:118:0x03e7, B:125:0x0406, B:127:0x040c, B:129:0x0410, B:121:0x03fc, B:131:0x0425, B:108:0x03a4, B:36:0x011f, B:38:0x0125, B:40:0x015a, B:42:0x0164, B:45:0x01a1, B:66:0x022a, B:70:0x023c, B:71:0x023f, B:73:0x024e, B:76:0x025a, B:78:0x0260, B:79:0x0268, B:81:0x026e, B:82:0x027e, B:84:0x0287, B:87:0x02bf, B:89:0x02c3, B:91:0x02cb, B:93:0x02f3, B:95:0x0310, B:97:0x032a, B:99:0x0330, B:101:0x0351, B:103:0x0355, B:47:0x01a7, B:49:0x01ad, B:51:0x01ce, B:55:0x01e7, B:57:0x01ef, B:59:0x0207, B:61:0x020b, B:63:0x021b, B:65:0x0227, B:135:0x0448, B:137:0x044d, B:139:0x0453, B:143:0x045c, B:149:0x04a6, B:146:0x0462, B:148:0x0466), top: B:160:0x0058 }] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02f2  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            e eVar;
            ArrayList arrayList;
            boolean z2;
            ArrayList arrayList2;
            int i2;
            try {
                boolean zA = CreativeInfoManager.a(this.f61412b, AdNetworkConfiguration.SHOULD_DELAY_BANNER_VIEWS_SCANNER, false);
                boolean z3 = (SafeDK.getInstance() == null || SafeDK.getInstance().z() == null || !SafeDK.getInstance().z().f()) ? false : true;
                if (zA && z3) {
                    Logger.d(BannerFinder.this.f61779a, "web view scanner - fullscreen ad is displaying, postpone scanning. sdk= ", this.f61412b);
                    return;
                }
                String string = this.f61415e.getString("ad_view");
                e eVar2 = BannerFinder.f61366L.get(this.f61414d);
                if (eVar2 != null) {
                    try {
                        if (eVar2.ab) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            if (!BannerFinder.this.a(this.f61412b, this.f61413c, this.f61414d, string, arrayList3, arrayList4, arrayList5).booleanValue()) {
                                Logger.d(BannerFinder.this.f61779a, "web view scanner - wvscanner - cancel task, eventId:", this.f61414d.f62521c, ", scanCounter: ", Integer.valueOf(this.f61416f), ", banner impression not found for adNetworkView: ", string);
                                BannerFinder.this.a(this.f61414d, this.f61418h);
                                return;
                            }
                            Iterator<String> it = arrayList4.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (CreativeInfoManager.f61949d.remove(next)) {
                                    Logger.d(BannerFinder.this.f61779a, "web view scanner - video start received for ", next);
                                    eVar2.i().f62606l = true;
                                    break;
                                }
                            }
                            if (arrayList3.isEmpty() && eVar2.f61818K == null) {
                                this.f61416f++;
                                Logger.d(BannerFinder.this.f61779a, "web view scanner - failed to find view, scan counter: ", Integer.valueOf(this.f61416f), " view address:", eVar2.f61818K);
                                arrayList = arrayList3;
                            } else if (!arrayList3.isEmpty()) {
                                this.f61416f++;
                                Logger.d(BannerFinder.this.f61779a, "web view scanner - found view, scan counter: ", Integer.valueOf(this.f61416f), " view address:", eVar2.f61818K);
                                arrayList = arrayList3;
                                BannerFinder.this.a(this.f61414d, arrayList);
                                WeakReference weakReferenceD = BannerFinder.this.d(arrayList);
                                String strA = com.safedk.android.utils.n.a((Reference<?>) weakReferenceD) ? BrandSafetyUtils.a(weakReferenceD.get()) : null;
                                Logger.d(BannerFinder.this.f61779a, "web view scanner - adInfoKey.webviewAddress: ", this.f61414d.f62525g, ", adInfoKey.isWebviewReplaced: ", Boolean.valueOf(this.f61414d.f62527i));
                                AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(eVar2.f61840v);
                                com.safedk.android.analytics.brandsafety.creatives.b bVarK = CreativeInfoManager.k(this.f61412b);
                                boolean z4 = weakReferenceD.get() instanceof WebView;
                                if ((this.f61414d.f62525g == null || this.f61414d.f62527i) && com.safedk.android.utils.n.a((Reference<?>) weakReferenceD)) {
                                    this.f61414d.f62525g = BrandSafetyUtils.a(weakReferenceD.get());
                                    Logger.d(BannerFinder.this.f61779a, "web view scanner - info: ", eVar2);
                                    if (eVar2.f61818K == null) {
                                        com.safedk.android.analytics.brandsafety.b.a(this.f61414d.f62525g, l.f62657l, new l.a(l.f62631L, strA));
                                        eVar2.f61818K = strA;
                                    }
                                    if (z4 && adNetworkDiscoveryJ != null && bVarK != null && bVarK.b(AdNetworkConfiguration.MATCH_ON_BANNER_WEBVIEW_DETECTION)) {
                                        BrandSafetyUtils.AdType adTypeA = com.safedk.android.analytics.brandsafety.b.a(this.f61412b, (WebView) weakReferenceD.get());
                                        CreativeInfo creativeInfoA = adNetworkDiscoveryJ.a((Object) eVar2.i().f62609o);
                                        if (creativeInfoA != null && adTypeA == BrandSafetyUtils.AdType.BANNER) {
                                            creativeInfoA.a(BrandSafetyEvent.AdFormatType.BANNER);
                                            creativeInfoA.a(BrandSafetyUtils.AdType.BANNER);
                                            if (creativeInfoA.h() != null && creativeInfoA.h().contains(CreativeInfo.f62459w)) {
                                                creativeInfoA.V();
                                            }
                                        }
                                    }
                                }
                                boolean zF = BannerFinder.this.f(this.f61411a, this.f61412b);
                                if (this.f61412b != null && zF) {
                                    if (adNetworkDiscoveryJ != null) {
                                        adNetworkDiscoveryJ.a(eVar2, arrayList4, string);
                                    }
                                    eVar2.a(arrayList4);
                                    List<WeakReference<WebView>> listB = BannerFinder.this.b(arrayList);
                                    if (BannerFinder.this.f61777G != null && BannerFinder.this.f61777G.size() > 0 && listB != null && listB.size() > 0) {
                                        Iterator<u> it2 = BannerFinder.this.f61777G.iterator();
                                        while (it2.hasNext()) {
                                            it2.next().a(listB.get(0));
                                        }
                                    }
                                    eVar2.b(listB);
                                    if (com.safedk.android.utils.n.a((Reference<?>) weakReferenceD)) {
                                        boolean zA2 = CreativeInfoManager.a(this.f61412b, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                                        boolean zH = eVar2.H();
                                        Logger.d(BannerFinder.this.f61779a, "web view scanner - should detect multiple ads by web view change? ", Boolean.valueOf(zA2), ", isNativeAd = ", Boolean.valueOf(zH));
                                        String strA2 = BrandSafetyUtils.a(weakReferenceD.get());
                                        if (!zH && zA2 && eVar2.f61818K != null && !eVar2.f61818K.equals(strA2)) {
                                            Logger.d(BannerFinder.this.f61779a, "web view scanner - webview change starts for maxCreativeId: ", this.f61413c);
                                            com.safedk.android.analytics.brandsafety.b.a(strA2, l.f62657l, new l.a(l.f62631L, strA));
                                            BannerFinder.this.a(eVar2, strA2);
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        Logger.d(BannerFinder.this.f61779a, "web view scanner - setting taskFuture for adInfoKey: ", this.f61414d);
                                        eVar2.af = this.f61418h;
                                        if (com.safedk.android.utils.n.a((Reference<?>) weakReferenceD)) {
                                            BannerFinder.this.a(eVar2, (WeakReference<View>) weakReferenceD);
                                            BannerFinder.this.a(this.f61412b, this.f61413c, this.f61414d, (WeakReference<View>) weakReferenceD);
                                            if (CreativeInfoManager.a(this.f61412b, AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false) && eVar2.j() == null) {
                                                Logger.d(BannerFinder.this.f61779a, "web view scanner - keep scanning until we have a match. scan counter: ", Integer.valueOf(this.f61416f), ", activity banner key: ", this.f61414d);
                                            }
                                        }
                                        if (z2) {
                                            Logger.d(BannerFinder.this.f61779a, "web view scanner - calling reportCompletedBanners");
                                            BannerFinder.this.a(arrayList, arrayList5, this.f61414d, eVar2.aj);
                                        } else {
                                            Logger.d(BannerFinder.this.f61779a, "web view scanner - not calling reportCompletedBanners");
                                        }
                                        if (!BannerFinder.this.a(eVar2, arrayList4, this.f61414d).booleanValue()) {
                                            List list = (List) BannerFinder.f61370Q.get(this.f61414d.f62519a);
                                            String strN = BrandSafetyUtils.n(string);
                                            if (list == null || list.size() != 1 || TextUtils.isEmpty(strN)) {
                                                arrayList2 = arrayList5;
                                                Logger.d(BannerFinder.this.f61779a, "web view scanner - shouldn't be here, adding debug info...");
                                                if (list == null) {
                                                    i2 = 1;
                                                } else if (list.size() == 1) {
                                                    i2 = 0;
                                                } else {
                                                    i2 = 2;
                                                }
                                                if (TextUtils.isEmpty(strN)) {
                                                    i2 += 4;
                                                }
                                                if (i2 > 0) {
                                                    eVar2.d("rpr" + i2);
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                                com.safedk.android.analytics.brandsafety.creatives.g.a(arrayList2, eVar2);
                                            }
                                        } else {
                                            arrayList2 = arrayList5;
                                            Logger.d(BannerFinder.this.f61779a, "web view scanner - matching webview not in current hierarchy - skipping resources propagation");
                                        }
                                        if (arrayList2.size() > 0) {
                                            BannerFinder.this.a(eVar2, (WeakReference<WebView>) arrayList2.get(0), this.f61417g);
                                        }
                                    }
                                } else if (this.f61418h != null) {
                                    Logger.d(BannerFinder.this.f61779a, "web view scanner - cancel task, packageName: ", this.f61412b, ", shouldHandleMaxMsg: ", Boolean.valueOf(zF));
                                    BannerFinder.this.a(this.f61414d, this.f61418h);
                                }
                            } else {
                                arrayList = arrayList3;
                            }
                            z2 = false;
                            if (z2) {
                            }
                            if (!BannerFinder.this.a(eVar2, arrayList4, this.f61414d).booleanValue()) {
                            }
                            if (arrayList2.size() > 0) {
                            }
                        }
                        boolean z5 = this.f61416f >= 5 && a() && b();
                        if ((!eVar2.ab || z5) && this.f61418h != null) {
                            Logger.d(BannerFinder.this.f61779a, "web view scanner - cancel task, is active: ", Boolean.valueOf(eVar2.ab), ", scan counter: ", Integer.valueOf(this.f61416f), ", event ID: ", eVar2.w());
                            BannerFinder.this.a(eVar2, false, "WebviewScannerTask");
                            BannerFinder.this.a(this.f61414d, this.f61418h);
                        }
                        this.f61417g++;
                    } catch (Exception e2) {
                        e = e2;
                        eVar = eVar2;
                        Logger.e(BannerFinder.this.f61779a, "web view scanner - exception", e);
                        if (eVar != null) {
                            eVar.d("wvste=" + e.getMessage());
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                eVar = null;
            }
        }

        private boolean a() {
            List<Integer> listC = com.safedk.android.internal.d.C();
            return listC == null || listC.isEmpty() || this.f61417g >= listC.get(listC.size() - 1).intValue();
        }

        private boolean b() {
            List<Integer> listE = com.safedk.android.internal.d.E();
            return listE == null || listE.isEmpty() || this.f61417g >= listE.get(listE.size() - 1).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, WeakReference<WebView> weakReference, int i2) {
        boolean zContains = com.safedk.android.internal.d.C().contains(Integer.valueOf(i2));
        boolean zContains2 = com.safedk.android.internal.d.E().contains(Integer.valueOf(i2));
        if (zContains || zContains2) {
            Logger.d(this.f61779a, "inject periodic script, cycle: ", Integer.valueOf(i2));
            String str = eVar.f61840v;
            if (CreativeInfoManager.j(str) != null && com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                com.safedk.android.analytics.brandsafety.creatives.b bVarK = CreativeInfoManager.k(str);
                String strA = BrandSafetyUtils.a((Object) weakReference.get());
                if (!(weakReference.get().getVisibility() == 0)) {
                    String str2 = this.f61779a;
                    Object[] objArr = new Object[3];
                    objArr[0] = "webView: ";
                    objArr[1] = weakReference != null ? weakReference.get() : V8ValueNull.NULL;
                    objArr[2] = " is not visible - will not collect resources in this cycle";
                    Logger.d(str2, objArr);
                    return;
                }
                if (zContains && bVarK != null && bVarK.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_BANNERS)) {
                    List<String> listX = eVar.x();
                    if (strA != null && listX != null && !listX.contains(strA)) {
                        listX.add(strA);
                        eVar.a(listX);
                    }
                    SafeDKWebAppInterface.a(str, weakReference.get(), SafeDKWebAppInterface.b(str, strA, eVar.w()));
                }
                if (zContains2 && bVarK != null && bVarK.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES)) {
                    String str3 = "javascript:" + SafeDKWebAppInterface.c(str, strA);
                    if (str3 != null) {
                        SafeDKWebAppInterface.a(str, weakReference.get(), str3);
                    }
                }
            }
        }
    }

    public void a(CreativeInfo creativeInfo) {
        Set<d> setKeySet;
        synchronized (f61366L) {
            setKeySet = f61366L.keySet();
        }
        if (!setKeySet.isEmpty()) {
            for (d dVar : setKeySet) {
                e eVar = f61366L.get(new d(dVar.f62519a, creativeInfo.H(), creativeInfo.n(), creativeInfo.S(), dVar.f62523e, creativeInfo.M()));
                if (eVar != null) {
                    if (eVar.m() != null && eVar.m().f62585b != null) {
                        BrandSafetyUtils.d(eVar.m().f62585b);
                        eVar.i().l();
                    }
                    if (eVar.f61811D == null) {
                        eVar.f61811D = UUID.randomUUID().toString();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, WeakReference<View> weakReference) {
        String strA = BrandSafetyUtils.a(weakReference.get());
        RedirectData redirectData = this.f61778H.get(strA);
        Logger.d(this.f61779a, "web view scanner - check for pending redirect: ", redirectData, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (redirectData != null) {
            redirectData.a("LateMatchedRedirectWebview=" + strA);
            if (redirectData.f61737t == null) {
                redirectData.f61737t = BrandSafetyUtils.a(this.f61781c);
            }
            if (redirectData.f61727j) {
                eVar.f61828V = true;
            }
            k kVarI = eVar.i();
            if (kVarI != null) {
                kVarI.a(redirectData);
                this.f61778H.remove(strA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, String str) {
        Logger.d(this.f61779a, "handle web view change - web view change detected from: ", eVar.f61818K, ", to: ", str, HFAkacKHsU.oIRTsXHoUIJ, Boolean.valueOf(com.safedk.android.utils.n.c()));
        k kVarI = eVar.i();
        if (kVarI != null && kVarI.j() != null && !kVarI.j().an()) {
            kVarI.j().ao();
            String strH = kVarI.j().h();
            if (strH != null) {
                kVarI.j().e(strH + CreativeInfo.aK);
            }
        }
        eVar.f61818K = str;
        eVar.g().add(new k(UUID.randomUUID().toString(), str));
        if (eVar.f61811D == null) {
            eVar.f61811D = UUID.randomUUID().toString();
        }
        eVar.ad = false;
    }

    private void a(String str, String str2, d dVar, Bundle bundle) {
        if (this.f61374T.contains(dVar)) {
            Logger.d(this.f61779a, "webview scanner already created for: ", dVar.f62521c);
            return;
        }
        Logger.d(this.f61779a, "creating webview scanner task for: ", dVar);
        synchronized (this.f61374T) {
            this.f61374T.add(dVar);
        }
        b bVar = new b(str, str2, dVar, bundle);
        bVar.f61418h = this.f61776E.scheduleWithFixedDelay(bVar, 0L, 1000L, TimeUnit.MILLISECONDS);
        Logger.d(this.f61779a, "wvscanner - create task, eventId:", dVar.f62521c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, ScheduledFuture<?> scheduledFuture) {
        synchronized (this.f61374T) {
            this.f61374T.remove(dVar);
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        Logger.d(this.f61779a, "wvscanner - cancel task, eventId:", dVar.f62521c, ", taskFuture: ", scheduledFuture);
    }

    private void a(String str, String str2, String str3, d dVar, Bundle bundle, long j2) {
        f61372S.put(dVar.f62519a, dVar);
        this.f61375U.add(dVar.f62521c);
        Logger.d(this.f61779a, "handle WILL_DISPLAY - eventIds added ", dVar.f62521c);
        if (this.f61373O.contains(dVar.f62521c)) {
            Logger.d(this.f61779a, "handle WILL_DISPLAY - impression with id ", dVar.f62521c, " has already been reported, ignoring. ");
            return;
        }
        Activity activityA = a(bundle);
        Logger.d(this.f61779a, "handle WILL_DISPLAY - adActivity = ", activityA);
        Logger.d(this.f61779a, "handle WILL_DISPLAY - image count for ", this.f61781c.name(), " is ", Integer.valueOf(BrandSafetyUtils.b(this.f61781c)), ", # impressions to report: ", Integer.valueOf(this.f61774C.keySet().size()));
        if (!f(str, str2)) {
            this.f61782d++;
        } else {
            e eVarA = f61366L.get(dVar);
            if (eVarA == null) {
                eVarA = a(activityA, str2, dVar.f62521c, bundle);
                synchronized (f61366L) {
                    f61366L.put(dVar, eVarA);
                }
                Logger.d(this.f61779a, "handle WILL_DISPLAY New activity banner created for ", str2, ", banner key is ", dVar, ", current activity banners size is ", Integer.valueOf(f61366L.size()));
            } else {
                if (eVarA.f61808A == null) {
                    eVarA.f61808A = bundle;
                }
                if (eVarA.f61809B == null || eVarA.f61810C == null) {
                    eVarA.a(a(activityA));
                }
            }
            eVarA.ab = true;
            eVarA.ah = true;
            eVarA.aj = j2;
            a(eVarA, false, "handleWillDisplay");
        }
        a(str2, str3, dVar, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, List<WeakReference<View>> list) {
        Logger.d(this.f61779a, "save screenshot view for ", dVar.f62522d);
        AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(dVar.f62522d);
        if (adNetworkDiscoveryJ != null) {
            adNetworkDiscoveryJ.a(dVar, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WeakReference<View> d(List<WeakReference<View>> list) {
        WeakReference<View> weakReference = null;
        for (WeakReference<View> weakReference2 : list) {
            Logger.d(this.f61779a, "select monitor view: iterating view is ", weakReference2.get());
            if (weakReference == null) {
                Logger.d(this.f61779a, "select monitor view: setting view ", weakReference2.get());
            } else if (weakReference2.get() instanceof WebView) {
                Logger.d(this.f61779a, "select monitor view: re-setting view ", weakReference2.get());
                weakReference.clear();
            } else {
                Logger.d(this.f61779a, "select monitor view: clearing view ", weakReference2.get());
                weakReference2.clear();
            }
            weakReference = weakReference2;
        }
        return weakReference;
    }

    private void a(String str, d dVar, String str2, Bundle bundle, long j2) {
        e eVarA;
        this.f61375U.add(dVar.f62521c);
        Logger.d(this.f61779a, "handle DID_DISPLAY - eventIds added ", dVar.f62521c);
        if (this.f61373O.contains(dVar.f62521c)) {
            Logger.d(this.f61779a, "handle DID_DISPLAY - impression with id ", dVar.f62521c, " has already been reported, ignoring. ");
            return;
        }
        Logger.d(this.f61779a, "handle DID_DISPLAY package=", str, " banner key=", dVar);
        Activity activityA = a(bundle);
        synchronized (f61366L) {
            eVarA = f61366L.get(dVar);
            if (eVarA != null) {
                Logger.d(this.f61779a, "Banner info already exists, package=", str, " activity banner=", eVarA);
                eVarA.f61844z = this.f61782d;
                if (eVarA.f61809B == null || eVarA.f61810C == null) {
                    eVarA.a(a(activityA));
                }
            } else {
                b(dVar);
                eVarA = a(activityA, str, dVar.f62521c, bundle);
                f61366L.put(dVar, eVarA);
                Logger.d(this.f61779a, "New activity banner created for ", str, ", banner key is ", dVar, ", current activity banners size is ", Integer.valueOf(f61366L.size()));
            }
        }
        eVarA.f61820M = str2;
        eVarA.f62533ak = j2;
        a(eVarA, false, "handleDidDisplay");
        a(str, str2, dVar, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, d dVar, WeakReference<View> weakReference) {
        Logger.d(this.f61779a, "monitor impression started for ", str, ", adInfoKey = ", dVar, ", creativeId = ", str2, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
            e eVar = f61366L.get(dVar);
            if (eVar != null) {
                a(str, dVar);
                eVar.f61820M = str2;
                eVar.ai = true;
                eVar.al = 0.0f;
                if (weakReference.get().getWidth() > 0 && weakReference.get().getHeight() > 0) {
                    eVar.al = weakReference.get().getWidth() / weakReference.get().getHeight();
                }
                a(weakReference, eVar, dVar);
                return;
            }
            Logger.d(this.f61779a, "monitor impression, banner info is null for ", str, ", adInfoKey = ", dVar);
            return;
        }
        Logger.d(this.f61779a, "monitor impression, view is null for ", str, ", adInfoKey = ", dVar);
    }

    private void a(WeakReference<View> weakReference, e eVar, d dVar) {
        if (eVar.an != null) {
            Logger.d(this.f61779a, "set impression handler task if needed - already exist for event id: ", dVar.f62521c, ", exiting");
            return;
        }
        eVar.an = new a(eVar, weakReference, this.f61783e, dVar);
        eVar.av = dVar;
        CreativeInfo creativeInfoJ = eVar.j();
        if (creativeInfoJ != null && creativeInfoJ.v() && n(eVar.c())) {
            Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "set impression handler task if needed : task set but not started since the ad is a video ad and the video hasn't finished yet. ", eVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            return;
        }
        int iZ = SafeDK.getInstance().Z() * 1000;
        Logger.d(this.f61779a, "start taking screenshots for view: ", weakReference.get().toString(), ", sampling interval = ", Integer.valueOf(iZ), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        eVar.an.f61400d = this.f61776E.scheduleWithFixedDelay(eVar.an, 500L, iZ, TimeUnit.MILLISECONDS);
        Logger.d(this.f61779a, "set impression handler task if needed : task created and started : ", eVar);
    }

    protected boolean n(String str) {
        return false;
    }

    private boolean s(String str) {
        Set<d> setKeySet;
        synchronized (f61366L) {
            setKeySet = f61366L.keySet();
        }
        if (!setKeySet.isEmpty()) {
            Iterator<d> it = setKeySet.iterator();
            while (it.hasNext()) {
                e eVar = f61366L.get(it.next());
                if (eVar != null && eVar.f61831m != null && eVar.f61831m.contains(str) && eVar.j() != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void o(String str) {
        Set<d> setKeySet;
        synchronized (f61366L) {
            setKeySet = f61366L.keySet();
        }
        if (!setKeySet.isEmpty()) {
            Iterator<d> it = setKeySet.iterator();
            while (it.hasNext()) {
                e eVar = f61366L.get(it.next());
                if (eVar != null && eVar.f61818K != null && eVar.f61818K.equals(str) && eVar.j() == null) {
                    Logger.d(this.f61779a, YjqZUJsVmhcjko.exGFcacU, eVar);
                    eVar.f61818K = null;
                    eVar.ai = false;
                }
            }
        }
    }

    private void b(d dVar) {
        synchronized (f61366L) {
            Iterator<Map.Entry<d, e>> it = f61366L.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<d, e> next = it.next();
                d key = next.getKey();
                e value = next.getValue();
                if (key.f62519a.equals(dVar.f62519a) && key.f62520b.equals(dVar.f62520b) && !key.f62521c.equals(dVar.f62521c) && !value.ah) {
                    Logger.d(this.f61779a, "report undetected banner started for AdInfoKey=", key);
                    a(value, true, "reportUndetectedBannerIfNeeded");
                    it.remove();
                    a(value);
                }
            }
        }
    }

    protected boolean f(String str, String str2) {
        boolean zA = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, false);
        String strA = CreativeInfoManager.a(str2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        Logger.d(this.f61779a, "sdk ", str2, ": config item SUPPORTS_BANNER_IMPRESSION_TRACKING is ", Boolean.valueOf(zA), ", config item AD_NETWORK_TO_IGNORE is ", strA);
        if (zA && !str.equals(strA)) {
            return true;
        }
        Logger.d(this.f61779a, "Banners tracking is not supported for this ad network (", str, ")");
        return false;
    }

    private e a(Activity activity, String str, String str2, Bundle bundle) {
        String lowerCase = BrandSafetyUtils.c().name().toLowerCase();
        this.f61782d++;
        Logger.d(this.f61779a, "slot number incremented to ", Integer.valueOf(this.f61782d), ", eventId is ", str2, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        return a(activity, str, this.f61782d, lowerCase, bundle, str2);
    }

    private void a(String str, d dVar) {
        ArrayList<o> arrayList;
        Logger.d(this.f61779a, "pending ci check started, sdkPackageName = ", str, ", adInfoKey = ", dVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (dVar == null) {
            Logger.d(this.f61779a, "pending ci check - no activity key");
            return;
        }
        e eVar = f61366L.get(dVar);
        if (eVar == null) {
            Logger.d(this.f61779a, "pending ci check - no banner info");
            return;
        }
        CreativeInfo creativeInfoJ = eVar.j();
        if (creativeInfoJ != null && !creativeInfoJ.an()) {
            Logger.d(this.f61779a, "pending ci check - CI already exist");
            return;
        }
        AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
        if (adNetworkDiscoveryJ == null) {
            Logger.d(this.f61779a, "pending ci check - no ad discovery found, exit. activity key : ", dVar);
            return;
        }
        if (dVar.f62521c != null) {
            Logger.d(this.f61779a, "pending ci check - activity key : ", dVar);
            if (!CreativeInfoManager.a(str, AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false)) {
                CreativeInfo creativeInfoA = adNetworkDiscoveryJ.a((Object) (dVar.f62520b + "_" + dVar.f62521c + "_" + str));
                if (creativeInfoA != null) {
                    Logger.d(this.f61779a, "pending ci check - discovery class returned a ci: ", creativeInfoA.ac());
                    if (creativeInfoA.K() == null) {
                        BrandSafetyEvent.AdFormatType adFormatTypeA = BrandSafetyUtils.a(eVar.f61808A);
                        Logger.d(this.f61779a, "pending ci check - set ad format: ", adFormatTypeA);
                        creativeInfoA.a(adFormatTypeA);
                    }
                    if (creativeInfoA.n() == null) {
                        creativeInfoA.h(dVar.f62521c);
                    }
                    Logger.d(this.f61779a, "pending ci check - CI event ID set");
                }
            }
        }
        List<o> list = f61367M.get(str);
        if (list != null) {
            Logger.d(this.f61779a, "pending ci check - sdk: ", str, ", no. of pending candidates: ", Integer.valueOf(list.size()));
            synchronized (list) {
                arrayList = new ArrayList(list);
            }
            for (o oVar : arrayList) {
                Logger.d(this.f61779a, "pending ci check - pending candidate: ", oVar);
                CreativeInfo creativeInfo = oVar.f62690a;
                if (a(creativeInfo, eVar)) {
                    Logger.d(this.f61779a, Logger.FeatureTag.CI_MATCHING, "pending ci check - creative info found by WebView/eventID, CI: ", creativeInfo);
                    List<CreativeInfo> listU = adNetworkDiscoveryJ.u(creativeInfo.N());
                    String str2 = this.f61779a;
                    Object[] objArr = new Object[2];
                    objArr[0] = "pending ci check - number of multi ad creative infos: ";
                    objArr[1] = Integer.valueOf(listU != null ? listU.size() : 0);
                    Logger.d(str2, objArr);
                    if (listU == null) {
                        listU = new ArrayList<>();
                        listU.add(creativeInfo);
                    }
                    boolean zA = false;
                    for (CreativeInfo creativeInfo2 : listU) {
                        b(creativeInfo2, eVar);
                        if (creativeInfo2.n() == null) {
                            creativeInfo2.h(dVar.f62521c);
                            creativeInfo2.h(true);
                        }
                        zA = a(dVar.f62519a, dVar.f62523e, new o(creativeInfo2, oVar.f62691b, oVar.f62692c, oVar.f62693d));
                        if (!zA) {
                            break;
                        }
                    }
                    if (zA) {
                        synchronized (list) {
                            list.remove(oVar);
                        }
                        eVar.d("pcim|ts=" + System.currentTimeMillis() + "|ls=" + list.size() + ";" + oVar.f62691b + "|o=" + oVar.f62690a.aj() + ";" + oVar.f62690a.ak());
                        return;
                    }
                    if (creativeInfo.D()) {
                        Logger.d(this.f61779a, "pending ci check - unreal match and event id set happened, setting ci event id back to null");
                        creativeInfo.h((String) null);
                        creativeInfo.h(false);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        Logger.d(this.f61779a, "pending ci check - there are no pending candidates");
    }

    private void c(d dVar) {
        e eVar = f61366L.get(dVar);
        if (eVar != null) {
            Logger.d(this.f61779a, "handle DID_HIDE, placementId=", dVar.f62520b);
            eVar.ad = true;
        }
    }

    private void d(d dVar) {
        e eVar = f61366L.get(dVar);
        if (eVar == null) {
            Logger.d(this.f61779a, "handle DID_CLICKED current activity banner is null");
            return;
        }
        if (eVar.f61811D != null && CreativeInfoManager.a(eVar.c(), AdNetworkConfiguration.SHOULD_IGNORE_BANNER_MULTI_AD_DID_CLICK_EVENT, false)) {
            Logger.d(this.f61779a, "handle DID_CLICKED current activity banner multi ad");
            return;
        }
        eVar.a(true);
        if (eVar.e() != null) {
            Logger.d(this.f61779a, "handle DID_CLICKED current activity banner already have click url");
        } else {
            h hVar = f61369P;
            if (hVar == null) {
                Logger.d(this.f61779a, "handle DID_CLICKED current click url candidate is null");
            } else if (hVar.f62543a == 0) {
                Logger.d(this.f61779a, "handle DID_CLICKED current click url candidate has zero timestamp");
            } else if (!a(eVar, f61369P.f62544b, f61369P.f62545c)) {
                Logger.d(this.f61779a, "handle DID_CLICKED ad click url is not valid");
            } else if (System.currentTimeMillis() - f61369P.f62543a >= 5000) {
                Logger.d(this.f61779a, "handle DID_CLICKED click url candidate's timestamp is not within the time range");
            } else {
                Logger.d(this.f61779a, "handle DID_CLICKED setting click URL to ", f61369P.f62544b);
                eVar.c(f61369P.f62544b);
                f61369P = null;
            }
        }
        a(eVar, false, "handleDidClicked");
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f61283a;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str) {
        synchronized (f61366L) {
            Iterator<e> it = f61366L.values().iterator();
            while (it.hasNext()) {
                it.next().ad = true;
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, x xVar) {
        c cVarB = b(str, xVar);
        if (!(cVarB instanceof e)) {
            return false;
        }
        a((e) cVarB, false, "handleWebsiteOpened");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        List<CreativeInfo> listL;
        Logger.d(this.f61779a, "getCreativeInfoByWebViewAddress started webViewAddress: ", str2, ", sdkPackageName: ", str);
        synchronized (f61366L) {
            for (e eVar : f61366L.values()) {
                if (eVar.f61831m != null && eVar.f61831m.contains(str2) && eVar.ab && !eVar.f61827U) {
                    List<CreativeInfo> listL2 = null;
                    if (eVar.f61840v != null && eVar.f61840v.equals(str)) {
                        listL = eVar.l();
                    } else {
                        Logger.d(this.f61779a, "getCreativeInfoByWebViewAddress checking scar-admob, #cis : ", Integer.valueOf(eVar.k().size()));
                        for (CreativeInfo creativeInfo : eVar.k()) {
                            Logger.d(this.f61779a, "getCreativeInfoByWebViewAddress found cis by actual sdk. sdkPackageName : ", str, ", webViewAddress : ", str2, ", creativeInfo = ", creativeInfo);
                            if (creativeInfo.T() != null && creativeInfo.T().equals(str)) {
                                listL2 = eVar.l();
                                Logger.d(this.f61779a, "getCreativeInfoByWebViewAddress found cis by actual sdk. webViewAddress : ", str2, ", found ", Integer.valueOf(listL2.size()));
                            }
                        }
                        listL = listL2;
                    }
                    return listL;
                }
            }
            List<o> list = f61367M.get(str);
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                synchronized (list) {
                    for (o oVar : list) {
                        if (oVar.f62690a != null && oVar.f62690a.ak() != null && oVar.f62690a.ak().equals(str2)) {
                            arrayList.add(oVar.f62690a);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Logger.d(this.f61779a, "get current CIs for webview address: ", str2, ", found ", Integer.valueOf(arrayList.size()), " pending CIs");
            }
            return arrayList;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str) {
        List<CreativeInfo> listL;
        Logger.d(this.f61779a, "getCreativeInfoByWebViewAddress started, sdkPackageName: ", str);
        synchronized (f61366L) {
            listL = null;
            for (e eVar : f61366L.values()) {
                if (eVar.f61831m != null && eVar.f61840v != null && eVar.c().equals(str) && eVar.ab && !eVar.f61827U) {
                    listL = eVar.l();
                    if (!listL.isEmpty()) {
                        Logger.d(this.f61779a, "get CreativeInfo By Sdk Package Name returned ", listL);
                    } else {
                        Logger.d(this.f61779a, "get CreativeInfo By Sdk Package Name no ci found ");
                    }
                }
            }
        }
        return listL;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str, String str2) {
        List<CreativeInfo> listK;
        synchronized (f61366L) {
            for (e eVar : f61366L.values()) {
                if (eVar != null && (listK = eVar.k()) != null && !listK.isEmpty() && listK.get(0) != null && listK.get(0).N().equals(str2)) {
                    return listK;
                }
            }
            List<o> list = f61367M.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                synchronized (list) {
                    for (o oVar : list) {
                        if (oVar.f62690a != null && oVar.f62690a.N().equals(str2)) {
                            arrayList.add(oVar.f62690a);
                        }
                    }
                }
                return arrayList;
            }
            return new ArrayList();
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    public c l(String str) {
        Set<d> setKeySet;
        synchronized (f61366L) {
            setKeySet = f61366L.keySet();
        }
        if (!setKeySet.isEmpty()) {
            Iterator<d> it = setKeySet.iterator();
            while (it.hasNext()) {
                e eVar = f61366L.get(it.next());
                if (eVar != null && eVar.f61819L != null && eVar.f61819L.equals(str)) {
                    return eVar;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public c c(String str) {
        synchronized (f61366L) {
            for (e eVar : f61366L.values()) {
                if (eVar.f61831m != null && eVar.f61831m.contains(str) && eVar.ab && !eVar.f61827U) {
                    return eVar;
                }
            }
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public c d(String str) {
        synchronized (f61366L) {
            for (e eVar : f61366L.values()) {
                if (eVar.f62534ao != null && eVar.f62534ao.equals(str) && eVar.ab && !eVar.f61827U) {
                    return eVar;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar) {
        try {
            Logger.d(this.f61779a, "clean started, currentActivityBanners size is ", Integer.valueOf(f61366L.size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (eVar != null) {
                Logger.d(this.f61779a, "clean, adding to reported impressions map. id =  ", eVar.f61819L);
                synchronized (this.f61373O) {
                    this.f61373O.add(eVar.f61819L);
                }
                eVar.ad = true;
                if (eVar.af != null) {
                    Logger.d(this.f61779a, QTafcm.OWKWxhU, eVar.f61819L);
                    if (eVar.af != null) {
                        eVar.af.cancel(false);
                    }
                }
                for (k kVar : eVar.g()) {
                    if (kVar.f62597c != null && kVar.f62597c.f62585b != null) {
                        kVar.f62598d = kVar.f62597c.f62585b;
                        Logger.d(this.f61779a, "clean, set last impression screenshot filename to ", kVar.f62597c.f62585b);
                    }
                    String strB = kVar.b();
                    com.safedk.android.analytics.brandsafety.creatives.g.a(eVar.f61840v, strB, kVar);
                    SafeDKWebAppInterface.a(strB);
                }
                if (eVar.k().isEmpty()) {
                    com.safedk.android.analytics.brandsafety.creatives.g.b(eVar.f61832n);
                    SafeDKWebAppInterface.a(eVar.f61818K);
                } else {
                    for (CreativeInfo creativeInfo : eVar.k()) {
                        if (creativeInfo != null) {
                            com.safedk.android.analytics.brandsafety.creatives.g.b(eVar.f61832n);
                            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(creativeInfo.S());
                            if (adNetworkDiscoveryJ != null) {
                                adNetworkDiscoveryJ.o(creativeInfo.N());
                            }
                            if (creativeInfo.Z() != null) {
                                Logger.d(this.f61779a, "clean and report - resetting CI matching method for ci ", creativeInfo);
                                creativeInfo.W();
                            }
                        }
                    }
                }
                b(eVar);
            }
        } catch (Throwable th) {
            Logger.e(this.f61779a, "Error in clean ", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, boolean z2, String str) {
        long j2;
        ArrayList arrayList;
        String str2;
        if (eVar == null) {
            Logger.d(this.f61779a, "reporting event - info is null, cannot report brand safety event");
            return;
        }
        boolean z3 = !eVar.f61812E;
        int i2 = 8;
        Logger.d(this.f61779a, "reporting event started, root=", str, ", info.isClickReported=", Boolean.valueOf(eVar.f61813F), ", info.isClicked()=", Boolean.valueOf(eVar.d()), ", shouldReportImpression=", Boolean.valueOf(z3), ", eventId=", eVar.f61819L, ", isMature=", Boolean.valueOf(z2), ", isOnUiThread=", Boolean.valueOf(com.safedk.android.utils.n.c()));
        boolean z4 = !eVar.f61813F && eVar.d();
        if (eVar.aj > 0 && eVar.f62533ak > 0) {
            j2 = eVar.aj - eVar.f62533ak;
        } else {
            j2 = Long.MAX_VALUE;
        }
        ArrayList arrayList2 = new ArrayList();
        if (eVar != null && eVar.k().isEmpty() && eVar.i() != null) {
            Logger.d(this.f61779a, "reporting event, root=", str, ", isMature=", Boolean.valueOf(z2), ", info=", eVar);
            arrayList2.add(a(eVar, eVar.i(), z2, eVar.f61813F || z4, j2, (String) null));
            arrayList = arrayList2;
        } else {
            for (k kVar : eVar.g()) {
                if (kVar.j() != null && !kVar.j().an() && kVar.j().Z() == null) {
                    Logger.d(this.f61779a, "reporting event - don't report CI as it was matched only by eventId and not by webview resources");
                    kVar.a((CreativeInfo) null);
                }
                if (z2 && kVar.f62597c != null && kVar.f62597c.f62584a != null) {
                    String str3 = kVar.f62597c.f62584a + "_" + kVar.f62596a;
                    Logger.d(this.f61779a, "reporting event - imageFileIsValid filename = ", BrandSafetyUtils.a(eVar.f61834p, kVar.f62597c.f62584a, eVar.c(), kVar.f62596a, kVar.f62597c.f62589f));
                    str2 = str3;
                } else {
                    str2 = null;
                }
                float fA2 = kVar.f62597c != null ? kVar.f62597c.a(500) : 0.0f;
                String str4 = this.f61779a;
                Object[] objArr = new Object[i2];
                objArr[0] = "reporting event, root=";
                objArr[1] = str;
                objArr[2] = ", isMature=";
                objArr[3] = Boolean.valueOf(z2);
                objArr[4] = ", info=";
                objArr[5] = eVar;
                objArr[6] = ", uniformity=";
                objArr[7] = Float.valueOf(fA2);
                Logger.d(str4, objArr);
                if (z2) {
                    com.safedk.android.analytics.brandsafety.creatives.g.a(eVar.f61840v, eVar.j().ak(), eVar.i());
                }
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(a(eVar, kVar, z2, eVar.f61813F || z4, j2, str2));
                if (z2 && kVar.j() != null && kVar.f62597c != null) {
                    if (this.f61774C.size() <= SafeDK.getInstance().J()) {
                        Logger.d(this.f61779a, "reporting event waiting to report file ", kVar.f62597c.f62585b);
                        a(eVar, kVar);
                    } else {
                        Logger.d(this.f61779a, "reporting event no open slot for ", this.f61781c, ", ", kVar.f62597c.f62584a);
                        BrandSafetyUtils.d(kVar.f62597c.f62585b);
                    }
                    kVar.i();
                }
                arrayList2 = arrayList3;
                i2 = 8;
            }
            arrayList = arrayList2;
        }
        if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
        } else {
            Logger.d(this.f61779a, "reporting event - stats collector instance is null, cannot report brand safety event");
        }
        if (z3) {
            eVar.c(true);
        }
        if (z4) {
            eVar.d(true);
            Logger.d(this.f61779a, "reporting event - setIsClickReported set to true");
        }
    }

    private static BrandSafetyEvent a(e eVar, k kVar, boolean z2, boolean z3, long j2, String str) {
        return new BrandSafetyEvent(eVar.c(), eVar.q(), str, z3, eVar.d() ? eVar.e() : null, kVar.j(), eVar.a(), eVar.p(), kVar.f62596a != null ? kVar.f62596a : "", eVar.f61811D, z2, eVar.r(), kVar.f62597c != null ? kVar.f62597c.f62589f : null, kVar.f62597c != null ? kVar.f62597c.f62586c : 0L, kVar.f62597c != null ? kVar.f62597c.a(500) : 0.0f, kVar.f62597c != null ? kVar.f62597c.f62588e : 0, eVar.ah, eVar.ai, j2, eVar.al, eVar.am, eVar.f61826T, SafeDK.getInstance().e(), eVar.w(), eVar.f61820M, eVar.f61821N, eVar.f61823P, eVar.f61824Q, b(eVar, kVar).toString(), kVar.f62599e, kVar.f62600f, kVar.f62601g, kVar.f62607m, kVar.f62608n, kVar.f62609o, kVar.f62610p, kVar.f62611q, kVar.f62618x, kVar.f62612r);
    }

    protected void a(CreativeInfo creativeInfo, o oVar) {
        String strS = creativeInfo.S();
        Logger.d(this.f61779a, Logger.FeatureTag.CI_MATCHING, "set CI details - adding as pending, sdk: ", strS, " matching info: ", oVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        List<o> arrayList = f61367M.get(strS);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            synchronized (f61367M) {
                f61367M.put(strS, arrayList);
            }
        }
        if (!CreativeInfoManager.a(strS, AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, false)) {
            for (o oVar2 : arrayList) {
                if (oVar2.f62690a != null && oVar2.f62690a.equals(creativeInfo)) {
                    Logger.d(this.f61779a, "set CI details - CI already exists in pending list, sdk: ", strS, " matching info: ", oVar);
                    return;
                }
            }
            arrayList.add(oVar);
            creativeInfo.u("apci|ts=" + System.currentTimeMillis() + ";" + oVar.f62691b + "|o=" + oVar.f62690a.aj() + ";" + oVar.f62690a.ak());
            return;
        }
        Logger.d(this.f61779a, "set CI details - NOT adding as pending (config based), sdk: ", strS, " matching info: ", oVar);
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(o oVar) {
        Set<d> setKeySet;
        try {
            Logger.printFullVerboseLog(this.f61779a, "set CI details started. matchingInfo = ", oVar.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            CreativeInfo creativeInfo = oVar.f62690a;
            if (creativeInfo != null) {
                Logger.d(this.f61779a, "set CI details - CI exists in matchingInfo, sdk = ", creativeInfo.S());
                creativeInfo.i(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
                synchronized (f61366L) {
                    setKeySet = f61366L.keySet();
                    Logger.d(this.f61779a, "set CI details - starting to iterate over current activity banners: ", f61366L.keySet());
                }
                if (!setKeySet.isEmpty()) {
                    for (d dVar : setKeySet) {
                        e eVar = f61366L.get(dVar);
                        if (a(creativeInfo, eVar)) {
                            Logger.d(this.f61779a, "set CI details - matched by webView/eventID, CI: ", creativeInfo);
                            if (creativeInfo.n() == null) {
                                Logger.d(this.f61779a, "set CI details - updated creative info eventId to ", dVar.f62521c, ", banner key = ", dVar);
                                creativeInfo.h(dVar.f62521c);
                                creativeInfo.h(true);
                            }
                            if (creativeInfo.K() == null) {
                                BrandSafetyEvent.AdFormatType adFormatTypeA = BrandSafetyUtils.a(eVar.f61808A);
                                Logger.d(this.f61779a, "set CI details - set ad format: ", adFormatTypeA);
                                creativeInfo.a(adFormatTypeA);
                            }
                            if (CreativeInfoManager.a(creativeInfo.S(), AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false)) {
                                Logger.d(this.f61779a, "set CI details - SDK_USES_PLACEMENT_ID_ARRAY config item is true");
                                if (!creativeInfo.H().equals(dVar.f62520b)) {
                                    Logger.d(this.f61779a, "set CI details - updated creative info placementId to ", dVar.f62520b, ", banner key = ", dVar);
                                    creativeInfo.j(dVar.f62520b);
                                }
                            }
                            if (a(dVar.f62519a, dVar.f62523e, oVar)) {
                                return true;
                            }
                            if (creativeInfo.D()) {
                                Logger.d(this.f61779a, "set CI details - unreal match and event id set happened, setting ci event id back to null");
                                creativeInfo.h(false);
                                creativeInfo.h((String) null);
                            }
                        }
                    }
                }
                a(creativeInfo, oVar);
                return true;
            }
        } catch (Throwable th) {
            Logger.e(this.f61779a, "set CI details exception: ", th.getMessage(), th);
        }
        return false;
    }

    public void a(o oVar, d dVar) {
        try {
            Logger.printFullVerboseLog(this.f61779a, "set CI details started. matchingInfo = ", oVar.toString(), ", bannerKey = ", dVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            CreativeInfo creativeInfo = oVar.f62690a;
            if (creativeInfo != null) {
                Logger.d(this.f61779a, "set CI details - CI exists in matchingInfo, sdk = ", creativeInfo.S());
                creativeInfo.i(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
                e eVar = f61366L.get(dVar);
                if (a(creativeInfo, eVar)) {
                    Logger.d(this.f61779a, "set CI details - matched by webView/eventID, CI: ", creativeInfo);
                    if (creativeInfo.n() == null) {
                        Logger.d(this.f61779a, "set CI details - updated creative info eventId to ", dVar.f62521c, ", banner key = ", dVar);
                        creativeInfo.h(dVar.f62521c);
                        creativeInfo.h(true);
                    }
                    if (creativeInfo.K() == null) {
                        BrandSafetyEvent.AdFormatType adFormatTypeA = BrandSafetyUtils.a(eVar.f61808A);
                        Logger.d(this.f61779a, "set CI details - set ad format: ", adFormatTypeA);
                        creativeInfo.a(adFormatTypeA);
                    }
                    if (CreativeInfoManager.a(creativeInfo.S(), AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false)) {
                        Logger.d(this.f61779a, "set CI details - SDK_USES_PLACEMENT_ID_ARRAY config item is true");
                        if (!creativeInfo.H().equals(dVar.f62520b)) {
                            Logger.d(this.f61779a, "set CI details - updated creative info placementId to ", dVar.f62520b, ", banner key = ", dVar);
                            creativeInfo.j(dVar.f62520b);
                        }
                    }
                    if (a(dVar.f62519a, dVar.f62523e, oVar)) {
                        return;
                    }
                    if (creativeInfo.D()) {
                        Logger.d(this.f61779a, "set CI details - unreal match and event id set happened, setting ci event id back to null");
                        creativeInfo.h(false);
                        creativeInfo.h((String) null);
                    }
                }
                a(creativeInfo, oVar);
            }
        } catch (Throwable th) {
            Logger.e(this.f61779a, "set CI details exception: ", th.getMessage(), th);
        }
    }

    private boolean a(CreativeInfo creativeInfo, e eVar) {
        if (eVar == null) {
            Logger.d(this.f61779a, "verify matching - banner info is null");
            return false;
        }
        if (eVar.f61840v == null) {
            Logger.d(this.f61779a, "verify matching - banner info maxSdk is null");
            return false;
        }
        if (creativeInfo == null) {
            Logger.d(this.f61779a, "verify matching - creative info is null");
            return false;
        }
        String strS = creativeInfo.S();
        if (!eVar.f61840v.equals(strS)) {
            Logger.d(this.f61779a, "verify matching  - sdks does not match, ci sdk is: ", strS, " and banner sdk is: ", eVar.f61840v);
            return false;
        }
        Logger.d(this.f61779a, "verify matching - ci sdk is: ", strS, ", banner info: ", eVar);
        if (eVar.f61819L != null && creativeInfo.n() != null && !eVar.f61819L.equals(creativeInfo.n())) {
            Logger.d(this.f61779a, "verify matching - incompatible event ID, ci: ", creativeInfo.n(), ", info: ", eVar.f61819L);
            if (!CreativeInfoManager.a(eVar.f61840v, AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, false)) {
                return false;
            }
            creativeInfo.u("CiMatchingWithIncompatibleEventId=" + creativeInfo.n());
        }
        return a(creativeInfo.aj(), creativeInfo.ak(), eVar);
    }

    private boolean a(String str, String str2, e eVar) {
        if (str2 == null || MediaPlayer.class.getCanonicalName().equals(str)) {
            Logger.d(this.f61779a, Logger.FeatureTag.CI_MATCHING, "verify matching object skipped, event ID: ", eVar.f61819L, ", object address: ", str2, ", object type: ", str);
            return true;
        }
        if (eVar.x() != null && eVar.x().contains(str2)) {
            Logger.d(this.f61779a, Logger.FeatureTag.CI_MATCHING, "verify matching object done, event ID: ", eVar.f61819L, ", object address: ", str2, ", views hierarchy: ", eVar.x());
            return true;
        }
        AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(eVar.f61840v);
        if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.a(str2, eVar)) {
            Logger.d(this.f61779a, Logger.FeatureTag.CI_MATCHING, "verify matching object done, multiple webviews detected for banner. event ID: ", eVar.f61819L, ", object address: ", str2, ", views hierarchy: ", eVar.x());
            return true;
        }
        Logger.d(this.f61779a, Logger.FeatureTag.CI_MATCHING, "verify matching object failed, event ID: ", eVar.f61819L, ", object address: ", str2, ", views hierarchy: ", eVar.x());
        return false;
    }

    private boolean a(String str, String str2, o oVar) {
        String strJ;
        e eVar;
        Logger.printFullVerboseLog(this.f61779a, Logger.FeatureTag.CI_MATCHING, "set CI started, adUnitId=", str, " matchingInfo=", oVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (oVar == null) {
            Logger.d(this.f61779a, "set CI - no matching info");
            return false;
        }
        CreativeInfo creativeInfo = oVar.f62690a;
        if (creativeInfo != null) {
            if (creativeInfo.j() == null) {
                strJ = str;
            } else {
                strJ = creativeInfo.j();
            }
            d dVar = new d(strJ, creativeInfo.H(), creativeInfo.n(), creativeInfo.S(), str2, creativeInfo.M());
            Logger.d(this.f61779a, "set CI - activity key: ", dVar);
            synchronized (f61366L) {
                Iterator<d> it = f61366L.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        eVar = null;
                        break;
                    }
                    d next = it.next();
                    if (dVar.a(next, creativeInfo)) {
                        eVar = f61366L.get(next);
                        break;
                    }
                }
                Logger.printFullVerboseLog(this.f61779a, "set CI - current activity banner: ", eVar);
            }
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(creativeInfo.S());
            if (adNetworkDiscoveryJ == null) {
                Logger.d(this.f61779a, "set CI - no ad network discovery for sdk: ", creativeInfo.S());
                return false;
            }
            if (eVar != null) {
                if (!eVar.ae && StatsReporter.b().a(creativeInfo, eVar)) {
                    eVar.ae = true;
                }
                CreativeInfo creativeInfoJ = eVar.j();
                if (creativeInfoJ != null) {
                    Logger.d(this.f61779a, "set CI - previous CI id: ", creativeInfoJ.N());
                    if (creativeInfoJ.N() != null && creativeInfoJ.N().equals(creativeInfo.N())) {
                        adNetworkDiscoveryJ.d(creativeInfoJ);
                        Logger.printFullVerboseLog(this.f61779a, "set CI - already matched, same ad ID. current match: ", creativeInfo.ac(), ", previous match: ", creativeInfoJ.ac());
                    }
                }
                boolean z2 = creativeInfo.Z() != null;
                creativeInfo.a(oVar.f62691b, oVar.f62692c, oVar.f62693d);
                Logger.d(this.f61779a, "set CI - current banner webview address: ", eVar.f61818K, " is CI set earlier: ", Boolean.valueOf(z2));
                Logger.d(this.f61779a, "set CI - current banner: ", eVar);
                Logger.d(this.f61779a, "set CI - current debug info: ", creativeInfo.Y());
                eVar.a(creativeInfo);
                adNetworkDiscoveryJ.r(creativeInfo.N());
                if (!z2) {
                    a(eVar.i());
                    eVar.i().l();
                }
                Logger.d(this.f61779a, "set CI - CI is set for activity banner ", dVar, ". CI : ", creativeInfo);
                if (n(eVar.c()) && creativeInfo.v() && eVar.an != null && !eVar.i().f62605k && eVar.an.f61400d != null) {
                    eVar.an.f61400d.cancel(false);
                    eVar.an = null;
                    Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "set CI - canceling running impression handler task (ad is a video ad) ", eVar);
                }
                o(creativeInfo.ak());
                if (eVar.f61818K != null && (eVar.f61817J == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP || eVar.f61817J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO)) {
                    Logger.printFullVerboseLog(this.f61779a, "set CI - attach resources to CI, webview address: ", eVar.f61818K, " , ci: ", creativeInfo);
                    com.safedk.android.analytics.brandsafety.creatives.g.a(eVar.f61840v, eVar.f61818K, eVar.i());
                }
                b(eVar, creativeInfo);
                a(eVar, false, "setCreativeInfo");
                return true;
            }
            adNetworkDiscoveryJ.d(creativeInfo);
        } else {
            Logger.d(this.f61779a, "set CI - no CI");
        }
        return false;
    }

    private boolean a(c cVar, String str, String str2) {
        if (cVar != null) {
            String strD = com.safedk.android.utils.k.d(str, "clcode");
            Logger.d(this.f61779a, "check ad click URL validity - clcode: ", strD, ", view address: ", str2, ", views hierarchy: ", cVar.x());
            CreativeInfo creativeInfoJ = cVar.j();
            if ((strD != null && creativeInfoJ != null && !creativeInfoJ.N().equals(strD)) || cVar.x() == null || str2 == null || !cVar.x().contains(str2)) {
                Logger.d(this.f61779a, "check ad click URL validity - ad ID or view address does not match. clcode: ", strD, ", view address: ", str2, ", views hierarchy: ", cVar.x());
                return false;
            }
        }
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3, boolean z2, String str4) {
        boolean z3;
        Set<d> setKeySet;
        Logger.printFullVerboseLog(this.f61779a, "set ad click URL started, sdkPackageName: ", str2, ", url: ", str, ", view address: ", str3, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        List<CreativeInfo> listA = a(str2, str3);
        if (listA == null) {
            z3 = false;
        } else {
            z3 = false;
            for (CreativeInfo creativeInfo : listA) {
                Logger.printFullVerboseLog(this.f61779a, "set ad click URL , ci : ", creativeInfo);
                if (!creativeInfo.an() && (z2 || TextUtils.isEmpty(creativeInfo.O()) || creativeInfo.ap())) {
                    Logger.d(this.f61779a, "set ad click URL check ad click URL validity - view address: ", str3, ", updating click_url in pending CIs list. url = ", str, ", adId = ", creativeInfo.N());
                    creativeInfo.a(str, false);
                    z3 = true;
                }
            }
        }
        if (str != null) {
            synchronized (f61366L) {
                setKeySet = f61366L.keySet();
            }
            if (!setKeySet.isEmpty()) {
                Iterator<d> it = setKeySet.iterator();
                while (it.hasNext()) {
                    e eVar = f61366L.get(it.next());
                    if (eVar != null && eVar.c() != null && SdksMapping.isSameSdkByPackages(eVar.c(), str2) && a(eVar, str, str3)) {
                        if (!eVar.d() && (z2 || f61369P == null)) {
                            Logger.d(this.f61779a, "set ad click URL - current activity banner is not marked as clicked, setting candidate: ", str);
                            h(str, str3);
                        } else if (eVar.e() == null) {
                            Logger.printFullVerboseLog(this.f61779a, "set ad click URL - no click URL yet, setting click URL: ", str, ", CI: ", eVar.j());
                            if (eVar.c(str)) {
                                a(eVar, false, "setCurrentAdClickURL");
                            }
                        } else {
                            Logger.printFullVerboseLog(this.f61779a, "set ad click URL - click URL already set: ", eVar.e(), ", CI: ", eVar.j());
                        }
                        z3 = true;
                    }
                }
            }
        }
        return z3;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str, String str2, String str3) {
    }

    public void p(String str) {
        Set<d> setKeySet;
        Logger.d(this.f61779a, "stop taking screenshots started, address = ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        synchronized (f61366L) {
            setKeySet = f61366L.keySet();
        }
        if (!setKeySet.isEmpty()) {
            Iterator<d> it = setKeySet.iterator();
            while (it.hasNext()) {
                e eVar = f61366L.get(it.next());
                Logger.d(this.f61779a, "stop taking screenshots - checking banner info address = ", eVar.f61818K);
                if (eVar.f61818K != null && eVar.f61818K.equals(str)) {
                    Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "stop taking screenshots - address found. setting requestNoSamplingReceived. banner info address = ", eVar.f61818K);
                    eVar.f61822O = true;
                    for (k kVar : eVar.g()) {
                        if (kVar.j() != null && str != null && str.equals(kVar.j().ak())) {
                            c(kVar);
                        }
                    }
                    a(eVar, false, "stopTakingScreenshotsForImpression");
                }
            }
        }
    }

    private void c(k kVar) {
        Logger.d(this.f61779a, "stop taking screenshots impl started , impression = ", kVar);
        a(kVar);
        if (kVar.f62597c != null && kVar.f62597c.f62585b != null) {
            Logger.d(this.f61779a, "stop taking screenshots impl - removing hash and file ", kVar.f62597c.f62585b);
            BrandSafetyUtils.d(kVar.f62597c.f62585b);
            kVar.f62597c.f62584a = null;
        }
    }

    public void q(String str) {
        Set<d> setKeySet;
        Logger.d(this.f61779a, "stop taking screenshots started, sdkPackageName = ", str);
        synchronized (f61366L) {
            setKeySet = f61366L.keySet();
        }
        if (!setKeySet.isEmpty()) {
            Iterator<d> it = setKeySet.iterator();
            while (it.hasNext()) {
                e eVar = f61366L.get(it.next());
                Logger.d(this.f61779a, "stop taking screenshots - checking banner info address = ", eVar.f61818K);
                if (eVar.c() != null && eVar.c().equals(str)) {
                    Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "stop taking screenshots - address found. setting requestNoSamplingReceived. banner info address = ", eVar.f61818K);
                    eVar.f61822O = true;
                    Iterator<k> it2 = eVar.g().iterator();
                    while (it2.hasNext()) {
                        c(it2.next());
                    }
                    a(eVar, false, "stopTakingScreenshotsForImpression");
                }
            }
        }
    }

    private boolean a(int i2) {
        boolean zB = BrandSafetyUtils.b(i2);
        Logger.d(this.f61779a, "should stop sampling, max uniformed pixels count=", Integer.valueOf(i2), ", return value=", Boolean.valueOf(zB));
        return zB;
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        Set<d> setKeySet;
        Logger.d(this.f61779a, "on background started");
        synchronized (f61366L) {
            setKeySet = f61366L.keySet();
        }
        Iterator<d> it = setKeySet.iterator();
        while (it.hasNext()) {
            e eVar = f61366L.get(it.next());
            if (eVar != null && eVar.ab && eVar.f61834p == this.f61781c) {
                eVar.a(l.f62671z, new l.a[0]);
                a(eVar, false, "onBackground");
            }
        }
    }

    @Override // com.safedk.android.internal.a
    public void h() {
        Set<d> setKeySet;
        Logger.d(this.f61779a, "on foreground started");
        synchronized (f61366L) {
            setKeySet = f61366L.keySet();
        }
        Iterator<d> it = setKeySet.iterator();
        while (it.hasNext()) {
            e eVar = f61366L.get(it.next());
            if (eVar != null && eVar.ab && eVar.f61834p == this.f61781c) {
                eVar.a(l.f62620A, new l.a[0]);
                a(eVar, false, "onForeground");
            }
        }
    }

    private void h(String str, String str2) {
        f61369P = new h(System.currentTimeMillis(), str, str2, null);
    }

    public static void a(String str, MaxAdView maxAdView, BrandSafetyUtils.AdType adType) {
        if (str != null && maxAdView != null) {
            String strA = BrandSafetyUtils.a(maxAdView);
            synchronized (f61371R) {
                f61371R.put(strA, adType);
            }
            List<WeakReference<MaxAdView>> arrayList = f61370Q.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                synchronized (f61370Q) {
                    f61370Q.put(str, arrayList);
                }
                Logger.d("BannerFinder", "add Max ad view: added adUnitId: ", str, " to maxAdViews map", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            } else if (arrayList.get(0).get() == maxAdView) {
                return;
            }
            arrayList.add(0, new WeakReference<>(maxAdView));
            Logger.d("BannerFinder", "add Max ad view: ", maxAdView, ", address: ", BrandSafetyUtils.a(maxAdView), ", list size: ", Integer.valueOf(arrayList.size()));
        }
    }

    public static void a(MaxAdView maxAdView) {
        String strA = BrandSafetyUtils.a(maxAdView);
        synchronized (f61371R) {
            f61371R.remove(strA);
        }
        synchronized (f61370Q) {
            Iterator<String> it = f61370Q.keySet().iterator();
            while (it.hasNext()) {
                if (a(it.next(), maxAdView)) {
                    return;
                }
            }
        }
    }

    public static boolean a(String str, MaxAdView maxAdView) {
        List<WeakReference<MaxAdView>> list = f61370Q.get(str);
        if (maxAdView != null && list != null) {
            for (WeakReference<MaxAdView> weakReference : list) {
                if (weakReference != null && maxAdView == weakReference.get()) {
                    weakReference.clear();
                    list.remove(weakReference);
                    Logger.d("BannerFinder", "remove Max ad view: ", maxAdView, ", address: ", BrandSafetyUtils.a(maxAdView), ", list size: ", Integer.valueOf(list.size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                    if (list.isEmpty()) {
                        synchronized (f61370Q) {
                            f61370Q.remove(str);
                        }
                        Logger.d("BannerFinder", "remove Max ad view: removing adUnitId: ", str, " from maxAdViews");
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(k kVar) {
        a(kVar);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f61397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<View> f61398b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ScheduledFuture<?> f61400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f61402f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f61399c = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f61403g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f61404h = false;

        public a(e eVar, WeakReference<View> weakReference, int i2, d dVar) {
            WeakReference<View> weakReferenceA;
            this.f61402f = 0;
            this.f61402f = 0;
            this.f61398b = weakReference;
            this.f61397a = eVar;
            this.f61401e = i2;
            String strA = BrandSafetyUtils.a(weakReference.get());
            if (eVar != null) {
                eVar.av = dVar;
                eVar.f61818K = strA;
                k kVarI = eVar.i();
                String str = BannerFinder.this.f61779a;
                Object[] objArr = new Object[8];
                objArr[0] = "impression handler task, webviewAddress: ";
                objArr[1] = strA;
                objArr[2] = ", impression is: ";
                objArr[3] = kVarI;
                objArr[4] = " CI is: ";
                objArr[5] = kVarI != null ? kVarI.j() : null;
                objArr[6] = ", isOnUiThread = ";
                objArr[7] = Boolean.valueOf(com.safedk.android.utils.n.c());
                Logger.d(str, objArr);
                if (kVarI != null && kVarI.j() != null) {
                    com.safedk.android.analytics.brandsafety.creatives.g.a(eVar.f61840v, strA, kVarI);
                }
            } else {
                Logger.d(BannerFinder.this.f61779a, "impression handler task, currentActivityBanner is null with webview address: ", strA);
            }
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(eVar.c());
            if (adNetworkDiscoveryJ != null && (weakReferenceA = adNetworkDiscoveryJ.a(dVar)) != null && weakReferenceA.get() != null) {
                this.f61398b = weakReferenceA;
                Logger.d(BannerFinder.this.f61779a, "Impression handler task, view to take screenshot updated to: ", this.f61398b.get());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f61402f++;
                Logger.d(BannerFinder.this.f61779a, "impression handler task start, timerIterationCounter: ", Integer.valueOf(this.f61402f), ", impression is: ", this.f61397a);
                if (this.f61397a != null) {
                    this.f61399c++;
                    if (com.safedk.android.utils.n.a((Reference<?>) this.f61397a.ag)) {
                        if (this.f61399c <= this.f61401e && !this.f61397a.ad) {
                            int iE = this.f61397a.E();
                            if (iE > 0 && (this.f61398b.get() instanceof ViewGroup)) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(this.f61398b);
                                com.safedk.android.analytics.brandsafety.b.c((ViewGroup) this.f61398b.get(), arrayList);
                                Logger.d(BannerFinder.this.f61779a, "take screenshot (for screenshots) - views hierarchy : ", arrayList);
                                if (iE < arrayList.size()) {
                                    this.f61398b = (WeakReference) arrayList.get(iE);
                                    Logger.d(BannerFinder.this.f61779a, "take screenshot - get screenshot view, index: ", Integer.valueOf(iE), ", view: ", this.f61398b.get());
                                } else {
                                    this.f61397a.G();
                                    Logger.d(BannerFinder.this.f61779a, "take screenshot - reset screenshot view: ", this.f61398b.get());
                                }
                            }
                            if (this.f61397a.f61822O) {
                                Logger.d(BannerFinder.this.f61779a, "no creative info yet or request no sampling received, current activity banner = ", this.f61397a);
                            } else if (BannerFinder.this.a(this.f61397a, this.f61402f)) {
                                if (com.safedk.android.utils.n.a((Reference<?>) this.f61398b)) {
                                    a(this.f61397a, this.f61398b.get());
                                    if ((this.f61398b.get() instanceof ViewGroup) && CreativeInfoManager.a(this.f61397a.c(), AdNetworkConfiguration.SHOULD_EXTRACT_TEXT_FROM_NATIVE_BANNERS, false)) {
                                        BannerFinder.this.a((ViewGroup) this.f61398b.get(), this.f61397a);
                                    }
                                } else {
                                    Logger.d(BannerFinder.this.f61779a, "Impression handler task - view is not alive, can't taking screenshot");
                                }
                            }
                            return;
                        }
                        Logger.d(BannerFinder.this.f61779a, "Impression handler task - Going to report banner, eventId=", this.f61397a.f61819L, ", stopTimerAndReport=", Boolean.valueOf(this.f61397a.ad), ", image counter=", Integer.valueOf(this.f61399c), ", max attempts=", Integer.valueOf(this.f61401e), ", isImpressionReported=", Boolean.valueOf(this.f61397a.f61812E));
                        if (!this.f61397a.f61812E) {
                            BannerFinder.this.a(this.f61397a, false, "ImpressionHandlerTask");
                        }
                        BannerFinder.this.a(this.f61397a.av, this.f61400d);
                        return;
                    }
                    String str = BannerFinder.this.f61779a;
                    Object[] objArr = new Object[4];
                    objArr[0] = "Impression handler task - timer task cannot be started: banner activity=";
                    objArr[1] = !com.safedk.android.utils.n.a((Reference<?>) this.f61397a.ag) ? "" : this.f61397a.ag.get().getClass().getName();
                    objArr[2] = ", current activity banner=";
                    objArr[3] = this.f61397a;
                    Logger.d(str, objArr);
                }
            } catch (Throwable th) {
                Logger.e(BannerFinder.this.f61779a, "Impression handler task - exception: ", th);
            }
        }

        private void a(final e eVar, final View view) {
            try {
                if (eVar == null || view == null) {
                    Logger.d(BannerFinder.this.f61779a, "taking screenshot, view=", view, ", currentActivityBanner=", eVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                    return;
                }
                Logger.d(BannerFinder.this.f61779a, "taking screenshot, view=", view, ", event id=", eVar.f61819L, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                eVar.c();
                WeakReference<Activity> weakReference = eVar.ag;
                if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                    weakReference.get().runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Logger.d(BannerFinder.this.f61779a, "taking screenshot, using old method");
                            final Bitmap bitmapA = ScreenshotHelper.a(view, SafeDK.getInstance().aa(), eVar);
                            if (bitmapA == null) {
                                eVar.F();
                                Logger.d(BannerFinder.this.f61779a, "taking screenshot, black screenshot detected index = ", Integer.valueOf(eVar.E()));
                            }
                            BannerFinder.this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.a.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    BannerFinder.this.a(eVar, bitmapA, a.this.f61399c);
                                }
                            });
                        }
                    });
                }
            } catch (Throwable th) {
                Logger.e(BannerFinder.this.f61779a, "error while taking screenshot", th);
                Logger.printStackTrace();
                new CrashReporter().caughtException(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public void a(e eVar, Bitmap bitmap, int i2) {
        String str;
        String str2;
        String str3;
        int i3;
        int i5;
        char c2;
        if (bitmap == null) {
            return;
        }
        String strC = eVar.c();
        BrandSafetyUtils.a aVarB = BrandSafetyUtils.b(strC, bitmap);
        int iA = aVarB.a();
        BrandSafetyUtils.ScreenshotValidity screenshotValidityB = BrandSafetyUtils.b(strC, aVarB);
        if (screenshotValidityB != BrandSafetyUtils.ScreenshotValidity.VALID) {
            if (screenshotValidityB == BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_BLACK || screenshotValidityB == BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_VERY_HIGH) {
                eVar.F();
                Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "process screenshot, black/uniform screenshot detected, index = ", Integer.valueOf(eVar.E()));
                return;
            } else {
                Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - screenshot is not valid: ", screenshotValidityB.name(), ", pixel count: ", Integer.valueOf(iA), ", counter = ", Integer.valueOf(i2), ", try again...");
                return;
            }
        }
        String strA = BrandSafetyUtils.a(bitmap);
        BrandSafetyUtils.ScreenShotOrientation screenShotOrientationB = BrandSafetyUtils.b(bitmap);
        k kVarI = eVar.i();
        String strA2 = BrandSafetyUtils.a(bitmap, this.f61781c, strA, strC, kVarI.f62596a, screenShotOrientationB);
        if (!d(strA2, strC, strA)) {
            Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - image is not valid : ", strA2);
        }
        Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - screenshot file created, counter = ", Integer.valueOf(i2), " filename = ", strA2, ", hash = ", strA);
        long jC = BrandSafetyUtils.c(strA2);
        Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - hash ", strA, ", stored file size is ", Long.valueOf(jC), " bytes, counter is ", Integer.valueOf(i2), ", uniform pixel count is ", Integer.valueOf(iA), " (", Float.valueOf((iA / 500.0f) * 100.0f), "%)");
        int size = this.f61774C.size();
        if (!d(strA, kVarI.f62596a)) {
            if (size <= SafeDK.getInstance().J()) {
                if (kVarI.f62597c != null && kVarI.f62597c.f62584a != null && !kVarI.f62597c.f62584a.equals(strA)) {
                    Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - removing ad file ", kVarI.f62597c.f62585b);
                    BrandSafetyUtils.d(kVarI.f62597c.f62585b);
                }
                kVarI.b(l.f62665t, new l.a("typ", l.f62643X));
                Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - setting data hash = ", strA, ", file name = ", strA2, ", file size = ", Long.valueOf(jC), ", max uniformed pixel count = ", Integer.valueOf(iA), ", image counter = ", Integer.valueOf(i2));
                str2 = strA;
                str = "typ";
                c2 = 0;
                i5 = 1;
                i3 = iA;
                kVarI.f62597c = new j(str2, strA2, jC, iA, i2, screenShotOrientationB, false);
                a(eVar, false, "processScreenshot");
                str3 = l.f62665t;
            } else {
                str = "typ";
                str2 = strA;
                str3 = l.f62665t;
                i3 = iA;
                i5 = 1;
                i5 = 1;
                c2 = 0;
                if (!c(str2, kVarI.f62596a)) {
                    Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - No open slot for ", str2, "_", kVarI.f62596a);
                    BrandSafetyUtils.d(strA2);
                } else {
                    Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - Image ", str2, "_", kVarI.f62596a, " is already scheduled for upload");
                }
            }
        } else {
            str = "typ";
            str2 = strA;
            str3 = l.f62665t;
            i3 = iA;
            i5 = 1;
            c2 = 0;
            Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - Not saving file for ", str2, "_", kVarI.f62596a);
            BrandSafetyUtils.d(strA2);
        }
        if (a(i3)) {
            if (!TextUtils.isEmpty(str2)) {
                eVar.e(i5);
                eVar.ad = i5;
            }
            l.a[] aVarArr = new l.a[i5];
            aVarArr[c2] = new l.a(str, l.f62644Y);
            kVarI.a(str3, aVarArr);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void a(final Bitmap bitmap, final c cVar) {
        this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.1
            @Override // java.lang.Runnable
            public void run() {
                e eVar = (e) cVar;
                BannerFinder.this.a(eVar, bitmap, eVar.an.f61399c);
            }
        });
    }

    protected boolean a(e eVar, long j2) {
        if (eVar == null || com.safedk.android.utils.e.a((c) eVar)) {
            Logger.d(this.f61779a, Logger.FeatureTag.MEMORY_LOAD, "don't take screenshot, ad info: ", eVar, ", low memory");
            return false;
        }
        if (!SafeDK.getInstance().I()) {
            CreativeInfo creativeInfoJ = eVar.j();
            if (creativeInfoJ == null) {
                Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot, no creative info yet");
            } else {
                boolean zA = CreativeInfoManager.a(eVar.f61840v, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                if (creativeInfoJ.an() && !zA) {
                    Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot, multi ad, sdk: ", eVar.f61840v);
                } else {
                    Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, banner ad");
                    return true;
                }
            }
            return false;
        }
        Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, SafeDK Config item 'AlwaysTakeScreenshot' is true");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(d dVar, Bundle bundle, String str) {
        e eVar = f61366L.get(dVar);
        if (eVar == null || dVar.f62525g == null) {
            return false;
        }
        d dVar2 = f61372S.get(dVar.f62519a);
        if (dVar2 != null && !dVar2.equals(dVar)) {
            Logger.d(this.f61779a, "clear CI from banner info - a new banner has loaded instead, not deleting it");
            return false;
        }
        Logger.d(this.f61779a, "clear CI from banner info started with maxCreativeId: ", str, " and webview address: ", dVar.f62525g, " and adInfoKey: ", dVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        Logger.d(this.f61779a, "clear CI from banner info started with impressions size: ", Integer.valueOf(eVar.g().size()), " banner info: ", eVar);
        List<k> listG = eVar.g();
        for (k kVar : listG) {
            a(kVar);
            if (StatsCollector.c() != null) {
                StatsCollector.c().a(kVar.f62596a);
            }
        }
        listG.clear();
        long j2 = eVar.aj;
        long j3 = eVar.f62533ak;
        e eVarA = a(eVar.ag.get(), eVar.f61840v, dVar.f62521c, bundle);
        eVarA.ab = true;
        eVarA.ah = true;
        eVarA.aj = j2;
        eVarA.f62533ak = j3;
        eVarA.ai = true;
        synchronized (f61366L) {
            f61366L.put(dVar, eVarA);
        }
        Logger.d(this.f61779a, "handle WILL_DISPLAY New activity banner created for ", eVarA.f61840v, ", banner key is ", dVar, ", current activity banners size is ", Integer.valueOf(f61366L.size()));
        dVar.f62526h = null;
        return true;
    }

    private boolean a(String str, WeakReference<MaxAdView> weakReference, d dVar) {
        if (!CreativeInfoManager.a(str, AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, false) || dVar.f62525g == null) {
            return false;
        }
        List<WeakReference<View>> listA = a((ViewGroup) weakReference.get());
        List<String> listC = c(listA);
        List<WeakReference<WebView>> listB = b(listA);
        Logger.d(this.f61779a, "find banner impression - webview is: ", dVar.f62525g, " there are ", Integer.valueOf(listB.size()), " webViews and the views addresses list is: ", listC, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (listC.contains(dVar.f62525g) || listB.size() <= 0) {
            return false;
        }
        Logger.d(this.f61779a, "find banner impression - did not find webview address ", dVar.f62525g, " inside the views list, first webview address is: ", BrandSafetyUtils.a((Object) listB.get(0).get()));
        return true;
    }

    protected Boolean a(String str, String str2, d dVar, String str3, List<WeakReference<View>> list, List<String> list2, List<WeakReference<WebView>> list3) {
        int i2;
        boolean z2;
        int i3;
        List<String> list4 = list2;
        char c2 = 2;
        int i5 = 1;
        try {
            List<WeakReference<MaxAdView>> list5 = f61370Q.get(dVar.f62519a);
            if (list5 == null) {
                z2 = true;
            } else {
                try {
                    synchronized (list5) {
                        try {
                            for (WeakReference<MaxAdView> weakReference : list5) {
                                if (weakReference.get() != null) {
                                    String str4 = this.f61779a;
                                    Object[] objArr = new Object[10];
                                    objArr[0] = "find banner impression - sdk: ";
                                    objArr[i5] = str;
                                    objArr[c2] = ", ad unit id: ";
                                    objArr[3] = dVar.f62519a;
                                    objArr[4] = ", max ad view: ";
                                    objArr[5] = weakReference.get().toString();
                                    objArr[6] = ", address: ";
                                    objArr[7] = BrandSafetyUtils.a(weakReference.get());
                                    objArr[8] = ", isOnUiThread = ";
                                    objArr[9] = Boolean.valueOf(com.safedk.android.utils.n.c());
                                    Logger.d(str4, objArr);
                                    if (list5.size() > i5 && (!weakReference.get().isShown() || weakReference.get().getWindowVisibility() != 0)) {
                                        String str5 = this.f61779a;
                                        Object[] objArr2 = new Object[i5];
                                        objArr2[0] = "find banner impression - window is not visible, continue to next max ad view";
                                        Logger.d(str5, objArr2);
                                    } else {
                                        b(weakReference.get(), list3);
                                        ArrayList arrayList = new ArrayList();
                                        ArrayList arrayList2 = new ArrayList();
                                        list4.add(BrandSafetyUtils.a(weakReference.get()));
                                        arrayList2.add("h1c1:" + weakReference.get().toString());
                                        String strN = BrandSafetyUtils.n(str3);
                                        dVar.f62527i = a(str, weakReference, dVar);
                                        z2 = true;
                                        try {
                                            a(weakReference.get(), str, strN, str2, dVar, list, arrayList, list2, arrayList2, 1, false, false);
                                            Logger.printFullVerboseLog(this.f61779a, "find banner impression - views hierarchy: ", arrayList2);
                                            if (!list.isEmpty()) {
                                                Logger.d(this.f61779a, "find banner impression - found views: ", arrayList);
                                                return true;
                                            }
                                            if (TextUtils.isEmpty(strN)) {
                                                i3 = 2;
                                            } else {
                                                i3 = 2;
                                                if (!list2.contains(strN)) {
                                                    list2.clear();
                                                    list.clear();
                                                    return false;
                                                }
                                            }
                                            String str6 = this.f61779a;
                                            Object[] objArr3 = new Object[i3];
                                            objArr3[0] = "find banner impression - no new views found for top view: ";
                                            objArr3[1] = weakReference.get().toString();
                                            Logger.d(str6, objArr3);
                                            return true;
                                        } catch (Throwable th) {
                                            th = th;
                                            i2 = 2;
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                String str7 = this.f61779a;
                                                Object[] objArr4 = new Object[i2];
                                                objArr4[0] = "Failed while scanning the screen for banners";
                                                objArr4[z2 ? 1 : 0] = th;
                                                Logger.e(str7, objArr4);
                                                new CrashReporter().caughtException(th);
                                                return Boolean.valueOf(z2);
                                            }
                                        }
                                    }
                                } else {
                                    Logger.d(this.f61779a, "find banner impression - sdk: ", str, ", ad unit id: ", dVar.f62519a, ", max ad view not valid");
                                    list4 = list4;
                                    i5 = 1;
                                    c2 = 2;
                                }
                            }
                            z2 = true;
                        } catch (Throwable th3) {
                            th = th3;
                            i2 = 2;
                            z2 = true;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            i2 = 2;
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(List<WeakReference<View>> list, final List<WeakReference<WebView>> list2, d dVar, long j2) {
        boolean z2;
        Logger.d(this.f61779a, "report completed banners started, views = ", list, ", adInfoKey = ", dVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        final ArrayList arrayList = new ArrayList();
        synchronized (BannerFinder.class) {
            for (Map.Entry<d, e> entry : f61366L.entrySet()) {
                d key = entry.getKey();
                if (key.equals(dVar)) {
                    Logger.d(this.f61779a, "report completed banners, skipping banner info of new impression, key=", key);
                } else if (!key.f62519a.equals(dVar.f62519a)) {
                    Logger.d(this.f61779a, "report completed banners, skipping banner info of another adUnitId, key=", key);
                } else if (j2 <= entry.getValue().aj) {
                    Logger.d(this.f61779a, "report completed banners, skipping banner info of later impression, key=", key);
                } else if (!entry.getValue().ah) {
                    Logger.d(this.f61779a, "report completed banners, skipping banner info still not displayed impression, key=", key);
                } else {
                    Logger.d(this.f61779a, "report completed banners, check to report banner info, adInfoKey=", key);
                    e value = entry.getValue();
                    if (value.f61818K != null) {
                        Logger.d(this.f61779a, "report completed banners, looking for completed banners to report, WebView=", value.f61818K);
                        if (list != null) {
                            Iterator<WeakReference<View>> it = list.iterator();
                            while (it.hasNext()) {
                                String strA = BrandSafetyUtils.a(it.next().get());
                                if (value.f61818K.equals(strA)) {
                                    Logger.d(this.f61779a, "report completed banners, WebView address still active, WebView=", strA);
                                    z2 = true;
                                    break;
                                }
                            }
                            z2 = false;
                            if (z2 && value.ab) {
                                Logger.d(this.f61779a, "report completed banners, executing postponed banner reporting for eventId ", value.f61819L);
                                value.a(l.f62622C, new l.a[0]);
                                a(entry.getValue(), false, "reportCompletedBanners");
                                value.ab = false;
                                value.f61827U = true;
                                arrayList.add(entry);
                            }
                        } else {
                            z2 = false;
                            if (z2) {
                            }
                        }
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f61776E.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.2
                @Override // java.lang.Runnable
                public void run() {
                    for (Map.Entry entry2 : arrayList) {
                        Logger.d(BannerFinder.this.f61779a, "report completed banners starting reporting for eventId ", ((e) entry2.getValue()).f61819L);
                        if (!BannerFinder.this.f61373O.contains(((d) entry2.getKey()).f62521c)) {
                            BannerFinder.this.a((e) entry2.getValue(), true, "reportCompletedBannersTask");
                            synchronized (BannerFinder.class) {
                                BannerFinder.f61366L.remove(entry2.getKey());
                            }
                            BannerFinder.this.a((e) entry2.getValue());
                            com.safedk.android.analytics.brandsafety.creatives.g.a((List<WeakReference<WebView>>) list2);
                        }
                    }
                }
            }, 3L, TimeUnit.SECONDS);
        }
    }

    protected void a(ViewGroup viewGroup, String str, String str2, String str3, d dVar, List<WeakReference<View>> list, List<w> list2, List<String> list3, List<String> list4, int i2, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        e eVar;
        e eVar2;
        int i3;
        boolean z6;
        int i5;
        String str4 = str2;
        String str5 = str3;
        d dVar2 = dVar;
        if (viewGroup == null) {
            return;
        }
        int i7 = i2 + 1;
        boolean z7 = z2;
        boolean z9 = z3;
        int i8 = 0;
        while (i8 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i8);
            String strA = BrandSafetyUtils.a(childAt);
            list3.add(strA);
            StringBuilder sb = new StringBuilder();
            sb.append(CmcdData.STREAMING_FORMAT_HLS);
            sb.append(i7);
            sb.append("c");
            int i9 = i8 + 1;
            sb.append(i9);
            sb.append(":");
            sb.append(childAt);
            list4.add(sb.toString());
            if (TextUtils.isEmpty(str2)) {
                z4 = true;
            } else if (!str4.equals(strA)) {
                z4 = z7;
            } else {
                Logger.d(this.f61779a, "scan for banner views - verified by ad network view address received from Max: ", str4, ", view: ", childAt, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                z4 = true;
            }
            e eVar3 = f61366L.get(dVar2);
            if (!z4) {
                z5 = z9;
                eVar = eVar3;
            } else {
                boolean zA = a(viewGroup, str, dVar2);
                if (!((eVar3 != null && eVar3.j() == null && eVar3.f61831m != null && !eVar3.f61831m.isEmpty()) || !CreativeInfoManager.a(str, AdNetworkConfiguration.AVOID_MATCHING_CI_FROM_BANNER_WEB_VIEW_BEFORE_SCANNING, false))) {
                    z5 = z9;
                    eVar = eVar3;
                } else {
                    boolean zA2 = CreativeInfoManager.a(str, AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false);
                    z5 = z9;
                    boolean zA3 = CreativeInfoManager.a(str, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false);
                    eVar = eVar3;
                    boolean zA4 = CreativeInfoManager.a(str, AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, false);
                    if (zA2) {
                        if (a(childAt, str, str5, dVar2)) {
                            return;
                        }
                    } else if (zA3) {
                        b(childAt, str, str5, dVar2);
                    } else if (zA) {
                        String strB = BrandSafetyUtils.b(childAt.getClass());
                        if (CreativeInfoManager.a(strB, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false)) {
                            b(childAt, strB, str5, dVar2);
                        }
                    } else if (zA4) {
                        a(childAt, str, dVar2);
                    }
                }
            }
            if (z4 && (childAt instanceof WebView)) {
                a(childAt, str, list, list2, dVar);
                return;
            }
            if (!z4 || !a(str, childAt)) {
                eVar2 = eVar;
                i3 = i9;
                z6 = z5;
            } else {
                eVar2 = eVar;
                i3 = i9;
                a(childAt, str, list, list2, dVar);
                z6 = true;
            }
            if ((childAt instanceof TextView) && z6) {
                if (eVar2 == null || eVar2.j() == null || eVar2.H()) {
                    i5 = i7;
                } else {
                    TextView textView = (TextView) childAt;
                    eVar2.i().b("text:" + textView.getText().toString());
                    Logger.d(this.f61779a, "scan for banner views - added text ", textView.getText().toString());
                    i5 = i7;
                }
            } else if (!(childAt instanceof ViewGroup)) {
                i5 = i7;
            } else {
                i5 = i7;
                a((ViewGroup) childAt, str, str2, str3, dVar, list, list2, list3, list4, i5, z4, z6);
            }
            str4 = str2;
            str5 = str3;
            dVar2 = dVar;
            z7 = z4;
            i8 = i3;
            z9 = z6;
            i7 = i5;
        }
    }

    protected void b(ViewGroup viewGroup, List<w> list, List<String> list2, int i2) {
        if (viewGroup == null) {
            return;
        }
        int i3 = i2 + 1;
        int i5 = 0;
        while (i5 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i5);
            StringBuilder sb = new StringBuilder();
            sb.append(CmcdData.STREAMING_FORMAT_HLS);
            sb.append(i3);
            sb.append("c");
            i5++;
            sb.append(i5);
            sb.append(":");
            sb.append(childAt);
            list2.add(sb.toString());
            if (childAt instanceof WebView) {
                list.add(new w(BrandSafetyUtils.a(childAt), childAt.getClass().getName(), childAt.getWidth(), childAt.getHeight()));
                Logger.d(this.f61779a, "found expanded view: ", childAt, ": width: ", Integer.valueOf(childAt.getWidth()), " height: ", Integer.valueOf(childAt.getHeight()), " sdk: ", childAt.getClass().getName());
            } else if (childAt instanceof ViewGroup) {
                b((ViewGroup) childAt, list, list2, i3);
            }
        }
    }

    protected void a(ViewGroup viewGroup, e eVar) {
        Logger.d(this.f61779a, QTafcm.FdsJqGcXwAz, viewGroup, ", bannerInfo : ", eVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (viewGroup == null) {
            return;
        }
        if (eVar.H()) {
            Logger.d(this.f61779a, "collect banner text - ad is a native ad: ", viewGroup, ", child count is: ", Integer.valueOf(viewGroup.getChildCount()));
            return;
        }
        Logger.d(this.f61779a, "collect banner text - view is: ", viewGroup, ", child count is: ", Integer.valueOf(viewGroup.getChildCount()));
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            Logger.d(this.f61779a, "collect banner text - child view ", Integer.valueOf(i2), " is: ", childAt);
            if (childAt instanceof TextView) {
                Logger.d(this.f61779a, "collect banner text - text box found. view ", childAt);
                if (eVar != null && eVar.j() != null) {
                    TextView textView = (TextView) childAt;
                    eVar.i().b("text:" + textView.getText().toString());
                    Logger.d(this.f61779a, "collect banner text - added text ", textView.getText().toString());
                }
            } else if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, eVar);
            }
        }
    }

    protected void a(View view, String str, List<WeakReference<View>> list, List<w> list2, d dVar) {
        String strA = BrandSafetyUtils.a(view);
        Logger.d(this.f61779a, "handle ad view - view is an instance of ", view.getClass().getName(), " : ", strA, ", class : ", view.getClass().getCanonicalName(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        String sdkPackageByClass = SdksMapping.getSdkPackageByClass(view.getClass().getName());
        e eVar = f61366L.get(dVar);
        Logger.d(this.f61779a, "handle ad view - sdk of view: ", sdkPackageByClass, ", sdk: ", str, " and event id: ", dVar.f62521c);
        boolean z2 = eVar != null && eVar.f61826T;
        if ((c(view) || z2 || sdkPackageByClass == null || sdkPackageByClass.equals(str)) && !s(strA)) {
            list2.add(new w(strA, view.getClass().getName(), view.getWidth(), view.getHeight()));
            list.add(new WeakReference<>(view));
            Logger.d(this.f61779a, "found view: ", view, ": width: ", Integer.valueOf(view.getWidth()), " height: ", Integer.valueOf(view.getHeight()), " sdk: ", view.getClass().getName());
        }
        Logger.d(this.f61779a, "view is not a valid instance of web view, or web view already matched, view: ", view);
    }

    public static boolean c(View view) {
        return view != null && view.getClass().getName().equals(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f62217r);
    }

    private boolean a(View view, String str, String str2, d dVar) {
        e eVar;
        String strA;
        AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
        if (adNetworkDiscoveryJ != null && (eVar = f61366L.get(dVar)) != null && eVar.j() == null && eVar.f61831m != null && (strA = adNetworkDiscoveryJ.a(view, dVar.f62524f)) != null) {
            char c2 = 3;
            if (CreativeInfoManager.a(str, AdNetworkConfiguration.AD_ID_EXTRACTED_FROM_BANNER_WEB_VIEW_IS_MAX_CREATIVE_ID, false) && str2 != null && !str2.equals(strA)) {
                Logger.d(this.f61779a, "extract ad ID from view - value extracted (", strA, ") from widget is not equal to creative ID (", str2, ")");
                return true;
            }
            Logger.d(this.f61779a, "extract ad ID from view - attempting to locate ci by ad ID value ", strA, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            CreativeInfo creativeInfoA = adNetworkDiscoveryJ.a((Object) strA);
            if (creativeInfoA != null) {
                List<CreativeInfo> listS = adNetworkDiscoveryJ.s(creativeInfoA.N());
                Logger.d(this.f61779a, Logger.FeatureTag.CI_MATCHING, "extract ad ID from view - found CI for adId ", strA, ", size : ", Integer.valueOf(listS.size()), " : ", listS);
                for (CreativeInfo creativeInfo : listS) {
                    creativeInfo.a((Object) view);
                    creativeInfo.h(dVar.f62521c);
                    creativeInfo.j(dVar.f62520b);
                    b(creativeInfo, eVar);
                    String str3 = this.f61779a;
                    Object[] objArr = new Object[6];
                    objArr[0] = "extract ad ID from view - ci placementId set to ";
                    objArr[1] = dVar.f62520b;
                    objArr[2] = ", event ID : ";
                    objArr[c2] = dVar.f62521c;
                    objArr[4] = " , ad type  = ";
                    objArr[5] = creativeInfoA.M();
                    Logger.d(str3, objArr);
                    a(new o(creativeInfo, CreativeInfo.f62450n, creativeInfoA.aa(), BrandSafetyUtils.a(view)));
                    c2 = 3;
                }
            } else {
                Logger.d(this.f61779a, "extract ad ID from view - CI not found, adId = ", strA);
            }
        }
        return false;
    }

    private void b(final View view, final String str, final String str2, final d dVar) {
        final e eVar = f61366L.get(dVar);
        final boolean zA = CreativeInfoManager.a(str, AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, false);
        final String strA = BrandSafetyUtils.a(view);
        d dVar2 = f61372S.get(dVar.f62519a);
        final boolean z2 = dVar.f62527i && !dVar.f62525g.equals(strA) && (dVar2 == null || dVar2.equals(dVar));
        Logger.d(this.f61779a, "try to match using reflection, sdk:", str, ", view: ", view, ", isWebviewChange: ", Boolean.valueOf(z2), ", info: ", eVar);
        if (eVar != null) {
            if (eVar.k().isEmpty() || z2) {
                this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.3
                    /* JADX WARN: Removed duplicated region for block: B:42:0x01a6  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x01d0  */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x01d3 A[Catch: all -> 0x02cb, TryCatch #0 {all -> 0x02cb, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0016, B:9:0x001a, B:11:0x0020, B:13:0x002e, B:15:0x0036, B:17:0x004a, B:20:0x0052, B:21:0x00c5, B:23:0x00cb, B:25:0x00f5, B:26:0x00fc, B:28:0x013e, B:30:0x0148, B:33:0x0161, B:35:0x0168, B:37:0x016e, B:40:0x018d, B:43:0x01a8, B:45:0x01c1, B:48:0x01d3, B:50:0x01d9, B:52:0x01f6, B:54:0x020f, B:56:0x0228, B:58:0x023c, B:60:0x0264, B:67:0x0292, B:62:0x026e, B:66:0x0290, B:65:0x0277, B:68:0x02a4), top: B:74:0x0006 }] */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x01f6 A[Catch: all -> 0x02cb, TryCatch #0 {all -> 0x02cb, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0016, B:9:0x001a, B:11:0x0020, B:13:0x002e, B:15:0x0036, B:17:0x004a, B:20:0x0052, B:21:0x00c5, B:23:0x00cb, B:25:0x00f5, B:26:0x00fc, B:28:0x013e, B:30:0x0148, B:33:0x0161, B:35:0x0168, B:37:0x016e, B:40:0x018d, B:43:0x01a8, B:45:0x01c1, B:48:0x01d3, B:50:0x01d9, B:52:0x01f6, B:54:0x020f, B:56:0x0228, B:58:0x023c, B:60:0x0264, B:67:0x0292, B:62:0x026e, B:66:0x0290, B:65:0x0277, B:68:0x02a4), top: B:74:0x0006 }] */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0228 A[SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void run() {
                        boolean zA2;
                        try {
                            if (zA && !eVar.k().isEmpty() && (!z2 || !(view instanceof WebView))) {
                                Logger.d(BannerFinder.this.f61779a, "try to match using reflection, exit");
                                return;
                            }
                            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
                            if (adNetworkDiscoveryJ != null) {
                                List<CreativeInfo> listA = adNetworkDiscoveryJ.a(new WeakReference<>(view), str2, dVar.f62524f);
                                if (listA != null && !listA.isEmpty()) {
                                    char c2 = 5;
                                    int i2 = 6;
                                    Logger.d(BannerFinder.this.f61779a, "extract ad ID from view - ad info's webview is: ", dVar.f62525g, " and view address is: ", strA, " and max creative id: ", str2, " and banner info CI list size is: ", Integer.valueOf(eVar.k().size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                                    Logger.d(BannerFinder.this.f61779a, "extract ad ID from view - is the view webView? ", Boolean.valueOf(view instanceof WebView), " and event id is: ", dVar.f62521c);
                                    for (CreativeInfo creativeInfo : listA) {
                                        creativeInfo.a((Object) view);
                                        creativeInfo.a(BannerFinder.this.f61781c);
                                        creativeInfo.h(dVar.f62521c);
                                        String strH = creativeInfo.H();
                                        creativeInfo.j(dVar.f62520b);
                                        if (creativeInfo.N() == null) {
                                            creativeInfo.r(creativeInfo.P());
                                        }
                                        String str3 = BannerFinder.this.f61779a;
                                        Logger.FeatureTag featureTag = Logger.FeatureTag.CI_MATCHING;
                                        Object[] objArr = new Object[i2];
                                        objArr[0] = "extract ad ID from view - reflect CI found, view : ";
                                        objArr[1] = view;
                                        objArr[2] = " did webview replaced? ";
                                        objArr[3] = Boolean.valueOf(z2);
                                        objArr[4] = ", ci : ";
                                        objArr[c2] = creativeInfo.ac();
                                        Logger.d(str3, featureTag, objArr);
                                        Logger.d(BannerFinder.this.f61779a, "extract ad ID from view - current adInfoKey's MatchedCIId is: ", dVar.f62526h);
                                        String strC = creativeInfo.O() != null ? com.safedk.android.utils.k.c(creativeInfo.O()) : null;
                                        Logger.d(BannerFinder.this.f61779a, "extract ad ID from view - click url is: ", strC);
                                        if (dVar.f62526h != null && creativeInfo.N() != null) {
                                            if (dVar.f62527i) {
                                                if (dVar.f62526h.contains(creativeInfo.N() + "##")) {
                                                    zA2 = false;
                                                    if (!zA2 && dVar.f62526h != null) {
                                                        if (dVar.f62526h.contains(creativeInfo.N() + "##")) {
                                                            if (!dVar.f62526h.contains("##" + strH)) {
                                                                if (dVar.f62526h.contains("**" + strC)) {
                                                                }
                                                            }
                                                        }
                                                        Logger.d(BannerFinder.this.f61779a, "extract ad ID from view - redundant CI, exiting with event id - ", dVar.f62521c);
                                                        return;
                                                    }
                                                } else if (strH != null) {
                                                    if (!dVar.f62526h.contains("##" + strH)) {
                                                        if (strC != null) {
                                                            if (!dVar.f62526h.contains("**" + strC)) {
                                                            }
                                                            if (!zA2) {
                                                                if (dVar.f62526h.contains(creativeInfo.N() + "##")) {
                                                                }
                                                                Logger.d(BannerFinder.this.f61779a, "extract ad ID from view - redundant CI, exiting with event id - ", dVar.f62521c);
                                                                return;
                                                            }
                                                        }
                                                        zA2 = BannerFinder.this.a(dVar, eVar.f61808A, str2);
                                                        if (!zA2) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        dVar.f62525g = strA;
                                        String str4 = creativeInfo.N() + "##" + strH + "**" + strC;
                                        if (dVar.f62526h == null || !dVar.f62526h.contains(str4)) {
                                            d dVar3 = dVar;
                                            if (dVar.f62526h != null) {
                                                str4 = dVar.f62526h + l.ac + str4;
                                            }
                                            dVar3.f62526h = str4;
                                        }
                                        BannerFinder.this.a(new o(creativeInfo, CreativeInfo.f62450n), dVar);
                                        c2 = 5;
                                        i2 = 6;
                                    }
                                    return;
                                }
                                Logger.d(BannerFinder.this.f61779a, "extract ad ID from view - reflect CI not found for max creative Id: ", str2, " and creative info size is: ", Integer.valueOf(eVar.k().size()));
                            }
                        } catch (Throwable th) {
                            Logger.e(BannerFinder.this.f61779a, "extract ad ID from view - exception occurred: ", th.getMessage(), th);
                        }
                    }
                });
            }
        }
    }

    private void a(final View view, final String str, final d dVar) {
        e eVar = f61366L.get(dVar);
        if (eVar != null && eVar.k().isEmpty() && a(str, view) && eVar.H()) {
            Logger.printFullVerboseLog(this.f61779a, "extract ad ID from view - info :", eVar, ", ci : ", eVar.k());
            Logger.d(this.f61779a, "extract ad ID from view - attempting to find CI by adInfoKey ", dVar);
            this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.4
                @Override // java.lang.Runnable
                public void run() {
                    AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
                    if (adNetworkDiscoveryJ != null) {
                        CreativeInfo creativeInfoA = adNetworkDiscoveryJ.a((Object) (dVar.f62520b + "_" + dVar.f62521c + "_" + dVar.f62522d));
                        if (creativeInfoA != null) {
                            Logger.d(BannerFinder.this.f61779a, Logger.FeatureTag.CI_MATCHING, "extract ad ID from view - find CI by key found, adInfoKey : ", dVar, ", creativeInfo : ", creativeInfoA, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                            creativeInfoA.a((Object) view);
                            creativeInfoA.a(BannerFinder.this.f61781c);
                            creativeInfoA.h(dVar.f62521c);
                            creativeInfoA.j(dVar.f62520b);
                            if (creativeInfoA.N() == null) {
                                creativeInfoA.r(creativeInfoA.P());
                            }
                            Logger.d(BannerFinder.this.f61779a, "extract ad ID from view - reflect ci placement ID set to ", dVar.f62520b, ", event ID : ", dVar.f62521c);
                            BannerFinder.this.a(new o(creativeInfoA, CreativeInfo.f62450n));
                            return;
                        }
                        Logger.d(BannerFinder.this.f61779a, "extract ad ID from view - reflect CI not found");
                    }
                }
            });
        }
    }

    private void b(CreativeInfo creativeInfo, e eVar) {
        BrandSafetyEvent.AdFormatType adFormatType;
        Logger.d(this.f61779a, "update ad format : started, sdk = ", creativeInfo.S(), ", initial ad type = ", creativeInfo.K(), " , bannerInfo = ", eVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (CreativeInfoManager.a(creativeInfo.S(), AdNetworkConfiguration.SET_AD_FORMAT_FROM_APPLOVIN_BUNDLE, false)) {
            if (eVar.I()) {
                adFormatType = BrandSafetyEvent.AdFormatType.MREC;
            } else {
                adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
            }
            creativeInfo.a(adFormatType);
            Logger.d(this.f61779a, "update ad type. ad type set to ", adFormatType);
        }
    }

    private boolean a(ViewGroup viewGroup, String str, d dVar) {
        e eVar;
        String strA = BrandSafetyUtils.a((Class) viewGroup.getClass());
        if (!TextUtils.isEmpty(strA) && !strA.equals(str) && strA.equals(com.safedk.android.utils.h.f63168h) && (eVar = f61366L.get(dVar)) != null) {
            eVar.f61826T = true;
            return true;
        }
        return false;
    }

    private String a(View view, String str) {
        String strA = BrandSafetyUtils.a((Class) view.getClass());
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        if (TextUtils.isEmpty(str)) {
            return view.getClass().getName();
        }
        return str;
    }

    public void c(final Activity activity) {
        if (com.safedk.android.utils.n.c()) {
            this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.5
                @Override // java.lang.Runnable
                public void run() {
                    BannerFinder.this.d(activity);
                }
            });
        } else {
            d(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity) {
        e eVar;
        Logger.d(this.f61779a, Logger.FeatureTag.REDIRECTS, "start monitoring of redirect/expand, activity: ", activity, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        c cVarA = BrandSafetyUtils.a(activity);
        if ((cVarA instanceof e) && (eVar = (e) cVarA) != null) {
            eVar.ap = activity.toString();
            k kVarI = eVar.i();
            if (kVarI != null && kVarI.f62599e != null) {
                kVarI.f62599e.a("redirectActivityName=" + eVar.ap);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void e(String str) {
        synchronized (f61366L) {
            for (e eVar : f61366L.values()) {
                if (eVar.f61828V && eVar.ap != null && eVar.ap.equals(str)) {
                    a(eVar, false, "onActivityDestroyed");
                    return;
                }
            }
        }
    }

    public void a(String str, String str2, String str3, d dVar, Bundle bundle) {
        e eVarA;
        Activity activityA = a(bundle);
        if (this.f61373O.contains(dVar.f62521c)) {
            Logger.d(this.f61779a, "handle REVENUE_EVENT - impression with id ", dVar.f62521c, " has already been reported, ignoring. ");
            return;
        }
        if (f(str, str2)) {
            synchronized (f61366L) {
                eVarA = f61366L.get(dVar);
                if (eVarA == null) {
                    eVarA = a(activityA, str2, dVar.f62521c, bundle);
                    f61366L.put(dVar, eVarA);
                    Logger.d(this.f61779a, "New activity banner created for ", str2, ", banner key is ", dVar, ", current activity banners size is ", Integer.valueOf(f61366L.size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                } else {
                    if (eVarA.f61808A == null) {
                        eVarA.f61808A = bundle;
                    }
                    if (eVarA.f61809B == null || eVarA.f61810C == null) {
                        eVarA.a(a(activityA));
                    }
                }
            }
            if (eVarA != null) {
                if (bundle.getString("revenue_event") != null) {
                    eVarA.f61823P = bundle.getString("revenue_event");
                } else {
                    eVarA.f61823P = "unknown";
                }
                eVarA.f61820M = str3;
                a(eVarA, false, "handleRevenueEvent");
                Logger.d(this.f61779a, "Revenue event set to ", bundle.getString("revenue_event"), " for eventId ", dVar.f62521c);
                eVarA.ab = true;
            }
        } else {
            this.f61782d++;
        }
        a(str2, str3, dVar, bundle);
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean b(String str, String str2, String str3) {
        Set<d> setKeySet;
        k kVarI;
        String strD = BrandSafetyUtils.d();
        synchronized (f61366L) {
            setKeySet = f61366L.keySet();
        }
        Iterator<d> it = setKeySet.iterator();
        while (it.hasNext()) {
            e eVar = f61366L.get(it.next());
            if (eVar != null && str2 != null && str2.equals(eVar.f61818K) && (kVarI = eVar.i()) != null && kVarI.f62599e != null && str3 != null && (str3.equals(kVarI.f62599e.f61730m) || str3.equals(strD))) {
                Logger.d(this.f61779a, "redirect url was loaded to the ad web view: ", str2, " url: ", str3, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                kVarI.j().a(true);
                return true;
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, boolean z2, String str3) {
        return false;
    }

    public static String a(MaxNativeAdView maxNativeAdView) {
        String strA = BrandSafetyUtils.a(maxNativeAdView);
        synchronized (f61366L) {
            for (e eVar : f61366L.values()) {
                if (eVar.f61831m != null && eVar.f61831m.contains(strA)) {
                    return eVar.f61840v;
                }
            }
            return null;
        }
    }

    public void g(String str, String str2) {
        Set<d> setKeySet;
        CreativeInfo creativeInfoJ;
        a aVar;
        AdNetworkDiscovery adNetworkDiscoveryJ;
        WeakReference<View> weakReferenceA;
        Logger.d(this.f61779a, "set on video completed event has been triggered - started for sdk= ", str, ",   adId= ", str2);
        synchronized (f61366L) {
            setKeySet = f61366L.keySet();
        }
        for (d dVar : setKeySet) {
            e eVar = f61366L.get(dVar);
            if (eVar != null && (creativeInfoJ = eVar.j()) != null && !TextUtils.isEmpty(creativeInfoJ.N()) && creativeInfoJ.N().equals(str2)) {
                Logger.d(this.f61779a, "set on video completed event has been triggered - found ci= ", creativeInfoJ.ac());
                eVar.i().f62605k = true;
                eVar.A();
                a aVar2 = eVar.an;
                if (aVar2 == null && (adNetworkDiscoveryJ = CreativeInfoManager.j(str)) != null && (weakReferenceA = adNetworkDiscoveryJ.a(dVar)) != null && weakReferenceA.get() != null) {
                    a aVar3 = new a(eVar, weakReferenceA, this.f61783e, dVar);
                    eVar.an = aVar3;
                    Logger.d(this.f61779a, "set on video completed event has been triggered - new task created= ", aVar3);
                    aVar = aVar3;
                } else {
                    aVar = aVar2;
                }
                if (aVar != null) {
                    if (eVar.an.f61400d != null) {
                        Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "on video completed - cancelling existing taskFuture ", eVar.an.f61400d);
                        eVar.an.f61400d.cancel(false);
                        eVar.an.f61400d = null;
                    }
                    eVar.an.f61400d = this.f61776E.scheduleWithFixedDelay(aVar, 500L, SafeDK.getInstance().Z() * 1000, TimeUnit.MILLISECONDS);
                } else {
                    Logger.d(this.f61779a, "set on video completed event has been triggered - impression handler is null, could not start future task.");
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void b() {
        synchronized (f61366L) {
            for (e eVar : f61366L.values()) {
                if (eVar.ab) {
                    Logger.d(this.f61779a, "report fullscreen ad detected, stop taking screenshots, event ID: ", eVar.w(), ", type: ", eVar.f61834p.name());
                    eVar.f61822O = true;
                    eVar.a(l.f62623D, new l.a[0]);
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void c() {
        synchronized (f61366L) {
            for (e eVar : f61366L.values()) {
                if (eVar.ab) {
                    eVar.a(l.f62624E, new l.a[0]);
                }
            }
        }
    }

    public int j() {
        int i2;
        synchronized (f61366L) {
            Iterator<e> it = f61366L.values().iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (it.next().ab) {
                    i2++;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a(e eVar, List<String> list, d dVar) {
        boolean z2;
        boolean z3;
        String strAk;
        String strAj;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    if (eVar.f61818K != null && !list.contains(eVar.f61818K)) {
                        Logger.d(this.f61779a, "web view scanner - ad info view address not found in views hierarchy: ", eVar.f61818K, " adUnitId: ", dVar.f62519a, " no res propagation");
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    CreativeInfo creativeInfoJ = eVar.j();
                    if (creativeInfoJ == null || (strAj = creativeInfoJ.aj()) == null || !WebView.class.isAssignableFrom(Class.forName(strAj))) {
                        z3 = true;
                        strAk = null;
                    } else {
                        strAk = creativeInfoJ.ak();
                        if (strAk != null && !list.contains(strAk)) {
                            Logger.d(this.f61779a, "web view scanner - matching object address not found in views hierarchy: ", strAk, " adUnitId: ", dVar.f62519a, " no res propagation");
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    }
                    if (!z2 || !z3) {
                        Logger.d(this.f61779a, "web view scanner - not all ad views are found in hierarchy - no propagation, adUnitId: ", dVar.f62519a, "viewAddress: ", eVar.f61818K, " matchingObjectAddress: ", strAk);
                        return false;
                    }
                    Logger.d(this.f61779a, "web view scanner - found adInfo view in hierarchy. adUnitId: ", dVar.f62519a, " viewAddress: ", eVar.f61818K, " matchingObjectAddress: ", strAk);
                    return true;
                }
            } catch (Exception e2) {
                Logger.e(this.f61779a, "caught exception", e2.getMessage());
                return false;
            }
        }
        Logger.d(this.f61779a, "web view scanner - no views in hierarchy for info view: ", eVar.f61818K, " adUnitId: ", dVar.f62519a, " no res propagation");
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean f(String str) {
        synchronized (f61366L) {
            for (e eVar : f61366L.values()) {
                if (eVar != null && eVar.ab && eVar.c() != null && eVar.c().equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean r(String str) {
        Set<d> setKeySet;
        e eVar;
        if (str == null) {
            return false;
        }
        Logger.d(this.f61779a, "bannerInfoExists started, creativeId = ", str);
        synchronized (f61366L) {
            setKeySet = f61366L.keySet();
        }
        if (!setKeySet.isEmpty()) {
            for (d dVar : setKeySet) {
                if (dVar != null && (eVar = f61366L.get(dVar)) != null && eVar.z() != null && eVar.z().equals(str)) {
                    Logger.d(this.f61779a, "bannerInfoExists banner info exists : ", eVar);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void a(c cVar, String str, boolean z2) {
        if (cVar instanceof e) {
            a((e) cVar, z2, str);
        }
    }

    public static void a(m mVar) {
        try {
            if (SafeDK.getInstance().Q()) {
                synchronized (f61366L) {
                    for (e eVar : f61366L.values()) {
                        if (eVar != null && eVar.ab && eVar.c() != null && eVar.c().equals(com.safedk.android.utils.h.f63175o)) {
                            eVar.d("MUR:" + System.currentTimeMillis() + l.ad + mVar);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            Logger.d("BannerFinder", "handleMintegralIntentReport exception", e2);
        }
    }

    public static void a(RedirectDetails redirectDetails) {
        try {
            if (SafeDK.getInstance().Q()) {
                synchronized (f61366L) {
                    for (e eVar : f61366L.values()) {
                        if (eVar != null && eVar.ab && eVar.f61831m != null && eVar.f61831m.contains(redirectDetails.f61743f)) {
                            eVar.d("MUR:" + System.currentTimeMillis() + l.ad + redirectDetails);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            Logger.d("BannerFinder", "handleMintegralRedirectReport exception", e2);
        }
    }

    public static void a(v vVar) {
        try {
            if (SafeDK.getInstance().Q()) {
                synchronized (f61366L) {
                    for (e eVar : f61366L.values()) {
                        if (eVar != null && eVar.ab && eVar.f61831m != null && eVar.f61831m.contains(vVar.f62711c)) {
                            eVar.d("MUR:" + System.currentTimeMillis() + l.ad + vVar);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            Logger.d("BannerFinder", "handleMintegralTouchReport exception", e2);
        }
    }

    public static void a(String str, StackTraceElement[] stackTraceElementArr) {
        try {
            if (SafeDK.getInstance().Q()) {
                synchronized (f61366L) {
                    for (e eVar : f61366L.values()) {
                        if (eVar != null && eVar.ab && eVar.f61831m != null && eVar.f61831m.contains(str)) {
                            eVar.d("MUR:" + System.currentTimeMillis() + l.ad + Arrays.asList(stackTraceElementArr));
                        }
                    }
                }
            }
        } catch (Exception e2) {
            Logger.d("BannerFinder", "handleMintegralCallStackTrace exception", e2);
        }
    }

    public static void a(String str, List<String> list) {
        try {
            if (SafeDK.getInstance().Q()) {
                synchronized (f61366L) {
                    for (e eVar : f61366L.values()) {
                        if (eVar != null && eVar.ab && eVar.f61831m != null && eVar.f61831m.contains(str)) {
                            eVar.d("MUR:byAddr:" + System.currentTimeMillis() + l.ad + list);
                            return;
                        }
                    }
                    for (e eVar2 : f61366L.values()) {
                        if (eVar2 != null && eVar2.ab && eVar2.c() != null && eVar2.c().equals(com.safedk.android.utils.h.f63175o)) {
                            eVar2.d("MUR:bySdk:" + System.currentTimeMillis() + l.ad + list);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            Logger.d("BannerFinder", "handleMintegralReflectionCall exception", e2);
        }
    }
}
