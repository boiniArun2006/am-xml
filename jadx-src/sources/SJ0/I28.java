package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 implements ViewBinding {
    public final TextView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageView f9146O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9147n;
    public final Button nr;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9148t;

    public static I28 t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9147n;
    }

    private I28(ConstraintLayout constraintLayout, TextView textView, TextView textView2, Button button, ImageView imageView, TextView textView3) {
        this.f9147n = constraintLayout;
        this.rl = textView;
        this.f9148t = textView2;
        this.nr = button;
        this.f9146O = imageView;
        this.J2 = textView3;
    }

    public static I28 n(View view) {
        int i2 = 2131362527;
        TextView textView = (TextView) ViewBindings.n(view, 2131362527);
        if (textView != null) {
            i2 = 2131362539;
            TextView textView2 = (TextView) ViewBindings.n(view, 2131362539);
            if (textView2 != null) {
                i2 = 2131362868;
                Button button = (Button) ViewBindings.n(view, 2131362868);
                if (button != null) {
                    i2 = 2131363123;
                    ImageView imageView = (ImageView) ViewBindings.n(view, 2131363123);
                    if (imageView != null) {
                        i2 = 2131363322;
                        TextView textView3 = (TextView) ViewBindings.n(view, 2131363322);
                        if (textView3 != null) {
                            return new I28((ConstraintLayout) view, textView, textView2, button, imageView, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static I28 nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558432, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
