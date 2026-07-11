package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.easing.CubicBezierEasing;
import com.alightcreative.app.motion.easing.Easing;
import com.alightcreative.app.motion.easing.EasingHandle;
import com.alightcreative.app.motion.easing.LinearEasing;
import com.alightcreative.app.motion.easing.RandomEasing;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.events.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010-\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u0014\u0010/\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010(R\u0014\u00101\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010(R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010A\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R*\u0010E\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00108\u001a\u0004\bC\u0010:\"\u0004\bD\u0010<R+\u0010N\u001a\u00020F2\u0006\u0010G\u001a\u00020F8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR7\u0010U\u001a\b\u0012\u0004\u0012\u00020F0O2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0O8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR+\u0010\u001a\u001a\u00020&2\u0006\u0010G\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010I\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR+\u0010^\u001a\u00020&2\u0006\u0010G\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010I\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR+\u0010b\u001a\u00020&2\u0006\u0010G\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010I\u001a\u0004\b`\u0010X\"\u0004\ba\u0010ZR\"\u0010i\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010o\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010(R\u0016\u0010q\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010(R\u0016\u0010s\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010(R\u0016\u0010u\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010(R\u0016\u0010w\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010(R\u0016\u0010x\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010dR\u0015\u0010z\u001a\u00020&8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010XR\u0015\u0010|\u001a\u00020\u00128Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010fR\u0015\u0010~\u001a\u00020&8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010XR\u0016\u0010\u0080\u0001\u001a\u00020&8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010XR\u0017\u0010\u0082\u0001\u001a\u00020&8Â\u0002X\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010X¨\u0006\u0083\u0001"}, d2 = {"Lcom/alightcreative/widget/EasingCurveView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", a.f62811a, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Paint;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Path;", "t", "Landroid/graphics/Path;", JavetError.PARAMETER_PATH, "O", "I", "gridColor", "J2", "gridColorOvershoot", "r", "gridColorExtra", "o", "accentColor", "", "S", "F", "easingEditorGridlineWidthMajor", "g", "easingEditorGridlineWidth", "E2", "easingEditorCurveWidth", "e", "easingEditorControlPointRadius", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "easingEditorMargin", "Landroid/graphics/DashPathEffect;", "N", "Landroid/graphics/DashPathEffect;", "dashEffect", "Lkotlin/Function0;", "v", "Lkotlin/jvm/functions/Function0;", "getOnValueChange", "()Lkotlin/jvm/functions/Function0;", "setOnValueChange", "(Lkotlin/jvm/functions/Function0;)V", "onValueChange", "Xw", "getOnStartTrackingTouch", "setOnStartTrackingTouch", "onStartTrackingTouch", "jB", "getOnStopTrackingTouch", "setOnStopTrackingTouch", "onStopTrackingTouch", "Lcom/alightcreative/app/motion/easing/Easing;", "<set-?>", "U", "Lkotlin/properties/ReadWriteProperty;", "getEasing", "()Lcom/alightcreative/app/motion/easing/Easing;", "setEasing", "(Lcom/alightcreative/app/motion/easing/Easing;)V", "easing", "", "P5", "getOtherEasings", "()Ljava/util/List;", "setOtherEasings", "(Ljava/util/List;)V", "otherEasings", "M7", "getT", "()F", "setT", "(F)V", "p5", "getMinValue", "setMinValue", "minValue", "eF", "getMaxValue", "setMaxValue", "maxValue", "E", "Z", "getAllowOvershoot", "()Z", "setAllowOvershoot", "(Z)V", "allowOvershoot", "", "M", "Ljava/lang/String;", "draggingPointId", "FX", "startpx", "B", "startpy", "J", "startx", "D", "starty", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "dampingFactor", "handleOvershoot", "getRangeHeight", "rangeHeight", "getVisualOvershoot", "visualOvershoot", "getOriginY", "originY", "getOvershootTop", "overshootTop", "getOvershootBottom", "overshootBottom", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEasingCurveView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EasingCurveView.kt\ncom/alightcreative/widget/EasingCurveView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,305:1\n58#1:321\n60#1:322\n59#1:323\n61#1,2:324\n61#1:326\n62#1:327\n59#1:328\n58#1:334\n33#2,3:306\n33#2,3:309\n33#2,3:312\n33#2,3:315\n33#2,3:318\n1#3:329\n1863#4,2:330\n1863#4,2:332\n2341#4,14:335\n*S KotlinDebug\n*F\n+ 1 EasingCurveView.kt\ncom/alightcreative/widget/EasingCurveView\n*L\n72#1:321\n74#1:322\n78#1:323\n87#1:324,2\n90#1:326\n100#1:327\n132#1:328\n264#1:334\n53#1:306,3\n54#1:309,3\n55#1:312,3\n56#1:315,3\n57#1:318,3\n216#1:330,2\n245#1:332,2\n271#1:335,14\n*E\n"})
public final class EasingCurveView extends View {

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f47054GR = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EasingCurveView.class, "easing", "getEasing()Lcom/alightcreative/app/motion/easing/Easing;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EasingCurveView.class, "otherEasings", "getOtherEasings()Ljava/util/List;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EasingCurveView.class, "t", "getT()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EasingCurveView.class, "minValue", "getMinValue()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EasingCurveView.class, "maxValue", "getMaxValue()F", 0))};
    public static final int Nxk = 8;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private float startpy;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private float starty;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean allowOvershoot;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final float easingEditorCurveWidth;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private float startpx;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private boolean handleOvershoot;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private float startx;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int gridColorOvershoot;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private String draggingPointId;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final ReadWriteProperty t;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final DashPathEffect dashEffect;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int gridColor;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final ReadWriteProperty otherEasings;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final float easingEditorGridlineWidthMajor;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final float easingEditorMargin;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty easing;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Function0 onStartTrackingTouch;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float dampingFactor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float easingEditorControlPointRadius;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final ReadWriteProperty maxValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float easingEditorGridlineWidth;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Function0 onStopTrackingTouch;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int accentColor;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final ReadWriteProperty minValue;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int gridColorExtra;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Path path;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Function0 onValueChange;

    public static final class I28 extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ EasingCurveView f47075n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Object obj, EasingCurveView easingCurveView) {
            super(obj);
            this.f47075n = easingCurveView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).floatValue();
            ((Number) obj).floatValue();
            this.f47075n.invalidate();
        }
    }

    public static final class Ml extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ EasingCurveView f47076n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Object obj, EasingCurveView easingCurveView) {
            super(obj);
            this.f47076n = easingCurveView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).floatValue();
            ((Number) obj).floatValue();
            this.f47076n.invalidate();
        }
    }

    public static final class j extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ EasingCurveView f47077n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, EasingCurveView easingCurveView) {
            super(obj);
            this.f47077n = easingCurveView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f47077n.invalidate();
        }
    }

    public static final class n extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ EasingCurveView f47078n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, EasingCurveView easingCurveView) {
            super(obj);
            this.f47078n = easingCurveView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f47078n.invalidate();
        }
    }

    public static final class w6 extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ EasingCurveView f47079n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Object obj, EasingCurveView easingCurveView) {
            super(obj);
            this.f47079n = easingCurveView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).floatValue();
            ((Number) obj).floatValue();
            this.f47079n.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EasingCurveView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint(1);
        this.path = new Path();
        this.gridColor = ColorKt.toInt(new SolidColor(1.0f, 1.0f, 1.0f, 0.06f));
        this.gridColorOvershoot = ColorKt.toInt(new SolidColor(1.0f, 1.0f, 1.0f, 0.03f));
        this.gridColorExtra = ColorKt.toInt(new SolidColor(1.0f, 1.0f, 1.0f, 0.25f));
        this.accentColor = getResources().getColor(2131099798, context.getTheme());
        float dimension = getResources().getDimension(2131165414);
        this.easingEditorGridlineWidthMajor = dimension;
        this.easingEditorGridlineWidth = getResources().getDimension(2131165413);
        this.easingEditorCurveWidth = getResources().getDimension(2131165412);
        this.easingEditorControlPointRadius = getResources().getDimension(2131165411);
        this.easingEditorMargin = getResources().getDimension(2131165415);
        float f3 = 2;
        this.dashEffect = new DashPathEffect(new float[]{dimension * f3, dimension * f3}, 0.0f);
        Delegates delegates = Delegates.INSTANCE;
        LinearEasing linearEasing = LinearEasing.INSTANCE;
        Intrinsics.checkNotNull(linearEasing, "null cannot be cast to non-null type com.alightcreative.app.motion.easing.Easing");
        this.easing = new j(linearEasing, this);
        this.otherEasings = new n(CollectionsKt.emptyList(), this);
        this.t = new w6(Float.valueOf(-1.0f), this);
        this.minValue = new Ml(Float.valueOf(-0.25f), this);
        this.maxValue = new I28(Float.valueOf(1.25f), this);
        this.dampingFactor = 1.0f;
    }

    private final float getOvershootBottom() {
        return 0.0f - getMinValue();
    }

    public final boolean getAllowOvershoot() {
        return this.allowOvershoot;
    }

    public final Easing getEasing() {
        return (Easing) this.easing.getValue(this, f47054GR[0]);
    }

    public final float getMaxValue() {
        return ((Number) this.maxValue.getValue(this, f47054GR[4])).floatValue();
    }

    public final float getMinValue() {
        return ((Number) this.minValue.getValue(this, f47054GR[3])).floatValue();
    }

    public final Function0<Unit> getOnStartTrackingTouch() {
        return this.onStartTrackingTouch;
    }

    public final Function0<Unit> getOnStopTrackingTouch() {
        return this.onStopTrackingTouch;
    }

    public final Function0<Unit> getOnValueChange() {
        return this.onValueChange;
    }

    public final List<Easing> getOtherEasings() {
        return (List) this.otherEasings.getValue(this, f47054GR[1]);
    }

    public final float getT() {
        return ((Number) this.t.getValue(this, f47054GR[2])).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04d9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(Canvas canvas) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i2;
        float f8;
        float f9;
        int i3;
        float f10;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        Easing easing = getEasing();
        List<EasingHandle> handles = easing.getHandles();
        char c2 = 2;
        float f11 = 2;
        float width = getWidth() - (this.easingEditorMargin * f11);
        float height = (getHeight() - (this.easingEditorMargin * f11)) / (getMaxValue() - getMinValue());
        canvas2.translate(this.easingEditorMargin, (getHeight() - height) / f11);
        float f12 = 0.0f;
        canvas2.translate(0.0f, ((getMinValue() + ((getMaxValue() - getMinValue()) / 2.0f)) - 0.5f) * height);
        this.paint.setStyle(Paint.Style.STROKE);
        if (getMinValue() < 0.0f || getMaxValue() > 1.0f) {
            this.paint.setColor(this.gridColorOvershoot);
            int i5 = 0;
            while (i5 < 33) {
                this.paint.setStrokeWidth(i5 % 8 == 0 ? this.easingEditorGridlineWidthMajor : this.easingEditorGridlineWidth);
                float f13 = (i5 * width) / 32;
                canvas2.drawLine(f13, 0.0f - ((getMaxValue() - 1.0f) * height), f13, ((0.0f - getMinValue()) * height) + height, this.paint);
                i5++;
                canvas2 = canvas;
            }
            float f14 = 32;
            int iRoundToInt = MathKt.roundToInt((getMaxValue() - 1.0f) * f14);
            if (iRoundToInt >= 0) {
                int i7 = 0;
                while (true) {
                    this.paint.setStrokeWidth(i7 % 8 == 0 ? this.easingEditorGridlineWidthMajor : this.easingEditorGridlineWidth);
                    float f15 = ((-i7) * height) / f14;
                    int i8 = iRoundToInt;
                    int i9 = i7;
                    char c4 = c2;
                    f3 = width;
                    f4 = f14;
                    canvas.drawLine(0.0f, f15, f3, f15, this.paint);
                    if (i9 == i8) {
                        break;
                    }
                    i7 = i9 + 1;
                    iRoundToInt = i8;
                    f14 = f4;
                    c2 = c4;
                    width = f3;
                }
            } else {
                f3 = width;
                f4 = f14;
            }
            int iRoundToInt2 = MathKt.roundToInt((0.0f - getMinValue()) * f4);
            if (iRoundToInt2 >= 0) {
                int i10 = 0;
                while (true) {
                    this.paint.setStrokeWidth(i10 % 8 == 0 ? this.easingEditorGridlineWidthMajor : this.easingEditorGridlineWidth);
                    float f16 = height + ((i10 * height) / f4);
                    canvas.drawLine(0.0f, f16, f3, f16, this.paint);
                    if (i10 == iRoundToInt2) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            f3 = width;
        }
        this.paint.setColor(this.gridColor);
        for (int i11 = 0; i11 < 33; i11++) {
            this.paint.setStrokeWidth(i11 % 8 == 0 ? this.easingEditorGridlineWidthMajor : this.easingEditorGridlineWidth);
            float f17 = (i11 * height) / 32;
            canvas.drawLine(0.0f, f17, f3, f17, this.paint);
        }
        float f18 = f3;
        int i12 = 0;
        while (i12 < 33) {
            this.paint.setStrokeWidth(i12 % 8 == 0 ? this.easingEditorGridlineWidthMajor : this.easingEditorGridlineWidth);
            float f19 = (i12 * f18) / 32;
            float f20 = height;
            canvas.drawLine(f19, 0.0f, f19, f20, this.paint);
            i12++;
            height = f20;
        }
        float f21 = height;
        if (isEnabled()) {
            if (getMinValue() < 0.0f || getMaxValue() > 1.0f) {
                this.paint.setColor(this.gridColorExtra);
                this.paint.setPathEffect(this.dashEffect);
                this.path.rewind();
                if (getMinValue() < 0.0f) {
                    this.path.moveTo(0.0f, f21);
                    this.path.lineTo(f18, f21);
                }
                if (getMaxValue() > 1.0f) {
                    this.path.moveTo(0.0f, 0.0f);
                    this.path.lineTo(f18, 0.0f);
                }
                canvas.drawPath(this.path, this.paint);
                this.paint.setPathEffect(null);
            }
            double t3 = getT();
            if (0.0d <= t3 && t3 <= 1.0d) {
                this.paint.setColor(-1);
                this.paint.setPathEffect(this.dashEffect);
                this.path.rewind();
                this.path.moveTo(getT() * f18, 0.0f);
                this.path.lineTo(getT() * f18, f21);
                canvas.drawPath(this.path, this.paint);
                this.paint.setPathEffect(null);
            }
            Iterator<Easing> it = getOtherEasings().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Easing next = it.next();
                this.path.rewind();
                if (next instanceof CubicBezierEasing) {
                    this.path.moveTo(f12, f21);
                    Path path = this.path;
                    CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) next;
                    float p1x = f18 * cubicBezierEasing.getP1x();
                    float f22 = 1;
                    float p1y = f21 * (f22 - cubicBezierEasing.getP1y());
                    float p2x = f18 * cubicBezierEasing.getP2x();
                    float p2y = f21 * (f22 - cubicBezierEasing.getP2y());
                    f9 = f12;
                    f10 = f18;
                    path.cubicTo(p1x, p1y, p2x, p2y, f10, 0.0f);
                } else {
                    f9 = f12;
                    if (Intrinsics.areEqual(next, LinearEasing.INSTANCE)) {
                        this.path.moveTo(f9, f21);
                        f10 = f18;
                        this.path.cubicTo(f18 * 0.25f, f21 * 0.75f, 0.75f * f18, f21 * 0.25f, f10, 0.0f);
                    } else {
                        float f23 = 1;
                        this.path.moveTo(f9, f21 * (f23 - next.interpolate(f9)));
                        int iCoerceIn = RangesKt.coerceIn((getWidth() * 3) / 2, 100, 1200);
                        if (1 <= iCoerceIn) {
                            while (true) {
                                float f24 = i3 / iCoerceIn;
                                Path path2 = this.path;
                                float f25 = f24 * f18;
                                float fInterpolate = next.interpolate(f24);
                                if (Math.abs(fInterpolate) < 0.006f) {
                                    fInterpolate = f9;
                                }
                                path2.lineTo(f25, (f23 - fInterpolate) * f21);
                                i3 = i3 != iCoerceIn ? i3 + 1 : 1;
                            }
                        }
                        this.paint.setColor(this.accentColor);
                        this.paint.setAlpha(63);
                        this.paint.setStrokeWidth(this.easingEditorCurveWidth / f11);
                        this.paint.setStrokeJoin(Paint.Join.ROUND);
                        this.paint.setStrokeCap(Paint.Cap.ROUND);
                        canvas.drawPath(this.path, this.paint);
                        f12 = f9;
                    }
                }
                f18 = f10;
                this.paint.setColor(this.accentColor);
                this.paint.setAlpha(63);
                this.paint.setStrokeWidth(this.easingEditorCurveWidth / f11);
                this.paint.setStrokeJoin(Paint.Join.ROUND);
                this.paint.setStrokeCap(Paint.Cap.ROUND);
                canvas.drawPath(this.path, this.paint);
                f12 = f9;
            }
            float f26 = f12;
            this.path.rewind();
            if (easing instanceof CubicBezierEasing) {
                this.path.moveTo(f26, f21);
                CubicBezierEasing cubicBezierEasing2 = (CubicBezierEasing) easing;
                float f27 = 1;
                f6 = f18;
                this.path.cubicTo(f18 * cubicBezierEasing2.getP1x(), f21 * (f27 - cubicBezierEasing2.getP1y()), f18 * cubicBezierEasing2.getP2x(), f21 * (f27 - cubicBezierEasing2.getP2y()), f6, 0.0f);
            } else {
                float f28 = f18;
                if (!Intrinsics.areEqual(easing, LinearEasing.INSTANCE)) {
                    f5 = f28;
                    float f29 = 1;
                    this.path.moveTo(f26, (f29 - easing.interpolate(f26)) * f21);
                    int iCoerceIn2 = RangesKt.coerceIn((getWidth() * 3) / 2, 100, 1200);
                    if (1 <= iCoerceIn2) {
                        int i13 = 1;
                        while (true) {
                            float f30 = i13 / iCoerceIn2;
                            Path path3 = this.path;
                            float f31 = f30 * f5;
                            float fInterpolate2 = easing.interpolate(f30);
                            if (Math.abs(fInterpolate2) < 0.006f) {
                                fInterpolate2 = f26;
                            }
                            path3.lineTo(f31, (f29 - fInterpolate2) * f21);
                            if (i13 == iCoerceIn2) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    this.paint.setColor(this.accentColor);
                    this.paint.setStrokeWidth(this.easingEditorCurveWidth);
                    this.paint.setStrokeJoin(Paint.Join.ROUND);
                    this.paint.setStrokeCap(Paint.Cap.ROUND);
                    canvas.drawPath(this.path, this.paint);
                    int i14 = -1;
                    this.paint.setColor(-1);
                    this.paint.setStrokeWidth(this.easingEditorCurveWidth);
                    for (EasingHandle easingHandle : handles) {
                        if (easingHandle.getOrigin() != null) {
                            this.paint.setStrokeWidth(this.easingEditorCurveWidth);
                            this.paint.setColor(getResources().getColor(easingHandle.getHandleStyle().getLineColor(), getContext().getTheme()));
                            if (easingHandle.getHandleStyle().isDashed()) {
                                if (easing instanceof RandomEasing) {
                                    this.paint.setStrokeWidth(this.easingEditorGridlineWidthMajor);
                                    this.paint.setPathEffect(this.dashEffect);
                                    this.path.rewind();
                                    this.path.moveTo(easingHandle.getOrigin().getX() * f5, (1 - easingHandle.getOrigin().getY()) * f21);
                                    this.path.lineTo(easingHandle.getPosition().getX() * f5, f21);
                                    canvas.drawPath(this.path, this.paint);
                                    this.paint.setPathEffect(null);
                                }
                                f7 = f21;
                                i2 = i14;
                                f8 = f26;
                            } else {
                                float x2 = easingHandle.getOrigin().getX() * f5;
                                float f32 = 1;
                                float y2 = (f32 - easingHandle.getOrigin().getY()) * f21;
                                float x3 = f5 * easingHandle.getPosition().getX();
                                float y3 = f21 * (f32 - easingHandle.getPosition().getY());
                                f7 = f21;
                                f8 = f26;
                                i2 = i14;
                                canvas.drawLine(x2, y2, x3, y3, this.paint);
                            }
                        } else {
                            f7 = f21;
                            i2 = i14;
                            f8 = f26;
                        }
                        f21 = f7;
                        f26 = f8;
                        i14 = i2;
                    }
                    float f33 = f21;
                    float f34 = f26;
                    this.paint.setStyle(Paint.Style.FILL);
                    this.paint.setColor(this.accentColor);
                    canvas.drawCircle(f34, f33, this.easingEditorCurveWidth, this.paint);
                    canvas.drawCircle(f5, f34, this.easingEditorCurveWidth, this.paint);
                    this.paint.setColor(i14);
                    for (EasingHandle easingHandle2 : handles) {
                        this.paint.setColor(getResources().getColor(easingHandle2.getHandleStyle().getHandleColor(), getContext().getTheme()));
                        canvas.drawCircle(easingHandle2.getPosition().getX() * f5, f33 * (1 - easingHandle2.getPosition().getY()), this.easingEditorControlPointRadius * (Intrinsics.areEqual(easingHandle2.getId(), this.draggingPointId) ? 1.2f : 1.0f), this.paint);
                    }
                }
                this.path.moveTo(f26, f21);
                f6 = f28;
                this.path.cubicTo(f28 * 0.25f, f21 * 0.75f, 0.75f * f28, f21 * 0.25f, f6, 0.0f);
            }
            f5 = f6;
            this.paint.setColor(this.accentColor);
            this.paint.setStrokeWidth(this.easingEditorCurveWidth);
            this.paint.setStrokeJoin(Paint.Join.ROUND);
            this.paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawPath(this.path, this.paint);
            int i142 = -1;
            this.paint.setColor(-1);
            this.paint.setStrokeWidth(this.easingEditorCurveWidth);
            while (r10.hasNext()) {
            }
            float f332 = f21;
            float f342 = f26;
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(this.accentColor);
            canvas.drawCircle(f342, f332, this.easingEditorCurveWidth, this.paint);
            canvas.drawCircle(f5, f342, this.easingEditorCurveWidth, this.paint);
            this.paint.setColor(i142);
            while (r2.hasNext()) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Easing easing = getEasing();
        List<EasingHandle> handles = easing.getHandles();
        float f3 = 2;
        float width = getWidth() - (this.easingEditorMargin * f3);
        float height = (getHeight() - (this.easingEditorMargin * f3)) / (getMaxValue() - getMinValue());
        int actionMasked = event.getActionMasked();
        Object next = null;
        if (actionMasked == 0) {
            Vector2D vector2D = new Vector2D((event.getX() - this.easingEditorMargin) / width, 1 - ((event.getY() - ((getHeight() - height) / f3)) / height));
            Iterator<T> it = handles.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    float length = GeometryKt.getLength(GeometryKt.minus(((EasingHandle) next).getPosition(), vector2D));
                    do {
                        Object next2 = it.next();
                        float length2 = GeometryKt.getLength(GeometryKt.minus(((EasingHandle) next2).getPosition(), vector2D));
                        if (Float.compare(length, length2) > 0) {
                            next = next2;
                            length = length2;
                        }
                    } while (it.hasNext());
                }
            }
            EasingHandle easingHandle = (EasingHandle) next;
            if (easingHandle != null) {
                Function0 function0 = this.onStartTrackingTouch;
                if (function0 != null) {
                    function0.invoke();
                }
                this.draggingPointId = easingHandle.getId();
                this.startpx = easingHandle.getPosition().getX();
                this.startpy = easingHandle.getPosition().getY();
                this.dampingFactor = easingHandle.getDampingFactor();
                this.startx = event.getRawX();
                this.starty = event.getRawY();
                this.handleOvershoot = this.allowOvershoot || easingHandle.getAllowOvershoot();
                invalidate();
            }
        } else if (actionMasked == 1) {
            if (this.draggingPointId != null) {
                this.draggingPointId = null;
                invalidate();
                Function0 function02 = this.onStopTrackingTouch;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        } else if (actionMasked == 2) {
            String str = this.draggingPointId;
            if (str == null) {
                return false;
            }
            setEasing(easing.copyWithUpdatedHandle(str, new Vector2D(RangesKt.coerceIn(this.startpx + (((event.getRawX() - this.startx) / width) * this.dampingFactor), 0.0f, 1.0f), RangesKt.coerceIn(this.startpy + (((-(event.getRawY() - this.starty)) / height) * this.dampingFactor), this.handleOvershoot ? getMinValue() : 0.0f, this.handleOvershoot ? getMaxValue() : 1.0f))));
            Function0 function03 = this.onValueChange;
            if (function03 != null) {
                function03.invoke();
            }
            invalidate();
        } else if (actionMasked == 3) {
        }
        return true;
    }

    public final void setAllowOvershoot(boolean z2) {
        this.allowOvershoot = z2;
    }

    public final void setEasing(Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "<set-?>");
        this.easing.setValue(this, f47054GR[0], easing);
    }

    public final void setMaxValue(float f3) {
        this.maxValue.setValue(this, f47054GR[4], Float.valueOf(f3));
    }

    public final void setMinValue(float f3) {
        this.minValue.setValue(this, f47054GR[3], Float.valueOf(f3));
    }

    public final void setOnStartTrackingTouch(Function0<Unit> function0) {
        this.onStartTrackingTouch = function0;
    }

    public final void setOnStopTrackingTouch(Function0<Unit> function0) {
        this.onStopTrackingTouch = function0;
    }

    public final void setOnValueChange(Function0<Unit> function0) {
        this.onValueChange = function0;
    }

    public final void setOtherEasings(List<? extends Easing> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.otherEasings.setValue(this, f47054GR[1], list);
    }

    public final void setT(float f3) {
        this.t.setValue(this, f47054GR[2], Float.valueOf(f3));
    }

    private final float getOriginY() {
        return getMinValue() + ((getMaxValue() - getMinValue()) / 2.0f);
    }

    private final float getOvershootTop() {
        return getMaxValue() - 1.0f;
    }

    private final float getRangeHeight() {
        return getMaxValue() - getMinValue();
    }

    private final boolean getVisualOvershoot() {
        if (getMinValue() >= 0.0f && getMaxValue() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EasingCurveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
