package mfo;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class qz {
    public float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f70940O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f70941n;
    public float nr;
    public float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f70942t;
    private boolean xMQ;
    private final List Uo = new ArrayList();
    private final List KN = new ArrayList();

    static abstract class CN3 {
        static final Matrix rl = new Matrix();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Matrix f70943n = new Matrix();

        public abstract void n(Matrix matrix, rgg.j jVar, int i2, Canvas canvas);

        public final void rl(rgg.j jVar, int i2, Canvas canvas) {
            n(rl, jVar, i2, canvas);
        }

        CN3() {
        }
    }

    public static class I28 extends Wre {
        private float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private float f70944t;

        @Override // mfo.qz.Wre
        public void n(Matrix matrix, Path path) {
            Matrix matrix2 = this.f70947n;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.rl, this.f70944t);
            path.transform(matrix);
        }
    }

    public static class Ml extends Wre {
        private static final RectF KN = new RectF();
        public float J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f70945O;
        public float Uo;
        public float nr;
        public float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f70946t;

        /* JADX INFO: Access modifiers changed from: private */
        public float HI() {
            return this.f70946t;
        }

        private void Ik(float f3) {
            this.rl = f3;
        }

        private void XQ(float f3) {
            this.f70946t = f3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z(float f3) {
            this.Uo = f3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float az() {
            return this.J2;
        }

        private void ck(float f3) {
            this.f70945O = f3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float gh() {
            return this.rl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float mUb() {
            return this.f70945O;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(float f3) {
            this.J2 = f3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float qie() {
            return this.nr;
        }

        private void r(float f3) {
            this.nr = f3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float ty() {
            return this.Uo;
        }

        @Override // mfo.qz.Wre
        public void n(Matrix matrix, Path path) {
            Matrix matrix2 = this.f70947n;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = KN;
            rectF.set(gh(), HI(), qie(), mUb());
            path.arcTo(rectF, az(), ty(), false);
            path.transform(matrix);
        }

        public Ml(float f3, float f4, float f5, float f6) {
            Ik(f3);
            XQ(f4);
            r(f5);
            ck(f6);
        }
    }

    public static abstract class Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected final Matrix f70947n = new Matrix();

        public abstract void n(Matrix matrix, Path path);
    }

    class j extends CN3 {
        final /* synthetic */ Matrix nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f70949t;

        j(List list, Matrix matrix) {
            this.f70949t = list;
            this.nr = matrix;
        }

        @Override // mfo.qz.CN3
        public void n(Matrix matrix, rgg.j jVar, int i2, Canvas canvas) {
            Iterator it = this.f70949t.iterator();
            while (it.hasNext()) {
                ((CN3) it.next()).n(this.nr, jVar, i2, canvas);
            }
        }
    }

    static class n extends CN3 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Ml f70950t;

        @Override // mfo.qz.CN3
        public void n(Matrix matrix, rgg.j jVar, int i2, Canvas canvas) {
            jVar.n(canvas, matrix, new RectF(this.f70950t.gh(), this.f70950t.HI(), this.f70950t.qie(), this.f70950t.mUb()), i2, this.f70950t.az(), this.f70950t.ty());
        }

        public n(Ml ml) {
            this.f70950t = ml;
        }
    }

    static class w6 extends CN3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final float f70951O;
        private final float nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final I28 f70952t;

        @Override // mfo.qz.CN3
        public void n(Matrix matrix, rgg.j jVar, int i2, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f70952t.f70944t - this.f70951O, this.f70952t.rl - this.nr), 0.0f);
            this.f70943n.set(matrix);
            this.f70943n.preTranslate(this.nr, this.f70951O);
            this.f70943n.preRotate(t());
            jVar.rl(canvas, this.f70943n, rectF, i2);
        }

        float t() {
            return (float) Math.toDegrees(Math.atan((this.f70952t.f70944t - this.f70951O) / (this.f70952t.rl - this.nr)));
        }

        public w6(I28 i28, float f3, float f4) {
            this.f70952t = i28;
            this.nr = f3;
            this.f70951O = f4;
        }
    }

    private void Ik(float f3) {
        this.J2 = f3;
    }

    private float KN() {
        return this.J2;
    }

    private float Uo() {
        return this.f70940O;
    }

    private void XQ(float f3) {
        this.rl = f3;
    }

    private void Z(float f3) {
        this.f70941n = f3;
    }

    private void ck(float f3) {
        this.f70940O = f3;
    }

    private void o(float f3) {
        this.nr = f3;
    }

    private void r(float f3) {
        this.f70942t = f3;
    }

    boolean O() {
        return this.xMQ;
    }

    public void az(float f3, float f4) {
        I28 i28 = new I28();
        i28.rl = f3;
        i28.f70944t = f4;
        this.Uo.add(i28);
        w6 w6Var = new w6(i28, xMQ(), mUb());
        t(w6Var, w6Var.t() + 270.0f, w6Var.t() + 270.0f);
        r(f3);
        o(f4);
    }

    float gh() {
        return this.f70941n;
    }

    float mUb() {
        return this.nr;
    }

    public void n(float f3, float f4, float f5, float f6, float f7, float f8) {
        Ml ml = new Ml(f3, f4, f5, f6);
        ml.o(f7);
        ml.Z(f8);
        this.Uo.add(ml);
        n nVar = new n(ml);
        float f9 = f7 + f8;
        boolean z2 = f8 < 0.0f;
        if (z2) {
            f7 = (f7 + 180.0f) % 360.0f;
        }
        t(nVar, f7, z2 ? (180.0f + f9) % 360.0f : f9);
        double d2 = f9;
        r(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        o(((f4 + f6) * 0.5f) + (((f6 - f4) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void nr(Matrix matrix, Path path) {
        int size = this.Uo.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Wre) this.Uo.get(i2)).n(matrix, path);
        }
    }

    float qie() {
        return this.rl;
    }

    public void ty(float f3, float f4) {
        HI(f3, f4, 270.0f, 0.0f);
    }

    float xMQ() {
        return this.f70942t;
    }

    public qz() {
        ty(0.0f, 0.0f);
    }

    private void rl(float f3) {
        if (Uo() != f3) {
            float fUo = ((f3 - Uo()) + 360.0f) % 360.0f;
            if (fUo > 180.0f) {
                return;
            }
            Ml ml = new Ml(xMQ(), mUb(), xMQ(), mUb());
            ml.o(Uo());
            ml.Z(fUo);
            this.KN.add(new n(ml));
            ck(f3);
        }
    }

    private void t(CN3 cn3, float f3, float f4) {
        rl(f3);
        this.KN.add(cn3);
        ck(f4);
    }

    public void HI(float f3, float f4, float f5, float f6) {
        Z(f3);
        XQ(f4);
        r(f3);
        o(f4);
        ck(f5);
        Ik((f5 + f6) % 360.0f);
        this.Uo.clear();
        this.KN.clear();
        this.xMQ = false;
    }

    CN3 J2(Matrix matrix) {
        rl(KN());
        return new j(new ArrayList(this.KN), new Matrix(matrix));
    }
}
