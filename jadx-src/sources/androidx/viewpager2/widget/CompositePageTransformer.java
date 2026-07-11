package androidx.viewpager2.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CompositePageTransformer implements ViewPager2.PageTransformer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f42438n;

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void n(View view, float f3) {
        Iterator it = this.f42438n.iterator();
        while (it.hasNext()) {
            ((ViewPager2.PageTransformer) it.next()).n(view, f3);
        }
    }
}
