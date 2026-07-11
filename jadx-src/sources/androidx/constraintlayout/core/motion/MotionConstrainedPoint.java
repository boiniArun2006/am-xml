package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String[] f35192a = {"position", "x", "y", "width", "height", "pathRotate"};
    private float M7;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f35200O;
    private float P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f35203U;
    private float jB;
    private float p5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f35208n = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f35211t = 0;
    private boolean J2 = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35210r = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35209o = 0.0f;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f35205Z = 0.0f;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f35201S = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f35207g = 1.0f;
    private float E2 = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f35206e = Float.NaN;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private float f35204X = Float.NaN;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f35202T = 0.0f;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f35199N = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f35212v = 0.0f;
    private int Xw = 0;
    private float eF = Float.NaN;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private float f35195E = Float.NaN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f35198M = -1;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    LinkedHashMap f35196FX = new LinkedHashMap();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f35193B = 0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    double[] f35197J = new double[18];

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    double[] f35194D = new double[18];

    public void n(HashMap map, int i2) {
        SplineSet splineSet;
        for (String str : map.keySet()) {
            splineSet = (SplineSet) map.get(str);
            str.getClass();
            switch (str) {
                case "rotationX":
                    splineSet.O(i2, Float.isNaN(this.f35205Z) ? 0.0f : this.f35205Z);
                    break;
                case "rotationY":
                    splineSet.O(i2, Float.isNaN(this.f35201S) ? 0.0f : this.f35201S);
                    break;
                case "rotationZ":
                    splineSet.O(i2, Float.isNaN(this.f35209o) ? 0.0f : this.f35209o);
                    break;
                case "translationX":
                    splineSet.O(i2, Float.isNaN(this.f35202T) ? 0.0f : this.f35202T);
                    break;
                case "translationY":
                    splineSet.O(i2, Float.isNaN(this.f35199N) ? 0.0f : this.f35199N);
                    break;
                case "translationZ":
                    splineSet.O(i2, Float.isNaN(this.f35212v) ? 0.0f : this.f35212v);
                    break;
                case "progress":
                    splineSet.O(i2, Float.isNaN(this.f35195E) ? 0.0f : this.f35195E);
                    break;
                case "pivotX":
                    splineSet.O(i2, Float.isNaN(this.f35206e) ? 0.0f : this.f35206e);
                    break;
                case "pivotY":
                    splineSet.O(i2, Float.isNaN(this.f35204X) ? 0.0f : this.f35204X);
                    break;
                case "scaleX":
                    splineSet.O(i2, Float.isNaN(this.f35207g) ? 1.0f : this.f35207g);
                    break;
                case "scaleY":
                    splineSet.O(i2, Float.isNaN(this.E2) ? 1.0f : this.E2);
                    break;
                case "alpha":
                    splineSet.O(i2, Float.isNaN(this.f35208n) ? 1.0f : this.f35208n);
                    break;
                case "pathRotate":
                    splineSet.O(i2, Float.isNaN(this.eF) ? 0.0f : this.eF);
                    break;
                default:
                    if (!str.startsWith("CUSTOM")) {
                        Utils.n("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    } else {
                        String str2 = str.split(",")[1];
                        if (this.f35196FX.containsKey(str2)) {
                            CustomVariable customVariable = (CustomVariable) this.f35196FX.get(str2);
                            if (splineSet instanceof SplineSet.CustomSpline) {
                                ((SplineSet.CustomSpline) splineSet).xMQ(i2, customVariable);
                            } else {
                                Utils.n("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i2 + ", value" + customVariable.mUb() + splineSet);
                            }
                        }
                        break;
                    }
                    break;
            }
        }
    }

    void J2(MotionConstrainedPoint motionConstrainedPoint, HashSet hashSet) {
        if (nr(this.f35208n, motionConstrainedPoint.f35208n)) {
            hashSet.add("alpha");
        }
        if (nr(this.f35210r, motionConstrainedPoint.f35210r)) {
            hashSet.add("translationZ");
        }
        int i2 = this.f35200O;
        int i3 = motionConstrainedPoint.f35200O;
        if (i2 != i3 && this.f35211t == 0 && (i2 == 4 || i3 == 4)) {
            hashSet.add("alpha");
        }
        if (nr(this.f35209o, motionConstrainedPoint.f35209o)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.eF) || !Float.isNaN(motionConstrainedPoint.eF)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f35195E) || !Float.isNaN(motionConstrainedPoint.f35195E)) {
            hashSet.add("progress");
        }
        if (nr(this.f35205Z, motionConstrainedPoint.f35205Z)) {
            hashSet.add("rotationX");
        }
        if (nr(this.f35201S, motionConstrainedPoint.f35201S)) {
            hashSet.add("rotationY");
        }
        if (nr(this.f35206e, motionConstrainedPoint.f35206e)) {
            hashSet.add("pivotX");
        }
        if (nr(this.f35204X, motionConstrainedPoint.f35204X)) {
            hashSet.add("pivotY");
        }
        if (nr(this.f35207g, motionConstrainedPoint.f35207g)) {
            hashSet.add("scaleX");
        }
        if (nr(this.E2, motionConstrainedPoint.E2)) {
            hashSet.add("scaleY");
        }
        if (nr(this.f35202T, motionConstrainedPoint.f35202T)) {
            hashSet.add("translationX");
        }
        if (nr(this.f35199N, motionConstrainedPoint.f35199N)) {
            hashSet.add("translationY");
        }
        if (nr(this.f35212v, motionConstrainedPoint.f35212v)) {
            hashSet.add("translationZ");
        }
        if (nr(this.f35210r, motionConstrainedPoint.f35210r)) {
            hashSet.add("elevation");
        }
    }

    void Uo(float f3, float f4, float f5, float f6) {
        this.f35203U = f3;
        this.P5 = f4;
        this.M7 = f5;
        this.p5 = f6;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.jB, motionConstrainedPoint.jB);
    }

    MotionConstrainedPoint() {
    }

    private boolean nr(float f3, float f4) {
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

    public void KN(MotionWidget motionWidget) {
        Uo(motionWidget.iF(), motionWidget.fD(), motionWidget.te(), motionWidget.gh());
        rl(motionWidget);
    }

    public void rl(MotionWidget motionWidget) {
        float fUo;
        this.f35200O = motionWidget.nY();
        if (motionWidget.nY() != 4) {
            fUo = 0.0f;
        } else {
            fUo = motionWidget.Uo();
        }
        this.f35208n = fUo;
        this.J2 = false;
        this.f35209o = motionWidget.o();
        this.f35205Z = motionWidget.Ik();
        this.f35201S = motionWidget.r();
        this.f35207g = motionWidget.Z();
        this.E2 = motionWidget.XQ();
        this.f35206e = motionWidget.ty();
        this.f35204X = motionWidget.HI();
        this.f35202T = motionWidget.WPU();
        this.f35199N = motionWidget.aYN();
        this.f35212v = motionWidget.ViF();
        for (String str : motionWidget.mUb()) {
            CustomVariable customVariableXMQ = motionWidget.xMQ(str);
            if (customVariableXMQ != null && customVariableXMQ.qie()) {
                this.f35196FX.put(str, customVariableXMQ);
            }
        }
    }
}
