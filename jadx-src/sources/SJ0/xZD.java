package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.alightcreative.app.motion.activities.effectbrowser.VerticalNestedScrollView;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class xZD implements ViewBinding {
    public final RecyclerView J2;
    public final View KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TabLayout f9679O;
    public final View Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final VerticalNestedScrollView f9680n;
    public final ViewPager2 nr;
    public final RecyclerView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FrameLayout f9681t;
    public final VerticalNestedScrollView xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public VerticalNestedScrollView getRoot() {
        return this.f9680n;
    }

    private xZD(VerticalNestedScrollView verticalNestedScrollView, RecyclerView recyclerView, FrameLayout frameLayout, ViewPager2 viewPager2, TabLayout tabLayout, RecyclerView recyclerView2, View view, View view2, VerticalNestedScrollView verticalNestedScrollView2) {
        this.f9680n = verticalNestedScrollView;
        this.rl = recyclerView;
        this.f9681t = frameLayout;
        this.nr = viewPager2;
        this.f9679O = tabLayout;
        this.J2 = recyclerView2;
        this.Uo = view;
        this.KN = view2;
        this.xMQ = verticalNestedScrollView2;
    }

    public static xZD n(View view) {
        int i2 = 2131362338;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362338);
        if (recyclerView != null) {
            i2 = 2131363512;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.n(view, 2131363512);
            if (frameLayout != null) {
                i2 = 2131363513;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.n(view, 2131363513);
                if (viewPager2 != null) {
                    i2 = 2131363514;
                    TabLayout tabLayout = (TabLayout) ViewBindings.n(view, 2131363514);
                    if (tabLayout != null) {
                        i2 = 2131363519;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.n(view, 2131363519);
                        if (recyclerView2 != null) {
                            i2 = 2131363521;
                            View viewN = ViewBindings.n(view, 2131363521);
                            if (viewN != null) {
                                i2 = 2131363522;
                                View viewN2 = ViewBindings.n(view, 2131363522);
                                if (viewN2 != null) {
                                    VerticalNestedScrollView verticalNestedScrollView = (VerticalNestedScrollView) view;
                                    return new xZD(verticalNestedScrollView, recyclerView, frameLayout, viewPager2, tabLayout, recyclerView2, viewN, viewN2, verticalNestedScrollView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static xZD t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558541, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
