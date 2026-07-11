package gL;

import ES.n;
import FQq.SPz;
import GO.C;
import GO.o;
import GO.qz;
import QJ.s4;
import QJ.z;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.Xo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x0.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Dsr extends gL.n {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private B.j f67458B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private B.j f67459D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private B.j f67460E;
    private final StringBuilder E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private B.j f67461FX;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private B.j f67462I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private B.j f67463J;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private B.j f67464M;
    private B.j M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Paint f67465N;
    private B.j P5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Paint f67466T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private B.j f67467U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final Matrix f67468X;
    private s4 Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private B.j f67469a;
    private final FQq.Dsr bzg;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f67470e;
    private B.j eF;
    private B.j jB;
    private final Map nHg;
    private B.j p5;
    private final Xo rV9;
    private final LongSparseArray s7N;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final B.Xo f67471v;
    private final List wTp;

    private static class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f67472n;
        private float rl;

        private Ml() {
            this.f67472n = "";
            this.rl = 0.0f;
        }

        void t(String str, float f3) {
            this.f67472n = str;
            this.rl = f3;
        }

        /* synthetic */ Ml(j jVar) {
            this();
        }
    }

    class j extends Paint {
        j(int i2) {
            super(i2);
            setStyle(Paint.Style.FILL);
        }
    }

    class n extends Paint {
        n(int i2) {
            super(i2);
            setStyle(Paint.Style.STROKE);
        }
    }

    private void E(String str, ES.n nVar, ES.w6 w6Var, Canvas canvas, float f3, float f4, float f5, int i2) {
        ES.n nVar2;
        Canvas canvas2;
        float f6;
        int i3;
        int i5 = 0;
        while (i5 < str.length()) {
            ES.Ml ml = (ES.Ml) this.bzg.t().O(ES.Ml.t(str.charAt(i5), w6Var.n(), w6Var.t()));
            if (ml == null) {
                nVar2 = nVar;
                canvas2 = canvas;
                f6 = f4;
                i3 = i2;
            } else {
                nVar2 = nVar;
                canvas2 = canvas;
                f6 = f4;
                i3 = i2;
                P5(ml, f6, nVar2, canvas2, i5, i3);
                canvas2.translate((((float) ml.rl()) * f6 * eO.O()) + f5, 0.0f);
            }
            i5++;
            f4 = f6;
            nVar = nVar2;
            canvas = canvas2;
            i2 = i3;
        }
    }

    private void p5(String str, ES.n nVar, Canvas canvas, float f3, int i2, int i3) {
        int length = 0;
        while (length < str.length()) {
            String strXw = Xw(str, length);
            ES.n nVar2 = nVar;
            Canvas canvas2 = canvas;
            M7(strXw, nVar2, canvas2, i2 + length, i3);
            canvas2.translate(this.f67466T.measureText(strXw) + f3, 0.0f);
            length += strXw.length();
            nVar = nVar2;
            canvas = canvas2;
        }
    }

    static /* synthetic */ class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67475n;

        static {
            int[] iArr = new int[n.j.values().length];
            f67475n = iArr;
            try {
                iArr[n.j.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67475n[n.j.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67475n[n.j.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Ml B(int i2) {
        for (int size = this.wTp.size(); size < i2; size++) {
            this.wTp.add(new Ml(null));
        }
        return (Ml) this.wTp.get(i2 - 1);
    }

    private List D(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void FX(ES.n nVar, Matrix matrix, ES.w6 w6Var, Canvas canvas, int i2) {
        float fFloatValue;
        int i3;
        float f3;
        float f4;
        Dsr dsr = this;
        ES.n nVar2 = nVar;
        B.j jVar = dsr.f67458B;
        float fFloatValue2 = (jVar != null ? ((Float) jVar.KN()).floatValue() : nVar2.f2316t) / 100.0f;
        float fUo = eO.Uo(matrix);
        List listD = dsr.D(nVar2.f2315n);
        int size = listD.size();
        float f5 = nVar2.f2314O / 10.0f;
        B.j jVar2 = dsr.f67464M;
        if (jVar2 == null) {
            B.j jVar3 = dsr.f67460E;
            if (jVar3 != null) {
                fFloatValue = ((Float) jVar3.KN()).floatValue();
            }
            float f6 = f5;
            int i5 = -1;
            i3 = 0;
            while (i3 < size) {
                String str = (String) listD.get(i3);
                PointF pointF = nVar2.az;
                List listY = dsr.Y(str, pointF == null ? 0.0f : pointF.x, w6Var, fFloatValue2, f6, true);
                int i7 = 0;
                while (i7 < listY.size()) {
                    Ml ml = (Ml) listY.get(i7);
                    i5++;
                    canvas.save();
                    if (dsr.Nxk(canvas, nVar2, i5, ml.rl)) {
                        float f7 = fFloatValue2;
                        ES.n nVar3 = nVar2;
                        f3 = f6;
                        f4 = fUo;
                        dsr.E(ml.f67472n, nVar3, w6Var, canvas, f4, f7, f3, i2);
                        fFloatValue2 = f7;
                    } else {
                        f3 = f6;
                        f4 = fUo;
                    }
                    canvas.restore();
                    i7++;
                    dsr = this;
                    fUo = f4;
                    f6 = f3;
                    nVar2 = nVar;
                }
                i3++;
                dsr = this;
                f6 = f6;
                nVar2 = nVar;
            }
        }
        fFloatValue = ((Float) jVar2.KN()).floatValue();
        f5 += fFloatValue;
        float f62 = f5;
        int i52 = -1;
        i3 = 0;
        while (i3 < size) {
        }
    }

    private boolean I(int i2) {
        int length = ((ES.n) this.f67471v.KN()).f2315n.length();
        B.j jVar = this.f67459D;
        if (jVar == null || this.f67469a == null) {
            return true;
        }
        int iMin = Math.min(((Integer) jVar.KN()).intValue(), ((Integer) this.f67469a.KN()).intValue());
        int iMax = Math.max(((Integer) this.f67459D.KN()).intValue(), ((Integer) this.f67469a.KN()).intValue());
        B.j jVar2 = this.f67462I;
        if (jVar2 != null) {
            int iIntValue = ((Integer) jVar2.KN()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.Xw == s4.INDEX) {
            return i2 >= iMin && i2 < iMax;
        }
        float f3 = (i2 / length) * 100.0f;
        return f3 >= ((float) iMin) && f3 < ((float) iMax);
    }

    private List J(ES.Ml ml) {
        if (this.nHg.containsKey(ml)) {
            return (List) this.nHg.get(ml);
        }
        List listN = ml.n();
        int size = listN.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ef.Ml(this.rV9, this, (z) listN.get(i2), this.bzg));
        }
        this.nHg.put(ml, arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void M(ES.n nVar, ES.w6 w6Var, Canvas canvas, int i2) {
        float fFloatValue;
        int size;
        int i3;
        float f3;
        int i5;
        Dsr dsr = this;
        ES.n nVar2 = nVar;
        ES.w6 w6Var2 = w6Var;
        Typeface typefaceA = dsr.a(w6Var2);
        if (typefaceA == null) {
            return;
        }
        String str = nVar2.f2315n;
        dsr.rV9.J();
        dsr.f67466T.setTypeface(typefaceA);
        B.j jVar = dsr.f67458B;
        float fFloatValue2 = jVar != null ? ((Float) jVar.KN()).floatValue() : nVar2.f2316t;
        dsr.f67466T.setTextSize(eO.O() * fFloatValue2);
        dsr.f67465N.setTypeface(dsr.f67466T.getTypeface());
        dsr.f67465N.setTextSize(dsr.f67466T.getTextSize());
        float f4 = nVar2.f2314O / 10.0f;
        B.j jVar2 = dsr.f67464M;
        if (jVar2 == null) {
            B.j jVar3 = dsr.f67460E;
            if (jVar3 != null) {
                fFloatValue = ((Float) jVar3.KN()).floatValue();
            }
            float fO = ((f4 * eO.O()) * fFloatValue2) / 100.0f;
            List listD = dsr.D(str);
            size = listD.size();
            int i7 = -1;
            i3 = 0;
            int length = 0;
            while (i3 < size) {
                String str2 = (String) listD.get(i3);
                PointF pointF = nVar2.az;
                float f5 = fO;
                List listY = dsr.Y(str2, pointF == null ? 0.0f : pointF.x, w6Var2, 0.0f, f5, false);
                int i8 = 0;
                while (i8 < listY.size()) {
                    Ml ml = (Ml) listY.get(i8);
                    i7++;
                    canvas.save();
                    if (dsr.Nxk(canvas, nVar2, i7, ml.rl)) {
                        f3 = f5;
                        i5 = length;
                        dsr.p5(ml.f67472n, nVar2, canvas, f3, i5, i2);
                    } else {
                        f3 = f5;
                        i5 = length;
                    }
                    length = i5 + ml.f67472n.length();
                    canvas.restore();
                    i8++;
                    dsr = this;
                    nVar2 = nVar;
                    f5 = f3;
                }
                fO = f5;
                i3++;
                dsr = this;
                nVar2 = nVar;
                w6Var2 = w6Var;
            }
        }
        fFloatValue = ((Float) jVar2.KN()).floatValue();
        f4 += fFloatValue;
        float fO2 = ((f4 * eO.O()) * fFloatValue2) / 100.0f;
        List listD2 = dsr.D(str);
        size = listD2.size();
        int i72 = -1;
        i3 = 0;
        int length2 = 0;
        while (i3 < size) {
        }
    }

    private boolean Nxk(Canvas canvas, ES.n nVar, int i2, float f3) {
        PointF pointF = nVar.qie;
        PointF pointF2 = nVar.az;
        float fO = eO.O();
        float f4 = (i2 * nVar.J2 * fO) + (pointF == null ? 0.0f : (nVar.J2 * fO) + pointF.y);
        if (this.rV9.T() && pointF2 != null && pointF != null && f4 >= pointF.y + pointF2.y + nVar.f2316t) {
            return false;
        }
        float f5 = pointF == null ? 0.0f : pointF.x;
        float f6 = pointF2 != null ? pointF2.x : 0.0f;
        int i3 = w6.f67475n[nVar.nr.ordinal()];
        if (i3 == 1) {
            canvas.translate(f5, f4);
        } else if (i3 == 2) {
            canvas.translate((f5 + f6) - f3, f4);
        } else if (i3 == 3) {
            canvas.translate((f5 + (f6 / 2.0f)) - (f3 / 2.0f), f4);
        }
        return true;
    }

    private List Y(String str, float f3, ES.w6 w6Var, float f4, float f5, boolean z2) {
        float fMeasureText;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        int i5 = 0;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (z2) {
                ES.Ml ml = (ES.Ml) this.bzg.t().O(ES.Ml.t(cCharAt, w6Var.n(), w6Var.t()));
                if (ml != null) {
                    fMeasureText = ((float) ml.rl()) * f4 * eO.O();
                }
            } else {
                fMeasureText = this.f67466T.measureText(str.substring(i7, i7 + 1));
            }
            float f9 = fMeasureText + f5;
            if (cCharAt == ' ') {
                z3 = true;
                f8 = f9;
            } else if (z3) {
                z3 = false;
                i5 = i7;
                f7 = f9;
            } else {
                f7 += f9;
            }
            f6 += f9;
            if (f3 > 0.0f && f6 >= f3 && cCharAt != ' ') {
                i2++;
                Ml mlB = B(i2);
                if (i5 == i3) {
                    mlB.t(str.substring(i3, i7).trim(), (f6 - f9) - ((r9.length() - r7.length()) * f8));
                    i3 = i7;
                    i5 = i3;
                    f6 = f9;
                    f7 = f6;
                } else {
                    mlB.t(str.substring(i3, i5 - 1).trim(), ((f6 - f7) - ((r7.length() - r13.length()) * f8)) - f8);
                    f6 = f7;
                    i3 = i5;
                }
            }
        }
        if (f6 > 0.0f) {
            i2++;
            B(i2).t(str.substring(i3), f6);
        }
        return this.wTp.subList(0, i2);
    }

    private Typeface a(ES.w6 w6Var) {
        Typeface typeface;
        B.j jVar = this.f67463J;
        if (jVar != null && (typeface = (Typeface) jVar.KN()) != null) {
            return typeface;
        }
        Typeface typefaceD = this.rV9.D(w6Var);
        return typefaceD != null ? typefaceD : w6Var.nr();
    }

    private void jB(ES.n nVar, int i2, int i3) {
        B.j jVar = this.f67467U;
        if (jVar != null) {
            this.f67466T.setColor(((Integer) jVar.KN()).intValue());
        } else if (this.jB == null || !I(i3)) {
            this.f67466T.setColor(nVar.KN);
        } else {
            this.f67466T.setColor(((Integer) this.jB.KN()).intValue());
        }
        B.j jVar2 = this.M7;
        if (jVar2 != null) {
            this.f67465N.setColor(((Integer) jVar2.KN()).intValue());
        } else if (this.P5 == null || !I(i3)) {
            this.f67465N.setColor(nVar.xMQ);
        } else {
            this.f67465N.setColor(((Integer) this.P5.KN()).intValue());
        }
        int iIntValue = 100;
        int iIntValue2 = this.aYN.KN() == null ? 100 : ((Integer) this.aYN.KN().KN()).intValue();
        if (this.f67461FX != null && I(i3)) {
            iIntValue = ((Integer) this.f67461FX.KN()).intValue();
        }
        int iRound = Math.round(((((iIntValue2 * 255.0f) / 100.0f) * (iIntValue / 100.0f)) * i2) / 255.0f);
        this.f67466T.setAlpha(iRound);
        this.f67465N.setAlpha(iRound);
        B.j jVar3 = this.eF;
        if (jVar3 != null) {
            this.f67465N.setStrokeWidth(((Float) jVar3.KN()).floatValue());
        } else if (this.p5 == null || !I(i3)) {
            this.f67465N.setStrokeWidth(nVar.mUb * eO.O());
        } else {
            this.f67465N.setStrokeWidth(((Float) this.p5.KN()).floatValue());
        }
    }

    @Override // gL.n
    void XQ(Canvas canvas, Matrix matrix, int i2, x0.Ml ml) {
        Canvas canvas2;
        ES.n nVar = (ES.n) this.f67471v.KN();
        ES.w6 w6Var = (ES.w6) this.bzg.Uo().get(nVar.rl);
        if (w6Var == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        jB(nVar, i2, 0);
        if (this.rV9.tFV()) {
            canvas2 = canvas;
            FX(nVar, matrix, w6Var, canvas2, i2);
        } else {
            canvas2 = canvas;
            M(nVar, w6Var, canvas2, i2);
        }
        canvas2.restore();
    }

    Dsr(Xo xo, I28 i28) {
        o oVar;
        o oVar2;
        GO.Ml ml;
        o oVar3;
        GO.Ml ml2;
        o oVar4;
        GO.Ml ml3;
        qz qzVar;
        GO.Ml ml4;
        qz qzVar2;
        GO.n nVar;
        qz qzVar3;
        GO.n nVar2;
        qz qzVar4;
        GO.j jVar;
        qz qzVar5;
        GO.j jVar2;
        super(xo, i28);
        this.E2 = new StringBuilder(2);
        this.f67470e = new RectF();
        this.f67468X = new Matrix();
        this.f67466T = new j(1);
        this.f67465N = new n(1);
        this.nHg = new HashMap();
        this.s7N = new LongSparseArray();
        this.wTp = new ArrayList();
        this.Xw = s4.INDEX;
        this.rV9 = xo;
        this.bzg = i28.t();
        B.Xo xoN = i28.Z().n();
        this.f67471v = xoN;
        xoN.n(this);
        mUb(xoN);
        C cXQ = i28.XQ();
        if (cXQ != null && (qzVar5 = cXQ.f3522n) != null && (jVar2 = qzVar5.f3532n) != null) {
            B.j jVarN = jVar2.n();
            this.jB = jVarN;
            jVarN.n(this);
            mUb(this.jB);
        }
        if (cXQ != null && (qzVar4 = cXQ.f3522n) != null && (jVar = qzVar4.rl) != null) {
            B.j jVarN2 = jVar.n();
            this.P5 = jVarN2;
            jVarN2.n(this);
            mUb(this.P5);
        }
        if (cXQ != null && (qzVar3 = cXQ.f3522n) != null && (nVar2 = qzVar3.f3533t) != null) {
            B.Ml mlN = nVar2.n();
            this.p5 = mlN;
            mlN.n(this);
            mUb(this.p5);
        }
        if (cXQ != null && (qzVar2 = cXQ.f3522n) != null && (nVar = qzVar2.nr) != null) {
            B.Ml mlN2 = nVar.n();
            this.f67460E = mlN2;
            mlN2.n(this);
            mUb(this.f67460E);
        }
        if (cXQ != null && (qzVar = cXQ.f3522n) != null && (ml4 = qzVar.f3531O) != null) {
            B.j jVarN3 = ml4.n();
            this.f67461FX = jVarN3;
            jVarN3.n(this);
            mUb(this.f67461FX);
        }
        if (cXQ != null && (oVar4 = cXQ.rl) != null && (ml3 = oVar4.f3529n) != null) {
            B.j jVarN4 = ml3.n();
            this.f67459D = jVarN4;
            jVarN4.n(this);
            mUb(this.f67459D);
        }
        if (cXQ != null && (oVar3 = cXQ.rl) != null && (ml2 = oVar3.rl) != null) {
            B.j jVarN5 = ml2.n();
            this.f67469a = jVarN5;
            jVarN5.n(this);
            mUb(this.f67469a);
        }
        if (cXQ != null && (oVar2 = cXQ.rl) != null && (ml = oVar2.f3530t) != null) {
            B.j jVarN6 = ml.n();
            this.f67462I = jVarN6;
            jVarN6.n(this);
            mUb(this.f67462I);
        }
        if (cXQ != null && (oVar = cXQ.rl) != null) {
            this.Xw = oVar.nr;
        }
    }

    private boolean GR(int i2) {
        if (Character.getType(i2) != 16 && Character.getType(i2) != 27 && Character.getType(i2) != 6 && Character.getType(i2) != 28 && Character.getType(i2) != 8 && Character.getType(i2) != 19) {
            return false;
        }
        return true;
    }

    private void M7(String str, ES.n nVar, Canvas canvas, int i2, int i3) {
        jB(nVar, i3, i2);
        if (nVar.gh) {
            U(str, this.f67466T, canvas);
            U(str, this.f67465N, canvas);
        } else {
            U(str, this.f67465N, canvas);
            U(str, this.f67466T, canvas);
        }
    }

    private void P5(ES.Ml ml, float f3, ES.n nVar, Canvas canvas, int i2, int i3) {
        jB(nVar, i3, i2);
        List listJ = J(ml);
        for (int i5 = 0; i5 < listJ.size(); i5++) {
            Path path = ((ef.Ml) listJ.get(i5)).getPath();
            path.computeBounds(this.f67470e, false);
            this.f67468X.reset();
            this.f67468X.preTranslate(0.0f, (-nVar.Uo) * eO.O());
            this.f67468X.preScale(f3, f3);
            path.transform(this.f67468X);
            if (nVar.gh) {
                eF(path, this.f67466T, canvas);
                eF(path, this.f67465N, canvas);
            } else {
                eF(path, this.f67465N, canvas);
                eF(path, this.f67466T, canvas);
            }
        }
    }

    private void U(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    private String Xw(String str, int i2) {
        int iCodePointAt = str.codePointAt(i2);
        int iCharCount = Character.charCount(iCodePointAt) + i2;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!GR(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j2 = iCodePointAt;
        if (this.s7N.nr(j2)) {
            return (String) this.s7N.O(j2);
        }
        this.E2.setLength(0);
        while (i2 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i2);
            this.E2.appendCodePoint(iCodePointAt3);
            i2 += Character.charCount(iCodePointAt3);
        }
        String string = this.E2.toString();
        this.s7N.gh(j2, string);
        return string;
    }

    private void eF(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    @Override // gL.n, ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        super.J2(obj, w6Var);
        if (obj == SPz.f2551n) {
            B.j jVar = this.f67467U;
            if (jVar != null) {
                T(jVar);
            }
            if (w6Var == null) {
                this.f67467U = null;
                return;
            }
            B.z zVar = new B.z(w6Var);
            this.f67467U = zVar;
            zVar.n(this);
            mUb(this.f67467U);
            return;
        }
        if (obj == SPz.rl) {
            B.j jVar2 = this.M7;
            if (jVar2 != null) {
                T(jVar2);
            }
            if (w6Var == null) {
                this.M7 = null;
                return;
            }
            B.z zVar2 = new B.z(w6Var);
            this.M7 = zVar2;
            zVar2.n(this);
            mUb(this.M7);
            return;
        }
        if (obj == SPz.f2552o) {
            B.j jVar3 = this.eF;
            if (jVar3 != null) {
                T(jVar3);
            }
            if (w6Var == null) {
                this.eF = null;
                return;
            }
            B.z zVar3 = new B.z(w6Var);
            this.eF = zVar3;
            zVar3.n(this);
            mUb(this.eF);
            return;
        }
        if (obj == SPz.f2548Z) {
            B.j jVar4 = this.f67464M;
            if (jVar4 != null) {
                T(jVar4);
            }
            if (w6Var == null) {
                this.f67464M = null;
                return;
            }
            B.z zVar4 = new B.z(w6Var);
            this.f67464M = zVar4;
            zVar4.n(this);
            mUb(this.f67464M);
            return;
        }
        if (obj == SPz.f2549e) {
            B.j jVar5 = this.f67458B;
            if (jVar5 != null) {
                T(jVar5);
            }
            if (w6Var == null) {
                this.f67458B = null;
                return;
            }
            B.z zVar5 = new B.z(w6Var);
            this.f67458B = zVar5;
            zVar5.n(this);
            mUb(this.f67458B);
            return;
        }
        if (obj == SPz.f2555v) {
            B.j jVar6 = this.f67463J;
            if (jVar6 != null) {
                T(jVar6);
            }
            if (w6Var == null) {
                this.f67463J = null;
                return;
            }
            B.z zVar6 = new B.z(w6Var);
            this.f67463J = zVar6;
            zVar6.n(this);
            mUb(this.f67463J);
            return;
        }
        if (obj == SPz.bzg) {
            this.f67471v.o(w6Var);
        }
    }

    @Override // gL.n, ef.I28
    public void KN(RectF rectF, Matrix matrix, boolean z2) {
        super.KN(rectF, matrix, z2);
        rectF.set(0.0f, 0.0f, this.bzg.rl().width(), this.bzg.rl().height());
    }
}
