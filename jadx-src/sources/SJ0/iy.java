package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.VideoView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class iy implements ViewBinding {
    public final VideoView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatTextView f9491O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9492n;
    public final LinearLayout nr;
    public final AppCompatTextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f9493t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9492n;
    }

    private iy(LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LinearLayout linearLayout2, AppCompatTextView appCompatTextView3, VideoView videoView) {
        this.f9492n = linearLayout;
        this.rl = appCompatTextView;
        this.f9493t = appCompatTextView2;
        this.nr = linearLayout2;
        this.f9491O = appCompatTextView3;
        this.J2 = videoView;
    }

    public static iy n(View view) {
        int i2 = 2131362421;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362421);
        if (appCompatTextView != null) {
            i2 = 2131362422;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131362422);
            if (appCompatTextView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i2 = 2131362424;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.n(view, 2131362424);
                if (appCompatTextView3 != null) {
                    i2 = 2131362425;
                    VideoView videoView = (VideoView) ViewBindings.n(view, 2131362425);
                    if (videoView != null) {
                        return new iy(linearLayout, appCompatTextView, appCompatTextView2, linearLayout, appCompatTextView3, videoView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static iy t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558836, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
