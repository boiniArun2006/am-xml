package com.alightcreative.app.motion.activities.edit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001ZB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\"\u0010,\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u00101\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)\"\u0004\b0\u0010+R\"\u00105\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)\"\u0004\b4\u0010+R\"\u00109\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010'\u001a\u0004\b7\u0010)\"\u0004\b8\u0010+R\"\u0010=\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010'\u001a\u0004\b;\u0010)\"\u0004\b<\u0010+R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010@R\u0014\u0010M\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010@R\u0014\u0010O\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010@R$\u0010W\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010@¨\u0006["}, d2 = {"Lcom/alightcreative/app/motion/activities/edit/GradientSlider;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "rl", "()V", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lkotlin/jvm/functions/Function1;)V", TtmlNode.START, TtmlNode.END, c.f62177j, "(II)V", "w", CmcdData.STREAMING_FORMAT_HLS, "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", a.f62811a, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/alightcreative/app/motion/activities/edit/GradientSlider$j;", "Lcom/alightcreative/app/motion/activities/edit/GradientSlider$j;", "progressChangeListener", "t", "I", "getMax", "()I", "setMax", "(I)V", "max", "value", "O", "getProgress", "setProgress", "progress", "J2", "getStartColor", "setStartColor", "startColor", "r", "getEndColor", "setEndColor", "endColor", "o", "getThumbColor", "setThumbColor", "thumbColor", "", "S", "F", "round", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/LinearGradient;", "E2", "Landroid/graphics/LinearGradient;", "shader", "e", "positionX", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "rotateGripSize", "N", "rotateInsideColorGripSize", "Landroid/graphics/Bitmap;", "v", "Landroid/graphics/Bitmap;", "getTileBg", "()Landroid/graphics/Bitmap;", "setTileBg", "(Landroid/graphics/Bitmap;)V", "tileBg", "Xw", "startX", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GradientSlider extends View {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private LinearGradient shader;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int startColor;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final float rotateInsideColorGripSize;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int progress;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final float round;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final float rotateGripSize;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private float startX;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float positionX;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private j progressChangeListener;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int thumbColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int endColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int max;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Bitmap tileBg;

    public interface j {
        void n(int i2);
    }

    public static final class n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f45088n;

        n(Function1 function1) {
            this.f45088n = function1;
        }

        @Override // com.alightcreative.app.motion.activities.edit.GradientSlider.j
        public void n(int i2) {
            this.f45088n.invoke(Integer.valueOf(i2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.max = 255;
        this.thumbColor = -16777216;
        this.round = getResources().getDimensionPixelOffset(2131165321);
        this.paint = new Paint();
        this.positionX = getPaddingStart();
        this.rotateGripSize = getResources().getDimension(2131166332);
        this.rotateInsideColorGripSize = getResources().getDimension(2131166330);
        this.startColor = -16777216;
        this.endColor = -1;
        this.startX = Float.MIN_VALUE;
    }

    private final void rl() {
        this.shader = new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), this.startColor, this.endColor, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final int getEndColor() {
        return this.endColor;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    public final int getThumbColor() {
        return this.thumbColor;
    }

    public final Bitmap getTileBg() {
        return this.tileBg;
    }

    public final void n(int start, int end) {
        this.startColor = start;
        this.endColor = end;
        rl();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.paint.reset();
        float height = getHeight() / 2.0f;
        this.paint.setAntiAlias(true);
        RectF rectF = new RectF(getPaddingStart(), getPaddingTop(), getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom());
        if (this.tileBg != null) {
            canvas.save();
            Bitmap bitmap = this.tileBg;
            Intrinsics.checkNotNull(bitmap);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            float f3 = this.round;
            canvas.drawRoundRect(rectF, f3, f3, this.paint);
            canvas.restore();
        }
        this.paint.setShader(this.shader);
        canvas.save();
        float f4 = this.round;
        canvas.drawRoundRect(rectF, f4, f4, this.paint);
        canvas.restore();
        this.paint.setShader(null);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(-1);
        canvas.save();
        canvas.drawCircle(this.positionX, height, this.rotateGripSize / 2.0f, this.paint);
        canvas.restore();
        this.paint.setColor(this.thumbColor);
        canvas.save();
        canvas.drawCircle(this.positionX, height, this.rotateInsideColorGripSize / 2.0f, this.paint);
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            float x2 = event.getX();
            this.startX = x2;
            this.positionX = x2;
            setProgress((int) ((x2 / ((getWidth() - getPaddingStart()) - getPaddingEnd())) * this.max));
            j jVar = this.progressChangeListener;
            if (jVar != null) {
                jVar.n(this.progress);
            }
        } else if (actionMasked == 2) {
            float x3 = event.getX() - this.startX;
            this.startX = event.getX();
            float f3 = this.positionX + x3;
            this.positionX = f3;
            if (f3 < getPaddingStart()) {
                this.positionX = getPaddingStart();
            } else if (this.positionX > getWidth() - getPaddingEnd()) {
                this.positionX = getWidth() - getPaddingEnd();
            }
            setProgress((int) (((this.positionX - getPaddingStart()) / ((getWidth() - getPaddingStart()) - getPaddingEnd())) * this.max));
            j jVar2 = this.progressChangeListener;
            if (jVar2 != null) {
                jVar2.n(this.progress);
            }
        }
        invalidate();
        return true;
    }

    public final void setEndColor(int i2) {
        this.endColor = i2;
    }

    public final void setListener(Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.progressChangeListener = new n(listener);
    }

    public final void setMax(int i2) {
        this.max = i2;
    }

    public final void setProgress(int i2) {
        if (this.progress != i2) {
            this.progress = i2;
            float width = ((i2 / this.max) * ((getWidth() - getPaddingStart()) - getPaddingEnd())) + getPaddingStart();
            if (width == this.positionX) {
                return;
            }
            this.positionX = width;
            invalidate();
        }
    }

    public final void setStartColor(int i2) {
        this.startColor = i2;
    }

    public final void setThumbColor(int i2) {
        this.thumbColor = i2;
    }

    public final void setTileBg(Bitmap bitmap) {
        this.tileBg = bitmap;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        float width = ((this.progress / this.max) * ((getWidth() - getPaddingStart()) - getPaddingEnd())) + getPaddingStart();
        if (width != this.positionX) {
            this.positionX = width;
            invalidate();
        }
        this.shader = new LinearGradient(0.0f, 0.0f, w2, h2, this.startColor, this.endColor, Shader.TileMode.CLAMP);
    }
}
