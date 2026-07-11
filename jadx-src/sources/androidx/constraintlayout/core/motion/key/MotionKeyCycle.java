package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class MotionKeyCycle extends MotionKey {
    private String Uo = null;
    private int KN = 0;
    private int xMQ = -1;
    private String mUb = null;
    private float gh = Float.NaN;
    private float qie = 0.0f;
    private float az = 0.0f;
    private float ty = Float.NaN;
    private float HI = Float.NaN;
    private float ck = Float.NaN;
    private float Ik = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35245r = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35244o = Float.NaN;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f35243Z = Float.NaN;
    private float XQ = Float.NaN;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f35242S = Float.NaN;
    private float WPU = Float.NaN;
    private float aYN = Float.NaN;
    private float ViF = Float.NaN;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void J2(HashMap map) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: Uo */
    public MotionKey clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean O(int i2, String str) {
        if (i2 == 420) {
            this.Uo = str;
            return true;
        }
        if (i2 != 422) {
            return super.O(i2, str);
        }
        this.mUb = str;
        return true;
    }

    public void az(HashMap map) {
        KeyCycleOscillator keyCycleOscillator;
        KeyCycleOscillator keyCycleOscillator2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                CustomVariable customVariable = (CustomVariable) this.f35235O.get(str.substring(7));
                if (customVariable != null && customVariable.xMQ() == 901 && (keyCycleOscillator = (KeyCycleOscillator) map.get(str)) != null) {
                    keyCycleOscillator.J2(this.f35236n, this.xMQ, this.mUb, -1, this.gh, this.qie, this.az / 360.0f, customVariable.mUb(), customVariable);
                }
            } else {
                float fTy = ty(str);
                if (!Float.isNaN(fTy) && (keyCycleOscillator2 = (KeyCycleOscillator) map.get(str)) != null) {
                    keyCycleOscillator2.O(this.f35236n, this.xMQ, this.mUb, -1, this.gh, this.qie, this.az / 360.0f, fTy);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean rl(int i2, int i3) {
        if (i2 == 401) {
            this.KN = i3;
            return true;
        }
        if (i2 == 421) {
            this.xMQ = i3;
            return true;
        }
        if (t(i2, i3)) {
            return true;
        }
        return super.rl(i2, i3);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean t(int i2, float f3) {
        if (i2 == 315) {
            this.ty = f3;
            return true;
        }
        if (i2 == 403) {
            this.HI = f3;
            return true;
        }
        if (i2 == 416) {
            this.f35245r = f3;
            return true;
        }
        switch (i2) {
            case AD_EXPIRED_VALUE:
                this.WPU = f3;
                return true;
            case MRAID_BRIDGE_ERROR_VALUE:
                this.aYN = f3;
                return true;
            case 306:
                this.ViF = f3;
                return true;
            case 307:
                this.ck = f3;
                return true;
            case 308:
                this.f35244o = f3;
                return true;
            case ASSET_FAILED_TO_DELETE_VALUE:
                this.f35243Z = f3;
                return true;
            case AD_HTML_FAILED_TO_LOAD_VALUE:
                this.Ik = f3;
                return true;
            case MRAID_JS_CALL_EMPTY_VALUE:
                this.XQ = f3;
                return true;
            case DEEPLINK_OPEN_FAILED_VALUE:
                this.f35242S = f3;
                return true;
            default:
                switch (i2) {
                    case 423:
                        this.gh = f3;
                        return true;
                    case 424:
                        this.qie = f3;
                        return true;
                    case 425:
                        this.az = f3;
                        return true;
                    default:
                        return super.t(i2, f3);
                }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void xMQ(HashSet hashSet) {
        if (!Float.isNaN(this.HI)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.ck)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.Ik)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f35244o)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f35243Z)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.XQ)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f35242S)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f35245r)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.WPU)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.aYN)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.ViF)) {
            hashSet.add("translationZ");
        }
        if (this.f35235O.size() > 0) {
            Iterator it = this.f35235O.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    public MotionKeyCycle() {
        this.nr = 4;
        this.f35235O = new HashMap();
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int n(String str) {
        str.getClass();
        switch (str) {
            case "customWave":
                return 422;
            case "easing":
                return 420;
            case "rotationX":
                return 308;
            case "rotationY":
                return Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE;
            case "rotationZ":
                return Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
            case "translationX":
                return Sdk.SDKError.Reason.AD_EXPIRED_VALUE;
            case "translationY":
                return Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE;
            case "translationZ":
                return 306;
            case "offset":
                return 424;
            case "progress":
                return Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE;
            case "period":
                return 423;
            case "pivotX":
                return Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE;
            case "pivotY":
                return Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE;
            case "scaleX":
                return Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE;
            case "scaleY":
                return Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE;
            case "alpha":
                return 403;
            case "phase":
                return 425;
            case "curveFit":
                return 401;
            case "pathRotate":
                return 416;
            case "waveShape":
                return 421;
            case "visibility":
                return 402;
            default:
                return -1;
        }
    }

    public float ty(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return this.f35244o;
            case "rotationY":
                return this.f35243Z;
            case "rotationZ":
                return this.Ik;
            case "translationX":
                return this.WPU;
            case "translationY":
                return this.aYN;
            case "translationZ":
                return this.ViF;
            case "offset":
                return this.qie;
            case "progress":
                return this.ty;
            case "scaleX":
                return this.XQ;
            case "scaleY":
                return this.f35242S;
            case "elevation":
                return this.ck;
            case "alpha":
                return this.HI;
            case "phase":
                return this.az;
            case "pathRotate":
                return this.f35245r;
            default:
                return Float.NaN;
        }
    }
}
