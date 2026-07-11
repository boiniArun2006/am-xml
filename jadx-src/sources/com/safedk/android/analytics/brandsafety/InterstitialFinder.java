package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.media3.database.Kr.FlTC;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import c8G.Fsz.qwlyMfUJj;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.caoccao.javet.values.primitive.V8ValueNull;
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
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.squareup.moshi.Json;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class InterstitialFinder extends com.safedk.android.analytics.brandsafety.b {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final String f61633J = "InterstitialFinder";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final long f61634K = 500;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final long f61635L = 1000;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final int f61636M = 2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final int f61637N = 3;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final InterstitialInfoCollection f61638I;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map<String, List<o>> f61639O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final FullScreenActivitiesCollection f61640P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f61641Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private String f61642R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Object f61643S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Set<String> f61644T;

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean f(String str) {
        List<n> listA = this.f61638I.a(str);
        return listA != null && listA.size() > 0;
    }

    public InterstitialFinder() {
        super(BrandSafetyUtils.AdType.INTERSTITIAL, Arrays.asList(BrandSafetyUtils.f61444j, BrandSafetyUtils.f61445k, BrandSafetyUtils.f61446l), f61633J, com.safedk.android.analytics.brandsafety.b.f61769v);
        this.f61638I = new InterstitialInfoCollection();
        this.f61639O = new HashMap();
        this.f61640P = new FullScreenActivitiesCollection();
        this.f61641Q = false;
        this.f61643S = new Object();
        this.f61644T = new HashSet(Arrays.asList(CreativeInfo.f62446j, CreativeInfo.f62445i));
        this.f61778H = new HashMap();
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new n(str, str2, str3, screenShotOrientation, str4, str5);
    }

    public void m(String str) {
        for (n nVar : this.f61638I.a(str)) {
            CreativeInfo creativeInfoJ = nVar.j();
            if (creativeInfoJ != null && creativeInfoJ.y()) {
                Logger.d(f61633J, "set on endcard displayed - setting ci endcard detected. ci= ", creativeInfoJ.ac());
                nVar.i().f62613s = true;
                nVar.at = true;
            } else if (creativeInfoJ != null && (creativeInfoJ.v() || nVar.i().f62606l)) {
                Logger.d(f61633J, "set on endcard displayed - ci is video ad, setting video complete. ci= ", creativeInfoJ.ac());
                nVar.i().f62613s = true;
                a(nVar, true, "endcard");
            }
        }
    }

    public void n(String str) {
        for (n nVar : this.f61638I.a(str)) {
            if (nVar.i() != null && nVar.i().c()) {
                nVar.i().f62614t = true;
            }
        }
    }

    public void o(String str) {
        for (n nVar : this.f61638I.a(str)) {
            if (nVar.i() != null && nVar.i().d()) {
                nVar.i().f62615u = true;
                a((c) nVar);
            }
        }
    }

    public void f(String str, String str2) {
        List<n> listA;
        Logger.d(f61633J, "on video completed - sdk = ", str, ", originatedBy = ", str2);
        if (str != null && (listA = this.f61638I.a(str)) != null && !listA.isEmpty()) {
            Iterator<n> it = listA.iterator();
            if (it.hasNext()) {
                n next = it.next();
                Logger.d(f61633J, "on video completed - sdk = ", str, ", found interstitialInfo by sdkPackage : ", next);
                a(next, true, str2);
                return;
            }
        }
        ArrayList<n> arrayList = new ArrayList();
        synchronized (this.f61638I) {
            for (n nVar : this.f61638I.values()) {
                if (nVar != null && nVar.f61840v.equals(str)) {
                    arrayList.add(nVar);
                }
            }
        }
        for (n nVar2 : arrayList) {
            Logger.d(f61633J, "on video completed - sdk = ", str, ", found interstitialInfo by eventId : ", nVar2);
            a(nVar2, true, str2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, boolean z2, String str3) {
        n nVarA;
        Logger.d(f61633J, "on video completed triggered started - for view address  : ", str2, ", sdkPackageName : ", str, ", completed: ", Boolean.valueOf(z2));
        if (str2 != null && (nVarA = this.f61638I.a(str2, !z2)) != null) {
            a(nVarA, z2, str3);
            CreativeInfo creativeInfoJ = nVarA.j();
            if (creativeInfoJ != null) {
                Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "on interstitial video event triggered - setting ci ad as video ad.");
                creativeInfoJ.f(true);
            }
            return true;
        }
        for (n nVar : this.f61638I.a(str)) {
            Logger.d(f61633J, "on video completed triggered - sdkPackageName : ", str, ", view address: ", str2, ", completed: ", Boolean.valueOf(z2));
            a(nVar, z2, str3);
        }
        return !r6.isEmpty();
    }

    private void a(n nVar, boolean z2, String str) {
        Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "set on video completed started, eventId: ", nVar.f61819L, ", completed = ", Boolean.valueOf(z2));
        synchronized (nVar.au) {
            if (!nVar.i().f62605k && z2) {
                CreativeInfo creativeInfoJ = nVar.j();
                if (creativeInfoJ != null) {
                    if (creativeInfoJ.v()) {
                        a((c) nVar);
                    } else {
                        creativeInfoJ.f(true);
                    }
                }
                Logger.d(f61633J, "set on video completed started, onVideoCompletedEventHasBeenTriggered set to true ");
                nVar.e(str);
            } else if (!z2) {
                a((c) nVar);
                if (!nVar.i().f62606l || nVar.i().f62605k) {
                    nVar.b(l.f62660o, new l.a(l.f62635P, str));
                }
                if (!nVar.i().f62606l) {
                    nVar.i().f62606l = true;
                    if (nVar.i().j() != null) {
                        nVar.i().j().f(true);
                    }
                    Logger.d(f61633J, "set on video completed - impression is set to be a video impression");
                }
                Logger.d(f61633J, "set on video completed - eovEventTriggered set to false");
                nVar.i().f62605k = false;
                nVar.ab = false;
                nVar.an = false;
            }
        }
    }

    public void a(String str, String str2, boolean z2) {
        if (str2 != null && this.f61638I.a(str2, false) != null) {
            a(this.f61638I.a(str2, false), z2);
            return;
        }
        List<n> listA = this.f61638I.a(str);
        if (listA != null) {
            Iterator<n> it = listA.iterator();
            while (it.hasNext()) {
                a(it.next(), z2);
            }
        }
    }

    public void a(n nVar, boolean z2) {
        if (nVar == null || nVar.af) {
            Logger.d(f61633J, "stop taking screenshots for impression. info is null or already handled");
            return;
        }
        Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "stop taking screenshots for impression. starting. address = ", nVar.f61818K);
        if (z2 || this.f61641Q) {
            nVar.af = true;
            a(nVar.i());
            Logger.d(f61633J, "stop taking screenshots for impression. attempting to clear image hash and files");
            j jVarM = nVar.m();
            if (jVarM != null && jVarM.f62585b != null) {
                a(nVar, jVarM);
            } else {
                Logger.d(f61633J, "stop taking screenshots for impression. no active ci or no image taken.");
            }
            c(nVar, "stopTakingScreenshotsForImpression");
            return;
        }
        Logger.d(f61633J, "stop taking screenshots for impression. no max ad is active. ignoring");
    }

    private void a(n nVar, j jVar) {
        Logger.d(f61633J, "remove file and report event, file: ", jVar.f62585b);
        BrandSafetyUtils.d(jVar.f62585b);
        jVar.f62584a = null;
        jVar.f62585b = null;
        BrandSafetyUtils.d(nVar.b());
        jVar.f62586c = 0L;
        nVar.f61837s = null;
        jVar.f62587d = 0;
        c(nVar, "removeFileAndReportEvent");
    }

    private void a(n nVar, String str, ViewGroup viewGroup, List<WeakReference<WebView>> list, List<String> list2, List<String> list3, int i2) {
        String str2;
        int i3;
        char c2;
        String str3;
        String strA;
        CreativeInfo creativeInfoA;
        char c4 = 1;
        int i5 = i2 + 1;
        char c5 = 0;
        int i7 = 0;
        while (i7 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i7);
            list2.add(BrandSafetyUtils.a(childAt));
            StringBuilder sb = new StringBuilder();
            sb.append(CmcdData.STREAMING_FORMAT_HLS);
            sb.append(i5);
            sb.append("c");
            int i8 = i7 + 1;
            sb.append(i8);
            sb.append(":");
            sb.append(childAt);
            list3.add(sb.toString());
            if (childAt instanceof WebView) {
                list.add(new WeakReference<>((WebView) childAt));
                Object[] objArr = new Object[4];
                objArr[c5] = "find WebViews in view group - found view: ";
                objArr[c4] = childAt;
                objArr[2] = " , parent: ";
                objArr[3] = childAt.getParent() != null ? childAt.getParent().toString() : V8ValueNull.NULL;
                Logger.d(f61633J, objArr);
                str2 = f61633J;
                i3 = i8;
                c2 = 4;
            } else if (!(childAt instanceof ViewGroup)) {
                str2 = f61633J;
                i3 = i8;
                c2 = 4;
            } else {
                str2 = f61633J;
                c2 = 4;
                i3 = i8;
                a(nVar, str, (ViewGroup) childAt, list, list2, list3, i5);
            }
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
            if (adNetworkDiscoveryJ != null) {
                if (!a(str, childAt) || nVar.f61831m == null || nVar.j() != null || (strA = adNetworkDiscoveryJ.a(childAt, BrandSafetyUtils.AdType.INTERSTITIAL)) == null || (creativeInfoA = adNetworkDiscoveryJ.a((Object) strA)) == null) {
                    str3 = str2;
                } else {
                    List<CreativeInfo> listS = adNetworkDiscoveryJ.s(creativeInfoA.N());
                    Logger.FeatureTag featureTag = Logger.FeatureTag.CI_MATCHING;
                    Object[] objArr2 = new Object[6];
                    objArr2[c5] = "find WebViews in view group - found CI for adId ";
                    objArr2[c4] = strA;
                    int i9 = 2;
                    objArr2[2] = ", size : ";
                    objArr2[3] = Integer.valueOf(listS.size());
                    objArr2[c2] = " : ";
                    objArr2[5] = listS;
                    str3 = str2;
                    Logger.d(str3, featureTag, objArr2);
                    for (CreativeInfo creativeInfo : listS) {
                        creativeInfo.a((Object) childAt);
                        if (nVar.f61808A != null) {
                            BrandSafetyEvent.AdFormatType adFormatTypeA = BrandSafetyUtils.a(nVar.f61808A);
                            Object[] objArr3 = new Object[i9];
                            objArr3[c5] = "find WebViews in view group - setting ad format type to ";
                            objArr3[1] = adFormatTypeA;
                            Logger.d(str3, objArr3);
                            creativeInfo.a(adFormatTypeA);
                            nVar.d("ad_type_upd(fndWVUndrVGroup):" + adFormatTypeA);
                        }
                        a(new o(creativeInfo, CreativeInfo.f62450n, creativeInfoA.aa(), BrandSafetyUtils.a(childAt)));
                        i9 = 2;
                        c5 = 0;
                    }
                }
                if (!nVar.f62682W && adNetworkDiscoveryJ.a(childAt)) {
                    Logger.d(str3, Logger.FeatureTag.AD_CAPTURE, "find WebViews in view group - native player identified : ", childAt);
                    nVar.i().f62606l = true;
                    nVar.b(l.f62660o, new l.a(l.f62635P, "native"));
                }
                nVar.f62682W = nVar.f62682W || adNetworkDiscoveryJ.a(childAt);
            }
            i7 = i3;
            c4 = 1;
            c5 = 0;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        String string;
        String string2;
        String str;
        n nVarD;
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().p()) {
            return;
        }
        Bundle messageData = message.getMessageData();
        if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.f61780b.contains(messageData.getString("ad_format"))) {
            Logger.d(f61633J, "Revenue event detected : ", messageData);
            string = "revenue_event";
        } else {
            string = messageData.getString("type");
        }
        String string3 = messageData.getString("ad_format");
        String string4 = messageData.getString(BrandSafetyEvent.f62740k);
        String string5 = messageData.getString(BrandSafetyEvent.ad);
        String string6 = messageData.getString("dsp_name");
        String strC = CreativeInfoManager.c(string5);
        long jB = com.safedk.android.utils.n.b(System.currentTimeMillis());
        if (!messageData.containsKey("creative_id")) {
            string2 = null;
        } else {
            string2 = messageData.getString("creative_id");
        }
        String str2 = string2;
        com.safedk.android.analytics.events.a aVar = new com.safedk.android.analytics.events.a(string, jB, string3, string5, str2, string6);
        p.a().a(aVar);
        boolean zContains = this.f61780b.contains(string3);
        String strA = CreativeInfoManager.a(strC, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        if (zContains) {
            str = string5;
            if (str != null && str.equals(strA)) {
                Logger.d(f61633J, "full screen type but ad network not supported (", strA, ")");
                return;
            }
        } else {
            str = string5;
        }
        String string7 = messageData.getString("id", null);
        if (string7 == null) {
            Logger.d(f61633J, "No eventId in data bundle.");
        }
        if (!zContains) {
            return;
        }
        Logger.d(f61633J, "Max message received, package: ", strC, ", ts (seconds): ", Long.valueOf(jB), ", message received: ", message.getMessageData(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (!"WILL_DISPLAY".equals(string)) {
            if ("revenue_event".equals(string)) {
                Logger.d(f61633J, "REVENUE_EVENT event for package: ", strC, " placement: ", string4, " ad type: ", string3, ", event id: ", string7);
                a(string7, l.f62656k, new l.a("typ", messageData.getString("revenue_event")));
                a(string7, messageData);
                return;
            }
            if ("DID_CLICKED".equals(string)) {
                n nVarD2 = this.f61638I.d(string7);
                if (nVarD2 != null) {
                    Object[] objArr = new Object[2];
                    objArr[0] = "DID_CLICKED event for package: ";
                    objArr[1] = strC == null ? str : strC;
                    Logger.d(f61633J, objArr);
                    a(string7, l.f62653h, new l.a[0]);
                    b(nVarD2);
                    if (!TextUtils.isEmpty(nVarD2.e())) {
                        c(nVarD2, qwlyMfUJj.kDsNuygPkL);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("WILL_LOAD".equals(string)) {
                if (strC != null) {
                    Logger.d(f61633J, "WILL_LOAD event for package: ", strC, " placement: ", string4);
                    a(string7, l.f62649d, new l.a(l.f62633N, str));
                    CreativeInfoManager.a(strC, string4, str2, (String) null, string3);
                    return;
                }
                return;
            }
            if ("DID_HIDE".equals(string)) {
                if (strC != null) {
                    BrandSafetyUtils.p(strC);
                    Logger.d(f61633J, "DID_HIDE event for package: ", strC, " placement: ", string4, ", event id: ", string7);
                    n nVarD3 = this.f61638I.d(string7);
                    if (nVarD3 != null) {
                        a(string7, l.f62654i, new l.a[0]);
                        a(nVarD3, (String) null);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("DID_LOAD".equals(string)) {
                if (strC != null) {
                    Logger.d(f61633J, "DID_LOAD event for package: ", strC, " placement: ", string4);
                    a(string7, l.f62650e, new l.a(l.f62633N, str));
                    return;
                }
                return;
            }
            if ("DID_DISPLAY".equals(string)) {
                if (strC != null) {
                    Logger.d(f61633J, "DID_DISPLAY event for package: ", strC, " placement: ", string4);
                    a(string7, l.f62652g, new l.a[0]);
                    if (str2 != null && (nVarD = this.f61638I.d(string7)) != null) {
                        if (nVarD.f61808A != null && nVarD.f61808A.containsKey("id") && nVarD.f61808A.getString("id") != null && nVarD.f61808A.getString("id").equals(string7)) {
                            Logger.d(f61633J, "setting Max creative id to: ", str2, " for event id: ", string7);
                            nVarD.f61820M = str2;
                            return;
                        } else {
                            Logger.d(f61633J, "cannot update Max creative id. event id check failed.");
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if ("DID_FAIL_DISPLAY".equals(string)) {
                Logger.d(f61633J, "DID_FAIL_DISPLAY event for package: ", strC, " placement: ", string4);
                a(string7, l.f62655j, new l.a[0]);
                h(strC, string7);
                return;
            }
            return;
        }
        Logger.d(f61633J, "Number of InterstitialInfo objects : ", Integer.valueOf(this.f61638I.size()));
        Logger.d(f61633J, "adInfoCollectionForUpload count: ", Integer.valueOf(this.f61774C.size()));
        i();
        this.f61782d++;
        if (strC != null) {
            p.a().b(aVar);
            this.f61641Q = true;
            a(string7, l.f62651f, new l.a[0]);
            BrandSafetyUtils.o(strC);
            a(strC, new AtomicReference<>(messageData));
            CreativeInfoManager.a(strC, string4, str2, (String) null, string3);
            a aVar2 = new a(string4, string7);
            Logger.d(f61633J, "WILL_DISPLAY event for package: ", strC, " placement: ", string4, " ad type: ", string3, ", event id: ", string7);
            a(strC, aVar2);
        }
    }

    private void h(String str, String str2) {
        List<o> listRemove;
        n nVarD = this.f61638I.d(str2);
        if (nVarD != null) {
            nVarD.f61821N = true;
            if (nVarD.f61809B == null && StatsCollector.c() != null) {
                Logger.d(f61633J, "DID_FAIL_DISPLAY received for an impression that was not displayed, removing event from repository. impression id: ", nVarD.i().f62596a);
                StatsCollector.c().a(nVarD.n());
                if (CreativeInfoManager.a(str, AdNetworkConfiguration.CLEAR_FULLSCREEN_PENDING_CANDIDATES_ON_DID_FAIL_DISPLAY, false) && (listRemove = this.f61639O.remove(str)) != null) {
                    synchronized (listRemove) {
                        Iterator<o> it = listRemove.iterator();
                        while (it.hasNext()) {
                            Logger.d(f61633J, "DID_FAIL_DISPLAY event, removed pending CI: ", it.next().f62690a);
                        }
                    }
                }
            }
        }
    }

    private void i() {
        ArrayList<n> arrayList = new ArrayList();
        synchronized (this.f61638I) {
            for (n nVar : this.f61638I.values()) {
                if (nVar.f61821N && nVar.f61809B == null) {
                    arrayList.add(nVar);
                }
            }
        }
        for (n nVar2 : arrayList) {
            Logger.d(f61633J, "report previous failed impression, event ID: ", nVar2.f61819L);
            c(nVar2, "reportPreviousFailedImpressions");
            b((c) nVar2);
            a(nVar2.f61819L);
            w(nVar2.f61819L);
        }
    }

    private void a(String str, a aVar) {
        Logger.d(f61633J, "match CI started, sdk = ", str, ", interstitial key = ", aVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (aVar.f61675b != null) {
            Logger.d(f61633J, "match CI - interstitial key: ", aVar);
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
            if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.d() != null && adNetworkDiscoveryJ.d().a(AdNetworkConfiguration.f61901t, false)) {
                Logger.d(f61633J, "match CI - discovery configuration: ", adNetworkDiscoveryJ.d());
                String str2 = aVar.f61674a + "_" + aVar.f61675b + "_" + str;
                CreativeInfo creativeInfoA = adNetworkDiscoveryJ.a((Object) str2);
                if (creativeInfoA != null) {
                    Logger.d(f61633J, Logger.FeatureTag.CI_MATCHING, "match CI - discovery class returned a ci: ", creativeInfoA.ac());
                    if (creativeInfoA.n() == null) {
                        creativeInfoA.h(aVar.f61675b);
                    }
                    creativeInfoA.a(BrandSafetyEvent.AdFormatType.INTER);
                    creativeInfoA.u("ad_type_upd(matchCI):" + BrandSafetyEvent.AdFormatType.INTER);
                    a(new o(creativeInfoA, CreativeInfo.f62450n, null, str2));
                    return;
                }
                Logger.d(f61633J, "match CI - ci not found");
                return;
            }
            Logger.d(f61633J, "match CI - sdk not configured to allow max events based matching");
        }
    }

    public void a(String str, AtomicReference<Bundle> atomicReference) {
        if (atomicReference != null && atomicReference.get() != null) {
            Logger.d(f61633J, "start ad monitoring - slot = ", Integer.valueOf(this.f61782d), ", max package name = ", str, ", AppLovin data bundle is ", atomicReference.get(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (CreativeInfoManager.j(str) != null) {
                n nVar = new n(str, this.f61782d, atomicReference.get());
                nVar.f61819L = atomicReference.get().getString("id");
                synchronized (this.f61638I) {
                    this.f61638I.put(nVar.f61819L, nVar);
                }
                Logger.d(f61633J, "start ad monitoring - new interstitial info created : ", nVar);
                c(nVar);
                return;
            }
            Logger.d(f61633J, "start ad monitoring - slot = ", Integer.valueOf(this.f61782d), ", max package name = ", str, ", ad network is not supported");
        }
    }

    public void c(final Activity activity) {
        this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.d(InterstitialFinder.f61633J, "start ad monitoring - activity : ", activity, ", current interstitial infos :", InterstitialFinder.this.f61638I.toString());
                    if (activity == null) {
                        return;
                    }
                    if (!InterstitialFinder.this.f61638I.c(activity.toString())) {
                        synchronized (InterstitialFinder.this.f61640P) {
                            InterstitialFinder.this.f61640P.put(activity.toString(), new WeakReference<>(activity));
                        }
                        if (!InterstitialFinder.this.f61641Q) {
                            InterstitialFinder.this.f61641Q = true;
                        }
                        Logger.d(InterstitialFinder.f61633J, "start ad monitoring - activity added : ", activity.toString());
                    } else {
                        Logger.d(InterstitialFinder.f61633J, "start ad monitoring - activity null or already registered.");
                    }
                    if (InterstitialFinder.this.t(activity.toString())) {
                        Logger.d(InterstitialFinder.f61633J, "start ad monitoring - sdk: ", InterstitialFinder.this.f61638I.b(), ", activity ", activity, " started but this is not the start of impression. not starting ad monitoring");
                    } else {
                        Logger.d(InterstitialFinder.f61633J, "start ad monitoring calling 'start', activity is ", activity);
                        InterstitialFinder.this.f(activity);
                    }
                } catch (Exception e2) {
                    Logger.d(InterstitialFinder.f61633J, "start ad monitoring failed: ", e2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(String str) {
        n nVarB = this.f61638I.b(str);
        if (str != null && nVarB != null && nVarB.c() != null) {
            Logger.d(f61633J, "instances of same activity - current activity class name = ", nVarB.p(), ",  current activity address = ", nVarB.o());
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(nVarB.c());
            if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.d() != null && adNetworkDiscoveryJ.d().a(AdNetworkConfiguration.AD_NETWORK_INTERNAL_BROWSER_OPENS_IN_SAME_ACTIVITY, false)) {
                Logger.d(f61633J, "instances of same activity - discovery configuration = ", adNetworkDiscoveryJ.d());
                String str2 = nVarB.p() + "@" + nVarB.o();
                Logger.d(f61633J, "instances of same activity - current activity = ", str2);
                if (!str.equals(str2)) {
                    Logger.d(f61633J, "instances of same activity - activityClass ", str2, " is a different instance of the same activity");
                    return true;
                }
            }
        }
        return false;
    }

    private void b(n nVar) {
        Logger.d(f61633J, "handle DID_CLICKED started ", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (nVar == null) {
            Logger.d(f61633J, "current activity interstitial is null");
            return;
        }
        nVar.a(true);
        Logger.d(f61633J, "current activity interstitial setIsClicked true");
        if (nVar.e() != null) {
            Logger.d(f61633J, "current activity interstitial already have click url");
            return;
        }
        if (nVar.aj == null) {
            Logger.d(f61633J, "current activity interstitial doesn't have click url candidate");
            return;
        }
        if (nVar.aj.f62543a == 0) {
            Logger.d(f61633J, "current click url candidate has zero timestamp");
            return;
        }
        Logger.d(f61633J, "handle DID_CLICKED checking click url candidate");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - nVar.aj.f62543a < 20000) {
            Logger.d(f61633J, "handle DID_CLICKED setting click url");
            Logger.d(f61633J, "handle DID_CLICKED setting click url returned ", Boolean.valueOf(nVar.c(nVar.aj.f62544b)));
        } else {
            Logger.d(f61633J, "handle DID_CLICKED click url candidate's timestamp is not within the time range, currentTime :", Long.valueOf(jCurrentTimeMillis), " , currentClickUrlCandidate.ts : ", Long.valueOf(nVar.aj.f62543a), " , diff : ", Long.valueOf(jCurrentTimeMillis - nVar.aj.f62543a));
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f61283a;
    }

    public n d(Activity activity) {
        if (activity == null) {
            Logger.d(f61633J, "get activity interstitial by activity, activity is null");
            return null;
        }
        return this.f61638I.b(activity.toString());
    }

    public n p(String str) {
        return this.f61638I.d(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    public c l(String str) {
        return p(str);
    }

    public n q(String str) {
        return this.f61638I.a(str, true);
    }

    public n r(String str) {
        if (str == null) {
            Logger.d(f61633J, "get activity interstitial by package, package is null");
            return null;
        }
        List<n> listA = this.f61638I.a(str);
        if (listA.size() == 1) {
            Logger.d(f61633J, "get activity interstitial by package, ci found : ", listA.get(0));
            return listA.get(0);
        }
        Logger.d(f61633J, "there are ", Integer.valueOf(listA.size()), " interstitial infos, exiting");
        return null;
    }

    private void c(n nVar) {
        WeakReference<Activity> weakReferenceB;
        if (nVar == null) {
            return;
        }
        Activity activity = null;
        FullScreenActivitiesCollection fullScreenActivitiesCollection = this.f61640P;
        if (fullScreenActivitiesCollection != null && (weakReferenceB = fullScreenActivitiesCollection.b(nVar.f61840v)) != null && weakReferenceB.get() != null) {
            activity = weakReferenceB.get();
            Logger.d(f61633J, "start - activity set to ", activity);
        }
        a(nVar, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Activity activity) {
        if (activity == null) {
            return;
        }
        Logger.d(f61633J, "start - activity name = ", activity, ", sdk = ", BrandSafetyUtils.b(activity.getClass()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        n nVarB = this.f61638I.b(BrandSafetyUtils.a((Object) activity));
        Logger.d(f61633J, "start - attempt to find by activity address, currentActivityInterstitial = ", nVarB);
        if (nVarB == null) {
            Iterator<n> it = this.f61638I.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n next = it.next();
                String strB = BrandSafetyUtils.b(activity.getClass());
                Logger.d(f61633J, "start - activity : ", activity, ", activitySdk : ", strB, ", InterstitialInfo sdk : ", next.f61840v);
                if (strB != null && strB.equals(next.f61840v)) {
                    nVarB = next;
                    break;
                } else if (com.safedk.android.utils.h.f63168h.equals(strB) && f61751B.contains(next.f61840v)) {
                    Logger.d(f61633J, "start - activity SDK is not compatible with interstitial SDK, may be scar-admob");
                } else {
                    Logger.d(f61633J, "start - activity SDK is not compatible with interstitial SDK");
                }
            }
        }
        if (nVarB != null) {
            a(nVarB, activity);
        } else {
            Logger.d(f61633J, "start - failed to find interstitial info for activity : ", activity);
        }
    }

    private void a(n nVar, Activity activity) {
        String strA;
        String strA2;
        String strB;
        if (nVar == null) {
            return;
        }
        Set<String> set = null;
        if (activity == null) {
            strA = null;
            strA2 = null;
            strB = null;
        } else {
            strA = BrandSafetyUtils.a(activity.toString(), true);
            strA2 = BrandSafetyUtils.a(activity.toString(), false);
            strB = BrandSafetyUtils.b(activity.getClass());
        }
        Logger.d(f61633J, "start - activity address: ", strA, ", interstitial info activity address: ", nVar.f61809B);
        if (strA != null && strA.equals(nVar.f61809B)) {
            boolean zA = CreativeInfoManager.a(strB, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
            j jVarM = nVar.m();
            if (!zA && jVarM != null && !TextUtils.isEmpty(jVarM.f62584a) && a(jVarM.f62587d, jVarM.f62586c)) {
                Logger.d(f61633J, "start - Not starting timer on activity ", nVar.ad, " -- impression already logged");
                return;
            } else {
                Logger.d(f61633J, "start - Starting counter from previous value ", Integer.valueOf(nVar.s()));
                nVar.I();
            }
        } else {
            Logger.d(f61633J, "start - activity class: ", strA2, ", interstitial info activity address: ", nVar.f61810C);
            if (strA2 != null && strA2.equals(nVar.f61810C)) {
                Logger.d(f61633J, "start - current activity interstitial class name = ", nVar.f61810C, qfEYuUHwj.fhRVcOVl, strA2);
            } else {
                set = nVar.f62683X;
                if (set.contains(strA)) {
                    Logger.d(f61633J, "start - Ignoring restart of suspected mediation ", nVar.ad);
                    return;
                } else if (nVar.f61809B != null) {
                    set.add(nVar.f61809B);
                }
            }
            List<o> arrayList = new ArrayList<>();
            Logger.d(f61633J, "interstitial finder start - current activity interstitial is ", nVar);
            if (nVar != null && !nVar.f61812E && !nVar.k().isEmpty()) {
                Logger.d(f61633J, "interstitial finder start - current activity interstitial != null : ", nVar);
                List<CreativeInfo> listK = nVar.k();
                if (!listK.isEmpty()) {
                    for (CreativeInfo creativeInfo : listK) {
                        if (creativeInfo != null) {
                            Logger.d(f61633J, "interstitial finder start - setting current activity interstitials CI: ", creativeInfo);
                            arrayList.add(new o(creativeInfo, creativeInfo.Z(), creativeInfo.aa(), creativeInfo.Y()));
                        } else {
                            Logger.d(f61633J, "interstitial finder start - current CI matching method not equal, current CI: ", creativeInfo);
                        }
                    }
                } else {
                    Logger.d(f61633J, "interstitial finder start - current CI is null");
                }
                Logger.d(f61633J, "interstitial finder start - current activity interstitial impression reported? ", Boolean.valueOf(nVar.f61812E));
                a(nVar, true);
            }
            if (activity != null) {
                nVar.ae = SystemClock.elapsedRealtime();
                a(activity, nVar);
                b(nVar, activity);
            }
            if (nVar.f61840v != null) {
                Logger.d(f61633J, "start - current Max package name: ", nVar.f61840v);
                if (!CreativeInfoManager.a(nVar.f61840v, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false) && activity != null) {
                    if (!BrandSafetyUtils.d(activity.getClass())) {
                        Logger.d(f61633J, "start - current foreground activity is not a supported ad activity");
                        return;
                    }
                    Logger.d(f61633J, "start - checking pending ci for no activity sdk ", nVar.f61840v);
                    arrayList = a(nVar.f61840v, nVar);
                    for (o oVar : arrayList) {
                        Logger.d(f61633J, "start - found pending ci(s) for no activity sdk, mi : ", oVar);
                        b(oVar, nVar);
                    }
                }
            }
            nVar.L();
            Logger.d(f61633J, "start - no CI so adding the noCIDebug to CIDebugInfo");
            if (nVar.aq != null && nVar.aq.get() != null) {
                g(nVar);
                if (arrayList.isEmpty()) {
                    arrayList = a(strB, nVar);
                }
                nVar.aa = 0L;
            }
            if (CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false)) {
                nVar.ae = SystemClock.elapsedRealtime();
                Logger.d(f61633J, "interstitial finder inter runs on app activity, checking for pending CIs. sdk = ", nVar.c());
                arrayList = a(nVar.c(), nVar);
                Logger.d(f61633J, "interstitial finder inter runs on app activity, checking for pending CIs. found ", Integer.valueOf(arrayList.size()), " items");
            }
            for (o oVar2 : arrayList) {
                if (oVar2 != null && oVar2.f62690a != null) {
                    b(oVar2, nVar);
                }
            }
            if (set != null) {
                nVar.f62683X = set;
            }
        }
        Logger.d(f61633J, "start - before timer, time interstitial info event id is: ", nVar.f61819L);
        synchronized (nVar.av) {
            if (d(nVar)) {
                Logger.d(f61633J, "start - starting timer for interstitial info with eventId ", nVar.f61819L);
                nVar.al = this.f61776E.scheduleWithFixedDelay(new b(nVar.f61819L, nVar.f61840v), 500L, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    private boolean d(n nVar) {
        ScheduledFuture<?> scheduledFuture = nVar != null ? nVar.al : null;
        Object[] objArr = new Object[4];
        objArr[0] = "should start timer started, task future = ";
        objArr[1] = scheduledFuture;
        objArr[2] = ", is cancelled = ";
        objArr[3] = scheduledFuture != null ? Boolean.valueOf(scheduledFuture.isCancelled()) : null;
        Logger.d(f61633J, objArr);
        if (nVar != null && nVar.aq != null) {
            Logger.d(f61633J, "should start timer - inter activity is: ", nVar.aq.get());
            Logger.d(f61633J, "should start timer - inter activity CI is: ", nVar.j());
        }
        boolean z2 = nVar != null && (scheduledFuture == null || scheduledFuture.isCancelled()) && !((nVar.aq == null || nVar.aq.get() == null) && (nVar.j() == null || nVar.j().f() == null));
        Logger.d(f61633J, "should start timer returned: ", Boolean.valueOf(z2));
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, n nVar) {
        if (activity != null) {
            String[] strArr = {BrandSafetyUtils.a(activity.toString(), false), BrandSafetyUtils.a(activity.toString(), true)};
            String string = activity.toString();
            nVar.ad = string;
            nVar.aq = new WeakReference<>(activity);
            nVar.a(strArr);
            synchronized (this.f61640P) {
                this.f61640P.remove((Object) activity.toString());
            }
            Logger.d(f61633J, "interstitial info activity details set : ", activity.getClass(), ", sdk = ", nVar.f61840v, ", activity name = ", string, ", activities = ", this.f61640P.a(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            return;
        }
        Logger.d(f61633J, "cannot set interstitial info activity details, activity is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<o> a(String str, n nVar) {
        ArrayList arrayList = new ArrayList();
        List<o> list = this.f61639O.get(str);
        Object[] objArr = new Object[4];
        objArr[0] = "pending ci check, number of pending CIs: ";
        objArr[1] = Integer.valueOf(list != null ? list.size() : 0);
        objArr[2] = ", isOnUiThread = ";
        objArr[3] = Boolean.valueOf(com.safedk.android.utils.n.c());
        Logger.printFullVerboseLog(f61633J, objArr);
        Logger.d(f61633J, "pending ci check, pending object addresses are: ", a(list));
        if (list != null) {
            synchronized (list) {
                Iterator<o> it = list.iterator();
                while (it.hasNext()) {
                    o next = it.next();
                    Logger.d(f61633J, "pending ci check, matching method: ", next.f62691b, ", ci: ", next.f62690a.ac());
                    if (a(next.f62690a, nVar) && next.f62690a != null) {
                        nVar.d("pcim|ts=" + System.currentTimeMillis() + "|ls=" + list.size() + ";" + next.f62691b + "|o=" + next.f62690a.aj() + ";" + next.f62690a.ak());
                        it.remove();
                        Logger.d(f61633J, "pending ci check, creative info is the pending creative info: ", next);
                        arrayList.add(next);
                    }
                }
            }
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
            if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.b() == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                list.clear();
            }
        }
        return arrayList;
    }

    private boolean a(CreativeInfo creativeInfo, n nVar) {
        if (creativeInfo == null || nVar == null) {
            return false;
        }
        Logger.d(f61633J, "verify matching - current activity interstitial: ", nVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (nVar.f61819L != null && !TextUtils.isEmpty(creativeInfo.n()) && !nVar.f61819L.equals(creativeInfo.n())) {
            Logger.d(f61633J, "verify matching - incompatible event ID, ci: ", creativeInfo.n(), ", info: ", nVar.f61819L);
            if (!CreativeInfoManager.a(nVar.f61840v, AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, false)) {
                return false;
            }
            creativeInfo.u("cim-iei=" + creativeInfo.n());
        }
        AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(creativeInfo.T() == null ? creativeInfo.S() : creativeInfo.T());
        if (adNetworkDiscoveryJ != null) {
            if (adNetworkDiscoveryJ.b() == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                if (nVar.r() != null) {
                    String string = nVar.r().getString(BrandSafetyEvent.f62740k);
                    String string2 = nVar.r().getString("ad_format");
                    if (creativeInfo.H() == null || (string != null && string.equals(creativeInfo.H()))) {
                        Logger.d(f61633J, Logger.FeatureTag.CI_MATCHING, "verify matching DIRECT_CREATIVE_INFO, CI placement: ", creativeInfo.H(), ", CI format: ", creativeInfo.K());
                        return true;
                    }
                    Logger.d(f61633J, Logger.FeatureTag.CI_MATCHING, "verify matching DIRECT_CREATIVE_INFO, verification failed for CI placement: ", creativeInfo.H(), ", CI format: ", creativeInfo.K());
                    nVar.d("verifyMatchingFailed|placement=(" + string + "," + creativeInfo.H() + ")|format=(" + string2 + "," + creativeInfo.H() + ")");
                    return false;
                }
            } else {
                return a(creativeInfo.aj(), creativeInfo.ak(), nVar);
            }
        }
        Logger.d(f61633J, "verify matching, no InterstitialInfo or no discovery for ", creativeInfo.S());
        return false;
    }

    private boolean a(String str, String str2, n nVar) {
        if (nVar == null) {
            return false;
        }
        Logger.d(f61633J, "verify matching object started, event ID: ", nVar.f61819L, ", object address: ", str2, ", webview address: ", nVar.f61818K, ", object type: ", str, ", currentActivityInterstitial = ", nVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        boolean zA = CreativeInfoManager.a(nVar.f61840v, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        if (str2 == null || MediaPlayer.class.getCanonicalName().equals(str) || zA) {
            Logger.d(f61633J, Logger.FeatureTag.CI_MATCHING, "verify matching object skipped, event ID: ", nVar.f61819L, ", object address: ", str2, ", object type: ", str, ", sdkInterstitialsRunOnAppActivity: ", Boolean.valueOf(zA));
            return true;
        }
        if (nVar.x() == null || !nVar.x().contains(str2)) {
            Logger.d(f61633J, Logger.FeatureTag.CI_MATCHING, "verify matching object failed, event ID: ", nVar.f61819L, ", object address: ", str2, ", views hierarchy: ", nVar.x());
            return false;
        }
        Logger.d(f61633J, Logger.FeatureTag.CI_MATCHING, "verify matching object done, event ID: ", nVar.f61819L, ", object address: ", str2, ", views hierarchy: ", nVar.x());
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(final String str) {
        if (com.safedk.android.utils.n.c()) {
            this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.3
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.u(str);
                }
            });
        } else {
            u(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(String str) {
        Logger.d(f61633J, "stop timers - canceling timer for interstitials, eventId = ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        n nVarD = this.f61638I.d(str);
        if (nVarD != null) {
            if (nVarD.s() == 0) {
                nVarD.ac = null;
            }
            if (nVarD.al != null) {
                Logger.d(f61633J, "stop timers - calling timer cancel");
                if (!nVarD.al.cancel(true)) {
                    Logger.d(f61633J, "stop timers - failed to call timer cancel");
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        List<CreativeInfo> listL = null;
        for (n nVar : this.f61638I.values()) {
            if (nVar != null && !nVar.f61827U) {
                boolean z2 = nVar.f61818K != null && nVar.f61818K.equals(str2);
                boolean z3 = nVar.f61831m != null && nVar.f61831m.contains(str2);
                if (z2 || z3) {
                    listL = nVar.l();
                }
            }
        }
        return listL;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str) {
        List<CreativeInfo> listL = null;
        for (n nVar : this.f61638I.values()) {
            if (nVar != null && !nVar.f61827U && nVar.c().equals(str)) {
                listL = nVar.l();
                Logger.d(f61633J, "get CreativeInfo By Sdk Package Name returned ", listL);
            }
        }
        return listL;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str, String str2) {
        ArrayList arrayList;
        List<CreativeInfo> listK;
        synchronized (this.f61638I) {
            for (n nVar : this.f61638I.values()) {
                if (nVar != null && (listK = nVar.k()) != null && !listK.isEmpty() && listK.get(0) != null && listK.get(0).N() != null && listK.get(0).N().equals(str2)) {
                    return listK;
                }
            }
            List<o> list = this.f61639O.get(str);
            if (list != null) {
                synchronized (list) {
                    arrayList = new ArrayList();
                    for (o oVar : list) {
                        if (oVar.f62690a != null && oVar.f62690a.N() != null && oVar.f62690a.N().equals(str2)) {
                            arrayList.add(oVar.f62690a);
                        }
                    }
                }
                return arrayList;
            }
            return new ArrayList();
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public c c(String str) {
        synchronized (this.f61638I) {
            for (n nVar : this.f61638I.values()) {
                if (nVar != null && nVar.f61831m != null && nVar.f61831m.contains(str)) {
                    return nVar;
                }
            }
            return null;
        }
    }

    public void e(final Activity activity) {
        if (com.safedk.android.utils.n.c()) {
            this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.4
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.g(activity);
                }
            });
        } else {
            g(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Activity activity) {
        try {
            Logger.d(f61633J, "interstitial finder stop, activity = ", activity.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            n nVarB = this.f61638I.b(activity.toString());
            if (nVarB != null) {
                if (nVarB.ad == null || activity.toString().equals(nVarB.ad)) {
                    Logger.d(f61633J, "Stopping interstitial finder for activity ", nVarB.ad);
                    a(nVarB.f61819L);
                    Logger.d(f61633J, "interstitial finder, viewing time (ms) = ", Long.valueOf(nVarB.aa));
                }
            }
        } catch (Throwable th) {
            Logger.e(f61633J, th.getMessage(), th);
            new CrashReporter().caughtException(th);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void e(final String str) {
        if (com.safedk.android.utils.n.c()) {
            this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.5
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.v(str);
                }
            });
        } else {
            v(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        if (str != null) {
            synchronized (this.f61640P) {
                Logger.d(f61633J, "Activity destroyed activity class: ", str, ", activities: ", this.f61640P.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                this.f61640P.remove((Object) str);
            }
            String sdkPackageByClass = SdksMapping.getSdkPackageByClass(str);
            n nVarB = this.f61638I.b(str);
            if (nVarB != null) {
                if (sdkPackageByClass != null && nVarB.f61840v != null && !sdkPackageByClass.equals(nVarB.f61840v)) {
                    Logger.d(f61633J, "Activity destroyed, activity SDK does not fit the WILL_DISPLAY msg: ", sdkPackageByClass);
                } else if (nVarB.ad != null && !nVarB.ad.equals(str)) {
                    Logger.d(f61633J, "Activity destroyed, activity address (", str, " ) does not match the address of the ad's activity (", nVarB.ad, ")");
                } else {
                    nVarB.a(l.f62622C, new l.a[0]);
                    a(nVarB, str);
                }
            }
        }
    }

    public void a(String str, Bundle bundle) {
        n nVar;
        if (this.f61638I.containsKey(str) && (nVar = this.f61638I.get(str)) != null) {
            if (bundle.getString("revenue_event") != null) {
                nVar.f61823P = bundle.getString("revenue_event");
            } else {
                nVar.f61823P = "unknown";
            }
            c(nVar, "handleRevenueEvent");
            Logger.d(f61633J, "Revenue event set to ", bundle.getString("revenue_event"), " for eventId: ", str);
            return;
        }
        Logger.d(f61633J, "Revenue event - no interstitial info found for event ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
    }

    public void a(final n nVar, final String str) {
        Object[] objArr = new Object[6];
        objArr[0] = "Ad hidden started, activityClass=";
        objArr[1] = str == null ? V8ValueNull.NULL : str;
        objArr[2] = ", interstitial infos=";
        objArr[3] = this.f61638I.toString();
        objArr[4] = ", isOnUiThread = ";
        objArr[5] = Boolean.valueOf(com.safedk.android.utils.n.c());
        Logger.d(f61633J, objArr);
        if (nVar != null) {
            if (t(str)) {
                Logger.d(f61633J, "Ad hidden ", nVar.c(), " activity ", str, " unloaded but this is not the end of impression. not calling cleanAndReport");
                return;
            }
            c(nVar, "onAdHidden");
            nVar.f61827U = true;
            this.f61776E.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.6
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.b(nVar, str);
                }
            }, 3L, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(n nVar, String str) {
        String str2;
        if (nVar == null) {
            Logger.d(f61633J, "clean and report - current interstitial info is NULL, SKIPPING");
            return;
        }
        if (nVar.H()) {
            Logger.d(f61633J, "clean and report - already run, SKIPPING");
            return;
        }
        nVar.g(true);
        try {
            char c2 = 6;
            Logger.d(f61633J, "clean and report started, activity class=", str, ", eventId = ", nVar.f61819L, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (str != null) {
                str2 = str;
            } else {
                String str3 = nVar.ad;
                Logger.d(f61633J, "clean and report - activity class set to (curr intractname) ", nVar.ad);
                str2 = str3;
            }
            String sdkPackageByClass = SdksMapping.getSdkPackageByClass(str2);
            for (k kVar : nVar.g()) {
                if (kVar.j() != null) {
                    Logger.d(f61633J, "clean and report - activity SDK = ", sdkPackageByClass, ", CI SDK = ", kVar.j().S(), ", interstitial activity name=", nVar.ad);
                    Logger.d(f61633J, "clean and report - currentMaxPackageName = ", nVar.f61840v, ", activitySdk = ", sdkPackageByClass);
                    if (nVar.f61840v != null && !nVar.f61840v.equals(sdkPackageByClass) && !nVar.f61840v.equals(kVar.j().S()) && !nVar.f62686ak) {
                        Logger.d(f61633J, "clean and report - skip reporting as no related WILL_DISPLAY message received, current Max package name: ", nVar.f61840v, ", activity SDK: ", sdkPackageByClass, ", CI SDK: ", kVar.j().S());
                        kVar.a((CreativeInfo) null);
                    }
                }
                if (kVar.f62597c != null && kVar.f62597c.f62585b != null) {
                    kVar.f62598d = kVar.f62597c.f62585b;
                } else if (nVar.b() != null) {
                    kVar.f62598d = nVar.b();
                }
                Logger.d(f61633J, "clean and report - last impression screenshot filename set to ", kVar.f62598d);
            }
            com.safedk.android.analytics.brandsafety.creatives.g.a(f(nVar));
            if ((nVar.f61809B != null && nVar.f61809B.equals(BrandSafetyUtils.a(str2, true))) || CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false)) {
                for (k kVar2 : nVar.g()) {
                    if (kVar2 != null) {
                        if (kVar2.f62597c != null && kVar2.f62597c.f62585b != null && nVar.b() != null) {
                            if (this.f61774C.size() >= SafeDK.getInstance().J()) {
                                if (!c(nVar.f61837s, kVar2.f62596a)) {
                                    BrandSafetyUtils.d(nVar.f61838t);
                                    nVar.ac = null;
                                    nVar.f61838t = null;
                                }
                            } else {
                                Object[] objArr = new Object[8];
                                objArr[0] = "clean and report - image files: ";
                                objArr[1] = kVar2.f62597c.f62585b;
                                objArr[2] = ", ";
                                objArr[3] = nVar.f61838t;
                                objArr[4] = ", impression ID: ";
                                objArr[5] = kVar2.f62596a;
                                objArr[c2] = ", count = ";
                                objArr[7] = Integer.valueOf(this.f61774C.size());
                                Logger.d(f61633J, objArr);
                                a(nVar, kVar2);
                            }
                            Logger.d(f61633J, "clean and report - hash value: ", kVar2.f62597c.f62584a, " orientation: ", kVar2.f62597c.f62589f);
                            if (kVar2.f62597c.f62584a == null && !nVar.af) {
                                Logger.d(f61633J, "clean and report - assigning last captured hash to interstitial: ", nVar.ac);
                                kVar2.f62597c.f62584a = nVar.ac;
                                kVar2.f62597c.f62589f = nVar.f61839u;
                            }
                            this.f61642R = kVar2.f62597c.f62584a;
                        }
                        if (!kVar2.e().isEmpty()) {
                            for (String str4 : kVar2.e()) {
                                Logger.d(f61633J, "clean and report - attach resources to CI for webview/adId: ", str4);
                                com.safedk.android.analytics.brandsafety.creatives.g.a(nVar.c(), str4, kVar2);
                                if (CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true)) {
                                    try {
                                        if (kVar2.f62617w > 0) {
                                            nVar.d("aiw" + kVar2.f62617w);
                                        }
                                    } catch (Exception e2) {
                                        Logger.e(f61633J, "caught exception: ", e2);
                                    }
                                }
                            }
                            com.safedk.android.analytics.brandsafety.creatives.g.b(kVar2.e());
                        }
                        c2 = 6;
                    }
                }
                nVar.ag = SystemClock.elapsedRealtime();
                nVar.aa += nVar.ag - nVar.ae;
                Logger.d(f61633J, "clean and report - Viewing time (ms) = ", Long.valueOf(nVar.aa));
                if (CreativeInfoManager.j(nVar.f61840v) == null) {
                    return;
                }
                Logger.d(f61633J, "clean and report - number of CIs to report: ", Integer.valueOf(nVar.k().size()));
                c(nVar, "onAdHiddenTask");
                for (k kVar3 : nVar.g()) {
                    if (kVar3 != null && kVar3.j() != null && kVar3.j().Z() != null) {
                        Logger.d(f61633J, "clean and report - resetting CI matching method for ci ", kVar3.j());
                        kVar3.j().W();
                    }
                }
            } else {
                Logger.d(f61633J, "clean and report - DID NOT enter unload logic, current interstitial info=", nVar);
            }
            if (str2 != null) {
                Logger.d(f61633J, "clean and report - removing from activities : ", str2);
                synchronized (this.f61640P) {
                    this.f61640P.remove((Object) str2);
                }
            }
            b((c) nVar);
        } finally {
            try {
            } finally {
            }
        }
    }

    private void w(String str) {
        Logger.d(f61633J, "clearing AppLovin bundle, eventId = ", str);
        boolean z2 = this.f61638I.size() != 0;
        this.f61641Q = z2;
        Logger.d(f61633J, "clear variables, maxAdIsActive set to ", Boolean.valueOf(z2));
        if (str != null) {
            synchronized (this.f61638I) {
                this.f61638I.remove(str);
            }
            Logger.d(f61633J, "clear variables, removing ", str, " from currentInterstitialInfos");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.safedk.android.analytics.brandsafety.InterstitialFinder] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    public void c(n nVar, String str) {
        String str2;
        ArrayList arrayList;
        ?? r20;
        ArrayList arrayList2;
        CreativeInfo creativeInfo;
        if (nVar == null || !nVar.f62685Z) {
            Logger.d(f61633J, "reporting event - info is not interstitial, don't report info");
            return;
        }
        int i2 = 6;
        Logger.printFullVerboseLog(f61633J, "reporting event started, root=", str, ", info event id =", nVar.f61819L, " , isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        boolean z2 = !nVar.f61812E;
        boolean z3 = !nVar.f61813F && nVar.d();
        CreativeInfo creativeInfo2 = null;
        if (nVar.f61808A != null && nVar.f61808A.containsKey("id")) {
            String string = nVar.f61808A.getString("id");
            Logger.d(f61633J, "reporting event - event ID: ", string);
            str2 = string;
        } else {
            Logger.d(f61633J, "reporting event - no event ID");
            str2 = null;
        }
        ArrayList arrayList3 = new ArrayList();
        if (nVar.k().isEmpty()) {
            arrayList3.add(a(nVar, nVar.i(), z3, str2, null));
            arrayList = arrayList3;
        } else {
            Logger.d(f61633J, "reporting event - number of CIs: ", Integer.valueOf(nVar.k().size()));
            for (k kVar : new ArrayList(nVar.g())) {
                if (kVar.j() != null && !nVar.c().equals(kVar.j().S())) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = "reporting event without CI - sdk: ";
                    objArr[1] = nVar.c();
                    objArr[2] = ", CI sdk: ";
                    objArr[3] = kVar.j().S();
                    objArr[4] = ", CI actual sdk: ";
                    objArr[5] = kVar.j().T();
                    Logger.d(f61633J, objArr);
                    kVar.a(creativeInfo2);
                }
                Logger.d(f61633J, "reporting event (Check) root = ", str, ", debug info = ", nVar.B());
                List listAsList = Arrays.asList(com.safedk.android.utils.h.f63169i, FijIa.NoVQvDQyQufFw, com.safedk.android.utils.h.f63171k);
                if (!TextUtils.isEmpty(nVar.B()) && str.equals("onAdHidden") && kVar.j() != null && listAsList.contains(kVar.j().S()) && nVar.f61808A != null && nVar.f61808A.containsKey("ad_format") && nVar.f61808A.getString("ad_format") != null && nVar.f61808A.getString("ad_format").equals(BrandSafetyUtils.f61446l)) {
                    kVar.j().u(nVar.B());
                    String string2 = p.a().c().toString();
                    Logger.printFullVerboseLog(f61633J, "reporting event Invalid AppOpen impression detected ciDebugInfo = ", nVar.B(), " , lastMaxEvents = ", string2);
                    kVar.j().u(string2);
                }
                if (kVar.f62597c != null) {
                    Logger.d(f61633J, "reporting event - image uniformity: ", Float.valueOf(kVar.f62597c.a(1000)));
                    ?? r02 = (kVar.f62597c.f62584a != null && !nVar.af) ? kVar.f62597c.f62584a + "_" + kVar.f62596a : creativeInfo2;
                    d(nVar, r02);
                    r20 = r02;
                } else {
                    r20 = creativeInfo2;
                }
                if (!nVar.f() || !CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false)) {
                    arrayList2 = arrayList3;
                    creativeInfo = creativeInfo2;
                    arrayList2.add(a(nVar, kVar, z3, str2, r20));
                    arrayList3 = arrayList2;
                    creativeInfo2 = creativeInfo;
                    i2 = 6;
                } else {
                    arrayList2 = arrayList3;
                    creativeInfo = creativeInfo2;
                    arrayList2.add(a(nVar, kVar, kVar.a(), str2, r20));
                    arrayList3 = arrayList2;
                    creativeInfo2 = creativeInfo;
                    i2 = 6;
                }
            }
            arrayList = arrayList3;
        }
        Logger.d(f61633J, "reporting event ", str2, ", viewingTime = ", Long.valueOf(nVar.aa));
        if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
        } else {
            Logger.w(f61633J, "reporting event - stats collector instance is null, cannot report brand safety event");
        }
        if (z2) {
            nVar.c(true);
        }
        if (z3) {
            nVar.d(true);
        }
    }

    private BrandSafetyEvent a(n nVar, k kVar, boolean z2, String str, String str2) {
        Bundle bundle;
        long j2;
        l lVarB = b(nVar, kVar);
        String strC = nVar.c();
        int i2 = nVar.f61844z;
        String strE = nVar.d() ? nVar.e() : null;
        CreativeInfo creativeInfoJ = kVar.j();
        long jA = nVar.a();
        String str3 = nVar.f61810C;
        String str4 = kVar.f62596a != null ? kVar.f62596a : "";
        String str5 = nVar.f61811D;
        long j3 = nVar.aa;
        boolean z3 = nVar.aa > 0;
        Bundle bundle2 = nVar.f61808A;
        BrandSafetyUtils.ScreenShotOrientation screenShotOrientation = kVar.f62597c != null ? kVar.f62597c.f62589f : null;
        boolean z4 = kVar.f62597c != null ? kVar.f62597c.f62590g : false;
        if (kVar.f62597c != null) {
            bundle = bundle2;
            j2 = kVar.f62597c.f62586c;
        } else {
            bundle = bundle2;
            j2 = 0;
        }
        return new BrandSafetyEvent(strC, i2, str2, z2, strE, creativeInfoJ, jA, str3, str4, str5, j3, z3, bundle, screenShotOrientation, z4, j2, kVar.f62597c != null ? kVar.f62597c.a(1000) : 0.0f, nVar.f61843y, nVar.f61826T, SafeDK.getInstance().e(), str, nVar.f61820M, nVar.f61821N, nVar.f61823P, nVar.f61824Q, lVarB.toString(), kVar.f62599e, kVar.f62600f, kVar.f62601g, kVar.f62607m, kVar.f62608n, kVar.f62609o, kVar.f62610p, kVar.f62611q, kVar.f62618x, kVar.f62612r);
    }

    private void d(n nVar, String str) {
        Logger.d(f61633J, "add CI debug info started, hashValue ", str, ", info=", nVar.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        for (k kVar : nVar.g()) {
            if (kVar.j() != null && kVar.f62597c != null && str != null && kVar.f62597c.f62584a != null && kVar.f62597c.f62589f != null && nVar.n() != null) {
                String strA = BrandSafetyUtils.a(BrandSafetyUtils.AdType.INTERSTITIAL, kVar.f62597c.f62584a, nVar.c(), nVar.n(), kVar.f62597c.f62589f);
                if (new File(strA).exists()) {
                    if (kVar.j().Y() == null || !kVar.j().Y().contains("screenshot_datetime")) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        kVar.j().u("screenshot_datetime" + l.ae + jCurrentTimeMillis);
                        Logger.d(f61633J, "add CI debug info: ", Long.valueOf(jCurrentTimeMillis));
                    } else {
                        Logger.d(f61633J, "add CI debug info - stats repo is null or already contains this event");
                    }
                } else {
                    Logger.d(f61633J, "add CI debug info - screenshot file path doesn't exist: ", strA);
                }
            } else {
                Logger.d(f61633J, "add CI debug info - no creative info or hash is null");
            }
        }
    }

    public void a(n nVar) {
        if (nVar == null || com.safedk.android.utils.e.a((c) nVar)) {
            Logger.d(f61633J, Logger.FeatureTag.MEMORY_LOAD, "don't take screenshot, ad info: ", nVar, ", low memory");
            return;
        }
        Logger.d(f61633J, "take screenshot - currentActivityInterstitial = ", nVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (nVar.aq == null || nVar.aq.get() == null) {
            Logger.d(f61633J, "take screenshot - activity instance is null");
            return;
        }
        Activity activity = nVar.aq.get();
        if (nVar.J()) {
            Logger.d(f61633J, "take screenshot - sdk Interstitials Run On App Activity = ", Boolean.valueOf(nVar.f62686ak));
            if (nVar.aq != null && nVar.aq.get() != null && !BrandSafetyUtils.d(activity.getClass()) && !nVar.f62686ak) {
                Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - The activity is not supported : ", activity.getClass());
                return;
            }
            String str = nVar.f61840v;
            Activity activityE = e(nVar);
            Logger.d(f61633J, "take screenshot - activity = ", activityE);
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(nVar.f61840v);
            try {
                Logger.d(f61633J, "take screenshot - Run on UI thread in ", nVar.ad);
                View viewK = nVar.K();
                Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - screenshot view: ", viewK);
                if (!ScreenshotHelper.a()) {
                    Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - OS version is not compatible with PC");
                    int iE = nVar.E();
                    if (iE > 0 && (viewK instanceof ViewGroup)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new WeakReference(viewK));
                        c((ViewGroup) viewK, arrayList);
                        Logger.d(f61633J, "take screenshot (for screenshots) - views hierarchy : ", arrayList);
                        if (iE < arrayList.size()) {
                            viewK = (View) ((WeakReference) arrayList.get(iE)).get();
                            Logger.d(f61633J, "take screenshot - get screenshot view, index: ", Integer.valueOf(iE), ", view: ", viewK);
                        } else {
                            nVar.G();
                            Logger.d(f61633J, "take screenshot - reset screenshot view: ", viewK);
                        }
                    }
                }
                CreativeInfo creativeInfoJ = nVar.j();
                boolean zEquals = com.safedk.android.utils.h.f63168h.equals((creativeInfoJ == null || creativeInfoJ.T() == null) ? nVar.c() : creativeInfoJ.T());
                if (creativeInfoJ != null) {
                    Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - is video ad ? ", Boolean.valueOf(nVar.i().f62606l), ", is multi ad ? ", Boolean.valueOf(creativeInfoJ.an()));
                }
                boolean zA = CreativeInfoManager.a(str, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                if (!SafeDK.getInstance().I() && !zEquals) {
                    if (!nVar.i().f62606l && adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.a((c) nVar)) {
                        nVar.i().f62606l = true;
                        Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - found a media player");
                    }
                    if (creativeInfoJ == null) {
                        Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - no creative info yet");
                        return;
                    }
                    if (creativeInfoJ.an() && !zA) {
                        Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - multi ad, sdk: ", str);
                        return;
                    }
                    if (nVar.i().f62606l) {
                        if (nVar.i().c()) {
                            if (nVar.i().f62614t) {
                                Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - ecommerce collage end card is displayed");
                                a(nVar, viewK, activityE);
                                return;
                            } else {
                                Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - ecommerce collage end card is not displayed yet, don't take screenshot");
                                return;
                            }
                        }
                        if (!a(nVar, viewK) && !nVar.i().f62605k) {
                            Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - video is currently playing, isNativeVideoPlayerCompleted ? ", Boolean.valueOf(a(nVar, viewK)), ", eovEventTriggered ? ", Boolean.valueOf(nVar.i().f62605k));
                            return;
                        }
                        Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - video finished playing, isNativeVideoPlayerCompleted ? ", Boolean.valueOf(a(nVar, viewK)), ", eovEventTriggered ? ", Boolean.valueOf(nVar.i().f62605k));
                        a(nVar, viewK, activityE);
                        return;
                    }
                    if (nVar.i().d() && !nVar.i().f62615u) {
                        Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - ad has video loading screen being displayed now, don't take screenshot");
                        return;
                    } else {
                        Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - this is not a video ad - take screenshot");
                        a(nVar, viewK, activityE);
                        return;
                    }
                }
                if (SafeDK.getInstance().I()) {
                    Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - SafeDK Config item 'AlwaysTakeScreenshot' is true");
                    a(nVar, viewK, activityE);
                } else if (creativeInfoJ == null) {
                    Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - Admob SDK but no ci yet");
                } else if (creativeInfoJ.an() && !zA) {
                    Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - multi ad, sdk: ", str);
                } else {
                    Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - Admob SDK");
                    a(nVar, viewK, activityE);
                }
            } catch (Throwable th) {
                Logger.e(f61633J, Logger.FeatureTag.AD_CAPTURE, "Failed while taking screenshot", th);
                new CrashReporter().caughtException(th);
            }
        }
    }

    private boolean a(n nVar, View view) {
        AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(nVar.c());
        if (adNetworkDiscoveryJ == null || !nVar.f62682W || !adNetworkDiscoveryJ.b(view)) {
            return false;
        }
        if (!nVar.i().f62605k) {
            Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "is native video player completed - native video end, info:", nVar);
            nVar.e("native");
        }
        return true;
    }

    private Activity e(n nVar) {
        if (nVar.f62686ak) {
            return com.safedk.android.internal.b.getInstance().getForegroundActivity();
        }
        if (nVar.aq != null && nVar.aq.get() != null) {
            return nVar.aq.get();
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(o oVar) {
        Logger.d(f61633J, "set CI details started, matchingInfo = ", oVar.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        CreativeInfo creativeInfo = oVar.f62690a;
        if (creativeInfo == null) {
            return false;
        }
        creativeInfo.i(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
        n nVarA = null;
        if (creativeInfo.n() != null) {
            nVarA = this.f61638I.d(creativeInfo.n());
            Object[] objArr = new Object[4];
            objArr[0] = "set CI details, attempt to locate interstitial info by eventId ";
            objArr[1] = creativeInfo.n();
            objArr[2] = ", success? ";
            objArr[3] = Boolean.valueOf(nVarA != null);
            Logger.d(f61633J, objArr);
        }
        if (nVarA == null && creativeInfo.ak() != null) {
            nVarA = this.f61638I.a(creativeInfo.ak(), true);
            Object[] objArr2 = new Object[4];
            objArr2[0] = "set CI details, attempt to locate interstitial info by matching object address ";
            objArr2[1] = creativeInfo.ak();
            objArr2[2] = ", success ? ";
            objArr2[3] = Boolean.valueOf(nVarA != null);
            Logger.d(f61633J, objArr2);
        }
        if (nVarA != null) {
            return a(oVar, nVarA);
        }
        List<n> listA = this.f61638I.a(creativeInfo.S());
        if (listA.size() > 0) {
            Logger.d(f61633J, "set CI details, attempt to locate interstitial info, list size: ", Integer.valueOf(listA.size()));
            Iterator<n> it = this.f61638I.a(creativeInfo.S()).iterator();
            while (it.hasNext()) {
                if (a(oVar, it.next())) {
                    List<o> list = this.f61639O.get(creativeInfo.S());
                    if (list != null) {
                        synchronized (this.f61639O) {
                            list.remove(oVar);
                        }
                    }
                    return true;
                }
            }
        } else {
            Logger.d(f61633J, "set CI details, failed to locate interstitial info");
            a(oVar, creativeInfo.S());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(o oVar, n nVar) {
        if (nVar == null) {
            return false;
        }
        CreativeInfo creativeInfo = oVar.f62690a;
        Logger.d(f61633J, Logger.FeatureTag.CI_MATCHING, "set CI details - ad info sdk: ", nVar.c(), ", CI sdk: ", creativeInfo.S(), " ad info webview address: ", nVar.f61818K, ", ci matching object address: ", creativeInfo.ak());
        if (nVar.f61840v != null && (nVar.f61840v.equals(creativeInfo.S()) || nVar.f61840v.equals(creativeInfo.T()))) {
            if (nVar.f61827U) {
                Logger.d(f61633J, "set CI details - ad is already finished, cannot set creative info");
                return false;
            }
            Logger.d(f61633J, "set CI details - currentMaxPackageName: ", nVar.f61840v);
            if (a(creativeInfo, nVar)) {
                Logger.d(f61633J, "set CI details - setting as current CI for SDK: ", creativeInfo.S());
                if (nVar.f61808A != null) {
                    Logger.d(f61633J, "set CI details - CI ad format: ", creativeInfo.K(), ", max ad type: ", nVar.f61808A.getString("ad_format"));
                    BrandSafetyEvent.AdFormatType adFormatTypeA = BrandSafetyUtils.a(nVar.f61808A);
                    if ((creativeInfo.K() == null || !creativeInfo.K().equals(adFormatTypeA.name())) && adFormatTypeA != null) {
                        Logger.d(f61633J, "set CI details - updating ad format value to ", adFormatTypeA);
                        creativeInfo.a(adFormatTypeA);
                        nVar.d("ad_type_upd(sCrInfoDtls):" + adFormatTypeA);
                    }
                }
                b(creativeInfo, nVar);
                if (CreativeInfoManager.a(creativeInfo.S(), AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false) && creativeInfo.H() != null && nVar.y() != null && creativeInfo.H().contains(nVar.y())) {
                    Logger.d(f61633J, "set CI details - replacing ci placement ", creativeInfo.H(), " with Max placement ", nVar.y());
                    creativeInfo.j(nVar.y());
                }
                try {
                    boolean zA = CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                    Object[] objArr = new Object[10];
                    objArr[0] = "set CI details - Multi ad detectMultipleAdsByWebview =  ";
                    objArr[1] = Boolean.valueOf(zA);
                    objArr[2] = ", currentActivityInterstitial.isMultiAd() = ";
                    objArr[3] = Boolean.valueOf(nVar.f());
                    objArr[4] = ", currentActivityInterstitial.getImpression() != null ?";
                    objArr[5] = Boolean.valueOf(nVar.i() != null);
                    objArr[6] = ", currentActivityInterstitial.getImpression().getCreativeInfo() != null ? ";
                    objArr[7] = Boolean.valueOf(nVar.i().j() != null);
                    objArr[8] = ", getImpressionList = ";
                    objArr[9] = nVar.g();
                    Logger.printFullVerboseLog(f61633J, objArr);
                    if (zA && nVar.f() && nVar.i() != null && nVar.i().j() != null) {
                        Logger.d(f61633J, "set CI details - Multi ad, current impression already has a CI. not calling setCreativeInfo.");
                        return false;
                    }
                } catch (Throwable th) {
                    Logger.d(f61633J, "Exception in set CI details - Multi ad : ", th.getMessage(), th);
                }
                return b(oVar, nVar);
            }
        }
        a(oVar, creativeInfo.S());
        creativeInfo.u("apci|ts=" + System.currentTimeMillis() + ";" + oVar.f62691b + "|o=" + oVar.f62690a.aj() + ";" + oVar.f62690a.ak());
        b(creativeInfo, nVar);
        return false;
    }

    private void b(CreativeInfo creativeInfo, n nVar) {
        if (nVar != null) {
            synchronized (nVar.av) {
                if (nVar.al == null || nVar.al.isCancelled()) {
                    Logger.d(f61633J, "start late scanning - task future is: ", nVar.al, ", is scanning? ", Boolean.valueOf(nVar.am), " is ad finished? ", Boolean.valueOf(nVar.f61827U));
                    if (!nVar.am) {
                        Logger.d(f61633J, "start late scanning - starting timer for InterstitialInfo with event id: ", nVar.w());
                        g(nVar);
                        nVar.aa = 0L;
                        nVar.al = this.f61776E.scheduleWithFixedDelay(new b(nVar.f61819L, nVar.f61840v), 500L, 1000L, TimeUnit.MILLISECONDS);
                    } else {
                        Logger.d(f61633J, "start late scanning - avoid recursive call to web view scanning");
                        creativeInfo.u("avoidRecWebScan");
                    }
                }
            }
        }
    }

    private void a(o oVar, String str) {
        if (oVar != null && oVar.f62690a != null) {
            List<o> arrayList = this.f61639O.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                synchronized (this.f61639O) {
                    this.f61639O.put(str, arrayList);
                }
            } else {
                synchronized (arrayList) {
                    for (o oVar2 : arrayList) {
                        if (oVar2.f62690a != null && oVar2.f62690a.equals(oVar.f62690a)) {
                            Logger.d(f61633J, "add CI as pending match - already in pending list: ", oVar);
                            return;
                        }
                    }
                    Logger.d(f61633J, "add CI as pending match - number of pending candidates: ", Integer.valueOf(arrayList.size()));
                }
            }
            if (!CreativeInfoManager.a(str, AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, false)) {
                Logger.d(f61633J, Logger.FeatureTag.CI_MATCHING, "adding as pending for SDK: ", oVar.f62690a.S(), " matching info: ", oVar);
                synchronized (arrayList) {
                    arrayList.add(oVar);
                }
                return;
            }
            Logger.d(f61633J, "NOT adding as pending (config based), sdk: ", str, " matching info: ", oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(o oVar, n nVar) {
        Logger.printFullVerboseLog(f61633J, Logger.FeatureTag.CI_MATCHING, "set CI started, matching info=", oVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (oVar == null) {
            Logger.d(f61633J, "set CI, matching info is null");
            return false;
        }
        synchronized (this.f61643S) {
            CreativeInfo creativeInfo = oVar.f62690a;
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(creativeInfo.S());
            if (adNetworkDiscoveryJ != null) {
                Logger.d(f61633J, "set CI, matching info is ", oVar);
                if (nVar != null) {
                    if (nVar.j() != null && !nVar.j().an()) {
                        adNetworkDiscoveryJ.d(creativeInfo);
                        Logger.printFullVerboseLog(f61633J, "set CI, already matched! ignore matching attempt CI: ", creativeInfo);
                        return false;
                    }
                    creativeInfo.a(oVar.f62691b, oVar.f62692c, oVar.f62693d);
                    Logger.d(f61633J, "set CI: ", creativeInfo);
                    nVar.a(creativeInfo);
                    a(creativeInfo);
                    adNetworkDiscoveryJ.r(creativeInfo.N());
                    if (CreativeInfoManager.a(creativeInfo.S(), AdNetworkConfiguration.NOTIFY_DISCOVERY_CLASS_ABOUT_FULL_SCREEN_MATCHING, false)) {
                        adNetworkDiscoveryJ.b(creativeInfo);
                    }
                    if (nVar.f61818K != null) {
                        com.safedk.android.analytics.brandsafety.creatives.g.a(nVar.c(), nVar.i().b(), nVar.i());
                    }
                    if (oVar.f62691b.startsWith(CreativeInfo.f62444h)) {
                        nVar.u();
                    }
                    b(nVar, creativeInfo);
                    c(nVar, "setCreativeInfo");
                    if (creativeInfo.v()) {
                        nVar.i().f62605k = false;
                    }
                    if (!nVar.ai && StatsReporter.b().a(creativeInfo, nVar)) {
                        nVar.ai = true;
                    }
                    return true;
                }
            }
            return false;
        }
    }

    private void a(CreativeInfo creativeInfo) {
        List<o> list;
        if (creativeInfo != null && (list = this.f61639O.get(creativeInfo.S())) != null) {
            synchronized (list) {
                Iterator<o> it = list.iterator();
                while (it.hasNext()) {
                    o next = it.next();
                    if (next.f62690a != null && next.f62690a.n() != null && next.f62690a.n().equals(creativeInfo.n())) {
                        Logger.d(f61633J, "remove pending creative info - removing creative info from pending list: ", creativeInfo);
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3, boolean z2, String str4) {
        Logger.d(f61633J, "set ad click URL started, sdk: ", str2, ", url: ", str, ", view address: ", str3, ", viewTag: ", str4, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str2);
        n nVarA = this.f61638I.a(str3, false);
        if (nVarA == null && this.f61638I.a(mainSdkPackage).size() == 1) {
            Logger.d(f61633J, "InterstitialInfo not found by address, trying by SdkPackageName ", mainSdkPackage);
            nVarA = this.f61638I.a(mainSdkPackage).get(0);
        }
        if (nVarA != null && nVarA.c() != null && SdksMapping.isSameSdkByPackages(nVarA.c(), mainSdkPackage)) {
            if (z2) {
                nVarA.f62687ao = true;
            }
            Logger.d(f61633J, "set ad click URL - applying clickUrl candidate logic. url: ", str);
            if (!nVarA.d() && ((z2 || nVarA.aj == null) && !CreativeInfoManager.a(nVarA.c(), AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false))) {
                Logger.d(f61633J, "set ad click URL - current Activity Interstitial is not marked as clicked, setting click URL: ", str);
                a(nVarA, str, str4);
                return true;
            }
            if (nVarA.aj == null && str != null) {
                a(nVarA, str, str4);
            }
            Logger.d(f61633J, "set ad click URL - diag currentClickUrlCandidate: ", nVarA.aj);
            if (nVarA.aj != null && str4 != null) {
                nVarA.aj.f62546d = str4;
                Logger.d(f61633J, "set ad click URL - no click URL yet, setting click url candidate tag : ", str4);
            }
            if (nVarA.e() == null) {
                Logger.d(f61633J, "set ad click URL - no click URL yet, setting clickUrl: ", str);
                nVarA.c(str);
                return true;
            }
            Logger.d(f61633J, "set ad click URL - click URL already set: ", nVarA.e());
            return false;
        }
        Object[] objArr = new Object[2];
        objArr[0] = "set ad click URL skipped, SDK: ";
        objArr[1] = nVarA != null ? nVarA.c() : V8ValueNull.NULL;
        Logger.d(f61633J, objArr);
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str, String str2, String str3) {
        n nVarA = this.f61638I.a(str3, false);
        if (nVarA != null && nVarA.d() && str2 != null && str2.equals(nVarA.c()) && nVarA.aq != null && nVarA.aq.get() != null) {
            String string = nVarA.aq.get().toString();
            Logger.d(f61633J, "set previous activity click url, click activity: ", string, ", ad activity: ", nVarA.ad);
            String strA = BrandSafetyUtils.a(string, true);
            if (strA != null && !strA.equals(nVarA.f61809B)) {
                Logger.d(f61633J, "set previous activity click url - detected URL for click in previous activity (not yet destroyed), url: ", str);
                if (nVarA.c(str)) {
                    c(nVarA, "setPreviousActivityClickUrl");
                }
            }
        }
    }

    private void a(final n nVar, final View view, final Activity activity) {
        try {
            if (nVar == null || activity == null) {
                Logger.d(f61633J, "taking screenshot, currentActivityInterstitial or activity are null");
                return;
            }
            CreativeInfo creativeInfoJ = nVar.j();
            if (creativeInfoJ != null && creativeInfoJ.aq()) {
                Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "taking screenshot, skip website endcard");
                return;
            }
            nVar.f61843y++;
            Logger.d(f61633J, "taking screenshot on UIThread, view=", view, ", isOnUiThread : ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (ScreenshotHelper.a()) {
                Runnable runnable = new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.7
                    @Override // java.lang.Runnable
                    public void run() {
                        ScreenshotHelper.a(activity, nVar, view, SafeDK.getInstance().F());
                    }
                };
                Logger.d(f61633J, "Taking screenshot - network supports copying bitmap using PC");
                com.safedk.android.utils.l.a(this.f61776E, runnable);
            } else {
                activity.runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.8
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.d(InterstitialFinder.f61633J, "taking screenshot - using old method");
                        Bitmap bitmapA = ScreenshotHelper.a(view, SafeDK.getInstance().E(), nVar);
                        if (bitmapA == null) {
                            nVar.F();
                            Logger.d(InterstitialFinder.f61633J, "taking screenshot, black screenshot detected index = ", Integer.valueOf(nVar.E()));
                        } else {
                            InterstitialFinder.this.a(bitmapA, nVar);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Logger.e(f61633J, "taking screenshot taking screenshot exception:", th);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void a(final Bitmap bitmap, final c cVar) {
        this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.9
            @Override // java.lang.Runnable
            public void run() {
                InterstitialFinder interstitialFinder = InterstitialFinder.this;
                c cVar2 = cVar;
                interstitialFinder.a((n) cVar2, cVar2.c(), bitmap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    public void a(n nVar, String str, Bitmap bitmap) {
        long j2;
        String str2;
        String str3;
        boolean z2;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z3;
        String str8;
        int i2;
        k kVar;
        int i3;
        char c2;
        boolean z4;
        boolean z5;
        int i5;
        String str9;
        boolean z6;
        if (bitmap != null) {
            BrandSafetyUtils.a aVarA = BrandSafetyUtils.a(str, bitmap);
            int iA = aVarA.a();
            BrandSafetyUtils.ScreenshotValidity screenshotValidityA = BrandSafetyUtils.a(str, aVarA);
            Logger.d(f61633J, "process screenshot, screenshot validity = ", screenshotValidityA.name());
            if (screenshotValidityA == BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_BLACK || screenshotValidityA == BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_VERY_HIGH) {
                String str10 = f61633J;
                nVar.F();
                Logger.d(str10, "process screenshot, black/uniform screenshot detected, index = ", Integer.valueOf(nVar.E()));
                return;
            }
            if (screenshotValidityA == BrandSafetyUtils.ScreenshotValidity.VALID) {
                String strA = BrandSafetyUtils.a(bitmap);
                Logger.d(f61633J, "process screenshot found interstitial, hash = ", strA);
                AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
                if (adNetworkDiscoveryJ != null && !adNetworkDiscoveryJ.a(strA, this.f61642R)) {
                    Logger.d(f61633J, "process screenshot skipping file, not valid for ", str);
                    nVar.d("SkippedImageHash=" + strA);
                    return;
                }
                nVar.ah = BrandSafetyUtils.b(bitmap);
                String strN = nVar.n();
                Logger.d(f61633J, "process screenshot impressionId is ", strN);
                String strA2 = BrandSafetyUtils.a(bitmap, BrandSafetyUtils.AdType.INTERSTITIAL, strA, str, strN, nVar.ah);
                Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "process screenshot screenshot file created, filename = ", strA2);
                long jC = BrandSafetyUtils.c(strA2);
                float f3 = (iA / 1000.0f) * 100.0f;
                if (adNetworkDiscoveryJ != null && jC < adNetworkDiscoveryJ.a(nVar.j())) {
                    Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "process screenshot file size too small ", Long.valueOf(jC), " (bytes). This image will not be used");
                    BrandSafetyUtils.d(strA2);
                    return;
                }
                Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "process screenshot stored file size is ", Long.valueOf(jC), " bytes, counter is ", Integer.valueOf(nVar.f61843y), ", uniform pixel count is ", Integer.valueOf(iA), " (", Float.valueOf(f3), "%)");
                int size = this.f61774C.size();
                if (!d(strA, strN)) {
                    if (size >= SafeDK.getInstance().J()) {
                        j2 = jC;
                        str2 = strA2;
                        if (!c(strA, strN)) {
                            Logger.d(f61633J, "process screenshot no open slot for interstitial ", strA);
                            BrandSafetyUtils.d(str2);
                            str9 = null;
                            str3 = str9;
                        } else {
                            Logger.d(f61633J, "process screenshot image ", strA, "_", strN, " is already scheduled for upload");
                        }
                    } else {
                        Logger.d(f61633J, "process screenshot impressions to report size=", Integer.valueOf(size), ", max images to store=", Integer.valueOf(SafeDK.getInstance().J()));
                        if (nVar.ac == null) {
                            z6 = true;
                        } else if (nVar.ac.equals(strA)) {
                            z6 = false;
                        } else {
                            Logger.d(f61633J, "process screenshot removing previous file : ", nVar.f61838t);
                            BrandSafetyUtils.d(nVar.f61838t);
                            z6 = true;
                        }
                        if (!z6) {
                            j2 = jC;
                            str2 = strA2;
                        } else {
                            Logger.d(f61633J, "process screenshot keeping file of interstitial ", strA, ". file size is ", Long.valueOf(jC), " (bytes), orientation: ", nVar.ah);
                            j2 = jC;
                            str2 = strA2;
                            BrandSafetyUtils.a(nVar.t(), BrandSafetyUtils.AdType.INTERSTITIAL, strA, str, strN, nVar.ah);
                        }
                    }
                    str9 = strA;
                    str3 = str9;
                } else {
                    j2 = jC;
                    str2 = strA2;
                    Logger.d(f61633J, "process screenshot not saving file for interstitial ", strA, "_", strN);
                    BrandSafetyUtils.d(str2);
                    if (d(strA, strN)) {
                        Logger.d(f61633J, "process screenshot interstitial ", strA, "_", strN, " was already reported");
                    } else {
                        Logger.d(f61633J, FlTC.ezKhslxPelhfUs, nVar.ac);
                    }
                    if (nVar.ac != null) {
                        if (c(nVar.ac, nVar.n())) {
                            BrandSafetyUtils.d(nVar.f61838t);
                        } else {
                            Logger.d(f61633J, "process screenshot not deleting not best image ", nVar.f61838t);
                        }
                    }
                    str3 = strA;
                }
                if (str3 == null) {
                    z2 = false;
                } else {
                    Logger.d(f61633J, "process screenshot setting interstitial info data (previous hash = ", nVar.ac, ", current hash = ", str3, ")");
                    z2 = (nVar.ac == null || str3.equals(nVar.ac)) ? false : true;
                }
                if (nVar.ah.equals(BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED)) {
                    nVar.ah = BrandSafetyUtils.b(bitmap);
                }
                k kVarI = nVar.i();
                if (kVarI == null) {
                    str4 = l.f62665t;
                    str5 = "processScreenshot";
                    str6 = "typ";
                    str7 = str2;
                    z3 = z2;
                    str8 = f61633J;
                    i2 = iA;
                    kVar = kVarI;
                } else {
                    kVarI.b(l.f62665t, new l.a("typ", l.f62643X));
                    Logger.d(f61633J, "process screenshot setting image details: ", kVarI.f62597c);
                    int i7 = nVar.f61843y;
                    BrandSafetyUtils.ScreenShotOrientation screenShotOrientation = nVar.ah;
                    str5 = "processScreenshot";
                    str4 = l.f62665t;
                    str6 = "typ";
                    i2 = iA;
                    kVar = kVarI;
                    z3 = z2;
                    str7 = str2;
                    str8 = f61633J;
                    kVar.f62597c = new j(str3, str2, j2, iA, i7, screenShotOrientation, z3);
                    c(nVar, str5);
                }
                if (!nVar.ap) {
                    i3 = 1;
                    c2 = 0;
                } else {
                    i3 = 1;
                    nVar.at = true;
                    c2 = 0;
                    nVar.ap = false;
                    Logger.d(str8, "first candidate image sample, resetting resources collection cycle");
                }
                if (nVar.ac == null) {
                    Object[] objArr = new Object[i3];
                    objArr[c2] = "process screenshot no previous hash to detect animation, keep sampling";
                    Logger.d(str8, objArr);
                    nVar.ac = str3;
                    nVar.f61838t = str7;
                    nVar.f61839u = nVar.ah;
                    return;
                }
                String str11 = str7;
                CreativeInfo creativeInfoJ = nVar.j();
                if (creativeInfoJ == null || !creativeInfoJ.F()) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    if (z4) {
                        z5 = false;
                        Logger.d(str8, "process screenshot, shopping collage didn't finished loading");
                        if (!a(i2, j2) && z5) {
                            if (kVar != null) {
                                kVar.a(str4, new l.a(str6, l.f62644Y));
                            }
                            j jVarM = nVar.m();
                            if (jVarM != null) {
                                jVarM.f62590g = z4;
                                Logger.d(str8, "process screenshot setting interstitial is_animated field to ", Boolean.valueOf(z4));
                            }
                            if (TextUtils.isEmpty(str3)) {
                                i5 = 1;
                            } else {
                                if (nVar.ah.equals(BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED) && jVarM != null) {
                                    jVarM.f62589f = BrandSafetyUtils.b(bitmap);
                                }
                                i5 = 1;
                                Logger.d(str8, "process screenshot - before reporting, debug info is: ", nVar.B());
                                c(nVar, str5);
                                nVar.e(true);
                            }
                            nVar.an = i5;
                            Object[] objArr2 = new Object[i5];
                            objArr2[0] = "final image sampled twice, not forcing resources collection";
                            Logger.d(str8, objArr2);
                            return;
                        }
                        nVar.ac = str3;
                        nVar.f61838t = str11;
                        nVar.f61839u = nVar.ah;
                        return;
                    }
                    Logger.d(str8, "process screenshot, shopping collage finished loading");
                }
                z5 = true;
                if (!a(i2, j2)) {
                }
                nVar.ac = str3;
                nVar.f61838t = str11;
                nVar.f61839u = nVar.ah;
                return;
            }
            Logger.d(f61633J, Logger.FeatureTag.AD_CAPTURE, "process screenshot is not valid: ", screenshotValidityA.name(), ", pixel count: ", Integer.valueOf(iA), ", try again...");
            if (nVar.ab && nVar.i().f62605k) {
                Logger.d(f61633J, "process screenshot back from background - reset video completed indication to false");
                nVar.ab = false;
                nVar.i().f62605k = false;
            }
        }
    }

    private boolean a(int i2, int i3) {
        return i2 == BrandSafetyUtils.a() && i3 == BrandSafetyUtils.b();
    }

    private boolean a(int i2, long j2) {
        Logger.d(f61633J, "should stop sampling started, maxUniformedPixelsCount=", Integer.valueOf(i2), ", fileSize=", Long.valueOf(j2), " (bytes), stopSamplingFileSize=", Long.valueOf(SafeDK.getInstance().K()));
        boolean z2 = BrandSafetyUtils.a(i2) && j2 > SafeDK.getInstance().K();
        Logger.d(f61633J, "should stop sampling returned ", Boolean.valueOf(z2));
        return z2;
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        InterstitialInfoCollection interstitialInfoCollection = this.f61638I;
        if (interstitialInfoCollection != null) {
            for (n nVar : interstitialInfoCollection.values()) {
                if (nVar != null && nVar.f62685Z) {
                    nVar.a(l.f62671z, new l.a[0]);
                    c(nVar, "onBackground");
                }
            }
        }
    }

    @Override // com.safedk.android.internal.a
    public void h() {
        ArrayList<n> arrayList;
        InterstitialInfoCollection interstitialInfoCollection = this.f61638I;
        if (interstitialInfoCollection != null) {
            synchronized (interstitialInfoCollection) {
                arrayList = new ArrayList(this.f61638I.values());
            }
            for (n nVar : arrayList) {
                if (nVar != null) {
                    nVar.a(l.f62620A, new l.a[0]);
                    c(nVar, "onForeground");
                    if (!nVar.i().f62605k) {
                        nVar.ab = true;
                    }
                }
            }
        }
    }

    private void a(List<WeakReference<WebView>> list, n nVar) {
        Iterator<WeakReference<WebView>> it = list.iterator();
        while (it.hasNext()) {
            WebView webView = it.next().get();
            if (webView != null) {
                String strA = BrandSafetyUtils.a((Class) webView.getClass());
                if (!TextUtils.isEmpty(strA) && !strA.equals(nVar.c()) && strA.equals(com.safedk.android.utils.h.f63168h)) {
                    Logger.d(f61633J, "identify scar-admob - webView is Admob: ", webView, ", current interstitial info: ", nVar);
                    nVar.f61826T = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<WeakReference<WebView>> f(n nVar) {
        if (nVar == null || nVar.aq == null || nVar.aq.get() == null || nVar.am) {
            Logger.d(f61633J, "scan for webViews activity is null, skipping");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Activity activity = nVar.aq.get();
        if (activity != null && BrandSafetyUtils.h(activity.getClass().getName())) {
            try {
                nVar.am = true;
                View viewFindViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
                if (viewFindViewById != null) {
                    b((ViewGroup) viewFindViewById, arrayList);
                }
                nVar.am = false;
            } catch (Throwable th) {
                Logger.d(f61633J, "caught exception: ", th);
            }
        }
        return arrayList;
    }

    public void a(String str, View view, long j2) {
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false)) {
            int iHashCode = view.hashCode();
            Logger.d(f61633J, "handle Ad Stage Switch Signal started, ", str, ",", view, ", hashCode : ", Integer.valueOf(iHashCode));
            n nVarQ = q(BrandSafetyUtils.a(view));
            if (nVarQ != null) {
                if (!nVarQ.f62689aw.containsKey(Integer.valueOf(iHashCode)) && nVarQ.f62689aw.size() <= nVarQ.g().size() + 1) {
                    nVarQ.f62689aw.put(Integer.valueOf(iHashCode), Long.valueOf(j2));
                    Logger.d(f61633J, "handle Ad Stage Switch Signal added to set, ts : ", Long.valueOf(j2));
                }
                Logger.d(f61633J, "handle Ad Stage Switch Signal, current stage : ", Integer.valueOf(nVarQ.f62689aw.size()), ", keys : ", nVarQ.f62689aw);
                if (nVarQ.f62689aw.size() >= nVarQ.g().size() && !nVarQ.i().f62605k) {
                    Logger.d(f61633J, "handle Ad Stage Switch Signal, end card detected, eov ? ", Boolean.valueOf(nVarQ.i().f62605k));
                    if (!nVarQ.i().f62605k) {
                        m(str);
                        return;
                    }
                    return;
                }
                return;
            }
            Logger.d(f61633J, "handle Ad Stage Switch Signal interstitialInfo not found ");
            return;
        }
        Logger.d(f61633J, "handle Ad Stage Switch Signal, config does not allow this feature for this sdk. skipping.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v2 */
    public void g(final n nVar) {
        String strC;
        String str;
        String str2;
        String str3;
        String str4;
        View view;
        Object obj;
        int i2;
        AdNetworkDiscovery adNetworkDiscovery;
        int i3 = "scan for webViews - exit scanning";
        if (nVar == null || nVar.aq == null || nVar.aq.get() == null || nVar.am) {
            Logger.d(f61633J, "scan for webViews activity is null, skipping");
            return;
        }
        Activity activity = nVar.aq.get();
        Object[] objArr = new Object[6];
        objArr[0] = "scan for webViews started, activity: ";
        objArr[1] = activity == null ? V8ValueNull.NULL : activity.toString();
        objArr[2] = ", currentActivityInterstitial.resourceMatching: ";
        objArr[3] = nVar.f61817J;
        objArr[4] = ", isOnUiThread = ";
        objArr[5] = Boolean.valueOf(com.safedk.android.utils.n.c());
        Logger.d(f61633J, objArr);
        if (activity == null || !BrandSafetyUtils.h(activity.getClass().getName())) {
            if (nVar.f61817J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT) {
                try {
                    Logger.d(f61633J, "scan for webViews : resourceMatching DEFAULT");
                    if (nVar.j() != null) {
                        View viewF = nVar.j().f();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        arrayList2.add(BrandSafetyUtils.a(viewF));
                        arrayList3.add("h1c1:" + viewF);
                        strC = nVar.c() != null ? nVar.c() : "";
                        String str5 = strC;
                        a(nVar, strC, (ViewGroup) viewF, arrayList, arrayList2, arrayList3, 1);
                        Logger.d(f61633J, "scan for webViews resourceMatching DEFAULT found viewHierarchy ", arrayList3);
                        if (nVar.x() != null) {
                            Logger.d(f61633J, "scan for webViews resourceMatching DEFAULT previous ViewsHierarchy size :  ", Integer.valueOf(nVar.x().size()), " , current : ", Integer.valueOf(arrayList2.size()));
                            long jA = CreativeInfoManager.a(str5, AdNetworkConfiguration.NUMBER_OF_VIEWS_REMOVED_IN_FULL_SCREEN_AD_THAT_INDICATES_EOV, 0L);
                            if (jA > 0 && nVar.x().size() >= ((long) arrayList2.size()) + jA) {
                                Logger.d(f61633J, "scan for webViews resourceMatching DEFAULT End of video detected");
                                a(str5, BrandSafetyUtils.a(viewF), true, "native");
                            }
                        } else {
                            nVar.a(l.f62657l, new l.a(l.f62631L, "none"));
                        }
                        nVar.a(arrayList2);
                    }
                    Logger.d(f61633J, "scan for webViews resourceMatching DEFAULT exit scanning");
                    nVar.am = false;
                    return;
                } catch (Throwable th) {
                    try {
                        Logger.e(f61633J, "scan for webViews resourceMatching DEFAULT exception : ", th);
                        Logger.d(f61633J, "scan for webViews resourceMatching DEFAULT exit scanning");
                        nVar.am = false;
                        return;
                    } catch (Throwable th2) {
                        Logger.d(f61633J, "scan for webViews resourceMatching DEFAULT exit scanning");
                        nVar.am = false;
                        throw th2;
                    }
                }
            }
            return;
        }
        try {
            nVar.am = true;
            try {
                try {
                    View viewFindViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
                    AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(nVar.c());
                    strC = nVar.c() != null ? nVar.c() : "";
                    if (adNetworkDiscoveryJ == null) {
                        Logger.d(f61633J, "scan for webViews - exit scanning");
                        nVar.am = false;
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (viewFindViewById != null) {
                        arrayList5.add(BrandSafetyUtils.a(viewFindViewById));
                        arrayList6.add("h1c1:" + viewFindViewById);
                        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
                        view = viewFindViewById;
                        adNetworkDiscovery = adNetworkDiscoveryJ;
                        str = "ad_format";
                        str2 = l.f62657l;
                        str4 = "none";
                        obj = "scan for webViews - exit scanning";
                        str3 = l.f62631L;
                        i2 = 2;
                        a(nVar, strC, viewGroup, arrayList4, arrayList5, arrayList6, 1);
                        a(arrayList4, nVar);
                        Logger.printFullVerboseLog(f61633J, "scan for webViews found views hierarchy : ", arrayList6);
                    } else {
                        str = "ad_format";
                        str2 = l.f62657l;
                        str3 = l.f62631L;
                        str4 = "none";
                        view = viewFindViewById;
                        obj = "scan for webViews - exit scanning";
                        i2 = 2;
                        adNetworkDiscovery = adNetworkDiscoveryJ;
                    }
                    if (nVar.f61817J == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP) {
                        String strN = nVar.j() != null ? nVar.j().N() : null;
                        Iterator<String> it = arrayList5.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            if (CreativeInfoManager.f61949d.remove(next)) {
                                Object[] objArr2 = new Object[i2];
                                objArr2[0] = "scan for webViews - video start received for ";
                                objArr2[1] = next;
                                Logger.d(f61633J, objArr2);
                                nVar.i().f62606l = true;
                                break;
                            }
                        }
                        final WeakReference<WebView> weakReferenceA = adNetworkDiscovery.a((List<WeakReference<WebView>>) arrayList4, strN);
                        if (weakReferenceA == null || weakReferenceA.get() == null) {
                            String str6 = str3;
                            Logger.d(f61633J, "scan for webViews - WebView not found");
                            if (nVar.f61831m == null) {
                                nVar.a(str2, new l.a(str6, str4));
                            }
                            nVar.a(arrayList5);
                        } else {
                            nVar.a(arrayList5);
                            nVar.b(arrayList4);
                            final String strA = BrandSafetyUtils.a((Object) weakReferenceA.get());
                            if (nVar.f61818K == null) {
                                a(strA, str2, new l.a(str3, strA));
                            }
                            SafeDKWebAppInterface.a(strA);
                            if (nVar.f61818K != null && nVar.f61818K.equals(strA)) {
                                Logger.d(f61633J, obj);
                                nVar.am = false;
                                return;
                            }
                            Object[] objArr3 = new Object[i2];
                            objArr3[0] = "scan for webViews found ";
                            objArr3[1] = weakReferenceA.get();
                            Logger.d(f61633J, objArr3);
                            if (this.f61777G != null) {
                                Iterator<u> it2 = this.f61777G.iterator();
                                while (it2.hasNext()) {
                                    it2.next().a(weakReferenceA);
                                }
                            }
                            boolean zA = CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                            Object[] objArr4 = new Object[i2];
                            objArr4[0] = "scan for webViews, should detect multiple ads by web view change? ";
                            objArr4[1] = Boolean.valueOf(zA);
                            Logger.d(f61633J, objArr4);
                            if (zA && nVar.f61818K != null && !nVar.f61818K.equals(strA)) {
                                e(nVar, strA);
                            }
                            nVar.f61818K = strA;
                            nVar.i().a(strA);
                            Object[] objArr5 = new Object[i2];
                            objArr5[0] = "scan for webViews address set to ";
                            objArr5[1] = strA;
                            Logger.d(f61633J, objArr5);
                            for (k kVar : nVar.g()) {
                                CreativeInfo creativeInfoJ = kVar.j();
                                if (creativeInfoJ != null) {
                                    Object[] objArr6 = new Object[i2];
                                    objArr6[0] = "scan for webViews - current ci is: ";
                                    objArr6[1] = creativeInfoJ.ac();
                                    Logger.d(f61633J, objArr6);
                                }
                                if (arrayList5.contains(kVar.b())) {
                                    Object[] objArr7 = new Object[i2];
                                    objArr7[0] = "scan for webViews attempting to collect resources for ";
                                    objArr7[1] = strA;
                                    Logger.d(f61633J, objArr7);
                                    com.safedk.android.analytics.brandsafety.creatives.g.a(nVar.c(), strA, kVar);
                                } else if (creativeInfoJ != null) {
                                    Object[] objArr8 = new Object[4];
                                    objArr8[0] = "scan for webViews skip resources collection for address: ";
                                    objArr8[1] = strA;
                                    objArr8[i2] = ", CI: ";
                                    objArr8[3] = creativeInfoJ.ac();
                                    Logger.d(f61633J, objArr8);
                                }
                                if (creativeInfoJ == null) {
                                    Object[] objArr9 = new Object[i2];
                                    objArr9[0] = "scan for webViews will check for pending CIs for package ";
                                    objArr9[1] = nVar.c();
                                    Logger.d(f61633J, objArr9);
                                    Iterator<o> it3 = a(nVar.c(), nVar).iterator();
                                    while (it3.hasNext()) {
                                        b(it3.next(), nVar);
                                    }
                                }
                            }
                            if (adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(AdNetworkConfiguration.APP_OPEN_IMPRESSION_TRACKING_ENABLED, false) && nVar.f61808A != null) {
                                String str7 = str;
                                if (nVar.f61808A.containsKey(str7) && nVar.f61808A.getString(str7).equals(BrandSafetyUtils.f61446l)) {
                                    final AdNetworkDiscovery adNetworkDiscovery2 = adNetworkDiscovery;
                                    this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.10
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            WeakReference weakReference = weakReferenceA;
                                            if (weakReference != null && weakReference.get() != null) {
                                                List<CreativeInfo> listA = adNetworkDiscovery2.a(new WeakReference<>((View) weakReferenceA.get()), (String) null, BrandSafetyUtils.AdType.INTERSTITIAL);
                                                if (listA != null) {
                                                    for (CreativeInfo creativeInfo : listA) {
                                                        Logger.printFullVerboseLog(InterstitialFinder.f61633J, "scan for webViews ci returned : ", creativeInfo.ac());
                                                        if (creativeInfo.n() == null) {
                                                            creativeInfo.h(nVar.f61819L);
                                                        }
                                                        if (nVar.f61808A != null && nVar.f61808A.containsKey("ad_format")) {
                                                            BrandSafetyEvent.AdFormatType adFormatTypeA = BrandSafetyUtils.a(nVar.f61808A);
                                                            creativeInfo.a(adFormatTypeA);
                                                            nVar.d("ad_type_upd(scnFrWVs):" + adFormatTypeA);
                                                            Logger.d(InterstitialFinder.f61633J, "scan for webViews ad_format set to  : ", adFormatTypeA);
                                                        }
                                                        InterstitialFinder.this.a(new o(creativeInfo, CreativeInfo.f62450n, null, strA));
                                                    }
                                                    return;
                                                }
                                                Logger.d(InterstitialFinder.f61633J, "scan for webViews ci not found by View");
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    } else {
                        String str8 = str4;
                        String str9 = str3;
                        if (view != null && nVar.f61817J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                            WeakReference<WebView> weakReferenceA2 = adNetworkDiscovery.a((List<WeakReference<WebView>>) arrayList4, (String) null);
                            if (weakReferenceA2 == null || weakReferenceA2.get() == null) {
                                Logger.d(f61633J, "scan for webViews (DIRECT_CREATIVE_INFO) - WebView not found");
                            } else {
                                String strA2 = BrandSafetyUtils.a((Object) weakReferenceA2.get());
                                if (nVar.f61818K == null) {
                                    a(strA2, str2, new l.a(str9, strA2));
                                }
                                Object[] objArr10 = new Object[i2];
                                objArr10[0] = "scan for webViews found (DIRECT_CREATIVE_INFO) ";
                                objArr10[1] = strA2;
                                Logger.d(f61633J, objArr10);
                                nVar.f61818K = strA2;
                                nVar.i().a(strA2);
                                k kVarI = nVar.i();
                                if (kVarI != null) {
                                    Object[] objArr11 = new Object[i2];
                                    objArr11[0] = "scan for webViews (DIRECT_CREATIVE_INFO) attempting to collect resources for ";
                                    objArr11[1] = strA2;
                                    Logger.d(f61633J, objArr11);
                                    com.safedk.android.analytics.brandsafety.creatives.g.a(nVar.c(), strA2, kVarI);
                                }
                                nVar.a(arrayList5);
                            }
                        } else if (nVar.f61817J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT) {
                            if (nVar.f61831m == null) {
                                nVar.a(str2, new l.a(str9, str8));
                            }
                            nVar.a(arrayList5);
                        }
                    }
                    Logger.d(f61633J, obj);
                    nVar.am = false;
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (RuntimeException e2) {
                Logger.d(f61633J, "Window/layout not ready yet, skipping.", e2.getMessage());
                Logger.d(f61633J, "scan for webViews - exit scanning");
                nVar.am = false;
                return;
            }
        } catch (Throwable th4) {
            th = th4;
            i3 = 2;
        }
        try {
            Object[] objArr12 = new Object[i3];
            objArr12[0] = "scan for webViews execution: ";
            objArr12[1] = th;
            Logger.e(f61633J, objArr12);
            Logger.d(f61633J, "scan for webViews - exit scanning");
            nVar.am = false;
        } catch (Throwable th5) {
            Logger.d(f61633J, "scan for webViews - exit scanning");
            nVar.am = false;
            throw th5;
        }
    }

    private void e(n nVar, String str) {
        Logger.d(f61633J, "handle web view change, web view change detected from: ", nVar.f61818K, ", to: ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        k kVarI = nVar.i();
        if (kVarI != null && kVarI.j() != null && !kVarI.j().an()) {
            kVarI.j().ao();
            String strH = kVarI.j().h();
            if (strH != null) {
                kVarI.j().e(strH + CreativeInfo.aK);
            }
        }
        nVar.g().add(new k(UUID.randomUUID().toString(), str));
        Logger.d(f61633J, "handle WebView Change - new Impression info object created. number of impressions in ad : ", Integer.valueOf(nVar.g().size()));
        if (nVar.f61811D == null) {
            nVar.f61811D = UUID.randomUUID().toString();
        }
        nVar.af = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final n nVar, final Activity activity) {
        this.f61776E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.2
            @Override // java.lang.Runnable
            public void run() {
                BrandSafetyUtils.AdType adTypeB;
                BrandSafetyUtils.AdType adTypeA;
                ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
                String strB = BrandSafetyUtils.b(activity.getClass());
                try {
                    if (nVar != null && nVar.k().isEmpty() && CreativeInfoManager.b(strB) == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP && nVar.f61808A != null && nVar.f61808A.containsKey("ad_format") && nVar.f61808A.get("ad_format") != null && CreativeInfoManager.a(strB, AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, false)) {
                        String strY = nVar.y();
                        BrandSafetyEvent.AdFormatType adFormatTypeA = BrandSafetyUtils.a(nVar.f61808A);
                        Logger.d(InterstitialFinder.f61633J, "try to find CI, ad format = ", adFormatTypeA, ", placement = ", strY, ", activity sdk = ", strB);
                        List<CreativeInfo> listB = InterstitialFinder.this.b(viewGroup, strB);
                        if (listB != null) {
                            Logger.d(InterstitialFinder.f61633J, "try to find CI, updating ad format value to ", adFormatTypeA);
                            InterstitialFinder.this.a(activity, nVar);
                            for (CreativeInfo creativeInfo : listB) {
                                if (creativeInfo.K() != null && adFormatTypeA != null && (adTypeB = BrandSafetyUtils.b(creativeInfo.K())) != (adTypeA = BrandSafetyUtils.a(adFormatTypeA))) {
                                    Logger.d(InterstitialFinder.f61633J, "try to find CI, skipping CI due to incompatible ad type - CI:", adTypeB, ", max: ", adTypeA);
                                } else {
                                    creativeInfo.a(adFormatTypeA);
                                    nVar.d("ad_type_upd(tryTFndCI):" + adFormatTypeA);
                                    creativeInfo.h(nVar.f61808A.getString("id"));
                                    creativeInfo.j(nVar.f61808A.getString(BrandSafetyEvent.f62740k));
                                    Logger.d(InterstitialFinder.f61633J, "try to find CI - ci event id : ", creativeInfo.n(), ", placement id : ", creativeInfo.H());
                                    InterstitialFinder.this.a(new o(creativeInfo, CreativeInfo.f62450n));
                                }
                            }
                            return;
                        }
                        Logger.d(InterstitialFinder.f61633J, "try to find CI - did not find CIs for event id: ", nVar.f61819L);
                    }
                } catch (Throwable th) {
                    Logger.d(InterstitialFinder.f61633J, "Exception while attempting to find CI : ", th.getMessage(), th);
                }
            }
        });
    }

    public void a(n nVar, String str, String str2) {
        nVar.aj = new h(System.currentTimeMillis(), str, null, str2);
    }

    public void g(String str, String str2) {
        Logger.d(f61633J, "set current interstitial downstream struct started");
        List<n> listA = this.f61638I.a(str);
        if (listA.size() == 1) {
            n nVar = listA.get(0);
            if (nVar != null) {
                List<CreativeInfo> listK = nVar.k();
                if (!listK.isEmpty() && str2 != null) {
                    for (CreativeInfo creativeInfo : listK) {
                        String strH = creativeInfo.h();
                        if (strH != null && !strH.endsWith(str2)) {
                            creativeInfo.e(strH + "/" + str2);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        Logger.d(f61633J, "set current interstitial downstream struct, number of Infos for ", str, " is ", Integer.valueOf(listA.size()), ", cannot set downstream struct");
    }

    public void s(String str) {
        List<CreativeInfo> listK;
        Logger.d(f61633J, "stop collecting resources started");
        List<n> listA = this.f61638I.a(str);
        if (listA.size() == 1) {
            n nVar = listA.get(0);
            if (nVar != null && (listK = nVar.k()) != null && !listK.isEmpty()) {
                for (CreativeInfo creativeInfo : listK) {
                    String strH = creativeInfo.h();
                    if (strH != null && strH.contains(PangleCreativeInfo.f62495E)) {
                        creativeInfo.a(true);
                    }
                }
                return;
            }
            return;
        }
        Logger.d(f61633J, "stop collecting resources, number of Infos for ", str, " is ", Integer.valueOf(listA.size()), ", cannot stop collecting resources");
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    private class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f61678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f61679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f61680d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f61681e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f61682f = true;

        public b(String str, String str2) {
            boolean z2 = true;
            this.f61678b = str;
            if (!CreativeInfoManager.a(str2, AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, false) && !CreativeInfoManager.a(str2, AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, false)) {
                z2 = false;
            }
            this.f61679c = z2;
        }

        private void a(n nVar) {
            Object[] objArr = new Object[8];
            objArr[0] = "scan for screenshots, info ";
            objArr[1] = nVar.f61819L;
            objArr[2] = ", isCancelled = ";
            objArr[3] = nVar.al != null ? Boolean.valueOf(nVar.al.isCancelled()) : "?";
            objArr[4] = ", isDone = ";
            objArr[5] = nVar.al != null ? Boolean.valueOf(nVar.al.isDone()) : "?";
            objArr[6] = ", isOnUiThread = ";
            objArr[7] = Boolean.valueOf(com.safedk.android.utils.n.c());
            Logger.d(InterstitialFinder.f61633J, objArr);
            if (nVar.j() == null && nVar.aq != null && nVar.aq.get() != null && CreativeInfoManager.a(BrandSafetyUtils.b(nVar.aq.get().getClass()), AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, false)) {
                Logger.d(InterstitialFinder.f61633J, "scan for screenshots, info ", nVar.f61819L, " calling tryToFindCI");
                InterstitialFinder.this.b(nVar, nVar.aq.get());
            }
            if (nVar.aq != null && nVar.aq.get() != null) {
                Logger.d(InterstitialFinder.f61633J, "scan for screenshots, activity sdk is ", BrandSafetyUtils.b(nVar.aq.get().getClass()));
            }
            if (!nVar.f61812E && nVar.f61843y == 2) {
                InterstitialFinder.this.c(nVar, "scanForScreenshots");
            }
            if (nVar.af) {
                Logger.d(InterstitialFinder.f61633J, "scan for screenshots, request to stop taking screenshots has been received, skipping.");
            } else {
                InterstitialFinder.this.a(nVar);
            }
            CreativeInfo creativeInfoJ = nVar.j();
            if (nVar.f61843y != 120 && (creativeInfoJ == null || !creativeInfoJ.aq())) {
                InterstitialFinder.this.g(nVar);
                if (nVar.k().isEmpty()) {
                    Logger.d(InterstitialFinder.f61633J, "scan for screenshots, checking for pending CIs");
                    for (o oVar : InterstitialFinder.this.a(nVar.f61840v, nVar)) {
                        if (oVar != null && oVar.f62690a != null) {
                            Logger.d(InterstitialFinder.f61633J, "scan for screenshots, calling set CI");
                            InterstitialFinder.this.b(oVar, nVar);
                        }
                    }
                    return;
                }
                return;
            }
            if (creativeInfoJ == null || !creativeInfoJ.aq()) {
                Logger.d(InterstitialFinder.f61633J, "scan for screenshots, max number of screenshots threshold reached, stop taking screenshots for event id ", this.f61678b);
            } else {
                Logger.d(InterstitialFinder.f61633J, "scan for screenshots, website end card detected, stop taking screenshots for event id ", this.f61678b);
            }
            this.f61680d = false;
        }

        private void a(n nVar, boolean z2, boolean z3) {
            try {
                List<Integer> listB = com.safedk.android.internal.d.B();
                List<Integer> listD = com.safedk.android.internal.d.D();
                boolean z4 = z2 || listB.contains(Integer.valueOf(this.f61681e));
                boolean z5 = z3 || listD.contains(Integer.valueOf(this.f61681e));
                if ((z4 || z5) && com.safedk.android.utils.n.a((Reference<?>) nVar.aq)) {
                    Logger.d(InterstitialFinder.f61633J, "inject periodic script, cycle: ", Integer.valueOf(this.f61681e));
                    String str = nVar.f61840v;
                    List<WeakReference<WebView>> listB2 = InterstitialFinder.this.b(com.safedk.android.analytics.brandsafety.b.a((ViewGroup) nVar.aq.get().getWindow().getDecorView().findViewById(R.id.content)));
                    AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
                    if (adNetworkDiscoveryJ != null) {
                        WeakReference<WebView> weakReferenceA = adNetworkDiscoveryJ.a(listB2, (String) null);
                        Object[] objArr = new Object[2];
                        objArr[0] = "inject periodic script, webView: ";
                        objArr[1] = weakReferenceA != null ? weakReferenceA.get() : V8ValueNull.NULL;
                        Logger.d(InterstitialFinder.f61633J, objArr);
                        if (com.safedk.android.utils.n.a((Reference<?>) weakReferenceA)) {
                            com.safedk.android.analytics.brandsafety.creatives.b bVarK = CreativeInfoManager.k(str);
                            String strA = BrandSafetyUtils.a((Object) weakReferenceA.get());
                            boolean z6 = weakReferenceA.get().getVisibility() == 0;
                            if (!z6) {
                                Logger.d(InterstitialFinder.f61633J, "webView: ", weakReferenceA.get(), " is not visible - will not collect resources in this cycle");
                            }
                            if (z4 && bVarK.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN) && z6) {
                                List<String> listX = nVar.x();
                                if (strA != null && listX != null && !listX.contains(strA)) {
                                    listX.add(strA);
                                    nVar.a(listX);
                                }
                                SafeDKWebAppInterface.a(str, weakReferenceA.get(), SafeDKWebAppInterface.b(str, strA, nVar.w()));
                            }
                            if (z5 && bVarK.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES)) {
                                String str2 = "javascript:" + SafeDKWebAppInterface.c(str, strA);
                                if (str2 != null) {
                                    SafeDKWebAppInterface.a(str, weakReferenceA.get(), str2);
                                }
                            }
                        }
                    }
                    if (this.f61681e >= listB.get(listB.size() - 1).intValue() && this.f61681e >= listD.get(listD.size() - 1).intValue()) {
                        Logger.d(InterstitialFinder.f61633J, "inject periodic script, reached or surpassed last interval: ", Integer.valueOf(this.f61681e), " for wither eresources collection intervals or video observer intervals");
                        this.f61679c = false;
                    }
                }
                this.f61681e++;
            } catch (Throwable th) {
                Logger.e(InterstitialFinder.f61633J, "interstitial finder task execution: ", th.getMessage(), th);
            }
        }

        private void b(n nVar) {
            try {
                if (com.safedk.android.utils.n.a((Reference<?>) nVar.aq)) {
                    String str = nVar.f61840v;
                    List<WeakReference<WebView>> listB = InterstitialFinder.this.b(com.safedk.android.analytics.brandsafety.b.a((ViewGroup) nVar.aq.get().getWindow().getDecorView().findViewById(R.id.content)));
                    AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
                    if (adNetworkDiscoveryJ != null) {
                        WeakReference<WebView> weakReferenceA = adNetworkDiscoveryJ.a(listB, (String) null);
                        Object[] objArr = new Object[2];
                        objArr[0] = "inject dsp pp click detection script, webView: ";
                        objArr[1] = weakReferenceA != null ? weakReferenceA.get() : V8ValueNull.NULL;
                        Logger.d(InterstitialFinder.f61633J, objArr);
                        if (com.safedk.android.utils.n.a((Reference<?>) weakReferenceA)) {
                            String strA = BrandSafetyUtils.a((Object) weakReferenceA.get());
                            if (!(weakReferenceA.get().getVisibility() == 0)) {
                                Logger.d(InterstitialFinder.f61633J, "inject dsp pp click detection script webView: ", weakReferenceA.get(), " is not visible - will not inject");
                                return;
                            }
                            SafeDKWebAppInterface.a(str, weakReferenceA.get(), SafeDKWebAppInterface.b(str, strA));
                            this.f61682f = false;
                            Logger.d(InterstitialFinder.f61633J, "inject dsp pp click detection script webView: ", weakReferenceA.get(), " injected");
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.e(InterstitialFinder.f61633J, "nject dsp pp click detection interstitial finder task execution: ", th.getMessage(), th);
            }
        }

        private CreativeInfo c(n nVar) {
            Object th;
            CreativeInfo creativeInfoA;
            AdNetworkDiscovery adNetworkDiscoveryJ;
            k kVarI;
            try {
                String str = nVar.f61840v;
                Logger.d(InterstitialFinder.f61633J, Logger.FeatureTag.CI_MATCHING, "try periodic ci matching, sdk: ", str, ", event id: ", nVar.f61819L);
                if (str == null || (adNetworkDiscoveryJ = CreativeInfoManager.j(str)) == null || (kVarI = nVar.i()) == null || kVarI.f62608n == null || kVarI.f62608n.isEmpty()) {
                    return null;
                }
                creativeInfoA = adNetworkDiscoveryJ.a(kVarI.f62608n);
                if (creativeInfoA != null) {
                    try {
                        creativeInfoA.a(CreativeInfo.f62448l, null, null);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return creativeInfoA;
            } catch (Throwable th3) {
                th = th3;
                creativeInfoA = null;
            }
            Logger.e(InterstitialFinder.f61633J, "interstitial finder task execution: ", th);
            return creativeInfoA;
        }

        @Override // java.lang.Runnable
        public void run() {
            CreativeInfo creativeInfoC;
            try {
                if (this.f61678b == null) {
                    Logger.d(InterstitialFinder.f61633J, "interstitial finder task, event id is null, skipping.");
                    return;
                }
                n nVar = InterstitialFinder.this.f61638I.get(this.f61678b);
                if (nVar == null) {
                    Logger.d(InterstitialFinder.f61633J, "interstitial finder task, did not find interstitial info for event id: ", this.f61678b);
                    return;
                }
                if (nVar.at) {
                    Logger.d(InterstitialFinder.f61633J, "interstitial finder task, restart periodic script injection");
                    this.f61681e = 0;
                    this.f61679c = CreativeInfoManager.a(nVar.f61840v, AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true) || CreativeInfoManager.a(nVar.f61840v, AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, false);
                    nVar.at = false;
                }
                if (this.f61680d && !nVar.an) {
                    a(nVar);
                }
                if (this.f61679c) {
                    a(nVar, false, false);
                }
                if (this.f61682f) {
                    b(nVar);
                }
                com.safedk.android.analytics.brandsafety.creatives.g.a((List<WeakReference<WebView>>) InterstitialFinder.this.f(nVar), nVar);
                if (nVar.j() == null && (creativeInfoC = c(nVar)) != null) {
                    creativeInfoC.i(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
                    creativeInfoC.b(nVar.f61818K, WebView.class.getCanonicalName());
                    InterstitialFinder.this.a(new o(creativeInfoC, creativeInfoC.Z()), nVar);
                }
            } catch (Throwable th) {
                Logger.e(InterstitialFinder.f61633J, "interstitial finder task execution: ", th);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f61674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f61675b;

        public a(String str, String str2) {
            this.f61674a = str;
            this.f61675b = str2;
        }

        public boolean equals(Object o2) {
            if (this == o2) {
                return true;
            }
            if (o2 == null || getClass() != o2.getClass()) {
                return false;
            }
            a aVar = (a) o2;
            boolean zEquals = this.f61674a.equals(aVar.f61674a);
            String str = this.f61675b;
            if (str != null) {
                return zEquals && str.equals(aVar.f61675b);
            }
            return zEquals;
        }

        public int hashCode() {
            if (this.f61675b != null) {
                return this.f61674a.hashCode() * this.f61675b.hashCode();
            }
            return this.f61674a.hashCode();
        }

        public String toString() {
            return "{placementId=" + this.f61674a + ", eventId=" + this.f61675b + "}";
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            String str = this.f61674a;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("_");
            String str2 = this.f61675b;
            sb.append(str2 != null ? str2 : "");
            return sb.toString();
        }
    }

    private static View a(ViewGroup viewGroup, String str) {
        Logger.d(f61633J, "find views ", viewGroup.toString());
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            Logger.d(f61633J, "find views child ", childAt.toString());
            if (str != null && childAt.getClass().getName().equals(str)) {
                Logger.d(f61633J, "find views found ", str, " : ", childAt.toString());
                return childAt;
            }
            if (childAt instanceof ViewGroup) {
                return a((ViewGroup) childAt, str);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<CreativeInfo> b(ViewGroup viewGroup, String str) {
        List<CreativeInfo> listA;
        Logger.d(f61633J, "get creative info from ad view started : ", viewGroup.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            Logger.d(f61633J, "get creative info from ad view - child ", childAt.toString());
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
            if (adNetworkDiscoveryJ != null && (listA = adNetworkDiscoveryJ.a(new WeakReference<>(childAt), (String) null, BrandSafetyUtils.AdType.INTERSTITIAL)) != null) {
                for (CreativeInfo creativeInfo : listA) {
                    creativeInfo.a((Object) childAt);
                    creativeInfo.u("ci_source_sdk_class=" + childAt.getClass().getName());
                    Logger.d(f61633J, Logger.FeatureTag.CI_MATCHING, "get creative info from ad view - ci found, object : ", childAt.toString());
                }
                return listA;
            }
            if (childAt instanceof ViewGroup) {
                return b((ViewGroup) childAt, str);
            }
        }
        return null;
    }

    public static void a(View view, int i2) {
        Logger.d(f61633J, "find views view : ", new String(new char[i2 * 2]).replace(Json.UNSET_NAME, "-"), view.getClass().toString(), new StringBuilder().toString());
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(k kVar) {
        a(kVar);
        synchronized (this.f61774C) {
            Logger.printFullVerboseLog(f61633J, "adInfoCollectionForUpload count = ", Integer.valueOf(this.f61774C.size()), " : ", this.f61774C);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, x xVar) {
        c cVarB = b(str, xVar);
        if (cVarB instanceof n) {
            c((n) cVarB, "handleWebsiteOpened");
            return true;
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean b(String str, String str2, String str3) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void c(String str, String str2, String str3) {
        n nVarA = this.f61638I.a(str, false);
        if (nVarA == null) {
            Logger.d(f61633J, "pass message to ad info - info is null");
            return;
        }
        if (com.safedk.android.analytics.brandsafety.b.f61772y.equals(str3)) {
            nVarA.a(str2, true);
        } else {
            nVarA.d(str2);
        }
        Logger.d(f61633J, "pass message to ad info - message: ", str2, " has passed to info: ", nVarA);
    }

    public boolean f() {
        synchronized (this.f61638I) {
            Iterator<n> it = this.f61638I.values().iterator();
            while (it.hasNext()) {
                if (!it.next().f61827U) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void a(c cVar, String str, boolean z2) {
        if (cVar instanceof n) {
            c((n) cVar, str);
        }
    }
}
