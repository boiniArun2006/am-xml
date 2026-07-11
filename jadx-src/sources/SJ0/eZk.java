package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.TimelineSimpleHighlightView;
import com.alightcreative.widget.TimelineTrimmingBarView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class eZk implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9431n;
    public final TimelineSimpleHighlightView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TimelineTrimmingBarView f9432t;

    public static eZk t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9431n;
    }

    private eZk(ConstraintLayout constraintLayout, TimelineSimpleHighlightView timelineSimpleHighlightView, TimelineTrimmingBarView timelineTrimmingBarView) {
        this.f9431n = constraintLayout;
        this.rl = timelineSimpleHighlightView;
        this.f9432t = timelineTrimmingBarView;
    }

    public static eZk n(View view) {
        int i2 = 2131362924;
        TimelineSimpleHighlightView timelineSimpleHighlightView = (TimelineSimpleHighlightView) ViewBindings.n(view, 2131362924);
        if (timelineSimpleHighlightView != null) {
            i2 = 2131364019;
            TimelineTrimmingBarView timelineTrimmingBarView = (TimelineTrimmingBarView) ViewBindings.n(view, 2131364019);
            if (timelineTrimmingBarView != null) {
                return new eZk((ConstraintLayout) view, timelineSimpleHighlightView, timelineTrimmingBarView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static eZk nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558659, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
