package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.app.motion.activities.edit.fragments.CircleColorView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class pO implements ViewBinding {
    public final ImageView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9589O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9590n;
    public final TextView nr;
    public final CircleColorView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f9591t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9590n;
    }

    private pO(ConstraintLayout constraintLayout, CircleColorView circleColorView, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
        this.f9590n = constraintLayout;
        this.rl = circleColorView;
        this.f9591t = imageView;
        this.nr = textView;
        this.f9589O = textView2;
        this.J2 = imageView2;
    }

    public static pO n(View view) {
        int i2 = 2131362169;
        CircleColorView circleColorView = (CircleColorView) ViewBindings.n(view, 2131362169);
        if (circleColorView != null) {
            i2 = 2131362170;
            ImageView imageView = (ImageView) ViewBindings.n(view, 2131362170);
            if (imageView != null) {
                i2 = 2131362175;
                TextView textView = (TextView) ViewBindings.n(view, 2131362175);
                if (textView != null) {
                    i2 = 2131362176;
                    TextView textView2 = (TextView) ViewBindings.n(view, 2131362176);
                    if (textView2 != null) {
                        i2 = 2131362879;
                        ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131362879);
                        if (imageView2 != null) {
                            return new pO((ConstraintLayout) view, circleColorView, imageView, textView, textView2, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static pO t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558496, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
