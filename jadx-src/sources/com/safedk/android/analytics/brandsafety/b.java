package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.mediation.ads.MaxAdView;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import com.safedk.android.SafeDK;
import com.safedk.android.a.g;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class b implements a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected static final float f61750A = 80.0f;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected static final List<String> f61751B = Arrays.asList(com.safedk.android.utils.h.f63171k);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected static final Map<String, l> f61752F = new LimitedConcurrentHashMap(90);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f61753f = "ad_format";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final String f61754g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final String f61755h = "WILL_DISPLAY";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final String f61756i = "WILL_LOAD";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final String f61757j = "DID_HIDE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final String f61758k = "DID_CLICKED";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final String f61759l = "DID_LOAD";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final String f61760m = "DID_DISPLAY";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final String f61761n = "DID_FAIL_DISPLAY";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final String f61762o = "id";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected static final String f61763p = "network_name";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected static final String f61764q = "third_party_ad_placement_id";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected static final String f61765r = "creative_id";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final String f61766s = "max_ad_unit_id";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final String f61767t = "ad_view";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static final String f61768u = "dsp_name";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f61769v = 120;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f61770w = "revenue_event";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f61771x = "unknown";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f61772y = "no_CI_report";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final String f61773z = "_BIDDING";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f61779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List<String> f61780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected BrandSafetyUtils.AdType f61781c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f61783e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f61782d = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected final Map<String, c> f61774C = new ConcurrentHashMap();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected final Set<String> f61775D = new HashSet();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected final ScheduledExecutorService f61776E = Executors.newScheduledThreadPool(1);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected final List<u> f61777G = new ArrayList();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected Map<String, RedirectData> f61778H = null;

    protected abstract c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5);

    protected b(BrandSafetyUtils.AdType adType, List<String> list, String str, int i2) {
        this.f61783e = 0;
        this.f61779a = str;
        this.f61781c = adType;
        this.f61780b = list;
        this.f61783e = i2;
        Logger.d(str, "ctor started, type: ", adType, ", supported formats: ", list, ", maxAttemptsToCaptureImage = ", Integer.valueOf(i2), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        f();
        com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
        AppLovinBridge.registerToReceiveMaxEvents(this);
        AppLovinBridge.registerToReceiveMaxRevenueEvents(this);
        if (Build.VERSION.SDK_INT >= 21) {
            ((ScheduledThreadPoolExecutor) this.f61776E).setRemoveOnCancelPolicy(true);
            Logger.d(this.f61779a, "ctor thread pool removal policy set");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c d(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public BrandSafetyUtils.AdType a() {
        return this.f61781c;
    }

    public int d() {
        return this.f61774C.size();
    }

    private void f() {
        List<BrandSafetyUtils.d> listC = BrandSafetyUtils.c(this.f61781c);
        for (int i2 = 0; i2 < listC.size(); i2++) {
            BrandSafetyUtils.d dVar = listC.get(i2);
            String str = dVar.a() + "_" + dVar.c();
            synchronized (this.f61774C) {
                this.f61774C.put(str, a(dVar.a(), dVar.b(), dVar.c(), dVar.d(), dVar.e(), dVar.f()));
            }
        }
        Logger.d(this.f61779a, "restore impressions for upload - number of loaded impressions to report ", Integer.valueOf(this.f61774C.size()), " ", this.f61774C.keySet());
        if (this.f61774C.size() > 0 && StatsCollector.b()) {
            e();
        }
    }

    protected boolean a(String str, View view) {
        AdNetworkDiscovery adNetworkDiscoveryJ;
        if (str != null && (adNetworkDiscoveryJ = CreativeInfoManager.j(str)) != null) {
            return adNetworkDiscoveryJ.e(view);
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void a(FileUploadManager.b bVar, FileUploadManager.a aVar, String str, String str2) {
        Logger.d(this.f61779a, "handle upload request started, imageToUpload=", str, ", adInfoCollectionForUpload=", this.f61774C);
        if (this.f61774C.get(str) != null) {
            a(str, bVar, aVar, str2);
        } else {
            Logger.d(this.f61779a, "handle upload request - adInfoCollectionForUpload doesn't contain imageToUpload ", str);
        }
        Logger.d(this.f61779a, "handle upload request - adInfoCollectionForUpload remove key ", str);
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void g(String str) {
        Logger.d(this.f61779a, "handle discard request started, imageToDiscard=", str, ", adInfoCollectionForUpload=", this.f61774C, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        h(str);
        c cVar = this.f61774C.get(str);
        if (cVar != null) {
            for (k kVar : cVar.g()) {
                if (str.contains(kVar.f62596a)) {
                    b(kVar);
                }
            }
        }
        Logger.d(this.f61779a, "handle discard request - adInfoCollectionForUpload remove key ", str);
        synchronized (this.f61774C) {
            this.f61774C.remove(str);
            Logger.d(this.f61779a, "handle discard request - number of loaded impressions to report ", Integer.valueOf(this.f61774C.size()), " ", this.f61774C.keySet());
        }
    }

    public void h(String str) {
        Logger.d(this.f61779a, "Cleaning stored impressions: ", str);
        BrandSafetyUtils.a(this.f61781c, str);
        i(str);
    }

    protected void i(String str) {
        Logger.d(this.f61779a, "removal all impression images started, reportedImage = ", str, ", adInfoCollectionForUpload keys = ", this.f61774C.keySet(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (str.contains("_")) {
            String str2 = str.split("_")[1];
            Logger.d(this.f61779a, "removal all impression images impressionId = ", str2);
            synchronized (this.f61774C) {
                Iterator<Map.Entry<String, c>> it = this.f61774C.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, c> next = it.next();
                    if (next.getKey().endsWith(str2)) {
                        Logger.d(this.f61779a, "removal all impression images removing ", next.getKey(), " ");
                        it.remove();
                    }
                }
                Logger.d(this.f61779a, "removal all impression images - number of loaded impressions to report ", Integer.valueOf(this.f61774C.size()), " ", this.f61774C.keySet());
            }
        }
        File file = new File(SafeDK.getInstance().ae() + this.f61781c);
        Logger.d(this.f61779a, "removal all impression images getting files for dir", file.getPath());
        Logger.d(this.f61779a, "removal all impression images files for dir", file.getPath(), " : ", com.safedk.android.utils.b.a(file.getPath()));
    }

    protected String j(String str) {
        String[] strArrSplit;
        if (str != null && (strArrSplit = new File(str).getName().replace(".jpg", "").split("_")) != null && strArrSplit.length >= 4) {
            return strArrSplit[0] + "_" + strArrSplit[2];
        }
        return null;
    }

    private void a(final String str, final FileUploadManager.b bVar, final FileUploadManager.a aVar, final String str2) {
        synchronized (this.f61774C) {
            Logger.d(this.f61779a, "Uploading impression ", str, " to server, timeout=", Integer.valueOf(SafeDK.getInstance().L()), "ms", ", adInfoCollectionForUpload = ", this.f61774C, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        }
        this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.a(str, bVar, aVar, str2, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0272 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(final String str, final FileUploadManager.b bVar, final FileUploadManager.a aVar, final String str2, final int i2) {
        String str3;
        String strName;
        BrandSafetyUtils.ScreenShotOrientation screenShotOrientation;
        g.a aVarA;
        char c2;
        c cVar = this.f61774C.get(str);
        if (cVar == null) {
            Logger.d(this.f61779a, "impressionInfoToUpload is null");
            return;
        }
        Iterator<k> it = cVar.g().iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                strName = null;
                screenShotOrientation = null;
                break;
            }
            k next = it.next();
            if (next.f62597c != null) {
                if (str.equals(next.f62597c.f62584a + "_" + next.f62596a)) {
                    String str4 = next.f62597c.f62585b;
                    BrandSafetyUtils.ScreenShotOrientation screenShotOrientation2 = next.f62597c.f62589f;
                    if (next.j() == null) {
                        str3 = str4;
                        screenShotOrientation = screenShotOrientation2;
                        strName = null;
                    } else {
                        screenShotOrientation = screenShotOrientation2;
                        strName = next.j().K();
                        str3 = str4;
                    }
                }
            }
        }
        if (str3 == null || !new File(str3).exists()) {
            Logger.d(this.f61779a, "Uploading impression - not found, not uploading, filename ", str3);
            return;
        }
        String strR = BrandSafetyUtils.r(str3);
        Logger.d(this.f61779a, "Uploading impression - ad type ", cVar.f61834p, ", file hash is ", strR, ", imageToUpload = ", str, ", match ? ", Boolean.valueOf(str.startsWith(strR)), ", fingerprint = ", str2);
        if (!str.startsWith(strR)) {
            Logger.d(this.f61779a, "Uploading impression - fileHash ", strR, ", imageToUpload = ", str, " does not match, not uploading");
            return;
        }
        try {
        } catch (IOException e2) {
            if (i2 < 2) {
                int i3 = com.safedk.android.a.g.f61258h[i2];
                Logger.d(this.f61779a, "IOException when uploading file, next retry in ", Integer.valueOf(i3), " ms, file: ", str3);
                this.f61776E.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.a(str, bVar, aVar, str2, i2 + 1);
                    }
                }, i3, TimeUnit.MILLISECONDS);
                return;
            }
            Logger.d(this.f61779a, "IOException when uploading file ", str3, " : ", e2.getMessage(), e2);
            return;
        } catch (Throwable th) {
            Logger.e(this.f61779a, "Failed to upload file ", str3, " : ", th.getMessage(), th);
            aVarA = null;
        }
        if (bVar != null) {
            aVarA = new com.safedk.android.a.c(str3, str, SafeDK.getInstance().L(), bVar).a();
        } else {
            if (aVar == null) {
                aVarA = null;
                if (aVarA != null) {
                    Logger.d(this.f61779a, "upload response is null, imageToUpload = ", str);
                    i(str);
                } else {
                    String strA = aVarA.a();
                    String strC = aVarA.c();
                    if (strName == null) {
                        BrandSafetyEvent.AdFormatType adFormatTypeA = BrandSafetyUtils.a(cVar.r());
                        strName = adFormatTypeA != null ? adFormatTypeA.name() : null;
                    }
                    if (strName != null) {
                        c2 = 0;
                    } else {
                        strName = BrandSafetyUtils.a(this.f61781c).name();
                        c2 = 0;
                        Logger.d(this.f61779a, "adFormat set to ", strName);
                    }
                    String str5 = this.f61779a;
                    Object[] objArr = new Object[4];
                    objArr[c2] = "Upload impression image succeeded: ";
                    objArr[1] = strA;
                    objArr[2] = ", return code =";
                    objArr[3] = Integer.valueOf(aVarA.b());
                    Logger.d(str5, objArr);
                    if (strA != null && !strA.isEmpty()) {
                        Bundle bundle = new Bundle();
                        try {
                            bundle.putString(FileUploadManager.f61565c, str2);
                            bundle.putString("ad_format_type", strName);
                            bundle.putString(c.f61803h, strA);
                            bundle.putString("image_orientation", screenShotOrientation.name().toLowerCase());
                            bundle.putString(AppLovinBridge.f61288f, AppLovinBridge.f61290h);
                            bundle.putString("image_id", strC);
                            bundle.putString("package", SafeDK.getInstance().m().getPackageName());
                        } catch (Throwable th2) {
                            Logger.e(this.f61779a, th2.getMessage(), th2);
                            new CrashReporter().caughtException(th2);
                        }
                        g.a(bundle);
                        Logger.d(this.f61779a, "Upload impression image - attempting to remove the file ", bundle.getString(c.f61803h));
                        h(str);
                    }
                }
                synchronized (this.f61774C) {
                    this.f61774C.remove(str);
                }
                Logger.d(this.f61779a, "Upload impression image - number of loaded impressions to report ", Integer.valueOf(this.f61774C.size()), " ", this.f61774C.keySet());
                return;
            }
            aVarA = new com.safedk.android.a.a(str3, str, SafeDK.getInstance().L(), aVar).a();
        }
        if (aVarA != null) {
        }
        synchronized (this.f61774C) {
        }
    }

    public synchronized void e() {
        Logger.d(this.f61779a, "synchronize impressions and events - impression size is: ", Integer.valueOf(this.f61774C.size()), " and keys: ", this.f61774C.keySet(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        Logger.d(this.f61779a, "synchronize impressions and events - BrandSafetyEvents keys ", StatsCollector.c().a(StatsCollector.EventType.BrandSafety).keySet());
        ConcurrentHashMap<String, StatsEvent> concurrentHashMapA = StatsCollector.c().a(StatsCollector.EventType.BrandSafety);
        Iterator<Map.Entry<String, c>> it = this.f61774C.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            c value = next.getValue();
            String key = next.getKey();
            k kVarI = value.i();
            if (kVarI != null) {
                if (kVarI.f62597c != null && kVarI.f62597c.f62585b != null) {
                    Logger.d(this.f61779a, "synchronize impressions and events - deleting file: ", kVarI.f62597c.f62585b);
                    BrandSafetyUtils.d(kVarI.f62597c.f62585b);
                }
                BrandSafetyEvent brandSafetyEvent = (BrandSafetyEvent) concurrentHashMapA.get(kVarI.f62596a);
                if (brandSafetyEvent == null || key == null || !key.equals(brandSafetyEvent.h())) {
                    String str = this.f61779a;
                    Object[] objArr = new Object[6];
                    objArr[0] = "synchronize impressions and events - remove impressionId: ";
                    objArr[1] = kVarI.f62596a;
                    objArr[2] = ", impression hash: ";
                    objArr[3] = key;
                    objArr[4] = ", event hash: ";
                    objArr[5] = brandSafetyEvent != null ? brandSafetyEvent.h() : V8ValueNull.NULL;
                    Logger.d(str, objArr);
                    it.remove();
                } else if (brandSafetyEvent.h() != null) {
                    Logger.d(this.f61779a, "synchronize impressions and events - clearing image hash value: ", brandSafetyEvent.h());
                    brandSafetyEvent.c();
                }
            }
        }
        Logger.d(this.f61779a, "synchronize impressions and events - number of loaded impressions to report ", Integer.valueOf(this.f61774C.size()), " ", this.f61774C.keySet());
    }

    public static c k(String str) {
        if (str != null) {
            for (b bVar : SafeDK.getInstance().y()) {
                synchronized (bVar.f61774C) {
                    Logger.d("AdFinderBase", "get impression ad info by image ID: ", str, ", type: ", bVar.a(), ", keys: ", bVar.f61774C.keySet(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                }
                c cVar = bVar.f61774C.get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c c(String str) {
        return null;
    }

    public c l(String str) {
        return null;
    }

    public void a(c cVar, k kVar) {
        if (cVar != null && kVar.f62597c != null && kVar.f62597c.f62584a != null && kVar.f62596a != null) {
            Logger.d(this.f61779a, "add info collection for upload ", kVar.f62597c.f62584a, "_", kVar.f62596a, ", file = ", kVar.f62597c.f62585b);
            synchronized (this.f61774C) {
                this.f61774C.put(kVar.f62597c.f62584a + "_" + kVar.f62596a, cVar);
                Logger.d(this.f61779a, "add info collection for upload - number of loaded impressions to report ", Integer.valueOf(this.f61774C.size()), " ", this.f61774C.keySet());
            }
        }
    }

    public boolean c(String str, String str2) {
        return this.f61774C.containsKey(str + "_" + str2);
    }

    public boolean d(String str, String str2) {
        return this.f61775D.contains(str + "_" + str2);
    }

    protected boolean d(String str, String str2, String str3) {
        boolean z2;
        BrandSafetyUtils.a aVarB;
        try {
            if (new File(str).exists()) {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                if (com.safedk.android.utils.n.a(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight()) || com.safedk.android.utils.n.b(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight())) {
                    aVarB = BrandSafetyUtils.b(str2, bitmapDecodeFile);
                    z2 = BrandSafetyUtils.b(str2, aVarB) == BrandSafetyUtils.ScreenshotValidity.VALID;
                } else {
                    aVarB = BrandSafetyUtils.a(str2, bitmapDecodeFile);
                    z2 = BrandSafetyUtils.a(str2, aVarB) == BrandSafetyUtils.ScreenshotValidity.VALID;
                }
                try {
                    Logger.d(this.f61779a, "Image file validation check hashValue = ", str3, ", dimen h,w: ", Integer.valueOf(bitmapDecodeFile.getHeight()), ",", Integer.valueOf(bitmapDecodeFile.getWidth()), ", bitmapScanResult result = ", aVarB, ", isValid = ", Boolean.valueOf(z2), ", filename = ", str);
                    return z2;
                } catch (Throwable th) {
                    th = th;
                    Logger.d(this.f61779a, "Image file validation check exception : ", th.getMessage(), th);
                    return z2;
                }
            }
            Logger.d(this.f61779a, "Image file validation check file does not exist = ", str);
            return true;
        } catch (Throwable th2) {
            th = th2;
            z2 = true;
        }
    }

    protected String a(List<o> list) {
        if (list == null || list.size() == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            sb.append(list.get(i2).f62690a.ak());
            sb.append(", ");
        }
        sb.append(list.get(list.size() - 1).f62690a.ak());
        sb.append("]");
        return sb.toString();
    }

    protected static String[] a(Activity activity) {
        String str;
        String strA = null;
        if (activity == null) {
            str = null;
        } else {
            String string = activity.toString();
            String strA2 = BrandSafetyUtils.a(string, true);
            strA = BrandSafetyUtils.a(string, false);
            str = strA2;
        }
        return new String[]{strA, str};
    }

    protected void a(c cVar) {
        if (cVar != null && !cVar.f61816I) {
            Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "clearing any images taken previously");
            k kVarI = cVar.i();
            if (kVarI != null) {
                a(kVarI);
            }
            cVar.f61816I = true;
            return;
        }
        Logger.d(this.f61779a, "avoid clearing any images taken previously");
    }

    public void a(k kVar) {
        String str = this.f61779a;
        Object[] objArr = new Object[4];
        objArr[0] = "remove impression screenshots started with impression: ";
        objArr[1] = kVar;
        objArr[2] = ", report impression size is: ";
        Set<String> set = this.f61775D;
        objArr[3] = set != null ? Integer.valueOf(set.size()) : V8ValueNull.NULL;
        Logger.d(str, objArr);
        if (kVar != null) {
            String str2 = kVar.f62598d;
            if (str2 == null && kVar.f62597c != null) {
                str2 = kVar.f62597c.f62585b;
            }
            if (str2 != null) {
                Logger.d(this.f61779a, "Calling remove ad files, filename = ", str2);
                BrandSafetyUtils.d(str2);
                kVar.f62598d = null;
            } else {
                Logger.d(this.f61779a, "lastActivityImpressionScreenshotFilename is null and image is: ", kVar.f62597c);
            }
        }
        this.f61775D.clear();
    }

    public static boolean a(c cVar, CreativeInfo creativeInfo) {
        String strA;
        return CreativeInfoManager.a(creativeInfo.T() == null ? creativeInfo.S() : creativeInfo.T(), AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID, false) && (strA = CreativeInfoManager.a(creativeInfo.S(), AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID_MAX_NETWORK_NAMES, (String) null)) != null && strA.contains(cVar.A()) && cVar.z() != null;
    }

    protected void b(c cVar, CreativeInfo creativeInfo) {
        Logger.d(this.f61779a, "should replace prefetch creativeId with max value, ad info sdk : ", cVar.c(), ", ci sdk : ", creativeInfo.S(), ", actual sdk : ", creativeInfo.T());
        if (a(cVar, creativeInfo)) {
            Logger.d(this.f61779a, "updating creativeId from ", cVar.j().P(), " to ", cVar.z());
            cVar.j().k(cVar.z());
        }
    }

    static void a(ViewGroup viewGroup, List<WeakReference<View>> list) {
        if (viewGroup == null) {
            return;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            list.add(new WeakReference<>(childAt));
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, list);
            }
        }
    }

    static List<WeakReference<View>> a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeakReference(viewGroup));
        a(viewGroup, arrayList);
        return arrayList;
    }

    protected List<WeakReference<WebView>> b(List<WeakReference<View>> list) {
        ArrayList arrayList = new ArrayList();
        for (WeakReference<View> weakReference : list) {
            if (com.safedk.android.utils.n.a((Reference<?>) weakReference) && (weakReference.get() instanceof WebView)) {
                WebView webView = (WebView) weakReference.get();
                arrayList.add(new WeakReference(webView));
                Logger.d(this.f61779a, "getWebViews added WebView address ", webView);
            }
        }
        return arrayList;
    }

    static List<String> c(List<WeakReference<View>> list) {
        ArrayList arrayList = new ArrayList();
        for (WeakReference<View> weakReference : list) {
            if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                arrayList.add(BrandSafetyUtils.a(weakReference.get()));
            } else {
                arrayList.add("");
            }
        }
        return arrayList;
    }

    public Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Logger.d(this.f61779a, "getActivity: now context type is: ", context.getClass().getName());
        }
        return null;
    }

    static Activity a(Bundle bundle) {
        Logger.d("AdFinderBase", "getMaxAdViewActivity: started", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        String strN = BrandSafetyUtils.n(bundle.getString(f61767t, null));
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        try {
        } catch (Exception e2) {
            Logger.d("AdFinderBase", "getMaxAdViewActivity: exception occurred ", e2.getMessage());
        }
        for (WeakReference<Activity> weakReference : com.safedk.android.internal.b.getInstance().getAppActivities()) {
            if (weakReference != null && weakReference.get() != null) {
                Activity activity = weakReference.get();
                View viewFindViewById = activity.findViewById(R.id.content);
                if ((viewFindViewById instanceof ViewGroup) && c(a((ViewGroup) viewFindViewById)).contains(strN)) {
                    Logger.d("AdFinderBase", "getMaxAdViewActivity: found activity with name ", activity.getClass().getName());
                    return activity;
                }
                return foregroundActivity;
            }
        }
        return foregroundActivity;
    }

    void b(Activity activity) {
        String strA = BrandSafetyUtils.a(com.safedk.android.internal.b.getInstance().getForegroundActivity().getClass().getName(), true);
        String strA2 = BrandSafetyUtils.a(activity.getClass().getName(), true);
        if (strA2 != null && !strA2.equals(strA)) {
            Logger.d(this.f61779a, "compare ad activity to foreground found ad activity different than foreground, ", "foreground address is: ", strA, ", and activity address is: ", strA2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void c(String str, String str2, String str3) {
    }

    public static boolean e(String str, String str2) {
        l lVar;
        if (str != null && (lVar = f61752F.get(str)) != null) {
            return lVar.a(str2);
        }
        return false;
    }

    public static void a(String str, Long l2, Long l5, String str2, l.a... aVarArr) {
        if (str != null) {
            synchronized (f61752F) {
                l lVar = f61752F.get(str);
                if (lVar == null) {
                    lVar = new l();
                    f61752F.put(str, lVar);
                    Logger.d("AdFinderBase", "add impression log event - key: ", str, ", impression log map size: ", Integer.valueOf(f61752F.size()));
                }
                lVar.a(l2, l5, str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void a(String str, String str2, l.a... aVarArr) {
        if (str != null) {
            synchronized (f61752F) {
                l lVar = f61752F.get(str);
                if (lVar == null) {
                    lVar = new l();
                    f61752F.put(str, lVar);
                    Logger.d("AdFinderBase", "add impression log event - key: ", str, ", impression log map size: ", Integer.valueOf(f61752F.size()));
                }
                lVar.a(str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void a(c cVar, String str, l.a... aVarArr) {
        if (cVar != null) {
            if (cVar.f61818K != null) {
                a(cVar.f61818K, str, aVarArr);
                return;
            } else {
                cVar.a(str, aVarArr);
                return;
            }
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void b(String str, String str2, l.a... aVarArr) {
        if (str != null) {
            synchronized (f61752F) {
                l lVar = f61752F.get(str);
                if (lVar == null) {
                    lVar = new l();
                    f61752F.put(str, lVar);
                    Logger.d("AdFinderBase", "add cumulative impression log event - key: ", str, ", impression log map size: ", Integer.valueOf(f61752F.size()));
                }
                lVar.b(str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add cumulative impression log event - event id is null, not adding impression log event");
    }

    protected static void b(c cVar) {
        if (cVar != null) {
            synchronized (f61752F) {
                if (cVar.f61819L != null && f61752F.remove(cVar.f61819L) != null) {
                    Logger.d("AdFinderBase", "clear impression log, eventId: ", cVar.f61819L, ", impression log map size: ", Integer.valueOf(f61752F.size()));
                }
                if (cVar.x() != null) {
                    for (String str : cVar.x()) {
                        if (str != null && f61752F.remove(str) != null) {
                            Logger.d("AdFinderBase", "clear impression log, viewAddress: ", str, ", impression log map size: ", Integer.valueOf(f61752F.size()));
                        }
                    }
                } else if (cVar.f61818K != null && f61752F.remove(cVar.f61818K) != null) {
                    Logger.d("AdFinderBase", "clear impression log, viewAddress: ", cVar.f61818K, ", impression log map size: ", Integer.valueOf(f61752F.size()));
                }
            }
        }
    }

    protected static l b(c cVar, k kVar) {
        l lVarRemove;
        l lVarRemove2;
        l lVarRemove3;
        if (cVar != null && kVar != null) {
            synchronized (f61752F) {
                if (cVar.f61819L != null && (lVarRemove3 = f61752F.remove(cVar.f61819L)) != null) {
                    cVar.f61825R.a(lVarRemove3);
                    Logger.d("AdFinderBase", "collect impression logs - key: ", cVar.f61819L, ", events: ", Integer.valueOf(lVarRemove3.a()), ", impression log map size: ", Integer.valueOf(f61752F.size()));
                }
                if (!cVar.f61827U) {
                    if (cVar.x() != null) {
                        for (String str : cVar.x()) {
                            if (str != null && (lVarRemove2 = f61752F.remove(str)) != null) {
                                kVar.f62602h.a(lVarRemove2);
                                Logger.d("AdFinderBase", "collect impression logs - key: ", str, ", events: ", Integer.valueOf(lVarRemove2.a()), ", impression log map size: ", Integer.valueOf(f61752F.size()));
                            }
                        }
                    } else if (cVar.f61818K != null && (lVarRemove = f61752F.remove(cVar.f61818K)) != null) {
                        kVar.f62602h.a(lVarRemove);
                        Logger.d("AdFinderBase", "collect impression logs - key: ", cVar.f61818K, ", events: ", Integer.valueOf(lVarRemove.a()), ", impression log map size: ", Integer.valueOf(f61752F.size()));
                    }
                }
            }
            l lVar = new l(cVar.f61825R);
            lVar.a(kVar.f62602h);
            StringBuilder sb = new StringBuilder("collect impression logs, ad info: ");
            sb.append(cVar.f61825R.a());
            sb.append(", impression: ");
            sb.append(kVar.f62602h.a());
            if (kVar.j() != null) {
                l lVarG = kVar.j().G();
                lVar.a(lVarG);
                sb.append(", ci: ");
                sb.append(lVarG.a());
            }
            sb.append(", total: ");
            sb.append(lVar.a());
            Logger.d("AdFinderBase", sb.toString());
            return lVar;
        }
        return null;
    }

    public static List<String> a(View view) {
        if (view == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            arrayList.add(parent.toString());
        }
        return arrayList;
    }

    public static List<ViewParent> b(View view) {
        ArrayList arrayList = new ArrayList();
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            arrayList.add(parent);
        }
        return arrayList;
    }

    public static void a(ViewGroup viewGroup, List<String> list, List<String> list2, int i2) {
        if (viewGroup == null) {
            return;
        }
        int i3 = i2 + 1;
        int i5 = 0;
        while (i5 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i5);
            list.add(BrandSafetyUtils.a(childAt));
            StringBuilder sb = new StringBuilder();
            sb.append(CmcdData.STREAMING_FORMAT_HLS);
            sb.append(i3);
            sb.append("c");
            i5++;
            sb.append(i5);
            sb.append(":");
            sb.append(childAt);
            list2.add(sb.toString());
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, list, list2, i3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.webkit.WebView] */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static BrandSafetyUtils.AdType a(String str, WebView webView) {
        if (webView != 0) {
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
            do {
                if (webView instanceof View) {
                    View view = (View) webView;
                    if (com.safedk.android.utils.n.a(view.getWidth(), view.getHeight())) {
                        Logger.d("AdFinderBase", "extract ad type from view: ", view, ", BANNER ratio", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                        return BrandSafetyUtils.AdType.BANNER;
                    }
                    if (com.safedk.android.utils.n.b(view.getWidth(), view.getHeight())) {
                        Logger.d("AdFinderBase", "extract ad type from view: ", view, ", MREC ratio", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                        return BrandSafetyUtils.AdType.MREC;
                    }
                    if (webView instanceof MaxAdView) {
                        BrandSafetyUtils.AdType adType = BannerFinder.f().get(BrandSafetyUtils.a((Object) webView));
                        if (adType != null) {
                            Logger.d("AdFinderBase", "extract ad type from view: ", view, ", MaxAdView type: ", adType.name(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                            return adType;
                        }
                    } else if (adNetworkDiscoveryJ != null) {
                        BrandSafetyUtils.AdType adTypeF = adNetworkDiscoveryJ.f(view);
                        if (adTypeF != null) {
                            Logger.d("AdFinderBase", "extract ad type from view: ", view, ", discovery detected type: ", adTypeF);
                            return adTypeF;
                        }
                    } else if (com.safedk.android.internal.b.getInstance().isInterstitialActivity(view.getContext()) && SafeDK.getInstance().A().c(BrandSafetyUtils.a(view)) == null) {
                        Logger.d("AdFinderBase", "extract ad type from view: ", view, ", INTERSTITIAL activity: ", view.getContext(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                        return BrandSafetyUtils.AdType.INTERSTITIAL;
                    }
                }
                Logger.d("AdFinderBase", new Object[]{"extract ad type from view: ", webView, ", not detected"});
                webView = webView.getParent();
            } while (webView != 0);
        }
        Logger.d("AdFinderBase", "extract ad type from view: failed to extract");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(Bitmap bitmap, c cVar) {
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void b() {
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void c() {
    }

    protected void b(ViewGroup viewGroup, List<WeakReference<WebView>> list) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            try {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof WebView) {
                    list.add(new WeakReference<>((WebView) childAt));
                    String str = this.f61779a;
                    Object[] objArr = new Object[4];
                    objArr[0] = "find WebViews in view group - found view: ";
                    objArr[1] = childAt;
                    objArr[2] = " , parent: ";
                    objArr[3] = childAt.getParent() != null ? childAt.getParent().toString() : V8ValueNull.NULL;
                    Logger.d(str, objArr);
                } else if (childAt instanceof ViewGroup) {
                    b((ViewGroup) childAt, list);
                }
            } catch (Throwable th) {
                Logger.d(this.f61779a, "caught exception: ", th);
                return;
            }
        }
    }

    static void c(ViewGroup viewGroup, List<WeakReference<View>> list) {
        if (viewGroup == null) {
            return;
        }
        View view = list.get(0).get();
        long width = view.getWidth() * view.getHeight();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            long width2 = childAt.getWidth() * childAt.getHeight();
            if (width > 0 && width2 > 0 && (width2 / width) * 100.0f >= f61750A) {
                list.add(new WeakReference<>(childAt));
            }
            if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt, list);
            }
        }
    }

    public c b(String str, x xVar) {
        v vVarA;
        String strC = xVar.c();
        c cVarC = c(strC);
        if (cVarC != null && cVarC.c().equals(str)) {
            char c2 = 0;
            Logger.d(this.f61779a, "handle website opened for ", str, " ", cVarC.f61834p.name(), ", view address: ", xVar.c(), ", requested URL: ", xVar.a(), ", target URL: ", xVar.b());
            RedirectData redirectData = new RedirectData(str, BrandSafetyUtils.a(cVarC.f61834p));
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int iH = SafeDK.getInstance().h();
            int size = cVarC.x().size() - 1;
            boolean z2 = false;
            v vVar = null;
            while (true) {
                if (size < 0) {
                    vVarA = vVar;
                    break;
                }
                vVarA = DetectTouchUtils.a(str, cVarC.x().get(size));
                long jLongValue = vVarA == null ? 0L : vVarA.f62709a.longValue();
                String str2 = this.f61779a;
                Object[] objArr = new Object[8];
                objArr[c2] = "handle website opened, view: ";
                objArr[1] = strC;
                objArr[2] = ", last touch event time: ";
                objArr[3] = Long.valueOf(jLongValue);
                objArr[4] = ", diff: ";
                long j2 = jElapsedRealtime - jLongValue;
                objArr[5] = Long.valueOf(j2);
                objArr[6] = ", threshold: ";
                objArr[7] = Integer.valueOf(iH);
                Logger.d(str2, objArr);
                z2 = (iH == 0 || jLongValue == 0 || j2 > ((long) iH)) ? false : true;
                if (z2) {
                    break;
                }
                size--;
                vVar = vVarA;
                c2 = 0;
            }
            xVar.a(cVarC);
            xVar.a(vVarA);
            xVar.e();
            k kVarI = cVarC.i();
            if (kVarI != null) {
                redirectData.a(xVar.a(), xVar.b());
                redirectData.f61729l = !z2;
                String str3 = this.f61779a;
                Object[] objArr2 = new Object[12];
                objArr2[0] = "handle ";
                objArr2[1] = redirectData.f61729l ? "auto " : "";
                objArr2[2] = "website opened for ";
                objArr2[3] = str;
                objArr2[4] = " ";
                objArr2[5] = cVarC.f61834p.name();
                objArr2[6] = ", view address: ";
                objArr2[7] = strC;
                objArr2[8] = ", requested URL: ";
                objArr2[9] = xVar.a();
                objArr2[10] = ", redirect URL: ";
                objArr2[11] = xVar.b();
                Logger.d(str3, objArr2);
                kVarI.a(redirectData);
                return cVarC;
            }
            return null;
        }
        return null;
    }

    public void a(u uVar) {
        this.f61777G.add(uVar);
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c a(String str, RedirectDetails redirectDetails, m mVar, boolean z2, boolean z3) {
        String str2;
        c cVar;
        c cVar2;
        boolean z4;
        Logger.d(this.f61779a, Logger.FeatureTag.REDIRECTS, "handle ", redirectDetails.f61742e.name().toLowerCase(), " for ", str, " ", this.f61781c.name(), ", view address: ", redirectDetails.f61743f, ", requested URL: ", redirectDetails.f61744g, ", redirect URL: ", mVar.f62678d, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        RedirectData redirectData = new RedirectData(str, BrandSafetyUtils.a(redirectDetails.f61741d));
        if (redirectDetails.f61742e == RedirectDetails.RedirectType.REDIRECT) {
            String str3 = mVar.f62680f;
            if (TextUtils.isEmpty(str3)) {
                str3 = z2 ? RedirectEvent.f62800h : RedirectEvent.f62801i;
            }
            redirectData.a(redirectDetails.f61744g, mVar.f62678d, str3);
        } else if (redirectDetails.f61742e == RedirectDetails.RedirectType.EXPAND) {
            redirectData.b(redirectDetails.f61744g, mVar.f62678d, mVar.f62679e);
            redirectData.a("expandedWebviewAddress=" + mVar.f62679e);
        }
        if (redirectData.f61726i || redirectData.f61727j) {
            if (redirectDetails.f61746i != null) {
                redirectData.a("prev " + redirectDetails.f61746i);
            }
            if (mVar.f62681g != null) {
                redirectData.a("prev " + mVar.f62681g);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int iF = SafeDK.getInstance().f();
            c cVarC = c(redirectDetails.f61743f);
            String str4 = "typ";
            if (cVarC != null && str.equals(cVarC.f61840v)) {
                int size = cVarC.f61831m.size() - 1;
                boolean z5 = false;
                while (true) {
                    if (size < 0) {
                        str2 = str4;
                        cVar = cVarC;
                        break;
                    }
                    String str5 = cVarC.f61831m.get(size);
                    v vVarA = DetectTouchUtils.a(str, str5);
                    long jLongValue = vVarA == null ? 0L : vVarA.f62709a.longValue();
                    str2 = str4;
                    cVar = cVarC;
                    long j2 = jElapsedRealtime - jLongValue;
                    Logger.d(this.f61779a, Logger.FeatureTag.REDIRECTS, "handle ", redirectDetails.f61742e.name().toLowerCase(), ", view: ", str5, ", last touch event time: ", Long.valueOf(jLongValue), ", diff: ", Long.valueOf(j2), ", threshold: ", Integer.valueOf(iF));
                    z5 = (iF == 0 || jLongValue == 0 || j2 > ((long) iF)) ? false : true;
                    if (z5) {
                        break;
                    }
                    size--;
                    str4 = str2;
                    cVarC = cVar;
                }
                redirectData.f61729l = !z5;
                String str6 = this.f61779a;
                Logger.FeatureTag featureTag = Logger.FeatureTag.REDIRECTS;
                Object[] objArr = new Object[13];
                objArr[0] = "handle ";
                objArr[1] = redirectData.f61729l ? "auto " : "";
                objArr[2] = redirectDetails.f61742e.name().toLowerCase();
                objArr[3] = " for ";
                objArr[4] = str;
                objArr[5] = " ";
                objArr[6] = this.f61781c.name();
                objArr[7] = ", view address: ";
                objArr[8] = redirectDetails.f61743f;
                objArr[9] = ", requested URL: ";
                objArr[10] = redirectDetails.f61744g;
                objArr[11] = ", redirect URL: ";
                objArr[12] = mVar.f62678d;
                Logger.d(str6, featureTag, objArr);
                if (z3) {
                    if (redirectData.f61727j || (redirectData.f61726i && redirectData.f61729l)) {
                        if (redirectData.f61737t == null) {
                            redirectData.f61737t = BrandSafetyUtils.a(this.f61781c);
                        }
                        if (!redirectData.f61727j) {
                            cVar2 = cVar;
                        } else {
                            cVar2 = cVar;
                            cVar2.f61828V = true;
                        }
                        k kVarI = cVar2.i();
                        if (kVarI != null) {
                            if (redirectData.f61727j) {
                                l.a[] aVarArr = new l.a[1];
                                aVarArr[0] = new l.a(str2, redirectData.f61729l ? TtmlNode.TEXT_EMPHASIS_AUTO : "regular");
                                cVar2.a(l.f62670y, aVarArr);
                                z4 = false;
                            } else {
                                l.a[] aVarArr2 = new l.a[1];
                                z4 = false;
                                aVarArr2[0] = new l.a(l.f62632M, z2 ? RedirectEvent.f62800h : RedirectEvent.f62801i);
                                cVar2.a(l.f62669x, aVarArr2);
                            }
                            kVarI.a(redirectData);
                            a(cVar2, "handleRedirect", z4);
                            return cVar2;
                        }
                        return null;
                    }
                    Logger.d(this.f61779a, "skip reporting ", redirectDetails.f61742e.name().toLowerCase(), " for ", str, " ", this.f61781c.name(), ", view address: ", redirectDetails.f61743f, ", requested URL: ", redirectDetails.f61744g, ", redirect URL: ", mVar.f62678d);
                    return null;
                }
                String str7 = str2;
                c cVar3 = cVar;
                Logger.d(this.f61779a, "add redirect intent log events to ad info, ", redirectDetails, ", ", mVar);
                Long l2 = mVar.f62675a;
                Long l5 = mVar.f62676b;
                l.a[] aVarArr3 = new l.a[2];
                aVarArr3[0] = new l.a(str7, mVar.f62680f != null ? mVar.f62680f : "normal");
                aVarArr3[1] = new l.a("url", mVar.f62678d);
                cVar3.a(l2, l5, l.f62668w, aVarArr3);
                return cVar3;
            }
            if (z3) {
                v vVarA2 = DetectTouchUtils.a(str, redirectDetails.f61743f);
                if (vVarA2 == null) {
                    Logger.d(this.f61779a, "handle ", redirectDetails.f61742e.name().toLowerCase(), " for ", str, " ", this.f61781c.name(), ", try to get last touch event from by package name only");
                    vVarA2 = DetectTouchUtils.a(str);
                }
                long jLongValue2 = vVarA2 == null ? 0L : vVarA2.f62709a.longValue();
                long j3 = jElapsedRealtime - jLongValue2;
                Logger.d(this.f61779a, Logger.FeatureTag.REDIRECTS, "handle ", redirectDetails.f61742e.name().toLowerCase(), ", last touch event time: ", Long.valueOf(jLongValue2), ", diff: ", Long.valueOf(j3), ", threshold: ", Integer.valueOf(iF));
                redirectData.f61729l = iF == 0 || jLongValue2 == 0 || j3 > ((long) iF);
                if (redirectData.f61727j || (redirectData.f61726i && redirectData.f61729l)) {
                    String str8 = this.f61779a;
                    Logger.FeatureTag featureTag2 = Logger.FeatureTag.REDIRECTS;
                    Object[] objArr2 = new Object[9];
                    objArr2[0] = "handle ";
                    objArr2[1] = redirectData.f61729l ? "auto " : "";
                    objArr2[2] = redirectDetails.f61742e.name().toLowerCase();
                    objArr2[3] = " for ";
                    objArr2[4] = str;
                    objArr2[5] = " ";
                    objArr2[6] = this.f61781c.name();
                    objArr2[7] = ", no banner info found, add to pending, webview: ";
                    objArr2[8] = redirectDetails.f61743f;
                    Logger.d(str8, featureTag2, objArr2);
                    this.f61778H.put(redirectDetails.f61743f, redirectData);
                    return null;
                }
                String str9 = this.f61779a;
                Logger.FeatureTag featureTag3 = Logger.FeatureTag.REDIRECTS;
                Object[] objArr3 = new Object[9];
                objArr3[0] = "handle ";
                objArr3[1] = redirectData.f61729l ? "auto " : "";
                objArr3[2] = redirectDetails.f61742e.name().toLowerCase();
                objArr3[3] = " for ";
                objArr3[4] = str;
                objArr3[5] = " ";
                objArr3[6] = this.f61781c.name();
                objArr3[7] = ", no banner info found, don't add to pending, webview: ";
                objArr3[8] = redirectDetails.f61743f;
                Logger.d(str9, featureTag3, objArr3);
                return null;
            }
            Logger.d(this.f61779a, "add redirect intent log events to view address, ", redirectDetails, ", ", mVar);
            String str10 = redirectDetails.f61743f;
            Long l6 = mVar.f62675a;
            Long l7 = mVar.f62676b;
            l.a[] aVarArr4 = new l.a[2];
            aVarArr4[0] = new l.a("typ", mVar.f62680f != null ? mVar.f62680f : "normal");
            aVarArr4[1] = new l.a("url", mVar.f62678d);
            a(str10, l6, l7, HrvQKfmFZJudBc.lSvMNBfpJD, aVarArr4);
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(c cVar, String str, boolean z2) {
    }
}
