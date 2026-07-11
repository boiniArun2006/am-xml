package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Transition implements TypedValues {
    int HI;
    int Ik;
    int az;
    int ck;
    final CorePixelDp gh;
    int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f35444r;
    int ty;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HashMap f35443n = new HashMap();
    private HashMap rl = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TypedBundle f35445t = new TypedBundle();
    private int nr = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f35442O = null;
    private Easing J2 = null;
    private int Uo = 0;
    private int KN = Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE;
    private float xMQ = 0.0f;
    private OnSwipe mUb = null;

    static class KeyPosition {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f35446n;
        float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float f35447t;
    }

    static class OnSwipe {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        String f35450O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private long f35451Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f35452n;
        private String nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private StopEngine f35455t;
        public static final String[] XQ = {"top", TtmlNode.LEFT, TtmlNode.RIGHT, "bottom", "middle", TtmlNode.START, TtmlNode.END};

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final float[][] f35448S = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
        public static final String[] WPU = {"up", "down", TtmlNode.LEFT, TtmlNode.RIGHT, TtmlNode.START, TtmlNode.END, "clockwise", "anticlockwise"};
        public static final String[] aYN = {"velocity", "spring"};
        public static final String[] ViF = {"autocomplete", "toStart", "toEnd", "stop", "decelerate", "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};
        public static final String[] nY = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final float[][] f35449g = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
        private boolean J2 = true;
        private int Uo = 0;
        private float KN = 1.0f;
        private float xMQ = 10.0f;
        private int mUb = 0;
        private float gh = 4.0f;
        private float qie = 1.2f;
        private int az = 0;
        private float ty = 1.0f;
        private float HI = 400.0f;
        private float ck = 10.0f;
        private float Ik = 0.01f;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f35454r = 0.0f;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f35453o = 0;

        void Ik(int i2) {
            this.az = i2;
        }

        public float J2(long j2) {
            return this.f35455t.rl() ? this.f35454r : this.f35455t.getInterpolation((j2 - this.f35451Z) * 1.0E-9f);
        }

        void KN(String str) {
            this.f35452n = str;
        }

        float[] O() {
            return f35448S[this.rl];
        }

        public boolean Uo(float f3) {
            StopEngine stopEngine;
            return (this.az == 3 || (stopEngine = this.f35455t) == null || stopEngine.rl()) ? false : true;
        }

        void gh(int i2) {
            this.Uo = i2;
            this.J2 = i2 < 2;
        }

        void mUb(int i2) {
            this.mUb = i2;
        }

        void n(float f3, float f4, long j2, float f5) {
            SpringStopEngine springStopEngine;
            StopLogicEngine stopLogicEngine;
            StopLogicEngine.Decelerate decelerate;
            this.f35451Z = j2;
            float fAbs = Math.abs(f4);
            float f6 = this.gh;
            if (fAbs > f6) {
                f4 = Math.signum(f4) * f6;
            }
            float f7 = f4;
            float fRl = rl(f3, f7, f5);
            this.f35454r = fRl;
            if (fRl == f3) {
                this.f35455t = null;
                return;
            }
            if (this.az == 4 && this.mUb == 0) {
                StopEngine stopEngine = this.f35455t;
                if (stopEngine instanceof StopLogicEngine.Decelerate) {
                    decelerate = (StopLogicEngine.Decelerate) stopEngine;
                } else {
                    decelerate = new StopLogicEngine.Decelerate();
                    this.f35455t = decelerate;
                }
                decelerate.t(f3, this.f35454r, f7);
                return;
            }
            if (this.mUb == 0) {
                StopEngine stopEngine2 = this.f35455t;
                if (stopEngine2 instanceof StopLogicEngine) {
                    stopLogicEngine = (StopLogicEngine) stopEngine2;
                } else {
                    stopLogicEngine = new StopLogicEngine();
                    this.f35455t = stopLogicEngine;
                }
                stopLogicEngine.nr(f3, this.f35454r, f7, f5, this.qie, this.gh);
                return;
            }
            StopEngine stopEngine3 = this.f35455t;
            if (stopEngine3 instanceof SpringStopEngine) {
                springStopEngine = (SpringStopEngine) stopEngine3;
            } else {
                springStopEngine = new SpringStopEngine();
                this.f35455t = springStopEngine;
            }
            springStopEngine.nr(f3, this.f35454r, f7, this.ty, this.HI, this.ck, this.Ik, this.f35453o);
        }

        float nr() {
            return this.KN;
        }

        void o(int i2) {
            this.f35453o = i2;
        }

        void r(String str) {
            this.nr = str;
        }

        float[] t() {
            return f35449g[this.Uo];
        }

        void ty(String str) {
            this.f35450O = str;
        }

        void xMQ(int i2) {
            this.rl = i2;
        }

        OnSwipe() {
        }

        void HI(float f3) {
            if (Float.isNaN(f3)) {
                return;
            }
            this.qie = f3;
        }

        void S(float f3) {
            if (Float.isNaN(f3)) {
                return;
            }
            this.HI = f3;
        }

        void WPU(float f3) {
            if (Float.isNaN(f3)) {
                return;
            }
            this.Ik = f3;
        }

        void XQ(float f3) {
            if (Float.isNaN(f3)) {
                return;
            }
            this.ty = f3;
        }

        void Z(float f3) {
            if (Float.isNaN(f3)) {
                return;
            }
            this.ck = f3;
        }

        void az(float f3) {
            if (Float.isNaN(f3)) {
                return;
            }
            this.xMQ = f3;
        }

        void ck(float f3) {
            if (Float.isNaN(f3)) {
                return;
            }
            this.gh = f3;
        }

        void qie(float f3) {
            if (Float.isNaN(f3)) {
                return;
            }
            this.KN = f3;
        }

        float rl(float f3, float f4, float f5) {
            float fAbs = (((Math.abs(f4) * 0.5f) * f4) / this.qie) + f3;
            switch (this.az) {
                case 1:
                    if (f3 < 1.0f) {
                        return 0.0f;
                    }
                    return 1.0f;
                case 2:
                    if (f3 <= 0.0f) {
                        return 0.0f;
                    }
                    return 1.0f;
                case 3:
                    return Float.NaN;
                case 4:
                    return Math.max(0.0f, Math.min(1.0f, fAbs));
                case 5:
                    if (fAbs > 0.2f && fAbs < 0.8f) {
                        return fAbs;
                    }
                    if (fAbs <= 0.5f) {
                        return 0.0f;
                    }
                    return 1.0f;
                case 6:
                    return 1.0f;
                default:
                    if (fAbs > 0.5d) {
                        return 1.0f;
                    }
                case 7:
                    return 0.0f;
            }
        }
    }

    public static class WidgetState {
        Motion nr;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f35456O = true;
        KeyCache xMQ = new KeyCache();
        int mUb = -1;
        int gh = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        WidgetFrame f35457n = new WidgetFrame();
        WidgetFrame rl = new WidgetFrame();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        WidgetFrame f35458t = new WidgetFrame();
        MotionWidget J2 = new MotionWidget(this.f35457n);
        MotionWidget Uo = new MotionWidget(this.rl);
        MotionWidget KN = new MotionWidget(this.f35458t);

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void KN(ConstraintWidget constraintWidget, int i2) {
            if (i2 == 0) {
                this.f35457n.S(constraintWidget);
                MotionWidget motionWidget = this.J2;
                motionWidget.U(motionWidget);
                this.nr.nY(this.J2);
                this.f35456O = true;
            } else if (i2 == 1) {
                this.rl.S(constraintWidget);
                this.nr.S(this.Uo);
                this.f35456O = true;
            }
            this.gh = -1;
        }

        public void J2(TypedBundle typedBundle) {
            MotionKeyPosition motionKeyPosition = new MotionKeyPosition();
            typedBundle.Uo(motionKeyPosition);
            this.nr.J2(motionKeyPosition);
        }

        public void O(TypedBundle typedBundle) {
            MotionKeyCycle motionKeyCycle = new MotionKeyCycle();
            typedBundle.Uo(motionKeyCycle);
            this.nr.J2(motionKeyCycle);
        }

        public void Uo(WidgetState widgetState) {
            this.nr.fD(widgetState.nr);
        }

        public WidgetFrame n(int i2) {
            return i2 == 0 ? this.f35457n : i2 == 1 ? this.rl : this.f35458t;
        }

        public void nr(TypedBundle typedBundle, CustomVariable[] customVariableArr) {
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.Uo(motionKeyAttributes);
            if (customVariableArr != null) {
                for (int i2 = 0; i2 < customVariableArr.length; i2++) {
                    motionKeyAttributes.f35235O.put(customVariableArr[i2].Uo(), customVariableArr[i2]);
                }
            }
            this.nr.J2(motionKeyAttributes);
        }

        String rl() {
            return this.nr.mUb();
        }

        public void t(int i2, int i3, float f3, Transition transition) {
            this.mUb = i3;
            this.gh = i2;
            if (this.f35456O) {
                this.nr.te(i2, i3, 1.0f, System.nanoTime());
                this.f35456O = false;
            }
            WidgetFrame.qie(i2, i3, this.f35458t, this.f35457n, this.rl, transition, f3);
            this.f35458t.Ik = f3;
            this.nr.Z(this.KN, f3, System.nanoTime(), this.xMQ);
        }

        public WidgetState() {
            Motion motion = new Motion(this.J2);
            this.nr = motion;
            motion.nY(this.J2);
            this.nr.S(this.Uo);
        }
    }

    public void J2(int i2, String str, String str2, int i3) {
        fD(str, null, i2).n(i2).t(str2, i3);
    }

    public void KN(String str, TypedBundle typedBundle, CustomVariable[] customVariableArr) {
        fD(str, null, 0).nr(typedBundle, customVariableArr);
    }

    public void Uo(int i2, String str, String str2, float f3) {
        fD(str, null, i2).n(i2).nr(str2, f3);
    }

    public Motion ViF(String str) {
        return fD(str, null, 0).nr;
    }

    public void mUb(String str, TypedBundle typedBundle) {
        fD(str, null, 0).J2(typedBundle);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int n(String str) {
        return 0;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean nr(int i2, boolean z2) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean rl(int i2, int i3) {
        return false;
    }

    void s7N() {
        this.mUb = null;
        this.f35445t.KN();
    }

    public void xMQ(String str, TypedBundle typedBundle) {
        fD(str, null, 0).O(typedBundle);
    }

    private void qie(float f3) {
        this.ck = (int) (this.qie + 0.5f + ((this.ty - r0) * f3));
        this.Ik = (int) (this.az + 0.5f + ((this.HI - r0) * f3));
    }

    public boolean E2() {
        return this.mUb != null;
    }

    public float HI(float f3, int i2, int i3, float f4, float f5) {
        float fAbs;
        float fNr;
        Iterator it = this.rl.values().iterator();
        WidgetState widgetState = it.hasNext() ? (WidgetState) it.next() : null;
        OnSwipe onSwipe = this.mUb;
        if (onSwipe == null || widgetState == null) {
            if (widgetState != null) {
                return (-f5) / widgetState.mUb;
            }
            return 1.0f;
        }
        String str = onSwipe.f35452n;
        if (str == null) {
            float[] fArrT = onSwipe.t();
            int i5 = widgetState.mUb;
            float f6 = i5;
            float f7 = i5;
            float f8 = fArrT[0];
            fAbs = f8 != 0.0f ? (f4 * Math.abs(f8)) / f6 : (f5 * Math.abs(fArrT[1])) / f7;
            fNr = this.mUb.nr();
        } else {
            WidgetState widgetState2 = (WidgetState) this.rl.get(str);
            float[] fArrT2 = this.mUb.t();
            float[] fArrO = this.mUb.O();
            float[] fArr = new float[2];
            widgetState2.t(i2, i3, f3, this);
            widgetState2.nr.qie(f3, fArrO[0], fArrO[1], fArr);
            float f9 = fArrT2[0];
            fAbs = f9 != 0.0f ? (f4 * Math.abs(f9)) / fArr[0] : (f5 * Math.abs(fArrT2[1])) / fArr[1];
            fNr = this.mUb.nr();
        }
        return fAbs * fNr;
    }

    public KeyPosition Ik(String str, int i2) {
        KeyPosition keyPosition;
        while (i2 >= 0) {
            HashMap map = (HashMap) this.f35443n.get(Integer.valueOf(i2));
            if (map != null && (keyPosition = (KeyPosition) map.get(str)) != null) {
                return keyPosition;
            }
            i2--;
        }
        return null;
    }

    public boolean N(float f3, float f4) {
        OnSwipe onSwipe = this.mUb;
        if (onSwipe == null) {
            return false;
        }
        String str = onSwipe.f35450O;
        if (str == null) {
            return true;
        }
        WidgetState widgetState = (WidgetState) this.rl.get(str);
        if (widgetState == null) {
            System.err.println("mLimitBoundsTo target is null");
            return false;
        }
        WidgetFrame widgetFrameN = widgetState.n(2);
        return f3 >= ((float) widgetFrameN.rl) && f3 < ((float) widgetFrameN.nr) && f4 >= ((float) widgetFrameN.f35465t) && f4 < ((float) widgetFrameN.f35460O);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean O(int i2, String str) {
        if (i2 != 705) {
            return false;
        }
        this.f35442O = str;
        this.J2 = Easing.t(str);
        return false;
    }

    public int S() {
        return this.Ik;
    }

    public boolean T() {
        return this.rl.isEmpty();
    }

    public int WPU() {
        return this.ck;
    }

    public void X(int i2, int i3, float f3) {
        if (this.f35444r) {
            qie(f3);
        }
        Easing easing = this.J2;
        if (easing != null) {
            f3 = (float) easing.n(f3);
        }
        Iterator it = this.rl.keySet().iterator();
        while (it.hasNext()) {
            ((WidgetState) this.rl.get((String) it.next())).t(i2, i3, f3, this);
        }
    }

    public WidgetFrame XQ(String str) {
        WidgetState widgetState = (WidgetState) this.rl.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.f35458t;
    }

    public WidgetFrame Z(ConstraintWidget constraintWidget) {
        return fD(constraintWidget.HI, null, 2).f35458t;
    }

    public int aYN(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return ((WidgetState) this.rl.get(str)).nr.Uo(fArr, iArr, iArr2);
    }

    public void az() {
        this.rl.clear();
    }

    public KeyPosition ck(String str, int i2) {
        KeyPosition keyPosition;
        while (i2 <= 100) {
            HashMap map = (HashMap) this.f35443n.get(Integer.valueOf(i2));
            if (map != null && (keyPosition = (KeyPosition) map.get(str)) != null) {
                return keyPosition;
            }
            i2++;
        }
        return null;
    }

    public boolean e() {
        return this.f35443n.size() > 0;
    }

    public WidgetState fD(String str, ConstraintWidget constraintWidget, int i2) {
        WidgetState widgetState = (WidgetState) this.rl.get(str);
        if (widgetState == null) {
            widgetState = new WidgetState();
            this.f35445t.Uo(widgetState.nr);
            widgetState.J2.U(widgetState.nr);
            this.rl.put(str, widgetState);
            if (constraintWidget != null) {
                widgetState.KN(constraintWidget, i2);
            }
        }
        return widgetState;
    }

    public WidgetFrame g(ConstraintWidget constraintWidget) {
        return fD(constraintWidget.HI, null, 0).f35457n;
    }

    public void gh() {
        float fMin;
        float fMax;
        float f3 = this.xMQ;
        if (f3 == 0.0f) {
            return;
        }
        boolean z2 = ((double) f3) < 0.0d;
        float fAbs = Math.abs(f3);
        Iterator it = this.rl.keySet().iterator();
        do {
            fMin = Float.MAX_VALUE;
            fMax = -3.4028235E38f;
            if (!it.hasNext()) {
                Iterator it2 = this.rl.keySet().iterator();
                while (it2.hasNext()) {
                    Motion motion = ((WidgetState) this.rl.get((String) it2.next())).nr;
                    float fAz = motion.az() + motion.ty();
                    fMin = Math.min(fMin, fAz);
                    fMax = Math.max(fMax, fAz);
                }
                Iterator it3 = this.rl.keySet().iterator();
                while (it3.hasNext()) {
                    Motion motion2 = ((WidgetState) this.rl.get((String) it3.next())).nr;
                    float fAz2 = motion2.az() + motion2.ty();
                    float f4 = fMax - fMin;
                    float f5 = fAbs - (((fAz2 - fMin) * fAbs) / f4);
                    if (z2) {
                        f5 = fAbs - (((fMax - fAz2) / f4) * fAbs);
                    }
                    motion2.ViF(1.0f / (1.0f - fAbs));
                    motion2.aYN(f5);
                }
                return;
            }
        } while (Float.isNaN(((WidgetState) this.rl.get((String) it.next())).nr.ck()));
        Iterator it4 = this.rl.keySet().iterator();
        while (it4.hasNext()) {
            float fCk = ((WidgetState) this.rl.get((String) it4.next())).nr.ck();
            if (!Float.isNaN(fCk)) {
                fMin = Math.min(fMin, fCk);
                fMax = Math.max(fMax, fCk);
            }
        }
        Iterator it5 = this.rl.keySet().iterator();
        while (it5.hasNext()) {
            Motion motion3 = ((WidgetState) this.rl.get((String) it5.next())).nr;
            float fCk2 = motion3.ck();
            if (!Float.isNaN(fCk2)) {
                float f6 = 1.0f / (1.0f - fAbs);
                float f7 = fMax - fMin;
                float f8 = fAbs - (((fCk2 - fMin) * fAbs) / f7);
                if (z2) {
                    f8 = fAbs - (((fMax - fCk2) / f7) * fAbs);
                }
                motion3.ViF(f6);
                motion3.aYN(f8);
            }
        }
    }

    public float iF(long j2) {
        OnSwipe onSwipe = this.mUb;
        if (onSwipe != null) {
            return onSwipe.J2(j2);
        }
        return 0.0f;
    }

    public boolean nHg(float f3) {
        return this.mUb.Uo(f3);
    }

    public float[] nY(String str) {
        WidgetState widgetState = (WidgetState) this.rl.get(str);
        float[] fArr = new float[Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE];
        widgetState.nr.KN(fArr, 62);
        return fArr;
    }

    public WidgetFrame o(String str) {
        WidgetState widgetState = (WidgetState) this.rl.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.rl;
    }

    public WidgetFrame r(ConstraintWidget constraintWidget) {
        return fD(constraintWidget.HI, null, 1).rl;
    }

    public void rV9(ConstraintWidgetContainer constraintWidgetContainer, int i2) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidgetContainer.f35503D;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z2 = dimensionBehaviour == dimensionBehaviour2;
        this.f35444r = z2;
        this.f35444r = z2 | (dimensionBehaviourArr[1] == dimensionBehaviour2);
        if (i2 == 0) {
            int iJ = constraintWidgetContainer.J();
            this.qie = iJ;
            this.ck = iJ;
            int iNY = constraintWidgetContainer.nY();
            this.az = iNY;
            this.Ik = iNY;
        } else {
            this.ty = constraintWidgetContainer.J();
            this.HI = constraintWidgetContainer.nY();
        }
        ArrayList arrayListMh = constraintWidgetContainer.Mh();
        int size = arrayListMh.size();
        WidgetState[] widgetStateArr = new WidgetState[size];
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayListMh.get(i3);
            WidgetState widgetStateFD = fD(constraintWidget.HI, null, i2);
            widgetStateArr[i3] = widgetStateFD;
            widgetStateFD.KN(constraintWidget, i2);
            String strRl = widgetStateFD.rl();
            if (strRl != null) {
                widgetStateFD.Uo(fD(strRl, null, i2));
            }
        }
        gh();
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean t(int i2, float f3) {
        if (i2 != 706) {
            return false;
        }
        this.xMQ = f3;
        return false;
    }

    public WidgetFrame te(String str) {
        WidgetState widgetState = (WidgetState) this.rl.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.f35457n;
    }

    OnSwipe ty() {
        OnSwipe onSwipe = new OnSwipe();
        this.mUb = onSwipe;
        return onSwipe;
    }

    public void v(TypedBundle typedBundle) {
        typedBundle.J2(this.f35445t);
        typedBundle.Uo(this);
    }

    public void wTp(float f3, long j2, float f4, float f5) {
        OnSwipe onSwipe = this.mUb;
        if (onSwipe != null) {
            WidgetState widgetState = (WidgetState) this.rl.get(onSwipe.f35452n);
            float[] fArr = new float[2];
            float[] fArrT = this.mUb.t();
            float[] fArrO = this.mUb.O();
            widgetState.nr.qie(f3, fArrO[0], fArrO[1], fArr);
            if (Math.abs((fArrT[0] * fArr[0]) + (fArrT[1] * fArr[1])) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[1] = 0.01f;
            }
            this.mUb.n(f3, (fArrT[0] != 0.0f ? f4 / fArr[0] : f5 / fArr[1]) * this.mUb.nr(), j2, this.KN * 0.001f);
        }
    }

    public Transition(CorePixelDp corePixelDp) {
        this.gh = corePixelDp;
    }
}
