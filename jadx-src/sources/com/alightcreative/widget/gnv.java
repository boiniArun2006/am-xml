package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class gnv extends View {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Paint f47411O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f47412n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f47413t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnv(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47412n = CollectionsKt.emptyList();
        this.f47413t = 1L;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f47411O = paint;
    }

    protected final List<Pair<Long, Long>> getHighlights() {
        return this.f47412n;
    }

    protected final Paint getPaint() {
        return this.f47411O;
    }

    protected final long getTotalTime() {
        return this.f47413t;
    }

    public final void n(List highlights, long j2) {
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        if (j2 == 0) {
            return;
        }
        if (Intrinsics.areEqual(this.f47412n, highlights) && this.f47413t == j2) {
            return;
        }
        this.f47412n = highlights;
        this.f47413t = j2;
        invalidate();
    }

    protected final void setHighlights(List<Pair<Long, Long>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f47412n = list;
    }

    protected final void setTotalTime(long j2) {
        this.f47413t = j2;
    }
}
