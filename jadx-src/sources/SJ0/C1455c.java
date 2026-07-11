package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: renamed from: SJ0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C1455c implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9416n;
    public final PlayerView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f9417t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9416n;
    }

    private C1455c(ConstraintLayout constraintLayout, PlayerView playerView, ConstraintLayout constraintLayout2) {
        this.f9416n = constraintLayout;
        this.rl = playerView;
        this.f9417t = constraintLayout2;
    }

    public static C1455c n(View view) {
        PlayerView playerView = (PlayerView) ViewBindings.n(view, 2131362766);
        if (playerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new C1455c(constraintLayout, playerView, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131362766)));
    }

    public static C1455c t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558449, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
