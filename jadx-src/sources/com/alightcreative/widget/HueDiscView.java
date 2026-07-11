package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fRT\u0010*\u001a4\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u00102\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00106\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0014\u0010G\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010FR\u0016\u0010Q\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010FR\u0016\u0010S\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010FR\u0016\u0010U\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010FR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010[R\u0014\u0010`\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010[R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0011\u0010\u0016\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bc\u0010b¨\u0006d"}, d2 = {"Lcom/alightcreative/widget/HueDiscView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "w", CmcdData.STREAMING_FORMAT_HLS, "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "hue", "strength", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(FF)V", "Landroid/view/MotionEvent;", a.f62811a, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "t", "Lkotlin/jvm/functions/Function2;", "getOnValueChangedListener", "()Lkotlin/jvm/functions/Function2;", "setOnValueChangedListener", "(Lkotlin/jvm/functions/Function2;)V", "onValueChangedListener", "Lkotlin/Function0;", "O", "Lkotlin/jvm/functions/Function0;", "getOnStartTrackingTouchListener", "()Lkotlin/jvm/functions/Function0;", "setOnStartTrackingTouchListener", "(Lkotlin/jvm/functions/Function0;)V", "onStartTrackingTouchListener", "J2", "getOnStopTrackingTouchListener", "setOnStopTrackingTouchListener", "onStopTrackingTouchListener", "Lcom/alightcreative/app/motion/scene/Vector2D;", "r", "Lcom/alightcreative/app/motion/scene/Vector2D;", "getValue", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "setValue", "(Lcom/alightcreative/app/motion/scene/Vector2D;)V", "value", "Landroid/graphics/Shader;", "o", "Landroid/graphics/Shader;", "fillGradient1", "S", "fillGradient2", "g", "F", "lineWidth", "E2", "indicatorRadius", "", "e", "[I", "colors", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "prevX", "N", "prevY", "v", "initialX", "Xw", "initialY", "", "jB", "J", "lastTapTime", "U", "I", "doubleTapSlop", "P5", "doubleTapTime", "M7", "tapTimeout", "getHue", "()F", "getStrength", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHueDiscView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HueDiscView.kt\ncom/alightcreative/widget/HueDiscView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n1557#2:186\n1628#2,3:187\n1557#2:190\n1628#2,3:191\n*S KotlinDebug\n*F\n+ 1 HueDiscView.kt\ncom/alightcreative/widget/HueDiscView\n*L\n59#1:186\n59#1:187,3\n69#1:190\n69#1:191,3\n*E\n"})
public final class HueDiscView extends View {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final float indicatorRadius;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Function0 onStopTrackingTouchListener;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final int tapTimeout;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private float prevY;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Function0 onStartTrackingTouchListener;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final int doubleTapTime;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Shader fillGradient2;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private float prevX;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final int doubleTapSlop;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private float initialY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int[] colors;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float lineWidth;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private long lastTapTime;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Shader fillGradient1;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Vector2D value;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Function2 onValueChangedListener;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float initialX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HueDiscView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint(1);
        this.value = new Vector2D(0.5f, 0.5f);
        this.lineWidth = getResources().getDimension(2131165516);
        this.indicatorRadius = getResources().getDimension(2131165515);
        List listListOf = CollectionsKt.listOf((Object[]) new SolidColor[]{new SolidColor(1.0f, 0.0f, 0.0f, 0.0f, 8, null), new SolidColor(1.0f, 1.0f, 0.0f, 0.0f, 8, null), new SolidColor(0.0f, 1.0f, 0.0f, 0.0f, 8, null), new SolidColor(0.0f, 1.0f, 1.0f, 0.0f, 8, null), new SolidColor(0.0f, 0.0f, 1.0f, 0.0f, 8, null), new SolidColor(1.0f, 0.0f, 1.0f, 0.0f, 8, null), new SolidColor(1.0f, 0.0f, 0.0f, 0.0f, 8, null)});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(ColorKt.toInt((SolidColor) it.next())));
        }
        this.colors = CollectionsKt.toIntArray(arrayList);
        this.doubleTapSlop = ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.doubleTapTime = ViewConfiguration.getDoubleTapTimeout();
        this.tapTimeout = ViewConfiguration.getTapTimeout();
    }

    public final float getHue() {
        return ((float) Math.atan2(this.value.getY() - 0.5f, this.value.getX() - 0.5f)) * 57.2958f;
    }

    public final Function0<Unit> getOnStartTrackingTouchListener() {
        return this.onStartTrackingTouchListener;
    }

    public final Function0<Unit> getOnStopTrackingTouchListener() {
        return this.onStopTrackingTouchListener;
    }

    public final Function2<Float, Float, Unit> getOnValueChangedListener() {
        return this.onValueChangedListener;
    }

    public final float getStrength() {
        return GeometryKt.getLength(GeometryKt.minus(this.value, Vector2D.INSTANCE.getHALF())) * 2.0f;
    }

    public final Vector2D getValue() {
        return this.value;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float fMin = Math.min(getWidth(), getHeight()) / 2.0f;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        Paint paint = this.paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.paint.setShader(this.fillGradient1);
        canvas.drawCircle(width, height, fMin, this.paint);
        this.paint.setShader(this.fillGradient2);
        canvas.drawCircle(width, height, fMin, this.paint);
        this.paint.setShader(this.fillGradient1);
        Paint paint2 = this.paint;
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.paint.setStrokeWidth(this.lineWidth);
        float fSin = ((float) Math.sin(1.0471975511965976d)) * fMin;
        float fCos = ((float) Math.cos(1.0471975511965976d)) * fMin;
        float f3 = width - fMin;
        float f4 = width + fMin;
        canvas.drawLine(f3, height, f4, height, this.paint);
        float f5 = width - fCos;
        float f6 = height - fSin;
        float f7 = width + fCos;
        float f8 = height + fSin;
        canvas.drawLine(f5, f6, f7, f8, this.paint);
        canvas.drawLine(f7, f6, f5, f8, this.paint);
        this.paint.setShader(this.fillGradient2);
        this.paint.setStyle(style);
        canvas.drawCircle(width, height, fMin, this.paint);
        canvas.drawCircle(width, height, fMin, this.paint);
        canvas.drawCircle(width, height, fMin, this.paint);
        this.paint.setShader(null);
        this.paint.setStyle(style2);
        this.paint.setStrokeWidth(this.lineWidth);
        this.paint.setColor(285212672);
        canvas.drawLine(f3, height, f4, height, this.paint);
        canvas.drawLine(f5, f6, f7, f8, this.paint);
        canvas.drawLine(f7, f6, f5, f8, this.paint);
        this.paint.setShader(null);
        this.paint.setColor(-16777216);
        this.paint.setStyle(style2);
        this.paint.setStrokeWidth(this.lineWidth);
        canvas.drawCircle(((this.value.getX() - 0.5f) * fMin * 2.0f) + width, ((this.value.getY() - 0.5f) * fMin * 2.0f) + height, this.indicatorRadius, this.paint);
        canvas.drawLine(width, height, width + ((this.value.getX() - 0.5f) * fMin * 2.0f), height + ((this.value.getY() - 0.5f) * fMin * 2.0f), this.paint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        float fMin = Math.min(getWidth(), getHeight()) / 2.0f;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            Function0 function0 = this.onStartTrackingTouchListener;
            if (function0 != null) {
                function0.invoke();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            this.initialX = event.getRawX();
            this.initialY = event.getRawY();
            this.prevX = event.getRawX();
            this.prevY = event.getRawY();
        } else if (actionMasked == 1) {
            Function0 function02 = this.onStopTrackingTouchListener;
            if (function02 != null) {
                function02.invoke();
            }
            if (event.getEventTime() - event.getDownTime() <= this.tapTimeout) {
                Vector2D vector2D = new Vector2D(this.prevX - this.initialX, this.prevY - this.initialY);
                if (event.getDownTime() - this.lastTapTime < this.doubleTapTime && GeometryKt.getLength(vector2D) <= this.doubleTapSlop) {
                    this.value = Vector2D.INSTANCE.getHALF();
                    Function2 function2 = this.onValueChangedListener;
                    if (function2 != null) {
                        function2.invoke(Float.valueOf(getHue()), Float.valueOf(getStrength()));
                    }
                    invalidate();
                }
                this.lastTapTime = event.getEventTime();
            }
        } else if (actionMasked == 2) {
            Vector2D vector2D2 = new Vector2D(event.getRawX() - this.prevX, event.getRawY() - this.prevY);
            this.prevX = event.getRawX();
            this.prevY = event.getRawY();
            Vector2D vector2DPlus = GeometryKt.plus(this.value, GeometryKt.div(vector2D2, fMin * 16.0f));
            this.value = vector2DPlus;
            Vector2D.Companion companion = Vector2D.INSTANCE;
            Vector2D vector2DMinus = GeometryKt.minus(vector2DPlus, companion.getHALF());
            float length = GeometryKt.getLength(vector2DMinus);
            if (Math.abs(length) > 0.5f) {
                this.value = GeometryKt.plus(companion.getHALF(), GeometryKt.div(GeometryKt.div(vector2DMinus, length), 2.0f));
            }
            Function2 function22 = this.onValueChangedListener;
            if (function22 != null) {
                function22.invoke(Float.valueOf(getHue()), Float.valueOf(getStrength()));
            }
            invalidate();
        }
        return true;
    }

    public final void setOnStartTrackingTouchListener(Function0<Unit> function0) {
        this.onStartTrackingTouchListener = function0;
    }

    public final void setOnStopTrackingTouchListener(Function0<Unit> function0) {
        this.onStopTrackingTouchListener = function0;
    }

    public final void setOnValueChangedListener(Function2<? super Float, ? super Float, Unit> function2) {
        this.onValueChangedListener = function2;
    }

    public final void setValue(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<set-?>");
        this.value = vector2D;
    }

    public final void n(float hue, float strength) {
        double d2 = hue / 57.2958f;
        this.value = GeometryKt.plus(GeometryKt.div(new Vector2D(((float) Math.cos(d2)) * strength, ((float) Math.sin(d2)) * strength), 2.0f), Vector2D.INSTANCE.getHALF());
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int[] iArr = this.colors;
        IntRange intRange = new IntRange(0, 6);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((IntIterator) it).nextInt() / 6.0f));
        }
        this.fillGradient1 = new SweepGradient(width, height, iArr, CollectionsKt.toFloatArray(arrayList));
        this.fillGradient2 = new RadialGradient(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, -1, 0, Shader.TileMode.CLAMP);
    }
}
