package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class KeyTimeCycle extends Key {
    private String Uo;
    private int KN = -1;
    private float xMQ = Float.NaN;
    private float mUb = Float.NaN;
    private float gh = Float.NaN;
    private float qie = Float.NaN;
    private float az = Float.NaN;
    private float ty = Float.NaN;
    private float HI = Float.NaN;
    private float ck = Float.NaN;
    private float Ik = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35671r = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35670o = Float.NaN;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f35669Z = Float.NaN;
    private int XQ = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private String f35668S = null;
    private float WPU = Float.NaN;
    private float aYN = 0.0f;

    private static class Loader {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static SparseIntArray f35672n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f35672n = sparseIntArray;
            sparseIntArray.append(R.styleable.uQo, 1);
            f35672n.append(R.styleable.rst, 2);
            f35672n.append(R.styleable.o3K, 4);
            f35672n.append(R.styleable.CX, 5);
            f35672n.append(R.styleable.hep, 6);
            f35672n.append(R.styleable.R8, 7);
            f35672n.append(R.styleable.Nj, 8);
            f35672n.append(R.styleable.uCx, 9);
            f35672n.append(R.styleable.mBA, 10);
            f35672n.append(R.styleable.IBF, 12);
            f35672n.append(R.styleable.oG8, 13);
            f35672n.append(R.styleable.AJ, 14);
            f35672n.append(R.styleable.Im, 15);
            f35672n.append(R.styleable.lm1, 16);
            f35672n.append(R.styleable.CY, 17);
            f35672n.append(R.styleable.dwF, 18);
            f35672n.append(R.styleable.Oo, 20);
            f35672n.append(R.styleable.dDe, 21);
            f35672n.append(R.styleable.qd, 19);
        }
    }

    public void qie(HashMap map) {
        for (String str : map.keySet()) {
            ViewTimeCycle viewTimeCycle = (ViewTimeCycle) map.get(str);
            if (viewTimeCycle != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.qie)) {
                                break;
                            } else {
                                viewTimeCycle.rl(this.f35652n, this.qie, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.az)) {
                                break;
                            } else {
                                viewTimeCycle.rl(this.f35652n, this.az, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.Ik)) {
                                break;
                            } else {
                                viewTimeCycle.rl(this.f35652n, this.Ik, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f35671r)) {
                                break;
                            } else {
                                viewTimeCycle.rl(this.f35652n, this.f35671r, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f35670o)) {
                                break;
                            } else {
                                viewTimeCycle.rl(this.f35652n, this.f35670o, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f35669Z)) {
                                break;
                            } else {
                                viewTimeCycle.rl(this.f35652n, this.f35669Z, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.HI)) {
                                break;
                            } else {
                                viewTimeCycle.rl(this.f35652n, this.HI, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.ck)) {
                                break;
                            } else {
                                viewTimeCycle.rl(this.f35652n, this.ck, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.gh)) {
                                break;
                            } else {
                                viewTimeCycle.rl(this.f35652n, this.gh, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.mUb)) {
                                break;
                            } else {
                                viewTimeCycle.rl(this.f35652n, this.mUb, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.ty)) {
                                break;
                            } else {
                                viewTimeCycle.rl(this.f35652n, this.ty, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.xMQ)) {
                                break;
                            } else {
                                viewTimeCycle.rl(this.f35652n, this.xMQ, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f35651O.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((ViewTimeCycle.CustomSet) viewTimeCycle).mUb(this.f35652n, constraintAttribute, this.WPU, this.XQ, this.aYN);
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
        if (!Float.isNaN(this.xMQ)) {
            map.put("alpha", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.mUb)) {
            map.put("elevation", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.gh)) {
            map.put("rotation", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.qie)) {
            map.put("rotationX", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.az)) {
            map.put("rotationY", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.Ik)) {
            map.put("translationX", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.f35671r)) {
            map.put("translationY", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.f35670o)) {
            map.put("translationZ", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.ty)) {
            map.put("transitionPathRotate", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.HI)) {
            map.put("scaleX", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.HI)) {
            map.put("scaleY", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.f35669Z)) {
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
    public void n(HashMap map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void nr(HashSet hashSet) {
        if (!Float.isNaN(this.xMQ)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.mUb)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.gh)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.qie)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.az)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.Ik)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f35671r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f35670o)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.ty)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.HI)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.ck)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f35669Z)) {
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
        return new KeyTimeCycle().t(this);
    }

    public KeyTimeCycle() {
        this.nr = 3;
        this.f35651O = new HashMap();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key t(Key key) {
        super.t(key);
        KeyTimeCycle keyTimeCycle = (KeyTimeCycle) key;
        this.Uo = keyTimeCycle.Uo;
        this.KN = keyTimeCycle.KN;
        this.XQ = keyTimeCycle.XQ;
        this.WPU = keyTimeCycle.WPU;
        this.aYN = keyTimeCycle.aYN;
        this.f35669Z = keyTimeCycle.f35669Z;
        this.xMQ = keyTimeCycle.xMQ;
        this.mUb = keyTimeCycle.mUb;
        this.gh = keyTimeCycle.gh;
        this.ty = keyTimeCycle.ty;
        this.qie = keyTimeCycle.qie;
        this.az = keyTimeCycle.az;
        this.HI = keyTimeCycle.HI;
        this.ck = keyTimeCycle.ck;
        this.Ik = keyTimeCycle.Ik;
        this.f35671r = keyTimeCycle.f35671r;
        this.f35670o = keyTimeCycle.f35670o;
        this.f35668S = keyTimeCycle.f35668S;
        return this;
    }
}
