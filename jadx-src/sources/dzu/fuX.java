package dzu;

import GJW.KH;
import GJW.Sis;
import GJW.Y5;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fuX extends Sis implements CoroutineStackFrame, Continuation {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f63564S = AtomicReferenceFieldUpdater.newUpdater(fuX.class, Object.class, "_reusableCancellableContinuation$volatile");
    public final GJW.lej J2;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final Object f63565Z;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f63566o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Continuation f63567r;

    public fuX(GJW.lej lejVar, Continuation continuation) {
        super(-1);
        this.J2 = lejVar;
        this.f63567r = continuation;
        this.f63566o = Dsr.f63548n;
        this.f63565Z = M.Uo(get$context());
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // GJW.Sis
    public Continuation t() {
        return this;
    }

    @Override // GJW.Sis
    public Object KN() {
        Object obj = this.f63566o;
        this.f63566o = Dsr.f63548n;
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f63567r;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public CoroutineContext get$context() {
        return this.f63567r.get$context();
    }

    public final void gh(CoroutineContext coroutineContext, Object obj) {
        this.f63566o = obj;
        this.f3453O = 1;
        this.J2.qm(coroutineContext, this);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.J2 + ", " + GJW.psW.t(this.f63567r) + ']';
    }

    private final GJW.eO qie() {
        Object obj = f63564S.get(this);
        if (obj instanceof GJW.eO) {
            return (GJW.eO) obj;
        }
        return null;
    }

    public final void Ik() {
        xMQ();
        GJW.eO eOVarQie = qie();
        if (eOVarQie != null) {
            eOVarQie.ck();
        }
    }

    public final Throwable Z(GJW.Pl pl) {
        nKK nkk;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63564S;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            nkk = Dsr.rl;
            if (obj != nkk) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.j.n(f63564S, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.j.n(f63564S, this, nkk, pl));
        return null;
    }

    public final boolean ck(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63564S;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            nKK nkk = Dsr.rl;
            if (Intrinsics.areEqual(obj, nkk)) {
                if (androidx.concurrent.futures.j.n(f63564S, this, nkk, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.j.n(f63564S, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final GJW.eO mUb() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63564S;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f63564S.set(this, Dsr.rl);
                return null;
            }
            if (obj instanceof GJW.eO) {
                if (androidx.concurrent.futures.j.n(f63564S, this, obj, Dsr.rl)) {
                    return (GJW.eO) obj;
                }
            } else if (obj != Dsr.rl && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        Object objRl = GJW.Ew.rl(obj);
        if (Dsr.nr(this.J2, get$context())) {
            this.f63566o = objRl;
            this.f3453O = 0;
            Dsr.t(this.J2, get$context(), this);
            return;
        }
        KH khRl = Y5.f3467n.rl();
        if (khRl.HBN()) {
            this.f63566o = objRl;
            this.f3453O = 0;
            khRl.Uf(this);
            return;
        }
        khRl.ub(true);
        try {
            CoroutineContext context = get$context();
            Object objXMQ = M.xMQ(context, this.f63565Z);
            try {
                this.f63567r.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                while (khRl.Zmq()) {
                }
            } finally {
                M.J2(context, objXMQ);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean ty() {
        if (f63564S.get(this) != null) {
            return true;
        }
        return false;
    }

    public final void xMQ() {
        while (f63564S.get(this) == Dsr.rl) {
        }
    }
}
