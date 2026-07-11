package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Px;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class I28 extends j {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f59083U = Rxk.C.f8724Z;

    public I28(Context context) {
        this(context, null);
    }

    public I28(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Rxk.n.Uo);
    }

    private void o() {
        w6 w6Var = new w6((Wre) this.f59115n);
        setIndeterminateDrawable(C.Z(getContext(), (Wre) this.f59115n, w6Var));
        setProgressDrawable(CN3.S(getContext(), (Wre) this.f59115n, w6Var));
    }

    public int getIndicatorDirection() {
        return ((Wre) this.f59115n).mUb;
    }

    @Px
    public int getIndicatorInset() {
        return ((Wre) this.f59115n).xMQ;
    }

    @Px
    public int getIndicatorSize() {
        return ((Wre) this.f59115n).KN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Wre xMQ(Context context, AttributeSet attributeSet) {
        return new Wre(context, attributeSet);
    }

    public void setIndicatorDirection(int i2) {
        ((Wre) this.f59115n).mUb = i2;
        invalidate();
    }

    public void setIndicatorInset(@Px int i2) {
        n nVar = this.f59115n;
        if (((Wre) nVar).xMQ != i2) {
            ((Wre) nVar).xMQ = i2;
            invalidate();
        }
    }

    public I28(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2, f59083U);
        o();
    }

    public void setIndicatorSize(@Px int i2) {
        int iMax = Math.max(i2, getTrackThickness() * 2);
        n nVar = this.f59115n;
        if (((Wre) nVar).KN != iMax) {
            ((Wre) nVar).KN = iMax;
            ((Wre) nVar).O();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.j
    public void setTrackThickness(int i2) {
        super.setTrackThickness(i2);
        ((Wre) this.f59115n).O();
    }
}
