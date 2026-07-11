package p5A;

import GJW.AbstractC1363t;
import GJW.Dsr;
import GJW.Lu;
import GJW.V1;
import GJW.vd;
import GJW.xuv;
import ILs.C;
import ILs.CN3;
import ILs.aC;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sJa.I28;
import sJa.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n implements I28 {
    private AtomicBoolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final vd f71601O;
    private xuv Uo;
    private final CN3 nr;
    private final q3M.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I28.j f71602t;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71604n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f71605t;

        /* JADX INFO: renamed from: p5A.n$j$j, reason: collision with other inner class name */
        static final class C1090j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f71606n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ n f71607t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1090j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1090j(n nVar, Continuation continuation) {
                super(2, continuation);
                this.f71607t = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1090j(this.f71607t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f71606n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                I28.j jVar = this.f71607t.f71602t;
                this.f71606n = 1;
                Object objN = jVar.n(this);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objN;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = n.this.new j(continuation);
            jVar.f71605t = obj;
            return jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
        
            if (r10.KN(r9) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
        
            if (GJW.yg.rl(r5, r9) == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006a -> B:24:0x006d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0089 -> B:24:0x006d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vd vdVar;
            vd vdVar2;
            I28.w6 w6Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71604n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vdVar2 = (vd) this.f71605t;
                    ResultKt.throwOnFailure(obj);
                    vdVar = vdVar2;
                    if (!Lu.KN(vdVar)) {
                        V1 v1 = V1.f3456n;
                        C1090j c1090j = new C1090j(n.this, null);
                        this.f71605t = vdVar;
                        this.f71604n = 1;
                        Object objUo = Dsr.Uo(v1, c1090j, this);
                        if (objUo != coroutine_suspended) {
                            vdVar2 = vdVar;
                            obj = objUo;
                            n nVar = n.this;
                            w6Var = (I28.w6) obj;
                            if (w6Var instanceof I28.w6.n) {
                                nVar.rl.reset();
                                CN3 cn3 = nVar.nr;
                                this.f71605t = vdVar2;
                                this.f71604n = 2;
                            } else if (w6Var instanceof I28.w6.C1165w6) {
                                long jN = nVar.rl.n(((I28.w6.C1165w6) w6Var).n());
                                this.f71605t = vdVar2;
                                this.f71604n = 3;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!Lu.KN(vdVar)) {
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                } else {
                    vdVar2 = (vd) this.f71605t;
                    ResultKt.throwOnFailure(obj);
                    n nVar2 = n.this;
                    w6Var = (I28.w6) obj;
                    if (w6Var instanceof I28.w6.n) {
                    }
                    if (!Lu.KN(vdVar)) {
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vdVar = (vd) this.f71605t;
                if (!Lu.KN(vdVar)) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: p5A.n$n, reason: collision with other inner class name */
    static final class C1091n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71609n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f71610t;

        C1091n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71610t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.n(this);
        }
    }

    public n(q3M.n delayProvider, Ml dispatcherProvider, I28.j codeBlock) {
        Intrinsics.checkNotNullParameter(delayProvider, "delayProvider");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(codeBlock, "codeBlock");
        this.rl = delayProvider;
        this.f71602t = codeBlock;
        this.nr = aC.rl(1, null, null, 6, null);
        this.f71601O = Lu.n(dispatcherProvider.t());
        this.J2 = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sJa.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        C1091n c1091n;
        n nVar;
        if (continuation instanceof C1091n) {
            c1091n = (C1091n) continuation;
            int i2 = c1091n.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1091n.J2 = i2 - Integer.MIN_VALUE;
            } else {
                c1091n = new C1091n(continuation);
            }
        }
        Object obj = c1091n.f71610t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c1091n.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.J2.set(false);
            this.nr.nr(Unit.INSTANCE);
            xuv xuvVar = this.Uo;
            if (xuvVar != null) {
                c1091n.f71609n = this;
                c1091n.J2 = 1;
                if (AbstractC1363t.Uo(xuvVar, c1091n) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            nVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (n) c1091n.f71609n;
            ResultKt.throwOnFailure(obj);
        }
        nVar.Uo = null;
        return Unit.INSTANCE;
    }

    @Override // sJa.I28
    public void start() {
        if (this.J2.getAndSet(true)) {
            C.rl(this.nr.nr(Unit.INSTANCE));
        } else {
            this.Uo = GJW.C.nr(this.f71601O, null, null, new j(null), 3, null);
        }
    }
}
