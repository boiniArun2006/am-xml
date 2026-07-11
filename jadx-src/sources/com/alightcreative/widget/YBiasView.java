package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR?\u0010(\u001a\u001f\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\r\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u00100\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00104\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R+\u0010<\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u0016\u0010G\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010BR\u0016\u0010I\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010BR\u0016\u0010K\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010BR\u0016\u0010M\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010BR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010SR\u0014\u0010X\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010S¨\u0006Y"}, d2 = {"Lcom/alightcreative/widget/YBiasView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "w", CmcdData.STREAMING_FORMAT_HLS, "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", a.f62811a, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Paint;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/graphics/Paint;", "paint", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "y", "t", "Lkotlin/jvm/functions/Function1;", "getOnValueChangedListener", "()Lkotlin/jvm/functions/Function1;", "setOnValueChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "onValueChangedListener", "Lkotlin/Function0;", "O", "Lkotlin/jvm/functions/Function0;", "getOnStartTrackingTouchListener", "()Lkotlin/jvm/functions/Function0;", "setOnStartTrackingTouchListener", "(Lkotlin/jvm/functions/Function0;)V", "onStartTrackingTouchListener", "J2", "getOnStopTrackingTouchListener", "setOnStopTrackingTouchListener", "onStopTrackingTouchListener", "<set-?>", "r", "Lkotlin/properties/ReadWriteProperty;", "getValue", "()F", "setValue", "(F)V", "value", "Landroid/graphics/Shader;", "o", "Landroid/graphics/Shader;", "fillGradient", "S", "F", "lineWidth", "g", "indicatorRadius", "E2", "prevX", "e", "prevY", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "initialX", "N", "initialY", "", "v", "J", "lastTapTime", "Xw", "I", "doubleTapSlop", "jB", "doubleTapTime", "U", "tapTimeout", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYBiasView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YBiasView.kt\ncom/alightcreative/widget/YBiasView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,118:1\n33#2,3:119\n*S KotlinDebug\n*F\n+ 1 YBiasView.kt\ncom/alightcreative/widget/YBiasView\n*L\n34#1:119,3\n*E\n"})
public final class YBiasView extends View {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private float prevX;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Function0 onStopTrackingTouchListener;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private float initialY;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Function0 onStartTrackingTouchListener;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final float lineWidth;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private float initialX;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final int tapTimeout;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final int doubleTapSlop;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float prevY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float indicatorRadius;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final int doubleTapTime;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Shader fillGradient;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty value;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Function1 onValueChangedListener;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long lastTapTime;
    static final /* synthetic */ KProperty[] P5 = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(YBiasView.class, "value", "getValue()F", 0))};
    public static final int M7 = 8;

    public static final class j extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ YBiasView f47369n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, YBiasView yBiasView) {
            super(obj);
            this.f47369n = yBiasView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).floatValue();
            ((Number) obj).floatValue();
            this.f47369n.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YBiasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint(1);
        Delegates delegates = Delegates.INSTANCE;
        this.value = new j(Float.valueOf(0.0f), this);
        this.lineWidth = getResources().getDimension(2131165516);
        this.indicatorRadius = getResources().getDimension(2131165515);
        this.doubleTapSlop = ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.doubleTapTime = ViewConfiguration.getDoubleTapTimeout();
        this.tapTimeout = ViewConfiguration.getTapTimeout();
    }

    public final Function0<Unit> getOnStartTrackingTouchListener() {
        return this.onStartTrackingTouchListener;
    }

    public final Function0<Unit> getOnStopTrackingTouchListener() {
        return this.onStopTrackingTouchListener;
    }

    public final Function1<Float, Unit> getOnValueChangedListener() {
        return this.onValueChangedListener;
    }

    public final float getValue() {
        return ((Number) this.value.getValue(this, P5[0])).floatValue();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float height = getHeight() / 2.0f;
        float width = getWidth() / 2.0f;
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setShader(this.fillGradient);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), getWidth() / 8.0f, getWidth() / 8.0f, this.paint);
        this.paint.setShader(null);
        Paint paint = this.paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.paint.setStrokeWidth(this.lineWidth);
        this.paint.setColor(285212672);
        canvas.drawLine(0.0f, height, getWidth(), height, this.paint);
        this.paint.setShader(null);
        this.paint.setColor(-16777216);
        this.paint.setStyle(style);
        this.paint.setStrokeWidth(this.lineWidth);
        canvas.drawLine(width, height, width, height - ((getValue() * 0.5f) * getHeight()), this.paint);
        canvas.drawCircle(width, height - ((getValue() * 0.5f) * getHeight()), this.indicatorRadius, this.paint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        float height = getHeight() / 2.0f;
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
                    setValue(0.0f);
                    Function1 function1 = this.onValueChangedListener;
                    if (function1 != null) {
                        function1.invoke(Float.valueOf(getValue()));
                    }
                    invalidate();
                }
                this.lastTapTime = event.getEventTime();
            }
        } else if (actionMasked == 2) {
            Vector2D vector2D2 = new Vector2D(event.getRawX() - this.prevX, event.getRawY() - this.prevY);
            this.prevX = event.getRawX();
            this.prevY = event.getRawY();
            setValue(RangesKt.coerceIn(getValue() - GeometryKt.div(vector2D2, height * 16.0f).getY(), -1.0f, 1.0f));
            Function1 function12 = this.onValueChangedListener;
            if (function12 != null) {
                function12.invoke(Float.valueOf(getValue()));
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

    public final void setOnValueChangedListener(Function1<? super Float, Unit> function1) {
        this.onValueChangedListener = function1;
    }

    public final void setValue(float f3) {
        this.value.setValue(this, P5[0], Float.valueOf(f3));
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        this.fillGradient = new LinearGradient(getWidth() / 2.0f, 0.0f, getWidth() / 2.0f, getHeight(), new int[]{-4473925, -1118482, -12303292}, (float[]) null, Shader.TileMode.CLAMP);
    }
}
