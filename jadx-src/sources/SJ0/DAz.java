package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class DAz implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FrameLayout f9112n;
    public final ImageView rl;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f9112n;
    }

    private DAz(FrameLayout frameLayout, ImageView imageView) {
        this.f9112n = frameLayout;
        this.rl = imageView;
    }

    public static DAz n(View view) {
        ImageView imageView = (ImageView) ViewBindings.n(view, 2131363671);
        if (imageView != null) {
            return new DAz((FrameLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131363671)));
    }

    public static DAz t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558469, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
