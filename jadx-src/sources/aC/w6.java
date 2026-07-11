package aC;

import GJW.DC;
import GJW.O;
import GJW.Pl;
import GJW.Zs;
import GJW.iF;
import GJW.lej;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 extends DC implements iF {
    public static final j J2 = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private n f12751O = new n(null, "Dispatchers.Main");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f12752t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    private static final class n {
        private volatile /* synthetic */ Object _value$volatile;
        private volatile /* synthetic */ Object exceptionWhenReading$volatile;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f12755n;
        private volatile /* synthetic */ Object reader$volatile;
        private volatile /* synthetic */ int readers$volatile;
        private volatile /* synthetic */ Object writer$volatile;
        private static final /* synthetic */ AtomicReferenceFieldUpdater rl = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "reader$volatile");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f12754t = AtomicIntegerFieldUpdater.newUpdater(n.class, "readers$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater nr = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "writer$volatile");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f12753O = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "exceptionWhenReading$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater J2 = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_value$volatile");

        private final IllegalStateException n(Throwable th) {
            return new IllegalStateException(this.f12755n + " is used concurrently with setting it", th);
        }

        public n(Object obj, String str) {
            this.f12755n = str;
            this._value$volatile = obj;
        }

        public final Object O() {
            rl.set(this, new Throwable("reader location"));
            f12754t.incrementAndGet(this);
            Throwable th = (Throwable) nr.get(this);
            if (th != null) {
                f12753O.set(this, n(th));
            }
            Object obj = J2.get(this);
            f12754t.decrementAndGet(this);
            return obj;
        }
    }

    private final lej Uf() {
        lej lejVar = (lej) this.f12751O.O();
        return lejVar == null ? f() : lejVar;
    }

    private final lej f() {
        return (lej) this.f12752t.getValue();
    }

    public w6(Function0 function0) {
        this.f12752t = LazyKt.lazy(function0);
    }

    private final iF p0N() {
        iF iFVar;
        ContinuationInterceptor continuationInterceptorUf = Uf();
        if (continuationInterceptorUf instanceof iF) {
            iFVar = (iF) continuationInterceptorUf;
        } else {
            iFVar = null;
        }
        if (iFVar == null) {
            return Zs.n();
        }
        return iFVar;
    }

    @Override // GJW.lej
    public boolean Org(CoroutineContext coroutineContext) {
        return Uf().Org(coroutineContext);
    }

    @Override // GJW.DC
    /* JADX INFO: renamed from: T3L */
    public DC p0N() {
        DC dc;
        DC dcP0N;
        lej lejVarUf = Uf();
        if (lejVarUf instanceof DC) {
            dc = (DC) lejVarUf;
        } else {
            dc = null;
        }
        if (dc != null && (dcP0N = dc.p0N()) != null) {
            return dcP0N;
        }
        return this;
    }

    @Override // GJW.iF
    public O U(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return p0N().U(j2, runnable, coroutineContext);
    }

    @Override // GJW.lej
    public void n1(CoroutineContext coroutineContext, Runnable runnable) {
        Uf().n1(coroutineContext, runnable);
    }

    @Override // GJW.lej
    public void qm(CoroutineContext coroutineContext, Runnable runnable) {
        Uf().qm(coroutineContext, runnable);
    }

    @Override // GJW.iF
    public void z(long j2, Pl pl) {
        p0N().z(j2, pl);
    }
}
