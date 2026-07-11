package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class eh implements ViewBinding {
    public final SimpleDraweeView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9433O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9434n;
    public final TextView nr;
    public final AppCompatImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FrameLayout f9435t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9434n;
    }

    private eh(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout, TextView textView, TextView textView2, SimpleDraweeView simpleDraweeView) {
        this.f9434n = constraintLayout;
        this.rl = appCompatImageView;
        this.f9435t = frameLayout;
        this.nr = textView;
        this.f9433O = textView2;
        this.J2 = simpleDraweeView;
    }

    public static eh n(View view) {
        int i2 = 2131362999;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362999);
        if (appCompatImageView != null) {
            i2 = 2131363001;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.n(view, 2131363001);
            if (frameLayout != null) {
                i2 = 2131363051;
                TextView textView = (TextView) ViewBindings.n(view, 2131363051);
                if (textView != null) {
                    i2 = 2131363082;
                    TextView textView2 = (TextView) ViewBindings.n(view, 2131363082);
                    if (textView2 != null) {
                        i2 = 2131363887;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363887);
                        if (simpleDraweeView != null) {
                            return new eh((ConstraintLayout) view, appCompatImageView, frameLayout, textView, textView2, simpleDraweeView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static eh t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558834, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
