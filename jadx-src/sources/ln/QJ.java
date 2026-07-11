package ln;

import com.facebook.imagepipeline.producers.KH;
import com.facebook.imagepipeline.producers.M5;
import com.facebook.imagepipeline.producers.l4Z;
import com.facebook.imagepipeline.request.j;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class QJ {
    private final FSZ.Q J2;
    private final FSZ.aC KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final jl.Ml f70473O;
    private final FSZ.Q Uo;
    private final InterfaceC2265c az;
    private final AtomicLong gh;
    private final Hh.qz mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Md f70474n;
    private final jl.I28 nr;
    private final Hh.qz qie;
    private final Hh.qz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Hh.qz f70475t;
    private final M5 xMQ;
    public static final j ty = new j(null);
    private static final CancellationException HI = new CancellationException("Prefetching is not enabled");
    private static final CancellationException ck = new CancellationException("ImageRequest is null");
    private static final CancellationException Ik = new CancellationException("Modified URL is null");

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    private final com.facebook.datasource.w6 J2(l4Z l4z, com.facebook.imagepipeline.request.j jVar, j.w6 w6Var, Object obj, jl.I28 i28, String str) {
        return Uo(l4z, jVar, w6Var, obj, i28, str, null);
    }

    private final com.facebook.datasource.w6 Uo(l4Z l4z, com.facebook.imagepipeline.request.j jVar, j.w6 w6Var, Object obj, jl.I28 i28, String str, Map map) {
        com.facebook.datasource.w6 w6VarRl;
        if (!T5.n.nr()) {
            com.facebook.imagepipeline.producers.nKK nkk = new com.facebook.imagepipeline.producers.nKK(O(jVar, i28), this.f70473O);
            try {
                j.w6 w6VarN = j.w6.n(jVar.qie(), w6Var);
                Intrinsics.checkNotNullExpressionValue(w6VarN, "getMax(...)");
                KH kh = new KH(jVar, rl(), str, nkk, obj, w6VarN, false, jVar.Ik() || !vn.I28.HI(jVar.WPU()), jVar.ck(), this.az);
                kh.FX(map);
                return vyd.n.X(l4z, kh, nkk);
            } catch (Exception e2) {
                return com.facebook.datasource.Ml.rl(e2);
            }
        }
        T5.n.n("ImagePipeline#submitFetchRequest");
        try {
            com.facebook.imagepipeline.producers.nKK nkk2 = new com.facebook.imagepipeline.producers.nKK(O(jVar, i28), this.f70473O);
            try {
                j.w6 w6VarN2 = j.w6.n(jVar.qie(), w6Var);
                Intrinsics.checkNotNullExpressionValue(w6VarN2, "getMax(...)");
                KH kh2 = new KH(jVar, rl(), str, nkk2, obj, w6VarN2, false, jVar.Ik() || !vn.I28.HI(jVar.WPU()), jVar.ck(), this.az);
                kh2.FX(map);
                w6VarRl = vyd.n.X(l4z, kh2, nkk2);
            } catch (Exception e3) {
                w6VarRl = com.facebook.datasource.Ml.rl(e3);
            }
            T5.n.rl();
            return w6VarRl;
        } catch (Throwable th) {
            T5.n.rl();
            throw th;
        }
    }

    public final jl.I28 O(com.facebook.imagepipeline.request.j jVar, jl.I28 i28) {
        if (jVar != null) {
            return i28 == null ? jVar.r() == null ? this.nr : new jl.w6(this.nr, jVar.r()) : jVar.r() == null ? new jl.w6(this.nr, i28) : new jl.w6(this.nr, i28, jVar.r());
        }
        throw new IllegalStateException("Required value was null.");
    }

    public QJ(Md producerSequenceFactory, Set requestListeners, Set requestListener2s, Hh.qz isPrefetchEnabledSupplier, FSZ.Q bitmapMemoryCache, FSZ.Q encodedMemoryCache, Hh.qz diskCachesStoreSupplier, FSZ.aC cacheKeyFactory, M5 threadHandoffProducerQueue, Hh.qz suppressBitmapPrefetchingSupplier, Hh.qz lazyDataSource, com.facebook.callercontext.j jVar, InterfaceC2265c config) {
        Intrinsics.checkNotNullParameter(producerSequenceFactory, "producerSequenceFactory");
        Intrinsics.checkNotNullParameter(requestListeners, "requestListeners");
        Intrinsics.checkNotNullParameter(requestListener2s, "requestListener2s");
        Intrinsics.checkNotNullParameter(isPrefetchEnabledSupplier, "isPrefetchEnabledSupplier");
        Intrinsics.checkNotNullParameter(bitmapMemoryCache, "bitmapMemoryCache");
        Intrinsics.checkNotNullParameter(encodedMemoryCache, "encodedMemoryCache");
        Intrinsics.checkNotNullParameter(diskCachesStoreSupplier, "diskCachesStoreSupplier");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(suppressBitmapPrefetchingSupplier, "suppressBitmapPrefetchingSupplier");
        Intrinsics.checkNotNullParameter(lazyDataSource, "lazyDataSource");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f70474n = producerSequenceFactory;
        this.rl = isPrefetchEnabledSupplier;
        this.f70475t = diskCachesStoreSupplier;
        this.nr = new jl.w6(requestListeners);
        this.f70473O = new jl.n(requestListener2s);
        this.gh = new AtomicLong();
        this.J2 = bitmapMemoryCache;
        this.Uo = encodedMemoryCache;
        this.KN = cacheKeyFactory;
        this.xMQ = threadHandoffProducerQueue;
        this.mUb = suppressBitmapPrefetchingSupplier;
        this.qie = lazyDataSource;
        this.az = config;
    }

    public final com.facebook.datasource.w6 n(com.facebook.imagepipeline.request.j jVar, Object obj, j.w6 w6Var, jl.I28 i28, String str) {
        if (jVar == null) {
            com.facebook.datasource.w6 w6VarRl = com.facebook.datasource.Ml.rl(new NullPointerException());
            Intrinsics.checkNotNullExpressionValue(w6VarRl, "immediateFailedDataSource(...)");
            return w6VarRl;
        }
        try {
            l4Z l4zE2 = this.f70474n.E2(jVar);
            if (w6Var == null) {
                w6Var = j.w6.FULL_FETCH;
            }
            return J2(l4zE2, jVar, w6Var, obj, i28, str);
        } catch (Exception e2) {
            return com.facebook.datasource.Ml.rl(e2);
        }
    }

    public final FSZ.aC nr() {
        return this.KN;
    }

    public final String rl() {
        return String.valueOf(this.gh.getAndIncrement());
    }

    public final FSZ.Q t() {
        return this.J2;
    }
}
