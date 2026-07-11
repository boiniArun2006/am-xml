package x0;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PointF f75181n = new PointF();

    static int J2(float f3, float f4) {
        return Uo((int) f3, (int) f4);
    }

    public static int mUb(int i2, int i3, float f3) {
        return (int) (i2 + (f3 * (i3 - i2)));
    }

    public static float xMQ(float f3, float f4, float f5) {
        return f3 + (f5 * (f4 - f3));
    }

    private static int O(int i2, int i3) {
        int i5 = i2 / i3;
        return (((i2 ^ i3) >= 0) || i2 % i3 == 0) ? i5 : i5 - 1;
    }

    public static PointF n(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static boolean nr(float f3, float f4, float f5) {
        return f3 >= f4 && f3 <= f5;
    }

    public static void KN(QJ.Xo xo, Path path) {
        Path path2;
        path.reset();
        PointF pointFRl = xo.rl();
        path.moveTo(pointFRl.x, pointFRl.y);
        f75181n.set(pointFRl.x, pointFRl.y);
        int i2 = 0;
        while (i2 < xo.n().size()) {
            ES.j jVar = (ES.j) xo.n().get(i2);
            PointF pointFN = jVar.n();
            PointF pointFRl2 = jVar.rl();
            PointF pointFT = jVar.t();
            PointF pointF = f75181n;
            if (pointFN.equals(pointF) && pointFRl2.equals(pointFT)) {
                path.lineTo(pointFT.x, pointFT.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFN.x, pointFN.y, pointFRl2.x, pointFRl2.y, pointFT.x, pointFT.y);
            }
            pointF.set(pointFT.x, pointFT.y);
            i2++;
            path = path2;
        }
        Path path3 = path;
        if (xo.nr()) {
            path3.close();
        }
    }

    private static int Uo(int i2, int i3) {
        return i2 - (i3 * O(i2, i3));
    }

    public static void gh(ES.I28 i28, int i2, List list, ES.I28 i282, ef.C c2) {
        if (i28.t(c2.getName(), i2)) {
            list.add(i282.n(c2.getName()).xMQ(c2));
        }
    }

    public static float rl(float f3, float f4, float f5) {
        return Math.max(f4, Math.min(f5, f3));
    }

    public static int t(int i2, int i3, int i5) {
        return Math.max(i3, Math.min(i5, i2));
    }
}
