package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/alightcreative/widget/ThumbnailTimelineHighlightView;", "Lcom/alightcreative/widget/gnv;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "value", "J2", "I", "getColor", "()I", "setColor", "(I)V", TtmlNode.ATTR_TTS_COLOR, "r", "getAlpha", "setAlpha", "alpha", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThumbnailTimelineHighlightView extends gnv {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int color;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbnailTimelineHighlightView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.color = -16711936;
        this.alpha = 255;
        Paint paint = getPaint();
        paint.setColor(this.color);
        paint.setAlpha(this.alpha);
    }

    @Override // android.view.View
    public final int getAlpha() {
        return this.alpha;
    }

    public final int getColor() {
        return this.color;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        for (Pair<Long, Long> pair : getHighlights()) {
            canvas.drawRect(((pair.component1().longValue() * 1.0f) * getWidth()) / getTotalTime(), 0.0f, ((pair.component2().longValue() * 1.0f) * getWidth()) / getTotalTime(), getHeight(), getPaint());
        }
    }

    public final void setAlpha(int i2) {
        if (this.alpha != i2) {
            this.alpha = i2;
            getPaint().setAlpha(i2);
        }
    }

    public final void setColor(int i2) {
        if (this.color != i2) {
            this.color = i2;
            getPaint().setColor(i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThumbnailTimelineHighlightView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
