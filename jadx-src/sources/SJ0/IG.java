package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class IG implements ViewBinding {
    public final ImageButton J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageButton f9153O;
    public final TextView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9154n;
    public final ImageButton nr;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageButton f9155t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9154n;
    }

    private IG(LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, ImageButton imageButton5, TextView textView) {
        this.f9154n = linearLayout;
        this.rl = imageButton;
        this.f9155t = imageButton2;
        this.nr = imageButton3;
        this.f9153O = imageButton4;
        this.J2 = imageButton5;
        this.Uo = textView;
    }

    public static IG n(View view) {
        int i2 = 2131363207;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131363207);
        if (imageButton != null) {
            i2 = 2131363208;
            ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131363208);
            if (imageButton2 != null) {
                i2 = 2131363266;
                ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131363266);
                if (imageButton3 != null) {
                    i2 = 2131363305;
                    ImageButton imageButton4 = (ImageButton) ViewBindings.n(view, 2131363305);
                    if (imageButton4 != null) {
                        i2 = 2131363431;
                        ImageButton imageButton5 = (ImageButton) ViewBindings.n(view, 2131363431);
                        if (imageButton5 != null) {
                            i2 = 2131363655;
                            TextView textView = (TextView) ViewBindings.n(view, 2131363655);
                            if (textView != null) {
                                return new IG((LinearLayout) view, imageButton, imageButton2, imageButton3, imageButton4, imageButton5, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static IG t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558596, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
