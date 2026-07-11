package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class ci implements ViewBinding {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final FrameLayout f9423O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9424n;
    public final ImageButton nr;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f9425t;

    public static ci t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9424n;
    }

    private ci(ConstraintLayout constraintLayout, ImageButton imageButton, LinearLayout linearLayout, ImageButton imageButton2, FrameLayout frameLayout) {
        this.f9424n = constraintLayout;
        this.rl = imageButton;
        this.f9425t = linearLayout;
        this.nr = imageButton2;
        this.f9423O = frameLayout;
    }

    public static ci n(View view) {
        int i2 = 2131362132;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362132);
        if (imageButton != null) {
            i2 = 2131362910;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362910);
            if (linearLayout != null) {
                i2 = 2131363362;
                ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131363362);
                if (imageButton2 != null) {
                    i2 = 2131363659;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.n(view, 2131363659);
                    if (frameLayout != null) {
                        return new ci((ConstraintLayout) view, imageButton, linearLayout, imageButton2, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static ci nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558462, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
