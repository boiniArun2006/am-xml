package La;

import CZF.I28;
import WN.j;
import b.InterfaceC1651w6;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class I28 implements La.Ml {
    private static final IllegalStateException J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f6122O = new j(null);
    private static final WN.j Uo;
    private I28.w6 nr;
    private final ao3.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC1651w6 f6123t;

    static final class Ml extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6125n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f6126t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6126t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return I28.this.rl(null, this);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f6127O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6128n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6129r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f6130t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6127O = obj;
            this.f6129r |= Integer.MIN_VALUE;
            return I28.this.n(null, this);
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[I28.w6.values().length];
            try {
                iArr[I28.w6.f989r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I28.w6.f985O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I28.w6.J2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        IllegalStateException illegalStateException = new IllegalStateException("Trying to track event while in Dispose state.");
        J2 = illegalStateException;
        Uo = new WN.j(j.w6.J2, j.EnumC0415j.f11472o, j.n.f11479r, illegalStateException.getMessage(), illegalStateException);
    }

    public I28(ao3.j picoEventDepositManager, InterfaceC1651w6 picoPeriodicEventUploader) {
        Intrinsics.checkNotNullParameter(picoEventDepositManager, "picoEventDepositManager");
        Intrinsics.checkNotNullParameter(picoPeriodicEventUploader, "picoPeriodicEventUploader");
        this.rl = picoEventDepositManager;
        this.f6123t = picoPeriodicEventUploader;
        this.nr = I28.w6.f987n.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // La.Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(I28.w6 w6Var, Continuation continuation) {
        w6 w6Var2;
        I28 i28;
        if (continuation instanceof w6) {
            w6Var2 = (w6) continuation;
            int i2 = w6Var2.f6129r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var2.f6129r = i2 - Integer.MIN_VALUE;
            } else {
                w6Var2 = new w6(continuation);
            }
        }
        Object obj = w6Var2.f6127O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var2.f6129r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.nr == w6Var) {
                return Unit.INSTANCE;
            }
            ao3.j jVar = this.rl;
            w6Var2.f6128n = this;
            w6Var2.f6130t = w6Var;
            w6Var2.f6129r = 1;
            if (jVar.n(w6Var, w6Var2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i28 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w6Var = (I28.w6) w6Var2.f6130t;
            i28 = (I28) w6Var2.f6128n;
            ResultKt.throwOnFailure(obj);
        }
        if (w6Var == I28.w6.f985O) {
            i28.f6123t.n();
        }
        i28.nr = w6Var;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // La.Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(QAv.j jVar, Continuation continuation) {
        Ml ml;
        I28 i28;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.J2 = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objT = ml.f6126t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            int i5 = n.$EnumSwitchMapping$0[this.nr.ordinal()];
            if (i5 == 1) {
                ao3.j jVar2 = this.rl;
                ml.J2 = 1;
                Object objT2 = jVar2.t(jVar, ml);
                if (objT2 != coroutine_suspended) {
                    return objT2;
                }
            } else {
                if (i5 != 2) {
                    if (i5 == 3) {
                        return new n.C1266n(Uo);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ao3.j jVar3 = this.rl;
                ml.f6125n = this;
                ml.J2 = 2;
                objT = jVar3.t(jVar, ml);
                if (objT != coroutine_suspended) {
                    i28 = this;
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            ResultKt.throwOnFailure(objT);
            return objT;
        }
        if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i28 = (I28) ml.f6125n;
        ResultKt.throwOnFailure(objT);
        x0X.n nVar = (x0X.n) objT;
        if (nVar instanceof n.C1266n) {
            return nVar;
        }
        if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        i28.f6123t.n();
        return nVar;
    }
}
