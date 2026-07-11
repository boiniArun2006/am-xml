package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class H implements ViewBinding {
    public final AppCompatImageButton J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatImageButton f9137O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final NestedScrollView f9138n;
    public final NestedScrollView nr;
    public final RecyclerView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f9139t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f9138n;
    }

    private H(NestedScrollView nestedScrollView, RecyclerView recyclerView, ConstraintLayout constraintLayout, NestedScrollView nestedScrollView2, AppCompatImageButton appCompatImageButton, AppCompatImageButton appCompatImageButton2) {
        this.f9138n = nestedScrollView;
        this.rl = recyclerView;
        this.f9139t = constraintLayout;
        this.nr = nestedScrollView2;
        this.f9137O = appCompatImageButton;
        this.J2 = appCompatImageButton2;
    }

    public static H n(View view) {
        int i2 = 2131362640;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362640);
        if (recyclerView != null) {
            i2 = 2131362925;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131362925);
            if (constraintLayout != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i2 = 2131363302;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.n(view, 2131363302);
                if (appCompatImageButton != null) {
                    i2 = 2131363428;
                    AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ViewBindings.n(view, 2131363428);
                    if (appCompatImageButton2 != null) {
                        return new H(nestedScrollView, recyclerView, constraintLayout, nestedScrollView, appCompatImageButton, appCompatImageButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static H t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558827, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
