package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class m8h implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9526n;
    public final ViewPager2 nr;
    public final AppCompatImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TabLayout f9527t;

    public static m8h t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9526n;
    }

    private m8h(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.f9526n = constraintLayout;
        this.rl = appCompatImageButton;
        this.f9527t = tabLayout;
        this.nr = viewPager2;
    }

    public static m8h n(View view) {
        int i2 = 2131362375;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.n(view, 2131362375);
        if (appCompatImageButton != null) {
            i2 = 2131363291;
            TabLayout tabLayout = (TabLayout) ViewBindings.n(view, 2131363291);
            if (tabLayout != null) {
                i2 = 2131363292;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.n(view, 2131363292);
                if (viewPager2 != null) {
                    return new m8h((ConstraintLayout) view, appCompatImageButton, tabLayout, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static m8h nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558760, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
