package com.alightcreative.app.motion.activities.edit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000fR\u0014\u0010(\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u000fR\u0014\u0010*\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u000fR\u0014\u0010,\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u000fR\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00106\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001b\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/alightcreative/app/motion/activities/edit/TryIcon;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "", c.f62177j, "I", "bgColor", "Landroid/graphics/Paint;", "t", "Landroid/graphics/Paint;", "paint", "Landroid/text/TextPaint;", "O", "Landroid/text/TextPaint;", "textPaint", "", "J2", "F", "cueWidth", "r", "cueHeight", "", "o", "Ljava/lang/String;", "text", "S", "textSize", "g", "textColor", "E2", "textPadding", "e", "minWidth", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "maxWidth", "Landroid/graphics/Path;", "N", "Landroid/graphics/Path;", JavetError.PARAMETER_PATH, "v", "getRound", "()F", "setRound", "(F)V", "round", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TryIcon extends View {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final int textPadding;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float cueWidth;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final Path path;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final TextPaint textPaint;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final float textSize;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final int maxWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int minWidth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int textColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int bgColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final float cueHeight;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float round;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TryIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int color = getResources().getColor(2131099678, getContext().getTheme());
        this.bgColor = color;
        Paint paint = new Paint();
        this.paint = paint;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        this.cueWidth = getResources().getDimensionPixelSize(2131166409);
        this.cueHeight = getResources().getDimensionPixelSize(2131166408);
        String string = getResources().getString(2132020357);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.text = string;
        this.textSize = getResources().getDimensionPixelSize(2131166414);
        int color2 = getResources().getColor(2131099661, getContext().getTheme());
        this.textColor = color2;
        this.textPadding = getResources().getDimensionPixelOffset(2131166255);
        this.minWidth = getResources().getDimensionPixelOffset(2131166411);
        this.maxWidth = getResources().getDimensionPixelOffset(2131166410);
        this.path = new Path();
        this.round = getResources().getDimensionPixelSize(2131165326);
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        textPaint.setAntiAlias(true);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(color2);
    }

    public final float getRound() {
        return this.round;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.textPaint.setTextSize(this.textSize);
        float fMeasureText = this.textPaint.measureText(this.text);
        while (true) {
            i2 = (int) fMeasureText;
            if ((this.textPadding * 2) + i2 <= this.maxWidth) {
                break;
            }
            TextPaint textPaint = this.textPaint;
            textPaint.setTextSize(textPaint.getTextSize() - 1);
            fMeasureText = this.textPaint.measureText(this.text);
        }
        String str = this.text;
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), this.textPaint, i2).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        int i3 = this.minWidth;
        int i5 = this.textPadding;
        if (i3 < (i5 * 2) + i2) {
            i3 = i2 + (i5 * 2);
        }
        float height = getHeight() - this.cueHeight;
        canvas.translate(getWidth() - i3, 0.0f);
        canvas.save();
        float f3 = i3;
        float f4 = this.round;
        canvas.drawRoundRect(0.0f, 0.0f, f3, height, f4, f4, this.paint);
        canvas.restore();
        canvas.save();
        canvas.translate((i3 - staticLayoutBuild.getWidth()) / 2, (height - staticLayoutBuild.getHeight()) / 2);
        staticLayoutBuild.draw(canvas);
        canvas.restore();
        canvas.save();
        this.path.reset();
        float f5 = f3 * 0.7f;
        this.path.moveTo(f5, height);
        this.path.lineTo(this.cueWidth + f5, height);
        Path path = this.path;
        float f6 = this.cueWidth;
        path.lineTo((f5 + f6) - (f6 / 2.0f), this.cueHeight + height);
        this.path.moveTo(f5, height);
        this.path.close();
        canvas.drawPath(this.path, this.paint);
        canvas.restore();
    }

    public final void setRound(float f3) {
        this.round = f3;
    }
}
