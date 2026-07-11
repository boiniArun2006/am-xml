package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    static String[] f35679I = {"position", "x", YmsTEL.LRCdguqdQk, "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f35680B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private float f35682E;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private float f35683FX;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private float f35685M;
    private Easing M7;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f35687O;
    private float eF;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f35696n = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f35699t = 0;
    LinkedHashMap J2 = new LinkedHashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f35698r = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    double[] f35697o = new double[18];

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    double[] f35692Z = new double[18];

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f35688S = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35695g = false;
    private float E2 = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f35694e = 0.0f;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private float f35691X = 0.0f;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f35689T = 1.0f;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f35686N = 1.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f35700v = Float.NaN;
    private float Xw = Float.NaN;
    private float jB = 0.0f;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f35690U = 0.0f;
    private float P5 = 0.0f;
    private int p5 = 0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private float f35684J = Float.NaN;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private float f35681D = Float.NaN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35693a = -1;

    public void n(HashMap map, int i2) {
        for (String str : map.keySet()) {
            ViewSpline viewSpline = (ViewSpline) map.get(str);
            if (viewSpline != null) {
                str.getClass();
                switch (str) {
                    case "rotationX":
                        viewSpline.O(i2, Float.isNaN(this.f35691X) ? 0.0f : this.f35691X);
                        break;
                    case "rotationY":
                        viewSpline.O(i2, Float.isNaN(this.f35696n) ? 0.0f : this.f35696n);
                        break;
                    case "translationX":
                        viewSpline.O(i2, Float.isNaN(this.jB) ? 0.0f : this.jB);
                        break;
                    case "translationY":
                        viewSpline.O(i2, Float.isNaN(this.f35690U) ? 0.0f : this.f35690U);
                        break;
                    case "translationZ":
                        viewSpline.O(i2, Float.isNaN(this.P5) ? 0.0f : this.P5);
                        break;
                    case "progress":
                        viewSpline.O(i2, Float.isNaN(this.f35681D) ? 0.0f : this.f35681D);
                        break;
                    case "scaleX":
                        viewSpline.O(i2, Float.isNaN(this.f35689T) ? 1.0f : this.f35689T);
                        break;
                    case "scaleY":
                        viewSpline.O(i2, Float.isNaN(this.f35686N) ? 1.0f : this.f35686N);
                        break;
                    case "transformPivotX":
                        viewSpline.O(i2, Float.isNaN(this.f35700v) ? 0.0f : this.f35700v);
                        break;
                    case "transformPivotY":
                        viewSpline.O(i2, Float.isNaN(this.Xw) ? 0.0f : this.Xw);
                        break;
                    case "rotation":
                        viewSpline.O(i2, Float.isNaN(this.f35694e) ? 0.0f : this.f35694e);
                        break;
                    case "elevation":
                        viewSpline.O(i2, Float.isNaN(this.E2) ? 0.0f : this.E2);
                        break;
                    case "transitionPathRotate":
                        viewSpline.O(i2, Float.isNaN(this.f35684J) ? 0.0f : this.f35684J);
                        break;
                    case "alpha":
                        viewSpline.O(i2, Float.isNaN(this.f35688S) ? 1.0f : this.f35688S);
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.e("MotionPaths", "UNKNOWN spline " + str);
                            break;
                        } else {
                            String str2 = str.split(",")[1];
                            if (this.J2.containsKey(str2)) {
                                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.J2.get(str2);
                                if (viewSpline instanceof ViewSpline.CustomSet) {
                                    ((ViewSpline.CustomSet) viewSpline).qie(i2, constraintAttribute);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i2 + ", value" + constraintAttribute.O() + viewSpline);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        }
    }

    void KN(float f3, float f4, float f5, float f6) {
        this.f35682E = f3;
        this.f35685M = f4;
        this.f35683FX = f5;
        this.f35680B = f6;
    }

    void Uo(MotionConstrainedPoint motionConstrainedPoint, HashSet hashSet) {
        if (J2(this.f35688S, motionConstrainedPoint.f35688S)) {
            hashSet.add("alpha");
        }
        if (J2(this.E2, motionConstrainedPoint.E2)) {
            hashSet.add("elevation");
        }
        int i2 = this.f35687O;
        int i3 = motionConstrainedPoint.f35687O;
        if (i2 != i3 && this.f35699t == 0 && (i2 == 0 || i3 == 0)) {
            hashSet.add("alpha");
        }
        if (J2(this.f35694e, motionConstrainedPoint.f35694e)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f35684J) || !Float.isNaN(motionConstrainedPoint.f35684J)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f35681D) || !Float.isNaN(motionConstrainedPoint.f35681D)) {
            hashSet.add("progress");
        }
        if (J2(this.f35691X, motionConstrainedPoint.f35691X)) {
            hashSet.add("rotationX");
        }
        if (J2(this.f35696n, motionConstrainedPoint.f35696n)) {
            hashSet.add("rotationY");
        }
        if (J2(this.f35700v, motionConstrainedPoint.f35700v)) {
            hashSet.add("transformPivotX");
        }
        if (J2(this.Xw, motionConstrainedPoint.Xw)) {
            hashSet.add("transformPivotY");
        }
        if (J2(this.f35689T, motionConstrainedPoint.f35689T)) {
            hashSet.add("scaleX");
        }
        if (J2(this.f35686N, motionConstrainedPoint.f35686N)) {
            hashSet.add("scaleY");
        }
        if (J2(this.jB, motionConstrainedPoint.jB)) {
            hashSet.add("translationX");
        }
        if (J2(this.f35690U, motionConstrainedPoint.f35690U)) {
            hashSet.add("translationY");
        }
        if (J2(this.P5, motionConstrainedPoint.P5)) {
            hashSet.add("translationZ");
        }
    }

    public void mUb(Rect rect, ConstraintSet constraintSet, int i2, int i3) {
        KN(rect.left, rect.top, rect.width(), rect.height());
        t(constraintSet.WPU(i3));
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                }
            }
            float f3 = this.f35694e + 90.0f;
            this.f35694e = f3;
            if (f3 > 180.0f) {
                this.f35694e = f3 - 360.0f;
                return;
            }
            return;
        }
        this.f35694e -= 90.0f;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.eF, motionConstrainedPoint.eF);
    }

    public void t(ConstraintSet.Constraint constraint) {
        ConstraintSet.PropertySet propertySet = constraint.f35967t;
        int i2 = propertySet.f36004t;
        this.f35699t = i2;
        int i3 = propertySet.rl;
        this.f35687O = i3;
        this.f35688S = (i3 == 0 || i2 != 0) ? propertySet.nr : 0.0f;
        ConstraintSet.Transform transform = constraint.J2;
        this.f35695g = transform.az;
        this.E2 = transform.ty;
        this.f35694e = transform.rl;
        this.f35691X = transform.f36007t;
        this.f35696n = transform.nr;
        this.f35689T = transform.f36005O;
        this.f35686N = transform.J2;
        this.f35700v = transform.Uo;
        this.Xw = transform.KN;
        this.jB = transform.mUb;
        this.f35690U = transform.gh;
        this.P5 = transform.qie;
        this.M7 = Easing.t(constraint.nr.nr);
        ConstraintSet.Motion motion = constraint.nr;
        this.f35684J = motion.xMQ;
        this.p5 = motion.J2;
        this.f35693a = motion.rl;
        this.f35681D = constraint.f35967t.f36002O;
        for (String str : constraint.Uo.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) constraint.Uo.get(str);
            if (constraintAttribute.Uo()) {
                this.J2.put(str, constraintAttribute);
            }
        }
    }

    public void xMQ(Rect rect, View view, int i2, float f3) {
        KN(rect.left, rect.top, rect.width(), rect.height());
        rl(view);
        this.f35700v = Float.NaN;
        this.Xw = Float.NaN;
        if (i2 == 1) {
            this.f35694e = f3 - 90.0f;
        } else {
            if (i2 != 2) {
                return;
            }
            this.f35694e = f3 + 90.0f;
        }
    }

    MotionConstrainedPoint() {
    }

    private boolean J2(float f3, float f4) {
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

    public void gh(View view) {
        KN(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        rl(view);
    }

    public void rl(View view) {
        float alpha;
        this.f35687O = view.getVisibility();
        if (view.getVisibility() != 0) {
            alpha = 0.0f;
        } else {
            alpha = view.getAlpha();
        }
        this.f35688S = alpha;
        this.f35695g = false;
        this.E2 = view.getElevation();
        this.f35694e = view.getRotation();
        this.f35691X = view.getRotationX();
        this.f35696n = view.getRotationY();
        this.f35689T = view.getScaleX();
        this.f35686N = view.getScaleY();
        this.f35700v = view.getPivotX();
        this.Xw = view.getPivotY();
        this.jB = view.getTranslationX();
        this.f35690U = view.getTranslationY();
        this.P5 = view.getTranslationZ();
    }
}
