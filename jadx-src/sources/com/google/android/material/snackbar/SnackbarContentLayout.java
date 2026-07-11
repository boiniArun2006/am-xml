package com.google.android.material.snackbar;

import IzQ.fuX;
import Rxk.Ml;
import Rxk.Wre;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public class SnackbarContentLayout extends LinearLayout implements j {
    private int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final TimeInterpolator f59199O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f59200n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Button f59201t;

    public Button getActionView() {
        return this.f59201t;
    }

    public TextView getMessageView() {
        return this.f59200n;
    }

    @Override // com.google.android.material.snackbar.j
    public void n(int i2, int i3) {
        this.f59200n.setAlpha(0.0f);
        long j2 = i3;
        long j3 = i2;
        this.f59200n.animate().alpha(1.0f).setDuration(j2).setInterpolator(this.f59199O).setStartDelay(j3).start();
        if (this.f59201t.getVisibility() == 0) {
            this.f59201t.setAlpha(0.0f);
            this.f59201t.animate().alpha(1.0f).setDuration(j2).setInterpolator(this.f59199O).setStartDelay(j3).start();
        }
    }

    @Override // com.google.android.material.snackbar.j
    public void rl(int i2, int i3) {
        this.f59200n.setAlpha(1.0f);
        long j2 = i3;
        long j3 = i2;
        this.f59200n.animate().alpha(0.0f).setDuration(j2).setInterpolator(this.f59199O).setStartDelay(j3).start();
        if (this.f59201t.getVisibility() == 0) {
            this.f59201t.setAlpha(1.0f);
            this.f59201t.animate().alpha(0.0f).setDuration(j2).setInterpolator(this.f59199O).setStartDelay(j3).start();
        }
    }

    public void setMaxInlineActionWidth(int i2) {
        this.J2 = i2;
    }

    void t(float f3) {
        if (f3 != 1.0f) {
            this.f59201t.setTextColor(W3.j.mUb(W3.j.nr(this, Rxk.n.ty), this.f59201t.getCurrentTextColor(), f3));
        }
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59199O = fuX.Uo(context, Rxk.n.nHg, G7.j.rl);
    }

    private boolean O(int i2, int i3, int i5) {
        boolean z2;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f59200n.getPaddingTop() == i3 && this.f59200n.getPaddingBottom() == i5) {
            return z2;
        }
        nr(this.f59200n, i3, i5);
        return true;
    }

    private static void nr(View view, int i2, int i3) {
        if (ViewCompat.p5(view)) {
            ViewCompat.HV(view, ViewCompat.E2(view), i2, ViewCompat.fD(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f59200n = (TextView) findViewById(Wre.f8765T);
        this.f59201t = (Button) findViewById(Wre.f8766X);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        boolean z2;
        super.onMeasure(i2, i3);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(Ml.f8744O);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(Ml.nr);
            Layout layout = this.f59200n.getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && this.J2 > 0 && this.f59201t.getMeasuredWidth() > this.J2) {
                if (!O(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
            } else {
                if (!z2) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!O(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            }
            super.onMeasure(i2, i3);
        }
    }
}
