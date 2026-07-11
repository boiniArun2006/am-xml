package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.RecyclerViewEx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Um implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9368n;
    public final RelativeLayout nr;
    public final RecyclerViewEx rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f9369t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9368n;
    }

    private Um(LinearLayout linearLayout, RecyclerViewEx recyclerViewEx, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout) {
        this.f9368n = linearLayout;
        this.rl = recyclerViewEx;
        this.f9369t = appCompatImageView;
        this.nr = relativeLayout;
    }

    public static Um n(View view) {
        int i2 = 2131363307;
        RecyclerViewEx recyclerViewEx = (RecyclerViewEx) ViewBindings.n(view, 2131363307);
        if (recyclerViewEx != null) {
            i2 = 2131363326;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363326);
            if (appCompatImageView != null) {
                i2 = 2131363327;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.n(view, 2131363327);
                if (relativeLayout != null) {
                    return new Um((LinearLayout) view, recyclerViewEx, appCompatImageView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static Um t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558761, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
