package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.media3.container.MdtaMetadataEntry;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import mfo.CLVG.aNrWBQYwFf;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class ConstraintSet {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f35963n;
    private static final int[] KN = {0, 4, 8};
    private static SparseIntArray xMQ = new SparseIntArray();
    private static SparseIntArray mUb = new SparseIntArray();
    public String rl = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String[] f35964t = new String[0];
    public int nr = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private HashMap f35962O = new HashMap();
    private boolean J2 = true;
    private HashMap Uo = new HashMap();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static class Constraint {
        Delta KN;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f35966n;
        String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final PropertySet f35967t = new PropertySet();
        public final Motion nr = new Motion();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final Layout f35965O = new Layout();
        public final Transform J2 = new Transform();
        public HashMap Uo = new HashMap();

        static class Delta {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int[] f35969n = new int[10];
            int[] rl = new int[10];

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f35970t = 0;
            int[] nr = new int[10];

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            float[] f35968O = new float[10];
            int J2 = 0;
            int[] Uo = new int[5];
            String[] KN = new String[5];
            int xMQ = 0;
            int[] mUb = new int[4];
            boolean[] gh = new boolean[4];
            int qie = 0;

            void O(Constraint constraint) {
                for (int i2 = 0; i2 < this.f35970t; i2++) {
                    ConstraintSet.wTp(constraint, this.f35969n[i2], this.rl[i2]);
                }
                for (int i3 = 0; i3 < this.J2; i3++) {
                    ConstraintSet.s7N(constraint, this.nr[i3], this.f35968O[i3]);
                }
                for (int i5 = 0; i5 < this.xMQ; i5++) {
                    ConstraintSet.v(constraint, this.Uo[i5], this.KN[i5]);
                }
                for (int i7 = 0; i7 < this.qie; i7++) {
                    ConstraintSet.rV9(constraint, this.mUb[i7], this.gh[i7]);
                }
            }

            void n(int i2, float f3) {
                int i3 = this.J2;
                int[] iArr = this.nr;
                if (i3 >= iArr.length) {
                    this.nr = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f35968O;
                    this.f35968O = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.nr;
                int i5 = this.J2;
                iArr2[i5] = i2;
                float[] fArr2 = this.f35968O;
                this.J2 = i5 + 1;
                fArr2[i5] = f3;
            }

            void nr(int i2, boolean z2) {
                int i3 = this.qie;
                int[] iArr = this.mUb;
                if (i3 >= iArr.length) {
                    this.mUb = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.gh;
                    this.gh = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.mUb;
                int i5 = this.qie;
                iArr2[i5] = i2;
                boolean[] zArr2 = this.gh;
                this.qie = i5 + 1;
                zArr2[i5] = z2;
            }

            void rl(int i2, int i3) {
                int i5 = this.f35970t;
                int[] iArr = this.f35969n;
                if (i5 >= iArr.length) {
                    this.f35969n = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.rl;
                    this.rl = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f35969n;
                int i7 = this.f35970t;
                iArr3[i7] = i2;
                int[] iArr4 = this.rl;
                this.f35970t = i7 + 1;
                iArr4[i7] = i3;
            }

            void t(int i2, String str) {
                int i3 = this.xMQ;
                int[] iArr = this.Uo;
                if (i3 >= iArr.length) {
                    this.Uo = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.KN;
                    this.KN = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.Uo;
                int i5 = this.xMQ;
                iArr2[i5] = i2;
                String[] strArr2 = this.KN;
                this.xMQ = i5 + 1;
                strArr2[i5] = str;
            }

            Delta() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Uo(int i2, ConstraintLayout.LayoutParams layoutParams) {
            this.f35966n = i2;
            Layout layout = this.f35965O;
            layout.mUb = layoutParams.f35931O;
            layout.gh = layoutParams.J2;
            layout.qie = layoutParams.Uo;
            layout.az = layoutParams.KN;
            layout.ty = layoutParams.xMQ;
            layout.HI = layoutParams.mUb;
            layout.ck = layoutParams.gh;
            layout.Ik = layoutParams.qie;
            layout.f35995r = layoutParams.az;
            layout.f35994o = layoutParams.ty;
            layout.f35987Z = layoutParams.HI;
            layout.XQ = layoutParams.f35944o;
            layout.f35982S = layoutParams.f35937Z;
            layout.WPU = layoutParams.XQ;
            layout.aYN = layoutParams.f35932S;
            layout.ViF = layoutParams.f35935X;
            layout.nY = layoutParams.f35933T;
            layout.f35990g = layoutParams.f35930N;
            layout.te = layoutParams.ck;
            layout.iF = layoutParams.Ik;
            layout.fD = layoutParams.f35945r;
            layout.E2 = layoutParams.f35929M;
            layout.f35989e = layoutParams.f35924FX;
            layout.f35985X = layoutParams.f35920B;
            layout.KN = layoutParams.f35946t;
            layout.J2 = layoutParams.f35943n;
            layout.Uo = layoutParams.rl;
            layout.nr = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            layout.f35981O = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            layout.f35983T = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            layout.f35980N = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            layout.nHg = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            layout.s7N = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layout.rV9 = layoutParams.fD;
            layout.eF = layoutParams.f35947v;
            layout.f35974E = layoutParams.wTp;
            layout.f35975FX = layoutParams.bzg;
            layout.f35979M = layoutParams.rV9;
            layout.eTf = layoutParams.f35928J;
            layout.xg = layoutParams.f35922D;
            layout.f35972B = layoutParams.Xw;
            layout.f35978J = layoutParams.jB;
            layout.f35973D = layoutParams.M7;
            layout.f35988a = layoutParams.p5;
            layout.f35977I = layoutParams.f35934U;
            layout.f35976GR = layoutParams.P5;
            layout.Nxk = layoutParams.eF;
            layout.f35986Y = layoutParams.f35923E;
            layout.f35992m = layoutParams.f35938a;
            layout.Xw = layoutParams.aYN;
            layout.f35984U = layoutParams.nY;
            layout.bzg = layoutParams.WPU;
            layout.jB = layoutParams.ViF;
            layout.M7 = layoutParams.f35940g;
            layout.P5 = layoutParams.te;
            layout.p5 = layoutParams.iF;
            layout.ofS = layoutParams.f35927I;
            layout.wTp = layoutParams.getMarginEnd();
            this.f35965O.f35997v = layoutParams.getMarginStart();
        }

        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public Constraint clone() {
            Constraint constraint = new Constraint();
            constraint.f35965O.n(this.f35965O);
            constraint.nr.n(this.nr);
            constraint.f35967t.n(this.f35967t);
            constraint.J2.n(this.J2);
            constraint.f35966n = this.f35966n;
            constraint.KN = this.KN;
            return constraint;
        }

        public void O(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout = this.f35965O;
            layoutParams.f35931O = layout.mUb;
            layoutParams.J2 = layout.gh;
            layoutParams.Uo = layout.qie;
            layoutParams.KN = layout.az;
            layoutParams.xMQ = layout.ty;
            layoutParams.mUb = layout.HI;
            layoutParams.gh = layout.ck;
            layoutParams.qie = layout.Ik;
            layoutParams.az = layout.f35995r;
            layoutParams.ty = layout.f35994o;
            layoutParams.HI = layout.f35987Z;
            layoutParams.f35944o = layout.XQ;
            layoutParams.f35937Z = layout.f35982S;
            layoutParams.XQ = layout.WPU;
            layoutParams.f35932S = layout.aYN;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = layout.f35983T;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = layout.f35980N;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = layout.nHg;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = layout.s7N;
            layoutParams.f35940g = layout.M7;
            layoutParams.te = layout.P5;
            layoutParams.aYN = layout.Xw;
            layoutParams.nY = layout.f35984U;
            layoutParams.f35935X = layout.ViF;
            layoutParams.f35933T = layout.nY;
            layoutParams.ck = layout.te;
            layoutParams.Ik = layout.iF;
            layoutParams.f35945r = layout.fD;
            layoutParams.f35930N = layout.f35990g;
            layoutParams.f35929M = layout.E2;
            layoutParams.f35924FX = layout.f35989e;
            layoutParams.f35947v = layout.eF;
            layoutParams.wTp = layout.f35974E;
            layoutParams.bzg = layout.f35975FX;
            layoutParams.rV9 = layout.f35979M;
            layoutParams.f35928J = layout.eTf;
            layoutParams.f35922D = layout.xg;
            layoutParams.Xw = layout.f35972B;
            layoutParams.jB = layout.f35978J;
            layoutParams.M7 = layout.f35973D;
            layoutParams.p5 = layout.f35988a;
            layoutParams.f35934U = layout.f35977I;
            layoutParams.P5 = layout.f35976GR;
            layoutParams.eF = layout.Nxk;
            layoutParams.f35923E = layout.f35986Y;
            layoutParams.f35920B = layout.f35985X;
            layoutParams.f35946t = layout.KN;
            layoutParams.f35943n = layout.J2;
            layoutParams.rl = layout.Uo;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = layout.nr;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = layout.f35981O;
            String str = layout.f35992m;
            if (str != null) {
                layoutParams.f35938a = str;
            }
            layoutParams.f35927I = layout.ofS;
            layoutParams.setMarginStart(layout.f35997v);
            layoutParams.setMarginEnd(this.f35965O.wTp);
            layoutParams.t();
        }

        public void nr(Constraint constraint) {
            Delta delta = this.KN;
            if (delta != null) {
                delta.O(constraint);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void KN(int i2, Constraints.LayoutParams layoutParams) {
            Uo(i2, layoutParams);
            this.f35967t.nr = layoutParams.n1;
            Transform transform = this.J2;
            transform.rl = layoutParams.qm;
            transform.f36007t = layoutParams.mYa;
            transform.nr = layoutParams.Org;
            transform.f36005O = layoutParams.HV;
            transform.J2 = layoutParams.GD;
            transform.Uo = layoutParams.Po6;
            transform.KN = layoutParams.EWS;
            transform.mUb = layoutParams.hRu;
            transform.gh = layoutParams.UhV;
            transform.qie = layoutParams.f36009i;
            transform.ty = layoutParams.Rl;
            transform.az = layoutParams.Jk;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xMQ(ConstraintHelper constraintHelper, int i2, Constraints.LayoutParams layoutParams) {
            KN(i2, layoutParams);
            if (constraintHelper instanceof Barrier) {
                Layout layout = this.f35965O;
                layout.f35998z = 1;
                Barrier barrier = (Barrier) constraintHelper;
                layout.f35991k = barrier.getType();
                this.f35965O.piY = barrier.getReferencedIds();
                this.f35965O.dR0 = barrier.getMargin();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static class Layout {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private static SparseIntArray f35971C;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f35981O;
        public String ijL;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f35992m;
        public int nr;
        public int[] piY;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f35993n = false;
        public boolean rl = false;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f35996t = false;
        public int J2 = -1;
        public int Uo = -1;
        public float KN = -1.0f;
        public boolean xMQ = true;
        public int mUb = -1;
        public int gh = -1;
        public int qie = -1;
        public int az = -1;
        public int ty = -1;
        public int HI = -1;
        public int ck = -1;
        public int Ik = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f35995r = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f35994o = -1;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public int f35987Z = -1;
        public int XQ = -1;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f35982S = -1;
        public int WPU = -1;
        public int aYN = -1;
        public float ViF = 0.5f;
        public float nY = 0.5f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f35990g = null;
        public int te = -1;
        public int iF = 0;
        public float fD = 0.0f;
        public int E2 = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f35989e = -1;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f35985X = -1;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f35983T = 0;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f35980N = 0;
        public int nHg = 0;
        public int s7N = 0;
        public int wTp = 0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f35997v = 0;
        public int rV9 = 0;
        public int bzg = Integer.MIN_VALUE;
        public int Xw = Integer.MIN_VALUE;
        public int jB = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f35984U = Integer.MIN_VALUE;
        public int P5 = Integer.MIN_VALUE;
        public int M7 = Integer.MIN_VALUE;
        public int p5 = Integer.MIN_VALUE;
        public float eF = -1.0f;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f35974E = -1.0f;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f35979M = 0;

        /* JADX INFO: renamed from: FX, reason: collision with root package name */
        public int f35975FX = 0;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f35972B = 0;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f35978J = 0;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f35973D = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35988a = 0;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f35977I = 0;

        /* JADX INFO: renamed from: GR, reason: collision with root package name */
        public int f35976GR = 0;
        public float Nxk = 1.0f;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public float f35986Y = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f35991k = -1;
        public int dR0 = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f35998z = -1;
        public boolean eTf = false;
        public boolean xg = false;
        public boolean pJg = true;
        public int ofS = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f35971C = sparseIntArray;
            sparseIntArray.append(R.styleable.TVz, 24);
            f35971C.append(R.styleable.LeN, 25);
            f35971C.append(R.styleable.NT, 28);
            f35971C.append(R.styleable.tYa, 29);
            f35971C.append(R.styleable.cL, 35);
            f35971C.append(R.styleable.G8P, 34);
            f35971C.append(R.styleable.f36080oh, 4);
            f35971C.append(R.styleable.f3k, 3);
            f35971C.append(R.styleable.Mg, 1);
            f35971C.append(R.styleable.Jz1, 6);
            f35971C.append(R.styleable.f36045S2, 7);
            f35971C.append(R.styleable.flZ, 17);
            f35971C.append(R.styleable.Gy, 18);
            f35971C.append(R.styleable.vF, 19);
            SparseIntArray sparseIntArray2 = f35971C;
            int i2 = R.styleable.Fd;
            sparseIntArray2.append(i2, 90);
            f35971C.append(R.styleable.xxL, 26);
            f35971C.append(R.styleable.bGT, 31);
            f35971C.append(R.styleable.kI, 32);
            f35971C.append(R.styleable.Jeq, 10);
            f35971C.append(R.styleable.WwU, 9);
            f35971C.append(R.styleable.cT, 13);
            f35971C.append(R.styleable.s5a, 16);
            f35971C.append(R.styleable.drE, 14);
            f35971C.append(R.styleable.eLq, 11);
            f35971C.append(R.styleable.OWw, 15);
            f35971C.append(R.styleable.Rx, 12);
            f35971C.append(R.styleable.fIU, 38);
            f35971C.append(R.styleable.T6, 37);
            f35971C.append(R.styleable.f36051WJ, 39);
            f35971C.append(R.styleable.RW, 40);
            f35971C.append(R.styleable.aeB, 20);
            f35971C.append(R.styleable.D1, 36);
            f35971C.append(R.styleable.CUD, 5);
            f35971C.append(R.styleable.LSw, 91);
            f35971C.append(R.styleable.HeJ, 91);
            f35971C.append(R.styleable.Gx9, 91);
            f35971C.append(R.styleable.cm, 91);
            f35971C.append(R.styleable.f36032K0, 91);
            f35971C.append(R.styleable.f8, 23);
            f35971C.append(R.styleable.q5J, 27);
            f35971C.append(R.styleable.bIT, 30);
            f35971C.append(R.styleable.RkF, 8);
            f35971C.append(R.styleable.KB, 33);
            f35971C.append(R.styleable.nln, 2);
            f35971C.append(R.styleable.KJJ, 22);
            f35971C.append(R.styleable.vZY, 21);
            SparseIntArray sparseIntArray3 = f35971C;
            int i3 = R.styleable.FG8;
            sparseIntArray3.append(i3, 41);
            SparseIntArray sparseIntArray4 = f35971C;
            int i5 = R.styleable.sl;
            sparseIntArray4.append(i5, 42);
            f35971C.append(R.styleable.IO, 87);
            f35971C.append(R.styleable.f36085sP, 88);
            f35971C.append(R.styleable.E6J, 76);
            f35971C.append(R.styleable.ag, 61);
            f35971C.append(R.styleable.Eq, 62);
            f35971C.append(R.styleable.sPk, 63);
            f35971C.append(R.styleable.Kb, 69);
            f35971C.append(R.styleable.Gd, 70);
            f35971C.append(R.styleable.vD, 71);
            f35971C.append(R.styleable.gUZ, 72);
            f35971C.append(R.styleable.vqZ, 73);
            f35971C.append(R.styleable.s6, 74);
            f35971C.append(R.styleable.Ftj, 75);
            SparseIntArray sparseIntArray5 = f35971C;
            int i7 = R.styleable.Pc;
            sparseIntArray5.append(i7, 84);
            f35971C.append(R.styleable.yl, 86);
            f35971C.append(i7, 83);
            f35971C.append(R.styleable.Kkh, 85);
            f35971C.append(i3, 87);
            f35971C.append(i5, 88);
            f35971C.append(R.styleable.GH3, 89);
            f35971C.append(i2, 90);
        }

        public void n(Layout layout) {
            this.f35993n = layout.f35993n;
            this.nr = layout.nr;
            this.rl = layout.rl;
            this.f35981O = layout.f35981O;
            this.J2 = layout.J2;
            this.Uo = layout.Uo;
            this.KN = layout.KN;
            this.xMQ = layout.xMQ;
            this.mUb = layout.mUb;
            this.gh = layout.gh;
            this.qie = layout.qie;
            this.az = layout.az;
            this.ty = layout.ty;
            this.HI = layout.HI;
            this.ck = layout.ck;
            this.Ik = layout.Ik;
            this.f35995r = layout.f35995r;
            this.f35994o = layout.f35994o;
            this.f35987Z = layout.f35987Z;
            this.XQ = layout.XQ;
            this.f35982S = layout.f35982S;
            this.WPU = layout.WPU;
            this.aYN = layout.aYN;
            this.ViF = layout.ViF;
            this.nY = layout.nY;
            this.f35990g = layout.f35990g;
            this.te = layout.te;
            this.iF = layout.iF;
            this.fD = layout.fD;
            this.E2 = layout.E2;
            this.f35989e = layout.f35989e;
            this.f35985X = layout.f35985X;
            this.f35983T = layout.f35983T;
            this.f35980N = layout.f35980N;
            this.nHg = layout.nHg;
            this.s7N = layout.s7N;
            this.wTp = layout.wTp;
            this.f35997v = layout.f35997v;
            this.rV9 = layout.rV9;
            this.bzg = layout.bzg;
            this.Xw = layout.Xw;
            this.jB = layout.jB;
            this.f35984U = layout.f35984U;
            this.P5 = layout.P5;
            this.M7 = layout.M7;
            this.p5 = layout.p5;
            this.eF = layout.eF;
            this.f35974E = layout.f35974E;
            this.f35979M = layout.f35979M;
            this.f35975FX = layout.f35975FX;
            this.f35972B = layout.f35972B;
            this.f35978J = layout.f35978J;
            this.f35973D = layout.f35973D;
            this.f35988a = layout.f35988a;
            this.f35977I = layout.f35977I;
            this.f35976GR = layout.f35976GR;
            this.Nxk = layout.Nxk;
            this.f35986Y = layout.f35986Y;
            this.f35991k = layout.f35991k;
            this.dR0 = layout.dR0;
            this.f35998z = layout.f35998z;
            this.f35992m = layout.f35992m;
            int[] iArr = layout.piY;
            if (iArr == null || layout.ijL != null) {
                this.piY = null;
            } else {
                this.piY = Arrays.copyOf(iArr, iArr.length);
            }
            this.ijL = layout.ijL;
            this.eTf = layout.eTf;
            this.xg = layout.xg;
            this.pJg = layout.pJg;
            this.ofS = layout.ofS;
        }

        void rl(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.JF7);
            this.rl = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = f35971C.get(index);
                switch (i3) {
                    case 1:
                        this.f35995r = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.f35995r);
                        break;
                    case 2:
                        this.s7N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.s7N);
                        break;
                    case 3:
                        this.Ik = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.Ik);
                        break;
                    case 4:
                        this.ck = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.ck);
                        break;
                    case 5:
                        this.f35990g = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E2);
                        break;
                    case 7:
                        this.f35989e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f35989e);
                        break;
                    case 8:
                        this.wTp = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.wTp);
                        break;
                    case 9:
                        this.aYN = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.aYN);
                        break;
                    case 10:
                        this.WPU = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.WPU);
                        break;
                    case 11:
                        this.f35984U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35984U);
                        break;
                    case 12:
                        this.P5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P5);
                        break;
                    case 13:
                        this.bzg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.bzg);
                        break;
                    case 14:
                        this.jB = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.jB);
                        break;
                    case 15:
                        this.M7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M7);
                        break;
                    case 16:
                        this.Xw = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Xw);
                        break;
                    case 17:
                        this.J2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.J2);
                        break;
                    case 18:
                        this.Uo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Uo);
                        break;
                    case 19:
                        this.KN = typedArrayObtainStyledAttributes.getFloat(index, this.KN);
                        break;
                    case 20:
                        this.ViF = typedArrayObtainStyledAttributes.getFloat(index, this.ViF);
                        break;
                    case 21:
                        this.f35981O = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f35981O);
                        break;
                    case 22:
                        this.nr = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.nr);
                        break;
                    case 23:
                        this.f35983T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35983T);
                        break;
                    case 24:
                        this.mUb = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.mUb);
                        break;
                    case 25:
                        this.gh = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.gh);
                        break;
                    case 26:
                        this.f35985X = typedArrayObtainStyledAttributes.getInt(index, this.f35985X);
                        break;
                    case 27:
                        this.f35980N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35980N);
                        break;
                    case 28:
                        this.qie = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.qie);
                        break;
                    case 29:
                        this.az = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.az);
                        break;
                    case 30:
                        this.f35997v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35997v);
                        break;
                    case 31:
                        this.XQ = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.XQ);
                        break;
                    case 32:
                        this.f35982S = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.f35982S);
                        break;
                    case 33:
                        this.nHg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.nHg);
                        break;
                    case 34:
                        this.HI = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.HI);
                        break;
                    case 35:
                        this.ty = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.ty);
                        break;
                    case 36:
                        this.nY = typedArrayObtainStyledAttributes.getFloat(index, this.nY);
                        break;
                    case 37:
                        this.f35974E = typedArrayObtainStyledAttributes.getFloat(index, this.f35974E);
                        break;
                    case 38:
                        this.eF = typedArrayObtainStyledAttributes.getFloat(index, this.eF);
                        break;
                    case 39:
                        this.f35979M = typedArrayObtainStyledAttributes.getInt(index, this.f35979M);
                        break;
                    case 40:
                        this.f35975FX = typedArrayObtainStyledAttributes.getInt(index, this.f35975FX);
                        break;
                    case 41:
                        ConstraintSet.fD(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        ConstraintSet.fD(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i3) {
                            case 61:
                                this.te = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.te);
                                break;
                            case 62:
                                this.iF = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.iF);
                                break;
                            case 63:
                                this.fD = typedArrayObtainStyledAttributes.getFloat(index, this.fD);
                                break;
                            default:
                                switch (i3) {
                                    case 69:
                                        this.Nxk = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f35986Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                                        this.f35991k = typedArrayObtainStyledAttributes.getInt(index, this.f35991k);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                                        this.dR0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.dR0);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                        this.ijL = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.pJg = typedArrayObtainStyledAttributes.getBoolean(index, this.pJg);
                                        break;
                                    case 76:
                                        this.ofS = typedArrayObtainStyledAttributes.getInt(index, this.ofS);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                                        this.f35994o = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.f35994o);
                                        break;
                                    case MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64 /* 78 */:
                                        this.f35987Z = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.f35987Z);
                                        break;
                                    case 79:
                                        this.p5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.p5);
                                        break;
                                    case 80:
                                        this.rV9 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.rV9);
                                        break;
                                    case 81:
                                        this.f35972B = typedArrayObtainStyledAttributes.getInt(index, this.f35972B);
                                        break;
                                    case 82:
                                        this.f35978J = typedArrayObtainStyledAttributes.getInt(index, this.f35978J);
                                        break;
                                    case 83:
                                        this.f35988a = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35988a);
                                        break;
                                    case 84:
                                        this.f35973D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35973D);
                                        break;
                                    case 85:
                                        this.f35976GR = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35976GR);
                                        break;
                                    case 86:
                                        this.f35977I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35977I);
                                        break;
                                    case 87:
                                        this.eTf = typedArrayObtainStyledAttributes.getBoolean(index, this.eTf);
                                        break;
                                    case 88:
                                        this.xg = typedArrayObtainStyledAttributes.getBoolean(index, this.xg);
                                        break;
                                    case 89:
                                        this.f35992m = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.xMQ = typedArrayObtainStyledAttributes.getBoolean(index, this.xMQ);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f35971C.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f35971C.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static class Motion {
        private static SparseIntArray HI;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f36000n = false;
        public int rl = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36001t = 0;
        public String nr = null;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f35999O = -1;
        public int J2 = 0;
        public float Uo = Float.NaN;
        public int KN = -1;
        public float xMQ = Float.NaN;
        public float mUb = Float.NaN;
        public int gh = -1;
        public String qie = null;
        public int az = -3;
        public int ty = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            HI = sparseIntArray;
            sparseIntArray.append(R.styleable.nRv, 1);
            HI.append(R.styleable.NU, 2);
            HI.append(R.styleable.pzT, 3);
            HI.append(R.styleable.Ubr, 4);
            HI.append(R.styleable.f36029JP, 5);
            HI.append(R.styleable.f36092y8, 6);
            HI.append(R.styleable.tWM, 7);
            HI.append(R.styleable.z7, 8);
            HI.append(R.styleable.f36093yd, 9);
            HI.append(R.styleable.f36030JR, 10);
        }

        public void n(Motion motion) {
            this.f36000n = motion.f36000n;
            this.rl = motion.rl;
            this.nr = motion.nr;
            this.f35999O = motion.f35999O;
            this.J2 = motion.J2;
            this.xMQ = motion.xMQ;
            this.Uo = motion.Uo;
            this.KN = motion.KN;
        }

        void rl(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.kl6);
            this.f36000n = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (HI.get(index)) {
                    case 1:
                        this.xMQ = typedArrayObtainStyledAttributes.getFloat(index, this.xMQ);
                        break;
                    case 2:
                        this.f35999O = typedArrayObtainStyledAttributes.getInt(index, this.f35999O);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.nr = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.nr = Easing.f35264t[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.J2 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.rl = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.rl);
                        break;
                    case 6:
                        this.f36001t = typedArrayObtainStyledAttributes.getInteger(index, this.f36001t);
                        break;
                    case 7:
                        this.Uo = typedArrayObtainStyledAttributes.getFloat(index, this.Uo);
                        break;
                    case 8:
                        this.gh = typedArrayObtainStyledAttributes.getInteger(index, this.gh);
                        break;
                    case 9:
                        this.mUb = typedArrayObtainStyledAttributes.getFloat(index, this.mUb);
                        break;
                    case 10:
                        int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i3 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.ty = resourceId;
                            if (resourceId != -1) {
                                this.az = -2;
                            }
                        } else if (i3 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.qie = string;
                            if (string.indexOf("/") > 0) {
                                this.ty = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.az = -2;
                            } else {
                                this.az = -1;
                            }
                        } else {
                            this.az = typedArrayObtainStyledAttributes.getInteger(index, this.ty);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static class PropertySet {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f36003n = false;
        public int rl = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36004t = 0;
        public float nr = 1.0f;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f36002O = Float.NaN;

        public void n(PropertySet propertySet) {
            this.f36003n = propertySet.f36003n;
            this.rl = propertySet.rl;
            this.nr = propertySet.nr;
            this.f36002O = propertySet.f36002O;
            this.f36004t = propertySet.f36004t;
        }

        void rl(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.nMV);
            this.f36003n = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.Xp) {
                    this.nr = typedArrayObtainStyledAttributes.getFloat(index, this.nr);
                } else if (index == R.styleable.f36074kG) {
                    this.rl = typedArrayObtainStyledAttributes.getInt(index, this.rl);
                    this.rl = ConstraintSet.KN[this.rl];
                } else if (index == R.styleable.G8) {
                    this.f36004t = typedArrayObtainStyledAttributes.getInt(index, this.f36004t);
                } else if (index == R.styleable.Ek5) {
                    this.f36002O = typedArrayObtainStyledAttributes.getFloat(index, this.f36002O);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static class Transform {
        private static SparseIntArray HI;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f36006n = false;
        public float rl = 0.0f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f36007t = 0.0f;
        public float nr = 0.0f;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f36005O = 1.0f;
        public float J2 = 1.0f;
        public float Uo = Float.NaN;
        public float KN = Float.NaN;
        public int xMQ = -1;
        public float mUb = 0.0f;
        public float gh = 0.0f;
        public float qie = 0.0f;
        public boolean az = false;
        public float ty = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            HI = sparseIntArray;
            sparseIntArray.append(R.styleable.f36039OQ, 1);
            HI.append(R.styleable.sAr, 2);
            HI.append(R.styleable.iDk, 3);
            HI.append(R.styleable.Gh, 4);
            HI.append(R.styleable.u2, 5);
            HI.append(R.styleable.yox, 6);
            HI.append(R.styleable.f3, 7);
            HI.append(R.styleable.Nt, 8);
            HI.append(R.styleable.Yi9, 9);
            HI.append(R.styleable.Md, 10);
            HI.append(R.styleable.fz, 11);
            HI.append(R.styleable.BAA, 12);
        }

        public void n(Transform transform) {
            this.f36006n = transform.f36006n;
            this.rl = transform.rl;
            this.f36007t = transform.f36007t;
            this.nr = transform.nr;
            this.f36005O = transform.f36005O;
            this.J2 = transform.J2;
            this.Uo = transform.Uo;
            this.KN = transform.KN;
            this.xMQ = transform.xMQ;
            this.mUb = transform.mUb;
            this.gh = transform.gh;
            this.qie = transform.qie;
            this.az = transform.az;
            this.ty = transform.ty;
        }

        void rl(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.c52);
            this.f36006n = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (HI.get(index)) {
                    case 1:
                        this.rl = typedArrayObtainStyledAttributes.getFloat(index, this.rl);
                        break;
                    case 2:
                        this.f36007t = typedArrayObtainStyledAttributes.getFloat(index, this.f36007t);
                        break;
                    case 3:
                        this.nr = typedArrayObtainStyledAttributes.getFloat(index, this.nr);
                        break;
                    case 4:
                        this.f36005O = typedArrayObtainStyledAttributes.getFloat(index, this.f36005O);
                        break;
                    case 5:
                        this.J2 = typedArrayObtainStyledAttributes.getFloat(index, this.J2);
                        break;
                    case 6:
                        this.Uo = typedArrayObtainStyledAttributes.getDimension(index, this.Uo);
                        break;
                    case 7:
                        this.KN = typedArrayObtainStyledAttributes.getDimension(index, this.KN);
                        break;
                    case 8:
                        this.mUb = typedArrayObtainStyledAttributes.getDimension(index, this.mUb);
                        break;
                    case 9:
                        this.gh = typedArrayObtainStyledAttributes.getDimension(index, this.gh);
                        break;
                    case 10:
                        this.qie = typedArrayObtainStyledAttributes.getDimension(index, this.qie);
                        break;
                    case 11:
                        this.az = true;
                        this.ty = typedArrayObtainStyledAttributes.getDimension(index, this.ty);
                        break;
                    case 12:
                        this.xMQ = ConstraintSet.iF(typedArrayObtainStyledAttributes, index, this.xMQ);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class WriteJsonEngine {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class WriteXmlEngine {
    }

    static {
        xMQ.append(R.styleable.dR0, 25);
        xMQ.append(R.styleable.f36094z, 26);
        xMQ.append(R.styleable.ijL, 29);
        xMQ.append(R.styleable.f36077m, 30);
        xMQ.append(R.styleable.Mx, 36);
        xMQ.append(R.styleable.f36017C, 35);
        xMQ.append(R.styleable.Xw, 4);
        xMQ.append(R.styleable.bzg, 3);
        xMQ.append(R.styleable.s7N, 1);
        xMQ.append(R.styleable.f36088v, 91);
        xMQ.append(R.styleable.wTp, 92);
        xMQ.append(R.styleable.mYa, 6);
        xMQ.append(R.styleable.Org, 7);
        xMQ.append(R.styleable.f36020E, 17);
        xMQ.append(R.styleable.f36034M, 18);
        xMQ.append(R.styleable.f36022FX, 19);
        xMQ.append(R.styleable.f36053X, 99);
        xMQ.append(R.styleable.f36086t, 27);
        xMQ.append(R.styleable.eTf, 32);
        xMQ.append(R.styleable.xg, 33);
        xMQ.append(R.styleable.eF, 10);
        xMQ.append(R.styleable.p5, 9);
        xMQ.append(R.styleable.Po6, 13);
        xMQ.append(R.styleable.UhV, 16);
        xMQ.append(R.styleable.EWS, 14);
        xMQ.append(R.styleable.HV, 11);
        xMQ.append(R.styleable.hRu, 15);
        xMQ.append(R.styleable.GD, 12);
        xMQ.append(R.styleable.eWT, 40);
        xMQ.append(R.styleable.f36054Y, 39);
        xMQ.append(R.styleable.Nxk, 41);
        xMQ.append(R.styleable.fcU, 42);
        xMQ.append(R.styleable.f36025GR, 20);
        xMQ.append(R.styleable.f36024G7, 37);
        xMQ.append(R.styleable.M7, 5);
        xMQ.append(R.styleable.f36073k, 87);
        xMQ.append(R.styleable.ofS, 87);
        xMQ.append(R.styleable.piY, 87);
        xMQ.append(R.styleable.rV9, 87);
        xMQ.append(R.styleable.nHg, 87);
        xMQ.append(R.styleable.KN, 24);
        xMQ.append(R.styleable.mUb, 28);
        xMQ.append(R.styleable.f36044S, 31);
        xMQ.append(R.styleable.WPU, 8);
        xMQ.append(R.styleable.xMQ, 34);
        xMQ.append(R.styleable.gh, 2);
        xMQ.append(R.styleable.J2, 23);
        xMQ.append(R.styleable.Uo, 21);
        xMQ.append(R.styleable.ul, 95);
        xMQ.append(R.styleable.f36016B, 96);
        xMQ.append(R.styleable.f36037O, 22);
        xMQ.append(R.styleable.qie, 43);
        xMQ.append(R.styleable.ViF, 44);
        xMQ.append(R.styleable.f36055Z, 45);
        xMQ.append(R.styleable.XQ, 46);
        xMQ.append(R.styleable.f36079o, 60);
        xMQ.append(R.styleable.Ik, 47);
        xMQ.append(R.styleable.f36083r, 48);
        xMQ.append(R.styleable.az, 49);
        xMQ.append(R.styleable.ty, 50);
        xMQ.append(R.styleable.HI, 51);
        xMQ.append(R.styleable.ck, 52);
        xMQ.append(R.styleable.aYN, 53);
        xMQ.append(R.styleable.n1, 54);
        xMQ.append(R.styleable.f36028J, 55);
        xMQ.append(R.styleable.Jk, 56);
        xMQ.append(R.styleable.f36019D, 57);
        xMQ.append(R.styleable.Rl, 58);
        xMQ.append(R.styleable.f36056a, 59);
        xMQ.append(R.styleable.jB, 61);
        xMQ.append(R.styleable.P5, 62);
        xMQ.append(R.styleable.f36048U, 63);
        xMQ.append(R.styleable.nY, 64);
        xMQ.append(R.styleable.a63, 65);
        xMQ.append(R.styleable.f36064e, 66);
        xMQ.append(R.styleable.f36021F, 67);
        xMQ.append(R.styleable.How, 79);
        xMQ.append(R.styleable.nr, 38);
        xMQ.append(R.styleable.f36031K, 68);
        xMQ.append(R.styleable.qm, 69);
        xMQ.append(R.styleable.f36027I, 70);
        xMQ.append(R.styleable.f36071i, 97);
        xMQ.append(R.styleable.fD, 71);
        xMQ.append(R.styleable.te, 72);
        xMQ.append(R.styleable.iF, 73);
        xMQ.append(R.styleable.E2, 74);
        xMQ.append(R.styleable.f36069g, 75);
        xMQ.append(R.styleable.tUK, 76);
        xMQ.append(R.styleable.pJg, 77);
        xMQ.append(R.styleable.QZ6, 78);
        xMQ.append(R.styleable.f36035N, 80);
        xMQ.append(R.styleable.f36047T, 81);
        xMQ.append(R.styleable.ER, 82);
        xMQ.append(R.styleable.RQ, 83);
        xMQ.append(R.styleable.f36050W, 84);
        xMQ.append(R.styleable.kSg, 85);
        xMQ.append(R.styleable.lLA, 86);
        SparseIntArray sparseIntArray = mUb;
        int i2 = R.styleable.tzr;
        sparseIntArray.append(i2, 6);
        mUb.append(i2, 7);
        mUb.append(R.styleable.Qg8, 27);
        mUb.append(R.styleable.zv, 13);
        mUb.append(R.styleable.GHt, 16);
        mUb.append(R.styleable.f36018CU, 14);
        mUb.append(R.styleable.q8, 11);
        mUb.append(R.styleable.Ep, 15);
        mUb.append(R.styleable.cJ, 12);
        mUb.append(R.styleable.aJ, 40);
        mUb.append(R.styleable.f36041Q, 39);
        mUb.append(R.styleable.fwz, 41);
        mUb.append(R.styleable.NQ2, 42);
        mUb.append(R.styleable.X6, 20);
        mUb.append(R.styleable.Pzf, 37);
        mUb.append(R.styleable.F6W, 5);
        mUb.append(R.styleable.sYH, 87);
        mUb.append(R.styleable.DtL, 87);
        mUb.append(R.styleable.c2, 87);
        mUb.append(R.styleable.ENe, 87);
        mUb.append(R.styleable.hu, 87);
        mUb.append(R.styleable.W5k, 24);
        mUb.append(R.styleable.ex, 28);
        mUb.append(R.styleable.eOa, 31);
        mUb.append(R.styleable.i7, 8);
        mUb.append(R.styleable.NC9, 34);
        mUb.append(R.styleable.poH, 2);
        mUb.append(R.styleable.f36043Rc, 23);
        mUb.append(R.styleable.UR, 21);
        mUb.append(R.styleable.taU, 95);
        mUb.append(R.styleable.u2n, 96);
        mUb.append(R.styleable.GRh, 22);
        mUb.append(R.styleable.W1c, 43);
        mUb.append(R.styleable.R3E, 44);
        mUb.append(R.styleable.jE, 45);
        mUb.append(R.styleable.kC, 46);
        mUb.append(R.styleable.ZwA, 60);
        mUb.append(R.styleable.f36058b, 47);
        mUb.append(R.styleable.WKb, 48);
        mUb.append(R.styleable.pr, 49);
        mUb.append(R.styleable.ni, 50);
        mUb.append(R.styleable.GT, 51);
        mUb.append(R.styleable.Vd, 52);
        mUb.append(R.styleable.VK2, 53);
        mUb.append(R.styleable.pt, 54);
        mUb.append(R.styleable.f36082q, 55);
        mUb.append(R.styleable.Rf, 56);
        mUb.append(R.styleable.Hq, 57);
        mUb.append(R.styleable.vMk, 58);
        mUb.append(R.styleable.f36081p, 59);
        mUb.append(R.styleable.lvn, 62);
        mUb.append(R.styleable.Ai, 63);
        mUb.append(R.styleable.Yq, 64);
        mUb.append(R.styleable.xSy, 65);
        mUb.append(R.styleable.Bha, 66);
        mUb.append(R.styleable.kW, 67);
        mUb.append(R.styleable.ZZU, 79);
        mUb.append(R.styleable.tdZ, 38);
        mUb.append(R.styleable.rqO, 98);
        mUb.append(R.styleable.f36062cB, 68);
        mUb.append(R.styleable.z51, 69);
        mUb.append(R.styleable.f36067ep, 70);
        mUb.append(R.styleable.kR, 71);
        mUb.append(R.styleable.f11, 72);
        mUb.append(R.styleable.cAB, 73);
        mUb.append(R.styleable.yUZ, 74);
        mUb.append(R.styleable.f36023G, 75);
        mUb.append(R.styleable.x8, 76);
        mUb.append(R.styleable.eF0, 77);
        mUb.append(R.styleable.NUo, 78);
        mUb.append(R.styleable.YE, 80);
        mUb.append(R.styleable.H6M, 81);
        mUb.append(R.styleable.xJ, 82);
        mUb.append(R.styleable.GN, 83);
        mUb.append(R.styleable.pE, 84);
        mUb.append(R.styleable.g7, 85);
        mUb.append(R.styleable.zB, 86);
        mUb.append(R.styleable.WT, 97);
    }

    private static void T(Constraint constraint, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        Constraint.Delta delta = new Constraint.Delta();
        constraint.KN = delta;
        constraint.nr.f36000n = false;
        constraint.f35965O.rl = false;
        constraint.f35967t.f36003n = false;
        constraint.J2.f36006n = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            switch (mUb.get(index)) {
                case 2:
                    delta.rl(2, typedArray.getDimensionPixelSize(index, constraint.f35965O.s7N));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + xMQ.get(index));
                    break;
                case 5:
                    delta.t(5, typedArray.getString(index));
                    break;
                case 6:
                    delta.rl(6, typedArray.getDimensionPixelOffset(index, constraint.f35965O.E2));
                    break;
                case 7:
                    delta.rl(7, typedArray.getDimensionPixelOffset(index, constraint.f35965O.f35989e));
                    break;
                case 8:
                    delta.rl(8, typedArray.getDimensionPixelSize(index, constraint.f35965O.wTp));
                    break;
                case 11:
                    delta.rl(11, typedArray.getDimensionPixelSize(index, constraint.f35965O.f35984U));
                    break;
                case 12:
                    delta.rl(12, typedArray.getDimensionPixelSize(index, constraint.f35965O.P5));
                    break;
                case 13:
                    delta.rl(13, typedArray.getDimensionPixelSize(index, constraint.f35965O.bzg));
                    break;
                case 14:
                    delta.rl(14, typedArray.getDimensionPixelSize(index, constraint.f35965O.jB));
                    break;
                case 15:
                    delta.rl(15, typedArray.getDimensionPixelSize(index, constraint.f35965O.M7));
                    break;
                case 16:
                    delta.rl(16, typedArray.getDimensionPixelSize(index, constraint.f35965O.Xw));
                    break;
                case 17:
                    delta.rl(17, typedArray.getDimensionPixelOffset(index, constraint.f35965O.J2));
                    break;
                case 18:
                    delta.rl(18, typedArray.getDimensionPixelOffset(index, constraint.f35965O.Uo));
                    break;
                case 19:
                    delta.n(19, typedArray.getFloat(index, constraint.f35965O.KN));
                    break;
                case 20:
                    delta.n(20, typedArray.getFloat(index, constraint.f35965O.ViF));
                    break;
                case 21:
                    delta.rl(21, typedArray.getLayoutDimension(index, constraint.f35965O.f35981O));
                    break;
                case 22:
                    delta.rl(22, KN[typedArray.getInt(index, constraint.f35967t.rl)]);
                    break;
                case 23:
                    delta.rl(23, typedArray.getLayoutDimension(index, constraint.f35965O.nr));
                    break;
                case 24:
                    delta.rl(24, typedArray.getDimensionPixelSize(index, constraint.f35965O.f35983T));
                    break;
                case 27:
                    delta.rl(27, typedArray.getInt(index, constraint.f35965O.f35985X));
                    break;
                case 28:
                    delta.rl(28, typedArray.getDimensionPixelSize(index, constraint.f35965O.f35980N));
                    break;
                case 31:
                    delta.rl(31, typedArray.getDimensionPixelSize(index, constraint.f35965O.f35997v));
                    break;
                case 34:
                    delta.rl(34, typedArray.getDimensionPixelSize(index, constraint.f35965O.nHg));
                    break;
                case 37:
                    delta.n(37, typedArray.getFloat(index, constraint.f35965O.nY));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, constraint.f35966n);
                    constraint.f35966n = resourceId;
                    delta.rl(38, resourceId);
                    break;
                case 39:
                    delta.n(39, typedArray.getFloat(index, constraint.f35965O.f35974E));
                    break;
                case 40:
                    delta.n(40, typedArray.getFloat(index, constraint.f35965O.eF));
                    break;
                case 41:
                    delta.rl(41, typedArray.getInt(index, constraint.f35965O.f35979M));
                    break;
                case 42:
                    delta.rl(42, typedArray.getInt(index, constraint.f35965O.f35975FX));
                    break;
                case 43:
                    delta.n(43, typedArray.getFloat(index, constraint.f35967t.nr));
                    break;
                case 44:
                    delta.nr(44, true);
                    delta.n(44, typedArray.getDimension(index, constraint.J2.ty));
                    break;
                case 45:
                    delta.n(45, typedArray.getFloat(index, constraint.J2.f36007t));
                    break;
                case 46:
                    delta.n(46, typedArray.getFloat(index, constraint.J2.nr));
                    break;
                case 47:
                    delta.n(47, typedArray.getFloat(index, constraint.J2.f36005O));
                    break;
                case 48:
                    delta.n(48, typedArray.getFloat(index, constraint.J2.J2));
                    break;
                case 49:
                    delta.n(49, typedArray.getDimension(index, constraint.J2.Uo));
                    break;
                case 50:
                    delta.n(50, typedArray.getDimension(index, constraint.J2.KN));
                    break;
                case 51:
                    delta.n(51, typedArray.getDimension(index, constraint.J2.mUb));
                    break;
                case 52:
                    delta.n(52, typedArray.getDimension(index, constraint.J2.gh));
                    break;
                case 53:
                    delta.n(53, typedArray.getDimension(index, constraint.J2.qie));
                    break;
                case 54:
                    delta.rl(54, typedArray.getInt(index, constraint.f35965O.f35972B));
                    break;
                case 55:
                    delta.rl(55, typedArray.getInt(index, constraint.f35965O.f35978J));
                    break;
                case 56:
                    delta.rl(56, typedArray.getDimensionPixelSize(index, constraint.f35965O.f35973D));
                    break;
                case 57:
                    delta.rl(57, typedArray.getDimensionPixelSize(index, constraint.f35965O.f35988a));
                    break;
                case 58:
                    delta.rl(58, typedArray.getDimensionPixelSize(index, constraint.f35965O.f35977I));
                    break;
                case 59:
                    delta.rl(59, typedArray.getDimensionPixelSize(index, constraint.f35965O.f35976GR));
                    break;
                case 60:
                    delta.n(60, typedArray.getFloat(index, constraint.J2.rl));
                    break;
                case 62:
                    delta.rl(62, typedArray.getDimensionPixelSize(index, constraint.f35965O.iF));
                    break;
                case 63:
                    delta.n(63, typedArray.getFloat(index, constraint.f35965O.fD));
                    break;
                case 64:
                    delta.rl(64, iF(typedArray, index, constraint.nr.rl));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        delta.t(65, typedArray.getString(index));
                    } else {
                        delta.t(65, Easing.f35264t[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    delta.rl(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    delta.n(67, typedArray.getFloat(index, constraint.nr.xMQ));
                    break;
                case 68:
                    delta.n(68, typedArray.getFloat(index, constraint.f35967t.f36002O));
                    break;
                case 69:
                    delta.n(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    delta.n(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                    delta.rl(72, typedArray.getInt(index, constraint.f35965O.f35991k));
                    break;
                case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                    delta.rl(73, typedArray.getDimensionPixelSize(index, constraint.f35965O.dR0));
                    break;
                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                    delta.t(74, typedArray.getString(index));
                    break;
                case 75:
                    delta.nr(75, typedArray.getBoolean(index, constraint.f35965O.pJg));
                    break;
                case 76:
                    delta.rl(76, typedArray.getInt(index, constraint.nr.f35999O));
                    break;
                case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                    delta.t(77, typedArray.getString(index));
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64 /* 78 */:
                    delta.rl(78, typedArray.getInt(index, constraint.f35967t.f36004t));
                    break;
                case 79:
                    delta.n(79, typedArray.getFloat(index, constraint.nr.Uo));
                    break;
                case 80:
                    delta.nr(80, typedArray.getBoolean(index, constraint.f35965O.eTf));
                    break;
                case 81:
                    delta.nr(81, typedArray.getBoolean(index, constraint.f35965O.xg));
                    break;
                case 82:
                    delta.rl(82, typedArray.getInteger(index, constraint.nr.f36001t));
                    break;
                case 83:
                    delta.rl(83, iF(typedArray, index, constraint.J2.xMQ));
                    break;
                case 84:
                    delta.rl(84, typedArray.getInteger(index, constraint.nr.gh));
                    break;
                case 85:
                    delta.n(85, typedArray.getFloat(index, constraint.nr.mUb));
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        constraint.nr.ty = typedArray.getResourceId(index, -1);
                        delta.rl(89, constraint.nr.ty);
                        Motion motion = constraint.nr;
                        if (motion.ty != -1) {
                            motion.az = -2;
                            delta.rl(88, -2);
                        }
                    } else if (i3 == 3) {
                        constraint.nr.qie = typedArray.getString(index);
                        delta.t(90, constraint.nr.qie);
                        if (constraint.nr.qie.indexOf("/") > 0) {
                            constraint.nr.ty = typedArray.getResourceId(index, -1);
                            delta.rl(89, constraint.nr.ty);
                            constraint.nr.az = -2;
                            delta.rl(88, -2);
                        } else {
                            constraint.nr.az = -1;
                            delta.rl(88, -1);
                        }
                    } else {
                        Motion motion2 = constraint.nr;
                        motion2.az = typedArray.getInteger(index, motion2.ty);
                        delta.rl(88, constraint.nr.az);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + xMQ.get(index));
                    break;
                case 93:
                    delta.rl(93, typedArray.getDimensionPixelSize(index, constraint.f35965O.rV9));
                    break;
                case l.f62283e /* 94 */:
                    delta.rl(94, typedArray.getDimensionPixelSize(index, constraint.f35965O.p5));
                    break;
                case 95:
                    fD(delta, typedArray, index, 0);
                    break;
                case 96:
                    fD(delta, typedArray, index, 1);
                    break;
                case 97:
                    delta.rl(97, typedArray.getInt(index, constraint.f35965O.ofS));
                    break;
                case 98:
                    if (MotionLayout.wKp) {
                        int resourceId2 = typedArray.getResourceId(index, constraint.f35966n);
                        constraint.f35966n = resourceId2;
                        if (resourceId2 == -1) {
                            constraint.rl = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        constraint.rl = typedArray.getString(index);
                    } else {
                        constraint.f35966n = typedArray.getResourceId(index, constraint.f35966n);
                    }
                    break;
                case 99:
                    delta.nr(99, typedArray.getBoolean(index, constraint.f35965O.xMQ));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(Constraint constraint, int i2, String str) {
        if (i2 == 5) {
            constraint.f35965O.f35990g = str;
            return;
        }
        if (i2 == 65) {
            constraint.nr.nr = str;
            return;
        }
        if (i2 == 74) {
            Layout layout = constraint.f35965O;
            layout.ijL = str;
            layout.piY = null;
        } else if (i2 == 77) {
            constraint.f35965O.f35992m = str;
        } else if (i2 != 87) {
            if (i2 != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                constraint.nr.qie = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wTp(Constraint constraint, int i2, int i3) {
        if (i2 == 6) {
            constraint.f35965O.E2 = i3;
            return;
        }
        if (i2 == 7) {
            constraint.f35965O.f35989e = i3;
            return;
        }
        if (i2 == 8) {
            constraint.f35965O.wTp = i3;
            return;
        }
        if (i2 == 27) {
            constraint.f35965O.f35985X = i3;
            return;
        }
        if (i2 == 28) {
            constraint.f35965O.f35980N = i3;
            return;
        }
        if (i2 == 41) {
            constraint.f35965O.f35979M = i3;
            return;
        }
        if (i2 == 42) {
            constraint.f35965O.f35975FX = i3;
            return;
        }
        if (i2 == 61) {
            constraint.f35965O.te = i3;
            return;
        }
        if (i2 == 62) {
            constraint.f35965O.iF = i3;
            return;
        }
        if (i2 == 72) {
            constraint.f35965O.f35991k = i3;
            return;
        }
        if (i2 == 73) {
            constraint.f35965O.dR0 = i3;
            return;
        }
        switch (i2) {
            case 2:
                constraint.f35965O.s7N = i3;
                break;
            case 11:
                constraint.f35965O.f35984U = i3;
                break;
            case 12:
                constraint.f35965O.P5 = i3;
                break;
            case 13:
                constraint.f35965O.bzg = i3;
                break;
            case 14:
                constraint.f35965O.jB = i3;
                break;
            case 15:
                constraint.f35965O.M7 = i3;
                break;
            case 16:
                constraint.f35965O.Xw = i3;
                break;
            case 17:
                constraint.f35965O.J2 = i3;
                break;
            case 18:
                constraint.f35965O.Uo = i3;
                break;
            case 31:
                constraint.f35965O.f35997v = i3;
                break;
            case 34:
                constraint.f35965O.nHg = i3;
                break;
            case 38:
                constraint.f35966n = i3;
                break;
            case 64:
                constraint.nr.rl = i3;
                break;
            case 66:
                constraint.nr.J2 = i3;
                break;
            case 76:
                constraint.nr.f35999O = i3;
                break;
            case MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64 /* 78 */:
                constraint.f35967t.f36004t = i3;
                break;
            case 93:
                constraint.f35965O.rV9 = i3;
                break;
            case l.f62283e /* 94 */:
                constraint.f35965O.p5 = i3;
                break;
            case 97:
                constraint.f35965O.ofS = i3;
                break;
            default:
                switch (i2) {
                    case 21:
                        constraint.f35965O.f35981O = i3;
                        break;
                    case 22:
                        constraint.f35967t.rl = i3;
                        break;
                    case 23:
                        constraint.f35965O.nr = i3;
                        break;
                    case 24:
                        constraint.f35965O.f35983T = i3;
                        break;
                    default:
                        switch (i2) {
                            case 54:
                                constraint.f35965O.f35972B = i3;
                                break;
                            case 55:
                                constraint.f35965O.f35978J = i3;
                                break;
                            case 56:
                                constraint.f35965O.f35973D = i3;
                                break;
                            case 57:
                                constraint.f35965O.f35988a = i3;
                                break;
                            case 58:
                                constraint.f35965O.f35977I = i3;
                                break;
                            case 59:
                                constraint.f35965O.f35976GR = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 82:
                                        constraint.nr.f36001t = i3;
                                        break;
                                    case 83:
                                        constraint.J2.xMQ = i3;
                                        break;
                                    case 84:
                                        constraint.nr.gh = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 87:
                                                break;
                                            case 88:
                                                constraint.nr.az = i3;
                                                break;
                                            case 89:
                                                constraint.nr.ty = i3;
                                                break;
                                            default:
                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public void xMQ(ConstraintLayout constraintLayout) {
        gh(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    static void E2(Object obj, String str, int i2) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                    }
                    e(layoutParams, strTrim2);
                    return;
                }
                if (obj instanceof Layout) {
                    ((Layout) obj).f35990g = strTrim2;
                    return;
                } else {
                    if (obj instanceof Constraint.Delta) {
                        ((Constraint.Delta) obj).t(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f3 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                            layoutParams2.wTp = f3;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                            layoutParams2.f35947v = f3;
                            return;
                        }
                    }
                    if (obj instanceof Layout) {
                        Layout layout = (Layout) obj;
                        if (i2 == 0) {
                            layout.nr = 0;
                            layout.f35974E = f3;
                            return;
                        } else {
                            layout.f35981O = 0;
                            layout.eF = f3;
                            return;
                        }
                    }
                    if (obj instanceof Constraint.Delta) {
                        Constraint.Delta delta = (Constraint.Delta) obj;
                        if (i2 == 0) {
                            delta.rl(23, 0);
                            delta.n(39, f3);
                            return;
                        } else {
                            delta.rl(21, 0);
                            delta.n(40, f3);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.eF = fMax;
                            layoutParams3.Xw = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.f35923E = fMax;
                            layoutParams3.jB = 2;
                            return;
                        }
                    }
                    if (obj instanceof Layout) {
                        Layout layout2 = (Layout) obj;
                        if (i2 == 0) {
                            layout2.nr = 0;
                            layout2.Nxk = fMax;
                            layout2.f35972B = 2;
                            return;
                        } else {
                            layout2.f35981O = 0;
                            layout2.f35986Y = fMax;
                            layout2.f35978J = 2;
                            return;
                        }
                    }
                    if (obj instanceof Constraint.Delta) {
                        Constraint.Delta delta2 = (Constraint.Delta) obj;
                        if (i2 == 0) {
                            delta2.rl(23, 0);
                            delta2.rl(54, 2);
                        } else {
                            delta2.rl(21, 0);
                            delta2.rl(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    private void X(Constraint constraint, TypedArray typedArray, boolean z2) {
        if (z2) {
            T(constraint, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index != R.styleable.nr && R.styleable.f36044S != index && R.styleable.WPU != index) {
                constraint.nr.f36000n = true;
                constraint.f35965O.rl = true;
                constraint.f35967t.f36003n = true;
                constraint.J2.f36006n = true;
            }
            switch (xMQ.get(index)) {
                case 1:
                    Layout layout = constraint.f35965O;
                    layout.f35995r = iF(typedArray, index, layout.f35995r);
                    break;
                case 2:
                    Layout layout2 = constraint.f35965O;
                    layout2.s7N = typedArray.getDimensionPixelSize(index, layout2.s7N);
                    break;
                case 3:
                    Layout layout3 = constraint.f35965O;
                    layout3.Ik = iF(typedArray, index, layout3.Ik);
                    break;
                case 4:
                    Layout layout4 = constraint.f35965O;
                    layout4.ck = iF(typedArray, index, layout4.ck);
                    break;
                case 5:
                    constraint.f35965O.f35990g = typedArray.getString(index);
                    break;
                case 6:
                    Layout layout5 = constraint.f35965O;
                    layout5.E2 = typedArray.getDimensionPixelOffset(index, layout5.E2);
                    break;
                case 7:
                    Layout layout6 = constraint.f35965O;
                    layout6.f35989e = typedArray.getDimensionPixelOffset(index, layout6.f35989e);
                    break;
                case 8:
                    Layout layout7 = constraint.f35965O;
                    layout7.wTp = typedArray.getDimensionPixelSize(index, layout7.wTp);
                    break;
                case 9:
                    Layout layout8 = constraint.f35965O;
                    layout8.aYN = iF(typedArray, index, layout8.aYN);
                    break;
                case 10:
                    Layout layout9 = constraint.f35965O;
                    layout9.WPU = iF(typedArray, index, layout9.WPU);
                    break;
                case 11:
                    Layout layout10 = constraint.f35965O;
                    layout10.f35984U = typedArray.getDimensionPixelSize(index, layout10.f35984U);
                    break;
                case 12:
                    Layout layout11 = constraint.f35965O;
                    layout11.P5 = typedArray.getDimensionPixelSize(index, layout11.P5);
                    break;
                case 13:
                    Layout layout12 = constraint.f35965O;
                    layout12.bzg = typedArray.getDimensionPixelSize(index, layout12.bzg);
                    break;
                case 14:
                    Layout layout13 = constraint.f35965O;
                    layout13.jB = typedArray.getDimensionPixelSize(index, layout13.jB);
                    break;
                case 15:
                    Layout layout14 = constraint.f35965O;
                    layout14.M7 = typedArray.getDimensionPixelSize(index, layout14.M7);
                    break;
                case 16:
                    Layout layout15 = constraint.f35965O;
                    layout15.Xw = typedArray.getDimensionPixelSize(index, layout15.Xw);
                    break;
                case 17:
                    Layout layout16 = constraint.f35965O;
                    layout16.J2 = typedArray.getDimensionPixelOffset(index, layout16.J2);
                    break;
                case 18:
                    Layout layout17 = constraint.f35965O;
                    layout17.Uo = typedArray.getDimensionPixelOffset(index, layout17.Uo);
                    break;
                case 19:
                    Layout layout18 = constraint.f35965O;
                    layout18.KN = typedArray.getFloat(index, layout18.KN);
                    break;
                case 20:
                    Layout layout19 = constraint.f35965O;
                    layout19.ViF = typedArray.getFloat(index, layout19.ViF);
                    break;
                case 21:
                    Layout layout20 = constraint.f35965O;
                    layout20.f35981O = typedArray.getLayoutDimension(index, layout20.f35981O);
                    break;
                case 22:
                    PropertySet propertySet = constraint.f35967t;
                    propertySet.rl = typedArray.getInt(index, propertySet.rl);
                    PropertySet propertySet2 = constraint.f35967t;
                    propertySet2.rl = KN[propertySet2.rl];
                    break;
                case 23:
                    Layout layout21 = constraint.f35965O;
                    layout21.nr = typedArray.getLayoutDimension(index, layout21.nr);
                    break;
                case 24:
                    Layout layout22 = constraint.f35965O;
                    layout22.f35983T = typedArray.getDimensionPixelSize(index, layout22.f35983T);
                    break;
                case 25:
                    Layout layout23 = constraint.f35965O;
                    layout23.mUb = iF(typedArray, index, layout23.mUb);
                    break;
                case 26:
                    Layout layout24 = constraint.f35965O;
                    layout24.gh = iF(typedArray, index, layout24.gh);
                    break;
                case 27:
                    Layout layout25 = constraint.f35965O;
                    layout25.f35985X = typedArray.getInt(index, layout25.f35985X);
                    break;
                case 28:
                    Layout layout26 = constraint.f35965O;
                    layout26.f35980N = typedArray.getDimensionPixelSize(index, layout26.f35980N);
                    break;
                case 29:
                    Layout layout27 = constraint.f35965O;
                    layout27.qie = iF(typedArray, index, layout27.qie);
                    break;
                case 30:
                    Layout layout28 = constraint.f35965O;
                    layout28.az = iF(typedArray, index, layout28.az);
                    break;
                case 31:
                    Layout layout29 = constraint.f35965O;
                    layout29.f35997v = typedArray.getDimensionPixelSize(index, layout29.f35997v);
                    break;
                case 32:
                    Layout layout30 = constraint.f35965O;
                    layout30.XQ = iF(typedArray, index, layout30.XQ);
                    break;
                case 33:
                    Layout layout31 = constraint.f35965O;
                    layout31.f35982S = iF(typedArray, index, layout31.f35982S);
                    break;
                case 34:
                    Layout layout32 = constraint.f35965O;
                    layout32.nHg = typedArray.getDimensionPixelSize(index, layout32.nHg);
                    break;
                case 35:
                    Layout layout33 = constraint.f35965O;
                    layout33.HI = iF(typedArray, index, layout33.HI);
                    break;
                case 36:
                    Layout layout34 = constraint.f35965O;
                    layout34.ty = iF(typedArray, index, layout34.ty);
                    break;
                case 37:
                    Layout layout35 = constraint.f35965O;
                    layout35.nY = typedArray.getFloat(index, layout35.nY);
                    break;
                case 38:
                    constraint.f35966n = typedArray.getResourceId(index, constraint.f35966n);
                    break;
                case 39:
                    Layout layout36 = constraint.f35965O;
                    layout36.f35974E = typedArray.getFloat(index, layout36.f35974E);
                    break;
                case 40:
                    Layout layout37 = constraint.f35965O;
                    layout37.eF = typedArray.getFloat(index, layout37.eF);
                    break;
                case 41:
                    Layout layout38 = constraint.f35965O;
                    layout38.f35979M = typedArray.getInt(index, layout38.f35979M);
                    break;
                case 42:
                    Layout layout39 = constraint.f35965O;
                    layout39.f35975FX = typedArray.getInt(index, layout39.f35975FX);
                    break;
                case 43:
                    PropertySet propertySet3 = constraint.f35967t;
                    propertySet3.nr = typedArray.getFloat(index, propertySet3.nr);
                    break;
                case 44:
                    Transform transform = constraint.J2;
                    transform.az = true;
                    transform.ty = typedArray.getDimension(index, transform.ty);
                    break;
                case 45:
                    Transform transform2 = constraint.J2;
                    transform2.f36007t = typedArray.getFloat(index, transform2.f36007t);
                    break;
                case 46:
                    Transform transform3 = constraint.J2;
                    transform3.nr = typedArray.getFloat(index, transform3.nr);
                    break;
                case 47:
                    Transform transform4 = constraint.J2;
                    transform4.f36005O = typedArray.getFloat(index, transform4.f36005O);
                    break;
                case 48:
                    Transform transform5 = constraint.J2;
                    transform5.J2 = typedArray.getFloat(index, transform5.J2);
                    break;
                case 49:
                    Transform transform6 = constraint.J2;
                    transform6.Uo = typedArray.getDimension(index, transform6.Uo);
                    break;
                case 50:
                    Transform transform7 = constraint.J2;
                    transform7.KN = typedArray.getDimension(index, transform7.KN);
                    break;
                case 51:
                    Transform transform8 = constraint.J2;
                    transform8.mUb = typedArray.getDimension(index, transform8.mUb);
                    break;
                case 52:
                    Transform transform9 = constraint.J2;
                    transform9.gh = typedArray.getDimension(index, transform9.gh);
                    break;
                case 53:
                    Transform transform10 = constraint.J2;
                    transform10.qie = typedArray.getDimension(index, transform10.qie);
                    break;
                case 54:
                    Layout layout40 = constraint.f35965O;
                    layout40.f35972B = typedArray.getInt(index, layout40.f35972B);
                    break;
                case 55:
                    Layout layout41 = constraint.f35965O;
                    layout41.f35978J = typedArray.getInt(index, layout41.f35978J);
                    break;
                case 56:
                    Layout layout42 = constraint.f35965O;
                    layout42.f35973D = typedArray.getDimensionPixelSize(index, layout42.f35973D);
                    break;
                case 57:
                    Layout layout43 = constraint.f35965O;
                    layout43.f35988a = typedArray.getDimensionPixelSize(index, layout43.f35988a);
                    break;
                case 58:
                    Layout layout44 = constraint.f35965O;
                    layout44.f35977I = typedArray.getDimensionPixelSize(index, layout44.f35977I);
                    break;
                case 59:
                    Layout layout45 = constraint.f35965O;
                    layout45.f35976GR = typedArray.getDimensionPixelSize(index, layout45.f35976GR);
                    break;
                case 60:
                    Transform transform11 = constraint.J2;
                    transform11.rl = typedArray.getFloat(index, transform11.rl);
                    break;
                case 61:
                    Layout layout46 = constraint.f35965O;
                    layout46.te = iF(typedArray, index, layout46.te);
                    break;
                case 62:
                    Layout layout47 = constraint.f35965O;
                    layout47.iF = typedArray.getDimensionPixelSize(index, layout47.iF);
                    break;
                case 63:
                    Layout layout48 = constraint.f35965O;
                    layout48.fD = typedArray.getFloat(index, layout48.fD);
                    break;
                case 64:
                    Motion motion = constraint.nr;
                    motion.rl = iF(typedArray, index, motion.rl);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        constraint.nr.nr = typedArray.getString(index);
                    } else {
                        constraint.nr.nr = Easing.f35264t[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    constraint.nr.J2 = typedArray.getInt(index, 0);
                    break;
                case 67:
                    Motion motion2 = constraint.nr;
                    motion2.xMQ = typedArray.getFloat(index, motion2.xMQ);
                    break;
                case 68:
                    PropertySet propertySet4 = constraint.f35967t;
                    propertySet4.f36002O = typedArray.getFloat(index, propertySet4.f36002O);
                    break;
                case 69:
                    constraint.f35965O.Nxk = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    constraint.f35965O.f35986Y = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                    Layout layout49 = constraint.f35965O;
                    layout49.f35991k = typedArray.getInt(index, layout49.f35991k);
                    break;
                case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                    Layout layout50 = constraint.f35965O;
                    layout50.dR0 = typedArray.getDimensionPixelSize(index, layout50.dR0);
                    break;
                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                    constraint.f35965O.ijL = typedArray.getString(index);
                    break;
                case 75:
                    Layout layout51 = constraint.f35965O;
                    layout51.pJg = typedArray.getBoolean(index, layout51.pJg);
                    break;
                case 76:
                    Motion motion3 = constraint.nr;
                    motion3.f35999O = typedArray.getInt(index, motion3.f35999O);
                    break;
                case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                    constraint.f35965O.f35992m = typedArray.getString(index);
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64 /* 78 */:
                    PropertySet propertySet5 = constraint.f35967t;
                    propertySet5.f36004t = typedArray.getInt(index, propertySet5.f36004t);
                    break;
                case 79:
                    Motion motion4 = constraint.nr;
                    motion4.Uo = typedArray.getFloat(index, motion4.Uo);
                    break;
                case 80:
                    Layout layout52 = constraint.f35965O;
                    layout52.eTf = typedArray.getBoolean(index, layout52.eTf);
                    break;
                case 81:
                    Layout layout53 = constraint.f35965O;
                    layout53.xg = typedArray.getBoolean(index, layout53.xg);
                    break;
                case 82:
                    Motion motion5 = constraint.nr;
                    motion5.f36001t = typedArray.getInteger(index, motion5.f36001t);
                    break;
                case 83:
                    Transform transform12 = constraint.J2;
                    transform12.xMQ = iF(typedArray, index, transform12.xMQ);
                    break;
                case 84:
                    Motion motion6 = constraint.nr;
                    motion6.gh = typedArray.getInteger(index, motion6.gh);
                    break;
                case 85:
                    Motion motion7 = constraint.nr;
                    motion7.mUb = typedArray.getFloat(index, motion7.mUb);
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        constraint.nr.ty = typedArray.getResourceId(index, -1);
                        Motion motion8 = constraint.nr;
                        if (motion8.ty != -1) {
                            motion8.az = -2;
                        }
                    } else if (i3 == 3) {
                        constraint.nr.qie = typedArray.getString(index);
                        if (constraint.nr.qie.indexOf("/") > 0) {
                            constraint.nr.ty = typedArray.getResourceId(index, -1);
                            constraint.nr.az = -2;
                        } else {
                            constraint.nr.az = -1;
                        }
                    } else {
                        Motion motion9 = constraint.nr;
                        motion9.az = typedArray.getInteger(index, motion9.ty);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + xMQ.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + xMQ.get(index));
                    break;
                case 91:
                    Layout layout54 = constraint.f35965O;
                    layout54.f35994o = iF(typedArray, index, layout54.f35994o);
                    break;
                case 92:
                    Layout layout55 = constraint.f35965O;
                    layout55.f35987Z = iF(typedArray, index, layout55.f35987Z);
                    break;
                case 93:
                    Layout layout56 = constraint.f35965O;
                    layout56.rV9 = typedArray.getDimensionPixelSize(index, layout56.rV9);
                    break;
                case l.f62283e /* 94 */:
                    Layout layout57 = constraint.f35965O;
                    layout57.p5 = typedArray.getDimensionPixelSize(index, layout57.p5);
                    break;
                case 95:
                    fD(constraint.f35965O, typedArray, index, 0);
                    break;
                case 96:
                    fD(constraint.f35965O, typedArray, index, 1);
                    break;
                case 97:
                    Layout layout58 = constraint.f35965O;
                    layout58.ofS = typedArray.getInt(index, layout58.ofS);
                    break;
            }
        }
        Layout layout59 = constraint.f35965O;
        if (layout59.ijL != null) {
            layout59.piY = null;
        }
    }

    private Constraint Z(int i2) {
        if (!this.Uo.containsKey(Integer.valueOf(i2))) {
            this.Uo.put(Integer.valueOf(i2), new Constraint());
        }
        return (Constraint) this.Uo.get(Integer.valueOf(i2));
    }

    static void e(ConstraintLayout.LayoutParams layoutParams, String str) {
        float fAbs = Float.NaN;
        int i2 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i3 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i2 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i2 = 1;
                }
                i3 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i3);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i3, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f3 = Float.parseFloat(strSubstring3);
                        float f4 = Float.parseFloat(strSubstring4);
                        if (f3 > 0.0f && f4 > 0.0f) {
                            fAbs = i2 == 1 ? Math.abs(f4 / f3) : Math.abs(f3 / f4);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.f35930N = str;
        layoutParams.nHg = fAbs;
        layoutParams.s7N = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void fD(Object obj, TypedArray typedArray, int i2, int i3) {
        int dimensionPixelSize;
        boolean z2;
        if (obj == null) {
            return;
        }
        int i5 = typedArray.peekValue(i2).type;
        if (i5 == 3) {
            E2(obj, typedArray.getString(i2), i3);
            return;
        }
        int i7 = 0;
        if (i5 != 5) {
            dimensionPixelSize = typedArray.getInt(i2, 0);
            if (dimensionPixelSize == -4) {
                z2 = true;
                i7 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z2 = false;
            }
            if (!(obj instanceof ConstraintLayout.LayoutParams)) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                if (i3 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i7;
                    layoutParams.f35928J = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i7;
                    layoutParams.f35922D = z2;
                    return;
                }
            }
            if (obj instanceof Layout) {
                Layout layout = (Layout) obj;
                if (i3 == 0) {
                    layout.nr = i7;
                    layout.eTf = z2;
                    return;
                } else {
                    layout.f35981O = i7;
                    layout.xg = z2;
                    return;
                }
            }
            if (obj instanceof Constraint.Delta) {
                Constraint.Delta delta = (Constraint.Delta) obj;
                if (i3 == 0) {
                    delta.rl(23, i7);
                    delta.nr(80, z2);
                    return;
                } else {
                    delta.rl(21, i7);
                    delta.nr(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i2, 0);
        i7 = dimensionPixelSize;
        z2 = false;
        if (!(obj instanceof ConstraintLayout.LayoutParams)) {
        }
    }

    private Constraint o(Context context, AttributeSet attributeSet, boolean z2) {
        Constraint constraint = new Constraint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? R.styleable.iu : R.styleable.rl);
        X(constraint, typedArrayObtainStyledAttributes, z2);
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    private int[] r(View view, String str) {
        int iIntValue;
        Object objQie;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            try {
                iIntValue = R.id.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objQie = ((ConstraintLayout) view.getParent()).qie(0, strTrim)) != null && (objQie instanceof Integer)) {
                iIntValue = ((Integer) objQie).intValue();
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void rV9(Constraint constraint, int i2, boolean z2) {
        if (i2 == 44) {
            constraint.J2.az = z2;
            return;
        }
        if (i2 == 75) {
            constraint.f35965O.pJg = z2;
            return;
        }
        if (i2 != 87) {
            if (i2 == 80) {
                constraint.f35965O.eTf = z2;
            } else if (i2 != 81) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                constraint.f35965O.xg = z2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s7N(Constraint constraint, int i2, float f3) {
        if (i2 == 19) {
            constraint.f35965O.KN = f3;
            return;
        }
        if (i2 == 20) {
            constraint.f35965O.ViF = f3;
            return;
        }
        if (i2 == 37) {
            constraint.f35965O.nY = f3;
            return;
        }
        if (i2 == 60) {
            constraint.J2.rl = f3;
            return;
        }
        if (i2 == 63) {
            constraint.f35965O.fD = f3;
            return;
        }
        if (i2 == 79) {
            constraint.nr.Uo = f3;
            return;
        }
        if (i2 == 85) {
            constraint.nr.mUb = f3;
            return;
        }
        if (i2 != 87) {
            if (i2 == 39) {
                constraint.f35965O.f35974E = f3;
                return;
            }
            if (i2 == 40) {
                constraint.f35965O.eF = f3;
                return;
            }
            switch (i2) {
                case 43:
                    constraint.f35967t.nr = f3;
                    break;
                case 44:
                    Transform transform = constraint.J2;
                    transform.ty = f3;
                    transform.az = true;
                    break;
                case 45:
                    constraint.J2.f36007t = f3;
                    break;
                case 46:
                    constraint.J2.nr = f3;
                    break;
                case 47:
                    constraint.J2.f36005O = f3;
                    break;
                case 48:
                    constraint.J2.J2 = f3;
                    break;
                case 49:
                    constraint.J2.Uo = f3;
                    break;
                case 50:
                    constraint.J2.KN = f3;
                    break;
                case 51:
                    constraint.J2.mUb = f3;
                    break;
                case 52:
                    constraint.J2.gh = f3;
                    break;
                case 53:
                    constraint.J2.qie = f3;
                    break;
                default:
                    switch (i2) {
                        case 67:
                            constraint.nr.xMQ = f3;
                            break;
                        case 68:
                            constraint.f35967t.f36002O = f3;
                            break;
                        case 69:
                            constraint.f35965O.Nxk = f3;
                            break;
                        case 70:
                            constraint.f35965O.f35986Y = f3;
                            break;
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                            break;
                    }
                    break;
            }
        }
    }

    public void HI(ConstraintSet constraintSet) {
        this.Uo.clear();
        for (Integer num : constraintSet.Uo.keySet()) {
            Constraint constraint = (Constraint) constraintSet.Uo.get(num);
            if (constraint != null) {
                this.Uo.put(num, constraint.clone());
            }
        }
    }

    public void KN(ConstraintSet constraintSet) {
        for (Constraint constraint : constraintSet.Uo.values()) {
            if (constraint.KN != null) {
                if (constraint.rl == null) {
                    constraint.KN.O(XQ(constraint.f35966n));
                } else {
                    Iterator it = this.Uo.keySet().iterator();
                    while (it.hasNext()) {
                        Constraint constraintXQ = XQ(((Integer) it.next()).intValue());
                        String str = constraintXQ.f35965O.f35992m;
                        if (str != null && constraint.rl.matches(str)) {
                            constraint.KN.O(constraintXQ);
                            constraintXQ.Uo.putAll((HashMap) constraint.Uo.clone());
                        }
                    }
                }
            }
        }
    }

    public Constraint XQ(int i2) {
        if (this.Uo.containsKey(Integer.valueOf(i2))) {
            return (Constraint) this.Uo.get(Integer.valueOf(i2));
        }
        return null;
    }

    public void g(Context context, int i2) {
        String str = aNrWBQYwFf.uIodVDAm;
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    Constraint constraintO = o(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        constraintO.f35965O.f35993n = true;
                    }
                    this.Uo.put(Integer.valueOf(constraintO.f35966n), constraintO);
                }
            }
        } catch (IOException e2) {
            Log.e(str, "Error parsing resource: " + i2, e2);
        } catch (XmlPullParserException e3) {
            Log.e(str, "Error parsing resource: " + i2, e3);
        }
    }

    public void nHg(ConstraintSet constraintSet) {
        for (Integer num : constraintSet.Uo.keySet()) {
            num.intValue();
            Constraint constraint = (Constraint) constraintSet.Uo.get(num);
            if (!this.Uo.containsKey(num)) {
                this.Uo.put(num, new Constraint());
            }
            Constraint constraint2 = (Constraint) this.Uo.get(num);
            if (constraint2 != null) {
                Layout layout = constraint2.f35965O;
                if (!layout.rl) {
                    layout.n(constraint.f35965O);
                }
                PropertySet propertySet = constraint2.f35967t;
                if (!propertySet.f36003n) {
                    propertySet.n(constraint.f35967t);
                }
                Transform transform = constraint2.J2;
                if (!transform.f36006n) {
                    transform.n(constraint.J2);
                }
                Motion motion = constraint2.nr;
                if (!motion.f36000n) {
                    motion.n(constraint.nr);
                }
                for (String str : constraint.Uo.keySet()) {
                    if (!constraint2.Uo.containsKey(str)) {
                        constraint2.Uo.put(str, (ConstraintAttribute) constraint.Uo.get(str));
                    }
                }
            }
        }
    }

    public void qie(int i2, ConstraintLayout.LayoutParams layoutParams) {
        Constraint constraint;
        if (!this.Uo.containsKey(Integer.valueOf(i2)) || (constraint = (Constraint) this.Uo.get(Integer.valueOf(i2))) == null) {
            return;
        }
        constraint.O(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d2, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void te(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            Constraint constraintO = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    switch (xmlPullParser.getName()) {
                        case "Constraint":
                            constraintO = o(context, Xml.asAttributeSet(xmlPullParser), false);
                            break;
                        case "ConstraintOverride":
                            constraintO = o(context, Xml.asAttributeSet(xmlPullParser), true);
                            break;
                        case "Guideline":
                            constraintO = o(context, Xml.asAttributeSet(xmlPullParser), false);
                            Layout layout = constraintO.f35965O;
                            layout.f35993n = true;
                            layout.rl = true;
                            break;
                        case "Barrier":
                            constraintO = o(context, Xml.asAttributeSet(xmlPullParser), false);
                            constraintO.f35965O.f35998z = 1;
                            break;
                        case "PropertySet":
                            if (constraintO == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            constraintO.f35967t.rl(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Transform":
                            if (constraintO == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            constraintO.J2.rl(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Layout":
                            if (constraintO == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            constraintO.f35965O.rl(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Motion":
                            if (constraintO == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            constraintO.nr.rl(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (constraintO == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            ConstraintAttribute.xMQ(context, xmlPullParser, constraintO.Uo);
                            break;
                            break;
                    }
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r6 == 0) {
                        return;
                    }
                    if (r6 == 1 || r6 == 2 || r6 == 3) {
                        this.Uo.put(Integer.valueOf(constraintO.f35966n), constraintO);
                        constraintO = null;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing XML resource", e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing XML resource", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int iF(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        if (resourceId == -1) {
            return typedArray.getInt(i2, -1);
        }
        return resourceId;
    }

    public void Ik(int i2, int i3, int i5, float f3) {
        Layout layout = Z(i2).f35965O;
        layout.te = i3;
        layout.iF = i5;
        layout.fD = f3;
    }

    public void N(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.J2 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.Uo.containsKey(Integer.valueOf(id))) {
                this.Uo.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = (Constraint) this.Uo.get(Integer.valueOf(id));
            if (constraint != null) {
                if (!constraint.f35965O.rl) {
                    constraint.Uo(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        constraint.f35965O.piY = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            constraint.f35965O.pJg = barrier.getAllowsGoneWidget();
                            constraint.f35965O.f35991k = barrier.getType();
                            constraint.f35965O.dR0 = barrier.getMargin();
                        }
                    }
                    constraint.f35965O.rl = true;
                }
                PropertySet propertySet = constraint.f35967t;
                if (!propertySet.f36003n) {
                    propertySet.rl = childAt.getVisibility();
                    constraint.f35967t.nr = childAt.getAlpha();
                    constraint.f35967t.f36003n = true;
                }
                Transform transform = constraint.J2;
                if (!transform.f36006n) {
                    transform.f36006n = true;
                    transform.rl = childAt.getRotation();
                    constraint.J2.f36007t = childAt.getRotationX();
                    constraint.J2.nr = childAt.getRotationY();
                    constraint.J2.f36005O = childAt.getScaleX();
                    constraint.J2.J2 = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        Transform transform2 = constraint.J2;
                        transform2.Uo = pivotX;
                        transform2.KN = pivotY;
                    }
                    constraint.J2.mUb = childAt.getTranslationX();
                    constraint.J2.gh = childAt.getTranslationY();
                    constraint.J2.qie = childAt.getTranslationZ();
                    Transform transform3 = constraint.J2;
                    if (transform3.az) {
                        transform3.ty = childAt.getElevation();
                    }
                }
            }
        }
    }

    public int S(int i2) {
        return Z(i2).f35965O.f35981O;
    }

    public void Uo(ConstraintLayout constraintLayout) {
        Constraint constraint;
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.Uo.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + Debug.nr(childAt));
            } else {
                if (this.J2 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.Uo.containsKey(Integer.valueOf(id)) && (constraint = (Constraint) this.Uo.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.mUb(childAt, constraint.Uo);
                }
            }
        }
    }

    public int ViF(int i2) {
        return Z(i2).f35967t.f36004t;
    }

    public Constraint WPU(int i2) {
        return Z(i2);
    }

    public void Xw(int i2, float f3) {
        Z(i2).f35965O.nY = f3;
    }

    public int aYN(int i2) {
        return Z(i2).f35967t.rl;
    }

    public void az(Context context, int i2) {
        ty((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public void bzg(int i2, float f3) {
        Z(i2).f35965O.ViF = f3;
    }

    public void ck(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.Uo.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraints.getChildAt(i2);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.J2 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.Uo.containsKey(Integer.valueOf(id))) {
                this.Uo.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = (Constraint) this.Uo.get(Integer.valueOf(id));
            if (constraint != null) {
                if (childAt instanceof ConstraintHelper) {
                    constraint.xMQ((ConstraintHelper) childAt, id, layoutParams);
                }
                constraint.KN(id, layoutParams);
            }
        }
    }

    void gh(ConstraintLayout constraintLayout, boolean z2) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.Uo.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.Uo.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + Debug.nr(childAt));
            } else {
                if (this.J2 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.Uo.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        Constraint constraint = (Constraint) this.Uo.get(Integer.valueOf(id));
                        if (constraint != null) {
                            if (childAt instanceof Barrier) {
                                constraint.f35965O.f35998z = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(constraint.f35965O.f35991k);
                                barrier.setMargin(constraint.f35965O.dR0);
                                barrier.setAllowsGoneWidget(constraint.f35965O.pJg);
                                Layout layout = constraint.f35965O;
                                int[] iArr = layout.piY;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = layout.ijL;
                                    if (str != null) {
                                        layout.piY = r(barrier, str);
                                        barrier.setReferencedIds(constraint.f35965O.piY);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.t();
                            constraint.O(layoutParams);
                            if (z2) {
                                ConstraintAttribute.mUb(childAt, constraint.Uo);
                            }
                            childAt.setLayoutParams(layoutParams);
                            PropertySet propertySet = constraint.f35967t;
                            if (propertySet.f36004t == 0) {
                                childAt.setVisibility(propertySet.rl);
                            }
                            childAt.setAlpha(constraint.f35967t.nr);
                            childAt.setRotation(constraint.J2.rl);
                            childAt.setRotationX(constraint.J2.f36007t);
                            childAt.setRotationY(constraint.J2.nr);
                            childAt.setScaleX(constraint.J2.f36005O);
                            childAt.setScaleY(constraint.J2.J2);
                            Transform transform = constraint.J2;
                            if (transform.xMQ != -1) {
                                if (((View) childAt.getParent()).findViewById(constraint.J2.xMQ) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(transform.Uo)) {
                                    childAt.setPivotX(constraint.J2.Uo);
                                }
                                if (!Float.isNaN(constraint.J2.KN)) {
                                    childAt.setPivotY(constraint.J2.KN);
                                }
                            }
                            childAt.setTranslationX(constraint.J2.mUb);
                            childAt.setTranslationY(constraint.J2.gh);
                            childAt.setTranslationZ(constraint.J2.qie);
                            Transform transform2 = constraint.J2;
                            if (transform2.az) {
                                childAt.setElevation(transform2.ty);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            Constraint constraint2 = (Constraint) this.Uo.get(num);
            if (constraint2 != null) {
                if (constraint2.f35965O.f35998z == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    Layout layout2 = constraint2.f35965O;
                    int[] iArr2 = layout2.piY;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = layout2.ijL;
                        if (str2 != null) {
                            layout2.piY = r(barrier2, str2);
                            barrier2.setReferencedIds(constraint2.f35965O.piY);
                        }
                    }
                    barrier2.setType(constraint2.f35965O.f35991k);
                    barrier2.setMargin(constraint2.f35965O.dR0);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.WPU();
                    constraint2.O(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (constraint2.f35965O.f35993n) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    constraint2.O(layoutParamsGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).mUb(constraintLayout);
            }
        }
    }

    public void mUb(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
        Constraint constraint;
        int id = constraintHelper.getId();
        if (this.Uo.containsKey(Integer.valueOf(id)) && (constraint = (Constraint) this.Uo.get(Integer.valueOf(id))) != null && (constraintWidget instanceof HelperWidget)) {
            constraintHelper.ck(constraint, (HelperWidget) constraintWidget, layoutParams, sparseArray);
        }
    }

    public int nY(int i2) {
        return Z(i2).f35965O.nr;
    }

    public void ty(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.Uo.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.J2 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.Uo.containsKey(Integer.valueOf(id))) {
                this.Uo.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = (Constraint) this.Uo.get(Integer.valueOf(id));
            if (constraint != null) {
                constraint.Uo = ConstraintAttribute.rl(this.f35962O, childAt);
                constraint.Uo(id, layoutParams);
                constraint.f35967t.rl = childAt.getVisibility();
                constraint.f35967t.nr = childAt.getAlpha();
                constraint.J2.rl = childAt.getRotation();
                constraint.J2.f36007t = childAt.getRotationX();
                constraint.J2.nr = childAt.getRotationY();
                constraint.J2.f36005O = childAt.getScaleX();
                constraint.J2.J2 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    Transform transform = constraint.J2;
                    transform.Uo = pivotX;
                    transform.KN = pivotY;
                }
                constraint.J2.mUb = childAt.getTranslationX();
                constraint.J2.gh = childAt.getTranslationY();
                constraint.J2.qie = childAt.getTranslationZ();
                Transform transform2 = constraint.J2;
                if (transform2.az) {
                    transform2.ty = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    constraint.f35965O.pJg = barrier.getAllowsGoneWidget();
                    constraint.f35965O.piY = barrier.getReferencedIds();
                    constraint.f35965O.f35991k = barrier.getType();
                    constraint.f35965O.dR0 = barrier.getMargin();
                }
            }
        }
    }
}
