package B7;

import F6.w6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C implements F6.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final F6.w6 f222n;
    private aC rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final yB.j f223t;

    static final class Ml extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f224O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f225n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f226o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f228t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f226o |= Integer.MIN_VALUE;
            return C.this.J2(null, this);
        }
    }

    static final class j extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f229O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f230n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f231o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f233t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f231o |= Integer.MIN_VALUE;
            return C.this.rl(null, this);
        }
    }

    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f234O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f235n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f236r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f237t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f234O = obj;
            this.f236r |= Integer.MIN_VALUE;
            return C.this.n(this);
        }
    }

    static final class w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f238O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f239n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f240r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f241t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f238O = obj;
            this.f240r |= Integer.MIN_VALUE;
            return C.this.O(null, this);
        }
    }

    public C(F6.w6 audioProcessingPipeline) {
        Intrinsics.checkNotNullParameter(audioProcessingPipeline, "audioProcessingPipeline");
        this.f222n = audioProcessingPipeline;
        this.f223t = yB.CN3.rl(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J2(w6.j jVar, Continuation continuation) {
        Ml ml;
        aC aCVar;
        d2n.Wre wre;
        d2n.Wre wre2;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f226o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f226o = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object obj = ml.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f226o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            aC aCVar2 = this.rl;
            if (aCVar2 == null) {
                F6.w6 w6Var = this.f222n;
                ml.f226o = 1;
                Object objRl = w6Var.rl(jVar, ml);
                if (objRl != coroutine_suspended) {
                    return objRl;
                }
            } else {
                F6.j jVarT = jVar.t();
                d2n.Wre wreO = jVarT.O();
                d2n.Wre wreO2 = o.O(aCVar2, wreO);
                if (wreO2 == null) {
                    return o.nr(aCVar2, wreO);
                }
                F6.w6 w6Var2 = this.f222n;
                w6.j jVarRl = w6.j.rl(jVar, F6.j.rl(jVarT, null, wreO2, 1, null), null, null, 6, null);
                ml.f225n = aCVar2;
                ml.f228t = wreO;
                ml.f224O = wreO2;
                ml.f226o = 2;
                Object objRl2 = w6Var2.rl(jVarRl, ml);
                if (objRl2 != coroutine_suspended) {
                    aCVar = aCVar2;
                    obj = objRl2;
                    wre = wreO;
                    wre2 = wreO2;
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wre2 = (d2n.Wre) ml.f224O;
        wre = (d2n.Wre) ml.f228t;
        aCVar = (aC) ml.f225n;
        ResultKt.throwOnFailure(obj);
        as.n nVar = (as.n) obj;
        if (Intrinsics.areEqual(wre2, wre)) {
            return nVar;
        }
        as.n nVarN = as.w6.n(o.nr(aCVar, (d2n.Wre) CollectionsKt.first(wre.J2(wre2))), nVar);
        o.J2(nVarN, wre);
        return nVarN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(w6.j jVar, Continuation continuation) {
        w6 w6Var;
        F6.j jVar2;
        C c2;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f240r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f240r = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object obj = w6Var.f238O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f240r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            F6.j jVarT = jVar.t();
            aC aCVar = this.rl;
            if (aCVar != null) {
                if (!F6.n.rl(jVar.t(), aCVar.rl())) {
                    this.rl = null;
                }
                if (F6.n.n(aCVar.rl(), jVarT)) {
                    return Unit.INSTANCE;
                }
            }
            w6Var.f239n = this;
            w6Var.f241t = jVarT;
            w6Var.f240r = 1;
            Object objJ2 = J2(jVar, w6Var);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objJ2;
            jVar2 = jVarT;
            c2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar2 = (F6.j) w6Var.f241t;
            c2 = (C) w6Var.f239n;
            ResultKt.throwOnFailure(obj);
        }
        c2.rl = new aC(jVar2, (as.n) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // F6.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) throws Throwable {
        n nVar;
        yB.j jVar;
        C c2;
        yB.j jVar2;
        Throwable th;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f236r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f236r = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f234O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f236r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = this.f223t;
                nVar.f235n = this;
                nVar.f237t = jVar;
                nVar.f236r = 1;
                if (jVar.Z(null, nVar) != coroutine_suspended) {
                    c2 = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar2 = (yB.j) nVar.f235n;
                try {
                    ResultKt.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                    jVar2.T(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    jVar2.T(null);
                    throw th;
                }
            }
            yB.j jVar3 = (yB.j) nVar.f237t;
            c2 = (C) nVar.f235n;
            ResultKt.throwOnFailure(obj);
            jVar = jVar3;
            c2.rl = null;
            F6.w6 w6Var = c2.f222n;
            nVar.f235n = jVar;
            nVar.f237t = null;
            nVar.f236r = 2;
            if (w6Var.n(nVar) != coroutine_suspended) {
                jVar2 = jVar;
                Unit unit2 = Unit.INSTANCE;
                jVar2.T(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            jVar2 = jVar;
            th = th3;
            jVar2.T(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0035, B:28:0x007c, B:30:0x0080, B:33:0x0090, B:34:0x0097), top: B:41:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0035, B:28:0x007c, B:30:0x0080, B:33:0x0090, B:34:0x0097), top: B:41:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // F6.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(w6.j jVar, Continuation continuation) throws Throwable {
        j jVar2;
        yB.j jVar3;
        C c2;
        Throwable th;
        yB.j jVar4;
        w6.j jVar5;
        C c4;
        aC aCVar;
        if (continuation instanceof j) {
            jVar2 = (j) continuation;
            int i2 = jVar2.f231o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar2.f231o = i2 - Integer.MIN_VALUE;
            } else {
                jVar2 = new j(continuation);
            }
        }
        Object obj = jVar2.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar2.f231o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar3 = this.f223t;
                jVar2.f230n = this;
                jVar2.f233t = jVar;
                jVar2.f229O = jVar3;
                jVar2.f231o = 1;
                if (jVar3.Z(null, jVar2) != coroutine_suspended) {
                    c2 = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar4 = (yB.j) jVar2.f229O;
                jVar5 = (w6.j) jVar2.f233t;
                c4 = (C) jVar2.f230n;
                try {
                    ResultKt.throwOnFailure(obj);
                    aCVar = c4.rl;
                    if (aCVar != null) {
                        throw new IllegalStateException("Buffered data must not be null at this point");
                    }
                    as.n nVarNr = o.nr(aCVar, jVar5.t().O());
                    jVar4.T(null);
                    return nVarNr;
                } catch (Throwable th2) {
                    th = th2;
                    jVar4.T(null);
                    throw th;
                }
            }
            yB.j jVar6 = (yB.j) jVar2.f229O;
            w6.j jVar7 = (w6.j) jVar2.f233t;
            c2 = (C) jVar2.f230n;
            ResultKt.throwOnFailure(obj);
            jVar3 = jVar6;
            jVar = jVar7;
            jVar2.f230n = c2;
            jVar2.f233t = jVar;
            jVar2.f229O = jVar3;
            jVar2.f231o = 2;
            if (c2.O(jVar, jVar2) != coroutine_suspended) {
                jVar5 = jVar;
                jVar4 = jVar3;
                c4 = c2;
                aCVar = c4.rl;
                if (aCVar != null) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            yB.j jVar8 = jVar3;
            th = th3;
            jVar4 = jVar8;
            jVar4.T(null);
            throw th;
        }
    }
}
