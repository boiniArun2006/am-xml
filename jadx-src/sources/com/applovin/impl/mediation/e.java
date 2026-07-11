package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
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
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f49296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f49297b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f49298c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f49299d = new HashMap(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f49300e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f49301f = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f49302g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f49303h = new Object();

    class a implements p5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f49304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f49305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f49306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a3 f49307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f49308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0704a f49309f;

        a(long j2, Map map, String str, a3 a3Var, Context context, a.InterfaceC0704a interfaceC0704a) {
            this.f49304a = j2;
            this.f49305b = map;
            this.f49306c = str;
            this.f49307d = a3Var;
            this.f49308e = context;
            this.f49309f = interfaceC0704a;
        }

        @Override // com.applovin.impl.p5.b
        public void a(JSONArray jSONArray) {
            this.f49305b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f49304a));
            this.f49305b.put("calfc", Integer.valueOf(e.this.b(this.f49306c)));
            v5 v5Var = new v5(this.f49307d, jSONArray, this.f49308e, e.this.f49296a, this.f49309f);
            if (((Boolean) e.this.f49296a.a(r3.o8)).booleanValue()) {
                e.this.f49296a.q0().a((AbstractRunnableC1782i5) v5Var, d6.b.MEDIATION);
            } else {
                e.this.f49296a.q0().a(v5Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static class b implements a.InterfaceC0704a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1802k f49311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f49312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f49313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f49314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f49315e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f49316f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f49317g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f49318h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f49319i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f49320j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f49321k;

        /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j2, long j3, e eVar, C1802k c1802k, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j2, j3, eVar, c1802k, context);
        }

        private void a(MaxAd maxAd) {
            Context contextO = (Context) this.f49312b.get();
            if (contextO == null) {
                contextO = C1802k.o();
            }
            Context context = contextO;
            this.f49320j = SystemClock.elapsedRealtime();
            this.f49321k = System.currentTimeMillis();
            this.f49318h.put("art", EnumC1781i.SEQUENTIAL_OR_PRECACHE.b());
            this.f49313c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f49316f, this.f49317g, this.f49318h, context, this);
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
            int sizeSafely;
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f49314d.f49322a);
            y2Var.a(SystemClock.elapsedRealtime() - this.f49320j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f49311a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f49321k, y2Var.getRequestLatencyMillis());
            }
            this.f49313c.a(maxAd.getAdUnitId());
            this.f49314d.f49324c = 0;
            if (this.f49314d.f49325d == null) {
                this.f49313c.a(y2Var);
                this.f49314d.f49323b.set(false);
                int iL = y2Var.L();
                synchronized (this.f49313c.f49300e) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) this.f49313c.f49299d.get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < iL) {
                    int i2 = sizeSafely + 1;
                    this.f49311a.O();
                    if (C1804o.a()) {
                        this.f49311a.O().a(QiDPjiOCZHDS.jnMSBWH, "Preloading waterfall " + i2 + " of " + iL);
                    }
                    a(maxAd);
                    return;
                }
                return;
            }
            y2Var.A().c().a(this.f49314d.f49325d);
            this.f49314d.f49325d.onAdLoaded(y2Var);
            this.f49313c.f49301f.put(maxAd.getAdUnitId(), y2Var);
            if (y2Var.O().endsWith("load")) {
                this.f49314d.f49325d.onAdRevenuePaid(y2Var);
            }
            this.f49314d.f49325d = null;
            if ((!this.f49311a.c(r3.d8).contains(maxAd.getAdUnitId()) && !this.f49311a.a(r3.c8, maxAd.getFormat())) || this.f49311a.s0().c() || this.f49311a.s0().d()) {
                this.f49314d.f49323b.set(false);
                return;
            }
            int iL2 = y2Var.L();
            this.f49311a.O();
            if (C1804o.a()) {
                this.f49311a.O().a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + iL2);
            }
            a(maxAd);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j2, long j3, e eVar, C1802k c1802k, Context context) {
            this.f49311a = c1802k;
            this.f49312b = new WeakReference(context);
            this.f49313c = eVar;
            this.f49314d = cVar;
            this.f49315e = maxAdFormat;
            this.f49317g = map2;
            this.f49316f = map;
            this.f49318h = map3;
            this.f49320j = j2;
            this.f49321k = j3;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f49319i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f49319i = Math.min(2, ((Integer) c1802k.a(r3.h8)).intValue());
            } else {
                this.f49319i = ((Integer) c1802k.a(r3.h8)).intValue();
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            MaxError maxError2;
            this.f49313c.d(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f49320j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f49311a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f49321k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z2 = maxError2.getCode() == -5603 && n7.c(this.f49311a) && ((Boolean) this.f49311a.a(x4.A6)).booleanValue();
            if (this.f49311a.a(r3.i8, this.f49315e) && this.f49314d.f49324c < this.f49319i && !z2) {
                c.e(this.f49314d);
                final int iPow = (int) Math.pow(2.0d, this.f49314d.f49324c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.qz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49419n.a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f49314d.f49324c = 0;
            this.f49314d.f49323b.set(false);
            if (this.f49314d.f49325d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f49314d.f49322a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f49314d.f49325d, str, maxError2);
                this.f49314d.f49325d = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i2, String str) {
            this.f49317g.put("retry_delay_sec", Integer.valueOf(i2));
            this.f49317g.put("retry_attempt", Integer.valueOf(this.f49314d.f49324c));
            Context contextO = (Context) this.f49312b.get();
            if (contextO == null) {
                contextO = C1802k.o();
            }
            Context context = contextO;
            this.f49318h.put("art", EnumC1781i.EXPONENTIAL_RETRY.b());
            this.f49318h.put("era", Integer.valueOf(this.f49314d.f49324c));
            this.f49321k = System.currentTimeMillis();
            this.f49313c.a(str, this.f49315e, this.f49316f, this.f49317g, this.f49318h, context, this);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f49322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f49323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0704a f49325d;

        /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        private c(String str) {
            this.f49323b = new AtomicBoolean();
            this.f49322a = str;
        }

        static /* synthetic */ int e(c cVar) {
            int i2 = cVar.f49324c;
            cVar.f49324c = i2 + 1;
            return i2;
        }
    }

    private String b(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            str3 = "-" + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    private y2 f(String str) {
        synchronized (this.f49300e) {
            try {
                Queue queue = (Queue) this.f49299d.get(str);
                if (CollectionUtils.isEmpty(queue)) {
                    return null;
                }
                return (y2) queue.poll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Queue c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        y2 y2Var = (y2) this.f49301f.get(str);
        if (y2Var != null) {
            arrayDeque.add(y2Var);
        }
        synchronized (this.f49298c) {
            try {
                Queue queue = (Queue) this.f49299d.get(str);
                if (queue != null) {
                    arrayDeque.addAll(queue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayDeque;
    }

    public void d(String str) {
        synchronized (this.f49303h) {
            try {
                this.f49296a.O();
                if (C1804o.a()) {
                    this.f49296a.O().a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f49302g.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f49302g.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(String str) {
        boolean z2;
        synchronized (this.f49300e) {
            z2 = !CollectionUtils.isEmpty((Queue) this.f49299d.get(str));
        }
        return z2;
    }

    public e(C1802k c1802k) {
        this.f49296a = c1802k;
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f49303h) {
            try {
                Integer num = (Integer) this.f49302g.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, EnumC1781i enumC1781i, Map map, Map map2, Context context, a.InterfaceC0704a interfaceC0704a) {
        y2 y2VarF = (this.f49296a.s0().d() || n7.h(C1802k.o())) ? null : f(str);
        if (y2VarF != null) {
            y2VarF.i(str2);
            y2VarF.A().c().a(interfaceC0704a);
            interfaceC0704a.onAdLoaded(y2VarF);
            this.f49301f.put(str, y2VarF);
            if (y2VarF.O().endsWith("load")) {
                interfaceC0704a.onAdRevenuePaid(y2VarF);
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f49323b.compareAndSet(false, true)) {
            if (cVarA.f49325d != null && cVarA.f49325d != interfaceC0704a) {
                C1804o.j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f49325d = interfaceC0704a;
            return;
        }
        if (y2VarF == null) {
            cVarA.f49325d = interfaceC0704a;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", enumC1781i.b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f49296a, context, null));
    }

    public void c(String str, String str2) {
        synchronized (this.f49298c) {
            this.f49297b.remove(b(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0704a interfaceC0704a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f49296a.q0().a((AbstractRunnableC1782i5) new p5(a3Var, context, this.f49296a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0704a)), d6.b.MEDIATION);
    }

    private C1780h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f49296a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f49296a.Y();
            s3 s3Var = s3.f49914e;
            Map mapA = u3VarY.a(s3Var, t3.a(str));
            s3.a aVar = s3.a.SESSION;
            int iA = a(mapA, aVar);
            s3.a aVar2 = s3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f49296a.Y().a(s3Var, t3.a(maxAdFormat));
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
        synchronized (this.f49300e) {
            try {
                Queue arrayDeque = (Queue) this.f49299d.get(y2Var.getAdUnitId());
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.f49299d.put(y2Var.getAdUnitId(), arrayDeque);
                }
                arrayDeque.add(y2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f49298c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f49297b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f49297b.put(strB, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f49303h) {
            try {
                this.f49296a.O();
                if (C1804o.a()) {
                    this.f49296a.O().a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f49302g.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
