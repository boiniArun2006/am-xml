package PI;

import GJW.C;
import GJW.vd;
import TFv.Lu;
import TFv.SPz;
import TFv.Wre;
import TFv.fuX;
import androidx.view.Lifecycle;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleOwner;
import androidx.view.ProcessLifecycleOwner;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements PI.j, LifecycleEventObserver {
    private final Wre J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final SPz f7657O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SPz f7658n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f7659r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Wre f7660t;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7661n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7661n == 0) {
                ResultKt.throwOnFailure(obj);
                ProcessLifecycleOwner.INSTANCE.n().getLifecycle().n(n.this);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public n(sJa.Ml dispatcherProvider) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        SPz sPzN = Lu.n(null);
        this.f7658n = sPzN;
        this.f7660t = fuX.aYN(sPzN);
        SPz sPzN2 = Lu.n(null);
        this.f7657O = sPzN2;
        this.J2 = fuX.aYN(sPzN2);
        Boolean bool = (Boolean) sPzN2.getValue();
        this.f7659r = bool != null ? bool.booleanValue() : true;
        C.nr(GJW.Lu.n(dispatcherProvider.n()), null, null, new j(null), 3, null);
    }

    /* JADX INFO: renamed from: PI.n$n, reason: collision with other inner class name */
    public /* synthetic */ class C0269n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // PI.j
    public Wre T() {
        return this.f7660t;
    }

    @Override // androidx.view.LifecycleEventObserver
    public void Z(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (C0269n.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
            case 6:
            case 7:
                return;
            case 2:
                this.f7658n.setValue(Boolean.TRUE);
                return;
            case 3:
                this.f7657O.setValue(Boolean.TRUE);
                return;
            case 4:
                this.f7657O.setValue(Boolean.FALSE);
                return;
            case 5:
                this.f7658n.setValue(Boolean.FALSE);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ n(sJa.Ml ml, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? sJa.w6.rl : ml);
    }
}
