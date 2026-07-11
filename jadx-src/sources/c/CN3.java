package c;

import Rc.w6;
import android.graphics.Color;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class CN3 implements vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f43404n = new CN3();

    private CN3() {
    }

    @Override // c.vd
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Integer n(Rc.w6 w6Var, float f3) {
        boolean z2;
        double dM7;
        if (w6Var.a() == w6.n.BEGIN_ARRAY) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            w6Var.rl();
        }
        double dM72 = w6Var.M7();
        double dM73 = w6Var.M7();
        double dM74 = w6Var.M7();
        if (w6Var.a() == w6.n.NUMBER) {
            dM7 = w6Var.M7();
        } else {
            dM7 = 1.0d;
        }
        if (z2) {
            w6Var.Z();
        }
        if (dM72 <= 1.0d && dM73 <= 1.0d && dM74 <= 1.0d) {
            dM72 *= 255.0d;
            dM73 *= 255.0d;
            dM74 *= 255.0d;
            if (dM7 <= 1.0d) {
                dM7 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dM7, (int) dM72, (int) dM73, (int) dM74));
    }
}
