package WzY;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Trmy.yioUaKMByL;
import com.alightcreative.app.motion.scene.CompoundCubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.Vector2D;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: WzY.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C1487z implements Sis {
    private final float[] HI;
    private boolean Ik;
    private boolean J2;
    private float[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Path f11699O;
    private float[] Uo;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final boolean f11700Z;
    private final float[] az;
    private final RectF ck;
    private double gh;
    private double mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f11701n;
    private int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Matrix f11702o;
    private double qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Matrix f11703r;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float[] f11704t;
    private final float[] ty;
    private final Matrix xMQ;

    public C1487z() {
        this.mUb = 1.0d;
        this.gh = 1.0d;
        this.qie = 1.0d;
        this.az = new float[2];
        this.ty = new float[2];
        this.HI = new float[2];
        this.ck = new RectF();
        Matrix matrix = new Matrix();
        this.f11703r = matrix;
        this.f11702o = matrix;
        this.f11700Z = this.rl < 1;
        this.f11701n = new int[32];
        this.f11704t = new float[64];
        this.f11699O = new Path();
        this.xMQ = new Matrix();
    }

    private final void FX() {
        this.J2 = true;
    }

    public final void J(float f3, float f4) {
        z(1, 2);
        int[] iArr = this.f11701n;
        int i2 = this.rl;
        this.rl = i2 + 1;
        iArr[i2] = 2;
        float[] fArr = this.f11704t;
        int i3 = this.nr;
        int i5 = i3 + 1;
        this.nr = i5;
        fArr[i3] = f3;
        this.nr = i3 + 2;
        fArr[i5] = f4;
    }

    public final void ViF() {
        z(1, 0);
        int[] iArr = this.f11701n;
        int i2 = this.rl;
        this.rl = i2 + 1;
        iArr[i2] = 50;
    }

    public final void Y(float f3, float f4) {
        z(1, 2);
        int[] iArr = this.f11701n;
        int i2 = this.rl;
        this.rl = i2 + 1;
        iArr[i2] = 1;
        float[] fArr = this.f11704t;
        int i3 = this.nr;
        int i5 = i3 + 1;
        this.nr = i5;
        fArr[i3] = f3;
        this.nr = i3 + 2;
        fArr[i5] = f4;
    }

    public final void Z(float f3, float f4, float f5) {
        z(1, 3);
        int[] iArr = this.f11701n;
        int i2 = this.rl;
        this.rl = i2 + 1;
        iArr[i2] = 20;
        float[] fArr = this.f11704t;
        int i3 = this.nr;
        int i5 = i3 + 1;
        this.nr = i5;
        fArr[i3] = f3;
        int i7 = i3 + 2;
        this.nr = i7;
        fArr[i5] = f4;
        this.nr = i3 + 3;
        fArr[i7] = f5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.alightcreative.nanovg.MutableUPath");
        C1487z c1487z = (C1487z) obj;
        int i2 = this.rl;
        if (i2 != c1487z.rl || this.nr != c1487z.nr) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f11701n[i3] != c1487z.f11701n[i3]) {
                return false;
            }
        }
        int i5 = this.nr;
        for (int i7 = 0; i7 < i5; i7++) {
            if (this.f11704t[i7] != c1487z.f11704t[i7]) {
                return false;
            }
        }
        return Intrinsics.areEqual(this.xMQ, c1487z.xMQ) && this.mUb == c1487z.mUb && this.gh == c1487z.gh && this.qie == c1487z.qie && M() == c1487z.M();
    }

    public final void g() {
        z(1, 0);
        int[] iArr = this.f11701n;
        int i2 = this.rl;
        this.rl = i2 + 1;
        iArr[i2] = 51;
    }

    public final void ijL() {
        this.rl = 0;
        this.nr = 0;
        this.mUb = 1.0d;
        this.gh = 1.0d;
        this.qie = 1.0d;
        this.xMQ.reset();
        FX();
    }

    public final void nY() {
        z(1, 0);
        int[] iArr = this.f11701n;
        int i2 = this.rl;
        this.rl = i2 + 1;
        iArr[i2] = 52;
    }

    public final void te(float f3, float f4, float f5, float f6, float f7, float f8) {
        z(1, 6);
        int[] iArr = this.f11701n;
        int i2 = this.rl;
        this.rl = i2 + 1;
        iArr[i2] = 3;
        float[] fArr = this.f11704t;
        int i3 = this.nr;
        int i5 = i3 + 1;
        this.nr = i5;
        fArr[i3] = f3;
        int i7 = i3 + 2;
        this.nr = i7;
        fArr[i5] = f4;
        int i8 = i3 + 3;
        this.nr = i8;
        fArr[i7] = f5;
        int i9 = i3 + 4;
        this.nr = i9;
        fArr[i8] = f6;
        int i10 = i3 + 5;
        this.nr = i10;
        fArr[i9] = f7;
        this.nr = i3 + 6;
        fArr[i10] = f8;
    }

    private final float[] E() {
        float[] fArr = this.Uo;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[8];
        this.Uo = fArr2;
        return fArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E2() {
        return "UPath:drawPath LOOP START";
    }

    private final float[] GR(float f3, float f4) {
        float[] fArr = this.HI;
        fArr[0] = f3;
        fArr[1] = f4;
        this.xMQ.mapPoints(this.ty, 0, fArr, 0, 1);
        this.f11702o.mapPoints(this.az, 0, this.ty, 0, 1);
        return this.az;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String N(float f3, float f4) {
        return "lineTo: " + f3 + ", " + f4 + " ";
    }

    private final float[] Nxk(int i2) {
        this.xMQ.mapPoints(this.ty, 0, this.f11704t, i2, 1);
        this.f11702o.mapPoints(this.az, 0, this.ty, 0, 1);
        return this.az;
    }

    private final void P5(Function4 function4) {
        int i2 = this.rl;
        boolean z2 = false;
        int i3 = 0;
        int i5 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = this.f11701n[i8];
            Object obj = OU.rl.get(Integer.valueOf(i9));
            Intrinsics.checkNotNull(obj);
            int iIntValue = ((Number) obj).intValue();
            if (i9 != 1) {
                if (i9 != 2 && i9 != 3 && i9 != 4) {
                    switch (i9) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            if (z2) {
                                function4.invoke(Integer.valueOf(i3), Integer.valueOf(i8 - i3), Integer.valueOf(i5), Integer.valueOf(i7 - i5));
                                z2 = false;
                            }
                            function4.invoke(Integer.valueOf(i8), 1, Integer.valueOf(i7), Integer.valueOf(iIntValue));
                            break;
                        default:
                            switch (i9) {
                                case 50:
                                case 51:
                                case 52:
                                    if (z2) {
                                        function4.invoke(Integer.valueOf(i3), Integer.valueOf((i8 - i3) + 1), Integer.valueOf(i5), Integer.valueOf(i7 - i5));
                                        z2 = false;
                                    }
                                    break;
                            }
                            break;
                    }
                } else if (!z2) {
                }
                i7 += iIntValue;
            } else if (z2) {
                function4.invoke(Integer.valueOf(i3), Integer.valueOf(i8 - i3), Integer.valueOf(i5), Integer.valueOf(i7 - i5));
            }
            i3 = i8;
            i5 = i7;
            z2 = true;
            i7 += iIntValue;
        }
        if (z2) {
            function4.invoke(Integer.valueOf(i3), Integer.valueOf(this.rl - i3), Integer.valueOf(i5), Integer.valueOf(this.nr - i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String T(float f3, float f4) {
        return "moveTo: " + f3 + ", " + f4 + " ";
    }

    private final void U(QJ qj, float f3, float f4, float f5, float f6) {
        float f7 = f3 - f5;
        dR0(qj, f7, f4);
        float f8 = f6 * 0.55191505f;
        float f9 = f4 + f8;
        float f10 = 0.55191505f * f5;
        float f11 = f3 - f10;
        float f12 = f4 + f6;
        aYN(qj, f7, f9, f11, f12, f3, f12);
        float f13 = f3 + f10;
        float f14 = f3 + f5;
        aYN(qj, f13, f12, f14, f9, f14, f4);
        float f15 = f4 - f8;
        float f16 = f4 - f6;
        aYN(qj, f14, f15, f13, f16, f3, f16);
        aYN(qj, f11, f16, f7, f15, f7, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String X(long j2, long j3, C1487z c1487z) {
        return "UPath:drawPath COMMAND " + j2 + " of " + j3 + " !!!  commands[i]=" + c1487z.f11701n[(int) j2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Xw(long j2) {
        return "UPath:drawPath OUT cmdCount=" + j2 + " <<<<<<<<<";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String bzg() {
        return "UPath:drawPath LOOP END";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e() {
        return "UPath:drawPath LOOP ITER";
    }

    private final float[] eF() {
        float[] fArr = this.KN;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[9];
        this.KN = fArr2;
        return fArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fD(long j2) {
        return "UPath:drawPath IN cmdCount=" + j2 + "  >>>>>>>>";
    }

    private static final void jB(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ref.FloatRef floatRef3, float f3, float f4) {
        floatRef.element += (f3 - floatRef2.element) * (floatRef3.element + f4);
        floatRef2.element = f3;
        floatRef3.element = f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nHg(float f3, float f4, float f5, float f6, float f7, float f8) {
        return "bezierTo: " + f3 + "," + f4 + " / " + f5 + "," + f6 + " / " + f7 + " " + f8 + " ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Ref.IntRef intRef, int i2, int i3, int i5, int i7) {
        intRef.element++;
        return Unit.INSTANCE;
    }

    private final String ofS() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.rl;
        int i3 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i7 = this.f11701n[i5];
            if (i7 == 1) {
                float[] fArrNxk = Nxk(i3);
                i3 += 2;
                sb.append("M " + fArrNxk[0] + "," + fArrNxk[1] + " ");
            } else if (i7 == 2) {
                float[] fArrNxk2 = Nxk(i3);
                i3 += 2;
                sb.append(yioUaKMByL.GAleiZykSxUXsr + fArrNxk2[0] + "," + fArrNxk2[1] + " ");
            } else {
                if (i7 != 3) {
                    if (i7 != 4) {
                        switch (i7) {
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                break;
                            default:
                                switch (i7) {
                                    case 50:
                                    case 51:
                                    case 52:
                                        sb.append("Z ");
                                        continue;
                                    default:
                                        throw new IllegalStateException();
                                }
                                break;
                        }
                    }
                    throw new UnsupportedOperationException();
                }
                float[] fArrNxk3 = Nxk(i3);
                float f3 = fArrNxk3[0];
                float f4 = fArrNxk3[1];
                float[] fArrNxk4 = Nxk(i3 + 2);
                float f5 = fArrNxk4[0];
                float f6 = fArrNxk4[1];
                float[] fArrNxk5 = Nxk(i3 + 4);
                i3 += 6;
                sb.append("C" + f3 + "," + f4 + " " + f5 + "," + f6 + " " + fArrNxk5[0] + "," + fArrNxk5[1] + " ");
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final int p5() {
        final Ref.IntRef intRef = new Ref.IntRef();
        P5(new Function4() { // from class: WzY.CN3
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return C1487z.o(intRef, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
            }
        });
        return intRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rV9(float f3, float f4, float f5, float f6) {
        return "rect: " + f3 + "," + f4 + " / " + f5 + "," + f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String s7N(float f3, float f4, float f5, float f6) {
        return "quadTo: " + f3 + "," + f4 + " / " + f5 + "," + f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v(float f3, float f4, float f5, float f6) {
        return "ellipse: " + f3 + "," + f4 + " / " + f5 + "," + f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wTp(float f3, float f4, float f5) {
        return "circle: " + f3 + "," + f4 + " / " + f5 + " ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xg(List list, Ref.IntRef intRef, C1487z c1487z, int i2, int i3, int i5, int i7) {
        C1487z c1487z2 = (C1487z) list.get(intRef.element);
        c1487z2.ijL();
        c1487z2.z(i3, i7);
        System.arraycopy(c1487z.f11701n, i2, c1487z2.f11701n, 0, i3);
        System.arraycopy(c1487z.f11704t, i5, c1487z2.f11704t, 0, i7);
        c1487z2.rl = i3;
        c1487z2.nr = i7;
        intRef.element++;
        return Unit.INSTANCE;
    }

    public boolean B() {
        long j2 = 0;
        while (j2 < this.rl) {
            long j3 = 1 + j2;
            switch (this.f11701n[(int) j2]) {
                case 50:
                case 51:
                case 52:
                    return true;
                default:
                    j2 = j3;
                    break;
            }
        }
        return false;
    }

    public final Sis C() {
        return new C1487z(this);
    }

    public final void D(Vector2D v2) {
        Intrinsics.checkNotNullParameter(v2, "v");
        J(v2.getX(), v2.getY());
    }

    public final void I(Function1 mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        int i2 = this.rl;
        int i3 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i7 = this.f11701n[i5];
            if (i7 == 1) {
                float[] fArr = this.f11704t;
                int i8 = i3 + 1;
                Vector2D vector2D = (Vector2D) mapper.invoke(new Vector2D(fArr[i3], fArr[i8]));
                this.f11704t[i3] = vector2D.getX();
                this.f11704t[i8] = vector2D.getY();
            } else if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        switch (i7) {
                            case 20:
                                float[] fArr2 = this.f11704t;
                                int i9 = i3 + 1;
                                Vector2D vector2D2 = (Vector2D) mapper.invoke(new Vector2D(fArr2[i3], fArr2[i9]));
                                this.f11704t[i3] = vector2D2.getX();
                                this.f11704t[i9] = vector2D2.getY();
                                break;
                            case 21:
                                float[] fArr3 = this.f11704t;
                                int i10 = i3 + 1;
                                Vector2D vector2D3 = (Vector2D) mapper.invoke(new Vector2D(fArr3[i3], fArr3[i10]));
                                this.f11704t[i3] = vector2D3.getX();
                                this.f11704t[i10] = vector2D3.getY();
                                int i11 = i3 + 2;
                                float[] fArr4 = this.f11704t;
                                int i12 = i3 + 3;
                                Vector2D vector2D4 = (Vector2D) mapper.invoke(new Vector2D(fArr4[i11], fArr4[i12]));
                                this.f11704t[i11] = vector2D4.getX();
                                this.f11704t[i12] = vector2D4.getY();
                                break;
                            case 22:
                                float[] fArr5 = this.f11704t;
                                int i13 = i3 + 1;
                                Vector2D vector2D5 = (Vector2D) mapper.invoke(new Vector2D(fArr5[i3], fArr5[i13]));
                                this.f11704t[i3] = vector2D5.getX();
                                this.f11704t[i13] = vector2D5.getY();
                                int i14 = i3 + 2;
                                float[] fArr6 = this.f11704t;
                                int i15 = i3 + 3;
                                Vector2D vector2D6 = (Vector2D) mapper.invoke(new Vector2D(fArr6[i14], fArr6[i15]));
                                this.f11704t[i14] = vector2D6.getX();
                                this.f11704t[i15] = vector2D6.getY();
                                break;
                            case 23:
                                float[] fArr7 = this.f11704t;
                                int i16 = i3 + 1;
                                Vector2D vector2D7 = (Vector2D) mapper.invoke(new Vector2D(fArr7[i3], fArr7[i16]));
                                this.f11704t[i3] = vector2D7.getX();
                                this.f11704t[i16] = vector2D7.getY();
                                int i17 = i3 + 2;
                                float[] fArr8 = this.f11704t;
                                int i18 = i3 + 3;
                                Vector2D vector2D8 = (Vector2D) mapper.invoke(new Vector2D(fArr8[i17], fArr8[i18]));
                                this.f11704t[i17] = vector2D8.getX();
                                this.f11704t[i18] = vector2D8.getY();
                                i3 += 12;
                                break;
                            default:
                                switch (i7) {
                                    case 50:
                                    case 51:
                                    case 52:
                                        break;
                                    default:
                                        throw new IllegalStateException();
                                }
                                break;
                        }
                    } else {
                        float[] fArr9 = this.f11704t;
                        int i19 = i3 + 1;
                        Vector2D vector2D9 = (Vector2D) mapper.invoke(new Vector2D(fArr9[i3], fArr9[i19]));
                        this.f11704t[i3] = vector2D9.getX();
                        this.f11704t[i19] = vector2D9.getY();
                        int i20 = i3 + 2;
                        float[] fArr10 = this.f11704t;
                        int i21 = i3 + 3;
                        Vector2D vector2D10 = (Vector2D) mapper.invoke(new Vector2D(fArr10[i20], fArr10[i21]));
                        this.f11704t[i20] = vector2D10.getX();
                        this.f11704t[i21] = vector2D10.getY();
                    }
                    i3 += 4;
                } else {
                    float[] fArr11 = this.f11704t;
                    int i22 = i3 + 1;
                    Vector2D vector2D11 = (Vector2D) mapper.invoke(new Vector2D(fArr11[i3], fArr11[i22]));
                    this.f11704t[i3] = vector2D11.getX();
                    this.f11704t[i22] = vector2D11.getY();
                    int i23 = i3 + 2;
                    float[] fArr12 = this.f11704t;
                    int i24 = i3 + 3;
                    Vector2D vector2D12 = (Vector2D) mapper.invoke(new Vector2D(fArr12[i23], fArr12[i24]));
                    this.f11704t[i23] = vector2D12.getX();
                    this.f11704t[i24] = vector2D12.getY();
                    int i25 = i3 + 4;
                    float[] fArr13 = this.f11704t;
                    int i26 = i3 + 5;
                    Vector2D vector2D13 = (Vector2D) mapper.invoke(new Vector2D(fArr13[i25], fArr13[i26]));
                    this.f11704t[i25] = vector2D13.getX();
                    this.f11704t[i26] = vector2D13.getY();
                    i3 += 6;
                }
            } else {
                float[] fArr14 = this.f11704t;
                int i27 = i3 + 1;
                Vector2D vector2D14 = (Vector2D) mapper.invoke(new Vector2D(fArr14[i3], fArr14[i27]));
                this.f11704t[i3] = vector2D14.getX();
                this.f11704t[i27] = vector2D14.getY();
            }
            i3 += 2;
        }
    }

    public boolean M() {
        return this.Ik;
    }

    public final void Mx(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (matrix.isIdentity()) {
            return;
        }
        this.xMQ.preConcat(matrix);
        matrix.getValues(eF());
        this.mUb = Math.hypot(r0[0], r0[1]);
        double dHypot = Math.hypot(r0[3], r0[4]);
        this.gh = dHypot;
        this.qie = (this.mUb + dHypot) / ((double) 2);
        FX();
    }

    public final void WPU(Rectangle rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Y(rect.getLeft(), rect.getTop());
        J(rect.getRight(), rect.getTop());
        J(rect.getRight(), rect.getBottom());
        J(rect.getLeft(), rect.getBottom());
        J(rect.getLeft(), rect.getTop());
    }

    public final void XQ(Sis path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (path instanceof C1487z) {
            C1487z c1487z = (C1487z) path;
            z(c1487z.rl, c1487z.nr);
            System.arraycopy(c1487z.f11701n, 0, this.f11701n, this.rl, c1487z.rl);
            this.rl += c1487z.rl;
            System.arraycopy(c1487z.f11704t, 0, this.f11704t, this.nr, c1487z.nr);
            this.nr += c1487z.nr;
        }
    }

    public int hashCode() {
        int i2 = this.rl;
        int iHashCode = (i2 * 31) + this.nr;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode = (iHashCode * 31) + this.f11701n[i3];
        }
        int i5 = this.nr;
        for (int i7 = 0; i7 < i5; i7++) {
            iHashCode = (iHashCode * 31) + Float.hashCode(this.f11704t[i7]);
        }
        return (((((((((iHashCode * 31) + this.xMQ.hashCode()) * 31) + Double.hashCode(this.mUb)) * 31) + Double.hashCode(this.gh)) * 31) + Double.hashCode(this.qie)) * 31) + Boolean.hashCode(M());
    }

    public final void iF(Vector2D v1, Vector2D v2, Vector2D v3) {
        Intrinsics.checkNotNullParameter(v1, "v1");
        Intrinsics.checkNotNullParameter(v2, "v2");
        Intrinsics.checkNotNullParameter(v3, "v3");
        te(v1.getX(), v1.getY(), v2.getX(), v2.getY(), v3.getX(), v3.getY());
    }

    public final void k(Vector2D v2) {
        Intrinsics.checkNotNullParameter(v2, "v");
        Y(v2.getX(), v2.getY());
    }

    public void m(boolean z2) {
        this.Ik = z2;
    }

    @Override // WzY.Sis
    public C1487z n() {
        return new C1487z(this);
    }

    @Override // WzY.Sis
    public void rl(QJ qj, yg paint, Matrix matrix, float f3) {
        C1487z c1487z;
        QJ qj2;
        long j2;
        C1487z c1487z2 = this;
        QJ vg = qj;
        Intrinsics.checkNotNullParameter(vg, "vg");
        Intrinsics.checkNotNullParameter(paint, "paint");
        final long j3 = c1487z2.rl;
        long j4 = 1;
        if (j3 < 1) {
            return;
        }
        if (OU.f11588n) {
            XoT.C.az(c1487z2, new Function0() { // from class: WzY.fuX
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C1487z.fD(j3);
                }
            });
        }
        c1487z2.f11702o = matrix == null ? c1487z2.f11703r : matrix;
        vg.rl();
        if (OU.f11588n) {
            XoT.C.az(c1487z2, new Function0() { // from class: WzY.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C1487z.E2();
                }
            });
        }
        Ref.FloatRef floatRef = new Ref.FloatRef();
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        Ref.FloatRef floatRef3 = new Ref.FloatRef();
        final long j5 = 0;
        int i2 = 0;
        while (true) {
            long j6 = j4;
            if (j5 >= j3) {
                QJ qj3 = vg;
                if (OU.f11588n) {
                    XoT.C.az(c1487z2, new Function0() { // from class: WzY.aC
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C1487z.bzg();
                        }
                    });
                }
                if (c1487z2.M()) {
                    float f4 = floatRef.element;
                    if (f4 < 0.0f) {
                        qj3.ty(1);
                    } else if (f4 > 0.0f) {
                        qj3.ty(2);
                    }
                }
                floatRef.element = 0.0f;
                paint.J2(qj3, f3);
                c1487z2.f11702o = c1487z2.f11703r;
                if (OU.f11588n) {
                    XoT.C.az(c1487z2, new Function0() { // from class: WzY.C
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C1487z.Xw(j3);
                        }
                    });
                    return;
                }
                return;
            }
            long j7 = j5 + j6;
            if (OU.f11588n) {
                XoT.C.az(c1487z2, new Function0() { // from class: WzY.qz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C1487z.e();
                    }
                });
            }
            if (OU.f11588n) {
                c1487z2 = this;
                XoT.C.az(c1487z2, new Function0() { // from class: WzY.Pl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C1487z.X(j5, j3, this);
                    }
                });
            }
            int i3 = c1487z2.f11701n[(int) j5];
            if (i3 != 1) {
                if (i3 == 2) {
                    c1487z = c1487z2;
                    qj2 = vg;
                    float[] fArrNxk = c1487z.Nxk(i2);
                    final float f5 = fArrNxk[0];
                    final float f6 = fArrNxk[1];
                    i2 += 2;
                    if (OU.f11588n) {
                        XoT.C.az(c1487z, new Function0() { // from class: WzY.eO
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C1487z.N(f5, f6);
                            }
                        });
                    }
                    qj2.qie(f5, f6);
                    jB(floatRef, floatRef2, floatRef3, f5, f6);
                } else if (i3 == 3) {
                    c1487z = c1487z2;
                    QJ qj4 = vg;
                    float[] fArrNxk2 = c1487z.Nxk(i2);
                    final float f7 = fArrNxk2[0];
                    final float f8 = fArrNxk2[1];
                    float[] fArrNxk3 = c1487z.Nxk(i2 + 2);
                    final float f9 = fArrNxk3[0];
                    final float f10 = fArrNxk3[1];
                    float[] fArrNxk4 = c1487z.Nxk(i2 + 4);
                    final float f11 = fArrNxk4[0];
                    final float f12 = fArrNxk4[1];
                    i2 += 6;
                    if (OU.f11588n) {
                        XoT.C.az(c1487z, new Function0() { // from class: WzY.w6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C1487z.nHg(f7, f8, f9, f10, f11, f12);
                            }
                        });
                    }
                    qj4.t(f7, f8, f9, f10, f11, f12);
                    jB(floatRef, floatRef2, floatRef3, f11, f12);
                    vg = qj4;
                    j3 = j3;
                    c1487z2 = c1487z;
                } else if (i3 != 4) {
                    switch (i3) {
                        case 20:
                            j2 = j3;
                            float[] fArr = c1487z2.f11704t;
                            final float f13 = fArr[i2];
                            int i5 = i2 + 2;
                            final float f14 = fArr[i2 + 1];
                            i2 += 3;
                            final float f15 = fArr[i5];
                            if (OU.f11588n) {
                                XoT.C.az(c1487z2, new Function0() { // from class: WzY.I28
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return C1487z.wTp(f13, f14, f15);
                                    }
                                });
                            }
                            c1487z2.U(qj, f13, f14, f15, f15);
                            vg = qj;
                            j3 = j2;
                            break;
                        case 21:
                            float[] fArr2 = c1487z2.f11704t;
                            final float f16 = fArr2[i2];
                            final float f17 = fArr2[i2 + 1];
                            int i7 = i2 + 3;
                            final float f18 = fArr2[i2 + 2];
                            i2 += 4;
                            final float f19 = fArr2[i7];
                            if (OU.f11588n) {
                                XoT.C.az(c1487z2, new Function0() { // from class: WzY.Wre
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return C1487z.v(f16, f17, f18, f19);
                                    }
                                });
                            }
                            float f20 = 2;
                            float f21 = (f16 + f18) / f20;
                            float f22 = (f17 + f19) / f20;
                            float f23 = (f18 - f16) / f20;
                            float f24 = (f19 - f17) / f20;
                            j2 = j3;
                            c1487z2.U(qj, f21, f22, f23, f24);
                            vg = qj;
                            j3 = j2;
                            break;
                        case 22:
                            float[] fArr3 = c1487z2.f11704t;
                            final float f25 = fArr3[i2];
                            final float f26 = fArr3[i2 + 1];
                            int i8 = i2 + 3;
                            final float f27 = fArr3[i2 + 2];
                            i2 += 4;
                            final float f28 = fArr3[i8];
                            if (OU.f11588n) {
                                XoT.C.az(c1487z2, new Function0() { // from class: WzY.Dsr
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return C1487z.rV9(f25, f26, f27, f28);
                                    }
                                });
                            }
                            j2 = j3;
                            c1487z2.piY(vg, f25, f26, f27, f28);
                            vg = qj;
                            j3 = j2;
                            break;
                        case 23:
                            throw new NotImplementedError("An operation is not implemented: Round rectangle not implemented for NanoVG yet");
                        default:
                            switch (i3) {
                                case 50:
                                    if (c1487z2.M()) {
                                        float f29 = floatRef.element;
                                        if (f29 < 0.0f) {
                                            vg.ty(1);
                                        } else if (f29 > 0.0f) {
                                            vg.ty(2);
                                        }
                                    }
                                    vg.O();
                                    if (c1487z2.M()) {
                                        float f30 = floatRef.element;
                                        if (f30 < 0.0f) {
                                            vg.ty(1);
                                        } else if (f30 > 0.0f) {
                                            vg.ty(2);
                                        }
                                    }
                                    floatRef.element = 0.0f;
                                    break;
                                case 51:
                                    vg.ty(1);
                                    vg.O();
                                    vg.ty(1);
                                    floatRef.element = 0.0f;
                                    break;
                                case 52:
                                    vg.ty(2);
                                    vg.O();
                                    vg.ty(2);
                                    floatRef.element = 0.0f;
                                    break;
                                default:
                                    throw new IllegalStateException();
                            }
                            break;
                    }
                } else {
                    c1487z = c1487z2;
                    qj2 = vg;
                    float[] fArrNxk5 = c1487z.Nxk(i2);
                    final float f31 = fArrNxk5[0];
                    final float f32 = fArrNxk5[1];
                    float[] fArrNxk6 = c1487z.Nxk(i2 + 2);
                    final float f33 = fArrNxk6[0];
                    final float f34 = fArrNxk6[1];
                    i2 += 4;
                    if (OU.f11588n) {
                        XoT.C.az(c1487z, new Function0() { // from class: WzY.Ml
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C1487z.s7N(f31, f32, f33, f34);
                            }
                        });
                    }
                    qj2.HI(f31, f32, f33, f34);
                    jB(floatRef, floatRef2, floatRef3, f33, f34);
                }
                vg = qj2;
                c1487z2 = c1487z;
            } else {
                QJ qj5 = vg;
                float[] fArrNxk7 = c1487z2.Nxk(i2);
                final float f35 = fArrNxk7[0];
                final float f36 = fArrNxk7[1];
                i2 += 2;
                if (OU.f11588n) {
                    XoT.C.az(c1487z2, new Function0() { // from class: WzY.Xo
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C1487z.T(f35, f36);
                        }
                    });
                }
                if (c1487z2.M()) {
                    float f37 = floatRef.element;
                    if (f37 < 0.0f) {
                        qj5.ty(1);
                    } else if (f37 > 0.0f) {
                        qj5.ty(2);
                    }
                }
                qj5.az(f35, f36);
                floatRef.element = 0.0f;
                floatRef2.element = f35;
                floatRef3.element = f36;
                vg = qj5;
            }
            j4 = j6;
            j5 = j7;
        }
    }

    @Override // WzY.Sis
    public Path t() {
        if (this.J2) {
            this.f11699O.rewind();
            int i2 = this.rl;
            int i3 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int i7 = this.f11701n[i5];
                if (i7 == 1) {
                    float[] fArr = this.f11704t;
                    int i8 = i3 + 1;
                    float f3 = fArr[i3];
                    i3 += 2;
                    this.f11699O.moveTo(f3, fArr[i8]);
                } else if (i7 == 2) {
                    float[] fArr2 = this.f11704t;
                    int i9 = i3 + 1;
                    float f4 = fArr2[i3];
                    i3 += 2;
                    this.f11699O.lineTo(f4, fArr2[i9]);
                } else if (i7 == 3) {
                    float[] fArr3 = this.f11704t;
                    float f5 = fArr3[i3];
                    float f6 = fArr3[i3 + 1];
                    float f7 = fArr3[i3 + 2];
                    float f8 = fArr3[i3 + 3];
                    int i10 = i3 + 5;
                    float f9 = fArr3[i3 + 4];
                    i3 += 6;
                    this.f11699O.cubicTo(f5, f6, f7, f8, f9, fArr3[i10]);
                } else if (i7 != 4) {
                    switch (i7) {
                        case 20:
                            float[] fArr4 = this.f11704t;
                            float f10 = fArr4[i3];
                            int i11 = i3 + 2;
                            float f11 = fArr4[i3 + 1];
                            i3 += 3;
                            this.f11699O.addCircle(f10, f11, fArr4[i11], Path.Direction.CCW);
                            break;
                        case 21:
                            float[] fArr5 = this.f11704t;
                            float f12 = fArr5[i3];
                            float f13 = fArr5[i3 + 1];
                            int i12 = i3 + 3;
                            float f14 = fArr5[i3 + 2];
                            i3 += 4;
                            this.f11699O.addOval(f12, f13, f14, fArr5[i12], Path.Direction.CCW);
                            break;
                        case 22:
                            float[] fArr6 = this.f11704t;
                            float f15 = fArr6[i3];
                            float f16 = fArr6[i3 + 1];
                            int i13 = i3 + 3;
                            float f17 = fArr6[i3 + 2];
                            i3 += 4;
                            this.f11699O.addRect(f15, f16, f17, fArr6[i13], Path.Direction.CCW);
                            break;
                        case 23:
                            float[] fArr7 = this.f11704t;
                            float f18 = fArr7[i3];
                            float f19 = fArr7[i3 + 1];
                            float f20 = fArr7[i3 + 2];
                            float f21 = fArr7[i3 + 3];
                            float[] fArrE = E();
                            System.arraycopy(this.f11704t, i3 + 4, fArrE, 0, 8);
                            i3 += 12;
                            this.f11699O.addRoundRect(f18, f19, f20, f21, fArrE, Path.Direction.CCW);
                            break;
                        default:
                            switch (i7) {
                                case 50:
                                case 51:
                                case 52:
                                    this.f11699O.close();
                                    break;
                                default:
                                    throw new IllegalStateException();
                            }
                            break;
                    }
                } else {
                    float[] fArr8 = this.f11704t;
                    float f22 = fArr8[i3];
                    float f23 = fArr8[i3 + 1];
                    int i14 = i3 + 3;
                    float f24 = fArr8[i3 + 2];
                    i3 += 4;
                    this.f11699O.quadTo(f22, f23, f24, fArr8[i14]);
                }
            }
            this.f11699O.transform(this.xMQ);
            this.J2 = false;
        }
        return this.f11699O;
    }

    public String toString() {
        char c2;
        StringBuilder sb = new StringBuilder();
        sb.append("[UPath: ");
        int i2 = this.rl;
        char c4 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i3 < i2) {
            int i7 = this.f11701n[i3];
            if (i7 == 1) {
                c2 = c4;
                float[] fArrNxk = Nxk(i5);
                i5 += 2;
                sb.append("moveTo(" + fArrNxk[c2] + "," + fArrNxk[1] + ") ");
            } else if (i7 == 2) {
                c2 = c4;
                float[] fArrNxk2 = Nxk(i5);
                i5 += 2;
                sb.append("lineTo(" + fArrNxk2[c2] + "," + fArrNxk2[1] + ") ");
            } else if (i7 != 3) {
                if (i7 != 4) {
                    switch (i7) {
                        case 20:
                            float[] fArr = this.f11704t;
                            float f3 = fArr[i5];
                            int i8 = i5 + 2;
                            float f4 = fArr[i5 + 1];
                            i5 += 3;
                            sb.append("circle(" + f3 + "," + f4 + ", " + fArr[i8] + ") ");
                            break;
                        case 21:
                            float[] fArr2 = this.f11704t;
                            float f5 = fArr2[i5];
                            float f6 = fArr2[i5 + 1];
                            int i9 = i5 + 3;
                            float f7 = fArr2[i5 + 2];
                            i5 += 4;
                            sb.append("oval(" + f5 + ", " + f6 + ", " + f7 + ", " + fArr2[i9] + ") ");
                            break;
                        case 22:
                            float[] fArr3 = this.f11704t;
                            float f8 = fArr3[i5];
                            float f9 = fArr3[i5 + 1];
                            int i10 = i5 + 3;
                            float f10 = fArr3[i5 + 2];
                            i5 += 4;
                            sb.append("rect(" + f8 + ", " + f9 + ", " + f10 + ", " + fArr3[i10] + ") ");
                            break;
                        case 23:
                            float[] fArr4 = this.f11704t;
                            float f11 = fArr4[i5];
                            float f12 = fArr4[i5 + 1];
                            float f13 = fArr4[i5 + 2];
                            float f14 = fArr4[i5 + 3];
                            float f15 = fArr4[i5 + 4];
                            float f16 = fArr4[i5 + 5];
                            float f17 = fArr4[i5 + 6];
                            float f18 = fArr4[i5 + 7];
                            float f19 = fArr4[i5 + 8];
                            float f20 = fArr4[i5 + 9];
                            int i11 = i5 + 11;
                            float f21 = fArr4[i5 + 10];
                            i5 += 12;
                            float f22 = fArr4[i11];
                            sb.append("roundRect(" + f11 + ", " + f12 + ", " + f13 + ", " + f14 + ", ...) ");
                            break;
                        default:
                            switch (i7) {
                                case 50:
                                    sb.append("closePath() ");
                                    break;
                                case 51:
                                    sb.append("closePath(FILL) ");
                                    break;
                                case 52:
                                    sb.append("closePath(EXCLUDE) ");
                                    break;
                                default:
                                    throw new IllegalStateException();
                            }
                            break;
                    }
                } else {
                    float[] fArrNxk3 = Nxk(i5);
                    float f23 = fArrNxk3[c4];
                    float f24 = fArrNxk3[1];
                    float[] fArrNxk4 = Nxk(i5 + 2);
                    i5 += 4;
                    sb.append("quadTo(" + f23 + "," + f24 + ", " + fArrNxk4[c4] + "," + fArrNxk4[1] + ") ");
                }
                c2 = c4;
            } else {
                float[] fArrNxk5 = Nxk(i5);
                float f25 = fArrNxk5[c4];
                float f26 = fArrNxk5[1];
                float[] fArrNxk6 = Nxk(i5 + 2);
                float f27 = fArrNxk6[c4];
                float f28 = fArrNxk6[1];
                float[] fArrNxk7 = Nxk(i5 + 4);
                float f29 = fArrNxk7[c4];
                float f30 = fArrNxk7[1];
                i5 += 6;
                StringBuilder sb2 = new StringBuilder();
                c2 = c4;
                sb2.append(YmsTEL.TxpzydU);
                sb2.append(f25);
                sb2.append(",");
                sb2.append(f26);
                sb2.append(", ");
                sb2.append(f27);
                sb2.append(",");
                sb2.append(f28);
                sb2.append(", ");
                sb2.append(f29);
                sb2.append(",");
                sb2.append(f30);
                sb2.append(") ");
                sb.append(sb2.toString());
            }
            i3++;
            c4 = c2;
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final void a(QJ qj, float f3, float f4) {
        float[] fArrGR = GR(f3, f4);
        qj.qie(fArrGR[0], fArrGR[1]);
    }

    private final void aYN(QJ qj, float f3, float f4, float f5, float f6, float f7, float f8) {
        float[] fArrGR = GR(f3, f4);
        float f9 = fArrGR[0];
        float f10 = fArrGR[1];
        float[] fArrGR2 = GR(f5, f6);
        float f11 = fArrGR2[0];
        float f12 = fArrGR2[1];
        float[] fArrGR3 = GR(f7, f8);
        qj.t(f9, f10, f11, f12, fArrGR3[0], fArrGR3[1]);
    }

    private final void dR0(QJ qj, float f3, float f4) {
        float[] fArrGR = GR(f3, f4);
        qj.az(fArrGR[0], fArrGR[1]);
    }

    private final void piY(QJ qj, float f3, float f4, float f5, float f6) {
        dR0(qj, f3, f5);
        a(qj, f4, f5);
        a(qj, f4, f6);
        a(qj, f3, f6);
        a(qj, f3, f5);
    }

    private final void z(int i2, int i3) {
        FX();
        int[] iArr = this.f11701n;
        if (iArr.length - this.rl < i2) {
            int[] iArr2 = new int[iArr.length + Math.max(i2, 32)];
            int[] iArr3 = this.f11701n;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            this.f11701n = iArr2;
        }
        float[] fArr = this.f11704t;
        if (fArr.length - this.nr < i3) {
            float[] fArr2 = new float[fArr.length + Math.max(i3, 64)];
            float[] fArr3 = this.f11704t;
            System.arraycopy(fArr3, 0, fArr2, 0, fArr3.length);
            this.f11704t = fArr2;
        }
    }

    public Rectangle M7() {
        t().computeBounds(this.ck, true);
        return GeometryKt.toRectangle(this.ck);
    }

    public final void S(float f3, float f4, float f5, float f6) {
        Y(f3, f4);
        J(f5, f4);
        J(f5, f6);
        J(f3, f6);
        J(f3, f4);
    }

    public List eTf() {
        int iP5 = p5();
        final ArrayList arrayList = new ArrayList(iP5);
        for (int i2 = 0; i2 < iP5; i2++) {
            C1487z c1487z = new C1487z();
            c1487z.m(M());
            arrayList.add(c1487z);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        P5(new Function4() { // from class: WzY.n
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return C1487z.xg(arrayList, intRef, this, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
            }
        });
        return arrayList;
    }

    public CompoundCubicBSpline pJg() {
        return CubicBSplineKt.compoundCubicBSplineFromSVGPath(ofS());
    }

    public C1487z(C1487z other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.mUb = 1.0d;
        this.gh = 1.0d;
        this.qie = 1.0d;
        this.az = new float[2];
        this.ty = new float[2];
        this.HI = new float[2];
        this.ck = new RectF();
        Matrix matrix = new Matrix();
        this.f11703r = matrix;
        this.f11702o = matrix;
        this.f11700Z = this.rl < 1;
        int[] iArr = other.f11701n;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.f11701n = iArrCopyOf;
        this.rl = other.rl;
        float[] fArr = other.f11704t;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        this.f11704t = fArrCopyOf;
        this.nr = other.nr;
        this.f11699O = other.J2 ? new Path() : new Path(other.f11699O);
        this.J2 = other.J2;
        m(other.M());
        this.xMQ = new Matrix(other.xMQ);
        this.mUb = other.mUb;
        this.gh = other.gh;
        this.qie = other.qie;
    }
}
