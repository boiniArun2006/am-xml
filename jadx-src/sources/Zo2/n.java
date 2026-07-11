package Zo2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import rH.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final BalloonAnchorOverlayView f12602n;
    public final BalloonAnchorOverlayView rl;

    public static n n(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BalloonAnchorOverlayView balloonAnchorOverlayView = (BalloonAnchorOverlayView) view;
        return new n(balloonAnchorOverlayView, balloonAnchorOverlayView);
    }

    public static n t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(l3D.rl, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public BalloonAnchorOverlayView getRoot() {
        return this.f12602n;
    }

    private n(BalloonAnchorOverlayView balloonAnchorOverlayView, BalloonAnchorOverlayView balloonAnchorOverlayView2) {
        this.f12602n = balloonAnchorOverlayView;
        this.rl = balloonAnchorOverlayView2;
    }
}
