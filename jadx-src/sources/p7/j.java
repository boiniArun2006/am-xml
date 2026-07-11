package p7;

import YV.Wre;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements Zzk.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Wre f71621n;

    /* JADX INFO: renamed from: p7.j$j, reason: collision with other inner class name */
    static final class C1092j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f71622O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f71623n;

        C1092j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71623n = obj;
            this.f71622O |= Integer.MIN_VALUE;
            return j.this.n(false, this);
        }
    }

    public j(Wre monopoly) {
        Intrinsics.checkNotNullParameter(monopoly, "monopoly");
        this.f71621n = monopoly;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Zzk.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(boolean z2, Continuation continuation) {
        C1092j c1092j;
        if (continuation instanceof C1092j) {
            c1092j = (C1092j) continuation;
            int i2 = c1092j.f71622O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1092j.f71622O = i2 - Integer.MIN_VALUE;
            } else {
                c1092j = new C1092j(continuation);
            }
        }
        Object objAz = c1092j.f71623n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c1092j.f71622O;
        boolean z3 = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAz);
            if (!com.alightcreative.app.motion.persist.j.INSTANCE.getForceFreeTrialEligibility()) {
                if (!z2) {
                    Wre wre = this.f71621n;
                    c1092j.f71622O = 1;
                    objAz = wre.az(c1092j);
                    if (objAz == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                z3 = false;
            }
            return Boxing.boxBoolean(z3);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objAz);
        if (((Boolean) objAz).booleanValue()) {
            z3 = false;
        }
        return Boxing.boxBoolean(z3);
    }
}
