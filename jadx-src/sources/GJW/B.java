package GJW;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class B extends g9 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Function1 f3388r;

    @Override // GJW.g9
    public boolean S() {
        return false;
    }

    @Override // GJW.g9
    public void WPU(Throwable th) {
        this.f3388r.invoke(th);
    }

    public B(Function1 function1) {
        this.f3388r = function1;
    }
}
