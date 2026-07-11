package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Z implements ViewBinding {
    public final ConstraintLayout J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9397O;
    public final TextView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9398n;
    public final View nr;
    public final AppCompatImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f9399t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9398n;
    }

    private Z(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, AppCompatImageView appCompatImageView, View view, TextView textView, ConstraintLayout constraintLayout2, TextView textView2) {
        this.f9398n = constraintLayout;
        this.rl = appCompatImageButton;
        this.f9399t = appCompatImageView;
        this.nr = view;
        this.f9397O = textView;
        this.J2 = constraintLayout2;
        this.Uo = textView2;
    }

    public static Z n(View view) {
        int i2 = 2131362013;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.n(view, 2131362013);
        if (appCompatImageButton != null) {
            i2 = 2131362015;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362015);
            if (appCompatImageView != null) {
                i2 = 2131362368;
                View viewN = ViewBindings.n(view, 2131362368);
                if (viewN != null) {
                    i2 = 2131362642;
                    TextView textView = (TextView) ViewBindings.n(view, 2131362642);
                    if (textView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i2 = 2131363422;
                        TextView textView2 = (TextView) ViewBindings.n(view, 2131363422);
                        if (textView2 != null) {
                            return new Z(constraintLayout, appCompatImageButton, appCompatImageView, viewN, textView, constraintLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static Z t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558466, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
