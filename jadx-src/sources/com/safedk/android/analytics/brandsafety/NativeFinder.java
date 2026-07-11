package com.safedk.android.analytics.brandsafety;

import YgZ.uQga.IYJfqUyym;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import cS.Zv.SzFNXybiSxdx;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.SafeDK;
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
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class NativeFinder extends b {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f61684I = 5;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected static final long f61685J = 1000;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected static final long f61686K = 500;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final String f61687L = "NativeFinder";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final long f61688M = 10;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final Map<String, WeakReference<MaxNativeAdView>> f61689Q = new HashMap();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final Map<String, WeakReference<MaxNativeAdView>> f61690R = new HashMap();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Map<String, String> f61691S = new HashMap();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final LinkedHashSetWithItemLimit<String> f61692N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map<d, s> f61693O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final Map<String, o> f61694P;

    public NativeFinder(int maxAttemptsToCaptureImage) {
        super(BrandSafetyUtils.AdType.NATIVE, Collections.singletonList("NATIVE"), f61687L, maxAttemptsToCaptureImage);
        this.f61692N = new LinkedHashSetWithItemLimit<>(f61688M);
        this.f61693O = new HashMap();
        this.f61694P = new HashMap();
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new s(str, str2, str3, screenShotOrientation, str4, str5);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        String string;
        String string2;
        String str;
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().p() || SafeDK.getInstance() == null || !SafeDK.getInstance().r()) {
            return;
        }
        try {
            Bundle messageData = message.getMessageData();
            if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.f61780b.contains(messageData.getString("ad_format"))) {
                Logger.d(f61687L, "Revenue event detected : ", messageData);
                string = "revenue_event";
            } else {
                string = messageData.getString("type");
            }
            String string3 = messageData.getString("ad_format");
            String string4 = messageData.getString(BrandSafetyEvent.f62740k);
            String string5 = messageData.getString(BrandSafetyEvent.f62741l);
            String strN = BrandSafetyUtils.n(messageData.getString("ad_view"));
            String string6 = messageData.getString("id", null);
            if (string6 == null) {
                Logger.d(f61687L, "No eventId in data bundle, cannot match");
            }
            String string7 = messageData.getString(BrandSafetyEvent.ad);
            String strC = CreativeInfoManager.c(string7);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jB = com.safedk.android.utils.n.b(jCurrentTimeMillis);
            if (!messageData.containsKey("creative_id")) {
                string2 = null;
            } else {
                string2 = messageData.getString("creative_id");
            }
            if (this.f61780b.contains(string3)) {
                Logger.d(f61687L, "Max message received, package: ", strC, ", ts (seconds): ", Long.valueOf(jB), ", message received: ", message.getMessageData(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                d dVar = new d(string5, string4, string6, strC, string7, BrandSafetyUtils.AdType.NATIVE);
                if ("WILL_DISPLAY".equals(string)) {
                    if (strC != null) {
                        str = string7;
                        if (f(str, strC)) {
                            Logger.d(f61687L, "WILL_DISPLAY event for package=", strC, ", key=", dVar, ", view address=", strN, ", slot count=", Integer.valueOf(this.f61782d));
                            CreativeInfoManager.a(strC, string4, string2, string6, string3);
                            a(string6, l.f62651f, new l.a(l.f62631L, BrandSafetyUtils.n(messageData.getString("ad_view"))));
                        }
                    } else {
                        str = string7;
                    }
                    a(str, strC, string2, dVar, strN, messageData, jCurrentTimeMillis);
                    return;
                }
                String str2 = string7;
                if ("revenue_event".equals(string)) {
                    if (strC != null && f(str2, strC)) {
                        Logger.d(f61687L, "REVENUE_EVENT event for package=", strC, ", key=", dVar, ", view address=", strN, ", slot count=", Integer.valueOf(this.f61782d));
                        a(string6, l.f62656k, new l.a("typ", messageData.getString("revenue_event")));
                    }
                    a(str2, strC, string2, dVar, strN, messageData);
                    return;
                }
                if ("DID_CLICKED".equals(string)) {
                    if (f(str2, strC)) {
                        a(string6, l.f62653h, new l.a[0]);
                        if (this.f61693O.get(dVar) != null) {
                            Object[] objArr = new Object[4];
                            objArr[0] = "DID_CLICKED event for package=";
                            if (strC != null) {
                                str2 = strC;
                            }
                            objArr[1] = str2;
                            objArr[2] = ", slot count=";
                            objArr[3] = Integer.valueOf(this.f61782d);
                            Logger.d(f61687L, objArr);
                            c(dVar);
                        }
                        return;
                    }
                    return;
                }
                if ("WILL_LOAD".equals(string)) {
                    if (strC != null && f(str2, strC)) {
                        Logger.d(f61687L, "WILL_LOAD event for package=", strC, ", key=", dVar, ", slot count=", Integer.valueOf(this.f61782d));
                        a(string6, l.f62649d, new l.a(l.f62633N, str2));
                        return;
                    }
                    return;
                }
                if ("DID_HIDE".equals(string)) {
                    if (strC != null && f(str2, strC)) {
                        Logger.d(f61687L, "DID_HIDE event for package=", strC, ", key=", dVar, ", slot count=", Integer.valueOf(this.f61782d));
                        a(string6, l.f62654i, new l.a[0]);
                        a(dVar);
                        return;
                    }
                    return;
                }
                if ("DID_LOAD".equals(string)) {
                    if (strC != null && f(str2, strC)) {
                        Logger.d(f61687L, "DID_LOAD event for package=", strC, ", key=", dVar, ", slot count=", Integer.valueOf(this.f61782d));
                        a(string6, l.f62650e, new l.a(l.f62633N, str2));
                        return;
                    }
                    return;
                }
                if ("DID_DISPLAY".equals(string)) {
                    if (strC != null && f(str2, strC)) {
                        Logger.d(f61687L, "DID_DISPLAY event for package=", strC, ", key=", dVar, ", slot count=", Integer.valueOf(this.f61782d));
                        a(string6, l.f62652g, new l.a[0]);
                        a(strC, dVar, string2, messageData, jCurrentTimeMillis);
                        return;
                    }
                    return;
                }
                if ("DID_FAIL_DISPLAY".equals(string) && strC != null && f(str2, strC)) {
                    Logger.d(f61687L, "DID_FAIL_DISPLAY event for package=", strC, ", key=", dVar, ", slot count=", Integer.valueOf(this.f61782d));
                    a(string6, l.f62655j, new l.a[0]);
                    b(dVar);
                }
            }
        } catch (Throwable th) {
            Logger.e(f61687L, "on message received exception", th);
        }
    }

    private void a(String str, String str2, String str3, d dVar, String str4, Bundle bundle, long j2) {
        if (this.f61692N.contains(dVar.f62521c)) {
            Logger.d(f61687L, "handle WILL_DISPLAY - impression with id ", dVar.f62521c, " has already been reported, ignoring.");
            return;
        }
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        int iB = BrandSafetyUtils.b(this.f61781c);
        synchronized (this.f61774C) {
            Logger.d(f61687L, "handle WILL_DISPLAY - image count for ", this.f61781c.name(), " is ", Integer.valueOf(iB), ", impressions to report(", Integer.valueOf(this.f61774C.keySet().size()), ") = ", this.f61774C.keySet());
        }
        if (!f(str, str2)) {
            this.f61782d++;
            return;
        }
        s sVarA = this.f61693O.get(dVar);
        if (sVarA == null) {
            sVarA = a(foregroundActivity, str2, dVar.f62521c, bundle);
            synchronized (this.f61693O) {
                this.f61693O.put(dVar, sVarA);
            }
            Logger.d(f61687L, "New activity native created for ", str2, ", native key is ", dVar, ", current activity native size is ", Integer.valueOf(this.f61693O.size()));
        } else {
            if (sVarA.f61808A == null) {
                sVarA.f61808A = bundle;
            }
            if (sVarA.f61809B == null || sVarA.f61810C == null) {
                sVarA.a(a(foregroundActivity));
            }
        }
        sVarA.f61818K = TextUtils.isEmpty(str4) ? null : str4;
        sVarA.f62702W = true;
        sVarA.ad = true;
        sVarA.ae = j2;
        a(sVarA, false, "handleWillDisplay");
        a aVar = new a(sVarA, dVar, this.f61783e);
        sVarA.aa = this.f61776E.scheduleWithFixedDelay(aVar, 500L, SafeDK.getInstance().Z() * 1000, TimeUnit.MILLISECONDS);
        sVarA.ac = aVar;
        a(sVarA, dVar);
        a(sVarA, dVar, (WeakReference<MaxNativeAdView>) a(dVar, str4, false).first);
    }

    private o a(s sVar, d dVar, WeakReference<MaxNativeAdView> weakReference) {
        o oVarRemove;
        if (weakReference != null && weakReference.get() != null) {
            sVar.ai = true;
            synchronized (this.f61694P) {
                oVarRemove = this.f61694P.remove(sVar.f61818K);
                Logger.d(f61687L, "try setting pending info - view address: ", sVar.f61818K, " matching info: ", oVarRemove);
                if (oVarRemove != null) {
                    a(dVar.f62519a, dVar.f62523e, oVarRemove);
                }
            }
            return oVarRemove;
        }
        Logger.d(f61687L, "try setting pending info - ad view reference not valid: ref=", weakReference);
        return null;
    }

    private Pair<WeakReference<MaxNativeAdView>, String> a(d dVar, String str, boolean z2) {
        WeakReference<MaxNativeAdView> weakReferenceRemove;
        synchronized (NativeFinder.class) {
            weakReferenceRemove = f61689Q.get(dVar.f62521c);
            if (TextUtils.isEmpty(str) && weakReferenceRemove != null && weakReferenceRemove.get() != null) {
                str = BrandSafetyUtils.a(weakReferenceRemove.get());
            }
            if (!TextUtils.isEmpty(str) && (weakReferenceRemove == null || weakReferenceRemove.get() == null)) {
                weakReferenceRemove = z2 ? f61690R.remove(str) : f61690R.get(str);
                if (weakReferenceRemove != null && weakReferenceRemove.get() != null) {
                    Logger.d(f61687L, "get ad view ref - native ad view found: ", weakReferenceRemove.get(), " for event ID: ", dVar.f62521c);
                    a(dVar.f62521c, dVar.f62522d, weakReferenceRemove.get());
                }
            } else if (z2) {
                f61690R.remove(str);
            }
        }
        return new Pair<>(weakReferenceRemove, str);
    }

    private void a(String str, String str2, String str3, d dVar, String str4, Bundle bundle) {
        AdNetworkDiscovery adNetworkDiscoveryJ;
        CreativeInfo creativeInfoA;
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        if (this.f61692N.contains(dVar.f62521c)) {
            Logger.d(f61687L, "handle REVENUE_EVENT - impression with id ", dVar.f62521c, " has already been reported, ignoring.");
            return;
        }
        Pair<WeakReference<MaxNativeAdView>, String> pairA = a(dVar, str4, true);
        WeakReference<MaxNativeAdView> weakReference = (WeakReference) pairA.first;
        String str5 = (String) pairA.second;
        a(str5, dVar);
        if (f(str, str2)) {
            s sVarA = this.f61693O.get(dVar);
            if (sVarA == null) {
                sVarA = a(foregroundActivity, str2, dVar.f62521c, bundle);
                synchronized (this.f61693O) {
                    this.f61693O.put(dVar, sVarA);
                }
                Logger.d(f61687L, "New activity native created for ", str2, ", native key is ", dVar, ", current activity natives size is ", Integer.valueOf(this.f61693O.size()));
            } else {
                if (sVarA.f61808A == null) {
                    sVarA.f61808A = bundle;
                }
                if (sVarA.f61809B == null || sVarA.f61810C == null) {
                    sVarA.a(a(foregroundActivity));
                }
            }
            if (bundle.getString("revenue_event") != null) {
                sVarA.f61823P = bundle.getString("revenue_event");
            } else {
                sVarA.f61823P = "unknown";
            }
            if (sVarA.f61818K == null) {
                sVarA.f61818K = TextUtils.isEmpty(str5) ? null : str5;
                synchronized (NativeFinder.class) {
                    f61691S.put(str5, str2);
                }
            }
            sVarA.f61820M = str3;
            o oVarA = a(sVarA, dVar, weakReference);
            if (oVarA == null && (adNetworkDiscoveryJ = CreativeInfoManager.j(dVar.f62522d)) != null && (creativeInfoA = adNetworkDiscoveryJ.a((Object) dVar.f62521c)) != null && creativeInfoA.Z() == null) {
                oVarA = new o(creativeInfoA, CreativeInfo.f62461y);
                Logger.d(f61687L, Logger.FeatureTag.CI_MATCHING, "set CI details - try to match by event ID: ", dVar.f62521c, " matching info: ", oVarA);
                a(dVar.f62519a, dVar.f62523e, oVarA);
            }
            if (oVarA == null) {
                a(sVarA, false, "handleRevenueEvent");
            }
            Logger.d(f61687L, "Revenue event set to ", bundle.getString("revenue_event"), " for eventId ", dVar.f62521c);
            sVarA.f62702W = true;
            return;
        }
        this.f61782d++;
    }

    private void a(String str, d dVar, String str2, Bundle bundle, long j2) {
        if (this.f61692N.contains(dVar.f62521c)) {
            Logger.d(f61687L, "handle DID_DISPLAY - impression with id ", dVar.f62521c, " has already been reported, ignoring. ");
            return;
        }
        Logger.d(f61687L, "handle DID_DISPLAY package=", str, " key=", dVar);
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        s sVarA = this.f61693O.get(dVar);
        if (sVarA != null) {
            Logger.d(f61687L, "Native info already exists, package=", str, IYJfqUyym.HCVuZnsWL, sVarA);
            sVarA.f61844z = this.f61782d;
            if (sVarA.f61809B == null || sVarA.f61810C == null) {
                sVarA.a(a(foregroundActivity));
            }
        } else {
            sVarA = a(foregroundActivity, str, dVar.f62521c, bundle);
            synchronized (this.f61693O) {
                this.f61693O.put(dVar, sVarA);
            }
            Logger.d(f61687L, "New activity native created for ", str, ", key=", dVar, ", current activity ads size=", Integer.valueOf(this.f61693O.size()));
        }
        sVarA.f61820M = str2;
        sVarA.af = j2;
        a(sVarA, false, "handleDidDisplay");
    }

    private void a(d dVar) {
        synchronized (this.f61693O) {
            s sVarRemove = this.f61693O.remove(dVar);
            if (sVarRemove != null) {
                Logger.d(f61687L, "handle DID_HIDE, placementId=", dVar.f62520b);
                sVarRemove.f62704Y = true;
            }
        }
    }

    private void b(d dVar) {
        s sVar = this.f61693O.get(dVar);
        if (sVar != null) {
            sVar.f61821N = true;
        }
    }

    private void c(d dVar) {
        Logger.d(f61687L, "handle DID_CLICKED started");
        s sVar = this.f61693O.get(dVar);
        if (sVar != null) {
            sVar.a(true);
            a(sVar, false, "handleDidClicked");
        }
    }

    private s a(Activity activity, String str, String str2, Bundle bundle) {
        String lowerCase = BrandSafetyUtils.c().name().toLowerCase();
        this.f61782d++;
        Logger.d(SzFNXybiSxdx.qBiv, "slot number incremented to ", Integer.valueOf(this.f61782d), ", eventId is ", str2, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        s sVar = new s(a(activity), str, this.f61782d, lowerCase, bundle, str2);
        sVar.ab = new WeakReference<>(activity);
        return sVar;
    }

    protected boolean f(String str, String str2) {
        boolean zA = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, false);
        String strA = CreativeInfoManager.a(str2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        Logger.d(f61687L, "sdk ", str2, ": config item SUPPORTS_NATIVE_IMPRESSION_TRACKING is ", Boolean.valueOf(zA), ", config item AD_NETWORK_TO_IGNORE is ", strA, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (zA && !str.equals(strA)) {
            return true;
        }
        Logger.d(f61687L, "Native ads tracking is not supported for this ad network (", str, ")");
        return false;
    }

    public void a(final String str, final String str2, final MaxNativeAdView maxNativeAdView) {
        if (com.safedk.android.utils.n.c()) {
            this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.1
                @Override // java.lang.Runnable
                public void run() {
                    NativeFinder.this.b(str, str2, maxNativeAdView);
                }
            });
        } else {
            b(str, str2, maxNativeAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, MaxNativeAdView maxNativeAdView) {
        if (str != null && str2 != null && maxNativeAdView != null) {
            String strA = BrandSafetyUtils.a(maxNativeAdView);
            synchronized (NativeFinder.class) {
                if (!f61689Q.containsKey(str)) {
                    a(str, l.f62657l, new l.a(l.f62631L, strA));
                }
                f61689Q.put(str, new WeakReference<>(maxNativeAdView));
                f61691S.put(strA, str2);
            }
            Logger.d(f61687L, "add native ad view: ", maxNativeAdView, ", eventId: ", str, ", adViewAddress: ", strA, ", sdk: ", str2, ", list size: ", Integer.valueOf(f61689Q.size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        }
    }

    public void a(final MaxNativeAdView maxNativeAdView) {
        if (com.safedk.android.utils.n.c()) {
            this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.2
                @Override // java.lang.Runnable
                public void run() {
                    NativeFinder.this.c(maxNativeAdView);
                }
            });
        } else {
            c(maxNativeAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MaxNativeAdView maxNativeAdView) {
        String strA = BrandSafetyUtils.a(maxNativeAdView);
        synchronized (NativeFinder.class) {
            f61690R.put(strA, new WeakReference<>(maxNativeAdView));
        }
        Logger.d(f61687L, "add native ad view: ", maxNativeAdView, ", list size: ", Integer.valueOf(f61690R.size()));
    }

    private void a(String str, d dVar) {
        ArrayList<d> arrayList;
        s sVar;
        boolean z2;
        Logger.d(f61687L, "report completed event started, view address: ", str, ", key: ", dVar);
        synchronized (this.f61693O) {
            arrayList = new ArrayList(this.f61693O.keySet());
        }
        for (d dVar2 : arrayList) {
            if (dVar2.f62519a.equals(dVar.f62519a) && !dVar2.f62521c.equals(dVar.f62521c) && (sVar = this.f61693O.get(dVar2)) != null) {
                if (sVar.f61818K != null && sVar.f61818K.equals(str)) {
                    Logger.d(f61687L, "report completed event, same view address: ", sVar.f61818K, ", event id: ", dVar2.f62521c);
                    z2 = true;
                } else {
                    synchronized (NativeFinder.class) {
                        WeakReference<MaxNativeAdView> weakReference = f61689Q.get(dVar2.f62521c);
                        if (weakReference == null || weakReference.get() == null || weakReference.get().getParent() == null) {
                            Logger.d(f61687L, "report completed event, closed view address: ", sVar.f61818K, ", event id: ", dVar2.f62521c);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                }
                if (z2) {
                    sVar.a(l.f62622C, new l.a[0]);
                    a(sVar, true, "reportCompletedEvents");
                    sVar.f61827U = true;
                    a(sVar);
                    synchronized (this.f61693O) {
                        this.f61693O.remove(dVar2);
                    }
                } else {
                    Logger.d(f61687L, "report completed event skipped, view address: ", sVar.f61818K, ", event id: ", dVar2.f62521c);
                }
            }
        }
    }

    private void a(final s sVar, final d dVar) {
        sVar.f62705Z = this.f61776E.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (NativeFinder.this.f61693O) {
                    NativeFinder.this.a(sVar, true, "handleWillDisplay:reportTimeout");
                    NativeFinder.this.f61693O.remove(dVar);
                    NativeFinder.this.a(sVar);
                }
            }
        }, 5L, TimeUnit.MINUTES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar) {
        try {
            Logger.d(f61687L, "clean started, currentActivityAds size is ", Integer.valueOf(this.f61693O.size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (sVar != null) {
                Logger.d(f61687L, "clean, adding to reported impressions map. id =  ", sVar.f61819L);
                this.f61692N.add(sVar.f61819L);
                sVar.f62704Y = true;
                if (sVar.f62705Z != null) {
                    sVar.f62705Z.cancel(false);
                }
                if (sVar.aa != null) {
                    sVar.aa.cancel(false);
                }
                for (k kVar : sVar.g()) {
                    if (kVar.f62597c != null && kVar.f62597c.f62585b != null) {
                        kVar.f62598d = kVar.f62597c.f62585b;
                        Logger.d(f61687L, "clean, set last impression screenshot filename to ", kVar.f62597c.f62585b);
                    }
                }
                synchronized (NativeFinder.class) {
                    f61689Q.remove(sVar.f61819L);
                }
                b(sVar);
            }
        } catch (Throwable th) {
            Logger.e(f61687L, "Error in clean ", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar, boolean z2, String str) {
        long j2;
        String str2;
        int i2;
        String str3;
        int i3;
        String str4;
        String str5;
        boolean z3;
        int i5 = 1;
        boolean z4 = !sVar.f61812E;
        boolean z5 = !sVar.f61813F && sVar.d();
        if (sVar.ae > 0 && sVar.af > 0) {
            j2 = sVar.ae - sVar.af;
        } else {
            j2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (sVar.k().isEmpty()) {
            Logger.d(f61687L, "reporting event started, root=", str, ", isMature=", Boolean.valueOf(z2), ", adInfo=", sVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            arrayList.add(a(sVar, sVar.i(), z2, z5, j2, (String) null));
            str2 = f61687L;
            i2 = 2;
        } else {
            String str6 = f61687L;
            for (k kVar : sVar.g()) {
                if (kVar.j() == null || kVar.j().Z() != null) {
                    str3 = str6;
                } else {
                    Object[] objArr = new Object[i5];
                    objArr[0] = "reporting event - don't report CI as it was matched only by eventId and not by webview resources";
                    str3 = str6;
                    Logger.d(str3, objArr);
                    kVar.a((CreativeInfo) null);
                }
                if (!z2 || kVar.f62597c == null || kVar.f62597c.f62584a == null) {
                    i3 = 2;
                    str4 = null;
                } else {
                    String str7 = kVar.f62597c.f62584a + "_" + kVar.f62596a;
                    i3 = 2;
                    Logger.d(str3, "reporting event - imageFileIsValid filename = ", BrandSafetyUtils.a(sVar.f61834p, kVar.f62597c.f62584a, sVar.c(), kVar.f62596a, kVar.f62597c.f62589f));
                    str4 = str7;
                }
                float fA2 = kVar.f62597c != null ? kVar.f62597c.a(500) : 0.0f;
                Object[] objArr2 = new Object[8];
                objArr2[0] = "reporting event started, root=";
                objArr2[1] = str;
                objArr2[i3] = ", isMature=";
                objArr2[3] = Boolean.valueOf(z2);
                objArr2[4] = ", info=";
                objArr2[5] = sVar;
                objArr2[6] = ", uniformity=";
                objArr2[7] = Float.valueOf(fA2);
                Logger.d(str3, objArr2);
                String str8 = str3;
                arrayList.add(a(sVar, kVar, z2, z5, j2, str4));
                if (!z2 || kVar.j() == null || kVar.f62597c == null) {
                    str5 = str8;
                } else if (this.f61774C.size() <= SafeDK.getInstance().J()) {
                    Object[] objArr3 = new Object[i3];
                    objArr3[0] = "reporting event waiting to report file ";
                    objArr3[1] = kVar.f62597c.f62585b;
                    str5 = str8;
                    Logger.d(str5, objArr3);
                    a(sVar, kVar);
                } else {
                    str5 = str8;
                    Object[] objArr4 = new Object[4];
                    objArr4[0] = "reporting event no open slot for ";
                    objArr4[1] = this.f61781c;
                    objArr4[i3] = ", ";
                    objArr4[3] = kVar.f62597c.f62584a;
                    Logger.d(str5, objArr4);
                    BrandSafetyUtils.d(kVar.f62597c.f62585b);
                }
                str6 = str5;
                i5 = 1;
            }
            str2 = str6;
            i2 = 2;
        }
        if (!z2 && sVar.f61827U) {
            Object[] objArr5 = new Object[i2];
            objArr5[0] = "reporting event - ad finished, should discard brand safety event: ";
            z3 = true;
            objArr5[1] = arrayList;
            Logger.w(str2, objArr5);
        } else {
            z3 = true;
            if (StatsCollector.c() != null) {
                StatsCollector.c().a(arrayList);
            } else {
                Logger.w(str2, "reporting event - stats collector instance is null, cannot report brand safety event");
            }
        }
        if (z4) {
            sVar.c(z3);
        }
        if (z5) {
            sVar.d(z3);
        }
    }

    private static BrandSafetyEvent a(s sVar, k kVar, boolean z2, boolean z3, long j2, String str) {
        return new BrandSafetyEvent(sVar.c(), sVar.q(), str, z3, sVar.d() ? sVar.e() : null, kVar.j(), sVar.a(), sVar.p(), kVar.f62596a != null ? kVar.f62596a : "", sVar.f61811D, z2, sVar.r(), kVar.f62597c != null ? kVar.f62597c.f62589f : null, kVar.f62597c != null ? kVar.f62597c.f62586c : 0L, kVar.f62597c != null ? kVar.f62597c.a(500) : 0.0f, kVar.f62597c != null ? kVar.f62597c.f62588e : 0, sVar.ad, sVar.ai, j2, sVar.ag, sVar.ah, SafeDK.getInstance().e(), sVar.w(), sVar.f61820M, sVar.f61821N, sVar.f61823P, sVar.f61824Q, b(sVar, kVar).toString());
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str) {
        Iterator<s> it = this.f61693O.values().iterator();
        while (it.hasNext()) {
            it.next().f62704Y = true;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public c c(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(o oVar) {
        try {
            Logger.printFullVerboseLog(f61687L, "set CI details started. matchingInfo = ", oVar.toString());
            CreativeInfo creativeInfo = oVar.f62690a;
            if (creativeInfo != null) {
                Logger.d(f61687L, "set CI details - CI exists in matchingInfo, sdk = ", creativeInfo.S());
                creativeInfo.i(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
                Logger.d(f61687L, "set CI details - starting to iterate over current activity ads");
                ArrayList<d> arrayList = new ArrayList();
                synchronized (this.f61693O) {
                    arrayList.addAll(this.f61693O.keySet());
                }
                for (d dVar : arrayList) {
                    if (a(creativeInfo, this.f61693O.get(dVar))) {
                        Logger.d(f61687L, Logger.FeatureTag.CI_MATCHING, "set CI details - matched by webView/eventID, CI: ", creativeInfo);
                        if (a(dVar.f62519a, dVar.f62523e, oVar)) {
                            return true;
                        }
                    }
                }
                Logger.d(f61687L, Logger.FeatureTag.CI_MATCHING, "set CI details - adding as pending, view address: ", creativeInfo.ak(), " matching info: ", oVar);
                synchronized (this.f61694P) {
                    this.f61694P.put(creativeInfo.ak(), oVar);
                }
                return true;
            }
        } catch (Throwable th) {
            Logger.e(f61687L, "set CI details exception: ", th.getMessage(), th);
        }
        return false;
    }

    private boolean a(CreativeInfo creativeInfo, s sVar) {
        if (sVar == null || creativeInfo == null) {
            Logger.d(f61687L, "verify matching - object is null, nativeInfo: ", sVar, ", creativeInfo: ", creativeInfo);
            return false;
        }
        String strS = creativeInfo.S();
        if (sVar.f61840v == null || !sVar.f61840v.equals(strS)) {
            Logger.d(f61687L, "verify matching - sdks does not match, ci sdk is: ", strS, " and native sdk is: ", sVar.f61840v);
            return false;
        }
        Logger.d(f61687L, "verify matching - ci sdk is: ", strS, ", native info: ", sVar);
        if (sVar.f61819L != null && creativeInfo.n() != null && !sVar.f61819L.equals(creativeInfo.n())) {
            Logger.d(f61687L, "verify matching - incompatible event ID, ci: ", creativeInfo.n(), ", info: ", sVar.f61819L);
            return false;
        }
        String strAk = creativeInfo.ak();
        if (sVar.f61818K != null && sVar.f61818K.equals(strAk)) {
            Logger.d(f61687L, Logger.FeatureTag.CI_MATCHING, "verify matching object done, event ID: ", sVar.f61819L, ", object address: ", strAk, ", view address: ", sVar.f61818K);
            return true;
        }
        Logger.d(f61687L, Logger.FeatureTag.CI_MATCHING, "verify matching object failed, event ID: ", sVar.f61819L, ", matching object address: ", strAk, ", ad info view address: ", sVar.f61818K);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2, o oVar) {
        Logger.printFullVerboseLog(f61687L, Logger.FeatureTag.CI_MATCHING, "set CI started, adUnitId=", str, " matchingInfo=", oVar);
        if (oVar == null) {
            Logger.d(f61687L, "set CI - no matching info");
            return false;
        }
        CreativeInfo creativeInfo = oVar.f62690a;
        if (creativeInfo != null) {
            d dVar = new d(str, creativeInfo.H(), creativeInfo.n(), creativeInfo.S(), str2, BrandSafetyUtils.AdType.NATIVE);
            Logger.d(f61687L, "set CI - activity key: ", dVar);
            s sVar = this.f61693O.get(dVar);
            Object[] objArr = new Object[4];
            objArr[0] = "set CI - current activity ad: ";
            objArr[1] = sVar == null ? V8ValueNull.NULL : sVar;
            objArr[2] = ", current activity ad keys: ";
            objArr[3] = this.f61693O.keySet();
            Logger.printFullVerboseLog(f61687L, objArr);
            if (sVar != null) {
                if (!sVar.f62703X && StatsReporter.b().a(creativeInfo, sVar)) {
                    sVar.f62703X = true;
                }
                CreativeInfo creativeInfoJ = sVar.j();
                if (creativeInfoJ != null) {
                    Logger.d(f61687L, "set CI - previous CI id: ", creativeInfoJ.N());
                    if (creativeInfoJ.N().equals(creativeInfo.N())) {
                        AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(creativeInfo.S());
                        if (adNetworkDiscoveryJ != null) {
                            adNetworkDiscoveryJ.d(creativeInfoJ);
                        }
                        Logger.printFullVerboseLog(f61687L, "set CI - already matched, same ad ID. current match: ", creativeInfo.ac(), ", previous match: ", creativeInfoJ.ac());
                    }
                }
                creativeInfo.a(oVar.f62691b, oVar.f62692c, oVar.f62693d);
                sVar.a(creativeInfo);
                Logger.d(f61687L, "set CI - CI is set for activity native ", dVar, ". CI : ", creativeInfo);
                b(sVar, creativeInfo);
                a(sVar, false, "setCreativeInfo");
                return true;
            }
            Logger.printFullVerboseLog(f61687L, "set CI - no activity ad, cannot set CI. current activity ads: ", this.f61693O);
        } else {
            Logger.d(f61687L, "set CI - no CI");
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3, boolean z2, String str4) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str, String str2, String str3) {
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void e(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public c a(String str, RedirectDetails redirectDetails, m mVar, boolean z2, boolean z3) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, x xVar) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean b(String str, String str2, String str3) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, boolean z2, String str3) {
        return false;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(k kVar) {
    }

    private boolean a(int i2) {
        boolean zC2 = BrandSafetyUtils.c(i2);
        Logger.d(f61687L, "should stop sampling, max uniformed pixels count=", Integer.valueOf(i2), ", return value=", Boolean.valueOf(zC2));
        return zC2;
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        Map<d, s> map = this.f61693O;
        if (map != null) {
            for (s sVar : map.values()) {
                if (sVar.f62702W) {
                    sVar.a(l.f62671z, new l.a[0]);
                    a(sVar, false, "onBackground");
                }
            }
        }
    }

    @Override // com.safedk.android.internal.a
    public void h() {
        Map<d, s> map = this.f61693O;
        if (map != null) {
            for (s sVar : map.values()) {
                if (sVar.f62702W) {
                    sVar.a(l.f62620A, new l.a[0]);
                    a(sVar, false, "onForeground");
                }
            }
        }
    }

    protected class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        s f61707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f61708b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f61710d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f61709c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f61711e = false;

        public a(s sVar, d dVar, int i2) {
            this.f61708b = dVar;
            this.f61707a = sVar;
            this.f61710d = i2;
        }

        private void a(View view) {
            if (view == null) {
                return;
            }
            Logger.d(NativeFinder.f61687L, "handle native ad reflection - root= ", view, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(this.f61708b.f62522d);
            if (adNetworkDiscoveryJ != null) {
                View viewG = adNetworkDiscoveryJ.g(view);
                Logger.d(NativeFinder.f61687L, "handle native ad reflection - native view= ", viewG);
                if (viewG != null) {
                    List<CreativeInfo> listA = adNetworkDiscoveryJ.a(new WeakReference<>(viewG), this.f61707a.f61820M, BrandSafetyUtils.AdType.NATIVE);
                    Logger.d(NativeFinder.f61687L, "handle native ad reflection - CIs generated: ", listA);
                    if (listA != null) {
                        for (CreativeInfo creativeInfo : listA) {
                            creativeInfo.a((Object) view);
                            creativeInfo.a(NativeFinder.this.f61781c);
                            creativeInfo.h(this.f61708b.f62521c);
                            creativeInfo.j(this.f61708b.f62520b);
                            Logger.d(NativeFinder.f61687L, "handle native ad reflection - setting ci: ", creativeInfo.ac());
                            NativeFinder.this.a(this.f61708b.f62519a, this.f61708b.f62523e, new o(creativeInfo, CreativeInfo.f62461y));
                        }
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference weakReference;
            try {
                this.f61709c++;
                if (this.f61707a != null) {
                    synchronized (NativeFinder.class) {
                        weakReference = (WeakReference) NativeFinder.f61689Q.get(this.f61708b.f62521c);
                    }
                    if (weakReference != null && weakReference.get() != null) {
                        MaxNativeAdView maxNativeAdView = (MaxNativeAdView) weakReference.get();
                        if (CreativeInfoManager.a(this.f61708b.f62522d, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false) && !this.f61711e) {
                            a(maxNativeAdView);
                            this.f61711e = true;
                        }
                        if (maxNativeAdView.getWidth() > 0 && maxNativeAdView.getHeight() > 0) {
                            this.f61707a.ag = maxNativeAdView.getWidth() / maxNativeAdView.getHeight();
                            Logger.d(NativeFinder.f61687L, "native impression task - view size: ", Integer.valueOf(maxNativeAdView.getWidth()), "x", Integer.valueOf(maxNativeAdView.getHeight()), ", proportion: ", Float.valueOf(this.f61707a.ag));
                        }
                        if (this.f61709c < this.f61710d && !this.f61707a.f62704Y) {
                            if (this.f61707a.ab != null && this.f61707a.ab.get() != null) {
                                a(this.f61707a, (View) weakReference.get());
                                return;
                            }
                            return;
                        }
                        Logger.d(NativeFinder.f61687L, qUrazMnwDskFs.neWGmbiY, this.f61707a.f61819L, ", stop timer? ", Boolean.valueOf(this.f61707a.f62704Y), ", image counter=", Integer.valueOf(this.f61709c), ", max attempts=", Integer.valueOf(this.f61710d), ", isImpressionReported=", Boolean.valueOf(this.f61707a.f61812E), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                        if (!this.f61707a.f61812E) {
                            NativeFinder.this.a(this.f61707a, false, "NativeImpressionTask");
                        }
                        this.f61707a.aa.cancel(false);
                    }
                }
            } catch (Throwable th) {
                Logger.e(NativeFinder.f61687L, "Error in NativeImpressionTask: ", th);
            }
        }

        private void a(final s sVar, final View view) {
            if (sVar != null && view != null) {
                try {
                    if (!com.safedk.android.utils.e.a((c) sVar)) {
                        Logger.d(NativeFinder.f61687L, Logger.FeatureTag.AD_CAPTURE, "Taking screenshot, view=", view, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                        sVar.ab.get().runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.a.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Logger.d(aNrWBQYwFf.wISdNjGMkHwF, "Taking screenshot - using old method");
                                final Bitmap bitmapA = ScreenshotHelper.a(view, SafeDK.getInstance().aa(), sVar);
                                NativeFinder.this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.a.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        NativeFinder.this.a(sVar, bitmapA, a.this.f61709c);
                                    }
                                });
                            }
                        });
                        return;
                    }
                } catch (Throwable th) {
                    Logger.e(NativeFinder.f61687L, "Error while taking screenshot", th);
                    return;
                }
            }
            Logger.d(NativeFinder.f61687L, Logger.FeatureTag.MEMORY_LOAD, "don't take screenshot, ad info: ", sVar, ", low memory");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void a(final Bitmap bitmap, final c cVar) {
        this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    s sVar = (s) cVar;
                    NativeFinder.this.a(sVar, bitmap, sVar.ac.f61709c);
                } catch (Throwable th) {
                    Logger.d(NativeFinder.f61687L, "handleScreenshotCompleted exception : ", th.getMessage(), th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar, Bitmap bitmap, int i2) {
        String str;
        String str2;
        String str3;
        int i3;
        int i5;
        if (bitmap != null) {
            Logger.d(f61687L, "process screenshot - currentActivityAd  = ", sVar);
            String strC = sVar.c();
            BrandSafetyUtils.a aVarB = BrandSafetyUtils.b(strC, bitmap);
            int iA = aVarB.a();
            BrandSafetyUtils.ScreenshotValidity screenshotValidityC = BrandSafetyUtils.c(strC, aVarB);
            if (screenshotValidityC == BrandSafetyUtils.ScreenshotValidity.VALID) {
                Logger.d(f61687L, "process screenshot - VALID ");
                String strA = BrandSafetyUtils.a(bitmap);
                BrandSafetyUtils.ScreenShotOrientation screenShotOrientationB = BrandSafetyUtils.b(bitmap);
                k kVarI = sVar.i();
                String strA2 = BrandSafetyUtils.a(bitmap, this.f61781c, strA, strC, kVarI.f62596a, screenShotOrientationB);
                Logger.d(f61687L, Logger.FeatureTag.AD_CAPTURE, "process screenshot - screenshot file created, filename = ", strA2, ", hash = ", strA);
                long jC = BrandSafetyUtils.c(strA2);
                Logger.d(f61687L, "process screenshot - hash ", strA, ", stored file size is ", Long.valueOf(jC), " bytes, counter is ", Integer.valueOf(i2), ", uniform pixel count is ", Integer.valueOf(iA), " (", Float.valueOf((iA / 500.0f) * 100.0f), "%)");
                int size = this.f61774C.size();
                if (!d(strA, kVarI.f62596a)) {
                    if (size <= SafeDK.getInstance().J()) {
                        if (kVarI.f62597c != null && kVarI.f62597c.f62584a != null && !kVarI.f62597c.f62584a.equals(strA)) {
                            Logger.d(f61687L, "process screenshot - removing ad file ", kVarI.f62597c.f62585b);
                            BrandSafetyUtils.d(kVarI.f62597c.f62585b);
                        }
                        kVarI.b(l.f62665t, new l.a("typ", l.f62643X));
                        Logger.d(f61687L, "process screenshot - setting data hash = ", strA, ", file name = ", strA2, ", file size = ", Long.valueOf(jC));
                        str = strA;
                        str2 = "typ";
                        kVarI.f62597c = new j(str, strA2, jC, iA, i2, screenShotOrientationB, false);
                        a(sVar, false, "processScreenshot");
                        i3 = iA;
                        str3 = "processScreenshot";
                    } else {
                        str = strA;
                        str2 = "typ";
                        str3 = "processScreenshot";
                        i3 = iA;
                        if (!c(str, kVarI.f62596a)) {
                            Logger.d(f61687L, "process screenshot - No open slot for ", str, "_", kVarI.f62596a, ", # : ", Integer.valueOf(this.f61774C.size()));
                            BrandSafetyUtils.d(strA2);
                        } else {
                            Logger.d(f61687L, "process screenshot - Image ", str, "_", kVarI.f62596a, " is already scheduled for upload");
                        }
                    }
                } else {
                    str = strA;
                    str2 = "typ";
                    str3 = "processScreenshot";
                    i3 = iA;
                    Logger.d(f61687L, "process screenshot - not saving file for ", str, "_", kVarI.f62596a);
                    BrandSafetyUtils.d(strA2);
                }
                if (a(i3)) {
                    if (TextUtils.isEmpty(str)) {
                        i5 = 1;
                    } else {
                        i5 = 1;
                        sVar.e(true);
                        sVar.f62704Y = true;
                    }
                    l.a[] aVarArr = new l.a[i5];
                    aVarArr[0] = new l.a(str2, l.f62644Y);
                    kVarI.a(l.f62665t, aVarArr);
                    a(sVar, false, str3);
                    return;
                }
                return;
            }
            Logger.d(f61687L, Logger.FeatureTag.AD_CAPTURE, "process screenshot - screenshot is not valid: ", screenshotValidityC.name(), ", pixel count: ", Integer.valueOf(iA), ", counter = ", Integer.valueOf(i2), ", try again...");
        }
    }

    public static String b(MaxNativeAdView maxNativeAdView) {
        String str;
        String strA = BrandSafetyUtils.a(maxNativeAdView);
        synchronized (NativeFinder.class) {
            str = f61691S.get(strA);
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void b() {
        for (s sVar : this.f61693O.values()) {
            if (sVar.f62702W) {
                sVar.a(l.f62623D, new l.a[0]);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void c() {
        for (s sVar : this.f61693O.values()) {
            if (sVar.f62702W) {
                sVar.a(l.f62624E, new l.a[0]);
            }
        }
    }

    public int f() {
        Iterator<s> it = this.f61693O.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().f62702W) {
                i2++;
            }
        }
        return i2;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean f(String str) {
        synchronized (this.f61693O) {
            for (s sVar : this.f61693O.values()) {
                if (sVar != null && sVar.f62702W && sVar.c() != null && sVar.c().equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }
}
