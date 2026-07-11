package SJ0;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class ozJ implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final NestedScrollView f9585n;
    public final RecyclerView nr;
    public final AppCompatButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatButton f9586t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f9585n;
    }

    private ozJ(NestedScrollView nestedScrollView, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, RecyclerView recyclerView) {
        this.f9585n = nestedScrollView;
        this.rl = appCompatButton;
        this.f9586t = appCompatButton2;
        this.nr = recyclerView;
    }

    public static ozJ n(View view) {
        int i2 = 2131362451;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.n(view, 2131362451);
        if (appCompatButton != null) {
            i2 = 2131362606;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.n(view, 2131362606);
            if (appCompatButton2 != null) {
                i2 = 2131362657;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362657);
                if (recyclerView != null) {
                    return new ozJ((NestedScrollView) view, appCompatButton, appCompatButton2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
