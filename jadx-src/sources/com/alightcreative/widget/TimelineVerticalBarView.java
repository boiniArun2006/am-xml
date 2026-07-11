package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.TimeKt;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR*\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010!\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0014\u0010-\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0016¨\u00060"}, d2 = {"Lcom/alightcreative/widget/TimelineVerticalBarView;", "Lcom/alightcreative/widget/dT;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "", "J2", "(Landroid/graphics/Canvas;)V", "O", "", "value", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "F", "getProgress", "()F", "setProgress", "(F)V", "progress", "", "N", "J", "getCurrentTimeMillis", "()J", "setCurrentTimeMillis", "(J)V", "currentTimeMillis", "", "v", "Z", "getDarkMode", "()Z", "setDarkMode", "(Z)V", "darkMode", "getVerticalBarWidth", "verticalBarWidth", "getMarkerHeight", "markerHeight", "Xw", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimelineVerticalBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineVerticalBarView.kt\ncom/alightcreative/widget/TimelineVerticalBarView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,140:1\n404#2:141\n404#2:142\n404#2:143\n*S KotlinDebug\n*F\n+ 1 TimelineVerticalBarView.kt\ncom/alightcreative/widget/TimelineVerticalBarView\n*L\n135#1:141\n136#1:142\n137#1:143\n*E\n"})
public final class TimelineVerticalBarView extends dT {

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private long currentTimeMillis;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private float progress;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean darkMode;
    public static final int jB = 8;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final int f47294U = Color.parseColor("#A2A7D1");
    private static final int P5 = Color.parseColor("#202332");
    private static final int M7 = Color.parseColor("#E9ECFF");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineVerticalBarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentTimeMillis = 1000L;
        getPaint().setStyle(Paint.Style.FILL);
    }

    @Override // com.alightcreative.widget.dT
    public void J2(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        String timeMillis = TimeKt.formatTimeMillis((int) this.currentTimeMillis, "mm:ss:tt", false);
        getPaint().getTextBounds(timeMillis, 0, timeMillis.length(), getTextRect());
        float f3 = 2;
        float timeTextHorizontalPadding = (getTextRect().right + (getTimeTextHorizontalPadding() * f3)) / f3;
        float fMax = Math.max(timeTextHorizontalPadding, Math.min(getWidth() - timeTextHorizontalPadding, (this.progress * (getWidth() - getVerticalBarWidth())) + (getVerticalBarWidth() / f3)));
        getPaint().setColor(this.darkMode ? M7 : getDragging() ? dT.f47390r.rl() : dT.f47390r.n());
        canvas.drawRoundRect(fMax - timeTextHorizontalPadding, (getHeight() * 0.5f) - getTimeTextOffsetMax(), timeTextHorizontalPadding + fMax, (getHeight() * 0.5f) - getTimeTextOffsetMin(), getCornerRadius(), getCornerRadius(), getPaint());
        float timeTextOffsetMin = ((getTimeTextOffsetMin() + getTimeTextOffsetMax()) / f3) + (getTextRect().top / 2);
        getPaint().setColor(this.darkMode ? P5 : getDragging() ? dT.f47390r.n() : -1);
        canvas.drawText(timeMillis, fMax, (getHeight() * 0.5f) - timeTextOffsetMin, getPaint());
    }

    private final float getMarkerHeight() {
        return getDensity() * 12.0f;
    }

    private final float getVerticalBarWidth() {
        return getDensity() * 10.0f;
    }

    @Override // com.alightcreative.widget.dT
    public void O(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getPaint().setColor(this.darkMode ? f47294U : getDragging() ? dT.f47390r.rl() : dT.f47390r.n());
        float width = (getWidth() - getVerticalBarWidth()) * this.progress;
        float width2 = (this.progress * (getWidth() - getVerticalBarWidth())) + getVerticalBarWidth();
        canvas.drawRoundRect(width, (getHeight() - getTotalHeight()) * 0.5f, width2, (getHeight() + getTotalHeight()) * 0.5f, getCornerRadius(), getCornerRadius(), getPaint());
        getPaint().setColor(this.darkMode ? P5 : getDragging() ? dT.f47390r.nr() : dT.f47390r.t());
        float f3 = (width2 - width) / 7;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = i2 * 2;
            float f4 = 2;
            float f5 = f3 / f4;
            canvas.drawRoundRect(((i3 + 1) * f3) + width, Math.max(0.0f, (getHeight() - getMarkerHeight()) / f4), width + ((i3 + 2) * f3), Math.min(getHeight(), (getHeight() + getMarkerHeight()) / f4), f5, f5, getPaint());
        }
    }

    public final long getCurrentTimeMillis() {
        return this.currentTimeMillis;
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final void setCurrentTimeMillis(long j2) {
        if (this.currentTimeMillis != j2) {
            this.currentTimeMillis = j2;
            invalidate();
        }
    }

    public final void setDarkMode(boolean z2) {
        this.darkMode = z2;
    }

    public final void setProgress(float f3) {
        if (this.progress == f3) {
            return;
        }
        this.progress = f3;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimelineVerticalBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
