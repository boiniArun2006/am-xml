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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class VoU implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9375n;
    public final RelativeLayout nr;
    public final RecyclerViewEx rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f9376t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9375n;
    }

    private VoU(LinearLayout linearLayout, RecyclerViewEx recyclerViewEx, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout) {
        this.f9375n = linearLayout;
        this.rl = recyclerViewEx;
        this.f9376t = appCompatImageView;
        this.nr = relativeLayout;
    }

    public static VoU n(View view) {
        int i2 = 2131362862;
        RecyclerViewEx recyclerViewEx = (RecyclerViewEx) ViewBindings.n(view, 2131362862);
        if (recyclerViewEx != null) {
            i2 = 2131362896;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362896);
            if (appCompatImageView != null) {
                i2 = 2131362897;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.n(view, 2131362897);
                if (relativeLayout != null) {
                    return new VoU((LinearLayout) view, recyclerViewEx, appCompatImageView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static VoU t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558638, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
