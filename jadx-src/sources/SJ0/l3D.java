package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class l3D implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9514n;
    public final PlayerView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f9515t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9514n;
    }

    private l3D(ConstraintLayout constraintLayout, PlayerView playerView, ConstraintLayout constraintLayout2) {
        this.f9514n = constraintLayout;
        this.rl = playerView;
        this.f9515t = constraintLayout2;
    }

    public static l3D n(View view) {
        PlayerView playerView = (PlayerView) ViewBindings.n(view, 2131362766);
        if (playerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new l3D(constraintLayout, playerView, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131362766)));
    }

    public static l3D t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558448, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
