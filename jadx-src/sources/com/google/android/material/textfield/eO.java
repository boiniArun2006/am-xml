package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class eO extends l3D {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final boolean f59352o = true;
    private long HI;
    private ValueAnimator Ik;
    private final int J2;
    private AutoCompleteTextView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f59353O;
    private final TimeInterpolator Uo;
    private boolean az;
    private AccessibilityManager ck;
    private final AccessibilityManagerCompat.TouchExplorationStateChangeListener gh;
    private final View.OnFocusChangeListener mUb;
    private boolean qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f59354r;
    private boolean ty;
    private final View.OnClickListener xMQ;

    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            eO.this.r();
            eO.this.f59354r.start();
        }
    }

    private void s7N() {
        this.az = true;
        this.HI = System.currentTimeMillis();
    }

    @Override // com.google.android.material.textfield.l3D
    boolean Z() {
        return true;
    }

    @Override // com.google.android.material.textfield.l3D
    boolean mUb() {
        return true;
    }

    @Override // com.google.android.material.textfield.l3D
    boolean qie() {
        return true;
    }

    @Override // com.google.android.material.textfield.l3D
    boolean xMQ(int i2) {
        return i2 != 0;
    }

    private void N() {
        this.KN.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.aC
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return eO.nY(this.f59343n, view, motionEvent);
            }
        });
        if (f59352o) {
            this.KN.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.C
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    eO.g(this.f59265n);
                }
            });
        }
        this.KN.setThreshold(0);
    }

    public static /* synthetic */ void S(eO eOVar) {
        boolean zIsPopupShowing = eOVar.KN.isPopupShowing();
        eOVar.T(zIsPopupShowing);
        eOVar.az = zIsPopupShowing;
    }

    private void T(boolean z2) {
        if (this.ty != z2) {
            this.ty = z2;
            this.f59354r.cancel();
            this.Ik.start();
        }
    }

    public static /* synthetic */ void ViF(eO eOVar, View view, boolean z2) {
        eOVar.qie = z2;
        eOVar.r();
        if (z2) {
            return;
        }
        eOVar.T(false);
        eOVar.az = false;
    }

    public static /* synthetic */ void WPU(eO eOVar, boolean z2) {
        AutoCompleteTextView autoCompleteTextView = eOVar.KN;
        if (autoCompleteTextView == null || AbstractC1893z.n(autoCompleteTextView)) {
            return;
        }
        ViewCompat.ul(eOVar.nr, z2 ? 2 : 1);
    }

    private void e() {
        this.f59354r = E2(this.J2, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE2 = E2(this.f59353O, 1.0f, 0.0f);
        this.Ik = valueAnimatorE2;
        valueAnimatorE2.addListener(new j());
    }

    private static AutoCompleteTextView fD(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nHg() {
        if (this.KN == null) {
            return;
        }
        if (X()) {
            this.az = false;
        }
        if (this.az) {
            this.az = false;
            return;
        }
        if (f59352o) {
            T(!this.ty);
        } else {
            this.ty = !this.ty;
            r();
        }
        if (!this.ty) {
            this.KN.dismissDropDown();
        } else {
            this.KN.requestFocus();
            this.KN.showDropDown();
        }
    }

    @Override // com.google.android.material.textfield.l3D
    public void HI(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!AbstractC1893z.n(this.KN)) {
            accessibilityNodeInfoCompat.ofS(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.FX()) {
            accessibilityNodeInfoCompat.GD(null);
        }
    }

    @Override // com.google.android.material.textfield.l3D
    View.OnClickListener J2() {
        return this.xMQ;
    }

    @Override // com.google.android.material.textfield.l3D
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener KN() {
        return this.gh;
    }

    @Override // com.google.android.material.textfield.l3D
    View.OnFocusChangeListener O() {
        return this.mUb;
    }

    @Override // com.google.android.material.textfield.l3D
    void XQ() {
        AutoCompleteTextView autoCompleteTextView = this.KN;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f59352o) {
                this.KN.setOnDismissListener(null);
            }
        }
    }

    @Override // com.google.android.material.textfield.l3D
    boolean az() {
        return this.ty;
    }

    @Override // com.google.android.material.textfield.l3D
    public void ck(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.ck.isEnabled() || AbstractC1893z.n(this.KN)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.ty && !this.KN.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            nHg();
            s7N();
        }
    }

    @Override // com.google.android.material.textfield.l3D
    boolean gh() {
        return this.qie;
    }

    @Override // com.google.android.material.textfield.l3D
    public void n(Editable editable) {
        if (this.ck.isTouchExplorationEnabled() && AbstractC1893z.n(this.KN) && !this.nr.hasFocus()) {
            this.KN.dismissDropDown();
        }
        this.KN.post(new Runnable() { // from class: com.google.android.material.textfield.Xo
            @Override // java.lang.Runnable
            public final void run() {
                eO.S(this.f59342n);
            }
        });
    }

    @Override // com.google.android.material.textfield.l3D
    int nr() {
        return f59352o ? Rxk.I28.KN : Rxk.I28.xMQ;
    }

    @Override // com.google.android.material.textfield.l3D
    int t() {
        return Rxk.aC.Uo;
    }

    eO(QJ qj) {
        super(qj);
        this.xMQ = new View.OnClickListener() { // from class: com.google.android.material.textfield.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f59361n.nHg();
            }
        };
        this.mUb = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.qz
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                eO.ViF(this.f59362n, view, z2);
            }
        };
        this.gh = new AccessibilityManagerCompat.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.Pl
            @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z2) {
                eO.WPU(this.f59269n, z2);
            }
        };
        this.HI = Long.MAX_VALUE;
        Context context = qj.getContext();
        int i2 = Rxk.n.f8803X;
        this.J2 = IzQ.fuX.J2(context, i2, 67);
        this.f59353O = IzQ.fuX.J2(qj.getContext(), i2, 50);
        this.Uo = IzQ.fuX.Uo(qj.getContext(), Rxk.n.s7N, G7.j.f3385n);
    }

    private ValueAnimator E2(int i2, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.Uo);
        valueAnimatorOfFloat.setDuration(i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.Dsr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                eO.aYN(this.f59266n, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private boolean X() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.HI;
        if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= 300) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void aYN(eO eOVar, ValueAnimator valueAnimator) {
        eOVar.getClass();
        eOVar.nr.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void g(eO eOVar) {
        eOVar.s7N();
        eOVar.T(false);
    }

    public static /* synthetic */ boolean nY(eO eOVar, View view, MotionEvent motionEvent) {
        eOVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (eOVar.X()) {
                eOVar.az = false;
            }
            eOVar.nHg();
            eOVar.s7N();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.l3D
    void o() {
        e();
        this.ck = (AccessibilityManager) this.f59359t.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.l3D
    public void ty(EditText editText) {
        this.KN = fD(editText);
        N();
        this.f59358n.setErrorIconDrawable((Drawable) null);
        if (!AbstractC1893z.n(editText) && this.ck.isTouchExplorationEnabled()) {
            ViewCompat.ul(this.nr, 2);
        }
        this.f59358n.setEndIconVisible(true);
    }
}
