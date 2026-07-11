package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class MotionKeyAttributes extends MotionKey {
    private String Uo;
    private int KN = -1;
    private int xMQ = 0;
    private float mUb = Float.NaN;
    private float gh = Float.NaN;
    private float qie = Float.NaN;
    private float az = Float.NaN;
    private float ty = Float.NaN;
    private float HI = Float.NaN;
    private float ck = Float.NaN;
    private float Ik = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35241r = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35240o = Float.NaN;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f35239Z = Float.NaN;
    private float XQ = Float.NaN;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f35238S = Float.NaN;
    private float WPU = Float.NaN;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void J2(HashMap map) {
        for (String str : map.keySet()) {
            SplineSet splineSet = (SplineSet) map.get(str);
            if (splineSet != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.az)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.az);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.ty)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.ty);
                                break;
                            }
                            break;
                        case "rotationZ":
                            if (Float.isNaN(this.qie)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.qie);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f35239Z)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.f35239Z);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.XQ)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.XQ);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f35238S)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.f35238S);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.WPU)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.WPU);
                                break;
                            }
                            break;
                        case "pivotX":
                            if (Float.isNaN(this.az)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.HI);
                                break;
                            }
                            break;
                        case "pivotY":
                            if (Float.isNaN(this.ty)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.ck);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f35241r)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.f35241r);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f35240o)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.f35240o);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.gh)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.gh);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.mUb)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.mUb);
                                break;
                            }
                            break;
                        case "pathRotate":
                            if (Float.isNaN(this.Ik)) {
                                break;
                            } else {
                                splineSet.O(this.f35236n, this.Ik);
                                break;
                            }
                            break;
                        default:
                            System.err.println("not supported by KeyAttributes " + str);
                            break;
                    }
                } else {
                    CustomVariable customVariable = (CustomVariable) this.f35235O.get(str.substring(7));
                    if (customVariable != null) {
                        ((SplineSet.CustomSpline) splineSet).xMQ(this.f35236n, customVariable);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: Uo */
    public MotionKey clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean O(int i2, String str) {
        if (i2 == 101) {
            this.f35237t = str;
            return true;
        }
        if (i2 != 317) {
            return super.O(i2, str);
        }
        this.Uo = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void mUb(HashMap map) {
        if (!Float.isNaN(this.mUb)) {
            map.put("alpha", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.gh)) {
            map.put("elevation", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.qie)) {
            map.put("rotationZ", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.az)) {
            map.put("rotationX", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.ty)) {
            map.put("rotationY", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.HI)) {
            map.put("pivotX", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.ck)) {
            map.put("pivotY", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.f35239Z)) {
            map.put("translationX", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.XQ)) {
            map.put("translationY", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.f35238S)) {
            map.put("translationZ", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.Ik)) {
            map.put("pathRotate", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.f35241r)) {
            map.put("scaleX", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.f35240o)) {
            map.put("scaleY", Integer.valueOf(this.KN));
        }
        if (!Float.isNaN(this.WPU)) {
            map.put("progress", Integer.valueOf(this.KN));
        }
        if (this.f35235O.size() > 0) {
            Iterator it = this.f35235O.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.KN));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean rl(int i2, int i3) {
        if (i2 == 100) {
            this.f35236n = i3;
            return true;
        }
        if (i2 == 301) {
            this.KN = i3;
            return true;
        }
        if (i2 == 302) {
            this.xMQ = i3;
            return true;
        }
        if (rl(i2, i3)) {
            return true;
        }
        return super.rl(i2, i3);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean t(int i2, float f3) {
        if (i2 == 100) {
            this.Ik = f3;
            return true;
        }
        switch (i2) {
            case 303:
                this.mUb = f3;
                return true;
            case AD_EXPIRED_VALUE:
                this.f35239Z = f3;
                return true;
            case MRAID_BRIDGE_ERROR_VALUE:
                this.XQ = f3;
                return true;
            case 306:
                this.f35238S = f3;
                return true;
            case 307:
                this.gh = f3;
                return true;
            case 308:
                this.az = f3;
                return true;
            case ASSET_FAILED_TO_DELETE_VALUE:
                this.ty = f3;
                return true;
            case AD_HTML_FAILED_TO_LOAD_VALUE:
                this.qie = f3;
                return true;
            case MRAID_JS_CALL_EMPTY_VALUE:
                this.f35241r = f3;
                return true;
            case DEEPLINK_OPEN_FAILED_VALUE:
                this.f35240o = f3;
                return true;
            case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                this.HI = f3;
                return true;
            case LINK_COMMAND_OPEN_FAILED_VALUE:
                this.ck = f3;
                return true;
            case JSON_PARAMS_ENCODE_ERROR_VALUE:
                this.WPU = f3;
                return true;
            case GENERATE_JSON_DATA_ERROR_VALUE:
                this.Ik = f3;
                return true;
            default:
                return super.t(i2, f3);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void xMQ(HashSet hashSet) {
        if (!Float.isNaN(this.mUb)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.gh)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.qie)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.az)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.ty)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.HI)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.ck)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.f35239Z)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.XQ)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f35238S)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.Ik)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f35241r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f35240o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.WPU)) {
            hashSet.add("progress");
        }
        if (this.f35235O.size() > 0) {
            Iterator it = this.f35235O.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    public MotionKeyAttributes() {
        this.nr = 1;
        this.f35235O = new HashMap();
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int n(String str) {
        return TypedValues.AttributesType.n(str);
    }
}
