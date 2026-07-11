package SJ0;

import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class HcS implements ViewBinding {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9140O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9141n;
    public final ImageView nr;
    public final SeekBar rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9142t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9141n;
    }

    private HcS(ConstraintLayout constraintLayout, SeekBar seekBar, TextView textView, ImageView imageView, TextView textView2) {
        this.f9141n = constraintLayout;
        this.rl = seekBar;
        this.f9142t = textView;
        this.nr = imageView;
        this.f9140O = textView2;
    }

    public static HcS n(View view) {
        int i2 = 2131362859;
        SeekBar seekBar = (SeekBar) ViewBindings.n(view, 2131362859);
        if (seekBar != null) {
            i2 = 2131362860;
            TextView textView = (TextView) ViewBindings.n(view, 2131362860);
            if (textView != null) {
                i2 = 2131363000;
                ImageView imageView = (ImageView) ViewBindings.n(view, 2131363000);
                if (imageView != null) {
                    i2 = 2131363308;
                    TextView textView2 = (TextView) ViewBindings.n(view, 2131363308);
                    if (textView2 != null) {
                        return new HcS((ConstraintLayout) view, seekBar, textView, imageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
