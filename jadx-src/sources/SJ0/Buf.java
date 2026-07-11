package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Buf implements ViewBinding {
    public final Button J2;
    public final Button KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Button f9087O;
    public final Button Uo;
    public final TextView az;
    public final TextView gh;
    public final RecyclerView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FrameLayout f9088n;
    public final Button nr;
    public final TextView qie;
    public final SimpleDraweeView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f9089t;
    public final LinearLayout xMQ;

    public static Buf n(View view) {
        int i2 = 2131362440;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131362440);
        if (simpleDraweeView != null) {
            i2 = 2131362443;
            ImageView imageView = (ImageView) ViewBindings.n(view, 2131362443);
            if (imageView != null) {
                i2 = 2131362477;
                Button button = (Button) ViewBindings.n(view, 2131362477);
                if (button != null) {
                    i2 = 2131362478;
                    Button button2 = (Button) ViewBindings.n(view, 2131362478);
                    if (button2 != null) {
                        i2 = 2131362479;
                        Button button3 = (Button) ViewBindings.n(view, 2131362479);
                        if (button3 != null) {
                            i2 = 2131362480;
                            Button button4 = (Button) ViewBindings.n(view, 2131362480);
                            if (button4 != null) {
                                i2 = 2131362481;
                                Button button5 = (Button) ViewBindings.n(view, 2131362481);
                                if (button5 != null) {
                                    i2 = 2131362482;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362482);
                                    if (linearLayout != null) {
                                        i2 = 2131362640;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362640);
                                        if (recyclerView != null) {
                                            i2 = 2131363784;
                                            TextView textView = (TextView) ViewBindings.n(view, 2131363784);
                                            if (textView != null) {
                                                i2 = 2131363860;
                                                TextView textView2 = (TextView) ViewBindings.n(view, 2131363860);
                                                if (textView2 != null) {
                                                    i2 = 2131363910;
                                                    TextView textView3 = (TextView) ViewBindings.n(view, 2131363910);
                                                    if (textView3 != null) {
                                                        return new Buf((FrameLayout) view, simpleDraweeView, imageView, button, button2, button3, button4, button5, linearLayout, recyclerView, textView, textView2, textView3);
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
    public FrameLayout getRoot() {
        return this.f9088n;
    }

    private Buf(FrameLayout frameLayout, SimpleDraweeView simpleDraweeView, ImageView imageView, Button button, Button button2, Button button3, Button button4, Button button5, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.f9088n = frameLayout;
        this.rl = simpleDraweeView;
        this.f9089t = imageView;
        this.nr = button;
        this.f9087O = button2;
        this.J2 = button3;
        this.Uo = button4;
        this.KN = button5;
        this.xMQ = linearLayout;
        this.mUb = recyclerView;
        this.gh = textView;
        this.qie = textView2;
        this.az = textView3;
    }

    public static Buf t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558801, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
