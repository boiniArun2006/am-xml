package com.alightcreative.app.motion.activities.edit.fragments;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/alightcreative/app/motion/activities/edit/fragments/CircleColorView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "", "value", c.f62177j, "I", "getColor", "()I", "setColor", "(I)V", TtmlNode.ATTR_TTS_COLOR, "Landroid/graphics/Paint;", "t", "Landroid/graphics/Paint;", "paint", "O", "bgColor", "J2", "inset", "Landroid/graphics/Rect;", "r", "Landroid/graphics/Rect;", "rect", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CircleColorView extends View {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int inset;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int bgColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int color;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Rect rect;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.color = -1;
        this.paint = new Paint();
        this.bgColor = getResources().getColor(2131099740, getContext().getTheme());
        this.inset = getResources().getDimensionPixelOffset(2131165283);
        this.rect = new Rect();
    }

    public final int getColor() {
        return this.color;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.paint.setAntiAlias(true);
        this.paint.setColor(this.bgColor);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.getClipBounds(this.rect);
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.rect.width() / 2.0f, this.paint);
        this.paint.setColor(this.color);
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), (this.rect.width() / 2.0f) - this.inset, this.paint);
    }

    public final void setColor(int i2) {
        if (this.color != i2) {
            this.color = i2;
            invalidate();
        }
    }
}
