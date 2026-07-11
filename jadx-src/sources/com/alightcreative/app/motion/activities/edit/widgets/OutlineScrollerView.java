package com.alightcreative.app.motion.activities.edit.widgets;

import HI0.afx;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.activities.edit.widgets.OutlineScrollerView;
import com.alightcreative.app.motion.scene.CBKnot;
import com.alightcreative.app.motion.scene.ControlHandle;
import com.alightcreative.app.motion.scene.CubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.OptionalVector2D;
import com.alightcreative.app.motion.scene.Vector2D;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000©\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001~\b\u0007\u0018\u00002\u00020\u0001:\u0003\u008a\u0001-B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010%J3\u0010*\u001a\u00020\u0012*\u00020\u00152\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+R+\u00103\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u00109\u001a\u0002042\u0006\u0010,\u001a\u0002048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010.\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010DR\u0016\u0010H\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010DR\u0016\u0010J\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010DR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010DR\u0014\u0010R\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010DR\u0014\u0010T\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010DR\u0014\u0010V\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010DR\u0014\u0010X\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010DR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010]R\u0014\u0010c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bd\u0010bR\u0014\u0010g\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010bR\u0014\u0010i\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010DR\u0014\u0010k\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010DR\u0014\u0010m\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010DR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010sR\u0018\u0010w\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010sRG\u0010}\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0012\u0018\u00010x2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0012\u0018\u00010x8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010.\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/alightcreative/app/motion/activities/edit/widgets/OutlineScrollerView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "point", "Lcom/alightcreative/app/motion/scene/ControlHandle;", "controlHandle", "", "t", "", "animated", "", "Z", "(ILcom/alightcreative/app/motion/scene/ControlHandle;FZ)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", a.f62811a, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/alightcreative/app/motion/activities/edit/widgets/OutlineScrollerView$n;", "selInfo", "XQ", "(Lcom/alightcreative/app/motion/activities/edit/widgets/OutlineScrollerView$n;Z)V", "x", "o", "(F)F", "ViF", "()V", "y", "radius", "Landroid/graphics/Paint;", "paint", "Ik", "(Landroid/graphics/Canvas;FFFLandroid/graphics/Paint;)V", "<set-?>", c.f62177j, "Lkotlin/properties/ReadWriteProperty;", "getMultiselectMode", "()Z", "setMultiselectMode", "(Z)V", "multiselectMode", "Lcom/alightcreative/app/motion/scene/CubicBSpline;", "getOutline", "()Lcom/alightcreative/app/motion/scene/CubicBSpline;", "setOutline", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;)V", "outline", "", "Lcom/alightcreative/app/motion/activities/edit/widgets/OutlineScrollerView$j;", "O", "Ljava/util/List;", "outlinePoints", "Landroid/widget/OverScroller;", "J2", "Landroid/widget/OverScroller;", "scroller", "r", "F", "scrollY", "pathLength", "S", "minX", "g", "maxX", "Landroid/graphics/PathMeasure;", "E2", "Landroid/graphics/PathMeasure;", "pathMeasure", "e", "snapMargin", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "pointSize", "N", "pointRadius", "v", "selPointSize", "Xw", "selPointRadius", "jB", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", "U", "Landroid/graphics/Path;", "scratchPath", "P5", "scratchPathSegment", "M7", "I", "unselectedColor", "p5", "semiSelectedColor", "eF", "selectedColor", "E", "strokeWidth", "M", "minSpacing", "FX", "maxSpacing", "", "B", "[F", "scratchPos", "J", "Lcom/alightcreative/app/motion/activities/edit/widgets/OutlineScrollerView$n;", "dispatchedSelInfo", "D", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "pendingScroll", "Lkotlin/Function1;", "getSelectionChangeListener", "()Lkotlin/jvm/functions/Function1;", "setSelectionChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "selectionChangeListener", "com/alightcreative/app/motion/activities/edit/widgets/OutlineScrollerView$Ml", "GR", "Lcom/alightcreative/app/motion/activities/edit/widgets/OutlineScrollerView$Ml;", "gestureListener", "Landroid/view/GestureDetector;", "Nxk", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/graphics/DashPathEffect;", "k", "Landroid/graphics/DashPathEffect;", "dashPathEffect", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOutlineScrollerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineScrollerView.kt\ncom/alightcreative/app/motion/activities/edit/widgets/OutlineScrollerView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CubicBSpline.kt\ncom/alightcreative/app/motion/scene/CubicBSplineKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,510:1\n33#2,3:511\n33#2,3:514\n33#2,3:518\n1#3:517\n258#4,26:521\n1872#5,3:547\n*S KotlinDebug\n*F\n+ 1 OutlineScrollerView.kt\ncom/alightcreative/app/motion/activities/edit/widgets/OutlineScrollerView\n*L\n49#1:511,3\n51#1:514,3\n131#1:518,3\n260#1:521,26\n306#1:547,3\n*E\n"})
public final class OutlineScrollerView extends View {
    static final /* synthetic */ KProperty[] dR0 = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(OutlineScrollerView.class, "multiselectMode", "getMultiselectMode()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OutlineScrollerView.class, "outline", "getOutline()Lcom/alightcreative/app/motion/scene/CubicBSpline;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OutlineScrollerView.class, "selectionChangeListener", "getSelectionChangeListener()Lkotlin/jvm/functions/Function1;", 0))};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f45119z = 8;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final float[] scratchPos;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private n selInfo;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final float strokeWidth;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final PathMeasure pathMeasure;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private final float maxSpacing;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private final Ml gestureListener;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty selectionChangeListener;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private n dispatchedSelInfo;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final OverScroller scroller;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final float minSpacing;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final int unselectedColor;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final float pointRadius;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private final GestureDetector gestureDetector;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private List outlinePoints;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final Path scratchPathSegment;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private float minX;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final float pointSize;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final Path scratchPath;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final float selPointRadius;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private n pendingScroll;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float snapMargin;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final int selectedColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float maxX;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final DashPathEffect dashPathEffect;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty multiselectMode;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float pathLength;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final int semiSelectedColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float scrollY;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty outline;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final float selPointSize;

    public static final class C extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ OutlineScrollerView f45142n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(Object obj, OutlineScrollerView outlineScrollerView) {
            super(obj);
            this.f45142n = outlineScrollerView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f45142n.dispatchedSelInfo = null;
        }
    }

    static final class CN3 implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final CN3 f45143n = new CN3();

        CN3() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Float invoke(j it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.nr());
        }
    }

    public static final class Dsr extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ OutlineScrollerView f45144n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dsr(Object obj, OutlineScrollerView outlineScrollerView) {
            super(obj);
            this.f45144n = outlineScrollerView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Boolean) obj2).getClass();
            ((Boolean) obj).getClass();
            this.f45144n.postInvalidate();
        }
    }

    static final class I28 implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f45145n = new I28();

        I28() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Float invoke(j it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.t().getP().getX());
        }
    }

    public static final class Ml extends GestureDetector.SimpleOnGestureListener {

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ControlHandle.values().length];
                try {
                    iArr[ControlHandle.IN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ControlHandle.MAIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ControlHandle.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ControlHandle.CURVE_OUT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        Ml() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            OutlineScrollerView.this.scroller.forceFinished(true);
            OutlineScrollerView.this.postInvalidateOnAnimation();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f3, float f4) {
            Intrinsics.checkNotNullParameter(e2, "e2");
            OutlineScrollerView.this.scroller.forceFinished(true);
            OutlineScrollerView.this.scroller.fling(0, (int) OutlineScrollerView.this.scrollY, 0, -((int) f4), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            OutlineScrollerView.this.postInvalidateOnAnimation();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f3, float f4) {
            Intrinsics.checkNotNullParameter(e2, "e2");
            OutlineScrollerView.this.scroller.forceFinished(true);
            OutlineScrollerView.this.scrollY += f4;
            OutlineScrollerView.this.postInvalidateOnAnimation();
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onSingleTapUp(MotionEvent e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            CBKnot cBKnotT = ((j) OutlineScrollerView.this.outlinePoints.get(OutlineScrollerView.this.selInfo.nr())).t();
            int iNr = OutlineScrollerView.this.selInfo.nr();
            boolean z2 = false;
            final boolean z3 = iNr == CollectionsKt.getLastIndex(OutlineScrollerView.this.getOutline().getKnots()) && !OutlineScrollerView.this.getOutline().getClosed();
            if (iNr == 0 && !OutlineScrollerView.this.getOutline().getClosed()) {
                z2 = true;
            }
            if (e2.getY() >= OutlineScrollerView.this.getHeight() * 0.35f && e2.getY() <= OutlineScrollerView.this.getHeight() * 0.65f) {
                OptionalVector2D curveIn = cBKnotT.getCurveIn();
                OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
                if (!Intrinsics.areEqual(curveIn, none) || !Intrinsics.areEqual(cBKnotT.getCurveOut(), none)) {
                    OutlineScrollerView outlineScrollerView = OutlineScrollerView.this;
                    outlineScrollerView.selInfo = n.rl(outlineScrollerView.selInfo, 0, ControlHandle.MAIN, 0.0f, 5, null);
                    OutlineScrollerView.this.invalidate();
                }
            } else if (e2.getY() < OutlineScrollerView.this.getHeight() * 0.4f) {
                int i2 = j.$EnumSwitchMapping$0[OutlineScrollerView.this.selInfo.t().ordinal()];
                if (i2 == 1) {
                    OutlineScrollerView.S(OutlineScrollerView.this, r15.selInfo.nr() - 1, ControlHandle.MAIN, 0.0f, true, 4, null);
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final OutlineScrollerView outlineScrollerView2 = OutlineScrollerView.this;
                        XoT.C.Uo(this, new Function0() { // from class: yU.nKK
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OutlineScrollerView.Ml.t(outlineScrollerView2);
                            }
                        });
                        if (!z3 || OutlineScrollerView.this.selInfo.O() <= 0.5f) {
                            OutlineScrollerView outlineScrollerView3 = OutlineScrollerView.this;
                            OutlineScrollerView.S(outlineScrollerView3, outlineScrollerView3.selInfo.nr(), ControlHandle.MAIN, 0.0f, true, 4, null);
                        } else {
                            OutlineScrollerView outlineScrollerView4 = OutlineScrollerView.this;
                            outlineScrollerView4.Z(outlineScrollerView4.selInfo.nr(), ControlHandle.CURVE_OUT, 0.3f, true);
                        }
                    } else if (Intrinsics.areEqual(cBKnotT.getCurveOut(), OptionalVector2D.NONE.INSTANCE) || z2) {
                        OutlineScrollerView outlineScrollerView5 = OutlineScrollerView.this;
                        OutlineScrollerView.S(outlineScrollerView5, outlineScrollerView5.selInfo.nr() + 1, ControlHandle.MAIN, 0.0f, true, 4, null);
                    } else {
                        OutlineScrollerView outlineScrollerView6 = OutlineScrollerView.this;
                        outlineScrollerView6.selInfo = n.rl(outlineScrollerView6.selInfo, 0, ControlHandle.IN, 0.0f, 5, null);
                        OutlineScrollerView.this.invalidate();
                    }
                } else if (!Intrinsics.areEqual(cBKnotT.getCurveIn(), OptionalVector2D.NONE.INSTANCE) && !z2) {
                    OutlineScrollerView outlineScrollerView7 = OutlineScrollerView.this;
                    outlineScrollerView7.selInfo = n.rl(outlineScrollerView7.selInfo, 0, ControlHandle.IN, 0.0f, 5, null);
                    OutlineScrollerView.this.invalidate();
                } else if (z2) {
                    OutlineScrollerView outlineScrollerView8 = OutlineScrollerView.this;
                    outlineScrollerView8.Z(outlineScrollerView8.selInfo.nr() - 1, ControlHandle.CURVE_OUT, 0.7f, true);
                } else {
                    OutlineScrollerView.S(OutlineScrollerView.this, r8.selInfo.nr() - 1, ControlHandle.MAIN, 0.0f, true, 4, null);
                }
            } else if (e2.getY() > OutlineScrollerView.this.getHeight() * 0.6f) {
                int i3 = j.$EnumSwitchMapping$0[OutlineScrollerView.this.selInfo.t().ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            OutlineScrollerView outlineScrollerView9 = OutlineScrollerView.this;
                            OutlineScrollerView.S(outlineScrollerView9, outlineScrollerView9.selInfo.nr() + 1, ControlHandle.MAIN, 0.0f, true, 4, null);
                        } else {
                            if (i3 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            final OutlineScrollerView outlineScrollerView10 = OutlineScrollerView.this;
                            XoT.C.Uo(this, new Function0() { // from class: yU.DAz
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OutlineScrollerView.Ml.nr(outlineScrollerView10, z3);
                                }
                            });
                            if (!z3 || OutlineScrollerView.this.selInfo.O() >= 0.5f) {
                                OutlineScrollerView outlineScrollerView11 = OutlineScrollerView.this;
                                OutlineScrollerView.S(outlineScrollerView11, outlineScrollerView11.selInfo.nr() + 1, ControlHandle.MAIN, 0.0f, true, 4, null);
                            } else {
                                OutlineScrollerView outlineScrollerView12 = OutlineScrollerView.this;
                                outlineScrollerView12.Z(outlineScrollerView12.selInfo.nr(), ControlHandle.CURVE_OUT, 0.7f, true);
                            }
                        }
                    } else if (!Intrinsics.areEqual(cBKnotT.getCurveOut(), OptionalVector2D.NONE.INSTANCE) && !z3) {
                        OutlineScrollerView outlineScrollerView13 = OutlineScrollerView.this;
                        outlineScrollerView13.selInfo = n.rl(outlineScrollerView13.selInfo, 0, ControlHandle.OUT, 0.0f, 5, null);
                        OutlineScrollerView.this.invalidate();
                    } else if (z3) {
                        OutlineScrollerView outlineScrollerView14 = OutlineScrollerView.this;
                        outlineScrollerView14.Z(outlineScrollerView14.selInfo.nr(), ControlHandle.CURVE_OUT, 0.3f, true);
                    } else {
                        OutlineScrollerView outlineScrollerView15 = OutlineScrollerView.this;
                        OutlineScrollerView.S(outlineScrollerView15, outlineScrollerView15.selInfo.nr() + 1, ControlHandle.MAIN, 0.0f, true, 4, null);
                    }
                } else if (Intrinsics.areEqual(cBKnotT.getCurveOut(), OptionalVector2D.NONE.INSTANCE) || z3) {
                    OutlineScrollerView.S(OutlineScrollerView.this, r7.selInfo.nr() - 1, ControlHandle.MAIN, 0.0f, true, 4, null);
                } else {
                    OutlineScrollerView outlineScrollerView16 = OutlineScrollerView.this;
                    outlineScrollerView16.selInfo = n.rl(outlineScrollerView16.selInfo, 0, ControlHandle.OUT, 0.0f, 5, null);
                    OutlineScrollerView.this.invalidate();
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String nr(OutlineScrollerView outlineScrollerView, boolean z2) {
            return "onSingleTapUp(DOWN)//CURVE_OUT selInfo=" + outlineScrollerView.selInfo + " isLast=" + z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String t(OutlineScrollerView outlineScrollerView) {
            return "onSingleTapUp(UP)//CURVE_OUT selInfo=" + outlineScrollerView.selInfo;
        }
    }

    static final class Wre implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Wre f45147n = new Wre();

        Wre() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Float invoke(j it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.t().getP().getX());
        }
    }

    public static final class aC extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ OutlineScrollerView f45148n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public aC(Object obj, OutlineScrollerView outlineScrollerView) {
            super(obj);
            this.f45148n = outlineScrollerView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            CubicBSpline cubicBSpline = (CubicBSpline) obj2;
            OutlineScrollerView outlineScrollerView = this.f45148n;
            List<CBKnot> knots = cubicBSpline.getKnots();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
            Iterator<T> it = knots.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                this.f45148n.pathMeasure.setPath(CubicBSplineKt.toPathSegment(cubicBSpline, i2).t(), false);
                arrayList.add(new j(Math.max(1.0f, this.f45148n.pathMeasure.getLength()), (CBKnot) next));
                i2 = i3;
            }
            outlineScrollerView.outlinePoints = arrayList;
            Float fMinOrNull = SequencesKt.minOrNull((Sequence<? extends Float>) SequencesKt.map(CollectionsKt.asSequence(this.f45148n.outlinePoints), fuX.f45149n));
            float fFloatValue = fMinOrNull != null ? fMinOrNull.floatValue() : 1.0f;
            Float fMaxOrNull = SequencesKt.maxOrNull((Sequence<? extends Float>) SequencesKt.map(CollectionsKt.asSequence(this.f45148n.outlinePoints), CN3.f45143n));
            float fMax = Math.max(0.01f, (fMaxOrNull != null ? fMaxOrNull.floatValue() : 1.0f) - fFloatValue);
            OutlineScrollerView outlineScrollerView2 = this.f45148n;
            List<j> list = outlineScrollerView2.outlinePoints;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (j jVar : list) {
                arrayList2.add(j.rl(jVar, (((jVar.nr() - fFloatValue) / fMax) * (this.f45148n.maxSpacing - this.f45148n.minSpacing)) + this.f45148n.minSpacing, null, 2, null));
            }
            outlineScrollerView2.outlinePoints = arrayList2;
            if (!cubicBSpline.getClosed()) {
                OutlineScrollerView outlineScrollerView3 = this.f45148n;
                outlineScrollerView3.outlinePoints = outlineScrollerView3.outlinePoints.isEmpty() ? CollectionsKt.listOf(new j(this.f45148n.minSpacing, new CBKnot(Vector2D.INSTANCE.getZERO(), null, null, 6, null))) : CollectionsKt.plus((Collection<? extends j>) CollectionsKt.dropLast(this.f45148n.outlinePoints, 1), j.rl((j) CollectionsKt.last(this.f45148n.outlinePoints), this.f45148n.minSpacing * 3, null, 2, null));
            }
            OutlineScrollerView outlineScrollerView4 = this.f45148n;
            Iterator it2 = outlineScrollerView4.outlinePoints.iterator();
            float fNr = 0.0f;
            while (it2.hasNext()) {
                fNr += ((j) it2.next()).nr();
            }
            outlineScrollerView4.pathLength = fNr;
            OutlineScrollerView outlineScrollerView5 = this.f45148n;
            Float fMinOrNull2 = SequencesKt.minOrNull((Sequence<? extends Float>) SequencesKt.map(CollectionsKt.asSequence(outlineScrollerView5.outlinePoints), I28.f45145n));
            outlineScrollerView5.minX = fMinOrNull2 != null ? fMinOrNull2.floatValue() : 0.0f;
            OutlineScrollerView outlineScrollerView6 = this.f45148n;
            Float fMaxOrNull2 = SequencesKt.maxOrNull((Sequence<? extends Float>) SequencesKt.map(CollectionsKt.asSequence(outlineScrollerView6.outlinePoints), Wre.f45147n));
            outlineScrollerView6.maxX = fMaxOrNull2 != null ? fMaxOrNull2.floatValue() : 0.0f;
            OutlineScrollerView outlineScrollerView7 = this.f45148n;
            OutlineScrollerView.WPU(outlineScrollerView7, outlineScrollerView7.selInfo, false, 2, null);
            this.f45148n.postInvalidate();
        }
    }

    static final class fuX implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final fuX f45149n = new fuX();

        fuX() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Float invoke(j it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.nr());
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final float f45150n;
        private final CBKnot rl;

        public static /* synthetic */ j rl(j jVar, float f3, CBKnot cBKnot, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f3 = jVar.f45150n;
            }
            if ((i2 & 2) != 0) {
                cBKnot = jVar.rl;
            }
            return jVar.n(f3, cBKnot);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f45150n, jVar.f45150n) == 0 && Intrinsics.areEqual(this.rl, jVar.rl);
        }

        public int hashCode() {
            return (Float.hashCode(this.f45150n) * 31) + this.rl.hashCode();
        }

        public final j n(float f3, CBKnot knot) {
            Intrinsics.checkNotNullParameter(knot, "knot");
            return new j(f3, knot);
        }

        public String toString() {
            return "OutlinePoint(length=" + this.f45150n + ", knot=" + this.rl + ")";
        }

        public j(float f3, CBKnot knot) {
            Intrinsics.checkNotNullParameter(knot, "knot");
            this.f45150n = f3;
            this.rl = knot;
        }

        public final float nr() {
            return this.f45150n;
        }

        public final CBKnot t() {
            return this.rl;
        }
    }

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f45151n;
        private final ControlHandle rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final float f45152t;

        public static /* synthetic */ n rl(n nVar, int i2, ControlHandle controlHandle, float f3, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = nVar.f45151n;
            }
            if ((i3 & 2) != 0) {
                controlHandle = nVar.rl;
            }
            if ((i3 & 4) != 0) {
                f3 = nVar.f45152t;
            }
            return nVar.n(i2, controlHandle, f3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f45151n == nVar.f45151n && this.rl == nVar.rl && Float.compare(this.f45152t, nVar.f45152t) == 0;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f45151n) * 31) + this.rl.hashCode()) * 31) + Float.hashCode(this.f45152t);
        }

        public final n n(int i2, ControlHandle handle, float f3) {
            Intrinsics.checkNotNullParameter(handle, "handle");
            return new n(i2, handle, f3);
        }

        public String toString() {
            return "SelInfo(point=" + this.f45151n + ", handle=" + this.rl + ", t=" + this.f45152t + ")";
        }

        public n(int i2, ControlHandle handle, float f3) {
            Intrinsics.checkNotNullParameter(handle, "handle");
            this.f45151n = i2;
            this.rl = handle;
            this.f45152t = f3;
        }

        public final float O() {
            return this.f45152t;
        }

        public final int nr() {
            return this.f45151n;
        }

        public final ControlHandle t() {
            return this.rl;
        }
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ControlHandle.values().length];
            try {
                iArr[ControlHandle.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ControlHandle.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ControlHandle.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ControlHandle.CURVE_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlineScrollerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Delegates delegates = Delegates.INSTANCE;
        this.multiselectMode = new Dsr(Boolean.FALSE, this);
        this.outline = new aC(CubicBSpline.INSTANCE.getEMPTY(), this);
        this.outlinePoints = CollectionsKt.emptyList();
        OverScroller overScroller = new OverScroller(context);
        overScroller.setFriction(ViewConfiguration.getScrollFriction() * 5);
        this.scroller = overScroller;
        this.pathMeasure = new PathMeasure();
        this.snapMargin = getResources().getDimension(2131166245);
        float dimension = getResources().getDimension(2131166243);
        this.pointSize = dimension;
        float f3 = 2;
        this.pointRadius = dimension / f3;
        float dimension2 = getResources().getDimension(2131166244);
        this.selPointSize = dimension2;
        this.selPointRadius = dimension2 / f3;
        this.paint = new Paint(1);
        this.scratchPath = new Path();
        this.scratchPathSegment = new Path();
        this.unselectedColor = afx.J2(context, 2130968762);
        this.semiSelectedColor = -1;
        this.selectedColor = afx.J2(context, 2130968731);
        float dimension3 = getResources().getDimension(2131166246);
        this.strokeWidth = dimension3;
        this.minSpacing = getResources().getDimension(2131166242);
        this.maxSpacing = getResources().getDimension(2131166241);
        this.scratchPos = new float[2];
        this.selInfo = new n(0, ControlHandle.IN, 0.0f);
        this.selectionChangeListener = new C(null, this);
        Ml ml = new Ml();
        this.gestureListener = ml;
        this.gestureDetector = new GestureDetector(context, ml);
        this.dashPathEffect = new DashPathEffect(new float[]{dimension3 * 2.0f, dimension3 * 2.0f}, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
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
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        ViF();
        float f16 = this.scrollY;
        float f17 = this.pathLength;
        this.scrollY = (f16 + (100 * f17)) % f17;
        float f18 = 2;
        float f19 = f17 * f18;
        canvas2.save();
        float f20 = 2.0f;
        canvas2.translate(0.0f, ((getHeight() / 2.0f) - this.scrollY) - f19);
        this.paint.setColor(this.unselectedColor);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.strokeWidth);
        int i2 = 0;
        float f21 = 0.0f;
        int i3 = 0;
        loop0: while (true) {
            int i5 = 3;
            if (i3 >= 5) {
                float f22 = f20;
                canvas2.restore();
                canvas2.save();
                canvas2.translate(0.0f, ((getHeight() / f22) - this.scrollY) - f19);
                this.paint.setStyle(Paint.Style.FILL);
                float f23 = 0.0f;
                int i7 = 0;
                for (int i8 = 5; i7 < i8; i8 = 5) {
                    float f24 = f23;
                    int i9 = 0;
                    for (Object obj : this.outlinePoints) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        j jVar = (j) obj;
                        List list = this.outlinePoints;
                        j jVar2 = (j) list.get(i10 % list.size());
                        CBKnot cBKnotT = jVar.t();
                        CBKnot cBKnotT2 = jVar2.t();
                        float fO = o(jVar.t().getP().getX());
                        float fNr = f24 + jVar.nr();
                        float f25 = i5;
                        float fNr2 = f24 + (jVar.nr() / f25);
                        float fNr3 = f24 + ((jVar.nr() * f18) / f25);
                        boolean z2 = i9 == CollectionsKt.getLastIndex(getOutline().getKnots()) && !getOutline().getClosed();
                        boolean z3 = i9 == 0 && !getOutline().getClosed();
                        float f26 = f24 - f19;
                        float f27 = this.snapMargin;
                        float f28 = f26 + f27;
                        float f29 = (fNr - f19) - f27;
                        float fMin = Math.min(1.0f, (Math.max(0.0f, this.snapMargin - Math.abs(f26 - this.scrollY)) / this.snapMargin) * f18);
                        float f30 = this.selPointRadius;
                        float f31 = this.pointRadius;
                        float f32 = (fMin * (f30 - f31)) + f31;
                        float f33 = this.scrollY;
                        if (f33 > f28 && f33 < f29) {
                            float f34 = (f33 - f28) / (f29 - f28);
                            if (this.selInfo.nr() != i9 || this.selInfo.O() != f34 || this.selInfo.t() != ControlHandle.CURVE_OUT) {
                                this.selInfo = new n(i9, ControlHandle.CURVE_OUT, f34);
                            }
                        } else if (f32 > f31 && (this.selInfo.nr() != i9 || this.selInfo.t() == ControlHandle.CURVE_OUT)) {
                            this.selInfo = new n(i9, ControlHandle.MAIN, 0.0f);
                        }
                        this.paint.setColor((getMultiselectMode() || f32 <= this.pointRadius) ? this.unselectedColor : this.selInfo.t() == ControlHandle.MAIN ? this.selectedColor : this.semiSelectedColor);
                        canvas2.drawCircle(fO, f24, f32, this.paint);
                        if (f32 > (this.pointRadius + this.selPointRadius) / f18) {
                            if (!(cBKnotT.getCurveIn() instanceof Vector2D) || z3) {
                                f14 = fO;
                                f5 = fNr;
                                f6 = 1.0f;
                            } else {
                                float height = f24 - (getHeight() / 4);
                                float f35 = this.selPointRadius;
                                this.paint.setColor((getMultiselectMode() || this.selInfo.t() != ControlHandle.IN) ? this.semiSelectedColor : this.selectedColor);
                                f14 = fO;
                                f5 = fNr;
                                f6 = 1.0f;
                                canvas2.drawRect(fO - f35, height - f35, f14 + f35, f35 + height, this.paint);
                                canvas.drawLine(f14, f24, f14, height, this.paint);
                            }
                            if (!(cBKnotT.getCurveOut() instanceof Vector2D) || z2) {
                                canvas2 = canvas;
                                f4 = f24;
                                f3 = f14;
                            } else {
                                float height2 = f24 + (getHeight() / 4);
                                float f36 = this.selPointRadius;
                                this.paint.setColor((getMultiselectMode() || this.selInfo.t() != ControlHandle.OUT) ? this.semiSelectedColor : this.selectedColor);
                                canvas2 = canvas;
                                canvas2.drawRect(f14 - f36, height2 - f36, f14 + f36, height2 + f36, this.paint);
                                f4 = f24;
                                f3 = f14;
                                canvas2.drawLine(f3, f4, f14, height2, this.paint);
                            }
                        } else {
                            f3 = fO;
                            f4 = f24;
                            f5 = fNr;
                            f6 = 1.0f;
                        }
                        if (z2) {
                            float f37 = this.scrollY;
                            float f38 = (f37 - f28) / (f29 - f28);
                            boolean z4 = f37 > f28 && f37 < f29 && f38 < 0.5f;
                            boolean z5 = f37 > f28 && f37 < f29 && f38 >= 0.5f;
                            this.scratchPath.rewind();
                            cBKnotT.getP();
                            this.scratchPath.moveTo(f3, f4);
                            OptionalVector2D curveOut = cBKnotT.getCurveOut();
                            OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
                            if (Intrinsics.areEqual(curveOut, none) && Intrinsics.areEqual(cBKnotT2.getCurveIn(), none)) {
                                this.scratchPath.lineTo(o(cBKnotT2.getP().getX()), f5);
                                f13 = f5;
                                f10 = fNr3;
                                f11 = f4;
                            } else if ((cBKnotT.getCurveOut() instanceof Vector2D) && (cBKnotT2.getCurveIn() instanceof Vector2D)) {
                                f13 = f5;
                                this.scratchPath.cubicTo(o(((Vector2D) cBKnotT.getCurveOut()).getX()), fNr2, o(((Vector2D) cBKnotT2.getCurveIn()).getX()), fNr3, o(cBKnotT2.getP().getX()), f13);
                                f11 = f4;
                                f10 = fNr3;
                            } else {
                                f13 = f5;
                                if (Intrinsics.areEqual(cBKnotT.getCurveOut(), none) && (cBKnotT2.getCurveIn() instanceof Vector2D)) {
                                    float f39 = f4;
                                    this.scratchPath.cubicTo(f3, f39, o(((Vector2D) cBKnotT2.getCurveIn()).getX()), fNr3, o(cBKnotT2.getP().getX()), f13);
                                    f11 = f39;
                                    f10 = fNr3;
                                    fNr2 = fNr2;
                                } else {
                                    f11 = f4;
                                    f10 = fNr3;
                                    if (!(cBKnotT.getCurveOut() instanceof Vector2D) || !Intrinsics.areEqual(cBKnotT2.getCurveIn(), none)) {
                                        throw new IllegalStateException();
                                    }
                                    fNr2 = fNr2;
                                    this.scratchPath.cubicTo(o(((Vector2D) cBKnotT.getCurveOut()).getX()), fNr2, o(cBKnotT2.getP().getX()), f13, o(cBKnotT2.getP().getX()), f13);
                                }
                            }
                            this.scratchPathSegment.rewind();
                            this.pathMeasure.setPath(this.scratchPath, false);
                            PathMeasure pathMeasure = this.pathMeasure;
                            f8 = 0.7f;
                            pathMeasure.getSegment(pathMeasure.getLength() * 0.7f, this.pathMeasure.getLength() * f6, this.scratchPathSegment, true);
                            this.paint.setColor(this.unselectedColor);
                            this.paint.setAlpha(90);
                            this.paint.setStyle(Paint.Style.STROKE);
                            this.paint.setPathEffect(this.dashPathEffect);
                            this.paint.setStrokeWidth(this.strokeWidth / f22);
                            PathMeasure pathMeasure2 = this.pathMeasure;
                            pathMeasure2.getSegment(pathMeasure2.getLength() * 0.0f, this.pathMeasure.getLength() * 0.3f, this.scratchPathSegment, true);
                            canvas2.drawPath(this.scratchPathSegment, this.paint);
                            PathMeasure pathMeasure3 = this.pathMeasure;
                            pathMeasure3.getSegment(pathMeasure3.getLength() * 0.7f, this.pathMeasure.getLength() * f6, this.scratchPathSegment, true);
                            canvas2.drawPath(this.scratchPathSegment, this.paint);
                            this.paint.setPathEffect(null);
                            PathMeasure pathMeasure4 = this.pathMeasure;
                            pathMeasure4.getPosTan(pathMeasure4.getLength() * 0.3f, this.scratchPos, null);
                            this.paint.setColor((getMultiselectMode() || !z4) ? this.unselectedColor : this.selectedColor);
                            Paint paint = this.paint;
                            float f40 = this.strokeWidth;
                            if (!z4) {
                                f40 /= f22;
                            }
                            paint.setStrokeWidth(f40);
                            float[] fArr = this.scratchPos;
                            float f41 = f3;
                            float f42 = fArr[0];
                            float f43 = fArr[1];
                            float f44 = this.pointRadius;
                            float f45 = z4 ? 2.2f : 1.8f;
                            f7 = f41;
                            f9 = f13;
                            Ik(canvas2, f42, f43, f44 * f45, this.paint);
                            PathMeasure pathMeasure5 = this.pathMeasure;
                            pathMeasure5.getPosTan(pathMeasure5.getLength() * 0.7f, this.scratchPos, null);
                            this.paint.setColor((getMultiselectMode() || !z5) ? this.unselectedColor : this.selectedColor);
                            Paint paint2 = this.paint;
                            float f46 = this.strokeWidth;
                            if (!z5) {
                                f46 /= f22;
                            }
                            paint2.setStrokeWidth(f46);
                            float[] fArr2 = this.scratchPos;
                            float f47 = fArr2[0];
                            float f48 = fArr2[1];
                            canvas2 = canvas;
                            Ik(canvas2, f47, f48, this.pointRadius * (z5 ? 2.2f : 1.8f), this.paint);
                            this.paint.setStyle(Paint.Style.FILL);
                        } else {
                            f7 = f3;
                            f8 = 0.7f;
                            f9 = f5;
                            f10 = fNr3;
                            f11 = f4;
                        }
                        if (!getMultiselectMode()) {
                            float f49 = this.scrollY;
                            if (f49 <= f28 || f49 >= f29) {
                                f12 = f9;
                            } else {
                                float f50 = (f49 - f28) / (f29 - f28);
                                this.scratchPath.rewind();
                                cBKnotT.getP();
                                this.scratchPath.moveTo(f7, f11);
                                OptionalVector2D curveOut2 = cBKnotT.getCurveOut();
                                OptionalVector2D.NONE none2 = OptionalVector2D.NONE.INSTANCE;
                                if (Intrinsics.areEqual(curveOut2, none2) && Intrinsics.areEqual(cBKnotT2.getCurveIn(), none2)) {
                                    this.scratchPath.lineTo(o(cBKnotT2.getP().getX()), f9);
                                    f12 = f9;
                                } else if ((cBKnotT.getCurveOut() instanceof Vector2D) && (cBKnotT2.getCurveIn() instanceof Vector2D)) {
                                    f12 = f9;
                                    this.scratchPath.cubicTo(o(((Vector2D) cBKnotT.getCurveOut()).getX()), fNr2, o(((Vector2D) cBKnotT2.getCurveIn()).getX()), f10, o(cBKnotT2.getP().getX()), f12);
                                } else {
                                    f12 = f9;
                                    float f51 = f10;
                                    if (Intrinsics.areEqual(cBKnotT.getCurveOut(), none2) && (cBKnotT2.getCurveIn() instanceof Vector2D)) {
                                        this.scratchPath.cubicTo(f7, f11, o(((Vector2D) cBKnotT2.getCurveIn()).getX()), f51, o(cBKnotT2.getP().getX()), f12);
                                    } else {
                                        if (!(cBKnotT.getCurveOut() instanceof Vector2D) || !Intrinsics.areEqual(cBKnotT2.getCurveIn(), none2)) {
                                            throw new IllegalStateException();
                                        }
                                        this.scratchPath.cubicTo(o(((Vector2D) cBKnotT.getCurveOut()).getX()), fNr2, o(cBKnotT2.getP().getX()), f12, o(cBKnotT2.getP().getX()), f12);
                                    }
                                }
                                if (!z2) {
                                    this.pathMeasure.setPath(this.scratchPath, false);
                                    PathMeasure pathMeasure6 = this.pathMeasure;
                                    pathMeasure6.getPosTan(pathMeasure6.getLength() * f50, this.scratchPos, null);
                                    this.paint.setColor(this.selectedColor);
                                    float[] fArr3 = this.scratchPos;
                                    canvas2.drawCircle(fArr3[0], fArr3[1], this.pointRadius * f8, this.paint);
                                }
                            }
                        }
                        i9 = i10;
                        f24 = f12;
                        i5 = 3;
                    }
                    i7++;
                    f23 = f24;
                    i5 = 3;
                }
                canvas2.restore();
                if (Intrinsics.areEqual(this.selInfo, this.dispatchedSelInfo)) {
                    return;
                }
                this.dispatchedSelInfo = this.selInfo;
                post(new Runnable() { // from class: yU.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        OutlineScrollerView.r(this.f75633n);
                    }
                });
                return;
            }
            List list2 = this.outlinePoints;
            boolean closed = getOutline().getClosed();
            int size = list2.size();
            if (size >= 1) {
                int i11 = i2;
                while (i11 < size) {
                    Object obj2 = i11 == 0 ? closed ? list2.get(size - 1) : null : list2.get(i11 - 1);
                    float f53 = f20;
                    int i12 = i11 + 1;
                    j jVar3 = (j) (i12 >= size ? closed ? list2.get(i2) : null : list2.get(i12));
                    j jVar4 = (j) list2.get(i11);
                    CBKnot cBKnotT3 = jVar4.t();
                    CBKnot cBKnotT4 = jVar3 != null ? jVar3.t() : null;
                    float fO2 = o(jVar4.t().getP().getX());
                    float fNr4 = f21 + jVar4.nr();
                    float f54 = 3;
                    float fNr5 = f21 + (jVar4.nr() / f54);
                    float fNr6 = f21 + ((jVar4.nr() * f18) / f54);
                    float f55 = this.snapMargin;
                    float f56 = (f21 - f19) + f55;
                    float f57 = (fNr4 - f19) - f55;
                    if (!getMultiselectMode()) {
                        float f58 = this.scrollY;
                        if (f58 <= f56 || f58 >= f57) {
                            this.paint.setColor(this.unselectedColor);
                        } else {
                            this.paint.setColor(this.selectedColor);
                        }
                    }
                    if (cBKnotT4 != null) {
                        this.scratchPath.rewind();
                        cBKnotT3.getP();
                        this.scratchPath.moveTo(fO2, f21);
                        OptionalVector2D curveOut3 = cBKnotT3.getCurveOut();
                        OptionalVector2D.NONE none3 = OptionalVector2D.NONE.INSTANCE;
                        if (Intrinsics.areEqual(curveOut3, none3) && Intrinsics.areEqual(cBKnotT4.getCurveIn(), none3)) {
                            this.scratchPath.lineTo(o(cBKnotT4.getP().getX()), fNr4);
                            f15 = fNr4;
                        } else if ((cBKnotT3.getCurveOut() instanceof Vector2D) && (cBKnotT4.getCurveIn() instanceof Vector2D)) {
                            f15 = fNr4;
                            this.scratchPath.cubicTo(o(((Vector2D) cBKnotT3.getCurveOut()).getX()), fNr5, o(((Vector2D) cBKnotT4.getCurveIn()).getX()), fNr6, o(cBKnotT4.getP().getX()), f15);
                        } else {
                            f15 = fNr4;
                            if (Intrinsics.areEqual(cBKnotT3.getCurveOut(), none3) && (cBKnotT4.getCurveIn() instanceof Vector2D)) {
                                this.scratchPath.cubicTo(fO2, f21, o(((Vector2D) cBKnotT4.getCurveIn()).getX()), fNr6, o(cBKnotT4.getP().getX()), f15);
                            } else {
                                if (!(cBKnotT3.getCurveOut() instanceof Vector2D) || !Intrinsics.areEqual(cBKnotT4.getCurveIn(), none3)) {
                                    break loop0;
                                }
                                this.scratchPath.cubicTo(o(((Vector2D) cBKnotT3.getCurveOut()).getX()), fNr5, o(cBKnotT4.getP().getX()), f15, o(cBKnotT4.getP().getX()), f15);
                                f15 = f15;
                            }
                        }
                        canvas2.drawPath(this.scratchPath, this.paint);
                    } else {
                        f15 = fNr4;
                    }
                    i11 = i12;
                    f20 = f53;
                    f21 = f15;
                    i2 = 0;
                }
            }
            i3++;
            f20 = f20;
            i2 = 0;
        }
        throw new IllegalStateException();
    }

    private final void Ik(Canvas canvas, float f3, float f4, float f5, Paint paint) {
        canvas.drawLine(f3 - f5, f4, f3 + f5, f4, paint);
        canvas.drawLine(f3, f4 - f5, f3, f4 + f5, paint);
    }

    public static /* synthetic */ void S(OutlineScrollerView outlineScrollerView, int i2, ControlHandle controlHandle, float f3, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            controlHandle = ControlHandle.MAIN;
        }
        if ((i3 & 4) != 0) {
            f3 = 0.5f;
        }
        if ((i3 & 8) != 0) {
            z2 = false;
        }
        outlineScrollerView.Z(i2, controlHandle, f3, z2);
    }

    private final void ViF() {
        if (this.scroller.computeScrollOffset()) {
            this.scrollY = this.scroller.getCurrY();
            postInvalidateOnAnimation();
            return;
        }
        n nVar = this.pendingScroll;
        if (nVar != null) {
            this.selInfo = nVar;
            this.pendingScroll = null;
        }
    }

    static /* synthetic */ void WPU(OutlineScrollerView outlineScrollerView, n nVar, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        outlineScrollerView.XQ(nVar, z2);
    }

    private final void XQ(n selInfo, boolean animated) {
        if (this.outlinePoints.isEmpty()) {
            return;
        }
        this.pendingScroll = selInfo;
        float fSumOfFloat = SequencesKt.sumOfFloat(SequencesKt.map(SequencesKt.take(CollectionsKt.asSequence(this.outlinePoints), (selInfo.nr() + (this.outlinePoints.size() * 100)) % this.outlinePoints.size()), new Function1() { // from class: yU.Ew
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(OutlineScrollerView.aYN((OutlineScrollerView.j) obj));
            }
        }));
        int i2 = w6.$EnumSwitchMapping$0[selInfo.t().ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            fSumOfFloat += this.snapMargin + ((((j) this.outlinePoints.get((selInfo.nr() + this.outlinePoints.size()) % this.outlinePoints.size())).nr() - (this.snapMargin * 2)) * selInfo.O());
        }
        if (this.scrollY == fSumOfFloat) {
            return;
        }
        if (animated) {
            this.scroller.forceFinished(true);
            int i3 = (int) (fSumOfFloat - this.scrollY);
            float f3 = i3;
            if (Math.abs(i3) > Math.abs(this.pathLength + f3)) {
                i3 += (int) this.pathLength;
            } else if (Math.abs(i3) > Math.abs(f3 - this.pathLength)) {
                i3 -= (int) this.pathLength;
            }
            this.scroller.startScroll(0, (int) this.scrollY, 0, i3);
        } else {
            this.scrollY = fSumOfFloat;
        }
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float aYN(j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.nr();
    }

    private final float o(float x2) {
        float f3 = this.minX;
        return (((x2 - f3) / (this.maxX - f3)) * (((getWidth() - this.pointSize) - getPaddingLeft()) - getPaddingRight())) + this.pointRadius + getPaddingLeft();
    }

    public final void Z(int point, ControlHandle controlHandle, float t3, boolean animated) {
        Intrinsics.checkNotNullParameter(controlHandle, "controlHandle");
        XQ(new n(point, controlHandle, t3), animated);
    }

    public final boolean getMultiselectMode() {
        return ((Boolean) this.multiselectMode.getValue(this, dR0[0])).booleanValue();
    }

    public final CubicBSpline getOutline() {
        return (CubicBSpline) this.outline.getValue(this, dR0[1]);
    }

    public final Function1<n, Unit> getSelectionChangeListener() {
        return (Function1) this.selectionChangeListener.getValue(this, dR0[2]);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.gestureDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    public final void setMultiselectMode(boolean z2) {
        this.multiselectMode.setValue(this, dR0[0], Boolean.valueOf(z2));
    }

    public final void setOutline(CubicBSpline cubicBSpline) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<set-?>");
        this.outline.setValue(this, dR0[1], cubicBSpline);
    }

    public final void setSelectionChangeListener(Function1<? super n, Unit> function1) {
        this.selectionChangeListener.setValue(this, dR0[2], function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(OutlineScrollerView outlineScrollerView) {
        Function1<n, Unit> selectionChangeListener = outlineScrollerView.getSelectionChangeListener();
        if (selectionChangeListener != null) {
            selectionChangeListener.invoke(outlineScrollerView.selInfo);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OutlineScrollerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
