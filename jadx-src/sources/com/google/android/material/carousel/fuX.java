package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class fuX extends Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f58793t = 0;
    private static final int[] nr = {1};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int[] f58792O = {1, 0};

    @Override // com.google.android.material.carousel.Ml
    boolean KN(n nVar, int i2) {
        if (i2 >= this.f58793t || nVar.n() < this.f58793t) {
            return i2 >= this.f58793t && nVar.n() < this.f58793t;
        }
        return true;
    }

    @Override // com.google.android.material.carousel.Ml
    Wre Uo(n nVar, View view) {
        float fUo = nVar.Uo();
        if (nVar.t()) {
            fUo = nVar.J2();
        }
        float f3 = fUo;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (nVar.t()) {
            f4 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f5 = f4;
        float fNr = nr() + f5;
        float fMax = Math.max(t() + f5, fNr);
        float fMin = Math.min(measuredHeight + f5, f3);
        float fN = MathUtils.n((measuredHeight / 3.0f) + f5, fNr + f5, fMax + f5);
        float f6 = (fMin + fN) / 2.0f;
        int[] iArrN = nr;
        if (f3 < 2.0f * fNr) {
            iArrN = new int[]{0};
        }
        int[] iArrN2 = f58792O;
        if (nVar.gh() == 1) {
            iArrN = Ml.n(iArrN);
            iArrN2 = Ml.n(iArrN2);
        }
        int[] iArr = iArrN2;
        int[] iArr2 = iArrN;
        int iMax = (int) Math.max(1.0d, Math.floor(((f3 - (I28.xMQ(iArr) * f6)) - (I28.xMQ(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f3 / fMin);
        int i2 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr3[i3] = iCeil - i3;
        }
        j jVarT = j.t(f3, fN, fNr, fMax, iArr2, f6, iArr, fMin, iArr3);
        this.f58793t = jVarT.O();
        if (xMQ(jVarT, nVar.n())) {
            jVarT = j.t(f3, fN, fNr, fMax, new int[]{jVarT.f58796t}, f6, new int[]{jVarT.nr}, fMin, new int[]{jVarT.Uo});
        }
        return I28.nr(view.getContext(), f5, f3, jVarT, nVar.gh());
    }

    boolean xMQ(j jVar, int i2) {
        boolean z2;
        int iO = jVar.O() - i2;
        if (iO > 0 && (jVar.f58796t > 0 || jVar.nr > 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        while (iO > 0) {
            int i3 = jVar.f58796t;
            if (i3 > 0) {
                jVar.f58796t = i3 - 1;
            } else {
                int i5 = jVar.nr;
                if (i5 > 1) {
                    jVar.nr = i5 - 1;
                }
            }
            iO--;
        }
        return z2;
    }
}
