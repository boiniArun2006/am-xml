package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class YzO implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ViewPager2 f9396n;
    public final ViewPager2 rl;

    public static YzO n(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ViewPager2 viewPager2 = (ViewPager2) view;
        return new YzO(viewPager2, viewPager2);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ViewPager2 getRoot() {
        return this.f9396n;
    }

    private YzO(ViewPager2 viewPager2, ViewPager2 viewPager22) {
        this.f9396n = viewPager2;
        this.rl = viewPager22;
    }

    public static YzO t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558543, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
