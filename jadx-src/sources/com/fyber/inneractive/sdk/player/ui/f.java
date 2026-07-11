package com.fyber.inneractive.sdk.player.ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.m1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f implements a {
    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final h1 a(UnitDisplayType unitDisplayType, int i2, int i3, boolean z2, h1 h1Var, int i5, int i7, int i8, int i9) {
        h1 h1Var2;
        if (unitDisplayType == UnitDisplayType.DEFAULT && z2) {
            h1Var2 = h1Var;
            m1.a(unitDisplayType, h1Var2, i2, i3, i5, i7);
        } else {
            h1Var2 = h1Var;
        }
        h1Var2.f57002a = 0;
        h1Var2.f57003b = 0;
        return h1Var2;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final h1 a(UnitDisplayType unitDisplayType, int i2, int i3, h1 h1Var, int i5, ViewGroup viewGroup) {
        h1 h1Var2 = new h1(0, 0);
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int iMin = Math.min(h1Var.f57002a, i5);
            if (viewGroup != null) {
                viewGroup.getLayoutParams().width = iMin;
                viewGroup.getLayoutParams().height = iMin;
            }
            m1.a(unitDisplayType, h1Var2, i2, i3, iMin, iMin);
            return h1Var2;
        }
        m1.a(unitDisplayType, h1Var2, i2, i3, h1Var.f57002a, h1Var.f57003b);
        return h1Var2;
    }
}
