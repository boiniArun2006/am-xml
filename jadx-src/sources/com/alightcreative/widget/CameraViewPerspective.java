package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR*\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/alightcreative/widget/CameraViewPerspective;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "I", "getMainLineColor", "()I", "mainLineColor", "t", "getLineWidth", "lineWidth", "O", "getMove5dp", "move5dp", "Landroid/graphics/Paint;", "J2", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint", "", "value", "r", "Z", "isPerspective", "()Z", "setPerspective", "(Z)V", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CameraViewPerspective extends View {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int move5dp;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int mainLineColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isPerspective;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int lineWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraViewPerspective(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mainLineColor = getResources().getColor(2131099755, null);
        this.lineWidth = getResources().getDimensionPixelOffset(2131165283);
        this.move5dp = getResources().getDimensionPixelOffset(2131165972);
        this.paint = new Paint();
        this.isPerspective = true;
    }

    public final int getLineWidth() {
        return this.lineWidth;
    }

    public final int getMainLineColor() {
        return this.mainLineColor;
    }

    public final int getMove5dp() {
        return this.move5dp;
    }

    public final Paint getPaint() {
        return this.paint;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.paint.setPathEffect(null);
        this.paint.setAntiAlias(true);
        this.paint.setColor(this.mainLineColor);
        this.paint.setStrokeWidth(this.lineWidth);
        float height = getHeight() / 2.0f;
        if (this.isPerspective) {
            canvas.drawLine(0.0f, height - this.move5dp, getWidth(), 0.0f, this.paint);
            canvas.drawLine(0.0f, height + this.move5dp, getWidth(), getHeight(), this.paint);
            return;
        }
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{5.0f, 5.0f}, 2.0f);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setPathEffect(dashPathEffect);
        canvas.drawLine(0.0f, height - this.move5dp, getWidth(), height - this.move5dp, this.paint);
        canvas.drawLine(0.0f, height + this.move5dp, getWidth(), height + this.move5dp, this.paint);
    }

    public final void setPerspective(boolean z2) {
        if (z2 != this.isPerspective) {
            this.isPerspective = z2;
            invalidate();
        }
    }
}
