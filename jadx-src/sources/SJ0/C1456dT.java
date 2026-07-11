package SJ0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: renamed from: SJ0.dT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C1456dT implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9428n;
    public final RecyclerView rl;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9428n;
    }

    private C1456dT(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.f9428n = constraintLayout;
        this.rl = recyclerView;
    }

    public static C1456dT n(View view) {
        RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131363670);
        if (recyclerView != null) {
            return new C1456dT((ConstraintLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131363670)));
    }
}
