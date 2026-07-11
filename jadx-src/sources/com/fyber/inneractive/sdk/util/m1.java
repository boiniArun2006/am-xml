package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class m1 {
    public static void a(UnitDisplayType unitDisplayType, h1 h1Var, int i2, int i3, int i5, int i7) {
        if (i2 > 0 && i3 > 0) {
            float f3 = i2;
            float f4 = i3;
            float f5 = f3 / f4;
            if (unitDisplayType == UnitDisplayType.SQUARE) {
                i5 = (int) (i7 * f5);
            } else {
                if (Math.abs(f5 - 1.7777778f) >= 0.1f) {
                    Math.abs(f5 - 1.3333334f);
                }
                float fMin = Math.min(i5 / f3, 10.0f);
                float f6 = i7;
                float f7 = fMin * f4;
                if (f6 > f7) {
                    i5 = (int) (fMin * f3);
                    i7 = (int) f7;
                } else {
                    float fMin2 = Math.min(f6 / f4, 10.0f);
                    i5 = (int) (f3 * fMin2);
                    i7 = (int) (fMin2 * f4);
                }
            }
        }
        h1Var.f57002a = i5;
        h1Var.f57003b = i7;
    }
}
