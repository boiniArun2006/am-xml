package SJ0;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.AlightSlider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class z3w implements ViewBinding {
    public final ImageButton J2;
    public final ImageButton KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageButton f9697O;
    public final ImageButton Uo;
    public final TextView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9698n;
    public final ConstraintLayout nr;
    public final ImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f9699t;
    public final AlightSlider xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9698n;
    }

    private z3w(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, AlightSlider alightSlider, TextView textView) {
        this.f9698n = constraintLayout;
        this.rl = imageView;
        this.f9699t = imageView2;
        this.nr = constraintLayout2;
        this.f9697O = imageButton;
        this.J2 = imageButton2;
        this.Uo = imageButton3;
        this.KN = imageButton4;
        this.xMQ = alightSlider;
        this.mUb = textView;
    }

    public static z3w n(View view) {
        int i2 = 2131362982;
        ImageView imageView = (ImageView) ViewBindings.n(view, 2131362982);
        if (imageView != null) {
            i2 = 2131362983;
            ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131362983);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i2 = 2131363543;
                ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131363543);
                if (imageButton != null) {
                    i2 = 2131363544;
                    ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131363544);
                    if (imageButton2 != null) {
                        i2 = 2131363545;
                        ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131363545);
                        if (imageButton3 != null) {
                            i2 = 2131363546;
                            ImageButton imageButton4 = (ImageButton) ViewBindings.n(view, 2131363546);
                            if (imageButton4 != null) {
                                i2 = 2131363740;
                                AlightSlider alightSlider = (AlightSlider) ViewBindings.n(view, 2131363740);
                                if (alightSlider != null) {
                                    i2 = 2131363741;
                                    TextView textView = (TextView) ViewBindings.n(view, 2131363741);
                                    if (textView != null) {
                                        return new z3w(constraintLayout, imageView, imageView2, constraintLayout, imageButton, imageButton2, imageButton3, imageButton4, alightSlider, textView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
