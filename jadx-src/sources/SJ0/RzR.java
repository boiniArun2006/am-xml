package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class RzR implements ViewBinding {
    public final ConstraintLayout J2;
    public final RecyclerView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final RecyclerView f9295O;
    public final AppCompatEditText Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9296n;
    public final ConstraintLayout nr;
    public final AppCompatImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Barrier f9297t;
    public final RecyclerView xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9296n;
    }

    private RzR(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, Barrier barrier, ConstraintLayout constraintLayout2, RecyclerView recyclerView, ConstraintLayout constraintLayout3, AppCompatEditText appCompatEditText, RecyclerView recyclerView2, RecyclerView recyclerView3) {
        this.f9296n = constraintLayout;
        this.rl = appCompatImageButton;
        this.f9297t = barrier;
        this.nr = constraintLayout2;
        this.f9295O = recyclerView;
        this.J2 = constraintLayout3;
        this.Uo = appCompatEditText;
        this.KN = recyclerView2;
        this.xMQ = recyclerView3;
    }

    public static RzR n(View view) {
        int i2 = 2131362132;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.n(view, 2131362132);
        if (appCompatImageButton != null) {
            i2 = 2131362145;
            Barrier barrier = (Barrier) ViewBindings.n(view, 2131362145);
            if (barrier != null) {
                i2 = 2131362907;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131362907);
                if (constraintLayout != null) {
                    i2 = 2131362932;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362932);
                    if (recyclerView != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                        i2 = 2131363611;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.n(view, 2131363611);
                        if (appCompatEditText != null) {
                            i2 = 2131363612;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.n(view, 2131363612);
                            if (recyclerView2 != null) {
                                i2 = 2131364026;
                                RecyclerView recyclerView3 = (RecyclerView) ViewBindings.n(view, 2131364026);
                                if (recyclerView3 != null) {
                                    return new RzR(constraintLayout2, appCompatImageButton, barrier, constraintLayout, recyclerView, constraintLayout2, appCompatEditText, recyclerView2, recyclerView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static RzR t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558551, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
