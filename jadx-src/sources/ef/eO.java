package ef;

import B.j;
import FQq.SPz;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class eO implements I28, qz, aC, j.n, C {
    private final boolean J2;
    private final B.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f63817O;
    private final B.j Uo;
    private Ml mUb;
    private final gL.n nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.airbnb.lottie.Xo f63819t;
    private final B.eO xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Matrix f63818n = new Matrix();
    private final Path rl = new Path();

    @Override // ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        if (this.xMQ.t(obj, w6Var)) {
            return;
        }
        if (obj == SPz.XQ) {
            this.Uo.HI(w6Var);
        } else if (obj == SPz.f2545S) {
            this.KN.HI(w6Var);
        }
    }

    @Override // ef.I28
    public void KN(RectF rectF, Matrix matrix, boolean z2) {
        this.mUb.KN(rectF, matrix, z2);
    }

    @Override // ef.I28
    public void Uo(Canvas canvas, Matrix matrix, int i2, x0.Ml ml) {
        float fFloatValue = ((Float) this.Uo.KN()).floatValue();
        float fFloatValue2 = ((Float) this.KN.KN()).floatValue();
        float fFloatValue3 = ((Float) this.xMQ.xMQ().KN()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) this.xMQ.O().KN()).floatValue() / 100.0f;
        for (int i3 = ((int) fFloatValue) - 1; i3 >= 0; i3--) {
            this.f63818n.set(matrix);
            float f3 = i3;
            this.f63818n.preConcat(this.xMQ.Uo(f3 + fFloatValue2));
            this.mUb.Uo(canvas, this.f63818n, (int) (i2 * x0.o.xMQ(fFloatValue3, fFloatValue4, f3 / fFloatValue)), ml);
        }
    }

    @Override // ef.w6
    public String getName() {
        return this.f63817O;
    }

    @Override // ef.qz
    public Path getPath() {
        Path path = this.mUb.getPath();
        this.rl.reset();
        float fFloatValue = ((Float) this.Uo.KN()).floatValue();
        float fFloatValue2 = ((Float) this.KN.KN()).floatValue();
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.f63818n.set(this.xMQ.Uo(i2 + fFloatValue2));
            this.rl.addPath(path, this.f63818n);
        }
        return this.rl;
    }

    @Override // B.j.n
    public void n() {
        this.f63819t.invalidateSelf();
    }

    @Override // ef.w6
    public void rl(List list, List list2) {
        this.mUb.rl(list, list2);
    }

    @Override // ef.aC
    public void xMQ(ListIterator listIterator) {
        if (this.mUb != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((w6) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.mUb = new Ml(this.f63819t, this.nr, "Repeater", this.J2, arrayList, null);
    }

    public eO(com.airbnb.lottie.Xo xo, gL.n nVar, QJ.qz qzVar) {
        this.f63819t = xo;
        this.nr = nVar;
        this.f63817O = qzVar.t();
        this.J2 = qzVar.J2();
        B.Ml mlN = qzVar.rl().n();
        this.Uo = mlN;
        nVar.mUb(mlN);
        mlN.n(this);
        B.Ml mlN2 = qzVar.nr().n();
        this.KN = mlN2;
        nVar.mUb(mlN2);
        mlN2.n(this);
        B.eO eOVarRl = qzVar.O().rl();
        this.xMQ = eOVarRl;
        eOVarRl.n(nVar);
        eOVarRl.rl(this);
    }

    @Override // ES.Wre
    public void O(ES.I28 i28, int i2, List list, ES.I28 i282) {
        x0.o.gh(i28, i2, list, i282, this);
        for (int i3 = 0; i3 < this.mUb.gh().size(); i3++) {
            w6 w6Var = (w6) this.mUb.gh().get(i3);
            if (w6Var instanceof C) {
                x0.o.gh(i28, i2, list, i282, (C) w6Var);
            }
        }
    }
}
