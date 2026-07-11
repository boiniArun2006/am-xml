package com.google.android.material.badge;

import Rxk.C;
import Rxk.Dsr;
import Rxk.Ml;
import Rxk.aC;
import Rxk.o;
import X4.w6;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.eO;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class BadgeState {
    final float J2;
    final float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final float f58620O;
    final float Uo;
    int gh;
    final int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final State f58621n;
    final float nr;
    private final State rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final float f58622t;
    final int xMQ;

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new j();

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private Integer f58623B;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private Integer f58624D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private Integer f58625E;
        private String E2;

        /* JADX INFO: renamed from: FX, reason: collision with root package name */
        private Integer f58626FX;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private Boolean f58627I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private Integer f58628J;
        private Integer J2;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private Integer f58629M;
        private Boolean M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private Locale f58630N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Integer f58631O;
        private Integer P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private Integer f58632S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private int f58633T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        private int f58634U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private int f58635X;
        private CharSequence Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private Integer f58636Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f58637a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f58638e;
        private Integer eF;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f58639g;
        private int jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f58640n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Integer f58641o;
        private Integer p5;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Integer f58642r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f58643t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private CharSequence f58644v;

        class j implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public State[] newArray(int i2) {
                return new State[i2];
            }

            j() {
            }
        }

        public State() {
            this.f58639g = 255;
            this.f58638e = -2;
            this.f58635X = -2;
            this.f58633T = -2;
            this.M7 = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f58640n);
            parcel.writeSerializable(this.f58643t);
            parcel.writeSerializable(this.f58631O);
            parcel.writeSerializable(this.J2);
            parcel.writeSerializable(this.f58642r);
            parcel.writeSerializable(this.f58641o);
            parcel.writeSerializable(this.f58636Z);
            parcel.writeSerializable(this.f58632S);
            parcel.writeInt(this.f58639g);
            parcel.writeString(this.E2);
            parcel.writeInt(this.f58638e);
            parcel.writeInt(this.f58635X);
            parcel.writeInt(this.f58633T);
            CharSequence charSequence = this.f58644v;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.Xw;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.jB);
            parcel.writeSerializable(this.P5);
            parcel.writeSerializable(this.p5);
            parcel.writeSerializable(this.eF);
            parcel.writeSerializable(this.f58625E);
            parcel.writeSerializable(this.f58629M);
            parcel.writeSerializable(this.f58626FX);
            parcel.writeSerializable(this.f58623B);
            parcel.writeSerializable(this.f58637a);
            parcel.writeSerializable(this.f58628J);
            parcel.writeSerializable(this.f58624D);
            parcel.writeSerializable(this.M7);
            parcel.writeSerializable(this.f58630N);
            parcel.writeSerializable(this.f58627I);
        }

        State(Parcel parcel) {
            this.f58639g = 255;
            this.f58638e = -2;
            this.f58635X = -2;
            this.f58633T = -2;
            this.M7 = Boolean.TRUE;
            this.f58640n = parcel.readInt();
            this.f58643t = (Integer) parcel.readSerializable();
            this.f58631O = (Integer) parcel.readSerializable();
            this.J2 = (Integer) parcel.readSerializable();
            this.f58642r = (Integer) parcel.readSerializable();
            this.f58641o = (Integer) parcel.readSerializable();
            this.f58636Z = (Integer) parcel.readSerializable();
            this.f58632S = (Integer) parcel.readSerializable();
            this.f58639g = parcel.readInt();
            this.E2 = parcel.readString();
            this.f58638e = parcel.readInt();
            this.f58635X = parcel.readInt();
            this.f58633T = parcel.readInt();
            this.f58644v = parcel.readString();
            this.Xw = parcel.readString();
            this.jB = parcel.readInt();
            this.P5 = (Integer) parcel.readSerializable();
            this.p5 = (Integer) parcel.readSerializable();
            this.eF = (Integer) parcel.readSerializable();
            this.f58625E = (Integer) parcel.readSerializable();
            this.f58629M = (Integer) parcel.readSerializable();
            this.f58626FX = (Integer) parcel.readSerializable();
            this.f58623B = (Integer) parcel.readSerializable();
            this.f58637a = (Integer) parcel.readSerializable();
            this.f58628J = (Integer) parcel.readSerializable();
            this.f58624D = (Integer) parcel.readSerializable();
            this.M7 = (Boolean) parcel.readSerializable();
            this.f58630N = (Locale) parcel.readSerializable();
            this.f58627I = (Boolean) parcel.readSerializable();
        }
    }

    BadgeState(Context context, int i2, int i3, int i5, State state) {
        State state2 = new State();
        this.rl = state2;
        state = state == null ? new State() : state;
        if (i2 != 0) {
            state.f58640n = i2;
        }
        TypedArray typedArrayN = n(context, state.f58640n, i3, i5);
        Resources resources = context.getResources();
        this.f58622t = typedArrayN.getDimensionPixelSize(o.ViF, -1);
        this.xMQ = context.getResources().getDimensionPixelSize(Ml.jB);
        this.mUb = context.getResources().getDimensionPixelSize(Ml.P5);
        this.nr = typedArrayN.getDimensionPixelSize(o.f8832N, -1);
        int i7 = o.f8850X;
        int i8 = Ml.ty;
        this.f58620O = typedArrayN.getDimension(i7, resources.getDimension(i8));
        int i9 = o.wTp;
        int i10 = Ml.HI;
        this.Uo = typedArrayN.getDimension(i9, resources.getDimension(i10));
        this.J2 = typedArrayN.getDimension(o.aYN, resources.getDimension(i8));
        this.KN = typedArrayN.getDimension(o.f8844T, resources.getDimension(i10));
        boolean z2 = true;
        this.gh = typedArrayN.getInt(o.P5, 1);
        state2.f58639g = state.f58639g == -2 ? 255 : state.f58639g;
        if (state.f58638e != -2) {
            state2.f58638e = state.f58638e;
        } else {
            int i11 = o.f8845U;
            if (typedArrayN.hasValue(i11)) {
                state2.f58638e = typedArrayN.getInt(i11, 0);
            } else {
                state2.f58638e = -1;
            }
        }
        if (state.E2 != null) {
            state2.E2 = state.E2;
        } else {
            int i12 = o.te;
            if (typedArrayN.hasValue(i12)) {
                state2.E2 = typedArrayN.getString(i12);
            }
        }
        state2.f58644v = state.f58644v;
        state2.Xw = state.Xw == null ? context.getString(aC.mUb) : state.Xw;
        state2.jB = state.jB == 0 ? Dsr.f8731n : state.jB;
        state2.f58634U = state.f58634U == 0 ? aC.HI : state.f58634U;
        if (state.M7 != null && !state.M7.booleanValue()) {
            z2 = false;
        }
        state2.M7 = Boolean.valueOf(z2);
        state2.f58635X = state.f58635X == -2 ? typedArrayN.getInt(o.Xw, -2) : state.f58635X;
        state2.f58633T = state.f58633T == -2 ? typedArrayN.getInt(o.jB, -2) : state.f58633T;
        state2.f58642r = Integer.valueOf(state.f58642r == null ? typedArrayN.getResourceId(o.nY, C.rl) : state.f58642r.intValue());
        state2.f58641o = Integer.valueOf(state.f58641o == null ? typedArrayN.getResourceId(o.f8866g, 0) : state.f58641o.intValue());
        state2.f58636Z = Integer.valueOf(state.f58636Z == null ? typedArrayN.getResourceId(o.nHg, C.rl) : state.f58636Z.intValue());
        state2.f58632S = Integer.valueOf(state.f58632S == null ? typedArrayN.getResourceId(o.s7N, 0) : state.f58632S.intValue());
        state2.f58643t = Integer.valueOf(state.f58643t == null ? X(context, typedArrayN, o.f8841S) : state.f58643t.intValue());
        state2.J2 = Integer.valueOf(state.J2 == null ? typedArrayN.getResourceId(o.iF, C.f8722O) : state.J2.intValue());
        if (state.f58631O != null) {
            state2.f58631O = state.f58631O;
        } else {
            int i13 = o.fD;
            if (typedArrayN.hasValue(i13)) {
                state2.f58631O = Integer.valueOf(X(context, typedArrayN, i13));
            } else {
                state2.f58631O = Integer.valueOf(new X4.Ml(context, state2.J2.intValue()).xMQ().getDefaultColor());
            }
        }
        state2.P5 = Integer.valueOf(state.P5 == null ? typedArrayN.getInt(o.WPU, 8388661) : state.P5.intValue());
        state2.p5 = Integer.valueOf(state.p5 == null ? typedArrayN.getDimensionPixelSize(o.f8861e, resources.getDimensionPixelSize(Ml.f8747U)) : state.p5.intValue());
        state2.eF = Integer.valueOf(state.eF == null ? typedArrayN.getDimensionPixelSize(o.E2, resources.getDimensionPixelSize(Ml.ck)) : state.eF.intValue());
        state2.f58625E = Integer.valueOf(state.f58625E == null ? typedArrayN.getDimensionPixelOffset(o.f8885v, 0) : state.f58625E.intValue());
        state2.f58629M = Integer.valueOf(state.f58629M == null ? typedArrayN.getDimensionPixelOffset(o.M7, 0) : state.f58629M.intValue());
        state2.f58626FX = Integer.valueOf(state.f58626FX == null ? typedArrayN.getDimensionPixelOffset(o.rV9, state2.f58625E.intValue()) : state.f58626FX.intValue());
        state2.f58623B = Integer.valueOf(state.f58623B == null ? typedArrayN.getDimensionPixelOffset(o.p5, state2.f58629M.intValue()) : state.f58623B.intValue());
        state2.f58637a = Integer.valueOf(state.f58637a == null ? typedArrayN.getDimensionPixelOffset(o.bzg, 0) : state.f58637a.intValue());
        state2.f58628J = Integer.valueOf(state.f58628J == null ? 0 : state.f58628J.intValue());
        state2.f58624D = Integer.valueOf(state.f58624D == null ? 0 : state.f58624D.intValue());
        state2.f58627I = Boolean.valueOf(state.f58627I == null ? typedArrayN.getBoolean(o.XQ, false) : state.f58627I.booleanValue());
        typedArrayN.recycle();
        if (state.f58630N == null) {
            state2.f58630N = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.f58630N = state.f58630N;
        }
        this.f58621n = state;
    }

    private TypedArray n(Context context, int i2, int i3, int i5) {
        AttributeSet attributeSetXMQ;
        int styleAttribute;
        if (i2 != 0) {
            attributeSetXMQ = com.google.android.material.drawable.Ml.xMQ(context, i2, "badge");
            styleAttribute = attributeSetXMQ.getStyleAttribute();
        } else {
            attributeSetXMQ = null;
            styleAttribute = 0;
        }
        return eO.xMQ(context, attributeSetXMQ, o.f8852Z, i3, styleAttribute == 0 ? i5 : styleAttribute, new int[0]);
    }

    boolean E2() {
        return this.rl.f58627I.booleanValue();
    }

    CharSequence HI() {
        return this.rl.f58644v;
    }

    int Ik() {
        return this.rl.jB;
    }

    int J2() {
        return this.rl.P5.intValue();
    }

    int KN() {
        return this.rl.f58641o.intValue();
    }

    int O() {
        return this.rl.f58643t.intValue();
    }

    int S() {
        return this.rl.f58633T;
    }

    void T(int i2) {
        this.f58621n.f58639g = i2;
        this.rl.f58639g = i2;
    }

    int Uo() {
        return this.rl.p5.intValue();
    }

    String ViF() {
        return this.rl.E2;
    }

    int WPU() {
        return this.rl.f58638e;
    }

    int XQ() {
        return this.rl.f58635X;
    }

    int Z() {
        return this.rl.f58637a.intValue();
    }

    Locale aYN() {
        return this.rl.f58630N;
    }

    int az() {
        return this.rl.f58636Z.intValue();
    }

    CharSequence ck() {
        return this.rl.Xw;
    }

    boolean e() {
        return this.rl.M7.booleanValue();
    }

    boolean fD() {
        return this.rl.E2 != null;
    }

    int g() {
        return this.rl.f58623B.intValue();
    }

    int gh() {
        return this.rl.eF.intValue();
    }

    boolean iF() {
        return this.rl.f58638e != -1;
    }

    int mUb() {
        return this.rl.f58631O.intValue();
    }

    int nY() {
        return this.rl.J2.intValue();
    }

    int nr() {
        return this.rl.f58639g;
    }

    int o() {
        return this.rl.f58625E.intValue();
    }

    int qie() {
        return this.rl.f58632S.intValue();
    }

    int r() {
        return this.rl.f58626FX.intValue();
    }

    int rl() {
        return this.rl.f58628J.intValue();
    }

    int t() {
        return this.rl.f58624D.intValue();
    }

    int te() {
        return this.rl.f58629M.intValue();
    }

    int ty() {
        return this.rl.f58634U;
    }

    int xMQ() {
        return this.rl.f58642r.intValue();
    }

    private static int X(Context context, TypedArray typedArray, int i2) {
        return w6.n(context, typedArray, i2).getDefaultColor();
    }
}
