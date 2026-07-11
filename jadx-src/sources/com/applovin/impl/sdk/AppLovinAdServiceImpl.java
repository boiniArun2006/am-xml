package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.C1778e;
import com.applovin.impl.C1785k;
import com.applovin.impl.C1809u;
import com.applovin.impl.C1815y5;
import com.applovin.impl.a6;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e6;
import com.applovin.impl.e8;
import com.applovin.impl.k7;
import com.applovin.impl.m2;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.r0;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.C1799c;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t1;
import com.applovin.impl.t2;
import com.applovin.impl.w1;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, a.InterfaceC0708a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f49950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f49951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f49952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f49953d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f49954e = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f49955f = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class b implements m2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f49956a;

        private b(c cVar) {
            this.f49956a = cVar;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof C1799c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f49950a.i().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f49950a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new C1799c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f49950a);
            }
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f49956a.f49958a) {
                try {
                    if (!this.f49956a.f49960c) {
                        hashSet = new HashSet(this.f49956a.f49961d);
                        this.f49956a.f49961d.clear();
                    }
                    c cVar = this.f49956a;
                    cVar.f49959b = false;
                    cVar.f49960c = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i2) {
            failedToReceiveAdV2(new AppLovinError(i2, ""));
        }

        @Override // com.applovin.impl.m2
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f49956a.f49958a) {
                try {
                    if (!this.f49956a.f49960c) {
                        hashSet = new HashSet(this.f49956a.f49961d);
                        this.f49956a.f49961d.clear();
                    }
                    c cVar = this.f49956a;
                    cVar.f49959b = false;
                    cVar.f49960c = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.b(appLovinError, (AppLovinAdLoadListener) it.next());
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f49958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f49959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f49960c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Collection f49961d;

        private c() {
            this.f49958a = new Object();
            this.f49961d = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f49959b + ", isReloadingExpiredAd=" + this.f49960c + ", pendingAdListeners=" + this.f49961d + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinError appLovinError, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.Wre
            @Override // java.lang.Runnable
            public final void run() {
                this.f50051n.a(appLovinError, appLovinAdLoadListener);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(C1809u.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.f49950a.O();
            if (C1804o.a()) {
                this.f49950a.O().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f49950a.D().a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof m2) {
            ((m2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.f49954e.putAll(map);
    }

    public AppLovinAd dequeueAd(C1809u c1809u) {
        AppLovinAdImpl appLovinAdImplA = this.f49950a.i().a(c1809u);
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Dequeued ad: " + appLovinAdImplA + " for zone: " + c1809u + "...");
        }
        return appLovinAdImplA;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f49955f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f49954e) {
            map = CollectionUtils.map(this.f49954e);
            this.f49954e.clear();
        }
        return map;
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(C1809u.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, final AppLovinAdLoadListener appLovinAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            C1804o.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        C1785k c1785k = new C1785k(strTrim, this.f49950a);
        if (c1785k.c() == C1785k.a.REGULAR) {
            if (C1804o.a()) {
                this.f49951b.a("AppLovinAdService", "Loading next ad for token: " + c1785k);
            }
            a(new a6(c1785k, appLovinAdLoadListener, this.f49950a));
            return;
        }
        if (c1785k.c() != C1785k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            C1804o.h("AppLovinAdService", "Invalid token type");
            c(appLovinError, appLovinAdLoadListener);
            return;
        }
        final JSONObject jSONObjectA = c1785k.a();
        if (jSONObjectA == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + c1785k.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            C1804o.h("AppLovinAdService", str2);
            c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        r0.c(jSONObjectA, this.f49950a);
        r0.b(jSONObjectA, this.f49950a);
        r0.a(jSONObjectA, this.f49950a);
        this.f49950a.m().a();
        if (JsonUtils.getJSONArray(jSONObjectA, com.safedk.android.analytics.brandsafety.l.f62638S, new JSONArray()).length() <= 0) {
            if (C1804o.a()) {
                this.f49951b.b("AppLovinAdService", "No ad returned from the server for token: " + c1785k);
            }
            c(AppLovinError.NO_FILL, appLovinAdLoadListener);
            return;
        }
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Rendering ad for token: " + c1785k);
        }
        final C1809u c1809uA = n7.a(jSONObjectA, this.f49950a);
        MaxAdFormat maxAdFormatD = c1809uA.d();
        if (((Boolean) this.f49950a.a(x4.X0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f49950a.h().a(c1809uA, new d.a() { // from class: com.applovin.impl.sdk.Ml
                @Override // com.applovin.impl.sdk.d.a
                public final void a(com.applovin.impl.sdk.ad.b bVar) {
                    this.f50010n.a(appLovinAdLoadListener, jSONObjectA, c1809uA, bVar);
                }
            });
        } else {
            a(new e6(jSONObjectA, c1809uA, appLovinAdLoadListener, this.f49950a));
        }
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l2;
        if (((Boolean) this.f49950a.a(x4.x2)).booleanValue() && (l2 = (Long) this.f49950a.b(z4.f50993N)) != null && System.currentTimeMillis() - l2.longValue() <= ((Long) this.f49950a.a(x4.B2)).longValue()) {
            if (((Boolean) this.f49950a.a(x4.A2)).booleanValue() || b()) {
                a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(List<C1778e> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<C1778e> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0708a
    public void onAdExpired(t1 t1Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) t1Var;
        C1809u adZone = appLovinAdImpl.getAdZone();
        if (C1804o.a()) {
            this.f49951b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f49950a.i().b(appLovinAdImpl);
        if (this.f49950a.G0() || !((Boolean) this.f49950a.a(x4.d1)).booleanValue()) {
            return;
        }
        c cVarA = a(adZone);
        synchronized (cVarA.f49958a) {
            try {
                if (!cVarA.f49959b) {
                    this.f49950a.O();
                    if (C1804o.a()) {
                        this.f49950a.O().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                    }
                    cVarA.f49959b = true;
                    cVarA.f49960c = true;
                    a(adZone, new b(cVarA));
                } else if (C1804o.a()) {
                    this.f49951b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f49955f.set(jSONObject);
    }

    @NonNull
    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f49952c + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, @Nullable MotionEvent motionEvent) {
        if (bVar == null) {
            if (C1804o.a()) {
                this.f49951b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking click on an ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.a(motionEvent));
        if (appLovinAdView != null && uri != null) {
            a(bVar, appLovinAdView, aVar, uri);
        } else if (C1804o.a()) {
            this.f49951b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, w1 w1Var, Context context) {
        if (bVar == null) {
            if (C1804o.a()) {
                this.f49951b.b("AppLovinAdService", "Unable to track video click. No ad specified");
            }
        } else {
            if (C1804o.a()) {
                this.f49951b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent));
            a(w1Var.b().getController(), uri, context);
        }
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j2, List<Long> list, long j3, boolean z2, int i2) {
        if (bVar == null) {
            if (C1804o.a()) {
                this.f49951b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<C1778e> listE = bVar.e();
        if (listE == null || listE.isEmpty()) {
            if (C1804o.a()) {
                this.f49951b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
                return;
            }
            return;
        }
        for (C1778e c1778e : listE) {
            String strA = a(c1778e.c(), j2, j3, list, bVar.v(), z2, i2);
            String strA2 = a(c1778e.a(), j2, j3, list, bVar.v(), z2, i2);
            if (StringUtils.isValidString(strA)) {
                a(new C1778e(strA, strA2));
            } else if (C1804o.a()) {
                this.f49951b.b("AppLovinAdService", "Failed to parse url: " + c1778e.c());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (C1804o.a()) {
                this.f49951b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (C1804o.a()) {
                this.f49951b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.A());
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j2, int i2, boolean z2) {
        if (bVar == null) {
            if (C1804o.a()) {
                this.f49951b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<C1778e> listG0 = bVar.g0();
        if (listG0 == null || listG0.isEmpty()) {
            if (C1804o.a()) {
                this.f49951b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String string = Long.toString(System.currentTimeMillis());
        for (C1778e c1778e : listG0) {
            if (StringUtils.isValidString(c1778e.c())) {
                String strA = a(c1778e.c(), j2, i2, string, z2);
                String strA2 = a(c1778e.a(), j2, i2, string, z2);
                if (strA != null) {
                    a(new C1778e(strA, strA2));
                } else if (C1804o.a()) {
                    this.f49951b.b("AppLovinAdService", "Failed to parse url: " + c1778e.c());
                }
            } else if (C1804o.a()) {
                this.f49951b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }

    AppLovinAdServiceImpl(C1802k c1802k) {
        this.f49950a = c1802k;
        this.f49951b = c1802k.O();
        HashMap map = new HashMap(6);
        this.f49952c = map;
        map.put(C1809u.c(), new c());
        map.put(C1809u.k(), new c());
        map.put(C1809u.j(), new c());
        map.put(C1809u.m(), new c());
        map.put(C1809u.b(), new c());
        map.put(C1809u.h(), new c());
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.f49950a.A().a(appLovinBidTokenCollectionListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String strI = this.f49950a.A().I();
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (StringUtils.isValidString(strI) && C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return strI;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (!TextUtils.isEmpty(str)) {
            if (C1804o.a()) {
                this.f49951b.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
            }
            a(C1809u.a(str), appLovinAdLoadListener);
            return;
        }
        throw new IllegalArgumentException("No zone id specified");
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(C1809u.b(str), appLovinAdLoadListener);
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", dpcnwfoVOnrtRA.EYWYtYfAc);
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabHiddenPostbacks());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabShownPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationAborted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFailed(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFinished(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationStarted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackNativeAdCustomTabsTabHidden(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", qUrazMnwDskFs.UbVmQLHEtCgDRw);
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabHiddenPostbacks());
    }

    public void trackNativeAdCustomTabsTabShown(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabShownPostbacks());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, C1809u c1809u, final com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.I28
                @Override // java.lang.Runnable
                public final void run() {
                    appLovinAdLoadListener.adReceived(bVar);
                }
            });
        } else {
            a(new e6(jSONObject, c1809u, appLovinAdLoadListener, this.f49950a));
        }
    }

    private boolean b() {
        if (!o0.b()) {
            return true;
        }
        Context contextO = C1802k.o();
        ApplicationExitInfo applicationExitInfoN = androidx.work.impl.utils.n.n(((ActivityManager) contextO.getSystemService("activity")).getHistoricalProcessExitReasons(contextO.getPackageName(), 0, 1).get(0));
        return applicationExitInfoN.getReason() == 10 || applicationExitInfoN.getReason() == 11;
    }

    private void a(C1809u c1809u, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (c1809u == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f49950a.O();
            if (C1804o.a()) {
                this.f49950a.O().a("AppLovinAdService", "Loading next ad of zone {" + c1809u + "}...");
            }
            c cVarA = a(c1809u);
            synchronized (cVarA.f49958a) {
                try {
                    cVarA.f49961d.add(appLovinAdLoadListener);
                    if (!cVarA.f49959b) {
                        cVarA.f49959b = true;
                        a(c1809u, new b(cVarA));
                    } else if (C1804o.a()) {
                        this.f49951b.a("AppLovinAdService", "Already waiting on an ad load...");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(AbstractRunnableC1782i5 abstractRunnableC1782i5) {
        if (!this.f49950a.B0()) {
            C1804o.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f49950a.c();
        this.f49950a.q0().a(abstractRunnableC1782i5, d6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.w6
            @Override // java.lang.Runnable
            public final void run() {
                this.f50484n.a(appLovinAdLoadListener, appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            C1804o.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.f49950a.D().a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th) {
            C1804o.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            StringBuilder sb = new StringBuilder();
            sb.append("notifyAdLoadFailedCallback");
            sb.append(appLovinAdLoadListener instanceof m2 ? "V2" : "");
            this.f49950a.D().a("AppLovinAdService", sb.toString(), th);
        }
    }

    private void a(com.applovin.impl.adview.a aVar, Uri uri, Context context) {
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        if (k7.a(uri)) {
            a(uri, bVarG, aVar.i(), aVar, context, this.f49950a);
        } else if (bVarG != null && bVarG.isCustomTabsEnabled()) {
            this.f49950a.z().a(uri, aVar, this.f49950a.u0());
        } else {
            k7.b(uri, bVarG, context, this.f49950a);
        }
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (!((Boolean) this.f49950a.a(x4.f50848w)).booleanValue() || (context = e8.b(appLovinAdView, this.f49950a)) == null) {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (k7.a(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.f49950a);
        } else if (bVar != null && bVar.isCustomTabsEnabled()) {
            this.f49950a.z().a(uri, aVar, this.f49950a.u0());
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j2, int i2, String str2, boolean z2) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i2 < 0 || i2 > 100) {
                i2 = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j2)).appendQueryParameter("pv", Integer.toString(i2)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z2)).build().toString();
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f49951b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.f49950a.D().a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (k7.b(uri, bVar, context, this.f49950a)) {
            t2.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.w();
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, C1802k c1802k) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri uriB = b(uri, "primaryUrl");
            List listA = a(uri, "primaryTrackingUrl");
            Uri uriB2 = b(uri, "fallbackUrl");
            List listA2 = a(uri, "fallbackTrackingUrl");
            if (uriB == null && uriB2 == null) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(uriB, "primary", listA, bVar, appLovinAdView, aVar, context, c1802k)) {
                a(uriB2, "backup", listA2, bVar, appLovinAdView, aVar, context, c1802k);
            }
            if (aVar != null) {
                aVar.w();
                return;
            }
            return;
        }
        c1802k.O();
        if (C1804o.a()) {
            c1802k.O().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, C1802k c1802k) {
        c1802k.O();
        if (C1804o.a()) {
            c1802k.O().a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean zB = k7.b(uri, bVar, context, c1802k);
        if (zB) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c1802k.g0().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                t2.b(aVar.e(), bVar, appLovinAdView);
                return zB;
            }
        } else {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().b("AppLovinAdService", "URL failed to open");
            }
        }
        return zB;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th) {
                this.f49950a.O();
                boolean zA = C1804o.a();
                String str2 = YjqZUJsVmhcjko.JPMiSzX;
                if (zA) {
                    this.f49950a.O().k(str2, "Unable to parse query parameter into Uri: " + str);
                }
                this.f49950a.D().a(str2, "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    private String a(String str, long j2, long j3, List list, String str2, boolean z2, int i2) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j2)).appendQueryParameter("vs_ms", Long.toString(j3));
        if (list != null && list.size() > 0) {
            builderAppendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (StringUtils.isValidString(str2)) {
            builderAppendQueryParameter.appendQueryParameter("ds", str2);
        }
        if (i2 != i.f50197h) {
            builderAppendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z2));
            builderAppendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(i.a(i2)));
        }
        return builderAppendQueryParameter.build().toString();
    }

    private void a() {
        Map<String, String> mapTryToStringMap;
        if (C1804o.a()) {
            this.f49951b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f49950a.b(z4.f50996Q);
        if (TextUtils.isEmpty(str)) {
            if (C1804o.a()) {
                this.f49951b.a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            mapTryToStringMap = null;
        } else {
            mapTryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        }
        this.f49950a.D().d(d2.f48254H0, mapTryToStringMap);
        String str2 = (String) this.f49950a.b(z4.f50995P);
        if (str2 != null) {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str2, null);
            String string = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_url", null);
            String string2 = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_backup_url", null);
            Long l2 = (Long) this.f49950a.b(z4.f50994O);
            if (l2 != null) {
                string = StringUtils.appendQueryParameter(string, "imp_duration_ms", String.valueOf(l2));
                string2 = StringUtils.appendQueryParameter(string2, "imp_duration_ms", String.valueOf(l2));
            }
            a(new C1778e(string, string2));
            return;
        }
        if (C1804o.a()) {
            this.f49951b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }

    private void a(C1778e c1778e) {
        if (StringUtils.isValidString(c1778e.c())) {
            this.f49950a.f0().e(com.applovin.impl.sdk.network.d.b().d(c1778e.c()).a(StringUtils.isValidString(c1778e.a()) ? c1778e.a() : null).a(c1778e.b()).a(false).b(c1778e.d()).a());
        } else if (C1804o.a()) {
            this.f49951b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(final C1809u c1809u, final b bVar) {
        AppLovinAdImpl appLovinAdImplE = this.f49950a.i().e(c1809u);
        if (appLovinAdImplE != null && !appLovinAdImplE.isExpired()) {
            if (C1804o.a()) {
                this.f49951b.a("AppLovinAdService", "Using pre-loaded ad: " + appLovinAdImplE + " for " + c1809u);
            }
            bVar.adReceived(appLovinAdImplE);
            return;
        }
        MaxAdFormat maxAdFormatD = c1809u.d();
        if (((Boolean) this.f49950a.a(x4.X0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f49950a.h().a(c1809u, new d.a() { // from class: com.applovin.impl.sdk.CN3
                @Override // com.applovin.impl.sdk.d.a
                public final void a(com.applovin.impl.sdk.ad.b bVar2) {
                    this.f50000n.a(bVar, c1809u, bVar2);
                }
            });
        } else {
            a(new C1815y5(c1809u, bVar, this.f49950a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final b bVar, C1809u c1809u, final com.applovin.impl.sdk.ad.b bVar2) {
        if (bVar2 != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.fuX
                @Override // java.lang.Runnable
                public final void run() {
                    bVar.adReceived(bVar2);
                }
            });
        } else {
            a(new C1815y5(c1809u, bVar, this.f49950a));
        }
    }

    private c a(C1809u c1809u) {
        c cVar;
        synchronized (this.f49953d) {
            try {
                cVar = (c) this.f49952c.get(c1809u);
                if (cVar == null) {
                    cVar = new c();
                    this.f49952c.put(c1809u, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
