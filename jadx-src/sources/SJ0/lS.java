package SJ0;

import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class lS implements ViewBinding {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9518O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9519n;
    public final SeekBar nr;
    public final RecyclerView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f9520t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9519n;
    }

    private lS(ConstraintLayout constraintLayout, RecyclerView recyclerView, ImageView imageView, SeekBar seekBar, TextView textView) {
        this.f9519n = constraintLayout;
        this.rl = recyclerView;
        this.f9520t = imageView;
        this.nr = seekBar;
        this.f9518O = textView;
    }

    public static lS n(View view) {
        int i2 = 2131362163;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362163);
        if (recyclerView != null) {
            i2 = 2131363000;
            ImageView imageView = (ImageView) ViewBindings.n(view, 2131363000);
            if (imageView != null) {
                i2 = 2131363336;
                SeekBar seekBar = (SeekBar) ViewBindings.n(view, 2131363336);
                if (seekBar != null) {
                    i2 = 2131363337;
                    TextView textView = (TextView) ViewBindings.n(view, 2131363337);
                    if (textView != null) {
                        return new lS((ConstraintLayout) view, recyclerView, imageView, seekBar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
