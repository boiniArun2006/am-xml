package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class iwV implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9489n;
    public final View rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecyclerView f9490t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9489n;
    }

    private iwV(ConstraintLayout constraintLayout, View view, RecyclerView recyclerView) {
        this.f9489n = constraintLayout;
        this.rl = view;
        this.f9490t = recyclerView;
    }

    public static iwV n(View view) {
        int i2 = 2131362560;
        View viewN = ViewBindings.n(view, 2131362560);
        if (viewN != null) {
            i2 = 2131363035;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131363035);
            if (recyclerView != null) {
                return new iwV((ConstraintLayout) view, viewN, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static iwV t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558476, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
