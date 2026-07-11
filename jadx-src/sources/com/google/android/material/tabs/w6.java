package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.l3D;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class w6 {
    static RectF n(TabLayout tabLayout, View view) {
        return view == null ? new RectF() : (tabLayout.te() || !(view instanceof TabLayout.Dsr)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : rl((TabLayout.Dsr) view, 24);
    }

    w6() {
    }

    static RectF rl(TabLayout.Dsr dsr, int i2) {
        int contentWidth = dsr.getContentWidth();
        int contentHeight = dsr.getContentHeight();
        int iT = (int) l3D.t(dsr.getContext(), i2);
        if (contentWidth < iT) {
            contentWidth = iT;
        }
        int left = (dsr.getLeft() + dsr.getRight()) / 2;
        int top = (dsr.getTop() + dsr.getBottom()) / 2;
        int i3 = contentWidth / 2;
        return new RectF(left - i3, top - (contentHeight / 2), i3 + left, top + (left / 2));
    }

    void nr(TabLayout tabLayout, View view, View view2, float f3, Drawable drawable) {
        RectF rectFN = n(tabLayout, view);
        RectF rectFN2 = n(tabLayout, view2);
        drawable.setBounds(G7.j.t((int) rectFN.left, (int) rectFN2.left, f3), drawable.getBounds().top, G7.j.t((int) rectFN.right, (int) rectFN2.right, f3), drawable.getBounds().bottom);
    }

    void t(TabLayout tabLayout, View view, Drawable drawable) {
        RectF rectFN = n(tabLayout, view);
        drawable.setBounds((int) rectFN.left, drawable.getBounds().top, (int) rectFN.right, drawable.getBounds().bottom);
    }
}
