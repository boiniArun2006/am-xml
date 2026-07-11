package com.safedk.android.analytics;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class StatsReporter implements AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f61346a = "StatsReporter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static StatsReporter f61347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ExecutorService f61348c = Executors.newSingleThreadExecutor();

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f61283a;
    }

    public static synchronized void a() {
        f61347b = new StatsReporter();
    }

    public static synchronized StatsReporter b() {
        return f61347b;
    }

    public void a(final ArrayList<Bundle> arrayList) {
        try {
            f61348c.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsReporter.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (arrayList.size() > 0) {
                            Logger.d(StatsReporter.f61346a, "Starting report stats events!", ", isOnUiThread = ", Boolean.valueOf(n.c()));
                            AppLovinBridge.a((ArrayList<Bundle>) arrayList, StatsReporter.this);
                            PersistentConcurrentHashMap.a();
                        }
                    } catch (Throwable th) {
                        Logger.e(StatsReporter.f61346a, "Caught exception while creating json data", th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(f61346a, "failed during report events: ", arrayList, th);
            new CrashReporter().caughtException(th);
        }
    }

    public ArrayList<Bundle> a(Set<StatsEvent> set) {
        boolean z2;
        Object[] objArr = new Object[4];
        objArr[0] = "filters reports and bundle started, events to send : ";
        objArr[1] = set == null ? V8ValueNull.NULL : Integer.valueOf(set.size());
        objArr[2] = ", isOnUiThread = ";
        objArr[3] = Boolean.valueOf(n.c());
        Logger.d(f61346a, objArr);
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            for (StatsEvent statsEvent : set) {
                if (SafeDK.b() && (statsEvent.a().equals(StatsCollector.EventType.BrandSafety) || statsEvent.a().equals(StatsCollector.EventType.redirect))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Logger.d(f61346a, "filters reports and bundle Event type = ", statsEvent.a(), "; should report = " + z2);
                Bundle bundleD = statsEvent.d();
                Logger.printFullVerboseLog(f61346a, "filters reports and bundle ", statsEvent.a(), " event:", n.a(bundleD));
                if (z2) {
                    Set<String> setE = statsEvent.e();
                    if (setE != null) {
                        HashSet hashSet = new HashSet();
                        for (String str : setE) {
                            if (!bundleD.containsKey(str)) {
                                hashSet.add(str);
                            }
                        }
                        if (hashSet.size() > 0) {
                            Logger.d(f61346a, "filters reports and bundle *** missing fields: ", hashSet);
                        }
                    }
                    arrayList.add(statsEvent.a(bundleD));
                    Logger.printFullVerboseLog(f61346a, "filters reports and bundle event to be reported : ", bundleD.toString());
                }
            }
        } catch (Exception e2) {
            Logger.e(f61346a, "Exception filtering events for report", e2);
        }
        return arrayList;
    }

    public synchronized boolean a(CreativeInfo creativeInfo, c cVar) {
        Bundle bundle = cVar.f61808A;
        Logger.d(f61346a, "notify Max started , CI = ", creativeInfo, ", applovin data = ", bundle, ", isOnUiThread = ", Boolean.valueOf(n.c()));
        if (creativeInfo != null && creativeInfo.af() != null && bundle != null) {
            String strZ = com.safedk.android.analytics.brandsafety.b.a(cVar, creativeInfo) ? cVar.z() : creativeInfo.af();
            Logger.d(f61346a, "Will notify Max about match, creative id = ", strZ);
            AppLovinBridge.reportMaxCreativeId(bundle, strZ, b());
            return true;
        }
        Logger.d(f61346a, "Cannot notify Max about match");
        return false;
    }
}
