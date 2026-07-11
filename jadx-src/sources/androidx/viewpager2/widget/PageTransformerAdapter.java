package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class PageTransformerAdapter extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayoutManager f42442n;
    private ViewPager2.PageTransformer rl;

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void n(int i2) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void t(int i2) {
    }

    void O(ViewPager2.PageTransformer pageTransformer) {
        this.rl = pageTransformer;
    }

    ViewPager2.PageTransformer nr() {
        return this.rl;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void rl(int i2, float f3, int i3) {
        if (this.rl == null) {
            return;
        }
        float f4 = -f3;
        for (int i5 = 0; i5 < this.f42442n.M(); i5++) {
            View viewE = this.f42442n.E(i5);
            if (viewE == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i5), Integer.valueOf(this.f42442n.M())));
            }
            this.rl.n(viewE, (this.f42442n.fcU(viewE) - i2) + f4);
        }
    }

    PageTransformerAdapter(LinearLayoutManager linearLayoutManager) {
        this.f42442n = linearLayoutManager;
    }
}
