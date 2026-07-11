package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.TimeKt;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013R*\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR*\u0010%\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u0014\u0010(\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001aR\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0014\u00102\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010-R\u0014\u00104\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010-R\u0014\u00106\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010-¨\u00069"}, d2 = {"Lcom/alightcreative/widget/TimelineTrimmingBarView;", "Lcom/alightcreative/widget/dT;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "", "Uo", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V", "J2", "(Landroid/graphics/Canvas;)V", "O", "", "value", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "J", "getTimelineDurationMillis", "()J", "setTimelineDurationMillis", "(J)V", "timelineDurationMillis", "N", "getSelectionDurationMillis", "setSelectionDurationMillis", "selectionDurationMillis", "v", "getSelectionStartMillis", "setSelectionStartMillis", "selectionStartMillis", "Xw", "Landroid/graphics/Paint;", "paintBorder", "getSelectionEndMillis", "selectionEndMillis", "", "getWidthRatio", "()F", "widthRatio", "getStartRatio", "startRatio", "getEndRatio", "endRatio", "getMiddleRatio", "middleRatio", "getBorderWidth", "borderWidth", "jB", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimelineTrimmingBarView extends dT {

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private long selectionDurationMillis;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private long timelineDurationMillis;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final Paint paintBorder;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long selectionStartMillis;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f47290U = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineTrimmingBarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.timelineDurationMillis = 1000L;
        this.selectionDurationMillis = 500L;
        Paint paint = getPaint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(getBorderWidth());
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(getBorderWidth());
        this.paintBorder = paint2;
    }

    @Override // com.alightcreative.widget.dT
    public void J2(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        String str = TimeKt.formatTimeMillis((int) this.selectionStartMillis, "mm:ss:tt", false) + " - " + TimeKt.formatTimeMillis((int) getSelectionEndMillis(), "mm:ss:tt", false);
        getPaint().getTextBounds(str, 0, str.length(), getTextRect());
        float f3 = 2;
        float timeTextHorizontalPadding = (getTextRect().right + (getTimeTextHorizontalPadding() * f3)) / f3;
        float fMax = Math.max(timeTextHorizontalPadding, Math.min(getWidth() - timeTextHorizontalPadding, (getMiddleRatio() * (getWidth() - getBorderWidth())) + (getBorderWidth() / f3)));
        getPaint().setColor(getDragging() ? dT.f47390r.rl() : dT.f47390r.n());
        canvas.drawRoundRect(fMax - timeTextHorizontalPadding, (getHeight() * 0.5f) - getTimeTextOffsetMax(), timeTextHorizontalPadding + fMax, (getHeight() * 0.5f) - getTimeTextOffsetMin(), getCornerRadius(), getCornerRadius(), getPaint());
        float timeTextOffsetMin = ((getTimeTextOffsetMin() + getTimeTextOffsetMax()) / f3) + (getTextRect().top / 2);
        getPaint().setColor(getDragging() ? dT.f47390r.n() : -1);
        canvas.drawText(str, fMax, (getHeight() * 0.5f) - timeTextOffsetMin, getPaint());
    }

    private final float getBorderWidth() {
        return getDensity() * 1.5f;
    }

    private final long getSelectionEndMillis() {
        return this.selectionStartMillis + this.selectionDurationMillis;
    }

    private final float getStartRatio() {
        return this.selectionStartMillis / this.timelineDurationMillis;
    }

    private final float getWidthRatio() {
        return this.selectionDurationMillis / this.timelineDurationMillis;
    }

    @Override // com.alightcreative.widget.dT
    public void O(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iRl = getDragging() ? dT.f47390r.rl() : dT.f47390r.n();
        this.paintBorder.setColor(iRl);
        getPaint().setColor(iRl);
        getPaint().setAlpha(165);
        Uo(canvas, this.paintBorder);
        Uo(canvas, getPaint());
    }

    public final long getSelectionDurationMillis() {
        return this.selectionDurationMillis;
    }

    public final long getSelectionStartMillis() {
        return this.selectionStartMillis;
    }

    public final long getTimelineDurationMillis() {
        return this.timelineDurationMillis;
    }

    public final void setSelectionDurationMillis(long j2) {
        if (this.selectionDurationMillis != j2) {
            this.selectionDurationMillis = j2;
            invalidate();
        }
    }

    public final void setSelectionStartMillis(long j2) {
        if (this.selectionStartMillis != j2) {
            this.selectionStartMillis = j2;
            invalidate();
        }
    }

    public final void setTimelineDurationMillis(long j2) {
        if (this.timelineDurationMillis != j2) {
            this.timelineDurationMillis = j2;
            invalidate();
        }
    }

    private final void Uo(Canvas canvas, Paint paint) {
        float f3 = 2;
        canvas.drawRoundRect((getStartRatio() * (getWidth() - getBorderWidth())) + (getBorderWidth() / f3), ((getHeight() * 0.5f) - (getTotalHeight() / f3)) + (paint.getStrokeWidth() / f3), (getEndRatio() * (getWidth() - getBorderWidth())) + (getBorderWidth() / f3), ((getHeight() * 0.5f) + (getTotalHeight() / f3)) - (paint.getStrokeWidth() / f3), getCornerRadius(), getCornerRadius(), paint);
    }

    private final float getEndRatio() {
        return getStartRatio() + getWidthRatio();
    }

    private final float getMiddleRatio() {
        return (getStartRatio() + getEndRatio()) / 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimelineTrimmingBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
