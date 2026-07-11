package dzu;

import GJW.O;
import GJW.Zs;
import GJW.iF;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Q extends GJW.lej implements iF {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final GJW.lej f63554O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ iF f63555t;

    @Override // GJW.lej
    public boolean Org(CoroutineContext coroutineContext) {
        return this.f63554O.Org(coroutineContext);
    }

    @Override // GJW.iF
    public O U(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f63555t.U(j2, runnable, coroutineContext);
    }

    @Override // GJW.lej
    public void n1(CoroutineContext coroutineContext, Runnable runnable) {
        this.f63554O.n1(coroutineContext, runnable);
    }

    @Override // GJW.lej
    public void qm(CoroutineContext coroutineContext, Runnable runnable) {
        this.f63554O.qm(coroutineContext, runnable);
    }

    @Override // GJW.lej
    public String toString() {
        return this.J2;
    }

    @Override // GJW.iF
    public void z(long j2, GJW.Pl pl) {
        this.f63555t.z(j2, pl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q(GJW.lej lejVar, String str) {
        iF iFVar;
        if (lejVar instanceof iF) {
            iFVar = (iF) lejVar;
        } else {
            iFVar = null;
        }
        this.f63555t = iFVar == null ? Zs.n() : iFVar;
        this.f63554O = lejVar;
        this.J2 = str;
    }
}
