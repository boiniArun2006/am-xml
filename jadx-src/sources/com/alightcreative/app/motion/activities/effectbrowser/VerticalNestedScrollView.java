package com.alightcreative.app.motion.activities.effectbrowser;

import Hr.CQ.USEaHtCMH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/alightcreative/app/motion/activities/effectbrowser/VerticalNestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "piY", "F", "xDistance", "ijL", "yDistance", "m", "lastX", "eTf", "lastY", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerticalNestedScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    private float lastY;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private float yDistance;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float lastX;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private float xDistance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalNestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, USEaHtCMH.NJE);
        int action = ev.getAction();
        if (action == 0) {
            this.yDistance = 0.0f;
            this.xDistance = 0.0f;
            this.lastX = ev.getX();
            this.lastY = ev.getY();
        } else if (action == 2) {
            float x2 = ev.getX();
            float y2 = ev.getY();
            this.xDistance += Math.abs(x2 - this.lastX);
            float fAbs = this.yDistance + Math.abs(y2 - this.lastY);
            this.yDistance = fAbs;
            this.lastX = x2;
            this.lastY = y2;
            if (this.xDistance > fAbs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }
}
