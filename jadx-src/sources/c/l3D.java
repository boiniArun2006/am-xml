package c;

import Rc.w6;
import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43433n = w6.j.n("x", "y");

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f43434n;

        static {
            int[] iArr = new int[w6.n.values().length];
            f43434n = iArr;
            try {
                iArr[w6.n.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43434n[w6.n.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43434n[w6.n.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static List J2(Rc.w6 w6Var, float f3) {
        ArrayList arrayList = new ArrayList();
        w6Var.rl();
        while (w6Var.a() == w6.n.BEGIN_ARRAY) {
            w6Var.rl();
            arrayList.add(O(w6Var, f3));
            w6Var.Z();
        }
        w6Var.Z();
        return arrayList;
    }

    static PointF O(Rc.w6 w6Var, float f3) {
        int i2 = j.f43434n[w6Var.a().ordinal()];
        if (i2 == 1) {
            return rl(w6Var, f3);
        }
        if (i2 == 2) {
            return n(w6Var, f3);
        }
        if (i2 == 3) {
            return t(w6Var, f3);
        }
        throw new IllegalArgumentException("Unknown point starts with " + w6Var.a());
    }

    static float Uo(Rc.w6 w6Var) {
        w6.n nVarA = w6Var.a();
        int i2 = j.f43434n[nVarA.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                w6Var.rl();
                float fM7 = (float) w6Var.M7();
                while (w6Var.jB()) {
                    w6Var.n1();
                }
                w6Var.Z();
                return fM7;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + nVarA);
        }
        return (float) w6Var.M7();
    }

    private static PointF n(Rc.w6 w6Var, float f3) {
        w6Var.rl();
        float fM7 = (float) w6Var.M7();
        float fM72 = (float) w6Var.M7();
        while (w6Var.a() != w6.n.END_ARRAY) {
            w6Var.n1();
        }
        w6Var.Z();
        return new PointF(fM7 * f3, fM72 * f3);
    }

    static int nr(Rc.w6 w6Var) {
        w6Var.rl();
        int iM7 = (int) (w6Var.M7() * 255.0d);
        int iM72 = (int) (w6Var.M7() * 255.0d);
        int iM73 = (int) (w6Var.M7() * 255.0d);
        while (w6Var.jB()) {
            w6Var.n1();
        }
        w6Var.Z();
        return Color.argb(255, iM7, iM72, iM73);
    }

    private static PointF rl(Rc.w6 w6Var, float f3) {
        float fM7 = (float) w6Var.M7();
        float fM72 = (float) w6Var.M7();
        while (w6Var.jB()) {
            w6Var.n1();
        }
        return new PointF(fM7 * f3, fM72 * f3);
    }

    private static PointF t(Rc.w6 w6Var, float f3) {
        w6Var.Uo();
        float fUo = 0.0f;
        float fUo2 = 0.0f;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43433n);
            if (iMx != 0) {
                if (iMx != 1) {
                    w6Var.fcU();
                    w6Var.n1();
                } else {
                    fUo2 = Uo(w6Var);
                }
            } else {
                fUo = Uo(w6Var);
            }
        }
        w6Var.T();
        return new PointF(fUo * f3, fUo2 * f3);
    }
}
