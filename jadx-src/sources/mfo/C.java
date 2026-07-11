package mfo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class C {
    public static final mfo.w6 az = new Dsr(0.5f);
    mfo.w6 J2;
    mfo.w6 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    mfo.w6 f70892O;
    mfo.w6 Uo;
    Wre gh;
    Wre mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Ml f70893n;
    Ml nr;
    Wre qie;
    Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Ml f70894t;
    Wre xMQ;

    public static final class n {
        private mfo.w6 J2;
        private mfo.w6 KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private mfo.w6 f70895O;
        private mfo.w6 Uo;
        private Wre gh;
        private Wre mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Ml f70896n;
        private Ml nr;
        private Wre qie;
        private Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Ml f70897t;
        private Wre xMQ;

        public n() {
            this.f70896n = fuX.rl();
            this.rl = fuX.rl();
            this.f70897t = fuX.rl();
            this.nr = fuX.rl();
            this.f70895O = new mfo.j(0.0f);
            this.J2 = new mfo.j(0.0f);
            this.Uo = new mfo.j(0.0f);
            this.KN = new mfo.j(0.0f);
            this.xMQ = fuX.t();
            this.mUb = fuX.t();
            this.gh = fuX.t();
            this.qie = fuX.t();
        }

        private static float ty(Ml ml) {
            if (ml instanceof aC) {
                return ((aC) ml).f70929n;
            }
            if (ml instanceof I28) {
                return ((I28) ml).f70925n;
            }
            return -1.0f;
        }

        public n E2(float f3) {
            this.J2 = new mfo.j(f3);
            return this;
        }

        public n S(Ml ml) {
            this.f70897t = ml;
            float fTy = ty(ml);
            if (fTy != -1.0f) {
                WPU(fTy);
            }
            return this;
        }

        public n WPU(float f3) {
            this.Uo = new mfo.j(f3);
            return this;
        }

        public n Z(mfo.w6 w6Var) {
            this.KN = w6Var;
            return this;
        }

        public n aYN(mfo.w6 w6Var) {
            this.Uo = w6Var;
            return this;
        }

        public C az() {
            return new C(this);
        }

        public n e(mfo.w6 w6Var) {
            this.J2 = w6Var;
            return this;
        }

        public n fD(Ml ml) {
            this.rl = ml;
            float fTy = ty(ml);
            if (fTy != -1.0f) {
                E2(fTy);
            }
            return this;
        }

        public n g(float f3) {
            this.f70895O = new mfo.j(f3);
            return this;
        }

        public n nY(Ml ml) {
            this.f70896n = ml;
            float fTy = ty(ml);
            if (fTy != -1.0f) {
                g(fTy);
            }
            return this;
        }

        public n o(float f3) {
            this.KN = new mfo.j(f3);
            return this;
        }

        public n r(Ml ml) {
            this.nr = ml;
            float fTy = ty(ml);
            if (fTy != -1.0f) {
                o(fTy);
            }
            return this;
        }

        public n te(mfo.w6 w6Var) {
            this.f70895O = w6Var;
            return this;
        }

        public n HI(float f3) {
            return g(f3).E2(f3).WPU(f3).o(f3);
        }

        public n Ik(int i2, mfo.w6 w6Var) {
            return r(fuX.n(i2)).Z(w6Var);
        }

        public n ViF(int i2, mfo.w6 w6Var) {
            return nY(fuX.n(i2)).te(w6Var);
        }

        public n XQ(int i2, mfo.w6 w6Var) {
            return S(fuX.n(i2)).aYN(w6Var);
        }

        public n ck(mfo.w6 w6Var) {
            return te(w6Var).e(w6Var).aYN(w6Var).Z(w6Var);
        }

        public n iF(int i2, mfo.w6 w6Var) {
            return fD(fuX.n(i2)).e(w6Var);
        }

        public n(C c2) {
            this.f70896n = fuX.rl();
            this.rl = fuX.rl();
            this.f70897t = fuX.rl();
            this.nr = fuX.rl();
            this.f70895O = new mfo.j(0.0f);
            this.J2 = new mfo.j(0.0f);
            this.Uo = new mfo.j(0.0f);
            this.KN = new mfo.j(0.0f);
            this.xMQ = fuX.t();
            this.mUb = fuX.t();
            this.gh = fuX.t();
            this.qie = fuX.t();
            this.f70896n = c2.f70893n;
            this.rl = c2.rl;
            this.f70897t = c2.f70894t;
            this.nr = c2.nr;
            this.f70895O = c2.f70892O;
            this.J2 = c2.J2;
            this.Uo = c2.Uo;
            this.KN = c2.KN;
            this.xMQ = c2.xMQ;
            this.mUb = c2.mUb;
            this.gh = c2.gh;
            this.qie = c2.qie;
        }
    }

    public interface w6 {
        mfo.w6 n(mfo.w6 w6Var);
    }

    public static n O(Context context, AttributeSet attributeSet, int i2, int i3) {
        return J2(context, attributeSet, i2, i3, 0);
    }

    public static n rl(Context context, int i2, int i3) {
        return t(context, i2, i3, 0);
    }

    private C(n nVar) {
        this.f70893n = nVar.f70896n;
        this.rl = nVar.rl;
        this.f70894t = nVar.f70897t;
        this.nr = nVar.nr;
        this.f70892O = nVar.f70895O;
        this.J2 = nVar.J2;
        this.Uo = nVar.Uo;
        this.KN = nVar.KN;
        this.xMQ = nVar.xMQ;
        this.mUb = nVar.mUb;
        this.gh = nVar.gh;
        this.qie = nVar.qie;
    }

    public static n J2(Context context, AttributeSet attributeSet, int i2, int i3, int i5) {
        return Uo(context, attributeSet, i2, i3, new mfo.j(i5));
    }

    public static n Uo(Context context, AttributeSet attributeSet, int i2, int i3, mfo.w6 w6Var) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Rxk.o.f8815CU, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(Rxk.o.Ep, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(Rxk.o.GHt, 0);
        typedArrayObtainStyledAttributes.recycle();
        return nr(context, resourceId, resourceId2, w6Var);
    }

    public static n n() {
        return new n();
    }

    private static n nr(Context context, int i2, int i3, mfo.w6 w6Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(Rxk.o.RzC);
        try {
            int i5 = typedArrayObtainStyledAttributes.getInt(Rxk.o.i0, 0);
            int i7 = typedArrayObtainStyledAttributes.getInt(Rxk.o.f8862ef, i5);
            int i8 = typedArrayObtainStyledAttributes.getInt(Rxk.o.f8858c3, i5);
            int i9 = typedArrayObtainStyledAttributes.getInt(Rxk.o.gVB, i5);
            int i10 = typedArrayObtainStyledAttributes.getInt(Rxk.o.Cw, i5);
            mfo.w6 w6VarAz = az(typedArrayObtainStyledAttributes, Rxk.o.V4, w6Var);
            mfo.w6 w6VarAz2 = az(typedArrayObtainStyledAttributes, Rxk.o.oD, w6VarAz);
            mfo.w6 w6VarAz3 = az(typedArrayObtainStyledAttributes, Rxk.o.xy, w6VarAz);
            mfo.w6 w6VarAz4 = az(typedArrayObtainStyledAttributes, Rxk.o.xif, w6VarAz);
            return new n().ViF(i7, w6VarAz2).iF(i8, w6VarAz3).XQ(i9, w6VarAz4).Ik(i10, az(typedArrayObtainStyledAttributes, Rxk.o.iJ, w6VarAz));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static n t(Context context, int i2, int i3, int i5) {
        return nr(context, i2, i3, new mfo.j(i5));
    }

    public Wre HI() {
        return this.mUb;
    }

    public Ml Ik() {
        return this.f70893n;
    }

    public Wre KN() {
        return this.gh;
    }

    public n S() {
        return new n(this);
    }

    public boolean XQ(RectF rectF) {
        boolean z2 = this.qie.getClass().equals(Wre.class) && this.mUb.getClass().equals(Wre.class) && this.xMQ.getClass().equals(Wre.class) && this.gh.getClass().equals(Wre.class);
        float fN = this.f70892O.n(rectF);
        return z2 && ((this.J2.n(rectF) > fN ? 1 : (this.J2.n(rectF) == fN ? 0 : -1)) == 0 && (this.KN.n(rectF) > fN ? 1 : (this.KN.n(rectF) == fN ? 0 : -1)) == 0 && (this.Uo.n(rectF) > fN ? 1 : (this.Uo.n(rectF) == fN ? 0 : -1)) == 0) && ((this.rl instanceof aC) && (this.f70893n instanceof aC) && (this.f70894t instanceof aC) && (this.nr instanceof aC));
    }

    public mfo.w6 Z() {
        return this.J2;
    }

    public Wre ck() {
        return this.xMQ;
    }

    public Ml gh() {
        return this.f70894t;
    }

    public mfo.w6 mUb() {
        return this.KN;
    }

    public Ml o() {
        return this.rl;
    }

    public mfo.w6 qie() {
        return this.Uo;
    }

    public mfo.w6 r() {
        return this.f70892O;
    }

    public Wre ty() {
        return this.qie;
    }

    public Ml xMQ() {
        return this.nr;
    }

    private static mfo.w6 az(TypedArray typedArray, int i2, mfo.w6 w6Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                return new mfo.j(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i3 == 6) {
                return new Dsr(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return w6Var;
    }

    public C ViF(w6 w6Var) {
        return S().te(w6Var.n(r())).e(w6Var.n(Z())).Z(w6Var.n(mUb())).aYN(w6Var.n(qie())).az();
    }

    public C WPU(float f3) {
        return S().HI(f3).az();
    }

    public C aYN(mfo.w6 w6Var) {
        return S().ck(w6Var).az();
    }

    public C() {
        this.f70893n = fuX.rl();
        this.rl = fuX.rl();
        this.f70894t = fuX.rl();
        this.nr = fuX.rl();
        this.f70892O = new mfo.j(0.0f);
        this.J2 = new mfo.j(0.0f);
        this.Uo = new mfo.j(0.0f);
        this.KN = new mfo.j(0.0f);
        this.xMQ = fuX.t();
        this.mUb = fuX.t();
        this.gh = fuX.t();
        this.qie = fuX.t();
    }
}
