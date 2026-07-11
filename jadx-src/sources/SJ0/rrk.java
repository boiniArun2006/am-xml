package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class rrk implements ViewBinding {
    public final VideoView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatTextView f9626O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9627n;
    public final AppCompatTextView nr;
    public final ConstraintLayout rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f9628t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9627n;
    }

    private rrk(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, VideoView videoView) {
        this.f9627n = constraintLayout;
        this.rl = constraintLayout2;
        this.f9628t = appCompatTextView;
        this.nr = appCompatTextView2;
        this.f9626O = appCompatTextView3;
        this.J2 = videoView;
    }

    public static rrk n(View view) {
        int i2 = 2131362528;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131362528);
        if (constraintLayout != null) {
            i2 = 2131362529;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362529);
            if (appCompatTextView != null) {
                i2 = 2131363215;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131363215);
                if (appCompatTextView2 != null) {
                    i2 = 2131363910;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.n(view, 2131363910);
                    if (appCompatTextView3 != null) {
                        i2 = 2131364033;
                        VideoView videoView = (VideoView) ViewBindings.n(view, 2131364033);
                        if (videoView != null) {
                            return new rrk((ConstraintLayout) view, constraintLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, videoView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static rrk t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558759, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
