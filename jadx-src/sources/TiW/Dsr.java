package TiW;

import GJW.psW;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Dsr extends fuX {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Runnable f10542O;

    @Override // java.lang.Runnable
    public void run() {
        this.f10542O.run();
    }

    public String toString() {
        return "Task[" + psW.n(this.f10542O) + '@' + psW.rl(this.f10542O) + ", " + this.f10551n + ", " + aC.t(this.f10552t) + ']';
    }

    public Dsr(Runnable runnable, long j2, boolean z2) {
        super(j2, z2);
        this.f10542O = runnable;
    }
}
