package GJW;

import GJW.Mf;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class o7q extends KH {
    protected abstract Thread xVH();

    protected void EF(long j2, Mf.w6 w6Var) {
        Md.f3426S.Mh(j2, w6Var);
    }

    protected final void uG() {
        Thread threadXVH = xVH();
        if (Thread.currentThread() != threadXVH) {
            w6.n();
            LockSupport.unpark(threadXVH);
        }
    }
}
