package gL;

import B.z;
import FQq.SPz;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import gL.I28;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x0.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class w6 extends n {
    private B.j E2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final RectF f67515N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final RectF f67516T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final RectF f67517X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f67518e;
    private final Xo nHg;
    private B.w6 rV9;
    private final Xo.j s7N;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f67519v;
    private float wTp;

    @Override // gL.n
    protected void N(ES.I28 i28, int i2, List list, ES.I28 i282) {
        for (int i3 = 0; i3 < this.f67518e.size(); i3++) {
            ((n) this.f67518e.get(i3)).O(i28, i2, list, i282);
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67520n;

        static {
            int[] iArr = new int[I28.n.values().length];
            f67520n = iArr;
            try {
                iArr[I28.n.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67520n[I28.n.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public float Xw() {
        return this.wTp;
    }

    public void jB(boolean z2) {
        this.f67519v = z2;
    }

    public w6(com.airbnb.lottie.Xo xo, I28 i28, List list, FQq.Dsr dsr) {
        int i2;
        n nVar;
        super(xo, i28);
        this.f67518e = new ArrayList();
        this.f67517X = new RectF();
        this.f67516T = new RectF();
        this.f67515N = new RectF();
        this.nHg = new Xo();
        this.s7N = new Xo.j();
        this.f67519v = true;
        GO.n nVarS = i28.S();
        if (nVarS != null) {
            B.Ml mlN = nVarS.n();
            this.E2 = mlN;
            mUb(mlN);
            this.E2.n(this);
        } else {
            this.E2 = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(dsr.gh().size());
        int size = list.size() - 1;
        n nVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            I28 i282 = (I28) list.get(size);
            n nVarS2 = n.S(this, i282, xo, dsr);
            if (nVarS2 != null) {
                longSparseArray.gh(nVarS2.g().O(), nVarS2);
                if (nVar2 != null) {
                    nVar2.nHg(nVarS2);
                    nVar2 = null;
                } else {
                    this.f67518e.add(0, nVarS2);
                    int i3 = j.f67520n[i282.xMQ().ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        nVar2 = nVarS2;
                    }
                }
            }
            size--;
        }
        for (i2 = 0; i2 < longSparseArray.ty(); i2++) {
            n nVar3 = (n) longSparseArray.O(longSparseArray.mUb(i2));
            if (nVar3 != null && (nVar = (n) longSparseArray.O(nVar3.g().gh())) != null) {
                nVar3.wTp(nVar);
            }
        }
        if (nY() != null) {
            this.rV9 = new B.w6(this, this, nY());
        }
    }

    @Override // gL.n, ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        B.w6 w6Var2;
        B.w6 w6Var3;
        B.w6 w6Var4;
        B.w6 w6Var5;
        B.w6 w6Var6;
        super.J2(obj, w6Var);
        if (obj == SPz.E2) {
            if (w6Var == null) {
                B.j jVar = this.E2;
                if (jVar != null) {
                    jVar.HI(null);
                    return;
                }
                return;
            }
            z zVar = new z(w6Var);
            this.E2 = zVar;
            zVar.n(this);
            mUb(this.E2);
            return;
        }
        if (obj == SPz.f2544O && (w6Var6 = this.rV9) != null) {
            w6Var6.t(w6Var);
            return;
        }
        if (obj == SPz.f2547X && (w6Var5 = this.rV9) != null) {
            w6Var5.J2(w6Var);
            return;
        }
        if (obj == SPz.f2546T && (w6Var4 = this.rV9) != null) {
            w6Var4.nr(w6Var);
            return;
        }
        if (obj == SPz.f2543N && (w6Var3 = this.rV9) != null) {
            w6Var3.O(w6Var);
        } else if (obj == SPz.nHg && (w6Var2 = this.rV9) != null) {
            w6Var2.Uo(w6Var);
        }
    }

    @Override // gL.n, ef.I28
    public void KN(RectF rectF, Matrix matrix, boolean z2) {
        super.KN(rectF, matrix, z2);
        for (int size = this.f67518e.size() - 1; size >= 0; size--) {
            this.f67517X.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((n) this.f67518e.get(size)).KN(this.f67517X, this.HI, true);
            rectF.union(this.f67517X);
        }
    }

    @Override // gL.n
    void XQ(Canvas canvas, Matrix matrix, int i2, x0.Ml ml) {
        boolean z2;
        Canvas canvasXMQ;
        if (FQq.I28.KN()) {
            FQq.I28.rl("CompositionLayer#draw");
        }
        boolean z3 = false;
        if (ml == null && this.rV9 == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i3 = 255;
        if ((this.ck.Nxk() && this.f67518e.size() > 1 && i2 != 255) || (z2 && this.ck.Y())) {
            z3 = true;
        }
        if (!z3) {
            i3 = i2;
        }
        B.w6 w6Var = this.rV9;
        if (w6Var != null) {
            ml = w6Var.rl(matrix, i3);
        }
        if (!this.f67519v && "__container".equals(this.Ik.mUb())) {
            this.f67516T.setEmpty();
            Iterator it = this.f67518e.iterator();
            while (it.hasNext()) {
                ((n) it.next()).KN(this.f67515N, matrix, true);
                this.f67516T.union(this.f67515N);
            }
        } else {
            this.f67516T.set(0.0f, 0.0f, this.Ik.az(), this.Ik.qie());
            matrix.mapRect(this.f67516T);
        }
        if (z3) {
            this.s7N.J2();
            Xo.j jVar = this.s7N;
            jVar.f75160n = i2;
            if (ml != null) {
                ml.rl(jVar);
                ml = null;
            }
            canvasXMQ = this.nHg.xMQ(canvas, this.f67516T, this.s7N);
        } else {
            canvasXMQ = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.f67516T)) {
            for (int size = this.f67518e.size() - 1; size >= 0; size--) {
                ((n) this.f67518e.get(size)).Uo(canvasXMQ, matrix, i3, ml);
            }
        }
        if (z3) {
            this.nHg.O();
        }
        canvas.restore();
        if (FQq.I28.KN()) {
            FQq.I28.t("CompositionLayer#draw");
        }
    }

    @Override // gL.n
    public void s7N(boolean z2) {
        super.s7N(z2);
        Iterator it = this.f67518e.iterator();
        while (it.hasNext()) {
            ((n) it.next()).s7N(z2);
        }
    }

    @Override // gL.n
    public void v(float f3) {
        if (FQq.I28.KN()) {
            FQq.I28.rl("CompositionLayer#setProgress");
        }
        this.wTp = f3;
        super.v(f3);
        if (this.E2 != null) {
            f3 = ((((Float) this.E2.KN()).floatValue() * this.Ik.t().xMQ()) - this.Ik.t().ck()) / (this.ck.nHg().O() + 0.01f);
        }
        if (this.E2 == null) {
            f3 -= this.Ik.o();
        }
        if (this.Ik.WPU() != 0.0f && !"__container".equals(this.Ik.mUb())) {
            f3 /= this.Ik.WPU();
        }
        for (int size = this.f67518e.size() - 1; size >= 0; size--) {
            ((n) this.f67518e.get(size)).v(f3);
        }
        if (FQq.I28.KN()) {
            FQq.I28.t("CompositionLayer#setProgress");
        }
    }
}
