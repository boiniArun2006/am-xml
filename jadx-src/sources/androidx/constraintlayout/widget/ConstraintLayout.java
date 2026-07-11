package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static SharedValues f35901D;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f35902B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Metrics f35903E;
    private int E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private int f35904FX;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private ArrayList f35905J;
    private int J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    Measurer f35906M;
    int M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f35907N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected ConstraintWidgetContainer f35908O;
    int P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f35909S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected ConstraintLayoutStates f35910T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f35911U;
    private int Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConstraintSet f35912e;
    private SparseArray eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f35913g;
    private int jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    SparseArray f35914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35915o;
    int p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f35916r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList f35917t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private HashMap f35918v;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f35920B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        float f35921C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public boolean f35922D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f35923E;
        boolean E2;

        /* JADX INFO: renamed from: FX, reason: collision with root package name */
        public int f35924FX;

        /* JADX INFO: renamed from: G7, reason: collision with root package name */
        int f35925G7;

        /* JADX INFO: renamed from: GR, reason: collision with root package name */
        boolean f35926GR;
        public int HI;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f35927I;
        public int Ik;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public boolean f35928J;
        public int J2;
        public int KN;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f35929M;
        public int M7;
        int Mx;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public String f35930N;
        boolean Nxk;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f35931O;
        public int P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f35932S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public float f35933T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f35934U;
        public int Uo;
        public int ViF;
        public int WPU;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public float f35935X;
        public int XQ;
        public int Xw;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        boolean f35936Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public int f35937Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f35938a;
        public int aYN;
        public int az;
        public int bzg;
        public int ck;
        boolean dR0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f35939e;
        public float eF;
        int eTf;
        ConstraintWidget eWT;
        public int fD;
        float fcU;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f35940g;
        public int gh;
        public int iF;
        int ijL;
        public int jB;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f35941k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f35942m;
        public int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f35943n;
        float nHg;
        public int nY;
        public boolean nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f35944o;
        int ofS;
        public int p5;
        int pJg;
        boolean piY;
        public int qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f35945r;
        public int rV9;
        public int rl;
        int s7N;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f35946t;
        public int te;
        public int ty;
        public boolean ul;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f35947v;
        public float wTp;
        public int xMQ;
        int xg;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f35948z;

        private static class Table {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final SparseIntArray f35949n;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f35949n = sparseIntArray;
                sparseIntArray.append(R.styleable.wYi, 64);
                sparseIntArray.append(R.styleable.Co, 65);
                sparseIntArray.append(R.styleable.Lu, 8);
                sparseIntArray.append(R.styleable.HE, 9);
                sparseIntArray.append(R.styleable.c32, 10);
                sparseIntArray.append(R.styleable.l2, 11);
                sparseIntArray.append(R.styleable.eb, 12);
                sparseIntArray.append(R.styleable.HFS, 13);
                sparseIntArray.append(R.styleable.f36070h, 14);
                sparseIntArray.append(R.styleable.yAc, 15);
                sparseIntArray.append(R.styleable.SR, 16);
                sparseIntArray.append(R.styleable.pS, 52);
                sparseIntArray.append(R.styleable.EN, 53);
                sparseIntArray.append(R.styleable.f36076l, 2);
                sparseIntArray.append(R.styleable.uQ, 3);
                sparseIntArray.append(R.styleable.f36066eo, 4);
                sparseIntArray.append(R.styleable.gxH, 49);
                sparseIntArray.append(R.styleable.YiW, 50);
                sparseIntArray.append(R.styleable.iV, 5);
                sparseIntArray.append(R.styleable.I4p, 6);
                sparseIntArray.append(R.styleable.bZm, 7);
                sparseIntArray.append(R.styleable.waP, 67);
                sparseIntArray.append(R.styleable.VwL, 1);
                sparseIntArray.append(R.styleable.Om, 17);
                sparseIntArray.append(R.styleable.t1J, 18);
                sparseIntArray.append(R.styleable.lS, 19);
                sparseIntArray.append(R.styleable.mx, 20);
                sparseIntArray.append(R.styleable.f36090x, 21);
                sparseIntArray.append(R.styleable.MPw, 22);
                sparseIntArray.append(R.styleable.XUb, 23);
                sparseIntArray.append(R.styleable.Sax, 24);
                sparseIntArray.append(R.styleable.rR, 25);
                sparseIntArray.append(R.styleable.kQ, 26);
                sparseIntArray.append(R.styleable.f36060c, 55);
                sparseIntArray.append(R.styleable.V5F, 54);
                sparseIntArray.append(R.styleable.qva, 29);
                sparseIntArray.append(R.styleable.Xli, 30);
                sparseIntArray.append(R.styleable.wKY, 44);
                sparseIntArray.append(R.styleable.rT, 45);
                sparseIntArray.append(R.styleable.C7B, 46);
                sparseIntArray.append(R.styleable.f36063d, 47);
                sparseIntArray.append(R.styleable.fq, 48);
                sparseIntArray.append(R.styleable.Fp, 27);
                sparseIntArray.append(R.styleable.rxp, 28);
                sparseIntArray.append(R.styleable.TVk, 31);
                sparseIntArray.append(R.styleable.q9, 32);
                sparseIntArray.append(R.styleable.n7u, 33);
                sparseIntArray.append(R.styleable.lRt, 34);
                sparseIntArray.append(R.styleable.yA, 35);
                sparseIntArray.append(R.styleable.WH, 36);
                sparseIntArray.append(R.styleable.f36015A, 37);
                sparseIntArray.append(R.styleable.oz, 38);
                sparseIntArray.append(R.styleable.f36033L, 39);
                sparseIntArray.append(R.styleable.f36089w, 40);
                sparseIntArray.append(R.styleable.fW, 41);
                sparseIntArray.append(R.styleable.tEO, 42);
                sparseIntArray.append(R.styleable.Ro, 43);
                sparseIntArray.append(R.styleable.GH3, 51);
                sparseIntArray.append(R.styleable.JI, 66);
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f35943n = -1;
            this.rl = -1;
            this.f35946t = -1.0f;
            this.nr = true;
            this.f35931O = -1;
            this.J2 = -1;
            this.Uo = -1;
            this.KN = -1;
            this.xMQ = -1;
            this.mUb = -1;
            this.gh = -1;
            this.qie = -1;
            this.az = -1;
            this.ty = -1;
            this.HI = -1;
            this.ck = -1;
            this.Ik = 0;
            this.f35945r = 0.0f;
            this.f35944o = -1;
            this.f35937Z = -1;
            this.XQ = -1;
            this.f35932S = -1;
            this.WPU = Integer.MIN_VALUE;
            this.aYN = Integer.MIN_VALUE;
            this.ViF = Integer.MIN_VALUE;
            this.nY = Integer.MIN_VALUE;
            this.f35940g = Integer.MIN_VALUE;
            this.te = Integer.MIN_VALUE;
            this.iF = Integer.MIN_VALUE;
            this.fD = 0;
            this.E2 = true;
            this.f35939e = true;
            this.f35935X = 0.5f;
            this.f35933T = 0.5f;
            this.f35930N = null;
            this.nHg = 0.0f;
            this.s7N = 1;
            this.wTp = -1.0f;
            this.f35947v = -1.0f;
            this.rV9 = 0;
            this.bzg = 0;
            this.Xw = 0;
            this.jB = 0;
            this.f35934U = 0;
            this.P5 = 0;
            this.M7 = 0;
            this.p5 = 0;
            this.eF = 1.0f;
            this.f35923E = 1.0f;
            this.f35929M = -1;
            this.f35924FX = -1;
            this.f35920B = -1;
            this.f35928J = false;
            this.f35922D = false;
            this.f35938a = null;
            this.f35927I = 0;
            this.f35926GR = true;
            this.Nxk = true;
            this.f35936Y = false;
            this.f35941k = false;
            this.dR0 = false;
            this.f35948z = false;
            this.piY = false;
            this.ijL = -1;
            this.f35942m = -1;
            this.eTf = -1;
            this.xg = -1;
            this.pJg = Integer.MIN_VALUE;
            this.ofS = Integer.MIN_VALUE;
            this.f35921C = 0.5f;
            this.eWT = new ConstraintWidget();
            this.ul = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                this.f35943n = layoutParams2.f35943n;
                this.rl = layoutParams2.rl;
                this.f35946t = layoutParams2.f35946t;
                this.nr = layoutParams2.nr;
                this.f35931O = layoutParams2.f35931O;
                this.J2 = layoutParams2.J2;
                this.Uo = layoutParams2.Uo;
                this.KN = layoutParams2.KN;
                this.xMQ = layoutParams2.xMQ;
                this.mUb = layoutParams2.mUb;
                this.gh = layoutParams2.gh;
                this.qie = layoutParams2.qie;
                this.az = layoutParams2.az;
                this.ty = layoutParams2.ty;
                this.HI = layoutParams2.HI;
                this.ck = layoutParams2.ck;
                this.Ik = layoutParams2.Ik;
                this.f35945r = layoutParams2.f35945r;
                this.f35944o = layoutParams2.f35944o;
                this.f35937Z = layoutParams2.f35937Z;
                this.XQ = layoutParams2.XQ;
                this.f35932S = layoutParams2.f35932S;
                this.WPU = layoutParams2.WPU;
                this.aYN = layoutParams2.aYN;
                this.ViF = layoutParams2.ViF;
                this.nY = layoutParams2.nY;
                this.f35940g = layoutParams2.f35940g;
                this.te = layoutParams2.te;
                this.iF = layoutParams2.iF;
                this.fD = layoutParams2.fD;
                this.f35935X = layoutParams2.f35935X;
                this.f35933T = layoutParams2.f35933T;
                this.f35930N = layoutParams2.f35930N;
                this.nHg = layoutParams2.nHg;
                this.s7N = layoutParams2.s7N;
                this.wTp = layoutParams2.wTp;
                this.f35947v = layoutParams2.f35947v;
                this.rV9 = layoutParams2.rV9;
                this.bzg = layoutParams2.bzg;
                this.f35928J = layoutParams2.f35928J;
                this.f35922D = layoutParams2.f35922D;
                this.Xw = layoutParams2.Xw;
                this.jB = layoutParams2.jB;
                this.f35934U = layoutParams2.f35934U;
                this.M7 = layoutParams2.M7;
                this.P5 = layoutParams2.P5;
                this.p5 = layoutParams2.p5;
                this.eF = layoutParams2.eF;
                this.f35923E = layoutParams2.f35923E;
                this.f35929M = layoutParams2.f35929M;
                this.f35924FX = layoutParams2.f35924FX;
                this.f35920B = layoutParams2.f35920B;
                this.f35926GR = layoutParams2.f35926GR;
                this.Nxk = layoutParams2.Nxk;
                this.f35936Y = layoutParams2.f35936Y;
                this.f35941k = layoutParams2.f35941k;
                this.ijL = layoutParams2.ijL;
                this.f35942m = layoutParams2.f35942m;
                this.eTf = layoutParams2.eTf;
                this.xg = layoutParams2.xg;
                this.pJg = layoutParams2.pJg;
                this.ofS = layoutParams2.ofS;
                this.f35921C = layoutParams2.f35921C;
                this.f35938a = layoutParams2.f35938a;
                this.f35927I = layoutParams2.f35927I;
                this.eWT = layoutParams2.eWT;
                this.E2 = layoutParams2.E2;
                this.f35939e = layoutParams2.f35939e;
            }
        }

        public void t() {
            this.f35941k = false;
            this.f35926GR = true;
            this.Nxk = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.f35928J) {
                this.f35926GR = false;
                if (this.Xw == 0) {
                    this.Xw = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.f35922D) {
                this.Nxk = false;
                if (this.jB == 0) {
                    this.jB = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f35926GR = false;
                if (i2 == 0 && this.Xw == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f35928J = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.Nxk = false;
                if (i3 == 0 && this.jB == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f35922D = true;
                }
            }
            if (this.f35946t == -1.0f && this.f35943n == -1 && this.rl == -1) {
                return;
            }
            this.f35941k = true;
            this.f35926GR = true;
            this.Nxk = true;
            if (!(this.eWT instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                this.eWT = new androidx.constraintlayout.core.widgets.Guideline();
            }
            ((androidx.constraintlayout.core.widgets.Guideline) this.eWT).I9f(this.f35920B);
        }

        public String n() {
            return this.f35938a;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i2) {
            int i3;
            int i5;
            int i7;
            int i8;
            int i9 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i10 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i2);
            boolean z2 = false;
            boolean z3 = 1 == getLayoutDirection();
            this.eTf = -1;
            this.xg = -1;
            this.ijL = -1;
            this.f35942m = -1;
            this.pJg = this.WPU;
            this.ofS = this.ViF;
            float f3 = this.f35935X;
            this.f35921C = f3;
            int i11 = this.f35943n;
            this.Mx = i11;
            int i12 = this.rl;
            this.f35925G7 = i12;
            float f4 = this.f35946t;
            this.fcU = f4;
            if (z3) {
                int i13 = this.f35944o;
                if (i13 != -1) {
                    this.eTf = i13;
                } else {
                    int i14 = this.f35937Z;
                    if (i14 != -1) {
                        this.xg = i14;
                    }
                    i3 = this.XQ;
                    if (i3 != -1) {
                        this.f35942m = i3;
                        z2 = true;
                    }
                    i5 = this.f35932S;
                    if (i5 != -1) {
                        this.ijL = i5;
                        z2 = true;
                    }
                    i7 = this.f35940g;
                    if (i7 != Integer.MIN_VALUE) {
                        this.ofS = i7;
                    }
                    i8 = this.te;
                    if (i8 != Integer.MIN_VALUE) {
                        this.pJg = i8;
                    }
                    if (z2) {
                        this.f35921C = 1.0f - f3;
                    }
                    if (this.f35941k && this.f35920B == 1 && this.nr) {
                        if (f4 == -1.0f) {
                            this.fcU = 1.0f - f4;
                            this.Mx = -1;
                            this.f35925G7 = -1;
                        } else if (i11 != -1) {
                            this.f35925G7 = i11;
                            this.Mx = -1;
                            this.fcU = -1.0f;
                        } else if (i12 != -1) {
                            this.Mx = i12;
                            this.f35925G7 = -1;
                            this.fcU = -1.0f;
                        }
                    }
                }
                z2 = true;
                i3 = this.XQ;
                if (i3 != -1) {
                }
                i5 = this.f35932S;
                if (i5 != -1) {
                }
                i7 = this.f35940g;
                if (i7 != Integer.MIN_VALUE) {
                }
                i8 = this.te;
                if (i8 != Integer.MIN_VALUE) {
                }
                if (z2) {
                }
                if (this.f35941k) {
                    if (f4 == -1.0f) {
                    }
                }
            } else {
                int i15 = this.f35944o;
                if (i15 != -1) {
                    this.f35942m = i15;
                }
                int i16 = this.f35937Z;
                if (i16 != -1) {
                    this.ijL = i16;
                }
                int i17 = this.XQ;
                if (i17 != -1) {
                    this.eTf = i17;
                }
                int i18 = this.f35932S;
                if (i18 != -1) {
                    this.xg = i18;
                }
                int i19 = this.f35940g;
                if (i19 != Integer.MIN_VALUE) {
                    this.pJg = i19;
                }
                int i20 = this.te;
                if (i20 != Integer.MIN_VALUE) {
                    this.ofS = i20;
                }
            }
            if (this.XQ == -1 && this.f35932S == -1 && this.f35937Z == -1 && this.f35944o == -1) {
                int i21 = this.Uo;
                if (i21 != -1) {
                    this.eTf = i21;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i10 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i10;
                    }
                } else {
                    int i22 = this.KN;
                    if (i22 != -1) {
                        this.xg = i22;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i10 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i10;
                        }
                    }
                }
                int i23 = this.f35931O;
                if (i23 != -1) {
                    this.ijL = i23;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i9 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i9;
                    return;
                }
                int i24 = this.J2;
                if (i24 != -1) {
                    this.f35942m = i24;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i9 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i9;
                }
            }
        }

        public ConstraintWidget rl() {
            return this.eWT;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f35943n = -1;
            this.rl = -1;
            this.f35946t = -1.0f;
            this.nr = true;
            this.f35931O = -1;
            this.J2 = -1;
            this.Uo = -1;
            this.KN = -1;
            this.xMQ = -1;
            this.mUb = -1;
            this.gh = -1;
            this.qie = -1;
            this.az = -1;
            this.ty = -1;
            this.HI = -1;
            this.ck = -1;
            this.Ik = 0;
            this.f35945r = 0.0f;
            this.f35944o = -1;
            this.f35937Z = -1;
            this.XQ = -1;
            this.f35932S = -1;
            this.WPU = Integer.MIN_VALUE;
            this.aYN = Integer.MIN_VALUE;
            this.ViF = Integer.MIN_VALUE;
            this.nY = Integer.MIN_VALUE;
            this.f35940g = Integer.MIN_VALUE;
            this.te = Integer.MIN_VALUE;
            this.iF = Integer.MIN_VALUE;
            this.fD = 0;
            this.E2 = true;
            this.f35939e = true;
            this.f35935X = 0.5f;
            this.f35933T = 0.5f;
            this.f35930N = null;
            this.nHg = 0.0f;
            this.s7N = 1;
            this.wTp = -1.0f;
            this.f35947v = -1.0f;
            this.rV9 = 0;
            this.bzg = 0;
            this.Xw = 0;
            this.jB = 0;
            this.f35934U = 0;
            this.P5 = 0;
            this.M7 = 0;
            this.p5 = 0;
            this.eF = 1.0f;
            this.f35923E = 1.0f;
            this.f35929M = -1;
            this.f35924FX = -1;
            this.f35920B = -1;
            this.f35928J = false;
            this.f35922D = false;
            this.f35938a = null;
            this.f35927I = 0;
            this.f35926GR = true;
            this.Nxk = true;
            this.f35936Y = false;
            this.f35941k = false;
            this.dR0 = false;
            this.f35948z = false;
            this.piY = false;
            this.ijL = -1;
            this.f35942m = -1;
            this.eTf = -1;
            this.xg = -1;
            this.pJg = Integer.MIN_VALUE;
            this.ofS = Integer.MIN_VALUE;
            this.f35921C = 0.5f;
            this.eWT = new ConstraintWidget();
            this.ul = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.tFV);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = Table.f35949n.get(index);
                switch (i3) {
                    case 1:
                        this.f35920B = typedArrayObtainStyledAttributes.getInt(index, this.f35920B);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.ck);
                        this.ck = resourceId;
                        if (resourceId == -1) {
                            this.ck = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.Ik = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Ik);
                        break;
                    case 4:
                        float f3 = typedArrayObtainStyledAttributes.getFloat(index, this.f35945r) % 360.0f;
                        this.f35945r = f3;
                        if (f3 < 0.0f) {
                            this.f35945r = (360.0f - f3) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f35943n = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f35943n);
                        break;
                    case 6:
                        this.rl = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.rl);
                        break;
                    case 7:
                        this.f35946t = typedArrayObtainStyledAttributes.getFloat(index, this.f35946t);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35931O);
                        this.f35931O = resourceId2;
                        if (resourceId2 == -1) {
                            this.f35931O = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.J2);
                        this.J2 = resourceId3;
                        if (resourceId3 == -1) {
                            this.J2 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.Uo);
                        this.Uo = resourceId4;
                        if (resourceId4 == -1) {
                            this.Uo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.KN);
                        this.KN = resourceId5;
                        if (resourceId5 == -1) {
                            this.KN = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.xMQ);
                        this.xMQ = resourceId6;
                        if (resourceId6 == -1) {
                            this.xMQ = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.mUb);
                        this.mUb = resourceId7;
                        if (resourceId7 == -1) {
                            this.mUb = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.gh);
                        this.gh = resourceId8;
                        if (resourceId8 == -1) {
                            this.gh = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.qie);
                        this.qie = resourceId9;
                        if (resourceId9 == -1) {
                            this.qie = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.az);
                        this.az = resourceId10;
                        if (resourceId10 == -1) {
                            this.az = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35944o);
                        this.f35944o = resourceId11;
                        if (resourceId11 == -1) {
                            this.f35944o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35937Z);
                        this.f35937Z = resourceId12;
                        if (resourceId12 == -1) {
                            this.f35937Z = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.XQ);
                        this.XQ = resourceId13;
                        if (resourceId13 == -1) {
                            this.XQ = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35932S);
                        this.f35932S = resourceId14;
                        if (resourceId14 == -1) {
                            this.f35932S = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.WPU = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.WPU);
                        break;
                    case 22:
                        this.aYN = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.aYN);
                        break;
                    case 23:
                        this.ViF = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.ViF);
                        break;
                    case 24:
                        this.nY = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.nY);
                        break;
                    case 25:
                        this.f35940g = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35940g);
                        break;
                    case 26:
                        this.te = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.te);
                        break;
                    case 27:
                        this.f35928J = typedArrayObtainStyledAttributes.getBoolean(index, this.f35928J);
                        break;
                    case 28:
                        this.f35922D = typedArrayObtainStyledAttributes.getBoolean(index, this.f35922D);
                        break;
                    case 29:
                        this.f35935X = typedArrayObtainStyledAttributes.getFloat(index, this.f35935X);
                        break;
                    case 30:
                        this.f35933T = typedArrayObtainStyledAttributes.getFloat(index, this.f35933T);
                        break;
                    case 31:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.Xw = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i7 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.jB = i7;
                        if (i7 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f35934U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35934U);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f35934U) == -2) {
                                this.f35934U = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.M7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M7);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.M7) == -2) {
                                this.M7 = -2;
                            }
                        }
                        break;
                    case 35:
                        this.eF = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.eF));
                        this.Xw = 2;
                        break;
                    case 36:
                        try {
                            this.P5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P5);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.P5) == -2) {
                                this.P5 = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.p5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.p5);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.p5) == -2) {
                                this.p5 = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f35923E = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f35923E));
                        this.jB = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                ConstraintSet.e(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.wTp = typedArrayObtainStyledAttributes.getFloat(index, this.wTp);
                                break;
                            case 46:
                                this.f35947v = typedArrayObtainStyledAttributes.getFloat(index, this.f35947v);
                                break;
                            case 47:
                                this.rV9 = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.bzg = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f35929M = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f35929M);
                                break;
                            case 50:
                                this.f35924FX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f35924FX);
                                break;
                            case 51:
                                this.f35938a = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.ty);
                                this.ty = resourceId15;
                                if (resourceId15 == -1) {
                                    this.ty = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.HI);
                                this.HI = resourceId16;
                                if (resourceId16 == -1) {
                                    this.HI = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.fD = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.fD);
                                break;
                            case 55:
                                this.iF = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.iF);
                                break;
                            default:
                                switch (i3) {
                                    case 64:
                                        ConstraintSet.fD(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E2 = true;
                                        break;
                                    case 65:
                                        ConstraintSet.fD(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.f35939e = true;
                                        break;
                                    case 66:
                                        this.f35927I = typedArrayObtainStyledAttributes.getInt(index, this.f35927I);
                                        break;
                                    case 67:
                                        this.nr = typedArrayObtainStyledAttributes.getBoolean(index, this.nr);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            t();
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f35943n = -1;
            this.rl = -1;
            this.f35946t = -1.0f;
            this.nr = true;
            this.f35931O = -1;
            this.J2 = -1;
            this.Uo = -1;
            this.KN = -1;
            this.xMQ = -1;
            this.mUb = -1;
            this.gh = -1;
            this.qie = -1;
            this.az = -1;
            this.ty = -1;
            this.HI = -1;
            this.ck = -1;
            this.Ik = 0;
            this.f35945r = 0.0f;
            this.f35944o = -1;
            this.f35937Z = -1;
            this.XQ = -1;
            this.f35932S = -1;
            this.WPU = Integer.MIN_VALUE;
            this.aYN = Integer.MIN_VALUE;
            this.ViF = Integer.MIN_VALUE;
            this.nY = Integer.MIN_VALUE;
            this.f35940g = Integer.MIN_VALUE;
            this.te = Integer.MIN_VALUE;
            this.iF = Integer.MIN_VALUE;
            this.fD = 0;
            this.E2 = true;
            this.f35939e = true;
            this.f35935X = 0.5f;
            this.f35933T = 0.5f;
            this.f35930N = null;
            this.nHg = 0.0f;
            this.s7N = 1;
            this.wTp = -1.0f;
            this.f35947v = -1.0f;
            this.rV9 = 0;
            this.bzg = 0;
            this.Xw = 0;
            this.jB = 0;
            this.f35934U = 0;
            this.P5 = 0;
            this.M7 = 0;
            this.p5 = 0;
            this.eF = 1.0f;
            this.f35923E = 1.0f;
            this.f35929M = -1;
            this.f35924FX = -1;
            this.f35920B = -1;
            this.f35928J = false;
            this.f35922D = false;
            this.f35938a = null;
            this.f35927I = 0;
            this.f35926GR = true;
            this.Nxk = true;
            this.f35936Y = false;
            this.f35941k = false;
            this.dR0 = false;
            this.f35948z = false;
            this.piY = false;
            this.ijL = -1;
            this.f35942m = -1;
            this.eTf = -1;
            this.xg = -1;
            this.pJg = Integer.MIN_VALUE;
            this.ofS = Integer.MIN_VALUE;
            this.f35921C = 0.5f;
            this.eWT = new ConstraintWidget();
            this.ul = false;
        }
    }

    class Measurer implements BasicMeasure.Measurer {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f35950O;
        int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ConstraintLayout f35951n;
        int nr;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f35952t;

        private boolean nr(int i2, int i3, int i5) {
            if (i2 == i3) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i5 == size;
            }
            return false;
        }

        Measurer(ConstraintLayout constraintLayout) {
            this.f35951n = constraintLayout;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        public final void n() {
            int childCount = this.f35951n.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f35951n.getChildAt(i2);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).n(this.f35951n);
                }
            }
            int size = this.f35951n.f35917t.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    ((ConstraintHelper) this.f35951n.f35917t.get(i3)).o(this.f35951n);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01ec  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0148  */
        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void rl(ConstraintWidget constraintWidget, BasicMeasure.Measure measure) {
            long jNanoTime;
            int iMakeMeasureSpec;
            int childMeasureSpec;
            int i2;
            int iMakeMeasureSpec2;
            ConstraintWidgetContainer constraintWidgetContainer;
            int baseline;
            int iMax;
            int iMax2;
            long j2;
            int i3;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.B() == 8 && !constraintWidget.eTf()) {
                measure.f35554O = 0;
                measure.J2 = 0;
                measure.Uo = 0;
                return;
            }
            if (constraintWidget.rV9() == null) {
                return;
            }
            if (ConstraintLayout.this.f35903E != null) {
                ConstraintLayout.this.f35903E.rV9++;
                jNanoTime = System.nanoTime();
            } else {
                jNanoTime = 0;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.f35555n;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.rl;
            int i5 = measure.f35556t;
            int i7 = measure.nr;
            int i8 = this.rl + this.f35952t;
            int i9 = this.nr;
            View view = (View) constraintWidget.XQ();
            int[] iArr = AnonymousClass1.f35919n;
            int i10 = iArr[dimensionBehaviour.ordinal()];
            if (i10 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i10 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.J2, i9, -2);
            } else {
                if (i10 != 3) {
                    if (i10 != 4) {
                        childMeasureSpec = 0;
                    } else {
                        childMeasureSpec = ViewGroup.getChildMeasureSpec(this.J2, i9, -2);
                        boolean z2 = constraintWidget.WPU == 1;
                        int i11 = measure.mUb;
                        if (i11 == BasicMeasure.Measure.qie || i11 == BasicMeasure.Measure.az) {
                            boolean z3 = view.getMeasuredHeight() == constraintWidget.nY();
                            if (measure.mUb == BasicMeasure.Measure.az || !z2 || ((z2 && z3) || (view instanceof Placeholder) || constraintWidget.C())) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.J(), 1073741824);
                            }
                        }
                    }
                    i2 = iArr[dimensionBehaviour2.ordinal()];
                    if (i2 != 1) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    } else if (i2 == 2) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.Uo, i8, -2);
                    } else if (i2 == 3) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.Uo, i8 + constraintWidget.FX(), -1);
                    } else if (i2 != 4) {
                        iMakeMeasureSpec2 = 0;
                    } else {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.Uo, i8, -2);
                        boolean z4 = constraintWidget.aYN == 1;
                        int i12 = measure.mUb;
                        if (i12 == BasicMeasure.Measure.qie || i12 == BasicMeasure.Measure.az) {
                            boolean z5 = view.getMeasuredWidth() == constraintWidget.J();
                            if (measure.mUb == BasicMeasure.Measure.az || !z4 || ((z4 && z5) || (view instanceof Placeholder) || constraintWidget.Mx())) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.nY(), 1073741824);
                            }
                        }
                    }
                    constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.rV9();
                    if (constraintWidgetContainer == null && Optimizer.rl(ConstraintLayout.this.E2, 256) && view.getMeasuredWidth() == constraintWidget.J() && view.getMeasuredWidth() < constraintWidgetContainer.J() && view.getMeasuredHeight() == constraintWidget.nY() && view.getMeasuredHeight() < constraintWidgetContainer.nY() && view.getBaseline() == constraintWidget.r() && !constraintWidget.ofS() && nr(constraintWidget.E2(), childMeasureSpec, constraintWidget.J()) && nr(constraintWidget.e(), iMakeMeasureSpec2, constraintWidget.nY())) {
                        measure.f35554O = constraintWidget.J();
                        measure.J2 = constraintWidget.nY();
                        measure.Uo = constraintWidget.r();
                        return;
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z6 = dimensionBehaviour != dimensionBehaviour3;
                    boolean z7 = dimensionBehaviour2 != dimensionBehaviour3;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                    boolean z9 = dimensionBehaviour2 != dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED;
                    boolean z10 = dimensionBehaviour != dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED;
                    boolean z11 = !z6 && constraintWidget.Nxk > 0.0f;
                    boolean z12 = !z7 && constraintWidget.Nxk > 0.0f;
                    if (view != null) {
                        return;
                    }
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    int i13 = measure.mUb;
                    boolean z13 = z10;
                    if (i13 != BasicMeasure.Measure.qie && i13 != BasicMeasure.Measure.az && z6 && constraintWidget.WPU == 0 && z7 && constraintWidget.aYN == 0) {
                        j2 = jNanoTime;
                        iMax2 = 0;
                        i3 = -1;
                        baseline = 0;
                        iMax = 0;
                    } else {
                        if ((view instanceof VirtualLayout) && (constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) {
                            ((VirtualLayout) view).aYN((androidx.constraintlayout.core.widgets.VirtualLayout) constraintWidget, childMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(childMeasureSpec, iMakeMeasureSpec2);
                        }
                        constraintWidget.f(childMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        int i14 = constraintWidget.nY;
                        iMax = i14 > 0 ? Math.max(i14, measuredWidth) : measuredWidth;
                        int i15 = iMakeMeasureSpec2;
                        int i16 = constraintWidget.f35524g;
                        if (i16 > 0) {
                            iMax = Math.min(i16, iMax);
                        }
                        int i17 = constraintWidget.iF;
                        iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
                        int i18 = childMeasureSpec;
                        int i19 = constraintWidget.fD;
                        if (i19 > 0) {
                            iMax2 = Math.min(i19, iMax2);
                        }
                        j2 = jNanoTime;
                        if (!Optimizer.rl(ConstraintLayout.this.E2, 1)) {
                            if (z11 && z9) {
                                iMax = (int) ((iMax2 * constraintWidget.Nxk) + 0.5f);
                            } else if (z12 && z13) {
                                iMax2 = (int) ((iMax / constraintWidget.Nxk) + 0.5f);
                            }
                        }
                        if (measuredWidth != iMax || measuredHeight != iMax2) {
                            int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i18;
                            int iMakeMeasureSpec4 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i15;
                            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                            constraintWidget.f(iMakeMeasureSpec3, iMakeMeasureSpec4);
                            iMax = view.getMeasuredWidth();
                            iMax2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                        i3 = -1;
                    }
                    boolean z14 = baseline != i3;
                    measure.xMQ = (iMax == measure.f35556t && iMax2 == measure.nr) ? false : true;
                    if (layoutParams.f35936Y) {
                        z14 = true;
                    }
                    if (z14 && baseline != -1 && constraintWidget.r() != baseline) {
                        measure.xMQ = true;
                    }
                    measure.f35554O = iMax;
                    measure.J2 = iMax2;
                    measure.KN = z14;
                    measure.Uo = baseline;
                    if (ConstraintLayout.this.f35903E != null) {
                        long jNanoTime2 = System.nanoTime();
                        ConstraintLayout.this.f35903E.f34992n += jNanoTime2 - j2;
                        return;
                    }
                    return;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.J2, i9 + constraintWidget.fD(), -1);
            }
            childMeasureSpec = iMakeMeasureSpec;
            i2 = iArr[dimensionBehaviour2.ordinal()];
            if (i2 != 1) {
            }
            constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.rV9();
            if (constraintWidgetContainer == null) {
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour32 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour != dimensionBehaviour32) {
            }
            if (dimensionBehaviour2 != dimensionBehaviour32) {
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour42 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour2 != dimensionBehaviour42) {
            }
            if (dimensionBehaviour != dimensionBehaviour42) {
            }
            if (z6) {
            }
            if (z7) {
            }
            if (view != null) {
            }
        }

        public void t(int i2, int i3, int i5, int i7, int i8, int i9) {
            this.rl = i5;
            this.f35952t = i7;
            this.nr = i8;
            this.f35950O = i9;
            this.J2 = i2;
            this.Uo = i3;
        }
    }

    public interface ValueModifier {
        boolean n(int i2, int i3, int i5, View view, LayoutParams layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35914n = new SparseArray();
        this.f35917t = new ArrayList(4);
        this.f35908O = new ConstraintWidgetContainer();
        this.J2 = 0;
        this.f35916r = 0;
        this.f35915o = Integer.MAX_VALUE;
        this.f35909S = Integer.MAX_VALUE;
        this.f35913g = true;
        this.E2 = 257;
        this.f35912e = null;
        this.f35910T = null;
        this.f35907N = -1;
        this.f35918v = new HashMap();
        this.Xw = -1;
        this.jB = -1;
        this.f35911U = -1;
        this.P5 = -1;
        this.M7 = 0;
        this.p5 = 0;
        this.eF = new SparseArray();
        this.f35906M = new Measurer(this);
        this.f35904FX = 0;
        this.f35902B = 0;
        o(attributeSet, 0, 0);
    }

    private void XQ() {
        this.f35913g = true;
        this.Xw = -1;
        this.jB = -1;
        this.f35911U = -1;
        this.P5 = -1;
        this.M7 = 0;
        this.p5 = 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f35919n;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f35919n = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35919n[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35919n[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35919n[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private ConstraintWidget ck(int i2) {
        if (i2 == 0) {
            return this.f35908O;
        }
        View viewFindViewById = (View) this.f35914n.get(i2);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f35908O;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((LayoutParams) viewFindViewById.getLayoutParams()).eWT;
    }

    public static SharedValues getSharedValues() {
        if (f35901D == null) {
            f35901D = new SharedValues();
        }
        return f35901D;
    }

    private void o(AttributeSet attributeSet, int i2, int i3) {
        this.f35908O.UhV(this);
        this.f35908O.iV(this.f35906M);
        this.f35914n.put(getId(), this);
        this.f35912e = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.tFV, i2, i3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == R.styleable.HBN) {
                    this.J2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.J2);
                } else if (index == R.styleable.UF) {
                    this.f35916r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f35916r);
                } else if (index == R.styleable.ub) {
                    this.f35915o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f35915o);
                } else if (index == R.styleable.Qu) {
                    this.f35909S = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f35909S);
                } else if (index == R.styleable.sFO) {
                    this.E2 = typedArrayObtainStyledAttributes.getInt(index, this.E2);
                } else if (index == R.styleable.LPV) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            S(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f35910T = null;
                        }
                    }
                } else if (index == R.styleable.v0j) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f35912e = constraintSet;
                        constraintSet.g(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f35912e = null;
                    }
                    this.f35907N = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f35908O.I4p(this.E2);
    }

    private void te(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray sparseArray, int i2, ConstraintAnchor.Type type) {
        View view = (View) this.f35914n.get(i2);
        ConstraintWidget constraintWidget2 = (ConstraintWidget) sparseArray.get(i2);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.f35936Y = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.f35936Y = true;
            layoutParams2.eWT.RQ(true);
        }
        constraintWidget.Ik(type2).rl(constraintWidget2.Ik(type), layoutParams.fD, layoutParams.iF, true);
        constraintWidget.RQ(true);
        constraintWidget.Ik(ConstraintAnchor.Type.TOP).Ik();
        constraintWidget.Ik(ConstraintAnchor.Type.BOTTOM).Ik();
    }

    public View Ik(int i2) {
        return (View) this.f35914n.get(i2);
    }

    protected boolean J2(int i2, int i3) {
        boolean zN = false;
        if (this.f35905J == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        for (ValueModifier valueModifier : this.f35905J) {
            Iterator it = this.f35908O.Mh().iterator();
            while (it.hasNext()) {
                View view = (View) ((ConstraintWidget) it.next()).XQ();
                zN |= valueModifier.n(size, size2, view.getId(), view, (LayoutParams) view.getLayoutParams());
            }
        }
        return zN;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void O(boolean z2, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray sparseArray) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        LayoutParams layoutParams2;
        ConstraintWidget constraintWidget6;
        float f3;
        int i2;
        layoutParams.t();
        layoutParams.ul = false;
        constraintWidget.nO(view.getVisibility());
        if (layoutParams.f35948z) {
            constraintWidget.p0N(true);
            constraintWidget.nO(8);
        }
        constraintWidget.UhV(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).Ik(constraintWidget, this.f35908O.l());
        }
        if (layoutParams.f35941k) {
            androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget;
            int i3 = layoutParams.Mx;
            int i5 = layoutParams.f35925G7;
            float f4 = layoutParams.fcU;
            if (f4 != -1.0f) {
                guideline.lNy(f4);
                return;
            } else if (i3 != -1) {
                guideline.xzo(i3);
                return;
            } else {
                if (i5 != -1) {
                    guideline.XNZ(i5);
                    return;
                }
                return;
            }
        }
        int i7 = layoutParams.ijL;
        int i8 = layoutParams.f35942m;
        int i9 = layoutParams.eTf;
        int i10 = layoutParams.xg;
        int i11 = layoutParams.pJg;
        int i12 = layoutParams.ofS;
        float f5 = layoutParams.f35921C;
        int i13 = layoutParams.ck;
        if (i13 != -1) {
            ConstraintWidget constraintWidget7 = (ConstraintWidget) sparseArray.get(i13);
            if (constraintWidget7 != null) {
                constraintWidget.az(constraintWidget7, layoutParams.f35945r, layoutParams.Ik);
            }
            constraintWidget6 = constraintWidget;
            layoutParams2 = layoutParams;
        } else {
            if (i7 != -1) {
                ConstraintWidget constraintWidget8 = (ConstraintWidget) sparseArray.get(i7);
                if (constraintWidget8 != null) {
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                    constraintWidget.dR0(type, constraintWidget8, type, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11);
                }
            } else if (i8 != -1 && (constraintWidget2 = (ConstraintWidget) sparseArray.get(i8)) != null) {
                constraintWidget.dR0(ConstraintAnchor.Type.LEFT, constraintWidget2, ConstraintAnchor.Type.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11);
            }
            if (i9 != -1) {
                ConstraintWidget constraintWidget9 = (ConstraintWidget) sparseArray.get(i9);
                if (constraintWidget9 != null) {
                    constraintWidget.dR0(ConstraintAnchor.Type.RIGHT, constraintWidget9, ConstraintAnchor.Type.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i12);
                }
            } else if (i10 != -1 && (constraintWidget3 = (ConstraintWidget) sparseArray.get(i10)) != null) {
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.dR0(type2, constraintWidget3, type2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i12);
            }
            int i14 = layoutParams.xMQ;
            if (i14 != -1) {
                ConstraintWidget constraintWidget10 = (ConstraintWidget) sparseArray.get(i14);
                if (constraintWidget10 != null) {
                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
                    constraintWidget.dR0(type3, constraintWidget10, type3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.aYN);
                }
            } else {
                int i15 = layoutParams.mUb;
                if (i15 != -1 && (constraintWidget4 = (ConstraintWidget) sparseArray.get(i15)) != null) {
                    constraintWidget.dR0(ConstraintAnchor.Type.TOP, constraintWidget4, ConstraintAnchor.Type.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.aYN);
                }
            }
            int i16 = layoutParams.gh;
            if (i16 != -1) {
                ConstraintWidget constraintWidget11 = (ConstraintWidget) sparseArray.get(i16);
                if (constraintWidget11 != null) {
                    constraintWidget.dR0(ConstraintAnchor.Type.BOTTOM, constraintWidget11, ConstraintAnchor.Type.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.nY);
                }
            } else {
                int i17 = layoutParams.qie;
                if (i17 != -1 && (constraintWidget5 = (ConstraintWidget) sparseArray.get(i17)) != null) {
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.dR0(type4, constraintWidget5, type4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.nY);
                }
            }
            int i18 = layoutParams.az;
            if (i18 != -1) {
                layoutParams2 = layoutParams;
                te(constraintWidget, layoutParams2, sparseArray, i18, ConstraintAnchor.Type.BASELINE);
            } else {
                layoutParams2 = layoutParams;
                int i19 = layoutParams2.ty;
                if (i19 != -1) {
                    te(constraintWidget, layoutParams2, sparseArray, i19, ConstraintAnchor.Type.TOP);
                } else {
                    int i20 = layoutParams2.HI;
                    if (i20 != -1) {
                        te(constraintWidget, layoutParams2, sparseArray, i20, ConstraintAnchor.Type.BOTTOM);
                        constraintWidget6 = constraintWidget;
                    }
                    if (f5 >= 0.0f) {
                        constraintWidget6.F(f5);
                    }
                    f3 = layoutParams2.f35933T;
                    if (f3 >= 0.0f) {
                        constraintWidget6.xVH(f3);
                    }
                }
            }
            constraintWidget6 = constraintWidget;
            if (f5 >= 0.0f) {
            }
            f3 = layoutParams2.f35933T;
            if (f3 >= 0.0f) {
            }
        }
        if (z2 && ((i2 = layoutParams2.f35929M) != -1 || layoutParams2.f35924FX != -1)) {
            constraintWidget6.Zmq(i2, layoutParams2.f35924FX);
        }
        if (layoutParams2.f35926GR) {
            constraintWidget6.VwL(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget6.vl(((ViewGroup.MarginLayoutParams) layoutParams2).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -2) {
                constraintWidget6.VwL(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -1) {
            if (layoutParams2.f35928J) {
                constraintWidget6.VwL(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget6.VwL(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget6.Ik(ConstraintAnchor.Type.LEFT).Uo = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
            constraintWidget6.Ik(ConstraintAnchor.Type.RIGHT).Uo = ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        } else {
            constraintWidget6.VwL(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget6.vl(0);
        }
        if (layoutParams2.Nxk) {
            constraintWidget6.Vvq(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget6.a63(((ViewGroup.MarginLayoutParams) layoutParams2).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -2) {
                constraintWidget6.Vvq(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -1) {
            if (layoutParams2.f35922D) {
                constraintWidget6.Vvq(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget6.Vvq(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget6.Ik(ConstraintAnchor.Type.TOP).Uo = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            constraintWidget6.Ik(ConstraintAnchor.Type.BOTTOM).Uo = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        } else {
            constraintWidget6.Vvq(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget6.a63(0);
        }
        constraintWidget6.K(layoutParams2.f35930N);
        constraintWidget6.T3L(layoutParams2.wTp);
        constraintWidget6.Zn(layoutParams2.f35947v);
        constraintWidget6.QZ6(layoutParams2.rV9);
        constraintWidget6.EF(layoutParams2.bzg);
        constraintWidget6.v0j(layoutParams2.f35927I);
        constraintWidget6.mI(layoutParams2.Xw, layoutParams2.f35934U, layoutParams2.M7, layoutParams2.eF);
        constraintWidget6.y(layoutParams2.jB, layoutParams2.P5, layoutParams2.p5, layoutParams2.f35923E);
    }

    protected void S(int i2) {
        this.f35910T = new ConstraintLayoutStates(getContext(), this, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void WPU(int i2, int i3, int i5, int i7, boolean z2, boolean z3) {
        Measurer measurer = this.f35906M;
        int i8 = measurer.f35950O;
        int iResolveSizeAndState = View.resolveSizeAndState(i5 + measurer.nr, i2, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i7 + i8, i3, 0) & 16777215;
        int iMin = Math.min(this.f35915o, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f35909S, iResolveSizeAndState2);
        if (z2) {
            iMin |= 16777216;
        }
        if (z3) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.Xw = iMin;
        this.jB = iMin2;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f35917t;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((ConstraintHelper) this.f35917t.get(i2)).Z(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i5 = Integer.parseInt(strArrSplit[0]);
                        int i7 = Integer.parseInt(strArrSplit[1]);
                        int i8 = Integer.parseInt(strArrSplit[2]);
                        int i9 = (int) ((i5 / 1080.0f) * width);
                        int i10 = (int) ((i7 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f3 = i9;
                        float f4 = i10;
                        float f5 = i9 + ((int) ((i8 / 1080.0f) * width));
                        canvas.drawLine(f3, f4, f5, f4, paint);
                        float f6 = i10 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f5, f4, f5, f6, paint);
                        canvas.drawLine(f5, f6, f3, f6, paint);
                        canvas.drawLine(f3, f6, f3, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f4, f5, f6, paint);
                        canvas.drawLine(f3, f6, f5, f4, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
      (r2v3 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
      (r2v0 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
     binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void g(ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i5, int i7) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        Measurer measurer = this.f35906M;
        int i8 = measurer.f35950O;
        int i9 = measurer.nr;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i2 == Integer.MIN_VALUE) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i3 = Math.max(0, this.J2);
            }
        } else if (i2 == 0) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            i3 = childCount == 0 ? Math.max(0, this.J2) : 0;
        } else if (i2 != 1073741824) {
            dimensionBehaviour = dimensionBehaviour2;
        } else {
            i3 = Math.min(this.f35915o - i9, i3);
            dimensionBehaviour = dimensionBehaviour2;
        }
        if (i5 == Integer.MIN_VALUE) {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i7 = Math.max(0, this.f35916r);
            }
        } else if (i5 != 0) {
            i7 = i5 != 1073741824 ? 0 : Math.min(this.f35909S - i8, i7);
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i7 = Math.max(0, this.f35916r);
            }
        }
        if (i3 != constraintWidgetContainer.J() || i7 != constraintWidgetContainer.nY()) {
            constraintWidgetContainer.yAc();
        }
        constraintWidgetContainer.o9(0);
        constraintWidgetContainer.n7b(0);
        constraintWidgetContainer.Qu(this.f35915o - i9);
        constraintWidgetContainer.ub(this.f35909S - i8);
        constraintWidgetContainer.X4T(0);
        constraintWidgetContainer.UF(0);
        constraintWidgetContainer.VwL(dimensionBehaviour);
        constraintWidgetContainer.vl(i3);
        constraintWidgetContainer.Vvq(dimensionBehaviour2);
        constraintWidgetContainer.a63(i7);
        constraintWidgetContainer.X4T(this.J2 - i9);
        constraintWidgetContainer.UF(this.f35916r - i8);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getMaxHeight() {
        return this.f35909S;
    }

    public int getMaxWidth() {
        return this.f35915o;
    }

    public int getMinHeight() {
        return this.f35916r;
    }

    public int getMinWidth() {
        return this.J2;
    }

    public int getOptimizationLevel() {
        return this.f35908O.SR();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f35908O.HI == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f35908O.HI = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f35908O.HI = "parent";
            }
        }
        if (this.f35908O.S() == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.f35908O;
            constraintWidgetContainer.i(constraintWidgetContainer.HI);
            Log.v("ConstraintLayout", " setDebugName " + this.f35908O.S());
        }
        for (ConstraintWidget constraintWidget : this.f35908O.Mh()) {
            View view = (View) constraintWidget.XQ();
            if (view != null) {
                if (constraintWidget.HI == null && (id = view.getId()) != -1) {
                    constraintWidget.HI = getContext().getResources().getResourceEntryName(id);
                }
                if (constraintWidget.S() == null) {
                    constraintWidget.i(constraintWidget.HI);
                    Log.v("ConstraintLayout", " setDebugName " + constraintWidget.S());
                }
            }
        }
        this.f35908O.U(sb);
        return sb.toString();
    }

    public void nY(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f35918v == null) {
                this.f35918v = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f35918v.put(strSubstring, num);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        View content;
        Metrics metrics = this.f35903E;
        if (metrics != null) {
            metrics.f34996v++;
        }
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.eWT;
            if ((childAt.getVisibility() != 8 || layoutParams.f35941k || layoutParams.dR0 || layoutParams.piY || zIsInEditMode) && !layoutParams.f35948z) {
                int iD = constraintWidget.D();
                int iA = constraintWidget.a();
                int iJ = constraintWidget.J() + iD;
                int iNY = constraintWidget.nY() + iA;
                childAt.layout(iD, iA, iJ, iNY);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iD, iA, iJ, iNY);
                }
            }
        }
        int size = this.f35917t.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                ((ConstraintHelper) this.f35917t.get(i9)).r(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        long jNanoTime;
        if (this.f35903E != null) {
            jNanoTime = System.nanoTime();
            this.f35903E.Xw = getChildCount();
            this.f35903E.jB++;
        } else {
            jNanoTime = 0;
        }
        boolean zJ2 = this.f35913g | J2(i2, i3);
        this.f35913g = zJ2;
        if (!zJ2) {
            int childCount = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                if (getChildAt(i5).isLayoutRequested()) {
                    this.f35913g = true;
                    break;
                }
                i5++;
            }
        }
        this.f35904FX = i2;
        this.f35902B = i3;
        this.f35908O.Co(Z());
        if (this.f35913g) {
            this.f35913g = false;
            if (iF()) {
                this.f35908O.A();
            }
        }
        this.f35908O.Fp(this.f35903E);
        aYN(this.f35908O, this.E2, i2, i3);
        WPU(i2, i3, this.f35908O.J(), this.f35908O.nY(), this.f35908O.eo(), this.f35908O.h());
        Metrics metrics = this.f35903E;
        if (metrics != null) {
            metrics.bzg += System.nanoTime() - jNanoTime;
        }
    }

    public Object qie(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f35918v;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f35918v.get(str);
    }

    public final ConstraintWidget r(View view) {
        if (view == this) {
            return this.f35908O;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).eWT;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).eWT;
        }
        return null;
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.f35912e = constraintSet;
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.f35914n.remove(getId());
        super.setId(i2);
        this.f35914n.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f35909S) {
            return;
        }
        this.f35909S = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f35915o) {
            return;
        }
        this.f35915o = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f35916r) {
            return;
        }
        this.f35916r = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.J2) {
            return;
        }
        this.J2 = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        ConstraintLayoutStates constraintLayoutStates = this.f35910T;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.t(constraintsChangedListener);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.E2 = i2;
        this.f35908O.I4p(i2);
    }

    private void ViF() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ConstraintWidget constraintWidgetR = r(getChildAt(i2));
            if (constraintWidgetR != null) {
                constraintWidgetR.n1();
            }
        }
        if (zIsInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    nY(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    ck(childAt.getId()).i(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f35907N != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = getChildAt(i5);
                if (childAt2.getId() == this.f35907N && (childAt2 instanceof Constraints)) {
                    this.f35912e = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        ConstraintSet constraintSet = this.f35912e;
        if (constraintSet != null) {
            constraintSet.gh(this, true);
        }
        this.f35908O.wKp();
        int size = this.f35917t.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((ConstraintHelper) this.f35917t.get(i7)).S(this);
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt3 = getChildAt(i8);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).rl(this);
            }
        }
        this.eF.clear();
        this.eF.put(0, this.f35908O);
        this.eF.put(getId(), this.f35908O);
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt4 = getChildAt(i9);
            this.eF.put(childAt4.getId(), r(childAt4));
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt5 = getChildAt(i10);
            ConstraintWidget constraintWidgetR2 = r(childAt5);
            if (constraintWidgetR2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.f35908O.n(constraintWidgetR2);
                O(zIsInEditMode, childAt5, constraintWidgetR2, layoutParams, this.eF);
            }
        }
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (iMax2 > 0) {
            return iMax2;
        }
        return iMax;
    }

    private boolean iF() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (getChildAt(i2).isLayoutRequested()) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            ViF();
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean Z() {
        if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aYN(ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i5) {
        int i7;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i8 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f35906M.t(i3, i5, iMax, iMax2, paddingWidth, i8);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 <= 0 && iMax4 <= 0) {
            iMax3 = Math.max(0, getPaddingLeft());
        } else {
            if (Z()) {
                i7 = iMax4;
            }
            int i9 = size - paddingWidth;
            int i10 = size2 - i8;
            g(constraintWidgetContainer, mode, i9, mode2, i10);
            constraintWidgetContainer.uQ(i2, mode, i9, mode2, i10, this.Xw, this.jB, i7, iMax);
        }
        i7 = iMax3;
        int i92 = size - paddingWidth;
        int i102 = size2 - i8;
        g(constraintWidgetContainer, mode, i92, mode2, i102);
        constraintWidgetContainer.uQ(i2, mode, i92, mode2, i102, this.Xw, this.jB, i7, iMax);
    }

    @Override // android.view.View
    public void forceLayout() {
        XQ();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget constraintWidgetR = r(view);
        if ((view instanceof Guideline) && !(constraintWidgetR instanceof androidx.constraintlayout.core.widgets.Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.Guideline guideline = new androidx.constraintlayout.core.widgets.Guideline();
            layoutParams.eWT = guideline;
            layoutParams.f35941k = true;
            guideline.I9f(layoutParams.f35920B);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.WPU();
            ((LayoutParams) view.getLayoutParams()).dR0 = true;
            if (!this.f35917t.contains(constraintHelper)) {
                this.f35917t.add(constraintHelper);
            }
        }
        this.f35914n.put(view.getId(), view);
        this.f35913g = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f35914n.remove(view.getId());
        this.f35908O.Toy(r(view));
        this.f35917t.remove(view);
        this.f35913g = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        XQ();
        super.requestLayout();
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f35914n = new SparseArray();
        this.f35917t = new ArrayList(4);
        this.f35908O = new ConstraintWidgetContainer();
        this.J2 = 0;
        this.f35916r = 0;
        this.f35915o = Integer.MAX_VALUE;
        this.f35909S = Integer.MAX_VALUE;
        this.f35913g = true;
        this.E2 = 257;
        this.f35912e = null;
        this.f35910T = null;
        this.f35907N = -1;
        this.f35918v = new HashMap();
        this.Xw = -1;
        this.jB = -1;
        this.f35911U = -1;
        this.P5 = -1;
        this.M7 = 0;
        this.p5 = 0;
        this.eF = new SparseArray();
        this.f35906M = new Measurer(this);
        this.f35904FX = 0;
        this.f35902B = 0;
        o(attributeSet, i2, 0);
    }
}
