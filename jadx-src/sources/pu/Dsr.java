package pu;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Dsr {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f72063t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final qz f72064n;
    private final qz rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Dsr n() {
            return ((com.google.firebase.sessions.n) com.google.firebase.o.n(com.google.firebase.w6.f60907n).mUb(com.google.firebase.sessions.n.class)).rl();
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72066n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72067t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72067t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Dsr.this.J2(this);
        }
    }

    public Dsr(qz localOverrideSettings, qz remoteSettings) {
        Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.f72064n = localOverrideSettings;
        this.rl = remoteSettings;
    }

    private final boolean nr(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.nr(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J2(Continuation continuation) {
        n nVar;
        Dsr dsr;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f72067t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            qz qzVar = this.f72064n;
            nVar.f72066n = this;
            nVar.J2 = 1;
            if (qzVar.nr(nVar) != coroutine_suspended) {
                dsr = this;
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
        dsr = (Dsr) nVar.f72066n;
        ResultKt.throwOnFailure(obj);
        qz qzVar2 = dsr.rl;
        nVar.f72066n = null;
        nVar.J2 = 2;
    }

    public final double n() {
        Double dT = this.f72064n.t();
        if (dT != null) {
            double dDoubleValue = dT.doubleValue();
            if (nr(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dT2 = this.rl.t();
        if (dT2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dT2.doubleValue();
        if (nr(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long rl() {
        Duration durationRl = this.f72064n.rl();
        if (durationRl != null) {
            long rawValue = durationRl.getRawValue();
            if (O(rawValue)) {
                return rawValue;
            }
        }
        Duration durationRl2 = this.rl.rl();
        if (durationRl2 != null) {
            long rawValue2 = durationRl2.getRawValue();
            if (O(rawValue2)) {
                return rawValue2;
            }
        }
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.toDuration(30, DurationUnit.MINUTES);
    }

    public final boolean t() {
        Boolean boolN = this.f72064n.n();
        if (boolN != null) {
            return boolN.booleanValue();
        }
        Boolean boolN2 = this.rl.n();
        if (boolN2 != null) {
            return boolN2.booleanValue();
        }
        return true;
    }

    private final boolean O(long j2) {
        if (Duration.m1679isPositiveimpl(j2) && Duration.m1674isFiniteimpl(j2)) {
            return true;
        }
        return false;
    }
}
