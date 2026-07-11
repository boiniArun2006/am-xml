package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    static String[] M7 = {"position", "x", "y", "width", "height", "pathRotate"};
    float E2;
    float J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    Motion f35213N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    float f35214O;
    double[] P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    float f35215S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    float f35216T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    double[] f35217U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    String f35218X;
    int Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    float f35219Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f35220e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f35221g;
    int jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Easing f35222n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f35223o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    float f35224r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f35225t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    HashMap f35226v;

    public MotionPaths() {
        this.f35225t = 0;
        this.f35221g = Float.NaN;
        this.E2 = Float.NaN;
        this.f35220e = -1;
        this.f35218X = null;
        this.f35216T = Float.NaN;
        this.f35213N = null;
        this.f35226v = new HashMap();
        this.Xw = 0;
        this.f35217U = new double[18];
        this.P5 = new double[18];
    }

    void HI(int i2, int i3, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f3 = motionKeyPosition.f35236n / 100.0f;
        this.f35214O = f3;
        this.f35225t = motionKeyPosition.mUb;
        float f4 = Float.isNaN(motionKeyPosition.gh) ? f3 : motionKeyPosition.gh;
        float f5 = Float.isNaN(motionKeyPosition.qie) ? f3 : motionKeyPosition.qie;
        float f6 = motionPaths2.f35219Z;
        float f7 = motionPaths.f35219Z;
        float f8 = motionPaths2.f35215S;
        float f9 = motionPaths.f35215S;
        this.J2 = this.f35214O;
        float f10 = motionPaths.f35224r;
        float f11 = motionPaths.f35223o;
        float f12 = motionPaths2.f35224r + (f6 / 2.0f);
        float f13 = motionPaths2.f35223o + (f8 / 2.0f);
        float f14 = (f6 - f7) * f4;
        this.f35224r = (int) ((f10 + ((f12 - ((f7 / 2.0f) + f10)) * f3)) - (f14 / 2.0f));
        float f15 = (f8 - f9) * f5;
        this.f35223o = (int) ((f11 + ((f13 - (f11 + (f9 / 2.0f))) * f3)) - (f15 / 2.0f));
        this.f35219Z = (int) (f7 + f14);
        this.f35215S = (int) (f9 + f15);
        this.Xw = 2;
        if (!Float.isNaN(motionKeyPosition.az)) {
            this.f35224r = (int) (motionKeyPosition.az * (i2 - ((int) this.f35219Z)));
        }
        if (!Float.isNaN(motionKeyPosition.ty)) {
            this.f35223o = (int) (motionKeyPosition.ty * (i3 - ((int) this.f35215S)));
        }
        this.f35218X = this.f35218X;
        this.f35222n = Easing.t(motionKeyPosition.KN);
        this.f35220e = motionKeyPosition.xMQ;
    }

    void Ik(float f3, float f4, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f9 = (float) dArr[i2];
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

    void J2(double[] dArr, int[] iArr) {
        float[] fArr = {this.J2, this.f35224r, this.f35223o, this.f35219Z, this.f35215S, this.f35221g};
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
        float fSin = this.f35224r;
        float fCos = this.f35223o;
        float f4 = this.f35219Z;
        float f5 = this.f35215S;
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
        Motion motion = this.f35213N;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.gh(d2, fArr3, fArr4);
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
        float fSin = this.f35224r;
        float fCos = this.f35223o;
        float f3 = this.f35219Z;
        float f4 = this.f35215S;
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
        Motion motion = this.f35213N;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.gh(d2, fArr2, new float[2]);
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

    void az(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f3 = motionKeyPosition.f35236n / 100.0f;
        this.f35214O = f3;
        this.f35225t = motionKeyPosition.mUb;
        float f4 = Float.isNaN(motionKeyPosition.gh) ? f3 : motionKeyPosition.gh;
        float f5 = Float.isNaN(motionKeyPosition.qie) ? f3 : motionKeyPosition.qie;
        float f6 = motionPaths2.f35219Z - motionPaths.f35219Z;
        float f7 = motionPaths2.f35215S - motionPaths.f35215S;
        this.J2 = this.f35214O;
        if (!Float.isNaN(motionKeyPosition.az)) {
            f3 = motionKeyPosition.az;
        }
        float f8 = motionPaths.f35224r;
        float f9 = motionPaths.f35219Z;
        float f10 = motionPaths.f35223o;
        float f11 = motionPaths.f35215S;
        float f12 = f3;
        float f13 = (motionPaths2.f35224r + (motionPaths2.f35219Z / 2.0f)) - ((f9 / 2.0f) + f8);
        float f14 = (motionPaths2.f35223o + (motionPaths2.f35215S / 2.0f)) - ((f11 / 2.0f) + f10);
        float f15 = f13 * f12;
        float f16 = (f6 * f4) / 2.0f;
        this.f35224r = (int) ((f8 + f15) - f16);
        float f17 = f14 * f12;
        float f18 = (f7 * f5) / 2.0f;
        this.f35223o = (int) ((f10 + f17) - f18);
        this.f35219Z = (int) (f9 + r7);
        this.f35215S = (int) (f11 + r8);
        float f19 = Float.isNaN(motionKeyPosition.ty) ? 0.0f : motionKeyPosition.ty;
        this.Xw = 1;
        float f20 = (int) ((motionPaths.f35224r + f15) - f16);
        float f21 = (int) ((motionPaths.f35223o + f17) - f18);
        this.f35224r = f20 + ((-f14) * f19);
        this.f35223o = f21 + (f13 * f19);
        this.f35218X = this.f35218X;
        this.f35222n = Easing.t(motionKeyPosition.KN);
        this.f35220e = motionKeyPosition.xMQ;
    }

    void ck(float f3, float f4, float f5, float f6) {
        this.f35224r = f3;
        this.f35223o = f4;
        this.f35219Z = f5;
        this.f35215S = f6;
    }

    boolean gh(String str) {
        return this.f35226v.containsKey(str);
    }

    int mUb(String str) {
        CustomVariable customVariable = (CustomVariable) this.f35226v.get(str);
        if (customVariable == null) {
            return 0;
        }
        return customVariable.az();
    }

    public void n(MotionWidget motionWidget) {
        ConstraintWidget constraintWidget;
        this.f35222n = Easing.t(motionWidget.rl.f35232t);
        MotionWidget.Motion motion = motionWidget.rl;
        this.f35220e = motion.nr;
        this.f35218X = motion.f35231n;
        this.f35221g = motion.KN;
        this.f35225t = motion.f35230O;
        this.jB = motion.rl;
        this.E2 = motionWidget.f35229t.nr;
        WidgetFrame widgetFrame = motionWidget.f35228n;
        if (widgetFrame != null && (constraintWidget = widgetFrame.f35462n) != null) {
            this.f35216T = constraintWidget.s7N;
        }
        for (String str : motionWidget.mUb()) {
            CustomVariable customVariableXMQ = motionWidget.xMQ(str);
            if (customVariableXMQ != null && customVariableXMQ.qie()) {
                this.f35226v.put(str, customVariableXMQ);
            }
        }
    }

    void nr(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z2) {
        boolean zT2 = t(this.f35224r, motionPaths.f35224r);
        boolean zT3 = t(this.f35223o, motionPaths.f35223o);
        zArr[0] = zArr[0] | t(this.J2, motionPaths.J2);
        zArr[1] = zArr[1] | (zT2 || zT3 || z2);
        zArr[2] = zArr[2] | (zT2 || zT3 || z2);
        zArr[3] = zArr[3] | t(this.f35219Z, motionPaths.f35219Z);
        zArr[4] = t(this.f35215S, motionPaths.f35215S) | zArr[4];
    }

    public void o(Motion motion, MotionPaths motionPaths) {
        double d2 = ((this.f35224r + (this.f35219Z / 2.0f)) - motionPaths.f35224r) - (motionPaths.f35219Z / 2.0f);
        double d4 = ((this.f35223o + (this.f35215S / 2.0f)) - motionPaths.f35223o) - (motionPaths.f35215S / 2.0f);
        this.f35213N = motion;
        this.f35224r = (float) Math.hypot(d4, d2);
        if (Float.isNaN(this.f35216T)) {
            this.f35223o = (float) (Math.atan2(d4, d2) + 1.5707963267948966d);
        } else {
            this.f35223o = (float) Math.toRadians(this.f35216T);
        }
    }

    void qie(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f3 = motionKeyPosition.f35236n / 100.0f;
        this.f35214O = f3;
        this.f35225t = motionKeyPosition.mUb;
        float f4 = Float.isNaN(motionKeyPosition.gh) ? f3 : motionKeyPosition.gh;
        float f5 = Float.isNaN(motionKeyPosition.qie) ? f3 : motionKeyPosition.qie;
        float f6 = motionPaths2.f35219Z;
        float f7 = motionPaths.f35219Z;
        float f8 = motionPaths2.f35215S;
        float f9 = motionPaths.f35215S;
        this.J2 = this.f35214O;
        float f10 = motionPaths.f35224r;
        float f11 = motionPaths.f35223o;
        float f12 = f3;
        float f13 = (motionPaths2.f35224r + (f6 / 2.0f)) - ((f7 / 2.0f) + f10);
        float f14 = (motionPaths2.f35223o + (f8 / 2.0f)) - (f11 + (f9 / 2.0f));
        float f15 = ((f6 - f7) * f4) / 2.0f;
        this.f35224r = (int) ((f10 + (f13 * f12)) - f15);
        float f16 = ((f8 - f9) * f5) / 2.0f;
        this.f35223o = (int) ((f11 + (f14 * f12)) - f16);
        this.f35219Z = (int) (f7 + r9);
        this.f35215S = (int) (f9 + r12);
        float f17 = Float.isNaN(motionKeyPosition.az) ? f12 : motionKeyPosition.az;
        float f18 = Float.isNaN(motionKeyPosition.ck) ? 0.0f : motionKeyPosition.ck;
        if (!Float.isNaN(motionKeyPosition.ty)) {
            f12 = motionKeyPosition.ty;
        }
        float f19 = Float.isNaN(motionKeyPosition.HI) ? 0.0f : motionKeyPosition.HI;
        this.Xw = 0;
        this.f35224r = (int) (((motionPaths.f35224r + (f17 * f13)) + (f19 * f14)) - f15);
        this.f35223o = (int) (((motionPaths.f35223o + (f13 * f18)) + (f14 * f12)) - f16);
        this.f35222n = Easing.t(motionKeyPosition.KN);
        this.f35220e = motionKeyPosition.xMQ;
    }

    void r(float f3, MotionWidget motionWidget, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f4;
        float fSin = this.f35224r;
        float fCos = this.f35223o;
        float f5 = this.f35219Z;
        float f6 = this.f35215S;
        if (iArr.length != 0 && this.f35217U.length <= iArr[iArr.length - 1]) {
            int i2 = iArr[iArr.length - 1] + 1;
            this.f35217U = new double[i2];
            this.P5 = new double[i2];
        }
        Arrays.fill(this.f35217U, Double.NaN);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            double[] dArr4 = this.f35217U;
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
            double[] dArr5 = this.f35217U;
            if (i7 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i7]) && (dArr3 == null || dArr3[i7] == 0.0d)) {
                f4 = f7;
            } else {
                double d2 = dArr3 != null ? dArr3[i7] : 0.0d;
                if (!Double.isNaN(this.f35217U[i7])) {
                    d2 = this.f35217U[i7] + d2;
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
        Motion motion = this.f35213N;
        if (motion != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motion.gh(f3, fArr, fArr2);
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
                motionWidget.wTp((float) (((double) f14) + Math.toDegrees(Math.atan2(fCos2, f19))));
            }
        } else if (!Float.isNaN(f14)) {
            motionWidget.wTp(((float) (((double) f14) + Math.toDegrees(Math.atan2(f9 + (f11 / 2.0f), f8 + (f10 / 2.0f))))) + 0.0f);
        }
        float f20 = fSin + 0.5f;
        float f21 = fCos + 0.5f;
        motionWidget.E2((int) f20, (int) f21, (int) (f20 + f5), (int) (f21 + f6));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.J2, motionPaths.J2);
    }

    void ty(int i2, int i3, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float fMin;
        float f3;
        float f4 = motionKeyPosition.f35236n / 100.0f;
        this.f35214O = f4;
        this.f35225t = motionKeyPosition.mUb;
        this.Xw = motionKeyPosition.Ik;
        float f5 = Float.isNaN(motionKeyPosition.gh) ? f4 : motionKeyPosition.gh;
        float f6 = Float.isNaN(motionKeyPosition.qie) ? f4 : motionKeyPosition.qie;
        float f7 = motionPaths2.f35219Z;
        float f8 = motionPaths.f35219Z;
        float f9 = motionPaths2.f35215S;
        float f10 = motionPaths.f35215S;
        this.J2 = this.f35214O;
        this.f35219Z = (int) (f8 + ((f7 - f8) * f5));
        this.f35215S = (int) (f10 + ((f9 - f10) * f6));
        int i5 = motionKeyPosition.Ik;
        if (i5 == 1) {
            float f11 = Float.isNaN(motionKeyPosition.az) ? f4 : motionKeyPosition.az;
            float f12 = motionPaths2.f35224r;
            float f13 = motionPaths.f35224r;
            this.f35224r = (f11 * (f12 - f13)) + f13;
            if (!Float.isNaN(motionKeyPosition.ty)) {
                f4 = motionKeyPosition.ty;
            }
            float f14 = motionPaths2.f35223o;
            float f15 = motionPaths.f35223o;
            this.f35223o = (f4 * (f14 - f15)) + f15;
        } else if (i5 != 2) {
            float f16 = Float.isNaN(motionKeyPosition.az) ? f4 : motionKeyPosition.az;
            float f17 = motionPaths2.f35224r;
            float f18 = motionPaths.f35224r;
            this.f35224r = (f16 * (f17 - f18)) + f18;
            if (!Float.isNaN(motionKeyPosition.ty)) {
                f4 = motionKeyPosition.ty;
            }
            float f19 = motionPaths2.f35223o;
            float f20 = motionPaths.f35223o;
            this.f35223o = (f4 * (f19 - f20)) + f20;
        } else {
            if (Float.isNaN(motionKeyPosition.az)) {
                float f21 = motionPaths2.f35224r;
                float f22 = motionPaths.f35224r;
                fMin = ((f21 - f22) * f4) + f22;
            } else {
                fMin = Math.min(f6, f5) * motionKeyPosition.az;
            }
            this.f35224r = fMin;
            if (Float.isNaN(motionKeyPosition.ty)) {
                float f23 = motionPaths2.f35223o;
                float f24 = motionPaths.f35223o;
                f3 = (f4 * (f23 - f24)) + f24;
            } else {
                f3 = motionKeyPosition.ty;
            }
            this.f35223o = f3;
        }
        this.f35218X = motionPaths.f35218X;
        this.f35222n = Easing.t(motionKeyPosition.KN);
        this.f35220e = motionKeyPosition.xMQ;
    }

    int xMQ(String str, double[] dArr, int i2) {
        CustomVariable customVariable = (CustomVariable) this.f35226v.get(str);
        int i3 = 0;
        if (customVariable == null) {
            return 0;
        }
        if (customVariable.az() == 1) {
            dArr[i2] = customVariable.mUb();
            return 1;
        }
        int iAz = customVariable.az();
        customVariable.gh(new float[iAz]);
        while (i3 < iAz) {
            dArr[i2] = r2[i3];
            i3++;
            i2++;
        }
        return iAz;
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

    public MotionPaths(int i2, int i3, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.f35225t = 0;
        this.f35221g = Float.NaN;
        this.E2 = Float.NaN;
        this.f35220e = -1;
        this.f35218X = null;
        this.f35216T = Float.NaN;
        this.f35213N = null;
        this.f35226v = new HashMap();
        this.Xw = 0;
        this.f35217U = new double[18];
        this.P5 = new double[18];
        if (motionPaths.f35218X != null) {
            ty(i2, i3, motionKeyPosition, motionPaths, motionPaths2);
            return;
        }
        int i5 = motionKeyPosition.Ik;
        if (i5 == 1) {
            az(motionKeyPosition, motionPaths, motionPaths2);
        } else if (i5 != 2) {
            qie(motionKeyPosition, motionPaths, motionPaths2);
        } else {
            HI(i2, i3, motionKeyPosition, motionPaths, motionPaths2);
        }
    }
}
