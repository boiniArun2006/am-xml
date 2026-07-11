package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class s6u implements ViewBinding {
    public final AppCompatImageView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9634O;
    public final SimpleDraweeView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9635n;
    public final TextView nr;
    public final Space rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9636t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9635n;
    }

    private s6u(ConstraintLayout constraintLayout, Space space, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView, SimpleDraweeView simpleDraweeView) {
        this.f9635n = constraintLayout;
        this.rl = space;
        this.f9636t = textView;
        this.nr = textView2;
        this.f9634O = textView3;
        this.J2 = appCompatImageView;
        this.Uo = simpleDraweeView;
    }

    public static s6u n(View view) {
        int i2 = 2131362133;
        Space space = (Space) ViewBindings.n(view, 2131362133);
        if (space != null) {
            i2 = 2131362634;
            TextView textView = (TextView) ViewBindings.n(view, 2131362634);
            if (textView != null) {
                i2 = 2131362636;
                TextView textView2 = (TextView) ViewBindings.n(view, 2131362636);
                if (textView2 != null) {
                    i2 = 2131362642;
                    TextView textView3 = (TextView) ViewBindings.n(view, 2131362642);
                    if (textView3 != null) {
                        i2 = 2131363191;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363191);
                        if (appCompatImageView != null) {
                            i2 = 2131363887;
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363887);
                            if (simpleDraweeView != null) {
                                return new s6u((ConstraintLayout) view, space, textView, textView2, textView3, appCompatImageView, simpleDraweeView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static s6u t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558639, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
