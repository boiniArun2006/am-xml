package ILs;

import GJW.M;
import ILs.r;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: ILs.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class C1376c extends fuX implements s4 {
    public C1376c(CoroutineContext coroutineContext, CN3 cn3) {
        super(coroutineContext, cn3, true, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // GJW.j
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void W(Unit unit) {
        r.j.n(a63(), null, 1, null);
    }

    @Override // GJW.j, GJW.L0y, GJW.xuv
    public boolean isActive() {
        return super.isActive();
    }

    @Override // GJW.j
    protected void kSg(Throwable th, boolean z2) {
        if (!a63().xMQ(th) && !z2) {
            M.n(getContext(), th);
        }
    }
}
