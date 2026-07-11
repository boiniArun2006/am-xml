package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.ValueSpinner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class RGN implements ViewBinding {
    public final AppCompatTextView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatTextView f9292O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9293n;
    public final AppCompatTextView nr;
    public final AppCompatImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ValueSpinner f9294t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9293n;
    }

    private RGN(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ValueSpinner valueSpinner, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.f9293n = constraintLayout;
        this.rl = appCompatImageView;
        this.f9294t = valueSpinner;
        this.nr = appCompatTextView;
        this.f9292O = appCompatTextView2;
        this.J2 = appCompatTextView3;
    }

    public static RGN n(View view) {
        int i2 = 2131363060;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363060);
        if (appCompatImageView != null) {
            i2 = 2131363403;
            ValueSpinner valueSpinner = (ValueSpinner) ViewBindings.n(view, 2131363403);
            if (valueSpinner != null) {
                i2 = 2131363477;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363477);
                if (appCompatTextView != null) {
                    i2 = 2131363493;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131363493);
                    if (appCompatTextView2 != null) {
                        i2 = 2131363494;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.n(view, 2131363494);
                        if (appCompatTextView3 != null) {
                            return new RGN((ConstraintLayout) view, appCompatImageView, valueSpinner, appCompatTextView, appCompatTextView2, appCompatTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static RGN t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558556, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
