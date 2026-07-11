package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class LinearProgressIndicator extends j {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f59084U = Rxk.C.WPU;

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, Rxk.n.XQ);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2, f59084U);
        o();
    }

    private void o() {
        o oVar = new o((Xo) this.f59115n);
        setIndeterminateDrawable(C.XQ(getContext(), (Xo) this.f59115n, oVar));
        setProgressDrawable(CN3.WPU(getContext(), (Xo) this.f59115n, oVar));
    }

    @Override // com.google.android.material.progressindicator.j
    public void HI(int i2, boolean z2) {
        n nVar = this.f59115n;
        if (nVar != null && ((Xo) nVar).KN == 0 && isIndeterminate()) {
            return;
        }
        super.HI(i2, z2);
    }

    public int getIndeterminateAnimationType() {
        return ((Xo) this.f59115n).KN;
    }

    public int getIndicatorDirection() {
        return ((Xo) this.f59115n).xMQ;
    }

    @Px
    public int getTrackStopIndicatorSize() {
        return ((Xo) this.f59115n).gh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Xo xMQ(Context context, AttributeSet attributeSet) {
        return new Xo(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i2) {
        if (((Xo) this.f59115n).KN == i2) {
            return;
        }
        if (Ik() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        n nVar = this.f59115n;
        ((Xo) nVar).KN = i2;
        ((Xo) nVar).O();
        if (i2 == 0) {
            getIndeterminateDrawable().ViF(new qz((Xo) this.f59115n));
        } else {
            getIndeterminateDrawable().ViF(new Pl(getContext(), (Xo) this.f59115n));
        }
        invalidate();
    }

    public void setIndicatorDirection(int i2) {
        n nVar = this.f59115n;
        ((Xo) nVar).xMQ = i2;
        Xo xo = (Xo) nVar;
        boolean z2 = true;
        if (i2 != 1 && ((ViewCompat.nY(this) != 1 || ((Xo) this.f59115n).xMQ != 2) && (ViewCompat.nY(this) != 0 || i2 != 3))) {
            z2 = false;
        }
        xo.mUb = z2;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i2) {
        n nVar = this.f59115n;
        if (((Xo) nVar).gh != i2) {
            ((Xo) nVar).gh = Math.min(i2, ((Xo) nVar).f59123n);
            ((Xo) this.f59115n).O();
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        super.onLayout(z2, i2, i3, i5, i7);
        n nVar = this.f59115n;
        Xo xo = (Xo) nVar;
        boolean z3 = true;
        if (((Xo) nVar).xMQ != 1 && ((ViewCompat.nY(this) != 1 || ((Xo) this.f59115n).xMQ != 2) && (ViewCompat.nY(this) != 0 || ((Xo) this.f59115n).xMQ != 3))) {
            z3 = false;
        }
        xo.mUb = z3;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i2, int i3, int i5, int i7) {
        int paddingLeft = i2 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i3 - (getPaddingTop() + getPaddingBottom());
        C indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        CN3 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // com.google.android.material.progressindicator.j
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((Xo) this.f59115n).O();
    }

    @Override // com.google.android.material.progressindicator.j
    public void setTrackCornerRadius(int i2) {
        super.setTrackCornerRadius(i2);
        ((Xo) this.f59115n).O();
        invalidate();
    }
}
