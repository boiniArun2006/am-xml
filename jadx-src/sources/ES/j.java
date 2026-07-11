package ES;

import android.graphics.PointF;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PointF f2312n;
    private final PointF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final PointF f2313t;

    public j() {
        this.f2312n = new PointF();
        this.rl = new PointF();
        this.f2313t = new PointF();
    }

    public void J2(float f3, float f4) {
        this.f2313t.set(f3, f4);
    }

    public void O(float f3, float f4) {
        this.rl.set(f3, f4);
    }

    public PointF n() {
        return this.f2312n;
    }

    public void nr(float f3, float f4) {
        this.f2312n.set(f3, f4);
    }

    public PointF rl() {
        return this.rl;
    }

    public PointF t() {
        return this.f2313t;
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f2313t.x), Float.valueOf(this.f2313t.y), Float.valueOf(this.f2312n.x), Float.valueOf(this.f2312n.y), Float.valueOf(this.rl.x), Float.valueOf(this.rl.y));
    }

    public j(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f2312n = pointF;
        this.rl = pointF2;
        this.f2313t = pointF3;
    }
}
