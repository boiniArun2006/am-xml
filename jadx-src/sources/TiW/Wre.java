package TiW;

import GJW.FKk;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Wre extends FKk {
    private final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f10544O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private j f10545Z = Bu();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f10546o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f10547r;

    private final j Bu() {
        return new j(this.f10544O, this.J2, this.f10547r, this.f10546o);
    }

    @Override // GJW.FKk
    public Executor T3L() {
        return this.f10545Z;
    }

    @Override // GJW.lej
    public void n1(CoroutineContext coroutineContext, Runnable runnable) {
        j.p5(this.f10545Z, runnable, false, false, 6, null);
    }

    public final void p0N(Runnable runnable, boolean z2, boolean z3) {
        this.f10545Z.U(runnable, z2, z3);
    }

    @Override // GJW.lej
    public void qm(CoroutineContext coroutineContext, Runnable runnable) {
        j.p5(this.f10545Z, runnable, false, true, 2, null);
    }

    public Wre(int i2, int i3, long j2, String str) {
        this.f10544O = i2;
        this.J2 = i3;
        this.f10547r = j2;
        this.f10546o = str;
    }
}
