package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class MotionKeyTimeCycle extends MotionKey {
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
    private float f35251r = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35250o = Float.NaN;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f35249Z = Float.NaN;
    private int XQ = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private String f35248S = null;
    private float WPU = Float.NaN;
    private float aYN = 0.0f;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void J2(HashMap map) {
    }

    public void az(HashMap map) {
        for (String str : map.keySet()) {
            TimeCycleSplineSet timeCycleSplineSet = (TimeCycleSplineSet) map.get(str);
            if (timeCycleSplineSet != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.qie)) {
                                break;
                            } else {
                                timeCycleSplineSet.rl(this.f35236n, this.qie, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.az)) {
                                break;
                            } else {
                                timeCycleSplineSet.rl(this.f35236n, this.az, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "rotationZ":
                            if (Float.isNaN(this.gh)) {
                                break;
                            } else {
                                timeCycleSplineSet.rl(this.f35236n, this.gh, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.Ik)) {
                                break;
                            } else {
                                timeCycleSplineSet.rl(this.f35236n, this.Ik, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f35251r)) {
                                break;
                            } else {
                                timeCycleSplineSet.rl(this.f35236n, this.f35251r, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f35250o)) {
                                break;
                            } else {
                                timeCycleSplineSet.rl(this.f35236n, this.f35250o, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f35249Z)) {
                                break;
                            } else {
                                timeCycleSplineSet.rl(this.f35236n, this.f35249Z, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.HI)) {
                                break;
                            } else {
                                timeCycleSplineSet.rl(this.f35236n, this.HI, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.ck)) {
                                break;
                            } else {
                                timeCycleSplineSet.rl(this.f35236n, this.ck, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f35250o)) {
                                break;
                            } else {
                                timeCycleSplineSet.rl(this.f35236n, this.f35250o, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.xMQ)) {
                                break;
                            } else {
                                timeCycleSplineSet.rl(this.f35236n, this.xMQ, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        case "pathRotate":
                            if (Float.isNaN(this.ty)) {
                                break;
                            } else {
                                timeCycleSplineSet.rl(this.f35236n, this.ty, this.WPU, this.XQ, this.aYN);
                                break;
                            }
                            break;
                        default:
                            Utils.n("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    CustomVariable customVariable = (CustomVariable) this.f35235O.get(str.substring(7));
                    if (customVariable != null) {
                        ((TimeCycleSplineSet.CustomVarSet) timeCycleSplineSet).J2(this.f35236n, customVariable, this.WPU, this.XQ, this.aYN);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean O(int i2, String str) {
        if (i2 == 420) {
            this.Uo = str;
            return true;
        }
        if (i2 != 421) {
            return super.O(i2, str);
        }
        this.XQ = 7;
        this.f35248S = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: Uo */
    public MotionKey clone() {
        return new MotionKeyTimeCycle().ty(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean rl(int i2, int i3) {
        if (i2 == 100) {
            this.f35236n = i3;
            return true;
        }
        if (i2 != 421) {
            return super.rl(i2, i3);
        }
        this.XQ = i3;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean t(int i2, float f3) {
        if (i2 == 315) {
            this.f35249Z = gh(Float.valueOf(f3));
            return true;
        }
        if (i2 == 401) {
            this.KN = qie(Float.valueOf(f3));
            return true;
        }
        if (i2 == 403) {
            this.xMQ = f3;
            return true;
        }
        if (i2 == 416) {
            this.ty = gh(Float.valueOf(f3));
            return true;
        }
        if (i2 == 423) {
            this.WPU = gh(Float.valueOf(f3));
            return true;
        }
        if (i2 == 424) {
            this.aYN = gh(Float.valueOf(f3));
            return true;
        }
        switch (i2) {
            case AD_EXPIRED_VALUE:
                this.Ik = gh(Float.valueOf(f3));
                return true;
            case MRAID_BRIDGE_ERROR_VALUE:
                this.f35251r = gh(Float.valueOf(f3));
                return true;
            case 306:
                this.f35250o = gh(Float.valueOf(f3));
                return true;
            case 307:
                this.mUb = gh(Float.valueOf(f3));
                return true;
            case 308:
                this.qie = gh(Float.valueOf(f3));
                return true;
            case ASSET_FAILED_TO_DELETE_VALUE:
                this.az = gh(Float.valueOf(f3));
                return true;
            case AD_HTML_FAILED_TO_LOAD_VALUE:
                this.gh = gh(Float.valueOf(f3));
                return true;
            case MRAID_JS_CALL_EMPTY_VALUE:
                this.HI = gh(Float.valueOf(f3));
                return true;
            case DEEPLINK_OPEN_FAILED_VALUE:
                this.ck = gh(Float.valueOf(f3));
                return true;
            default:
                return super.t(i2, f3);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void xMQ(HashSet hashSet) {
        if (!Float.isNaN(this.xMQ)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.mUb)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.gh)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.qie)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.az)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.HI)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.ck)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.ty)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.Ik)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f35251r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f35250o)) {
            hashSet.add("translationZ");
        }
        if (this.f35235O.size() > 0) {
            Iterator it = this.f35235O.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    public MotionKeyTimeCycle() {
        this.nr = 3;
        this.f35235O = new HashMap();
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int n(String str) {
        return TypedValues.CycleType.n(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean nr(int i2, boolean z2) {
        return super.nr(i2, z2);
    }

    public MotionKeyTimeCycle ty(MotionKey motionKey) {
        super.KN(motionKey);
        MotionKeyTimeCycle motionKeyTimeCycle = (MotionKeyTimeCycle) motionKey;
        this.Uo = motionKeyTimeCycle.Uo;
        this.KN = motionKeyTimeCycle.KN;
        this.XQ = motionKeyTimeCycle.XQ;
        this.WPU = motionKeyTimeCycle.WPU;
        this.aYN = motionKeyTimeCycle.aYN;
        this.f35249Z = motionKeyTimeCycle.f35249Z;
        this.xMQ = motionKeyTimeCycle.xMQ;
        this.mUb = motionKeyTimeCycle.mUb;
        this.gh = motionKeyTimeCycle.gh;
        this.ty = motionKeyTimeCycle.ty;
        this.qie = motionKeyTimeCycle.qie;
        this.az = motionKeyTimeCycle.az;
        this.HI = motionKeyTimeCycle.HI;
        this.ck = motionKeyTimeCycle.ck;
        this.Ik = motionKeyTimeCycle.Ik;
        this.f35251r = motionKeyTimeCycle.f35251r;
        this.f35250o = motionKeyTimeCycle.f35250o;
        return this;
    }
}
