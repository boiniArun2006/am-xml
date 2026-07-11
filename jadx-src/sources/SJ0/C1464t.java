package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: renamed from: SJ0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C1464t implements ViewBinding {
    public final View J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Switch f9637O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9638n;
    public final TextView nr;
    public final AppCompatImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9639t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9638n;
    }

    private C1464t(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, Switch r52, View view) {
        this.f9638n = constraintLayout;
        this.rl = appCompatImageView;
        this.f9639t = textView;
        this.nr = textView2;
        this.f9637O = r52;
        this.J2 = view;
    }

    public static C1464t n(View view) {
        int i2 = 2131362757;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362757);
        if (appCompatImageView != null) {
            i2 = 2131363477;
            TextView textView = (TextView) ViewBindings.n(view, 2131363477);
            if (textView != null) {
                i2 = 2131363481;
                TextView textView2 = (TextView) ViewBindings.n(view, 2131363481);
                if (textView2 != null) {
                    i2 = 2131363627;
                    Switch r7 = (Switch) ViewBindings.n(view, 2131363627);
                    if (r7 != null) {
                        i2 = 2131363628;
                        View viewN = ViewBindings.n(view, 2131363628);
                        if (viewN != null) {
                            return new C1464t((ConstraintLayout) view, appCompatImageView, textView, textView2, r7, viewN);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static C1464t t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558560, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
