package Fw3;

import LQ.fuX;
import LQ.j;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mF.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class qz implements C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6.InterfaceC1054w6 f3344n;
    private final RK.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f3345t;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3347n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f3348t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3348t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return qz.this.rl(this);
        }
    }

    static final class n extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f3349O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3350n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f3351o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3353t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f3351o |= Integer.MIN_VALUE;
            return qz.this.KN(0L, false, this);
        }
    }

    public static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ LQ.CN3 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ LQ.n f3354O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3355n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f3356t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(LQ.n nVar, Continuation continuation, LQ.CN3 cn3) {
            super(2, continuation);
            this.f3354O = nVar;
            this.J2 = cn3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = new w6(this.f3354O, continuation, this.J2);
            w6Var.f3356t = obj;
            return w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3355n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f3356t;
                LQ.n nVar = this.f3354O;
                this.f3356t = cn3;
                this.f3355n = 1;
                obj = nVar.n(cn3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            LQ.j jVar = (LQ.j) obj;
            if (!(jVar instanceof j.n)) {
                boolean z2 = jVar instanceof j.w6;
                return Unit.INSTANCE;
            }
            this.J2.n(new Xo((uPp.o) ((j.n) jVar).n()));
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((w6) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public qz(w6.InterfaceC1054w6 resource, RK.n renderer) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.f3344n = resource;
        this.rl = renderer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [long] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // Fw3.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KN(long j2, boolean z2, Continuation continuation) throws fuX.j {
        n nVar;
        qz qzVar;
        Object nVar2;
        LQ.fuX fux;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f3351o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f3351o = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f3351o;
        try {
        } catch (fuX.j e2) {
            e = e2;
        }
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            LQ.fuX fux2 = new LQ.fuX();
            try {
            } catch (fuX.j e3) {
                e = e3;
                qzVar = this;
                j2 = fux2;
                if (e.rl() != j2) {
                    throw e;
                }
                nVar2 = new j.n(e.n());
            }
            if (this.f3345t) {
                throw new IllegalStateException("Trying to render more frames on a failed TextureFrameRenderer");
            }
            RK.n nVar3 = this.rl;
            TFv.Wre wreIF = TFv.fuX.iF(new w6(nVar3.Ik(d2n.I28.n(j2, nVar3.o())), null, fux2));
            nVar.f3350n = this;
            nVar.f3353t = fux2;
            nVar.f3349O = z2;
            nVar.f3351o = 1;
            Object objX = TFv.fuX.X(wreIF, nVar);
            if (objX != coroutine_suspended) {
                obj = objX;
                fux = fux2;
                qzVar = this;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                LQ.j jVar = (LQ.j) nVar.f3350n;
                ResultKt.throwOnFailure(obj);
                return jVar;
            }
            LQ.fuX fux3 = (LQ.fuX) nVar.f3353t;
            qzVar = (qz) nVar.f3350n;
            ResultKt.throwOnFailure(obj);
            j2 = fux3;
            nVar2 = new j.w6(Unit.INSTANCE);
            if (nVar2 instanceof j.n) {
                boolean z3 = nVar2 instanceof j.w6;
                return nVar2;
            }
            qzVar.f3345t = true;
            w6.InterfaceC1054w6 interfaceC1054w6S = qzVar.S();
            nVar.f3350n = nVar2;
            nVar.f3353t = null;
            nVar.f3351o = 3;
            return interfaceC1054w6S.rl(nVar) == coroutine_suspended ? coroutine_suspended : nVar2;
        }
        z2 = nVar.f3349O;
        LQ.fuX fux4 = (LQ.fuX) nVar.f3353t;
        qzVar = (qz) nVar.f3350n;
        ResultKt.throwOnFailure(obj);
        fux = fux4;
        RK.j jVar2 = (RK.j) obj;
        j2 = fux;
        j2 = fux;
        if (z2 && jVar2 != null) {
            w6.InterfaceC1054w6 interfaceC1054w6S2 = qzVar.S();
            long jT2 = d2n.Ml.f63370t.t(jVar2.rl());
            Oe.w6 w6VarN = jVar2.n();
            nVar.f3350n = qzVar;
            nVar.f3353t = fux;
            nVar.f3351o = 2;
            j2 = fux;
            if (interfaceC1054w6S2.O(jT2, w6VarN, nVar) == coroutine_suspended) {
            }
        }
        nVar2 = new j.w6(Unit.INSTANCE);
        if (nVar2 instanceof j.n) {
        }
    }

    @Override // Fw3.C
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public w6.InterfaceC1054w6 S() {
        return this.f3344n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r6.rl(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // w9.aC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Continuation continuation) {
        j jVar;
        qz qzVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f3348t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f3345t) {
                return Unit.INSTANCE;
            }
            w6.InterfaceC1054w6 interfaceC1054w6S = S();
            jVar.f3347n = this;
            jVar.J2 = 1;
            if (interfaceC1054w6S.rl(jVar) != coroutine_suspended) {
                qzVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        qzVar = (qz) jVar.f3347n;
        ResultKt.throwOnFailure(obj);
        RK.n nVar = qzVar.rl;
        jVar.f3347n = null;
        jVar.J2 = 2;
    }
}
