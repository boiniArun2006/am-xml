package androidx.constraintlayout.motion.widget;

import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class KeyAttributes extends Key {
    private String Uo;
    private int KN = -1;
    private boolean xMQ = false;
    private float mUb = Float.NaN;
    private float gh = Float.NaN;
    private float qie = Float.NaN;
    private float az = Float.NaN;
    private float ty = Float.NaN;
    private float HI = Float.NaN;
    private float ck = Float.NaN;
    private float Ik = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35657r = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35656o = Float.NaN;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f35655Z = Float.NaN;
    private float XQ = Float.NaN;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f35654S = Float.NaN;
    private float WPU = Float.NaN;

    private static class Loader {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static SparseIntArray f35658n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f35658n = sparseIntArray;
            sparseIntArray.append(R.styleable.LN, 1);
            f35658n.append(R.styleable.vp, 2);
            f35658n.append(R.styleable.wY, 4);
            f35658n.append(R.styleable.joB, 5);
            f35658n.append(R.styleable.f36040P, 6);
            f35658n.append(R.styleable.mjs, 19);
            f35658n.append(R.styleable.WNG, 20);
            f35658n.append(R.styleable.XPq, 7);
            f35658n.append(R.styleable.ft, 8);
            f35658n.append(R.styleable.IV, 9);
            f35658n.append(R.styleable.RP, 10);
            f35658n.append(R.styleable.Pd, 12);
            f35658n.append(R.styleable.DW, 13);
            f35658n.append(R.styleable.RWu, 14);
            f35658n.append(R.styleable.Xt, 15);
            f35658n.append(R.styleable.NkL, 16);
            f35658n.append(R.styleable.vU, 17);
            f35658n.append(R.styleable.f36087u, 18);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void n(HashMap map) {
        for (String str : map.keySet()) {
            SplineSet splineSet = (SplineSet) map.get(str);
            if (splineSet != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.az)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.az);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.ty)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.ty);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f35655Z)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.f35655Z);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.XQ)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.XQ);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f35654S)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.f35654S);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.WPU)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.WPU);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f35657r)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.f35657r);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f35656o)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.f35656o);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.az)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.HI);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.ty)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.ck);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.qie)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.qie);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.gh)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.gh);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.Ik)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.Ik);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.mUb)) {
                                break;
                            } else {
                                splineSet.O(this.f35652n, this.mUb);
                                break;
                            }
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f35651O.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((ViewSpline.CustomSet) splineSet).qie(this.f35652n, constraintAttribute);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void Uo(HashMap map) {
        if (this.KN == -1) {
            return;
        }
        if (!Float.isNaN(this.mUb)) {
            map.put("alpha", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.gh)) {
            map.put("elevation", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.qie)) {
            map.put("rotation", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.az)) {
            map.put("rotationX", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.ty)) {
            map.put("rotationY", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.HI)) {
            map.put("transformPivotX", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.ck)) {
            map.put("transformPivotY", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.f35655Z)) {
            map.put("translationX", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.XQ)) {
            map.put("translationY", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.f35654S)) {
            map.put("translationZ", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.Ik)) {
            map.put("transitionPathRotate", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.f35657r)) {
            map.put("scaleX", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.f35656o)) {
            map.put("scaleY", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.WPU)) {
            map.put("progress", Integer.valueOf(this.KN));
        }
        if (this.f35651O.size() > 0) {
            Iterator it = this.f35651O.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.KN));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void nr(HashSet hashSet) {
        if (!Float.isNaN(this.mUb)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.gh)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.qie)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.az)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.ty)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.HI)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.ck)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f35655Z)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.XQ)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f35654S)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.Ik)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f35657r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f35656o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.WPU)) {
            hashSet.add("progress");
        }
        if (this.f35651O.size() > 0) {
            Iterator it = this.f35651O.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: rl */
    public Key clone() {
        return new KeyAttributes().t(this);
    }

    public KeyAttributes() {
        this.nr = 1;
        this.f35651O = new HashMap();
    }

    public void qie(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "motionProgress":
                this.WPU = mUb(obj);
                break;
            case "transitionEasing":
                this.Uo = obj.toString();
                break;
            case "rotationX":
                this.az = mUb(obj);
                break;
            case "rotationY":
                this.ty = mUb(obj);
                break;
            case "translationX":
                this.f35655Z = mUb(obj);
                break;
            case "translationY":
                this.XQ = mUb(obj);
                break;
            case "translationZ":
                this.f35654S = mUb(obj);
                break;
            case "scaleX":
                this.f35657r = mUb(obj);
                break;
            case "scaleY":
                this.f35656o = mUb(obj);
                break;
            case "transformPivotX":
                this.HI = mUb(obj);
                break;
            case "transformPivotY":
                this.ck = mUb(obj);
                break;
            case "rotation":
                this.qie = mUb(obj);
                break;
            case "elevation":
                this.gh = mUb(obj);
                break;
            case "transitionPathRotate":
                this.Ik = mUb(obj);
                break;
            case "alpha":
                this.mUb = mUb(obj);
                break;
            case "curveFit":
                this.KN = gh(obj);
                break;
            case "visibility":
                this.xMQ = xMQ(obj);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key t(Key key) {
        super.t(key);
        KeyAttributes keyAttributes = (KeyAttributes) key;
        this.KN = keyAttributes.KN;
        this.xMQ = keyAttributes.xMQ;
        this.mUb = keyAttributes.mUb;
        this.gh = keyAttributes.gh;
        this.qie = keyAttributes.qie;
        this.az = keyAttributes.az;
        this.ty = keyAttributes.ty;
        this.HI = keyAttributes.HI;
        this.ck = keyAttributes.ck;
        this.Ik = keyAttributes.Ik;
        this.f35657r = keyAttributes.f35657r;
        this.f35656o = keyAttributes.f35656o;
        this.f35655Z = keyAttributes.f35655Z;
        this.XQ = keyAttributes.XQ;
        this.f35654S = keyAttributes.f35654S;
        this.WPU = keyAttributes.WPU;
        this.Uo = keyAttributes.Uo;
        return this;
    }
}
