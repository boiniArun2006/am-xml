package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Motion implements TypedValues {
    private double[] HI;
    private int[] Ik;
    private CurveFit[] KN;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    Motion f35182T;
    private HashMap ViF;
    private HashMap WPU;
    private HashMap aYN;
    private int[] az;
    private String[] ck;
    private MotionKeyTrigger[] nY;
    MotionWidget rl;
    private double[] ty;
    private CurveFit xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Rect f35187n = new Rect();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35190t = 0;
    private MotionPaths nr = new MotionPaths();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private MotionPaths f35180O = new MotionPaths();
    private MotionConstrainedPoint J2 = new MotionConstrainedPoint();
    private MotionConstrainedPoint Uo = new MotionConstrainedPoint();
    float mUb = Float.NaN;
    float gh = 0.0f;
    float qie = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f35189r = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float[] f35188o = new float[4];

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private ArrayList f35184Z = new ArrayList();
    private float[] XQ = new float[1];

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private ArrayList f35181S = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35186g = -1;
    private int te = -1;
    private MotionWidget iF = null;
    private int fD = -1;
    private float E2 = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DifferentialInterpolator f35185e = null;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f35183X = false;

    private static DifferentialInterpolator HI(int i2, String str, int i3) {
        if (i2 != -1) {
            return null;
        }
        final Easing easingT = Easing.t(str);
        return new DifferentialInterpolator() { // from class: androidx.constraintlayout.core.motion.Motion.1

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            float f35191n;

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getInterpolation(float f3) {
                this.f35191n = f3;
                return (float) easingT.n(f3);
            }
        };
    }

    private float xMQ(float f3, float[] fArr) {
        float f4 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f5 = this.qie;
            if (f5 != 1.0d) {
                float f6 = this.gh;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && f3 < 1.0d) {
                    f3 = Math.min((f3 - f6) * f5, 1.0f);
                }
            }
        }
        Easing easing = this.nr.f35222n;
        float f7 = Float.NaN;
        for (MotionPaths motionPaths : this.f35184Z) {
            Easing easing2 = motionPaths.f35222n;
            if (easing2 != null) {
                float f8 = motionPaths.f35214O;
                if (f8 < f3) {
                    easing = easing2;
                    f4 = f8;
                } else if (Float.isNaN(f7)) {
                    f7 = motionPaths.f35214O;
                }
            }
        }
        if (easing != null) {
            float f9 = (Float.isNaN(f7) ? 1.0f : f7) - f4;
            double d2 = (f3 - f4) / f9;
            f3 = (((float) easing.n(d2)) * f9) + f4;
            if (fArr != null) {
                fArr[0] = (float) easing.rl(d2);
            }
        }
        return f3;
    }

    public int Uo(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrKN = this.KN[0].KN();
        if (iArr != null) {
            Iterator it = this.f35184Z.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                iArr[i2] = ((MotionPaths) it.next()).Xw;
                i2++;
            }
        }
        if (iArr2 != null) {
            Iterator it2 = this.f35184Z.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                iArr2[i3] = (int) (((MotionPaths) it2.next()).J2 * 100.0f);
                i3++;
            }
        }
        int i5 = 0;
        for (int i7 = 0; i7 < dArrKN.length; i7++) {
            this.KN[0].nr(dArrKN[i7], this.ty);
            this.nr.Uo(dArrKN[i7], this.az, this.ty, fArr, i5);
            i5 += 2;
        }
        return i5 / 2;
    }

    public void gh(double d2, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.KN[0].nr(d2, dArr);
        this.KN[0].Uo(d2, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.nr.KN(d2, this.az, dArr, fArr, dArr2, fArr2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int n(String str) {
        return 0;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean nr(int i2, boolean z2) {
        return false;
    }

    private float Ik() {
        float[] fArr = new float[2];
        float f3 = 1.0f / 99;
        double d2 = 0.0d;
        double d4 = 0.0d;
        int i2 = 0;
        float fHypot = 0.0f;
        while (i2 < 100) {
            float f4 = i2 * f3;
            double dN = f4;
            Easing easing = this.nr.f35222n;
            float f5 = Float.NaN;
            float f6 = 0.0f;
            for (MotionPaths motionPaths : this.f35184Z) {
                Easing easing2 = motionPaths.f35222n;
                if (easing2 != null) {
                    float f7 = motionPaths.f35214O;
                    if (f7 < f4) {
                        easing = easing2;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = motionPaths.f35214O;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                dN = (((float) easing.n((f4 - f6) / r17)) * (f5 - f6)) + f6;
            }
            double d5 = dN;
            this.KN[0].nr(d5, this.ty);
            int i3 = i2;
            this.nr.Uo(d5, this.az, this.ty, fArr, 0);
            if (i3 > 0) {
                fHypot += (float) Math.hypot(d4 - ((double) fArr[1]), d2 - ((double) fArr[0]));
            }
            d2 = fArr[0];
            d4 = fArr[1];
            i2 = i3 + 1;
        }
        return fHypot;
    }

    private void XQ(MotionPaths motionPaths) {
        motionPaths.ck(this.rl.iF(), this.rl.fD(), this.rl.te(), this.rl.gh());
    }

    private void iF() {
        Motion motion = this.f35182T;
        if (motion == null) {
            return;
        }
        this.nr.o(motion, motion.nr);
        MotionPaths motionPaths = this.f35180O;
        Motion motion2 = this.f35182T;
        motionPaths.o(motion2, motion2.f35180O);
    }

    private void o(MotionPaths motionPaths) {
        MotionPaths motionPaths2 = null;
        for (MotionPaths motionPaths3 : this.f35184Z) {
            if (motionPaths.J2 == motionPaths3.J2) {
                motionPaths2 = motionPaths3;
            }
        }
        if (motionPaths2 != null) {
            this.f35184Z.remove(motionPaths2);
        }
        if (Collections.binarySearch(this.f35184Z, motionPaths) == 0) {
            Utils.n("MotionController", " KeyPath position \"" + motionPaths.J2 + "\" outside of range");
        }
        this.f35184Z.add((-r0) - 1, motionPaths);
    }

    public void J2(MotionKey motionKey) {
        this.f35181S.add(motionKey);
    }

    public void KN(float[] fArr, int i2) {
        int i3 = i2;
        float f3 = 1.0f;
        float f4 = 1.0f / (i3 - 1);
        HashMap map = this.aYN;
        SplineSet splineSet = map == null ? null : (SplineSet) map.get("translationX");
        HashMap map2 = this.aYN;
        SplineSet splineSet2 = map2 == null ? null : (SplineSet) map2.get("translationY");
        HashMap map3 = this.ViF;
        KeyCycleOscillator keyCycleOscillator = map3 == null ? null : (KeyCycleOscillator) map3.get("translationX");
        HashMap map4 = this.ViF;
        KeyCycleOscillator keyCycleOscillator2 = map4 != null ? (KeyCycleOscillator) map4.get("translationY") : null;
        int i5 = 0;
        while (i5 < i3) {
            float fMin = i5 * f4;
            float f5 = this.qie;
            float f6 = 0.0f;
            if (f5 != f3) {
                float f7 = this.gh;
                if (fMin < f7) {
                    fMin = 0.0f;
                }
                if (fMin > f7 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f7) * f5, f3);
                }
            }
            double dN = fMin;
            Easing easing = this.nr.f35222n;
            float f8 = Float.NaN;
            for (MotionPaths motionPaths : this.f35184Z) {
                Easing easing2 = motionPaths.f35222n;
                if (easing2 != null) {
                    float f9 = motionPaths.f35214O;
                    if (f9 < fMin) {
                        f6 = f9;
                        easing = easing2;
                    } else if (Float.isNaN(f8)) {
                        f8 = motionPaths.f35214O;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                dN = (((float) easing.n((fMin - f6) / r16)) * (f8 - f6)) + f6;
            }
            this.KN[0].nr(dN, this.ty);
            CurveFit curveFit = this.xMQ;
            if (curveFit != null) {
                double[] dArr = this.ty;
                if (dArr.length > 0) {
                    curveFit.nr(dN, dArr);
                }
            }
            int i7 = i5 * 2;
            this.nr.Uo(dN, this.az, this.ty, fArr, i7);
            if (keyCycleOscillator != null) {
                fArr[i7] = fArr[i7] + keyCycleOscillator.n(fMin);
            } else if (splineSet != null) {
                fArr[i7] = fArr[i7] + splineSet.n(fMin);
            }
            if (keyCycleOscillator2 != null) {
                int i8 = i7 + 1;
                fArr[i8] = fArr[i8] + keyCycleOscillator2.n(fMin);
            } else if (splineSet2 != null) {
                int i9 = i7 + 1;
                fArr[i9] = fArr[i9] + splineSet2.n(fMin);
            }
            i5++;
            i3 = i2;
            f3 = 1.0f;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean O(int i2, String str) {
        if (705 == i2 || 611 == i2) {
            this.f35185e = HI(-1, str, 0);
            return true;
        }
        if (605 != i2) {
            return false;
        }
        this.nr.f35218X = str;
        return true;
    }

    public void S(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.f35180O;
        motionPaths.f35214O = 1.0f;
        motionPaths.J2 = 1.0f;
        XQ(motionPaths);
        this.f35180O.ck(motionWidget.qie(), motionWidget.S(), motionWidget.te(), motionWidget.gh());
        this.f35180O.n(motionWidget);
        this.Uo.KN(motionWidget);
    }

    public void ViF(float f3) {
        this.qie = f3;
    }

    public void WPU(int i2) {
        this.f35186g = i2;
    }

    public boolean Z(MotionWidget motionWidget, float f3, long j2, KeyCache keyCache) {
        MotionWidget motionWidget2 = motionWidget;
        float fXMQ = xMQ(f3, null);
        int i2 = this.fD;
        if (i2 != -1) {
            float f4 = 1.0f / i2;
            float fFloor = ((float) Math.floor(fXMQ / f4)) * f4;
            float f5 = (fXMQ % f4) / f4;
            if (!Float.isNaN(this.E2)) {
                f5 = (f5 + this.E2) % 1.0f;
            }
            DifferentialInterpolator differentialInterpolator = this.f35185e;
            fXMQ = ((differentialInterpolator != null ? differentialInterpolator.getInterpolation(f5) : ((double) f5) > 0.5d ? 1.0f : 0.0f) * f4) + fFloor;
        }
        float f6 = fXMQ;
        HashMap map = this.aYN;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((SplineSet) it.next()).J2(motionWidget2, f6);
            }
        }
        CurveFit[] curveFitArr = this.KN;
        if (curveFitArr != null) {
            double d2 = f6;
            curveFitArr[0].nr(d2, this.ty);
            this.KN[0].Uo(d2, this.HI);
            CurveFit curveFit = this.xMQ;
            if (curveFit != null) {
                double[] dArr = this.ty;
                if (dArr.length > 0) {
                    curveFit.nr(d2, dArr);
                    this.xMQ.Uo(d2, this.HI);
                }
            }
            if (!this.f35183X) {
                this.nr.r(f6, motionWidget2, this.az, this.ty, this.HI, null);
                f6 = f6;
                motionWidget2 = motionWidget2;
            }
            if (this.te != -1) {
                if (this.iF == null) {
                    this.iF = motionWidget2.az().J2(this.te);
                }
                if (this.iF != null) {
                    float fS = (r1.S() + this.iF.KN()) / 2.0f;
                    float fQie = (this.iF.qie() + this.iF.ck()) / 2.0f;
                    if (motionWidget2.ck() - motionWidget2.qie() > 0 && motionWidget2.KN() - motionWidget2.S() > 0) {
                        motionWidget2.nHg(fQie - motionWidget2.qie());
                        motionWidget2.s7N(fS - motionWidget2.S());
                    }
                }
            }
            int i3 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.KN;
                if (i3 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i3].O(d2, this.f35188o);
                ((CustomVariable) this.nr.f35226v.get(this.ck[i3 - 1])).Ik(motionWidget2, this.f35188o);
                i3++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.J2;
            if (motionConstrainedPoint.f35211t == 0) {
                if (f6 <= 0.0f) {
                    motionWidget2.jB(motionConstrainedPoint.f35200O);
                } else if (f6 >= 1.0f) {
                    motionWidget2.jB(this.Uo.f35200O);
                } else if (this.Uo.f35200O != motionConstrainedPoint.f35200O) {
                    motionWidget2.jB(4);
                }
            }
            if (this.nY != null) {
                int i5 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = this.nY;
                    if (i5 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i5].az(f6, motionWidget2);
                    i5++;
                }
            }
        } else {
            MotionPaths motionPaths = this.nr;
            float f7 = motionPaths.f35224r;
            MotionPaths motionPaths2 = this.f35180O;
            float f8 = f7 + ((motionPaths2.f35224r - f7) * f6);
            float f9 = motionPaths.f35223o;
            float f10 = f9 + ((motionPaths2.f35223o - f9) * f6);
            float f11 = motionPaths.f35219Z;
            float f12 = f11 + ((motionPaths2.f35219Z - f11) * f6);
            float f13 = motionPaths.f35215S;
            float f14 = f8 + 0.5f;
            float f15 = f10 + 0.5f;
            motionWidget2.E2((int) f14, (int) f15, (int) (f14 + f12), (int) (f15 + f13 + ((motionPaths2.f35215S - f13) * f6)));
        }
        HashMap map2 = this.ViF;
        if (map2 != null) {
            for (KeyCycleOscillator keyCycleOscillator : map2.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr2 = this.HI;
                    ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).gh(motionWidget2, f6, dArr2[0], dArr2[1]);
                } else {
                    keyCycleOscillator.Uo(motionWidget2, f6);
                }
            }
        }
        return false;
    }

    public void aYN(float f3) {
        this.gh = f3;
    }

    public float az() {
        return this.f35180O.f35224r;
    }

    public float ck() {
        return this.mUb;
    }

    public void fD(Motion motion) {
        this.f35182T = motion;
    }

    public void g(MotionWidget motionWidget) {
        this.rl = motionWidget;
    }

    public String mUb() {
        return this.nr.f35218X;
    }

    public void nY(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.nr;
        motionPaths.f35214O = 0.0f;
        motionPaths.J2 = 0.0f;
        motionPaths.ck(motionWidget.iF(), motionWidget.fD(), motionWidget.te(), motionWidget.gh());
        this.nr.n(motionWidget);
        this.J2.KN(motionWidget);
        TypedBundle typedBundleXMQ = motionWidget.g().xMQ();
        if (typedBundleXMQ != null) {
            typedBundleXMQ.Uo(this);
        }
    }

    public void qie(float f3, float f4, float f5, float[] fArr) {
        double[] dArr;
        float fXMQ = xMQ(f3, this.XQ);
        CurveFit[] curveFitArr = this.KN;
        int i2 = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths = this.f35180O;
            float f6 = motionPaths.f35224r;
            MotionPaths motionPaths2 = this.nr;
            float f7 = f6 - motionPaths2.f35224r;
            float f8 = motionPaths.f35223o - motionPaths2.f35223o;
            float f9 = (motionPaths.f35219Z - motionPaths2.f35219Z) + f7;
            float f10 = (motionPaths.f35215S - motionPaths2.f35215S) + f8;
            fArr[0] = (f7 * (1.0f - f4)) + (f9 * f4);
            fArr[1] = (f8 * (1.0f - f5)) + (f10 * f5);
            return;
        }
        double d2 = fXMQ;
        curveFitArr[0].Uo(d2, this.HI);
        this.KN[0].nr(d2, this.ty);
        float f11 = this.XQ[0];
        while (true) {
            dArr = this.HI;
            if (i2 >= dArr.length) {
                break;
            }
            dArr[i2] = dArr[i2] * ((double) f11);
            i2++;
        }
        CurveFit curveFit = this.xMQ;
        if (curveFit == null) {
            this.nr.Ik(f4, f5, fArr, this.az, dArr, this.ty);
            return;
        }
        double[] dArr2 = this.ty;
        if (dArr2.length > 0) {
            curveFit.nr(d2, dArr2);
            this.xMQ.Uo(d2, this.HI);
            this.nr.Ik(f4, f5, fArr, this.az, this.HI, this.ty);
        }
    }

    public MotionWidget r() {
        return this.rl;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean rl(int i2, int i3) {
        if (i2 == 509) {
            WPU(i3);
            return true;
        }
        if (i2 != 610) {
            return i2 == 704;
        }
        this.fD = i3;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean t(int i2, float f3) {
        if (602 == i2) {
            this.E2 = f3;
            return true;
        }
        if (600 != i2) {
            return false;
        }
        this.mUb = f3;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void te(int i2, int i3, float f3, long j2) {
        ArrayList arrayList;
        int i5;
        String[] strArr;
        int i7;
        int i8;
        CustomVariable customVariable;
        SplineSet splineSetNr;
        CustomVariable customVariable2;
        Integer num;
        int i9;
        SplineSet splineSetNr2;
        CustomVariable customVariable3;
        new HashSet();
        HashSet<String> hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet();
        HashSet<String> hashSet3 = new HashSet();
        HashMap map = new HashMap();
        iF();
        int i10 = this.f35186g;
        if (i10 != -1) {
            MotionPaths motionPaths = this.nr;
            if (motionPaths.f35220e == -1) {
                motionPaths.f35220e = i10;
            }
        }
        this.J2.J2(this.Uo, hashSet2);
        ArrayList<MotionKey> arrayList2 = this.f35181S;
        if (arrayList2 != null) {
            arrayList = null;
            for (MotionKey motionKey : arrayList2) {
                if (motionKey instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                    o(new MotionPaths(i2, i3, motionKeyPosition, this.nr, this.f35180O));
                    int i11 = motionKeyPosition.Uo;
                    if (i11 != -1) {
                        this.f35190t = i11;
                    }
                } else if (motionKey instanceof MotionKeyCycle) {
                    motionKey.xMQ(hashSet3);
                } else if (motionKey instanceof MotionKeyTimeCycle) {
                    motionKey.xMQ(hashSet);
                } else if (motionKey instanceof MotionKeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((MotionKeyTrigger) motionKey);
                } else {
                    motionKey.mUb(map);
                    motionKey.xMQ(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.nY = (MotionKeyTrigger[]) arrayList.toArray(new MotionKeyTrigger[0]);
        }
        int i12 = 1;
        if (hashSet2.isEmpty()) {
            i5 = 1;
        } else {
            this.aYN = new HashMap();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str2 = str.split(",")[i12];
                    i9 = i12;
                    for (MotionKey motionKey2 : this.f35181S) {
                        HashMap map2 = motionKey2.f35235O;
                        if (map2 != null && (customVariable3 = (CustomVariable) map2.get(str2)) != null) {
                            customVar.n(motionKey2.f35236n, customVariable3);
                        }
                    }
                    splineSetNr2 = SplineSet.t(str, customVar);
                } else {
                    i9 = i12;
                    splineSetNr2 = SplineSet.nr(str, j2);
                }
                if (splineSetNr2 != null) {
                    splineSetNr2.Uo(str);
                    this.aYN.put(str, splineSetNr2);
                }
                i12 = i9;
            }
            i5 = i12;
            ArrayList<MotionKey> arrayList3 = this.f35181S;
            if (arrayList3 != null) {
                for (MotionKey motionKey3 : arrayList3) {
                    if (motionKey3 instanceof MotionKeyAttributes) {
                        motionKey3.J2(this.aYN);
                    }
                }
            }
            this.J2.n(this.aYN, 0);
            this.Uo.n(this.aYN, 100);
            for (String str3 : this.aYN.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = (Integer) map.get(str3)) == null) ? 0 : num.intValue();
                SplineSet splineSet = (SplineSet) this.aYN.get(str3);
                if (splineSet != null) {
                    splineSet.KN(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.WPU == null) {
                this.WPU = new HashMap();
            }
            for (String str4 : hashSet) {
                if (!this.WPU.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        KeyFrameArray.CustomVar customVar2 = new KeyFrameArray.CustomVar();
                        String str5 = str4.split(",")[i5];
                        for (MotionKey motionKey4 : this.f35181S) {
                            HashMap map3 = motionKey4.f35235O;
                            if (map3 != null && (customVariable2 = (CustomVariable) map3.get(str5)) != null) {
                                customVar2.n(motionKey4.f35236n, customVariable2);
                            }
                        }
                        splineSetNr = SplineSet.t(str4, customVar2);
                    } else {
                        splineSetNr = SplineSet.nr(str4, j2);
                    }
                    if (splineSetNr != null) {
                        splineSetNr.Uo(str4);
                    }
                }
            }
            ArrayList<MotionKey> arrayList4 = this.f35181S;
            if (arrayList4 != null) {
                for (MotionKey motionKey5 : arrayList4) {
                    if (motionKey5 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle) motionKey5).az(this.WPU);
                    }
                }
            }
            for (String str6 : this.WPU.keySet()) {
                ((TimeCycleSplineSet) this.WPU.get(str6)).O(map.containsKey(str6) ? ((Integer) map.get(str6)).intValue() : 0);
            }
        }
        int size = this.f35184Z.size();
        int i13 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i13];
        motionPathsArr[0] = this.nr;
        motionPathsArr[size + 1] = this.f35180O;
        if (this.f35184Z.size() > 0 && this.f35190t == MotionKey.J2) {
            this.f35190t = 0;
        }
        Iterator it = this.f35184Z.iterator();
        int i14 = i5;
        while (it.hasNext()) {
            motionPathsArr[i14] = (MotionPaths) it.next();
            i14++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f35180O.f35226v.keySet()) {
            if (this.nr.f35226v.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.ck = strArr2;
        this.Ik = new int[strArr2.length];
        int i15 = 0;
        while (true) {
            strArr = this.ck;
            if (i15 >= strArr.length) {
                break;
            }
            String str8 = strArr[i15];
            this.Ik[i15] = 0;
            int i16 = 0;
            while (true) {
                if (i16 >= i13) {
                    break;
                }
                if (motionPathsArr[i16].f35226v.containsKey(str8) && (customVariable = (CustomVariable) motionPathsArr[i16].f35226v.get(str8)) != null) {
                    int[] iArr = this.Ik;
                    iArr[i15] = iArr[i15] + customVariable.az();
                    break;
                }
                i16++;
            }
            i15++;
        }
        boolean z2 = motionPathsArr[0].f35220e != -1 ? i5 : 0;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i17 = i5; i17 < i13; i17++) {
            motionPathsArr[i17].nr(motionPathsArr[i17 - 1], zArr, this.ck, z2);
        }
        int i18 = 0;
        for (int i19 = i5; i19 < length; i19++) {
            if (zArr[i19]) {
                i18++;
            }
        }
        this.az = new int[i18];
        int i20 = 2;
        int iMax = Math.max(2, i18);
        this.ty = new double[iMax];
        this.HI = new double[iMax];
        int i21 = 0;
        for (int i22 = i5; i22 < length; i22++) {
            if (zArr[i22]) {
                this.az[i21] = i22;
                i21++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i5] = this.az.length;
        iArr2[0] = i13;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i13];
        for (int i23 = 0; i23 < i13; i23++) {
            motionPathsArr[i23].J2(dArr[i23], this.az);
            dArr2[i23] = motionPathsArr[i23].f35214O;
        }
        int i24 = 0;
        while (true) {
            int[] iArr3 = this.az;
            if (i24 >= iArr3.length) {
                break;
            }
            if (iArr3[i24] < MotionPaths.M7.length) {
                String str9 = MotionPaths.M7[this.az[i24]] + " [";
                for (int i25 = 0; i25 < i13; i25++) {
                    str9 = str9 + dArr[i25][i24];
                }
            }
            i24++;
        }
        this.KN = new CurveFit[this.ck.length + 1];
        int i26 = 0;
        while (true) {
            String[] strArr3 = this.ck;
            if (i26 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i26];
            int i27 = 0;
            int i28 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i27 < i13) {
                if (motionPathsArr[i27].gh(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i13];
                        int[] iArr4 = new int[i20];
                        iArr4[i5] = motionPathsArr[i27].mUb(str10);
                        i8 = 0;
                        iArr4[0] = i13;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i8 = 0;
                    }
                    MotionPaths motionPaths2 = motionPathsArr[i27];
                    i7 = i26;
                    dArr3[i28] = motionPaths2.f35214O;
                    motionPaths2.xMQ(str10, dArr4[i28], i8);
                    i28++;
                } else {
                    i7 = i26;
                }
                i27++;
                i26 = i7;
                i20 = 2;
            }
            int i29 = i26 + 1;
            this.KN[i29] = CurveFit.n(this.f35190t, Arrays.copyOf(dArr3, i28), (double[][]) Arrays.copyOf(dArr4, i28));
            i26 = i29;
            i20 = 2;
        }
        this.KN[0] = CurveFit.n(this.f35190t, dArr2, dArr);
        if (motionPathsArr[0].f35220e != -1) {
            int[] iArr5 = new int[i13];
            double[] dArr5 = new double[i13];
            int[] iArr6 = new int[2];
            iArr6[i5] = 2;
            iArr6[0] = i13;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i30 = 0; i30 < i13; i30++) {
                iArr5[i30] = motionPathsArr[i30].f35220e;
                dArr5[i30] = r7.f35214O;
                double[] dArr7 = dArr6[i30];
                dArr7[0] = r7.f35224r;
                dArr7[i5] = r7.f35223o;
            }
            this.xMQ = CurveFit.rl(iArr5, dArr5, dArr6);
        }
        this.ViF = new HashMap();
        if (this.f35181S != null) {
            float fIk = Float.NaN;
            for (String str11 : hashSet3) {
                KeyCycleOscillator keyCycleOscillatorT = KeyCycleOscillator.t(str11);
                if (keyCycleOscillatorT != null) {
                    if (keyCycleOscillatorT.mUb() && Float.isNaN(fIk)) {
                        fIk = Ik();
                    }
                    keyCycleOscillatorT.KN(str11);
                    this.ViF.put(str11, keyCycleOscillatorT);
                }
            }
            for (MotionKey motionKey6 : this.f35181S) {
                if (motionKey6 instanceof MotionKeyCycle) {
                    ((MotionKeyCycle) motionKey6).az(this.ViF);
                }
            }
            Iterator it2 = this.ViF.values().iterator();
            while (it2.hasNext()) {
                ((KeyCycleOscillator) it2.next()).xMQ(fIk);
            }
        }
    }

    public String toString() {
        return " start: x: " + this.nr.f35224r + " y: " + this.nr.f35223o + " end: x: " + this.f35180O.f35224r + " y: " + this.f35180O.f35223o;
    }

    public float ty() {
        return this.f35180O.f35223o;
    }

    public Motion(MotionWidget motionWidget) {
        g(motionWidget);
    }
}
