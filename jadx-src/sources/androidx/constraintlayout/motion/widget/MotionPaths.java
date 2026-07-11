package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class MotionPaths implements Comparable<MotionPaths> {
    static String[] M7 = {"position", "x", "y", "width", "height", "pathRotate"};
    float J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    MotionController f35757N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    float f35758O;
    double[] P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    float f35759S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    float f35760T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    double[] f35761U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    int f35762X;
    int Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    float f35763Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f35764e;
    int jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Easing f35766n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f35767o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    float f35768r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    LinkedHashMap f35770v;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f35769t = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f35765g = Float.NaN;
    float E2 = Float.NaN;

    MotionPaths() {
        int i2 = Key.J2;
        this.f35764e = i2;
        this.f35762X = i2;
        this.f35760T = Float.NaN;
        this.f35757N = null;
        this.f35770v = new LinkedHashMap();
        this.Xw = 0;
        this.f35761U = new double[18];
        this.P5 = new double[18];
    }

    void HI(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f3 = keyPosition.f35652n / 100.0f;
        this.f35758O = f3;
        this.f35769t = keyPosition.mUb;
        float f4 = Float.isNaN(keyPosition.gh) ? f3 : keyPosition.gh;
        float f5 = Float.isNaN(keyPosition.qie) ? f3 : keyPosition.qie;
        float f6 = motionPaths2.f35763Z - motionPaths.f35763Z;
        float f7 = motionPaths2.f35759S - motionPaths.f35759S;
        this.J2 = this.f35758O;
        if (!Float.isNaN(keyPosition.az)) {
            f3 = keyPosition.az;
        }
        float f8 = motionPaths.f35768r;
        float f9 = motionPaths.f35763Z;
        float f10 = motionPaths.f35767o;
        float f11 = motionPaths.f35759S;
        float f12 = f3;
        float f13 = (motionPaths2.f35768r + (motionPaths2.f35763Z / 2.0f)) - ((f9 / 2.0f) + f8);
        float f14 = (motionPaths2.f35767o + (motionPaths2.f35759S / 2.0f)) - ((f11 / 2.0f) + f10);
        float f15 = f13 * f12;
        float f16 = (f6 * f4) / 2.0f;
        this.f35768r = (int) ((f8 + f15) - f16);
        float f17 = f14 * f12;
        float f18 = (f7 * f5) / 2.0f;
        this.f35767o = (int) ((f10 + f17) - f18);
        this.f35763Z = (int) (f9 + r7);
        this.f35759S = (int) (f11 + r8);
        float f19 = Float.isNaN(keyPosition.ty) ? 0.0f : keyPosition.ty;
        this.Xw = 1;
        float f20 = (int) ((motionPaths.f35768r + f15) - f16);
        float f21 = (int) ((motionPaths.f35767o + f17) - f18);
        this.f35768r = f20 + ((-f14) * f19);
        this.f35767o = f21 + (f13 * f19);
        this.f35762X = this.f35762X;
        this.f35766n = Easing.t(keyPosition.KN);
        this.f35764e = keyPosition.xMQ;
    }

    void Ik(int i2, int i3, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f3 = keyPosition.f35652n / 100.0f;
        this.f35758O = f3;
        this.f35769t = keyPosition.mUb;
        float f4 = Float.isNaN(keyPosition.gh) ? f3 : keyPosition.gh;
        float f5 = Float.isNaN(keyPosition.qie) ? f3 : keyPosition.qie;
        float f6 = motionPaths2.f35763Z;
        float f7 = motionPaths.f35763Z;
        float f8 = motionPaths2.f35759S;
        float f9 = motionPaths.f35759S;
        this.J2 = this.f35758O;
        float f10 = motionPaths.f35768r;
        float f11 = motionPaths.f35767o;
        float f12 = motionPaths2.f35768r + (f6 / 2.0f);
        float f13 = motionPaths2.f35767o + (f8 / 2.0f);
        float f14 = (f6 - f7) * f4;
        this.f35768r = (int) ((f10 + ((f12 - ((f7 / 2.0f) + f10)) * f3)) - (f14 / 2.0f));
        float f15 = (f8 - f9) * f5;
        this.f35767o = (int) ((f11 + ((f13 - (f11 + (f9 / 2.0f))) * f3)) - (f15 / 2.0f));
        this.f35763Z = (int) (f7 + f14);
        this.f35759S = (int) (f9 + f15);
        this.Xw = 2;
        if (!Float.isNaN(keyPosition.az)) {
            this.f35768r = (int) (keyPosition.az * (i2 - ((int) this.f35763Z)));
        }
        if (!Float.isNaN(keyPosition.ty)) {
            this.f35767o = (int) (keyPosition.ty * (i3 - ((int) this.f35759S)));
        }
        this.f35762X = this.f35762X;
        this.f35766n = Easing.t(keyPosition.KN);
        this.f35764e = keyPosition.xMQ;
    }

    void J2(double[] dArr, int[] iArr) {
        float[] fArr = {this.J2, this.f35768r, this.f35767o, this.f35763Z, this.f35759S, this.f35765g};
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 < 6) {
                dArr[i2] = fArr[r2];
                i2++;
            }
        }
    }

    void KN(double d2, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f3;
        float fSin = this.f35768r;
        float fCos = this.f35767o;
        float f4 = this.f35763Z;
        float f5 = this.f35759S;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f10 = (float) dArr[i2];
            float f11 = (float) dArr2[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                fSin = f10;
                f6 = f11;
            } else if (i3 == 2) {
                fCos = f10;
                f8 = f11;
            } else if (i3 == 3) {
                f4 = f10;
                f7 = f11;
            } else if (i3 == 4) {
                f5 = f10;
                f9 = f11;
            }
        }
        float f12 = (f7 / 2.0f) + f6;
        float fCos2 = (f9 / 2.0f) + f8;
        MotionController motionController = this.f35757N;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.xMQ(d2, fArr3, fArr4);
            float f13 = fArr3[0];
            float f14 = fArr3[1];
            float f15 = fArr4[0];
            float f16 = fArr4[1];
            f3 = 2.0f;
            double d4 = fSin;
            double d5 = fCos;
            fSin = (float) ((((double) f13) + (Math.sin(d5) * d4)) - ((double) (f4 / 2.0f)));
            fCos = (float) ((((double) f14) - (Math.cos(d5) * d4)) - ((double) (f5 / 2.0f)));
            double d6 = f6;
            double dSin = ((double) f15) + (Math.sin(d5) * d6);
            double d7 = f8;
            float fCos3 = (float) (dSin + (Math.cos(d5) * d7));
            fCos2 = (float) ((((double) f16) - (d6 * Math.cos(d5))) + (Math.sin(d5) * d7));
            f12 = fCos3;
        } else {
            f3 = 2.0f;
        }
        fArr[0] = fSin + (f4 / f3) + 0.0f;
        fArr[1] = fCos + (f5 / f3) + 0.0f;
        fArr2[0] = f12;
        fArr2[1] = fCos2;
    }

    void Uo(double d2, int[] iArr, double[] dArr, float[] fArr, int i2) {
        float fSin = this.f35768r;
        float fCos = this.f35767o;
        float f3 = this.f35763Z;
        float f4 = this.f35759S;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f5 = (float) dArr[i3];
            int i5 = iArr[i3];
            if (i5 == 1) {
                fSin = f5;
            } else if (i5 == 2) {
                fCos = f5;
            } else if (i5 == 3) {
                f3 = f5;
            } else if (i5 == 4) {
                f4 = f5;
            }
        }
        MotionController motionController = this.f35757N;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.xMQ(d2, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d4 = f6;
            double d5 = fSin;
            double d6 = fCos;
            fSin = (float) ((d4 + (Math.sin(d6) * d5)) - ((double) (f3 / 2.0f)));
            fCos = (float) ((((double) f7) - (d5 * Math.cos(d6))) - ((double) (f4 / 2.0f)));
        }
        fArr[i2] = fSin + (f3 / 2.0f) + 0.0f;
        fArr[i2 + 1] = fCos + (f4 / 2.0f) + 0.0f;
    }

    public void XQ(MotionController motionController, MotionPaths motionPaths) {
        double d2 = ((this.f35768r + (this.f35763Z / 2.0f)) - motionPaths.f35768r) - (motionPaths.f35763Z / 2.0f);
        double d4 = ((this.f35767o + (this.f35759S / 2.0f)) - motionPaths.f35767o) - (motionPaths.f35759S / 2.0f);
        this.f35757N = motionController;
        this.f35768r = (float) Math.hypot(d4, d2);
        if (Float.isNaN(this.f35760T)) {
            this.f35767o = (float) (Math.atan2(d4, d2) + 1.5707963267948966d);
        } else {
            this.f35767o = (float) Math.toRadians(this.f35760T);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void Z(float f3, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z2) {
        float f4;
        float fSin = this.f35768r;
        float fCos = this.f35767o;
        float f5 = this.f35763Z;
        float f6 = this.f35759S;
        if (iArr.length != 0 && this.f35761U.length <= iArr[iArr.length - 1]) {
            int i2 = iArr[iArr.length - 1] + 1;
            this.f35761U = new double[i2];
            this.P5 = new double[i2];
        }
        Arrays.fill(this.f35761U, Double.NaN);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            double[] dArr4 = this.f35761U;
            int i5 = iArr[i3];
            dArr4[i5] = dArr[i3];
            this.P5[i5] = dArr2[i3];
        }
        float f7 = Float.NaN;
        int i7 = 0;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (true) {
            double[] dArr5 = this.f35761U;
            if (i7 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i7]) && (dArr3 == null || dArr3[i7] == 0.0d)) {
                f4 = f7;
            } else {
                double d2 = dArr3 != null ? dArr3[i7] : 0.0d;
                if (!Double.isNaN(this.f35761U[i7])) {
                    d2 = this.f35761U[i7] + d2;
                }
                f4 = f7;
                float f12 = (float) d2;
                float f13 = (float) this.P5[i7];
                if (i7 == 1) {
                    f7 = f4;
                    f8 = f13;
                    fSin = f12;
                } else if (i7 == 2) {
                    f7 = f4;
                    f9 = f13;
                    fCos = f12;
                } else if (i7 == 3) {
                    f7 = f4;
                    f10 = f13;
                    f5 = f12;
                } else if (i7 == 4) {
                    f7 = f4;
                    f11 = f13;
                    f6 = f12;
                } else if (i7 == 5) {
                    f7 = f12;
                }
                i7++;
            }
            f7 = f4;
            i7++;
        }
        float f14 = f7;
        MotionController motionController = this.f35757N;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.xMQ(f3, fArr, fArr2);
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr2[0];
            float f18 = fArr2[1];
            double d4 = f15;
            double d5 = fSin;
            double d6 = fCos;
            fSin = (float) ((d4 + (Math.sin(d6) * d5)) - ((double) (f5 / 2.0f)));
            fCos = (float) ((((double) f16) - (Math.cos(d6) * d5)) - ((double) (f6 / 2.0f)));
            double d7 = f17;
            double d8 = f8;
            double dSin = d7 + (Math.sin(d6) * d8);
            double dCos = Math.cos(d6) * d5;
            double d9 = f9;
            float f19 = (float) (dSin + (dCos * d9));
            float fCos2 = (float) ((((double) f18) - (d8 * Math.cos(d6))) + (Math.sin(d6) * d5 * d9));
            if (dArr2.length >= 2) {
                dArr2[0] = f19;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f14)) {
                view.setRotation((float) (((double) f14) + Math.toDegrees(Math.atan2(fCos2, f19))));
            }
        } else if (!Float.isNaN(f14)) {
            view.setRotation(f14 + ((float) Math.toDegrees(Math.atan2(f9 + (f11 / 2.0f), f8 + (f10 / 2.0f)))) + 0.0f);
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).n(fSin, fCos, f5 + fSin, f6 + fCos);
            return;
        }
        float f20 = fSin + 0.5f;
        int i8 = (int) f20;
        float f21 = fCos + 0.5f;
        int i9 = (int) f21;
        int i10 = (int) (f20 + f5);
        int i11 = (int) (f21 + f6);
        int i12 = i10 - i8;
        int i13 = i11 - i9;
        if (i12 != view.getMeasuredWidth() || i13 != view.getMeasuredHeight() || z2) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        }
        view.layout(i8, i9, i10, i11);
    }

    void az(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f3 = keyPosition.f35652n / 100.0f;
        this.f35758O = f3;
        this.f35769t = keyPosition.mUb;
        float f4 = Float.isNaN(keyPosition.gh) ? f3 : keyPosition.gh;
        float f5 = Float.isNaN(keyPosition.qie) ? f3 : keyPosition.qie;
        float f6 = motionPaths2.f35763Z;
        float f7 = motionPaths.f35763Z;
        float f8 = f6 - f7;
        float f9 = motionPaths2.f35759S;
        float f10 = motionPaths.f35759S;
        float f11 = f9 - f10;
        this.J2 = this.f35758O;
        float f12 = (f7 / 2.0f) + motionPaths.f35768r;
        float f13 = motionPaths.f35767o + (f10 / 2.0f);
        float f14 = f3;
        float f15 = motionPaths2.f35768r + (f6 / 2.0f);
        float f16 = motionPaths2.f35767o + (f9 / 2.0f);
        if (f12 > f15) {
            f12 = f15;
            f15 = f12;
        }
        if (f13 <= f16) {
            f13 = f16;
            f16 = f13;
        }
        float f17 = f15 - f12;
        float f18 = f13 - f16;
        float f19 = (f8 * f4) / 2.0f;
        this.f35768r = (int) ((r13 + (f17 * f14)) - f19);
        float f20 = (f11 * f5) / 2.0f;
        this.f35767o = (int) ((r14 + (f18 * f14)) - f20);
        this.f35763Z = (int) (f7 + r9);
        this.f35759S = (int) (f10 + r12);
        float f21 = Float.isNaN(keyPosition.az) ? f14 : keyPosition.az;
        float f22 = Float.isNaN(keyPosition.ck) ? 0.0f : keyPosition.ck;
        if (!Float.isNaN(keyPosition.ty)) {
            f14 = keyPosition.ty;
        }
        float f23 = Float.isNaN(keyPosition.HI) ? 0.0f : keyPosition.HI;
        this.Xw = 0;
        this.f35768r = (int) (((motionPaths.f35768r + (f21 * f17)) + (f23 * f18)) - f19);
        this.f35767o = (int) (((motionPaths.f35767o + (f17 * f22)) + (f18 * f14)) - f20);
        this.f35766n = Easing.t(keyPosition.KN);
        this.f35764e = keyPosition.xMQ;
    }

    void ck(int i2, int i3, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float fMin;
        float f3;
        float f4 = keyPosition.f35652n / 100.0f;
        this.f35758O = f4;
        this.f35769t = keyPosition.mUb;
        this.Xw = keyPosition.Ik;
        float f5 = Float.isNaN(keyPosition.gh) ? f4 : keyPosition.gh;
        float f6 = Float.isNaN(keyPosition.qie) ? f4 : keyPosition.qie;
        float f7 = motionPaths2.f35763Z;
        float f8 = motionPaths.f35763Z;
        float f9 = motionPaths2.f35759S;
        float f10 = motionPaths.f35759S;
        this.J2 = this.f35758O;
        this.f35763Z = (int) (f8 + ((f7 - f8) * f5));
        this.f35759S = (int) (f10 + ((f9 - f10) * f6));
        if (keyPosition.Ik != 2) {
            float f11 = Float.isNaN(keyPosition.az) ? f4 : keyPosition.az;
            float f12 = motionPaths2.f35768r;
            float f13 = motionPaths.f35768r;
            this.f35768r = (f11 * (f12 - f13)) + f13;
            if (!Float.isNaN(keyPosition.ty)) {
                f4 = keyPosition.ty;
            }
            float f14 = motionPaths2.f35767o;
            float f15 = motionPaths.f35767o;
            this.f35767o = (f4 * (f14 - f15)) + f15;
        } else {
            if (Float.isNaN(keyPosition.az)) {
                float f16 = motionPaths2.f35768r;
                float f17 = motionPaths.f35768r;
                fMin = ((f16 - f17) * f4) + f17;
            } else {
                fMin = Math.min(f6, f5) * keyPosition.az;
            }
            this.f35768r = fMin;
            if (Float.isNaN(keyPosition.ty)) {
                float f18 = motionPaths2.f35767o;
                float f19 = motionPaths.f35767o;
                f3 = (f4 * (f18 - f19)) + f19;
            } else {
                f3 = keyPosition.ty;
            }
            this.f35767o = f3;
        }
        this.f35762X = motionPaths.f35762X;
        this.f35766n = Easing.t(keyPosition.KN);
        this.f35764e = keyPosition.xMQ;
    }

    void gh(int[] iArr, double[] dArr, float[] fArr, int i2) {
        float f3 = this.f35768r;
        float fCos = this.f35767o;
        float f4 = this.f35763Z;
        float f5 = this.f35759S;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f6 = (float) dArr[i3];
            int i5 = iArr[i3];
            if (i5 == 1) {
                f3 = f6;
            } else if (i5 == 2) {
                fCos = f6;
            } else if (i5 == 3) {
                f4 = f6;
            } else if (i5 == 4) {
                f5 = f6;
            }
        }
        MotionController motionController = this.f35757N;
        if (motionController != null) {
            float fMUb = motionController.mUb();
            float fGh = this.f35757N.gh();
            double d2 = f3;
            double d4 = fCos;
            float fSin = (float) ((((double) fMUb) + (Math.sin(d4) * d2)) - ((double) (f4 / 2.0f)));
            fCos = (float) ((((double) fGh) - (d2 * Math.cos(d4))) - ((double) (f5 / 2.0f)));
            f3 = fSin;
        }
        float f7 = f4 + f3;
        float f8 = f5 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i2] = f3 + 0.0f;
        fArr[i2 + 1] = fCos + 0.0f;
        fArr[i2 + 2] = f7 + 0.0f;
        fArr[i2 + 3] = fCos + 0.0f;
        fArr[i2 + 4] = f7 + 0.0f;
        fArr[i2 + 5] = f8 + 0.0f;
        fArr[i2 + 6] = f3 + 0.0f;
        fArr[i2 + 7] = f8 + 0.0f;
    }

    int mUb(String str) {
        ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f35770v.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.KN();
    }

    public void n(ConstraintSet.Constraint constraint) {
        this.f35766n = Easing.t(constraint.nr.nr);
        ConstraintSet.Motion motion = constraint.nr;
        this.f35764e = motion.f35999O;
        this.f35762X = motion.rl;
        this.f35765g = motion.xMQ;
        this.f35769t = motion.J2;
        this.jB = motion.f36001t;
        this.E2 = constraint.f35967t.f36002O;
        this.f35760T = constraint.f35965O.fD;
        for (String str : constraint.Uo.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) constraint.Uo.get(str);
            if (constraintAttribute != null && constraintAttribute.Uo()) {
                this.f35770v.put(str, constraintAttribute);
            }
        }
    }

    void nr(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z2) {
        boolean zT2 = t(this.f35768r, motionPaths.f35768r);
        boolean zT3 = t(this.f35767o, motionPaths.f35767o);
        zArr[0] = zArr[0] | t(this.J2, motionPaths.J2);
        boolean z3 = zT2 | zT3 | z2;
        zArr[1] = zArr[1] | z3;
        zArr[2] = z3 | zArr[2];
        zArr[3] = zArr[3] | t(this.f35763Z, motionPaths.f35763Z);
        zArr[4] = t(this.f35759S, motionPaths.f35759S) | zArr[4];
    }

    void o(float f3, float f4, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f9 = (float) dArr[i2];
            double d2 = dArr2[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f5 = f9;
            } else if (i3 == 2) {
                f7 = f9;
            } else if (i3 == 3) {
                f6 = f9;
            } else if (i3 == 4) {
                f8 = f9;
            }
        }
        float f10 = f5 - ((0.0f * f6) / 2.0f);
        float f11 = f7 - ((0.0f * f8) / 2.0f);
        fArr[0] = (f10 * (1.0f - f3)) + (((f6 * 1.0f) + f10) * f3) + 0.0f;
        fArr[1] = (f11 * (1.0f - f4)) + (((f8 * 1.0f) + f11) * f4) + 0.0f;
    }

    boolean qie(String str) {
        return this.f35770v.containsKey(str);
    }

    void r(float f3, float f4, float f5, float f6) {
        this.f35768r = f3;
        this.f35767o = f4;
        this.f35763Z = f5;
        this.f35759S = f6;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.J2, motionPaths.J2);
    }

    void ty(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f3 = keyPosition.f35652n / 100.0f;
        this.f35758O = f3;
        this.f35769t = keyPosition.mUb;
        float f4 = Float.isNaN(keyPosition.gh) ? f3 : keyPosition.gh;
        float f5 = Float.isNaN(keyPosition.qie) ? f3 : keyPosition.qie;
        float f6 = motionPaths2.f35763Z;
        float f7 = motionPaths.f35763Z;
        float f8 = motionPaths2.f35759S;
        float f9 = motionPaths.f35759S;
        this.J2 = this.f35758O;
        float f10 = motionPaths.f35768r;
        float f11 = motionPaths.f35767o;
        float f12 = f3;
        float f13 = (motionPaths2.f35768r + (f6 / 2.0f)) - ((f7 / 2.0f) + f10);
        float f14 = (motionPaths2.f35767o + (f8 / 2.0f)) - (f11 + (f9 / 2.0f));
        float f15 = ((f6 - f7) * f4) / 2.0f;
        this.f35768r = (int) ((f10 + (f13 * f12)) - f15);
        float f16 = ((f8 - f9) * f5) / 2.0f;
        this.f35767o = (int) ((f11 + (f14 * f12)) - f16);
        this.f35763Z = (int) (f7 + r9);
        this.f35759S = (int) (f9 + r12);
        float f17 = Float.isNaN(keyPosition.az) ? f12 : keyPosition.az;
        float f18 = Float.isNaN(keyPosition.ck) ? 0.0f : keyPosition.ck;
        if (!Float.isNaN(keyPosition.ty)) {
            f12 = keyPosition.ty;
        }
        float f19 = Float.isNaN(keyPosition.HI) ? 0.0f : keyPosition.HI;
        this.Xw = 0;
        this.f35768r = (int) (((motionPaths.f35768r + (f17 * f13)) + (f19 * f14)) - f15);
        this.f35767o = (int) (((motionPaths.f35767o + (f13 * f18)) + (f14 * f12)) - f16);
        this.f35766n = Easing.t(keyPosition.KN);
        this.f35764e = keyPosition.xMQ;
    }

    int xMQ(String str, double[] dArr, int i2) {
        ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f35770v.get(str);
        int i3 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.KN() == 1) {
            dArr[i2] = constraintAttribute.O();
            return 1;
        }
        int iKN = constraintAttribute.KN();
        constraintAttribute.J2(new float[iKN]);
        while (i3 < iKN) {
            dArr[i2] = r2[i3];
            i3++;
            i2++;
        }
        return iKN;
    }

    private boolean t(float f3, float f4) {
        if (!Float.isNaN(f3) && !Float.isNaN(f4)) {
            if (Math.abs(f3 - f4) <= 1.0E-6f) {
                return false;
            }
            return true;
        }
        if (Float.isNaN(f3) == Float.isNaN(f4)) {
            return false;
        }
        return true;
    }

    MotionPaths(int i2, int i3, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        int i5 = Key.J2;
        this.f35764e = i5;
        this.f35762X = i5;
        this.f35760T = Float.NaN;
        this.f35757N = null;
        this.f35770v = new LinkedHashMap();
        this.Xw = 0;
        this.f35761U = new double[18];
        this.P5 = new double[18];
        if (motionPaths.f35762X != Key.J2) {
            ck(i2, i3, keyPosition, motionPaths, motionPaths2);
            return;
        }
        int i7 = keyPosition.Ik;
        if (i7 == 1) {
            HI(keyPosition, motionPaths, motionPaths2);
            return;
        }
        if (i7 == 2) {
            Ik(i2, i3, keyPosition, motionPaths, motionPaths2);
        } else if (i7 != 3) {
            ty(keyPosition, motionPaths, motionPaths2);
        } else {
            az(keyPosition, motionPaths, motionPaths2);
        }
    }
}
