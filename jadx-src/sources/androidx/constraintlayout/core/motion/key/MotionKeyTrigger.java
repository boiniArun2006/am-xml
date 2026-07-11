package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class MotionKeyTrigger extends MotionKey {
    private boolean HI;
    private boolean Ik;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f35252S;
    FloatRect ViF;
    int WPU;
    int XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f35253Z;
    FloatRect aYN;
    private int az;
    private boolean ck;
    private String gh;
    private String mUb;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35254o;
    private int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35255r;
    float ty;
    private int xMQ;
    private int Uo = -1;
    private String KN = null;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void J2(HashMap map) {
    }

    public void az(float f3, MotionWidget motionWidget) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void xMQ(HashSet hashSet) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean O(int i2, String str) {
        if (i2 == 309) {
            this.gh = str;
            return true;
        }
        if (i2 == 310) {
            this.mUb = str;
            return true;
        }
        if (i2 != 312) {
            return super.O(i2, str);
        }
        this.KN = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: Uo */
    public MotionKey clone() {
        return new MotionKeyTrigger().ty(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean nr(int i2, boolean z2) {
        if (i2 != 304) {
            return super.nr(i2, z2);
        }
        this.f35253Z = z2;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean rl(int i2, int i3) {
        if (i2 == 307) {
            this.az = i3;
            return true;
        }
        if (i2 == 308) {
            this.qie = qie(Integer.valueOf(i3));
            return true;
        }
        if (i2 == 311) {
            this.xMQ = i3;
            return true;
        }
        switch (i2) {
            case MRAID_ERROR_VALUE:
                this.WPU = i3;
                return true;
            case INVALID_IFA_STATUS_VALUE:
                this.f35252S = i3;
                return true;
            case 303:
                this.XQ = i3;
                return true;
            default:
                return super.rl(i2, i3);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean t(int i2, float f3) {
        if (i2 != 305) {
            return super.t(i2, f3);
        }
        this.ty = f3;
        return true;
    }

    public MotionKeyTrigger() {
        int i2 = MotionKey.J2;
        this.xMQ = i2;
        this.mUb = null;
        this.gh = null;
        this.qie = i2;
        this.az = i2;
        this.ty = 0.1f;
        this.HI = true;
        this.ck = true;
        this.Ik = true;
        this.f35255r = Float.NaN;
        this.f35253Z = false;
        this.XQ = i2;
        this.f35252S = i2;
        this.WPU = i2;
        this.aYN = new FloatRect();
        this.ViF = new FloatRect();
        this.nr = 5;
        this.f35235O = new HashMap();
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int n(String str) {
        str.getClass();
        switch (str) {
            case "positiveCross":
                return Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE;
            case "viewTransitionOnPositiveCross":
                return Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE;
            case "triggerCollisionId":
                return 307;
            case "triggerID":
                return 308;
            case "negativeCross":
                return Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
            case "triggerCollisionView":
                return 306;
            case "viewTransitionOnNegativeCross":
                return 303;
            case "triggerSlack":
                return Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE;
            case "viewTransitionOnCross":
                return Sdk.SDKError.Reason.MRAID_ERROR_VALUE;
            case "postLayout":
                return Sdk.SDKError.Reason.AD_EXPIRED_VALUE;
            case "triggerReceiver":
                return Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE;
            default:
                return -1;
        }
    }

    public MotionKeyTrigger ty(MotionKey motionKey) {
        super.KN(motionKey);
        MotionKeyTrigger motionKeyTrigger = (MotionKeyTrigger) motionKey;
        this.Uo = motionKeyTrigger.Uo;
        this.KN = motionKeyTrigger.KN;
        this.xMQ = motionKeyTrigger.xMQ;
        this.mUb = motionKeyTrigger.mUb;
        this.gh = motionKeyTrigger.gh;
        this.qie = motionKeyTrigger.qie;
        this.az = motionKeyTrigger.az;
        this.ty = motionKeyTrigger.ty;
        this.HI = motionKeyTrigger.HI;
        this.ck = motionKeyTrigger.ck;
        this.Ik = motionKeyTrigger.Ik;
        this.f35255r = motionKeyTrigger.f35255r;
        this.f35254o = motionKeyTrigger.f35254o;
        this.f35253Z = motionKeyTrigger.f35253Z;
        this.aYN = motionKeyTrigger.aYN;
        this.ViF = motionKeyTrigger.ViF;
        return this;
    }
}
