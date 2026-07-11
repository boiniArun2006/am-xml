package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.AlightSlider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class xuv implements ViewBinding {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AlightSlider f9684O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9685n;
    public final AppCompatTextView nr;
    public final AppCompatImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f9686t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9685n;
    }

    private xuv(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AlightSlider alightSlider) {
        this.f9685n = constraintLayout;
        this.rl = appCompatImageView;
        this.f9686t = appCompatTextView;
        this.nr = appCompatTextView2;
        this.f9684O = alightSlider;
    }

    public static xuv n(View view) {
        int i2 = 2131363060;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363060);
        if (appCompatImageView != null) {
            i2 = 2131363477;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363477);
            if (appCompatTextView != null) {
                i2 = 2131363484;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131363484);
                if (appCompatTextView2 != null) {
                    i2 = 2131363491;
                    AlightSlider alightSlider = (AlightSlider) ViewBindings.n(view, 2131363491);
                    if (alightSlider != null) {
                        return new xuv((ConstraintLayout) view, appCompatImageView, appCompatTextView, appCompatTextView2, alightSlider);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static xuv t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558558, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
