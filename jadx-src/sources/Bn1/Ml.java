package Bn1;

import B7.Xo;
import B7.s4;
import F6.w6;
import GJW.AbstractC1363t;
import GJW.yg;
import as.aC;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Ml {

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f606O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f607n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f608t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f608t = obj;
            this.f606O |= Integer.MIN_VALUE;
            return Ml.KN(null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ F6.j J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private /* synthetic */ Object f609O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f610n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ as.CN3 f611o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ F6.w6 f612r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f613t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(F6.j jVar, F6.w6 w6Var, as.CN3 cn3, Continuation continuation) {
            super(2, continuation);
            this.J2 = jVar;
            this.f612r = w6Var;
            this.f611o = cn3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.J2, this.f612r, this.f611o, continuation);
            nVar.f609O = obj;
            return nVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        
            if (r4.rl((as.n) r10, r9) != r0) goto L7;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0078 -> B:7:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            TFv.CN3 cn3;
            F6.j jVar;
            TFv.CN3 cn32;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f613t;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        jVar = (F6.j) this.f610n;
                        cn32 = (TFv.CN3) this.f609O;
                        ResultKt.throwOnFailure(obj);
                        cn3 = cn32;
                        if (!AbstractC1363t.ck(get$context()) && jVar != null) {
                            F6.j jVarAz = Ml.az(jVar, this.J2.O().t());
                            F6.w6 w6Var = this.f612r;
                            w6.j jVar2 = new w6.j(jVar, this.f611o, jVarAz);
                            this.f609O = cn3;
                            this.f610n = jVarAz;
                            this.f613t = 1;
                            Object objRl = w6Var.rl(jVar2, this);
                            if (objRl != coroutine_suspended) {
                                cn32 = cn3;
                                obj = objRl;
                                jVar = jVarAz;
                                this.f609O = cn32;
                                this.f610n = jVar;
                                this.f613t = 2;
                            }
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (F6.j) this.f610n;
                cn32 = (TFv.CN3) this.f609O;
                ResultKt.throwOnFailure(obj);
                this.f609O = cn32;
                this.f610n = jVar;
                this.f613t = 2;
            } else {
                ResultKt.throwOnFailure(obj);
                cn3 = (TFv.CN3) this.f609O;
                jVar = this.J2;
                if (!AbstractC1363t.ck(get$context())) {
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((n) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object KN(s4 s4Var, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f606O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f606O = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f608t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f606O;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s4Var = (s4) jVar.f607n;
        }
        ResultKt.throwOnFailure(obj);
        while (d2n.j.r(s4Var.rl())) {
            jVar.f607n = s4Var;
            jVar.f606O = 1;
            if (yg.rl(1L, jVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F6.j az(F6.j jVar, long j2) {
        d2n.Wre wreJ2 = d2n.CN3.J2(d2n.Wre.nr.t(jVar.O().nr(), j2), jVar.nr().Uo());
        if (wreJ2 == null) {
            return null;
        }
        return F6.j.rl(jVar, null, wreJ2, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xo mUb(long j2, long j3) {
        return new Xo(j2, j3, j3, j3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TFv.Wre qie(F6.w6 w6Var, F6.j jVar, as.CN3 cn3) {
        return TFv.fuX.iF(new n(jVar, w6Var, cn3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long gh(s4 s4Var, long j2) {
        return d2n.Ml.HI(j2, bK.j.O(s4Var.rl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w6.j ty(B7.j jVar, long j2, as.CN3 cn3) {
        F6.j jVarT;
        long jWPU = ((d2n.j) RangesKt.coerceAtMost(d2n.j.rl(B7.n.rl(jVar)), d2n.j.rl(j2))).WPU();
        if (d2n.j.nr(jWPU, aC.rl(as.Ml.t(1), cn3.t())) < 0 || (jVarT = B7.n.t(jVar, jWPU)) == null) {
            return null;
        }
        return new w6.j(jVarT, cn3, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xo xMQ(s4 s4Var, long j2, long j3) {
        return new Xo(j2, gh(s4Var, j3), d2n.Ml.f63370t.J2(), d2n.Ml.HI(j3, bK.j.O(s4Var.nr())), null);
    }
}
