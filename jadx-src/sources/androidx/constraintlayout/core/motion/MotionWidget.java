package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class MotionWidget implements TypedValues {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    float f35227O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    WidgetFrame f35228n;
    private float nr;
    Motion rl = new Motion();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    PropertySet f35229t = new PropertySet();

    public static class Motion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f35231n = null;
        public int rl = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public String f35232t = null;
        public int nr = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f35230O = 0;
        public float J2 = Float.NaN;
        public int Uo = -1;
        public float KN = Float.NaN;
        public float xMQ = Float.NaN;
        public int mUb = -1;
        public String gh = null;
        public int qie = -3;
        public int az = -1;
    }

    public static class PropertySet {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f35233n = 4;
        public int rl = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f35234t = 1.0f;
        public float nr = Float.NaN;
    }

    public MotionWidget J2(int i2) {
        return null;
    }

    public MotionWidget az() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean nr(int i2, boolean z2) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean rl(int i2, int i3) {
        if (v(i2, i3)) {
            return true;
        }
        return bzg(i2, i3);
    }

    public float HI() {
        return this.f35228n.Uo;
    }

    public float Ik() {
        return this.f35228n.KN;
    }

    public int KN() {
        return this.f35228n.f35460O;
    }

    public void N(String str, int i2, boolean z2) {
        this.f35228n.o(str, i2, z2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean O(int i2, String str) {
        if (i2 != 605) {
            return Xw(i2, str);
        }
        this.rl.f35231n = str;
        return true;
    }

    public int S() {
        return this.f35228n.f35465t;
    }

    public void T(String str, int i2, int i3) {
        this.f35228n.r(str, i2, i3);
    }

    public void U(TypedValues typedValues) {
        if (this.f35228n.xMQ() != null) {
            this.f35228n.xMQ().Uo(typedValues);
        }
    }

    public float Uo() {
        return this.f35228n.ck;
    }

    public float ViF() {
        return this.f35228n.az;
    }

    public float WPU() {
        return this.f35228n.gh;
    }

    public void X(String str, int i2, float f3) {
        this.f35228n.Ik(str, i2, f3);
    }

    public float XQ() {
        return this.f35228n.HI;
    }

    public boolean Xw(int i2, String str) {
        if (i2 == 603) {
            this.rl.f35232t = str;
            return true;
        }
        if (i2 != 604) {
            return false;
        }
        this.rl.gh = str;
        return true;
    }

    public float Z() {
        return this.f35228n.ty;
    }

    public float aYN() {
        return this.f35228n.qie;
    }

    public int ck() {
        return this.f35228n.nr;
    }

    public void e(int i2, int i3, int i5, int i7) {
        if (this.f35228n == null) {
            this.f35228n = new WidgetFrame((ConstraintWidget) null);
        }
        WidgetFrame widgetFrame = this.f35228n;
        widgetFrame.f35465t = i3;
        widgetFrame.rl = i2;
        widgetFrame.nr = i5;
        widgetFrame.f35460O = i7;
    }

    public int fD() {
        return this.f35228n.f35465t;
    }

    public WidgetFrame g() {
        return this.f35228n;
    }

    public int gh() {
        WidgetFrame widgetFrame = this.f35228n;
        return widgetFrame.f35460O - widgetFrame.f35465t;
    }

    public int iF() {
        return this.f35228n.rl;
    }

    public void jB(int i2) {
        this.f35229t.f35233n = i2;
    }

    public Set mUb() {
        return this.f35228n.KN();
    }

    public void nHg(float f3) {
        this.f35228n.J2 = f3;
    }

    public int nY() {
        return this.f35229t.f35233n;
    }

    public float o() {
        return this.f35228n.mUb;
    }

    public int qie() {
        return this.f35228n.rl;
    }

    public float r() {
        return this.f35228n.xMQ;
    }

    public void s7N(float f3) {
        this.f35228n.Uo = f3;
    }

    public int te() {
        WidgetFrame widgetFrame = this.f35228n;
        return widgetFrame.nr - widgetFrame.rl;
    }

    public String toString() {
        return this.f35228n.rl + ", " + this.f35228n.f35465t + ", " + this.f35228n.nr + ", " + this.f35228n.f35460O;
    }

    public float ty() {
        return this.f35228n.J2;
    }

    public void wTp(float f3) {
        this.f35228n.mUb = f3;
    }

    public CustomVariable xMQ(String str) {
        return this.f35228n.Uo(str);
    }

    public MotionWidget(WidgetFrame widgetFrame) {
        this.f35228n = new WidgetFrame();
        this.f35228n = widgetFrame;
    }

    public void E2(int i2, int i3, int i5, int i7) {
        e(i2, i3, i5, i7);
    }

    public boolean bzg(int i2, int i3) {
        switch (i2) {
            case 606:
                this.rl.rl = i3;
                return true;
            case 607:
                this.rl.nr = i3;
                return true;
            case 608:
                this.rl.f35230O = i3;
                return true;
            case 609:
                this.rl.Uo = i3;
                return true;
            case 610:
                this.rl.mUb = i3;
                return true;
            case 611:
                this.rl.qie = i3;
                return true;
            case 612:
                this.rl.az = i3;
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int n(String str) {
        int iN = TypedValues.AttributesType.n(str);
        if (iN != -1) {
            return iN;
        }
        return TypedValues.MotionType.n(str);
    }

    public boolean rV9(int i2, float f3) {
        switch (i2) {
            case NATIVE_ASSET_ERROR_VALUE:
                this.rl.J2 = f3;
                return true;
            case NATIVE_VIDEO_PLAYBACK_ERROR_VALUE:
                this.rl.KN = f3;
                return true;
            case 602:
                this.rl.xMQ = f3;
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean t(int i2, float f3) {
        if (v(i2, f3)) {
            return true;
        }
        return rV9(i2, f3);
    }

    public boolean v(int i2, float f3) {
        switch (i2) {
            case 303:
                this.f35228n.ck = f3;
                return true;
            case AD_EXPIRED_VALUE:
                this.f35228n.gh = f3;
                return true;
            case MRAID_BRIDGE_ERROR_VALUE:
                this.f35228n.qie = f3;
                return true;
            case 306:
                this.f35228n.az = f3;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.f35228n.KN = f3;
                return true;
            case ASSET_FAILED_TO_DELETE_VALUE:
                this.f35228n.xMQ = f3;
                return true;
            case AD_HTML_FAILED_TO_LOAD_VALUE:
                this.f35228n.mUb = f3;
                return true;
            case MRAID_JS_CALL_EMPTY_VALUE:
                this.f35228n.ty = f3;
                return true;
            case DEEPLINK_OPEN_FAILED_VALUE:
                this.f35228n.HI = f3;
                return true;
            case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                this.f35228n.J2 = f3;
                return true;
            case LINK_COMMAND_OPEN_FAILED_VALUE:
                this.f35228n.Uo = f3;
                return true;
            case JSON_PARAMS_ENCODE_ERROR_VALUE:
                this.nr = f3;
                return true;
            case GENERATE_JSON_DATA_ERROR_VALUE:
                this.f35227O = f3;
                return true;
        }
    }
}
