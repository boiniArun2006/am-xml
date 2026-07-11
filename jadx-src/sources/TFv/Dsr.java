package TFv;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract /* synthetic */ class Dsr {

    public static final class j implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Sequence f10252n;

        /* JADX INFO: renamed from: TFv.Dsr$j$j, reason: collision with other inner class name */
        public static final class C0360j extends ContinuationImpl {
            Object J2;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f10254n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f10255r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f10256t;

            public C0360j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10254n = obj;
                this.f10256t |= Integer.MIN_VALUE;
                return j.this.n(null, this);
            }
        }

        public j(Sequence sequence) {
            this.f10252n = sequence;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.Wre
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(CN3 cn3, Continuation continuation) {
            C0360j c0360j;
            CN3 cn32;
            Iterator it;
            if (continuation instanceof C0360j) {
                c0360j = (C0360j) continuation;
                int i2 = c0360j.f10256t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0360j.f10256t = i2 - Integer.MIN_VALUE;
                } else {
                    c0360j = new C0360j(continuation);
                }
            }
            Object obj = c0360j.f10254n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = c0360j.f10256t;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                cn32 = cn3;
                it = this.f10252n.iterator();
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c0360j.f10255r;
                CN3 cn33 = (CN3) c0360j.J2;
                ResultKt.throwOnFailure(obj);
                cn32 = cn33;
            }
            while (it.hasNext()) {
                Object next = it.next();
                c0360j.J2 = cn32;
                c0360j.f10255r = it;
                c0360j.f10256t = 1;
                if (cn32.rl(next, c0360j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class n implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f10257n;

        public n(Object obj) {
            this.f10257n = obj;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objRl = cn3.rl(this.f10257n, continuation);
            return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
        }
    }

    public static final Wre O(Object obj) {
        return new n(obj);
    }

    public static final Wre n(Sequence sequence) {
        return new j(sequence);
    }

    public static final Wre nr(Function2 function2) {
        return new afx(function2);
    }

    public static final Wre rl(Function2 function2) {
        return new TFv.n(function2, null, 0, null, 14, null);
    }

    public static final Wre t(Function2 function2) {
        return new Ml(function2, null, 0, null, 14, null);
    }
}
