package SJ0;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Md implements ViewBinding {
    public final ImageView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ConstraintLayout f9222O;
    public final ImageButton Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9223n;
    public final RecyclerView nr;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f9224t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9223n;
    }

    private Md(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout2, ImageView imageView, ImageButton imageButton) {
        this.f9223n = constraintLayout;
        this.rl = textView;
        this.f9224t = linearLayout;
        this.nr = recyclerView;
        this.f9222O = constraintLayout2;
        this.J2 = imageView;
        this.Uo = imageButton;
    }

    public static Md n(View view) {
        int i2 = 2131362061;
        TextView textView = (TextView) ViewBindings.n(view, 2131362061);
        if (textView != null) {
            i2 = 2131362062;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362062);
            if (linearLayout != null) {
                i2 = 2131362064;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362064);
                if (recyclerView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i2 = 2131362066;
                    ImageView imageView = (ImageView) ViewBindings.n(view, 2131362066);
                    if (imageView != null) {
                        i2 = 2131362240;
                        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362240);
                        if (imageButton != null) {
                            return new Md(constraintLayout, textView, linearLayout, recyclerView, constraintLayout, imageView, imageButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
