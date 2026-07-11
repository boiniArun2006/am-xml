package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.TimelineSimpleHighlightView;
import com.alightcreative.widget.TimelineVerticalBarView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class yr implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9691n;
    public final TimelineSimpleHighlightView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TimelineVerticalBarView f9692t;

    public static yr t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9691n;
    }

    private yr(ConstraintLayout constraintLayout, TimelineSimpleHighlightView timelineSimpleHighlightView, TimelineVerticalBarView timelineVerticalBarView) {
        this.f9691n = constraintLayout;
        this.rl = timelineSimpleHighlightView;
        this.f9692t = timelineVerticalBarView;
    }

    public static yr n(View view) {
        int i2 = 2131362924;
        TimelineSimpleHighlightView timelineSimpleHighlightView = (TimelineSimpleHighlightView) ViewBindings.n(view, 2131362924);
        if (timelineSimpleHighlightView != null) {
            i2 = 2131364019;
            TimelineVerticalBarView timelineVerticalBarView = (TimelineVerticalBarView) ViewBindings.n(view, 2131364019);
            if (timelineVerticalBarView != null) {
                return new yr((ConstraintLayout) view, timelineSimpleHighlightView, timelineVerticalBarView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static yr nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558656, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
