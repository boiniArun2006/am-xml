package gL;

import B.eO;
import B.j;
import QJ.Dsr;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.graphics.PaintCompat;
import c.aC;
import com.airbnb.lottie.Xo;
import gL.I28;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n implements ef.I28, j.n, ES.Wre {
    protected final Matrix HI;
    final I28 Ik;
    private final Paint J2;
    private final Paint KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Paint f67506O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private List f67507S;
    private final Paint Uo;
    private boolean ViF;
    private final List WPU;
    private n XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private n f67508Z;
    public final eO aYN;
    private final RectF az;
    final Xo ck;
    H.j fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f67509g;
    private final RectF gh;
    BlurMaskFilter iF;
    private final RectF mUb;
    private boolean nY;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private B.Ml f67511o;
    private final RectF qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private B.fuX f67512r;
    float te;
    private final String ty;
    private final RectF xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f67510n = new Path();
    private final Matrix rl = new Matrix();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Matrix f67513t = new Matrix();
    private final Paint nr = new H.j(1);

    void N(ES.I28 i28, int i2, List list, ES.I28 i282) {
    }

    abstract void XQ(Canvas canvas, Matrix matrix, int i2, x0.Ml ml);

    @Override // ef.w6
    public void rl(List list, List list2) {
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67514n;
        static final /* synthetic */ int[] rl;

        static {
            int[] iArr = new int[Dsr.j.values().length];
            rl = iArr;
            try {
                iArr[Dsr.j.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rl[Dsr.j.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                rl[Dsr.j.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                rl[Dsr.j.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[I28.j.values().length];
            f67514n = iArr2;
            try {
                iArr2[I28.j.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67514n[I28.j.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67514n[I28.j.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f67514n[I28.j.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f67514n[I28.j.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f67514n[I28.j.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f67514n[I28.j.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void HI(Canvas canvas, Matrix matrix, B.j jVar, B.j jVar2) {
        x0.eO.ty(canvas, this.xMQ, this.J2);
        canvas.drawRect(this.xMQ, this.nr);
        this.J2.setAlpha((int) (((Integer) jVar2.KN()).intValue() * 2.55f));
        this.f67510n.set((Path) jVar.KN());
        this.f67510n.transform(matrix);
        canvas.drawPath(this.f67510n, this.J2);
        canvas.restore();
    }

    static n S(w6 w6Var, I28 i28, Xo xo, FQq.Dsr dsr) {
        switch (j.f67514n[i28.Uo().ordinal()]) {
            case 1:
                return new CN3(xo, i28, w6Var, dsr);
            case 2:
                return new w6(xo, i28, dsr.HI(i28.ty()), dsr);
            case 3:
                return new fuX(xo, i28);
            case 4:
                return new Ml(xo, i28);
            case 5:
                return new Wre(xo, i28);
            case 6:
                return new Dsr(xo, i28);
            default:
                x0.CN3.t("Unknown layer type " + i28.Uo());
                return null;
        }
    }

    private void X(float f3) {
        this.ck.nHg().ty().n(this.Ik.mUb(), f3);
    }

    private void az(Canvas canvas, Matrix matrix, B.j jVar, B.j jVar2) {
        x0.eO.ty(canvas, this.xMQ, this.nr);
        canvas.drawRect(this.xMQ, this.nr);
        this.f67510n.set((Path) jVar.KN());
        this.f67510n.transform(matrix);
        this.nr.setAlpha((int) (((Integer) jVar2.KN()).intValue() * 2.55f));
        canvas.drawPath(this.f67510n, this.J2);
        canvas.restore();
    }

    private void bzg() {
        if (this.Ik.J2().isEmpty()) {
            rV9(true);
            return;
        }
        B.Ml ml = new B.Ml(this.Ik.J2());
        this.f67511o = ml;
        ml.az();
        this.f67511o.n(new j.n() { // from class: gL.j
            @Override // B.j.n
            public final void n() {
                n nVar = this.f67505n;
                nVar.rV9(nVar.f67511o.r() == 1.0f);
            }
        });
        rV9(((Float) this.f67511o.KN()).floatValue() == 1.0f);
        mUb(this.f67511o);
    }

    private void e() {
        this.ck.invalidateSelf();
    }

    private void fD(RectF rectF, Matrix matrix) {
        this.gh.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (te()) {
            int size = this.f67512r.rl().size();
            for (int i2 = 0; i2 < size; i2++) {
                QJ.Dsr dsr = (QJ.Dsr) this.f67512r.rl().get(i2);
                Path path = (Path) ((B.j) this.f67512r.n().get(i2)).KN();
                if (path != null) {
                    this.f67510n.set(path);
                    this.f67510n.transform(matrix);
                    int i3 = j.rl[dsr.n().ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        return;
                    }
                    if ((i3 == 3 || i3 == 4) && dsr.nr()) {
                        return;
                    }
                    this.f67510n.computeBounds(this.az, false);
                    if (i2 == 0) {
                        this.gh.set(this.az);
                    } else {
                        RectF rectF2 = this.gh;
                        rectF2.set(Math.min(rectF2.left, this.az.left), Math.min(this.gh.top, this.az.top), Math.max(this.gh.right, this.az.right), Math.max(this.gh.bottom, this.az.bottom));
                    }
                }
            }
            if (rectF.intersect(this.gh)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void o() {
        if (this.f67507S != null) {
            return;
        }
        if (this.XQ == null) {
            this.f67507S = Collections.EMPTY_LIST;
            return;
        }
        this.f67507S = new ArrayList();
        for (n nVar = this.XQ; nVar != null; nVar = nVar.XQ) {
            this.f67507S.add(nVar);
        }
    }

    private void qie(Canvas canvas, Matrix matrix, B.j jVar, B.j jVar2) {
        x0.eO.ty(canvas, this.xMQ, this.f67506O);
        this.f67510n.set((Path) jVar.KN());
        this.f67510n.transform(matrix);
        this.nr.setAlpha((int) (((Integer) jVar2.KN()).intValue() * 2.55f));
        canvas.drawPath(this.f67510n, this.nr);
        canvas.restore();
    }

    private boolean r() {
        if (this.f67512r.n().isEmpty()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f67512r.rl().size(); i2++) {
            if (((QJ.Dsr) this.f67512r.rl().get(i2)).n() != Dsr.j.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rV9(boolean z2) {
        if (z2 != this.ViF) {
            this.ViF = z2;
            e();
        }
    }

    private void ty(Canvas canvas, Matrix matrix, B.j jVar, B.j jVar2) {
        x0.eO.ty(canvas, this.xMQ, this.f67506O);
        canvas.drawRect(this.xMQ, this.nr);
        this.J2.setAlpha((int) (((Integer) jVar2.KN()).intValue() * 2.55f));
        this.f67510n.set((Path) jVar.KN());
        this.f67510n.transform(matrix);
        canvas.drawPath(this.f67510n, this.J2);
        canvas.restore();
    }

    public void J2(Object obj, Ect.w6 w6Var) {
        this.aYN.t(obj, w6Var);
    }

    @Override // ef.I28
    public void KN(RectF rectF, Matrix matrix, boolean z2) {
        this.xMQ.set(0.0f, 0.0f, 0.0f, 0.0f);
        o();
        this.HI.set(matrix);
        if (z2) {
            List list = this.f67507S;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.HI.preConcat(((n) this.f67507S.get(size)).aYN.J2());
                }
            } else {
                n nVar = this.XQ;
                if (nVar != null) {
                    this.HI.preConcat(nVar.aYN.J2());
                }
            }
        }
        this.HI.preConcat(this.aYN.J2());
    }

    @Override // ES.Wre
    public void O(ES.I28 i28, int i2, List list, ES.I28 i282) {
        n nVar = this.f67508Z;
        if (nVar != null) {
            ES.I28 i28N = i282.n(nVar.getName());
            if (i28.t(this.f67508Z.getName(), i2)) {
                list.add(i28N.xMQ(this.f67508Z));
            }
            if (i28.Uo(this.f67508Z.getName(), i2) && i28.KN(getName(), i2)) {
                this.f67508Z.N(i28, i28.O(this.f67508Z.getName(), i2) + i2, list, i28N);
            }
        }
        if (i28.Uo(getName(), i2)) {
            if (!"__container".equals(getName())) {
                i282 = i282.n(getName());
                if (i28.t(getName(), i2)) {
                    list.add(i282.xMQ(this));
                }
            }
            if (i28.KN(getName(), i2)) {
                N(i28, i2 + i28.O(getName(), i2), list, i282);
            }
        }
    }

    public void T(B.j jVar) {
        this.WPU.remove(jVar);
    }

    @Override // ef.I28
    public void Uo(Canvas canvas, Matrix matrix, int i2, x0.Ml ml) {
        Canvas canvas2;
        Paint paint;
        Integer num;
        FQq.I28.rl(this.ty);
        if (!this.ViF || this.Ik.ViF()) {
            FQq.I28.t(this.ty);
            return;
        }
        o();
        if (FQq.I28.KN()) {
            FQq.I28.rl("Layer#parentMatrix");
        }
        this.rl.reset();
        this.rl.set(matrix);
        for (int size = this.f67507S.size() - 1; size >= 0; size--) {
            this.rl.preConcat(((n) this.f67507S.get(size)).aYN.J2());
        }
        if (FQq.I28.KN()) {
            FQq.I28.t("Layer#parentMatrix");
        }
        B.j jVarKN = this.aYN.KN();
        int iIntValue = (int) ((((i2 / 255.0f) * ((jVarKN == null || (num = (Integer) jVarKN.KN()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
        if (!iF() && !te() && WPU() == QJ.fuX.NORMAL) {
            this.rl.preConcat(this.aYN.J2());
            if (FQq.I28.KN()) {
                FQq.I28.rl("Layer#drawLayer");
            }
            XQ(canvas, this.rl, iIntValue, ml);
            if (FQq.I28.KN()) {
                FQq.I28.t("Layer#drawLayer");
            }
            X(FQq.I28.t(this.ty));
            return;
        }
        if (FQq.I28.KN()) {
            FQq.I28.rl("Layer#computeBounds");
        }
        KN(this.xMQ, this.rl, false);
        E2(this.xMQ, matrix);
        this.rl.preConcat(this.aYN.J2());
        fD(this.xMQ, this.rl);
        this.mUb.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f67513t);
        if (!this.f67513t.isIdentity()) {
            Matrix matrix2 = this.f67513t;
            matrix2.invert(matrix2);
            this.f67513t.mapRect(this.mUb);
        }
        if (!this.xMQ.intersect(this.mUb)) {
            this.xMQ.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (FQq.I28.KN()) {
            FQq.I28.t("Layer#computeBounds");
        }
        if (this.xMQ.width() < 1.0f || this.xMQ.height() < 1.0f) {
            canvas2 = canvas;
        } else {
            if (FQq.I28.KN()) {
                FQq.I28.rl("Layer#saveLayer");
            }
            this.nr.setAlpha(255);
            PaintCompat.rl(this.nr, WPU().rl());
            x0.eO.ty(canvas, this.xMQ, this.nr);
            if (FQq.I28.KN()) {
                FQq.I28.t("Layer#saveLayer");
            }
            if (WPU() != QJ.fuX.MULTIPLY) {
                Z(canvas);
                canvas2 = canvas;
            } else {
                if (this.fD == null) {
                    H.j jVar = new H.j();
                    this.fD = jVar;
                    jVar.setColor(-1);
                }
                RectF rectF = this.xMQ;
                canvas2 = canvas;
                canvas2.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.fD);
            }
            if (FQq.I28.KN()) {
                FQq.I28.rl("Layer#drawLayer");
            }
            XQ(canvas2, this.rl, iIntValue, ml);
            if (FQq.I28.KN()) {
                FQq.I28.t("Layer#drawLayer");
            }
            if (te()) {
                ck(canvas2, this.rl);
            }
            if (iF()) {
                if (FQq.I28.KN()) {
                    FQq.I28.rl("Layer#drawMatte");
                    FQq.I28.rl("Layer#saveLayer");
                }
                x0.eO.HI(canvas2, this.xMQ, this.Uo, 19);
                if (FQq.I28.KN()) {
                    FQq.I28.t("Layer#saveLayer");
                }
                Z(canvas2);
                this.f67508Z.Uo(canvas2, matrix, iIntValue, null);
                if (FQq.I28.KN()) {
                    FQq.I28.rl("Layer#restoreLayer");
                }
                canvas2.restore();
                if (FQq.I28.KN()) {
                    FQq.I28.t("Layer#restoreLayer");
                    FQq.I28.t("Layer#drawMatte");
                }
            }
            if (FQq.I28.KN()) {
                FQq.I28.rl("Layer#restoreLayer");
            }
            canvas2.restore();
            if (FQq.I28.KN()) {
                FQq.I28.t("Layer#restoreLayer");
            }
        }
        if (this.nY && (paint = this.f67509g) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f67509g.setColor(-251901);
            this.f67509g.setStrokeWidth(4.0f);
            canvas2.drawRect(this.xMQ, this.f67509g);
            this.f67509g.setStyle(Paint.Style.FILL);
            this.f67509g.setColor(1357638635);
            canvas2.drawRect(this.xMQ, this.f67509g);
        }
        X(FQq.I28.t(this.ty));
    }

    public BlurMaskFilter ViF(float f3) {
        if (this.te == f3) {
            return this.iF;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f3 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.iF = blurMaskFilter;
        this.te = f3;
        return blurMaskFilter;
    }

    public QJ.fuX WPU() {
        return this.Ik.n();
    }

    public QJ.j aYN() {
        return this.Ik.rl();
    }

    I28 g() {
        return this.Ik;
    }

    @Override // ef.w6
    public String getName() {
        return this.Ik.mUb();
    }

    boolean iF() {
        return this.f67508Z != null;
    }

    public void mUb(B.j jVar) {
        if (jVar == null) {
            return;
        }
        this.WPU.add(jVar);
    }

    void nHg(n nVar) {
        this.f67508Z = nVar;
    }

    public aC nY() {
        return this.Ik.nr();
    }

    void s7N(boolean z2) {
        if (z2 && this.f67509g == null) {
            this.f67509g = new H.j();
        }
        this.nY = z2;
    }

    boolean te() {
        B.fuX fux = this.f67512r;
        return (fux == null || fux.n().isEmpty()) ? false : true;
    }

    void wTp(n nVar) {
        this.XQ = nVar;
    }

    n(Xo xo, I28 i28) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f67506O = new H.j(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.J2 = new H.j(1, mode2);
        H.j jVar = new H.j(1);
        this.Uo = jVar;
        this.KN = new H.j(PorterDuff.Mode.CLEAR);
        this.xMQ = new RectF();
        this.mUb = new RectF();
        this.gh = new RectF();
        this.qie = new RectF();
        this.az = new RectF();
        this.HI = new Matrix();
        this.WPU = new ArrayList();
        this.ViF = true;
        this.te = 0.0f;
        this.ck = xo;
        this.Ik = i28;
        this.ty = i28.mUb() + "#draw";
        if (i28.xMQ() == I28.n.INVERT) {
            jVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            jVar.setXfermode(new PorterDuffXfermode(mode));
        }
        eO eOVarRl = i28.aYN().rl();
        this.aYN = eOVarRl;
        eOVarRl.rl(this);
        if (i28.KN() != null && !i28.KN().isEmpty()) {
            B.fuX fux = new B.fuX(i28.KN());
            this.f67512r = fux;
            Iterator it = fux.n().iterator();
            while (it.hasNext()) {
                ((B.j) it.next()).n(this);
            }
            for (B.j jVar2 : this.f67512r.t()) {
                mUb(jVar2);
                jVar2.n(this);
            }
        }
        bzg();
    }

    private void E2(RectF rectF, Matrix matrix) {
        if (iF() && this.Ik.xMQ() != I28.n.INVERT) {
            this.qie.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f67508Z.KN(this.qie, matrix, true);
            if (!rectF.intersect(this.qie)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    private void Ik(Canvas canvas, Matrix matrix, B.j jVar) {
        this.f67510n.set((Path) jVar.KN());
        this.f67510n.transform(matrix);
        canvas.drawPath(this.f67510n, this.J2);
    }

    private void Z(Canvas canvas) {
        if (FQq.I28.KN()) {
            FQq.I28.rl("Layer#clearLayer");
        }
        RectF rectF = this.xMQ;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.KN);
        if (FQq.I28.KN()) {
            FQq.I28.t("Layer#clearLayer");
        }
    }

    private void ck(Canvas canvas, Matrix matrix) {
        if (FQq.I28.KN()) {
            FQq.I28.rl("Layer#saveLayer");
        }
        x0.eO.HI(canvas, this.xMQ, this.f67506O, 19);
        if (Build.VERSION.SDK_INT < 28) {
            Z(canvas);
        }
        if (FQq.I28.KN()) {
            FQq.I28.t("Layer#saveLayer");
        }
        for (int i2 = 0; i2 < this.f67512r.rl().size(); i2++) {
            QJ.Dsr dsr = (QJ.Dsr) this.f67512r.rl().get(i2);
            B.j jVar = (B.j) this.f67512r.n().get(i2);
            B.j jVar2 = (B.j) this.f67512r.t().get(i2);
            int i3 = j.rl[dsr.n().ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            if (dsr.nr()) {
                                az(canvas, matrix, jVar, jVar2);
                            } else {
                                gh(canvas, matrix, jVar, jVar2);
                            }
                        }
                    } else if (dsr.nr()) {
                        ty(canvas, matrix, jVar, jVar2);
                    } else {
                        qie(canvas, matrix, jVar, jVar2);
                    }
                } else {
                    if (i2 == 0) {
                        this.nr.setColor(-16777216);
                        this.nr.setAlpha(255);
                        canvas.drawRect(this.xMQ, this.nr);
                    }
                    if (dsr.nr()) {
                        HI(canvas, matrix, jVar, jVar2);
                    } else {
                        Ik(canvas, matrix, jVar);
                    }
                }
            } else if (r()) {
                this.nr.setAlpha(255);
                canvas.drawRect(this.xMQ, this.nr);
            }
        }
        if (FQq.I28.KN()) {
            FQq.I28.rl("Layer#restoreLayer");
        }
        canvas.restore();
        if (FQq.I28.KN()) {
            FQq.I28.t("Layer#restoreLayer");
        }
    }

    private void gh(Canvas canvas, Matrix matrix, B.j jVar, B.j jVar2) {
        this.f67510n.set((Path) jVar.KN());
        this.f67510n.transform(matrix);
        this.nr.setAlpha((int) (((Integer) jVar2.KN()).intValue() * 2.55f));
        canvas.drawPath(this.f67510n, this.nr);
    }

    @Override // B.j.n
    public void n() {
        e();
    }

    void v(float f3) {
        if (FQq.I28.KN()) {
            FQq.I28.rl("BaseLayer#setProgress");
            FQq.I28.rl("BaseLayer#setProgress.transform");
        }
        this.aYN.mUb(f3);
        if (FQq.I28.KN()) {
            FQq.I28.t("BaseLayer#setProgress.transform");
        }
        if (this.f67512r != null) {
            if (FQq.I28.KN()) {
                FQq.I28.rl("BaseLayer#setProgress.mask");
            }
            for (int i2 = 0; i2 < this.f67512r.n().size(); i2++) {
                ((B.j) this.f67512r.n().get(i2)).ty(f3);
            }
            if (FQq.I28.KN()) {
                FQq.I28.t("BaseLayer#setProgress.mask");
            }
        }
        if (this.f67511o != null) {
            if (FQq.I28.KN()) {
                FQq.I28.rl("BaseLayer#setProgress.inout");
            }
            this.f67511o.ty(f3);
            if (FQq.I28.KN()) {
                FQq.I28.t("BaseLayer#setProgress.inout");
            }
        }
        if (this.f67508Z != null) {
            if (FQq.I28.KN()) {
                FQq.I28.rl("BaseLayer#setProgress.matte");
            }
            this.f67508Z.v(f3);
            if (FQq.I28.KN()) {
                FQq.I28.t("BaseLayer#setProgress.matte");
            }
        }
        if (FQq.I28.KN()) {
            FQq.I28.rl("BaseLayer#setProgress.animations." + this.WPU.size());
        }
        for (int i3 = 0; i3 < this.WPU.size(); i3++) {
            ((B.j) this.WPU.get(i3)).ty(f3);
        }
        if (FQq.I28.KN()) {
            FQq.I28.t("BaseLayer#setProgress.animations." + this.WPU.size());
            FQq.I28.t("BaseLayer#setProgress");
        }
    }
}
