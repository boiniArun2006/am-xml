package c;

import Rc.w6;
import android.graphics.PointF;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class afx implements vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final afx f43425n = new afx();

    private afx() {
    }

    @Override // c.vd
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public PointF n(Rc.w6 w6Var, float f3) {
        w6.n nVarA = w6Var.a();
        if (nVarA == w6.n.BEGIN_ARRAY) {
            return l3D.O(w6Var, f3);
        }
        if (nVarA == w6.n.BEGIN_OBJECT) {
            return l3D.O(w6Var, f3);
        }
        if (nVarA == w6.n.NUMBER) {
            PointF pointF = new PointF(((float) w6Var.M7()) * f3, ((float) w6Var.M7()) * f3);
            while (w6Var.jB()) {
                w6Var.n1();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + nVarA);
    }
}
