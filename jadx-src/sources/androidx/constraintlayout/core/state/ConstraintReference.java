package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class ConstraintReference implements Reference {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private float f35353I;
    Dimension Nxk;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    Dimension f35362Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f35364a;
    private ConstraintWidget dR0;
    TypedBundle ijL;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Object f35367k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f35368n;
    private HashMap piY;
    final State rl;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private HashMap f35373z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    String f35371t = null;
    Facade nr = null;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f35357O = 0;
    int J2 = 0;
    float Uo = -1.0f;
    float KN = -1.0f;
    protected float xMQ = 0.5f;
    protected float mUb = 0.5f;
    protected int gh = 0;
    protected int qie = 0;
    protected int az = 0;
    protected int ty = 0;
    protected int HI = 0;
    protected int ck = 0;
    protected int Ik = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f35370r = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f35369o = 0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    protected int f35363Z = 0;
    protected int XQ = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected int f35358S = 0;
    int WPU = 0;
    int aYN = 0;
    float ViF = Float.NaN;
    float nY = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f35366g = Float.NaN;
    float te = Float.NaN;
    float iF = Float.NaN;
    float fD = Float.NaN;
    float E2 = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f35365e = Float.NaN;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    float f35361X = Float.NaN;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    float f35359T = Float.NaN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    float f35356N = Float.NaN;
    int nHg = 0;
    protected Object s7N = null;
    protected Object wTp = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Object f35372v = null;
    protected Object rV9 = null;
    protected Object bzg = null;
    protected Object Xw = null;
    protected Object jB = null;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected Object f35360U = null;
    protected Object P5 = null;
    protected Object M7 = null;
    Object p5 = null;
    protected Object eF = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected Object f35350E = null;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    Object f35355M = null;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    Object f35351FX = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    Object f35348B = null;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    Object f35354J = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    Object f35349D = null;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    State.Constraint f35352GR = null;

    public interface ConstraintReferenceFactory {
    }

    static class IncorrectConstraintException extends Exception {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ArrayList f35375n;

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.f35375n.toString();
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return toString();
        }
    }

    public ConstraintReference Z() {
        this.s7N = null;
        this.wTp = null;
        this.gh = 0;
        this.f35372v = null;
        this.rV9 = null;
        this.qie = 0;
        this.bzg = null;
        this.Xw = null;
        this.az = 0;
        this.jB = null;
        this.f35360U = null;
        this.ty = 0;
        this.P5 = null;
        this.M7 = null;
        this.HI = 0;
        this.eF = null;
        this.f35350E = null;
        this.ck = 0;
        this.f35351FX = null;
        this.f35349D = null;
        this.xMQ = 0.5f;
        this.mUb = 0.5f;
        this.Ik = 0;
        this.f35370r = 0;
        this.f35369o = 0;
        this.f35363Z = 0;
        this.XQ = 0;
        this.f35358S = 0;
        return this;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.ConstraintReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f35374n;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            f35374n = iArr;
            try {
                iArr[State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35374n[State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35374n[State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35374n[State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35374n[State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35374n[State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35374n[State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35374n[State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35374n[State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35374n[State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35374n[State.Constraint.TOP_TO_BASELINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35374n[State.Constraint.BOTTOM_TO_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35374n[State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35374n[State.Constraint.BOTTOM_TO_BASELINE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35374n[State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35374n[State.Constraint.BASELINE_TO_TOP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35374n[State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f35374n[State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f35374n[State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f35374n[State.Constraint.CENTER_VERTICALLY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    private void aYN() {
        this.s7N = te(this.s7N);
        this.wTp = te(this.wTp);
        this.f35372v = te(this.f35372v);
        this.rV9 = te(this.rV9);
        this.bzg = te(this.bzg);
        this.Xw = te(this.Xw);
        this.jB = te(this.jB);
        this.f35360U = te(this.f35360U);
        this.P5 = te(this.P5);
        this.M7 = te(this.M7);
        this.eF = te(this.eF);
        this.f35350E = te(this.f35350E);
        this.f35351FX = te(this.f35351FX);
        this.f35348B = te(this.f35348B);
        this.f35354J = te(this.f35354J);
    }

    private ConstraintWidget fD(Object obj) {
        if (obj instanceof Reference) {
            return ((Reference) obj).n();
        }
        return null;
    }

    private Object te(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof ConstraintReference) ? this.rl.Z(obj) : obj;
    }

    public void B(int i2) {
        this.f35357O = i2;
    }

    public ConstraintReference C(int i2) {
        this.nHg = i2;
        return this;
    }

    public void D(String str) {
        this.f35371t = str;
    }

    public ConstraintReference E(float f3) {
        this.f35356N = f3;
        return this;
    }

    public Dimension E2() {
        return this.Nxk;
    }

    public ConstraintReference FX(Dimension dimension) {
        this.f35362Y = dimension;
        return this;
    }

    public void GR(Object obj) {
        this.f35367k = obj;
        ConstraintWidget constraintWidget = this.dR0;
        if (constraintWidget != null) {
            constraintWidget.UhV(obj);
        }
    }

    ConstraintReference HI(Object obj) {
        this.f35352GR = State.Constraint.BOTTOM_TO_BASELINE;
        this.f35355M = obj;
        return this;
    }

    public void I(float f3) {
        this.KN = f3;
    }

    public ConstraintReference Ik(Object obj) {
        this.f35352GR = State.Constraint.BOTTOM_TO_TOP;
        this.eF = obj;
        return this;
    }

    public void J(float f3) {
        this.Uo = f3;
    }

    public void J2(String str, float f3) {
        if (this.piY == null) {
            this.piY = new HashMap();
        }
        this.piY.put(str, Float.valueOf(f3));
    }

    public void M(Facade facade) {
        this.nr = facade;
        if (facade != null) {
            rl(facade.n());
        }
    }

    public ConstraintReference M7(float f3) {
        this.te = f3;
        return this;
    }

    public ConstraintReference N(Object obj) {
        this.f35352GR = State.Constraint.LEFT_TO_RIGHT;
        this.wTp = obj;
        return this;
    }

    public ConstraintReference Nxk(Dimension dimension) {
        this.Nxk = dimension;
        return this;
    }

    public void O(String str, int i2) {
        this.f35373z.put(str, Integer.valueOf(i2));
    }

    public ConstraintReference P5(float f3) {
        this.f35366g = f3;
        return this;
    }

    public ConstraintReference T(Object obj) {
        this.f35352GR = State.Constraint.LEFT_TO_LEFT;
        this.s7N = obj;
        return this;
    }

    public ConstraintReference U(Object obj) {
        this.f35352GR = State.Constraint.RIGHT_TO_RIGHT;
        this.rV9 = obj;
        return this;
    }

    public ConstraintReference Uo(float f3) {
        this.f35361X = f3;
        return this;
    }

    public ConstraintReference ViF() {
        if (this.jB != null) {
            this.f35352GR = State.Constraint.END_TO_START;
            return this;
        }
        this.f35352GR = State.Constraint.END_TO_END;
        return this;
    }

    public ConstraintWidget WPU() {
        return new ConstraintWidget(E2().qie(), iF().qie());
    }

    public ConstraintReference X() {
        if (this.s7N != null) {
            this.f35352GR = State.Constraint.LEFT_TO_LEFT;
            return this;
        }
        this.f35352GR = State.Constraint.LEFT_TO_RIGHT;
        return this;
    }

    public ConstraintReference Xw() {
        if (this.f35372v != null) {
            this.f35352GR = State.Constraint.RIGHT_TO_LEFT;
            return this;
        }
        this.f35352GR = State.Constraint.RIGHT_TO_RIGHT;
        return this;
    }

    public ConstraintReference Y() {
        if (this.bzg != null) {
            this.f35352GR = State.Constraint.START_TO_START;
            return this;
        }
        this.f35352GR = State.Constraint.START_TO_END;
        return this;
    }

    public void a(int i2) {
        this.J2 = i2;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void apply() {
        if (this.dR0 == null) {
            return;
        }
        Facade facade = this.nr;
        if (facade != null) {
            facade.apply();
        }
        this.Nxk.n(this.rl, this.dR0, 0);
        this.f35362Y.n(this.rl, this.dR0, 1);
        aYN();
        xMQ();
        int i2 = this.f35357O;
        if (i2 != 0) {
            this.dR0.QZ6(i2);
        }
        int i3 = this.J2;
        if (i3 != 0) {
            this.dR0.EF(i3);
        }
        float f3 = this.Uo;
        if (f3 != -1.0f) {
            this.dR0.T3L(f3);
        }
        float f4 = this.KN;
        if (f4 != -1.0f) {
            this.dR0.Zn(f4);
        }
        this.dR0.F(this.xMQ);
        this.dR0.xVH(this.mUb);
        ConstraintWidget constraintWidget = this.dR0;
        WidgetFrame widgetFrame = constraintWidget.ty;
        widgetFrame.J2 = this.ViF;
        widgetFrame.Uo = this.nY;
        widgetFrame.KN = this.f35366g;
        widgetFrame.xMQ = this.te;
        widgetFrame.mUb = this.iF;
        widgetFrame.gh = this.fD;
        widgetFrame.qie = this.E2;
        widgetFrame.az = this.f35365e;
        widgetFrame.ty = this.f35359T;
        widgetFrame.HI = this.f35356N;
        widgetFrame.ck = this.f35361X;
        int i5 = this.nHg;
        widgetFrame.f35464r = i5;
        constraintWidget.nO(i5);
        this.dR0.ty.Z(this.ijL);
        HashMap map = this.f35373z;
        if (map != null) {
            for (String str : map.keySet()) {
                this.dR0.ty.r(str, 902, ((Integer) this.f35373z.get(str)).intValue());
            }
        }
        HashMap map2 = this.piY;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                this.dR0.ty.Ik(str2, 901, ((Float) this.piY.get(str2)).floatValue());
            }
        }
    }

    public ConstraintReference az(Object obj) {
        this.f35352GR = State.Constraint.BASELINE_TO_TOP;
        this.f35348B = obj;
        return this;
    }

    public ConstraintReference bzg(float f3) {
        this.nY = f3;
        return this;
    }

    public ConstraintReference ck(Object obj) {
        this.f35352GR = State.Constraint.BOTTOM_TO_BOTTOM;
        this.f35350E = obj;
        return this;
    }

    public ConstraintReference dR0(Object obj) {
        this.f35352GR = State.Constraint.START_TO_START;
        this.bzg = obj;
        return this;
    }

    public ConstraintReference e(float f3) {
        this.xMQ = f3;
        return this;
    }

    public ConstraintReference eF(float f3) {
        this.f35359T = f3;
        return this;
    }

    public ConstraintReference eTf(float f3) {
        this.fD = f3;
        return this;
    }

    public ConstraintReference g(Object obj) {
        this.f35352GR = State.Constraint.END_TO_START;
        this.jB = obj;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.f35368n;
    }

    public ConstraintReference gh(Object obj) {
        this.f35352GR = State.Constraint.BASELINE_TO_BASELINE;
        this.f35351FX = obj;
        return this;
    }

    public Dimension iF() {
        return this.f35362Y;
    }

    public ConstraintReference ijL(Object obj) {
        this.f35352GR = State.Constraint.TOP_TO_BOTTOM;
        this.M7 = obj;
        return this;
    }

    public ConstraintReference jB(Object obj) {
        this.f35352GR = State.Constraint.RIGHT_TO_LEFT;
        this.f35372v = obj;
        return this;
    }

    public ConstraintReference k(Object obj) {
        this.f35352GR = State.Constraint.START_TO_END;
        this.Xw = obj;
        return this;
    }

    public ConstraintReference m(Object obj) {
        this.f35352GR = State.Constraint.TOP_TO_TOP;
        this.P5 = obj;
        return this;
    }

    public ConstraintReference mUb() {
        this.f35352GR = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public ConstraintWidget n() {
        if (this.dR0 == null) {
            ConstraintWidget constraintWidgetWPU = WPU();
            this.dR0 = constraintWidgetWPU;
            constraintWidgetWPU.UhV(this.f35367k);
        }
        return this.dR0;
    }

    public ConstraintReference nHg(int i2) {
        State.Constraint constraint = this.f35352GR;
        if (constraint == null) {
            this.gh = i2;
            this.qie = i2;
            this.az = i2;
            this.ty = i2;
            this.HI = i2;
            this.ck = i2;
            return this;
        }
        switch (AnonymousClass1.f35374n[constraint.ordinal()]) {
            case 1:
            case 2:
                this.gh = i2;
                break;
            case 3:
            case 4:
                this.qie = i2;
                break;
            case 5:
            case 6:
                this.az = i2;
                break;
            case 7:
            case 8:
                this.ty = i2;
                break;
            case 9:
            case 10:
            case 11:
                this.HI = i2;
                break;
            case 12:
            case 13:
            case 14:
                this.ck = i2;
                break;
            case 15:
            case 16:
            case 17:
                this.WPU = i2;
                break;
            case 18:
                this.f35353I = i2;
                break;
        }
        return this;
    }

    public ConstraintReference nY(Object obj) {
        this.f35352GR = State.Constraint.END_TO_END;
        this.f35360U = obj;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade nr() {
        return this.nr;
    }

    public ConstraintReference o() {
        State.Constraint constraint = this.f35352GR;
        if (constraint == null) {
            Z();
            return this;
        }
        switch (AnonymousClass1.f35374n[constraint.ordinal()]) {
            case 1:
            case 2:
                this.s7N = null;
                this.wTp = null;
                this.gh = 0;
                this.Ik = 0;
                break;
            case 3:
            case 4:
                this.f35372v = null;
                this.rV9 = null;
                this.qie = 0;
                this.f35370r = 0;
                break;
            case 5:
            case 6:
                this.bzg = null;
                this.Xw = null;
                this.az = 0;
                this.f35369o = 0;
                break;
            case 7:
            case 8:
                this.jB = null;
                this.f35360U = null;
                this.ty = 0;
                this.f35363Z = 0;
                break;
            case 9:
            case 10:
            case 11:
                this.P5 = null;
                this.M7 = null;
                this.p5 = null;
                this.HI = 0;
                this.XQ = 0;
                break;
            case 12:
            case 13:
            case 14:
                this.eF = null;
                this.f35350E = null;
                this.f35355M = null;
                this.ck = 0;
                this.f35358S = 0;
                break;
            case 17:
                this.f35351FX = null;
                break;
            case 18:
                this.f35349D = null;
                break;
        }
        return this;
    }

    public ConstraintReference ofS(float f3) {
        this.mUb = f3;
        return this;
    }

    public ConstraintReference p5(float f3) {
        this.iF = f3;
        return this;
    }

    public ConstraintReference pJg(float f3) {
        this.f35365e = f3;
        return this;
    }

    ConstraintReference piY(Object obj) {
        this.f35352GR = State.Constraint.TOP_TO_BASELINE;
        this.p5 = obj;
        return this;
    }

    public ConstraintReference qie(Object obj) {
        this.f35352GR = State.Constraint.BASELINE_TO_BOTTOM;
        this.f35354J = obj;
        return this;
    }

    public ConstraintReference rV9(float f3) {
        this.ViF = f3;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void rl(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.dR0 = constraintWidget;
        constraintWidget.UhV(this.f35367k);
    }

    public ConstraintReference s7N(Object obj) {
        return nHg(this.rl.O(obj));
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void t(Object obj) {
        this.f35368n = obj;
    }

    public ConstraintReference ty() {
        if (this.eF != null) {
            this.f35352GR = State.Constraint.BOTTOM_TO_TOP;
            return this;
        }
        this.f35352GR = State.Constraint.BOTTOM_TO_BOTTOM;
        return this;
    }

    public ConstraintReference v(Object obj) {
        return wTp(this.rl.O(obj));
    }

    public ConstraintReference wTp(int i2) {
        State.Constraint constraint = this.f35352GR;
        if (constraint == null) {
            this.Ik = i2;
            this.f35370r = i2;
            this.f35369o = i2;
            this.f35363Z = i2;
            this.XQ = i2;
            this.f35358S = i2;
            return this;
        }
        switch (AnonymousClass1.f35374n[constraint.ordinal()]) {
            case 1:
            case 2:
                this.Ik = i2;
                break;
            case 3:
            case 4:
                this.f35370r = i2;
                break;
            case 5:
            case 6:
                this.f35369o = i2;
                break;
            case 7:
            case 8:
                this.f35363Z = i2;
                break;
            case 9:
            case 10:
            case 11:
                this.XQ = i2;
                break;
            case 12:
            case 13:
            case 14:
                this.f35358S = i2;
                break;
            case 15:
            case 16:
            case 17:
                this.aYN = i2;
                break;
        }
        return this;
    }

    public void xMQ() {
        KN(this.dR0, this.s7N, State.Constraint.LEFT_TO_LEFT);
        KN(this.dR0, this.wTp, State.Constraint.LEFT_TO_RIGHT);
        KN(this.dR0, this.f35372v, State.Constraint.RIGHT_TO_LEFT);
        KN(this.dR0, this.rV9, State.Constraint.RIGHT_TO_RIGHT);
        KN(this.dR0, this.bzg, State.Constraint.START_TO_START);
        KN(this.dR0, this.Xw, State.Constraint.START_TO_END);
        KN(this.dR0, this.jB, State.Constraint.END_TO_START);
        KN(this.dR0, this.f35360U, State.Constraint.END_TO_END);
        KN(this.dR0, this.P5, State.Constraint.TOP_TO_TOP);
        KN(this.dR0, this.M7, State.Constraint.TOP_TO_BOTTOM);
        KN(this.dR0, this.p5, State.Constraint.TOP_TO_BASELINE);
        KN(this.dR0, this.eF, State.Constraint.BOTTOM_TO_TOP);
        KN(this.dR0, this.f35350E, State.Constraint.BOTTOM_TO_BOTTOM);
        KN(this.dR0, this.f35355M, State.Constraint.BOTTOM_TO_BASELINE);
        KN(this.dR0, this.f35351FX, State.Constraint.BASELINE_TO_BASELINE);
        KN(this.dR0, this.f35348B, State.Constraint.BASELINE_TO_TOP);
        KN(this.dR0, this.f35354J, State.Constraint.BASELINE_TO_BOTTOM);
        KN(this.dR0, this.f35349D, State.Constraint.CIRCULAR_CONSTRAINT);
    }

    public ConstraintReference xg(float f3) {
        this.E2 = f3;
        return this;
    }

    public ConstraintReference z() {
        if (this.P5 != null) {
            this.f35352GR = State.Constraint.TOP_TO_TOP;
            return this;
        }
        this.f35352GR = State.Constraint.TOP_TO_BOTTOM;
        return this;
    }

    public ConstraintReference(State state) {
        Object obj = Dimension.mUb;
        this.Nxk = Dimension.t(obj);
        this.f35362Y = Dimension.t(obj);
        this.f35373z = new HashMap();
        this.piY = new HashMap();
        this.ijL = null;
        this.rl = state;
    }

    private void KN(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget constraintWidgetFD = fD(obj);
        if (constraintWidgetFD != null) {
            int[] iArr = AnonymousClass1.f35374n;
            int i2 = iArr[constraint.ordinal()];
            switch (iArr[constraint.ordinal()]) {
                case 1:
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                    constraintWidget.Ik(type).rl(constraintWidgetFD.Ik(type), this.gh, this.Ik, false);
                    break;
                case 2:
                    constraintWidget.Ik(ConstraintAnchor.Type.LEFT).rl(constraintWidgetFD.Ik(ConstraintAnchor.Type.RIGHT), this.gh, this.Ik, false);
                    break;
                case 3:
                    constraintWidget.Ik(ConstraintAnchor.Type.RIGHT).rl(constraintWidgetFD.Ik(ConstraintAnchor.Type.LEFT), this.qie, this.f35370r, false);
                    break;
                case 4:
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                    constraintWidget.Ik(type2).rl(constraintWidgetFD.Ik(type2), this.qie, this.f35370r, false);
                    break;
                case 5:
                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                    constraintWidget.Ik(type3).rl(constraintWidgetFD.Ik(type3), this.az, this.f35369o, false);
                    break;
                case 6:
                    constraintWidget.Ik(ConstraintAnchor.Type.LEFT).rl(constraintWidgetFD.Ik(ConstraintAnchor.Type.RIGHT), this.az, this.f35369o, false);
                    break;
                case 7:
                    constraintWidget.Ik(ConstraintAnchor.Type.RIGHT).rl(constraintWidgetFD.Ik(ConstraintAnchor.Type.LEFT), this.ty, this.f35363Z, false);
                    break;
                case 8:
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                    constraintWidget.Ik(type4).rl(constraintWidgetFD.Ik(type4), this.ty, this.f35363Z, false);
                    break;
                case 9:
                    ConstraintAnchor.Type type5 = ConstraintAnchor.Type.TOP;
                    constraintWidget.Ik(type5).rl(constraintWidgetFD.Ik(type5), this.HI, this.XQ, false);
                    break;
                case 10:
                    constraintWidget.Ik(ConstraintAnchor.Type.TOP).rl(constraintWidgetFD.Ik(ConstraintAnchor.Type.BOTTOM), this.HI, this.XQ, false);
                    break;
                case 11:
                    constraintWidget.dR0(ConstraintAnchor.Type.TOP, constraintWidgetFD, ConstraintAnchor.Type.BASELINE, this.HI, this.XQ);
                    break;
                case 12:
                    constraintWidget.Ik(ConstraintAnchor.Type.BOTTOM).rl(constraintWidgetFD.Ik(ConstraintAnchor.Type.TOP), this.ck, this.f35358S, false);
                    break;
                case 13:
                    ConstraintAnchor.Type type6 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.Ik(type6).rl(constraintWidgetFD.Ik(type6), this.ck, this.f35358S, false);
                    break;
                case 14:
                    constraintWidget.dR0(ConstraintAnchor.Type.BOTTOM, constraintWidgetFD, ConstraintAnchor.Type.BASELINE, this.ck, this.f35358S);
                    break;
                case 15:
                    constraintWidget.dR0(ConstraintAnchor.Type.BASELINE, constraintWidgetFD, ConstraintAnchor.Type.BOTTOM, this.WPU, this.aYN);
                    break;
                case 16:
                    constraintWidget.dR0(ConstraintAnchor.Type.BASELINE, constraintWidgetFD, ConstraintAnchor.Type.TOP, this.WPU, this.aYN);
                    break;
                case 17:
                    ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BASELINE;
                    constraintWidget.dR0(type7, constraintWidgetFD, type7, this.WPU, this.aYN);
                    break;
                case 18:
                    constraintWidget.az(constraintWidgetFD, this.f35364a, (int) this.f35353I);
                    break;
            }
        }
    }

    public ConstraintReference S() {
        z().o();
        mUb().o();
        ty().o();
        return this;
    }

    public ConstraintReference XQ() {
        Y().o();
        ViF().o();
        X().o();
        Xw().o();
        return this;
    }

    public ConstraintReference r(Object obj, float f3, float f4) {
        this.f35349D = te(obj);
        this.f35364a = f3;
        this.f35353I = f4;
        this.f35352GR = State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }
}
