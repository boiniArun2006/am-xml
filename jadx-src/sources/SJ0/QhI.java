package SJ0;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class QhI implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FrameLayout f9285n;
    public final SurfaceView rl;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f9285n;
    }

    private QhI(FrameLayout frameLayout, SurfaceView surfaceView) {
        this.f9285n = frameLayout;
        this.rl = surfaceView;
    }

    public static QhI n(View view) {
        SurfaceView surfaceView = (SurfaceView) ViewBindings.n(view, 2131363433);
        if (surfaceView != null) {
            return new QhI((FrameLayout) view, surfaceView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131363433)));
    }

    public static QhI t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558817, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
