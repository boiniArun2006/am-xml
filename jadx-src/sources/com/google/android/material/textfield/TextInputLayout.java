package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import mfo.C;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f59291f = Rxk.C.ty;
    private static final int[][] ub = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Fade f59292B;
    private boolean Bu;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f59293C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ColorStateList f59294D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private ColorStateList f59295E;
    private int E2;
    private ColorStateList ER;
    private int EWS;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f59296F;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private Fade f59297FX;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private int f59298G7;
    private final LinkedHashSet GD;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private boolean f59299GR;
    private int HV;
    private int How;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private ColorStateList f59300I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private ColorStateList f59301J;
    EditText J2;
    private final Rect Jk;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f59302K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f59303M;
    private CharSequence M7;
    private int Mx;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f59304N;
    private CharSequence Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final QJ f59305O;
    private Drawable Org;
    private int P5;
    private Drawable Po6;
    private boolean QZ6;
    private int RQ;
    private final Rect Rl;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f59306S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    boolean f59307T;
    private ValueAnimator T3L;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f59308U;
    private boolean Uf;
    private ColorStateList UhV;
    private boolean VwL;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f59309W;
    private I28 Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ColorStateList f59310a;
    private int a63;
    private mfo.CN3 dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s4 f59311e;
    private TextView eF;
    private mfo.CN3 eTf;
    private int eWT;
    private int fcU;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f59312g;
    private Drawable hRu;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ColorStateList f59313i;
    private boolean ijL;
    private TextView jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f59314k;
    private int kSg;
    private int lLA;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private mfo.CN3 f59315m;
    private boolean mI;
    private Typeface mYa;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FrameLayout f59316n;
    private int n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f59317o;
    private final int ofS;
    private boolean p0N;
    private boolean p5;
    private boolean pJg;
    private StateListDrawable piY;
    private final RectF qm;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f59318r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ci f59319t;
    final com.google.android.material.internal.j tFV;
    private int tUK;
    private int ul;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f59320v;
    private mfo.C xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private mfo.CN3 f59321z;

    public interface I28 {
        int n(Editable editable);
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new j();
        boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        CharSequence f59322O;

        class j implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            j() {
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f59322O = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.J2 = parcel.readInt() == 1;
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f59322O) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            TextUtils.writeToParcel(this.f59322O, parcel, i2);
            parcel.writeInt(this.J2 ? 1 : 0);
        }
    }

    public interface Wre {
        void n(TextInputLayout textInputLayout);
    }

    class j implements TextWatcher {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f59324n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ EditText f59325t;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        j(EditText editText) {
            this.f59325t = editText;
            this.f59324n = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.Mx(!r0.p0N);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f59307T) {
                textInputLayout.dR0(editable);
            }
            if (TextInputLayout.this.p5) {
                TextInputLayout.this.ul(editable);
            }
            int lineCount = this.f59325t.getLineCount();
            int i2 = this.f59324n;
            if (lineCount != i2) {
                if (lineCount < i2) {
                    int iG = ViewCompat.g(this.f59325t);
                    int i3 = TextInputLayout.this.f59296F;
                    if (iG != i3) {
                        this.f59325t.setMinimumHeight(i3);
                    }
                }
                this.f59324n = lineCount;
            }
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f59305O.KN();
        }
    }

    class w6 implements ValueAnimator.AnimatorUpdateListener {
        w6() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.tFV.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, Rxk.n.f8795FX);
    }

    void Mx(boolean z2) {
        G7(z2, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.p0N = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.p0N = false;
    }

    public void setEndIconContentDescription(@StringRes int i2) {
        this.f59305O.Xw(i2);
    }

    public void setEndIconDrawable(@DrawableRes int i2) {
        this.f59305O.U(i2);
    }

    public void setErrorIconDrawable(@DrawableRes int i2) {
        this.f59305O.D(i2);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.f59299GR) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i2) {
        this.f59305O.dR0(i2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i2) {
        this.f59305O.piY(i2);
    }

    public void setStartIconContentDescription(@StringRes int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(@DrawableRes int i2) {
        setStartIconDrawable(i2 != 0 ? AppCompatResources.rl(getContext(), i2) : null);
    }

    public static class Ml extends AccessibilityDelegateCompat {
        private final TextInputLayout nr;

        public Ml(TextInputLayout textInputLayout) {
            this.nr = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void KN(View view, AccessibilityEvent accessibilityEvent) {
            super.KN(view, accessibilityEvent);
            this.nr.f59305O.az().ck(view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            CharSequence text;
            boolean z2;
            String string;
            super.Uo(view, accessibilityNodeInfoCompat);
            EditText editText = this.nr.getEditText();
            if (editText != null) {
                text = editText.getText();
            } else {
                text = null;
            }
            CharSequence hint = this.nr.getHint();
            CharSequence error = this.nr.getError();
            CharSequence placeholderText = this.nr.getPlaceholderText();
            int counterMaxLength = this.nr.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.nr.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zXw = this.nr.Xw();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            if (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!zIsEmpty2) {
                string = hint.toString();
            } else {
                string = "";
            }
            this.nr.f59319t.g(accessibilityNodeInfoCompat);
            if (!zIsEmpty) {
                accessibilityNodeInfoCompat.Bu(text);
            } else if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfoCompat.Bu(string);
                if (!zXw && placeholderText != null) {
                    accessibilityNodeInfoCompat.Bu(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.Bu(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.GD(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    accessibilityNodeInfoCompat.Bu(string);
                }
                accessibilityNodeInfoCompat.tFV(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.i(counterMaxLength);
            if (z2) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.Rl(error);
            }
            View viewZ = this.nr.f59311e.Z();
            if (viewZ != null) {
                accessibilityNodeInfoCompat.EWS(viewZ);
            }
            this.nr.f59305O.az().HI(view, accessibilityNodeInfoCompat);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f59291f;
        super(scw.j.t(context, attributeSet, i2, i3), attributeSet, i2);
        this.f59317o = -1;
        this.f59306S = -1;
        this.f59312g = -1;
        this.E2 = -1;
        this.f59311e = new s4(this);
        this.Xw = new I28() { // from class: com.google.android.material.textfield.qf
            @Override // com.google.android.material.textfield.TextInputLayout.I28
            public final int n(Editable editable) {
                return TextInputLayout.rl(editable);
            }
        };
        this.Jk = new Rect();
        this.Rl = new Rect();
        this.qm = new RectF();
        this.GD = new LinkedHashSet();
        com.google.android.material.internal.j jVar = new com.google.android.material.internal.j(this);
        this.tFV = jVar;
        this.Uf = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f59316n = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = G7.j.f3385n;
        jVar.k(timeInterpolator);
        jVar.GR(timeInterpolator);
        jVar.P5(8388659);
        int[] iArr = Rxk.o.cm;
        int i5 = Rxk.o.tYa;
        int i7 = Rxk.o.Gx9;
        int i8 = Rxk.o.drE;
        int i9 = Rxk.o.kl6;
        int i10 = Rxk.o.nRv;
        TintTypedArray tintTypedArrayMUb = com.google.android.material.internal.eO.mUb(context2, attributeSet, iArr, i2, i3, i5, i7, i8, i9, i10);
        ci ciVar = new ci(this, tintTypedArrayMUb);
        this.f59319t = ciVar;
        this.f59299GR = tintTypedArrayMUb.n(Rxk.o.Ubr, true);
        setHint(tintTypedArrayMUb.ck(Rxk.o.Eq));
        this.mI = tintTypedArrayMUb.n(Rxk.o.f8826JP, true);
        this.VwL = tintTypedArrayMUb.n(Rxk.o.s5a, true);
        int i11 = Rxk.o.WwU;
        if (tintTypedArrayMUb.o(i11)) {
            setMinEms(tintTypedArrayMUb.gh(i11, -1));
        } else {
            int i12 = Rxk.o.sPk;
            if (tintTypedArrayMUb.o(i12)) {
                setMinWidth(tintTypedArrayMUb.J2(i12, -1));
            }
        }
        int i13 = Rxk.o.CUD;
        if (tintTypedArrayMUb.o(i13)) {
            setMaxEms(tintTypedArrayMUb.gh(i13, -1));
        } else {
            int i14 = Rxk.o.ag;
            if (tintTypedArrayMUb.o(i14)) {
                setMaxWidth(tintTypedArrayMUb.J2(i14, -1));
            }
        }
        this.xg = mfo.C.O(context2, attributeSet, i2, i3).az();
        this.ofS = context2.getResources().getDimensionPixelOffset(Rxk.Ml.f8755m);
        this.Mx = tintTypedArrayMUb.O(Rxk.o.Gy, 0);
        this.fcU = tintTypedArrayMUb.J2(Rxk.o.T6, context2.getResources().getDimensionPixelSize(Rxk.Ml.eTf));
        this.eWT = tintTypedArrayMUb.J2(Rxk.o.LSw, context2.getResources().getDimensionPixelSize(Rxk.Ml.xg));
        this.f59298G7 = this.fcU;
        float fNr = tintTypedArrayMUb.nr(Rxk.o.Gd, -1.0f);
        float fNr2 = tintTypedArrayMUb.nr(Rxk.o.Kkh, -1.0f);
        float fNr3 = tintTypedArrayMUb.nr(Rxk.o.vF, -1.0f);
        float fNr4 = tintTypedArrayMUb.nr(Rxk.o.sl, -1.0f);
        C.n nVarS = this.xg.S();
        if (fNr >= 0.0f) {
            nVarS.g(fNr);
        }
        if (fNr2 >= 0.0f) {
            nVarS.E2(fNr2);
        }
        if (fNr3 >= 0.0f) {
            nVarS.WPU(fNr3);
        }
        if (fNr4 >= 0.0f) {
            nVarS.o(fNr4);
        }
        this.xg = nVarS.az();
        ColorStateList colorStateListRl = X4.w6.rl(context2, tintTypedArrayMUb, Rxk.o.Jeq);
        if (colorStateListRl != null) {
            int defaultColor = colorStateListRl.getDefaultColor();
            this.lLA = defaultColor;
            this.n1 = defaultColor;
            if (colorStateListRl.isStateful()) {
                this.kSg = colorStateListRl.getColorForState(new int[]{-16842910}, -1);
                this.f59309W = colorStateListRl.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.RQ = colorStateListRl.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f59309W = this.lLA;
                ColorStateList colorStateListN = AppCompatResources.n(context2, Rxk.w6.f8894t);
                this.kSg = colorStateListN.getColorForState(new int[]{-16842910}, -1);
                this.RQ = colorStateListN.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.n1 = 0;
            this.lLA = 0;
            this.kSg = 0;
            this.f59309W = 0;
            this.RQ = 0;
        }
        int i15 = Rxk.o.f8877oh;
        if (tintTypedArrayMUb.o(i15)) {
            ColorStateList colorStateListT = tintTypedArrayMUb.t(i15);
            this.f59313i = colorStateListT;
            this.UhV = colorStateListT;
        }
        int i16 = Rxk.o.aeB;
        ColorStateList colorStateListRl2 = X4.w6.rl(context2, tintTypedArrayMUb, i16);
        this.tUK = tintTypedArrayMUb.rl(i16, 0);
        this.f59302K = ContextCompat.getColor(context2, Rxk.w6.nr);
        this.a63 = ContextCompat.getColor(context2, Rxk.w6.f8892O);
        this.How = ContextCompat.getColor(context2, Rxk.w6.J2);
        if (colorStateListRl2 != null) {
            setBoxStrokeColorStateList(colorStateListRl2);
        }
        int i17 = Rxk.o.f8848WJ;
        if (tintTypedArrayMUb.o(i17)) {
            setBoxStrokeErrorColor(X4.w6.rl(context2, tintTypedArrayMUb, i17));
        }
        if (tintTypedArrayMUb.ty(i10, -1) != -1) {
            setHintTextAppearance(tintTypedArrayMUb.ty(i10, 0));
        }
        this.f59310a = tintTypedArrayMUb.t(Rxk.o.kI);
        this.f59300I = tintTypedArrayMUb.t(Rxk.o.HeJ);
        int iTy = tintTypedArrayMUb.ty(i8, 0);
        CharSequence charSequenceCk = tintTypedArrayMUb.ck(Rxk.o.Jz1);
        int iGh = tintTypedArrayMUb.gh(Rxk.o.Kb, 1);
        boolean zN = tintTypedArrayMUb.n(Rxk.o.f8842S2, false);
        int iTy2 = tintTypedArrayMUb.ty(i9, 0);
        boolean zN2 = tintTypedArrayMUb.n(Rxk.o.nfh, false);
        CharSequence charSequenceCk2 = tintTypedArrayMUb.ck(Rxk.o.E6J);
        int iTy3 = tintTypedArrayMUb.ty(Rxk.o.IZz, 0);
        CharSequence charSequenceCk3 = tintTypedArrayMUb.ck(Rxk.o.YR2);
        boolean zN3 = tintTypedArrayMUb.n(Rxk.o.TVz, false);
        setCounterMaxLength(tintTypedArrayMUb.gh(Rxk.o.LeN, -1));
        this.P5 = tintTypedArrayMUb.ty(i5, 0);
        this.f59308U = tintTypedArrayMUb.ty(i7, 0);
        setBoxBackgroundMode(tintTypedArrayMUb.gh(Rxk.o.flZ, 0));
        setErrorContentDescription(charSequenceCk);
        setErrorAccessibilityLiveRegion(iGh);
        setCounterOverflowTextAppearance(this.f59308U);
        setHelperTextTextAppearance(iTy2);
        setErrorTextAppearance(iTy);
        setCounterTextAppearance(this.P5);
        setPlaceholderText(charSequenceCk3);
        setPlaceholderTextAppearance(iTy3);
        int i18 = Rxk.o.OWw;
        if (tintTypedArrayMUb.o(i18)) {
            setErrorTextColor(tintTypedArrayMUb.t(i18));
        }
        int i19 = Rxk.o.f8889y8;
        if (tintTypedArrayMUb.o(i19)) {
            setHelperTextColor(tintTypedArrayMUb.t(i19));
        }
        int i20 = Rxk.o.tWM;
        if (tintTypedArrayMUb.o(i20)) {
            setHintTextColor(tintTypedArrayMUb.t(i20));
        }
        int i21 = Rxk.o.bGT;
        if (tintTypedArrayMUb.o(i21)) {
            setCounterTextColor(tintTypedArrayMUb.t(i21));
        }
        int i22 = Rxk.o.NT;
        if (tintTypedArrayMUb.o(i22)) {
            setCounterOverflowTextColor(tintTypedArrayMUb.t(i22));
        }
        int i23 = Rxk.o.AUF;
        if (tintTypedArrayMUb.o(i23)) {
            setPlaceholderTextColor(tintTypedArrayMUb.t(i23));
        }
        QJ qj = new QJ(this, tintTypedArrayMUb);
        this.f59305O = qj;
        boolean zN4 = tintTypedArrayMUb.n(Rxk.o.f3k, true);
        tintTypedArrayMUb.aYN();
        ViewCompat.ul(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            ViewCompat.Jk(this, 1);
        }
        frameLayout.addView(ciVar);
        frameLayout.addView(qj);
        addView(frameLayout);
        setEnabled(zN4);
        setHelperTextEnabled(zN2);
        setErrorEnabled(zN);
        setCounterEnabled(zN3);
        setHelperText(charSequenceCk2);
    }

    private void B() {
        EditText editText = this.J2;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i2 = this.f59293C;
                if (i2 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i2 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private void C() {
        if (this.f59293C != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f59316n.getLayoutParams();
            int iS = S();
            if (iS != layoutParams.topMargin) {
                layoutParams.topMargin = iS;
                this.f59316n.requestLayout();
            }
        }
    }

    private void E2(Canvas canvas) {
        if (this.f59299GR) {
            this.tFV.qie(canvas);
        }
    }

    private void FX() {
        TextView textView = this.eF;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void GR() {
        if (this.eF == null || !this.p5 || TextUtils.isEmpty(this.M7)) {
            return;
        }
        this.eF.setText(this.M7);
        TransitionManager.n(this.f59316n, this.f59297FX);
        this.eF.setVisibility(0);
        this.eF.bringToFront();
        announceForAccessibility(this.M7);
    }

    private void HI(RectF rectF) {
        float f3 = rectF.left;
        int i2 = this.ofS;
        rectF.left = f3 - i2;
        rectF.right += i2;
    }

    private int Ik() {
        return this.f59293C == 1 ? W3.j.xMQ(W3.j.O(this, Rxk.n.ty, 0), this.n1) : this.n1;
    }

    private int N(int i2, boolean z2) {
        return i2 + ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.J2.getCompoundPaddingLeft() : this.f59305O.ViF() : this.f59319t.t());
    }

    private void Nxk() {
        if (this.f59293C == 1) {
            if (X4.w6.xMQ(getContext())) {
                this.Mx = getResources().getDimensionPixelSize(Rxk.Ml.f8752e);
            } else if (X4.w6.KN(getContext())) {
                this.Mx = getResources().getDimensionPixelSize(Rxk.Ml.E2);
            }
        }
    }

    private boolean P5() {
        return this.f59293C == 1 && this.J2.getMinLines() <= 1;
    }

    private int S() {
        float fIk;
        if (!this.f59299GR) {
            return 0;
        }
        int i2 = this.f59293C;
        if (i2 == 0) {
            fIk = this.tFV.Ik();
        } else {
            if (i2 != 2) {
                return 0;
            }
            fIk = this.tFV.Ik() / 2.0f;
        }
        return (int) fIk;
    }

    private boolean WPU() {
        return this.f59293C == 2 && aYN();
    }

    private Rect XQ(Rect rect) {
        if (this.J2 == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.Rl;
        float fWPU = this.tFV.WPU();
        rect2.left = rect.left + this.J2.getCompoundPaddingLeft();
        rect2.top = Z(rect, fWPU);
        rect2.right = rect.right - this.J2.getCompoundPaddingRight();
        rect2.bottom = o(rect, rect2, fWPU);
        return rect2;
    }

    private void Y(Rect rect) {
        mfo.CN3 cn3 = this.f59315m;
        if (cn3 != null) {
            int i2 = rect.bottom;
            cn3.setBounds(rect.left, i2 - this.fcU, rect.right, i2);
        }
        mfo.CN3 cn32 = this.eTf;
        if (cn32 != null) {
            int i3 = rect.bottom;
            cn32.setBounds(rect.left, i3 - this.eWT, rect.right, i3);
        }
    }

    private boolean a() {
        return (this.f59305O.X() || ((this.f59305O.g() && v()) || this.f59305O.WPU() != null)) && this.f59305O.getMeasuredWidth() > 0;
    }

    private boolean aYN() {
        return this.f59298G7 > -1 && this.ul != 0;
    }

    private void az() {
        mfo.CN3 cn3 = this.dR0;
        if (cn3 == null) {
            return;
        }
        mfo.C cG = cn3.g();
        mfo.C c2 = this.xg;
        if (cG != c2) {
            this.dR0.setShapeAppearanceModel(c2);
        }
        if (WPU()) {
            this.dR0.FX(this.f59298G7, this.ul);
        }
        int iIk = Ik();
        this.n1 = iIk;
        this.dR0.p5(ColorStateList.valueOf(iIk));
        ty();
        pJg();
    }

    private void ck() {
        int i2 = this.f59293C;
        if (i2 == 0) {
            this.dR0 = null;
            this.f59315m = null;
            this.eTf = null;
            return;
        }
        if (i2 == 1) {
            this.dR0 = new mfo.CN3(this.xg);
            this.f59315m = new mfo.CN3();
            this.eTf = new mfo.CN3();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(this.f59293C + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f59299GR || (this.dR0 instanceof fuX)) {
                this.dR0 = new mfo.CN3(this.xg);
            } else {
                this.dR0 = fuX.k(this.xg);
            }
            this.f59315m = null;
            this.eTf = null;
        }
    }

    private void e(boolean z2) {
        ValueAnimator valueAnimator = this.T3L;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.T3L.cancel();
        }
        if (z2 && this.mI) {
            qie(0.0f);
        } else {
            this.tFV.a(0.0f);
        }
        if (te() && ((fuX) this.dR0).dR0()) {
            ViF();
        }
        this.QZ6 = true;
        wTp();
        this.f59319t.qie(true);
        this.f59305O.T(true);
    }

    private void eWT() {
        EditText editText = this.J2;
        ul(editText == null ? null : editText.getText());
    }

    private void fD(Canvas canvas) {
        mfo.CN3 cn3;
        if (this.eTf == null || (cn3 = this.f59315m) == null) {
            return;
        }
        cn3.draw(canvas);
        if (this.J2.isFocused()) {
            Rect bounds = this.eTf.getBounds();
            Rect bounds2 = this.f59315m.getBounds();
            float fAYN = this.tFV.aYN();
            int iCenterX = bounds2.centerX();
            bounds.left = G7.j.t(iCenterX, bounds2.left, fAYN);
            bounds.right = G7.j.t(iCenterX, bounds2.right, fAYN);
            this.eTf.draw(canvas);
        }
    }

    private void fcU() {
        EditText editText;
        if (this.eF == null || (editText = this.J2) == null) {
            return;
        }
        this.eF.setGravity(editText.getGravity());
        this.eF.setPadding(this.J2.getCompoundPaddingLeft(), this.J2.getCompoundPaddingTop(), this.J2.getCompoundPaddingRight(), this.J2.getCompoundPaddingBottom());
    }

    private Fade g() {
        Fade fade = new Fade();
        fade.k(IzQ.fuX.J2(getContext(), Rxk.n.f8805e, 87));
        fade.z(IzQ.fuX.Uo(getContext(), Rxk.n.s7N, G7.j.f3385n));
        return fade;
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.J2;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC1893z.n(editText)) {
            return this.dR0;
        }
        int iNr = W3.j.nr(this.J2, Rxk.n.xMQ);
        int i2 = this.f59293C;
        if (i2 == 2) {
            return s7N(getContext(), this.dR0, iNr, ub);
        }
        if (i2 == 1) {
            return T(this.dR0, this.n1, iNr, ub);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.piY == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.piY = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.piY.addState(new int[0], X(false));
        }
        return this.piY;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f59321z == null) {
            this.f59321z = X(true);
        }
        return this.f59321z;
    }

    private void gh() {
        if (this.J2 == null || this.f59293C != 1) {
            return;
        }
        if (X4.w6.xMQ(getContext())) {
            EditText editText = this.J2;
            ViewCompat.HV(editText, ViewCompat.E2(editText), getResources().getDimensionPixelSize(Rxk.Ml.fD), ViewCompat.fD(this.J2), getResources().getDimensionPixelSize(Rxk.Ml.iF));
        } else if (X4.w6.KN(getContext())) {
            EditText editText2 = this.J2;
            ViewCompat.HV(editText2, ViewCompat.E2(editText2), getResources().getDimensionPixelSize(Rxk.Ml.te), ViewCompat.fD(this.J2), getResources().getDimensionPixelSize(Rxk.Ml.f8753g));
        }
    }

    private void iF() {
        Iterator it = this.GD.iterator();
        while (it.hasNext()) {
            ((Wre) it.next()).n(this);
        }
    }

    private void ijL() {
        ColorStateList colorStateList;
        ColorStateList colorStateListUo = this.f59310a;
        if (colorStateListUo == null) {
            colorStateListUo = W3.j.Uo(getContext(), Rxk.n.KN);
        }
        EditText editText = this.J2;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = DrawableCompat.r(this.J2.getTextCursorDrawable()).mutate();
        if (jB() && (colorStateList = this.f59300I) != null) {
            colorStateListUo = colorStateList;
        }
        DrawableCompat.HI(drawableMutate, colorStateListUo);
    }

    private void k() {
        if (this.jB != null) {
            EditText editText = this.J2;
            dR0(editText == null ? null : editText.getText());
        }
    }

    private void mUb() {
        TextView textView = this.eF;
        if (textView != null) {
            this.f59316n.addView(textView);
            this.eF.setVisibility(0);
        }
    }

    private void n1(boolean z2, boolean z3) {
        int defaultColor = this.ER.getDefaultColor();
        int colorForState = this.ER.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.ER.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.ul = colorForState2;
        } else if (z3) {
            this.ul = colorForState;
        } else {
            this.ul = defaultColor;
        }
    }

    private int nHg(int i2, boolean z2) {
        return i2 - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.J2.getCompoundPaddingRight() : this.f59319t.t() : this.f59305O.ViF());
    }

    private void nY(boolean z2) {
        ValueAnimator valueAnimator = this.T3L;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.T3L.cancel();
        }
        if (z2 && this.mI) {
            qie(1.0f);
        } else {
            this.tFV.a(1.0f);
        }
        this.QZ6 = false;
        if (te()) {
            p5();
        }
        eWT();
        this.f59319t.qie(false);
        this.f59305O.T(false);
    }

    private boolean ofS() {
        int iMax;
        if (this.J2 == null || this.J2.getMeasuredHeight() >= (iMax = Math.max(this.f59305O.getMeasuredHeight(), this.f59319t.getMeasuredHeight()))) {
            return false;
        }
        this.J2.setMinimumHeight(iMax);
        return true;
    }

    private void piY() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.jB;
        if (textView != null) {
            J(textView, this.f59320v ? this.f59308U : this.P5);
            if (!this.f59320v && (colorStateList2 = this.f59301J) != null) {
                this.jB.setTextColor(colorStateList2);
            }
            if (!this.f59320v || (colorStateList = this.f59294D) == null) {
                return;
            }
            this.jB.setTextColor(colorStateList);
        }
    }

    private Rect r(Rect rect) {
        if (this.J2 == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.Rl;
        boolean zUo = com.google.android.material.internal.l3D.Uo(this);
        rect2.bottom = rect.bottom;
        int i2 = this.f59293C;
        if (i2 == 1) {
            rect2.left = N(rect.left, zUo);
            rect2.top = rect.top + this.Mx;
            rect2.right = nHg(rect.right, zUo);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = N(rect.left, zUo);
            rect2.top = getPaddingTop();
            rect2.right = nHg(rect.right, zUo);
            return rect2;
        }
        rect2.left = rect.left + this.J2.getPaddingLeft();
        rect2.top = rect.top - S();
        rect2.right = rect.right - this.J2.getPaddingRight();
        return rect2;
    }

    public static /* synthetic */ int rl(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private static Drawable s7N(Context context, mfo.CN3 cn3, int i2, int[][] iArr) {
        int iT = W3.j.t(context, Rxk.n.ty, "TextInputLayout");
        mfo.CN3 cn32 = new mfo.CN3(cn3.g());
        int iMUb = W3.j.mUb(i2, iT, 0.1f);
        cn32.p5(new ColorStateList(iArr, new int[]{iMUb, 0}));
        cn32.setTint(iT);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iMUb, iT});
        mfo.CN3 cn33 = new mfo.CN3(cn3.g());
        cn33.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, cn32, cn33), cn3});
    }

    private void setEditText(EditText editText) {
        if (this.J2 != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.J2 = editText;
        int i2 = this.f59317o;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.f59312g);
        }
        int i3 = this.f59306S;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.E2);
        }
        this.ijL = false;
        M7();
        setTextInputAccessibilityDelegate(new Ml(this));
        this.tFV.dR0(this.J2.getTypeface());
        this.tFV.J(this.J2.getTextSize());
        int i5 = Build.VERSION.SDK_INT;
        this.tFV.M(this.J2.getLetterSpacing());
        int gravity = this.J2.getGravity();
        this.tFV.P5((gravity & (-113)) | 48);
        this.tFV.B(gravity);
        this.f59296F = ViewCompat.g(editText);
        this.J2.addTextChangedListener(new j(editText));
        if (this.UhV == null) {
            this.UhV = this.J2.getHintTextColors();
        }
        if (this.f59299GR) {
            if (TextUtils.isEmpty(this.Nxk)) {
                CharSequence hint = this.J2.getHint();
                this.f59318r = hint;
                setHint(hint);
                this.J2.setHint((CharSequence) null);
            }
            this.f59314k = true;
        }
        if (i5 >= 29) {
            ijL();
        }
        if (this.jB != null) {
            dR0(this.J2.getText());
        }
        eTf();
        this.f59311e.J2();
        this.f59319t.bringToFront();
        this.f59305O.bringToFront();
        iF();
        this.f59305O.n1();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        G7(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.Nxk)) {
            return;
        }
        this.Nxk = charSequence;
        this.tFV.Y(charSequence);
        if (this.QZ6) {
            return;
        }
        p5();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.p5 == z2) {
            return;
        }
        if (z2) {
            mUb();
        } else {
            FX();
            this.eF = null;
        }
        this.p5 = z2;
    }

    private boolean te() {
        return this.f59299GR && !TextUtils.isEmpty(this.Nxk) && (this.dR0 instanceof fuX);
    }

    private void ty() {
        if (this.f59315m == null || this.eTf == null) {
            return;
        }
        if (aYN()) {
            this.f59315m.p5(this.J2.isFocused() ? ColorStateList.valueOf(this.f59302K) : ColorStateList.valueOf(this.ul));
            this.eTf.p5(ColorStateList.valueOf(this.ul));
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ul(Editable editable) {
        if (this.Xw.n(editable) != 0 || this.QZ6) {
            wTp();
        } else {
            GR();
        }
    }

    private void wTp() {
        TextView textView = this.eF;
        if (textView == null || !this.p5) {
            return;
        }
        textView.setText((CharSequence) null);
        TransitionManager.n(this.f59316n, this.f59292B);
        this.eF.setVisibility(4);
    }

    private static void z(Context context, TextView textView, int i2, int i3, boolean z2) {
        textView.setContentDescription(context.getString(z2 ? Rxk.aC.f8782t : Rxk.aC.rl, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    boolean D() {
        return this.f59311e.qie();
    }

    void Jk() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.dR0 == null || this.f59293C == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.J2) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.J2) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.ul = this.a63;
        } else if (D()) {
            if (this.ER != null) {
                n1(z3, z2);
            } else {
                this.ul = getErrorCurrentTextColors();
            }
        } else if (!this.f59320v || (textView = this.jB) == null) {
            if (z3) {
                this.ul = this.tUK;
            } else if (z2) {
                this.ul = this.How;
            } else {
                this.ul = this.f59302K;
            }
        } else if (this.ER != null) {
            n1(z3, z2);
        } else {
            this.ul = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ijL();
        }
        this.f59305O.N();
        M();
        if (this.f59293C == 2) {
            int i2 = this.f59298G7;
            if (z3 && isEnabled()) {
                this.f59298G7 = this.eWT;
            } else {
                this.f59298G7 = this.fcU;
            }
            if (this.f59298G7 != i2) {
                eF();
            }
        }
        if (this.f59293C == 1) {
            if (!isEnabled()) {
                this.n1 = this.kSg;
            } else if (z2 && !z3) {
                this.n1 = this.RQ;
            } else if (z3) {
                this.n1 = this.f59309W;
            } else {
                this.n1 = this.lLA;
            }
        }
        az();
    }

    public void M() {
        this.f59319t.az();
    }

    public boolean U() {
        return this.f59314k;
    }

    final boolean Xw() {
        return this.QZ6;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f59316n.addView(view, layoutParams2);
        this.f59316n.setLayoutParams(layoutParams);
        C();
        setEditText((EditText) view);
    }

    public boolean bzg() {
        return this.f59311e.te();
    }

    void dR0(Editable editable) {
        int iN = this.Xw.n(editable);
        boolean z2 = this.f59320v;
        int i2 = this.f59304N;
        if (i2 == -1) {
            this.jB.setText(String.valueOf(iN));
            this.jB.setContentDescription(null);
            this.f59320v = false;
        } else {
            this.f59320v = iN > i2;
            z(getContext(), this.jB, iN, this.f59304N, this.f59320v);
            if (z2 != this.f59320v) {
                piY();
            }
            this.jB.setText(BidiFormatter.t().mUb(getContext().getString(Rxk.aC.nr, Integer.valueOf(iN), Integer.valueOf(this.f59304N))));
        }
        if (this.J2 == null || z2 == this.f59320v) {
            return;
        }
        Mx(false);
        Jk();
        eTf();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.J2;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f59318r != null) {
            boolean z2 = this.f59314k;
            this.f59314k = false;
            CharSequence hint = editText.getHint();
            this.J2.setHint(this.f59318r);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.J2.setHint(hint);
                this.f59314k = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        viewStructure.setChildCount(this.f59316n.getChildCount());
        for (int i3 = 0; i3 < this.f59316n.getChildCount(); i3++) {
            View childAt = this.f59316n.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i2);
            if (childAt == this.J2) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.Bu) {
            return;
        }
        this.Bu = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.j jVar = this.tFV;
        boolean zNxk = jVar != null ? jVar.Nxk(drawableState) : false;
        if (this.J2 != null) {
            Mx(ViewCompat.P5(this) && isEnabled());
        }
        eTf();
        Jk();
        if (zNxk) {
            invalidate();
        }
        this.Bu = false;
    }

    void eTf() {
        Drawable background;
        TextView textView;
        EditText editText = this.J2;
        if (editText == null || this.f59293C != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.n(background)) {
            background = background.mutate();
        }
        if (D()) {
            background.setColorFilter(AppCompatDrawableManager.O(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f59320v && (textView = this.jB) != null) {
            background.setColorFilter(AppCompatDrawableManager.O(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            DrawableCompat.t(background);
            this.J2.refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.J2;
        return editText != null ? editText.getBaseline() + getPaddingTop() + S() : super.getBaseline();
    }

    @NonNull
    mfo.CN3 getBoxBackground() {
        int i2 = this.f59293C;
        if (i2 == 1 || i2 == 2) {
            return this.dR0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.n1;
    }

    public int getBoxBackgroundMode() {
        return this.f59293C;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.Mx;
    }

    public int getBoxStrokeColor() {
        return this.tUK;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.ER;
    }

    public int getBoxStrokeWidth() {
        return this.fcU;
    }

    public int getBoxStrokeWidthFocused() {
        return this.eWT;
    }

    public int getCounterMaxLength() {
        return this.f59304N;
    }

    @Nullable
    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f59307T && this.f59320v && (textView = this.jB) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f59294D;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f59301J;
    }

    @Nullable
    @RequiresApi
    public ColorStateList getCursorColor() {
        return this.f59310a;
    }

    @Nullable
    @RequiresApi
    public ColorStateList getCursorErrorColor() {
        return this.f59300I;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.UhV;
    }

    @Nullable
    public EditText getEditText() {
        return this.J2;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f59305O.qie();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f59305O.ty();
    }

    public int getEndIconMinSize() {
        return this.f59305O.HI();
    }

    public int getEndIconMode() {
        return this.f59305O.ck();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f59305O.Ik();
    }

    @NonNull
    CheckableImageButton getEndIconView() {
        return this.f59305O.r();
    }

    @Nullable
    public CharSequence getError() {
        if (this.f59311e.g()) {
            return this.f59311e.ck();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f59311e.ty();
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f59311e.HI();
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.f59311e.Ik();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f59305O.o();
    }

    @Nullable
    public CharSequence getHelperText() {
        if (this.f59311e.te()) {
            return this.f59311e.o();
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        return this.f59311e.XQ();
    }

    @Nullable
    public CharSequence getHint() {
        if (this.f59299GR) {
            return this.Nxk;
        }
        return null;
    }

    @VisibleForTesting
    final float getHintCollapsedTextHeight() {
        return this.tFV.Ik();
    }

    @VisibleForTesting
    final int getHintCurrentCollapsedTextColor() {
        return this.tFV.Z();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f59313i;
    }

    @NonNull
    public I28 getLengthCounter() {
        return this.Xw;
    }

    public int getMaxEms() {
        return this.f59306S;
    }

    @Px
    public int getMaxWidth() {
        return this.E2;
    }

    public int getMinEms() {
        return this.f59317o;
    }

    @Px
    public int getMinWidth() {
        return this.f59312g;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f59305O.XQ();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f59305O.S();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.p5) {
            return this.M7;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f59303M;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f59295E;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f59319t.n();
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f59319t.rl();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f59319t.nr();
    }

    @NonNull
    public mfo.C getShapeAppearanceModel() {
        return this.xg;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f59319t.O();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f59319t.J2();
    }

    public int getStartIconMinSize() {
        return this.f59319t.Uo();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f59319t.KN();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f59305O.WPU();
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f59305O.aYN();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f59305O.nY();
    }

    @Nullable
    public Typeface getTypeface() {
        return this.mYa;
    }

    boolean m() {
        boolean z2;
        if (this.J2 == null) {
            return false;
        }
        boolean z3 = true;
        if (I()) {
            int measuredWidth = this.f59319t.getMeasuredWidth() - this.J2.getPaddingLeft();
            if (this.Org == null || this.HV != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.Org = colorDrawable;
                this.HV = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrN = TextViewCompat.n(this.J2);
            Drawable drawable = drawableArrN[0];
            Drawable drawable2 = this.Org;
            if (drawable != drawable2) {
                TextViewCompat.gh(this.J2, drawable2, drawableArrN[1], drawableArrN[2], drawableArrN[3]);
                z2 = true;
            }
            z2 = false;
        } else {
            if (this.Org != null) {
                Drawable[] drawableArrN2 = TextViewCompat.n(this.J2);
                TextViewCompat.gh(this.J2, null, drawableArrN2[1], drawableArrN2[2], drawableArrN2[3]);
                this.Org = null;
                z2 = true;
            }
            z2 = false;
        }
        if (a()) {
            int measuredWidth2 = this.f59305O.nY().getMeasuredWidth() - this.J2.getPaddingRight();
            CheckableImageButton checkableImageButtonGh = this.f59305O.gh();
            if (checkableImageButtonGh != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonGh.getMeasuredWidth() + MarginLayoutParamsCompat.rl((ViewGroup.MarginLayoutParams) checkableImageButtonGh.getLayoutParams());
            }
            Drawable[] drawableArrN3 = TextViewCompat.n(this.J2);
            Drawable drawable3 = this.Po6;
            if (drawable3 != null && this.EWS != measuredWidth2) {
                this.EWS = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                TextViewCompat.gh(this.J2, drawableArrN3[0], drawableArrN3[1], this.Po6, drawableArrN3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.Po6 = colorDrawable2;
                this.EWS = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = drawableArrN3[2];
            Drawable drawable5 = this.Po6;
            if (drawable4 != drawable5) {
                this.hRu = drawable4;
                TextViewCompat.gh(this.J2, drawableArrN3[0], drawableArrN3[1], drawable5, drawableArrN3[3]);
                return true;
            }
        } else if (this.Po6 != null) {
            Drawable[] drawableArrN4 = TextViewCompat.n(this.J2);
            if (drawableArrN4[2] == this.Po6) {
                TextViewCompat.gh(this.J2, drawableArrN4[0], drawableArrN4[1], this.hRu, drawableArrN4[3]);
            } else {
                z3 = z2;
            }
            this.Po6 = null;
            return z3;
        }
        return z2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f59305O.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.Uf = false;
        boolean zOfS = ofS();
        boolean zM = m();
        if (zOfS || zM) {
            this.J2.post(new Runnable() { // from class: com.google.android.material.textfield.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59376n.J2.requestLayout();
                }
            });
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.n());
        setError(savedState.f59322O);
        if (savedState.J2) {
            post(new n());
        }
        requestLayout();
    }

    void pJg() {
        EditText editText = this.J2;
        if (editText == null || this.dR0 == null) {
            return;
        }
        if ((this.ijL || editText.getBackground() == null) && this.f59293C != 0) {
            xg();
            this.ijL = true;
        }
    }

    void qie(float f3) {
        if (this.tFV.aYN() == f3) {
            return;
        }
        if (this.T3L == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.T3L = valueAnimator;
            valueAnimator.setInterpolator(IzQ.fuX.Uo(getContext(), Rxk.n.nHg, G7.j.rl));
            this.T3L.setDuration(IzQ.fuX.J2(getContext(), Rxk.n.E2, 167));
            this.T3L.addUpdateListener(new w6());
        }
        this.T3L.setFloatValues(this.tFV.aYN(), f3);
        this.T3L.start();
    }

    public boolean rV9() {
        return this.f59311e.g();
    }

    public void setBoxBackgroundColor(@ColorInt int i2) {
        if (this.n1 != i2) {
            this.n1 = i2;
            this.lLA = i2;
            this.f59309W = i2;
            this.RQ = i2;
            az();
        }
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.f59293C) {
            return;
        }
        this.f59293C = i2;
        if (this.J2 != null) {
            M7();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.Mx = i2;
    }

    public void setBoxCornerFamily(int i2) {
        this.xg = this.xg.S().ViF(i2, this.xg.r()).iF(i2, this.xg.Z()).Ik(i2, this.xg.mUb()).XQ(i2, this.xg.qie()).az();
        az();
    }

    public void setBoxStrokeColor(@ColorInt int i2) {
        if (this.tUK != i2) {
            this.tUK = i2;
            Jk();
        }
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.ER != colorStateList) {
            this.ER = colorStateList;
            Jk();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.fcU = i2;
        Jk();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.eWT = i2;
        Jk();
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f59307T != z2) {
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.jB = appCompatTextView;
                appCompatTextView.setId(Rxk.Wre.s7N);
                Typeface typeface = this.mYa;
                if (typeface != null) {
                    this.jB.setTypeface(typeface);
                }
                this.jB.setMaxLines(1);
                this.f59311e.O(this.jB, 2);
                MarginLayoutParamsCompat.nr((ViewGroup.MarginLayoutParams) this.jB.getLayoutParams(), getResources().getDimensionPixelOffset(Rxk.Ml.pJg));
                piY();
                k();
            } else {
                this.f59311e.iF(this.jB, 2);
                this.jB = null;
            }
            this.f59307T = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f59304N != i2) {
            if (i2 > 0) {
                this.f59304N = i2;
            } else {
                this.f59304N = -1;
            }
            if (this.f59307T) {
                k();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f59308U != i2) {
            this.f59308U = i2;
            piY();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f59294D != colorStateList) {
            this.f59294D = colorStateList;
            piY();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.P5 != i2) {
            this.P5 = i2;
            piY();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f59301J != colorStateList) {
            this.f59301J = colorStateList;
            piY();
        }
    }

    @RequiresApi
    public void setCursorColor(@Nullable ColorStateList colorStateList) {
        if (this.f59310a != colorStateList) {
            this.f59310a = colorStateList;
            ijL();
        }
    }

    @RequiresApi
    public void setCursorErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f59300I != colorStateList) {
            this.f59300I = colorStateList;
            if (jB()) {
                ijL();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.UhV = colorStateList;
        this.f59313i = colorStateList;
        if (this.J2 != null) {
            Mx(false);
        }
    }

    public void setEndIconActivated(boolean z2) {
        this.f59305O.rV9(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f59305O.bzg(z2);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        this.f59305O.jB(charSequence);
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.f59305O.P5(drawable);
    }

    public void setEndIconMinSize(@IntRange int i2) {
        this.f59305O.M7(i2);
    }

    public void setEndIconMode(int i2) {
        this.f59305O.p5(i2);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f59305O.eF(onClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f59305O.E(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f59305O.M(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        this.f59305O.FX(colorStateList);
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f59305O.B(mode);
    }

    public void setEndIconVisible(boolean z2) {
        this.f59305O.J(z2);
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.f59311e.g()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f59311e.WPU();
        } else {
            this.f59311e.jB(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        this.f59311e.E2(i2);
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        this.f59311e.e(charSequence);
    }

    public void setErrorEnabled(boolean z2) {
        this.f59311e.X(z2);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f59305O.a(drawable);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f59305O.I(onClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f59305O.GR(onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        this.f59305O.Nxk(colorStateList);
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f59305O.Y(mode);
    }

    public void setErrorTextAppearance(@StyleRes int i2) {
        this.f59311e.T(i2);
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        this.f59311e.N(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.VwL != z2) {
            this.VwL = z2;
            Mx(false);
        }
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        this.f59311e.wTp(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        this.f59311e.s7N(z2);
    }

    public void setHelperTextTextAppearance(@StyleRes int i2) {
        this.f59311e.nHg(i2);
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.mI = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f59299GR) {
            this.f59299GR = z2;
            if (z2) {
                CharSequence hint = this.J2.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.Nxk)) {
                        setHint(hint);
                    }
                    this.J2.setHint((CharSequence) null);
                }
                this.f59314k = true;
            } else {
                this.f59314k = false;
                if (!TextUtils.isEmpty(this.Nxk) && TextUtils.isEmpty(this.J2.getHint())) {
                    this.J2.setHint(this.Nxk);
                }
                setHintInternal(null);
            }
            if (this.J2 != null) {
                C();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i2) {
        this.tFV.Xw(i2);
        this.f59313i = this.tFV.ck();
        if (this.J2 != null) {
            Mx(false);
            C();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f59313i != colorStateList) {
            if (this.UhV == null) {
                this.tFV.U(colorStateList);
            }
            this.f59313i = colorStateList;
            if (this.J2 != null) {
                Mx(false);
            }
        }
    }

    public void setLengthCounter(@NonNull I28 i28) {
        this.Xw = i28;
    }

    public void setMaxEms(int i2) {
        this.f59306S = i2;
        EditText editText = this.J2;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(@Px int i2) {
        this.E2 = i2;
        EditText editText = this.J2;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMinEms(int i2) {
        this.f59317o = i2;
        EditText editText = this.J2;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(@Px int i2) {
        this.f59312g = i2;
        EditText editText = this.J2;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f59305O.z(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f59305O.ijL(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        this.f59305O.m(z2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.f59305O.eTf(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.f59305O.xg(mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.eF == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.eF = appCompatTextView;
            appCompatTextView.setId(Rxk.Wre.rV9);
            ViewCompat.ul(this.eF, 2);
            Fade fadeG = g();
            this.f59297FX = fadeG;
            fadeG.m(67L);
            this.f59292B = g();
            setPlaceholderTextAppearance(this.f59303M);
            setPlaceholderTextColor(this.f59295E);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.p5) {
                setPlaceholderTextEnabled(true);
            }
            this.M7 = charSequence;
        }
        eWT();
    }

    public void setPlaceholderTextAppearance(@StyleRes int i2) {
        this.f59303M = i2;
        TextView textView = this.eF;
        if (textView != null) {
            TextViewCompat.Ik(textView, i2);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f59295E != colorStateList) {
            this.f59295E = colorStateList;
            TextView textView = this.eF;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        this.f59319t.ty(charSequence);
    }

    public void setPrefixTextAppearance(@StyleRes int i2) {
        this.f59319t.HI(i2);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f59319t.ck(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull mfo.C c2) {
        mfo.CN3 cn3 = this.dR0;
        if (cn3 == null || cn3.g() == c2) {
            return;
        }
        this.xg = c2;
        az();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f59319t.Ik(z2);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        this.f59319t.r(charSequence);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f59319t.o(drawable);
    }

    public void setStartIconMinSize(@IntRange int i2) {
        this.f59319t.Z(i2);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f59319t.XQ(onClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f59319t.S(onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f59319t.WPU(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        this.f59319t.aYN(colorStateList);
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f59319t.ViF(mode);
    }

    public void setStartIconVisible(boolean z2) {
        this.f59319t.nY(z2);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.f59305O.pJg(charSequence);
    }

    public void setSuffixTextAppearance(@StyleRes int i2) {
        this.f59305O.ofS(i2);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f59305O.C(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable Ml ml) {
        EditText editText = this.J2;
        if (editText != null) {
            ViewCompat.eTf(editText, ml);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.mYa) {
            this.mYa = typeface;
            this.tFV.dR0(typeface);
            this.f59311e.rV9(typeface);
            TextView textView = this.jB;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public boolean v() {
        return this.f59305O.e();
    }

    public void xMQ(Wre wre) {
        this.GD.add(wre);
        if (this.J2 != null) {
            wre.n(this);
        }
    }

    private static void E(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                E((ViewGroup) childAt, z2);
            }
        }
    }

    private void G7(boolean z2, boolean z3) {
        boolean z4;
        ColorStateList colorStateList;
        TextView textView;
        int colorForState;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.J2;
        boolean z5 = false;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z4 = true;
        } else {
            z4 = false;
        }
        EditText editText2 = this.J2;
        if (editText2 != null && editText2.hasFocus()) {
            z5 = true;
        }
        ColorStateList colorStateList2 = this.UhV;
        if (colorStateList2 != null) {
            this.tFV.v(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.UhV;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, this.a63);
            } else {
                colorForState = this.a63;
            }
            this.tFV.v(ColorStateList.valueOf(colorForState));
        } else if (D()) {
            this.tFV.v(this.f59311e.r());
        } else if (this.f59320v && (textView = this.jB) != null) {
            this.tFV.v(textView.getTextColors());
        } else if (z5 && (colorStateList = this.f59313i) != null) {
            this.tFV.U(colorStateList);
        }
        if (!z4 && this.VwL && (!isEnabled() || !z5)) {
            if (z3 || !this.QZ6) {
                e(z2);
                return;
            }
            return;
        }
        if (!z3 && !this.QZ6) {
            return;
        }
        nY(z2);
    }

    private boolean I() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f59319t.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private void M7() {
        ck();
        pJg();
        Jk();
        Nxk();
        gh();
        if (this.f59293C != 0) {
            C();
        }
        B();
    }

    private static Drawable T(mfo.CN3 cn3, int i2, int i3, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{W3.j.mUb(i3, i2, 0.1f), i2}), cn3, cn3);
    }

    private void ViF() {
        if (te()) {
            ((fuX) this.dR0).z();
        }
    }

    private mfo.CN3 X(boolean z2) {
        float f3;
        float dimensionPixelOffset;
        ColorStateList dropDownBackgroundTintList;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(Rxk.Ml.piY);
        if (z2) {
            f3 = dimensionPixelOffset2;
        } else {
            f3 = 0.0f;
        }
        EditText editText = this.J2;
        if (editText instanceof UGc) {
            dimensionPixelOffset = ((UGc) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(Rxk.Ml.XQ);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(Rxk.Ml.Nxk);
        mfo.C cAz = mfo.C.n().g(f3).E2(f3).o(dimensionPixelOffset2).WPU(dimensionPixelOffset2).az();
        EditText editText2 = this.J2;
        if (editText2 instanceof UGc) {
            dropDownBackgroundTintList = ((UGc) editText2).getDropDownBackgroundTintList();
        } else {
            dropDownBackgroundTintList = null;
        }
        mfo.CN3 cn3Az = mfo.CN3.az(getContext(), dimensionPixelOffset, dropDownBackgroundTintList);
        cn3Az.setShapeAppearanceModel(cAz);
        cn3Az.E(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        return cn3Az;
    }

    private int Z(Rect rect, float f3) {
        if (P5()) {
            return (int) (rect.centerY() - (f3 / 2.0f));
        }
        return rect.top + this.J2.getCompoundPaddingTop();
    }

    private void eF() {
        if (te() && !this.QZ6) {
            ViF();
            p5();
        }
    }

    private boolean jB() {
        if (!D()) {
            if (this.jB == null || !this.f59320v) {
                return false;
            }
            return true;
        }
        return true;
    }

    private int o(Rect rect, Rect rect2, float f3) {
        if (P5()) {
            return (int) (rect2.top + f3);
        }
        return rect.bottom - this.J2.getCompoundPaddingBottom();
    }

    private void p5() {
        if (te()) {
            RectF rectF = this.qm;
            this.tFV.HI(rectF, this.J2.getWidth(), this.J2.getGravity());
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                HI(rectF);
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f59298G7);
                ((fuX) this.dR0).ijL(rectF);
            }
        }
    }

    private void xg() {
        ViewCompat.C(this.J2, getEditTextBoxBackground());
    }

    void J(TextView textView, int i2) {
        try {
            TextViewCompat.Ik(textView, i2);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        TextViewCompat.Ik(textView, Rxk.C.f8729t);
        textView.setTextColor(ContextCompat.getColor(getContext(), Rxk.w6.f8893n));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E2(canvas);
        fD(canvas);
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (com.google.android.material.internal.l3D.Uo(this)) {
            return this.xg.mUb().n(this.qm);
        }
        return this.xg.qie().n(this.qm);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (com.google.android.material.internal.l3D.Uo(this)) {
            return this.xg.qie().n(this.qm);
        }
        return this.xg.mUb().n(this.qm);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (com.google.android.material.internal.l3D.Uo(this)) {
            return this.xg.r().n(this.qm);
        }
        return this.xg.Z().n(this.qm);
    }

    public float getBoxCornerRadiusTopStart() {
        if (com.google.android.material.internal.l3D.Uo(this)) {
            return this.xg.Z().n(this.qm);
        }
        return this.xg.r().n(this.qm);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.tFV.T(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        super.onLayout(z2, i2, i3, i5, i7);
        EditText editText = this.J2;
        if (editText != null) {
            Rect rect = this.Jk;
            com.google.android.material.internal.w6.n(this, editText, rect);
            Y(rect);
            if (this.f59299GR) {
                this.tFV.J(this.J2.getTextSize());
                int gravity = this.J2.getGravity();
                this.tFV.P5((gravity & (-113)) | 48);
                this.tFV.B(gravity);
                this.tFV.bzg(r(rect));
                this.tFV.E(XQ(rect));
                this.tFV.nHg();
                if (te() && !this.QZ6) {
                    p5();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.Uf) {
            this.f59305O.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.Uf = true;
        }
        fcU();
        this.f59305O.n1();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2 != this.pJg) {
            float fN = this.xg.r().n(this.qm);
            float fN2 = this.xg.Z().n(this.qm);
            float fN3 = this.xg.mUb().n(this.qm);
            float fN4 = this.xg.qie().n(this.qm);
            mfo.Ml mlIk = this.xg.Ik();
            mfo.Ml mlO = this.xg.o();
            mfo.C cAz = mfo.C.n().nY(mlO).fD(mlIk).r(this.xg.gh()).S(this.xg.xMQ()).g(fN2).E2(fN).o(fN4).WPU(fN3).az();
            this.pJg = z2;
            setShapeAppearanceModel(cAz);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (D()) {
            savedState.f59322O = getError();
        }
        savedState.J2 = this.f59305O.E2();
        return savedState;
    }

    public void setBoxBackgroundColorResource(@ColorRes int i2) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.lLA = defaultColor;
        this.n1 = defaultColor;
        this.kSg = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f59309W = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.RQ = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        az();
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f59302K = colorStateList.getDefaultColor();
            this.a63 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.How = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.tUK = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.tUK != colorStateList.getDefaultColor()) {
            this.tUK = colorStateList.getDefaultColor();
        }
        Jk();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        E(this, z2);
        super.setEnabled(z2);
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (bzg()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!bzg()) {
                setHelperTextEnabled(true);
            }
            this.f59311e.U(charSequence);
        }
    }

    public void setMaxWidthResource(@DimenRes int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinWidthResource(@DimenRes int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setHint(@StringRes int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }
}
