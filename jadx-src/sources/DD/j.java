package DD;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import yB.fuX;
import yB.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque f1398n = new ArrayDeque();
    private final fuX rl = o.n(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: DD.j$j, reason: collision with other inner class name */
    private static final class C0049j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f1399n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0049j) && Intrinsics.areEqual(this.f1399n, ((C0049j) obj).f1399n);
        }

        public int hashCode() {
            Object obj = this.f1399n;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final Object n() {
            return this.f1399n;
        }

        public String toString() {
            return "Closed(token=" + this.f1399n + ')';
        }

        public C0049j(Object obj) {
            this.f1399n = obj;
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f1401n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f1402t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1402t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.rl(this);
        }
    }

    public final void n(Object obj, boolean z2) {
        synchronized (this.f1398n) {
            try {
                if (!(this.f1398n.firstOrNull() instanceof C0049j)) {
                    if (z2) {
                        this.f1398n.clear();
                    }
                    if (!(this.f1398n.lastOrNull() instanceof C0049j)) {
                        this.f1398n.add(new C0049j(obj));
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.rl.release();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rl(Continuation continuation) {
        n nVar;
        j jVar;
        Object objFirst;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f1402t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            fuX fux = this.rl;
            nVar.f1401n = this;
            nVar.J2 = 1;
            if (fux.t(nVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) nVar.f1401n;
            ResultKt.throwOnFailure(obj);
        }
        synchronized (jVar.f1398n) {
            try {
                objFirst = jVar.f1398n.first();
                if (objFirst instanceof C0049j) {
                    jVar.rl.release();
                    objFirst = ((C0049j) objFirst).n();
                } else {
                    jVar.f1398n.removeFirst();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objFirst;
    }

    public final void t(Object obj) {
        synchronized (this.f1398n) {
            Object objLastOrNull = this.f1398n.lastOrNull();
            if (objLastOrNull instanceof C0049j) {
                throw new IllegalStateException(("The event bus is closed with value " + ((C0049j) objLastOrNull).n()).toString());
            }
            this.f1398n.add(obj);
        }
        this.rl.release();
    }
}
