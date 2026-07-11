package GJW;

import kotlin.Result;
import kotlin.ResultKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class lS extends g9 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final eO f3494r;

    @Override // GJW.g9
    public boolean S() {
        return false;
    }

    public lS(eO eOVar) {
        this.f3494r = eOVar;
    }

    @Override // GJW.g9
    public void WPU(Throwable th) {
        Object objJ = XQ().J();
        if (objJ instanceof Z) {
            eO eOVar = this.f3494r;
            Result.Companion companion = Result.INSTANCE;
            eOVar.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(((Z) objJ).f3468n)));
        } else {
            eO eOVar2 = this.f3494r;
            Result.Companion companion2 = Result.INSTANCE;
            eOVar2.resumeWith(Result.m313constructorimpl(CM.KN(objJ)));
        }
    }
}
