package GJW;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class g9 extends dzu.Xo implements O, kO4 {
    public L0y J2;

    public abstract boolean S();

    public abstract void WPU(Throwable th);

    @Override // GJW.kO4
    public boolean isActive() {
        return true;
    }

    @Override // GJW.kO4
    public T rl() {
        return null;
    }

    public final L0y XQ() {
        L0y l0y = this.J2;
        if (l0y != null) {
            return l0y;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public final void aYN(L0y l0y) {
        this.J2 = l0y;
    }

    @Override // dzu.Xo
    public String toString() {
        return psW.n(this) + '@' + psW.rl(this) + "[job@" + psW.rl(XQ()) + ']';
    }

    @Override // GJW.O
    public void n() {
        XQ().Org(this);
    }
}
