package androidx.viewpager2.widget;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class WindowInsetsApplier implements OnApplyWindowInsetsListener {
    private WindowInsetsCompat rl(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.rl;
        return windowInsetsCompat2.nY() != null ? windowInsetsCompat2 : windowInsetsCompat.t().rl();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        WindowInsetsCompat windowInsetsCompatB = ViewCompat.B(viewPager2, windowInsetsCompat);
        if (windowInsetsCompatB.r()) {
            return windowInsetsCompatB;
        }
        RecyclerView recyclerView = viewPager2.f42454e;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ViewCompat.Uo(recyclerView.getChildAt(i2), new WindowInsetsCompat(windowInsetsCompatB));
        }
        return rl(windowInsetsCompatB);
    }
}
