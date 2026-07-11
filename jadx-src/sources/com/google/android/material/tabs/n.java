package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class n extends w6 {
    @Override // com.google.android.material.tabs.w6
    void nr(TabLayout tabLayout, View view, View view2, float f3, Drawable drawable) {
        if (f3 >= 0.5f) {
            view = view2;
        }
        RectF rectFN = w6.n(tabLayout, view);
        float fRl = f3 < 0.5f ? G7.j.rl(1.0f, 0.0f, 0.0f, 0.5f, f3) : G7.j.rl(0.0f, 1.0f, 0.5f, 1.0f, f3);
        drawable.setBounds((int) rectFN.left, drawable.getBounds().top, (int) rectFN.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fRl * 255.0f));
    }

    n() {
    }
}
