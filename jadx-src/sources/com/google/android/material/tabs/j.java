package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class j extends w6 {
    private static float J2(float f3) {
        return (float) Math.sin((((double) f3) * 3.141592653589793d) / 2.0d);
    }

    private static float O(float f3) {
        return (float) (1.0d - Math.cos((((double) f3) * 3.141592653589793d) / 2.0d));
    }

    j() {
    }

    @Override // com.google.android.material.tabs.w6
    void nr(TabLayout tabLayout, View view, View view2, float f3, Drawable drawable) {
        float fJ2;
        float fO;
        RectF rectFN = w6.n(tabLayout, view);
        RectF rectFN2 = w6.n(tabLayout, view2);
        if (rectFN.left < rectFN2.left) {
            fJ2 = O(f3);
            fO = J2(f3);
        } else {
            fJ2 = J2(f3);
            fO = O(f3);
        }
        drawable.setBounds(G7.j.t((int) rectFN.left, (int) rectFN2.left, fJ2), drawable.getBounds().top, G7.j.t((int) rectFN.right, (int) rectFN2.right, fO), drawable.getBounds().bottom);
    }
}
