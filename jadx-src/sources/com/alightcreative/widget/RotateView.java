package com.alightcreative.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0016\u0010(\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001fR\u0016\u0010,\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001fR\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001fR\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00106\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R\u0014\u00108\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00101R\u0014\u0010:\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00101R\u0014\u0010<\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00101R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00101R\u0016\u0010H\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00101R\u0016\u0010J\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00101R\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR?\u0010Y\u001a\u001f\u0012\u0013\u0012\u00110/¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(R\u0012\u0004\u0012\u00020\b\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010\\\u001a\u0004\bc\u0010^\"\u0004\bd\u0010`R*\u0010i\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010\\\u001a\u0004\bg\u0010^\"\u0004\bh\u0010`R$\u0010p\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010t\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010k\u001a\u0004\br\u0010m\"\u0004\bs\u0010oR\"\u0010y\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00101\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0016\u0010|\u001a\u00020z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010fR$\u0010R\u001a\u00020/2\u0006\u0010}\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b~\u0010v\"\u0004\b\u007f\u0010x¨\u0006\u0080\u0001"}, d2 = {"Lcom/alightcreative/widget/RotateView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "rl", "", "w", CmcdData.STREAMING_FORMAT_HLS, "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", a.f62811a, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Paint;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/graphics/Paint;", "paint", "t", "I", "trackForeground", "O", "trackForegroundTint", "J2", "trackBackground", "r", "gripColor", "o", "textColor", "S", "textTintColor", "g", "textBackgroundColor", "E2", "textMultipleColor", "", "e", "F", "textBgCornerRadius", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "rotateStrokeWidth", "N", "rotateGripSize", "v", "rotateMargin", "Xw", "rotateGripShadowOffset", "jB", "rotateGripShadowRadius", "Landroid/graphics/BlurMaskFilter;", "U", "Landroid/graphics/BlurMaskFilter;", "gripBlurMaskFilter", "Landroid/graphics/Rect;", "P5", "Landroid/graphics/Rect;", "textBounds", "M7", "gestureAccumAngle", "p5", "gesturePreviousAngle", "eF", "_angle", "Landroid/graphics/Shader;", "E", "Landroid/graphics/Shader;", "trackGradient", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "angle", "M", "Lkotlin/jvm/functions/Function1;", "getOnAngleChangedListener", "()Lkotlin/jvm/functions/Function1;", "setOnAngleChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "onAngleChangedListener", "Lkotlin/Function0;", "FX", "Lkotlin/jvm/functions/Function0;", "getOnStartTrackingTouchListener", "()Lkotlin/jvm/functions/Function0;", "setOnStartTrackingTouchListener", "(Lkotlin/jvm/functions/Function0;)V", "onStartTrackingTouchListener", "B", "getOnStopTrackingTouchListener", "setOnStopTrackingTouchListener", "onStopTrackingTouchListener", "J", "getShowKeypadListener", "setShowKeypadListener", "showKeypadListener", "D", "Ljava/lang/Float;", "getMaxAngle", "()Ljava/lang/Float;", "setMaxAngle", "(Ljava/lang/Float;)V", "maxAngle", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "getMinAngle", "setMinAngle", "minAngle", "getIncrement", "()F", "setIncrement", "(F)V", "increment", "", "GR", "startClick", "value", "getAngle", "setAngle", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RotateView extends View {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Function0 onStopTrackingTouchListener;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Float maxAngle;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Shader trackGradient;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private int textMultipleColor;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private Function0 onStartTrackingTouchListener;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private long startClick;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private float increment;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private Function0 showKeypadListener;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int trackBackground;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private Function1 onAngleChangedListener;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private float gestureAccumAngle;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final float rotateGripSize;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int trackForegroundTint;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final Rect textBounds;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int textTintColor;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final float rotateStrokeWidth;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final BlurMaskFilter gripBlurMaskFilter;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final float rotateGripShadowOffset;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Float minAngle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float textBgCornerRadius;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private float _angle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int textBackgroundColor;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final float rotateGripShadowRadius;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int textColor;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private float gesturePreviousAngle;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int gripColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int trackForeground;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final float rotateMargin;

    private final void rl(Context context, AttributeSet attributeSet) {
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, IvA.eO.nr, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int color = typedArrayObtainStyledAttributes.getColor(6, -1);
            this.trackForeground = color;
            this.trackForegroundTint = typedArrayObtainStyledAttributes.getColor(7, color);
            this.trackBackground = typedArrayObtainStyledAttributes.getColor(5, -16777216);
            this.gripColor = typedArrayObtainStyledAttributes.getColor(0, -1);
            int color2 = typedArrayObtainStyledAttributes.getColor(2, -1);
            this.textColor = color2;
            this.textTintColor = typedArrayObtainStyledAttributes.getColor(4, color2);
            this.textBackgroundColor = typedArrayObtainStyledAttributes.getColor(1, this.trackBackground);
            this.textMultipleColor = typedArrayObtainStyledAttributes.getColor(3, -1);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RotateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint(1);
        this.trackForeground = -1;
        this.trackForegroundTint = -1;
        this.trackBackground = -16777216;
        this.gripColor = -1;
        this.textColor = -1;
        this.textTintColor = -1;
        this.textBackgroundColor = -16777216;
        this.textMultipleColor = -1;
        this.textBgCornerRadius = getResources().getDimension(2131166329);
        this.rotateStrokeWidth = getResources().getDimension(2131166329);
        this.rotateGripSize = getResources().getDimension(2131166327);
        this.rotateMargin = getResources().getDimension(2131166328);
        this.rotateGripShadowOffset = getResources().getDimension(2131166325);
        float dimension = getResources().getDimension(2131166326);
        this.rotateGripShadowRadius = dimension;
        this.gripBlurMaskFilter = new BlurMaskFilter(dimension, BlurMaskFilter.Blur.NORMAL);
        this.textBounds = new Rect();
        this.increment = 1.0f;
        rl(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(float f3, float f4) {
        return "angle=" + f3 + " da=" + f4;
    }

    /* JADX INFO: renamed from: getAngle, reason: from getter */
    public final float get_angle() {
        return this._angle;
    }

    public final float getIncrement() {
        return this.increment;
    }

    public final Float getMaxAngle() {
        return this.maxAngle;
    }

    public final Float getMinAngle() {
        return this.minAngle;
    }

    public final Function1<Float, Unit> getOnAngleChangedListener() {
        return this.onAngleChangedListener;
    }

    public final Function0<Unit> getOnStartTrackingTouchListener() {
        return this.onStartTrackingTouchListener;
    }

    public final Function0<Unit> getOnStopTrackingTouchListener() {
        return this.onStopTrackingTouchListener;
    }

    public final Function0<Unit> getShowKeypadListener() {
        return this.showKeypadListener;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float fMin = ((Math.min(getWidth(), getHeight()) / 2.0f) - this.rotateMargin) - (this.rotateGripSize / 2.0f);
        this.paint.setColor(this.trackBackground);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.rotateStrokeWidth);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, fMin, this.paint);
        this.paint.setColor(this.trackForeground);
        this.paint.setShader(this.trackGradient);
        canvas.drawArc((getWidth() / 2.0f) - fMin, (getHeight() / 2.0f) - fMin, (getWidth() / 2.0f) + fMin, (getHeight() / 2.0f) + fMin, 0.0f, get_angle(), false, this.paint);
        if (get_angle() > 360.0f) {
            this.paint.setStrokeWidth(this.rotateStrokeWidth * 2.0f);
            canvas.drawArc((getWidth() / 2.0f) - fMin, (getHeight() / 2.0f) - fMin, (getWidth() / 2.0f) + fMin, (getHeight() / 2.0f) + fMin, 0.0f, get_angle() - 360.0f, false, this.paint);
        } else if (get_angle() < -360.0f) {
            this.paint.setStrokeWidth(this.rotateStrokeWidth * 2.0f);
            canvas.drawArc((getWidth() / 2.0f) - fMin, (getHeight() / 2.0f) - fMin, (getWidth() / 2.0f) + fMin, (getHeight() / 2.0f) + fMin, 0.0f, get_angle() + 360.0f, false, this.paint);
        }
        if (get_angle() > 720.0f) {
            this.paint.setStrokeWidth(this.rotateStrokeWidth * 3.0f);
            canvas.drawArc((getWidth() / 2.0f) - fMin, (getHeight() / 2.0f) - fMin, (getWidth() / 2.0f) + fMin, (getHeight() / 2.0f) + fMin, 0.0f, get_angle() - 720.0f, false, this.paint);
        } else if (get_angle() < -720.0f) {
            this.paint.setStrokeWidth(this.rotateStrokeWidth * 3.0f);
            canvas.drawArc((getWidth() / 2.0f) - fMin, (getHeight() / 2.0f) - fMin, (getWidth() / 2.0f) + fMin, (getHeight() / 2.0f) + fMin, 0.0f, get_angle() + 720.0f, false, this.paint);
        }
        this.paint.setShader(null);
        this.paint.setColor(this.textBackgroundColor);
        Paint paint = this.paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f3 = 0.591f * fMin;
        float f4 = 0.31f * fMin;
        float f5 = this.textBgCornerRadius;
        canvas.drawRoundRect(width - f3, height - f4, width + f3, height + f4, f5, f5, this.paint);
        float f6 = -(get_angle() % 360.0f);
        int iFloor = (int) Math.floor(Math.abs(get_angle()) / 360.0f);
        float fRint = (float) Math.rint(f6);
        String str3 = (iFloor <= 0 || f6 <= 0.0f) ? "" : "+";
        float f7 = this.increment;
        if (f7 - ((float) Math.floor(f7)) < 0.05f) {
            str = MathKt.roundToInt(fRint) + "º";
        } else {
            String str4 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f6)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            str = str4 + "º";
        }
        String str5 = str3 + str;
        this.paint.setColor(this.textColor);
        this.paint.setStyle(style);
        this.paint.setTextSize(0.4f * fMin);
        Paint paint2 = this.paint;
        Paint.Align align = Paint.Align.CENTER;
        paint2.setTextAlign(align);
        this.paint.getTextBounds(str5, 0, str5.length(), this.textBounds);
        canvas.drawText(str5, getWidth() / 2.0f, (getHeight() + this.textBounds.height()) / 2.0f, this.paint);
        if (iFloor > 0) {
            if (get_angle() > 0.0f) {
                str2 = "-" + iFloor + "×";
            } else {
                str2 = iFloor + "×";
            }
            this.paint.setColor(this.textMultipleColor);
            this.paint.setTextSize(0.2f * fMin);
            this.paint.setTextAlign(align);
            canvas.drawText(str2, getWidth() / 2.0f, (getHeight() / 2.0f) - (0.42f * fMin), this.paint);
        }
        this.paint.setMaskFilter(this.gripBlurMaskFilter);
        this.paint.setColor(Color.argb(76, 0, 0, 0));
        canvas.save();
        canvas.translate(0.0f, this.rotateGripShadowOffset);
        canvas.rotate(get_angle(), getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawCircle((getWidth() / 2.0f) + fMin, getHeight() / 2.0f, this.rotateGripSize / 2.0f, this.paint);
        canvas.restore();
        this.paint.setMaskFilter(null);
        this.paint.setColor(this.gripColor);
        canvas.save();
        canvas.rotate(get_angle(), getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawCircle((getWidth() / 2.0f) + fMin, getHeight() / 2.0f, this.rotateGripSize / 2.0f, this.paint);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0085 A[PHI: r6
      0x0085: PHI (r6v23 float) = (r6v5 float), (r6v18 float), (r6v19 float), (r6v20 float) binds: [B:17:0x0083, B:48:0x0101, B:54:0x0113, B:60:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf A[PHI: r9
      0x00bf: PHI (r9v3 float) = (r9v0 float), (r9v1 float) binds: [B:30:0x00bd, B:36:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8 A[PHI: r4 r9
      0x00c8: PHI (r4v27 float) = (r4v16 float), (r4v17 float) binds: [B:33:0x00c6, B:39:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r9v2 float) = (r9v0 float), (r9v1 float) binds: [B:33:0x00c6, B:39:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0156  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent event) {
        float f3;
        float f4;
        float fFloatValue;
        Intrinsics.checkNotNullParameter(event, "event");
        final float fAtan2 = ((float) Math.atan2(event.getY() - (getHeight() / 2.0f), event.getX() - (getWidth() / 2.0f))) * 57.2958f;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.startClick = System.currentTimeMillis();
            Function0 function0 = this.onStartTrackingTouchListener;
            if (function0 != null) {
                function0.invoke();
            }
            this.gestureAccumAngle = get_angle();
            this.gesturePreviousAngle = fAtan2;
        } else if (actionMasked != 1) {
            if (actionMasked == 2 && System.currentTimeMillis() - this.startClick > ViewConfiguration.getTapTimeout()) {
                final float f5 = fAtan2 - this.gesturePreviousAngle;
                XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.tI
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RotateView.t(fAtan2, f5);
                    }
                });
                float f6 = this.gestureAccumAngle;
                float f7 = 180.0f;
                if (f5 > 180.0f) {
                    f5 -= 360.0f;
                } else if (f5 < -180.0f) {
                    f5 += 360.0f;
                }
                this.gestureAccumAngle = f6 + f5;
                this.gesturePreviousAngle = fAtan2;
                float fRint = ((float) Math.rint(r4 * (1.0f / this.increment))) / (1.0f / this.increment);
                float f8 = (3600000.0f + fRint) % 360.0f;
                float f9 = 0.0f;
                if (f8 >= 2.0f) {
                    if (f8 < 43.0f) {
                        f3 = f8 - 2.0f;
                    } else {
                        if (f8 < 47.0f) {
                            f7 = 45.0f;
                        } else if (f8 < 88.0f) {
                            f7 = (((f8 - 47.0f) / (45.0f - (2 * 2.0f))) * 45.0f) + 45.0f;
                        } else {
                            float f10 = 92.0f;
                            float f11 = 90.0f;
                            if (f8 >= 92.0f) {
                                if (f8 < 133.0f) {
                                    f7 = (((f8 - f10) / (45.0f - (2 * 2.0f))) * 45.0f) + f11;
                                } else {
                                    f10 = 137.0f;
                                    f11 = 135.0f;
                                    if (f8 < 137.0f) {
                                        f7 = f11;
                                    } else if (f8 >= 178.0f) {
                                        if (f8 >= 182.0f) {
                                            if (f8 < 223.0f) {
                                                f7 = 180.0f + (((f8 - 182.0f) / (45.0f - (2 * 2.0f))) * 45.0f);
                                            } else {
                                                float f12 = 227.0f;
                                                f9 = 225.0f;
                                                if (f8 >= 227.0f) {
                                                    if (f8 >= 268.0f) {
                                                        f12 = 272.0f;
                                                        f9 = 270.0f;
                                                        if (f8 >= 272.0f) {
                                                            if (f8 >= 313.0f) {
                                                                f12 = 317.0f;
                                                                f9 = 315.0f;
                                                                if (f8 < 317.0f) {
                                                                    f7 = f9;
                                                                } else if (f8 >= 358.0f) {
                                                                    f7 = 360.0f;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    f3 = f8 - f12;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        f4 = f7 - f8;
                        if (f4 >= -360.0f) {
                            f4 += 360.0f;
                        } else if (f4 > 360.0f) {
                            f4 -= 360.0f;
                        }
                        fFloatValue = fRint + f4;
                        if (Math.abs(fFloatValue - get_angle()) > 0.01d) {
                            if (this.minAngle != null && this.maxAngle != null) {
                                fFloatValue = ((Number) RangesKt.coerceIn(Float.valueOf(fFloatValue), this.minAngle, this.maxAngle)).floatValue();
                            }
                            this._angle = fFloatValue;
                            Function1 function1 = this.onAngleChangedListener;
                            if (function1 != null) {
                                function1.invoke(Float.valueOf(fFloatValue));
                            }
                        }
                        invalidate();
                    }
                    f7 = ((f3 / (45.0f - (2 * 2.0f))) * 45.0f) + f9;
                    f4 = f7 - f8;
                    if (f4 >= -360.0f) {
                    }
                    fFloatValue = fRint + f4;
                    if (Math.abs(fFloatValue - get_angle()) > 0.01d) {
                    }
                    invalidate();
                }
            }
        } else if (System.currentTimeMillis() - this.startClick <= ViewConfiguration.getTapTimeout()) {
            Function0 function02 = this.showKeypadListener;
            if (function02 != null) {
                function02.invoke();
            }
        } else {
            Function0 function03 = this.onStopTrackingTouchListener;
            if (function03 != null) {
                function03.invoke();
            }
        }
        return true;
    }

    public final void setAngle(float f3) {
        this._angle = f3;
        invalidate();
    }

    public final void setIncrement(float f3) {
        this.increment = f3;
    }

    public final void setMaxAngle(Float f3) {
        this.maxAngle = f3;
    }

    public final void setMinAngle(Float f3) {
        this.minAngle = f3;
    }

    public final void setOnAngleChangedListener(Function1<? super Float, Unit> function1) {
        this.onAngleChangedListener = function1;
    }

    public final void setOnStartTrackingTouchListener(Function0<Unit> function0) {
        this.onStartTrackingTouchListener = function0;
    }

    public final void setOnStopTrackingTouchListener(Function0<Unit> function0) {
        this.onStopTrackingTouchListener = function0;
    }

    public final void setShowKeypadListener(Function0<Unit> function0) {
        this.showKeypadListener = function0;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        int i2 = this.trackForeground;
        this.trackGradient = new SweepGradient(getWidth() / 2.0f, getHeight() / 2.0f, new int[]{i2, this.trackForegroundTint, i2}, new float[]{0.0f, 0.5f, 1.0f});
    }
}
