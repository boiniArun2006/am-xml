package com.alightcreative.app.motion.activities.edit;

import Y3a.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.activities.edit.ColorView;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\"\u00101\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(\"\u0004\b/\u00100R\"\u00105\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010&\u001a\u0004\b3\u0010(\"\u0004\b4\u00100R\"\u00109\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010&\u001a\u0004\b7\u0010(\"\u0004\b8\u00100R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/alightcreative/app/motion/activities/edit/ColorView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget;", c.f62177j, "Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget;", "getColorWidget", "()Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget;", "setColorWidget", "(Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget;)V", "colorWidget", "", "value", "t", "I", "getColor", "()I", "setColor", "(I)V", TtmlNode.ATTR_TTS_COLOR, "Landroid/graphics/Paint;", "O", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint", "", "J2", "F", "getPadding", "()F", "padding", "r", "getSize", "size", "o", "getInset", "setInset", "(F)V", "inset", "S", "getRound", "setRound", "round", "g", "getEdge", "setEdge", "edge", "Landroid/graphics/BitmapShader;", "E2", "Lkotlin/Lazy;", "getBitmapShader", "()Landroid/graphics/BitmapShader;", "bitmapShader", "Landroid/graphics/drawable/Drawable;", "e", "Landroid/graphics/drawable/Drawable;", "overlayDrawable", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ColorView extends View {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final Lazy bitmapShader;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float padding;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private float round;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Drawable overlayDrawable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float edge;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private ColorPickerWidget colorWidget;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float inset;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final float size;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.color = -65536;
        Paint paint = new Paint();
        this.paint = paint;
        this.padding = getResources().getDimensionPixelSize(2131165325);
        this.size = getResources().getDimensionPixelSize(2131165327) - getResources().getDimensionPixelSize(2131165325);
        this.inset = getResources().getDimensionPixelSize(2131165324);
        this.round = getResources().getDimensionPixelSize(2131165326);
        this.edge = getResources().getDimensionPixelSize(2131165323);
        this.bitmapShader = LazyKt.lazy(new Function0() { // from class: yc.Md
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ColorView.rl(this.f75808n);
            }
        });
        Drawable drawable = getResources().getDrawable(2131230984, null);
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        this.overlayDrawable = drawable;
        setLayerType(2, paint);
    }

    private final BitmapShader getBitmapShader() {
        return (BitmapShader) this.bitmapShader.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BitmapShader rl(ColorView colorView) {
        Bitmap bitmap = j.J2(colorView, 0, 1, null).getBitmap();
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        return new BitmapShader(bitmap, tileMode, tileMode);
    }

    public final int getColor() {
        return this.color;
    }

    public final ColorPickerWidget getColorWidget() {
        return this.colorWidget;
    }

    public final float getEdge() {
        return this.edge;
    }

    public final float getInset() {
        return this.inset;
    }

    public final float getPadding() {
        return this.padding;
    }

    public final Paint getPaint() {
        return this.paint;
    }

    public final float getRound() {
        return this.round;
    }

    public final float getSize() {
        return this.size;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.paint.reset();
        this.paint.setAntiAlias(true);
        this.paint.setColor(-1);
        Paint paint = this.paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float f3 = this.padding;
        canvas.translate(f3 / 2.0f, f3 / 2.0f);
        canvas.save();
        float f4 = this.size;
        float f5 = this.round;
        canvas.drawRoundRect(0.0f, 0.0f, f4, f4, f5, f5, this.paint);
        canvas.restore();
        if (Color.alpha(this.color) < 255) {
            canvas.save();
            this.paint.setShader(getBitmapShader());
            float f6 = this.inset;
            float f7 = this.size;
            float f8 = this.round;
            canvas.drawRoundRect(f6, f6, f7 - f6, f7 - f6, f8, f8, this.paint);
            canvas.restore();
            this.paint.setShader(null);
        }
        this.paint.reset();
        canvas.save();
        this.paint.setStyle(style);
        this.paint.setColor(this.color);
        float f9 = this.inset;
        float f10 = this.size;
        float f11 = this.round;
        canvas.drawRoundRect(f9, f9, f10 - f9, f10 - f9, f11, f11, this.paint);
        canvas.restore();
        Drawable drawable = this.overlayDrawable;
        float f12 = this.size;
        drawable.setBounds(new Rect(0, 0, (int) f12, (int) f12));
        this.overlayDrawable.draw(canvas);
    }

    public final void setColor(int i2) {
        if (this.color != i2) {
            this.color = i2;
            ColorPickerWidget colorPickerWidget = this.colorWidget;
            if (colorPickerWidget != null) {
                colorPickerWidget.setColor(i2);
            }
            invalidate();
        }
    }

    public final void setColorWidget(ColorPickerWidget colorPickerWidget) {
        this.colorWidget = colorPickerWidget;
    }

    public final void setEdge(float f3) {
        this.edge = f3;
    }

    public final void setInset(float f3) {
        this.inset = f3;
    }

    public final void setRound(float f3) {
        this.round = f3;
    }
}
