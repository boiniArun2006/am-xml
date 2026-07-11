package com.fyber.inneractive.sdk.player.ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.m1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h implements a {
    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final h1 a(UnitDisplayType unitDisplayType, int i2, int i3, boolean z2, h1 h1Var, int i5, int i7, int i8, int i9) {
        if (h1Var == null) {
            return null;
        }
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int iMin = Math.min(i5, i8) - com.fyber.inneractive.sdk.util.o.b(i9 * 2);
            h1Var.f57002a = iMin;
            h1Var.f57003b = iMin;
            return h1Var;
        }
        if (unitDisplayType == UnitDisplayType.LANDSCAPE) {
            int iMin2 = Math.min(i5, i8) - com.fyber.inneractive.sdk.util.o.b(i9 * 2);
            h1Var.f57002a = iMin2;
            h1Var.f57003b = (iMin2 * 9) / 16;
            return h1Var;
        }
        if (unitDisplayType == UnitDisplayType.MRECT) {
            h1Var.f57002a = com.fyber.inneractive.sdk.util.o.b(com.safedk.android.internal.d.f62986a);
            h1Var.f57003b = com.fyber.inneractive.sdk.util.o.b(250);
            return h1Var;
        }
        if (unitDisplayType == UnitDisplayType.DEFAULT && z2) {
            m1.a(unitDisplayType, h1Var, i2, i3, i5, i7);
            return h1Var;
        }
        h1Var.f57002a = 0;
        h1Var.f57003b = 0;
        return h1Var;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final h1 a(UnitDisplayType unitDisplayType, int i2, int i3, h1 h1Var, int i5, ViewGroup viewGroup) {
        h1 h1Var2 = new h1(0, 0);
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int i7 = h1Var.f57002a;
            m1.a(unitDisplayType, h1Var2, i2, i3, i7, i7);
            return h1Var2;
        }
        m1.a(unitDisplayType, h1Var2, i2, i3, h1Var.f57002a, h1Var.f57003b);
        return h1Var2;
    }
}
