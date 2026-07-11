package Fw3;

import LQ.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 implements C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mF.w6 f3357n;

    public w6(mF.w6 placeholderTexture) {
        Intrinsics.checkNotNullParameter(placeholderTexture, "placeholderTexture");
        this.f3357n = placeholderTexture;
    }

    @Override // Fw3.C
    public Object KN(long j2, boolean z2, Continuation continuation) {
        return new j.w6(Unit.INSTANCE);
    }

    @Override // Fw3.C
    public mF.w6 S() {
        return this.f3357n;
    }

    @Override // w9.aC
    public Object rl(Continuation continuation) {
        Object objRl = S().rl(continuation);
        if (objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objRl;
        }
        return Unit.INSTANCE;
    }
}
