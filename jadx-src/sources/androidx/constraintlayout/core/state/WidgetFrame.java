package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.state.Transition;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class WidgetFrame {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static float f35459S = Float.NaN;
    public float HI;
    public float Ik;
    public float J2;
    public float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f35460O;
    public float Uo;
    TypedBundle XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f35461Z;
    public float az;
    public float ck;
    public float gh;
    public float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ConstraintWidget f35462n;
    public int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final HashMap f35463o;
    public float qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35464r;
    public int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35465t;
    public float ty;
    public float xMQ;

    public WidgetFrame() {
        this.f35462n = null;
        this.rl = 0;
        this.f35465t = 0;
        this.nr = 0;
        this.f35460O = 0;
        this.J2 = Float.NaN;
        this.Uo = Float.NaN;
        this.KN = Float.NaN;
        this.xMQ = Float.NaN;
        this.mUb = Float.NaN;
        this.gh = Float.NaN;
        this.qie = Float.NaN;
        this.az = Float.NaN;
        this.ty = Float.NaN;
        this.HI = Float.NaN;
        this.ck = Float.NaN;
        this.Ik = Float.NaN;
        this.f35464r = 0;
        this.f35463o = new HashMap();
        this.f35461Z = null;
    }

    public StringBuilder ty(StringBuilder sb) {
        return HI(sb, false);
    }

    private void ck(StringBuilder sb, ConstraintAnchor.Type type) {
        ConstraintAnchor constraintAnchorIk = this.f35462n.Ik(type);
        if (constraintAnchorIk == null || constraintAnchorIk.J2 == null) {
            return;
        }
        sb.append("Anchor");
        sb.append(type.name());
        sb.append(": ['");
        String str = constraintAnchorIk.J2.KN().HI;
        if (str == null) {
            str = "#PARENT";
        }
        sb.append(str);
        sb.append("', '");
        sb.append(constraintAnchorIk.J2.gh().name());
        sb.append("', '");
        sb.append(constraintAnchorIk.Uo);
        sb.append("'],\n");
    }

    public static void qie(int i2, int i3, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, WidgetFrame widgetFrame3, Transition transition, float f3) {
        int i5;
        int i7;
        int i8;
        float f4;
        int i9;
        float f5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f6 = 100.0f * f3;
        int i15 = (int) f6;
        int i16 = widgetFrame2.rl;
        int i17 = widgetFrame2.f35465t;
        int i18 = widgetFrame3.rl;
        int i19 = widgetFrame3.f35465t;
        int i20 = widgetFrame2.nr - i16;
        int i21 = widgetFrame2.f35460O - i17;
        int i22 = widgetFrame3.nr - i18;
        int i23 = widgetFrame3.f35460O - i19;
        int i24 = i16;
        float f7 = widgetFrame2.ck;
        float f8 = widgetFrame3.ck;
        if (widgetFrame2.f35464r == 8) {
            int i25 = i24 - ((int) (i22 / 2.0f));
            i8 = i17 - ((int) (i23 / 2.0f));
            if (Float.isNaN(f7)) {
                i5 = i23;
                i24 = i25;
                i7 = i22;
                f4 = 0.0f;
            } else {
                i24 = i25;
                i7 = i22;
                f4 = f7;
                i5 = i23;
            }
        } else {
            i5 = i23;
            i23 = i21;
            i7 = i20;
            i8 = i17;
            f4 = f7;
        }
        if (widgetFrame3.f35464r == 8) {
            i18 -= (int) (i7 / 2.0f);
            i19 -= (int) (i23 / 2.0f);
            if (Float.isNaN(f8)) {
                i9 = i23;
                i22 = i7;
                f8 = 0.0f;
            } else {
                i9 = i23;
                i22 = i7;
            }
        } else {
            i9 = i5;
        }
        if (Float.isNaN(f4) && !Float.isNaN(f8)) {
            f4 = 1.0f;
        }
        if (!Float.isNaN(f4) && Float.isNaN(f8)) {
            f8 = 1.0f;
        }
        int i26 = i18;
        float f9 = widgetFrame2.f35464r == 4 ? 0.0f : f4;
        int i27 = i19;
        float f10 = widgetFrame3.f35464r == 4 ? 0.0f : f8;
        if (widgetFrame.f35462n == null || !transition.e()) {
            f5 = f3;
            i10 = i26;
            i11 = i27;
            i12 = i8;
        } else {
            Transition.KeyPosition keyPositionIk = transition.Ik(widgetFrame.f35462n.HI, i15);
            int i28 = i8;
            Transition.KeyPosition keyPositionCk = transition.ck(widgetFrame.f35462n.HI, i15);
            if (keyPositionIk == keyPositionCk) {
                keyPositionCk = null;
            }
            if (keyPositionIk != null) {
                i24 = (int) (keyPositionIk.rl * i2);
                i12 = (int) (keyPositionIk.f35447t * i3);
                i13 = keyPositionIk.f35446n;
            } else {
                i13 = 0;
                i12 = i28;
            }
            if (keyPositionCk != null) {
                i10 = (int) (keyPositionCk.rl * i2);
                i11 = (int) (keyPositionCk.f35447t * i3);
                i14 = keyPositionCk.f35446n;
            } else {
                i14 = 100;
                i10 = i26;
                i11 = i27;
            }
            f5 = (f6 - i13) / (i14 - i13);
        }
        int i29 = i24;
        widgetFrame.f35462n = widgetFrame2.f35462n;
        int i30 = (int) (i29 + ((i10 - i29) * f5));
        widgetFrame.rl = i30;
        int i31 = (int) (i12 + (f5 * (i11 - i12)));
        widgetFrame.f35465t = i31;
        float f11 = 1.0f - f3;
        widgetFrame.nr = i30 + ((int) ((i7 * f11) + (i22 * f3)));
        widgetFrame.f35460O = i31 + ((int) ((f11 * i23) + (i9 * f3)));
        widgetFrame.J2 = gh(widgetFrame2.J2, widgetFrame3.J2, 0.5f, f3);
        widgetFrame.Uo = gh(widgetFrame2.Uo, widgetFrame3.Uo, 0.5f, f3);
        widgetFrame.KN = gh(widgetFrame2.KN, widgetFrame3.KN, 0.0f, f3);
        widgetFrame.xMQ = gh(widgetFrame2.xMQ, widgetFrame3.xMQ, 0.0f, f3);
        widgetFrame.mUb = gh(widgetFrame2.mUb, widgetFrame3.mUb, 0.0f, f3);
        widgetFrame.ty = gh(widgetFrame2.ty, widgetFrame3.ty, 1.0f, f3);
        widgetFrame.HI = gh(widgetFrame2.HI, widgetFrame3.HI, 1.0f, f3);
        widgetFrame.gh = gh(widgetFrame2.gh, widgetFrame3.gh, 0.0f, f3);
        widgetFrame.qie = gh(widgetFrame2.qie, widgetFrame3.qie, 0.0f, f3);
        widgetFrame.az = gh(widgetFrame2.az, widgetFrame3.az, 0.0f, f3);
        widgetFrame.ck = gh(f9, f10, 1.0f, f3);
        Set<String> setKeySet = widgetFrame3.f35463o.keySet();
        widgetFrame.f35463o.clear();
        for (String str : setKeySet) {
            if (widgetFrame2.f35463o.containsKey(str)) {
                CustomVariable customVariable = (CustomVariable) widgetFrame2.f35463o.get(str);
                CustomVariable customVariable2 = (CustomVariable) widgetFrame3.f35463o.get(str);
                CustomVariable customVariable3 = new CustomVariable(customVariable);
                widgetFrame.f35463o.put(str, customVariable3);
                if (customVariable.az() == 1) {
                    customVariable3.r(Float.valueOf(gh(customVariable.mUb(), customVariable2.mUb(), 0.0f, f3)));
                } else {
                    int iAz = customVariable.az();
                    float[] fArr = new float[iAz];
                    float[] fArr2 = new float[iAz];
                    customVariable.gh(fArr);
                    customVariable2.gh(fArr2);
                    for (int i32 = 0; i32 < iAz; i32++) {
                        fArr[i32] = gh(fArr[i32], fArr2[i32], 0.0f, f3);
                        customVariable3.o(fArr);
                    }
                }
            }
        }
    }

    public StringBuilder HI(StringBuilder sb, boolean z2) {
        sb.append("{\n");
        rl(sb, TtmlNode.LEFT, this.rl);
        rl(sb, "top", this.f35465t);
        rl(sb, TtmlNode.RIGHT, this.nr);
        rl(sb, "bottom", this.f35460O);
        n(sb, "pivotX", this.J2);
        n(sb, "pivotY", this.Uo);
        n(sb, "rotationX", this.KN);
        n(sb, "rotationY", this.xMQ);
        n(sb, "rotationZ", this.mUb);
        n(sb, "translationX", this.gh);
        n(sb, "translationY", this.qie);
        n(sb, "translationZ", this.az);
        n(sb, "scaleX", this.ty);
        n(sb, "scaleY", this.HI);
        n(sb, "alpha", this.ck);
        rl(sb, "visibility", this.f35464r);
        n(sb, "interpolatedPos", this.Ik);
        if (this.f35462n != null) {
            for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                ck(sb, type);
            }
        }
        if (z2) {
            n(sb, "phone_orientation", f35459S);
        }
        if (z2) {
            n(sb, "phone_orientation", f35459S);
        }
        if (this.f35463o.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.f35463o.keySet()) {
                CustomVariable customVariable = (CustomVariable) this.f35463o.get(str);
                sb.append(str);
                sb.append(": ");
                switch (customVariable.xMQ()) {
                    case 900:
                        sb.append(customVariable.J2());
                        sb.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb.append(customVariable.O());
                        sb.append(",\n");
                        break;
                    case 902:
                        sb.append("'");
                        sb.append(CustomVariable.rl(customVariable.J2()));
                        sb.append("',\n");
                        break;
                    case 903:
                        sb.append("'");
                        sb.append(customVariable.KN());
                        sb.append("',\n");
                        break;
                    case 904:
                        sb.append("'");
                        sb.append(customVariable.nr());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public void Ik(String str, int i2, float f3) {
        if (this.f35463o.containsKey(str)) {
            ((CustomVariable) this.f35463o.get(str)).HI(f3);
        } else {
            this.f35463o.put(str, new CustomVariable(str, i2, f3));
        }
    }

    public float J2() {
        return this.f35465t + ((this.f35460O - r0) / 2.0f);
    }

    public Set KN() {
        return this.f35463o.keySet();
    }

    public float O() {
        return this.rl + ((this.nr - r0) / 2.0f);
    }

    public WidgetFrame S(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return this;
        }
        this.f35462n = constraintWidget;
        XQ();
        return this;
    }

    public CustomVariable Uo(String str) {
        return (CustomVariable) this.f35463o.get(str);
    }

    public void WPU(WidgetFrame widgetFrame) {
        if (widgetFrame == null) {
            return;
        }
        this.J2 = widgetFrame.J2;
        this.Uo = widgetFrame.Uo;
        this.KN = widgetFrame.KN;
        this.xMQ = widgetFrame.xMQ;
        this.mUb = widgetFrame.mUb;
        this.gh = widgetFrame.gh;
        this.qie = widgetFrame.qie;
        this.az = widgetFrame.az;
        this.ty = widgetFrame.ty;
        this.HI = widgetFrame.HI;
        this.ck = widgetFrame.ck;
        this.f35464r = widgetFrame.f35464r;
        Z(widgetFrame.XQ);
        this.f35463o.clear();
        for (CustomVariable customVariable : widgetFrame.f35463o.values()) {
            this.f35463o.put(customVariable.Uo(), customVariable.t());
        }
    }

    public WidgetFrame XQ() {
        ConstraintWidget constraintWidget = this.f35462n;
        if (constraintWidget != null) {
            this.rl = constraintWidget.X();
            this.f35465t = this.f35462n.p5();
            this.nr = this.f35462n.Xw();
            this.f35460O = this.f35462n.Z();
            WPU(this.f35462n.ty);
        }
        return this;
    }

    void Z(TypedBundle typedBundle) {
        this.XQ = typedBundle;
    }

    public int aYN() {
        return Math.max(0, this.nr - this.rl);
    }

    public boolean az() {
        return Float.isNaN(this.KN) && Float.isNaN(this.xMQ) && Float.isNaN(this.mUb) && Float.isNaN(this.gh) && Float.isNaN(this.qie) && Float.isNaN(this.az) && Float.isNaN(this.ty) && Float.isNaN(this.HI) && Float.isNaN(this.ck);
    }

    public int mUb() {
        return Math.max(0, this.f35460O - this.f35465t);
    }

    public void nr(String str, float f3) {
        Ik(str, 901, f3);
    }

    public void o(String str, int i2, boolean z2) {
        if (this.f35463o.containsKey(str)) {
            ((CustomVariable) this.f35463o.get(str)).ty(z2);
        } else {
            this.f35463o.put(str, new CustomVariable(str, i2, z2));
        }
    }

    public void r(String str, int i2, int i3) {
        if (this.f35463o.containsKey(str)) {
            ((CustomVariable) this.f35463o.get(str)).ck(i3);
        } else {
            this.f35463o.put(str, new CustomVariable(str, i2, i3));
        }
    }

    public void t(String str, int i2) {
        r(str, 902, i2);
    }

    public TypedBundle xMQ() {
        return this.XQ;
    }

    private static float gh(float f3, float f4, float f5, float f6) {
        boolean zIsNaN = Float.isNaN(f3);
        boolean zIsNaN2 = Float.isNaN(f4);
        if (zIsNaN && zIsNaN2) {
            return Float.NaN;
        }
        if (zIsNaN) {
            f3 = f5;
        }
        if (zIsNaN2) {
            f4 = f5;
        }
        return f3 + (f6 * (f4 - f3));
    }

    private static void n(StringBuilder sb, String str, float f3) {
        if (Float.isNaN(f3)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f3);
        sb.append(",\n");
    }

    private static void rl(StringBuilder sb, String str, int i2) {
        sb.append(str);
        sb.append(": ");
        sb.append(i2);
        sb.append(",\n");
    }

    public WidgetFrame(ConstraintWidget constraintWidget) {
        this.f35462n = null;
        this.rl = 0;
        this.f35465t = 0;
        this.nr = 0;
        this.f35460O = 0;
        this.J2 = Float.NaN;
        this.Uo = Float.NaN;
        this.KN = Float.NaN;
        this.xMQ = Float.NaN;
        this.mUb = Float.NaN;
        this.gh = Float.NaN;
        this.qie = Float.NaN;
        this.az = Float.NaN;
        this.ty = Float.NaN;
        this.HI = Float.NaN;
        this.ck = Float.NaN;
        this.Ik = Float.NaN;
        this.f35464r = 0;
        this.f35463o = new HashMap();
        this.f35461Z = null;
        this.f35462n = constraintWidget;
    }

    public WidgetFrame(WidgetFrame widgetFrame) {
        this.f35462n = null;
        this.rl = 0;
        this.f35465t = 0;
        this.nr = 0;
        this.f35460O = 0;
        this.J2 = Float.NaN;
        this.Uo = Float.NaN;
        this.KN = Float.NaN;
        this.xMQ = Float.NaN;
        this.mUb = Float.NaN;
        this.gh = Float.NaN;
        this.qie = Float.NaN;
        this.az = Float.NaN;
        this.ty = Float.NaN;
        this.HI = Float.NaN;
        this.ck = Float.NaN;
        this.Ik = Float.NaN;
        this.f35464r = 0;
        this.f35463o = new HashMap();
        this.f35461Z = null;
        this.f35462n = widgetFrame.f35462n;
        this.rl = widgetFrame.rl;
        this.f35465t = widgetFrame.f35465t;
        this.nr = widgetFrame.nr;
        this.f35460O = widgetFrame.f35460O;
        WPU(widgetFrame);
    }
}
