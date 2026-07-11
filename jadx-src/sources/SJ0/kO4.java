package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.app.motion.activities.edit.ColorView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class kO4 implements ViewBinding {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatTextView f9508O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9509n;
    public final ColorView nr;
    public final AppCompatTextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f9510t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9509n;
    }

    private kO4(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, ColorView colorView, AppCompatTextView appCompatTextView2) {
        this.f9509n = constraintLayout;
        this.rl = appCompatTextView;
        this.f9510t = appCompatImageView;
        this.nr = colorView;
        this.f9508O = appCompatTextView2;
    }

    public static kO4 n(View view) {
        int i2 = 2131362391;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362391);
        if (appCompatTextView != null) {
            i2 = 2131363060;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363060);
            if (appCompatImageView != null) {
                i2 = 2131363476;
                ColorView colorView = (ColorView) ViewBindings.n(view, 2131363476);
                if (colorView != null) {
                    i2 = 2131363477;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131363477);
                    if (appCompatTextView2 != null) {
                        return new kO4((ConstraintLayout) view, appCompatTextView, appCompatImageView, colorView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static kO4 t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558553, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
