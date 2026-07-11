package com.alightcreative.app.motion.activities.audiobrowser;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\"\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010'\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!R\u0011\u0010*\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/alightcreative/app/motion/activities/audiobrowser/AudioPlayCircleProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", c.f62177j, "Landroid/graphics/Paint;", "paint", "", "t", "I", "trackForeground", "O", "trackBackground", "", "J2", "F", "rotateStrokeWidth", "r", "_angle", "o", "getTotalDuration", "()I", "setTotalDuration", "(I)V", "totalDuration", "value", "S", "getCurrentDuration", "setCurrentDuration", "currentDuration", "getAngle", "()F", "angle", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AudioPlayCircleProgressBar extends View {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float rotateStrokeWidth;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int trackBackground;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int currentDuration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int totalDuration;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float _angle;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int trackForeground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayCircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint(1);
        this.trackForeground = -1;
        this.trackBackground = -16777216;
        this.rotateStrokeWidth = getResources().getDimension(2131165296);
    }

    /* JADX INFO: renamed from: getAngle, reason: from getter */
    public final float get_angle() {
        return this._angle;
    }

    public final int getCurrentDuration() {
        return this.currentDuration;
    }

    public final int getTotalDuration() {
        return this.totalDuration;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        canvas.rotate(-90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        float fMin = (Math.min(getWidth(), getHeight()) / 2.0f) - Math.min(getPaddingTop(), getPaddingStart());
        this.paint.setColor(this.trackBackground);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.rotateStrokeWidth);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, fMin, this.paint);
        this.paint.setColor(this.trackForeground);
        canvas.drawArc((getWidth() / 2.0f) - fMin, (getHeight() / 2.0f) - fMin, (getWidth() / 2.0f) + fMin, (getHeight() / 2.0f) + fMin, 0.0f, get_angle(), false, this.paint);
        canvas.restore();
    }

    public final void setCurrentDuration(int i2) {
        int i3;
        if (i2 <= 0 || (i3 = this.totalDuration) <= 0) {
            return;
        }
        this.currentDuration = i2;
        this._angle = (i2 / i3) * 360.0f;
        invalidate();
    }

    public final void setTotalDuration(int i2) {
        this.totalDuration = i2;
    }
}
