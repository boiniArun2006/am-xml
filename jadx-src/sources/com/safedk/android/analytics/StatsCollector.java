package com.safedk.android.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.t;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.d;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class StatsCollector implements com.safedk.android.internal.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f61309a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f61310c = "StatsCollector";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f61311d = "SafeDKEvents.";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static StatsCollector f61312e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f61313n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f61314p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static boolean f61315q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f61316r = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SharedPreferences f61321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile AtomicBoolean f61322j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private StatsReporter f61324l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f61326o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PersistentConcurrentHashMap<String, StatsEvent> f61318f = new PersistentConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LinkedHashSetWithItemLimit<String> f61319g = new LinkedHashSetWithItemLimit<>(10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, t> f61320h = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicLong f61317b = new AtomicLong(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AtomicBoolean f61323k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ExecutorService f61325m = Executors.newSingleThreadExecutor();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public enum EventType {
        Network,
        Launch,
        Thread,
        Location,
        CaughtException,
        UserDataAccess,
        ActiveUser,
        BrandSafety,
        AdIntelligenceFill,
        ANR,
        UserSession,
        crash,
        redirect
    }

    public static boolean a() {
        return f61314p;
    }

    public static void a(boolean z2) {
        f61314p = z2;
    }

    public static boolean b() {
        return f61315q;
    }

    public static void b(boolean z2) {
        synchronized (f61316r) {
            Logger.d(f61310c, "setActiveMode to ", Boolean.valueOf(z2));
            f61313n = z2;
            f61312e = null;
        }
    }

    public static StatsCollector c() {
        StatsCollector statsCollector;
        if (!f61314p && !SafeDK.b()) {
            Logger.d(f61310c, "Reporter thread has not been initialized yet");
            return null;
        }
        synchronized (f61316r) {
            if (f61312e == null) {
                f61312e = new StatsCollector(d.f62986a, com.safedk.android.internal.b.getInstance().isInBackground(), 5000, null, n.a(SafeDK.getInstance().m()));
            }
            statsCollector = f61312e;
        }
        return statsCollector;
    }

    private StatsCollector(int interval, boolean isBackground, int maximumEventsSize, StatsReporter statsReporter, String processName) {
        this.f61326o = null;
        this.f61326o = f61311d + processName;
        Logger.d(f61310c, "Initializing Stats collector");
        a(interval, isBackground, statsReporter);
        if (f61313n) {
            com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
        }
    }

    public void d() {
        this.f61325m.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.1
            @Override // java.lang.Runnable
            public void run() {
                PersistentConcurrentHashMap persistentConcurrentHashMap;
                HashSet<StatsEvent> hashSet;
                String strB;
                try {
                    Logger.d(StatsCollector.f61310c, "Attempting to load Stats events from storage.");
                    try {
                        persistentConcurrentHashMap = new PersistentConcurrentHashMap(StatsCollector.this.f61326o);
                    } catch (Throwable th) {
                        Logger.d(StatsCollector.f61310c, "Error loading events from storage file ", StatsCollector.this.f61326o, " : ", th.getMessage());
                        persistentConcurrentHashMap = new PersistentConcurrentHashMap();
                    }
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    if (StatsCollector.this.f61318f != null && StatsCollector.this.f61318f.size() > 0) {
                        synchronized (StatsCollector.f61316r) {
                            concurrentHashMap.putAll(StatsCollector.this.f61318f);
                        }
                        Logger.d(StatsCollector.f61310c, "Stats repository contains ", Integer.valueOf(concurrentHashMap.size()), " items. they will be added to the stored ones.");
                    } else {
                        Logger.d(StatsCollector.f61310c, "Stats repository does not contain previously accumulated events.");
                    }
                    for (V v2 : persistentConcurrentHashMap.values()) {
                        if (v2 instanceof BrandSafetyEvent) {
                            BrandSafetyEvent brandSafetyEvent = (BrandSafetyEvent) v2;
                            if (brandSafetyEvent.g() != null && !brandSafetyEvent.g().toLowerCase().endsWith("imp")) {
                                Log.d(StatsCollector.f61310c, "brandSafetyEvent revenue event field check, field nullified,  original value = " + brandSafetyEvent.g());
                                brandSafetyEvent.a((String) null);
                            }
                        }
                    }
                    synchronized (StatsCollector.f61316r) {
                        StatsCollector.this.f61318f = persistentConcurrentHashMap;
                        hashSet = new HashSet(StatsCollector.this.f61318f.values());
                    }
                    Logger.d(StatsCollector.f61310c, Integer.valueOf(StatsCollector.this.f61318f.size()), " events loaded from storage");
                    for (StatsEvent statsEvent : hashSet) {
                        if (statsEvent.b() == null) {
                            strB = null;
                        } else {
                            strB = statsEvent.b();
                        }
                        Logger.d(StatsCollector.f61310c, "Setting event maturity, next_session, first_session (", Boolean.valueOf(SafeDK.getInstance().e()), ") for stored event. key ", strB);
                        statsEvent.b(true);
                        statsEvent.c(true);
                        statsEvent.a(SafeDK.getInstance().e());
                        if (!TextUtils.isEmpty(StatsCollector.this.f61318f.b())) {
                            Logger.d(StatsCollector.f61310c, "sdk_null_check sc added value", StatsCollector.this.f61318f.b());
                        }
                    }
                    if (concurrentHashMap.size() > 0) {
                        for (StatsEvent statsEvent2 : concurrentHashMap.values()) {
                            Logger.d(StatsCollector.f61310c, "adding previously accumulated event to the stats repository : ", statsEvent2.toString());
                            StatsCollector.this.b(statsEvent2);
                        }
                    }
                    Logger.d(StatsCollector.f61310c, "Completed Loading events from storage. ", Integer.valueOf(StatsCollector.this.f61318f.size()), " items loaded");
                    boolean unused = StatsCollector.f61315q = true;
                    if (StatsCollector.this.f61318f.size() > 0) {
                        Logger.d(StatsCollector.f61310c, Integer.valueOf(StatsCollector.this.f61318f.size()), " event(s) will be reported");
                        StatsCollector.this.d(true);
                    }
                    SafeDK.getInstance().k();
                } catch (Throwable th2) {
                    Logger.d(StatsCollector.f61310c, "Error loading events from storage : ", th2.getMessage(), th2);
                }
            }
        });
    }

    public PersistentConcurrentHashMap<String, StatsEvent> e() {
        return this.f61318f;
    }

    public ConcurrentHashMap<String, StatsEvent> a(EventType eventType) {
        Set<String> setKeySet;
        ConcurrentHashMap<String, StatsEvent> concurrentHashMap = new ConcurrentHashMap<>();
        synchronized (f61316r) {
            setKeySet = this.f61318f.keySet();
        }
        for (String str : setKeySet) {
            StatsEvent statsEvent = this.f61318f.get(str);
            if (statsEvent != null && statsEvent.a().equals(eventType)) {
                Logger.d(f61310c, "Get events by type adding event with key ", str);
                concurrentHashMap.put(statsEvent.b(), statsEvent);
            }
        }
        return concurrentHashMap;
    }

    public Map<String, t> f() {
        return this.f61320h;
    }

    public boolean a(String str, String str2) {
        Map<String, t> map = this.f61320h;
        if (map != null && map.containsKey(str) && this.f61320h.get(str).c().equals(str2)) {
            return true;
        }
        return false;
    }

    private void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        this.f61321i = sharedPreferences;
        sharedPreferences.edit().clear().commit();
        Logger.d(f61310c, "Old StatsRepository data cleared");
    }

    public void a(int i2, boolean z2, int i3, StatsReporter statsReporter) {
        a(i2, z2, statsReporter);
        this.f61323k.set(true);
    }

    private void a(int i2, boolean z2, StatsReporter statsReporter) {
        f61309a = i2;
        this.f61317b.set(n.b(System.currentTimeMillis()));
        this.f61322j = new AtomicBoolean(z2);
        this.f61324l = statsReporter;
    }

    public void a(StatsEvent statsEvent) {
        b(Collections.singletonList(statsEvent));
    }

    public void a(List<StatsEvent> list) {
        b(list);
    }

    private void b(final List<StatsEvent> list) {
        if (f61313n) {
            this.f61325m.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Logger.printFullVerboseLog(StatsCollector.f61310c, "received stats safety event ", list, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                        if (!StatsCollector.this.f61322j.get()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                StatsCollector.this.b((StatsEvent) it.next());
                            }
                            StatsCollector.this.d(false);
                            return;
                        }
                        for (StatsEvent statsEvent : list) {
                            if (!statsEvent.a_() || statsEvent.k().equals(SafeDK.f61203a)) {
                                Logger.d(StatsCollector.f61310c, "Saving bundle to disk : ", statsEvent.toString());
                                StatsCollector.this.b(statsEvent);
                            } else {
                                StatsCollector.this.b(statsEvent);
                                StatsCollector.this.d(true);
                            }
                        }
                    } catch (Throwable th) {
                        Logger.e(StatsCollector.f61310c, "Error adding event: ", th.getMessage(), th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        }
    }

    void b(StatsEvent statsEvent) {
        String strB = statsEvent.b();
        k();
        if (strB != null) {
            if (this.f61318f.containsKey(strB)) {
                StatsEvent statsEvent2 = this.f61318f.get(strB);
                if (statsEvent2 != null) {
                    statsEvent2.b(statsEvent);
                    synchronized (f61316r) {
                        this.f61318f.put(strB, statsEvent2);
                    }
                    Logger.d(f61310c, "Event ", strB, " found. Aggregating. event = ", statsEvent2.d().toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()));
                    return;
                }
                return;
            }
            if (!this.f61319g.contains(strB)) {
                synchronized (f61316r) {
                    this.f61318f.put(strB, statsEvent);
                }
                Logger.d(f61310c, "Event ", strB, " found. Adding. event = ", statsEvent.d().toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()));
                return;
            }
            Logger.d(f61310c, "Event ", strB, " found. Already reported. event = ", statsEvent.d().toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()));
            return;
        }
        Logger.d(f61310c, "Event key is null, cannot add to events repository.");
    }

    public void a(String str) {
        StatsEvent statsEventRemove;
        k();
        if (str != null) {
            synchronized (f61316r) {
                statsEventRemove = this.f61318f.remove(str);
            }
            if (statsEventRemove != null) {
                Logger.d(f61310c, "Event successfully removed from events repository, key=", str);
                return;
            } else {
                Logger.d(f61310c, "Event to remove wasn't found in events repository, key=", str);
                return;
            }
        }
        Logger.d(f61310c, "Event key is null, cannot remove from events repository.");
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        if (f61313n) {
            Logger.d(f61310c, "onBackground started");
            this.f61322j.set(true);
            this.f61325m.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.3
                @Override // java.lang.Runnable
                public void run() {
                    StatsCollector.this.d(true);
                }
            });
        }
    }

    @Override // com.safedk.android.internal.a
    public void h() {
        if (f61313n) {
            Logger.d(f61310c, "onForeground started");
            this.f61322j.set(false);
            this.f61325m.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.4
                @Override // java.lang.Runnable
                public void run() {
                    StatsCollector.this.d(true);
                }
            });
        }
    }

    public boolean i() {
        return com.safedk.android.internal.b.getInstance().getForegroundActivity() == null || this.f61322j.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z2) {
        try {
            synchronized (f61316r) {
                if (this.f61318f != null && this.f61318f.size() != 0) {
                    HashSet<StatsEvent> hashSet = new HashSet(this.f61318f.values());
                    Logger.d(f61310c, "sendEvents started, persistImmatureEvents=", Boolean.valueOf(z2), ", isOnUiThread = ", Boolean.valueOf(n.c()));
                    HashSet hashSet2 = new HashSet();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        StatsEvent statsEvent = (StatsEvent) it.next();
                        Logger.printFullVerboseLog(f61310c, "sendEvents, key=", statsEvent.b(), ", mature=", Boolean.valueOf(statsEvent.a_()), ", event details ", statsEvent.toString());
                        if (!statsEvent.a_()) {
                            hashSet2.add(statsEvent);
                            it.remove();
                        }
                    }
                    if (hashSet.size() > 0) {
                        Logger.d(f61310c, "sendEvents ", hashSet);
                    }
                    k();
                    boolean zIsInBackground = com.safedk.android.internal.b.getInstance().isInBackground();
                    boolean zI = i();
                    Logger.d(f61310c, "foregroundActivity is null? ", Boolean.valueOf(zIsInBackground), ", is background? ", Boolean.valueOf(this.f61322j.get()));
                    ArrayList<Bundle> arrayListA = this.f61324l.a(hashSet);
                    if (arrayListA.size() > 0 && !zI) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<Bundle> it2 = arrayListA.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().getString("event_id"));
                        }
                        Logger.d(f61310c, "sendEvents sending the following events (", Integer.valueOf(arrayListA.size()), ") : ", arrayList);
                        this.f61324l.a(arrayListA);
                        for (Bundle bundle : arrayListA) {
                            if (SafeDK.getInstance().A() != null && SafeDK.getInstance().A().i() != null) {
                                Logger.d(f61310c, "eventIds removed ", bundle.getString("event_id"), " found banner eventId = ", Boolean.valueOf(SafeDK.getInstance().A().i().remove(bundle.getString("event_id"))));
                            }
                            if (bundle.containsKey(StatsEvent.f62830z) && bundle.getString(StatsEvent.f62830z).equals("impression")) {
                                Logger.d(f61310c, "sendEvents removing brand safety event  ", bundle.getString("impression_id"));
                                synchronized (f61316r) {
                                    this.f61318f.remove(bundle.getString("impression_id"));
                                }
                            } else if (bundle.containsKey(StatsEvent.f62830z) && bundle.getString(StatsEvent.f62830z).equals(RedirectEvent.f62794b)) {
                                Logger.d(f61310c, qfEYuUHwj.jHNM, RedirectEvent.b(bundle), ", exists ? ", Boolean.valueOf(this.f61318f.containsKey(RedirectEvent.b(bundle))));
                                synchronized (f61316r) {
                                    this.f61318f.remove(RedirectEvent.b(bundle));
                                }
                            } else {
                                Logger.d(f61310c, "sendEvents Cannot remove event from stats repository ", bundle.toString());
                            }
                        }
                        if (SafeDK.getInstance().A() != null) {
                            Logger.d(f61310c, "eventIds remaining : ", SafeDK.getInstance().A().i());
                        }
                    } else if (zI) {
                        Logger.d(f61310c, "sendEvents will not report because the app is in the background");
                    }
                    if (z2) {
                        Logger.d(f61310c, "sendEvents persisting immature events");
                        if (hashSet2.size() > 0) {
                            Logger.d(f61310c, Integer.valueOf(hashSet2.size()), " sendEvents events to save");
                            Iterator it3 = hashSet2.iterator();
                            while (it3.hasNext()) {
                                b((StatsEvent) it3.next());
                            }
                            return;
                        }
                        return;
                    }
                    if (this.f61318f != null && this.f61318f.size() > 0 && hashSet.size() > 0) {
                        Logger.d(f61310c, "Before removing stats. repository size = ", Integer.valueOf(this.f61318f.size()), ", events (", Integer.valueOf(hashSet.size()), wDgKoYAES.IfuqQtaxbWz, hashSet.toString());
                        for (StatsEvent statsEvent2 : hashSet) {
                            Logger.d(f61310c, "event key is ", statsEvent2.b());
                            synchronized (f61316r) {
                                this.f61318f.remove(statsEvent2.b(), statsEvent2);
                            }
                            this.f61319g.add(statsEvent2.b());
                        }
                        Logger.d(f61310c, "After removing stats events (", Integer.valueOf(this.f61318f.size()), ") :", this.f61318f);
                        return;
                    }
                    return;
                }
                Logger.d(f61310c, "sendEvents no events to report, skipping");
            }
        } catch (Exception e2) {
            Logger.d(f61310c, "error sending event: ", e2.getMessage(), e2);
            new CrashReporter().caughtException(e2);
        }
    }

    private void k() {
        if (this.f61324l == null) {
            Logger.d(f61310c, "statsReporter is null, initializing");
            StatsReporter.a();
            this.f61324l = StatsReporter.b();
        }
    }
}
