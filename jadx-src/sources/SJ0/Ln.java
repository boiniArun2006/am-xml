package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ln implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9198n;
    public final View nr;
    public final ImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f9199t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9198n;
    }

    private Ln(ConstraintLayout constraintLayout, ImageView imageView, AppCompatTextView appCompatTextView, View view) {
        this.f9198n = constraintLayout;
        this.rl = imageView;
        this.f9199t = appCompatTextView;
        this.nr = view;
    }

    public static Ln n(View view) {
        int i2 = 2131362351;
        ImageView imageView = (ImageView) ViewBindings.n(view, 2131362351);
        if (imageView != null) {
            i2 = 2131362352;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362352);
            if (appCompatTextView != null) {
                i2 = 2131362560;
                View viewN = ViewBindings.n(view, 2131362560);
                if (viewN != null) {
                    return new Ln((ConstraintLayout) view, imageView, appCompatTextView, viewN);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static Ln t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558474, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
