package xAo;

import QmE.iF;
import QmE.j;
import ScC.n;
import ScC.w6;
import android.util.Log;
import androidx.view.ComponentActivity;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwnerKt;
import androidx.view.RepeatOnLifecycleKt;
import cS.Zv.SzFNXybiSxdx;
import f.AbstractC1974Dsr;
import f.C1972C;
import f.C1983fuX;
import f.C1985n;
import f.C1989z;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import sqD.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class I28 {
    private final NuI.w6 J2;
    private final NuI.CN3 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final nYs.Ml f75229O;
    private final NuI.I28 Uo;
    private GJW.r az;
    private final xAo.n gh;
    private final Zzk.j mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final sqD.n f75230n;
    private final Q.Xo nr;
    private ComponentActivity qie;
    private final iF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final kgE.fuX f75231t;
    private final WK.n xMQ;
    public static final j ty = new j(null);
    public static final int HI = 8;

    /* JADX INFO: renamed from: xAo.I28$I28, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class C1267I28 extends SuspendLambda implements Function2 {
        final /* synthetic */ ComponentActivity J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ I28 f75232O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75233n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f75234t;

        /* JADX INFO: renamed from: xAo.I28$I28$j */
        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ ComponentActivity J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ ComponentActivity f75235O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f75236n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28 f75237t;

            /* JADX INFO: renamed from: xAo.I28$I28$j$j, reason: collision with other inner class name */
            static final class C1268j implements TFv.CN3 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ I28 f75238O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ ComponentActivity f75239n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ ComponentActivity f75240t;

                /* JADX INFO: renamed from: xAo.I28$I28$j$j$j, reason: collision with other inner class name */
                static final class C1269j extends SuspendLambda implements Function2 {
                    final /* synthetic */ I28 J2;

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ ComponentActivity f75241O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f75242n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ sqD.w6 f75243t;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                        return ((C1269j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1269j(sqD.w6 w6Var, ComponentActivity componentActivity, I28 i28, Continuation continuation) {
                        super(2, continuation);
                        this.f75243t = w6Var;
                        this.f75241O = componentActivity;
                        this.J2 = i28;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C1269j(this.f75243t, this.f75241O, this.J2, continuation);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
                    
                        if (f.AbstractC1976Ml.rl(r6, r7, r8, r9, r10, r11, r13) == r0) goto L34;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
                    
                        if (f.AbstractC1977Pl.t(r1, r2, r3, r14, r5, r6, r13) == r0) goto L34;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
                    
                        if (f.afx.rl(r13.f75241O, r13.f75243t, (f.ci) r14, r4, r13) == r0) goto L34;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
                    
                        if (f.Ew.rl(r13.f75241O, r13.f75243t, (f.nKK) r14, r4, r13) == r0) goto L34;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e4, code lost:
                    
                        return r0;
                     */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f75242n;
                        if (i2 != 0) {
                            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        } else {
                            ResultKt.throwOnFailure(obj);
                            Log.d("CrisperManager", "collect " + this.f75243t.n());
                            sqD.I28 i28N = this.f75243t.n();
                            if (i28N instanceof C1985n) {
                                ComponentActivity componentActivity = this.f75241O;
                                sqD.w6 w6Var = this.f75243t;
                                C1985n c1985n = (C1985n) i28N;
                                NuI.w6 w6Var2 = this.J2.J2;
                                NuI.CN3 cn3 = this.J2.KN;
                                NuI.I28 i28 = this.J2.Uo;
                                this.f75242n = 1;
                            } else if (i28N instanceof C1972C) {
                                ComponentActivity componentActivity2 = this.f75241O;
                                sqD.w6 w6Var3 = this.f75243t;
                                C1972C c1972c = (C1972C) i28N;
                                xAo.n nVar = this.J2.gh;
                                nYs.Ml ml = this.J2.f75229O;
                                Zzk.j jVar = this.J2.mUb;
                                this.f75242n = 2;
                            } else if (i28N instanceof f.ci) {
                                xAo.n nVar2 = this.J2.gh;
                                this.f75242n = 3;
                            } else if (i28N instanceof C1989z) {
                                f.r.rl(this.f75241O, this.f75243t, (C1989z) i28N, this.J2.rl, this.J2.xMQ);
                            } else if (i28N instanceof f.nKK) {
                                Q.Xo xo = this.J2.nr;
                                this.f75242n = 4;
                            } else if (i28N instanceof C1983fuX) {
                                AbstractC1974Dsr.n(this.f75241O, this.f75243t, (C1983fuX) i28N, this.J2.f75229O);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                C1268j(ComponentActivity componentActivity, ComponentActivity componentActivity2, I28 i28) {
                    this.f75239n = componentActivity;
                    this.f75240t = componentActivity2;
                    this.f75238O = i28;
                }

                @Override // TFv.CN3
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object rl(sqD.w6 w6Var, Continuation continuation) {
                    GJW.C.nr(LifecycleOwnerKt.n(this.f75239n), null, null, new C1269j(w6Var, this.f75240t, this.f75238O, null), 3, null);
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(I28 i28, ComponentActivity componentActivity, ComponentActivity componentActivity2, Continuation continuation) {
                super(2, continuation);
                this.f75237t = i28;
                this.f75235O = componentActivity;
                this.J2 = componentActivity2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f75237t, this.f75235O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f75236n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    TFv.Wre wreN = this.f75237t.f75230n.n();
                    C1268j c1268j = new C1268j(this.f75235O, this.J2, this.f75237t);
                    this.f75236n = 1;
                    if (wreN.n(c1268j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((C1267I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1267I28(ComponentActivity componentActivity, I28 i28, ComponentActivity componentActivity2, Continuation continuation) {
            super(2, continuation);
            this.f75234t = componentActivity;
            this.f75232O = i28;
            this.J2 = componentActivity2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C1267I28(this.f75234t, this.f75232O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75233n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ComponentActivity componentActivity = this.f75234t;
                Lifecycle.State state = Lifecycle.State.J2;
                j jVar = new j(this.f75232O, componentActivity, this.J2, null);
                this.f75233n = 1;
                if (RepeatOnLifecycleKt.rl(componentActivity, state, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75244n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ I28 f75246O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f75247n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ boolean f75248t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(I28 i28, Continuation continuation) {
                super(2, continuation);
                this.f75246O = i28;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f75246O, continuation);
                jVar.f75248t = ((Boolean) obj).booleanValue();
                return jVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n(((Boolean) obj).booleanValue(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws JSONException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f75247n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f75246O.ck(this.f75248t);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object n(boolean z2, Continuation continuation) {
                return ((j) create(Boolean.valueOf(z2), continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return I28.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75244n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.rv6 rv6VarWPU = I28.this.f75231t.WPU();
                j jVar = new j(I28.this, null);
                this.f75244n = 1;
                if (TFv.fuX.gh(rv6VarWPU, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class Wre extends SuspendLambda implements Function2 {
        final /* synthetic */ ComponentActivity J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ sqD.CN3 f75249O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75250n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f75251r;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ ComponentActivity f75253O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f75254n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function1 f75255t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Function1 function1, ComponentActivity componentActivity, Continuation continuation) {
                super(2, continuation);
                this.f75255t = function1;
                this.f75253O = componentActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f75255t, this.f75253O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f75254n == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function1 function1 = this.f75255t;
                    if (function1 != null) {
                        function1.invoke(this.f75253O);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(sqD.CN3 cn3, ComponentActivity componentActivity, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f75249O = cn3;
            this.J2 = componentActivity;
            this.f75251r = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return I28.this.new Wre(this.f75249O, this.J2, this.f75251r, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        
            if (androidx.view.PausingDispatcherKt.rl(r11, r3, r10) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wre wre;
            sqD.Dsr dsr;
            String value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75250n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    wre = this;
                    I28.this.az.eF(Unit.INSTANCE);
                    dsr = (sqD.Dsr) x0X.w6.nr((x0X.n) obj);
                    if (dsr == null) {
                        value = dsr.getValue();
                    } else {
                        value = null;
                    }
                    if (!Intrinsics.areEqual(value, "block_flow")) {
                        Lifecycle lifecycle = wre.J2.getLifecycleRegistry();
                        j jVar = new j(wre.f75251r, wre.J2, null);
                        wre.f75250n = 3;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                kgE.fuX fux = I28.this.f75231t;
                this.f75250n = 1;
                if (fux.r(this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            I28.this.rl.n(new j.qf(this.f75249O));
            sqD.n nVar = I28.this.f75230n;
            sqD.CN3 cn3 = this.f75249O;
            this.f75250n = 2;
            wre = this;
            obj = n.C1174n.n(nVar, cn3, null, wre, 2, null);
            if (obj != coroutine_suspended) {
                I28.this.az.eF(Unit.INSTANCE);
                dsr = (sqD.Dsr) x0X.w6.nr((x0X.n) obj);
                if (dsr == null) {
                }
                if (!Intrinsics.areEqual(value, "block_flow")) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75257n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f75258t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return I28.this.new n(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        
            if (r1.nr((java.lang.String) r10, r3, r9) != r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ScC.w6 w6Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75258t;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w6Var = (ScC.w6) this.f75257n;
                    ResultKt.throwOnFailure(obj);
                    w6.n nVar = new w6.n("crisper_initialization", null, null, 6, null);
                    this.f75257n = null;
                    this.f75258t = 3;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                NuI.CN3 cn3 = I28.this.KN;
                this.f75258t = 1;
                obj = cn3.n(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            w6Var = (ScC.w6) obj;
            NuI.w6 w6Var2 = I28.this.J2;
            k.I28 i28 = k.I28.f69641Z;
            this.f75257n = w6Var;
            this.f75258t = 2;
            obj = w6Var2.n(i28, this);
            if (obj != coroutine_suspended) {
                w6.n nVar2 = new w6.n("crisper_initialization", null, null, 6, null);
                this.f75257n = null;
                this.f75258t = 3;
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75260n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f75261t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return I28.this.new w6(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        
            if (r1.t((java.lang.String) r8, r3, r7) != r0) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ScC.n nVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75261t;
            int i3 = 2;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = (ScC.n) this.f75260n;
                    ResultKt.throwOnFailure(obj);
                    n.C0320n c0320n = new n.C0320n("crisper_initialization", null, i3, 0 == true ? 1 : 0);
                    this.f75260n = null;
                    this.f75261t = 3;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                NuI.I28 i28 = I28.this.Uo;
                this.f75261t = 1;
                obj = i28.n(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            nVar = (ScC.n) obj;
            NuI.w6 w6Var = I28.this.J2;
            k.I28 i282 = k.I28.f69644r;
            this.f75260n = nVar;
            this.f75261t = 2;
            obj = w6Var.n(i282, this);
            if (obj != coroutine_suspended) {
                n.C0320n c0320n2 = new n.C0320n("crisper_initialization", null, i3, 0 == true ? 1 : 0);
                this.f75260n = null;
                this.f75261t = 3;
            }
            return coroutine_suspended;
        }
    }

    public I28(sqD.n crisper, iF eventLogger, kgE.fuX iapManager, Q.Xo rewardedAdUnlockUseCase, nYs.Ml getAlightSettingsUseCase, NuI.w6 getAdUnitIdUseCase, NuI.I28 getInterstitialAdLauncherUseCase, NuI.CN3 getRewardedAdLauncherUseCase, WK.n getUriFromResource, Zzk.j isEligibleForFreeTrialUseCase) {
        Intrinsics.checkNotNullParameter(crisper, "crisper");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(rewardedAdUnlockUseCase, "rewardedAdUnlockUseCase");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(getAdUnitIdUseCase, "getAdUnitIdUseCase");
        Intrinsics.checkNotNullParameter(getInterstitialAdLauncherUseCase, "getInterstitialAdLauncherUseCase");
        Intrinsics.checkNotNullParameter(getRewardedAdLauncherUseCase, "getRewardedAdLauncherUseCase");
        Intrinsics.checkNotNullParameter(getUriFromResource, "getUriFromResource");
        Intrinsics.checkNotNullParameter(isEligibleForFreeTrialUseCase, "isEligibleForFreeTrialUseCase");
        this.f75230n = crisper;
        this.rl = eventLogger;
        this.f75231t = iapManager;
        this.nr = rewardedAdUnlockUseCase;
        this.f75229O = getAlightSettingsUseCase;
        this.J2 = getAdUnitIdUseCase;
        this.Uo = getInterstitialAdLauncherUseCase;
        this.KN = getRewardedAdLauncherUseCase;
        this.xMQ = getUriFromResource;
        this.mUb = isEligibleForFreeTrialUseCase;
        this.gh = new xAo.n();
        this.az = GJW.ci.t(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ck(boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_eligible_to_free_trial", z2);
        this.rl.n(new j.iwV(jSONObject));
        this.f75230n.O(jSONObject);
    }

    public static /* synthetic */ void o(I28 i28, sqD.CN3 cn3, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        i28.r(cn3, function1);
    }

    public final void HI(String projectId) throws JSONException {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("current_project", projectId);
        this.rl.n(new j.iwV(jSONObject));
        this.f75230n.O(jSONObject);
    }

    public final void Ik(ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, SzFNXybiSxdx.dxtPyNuvXWR);
        this.qie = componentActivity;
        this.gh.t(componentActivity);
        GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new n(null), 3, null);
        GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new w6(null), 3, null);
        GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new Ml(null), 3, null);
        GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new C1267I28(componentActivity, this, componentActivity, null), 3, null);
    }

    public final void r(sqD.CN3 hook, Function1 function1) {
        Intrinsics.checkNotNullParameter(hook, "hook");
        ComponentActivity componentActivity = this.qie;
        if (componentActivity == null) {
            return;
        }
        GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new Wre(hook, componentActivity, function1, null), 3, null);
    }

    public final Object ty(Continuation continuation) {
        Object objAwait = this.az.await(continuation);
        return objAwait == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwait : Unit.INSTANCE;
    }
}
