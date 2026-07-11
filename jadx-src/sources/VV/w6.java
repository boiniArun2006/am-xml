package VV;

import GJW.AbstractC1363t;
import GJW.V1;
import GJW.vd;
import GJW.xuv;
import androidx.compose.animation.core.InfiniteAnimationPolicyKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class w6 implements VV.n {
    private final MutableState E2;
    private final MutableState J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final State f10976N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final MutableState f10977O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final State f10978S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final State f10979T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final MutableState f10980X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final MutableState f10981Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MutableState f10982e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MutableState f10983g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MutableState f10984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final MutableState f10985o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final MutableState f10986r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MutableState f10987t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final MutatorMutex f10988v;

    static final class CN3 extends SuspendLambda implements Function1 {
        final /* synthetic */ float J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ FQq.Dsr f10989O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10990n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f10991o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f10992r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(FQq.Dsr dsr, float f3, int i2, boolean z2, Continuation continuation) {
            super(1, continuation);
            this.f10989O = dsr;
            this.J2 = f3;
            this.f10992r = i2;
            this.f10991o = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return w6.this.new CN3(this.f10989O, this.J2, this.f10992r, this.f10991o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10990n == 0) {
                ResultKt.throwOnFailure(obj);
                w6.this.p5(this.f10989O);
                w6.this.GR(this.J2);
                w6.this.eF(this.f10992r);
                w6.this.FX(false);
                if (this.f10991o) {
                    w6.this.M(Long.MIN_VALUE);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((CN3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class I28 extends Lambda implements Function0 {
        I28() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf((w6.this.Ik() && w6.this.S() % 2 == 0) ? -w6.this.o() : w6.this.o());
        }
    }

    static final class Ml extends Lambda implements Function0 {
        Ml() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float f3 = 0.0f;
            if (w6.this.WPU() != null) {
                if (w6.this.o() < 0.0f) {
                    w6.this.ViF();
                } else {
                    w6.this.ViF();
                    f3 = 1.0f;
                }
            }
            return Float.valueOf(f3);
        }
    }

    static final class Wre extends Lambda implements Function0 {
        Wre() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(w6.this.S() == w6.this.r() && w6.this.t() == w6.this.v());
        }
    }

    static final class j extends SuspendLambda implements Function1 {
        final /* synthetic */ boolean E2;
        final /* synthetic */ int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f10997O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ float f10998S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ FQq.Dsr f10999Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Dsr f11000e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f11001g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11002n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f11003o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f11004r;

        /* JADX INFO: renamed from: VV.w6$j$j, reason: collision with other inner class name */
        static final class C0390j extends SuspendLambda implements Function2 {
            final /* synthetic */ int J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ xuv f11006O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f11007n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ w6 f11008o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ int f11009r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Dsr f11010t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0390j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: VV.w6$j$j$j, reason: collision with other inner class name */
            public /* synthetic */ class C0391j {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Dsr.values().length];
                    try {
                        iArr[Dsr.f10887t.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0390j(Dsr dsr, xuv xuvVar, int i2, int i3, w6 w6Var, Continuation continuation) {
                super(2, continuation);
                this.f11010t = dsr;
                this.f11006O = xuvVar;
                this.J2 = i2;
                this.f11009r = i3;
                this.f11008o = w6Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0390j(this.f11010t, this.f11006O, this.J2, this.f11009r, this.f11008o, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[ADDED_TO_REGION, REMOVE] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003e -> B:19:0x0041). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r3.f11007n
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.ResultKt.throwOnFailure(r4)
                    goto L41
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    kotlin.ResultKt.throwOnFailure(r4)
                L1a:
                    VV.Dsr r4 = r3.f11010t
                    int[] r1 = VV.w6.j.C0390j.C0391j.$EnumSwitchMapping$0
                    int r4 = r4.ordinal()
                    r4 = r1[r4]
                    if (r4 != r2) goto L34
                    GJW.xuv r4 = r3.f11006O
                    boolean r4 = r4.isActive()
                    if (r4 == 0) goto L31
                    int r4 = r3.J2
                    goto L36
                L31:
                    int r4 = r3.f11009r
                    goto L36
                L34:
                    int r4 = r3.J2
                L36:
                    VV.w6 r1 = r3.f11008o
                    r3.f11007n = r2
                    java.lang.Object r4 = VV.w6.HI(r1, r4, r3)
                    if (r4 != r0) goto L41
                    return r0
                L41:
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 != 0) goto L1a
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: VV.w6.j.C0390j.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ class n {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Dsr.values().length];
                try {
                    iArr[Dsr.f10887t.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Dsr.f10886n.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i2, int i3, boolean z2, float f3, aC aCVar, FQq.Dsr dsr, float f4, boolean z3, boolean z4, Dsr dsr2, Continuation continuation) {
            super(1, continuation);
            this.f10997O = i2;
            this.J2 = i3;
            this.f11004r = z2;
            this.f11003o = f3;
            this.f10999Z = dsr;
            this.f10998S = f4;
            this.f11001g = z3;
            this.E2 = z4;
            this.f11000e = dsr2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return w6.this.new j(this.f10997O, this.J2, this.f11004r, this.f11003o, null, this.f10999Z, this.f10998S, this.f11001g, this.E2, this.f11000e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineContext coroutineContext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f11002n;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    w6.this.eF(this.f10997O);
                    w6.this.E(this.J2);
                    w6.this.D(this.f11004r);
                    w6.this.a(this.f11003o);
                    w6.this.M7(null);
                    w6.this.p5(this.f10999Z);
                    w6.this.GR(this.f10998S);
                    w6.this.I(this.f11001g);
                    if (!this.E2) {
                        w6.this.M(Long.MIN_VALUE);
                    }
                    if (this.f10999Z == null) {
                        w6.this.FX(false);
                        return Unit.INSTANCE;
                    }
                    if (!Float.isInfinite(this.f11003o)) {
                        w6.this.FX(true);
                        int i3 = n.$EnumSwitchMapping$0[this.f11000e.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                coroutineContext = EmptyCoroutineContext.INSTANCE;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            coroutineContext = V1.f3456n;
                        }
                        C0390j c0390j = new C0390j(this.f11000e, AbstractC1363t.az(getContext()), this.J2, this.f10997O, w6.this, null);
                        this.f11002n = 1;
                        if (GJW.Dsr.Uo(coroutineContext, c0390j, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        w6 w6Var = w6.this;
                        w6Var.GR(w6Var.v());
                        w6.this.FX(false);
                        w6.this.eF(this.J2);
                        return Unit.INSTANCE;
                    }
                }
                AbstractC1363t.qie(getContext());
                w6.this.FX(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                w6.this.FX(false);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class n extends Lambda implements Function1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f11012t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i2) {
            super(1);
            this.f11012t = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).longValue());
        }

        public final Boolean n(long j2) {
            return Boolean.valueOf(w6.this.U(this.f11012t, j2));
        }
    }

    /* JADX INFO: renamed from: VV.w6$w6, reason: collision with other inner class name */
    static final class C0392w6 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f11014t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0392w6(int i2) {
            super(1);
            this.f11014t = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).longValue());
        }

        public final Boolean n(long j2) {
            return Boolean.valueOf(w6.this.U(this.f11014t, j2));
        }
    }

    private void B(float f3) {
        this.f10982e.setValue(Float.valueOf(f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(boolean z2) {
        this.J2.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(int i2) {
        this.f10977O.setValue(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FX(boolean z2) {
        this.f10984n.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(boolean z2) {
        this.f10981Z.setValue(Boolean.valueOf(z2));
    }

    private final void J(float f3) {
        this.E2.setValue(Float.valueOf(f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(long j2) {
        this.f10980X.setValue(Long.valueOf(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M7(aC aCVar) {
        this.f10986r.setValue(aCVar);
    }

    private final float P5(float f3, FQq.Dsr dsr) {
        if (dsr == null) {
            return f3;
        }
        return f3 - (f3 % (1 / dsr.xMQ()));
    }

    private final float Xw() {
        return ((Number) this.E2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f3) {
        this.f10985o.setValue(Float.valueOf(f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eF(int i2) {
        this.f10987t.setValue(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p5(FQq.Dsr dsr) {
        this.f10983g.setValue(dsr);
    }

    private final float rV9() {
        return ((Number) this.f10978S.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float v() {
        return ((Number) this.f10979T.getValue()).floatValue();
    }

    @Override // VV.fuX
    public boolean Ik() {
        return ((Boolean) this.J2.getValue()).booleanValue();
    }

    @Override // VV.fuX
    public int S() {
        return ((Number) this.f10987t.getValue()).intValue();
    }

    @Override // VV.fuX
    public aC ViF() {
        android.support.v4.media.j.n(this.f10986r.getValue());
        return null;
    }

    @Override // VV.fuX
    public FQq.Dsr WPU() {
        return (FQq.Dsr) this.f10983g.getValue();
    }

    @Override // VV.n
    public Object aYN(FQq.Dsr dsr, int i2, int i3, boolean z2, float f3, aC aCVar, float f4, boolean z3, Dsr dsr2, boolean z4, boolean z5, Continuation continuation) {
        Object objO = MutatorMutex.O(this.f10988v, null, new j(i2, i3, z2, f3, aCVar, dsr, f4, z5, z3, dsr2, null), continuation, 1, null);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    public long bzg() {
        return ((Number) this.f10980X.getValue()).longValue();
    }

    @Override // androidx.compose.runtime.State
    public Float getValue() {
        return Float.valueOf(t());
    }

    public boolean jB() {
        return ((Boolean) this.f10981Z.getValue()).booleanValue();
    }

    @Override // VV.fuX
    public float o() {
        return ((Number) this.f10985o.getValue()).floatValue();
    }

    @Override // VV.fuX
    public int r() {
        return ((Number) this.f10977O.getValue()).intValue();
    }

    @Override // VV.fuX
    public float t() {
        return ((Number) this.f10982e.getValue()).floatValue();
    }

    @Override // VV.n
    public Object ty(FQq.Dsr dsr, float f3, int i2, boolean z2, Continuation continuation) {
        Object objO = MutatorMutex.O(this.f10988v, null, new CN3(dsr, f3, i2, z2, null), continuation, 1, null);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    public w6() {
        Boolean bool = Boolean.FALSE;
        this.f10984n = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.f10987t = SnapshotStateKt__SnapshotStateKt.O(1, null, 2, null);
        this.f10977O = SnapshotStateKt__SnapshotStateKt.O(1, null, 2, null);
        this.J2 = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.f10986r = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.f10985o = SnapshotStateKt__SnapshotStateKt.O(Float.valueOf(1.0f), null, 2, null);
        this.f10981Z = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.f10978S = SnapshotStateKt.O(new I28());
        this.f10983g = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        Float fValueOf = Float.valueOf(0.0f);
        this.E2 = SnapshotStateKt__SnapshotStateKt.O(fValueOf, null, 2, null);
        this.f10982e = SnapshotStateKt__SnapshotStateKt.O(fValueOf, null, 2, null);
        this.f10980X = SnapshotStateKt__SnapshotStateKt.O(Long.MIN_VALUE, null, 2, null);
        this.f10979T = SnapshotStateKt.O(new Ml());
        this.f10976N = SnapshotStateKt.O(new Wre());
        this.f10988v = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void GR(float f3) {
        J(f3);
        if (jB()) {
            f3 = P5(f3, WPU());
        }
        B(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U(int i2, long j2) {
        long jBzg;
        float fXw;
        float f3;
        FQq.Dsr dsrWPU = WPU();
        if (dsrWPU == null) {
            return true;
        }
        if (bzg() == Long.MIN_VALUE) {
            jBzg = 0;
        } else {
            jBzg = j2 - bzg();
        }
        M(j2);
        ViF();
        ViF();
        float fNr = ((jBzg / ((long) 1000000)) / dsrWPU.nr()) * rV9();
        if (rV9() < 0.0f) {
            fXw = 0.0f - (Xw() + fNr);
        } else {
            fXw = (Xw() + fNr) - 1.0f;
        }
        if (fXw < 0.0f) {
            GR(RangesKt.coerceIn(Xw(), 0.0f, 1.0f) + fNr);
        } else {
            float f4 = 1.0f - 0.0f;
            int i3 = (int) (fXw / f4);
            int i5 = i3 + 1;
            if (S() + i5 > i2) {
                GR(v());
                eF(i2);
                return false;
            }
            eF(S() + i5);
            float f5 = fXw - (i3 * f4);
            if (rV9() < 0.0f) {
                f3 = 1.0f - f5;
            } else {
                f3 = 0.0f + f5;
            }
            GR(f3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object wTp(int i2, Continuation continuation) {
        if (i2 == Integer.MAX_VALUE) {
            return InfiniteAnimationPolicyKt.n(new n(i2), continuation);
        }
        return MonotonicFrameClockKt.t(new C0392w6(i2), continuation);
    }
}
