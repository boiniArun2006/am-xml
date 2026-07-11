package TFv;

import GJW.xuv;
import TFv.Ln;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract /* synthetic */ class s4 {

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ r J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Wre f10469O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10470n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Object f10471r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ln f10472t;

        /* JADX INFO: renamed from: TFv.s4$j$j, reason: collision with other inner class name */
        static final class C0369j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f10473n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ int f10474t;

            C0369j(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0369j c0369j = new C0369j(continuation);
                c0369j.f10474t = ((Number) obj).intValue();
                return c0369j;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n(((Number) obj).intValue(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10473n == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f10474t > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    return Boxing.boxBoolean(z2);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object n(int i2, Continuation continuation) {
                return ((C0369j) create(Integer.valueOf(i2), continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        static final class n extends SuspendLambda implements Function2 {
            final /* synthetic */ r J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Wre f10475O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f10476n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Object f10477r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f10478t;

            /* JADX INFO: renamed from: TFv.s4$j$n$j, reason: collision with other inner class name */
            public /* synthetic */ class C0370j {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[u.values().length];
                    try {
                        iArr[u.f10480n.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[u.f10482t.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[u.f10479O.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(Wre wre, r rVar, Object obj, Continuation continuation) {
                super(2, continuation);
                this.f10475O = wre;
                this.J2 = rVar;
                this.f10477r = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                n nVar = new n(this.f10475O, this.J2, this.f10477r, continuation);
                nVar.f10478t = obj;
                return nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f10476n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    int i3 = C0370j.$EnumSwitchMapping$0[((u) this.f10478t).ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                Object obj2 = this.f10477r;
                                if (obj2 == nKK.f10461n) {
                                    this.J2.KN();
                                } else {
                                    Boxing.boxBoolean(this.J2.t(obj2));
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    } else {
                        Wre wre = this.f10475O;
                        r rVar = this.J2;
                        this.f10476n = 1;
                        if (wre.n(rVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(u uVar, Continuation continuation) {
                return ((n) create(uVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Ln ln2, Wre wre, r rVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f10472t = ln2;
            this.f10469O = wre;
            this.J2 = rVar;
            this.f10471r = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f10472t, this.f10469O, this.J2, this.f10471r, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r8.n(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r8.n(r1, r7) != r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (TFv.fuX.gh(r8, r1, r7) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f10470n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3 && i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Wre wre = this.f10469O;
                        r rVar = this.J2;
                        this.f10470n = 3;
                    }
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Ln ln2 = this.f10472t;
            Ln.j jVar = Ln.f10289n;
            if (ln2 == jVar.t()) {
                Wre wre2 = this.f10469O;
                r rVar2 = this.J2;
                this.f10470n = 1;
            } else {
                if (this.f10472t == jVar.nr()) {
                    rv6 rv6VarNr = this.J2.nr();
                    C0369j c0369j = new C0369j(null);
                    this.f10470n = 2;
                    if (fuX.nY(rv6VarNr, c0369j, this) != coroutine_suspended) {
                        Wre wre3 = this.f10469O;
                        r rVar3 = this.J2;
                        this.f10470n = 3;
                    }
                } else {
                    Wre wreIk = fuX.Ik(this.f10472t.n(this.J2.nr()));
                    n nVar = new n(this.f10469O, this.J2, this.f10471r, null);
                    this.f10470n = 4;
                }
                return coroutine_suspended;
            }
        }
    }

    public static final rv6 J2(Wre wre, GJW.vd vdVar, Ln ln2, Object obj) {
        qf qfVarT = t(wre, 1);
        SPz sPzN = Lu.n(obj);
        return new g9s(sPzN, nr(vdVar, qfVarT.nr, qfVarT.f10467n, sPzN, ln2, obj));
    }

    public static final Z O(Z z2, Function2 function2) {
        return new psW(z2, function2);
    }

    public static final Z n(r rVar) {
        return new ci(rVar, null);
    }

    private static final xuv nr(GJW.vd vdVar, CoroutineContext coroutineContext, Wre wre, r rVar, Ln ln2, Object obj) {
        return GJW.Dsr.t(vdVar, coroutineContext, Intrinsics.areEqual(ln2, Ln.f10289n.t()) ? GJW.h.f3486n : GJW.h.J2, new j(ln2, wre, rVar, obj, null));
    }

    public static final rv6 rl(SPz sPz) {
        return new g9s(sPz, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final qf t(Wre wre, int i2) {
        teV.Ml ml;
        Wre wreQie;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i2, ILs.CN3.Uo.n()) - i2;
        if (!(wre instanceof teV.Ml) || (wreQie = (ml = (teV.Ml) wre).qie()) == null) {
            return new qf(wre, iCoerceAtLeast, ILs.j.f4185n, EmptyCoroutineContext.INSTANCE);
        }
        int i3 = ml.f73609t;
        if (i3 != -3 && i3 != -2 && i3 != 0) {
            iCoerceAtLeast = i3;
        } else if (ml.f73607O == ILs.j.f4185n) {
            if (i3 == 0) {
                iCoerceAtLeast = 0;
            }
        } else if (i2 == 0) {
            iCoerceAtLeast = 1;
        }
        return new qf(wreQie, iCoerceAtLeast, ml.f73607O, ml.f73608n);
    }
}
