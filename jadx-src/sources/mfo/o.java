package mfo;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final qz[] f70934n = new qz[4];
    private final Matrix[] rl = new Matrix[4];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Matrix[] f70935t = new Matrix[4];
    private final PointF nr = new PointF();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Path f70933O = new Path();
    private final Path J2 = new Path();
    private final qz Uo = new qz();
    private final float[] KN = new float[2];
    private final float[] xMQ = new float[2];
    private final Path mUb = new Path();
    private final Path gh = new Path();
    private boolean qie = true;

    private static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final o f70936n = new o();
    }

    public interface n {
        void n(qz qzVar, Matrix matrix, int i2);

        void rl(qz qzVar, Matrix matrix, int i2);
    }

    private void J2(int i2, RectF rectF, PointF pointF) {
        if (i2 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i2 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i2 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private Ml KN(int i2, C c2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? c2.o() : c2.Ik() : c2.xMQ() : c2.gh();
    }

    private mfo.w6 Uo(int i2, C c2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? c2.Z() : c2.r() : c2.mUb() : c2.qie();
    }

    private Wre mUb(int i2, C c2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? c2.HI() : c2.ck() : c2.ty() : c2.KN();
    }

    public void nr(C c2, float f3, RectF rectF, Path path) {
        O(c2, f3, rectF, null, path);
    }

    static final class w6 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final float f70937O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final C f70938n;
        public final n nr;
        public final Path rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final RectF f70939t;

        w6(C c2, float f3, RectF rectF, n nVar, Path path) {
            this.nr = nVar;
            this.f70938n = c2;
            this.f70937O = f3;
            this.f70939t = rectF;
            this.rl = path;
        }
    }

    private void az(w6 w6Var, int i2) {
        KN(i2, w6Var.f70938n).rl(this.f70934n[i2], 90.0f, w6Var.f70937O, w6Var.f70939t, Uo(i2, w6Var.f70938n));
        float fN = n(i2);
        this.rl[i2].reset();
        J2(i2, w6Var.f70939t, this.nr);
        Matrix matrix = this.rl[i2];
        PointF pointF = this.nr;
        matrix.setTranslate(pointF.x, pointF.y);
        this.rl[i2].preRotate(fN);
    }

    public static o gh() {
        return j.f70936n;
    }

    private float n(int i2) {
        return ((i2 + 1) % 4) * 90;
    }

    private boolean qie(Path path, int i2) {
        this.gh.reset();
        this.f70934n[i2].nr(this.rl[i2], this.gh);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.gh.computeBounds(rectF, true);
        path.op(this.gh, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void rl(w6 w6Var, int i2) {
        this.KN[0] = this.f70934n[i2].gh();
        this.KN[1] = this.f70934n[i2].qie();
        this.rl[i2].mapPoints(this.KN);
        if (i2 == 0) {
            Path path = w6Var.rl;
            float[] fArr = this.KN;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = w6Var.rl;
            float[] fArr2 = this.KN;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f70934n[i2].nr(this.rl[i2], w6Var.rl);
        n nVar = w6Var.nr;
        if (nVar != null) {
            nVar.rl(this.f70934n[i2], this.rl[i2], i2);
        }
    }

    private void t(w6 w6Var, int i2) {
        int i3 = (i2 + 1) % 4;
        this.KN[0] = this.f70934n[i2].xMQ();
        this.KN[1] = this.f70934n[i2].mUb();
        this.rl[i2].mapPoints(this.KN);
        this.xMQ[0] = this.f70934n[i3].gh();
        this.xMQ[1] = this.f70934n[i3].qie();
        this.rl[i3].mapPoints(this.xMQ);
        float f3 = this.KN[0];
        float[] fArr = this.xMQ;
        float fMax = Math.max(((float) Math.hypot(f3 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fXMQ = xMQ(w6Var.f70939t, i2);
        this.Uo.ty(0.0f, 0.0f);
        Wre wreMUb = mUb(i2, w6Var.f70938n);
        wreMUb.rl(fMax, fXMQ, w6Var.f70937O, this.Uo);
        this.mUb.reset();
        this.Uo.nr(this.f70935t[i2], this.mUb);
        if (this.qie && (wreMUb.n() || qie(this.mUb, i2) || qie(this.mUb, i3))) {
            Path path = this.mUb;
            path.op(path, this.J2, Path.Op.DIFFERENCE);
            this.KN[0] = this.Uo.gh();
            this.KN[1] = this.Uo.qie();
            this.f70935t[i2].mapPoints(this.KN);
            Path path2 = this.f70933O;
            float[] fArr2 = this.KN;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.Uo.nr(this.f70935t[i2], this.f70933O);
        } else {
            this.Uo.nr(this.f70935t[i2], w6Var.rl);
        }
        n nVar = w6Var.nr;
        if (nVar != null) {
            nVar.n(this.Uo, this.f70935t[i2], i2);
        }
    }

    private void ty(int i2) {
        this.KN[0] = this.f70934n[i2].xMQ();
        this.KN[1] = this.f70934n[i2].mUb();
        this.rl[i2].mapPoints(this.KN);
        float fN = n(i2);
        this.f70935t[i2].reset();
        Matrix matrix = this.f70935t[i2];
        float[] fArr = this.KN;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f70935t[i2].preRotate(fN);
    }

    private float xMQ(RectF rectF, int i2) {
        float[] fArr = this.KN;
        qz qzVar = this.f70934n[i2];
        fArr[0] = qzVar.f70942t;
        fArr[1] = qzVar.nr;
        this.rl[i2].mapPoints(fArr);
        return (i2 == 1 || i2 == 3) ? Math.abs(rectF.centerX() - this.KN[0]) : Math.abs(rectF.centerY() - this.KN[1]);
    }

    public o() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f70934n[i2] = new qz();
            this.rl[i2] = new Matrix();
            this.f70935t[i2] = new Matrix();
        }
    }

    public void O(C c2, float f3, RectF rectF, n nVar, Path path) {
        path.rewind();
        this.f70933O.rewind();
        this.J2.rewind();
        this.J2.addRect(rectF, Path.Direction.CW);
        w6 w6Var = new w6(c2, f3, rectF, nVar, path);
        for (int i2 = 0; i2 < 4; i2++) {
            az(w6Var, i2);
            ty(i2);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            rl(w6Var, i3);
            t(w6Var, i3);
        }
        path.close();
        this.f70933O.close();
        if (!this.f70933O.isEmpty()) {
            path.op(this.f70933O, Path.Op.UNION);
        }
    }
}
