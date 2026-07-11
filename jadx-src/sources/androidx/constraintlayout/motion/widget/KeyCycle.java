package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class KeyCycle extends Key {
    private String Uo = null;
    private int KN = 0;
    private int xMQ = -1;
    private String mUb = null;
    private float gh = Float.NaN;
    private float qie = 0.0f;
    private float az = 0.0f;
    private float ty = Float.NaN;
    private int HI = -1;
    private float ck = Float.NaN;
    private float Ik = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35662r = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35661o = Float.NaN;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f35660Z = Float.NaN;
    private float XQ = Float.NaN;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f35659S = Float.NaN;
    private float WPU = Float.NaN;
    private float aYN = Float.NaN;
    private float ViF = Float.NaN;
    private float nY = Float.NaN;

    private static class Loader {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static SparseIntArray f35663n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f35663n = sparseIntArray;
            sparseIntArray.append(R.styleable.f36061c3, 1);
            f35663n.append(R.styleable.gVB, 2);
            f35663n.append(R.styleable.V4, 3);
            f35663n.append(R.styleable.Cw, 4);
            f35663n.append(R.styleable.tbd, 5);
            f35663n.append(R.styleable.oD, 6);
            f35663n.append(R.styleable.xif, 7);
            f35663n.append(R.styleable.M63, 8);
            f35663n.append(R.styleable.vI, 9);
            f35663n.append(R.styleable.i0, 10);
            f35663n.append(R.styleable.gv0, 11);
            f35663n.append(R.styleable.ce, 12);
            f35663n.append(R.styleable.UCQ, 13);
            f35663n.append(R.styleable.iJ, 14);
            f35663n.append(R.styleable.hmG, 15);
            f35663n.append(R.styleable.Kqf, 16);
            f35663n.append(R.styleable.vdt, 17);
            f35663n.append(R.styleable.oKr, 18);
            f35663n.append(R.styleable.RzC, 19);
            f35663n.append(R.styleable.f36065ef, 20);
            f35663n.append(R.styleable.xy, 21);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void n(HashMap map) {
        Debug.Uo("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            SplineSet splineSet = (SplineSet) map.get(str);
            if (splineSet != null) {
                str.getClass();
                switch (str) {
                    case "rotationX":
                        splineSet.O(this.f35652n, this.f35660Z);
                        break;
                    case "rotationY":
                        splineSet.O(this.f35652n, this.XQ);
                        break;
                    case "translationX":
                        splineSet.O(this.f35652n, this.aYN);
                        break;
                    case "translationY":
                        splineSet.O(this.f35652n, this.ViF);
                        break;
                    case "translationZ":
                        splineSet.O(this.f35652n, this.nY);
                        break;
                    case "progress":
                        splineSet.O(this.f35652n, this.ty);
                        break;
                    case "scaleX":
                        splineSet.O(this.f35652n, this.f35659S);
                        break;
                    case "scaleY":
                        splineSet.O(this.f35652n, this.WPU);
                        break;
                    case "rotation":
                        splineSet.O(this.f35652n, this.f35662r);
                        break;
                    case "elevation":
                        splineSet.O(this.f35652n, this.Ik);
                        break;
                    case "transitionPathRotate":
                        splineSet.O(this.f35652n, this.f35661o);
                        break;
                    case "alpha":
                        splineSet.O(this.f35652n, this.ck);
                        break;
                    case "waveOffset":
                        splineSet.O(this.f35652n, this.qie);
                        break;
                    case "wavePhase":
                        splineSet.O(this.f35652n, this.az);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            break;
                        } else {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                            break;
                        }
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void nr(HashSet hashSet) {
        if (!Float.isNaN(this.ck)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.Ik)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f35662r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f35660Z)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.XQ)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f35659S)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.WPU)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f35661o)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.aYN)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.ViF)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.nY)) {
            hashSet.add("translationZ");
        }
        if (this.f35651O.size() > 0) {
            Iterator it = this.f35651O.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    public void qie(HashMap map) {
        ViewOscillator viewOscillator;
        ViewOscillator viewOscillator2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f35651O.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.nr() == ConstraintAttribute.AttributeType.FLOAT_TYPE && (viewOscillator = (ViewOscillator) map.get(str)) != null) {
                    viewOscillator.J2(this.f35652n, this.xMQ, this.mUb, this.HI, this.gh, this.qie, this.az, constraintAttribute.O(), constraintAttribute);
                }
            } else {
                float fAz = az(str);
                if (!Float.isNaN(fAz) && (viewOscillator2 = (ViewOscillator) map.get(str)) != null) {
                    viewOscillator2.O(this.f35652n, this.xMQ, this.mUb, this.HI, this.gh, this.qie, this.az, fAz);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: rl */
    public Key clone() {
        return new KeyCycle().t(this);
    }

    public KeyCycle() {
        this.nr = 4;
        this.f35651O = new HashMap();
    }

    public float az(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return this.f35660Z;
            case "rotationY":
                return this.XQ;
            case "translationX":
                return this.aYN;
            case "translationY":
                return this.ViF;
            case "translationZ":
                return this.nY;
            case "progress":
                return this.ty;
            case "scaleX":
                return this.f35659S;
            case "scaleY":
                return this.WPU;
            case "rotation":
                return this.f35662r;
            case "elevation":
                return this.Ik;
            case "transitionPathRotate":
                return this.f35661o;
            case "alpha":
                return this.ck;
            case "waveOffset":
                return this.qie;
            case "wavePhase":
                return this.az;
            default:
                if (!str.startsWith("CUSTOM")) {
                    Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                    return Float.NaN;
                }
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key t(Key key) {
        super.t(key);
        KeyCycle keyCycle = (KeyCycle) key;
        this.Uo = keyCycle.Uo;
        this.KN = keyCycle.KN;
        this.xMQ = keyCycle.xMQ;
        this.mUb = keyCycle.mUb;
        this.gh = keyCycle.gh;
        this.qie = keyCycle.qie;
        this.az = keyCycle.az;
        this.ty = keyCycle.ty;
        this.HI = keyCycle.HI;
        this.ck = keyCycle.ck;
        this.Ik = keyCycle.Ik;
        this.f35662r = keyCycle.f35662r;
        this.f35661o = keyCycle.f35661o;
        this.f35660Z = keyCycle.f35660Z;
        this.XQ = keyCycle.XQ;
        this.f35659S = keyCycle.f35659S;
        this.WPU = keyCycle.WPU;
        this.aYN = keyCycle.aYN;
        this.ViF = keyCycle.ViF;
        this.nY = keyCycle.nY;
        return this;
    }
}
