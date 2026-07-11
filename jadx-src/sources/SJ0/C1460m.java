package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.app.motion.activities.audiobrowser.AudioPlayCircleProgressBar;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: renamed from: SJ0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C1460m implements ViewBinding {
    public final AppCompatImageView J2;
    public final AudioPlayCircleProgressBar KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final View f9523O;
    public final ImageButton Uo;
    public final SimpleDraweeView gh;
    public final LinearLayout mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9524n;
    public final AppCompatTextView nr;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9525t;
    public final TextView xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9524n;
    }

    private C1460m(ConstraintLayout constraintLayout, ImageButton imageButton, TextView textView, AppCompatTextView appCompatTextView, View view, AppCompatImageView appCompatImageView, ImageButton imageButton2, AudioPlayCircleProgressBar audioPlayCircleProgressBar, TextView textView2, LinearLayout linearLayout, SimpleDraweeView simpleDraweeView) {
        this.f9524n = constraintLayout;
        this.rl = imageButton;
        this.f9525t = textView;
        this.nr = appCompatTextView;
        this.f9523O = view;
        this.J2 = appCompatImageView;
        this.Uo = imageButton2;
        this.KN = audioPlayCircleProgressBar;
        this.xMQ = textView2;
        this.mUb = linearLayout;
        this.gh = simpleDraweeView;
    }

    public static C1460m n(View view) {
        int i2 = 2131362003;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362003);
        if (imageButton != null) {
            i2 = 2131362032;
            TextView textView = (TextView) ViewBindings.n(view, 2131362032);
            if (textView != null) {
                i2 = 2131362033;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362033);
                if (appCompatTextView != null) {
                    i2 = 2131362560;
                    View viewN = ViewBindings.n(view, 2131362560);
                    if (viewN != null) {
                        i2 = 2131363396;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363396);
                        if (appCompatImageView != null) {
                            i2 = 2131363398;
                            ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131363398);
                            if (imageButton2 != null) {
                                i2 = 2131363457;
                                AudioPlayCircleProgressBar audioPlayCircleProgressBar = (AudioPlayCircleProgressBar) ViewBindings.n(view, 2131363457);
                                if (audioPlayCircleProgressBar != null) {
                                    i2 = 2131363732;
                                    TextView textView2 = (TextView) ViewBindings.n(view, 2131363732);
                                    if (textView2 != null) {
                                        i2 = 2131363866;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131363866);
                                        if (linearLayout != null) {
                                            i2 = 2131363886;
                                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363886);
                                            if (simpleDraweeView != null) {
                                                return new C1460m((ConstraintLayout) view, imageButton, textView, appCompatTextView, viewN, appCompatImageView, imageButton2, audioPlayCircleProgressBar, textView2, linearLayout, simpleDraweeView);
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

    public static C1460m t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558492, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
