package FXi;

import FXi.s4;
import GJW.vd;
import androidx.view.ViewModelKt;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: FXi.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class C1350c extends R7M.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final kHp.w6 f2643O;
    private final Pr.w6 nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final K0.n f2644t;

    /* JADX INFO: renamed from: FXi.c$I28 */
    static final class I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2645n;

        I28(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C1350c.this.new I28(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2645n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                K0.n nVar = C1350c.this.f2644t;
                this.f2645n = 1;
                obj = nVar.n(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new s4.j.w6(((Ds.w6) obj).n());
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: FXi.c$Ml */
    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2647n;

        Ml(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C1350c.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f2647n == 0) {
                ResultKt.throwOnFailure(obj);
                C1350c.this.f2643O.J2();
                return s4.j.n.f2699n;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: FXi.c$Wre */
    static final class Wre extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f2649O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f2650S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2652n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f2653o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f2654r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f2655t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2653o = obj;
            this.f2650S |= Integer.MIN_VALUE;
            return C1350c.this.Ik(null, this);
        }
    }

    /* JADX INFO: renamed from: FXi.c$j */
    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ C1350c f2656O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2657n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f2658t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function1 function1, C1350c c1350c, Continuation continuation) {
            super(2, continuation);
            this.f2658t = function1;
            this.f2656O = c1350c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f2658t, this.f2656O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2657n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.f2658t;
                this.f2657n = 1;
                obj = function1.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C1350c c1350c = this.f2656O;
            c1350c.nr(C1350c.O(c1350c).n(false, (s4.j) obj));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: FXi.c$n */
    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2659n;

        n(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C1350c.this.new n(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r5.Ik(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2659n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return s4.j.C0090j.f2698n;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                C1350c.this.f2643O.nr();
                Pr.w6 w6Var = C1350c.this.nr;
                this.f2659n = 1;
                if (w6Var.rl(true, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            C1350c c1350c = C1350c.this;
            kHp.n nVar = kHp.n.f69821t;
            this.f2659n = 2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: FXi.c$w6 */
    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2661n;

        w6(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C1350c.this.new w6(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        
            if (r8.Ik(r1, r7) != r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        
            if (r8.Ik(r1, r7) == r0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2661n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj);
                                if (C1350c.this.f2644t.J2()) {
                                    C1350c c1350c = C1350c.this;
                                    kHp.n nVar = kHp.n.J2;
                                    this.f2661n = 5;
                                }
                                return s4.j.C0090j.f2698n;
                            }
                        }
                        ResultKt.throwOnFailure(obj);
                        return s4.j.C0090j.f2698n;
                    }
                    ResultKt.throwOnFailure(obj);
                    C1350c c1350c2 = C1350c.this;
                    kHp.n nVar2 = kHp.n.J2;
                    this.f2661n = 3;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C1350c.this.f2643O.O();
                Pr.w6 w6Var = C1350c.this.nr;
                this.f2661n = 1;
                obj = w6Var.n(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                Pr.w6 w6Var2 = C1350c.this.nr;
                this.f2661n = 2;
                if (w6Var2.rl(false, this) != coroutine_suspended) {
                    C1350c c1350c22 = C1350c.this;
                    kHp.n nVar22 = kHp.n.J2;
                    this.f2661n = 3;
                }
            } else {
                Pr.w6 w6Var3 = C1350c.this.nr;
                this.f2661n = 4;
                if (w6Var3.O(this) != coroutine_suspended) {
                    if (C1350c.this.f2644t.J2()) {
                    }
                    return s4.j.C0090j.f2698n;
                }
            }
            return coroutine_suspended;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350c(K0.n legal, Function2 trackEvent) {
        super(new s4(false, null, 3, null));
        Intrinsics.checkNotNullParameter(legal, "legal");
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        this.f2644t = legal;
        this.nr = legal.Uo();
        kHp.w6 w6Var = new kHp.w6(trackEvent, legal.J2());
        this.f2643O = w6Var;
        w6Var.Uo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ik(kHp.n nVar, Continuation continuation) {
        Wre wre;
        C1350c c1350c;
        kHp.n nVar2;
        String str;
        kHp.n nVar3;
        Object objT;
        String str2;
        C1350c c1350c2;
        kHp.w6 w6Var;
        kHp.n nVar4;
        String str3;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.f2650S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.f2650S = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object objN = wre.f2653o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.f2650S;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            K0.n nVar5 = this.f2644t;
            wre.f2652n = this;
            wre.f2655t = nVar;
            wre.f2650S = 1;
            objN = nVar5.n(wre);
            if (objN != coroutine_suspended) {
                c1350c = this;
                nVar2 = nVar;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w6Var = (kHp.w6) wre.f2654r;
                String str4 = (String) wre.J2;
                String str5 = (String) wre.f2649O;
                kHp.n nVar6 = (kHp.n) wre.f2655t;
                c1350c2 = (C1350c) wre.f2652n;
                ResultKt.throwOnFailure(objN);
                str2 = str4;
                nVar4 = nVar6;
                str3 = str5;
                w6Var.n((Map) objN, c1350c2.nr.KN(), str3, str2, nVar4, true);
                return Unit.INSTANCE;
            }
            str = (String) wre.f2649O;
            nVar3 = (kHp.n) wre.f2655t;
            c1350c = (C1350c) wre.f2652n;
            ResultKt.throwOnFailure(objN);
            String strRl = ((Ds.Ml) objN).rl();
            kHp.w6 w6Var2 = c1350c.f2643O;
            Pr.w6 w6Var3 = c1350c.nr;
            wre.f2652n = c1350c;
            wre.f2655t = nVar3;
            wre.f2649O = str;
            wre.J2 = strRl;
            wre.f2654r = w6Var2;
            wre.f2650S = 3;
            objT = w6Var3.t(wre);
            if (objT != coroutine_suspended) {
                C1350c c1350c3 = c1350c;
                str2 = strRl;
                objN = objT;
                c1350c2 = c1350c3;
                w6Var = w6Var2;
                nVar4 = nVar3;
                str3 = str;
                w6Var.n((Map) objN, c1350c2.nr.KN(), str3, str2, nVar4, true);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        nVar2 = (kHp.n) wre.f2655t;
        c1350c = (C1350c) wre.f2652n;
        ResultKt.throwOnFailure(objN);
        String strRl2 = ((Ds.w6) objN).rl();
        K0.n nVar7 = c1350c.f2644t;
        wre.f2652n = c1350c;
        wre.f2655t = nVar2;
        wre.f2649O = strRl2;
        wre.f2650S = 2;
        Object objO = nVar7.O(wre);
        if (objO != coroutine_suspended) {
            kHp.n nVar8 = nVar2;
            str = strRl2;
            objN = objO;
            nVar3 = nVar8;
            String strRl3 = ((Ds.Ml) objN).rl();
            kHp.w6 w6Var22 = c1350c.f2643O;
            Pr.w6 w6Var32 = c1350c.nr;
            wre.f2652n = c1350c;
            wre.f2655t = nVar3;
            wre.f2649O = str;
            wre.J2 = strRl3;
            wre.f2654r = w6Var22;
            wre.f2650S = 3;
            objT = w6Var32.t(wre);
            if (objT != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    public final void HI() {
        gh(new I28(null));
    }

    public final void az() {
        gh(new w6(null));
    }

    public final void qie() {
        gh(new n(null));
    }

    public final void ty() {
        gh(new Ml(null));
    }

    public static final /* synthetic */ s4 O(C1350c c1350c) {
        return (s4) c1350c.rl();
    }

    private final void gh(Function1 function1) {
        if (((s4) rl()).nr()) {
            return;
        }
        nr(s4.rl((s4) rl(), true, null, 2, null));
        GJW.C.nr(ViewModelKt.n(this), null, null, new j(function1, this, null), 3, null);
    }

    public final void ck() {
        nr(s4.rl((s4) rl(), false, null, 1, null));
    }
}
