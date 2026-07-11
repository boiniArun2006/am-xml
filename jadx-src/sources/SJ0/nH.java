package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class nH implements ViewBinding {
    public final SwipeRefreshLayout J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatImageView f9551O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9552n;
    public final TextView nr;
    public final ProgressBar rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecyclerView f9553t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9552n;
    }

    private nH(ConstraintLayout constraintLayout, ProgressBar progressBar, RecyclerView recyclerView, TextView textView, AppCompatImageView appCompatImageView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f9552n = constraintLayout;
        this.rl = progressBar;
        this.f9553t = recyclerView;
        this.nr = textView;
        this.f9551O = appCompatImageView;
        this.J2 = swipeRefreshLayout;
    }

    public static nH n(View view) {
        int i2 = 2131362787;
        ProgressBar progressBar = (ProgressBar) ViewBindings.n(view, 2131362787);
        if (progressBar != null) {
            i2 = 2131362788;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362788);
            if (recyclerView != null) {
                i2 = 2131362789;
                TextView textView = (TextView) ViewBindings.n(view, 2131362789);
                if (textView != null) {
                    i2 = 2131362790;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362790);
                    if (appCompatImageView != null) {
                        i2 = 2131363787;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.n(view, 2131363787);
                        if (swipeRefreshLayout != null) {
                            return new nH((ConstraintLayout) view, progressBar, recyclerView, textView, appCompatImageView, swipeRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static nH t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558805, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
