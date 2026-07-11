package com.google.android.material.timepicker;

import Rxk.C;
import Rxk.Wre;
import Rxk.fuX;
import Rxk.o;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class ClockFaceView extends Ml implements ClockHandView.n {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f59383C;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private float f59384G7;
    private String[] Mx;
    private final ClockHandView Nxk;
    private final RectF dR0;
    private final float[] eTf;
    private final ColorStateList fcU;
    private final AccessibilityDelegateCompat ijL;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f59385k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int[] f59386m;
    private final int ofS;
    private final int pJg;
    private final SparseArray piY;
    private final int xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Rect f59387z;

    class j implements ViewTreeObserver.OnPreDrawListener {
        j() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.T(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.Nxk.xMQ()) - ClockFaceView.this.xg);
            return true;
        }
    }

    class n extends AccessibilityDelegateCompat {
        n() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean mUb(View view, int i2, Bundle bundle) {
            if (i2 != 16) {
                return super.mUb(view, i2, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f59385k);
            float fCenterX = ClockFaceView.this.f59385k.centerX();
            float fCenterY = ClockFaceView.this.f59385k.centerY();
            ClockFaceView.this.Nxk.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.Nxk.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.Uo(view, accessibilityNodeInfoCompat);
            int iIntValue = ((Integer) view.getTag(Wre.ck)).intValue();
            if (iIntValue > 0) {
                accessibilityNodeInfoCompat.Uf((View) ClockFaceView.this.piY.get(iIntValue - 1));
            }
            accessibilityNodeInfoCompat.G7(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.n(0, 1, iIntValue, 1, false, view.isSelected()));
            accessibilityNodeInfoCompat.C(true);
            accessibilityNodeInfoCompat.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.xMQ);
        }
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, Rxk.n.nY);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f59385k = new Rect();
        this.dR0 = new RectF();
        this.f59387z = new Rect();
        this.piY = new SparseArray();
        this.eTf = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.XNZ, i2, C.f8725g);
        Resources resources = getResources();
        ColorStateList colorStateListN = X4.w6.n(context, typedArrayObtainStyledAttributes, o.I9f);
        this.fcU = colorStateListN;
        LayoutInflater.from(context).inflate(fuX.ty, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(Wre.mUb);
        this.Nxk = clockHandView;
        this.xg = resources.getDimensionPixelSize(Rxk.Ml.aYN);
        int colorForState = colorStateListN.getColorForState(new int[]{R.attr.state_selected}, colorStateListN.getDefaultColor());
        this.f59386m = new int[]{colorForState, colorForState, colorStateListN.getDefaultColor()};
        clockHandView.rl(this);
        int defaultColor = AppCompatResources.n(context, Rxk.w6.rl).getDefaultColor();
        ColorStateList colorStateListN2 = X4.w6.n(context, typedArrayObtainStyledAttributes, o.lNy);
        setBackgroundColor(colorStateListN2 != null ? colorStateListN2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new j());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.ijL = new n();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        M7(strArr, 0);
        this.pJg = resources.getDimensionPixelSize(Rxk.Ml.s7N);
        this.ofS = resources.getDimensionPixelSize(Rxk.Ml.wTp);
        this.f59383C = resources.getDimensionPixelSize(Rxk.Ml.nY);
    }

    private void Xw() {
        RectF rectFO = this.Nxk.O();
        TextView textViewU = U(rectFO);
        for (int i2 = 0; i2 < this.piY.size(); i2++) {
            TextView textView = (TextView) this.piY.get(i2);
            if (textView != null) {
                textView.setSelected(textView == textViewU);
                textView.getPaint().setShader(jB(rectFO, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient jB(RectF rectF, TextView textView) {
        textView.getHitRect(this.f59385k);
        this.dR0.set(this.f59385k);
        textView.getLineBounds(0, this.f59387z);
        RectF rectF2 = this.dR0;
        Rect rect = this.f59387z;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.dR0)) {
            return new RadialGradient(rectF.centerX() - this.dR0.left, rectF.centerY() - this.dR0.top, rectF.width() * 0.5f, this.f59386m, this.eTf, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public void M7(String[] strArr, int i2) {
        this.Mx = strArr;
        p5(i2);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.n
    public void n(float f3, boolean z2) {
        if (Math.abs(this.f59384G7 - f3) > 0.001f) {
            this.f59384G7 = f3;
            Xw();
        }
    }

    private static float P5(float f3, float f4, float f5) {
        return Math.max(Math.max(f3, f4), f5);
    }

    private TextView U(RectF rectF) {
        float f3 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i2 = 0; i2 < this.piY.size(); i2++) {
            TextView textView2 = (TextView) this.piY.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(this.f59385k);
                this.dR0.set(this.f59385k);
                this.dR0.union(rectF);
                float fWidth = this.dR0.width() * this.dR0.height();
                if (fWidth < f3) {
                    textView = textView2;
                    f3 = fWidth;
                }
            }
        }
        return textView;
    }

    private void p5(int i2) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.piY.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < Math.max(this.Mx.length, size); i3++) {
            TextView textView = (TextView) this.piY.get(i3);
            if (i3 >= this.Mx.length) {
                removeView(textView);
                this.piY.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(fuX.az, (ViewGroup) this, false);
                    this.piY.put(i3, textView);
                    addView(textView);
                }
                textView.setText(this.Mx[i3]);
                textView.setTag(Wre.ck, Integer.valueOf(i3));
                int i5 = (i3 / 12) + 1;
                textView.setTag(Wre.gh, Integer.valueOf(i5));
                if (i5 > 1) {
                    z2 = true;
                }
                ViewCompat.eTf(textView, this.ijL);
                textView.setTextColor(this.fcU);
                if (i2 != 0) {
                    textView.setContentDescription(getResources().getString(i2, this.Mx[i3]));
                }
            }
        }
        this.Nxk.ck(z2);
    }

    @Override // com.google.android.material.timepicker.Ml
    public void T(int i2) {
        if (i2 != X()) {
            super.T(i2);
            this.Nxk.qie(X());
        }
    }

    @Override // com.google.android.material.timepicker.Ml
    protected void nHg() {
        super.nHg();
        for (int i2 = 0; i2 < this.piY.size(); i2++) {
            ((TextView) this.piY.get(i2)).setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.Zmq(accessibilityNodeInfo).Mx(AccessibilityNodeInfoCompat.CollectionInfoCompat.rl(1, this.Mx.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        super.onLayout(z2, i2, i3, i5, i7);
        Xw();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iP5 = (int) (this.f59383C / P5(this.pJg / displayMetrics.heightPixels, this.ofS / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iP5, 1073741824);
        setMeasuredDimension(iP5, iP5);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
