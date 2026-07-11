package QJ;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f7988n;
    private PointF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f7989t;

    public Xo(PointF pointF, boolean z2, List list) {
        this.rl = pointF;
        this.f7989t = z2;
        this.f7988n = new ArrayList(list);
    }

    public void J2(float f3, float f4) {
        if (this.rl == null) {
            this.rl = new PointF();
        }
        this.rl.set(f3, f4);
    }

    public void O(boolean z2) {
        this.f7989t = z2;
    }

    public List n() {
        return this.f7988n;
    }

    public boolean nr() {
        return this.f7989t;
    }

    public PointF rl() {
        return this.rl;
    }

    public void t(Xo xo, Xo xo2, float f3) {
        if (this.rl == null) {
            this.rl = new PointF();
        }
        this.f7989t = xo.nr() || xo2.nr();
        if (xo.n().size() != xo2.n().size()) {
            x0.CN3.t("Curves must have the same number of control points. Shape 1: " + xo.n().size() + "\tShape 2: " + xo2.n().size());
        }
        int iMin = Math.min(xo.n().size(), xo2.n().size());
        if (this.f7988n.size() < iMin) {
            for (int size = this.f7988n.size(); size < iMin; size++) {
                this.f7988n.add(new ES.j());
            }
        } else if (this.f7988n.size() > iMin) {
            for (int size2 = this.f7988n.size() - 1; size2 >= iMin; size2--) {
                List list = this.f7988n;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFRl = xo.rl();
        PointF pointFRl2 = xo2.rl();
        J2(x0.o.xMQ(pointFRl.x, pointFRl2.x, f3), x0.o.xMQ(pointFRl.y, pointFRl2.y, f3));
        for (int size3 = this.f7988n.size() - 1; size3 >= 0; size3--) {
            ES.j jVar = (ES.j) xo.n().get(size3);
            ES.j jVar2 = (ES.j) xo2.n().get(size3);
            PointF pointFN = jVar.n();
            PointF pointFRl3 = jVar.rl();
            PointF pointFT = jVar.t();
            PointF pointFN2 = jVar2.n();
            PointF pointFRl4 = jVar2.rl();
            PointF pointFT2 = jVar2.t();
            ((ES.j) this.f7988n.get(size3)).nr(x0.o.xMQ(pointFN.x, pointFN2.x, f3), x0.o.xMQ(pointFN.y, pointFN2.y, f3));
            ((ES.j) this.f7988n.get(size3)).O(x0.o.xMQ(pointFRl3.x, pointFRl4.x, f3), x0.o.xMQ(pointFRl3.y, pointFRl4.y, f3));
            ((ES.j) this.f7988n.get(size3)).J2(x0.o.xMQ(pointFT.x, pointFT2.x, f3), x0.o.xMQ(pointFT.y, pointFT2.y, f3));
        }
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f7988n.size() + "closed=" + this.f7989t + '}';
    }

    public Xo() {
        this.f7988n = new ArrayList();
    }
}
