package GJW;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class z3w extends lej {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final z3w f3513t = new z3w();

    @Override // GJW.lej
    public boolean Org(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // GJW.lej
    public lej K(int i2, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // GJW.lej
    public void n1(CoroutineContext coroutineContext, Runnable runnable) {
        VoU voU = (VoU) coroutineContext.get(VoU.f3457t);
        if (voU == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        voU.f3458n = true;
    }

    @Override // GJW.lej
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    private z3w() {
    }
}
