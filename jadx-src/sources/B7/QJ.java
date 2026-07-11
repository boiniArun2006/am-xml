package B7;

import Sbr.j;
import TFv.rv6;
import android.view.Surface;
import d2n.Ml;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class QJ {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f249n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f250t;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(continuation);
            jVar.f250t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f249n == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(QJ.nr((j.w6) this.f250t));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j.w6 w6Var, Continuation continuation) {
            return ((j) create(w6Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f251n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f252t;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(continuation);
            nVar.f252t = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f251n == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(QJ.Uo((j.w6) this.f252t));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j.w6 w6Var, Continuation continuation) {
            return ((n) create(w6Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final boolean J2(j.w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        if (!(w6Var instanceof j.w6.C0318j)) {
            return false;
        }
        j.w6.C0318j c0318j = (j.w6.C0318j) w6Var;
        return (c0318j.t() instanceof j.n.C0316j) && ((j.n.C0316j) c0318j.t()).t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object KN(rv6 rv6Var, Continuation continuation) {
        Object objNY = TFv.fuX.nY(rv6Var, new n(null), continuation);
        return objNY == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNY : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object O(rv6 rv6Var, Continuation continuation) {
        Object objNY = TFv.fuX.nY(rv6Var, new j(null), continuation);
        return objNY == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNY : Unit.INSTANCE;
    }

    public static final boolean Uo(j.w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        return w6Var instanceof j.w6.n;
    }

    public static final boolean nr(j.w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        return (w6Var instanceof j.w6.C0318j) && (((j.w6.C0318j) w6Var).t() instanceof j.n.C0316j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pl xMQ(j.w6 w6Var, Surface surface, int i2, long j2) {
        j.n nVarT;
        long j3;
        j.w6.C0318j c0318j = w6Var instanceof j.w6.C0318j ? (j.w6.C0318j) w6Var : null;
        if (c0318j == null || (nVarT = c0318j.t()) == null || !(nVarT instanceof j.n.C0316j)) {
            return null;
        }
        j.w6.C0318j c0318j2 = (j.w6.C0318j) w6Var;
        if (c0318j2.rl() == null) {
            return null;
        }
        long jN = d2n.I28.n(c0318j2.nr(), c0318j2.n().Uo());
        j.n.C0316j c0316j = (j.n.C0316j) nVarT;
        if (c0316j.t()) {
            double dMUb = mUb(jN, i2);
            Ml.j jVar = d2n.Ml.f63370t;
            double d2 = i2;
            long jO = jVar.O(dMUb / d2);
            long jO2 = jVar.O((dMUb + ((double) 1)) / d2);
            long jIk = ((d2n.Ml) RangesKt.coerceAtLeast(d2n.Ml.rl(jO), d2n.Ml.rl(j2))).Ik();
            nVar = d2n.CN3.nr(c0318j2.n().Uo(), jO2) ? new Z4.n(c0318j2.n().J2(), jO2, null) : null;
            j3 = jIk;
        } else {
            j3 = jN;
        }
        return new Pl(c0318j2.n(), c0318j2.rl(), j3, surface, new Oe.w6(c0316j.rl().t(), c0316j.rl().rl()), nVar, null);
    }

    private static final int mUb(long j2, int i2) {
        return (int) Math.floor(d2n.Ml.gh(j2) * ((double) i2));
    }
}
