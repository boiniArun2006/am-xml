package com.alightcreative.app.motion.activities.edit;

import Y3a.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010 \u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/alightcreative/app/motion/activities/edit/GradationBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", c.f62177j, "()V", "", "w", CmcdData.STREAMING_FORMAT_HLS, "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "value", "I", "getStartColor", "()I", "setStartColor", "(I)V", "startColor", "t", "getEndColor", "setEndColor", "endColor", "Landroid/graphics/Paint;", "O", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/LinearGradient;", "J2", "Landroid/graphics/LinearGradient;", "shader", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GradationBar extends View {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private LinearGradient shader;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int startColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int endColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.startColor = -16777216;
        this.endColor = -1;
        this.paint = new Paint();
        setBackground(j.J2(this, 0, 1, null));
    }

    private final void n() {
        this.shader = new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), this.startColor, this.endColor, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final int getEndColor() {
        return this.endColor;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.paint.setShader(this.shader);
        canvas.drawRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.paint);
    }

    public final void setEndColor(int i2) {
        if (this.endColor != i2) {
            this.endColor = i2;
            n();
        }
    }

    public final void setStartColor(int i2) {
        if (this.startColor != i2) {
            this.startColor = i2;
            n();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        this.shader = new LinearGradient(0.0f, 0.0f, w2, h2, this.startColor, this.endColor, Shader.TileMode.CLAMP);
    }
}
