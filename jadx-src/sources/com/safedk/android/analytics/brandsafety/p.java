package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.events.MaxEvents;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f62694a = 50;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f62695b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f62696c = 30000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62697d = "MaxEventsManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f62698e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static p f62699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxEvents f62700g = new MaxEvents(50);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxEvents f62701h = new MaxEvents(5);

    private p() {
    }

    public static p a() {
        p pVar;
        synchronized (f62698e) {
            if (f62699f == null) {
                f62699f = new p();
            }
            pVar = f62699f;
        }
        return pVar;
    }

    public synchronized void a(com.safedk.android.analytics.events.a aVar) {
        this.f62700g.add(aVar);
    }

    public void b(com.safedk.android.analytics.events.a aVar) {
        Logger.d(f62697d, "Adding MAX Will display event. #event is ", Integer.valueOf(this.f62701h.size()), ",  maxEvent=", aVar.toString());
        this.f62701h.add(aVar);
    }

    public MaxEvents b() {
        MaxEvents maxEventsD = d();
        if (maxEventsD.size() >= 10) {
            return maxEventsD;
        }
        return a(10);
    }

    private synchronized MaxEvents d() {
        MaxEvents maxEvents;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.d(f62697d, "");
        maxEvents = new MaxEvents(50);
        for (com.safedk.android.analytics.events.a aVar : this.f62700g) {
            if (jCurrentTimeMillis - (aVar.c() * 1000) < 30000) {
                Logger.d(f62697d, "getEventFromLastInterval Adding max event ts = ", Long.valueOf(jCurrentTimeMillis), ", ", aVar.toString());
                maxEvents.add(aVar);
            }
        }
        return maxEvents;
    }

    public synchronized MaxEvents a(int i2) {
        MaxEvents maxEvents;
        maxEvents = new MaxEvents(i2);
        for (int size = this.f62700g.size() < 10 ? 0 : this.f62700g.size() - 10; size < this.f62700g.size(); size++) {
            Logger.d(f62697d, "getLastXEvents adding max event index ", Integer.valueOf(size), " ", this.f62700g.get(size).toString());
            maxEvents.add(new com.safedk.android.analytics.events.a(this.f62700g.get(size)));
        }
        return maxEvents;
    }

    public MaxEvents c() {
        return this.f62701h;
    }
}
