package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.SolidColorHSV;
import com.alightcreative.app.motion.scene.Vector2D;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u0000 S2\u00020\u0001:\u0001TB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010 R+\u0010/\u001a\u00020'2\u0006\u0010(\u001a\u00020'8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.RZ\u0010=\u001a:\u0012\u0013\u0012\u00110'¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0013\u0012\u001104¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u0012\u0018\u000100j\u0004\u0018\u0001`68\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010E\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bI\u0010?R\u0014\u0010L\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bK\u0010?R\u0014\u0010N\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010?R\u0014\u0010P\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010?R\u0014\u0010R\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010?¨\u0006U"}, d2 = {"Lcom/alightcreative/widget/HuePicker;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "nr", "(F)F", "t", "", "w", CmcdData.STREAMING_FORMAT_HLS, "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/view/MotionEvent;", a.f62811a, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Shader;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/graphics/Shader;", "trackGradient", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "O", "checkerShader", "Lcom/alightcreative/app/motion/scene/SolidColorHSV;", "<set-?>", "J2", "Lkotlin/properties/ReadWriteProperty;", "getSelectedColor", "()Lcom/alightcreative/app/motion/scene/SolidColorHSV;", "setSelectedColor", "(Lcom/alightcreative/app/motion/scene/SolidColorHSV;)V", "selectedColor", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, TtmlNode.ATTR_TTS_COLOR, "Lcom/alightcreative/widget/Md;", "state", "Lcom/alightcreative/widget/ColorChangeListener;", "r", "Lkotlin/jvm/functions/Function2;", "getColorChangeListener", "()Lkotlin/jvm/functions/Function2;", "setColorChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "colorChangeListener", "o", "F", "gestureStartX", "S", "gestureStartY", "g", "Lcom/alightcreative/app/motion/scene/SolidColorHSV;", "gestureStartColor", "E2", "Z", "gestureInProgress", "e", "angleSnapThreshold", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "angleSnapInterval", "N", "expandedAngleSnapInterval", "v", "angleSnapCount", "Xw", "expandedAngleRange", "jB", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHuePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuePicker.kt\ncom/alightcreative/widget/HuePicker\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,247:1\n33#2,3:248\n*S KotlinDebug\n*F\n+ 1 HuePicker.kt\ncom/alightcreative/widget/HuePicker\n*L\n39#1:248,3\n*E\n"})
public final class HuePicker extends View {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private boolean gestureInProgress;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final ReadWriteProperty selectedColor;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final float expandedAngleSnapInterval;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Shader checkerShader;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private float gestureStartY;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final float angleSnapInterval;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final float expandedAngleRange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float angleSnapThreshold;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private SolidColorHSV gestureStartColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Shader trackGradient;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float gestureStartX;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Function2 colorChangeListener;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final float angleSnapCount;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f47097U = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(HuePicker.class, "selectedColor", "getSelectedColor()Lcom/alightcreative/app/motion/scene/SolidColorHSV;", 0))};
    public static final int P5 = 8;

    public static final class n extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ HuePicker f47109n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, HuePicker huePicker) {
            super(obj);
            this.f47109n = huePicker;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f47109n.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint(1);
        Delegates delegates = Delegates.INSTANCE;
        SolidColorHSV.Companion companion = SolidColorHSV.INSTANCE;
        this.selectedColor = new n(companion.getBLUE(), this);
        this.gestureStartColor = companion.getBLACK();
        this.angleSnapThreshold = 15.0f;
        this.angleSnapInterval = 60.0f;
        this.expandedAngleSnapInterval = 15.0f + 60.0f;
        float f3 = 360.0f / 60.0f;
        this.angleSnapCount = f3;
        this.expandedAngleRange = (f3 * 15.0f) + 360.0f;
    }

    private final float nr(float a2) {
        float f3 = ((a2 + 360.0f) % 360.0f) % this.angleSnapInterval;
        float fFloor = (float) Math.floor(r5 / r0);
        return f3 < 0.5f ? fFloor * this.expandedAngleSnapInterval : f3 > this.angleSnapInterval - 0.5f ? ((fFloor + 1.0f) * this.expandedAngleSnapInterval) % this.expandedAngleRange : (fFloor * this.expandedAngleSnapInterval) + (this.angleSnapThreshold / 2.0f) + f3;
    }

    private final float t(float a2) {
        float f3 = this.expandedAngleRange;
        float f4 = ((a2 + f3) % f3) % this.expandedAngleSnapInterval;
        float fFloor = (float) Math.floor(r6 / r0);
        float f5 = this.angleSnapThreshold;
        if (f4 < f5 / 2.0f) {
            return fFloor * this.angleSnapInterval;
        }
        if (f4 > this.expandedAngleSnapInterval - (f5 / 2.0f)) {
            return ((fFloor + 1.0f) * this.angleSnapInterval) % 360.0f;
        }
        float f6 = this.angleSnapInterval;
        return (fFloor * f6) + RangesKt.coerceIn(f4 - (f5 / 2.0f), 0.0f, f6);
    }

    public final Function2<SolidColorHSV, Md, Unit> getColorChangeListener() {
        return this.colorChangeListener;
    }

    public final SolidColorHSV getSelectedColor() {
        return (SolidColorHSV) this.selectedColor.getValue(this, f47097U[0]);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.checkerShader == null) {
            int iMin = Math.min(getWidth(), getHeight()) / 14;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            bitmapCreateBitmap.eraseColor(-7829368);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setColor(-3355444);
            float f3 = iMin;
            float f4 = f3 / 2.0f;
            canvas2.drawRect(0.0f, 0.0f, f4, f4, paint);
            canvas2.drawRect(f4, f4, f3, f3, paint);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.checkerShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
        }
        float fMin = Math.min(getWidth(), getHeight());
        float f5 = fMin / 9.0f;
        float f6 = (f5 / 2.0f) * 1.35f;
        float f7 = (fMin / 2.0f) - f6;
        Paint paint2 = this.paint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.paint.setShader(this.trackGradient);
        this.paint.setStrokeWidth(f5);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, f7, this.paint);
        this.paint.setShader(null);
        Paint paint3 = this.paint;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        Vector2D vector2D = new Vector2D(f7, 0.0f);
        Vector2D vector2D2 = new Vector2D(getWidth() / 2.0f, getHeight() / 2.0f);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fRl = HI0.afx.rl(context, 0.5f);
        float f8 = f6 - (fRl / 2.0f);
        float h2 = getSelectedColor().getH();
        Vector2D vector2DPlus = GeometryKt.plus(GeometryKt.rot(vector2D, h2), vector2D2);
        this.paint.setStyle(style);
        this.paint.setColor(-16777216);
        this.paint.setAlpha(42);
        this.paint.setStrokeWidth(fRl);
        canvas.drawCircle(vector2DPlus.getX(), vector2DPlus.getY() + fRl, f8, this.paint);
        this.paint.setStyle(style2);
        this.paint.setColor(ColorKt.toInt(ColorKt.toRGB(new SolidColorHSV(h2, 1.0f, 1.0f, 0.0f, 8, null))));
        canvas.drawCircle(vector2DPlus.getX(), vector2DPlus.getY(), f8, this.paint);
        this.paint.setStyle(style);
        this.paint.setColor(-16777216);
        this.paint.setAlpha(255);
        if ((getSelectedColor().getH() + 360.0f) % 60.0f < 0.5d) {
            this.paint.setStrokeWidth(fRl * 2.0f);
            canvas.drawCircle(vector2DPlus.getX(), vector2DPlus.getY(), f8 - fRl, this.paint);
        } else {
            canvas.drawCircle(vector2DPlus.getX(), vector2DPlus.getY(), f8, this.paint);
        }
        this.paint.setStyle(style2);
        if (getSelectedColor().getA() < 1.0f) {
            this.paint.setShader(this.checkerShader);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, f7 - f5, this.paint);
            this.paint.setShader(null);
        }
        this.paint.setColor(ColorKt.toInt(getSelectedColor()));
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, f7 - f5, this.paint);
        this.paint.setAlpha(255);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        this.trackGradient = new SweepGradient(getWidth() / 2.0f, getHeight() / 2.0f, new int[]{-64251, -197627, -16647423, -16516101, -15395329, -259588, -64251}, new float[]{0.0f, 0.16666667f, 0.33333334f, 0.5f, 0.6666667f, 0.8333334f, 1.0f});
        this.checkerShader = null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Function2 function2;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                if (this.gestureInProgress) {
                    boolean z2 = event.getActionMasked() == 1;
                    Vector2D vector2D = new Vector2D(getWidth() / 2.0f, getHeight() / 2.0f);
                    float fT = t(nr(this.gestureStartColor.getH()) + (((((GeometryKt.angleDegrees(GeometryKt.minus(new Vector2D(this.gestureStartX, this.gestureStartY), vector2D)) - GeometryKt.angleDegrees(GeometryKt.minus(new Vector2D(event.getX(), event.getY()), vector2D))) + 360.0f) % 360.0f) * this.expandedAngleRange) / 360.0f));
                    SolidColorHSV solidColorHSVCopy$default = SolidColorHSV.copy$default(getSelectedColor(), (fT + 360.0f) % 360.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (Math.abs(getSelectedColor().getH() % 60.0f) > 0.5f && Math.abs(fT % 60.0f) < 0.5f) {
                        LEl.rl(this).n();
                    }
                    setSelectedColor(solidColorHSVCopy$default);
                    Function2 function22 = this.colorChangeListener;
                    if (function22 != null) {
                        function22.invoke(solidColorHSVCopy$default, Md.f47169t);
                    }
                    if (z2 && (function2 = this.colorChangeListener) != null) {
                        function2.invoke(solidColorHSVCopy$default, Md.f47165O);
                    }
                    this.gestureInProgress = !z2;
                }
            } else if (actionMasked == 3) {
                setSelectedColor(this.gestureStartColor);
                Function2 function23 = this.colorChangeListener;
                if (function23 != null) {
                    function23.invoke(this.gestureStartColor, Md.J2);
                }
            }
        } else if (GeometryKt.getLength(GeometryKt.minus(new Vector2D(event.getX(), event.getY()), new Vector2D(getWidth() / 2.0f, getHeight() / 2.0f))) > Math.min(getWidth(), getHeight()) / 4.0f) {
            this.gestureInProgress = true;
            this.gestureStartX = event.getX();
            this.gestureStartY = event.getY();
            this.gestureStartColor = getSelectedColor();
            final float fAngleDegrees = 360.0f - (((GeometryKt.angleDegrees(GeometryKt.minus(new Vector2D(this.gestureStartX, this.gestureStartY), new Vector2D(getWidth() / 2.0f, getHeight() / 2.0f))) - 90.0f) + 360.0f) % 360.0f);
            float fAbs = Math.abs(((getSelectedColor().getH() + 360.0f) % 360.0f) - ((fAngleDegrees + 360.0f) % 360.0f));
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.fg
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HuePicker.O(fAngleDegrees, this);
                }
            });
            Function2 function24 = this.colorChangeListener;
            if (function24 != null) {
                function24.invoke(this.gestureStartColor, Md.f47166n);
            }
            if (fAbs > 45.0f && fAbs < 315.0f) {
                final float fFloor = (((float) Math.floor((30.0f + fAngleDegrees) / 60.0f)) * 60.0f) % 360.0f;
                XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.KH
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HuePicker.J2(fAngleDegrees, fFloor, this);
                    }
                });
                SolidColorHSV solidColorHSVCopy$default2 = SolidColorHSV.copy$default(getSelectedColor(), fFloor, 0.0f, 0.0f, 0.0f, 14, null);
                this.gestureStartColor = solidColorHSVCopy$default2;
                setSelectedColor(solidColorHSVCopy$default2);
                Function2 function25 = this.colorChangeListener;
                if (function25 != null) {
                    function25.invoke(this.gestureStartColor, Md.f47169t);
                }
            }
        }
        return true;
    }

    public final void setColorChangeListener(Function2<? super SolidColorHSV, ? super Md, Unit> function2) {
        this.colorChangeListener = function2;
    }

    public final void setSelectedColor(SolidColorHSV solidColorHSV) {
        Intrinsics.checkNotNullParameter(solidColorHSV, "<set-?>");
        this.selectedColor.setValue(this, f47097U[0], solidColorHSV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J2(float f3, float f4, HuePicker huePicker) {
        return "initialAngle=" + f3 + " snappedAngle=" + f4 + " selectedColor.h=" + huePicker.getSelectedColor().getH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(float f3, HuePicker huePicker) {
        return "initialAngle=" + f3 + " selectedColor.h=" + huePicker.getSelectedColor().getH();
    }
}
