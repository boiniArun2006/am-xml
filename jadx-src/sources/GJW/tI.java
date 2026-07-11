package GJW;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class tI extends g9 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Continuation f3508r;

    @Override // GJW.g9
    public boolean S() {
        return false;
    }

    @Override // GJW.g9
    public void WPU(Throwable th) {
        Continuation continuation = this.f3508r;
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
    }

    public tI(Continuation continuation) {
        this.f3508r = continuation;
    }
}
