package com.alightcreative.widget;

import YgZ.uQga.IYJfqUyym;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0016\u0010'\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010/\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u0014\u00101\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010*R\u0014\u00103\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010*R\u0014\u00105\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010*R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010*R\u0016\u0010=\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010*R\u0016\u0010?\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010*R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010 R\u001b\u0010J\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010*R?\u0010W\u001a\u001f\u0012\u0013\u0012\u00110(¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\b\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010[\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001e\u0010]\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010ZR\u0016\u0010_\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010*R\u0016\u0010a\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010*R\u0016\u0010c\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010*R\u0016\u0010e\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010*R\u0016\u0010h\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010 R\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR$\u0010P\u001a\u00020(2\u0006\u0010n\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010p\"\u0004\bq\u0010r¨\u0006s"}, d2 = {"Lcom/alightcreative/widget/HueRingView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "nr", "()V", "", "w", CmcdData.STREAMING_FORMAT_HLS, "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", a.f62811a, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Paint;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/graphics/Paint;", "paint", "t", "I", "trackForeground", "O", "trackBackground", "J2", "gripColor", "r", "textColor", "", "o", "F", "rotateStrokeWidth", "S", "rotateGripSize", "g", "rotateInsideColorGripSize", "E2", "rotateMargin", "e", "rotateGripShadowOffset", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "rotateGripShadowRadius", "Landroid/graphics/BlurMaskFilter;", "N", "Landroid/graphics/BlurMaskFilter;", "gripBlurMaskFilter", "v", "gestureAccumAngle", "Xw", "gesturePreviousAngle", "jB", "_angle", "Landroid/graphics/Shader;", "U", "Landroid/graphics/Shader;", "trackGradient", "P5", "longPressTime", "M7", "Lkotlin/Lazy;", "getTouchSlop", "()I", "touchSlop", "p5", "tickWidth", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "angle", "eF", "Lkotlin/jvm/functions/Function1;", "getOnAngleChangedListener", "()Lkotlin/jvm/functions/Function1;", "setOnAngleChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "onAngleChangedListener", "Lkotlin/Function0;", "E", "Lkotlin/jvm/functions/Function0;", "onStartTrackingTouchListener", "M", "onStopTrackingTouchListener", "FX", "increment", "B", "absAngle", "J", "startX", "D", "startY", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Z", "inGesture", "gestureSerial", "", "GR", "[I", "gradientColors", "value", "getAngle", "()F", "setAngle", "(F)V", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HueRingView extends View {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private float absAngle;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private float startY;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Function0 onStartTrackingTouchListener;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final float rotateMargin;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private float increment;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private final int[] gradientColors;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private int gestureSerial;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private float startX;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int gripColor;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private Function0 onStopTrackingTouchListener;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final Lazy touchSlop;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final BlurMaskFilter gripBlurMaskFilter;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int trackBackground;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final int longPressTime;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final float rotateGripSize;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final float rotateGripShadowRadius;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Shader trackGradient;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private float gesturePreviousAngle;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean inGesture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float rotateGripShadowOffset;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private Function1 onAngleChangedListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float rotateInsideColorGripSize;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private float _angle;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final float rotateStrokeWidth;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final float tickWidth;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int textColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int trackForeground;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float gestureAccumAngle;

    private final void nr() {
        setLayerType(1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HueRingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint(1);
        this.trackForeground = -256;
        this.trackBackground = -16777216;
        this.gripColor = -1;
        this.textColor = -1;
        this.rotateStrokeWidth = getResources().getDimension(2131166335);
        this.rotateGripSize = getResources().getDimension(2131166332);
        this.rotateInsideColorGripSize = getResources().getDimension(2131166330);
        this.rotateMargin = getResources().getDimension(2131166328);
        this.rotateGripShadowOffset = getResources().getDimension(2131166325);
        float dimension = getResources().getDimension(2131166331);
        this.rotateGripShadowRadius = dimension;
        this.gripBlurMaskFilter = new BlurMaskFilter(dimension, BlurMaskFilter.Blur.NORMAL);
        this.longPressTime = ViewConfiguration.getLongPressTimeout();
        this.touchSlop = LazyKt.lazy(new Function0() { // from class: com.alightcreative.widget.Mf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(HueRingView.Uo(this.f47170n));
            }
        });
        this.tickWidth = getResources().getDimension(2131166336);
        this.increment = 1.0f;
        this.absAngle = -1.0f;
        this.inGesture = true;
        this.gradientColors = new int[]{Color.parseColor("#FF0000"), Color.parseColor("#FFFF00"), Color.parseColor("#00FF00"), Color.parseColor("#00FFFF"), Color.parseColor("#0000FF"), Color.parseColor(IYJfqUyym.soOTfVfjLNRFZmY), Color.parseColor("#FF0000")};
        nr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J2(float f3, float f4) {
        return "angle=" + f3 + " da=" + f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(HueRingView hueRingView, int i2) {
        if (hueRingView.gestureSerial != i2) {
            return;
        }
        hueRingView.inGesture = true;
    }

    private final int getTouchSlop() {
        return ((Number) this.touchSlop.getValue()).intValue();
    }

    /* JADX INFO: renamed from: getAngle, reason: from getter */
    public final float get_angle() {
        return this._angle;
    }

    public final Function1<Float, Unit> getOnAngleChangedListener() {
        return this.onAngleChangedListener;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        char c2;
        char c4;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        float fMin = ((Math.min(getWidth(), getHeight()) / 2.0f) - this.rotateMargin) - (this.rotateGripSize / 2.0f);
        this.paint.setColor(this.trackBackground);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.rotateStrokeWidth);
        this.paint.setColor(this.trackForeground);
        this.paint.setShader(this.trackGradient);
        canvas2.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, fMin, this.paint);
        this.paint.setShader(null);
        if (this.absAngle <= -1.0f) {
            double d2 = -(get_angle() % 360.0f);
            c2 = 2;
            c4 = 1;
            this.absAngle = ((float) Math.rint(d2)) > 0.0f ? 360 - ((float) Math.rint(d2)) : Math.abs((float) Math.rint(d2));
        } else {
            c2 = 2;
            c4 = 1;
        }
        String str = MathKt.roundToInt(this.absAngle) + "º";
        this.paint.setColor(this.textColor);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setTextSize(0.2f * fMin);
        this.paint.setTextAlign(Paint.Align.CENTER);
        canvas2.drawText(str, getWidth() / 2.0f, (getHeight() / 2.0f) - (0.5f * fMin), this.paint);
        this.paint.setMaskFilter(this.gripBlurMaskFilter);
        this.paint.setColor(Color.argb(76, 0, 0, 0));
        canvas2.save();
        canvas2.translate(0.0f, this.rotateGripShadowOffset);
        canvas2.rotate(get_angle(), getWidth() / 2.0f, getHeight() / 2.0f);
        canvas2.drawCircle((getWidth() / 2.0f) + fMin, getHeight() / 2.0f, this.rotateGripSize / 2.0f, this.paint);
        canvas2.restore();
        this.paint.setMaskFilter(null);
        this.paint.setColor(this.gripColor);
        canvas2.save();
        canvas2.rotate(get_angle(), getWidth() / 2.0f, getHeight() / 2.0f);
        canvas2.drawCircle((getWidth() / 2.0f) + fMin, getHeight() / 2.0f, this.rotateGripSize / 2.0f, this.paint);
        canvas2.restore();
        this.paint.setMaskFilter(null);
        Paint paint = this.paint;
        float[] fArr = new float[3];
        fArr[0] = this.absAngle;
        fArr[c4] = 1.0f;
        fArr[c2] = 1.0f;
        paint.setColor(Color.HSVToColor(fArr));
        canvas2.save();
        canvas2.rotate(get_angle(), getWidth() / 2.0f, getHeight() / 2.0f);
        canvas2.drawCircle((getWidth() / 2.0f) + fMin, getHeight() / 2.0f, this.rotateInsideColorGripSize / 2.0f, this.paint);
        canvas2.restore();
        this.paint.setColor(-1);
        float[] fArr2 = {0.0f, 30.0f, 60.0f, 90.0f, 120.0f, 150.0f, 180.0f, 210.0f, 240.0f, 270.0f, 300.0f, 330.0f, 360.0f};
        float width = ((getWidth() / 2.0f) + fMin) - this.rotateStrokeWidth;
        float width2 = ((getWidth() / 2.0f) + fMin) - this.rotateStrokeWidth;
        float height = getHeight() / 2.0f;
        float height2 = (getHeight() / 2.0f) - this.tickWidth;
        this.paint.setStrokeWidth(this.rotateStrokeWidth / 3);
        int i2 = 0;
        for (int i3 = 13; i2 < i3; i3 = 13) {
            float f3 = fArr2[i2];
            Paint paint2 = this.paint;
            float[] fArr3 = new float[3];
            fArr3[0] = f3;
            fArr3[c4] = 1.0f;
            fArr3[c2] = 1.0f;
            paint2.setColor(Color.HSVToColor(fArr3));
            canvas2.save();
            canvas2.rotate(f3, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.drawLine(width, height, width2, height2, this.paint);
            canvas.restore();
            i2++;
            canvas2 = canvas;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x025b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        final float fAtan2 = ((float) Math.atan2(event.getY() - (getHeight() / 2.0f), event.getX() - (getWidth() / 2.0f))) * 57.2958f;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            Function0 function0 = this.onStartTrackingTouchListener;
            if (function0 != null) {
                function0.invoke();
            }
            this.gestureAccumAngle = Math.abs(get_angle() - fAtan2) < 10.0f ? get_angle() : fAtan2;
            this.gesturePreviousAngle = fAtan2;
            this.startX = event.getX();
            this.startY = event.getY();
            this.inGesture = false;
            final int i2 = this.gestureSerial + 1;
            this.gestureSerial = i2;
            getHandler().postDelayed(new Runnable() { // from class: com.alightcreative.widget.o7q
                @Override // java.lang.Runnable
                public final void run() {
                    HueRingView.O(this.f47458n, i2);
                }
            }, this.longPressTime);
        } else if (actionMasked == 1) {
            float x2 = event.getX() - this.startX;
            float y2 = event.getY() - this.startY;
            float[] fArr = {0.0f, 30.0f, 60.0f, 90.0f, 120.0f, 150.0f, 180.0f, 210.0f, 240.0f, 270.0f, 300.0f, 330.0f, 360.0f};
            if (event.getEventTime() - event.getDownTime() < this.longPressTime && Math.abs(x2) < getTouchSlop() && Math.abs(y2) < getTouchSlop()) {
                float f3 = Float.MAX_VALUE;
                for (int i3 = 0; i3 < 13; i3++) {
                    float f4 = fArr[i3];
                    if (Math.abs(f3 - this.absAngle) > Math.abs(f4 - this.absAngle)) {
                        f3 = f4;
                    }
                }
                if (Math.abs(f3 - this.absAngle) <= 8.0f) {
                    this._angle = f3;
                    double d2 = -(get_angle() % 360.0f);
                    float fRint = ((float) Math.rint(d2)) > 0.0f ? 360 - ((float) Math.rint(d2)) : Math.abs((float) Math.rint(d2));
                    this.absAngle = fRint;
                    Function1 function1 = this.onAngleChangedListener;
                    if (function1 != null) {
                        function1.invoke(Float.valueOf(fRint));
                    }
                }
                invalidate();
            }
            Function0 function02 = this.onStopTrackingTouchListener;
            if (function02 != null) {
                function02.invoke();
            }
            this.inGesture = false;
            this.gestureSerial++;
        } else if (actionMasked == 2) {
            float x3 = event.getX() - this.startX;
            float y3 = event.getY() - this.startY;
            if (x3 > getTouchSlop() || y3 > getTouchSlop()) {
                this.inGesture = true;
            }
            final float f5 = fAtan2 - this.gesturePreviousAngle;
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.xZD
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HueRingView.J2(fAtan2, f5);
                }
            });
            float f6 = this.gestureAccumAngle;
            if (f5 > 180.0f) {
                f5 -= 360.0f;
            } else if (f5 < -180.0f) {
                f5 += 360.0f;
            }
            this.gestureAccumAngle = f6 + f5;
            this.gesturePreviousAngle = fAtan2;
            float fRint2 = ((float) Math.rint(r3 * (1.0f / this.increment))) / (1.0f / this.increment);
            float f7 = (360000.0f + fRint2) % 360.0f;
            float f8 = (f7 < 2.0f ? 0.0f : f7 < 28.0f ? (((f7 - 2.0f) / (30.0f - (2 * 2.0f))) * 30.0f) + 0.0f : f7 < 32.0f ? 30.0f : f7 < 58.0f ? (((f7 - 32.0f) / (30.0f - (2 * 2.0f))) * 30.0f) + 30.0f : f7 < 62.0f ? 60.0f : f7 < 88.0f ? (((f7 - 62.0f) / (30.0f - (2 * 2.0f))) * 30.0f) + 60.0f : f7 < 92.0f ? 90.0f : f7 < 118.0f ? (((f7 - 92.0f) / (30.0f - (2 * 2.0f))) * 30.0f) + 90.0f : f7 < 122.0f ? 120.0f : f7 < 148.0f ? (((f7 - 122.0f) / (30.0f - (2 * 2.0f))) * 30.0f) + 120.0f : f7 < 152.0f ? 150.0f : f7 < 178.0f ? (((f7 - 152.0f) / (30.0f - (2 * 2.0f))) * 30.0f) + 150.0f : f7 < 182.0f ? 180.0f : f7 < 208.0f ? (((f7 - 182.0f) / (30.0f - (2 * 2.0f))) * 30.0f) + 180.0f : f7 < 212.0f ? 210.0f : f7 < 238.0f ? (((f7 - 212.0f) / (30.0f - (2 * 2.0f))) * 30.0f) + 210.0f : f7 < 242.0f ? 240.0f : f7 < 268.0f ? (((f7 - 242.0f) / (30.0f - (2 * 2.0f))) * 30.0f) + 240.0f : f7 < 272.0f ? 270.0f : f7 < 298.0f ? (((f7 - 272.0f) / (30.0f - (2 * 2.0f))) * 30.0f) + 270.0f : f7 < 302.0f ? 300.0f : f7 < 328.0f ? (((f7 - 302.0f) / (30.0f - (2 * 2.0f))) * 30.0f) + 300.0f : f7 < 332.0f ? 330.0f : f7 < 358.0f ? (((f7 - 332.0f) / (30.0f - (2 * 2.0f))) * 30.0f) + 330.0f : 360.0f) - f7;
            if (f8 < -360.0f) {
                f8 += 360.0f;
            } else if (f8 > 360.0f) {
                f8 -= 360.0f;
            }
            float f9 = fRint2 + f8;
            if (Math.abs(f9 - get_angle()) > 0.01d) {
                this._angle = f9;
                double d4 = -(get_angle() % 360.0f);
                float fRint3 = ((float) Math.rint(d4)) > 0.0f ? 360 - ((float) Math.rint(d4)) : Math.abs((float) Math.rint(d4));
                this.absAngle = fRint3;
                Function1 function12 = this.onAngleChangedListener;
                if (function12 != null) {
                    function12.invoke(Float.valueOf(fRint3));
                }
            }
            if (this.inGesture) {
                invalidate();
            }
        } else if (actionMasked == 3) {
        }
        return true;
    }

    public final void setAngle(float f3) {
        this._angle = f3;
        Function1 function1 = this.onAngleChangedListener;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f3));
        }
        if (this.inGesture) {
            invalidate();
        }
    }

    public final void setOnAngleChangedListener(Function1<? super Float, Unit> function1) {
        this.onAngleChangedListener = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Uo(HueRingView hueRingView) {
        return ViewConfiguration.get(hueRingView.getContext()).getScaledTouchSlop();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        this.trackGradient = new SweepGradient(getWidth() / 2.0f, getHeight() / 2.0f, this.gradientColors, new float[]{0.0f, 0.16666667f, 0.33333334f, 0.5f, 0.6666667f, 0.8333334f, 1.0f});
    }
}
