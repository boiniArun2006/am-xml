package c;

import Rc.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class u implements vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f43444n = new u();

    private u() {
    }

    @Override // c.vd
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Ect.Ml n(Rc.w6 w6Var, float f3) {
        boolean z2;
        if (w6Var.a() == w6.n.BEGIN_ARRAY) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            w6Var.rl();
        }
        float fM7 = (float) w6Var.M7();
        float fM72 = (float) w6Var.M7();
        while (w6Var.jB()) {
            w6Var.n1();
        }
        if (z2) {
            w6Var.Z();
        }
        return new Ect.Ml((fM7 / 100.0f) * f3, (fM72 / 100.0f) * f3);
    }
}
