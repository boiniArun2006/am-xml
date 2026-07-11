package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import c8G.Fsz.qwlyMfUJj;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.C1780h;
import com.applovin.impl.EnumC1781i;
import com.applovin.impl.a3;
import com.applovin.impl.d6;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.p5;
import com.applovin.impl.r3;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t3;
import com.applovin.impl.u3;
import com.applovin.impl.v5;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f49227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f49228b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f49229c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f49230d = new HashMap(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f49231e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f49232f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f49233g = new Object();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    class a implements p5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f49234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f49235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f49236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a3 f49237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f49238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0704a f49239f;

        a(long j2, Map map, String str, a3 a3Var, Context context, a.InterfaceC0704a interfaceC0704a) {
            this.f49234a = j2;
            this.f49235b = map;
            this.f49236c = str;
            this.f49237d = a3Var;
            this.f49238e = context;
            this.f49239f = interfaceC0704a;
        }

        @Override // com.applovin.impl.p5.b
        public void a(JSONArray jSONArray) {
            this.f49235b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f49234a));
            this.f49235b.put("calfc", Integer.valueOf(d.this.b(this.f49236c)));
            v5 v5Var = new v5(this.f49237d, jSONArray, this.f49238e, d.this.f49227a, this.f49239f);
            if (((Boolean) d.this.f49227a.a(r3.o8)).booleanValue()) {
                d.this.f49227a.q0().a((AbstractRunnableC1782i5) v5Var, d6.b.MEDIATION);
            } else {
                d.this.f49227a.q0().a(v5Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static class b implements a.InterfaceC0704a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1802k f49241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f49242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f49243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f49244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f49245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f49246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f49247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f49248h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f49249i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f49250j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f49251k;

        /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j2, long j3, d dVar, C1802k c1802k, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j2, j3, dVar, c1802k, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f49244d.f49252a);
            y2Var.a(SystemClock.elapsedRealtime() - this.f49250j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f49241a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f49251k, y2Var.getRequestLatencyMillis());
            }
            this.f49243c.a(maxAd.getAdUnitId());
            this.f49244d.f49254c = 0;
            if (this.f49244d.f49255d == null) {
                this.f49243c.a(y2Var);
                this.f49244d.f49253b.set(false);
                return;
            }
            y2Var.A().c().a(this.f49244d.f49255d);
            this.f49244d.f49255d.onAdLoaded(y2Var);
            if (y2Var.O().endsWith("load")) {
                this.f49244d.f49255d.onAdRevenuePaid(y2Var);
            }
            this.f49244d.f49255d = null;
            if (((Boolean) this.f49241a.a(r3.f8)).booleanValue() || !this.f49243c.a(maxAd)) {
                this.f49244d.f49253b.set(false);
                return;
            }
            Context contextO = (Context) this.f49242b.get();
            if (contextO == null) {
                contextO = C1802k.o();
            }
            Context context = contextO;
            this.f49250j = SystemClock.elapsedRealtime();
            this.f49251k = System.currentTimeMillis();
            this.f49248h.put("art", EnumC1781i.SEQUENTIAL_OR_PRECACHE.b());
            this.f49243c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f49246f, this.f49247g, this.f49248h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j2, long j3, d dVar, C1802k c1802k, Context context) {
            this.f49241a = c1802k;
            this.f49242b = new WeakReference(context);
            this.f49243c = dVar;
            this.f49244d = cVar;
            this.f49245e = maxAdFormat;
            this.f49247g = map2;
            this.f49246f = map;
            this.f49248h = map3;
            this.f49250j = j2;
            this.f49251k = j3;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f49249i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f49249i = Math.min(2, ((Integer) c1802k.a(r3.h8)).intValue());
            } else {
                this.f49249i = ((Integer) c1802k.a(r3.h8)).intValue();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i2, String str) {
            this.f49247g.put("retry_delay_sec", Integer.valueOf(i2));
            this.f49247g.put("retry_attempt", Integer.valueOf(this.f49244d.f49254c));
            Context contextO = (Context) this.f49242b.get();
            if (contextO == null) {
                contextO = C1802k.o();
            }
            Context context = contextO;
            this.f49248h.put("art", EnumC1781i.EXPONENTIAL_RETRY.b());
            this.f49248h.put("era", Integer.valueOf(this.f49244d.f49254c));
            this.f49251k = System.currentTimeMillis();
            this.f49243c.a(str, this.f49245e, this.f49246f, this.f49247g, this.f49248h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            MaxError maxError2;
            this.f49243c.c(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f49250j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f49241a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f49251k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z2 = maxError2.getCode() == -5603 && n7.c(this.f49241a) && ((Boolean) this.f49241a.a(x4.A6)).booleanValue();
            if (this.f49241a.a(r3.i8, this.f49245e) && this.f49244d.f49254c < this.f49249i && !z2) {
                c.e(this.f49244d);
                final int iPow = (int) Math.pow(2.0d, this.f49244d.f49254c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49411n.a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f49244d.f49254c = 0;
            this.f49244d.f49253b.set(false);
            if (this.f49244d.f49255d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f49244d.f49252a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f49244d.f49255d, str, maxError2);
                this.f49244d.f49255d = null;
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f49252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f49253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0704a f49255d;

        /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        private c(String str) {
            this.f49253b = new AtomicBoolean();
            this.f49252a = str;
        }

        static /* synthetic */ int e(c cVar) {
            int i2 = cVar.f49254c;
            cVar.f49254c = i2 + 1;
            return i2;
        }
    }

    public void c(String str, String str2) {
        synchronized (this.f49229c) {
            this.f49228b.remove(b(str, str2));
        }
    }

    private String b(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            str3 = qwlyMfUJj.GPcvDKzlHUFVtX + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    private y2 e(String str) {
        y2 y2Var;
        synchronized (this.f49231e) {
            y2Var = (y2) this.f49230d.get(str);
            this.f49230d.remove(str);
        }
        return y2Var;
    }

    public boolean d(String str) {
        boolean z2;
        synchronized (this.f49231e) {
            z2 = this.f49230d.get(str) != null;
        }
        return z2;
    }

    public d(C1802k c1802k) {
        this.f49227a = c1802k;
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f49233g) {
            try {
                Integer num = (Integer) this.f49232f.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, EnumC1781i enumC1781i, Map map, Map map2, Context context, a.InterfaceC0704a interfaceC0704a) {
        y2 y2VarE = (this.f49227a.s0().d() || n7.h(C1802k.o())) ? null : e(str);
        if (y2VarE != null) {
            y2VarE.i(str2);
            y2VarE.A().c().a(interfaceC0704a);
            interfaceC0704a.onAdLoaded(y2VarE);
            if (y2VarE.O().endsWith("load")) {
                interfaceC0704a.onAdRevenuePaid(y2VarE);
            }
            if (((Boolean) this.f49227a.a(r3.f8)).booleanValue() && a((MaxAd) y2VarE)) {
                return;
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f49253b.compareAndSet(false, true)) {
            if (cVarA.f49255d != null && cVarA.f49255d != interfaceC0704a) {
                C1804o.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f49255d = interfaceC0704a;
            return;
        }
        if (y2VarE == null) {
            cVarA.f49255d = interfaceC0704a;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", enumC1781i.b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f49227a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.f49233g) {
            try {
                this.f49227a.O();
                if (C1804o.a()) {
                    this.f49227a.O().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f49232f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f49232f.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0704a interfaceC0704a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f49227a.q0().a((AbstractRunnableC1782i5) new p5(a3Var, context, this.f49227a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0704a)), d6.b.MEDIATION);
    }

    private C1780h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f49227a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f49227a.Y();
            s3 s3Var = s3.f49914e;
            Map mapA = u3VarY.a(s3Var, t3.a(str));
            s3.a aVar = s3.a.SESSION;
            int iA = a(mapA, aVar);
            s3.a aVar2 = s3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f49227a.Y().a(s3Var, t3.a(maxAdFormat));
            return new C1780h(iA, iA2, a(mapA2, aVar), a(mapA2, aVar2));
        }
        return new C1780h(-1, -1, -1, -1);
    }

    private int a(Map map, s3.a aVar) {
        Long l2;
        if (map == null || (l2 = (Long) map.get(aVar.b())) == null) {
            return -1;
        }
        return l2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var) {
        synchronized (this.f49231e) {
            try {
                if (this.f49230d.containsKey(y2Var.getAdUnitId())) {
                    C1804o.h("AppLovinSdk", "Ad in cache already: " + y2Var.getAdUnitId());
                }
                this.f49230d.put(y2Var.getAdUnitId(), y2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f49229c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f49228b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f49228b.put(strB, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f49233g) {
            try {
                this.f49227a.O();
                if (C1804o.a()) {
                    this.f49227a.O().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f49232f.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(MaxAd maxAd) {
        return ((!this.f49227a.c(r3.d8).contains(maxAd.getAdUnitId()) && !this.f49227a.a(r3.c8, maxAd.getFormat())) || this.f49227a.s0().c() || this.f49227a.s0().d()) ? false : true;
    }
}
