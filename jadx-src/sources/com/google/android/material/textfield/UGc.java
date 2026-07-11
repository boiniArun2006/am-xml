package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class UGc extends AppCompatAutoCompleteTextView {
    private final float E2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ColorStateList f59328N;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Rect f59329S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f59330T;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f59331e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f59332g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AccessibilityManager f59333o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ListPopupWindow f59334r;

    class j implements AdapterView.OnItemClickListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
            UGc uGc = UGc.this;
            UGc.this.qie(i2 < 0 ? uGc.f59334r.XQ() : uGc.getAdapter().getItem(i2));
            AdapterView.OnItemClickListener onItemClickListener = UGc.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i2 < 0) {
                    view = UGc.this.f59334r.aYN();
                    i2 = UGc.this.f59334r.WPU();
                    j2 = UGc.this.f59334r.S();
                }
                onItemClickListener.onItemClick(UGc.this.f59334r.ty(), view, i2, j2);
            }
            UGc.this.f59334r.dismiss();
        }
    }

    private class n extends ArrayAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ColorStateList f59337n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ColorStateList f59338t;

        n(Context context, int i2, String[] strArr) {
            super(context, i2, strArr);
            J2();
        }

        private boolean nr() {
            return UGc.this.f59328N != null;
        }

        private boolean t() {
            return UGc.this.f59330T != 0;
        }

        private ColorStateList O() {
            if (!nr()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{UGc.this.f59328N.getColorForState(iArr, 0), 0});
        }

        private ColorStateList n() {
            if (t() && nr()) {
                int[] iArr = {R.attr.state_hovered, -16842919};
                int[] iArr2 = {R.attr.state_selected, -16842919};
                int colorForState = UGc.this.f59328N.getColorForState(iArr2, 0);
                int colorForState2 = UGc.this.f59328N.getColorForState(iArr, 0);
                return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{W3.j.xMQ(UGc.this.f59330T, colorForState), W3.j.xMQ(UGc.this.f59330T, colorForState2), UGc.this.f59330T});
            }
            return null;
        }

        private Drawable rl() {
            if (!t()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(UGc.this.f59330T);
            if (this.f59338t != null) {
                DrawableCompat.HI(colorDrawable, this.f59337n);
                return new RippleDrawable(this.f59338t, colorDrawable, null);
            }
            return colorDrawable;
        }

        void J2() {
            this.f59338t = O();
            this.f59337n = n();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            Drawable drawableRl;
            View view2 = super.getView(i2, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                if (UGc.this.getText().toString().contentEquals(textView.getText())) {
                    drawableRl = rl();
                } else {
                    drawableRl = null;
                }
                ViewCompat.C(textView, drawableRl);
            }
            return view2;
        }
    }

    public UGc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Rxk.n.rl);
    }

    public void setSimpleItems(@ArrayRes int i2) {
        setSimpleItems(getResources().getStringArray(i2));
    }

    public UGc(Context context, AttributeSet attributeSet, int i2) {
        super(scw.j.t(context, attributeSet, i2, 0), attributeSet, i2);
        this.f59329S = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayXMQ = com.google.android.material.internal.eO.xMQ(context2, attributeSet, Rxk.o.kQ, i2, Rxk.C.KN, new int[0]);
        int i3 = Rxk.o.f8887x;
        if (typedArrayXMQ.hasValue(i3) && typedArrayXMQ.getInt(i3, 0) == 0) {
            setKeyListener(null);
        }
        this.f59332g = typedArrayXMQ.getResourceId(Rxk.o.MPw, Rxk.fuX.f8788o);
        this.E2 = typedArrayXMQ.getDimensionPixelOffset(Rxk.o.XUb, Rxk.Ml.f8739GR);
        int i5 = Rxk.o.rR;
        if (typedArrayXMQ.hasValue(i5)) {
            this.f59331e = ColorStateList.valueOf(typedArrayXMQ.getColor(i5, 0));
        }
        this.f59330T = typedArrayXMQ.getColor(Rxk.o.V5F, 0);
        this.f59328N = X4.w6.n(context2, typedArrayXMQ, Rxk.o.sFO);
        this.f59333o = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f59334r = listPopupWindow;
        listPopupWindow.N(true);
        listPopupWindow.iF(this);
        listPopupWindow.T(2);
        listPopupWindow.qie(getAdapter());
        listPopupWindow.s7N(new j());
        int i7 = Rxk.o.JI;
        if (typedArrayXMQ.hasValue(i7)) {
            setSimpleItems(typedArrayXMQ.getResourceId(i7, 0));
        }
        typedArrayXMQ.recycle();
    }

    private boolean KN() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f59333o;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f59333o.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean xMQ() {
        AccessibilityManager accessibilityManager = this.f59333o;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    @Nullable
    public ColorStateList getDropDownBackgroundTintList() {
        return this.f59331e;
    }

    public float getPopupElevation() {
        return this.E2;
    }

    public int getSimpleItemSelectedColor() {
        return this.f59330T;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f59328N;
    }

    public void setDropDownBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.f59331e = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof mfo.CN3) {
            ((mfo.CN3) dropDownBackground).p5(this.f59331e);
        }
    }

    public void setSimpleItemSelectedColor(int i2) {
        this.f59330T = i2;
        if (getAdapter() instanceof n) {
            ((n) getAdapter()).J2();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.f59328N = colorStateList;
        if (getAdapter() instanceof n) {
            ((n) getAdapter()).J2();
        }
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new n(getContext(), this.f59332g, strArr));
    }

    private TextInputLayout J2() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean Uo() {
        if (!xMQ() && !KN()) {
            return false;
        }
        return true;
    }

    private void gh() {
        TextInputLayout textInputLayoutJ2 = J2();
        if (textInputLayoutJ2 != null) {
            textInputLayoutJ2.pJg();
        }
    }

    private int mUb() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutJ2 = J2();
        int i2 = 0;
        if (adapter == null || textInputLayoutJ2 == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f59334r.WPU()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutJ2);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableJ2 = this.f59334r.J2();
        if (drawableJ2 != null) {
            drawableJ2.getPadding(this.f59329S);
            Rect rect = this.f59329S;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutJ2.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qie(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (Uo()) {
            this.f59334r.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayoutJ2 = J2();
        if (textInputLayoutJ2 != null && textInputLayoutJ2.U()) {
            return textInputLayoutJ2.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutJ2 = J2();
        if (textInputLayoutJ2 != null && textInputLayoutJ2.U() && super.getHint() == null && com.google.android.material.internal.Wre.rl()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f59334r.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mUb()), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z2) {
        if (Uo()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t3) {
        super.setAdapter(t3);
        this.f59334r.qie(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f59334r;
        if (listPopupWindow != null) {
            listPopupWindow.HI(drawable);
        }
    }

    public void setDropDownBackgroundTint(@ColorInt int i2) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f59334r.wTp(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i2) {
        super.setRawInputType(i2);
        gh();
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (Uo()) {
            this.f59334r.show();
        } else {
            super.showDropDown();
        }
    }
}
