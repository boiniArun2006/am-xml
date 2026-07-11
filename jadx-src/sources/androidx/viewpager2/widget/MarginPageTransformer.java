package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class MarginPageTransformer implements ViewPager2.PageTransformer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f42441n;

    private ViewPager2 rl(View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void n(View view, float f3) {
        ViewPager2 viewPager2Rl = rl(view);
        float f4 = this.f42441n * f3;
        if (viewPager2Rl.getOrientation() == 0) {
            if (viewPager2Rl.nr()) {
                f4 = -f4;
            }
            view.setTranslationX(f4);
            return;
        }
        view.setTranslationY(f4);
    }
}
