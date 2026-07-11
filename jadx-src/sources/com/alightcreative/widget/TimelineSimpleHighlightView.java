package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import com.alightcreative.app.motion.scene.TimeKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u000fR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/alightcreative/widget/TimelineSimpleHighlightView;", "Lcom/alightcreative/widget/gnv;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "", "nr", "(Landroid/graphics/Canvas;)V", "t", "rl", "onDraw", "", "J2", "Z", "getDarkMode", "()Z", "setDarkMode", "(Z)V", "darkMode", "", "r", "F", "density", "Landroid/graphics/Rect;", "o", "Landroid/graphics/Rect;", "textRect", "S", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimelineSimpleHighlightView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineSimpleHighlightView.kt\ncom/alightcreative/widget/TimelineSimpleHighlightView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,126:1\n404#2:127\n404#2:128\n404#2:129\n404#2:130\n*S KotlinDebug\n*F\n+ 1 TimelineSimpleHighlightView.kt\ncom/alightcreative/widget/TimelineSimpleHighlightView\n*L\n120#1:127\n121#1:128\n122#1:129\n123#1:130\n*E\n"})
public final class TimelineSimpleHighlightView extends gnv {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean darkMode;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Rect textRect;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final float density;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f47287g = 8;
    private static final int E2 = Color.parseColor("#8D8D8D");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f47286e = Color.parseColor("#FFCD4B");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final int f47285T = Color.parseColor("#EF7937");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final int f47283N = Color.parseColor("#DDDDDD");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineSimpleHighlightView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        float f3 = getResources().getDisplayMetrics().density;
        this.density = f3;
        this.textRect = new Rect();
        Paint paint = getPaint();
        paint.setTextSize(f3 * 10.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setTypeface(ResourcesCompat.KN(context, 2131296270));
    }

    private final void nr(Canvas canvas) {
        float f3 = this.density * 3.0f;
        getPaint().setColor(this.darkMode ? f47283N : -3355444);
        canvas.drawRoundRect(0.0f, (getHeight() * 0.5f) - f3, getWidth() * 1.0f, (getHeight() * 0.5f) + f3, f3, f3, getPaint());
    }

    private final void t(Canvas canvas) {
        float f3 = this.density * 3.0f;
        getPaint().setColor(this.darkMode ? f47285T : f47286e);
        for (Pair<Long, Long> pair : getHighlights()) {
            long jLongValue = pair.component1().longValue();
            long jLongValue2 = pair.component2().longValue();
            float width = ((jLongValue * 1.0f) * getWidth()) / getTotalTime();
            float width2 = ((jLongValue2 * 1.0f) * getWidth()) / getTotalTime();
            float f4 = 2;
            float f5 = (width + width2) / f4;
            float f6 = this.density * 3.0f;
            float f7 = f4 * f6;
            canvas.drawRoundRect(Math.max(0.0f, Math.min(width, Math.min(f5 - f6, (getWidth() * 1.0f) - f7))), (getHeight() * 0.5f) - f3, Math.min(getWidth() * 1.0f, Math.max(width2, Math.max(f5 + f6, f7))), (getHeight() * 0.5f) + f3, f3, f3, getPaint());
        }
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        nr(canvas);
        t(canvas);
        rl(canvas);
    }

    public final void setDarkMode(boolean z2) {
        this.darkMode = z2;
    }

    private final void rl(Canvas canvas) {
        String timeMillis = TimeKt.formatTimeMillis((int) getTotalTime(), "mm:ss:tt", false);
        float f3 = this.density * 30.0f;
        getPaint().setColor(E2);
        getPaint().getTextBounds("00:00:00", 0, 8, this.textRect);
        canvas.drawText("00:00:00", this.textRect.right * 0.5f, (getHeight() * 0.5f) + f3, getPaint());
        getPaint().getTextBounds(timeMillis, 0, timeMillis.length(), this.textRect);
        canvas.drawText(timeMillis, getWidth() - (this.textRect.right * 0.5f), (getHeight() * 0.5f) + f3, getPaint());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimelineSimpleHighlightView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
