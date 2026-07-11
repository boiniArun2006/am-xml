package SJ0;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class OU implements ViewBinding {
    public final LinearLayout HI;
    public final Button J2;
    public final LinearLayout KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final LinearLayout f9249O;
    public final FrameLayout Uo;
    public final TextView az;
    public final LinearLayout ck;
    public final LinearLayout gh;
    public final TextView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9250n;
    public final Button nr;
    public final ScrollView qie;
    public final Button rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Button f9251t;
    public final ImageView ty;
    public final FrameLayout xMQ;

    public static OU t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    public static OU n(View view) {
        int i2 = 2131362268;
        Button button = (Button) ViewBindings.n(view, 2131362268);
        if (button != null) {
            i2 = 2131362269;
            Button button2 = (Button) ViewBindings.n(view, 2131362269);
            if (button2 != null) {
                i2 = 2131362270;
                Button button3 = (Button) ViewBindings.n(view, 2131362270);
                if (button3 != null) {
                    i2 = 2131362272;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362272);
                    if (linearLayout != null) {
                        i2 = 2131362275;
                        Button button4 = (Button) ViewBindings.n(view, 2131362275);
                        if (button4 != null) {
                            i2 = R.id.content;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.n(view, R.id.content);
                            if (frameLayout != null) {
                                i2 = 2131362501;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.n(view, 2131362501);
                                if (linearLayout2 != null) {
                                    i2 = 2131362502;
                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.n(view, 2131362502);
                                    if (frameLayout2 != null) {
                                        i2 = 2131363196;
                                        TextView textView = (TextView) ViewBindings.n(view, 2131363196);
                                        if (textView != null) {
                                            LinearLayout linearLayout3 = (LinearLayout) view;
                                            i2 = 2131363606;
                                            ScrollView scrollView = (ScrollView) ViewBindings.n(view, 2131363606);
                                            if (scrollView != null) {
                                                i2 = 2131363910;
                                                TextView textView2 = (TextView) ViewBindings.n(view, 2131363910);
                                                if (textView2 != null) {
                                                    i2 = 2131363912;
                                                    ImageView imageView = (ImageView) ViewBindings.n(view, 2131363912);
                                                    if (imageView != null) {
                                                        i2 = 2131363916;
                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.n(view, 2131363916);
                                                        if (linearLayout4 != null) {
                                                            i2 = 2131363928;
                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.n(view, 2131363928);
                                                            if (linearLayout5 != null) {
                                                                return new OU(linearLayout3, button, button2, button3, linearLayout, button4, frameLayout, linearLayout2, frameLayout2, textView, linearLayout3, scrollView, textView2, imageView, linearLayout4, linearLayout5);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9250n;
    }

    private OU(LinearLayout linearLayout, Button button, Button button2, Button button3, LinearLayout linearLayout2, Button button4, FrameLayout frameLayout, LinearLayout linearLayout3, FrameLayout frameLayout2, TextView textView, LinearLayout linearLayout4, ScrollView scrollView, TextView textView2, ImageView imageView, LinearLayout linearLayout5, LinearLayout linearLayout6) {
        this.f9250n = linearLayout;
        this.rl = button;
        this.f9251t = button2;
        this.nr = button3;
        this.f9249O = linearLayout2;
        this.J2 = button4;
        this.Uo = frameLayout;
        this.KN = linearLayout3;
        this.xMQ = frameLayout2;
        this.mUb = textView;
        this.gh = linearLayout4;
        this.qie = scrollView;
        this.az = textView2;
        this.ty = imageView;
        this.HI = linearLayout5;
        this.ck = linearLayout6;
    }

    public static OU nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558510, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
