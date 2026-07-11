package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.SolidColorHSV;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R+\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,RZ\u0010;\u001a:\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0013\u0012\u001102¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\r\u0018\u00010.j\u0004\u0018\u0001`48\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010D\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/alightcreative/widget/AlphaValuePicker;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "w", CmcdData.STREAMING_FORMAT_HLS, "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/view/MotionEvent;", a.f62811a, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lcom/alightcreative/app/motion/scene/SolidColorHSV;", "<set-?>", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Lkotlin/properties/ReadWriteProperty;", "getSelectedColor", "()Lcom/alightcreative/app/motion/scene/SolidColorHSV;", "setSelectedColor", "(Lcom/alightcreative/app/motion/scene/SolidColorHSV;)V", "selectedColor", "Landroid/graphics/Shader;", "t", "Landroid/graphics/Shader;", "checkerShader", "Landroid/graphics/Paint;", "O", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/LinearGradient;", "J2", "Landroid/graphics/LinearGradient;", "verticalGradient", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, TtmlNode.ATTR_TTS_COLOR, "Lcom/alightcreative/widget/Md;", "state", "Lcom/alightcreative/widget/ColorChangeListener;", "r", "Lkotlin/jvm/functions/Function2;", "getColorChangeListener", "()Lkotlin/jvm/functions/Function2;", "setColorChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "colorChangeListener", "", "o", "F", "gestureStartX", "S", "gestureStartY", "g", "Lcom/alightcreative/app/motion/scene/SolidColorHSV;", "gestureStartColor", "E2", "Z", "gestureInProgress", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlphaValuePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaValuePicker.kt\ncom/alightcreative/widget/AlphaValuePicker\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,136:1\n33#2,3:137\n*S KotlinDebug\n*F\n+ 1 AlphaValuePicker.kt\ncom/alightcreative/widget/AlphaValuePicker\n*L\n24#1:137,3\n*E\n"})
public final class AlphaValuePicker extends View {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private boolean gestureInProgress;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private LinearGradient verticalGradient;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private float gestureStartY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private SolidColorHSV gestureStartColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty selectedColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float gestureStartX;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Function2 colorChangeListener;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Shader checkerShader;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f46990e = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AlphaValuePicker.class, "selectedColor", "getSelectedColor()Lcom/alightcreative/app/motion/scene/SolidColorHSV;", 0))};

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f46989T = 8;

    public static final class j extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AlphaValuePicker f46998n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, AlphaValuePicker alphaValuePicker) {
            super(obj);
            this.f46998n = alphaValuePicker;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f46998n.verticalGradient = null;
            this.f46998n.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaValuePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Delegates delegates = Delegates.INSTANCE;
        SolidColorHSV.Companion companion = SolidColorHSV.INSTANCE;
        this.selectedColor = new j(companion.getBLACK(), this);
        this.paint = new Paint(1);
        this.gestureStartColor = companion.getBLACK();
    }

    public final Function2<SolidColorHSV, Md, Unit> getColorChangeListener() {
        return this.colorChangeListener;
    }

    public final SolidColorHSV getSelectedColor() {
        return (SolidColorHSV) this.selectedColor.getValue(this, f46990e[0]);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fMin = Math.min(getWidth() * 0.8f, HI0.afx.rl(context, 12.0f));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float fRl = HI0.afx.rl(context2, 0.5f);
        float f3 = ((1.35f * fMin) / 2.0f) - fRl;
        float f4 = f3 + fRl;
        if (this.verticalGradient == null) {
            this.verticalGradient = new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), ColorKt.toInt(ColorKt.toRGB(SolidColorHSV.copy$default(getSelectedColor(), 0.0f, 0.0f, 0.0f, 1.0f, 7, null))), 0, Shader.TileMode.CLAMP);
        }
        if (this.checkerShader == null) {
            int iMin = Math.min(getWidth(), getHeight()) / 4;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            bitmapCreateBitmap.eraseColor(-7829368);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setColor(-3355444);
            float f5 = iMin;
            float f6 = f5 / 2.0f;
            canvas2.drawRect(0.0f, 0.0f, f6, f6, paint);
            canvas2.drawRect(f6, f6, f5, f5, paint);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.checkerShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        float fRl2 = HI0.afx.rl(context3, 3.5f);
        Paint paint2 = this.paint;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.paint.setShader(this.checkerShader);
        float width = getWidth() / 2.0f;
        float f7 = fMin / 2.0f;
        float f8 = width - f7;
        float f9 = width + f7;
        canvas.drawRoundRect(f8, f4, f9, getHeight() - f4, fRl2, fRl2, this.paint);
        this.paint.setShader(this.verticalGradient);
        canvas.drawRoundRect(f8, f4, f9, getHeight() - f4, fRl2, fRl2, this.paint);
        this.paint.setShader(null);
        float width2 = getWidth() / 2.0f;
        float height = f4 + ((getHeight() - (f4 * 2.0f)) * (1.0f - getSelectedColor().getA()));
        this.paint.setShader(null);
        this.paint.setXfermode(null);
        Paint paint3 = this.paint;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        this.paint.setColor(-16777216);
        this.paint.setStrokeWidth(fRl);
        this.paint.setAlpha(42);
        canvas.drawCircle(width2, height + fRl, f3, this.paint);
        this.paint.setStyle(style);
        this.paint.setAlpha(255);
        this.paint.setShader(this.checkerShader);
        canvas.drawCircle(width2, height, f3, this.paint);
        this.paint.setShader(null);
        this.paint.setColor(ColorKt.toInt(ColorKt.toRGB(getSelectedColor())));
        canvas.drawCircle(width2, height, f3, this.paint);
        this.paint.setStyle(style2);
        this.paint.setColor((getSelectedColor().getV() >= 0.2f || ((double) getSelectedColor().getA()) <= 0.8d) ? -16777216 : -7829368);
        this.paint.setStrokeWidth(fRl);
        canvas.drawCircle(width2, height, f3, this.paint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Function2 function2;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.gestureInProgress = true;
            this.gestureStartX = event.getX();
            this.gestureStartY = event.getY();
            SolidColorHSV selectedColor = getSelectedColor();
            this.gestureStartColor = selectedColor;
            Function2 function22 = this.colorChangeListener;
            if (function22 != null) {
                function22.invoke(selectedColor, Md.f47166n);
            }
        } else if (actionMasked == 1 || actionMasked == 2) {
            if (this.gestureInProgress) {
                boolean z2 = event.getActionMasked() == 1;
                float y2 = (event.getY() - this.gestureStartY) / (getHeight() * 1.1f);
                SolidColorHSV solidColorHSV = this.gestureStartColor;
                SolidColorHSV solidColorHSVCopy$default = SolidColorHSV.copy$default(solidColorHSV, 0.0f, 0.0f, 0.0f, RangesKt.coerceIn(solidColorHSV.getA() - y2, 0.0f, 1.0f), 7, null);
                setSelectedColor(solidColorHSVCopy$default);
                Function2 function23 = this.colorChangeListener;
                if (function23 != null) {
                    function23.invoke(solidColorHSVCopy$default, Md.f47169t);
                }
                if (z2 && (function2 = this.colorChangeListener) != null) {
                    function2.invoke(solidColorHSVCopy$default, Md.f47165O);
                }
                this.gestureInProgress = !z2;
            }
        } else if (actionMasked == 3) {
            setSelectedColor(this.gestureStartColor);
            Function2 function24 = this.colorChangeListener;
            if (function24 != null) {
                function24.invoke(this.gestureStartColor, Md.J2);
            }
        }
        return true;
    }

    public final void setColorChangeListener(Function2<? super SolidColorHSV, ? super Md, Unit> function2) {
        this.colorChangeListener = function2;
    }

    public final void setSelectedColor(SolidColorHSV solidColorHSV) {
        Intrinsics.checkNotNullParameter(solidColorHSV, "<set-?>");
        this.selectedColor.setValue(this, f46990e[0], solidColorHSV);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        this.verticalGradient = null;
        this.checkerShader = null;
    }
}
