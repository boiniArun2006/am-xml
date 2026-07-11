package ln;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ln.C;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C implements Hh.qz {
    private final xfE.Ml J2;
    private final Map KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f70439O;
    private final xfE.Ml Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2270z f70440n;
    private final FSZ.l3D nr;
    private final fJf.Ew rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final eO f70441t;
    private final Lazy xMQ;

    public static final class j implements InterfaceC2269w6 {
        private final Lazy J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Lazy f70442O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Lazy f70443n;
        private final Lazy nr;
        private final Lazy rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Lazy f70444t;

        /* JADX INFO: Access modifiers changed from: private */
        public static final FSZ.Dsr HI(j this$0, C this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            xfE.C cAz = this$0.az();
            A72.fuX fuxXMQ = this$1.rl.xMQ(this$1.f70439O);
            Intrinsics.checkNotNullExpressionValue(fuxXMQ, "getPooledByteBufferFactory(...)");
            A72.C cMUb = this$1.rl.mUb();
            Intrinsics.checkNotNullExpressionValue(cMUb, "getPooledByteStreams(...)");
            Executor executorJ2 = this$1.f70441t.J2();
            Intrinsics.checkNotNullExpressionValue(executorJ2, "forLocalStorageRead(...)");
            Executor executorRl = this$1.f70441t.rl();
            Intrinsics.checkNotNullExpressionValue(executorRl, "forLocalStorageWrite(...)");
            return new FSZ.Dsr(cAz, fuxXMQ, cMUb, executorJ2, executorRl, this$1.nr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FSZ.Dsr Ik(j this$0, C this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            xfE.C cTy = this$0.ty();
            A72.fuX fuxXMQ = this$1.rl.xMQ(this$1.f70439O);
            Intrinsics.checkNotNullExpressionValue(fuxXMQ, "getPooledByteBufferFactory(...)");
            A72.C cMUb = this$1.rl.mUb();
            Intrinsics.checkNotNullExpressionValue(cMUb, "getPooledByteStreams(...)");
            Executor executorJ2 = this$1.f70441t.J2();
            Intrinsics.checkNotNullExpressionValue(executorJ2, "forLocalStorageRead(...)");
            Executor executorRl = this$1.f70441t.rl();
            Intrinsics.checkNotNullExpressionValue(executorRl, "forLocalStorageWrite(...)");
            return new FSZ.Dsr(cTy, fuxXMQ, cMUb, executorJ2, executorRl, this$1.nr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xfE.C ck(C this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f70440n.n(this$0.J2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map gh(C this$0, j this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Map map = this$0.KN;
            if (map == null) {
                return MapsKt.emptyMap();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), this$0.f70440n.n((xfE.Ml) entry.getValue()));
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Hh.CN3 mUb(j this$0, C this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Map mapQie = this$0.qie();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapQie.size()));
            for (Map.Entry entry : mapQie.entrySet()) {
                Object key = entry.getKey();
                xfE.C c2 = (xfE.C) entry.getValue();
                A72.fuX fuxXMQ = this$1.rl.xMQ(this$1.f70439O);
                Intrinsics.checkNotNullExpressionValue(fuxXMQ, "getPooledByteBufferFactory(...)");
                A72.C cMUb = this$1.rl.mUb();
                Intrinsics.checkNotNullExpressionValue(cMUb, "getPooledByteStreams(...)");
                Executor executorJ2 = this$1.f70441t.J2();
                Intrinsics.checkNotNullExpressionValue(executorJ2, "forLocalStorageRead(...)");
                Executor executorRl = this$1.f70441t.rl();
                Intrinsics.checkNotNullExpressionValue(executorRl, "forLocalStorageWrite(...)");
                linkedHashMap.put(key, new FSZ.Dsr(c2, fuxXMQ, cMUb, executorJ2, executorRl, this$1.nr));
            }
            return Hh.CN3.t(linkedHashMap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xfE.C r(C this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f70440n.n(this$0.Uo);
        }

        public xfE.C az() {
            return (xfE.C) this.f70443n.getValue();
        }

        @Override // ln.InterfaceC2269w6
        public FSZ.Dsr n() {
            return (FSZ.Dsr) this.nr.getValue();
        }

        public Map qie() {
            return (Map) this.f70442O.getValue();
        }

        @Override // ln.InterfaceC2269w6
        public FSZ.Dsr rl() {
            return (FSZ.Dsr) this.rl.getValue();
        }

        @Override // ln.InterfaceC2269w6
        public Hh.CN3 t() {
            Object value = this.J2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Hh.CN3) value;
        }

        public xfE.C ty() {
            return (xfE.C) this.f70444t.getValue();
        }

        j(final C c2) {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            this.f70443n = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: ln.I28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C.j.ck(c2);
                }
            });
            this.rl = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: ln.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C.j.HI(this.f70484n, c2);
                }
            });
            this.f70444t = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: ln.CN3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C.j.r(c2);
                }
            });
            this.nr = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: ln.fuX
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C.j.Ik(this.f70497n, c2);
                }
            });
            this.f70442O = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: ln.Dsr
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C.j.gh(c2, this);
                }
            });
            this.J2 = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: ln.aC
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C.j.mUb(this.f70487n, c2);
                }
            });
        }
    }

    public C(InterfaceC2270z fileCacheFactory, fJf.Ew poolFactory, eO executorSupplier, FSZ.l3D imageCacheStatsTracker, int i2, xfE.Ml mainDiskCacheConfig, xfE.Ml smallImageDiskCacheConfig, Map map) {
        Intrinsics.checkNotNullParameter(fileCacheFactory, "fileCacheFactory");
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(executorSupplier, "executorSupplier");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        Intrinsics.checkNotNullParameter(mainDiskCacheConfig, "mainDiskCacheConfig");
        Intrinsics.checkNotNullParameter(smallImageDiskCacheConfig, "smallImageDiskCacheConfig");
        this.f70440n = fileCacheFactory;
        this.rl = poolFactory;
        this.f70441t = executorSupplier;
        this.nr = imageCacheStatsTracker;
        this.f70439O = i2;
        this.J2 = mainDiskCacheConfig;
        this.Uo = smallImageDiskCacheConfig;
        this.KN = map;
        this.xMQ = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: ln.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C.mUb(this.f70467n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j mUb(C this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new j(this$0);
    }

    private final InterfaceC2269w6 qie() {
        return (InterfaceC2269w6) this.xMQ.getValue();
    }

    @Override // Hh.qz
    /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
    public InterfaceC2269w6 get() {
        return qie();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C(InterfaceC2270z fileCacheFactory, InterfaceC2265c config) {
        this(fileCacheFactory, config.Z(), config.X(), config.te(), config.XQ(), config.nr(), config.mUb(), config.xMQ());
        Intrinsics.checkNotNullParameter(fileCacheFactory, "fileCacheFactory");
        Intrinsics.checkNotNullParameter(config, "config");
    }
}
