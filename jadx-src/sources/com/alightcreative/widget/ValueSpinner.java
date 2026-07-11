package com.alightcreative.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.a;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015*\u0002\u00ad\u0001\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001dÉ\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0007J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001eR\"\u0010.\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\fR\"\u00102\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010\fR\"\u00105\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b3\u0010,\"\u0004\b4\u0010\fR\"\u00109\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010*\u001a\u0004\b7\u0010,\"\u0004\b8\u0010\fR\"\u0010=\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010*\u001a\u0004\b;\u0010,\"\u0004\b<\u0010\fR\"\u0010A\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010*\u001a\u0004\b?\u0010,\"\u0004\b@\u0010\fR\"\u0010E\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010*\u001a\u0004\bC\u0010,\"\u0004\bD\u0010\fR\"\u0010J\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0019\u001a\u0004\bG\u0010\u000f\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010*\u001a\u0004\bL\u0010,\"\u0004\bM\u0010\fR\"\u0010R\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u0019\u001a\u0004\bP\u0010\u000f\"\u0004\bQ\u0010IR\u0016\u0010T\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010\u0019R\u0017\u0010W\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bU\u0010*\u001a\u0004\bV\u0010,R\u0017\u0010Z\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bX\u0010*\u001a\u0004\bY\u0010,R=\u0010e\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\\\u0012\b\b]\u0012\u0004\b\b(^\u0012\u0004\u0012\u00020\n0[8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR=\u0010i\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\\\u0012\b\b]\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0[8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010`\u001a\u0004\bg\u0010b\"\u0004\bh\u0010dR\"\u0010m\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010\u0019\u001a\u0004\bk\u0010\u000f\"\u0004\bl\u0010IR(\u0010u\u001a\b\u0012\u0004\u0012\u00020\n0n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR(\u0010y\u001a\b\u0012\u0004\u0012\u00020\n0n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010p\u001a\u0004\bw\u0010r\"\u0004\bx\u0010tR+\u0010\u007f\u001a\u00020\r2\u0006\u0010z\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b{\u0010|\u001a\u0004\b}\u0010\u000f\"\u0004\b~\u0010IR&\u0010\u0083\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010*\u001a\u0005\b\u0081\u0001\u0010,\"\u0005\b\u0082\u0001\u0010\fR&\u0010\u0087\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010*\u001a\u0005\b\u0085\u0001\u0010,\"\u0005\b\u0086\u0001\u0010\fR&\u0010\u008b\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010\u0019\u001a\u0005\b\u0089\u0001\u0010\u000f\"\u0005\b\u008a\u0001\u0010IR/\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020\b0\u008c\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b*\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R&\u0010\u0096\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010*\u001a\u0005\b\u0094\u0001\u0010,\"\u0005\b\u0095\u0001\u0010\fR\u001a\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R?\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020\b0\u008c\u00012\r\u0010z\u001a\t\u0012\u0004\u0012\u00020\b0\u008c\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u009b\u0001\u0010|\u001a\u0006\b\u009c\u0001\u0010\u008f\u0001\"\u0006\b\u009d\u0001\u0010\u0091\u0001R&\u0010¢\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009f\u0001\u0010*\u001a\u0005\b \u0001\u0010,\"\u0005\b¡\u0001\u0010\fR1\u0010¨\u0001\u001a\u00020\u001c2\u0006\u0010z\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b£\u0001\u0010|\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0018\u0010°\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010´\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0018\u0010¸\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010º\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¹\u0001\u0010\u001eR\u0018\u0010¼\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b»\u0001\u0010\u001eR\u0018\u0010¾\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b½\u0001\u0010\u0019R\u0018\u0010À\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¿\u0001\u0010\u0019R\u0018\u0010Â\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÁ\u0001\u0010\u0019R)\u0010Å\u0001\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÃ\u0001\u0010¥\u0001\"\u0006\bÄ\u0001\u0010§\u0001R'\u0010È\u0001\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r8F@BX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÆ\u0001\u0010\u000f\"\u0005\bÇ\u0001\u0010I¨\u0006Ê\u0001"}, d2 = {"Lcom/alightcreative/widget/ValueSpinner;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "value", "", "setValue", "(I)V", "", "nY", "()Z", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", a.f62811a, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "o", "Z", "g", "()V", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "F", "BASE_SCROLL", "t", "scrollX", "O", "scrollY", "Lcom/alightcreative/widget/ValueSpinner$j;", "J2", "Lcom/alightcreative/widget/ValueSpinner$j;", "curve", "r", "curveBias", "I", "getTickSpacing", "()I", "setTickSpacing", "tickSpacing", "S", "getTickWidth", "setTickWidth", "tickWidth", "getTrackWidth", "setTrackWidth", "trackWidth", "E2", "getNeedleWidth", "setNeedleWidth", "needleWidth", "e", "getTickColor", "setTickColor", "tickColor", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "getMajorTickColor", "setMajorTickColor", "majorTickColor", "N", "getNeedleColor", "setNeedleColor", "needleColor", "v", "getPendingSnap", "setPendingSnap", "(Z)V", "pendingSnap", "Xw", "getLastSentPos", "setLastSentPos", "lastSentPos", "jB", "getHasSentPost", "setHasSentPost", "hasSentPost", "U", "_flingSettling", "P5", "getTouchSlop", "touchSlop", "M7", "getAdjTouchSlop", "adjTouchSlop", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "dx", "p5", "Lkotlin/jvm/functions/Function1;", "getOnSpin", "()Lkotlin/jvm/functions/Function1;", "setOnSpin", "(Lkotlin/jvm/functions/Function1;)V", "onSpin", "eF", "getOnSpinAbs", "setOnSpinAbs", "onSpinAbs", "E", "getTrackingTouch", "setTrackingTouch", "trackingTouch", "Lkotlin/Function0;", "M", "Lkotlin/jvm/functions/Function0;", "getOnStartTrackingTouch", "()Lkotlin/jvm/functions/Function0;", "setOnStartTrackingTouch", "(Lkotlin/jvm/functions/Function0;)V", "onStartTrackingTouch", "FX", "getOnStopTrackingTouch", "setOnStopTrackingTouch", "onStopTrackingTouch", "<set-?>", "B", "Lkotlin/properties/ReadWriteProperty;", "getShowZeroLine", "setShowZeroLine", "showZeroLine", "J", "getMinValue", "setMinValue", "minValue", "D", "getMaxValue", "setMaxValue", "maxValue", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "getLimitRange", "setLimitRange", "limitRange", "", "Ljava/util/List;", "getBrightMarks", "()Ljava/util/List;", "setBrightMarks", "(Ljava/util/List;)V", "brightMarks", "GR", "getMajorTickInterval", "setMajorTickInterval", "majorTickInterval", "Lcom/alightcreative/widget/ValueSpinner$n;", "Nxk", "Lcom/alightcreative/widget/ValueSpinner$n;", "orientation", "k", "getSnapTicks", "setSnapTicks", "snapTicks", "dR0", "getSnapTickColor", "setSnapTickColor", "snapTickColor", "z", "getSnapTickWidth", "()F", "setSnapTickWidth", "(F)V", "snapTickWidth", "Landroid/widget/OverScroller;", "piY", "Landroid/widget/OverScroller;", "scroller", "com/alightcreative/widget/eZk", "ijL", "Lcom/alightcreative/widget/eZk;", "gestureListener", "Landroid/view/GestureDetector;", "m", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/graphics/Paint;", "eTf", "Landroid/graphics/Paint;", "paint", "xg", "initialX", "pJg", "initialY", "ofS", "inGesture", "C", "inTouch", "Mx", "ignoringGesture", "getAbsPos", "setAbsPos", "absPos", "getFlingSettling", "setFlingSettling", "flingSettling", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nValueSpinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueSpinner.kt\ncom/alightcreative/widget/ValueSpinner\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,582:1\n33#2,3:583\n33#2,3:586\n33#2,3:589\n33#2,3:593\n33#2,3:596\n33#2,3:599\n33#2,3:602\n1#3:592\n*S KotlinDebug\n*F\n+ 1 ValueSpinner.kt\ncom/alightcreative/widget/ValueSpinner\n*L\n105#1:583,3\n113#1:586,3\n115#1:589,3\n113#1:593,3\n115#1:596,3\n113#1:599,3\n115#1:602,3\n*E\n"})
public final class ValueSpinner extends View {

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f47318G7 = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ValueSpinner.class, "showZeroLine", "getShowZeroLine()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ValueSpinner.class, "snapTicks", "getSnapTicks()Ljava/util/List;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ValueSpinner.class, "snapTickWidth", "getSnapTickWidth()F", 0))};
    public static final int fcU = 8;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty showZeroLine;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean inTouch;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int maxValue;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean trackingTouch;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private int needleWidth;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private Function0 onStopTrackingTouch;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private int majorTickInterval;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private List brightMarks;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private int minValue;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private j curve;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private Function0 onStartTrackingTouch;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final int adjTouchSlop;

    /* JADX INFO: renamed from: Mx, reason: from kotlin metadata */
    private boolean ignoringGesture;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private int needleColor;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private n orientation;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private float scrollY;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final int touchSlop;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int tickWidth;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private int majorTickColor;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean _flingSettling;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private int lastSentPos;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean limitRange;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private int snapTickColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int tickColor;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private Function1 onSpinAbs;

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int trackWidth;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private final eZk gestureListener;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean hasSentPost;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty snapTicks;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final GestureDetector gestureDetector;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float BASE_SCROLL;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int tickSpacing;

    /* JADX INFO: renamed from: ofS, reason: from kotlin metadata */
    private boolean inGesture;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private Function1 onSpin;

    /* JADX INFO: renamed from: pJg, reason: from kotlin metadata */
    private float initialY;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private final OverScroller scroller;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float curveBias;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float scrollX;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean pendingSnap;

    /* JADX INFO: renamed from: xg, reason: from kotlin metadata */
    private float initialX;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty snapTickWidth;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static final class I28 extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ValueSpinner f47344n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Object obj, ValueSpinner valueSpinner) {
            super(obj);
            this.f47344n = valueSpinner;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).floatValue();
            ((Number) obj).floatValue();
            this.f47344n.invalidate();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static final class Ml extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ValueSpinner f47345n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Object obj, ValueSpinner valueSpinner) {
            super(obj);
            this.f47345n = valueSpinner;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f47345n.invalidate();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    private static final class j {
        private static final /* synthetic */ j[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f47348r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f47347n = new j("NONE", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f47349t = new j("LEFT", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f47346O = new j("RIGHT", 2);

        private static final /* synthetic */ j[] n() {
            return new j[]{f47347n, f47349t, f47346O};
        }

        static {
            j[] jVarArrN = n();
            J2 = jVarArrN;
            f47348r = EnumEntriesKt.enumEntries(jVarArrN);
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) J2.clone();
        }

        private j(String str, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    static final class n {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ n[] f47350O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f47351n = new n("HORIZONTAL", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f47352t = new n("VERTICAL", 1);

        private static final /* synthetic */ n[] n() {
            return new n[]{f47351n, f47352t};
        }

        static {
            n[] nVarArrN = n();
            f47350O = nVarArrN;
            J2 = EnumEntriesKt.enumEntries(nVarArrN);
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f47350O.clone();
        }

        private n(String str, int i2) {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static final class w6 extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ValueSpinner f47353n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Object obj, ValueSpinner valueSpinner) {
            super(obj);
            this.f47353n = valueSpinner;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Boolean) obj2).getClass();
            ((Boolean) obj).getClass();
            this.f47353n.invalidate();
        }
    }

    public final void setAbsPos(float f3) {
        this.hasSentPost = false;
        this.scrollX = f3;
        this.scrollY = f3;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.curve = j.f47347n;
        this.tickSpacing = 10;
        this.tickWidth = 1;
        this.needleWidth = 2;
        this.tickColor = -1;
        this.majorTickColor = -1;
        this.needleColor = -1;
        this.pendingSnap = true;
        int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.touchSlop = scaledTouchSlop;
        this.adjTouchSlop = (scaledTouchSlop * 3) / 4;
        this.onSpin = new Function1() { // from class: com.alightcreative.widget.S
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ValueSpinner.XQ(((Float) obj).floatValue());
            }
        };
        this.onSpinAbs = new Function1() { // from class: com.alightcreative.widget.V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ValueSpinner.S(((Integer) obj).intValue());
            }
        };
        this.onStartTrackingTouch = new Function0() { // from class: com.alightcreative.widget.Qik
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ValueSpinner.WPU();
            }
        };
        this.onStopTrackingTouch = new Function0() { // from class: com.alightcreative.widget.z3w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ValueSpinner.aYN();
            }
        };
        Delegates delegates = Delegates.INSTANCE;
        this.showZeroLine = new w6(Boolean.FALSE, this);
        this.brightMarks = CollectionsKt.emptyList();
        this.majorTickInterval = 5;
        this.orientation = n.f47351n;
        this.snapTicks = new Ml(CollectionsKt.emptyList(), this);
        this.snapTickColor = -1;
        this.snapTickWidth = new I28(Float.valueOf(1.25f), this);
        this.scroller = new OverScroller(getContext());
        eZk ezk = new eZk(this);
        this.gestureListener = ezk;
        GestureDetector gestureDetector = new GestureDetector(getContext(), ezk);
        gestureDetector.setIsLongpressEnabled(false);
        this.gestureDetector = gestureDetector;
        this.paint = new Paint(1);
        o(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(int i2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ViF(ValueSpinner valueSpinner, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, valueSpinner)) {
            return false;
        }
        ValueSpinner valueSpinner2 = it instanceof ValueSpinner ? (ValueSpinner) it : null;
        return valueSpinner2 != null && valueSpinner2.get_flingSettling();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XQ(float f3) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z() {
        if (!this.limitRange) {
            return false;
        }
        float f3 = this.BASE_SCROLL;
        int i2 = this.minValue;
        int i3 = this.tickSpacing;
        float f4 = (i2 * i3) + f3;
        float f5 = f3 + (this.maxValue * i3);
        this.scrollX = RangesKt.coerceIn(this.scrollX, f4, f5);
        float fCoerceIn = RangesKt.coerceIn(this.scrollY, f4, f5);
        this.scrollY = fCoerceIn;
        if (this.orientation != n.f47351n) {
            return fCoerceIn <= f4 || fCoerceIn >= f5;
        }
        float f6 = this.scrollX;
        return f6 <= f4 || f6 >= f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aYN() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fD() {
        return "updateScroll: LIMIT";
    }

    private final void g() {
        if (!this.scroller.computeScrollOffset()) {
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.VoU
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ValueSpinner.iF();
                }
            });
            if (this.trackingTouch && get_flingSettling()) {
                this.trackingTouch = false;
                setFlingSettling(false);
                this.onStopTrackingTouch.invoke();
            }
            if (this.pendingSnap) {
                this.pendingSnap = false;
                float f3 = this.scrollX;
                int i2 = this.tickSpacing;
                this.scrollX = f3 + (-(((i2 / 2) + f3) % i2));
                float f4 = this.scrollY;
                this.scrollY = f4 + (-(((i2 / 2) + f4) % i2));
                Z();
                return;
            }
            return;
        }
        this.scrollX = this.scroller.getCurrX();
        this.scrollY = this.scroller.getCurrY();
        if (!Z()) {
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.HcS
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ValueSpinner.te();
                }
            });
            postInvalidateOnAnimation();
            return;
        }
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.Mo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ValueSpinner.fD();
            }
        });
        this.scroller.forceFinished(true);
        if (this.trackingTouch && get_flingSettling()) {
            this.trackingTouch = false;
            setFlingSettling(false);
            this.onStopTrackingTouch.invoke();
        }
        this.trackingTouch = false;
        setFlingSettling(false);
        this.pendingSnap = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String iF() {
        return "updateScroll: NO-COMPUTE";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mUb(ValueSpinner valueSpinner, WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, dpcnwfoVOnrtRA.HrlvTUnIDhXFy);
        return Intrinsics.areEqual(weakReference.get(), valueSpinner) || weakReference.get() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFlingSettling(boolean z2) {
        boolean z3 = this._flingSettling;
        if (z3 && !z2) {
            CollectionsKt.removeAll(D.f47049n, new Function1() { // from class: com.alightcreative.widget.OA
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ValueSpinner.mUb(this.f47172n, (WeakReference) obj));
                }
            });
        } else if (!z3 && z2) {
            D.f47049n.add(new WeakReference(this));
        }
        this._flingSettling = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String te() {
        return "updateScroll: CONTINUE";
    }

    public final float getAbsPos() {
        return this.orientation == n.f47351n ? this.scrollX : this.scrollY;
    }

    public final int getAdjTouchSlop() {
        return this.adjTouchSlop;
    }

    public final List<Integer> getBrightMarks() {
        return this.brightMarks;
    }

    /* JADX INFO: renamed from: getFlingSettling, reason: from getter */
    public final boolean get_flingSettling() {
        return this._flingSettling;
    }

    public final boolean getHasSentPost() {
        return this.hasSentPost;
    }

    public final int getLastSentPos() {
        return this.lastSentPos;
    }

    public final boolean getLimitRange() {
        return this.limitRange;
    }

    public final int getMajorTickColor() {
        return this.majorTickColor;
    }

    public final int getMajorTickInterval() {
        return this.majorTickInterval;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final int getNeedleColor() {
        return this.needleColor;
    }

    public final int getNeedleWidth() {
        return this.needleWidth;
    }

    public final Function1<Float, Unit> getOnSpin() {
        return this.onSpin;
    }

    public final Function1<Integer, Unit> getOnSpinAbs() {
        return this.onSpinAbs;
    }

    public final Function0<Unit> getOnStartTrackingTouch() {
        return this.onStartTrackingTouch;
    }

    public final Function0<Unit> getOnStopTrackingTouch() {
        return this.onStopTrackingTouch;
    }

    public final boolean getPendingSnap() {
        return this.pendingSnap;
    }

    public final boolean getShowZeroLine() {
        return ((Boolean) this.showZeroLine.getValue(this, f47318G7[0])).booleanValue();
    }

    public final int getSnapTickColor() {
        return this.snapTickColor;
    }

    public final float getSnapTickWidth() {
        return ((Number) this.snapTickWidth.getValue(this, f47318G7[2])).floatValue();
    }

    public final List<Integer> getSnapTicks() {
        return (List) this.snapTicks.getValue(this, f47318G7[1]);
    }

    public final int getTickColor() {
        return this.tickColor;
    }

    public final int getTickSpacing() {
        return this.tickSpacing;
    }

    public final int getTickWidth() {
        return this.tickWidth;
    }

    public final int getTouchSlop() {
        return this.touchSlop;
    }

    public final int getTrackWidth() {
        return this.trackWidth;
    }

    public final boolean getTrackingTouch() {
        return this.trackingTouch;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0486  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(Canvas canvas) {
        float f3;
        float f4;
        float f5;
        int i2;
        int i3;
        float f6;
        float f7;
        int i5;
        int i7;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        g();
        int i8 = -1;
        int i9 = 0;
        int i10 = -5;
        float f8 = 1.0f;
        int i11 = 255;
        if (this.orientation == n.f47351n) {
            int width = getWidth() / this.tickSpacing;
            float f9 = -((this.scrollX + (r3 / 2)) % (r3 * 5));
            int width2 = getWidth() / 2;
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeCap(Paint.Cap.ROUND);
            int i12 = width + 5;
            if (-5 <= i12) {
                while (true) {
                    float f10 = (i10 * r5) + f9;
                    int iRoundToInt = (MathKt.roundToInt(((this.scrollX - this.BASE_SCROLL) + f9) / this.tickSpacing) + i10) - (width / 2);
                    this.paint.setStrokeWidth(this.tickWidth);
                    this.paint.setColor(iRoundToInt % this.majorTickInterval == 0 ? this.majorTickColor : this.tickColor);
                    float f11 = width2;
                    int iAbs = (int) ((f8 - (Math.abs(f10 - f11) / f11)) * 255.0f);
                    Paint paint = this.paint;
                    paint.setAlpha(RangesKt.coerceIn((iAbs * paint.getAlpha()) / 255, 0, 255));
                    if (getSnapTicks().contains(Integer.valueOf(iRoundToInt))) {
                        int alpha = this.paint.getAlpha();
                        f7 = f8;
                        this.paint.setColor(this.snapTickColor);
                        this.paint.setAlpha((alpha + 255) / 2);
                        this.paint.setStrokeWidth(getSnapTickWidth());
                    } else {
                        f7 = f8;
                        if ((getShowZeroLine() && iRoundToInt == 0) || this.brightMarks.contains(Integer.valueOf(iRoundToInt))) {
                            int alpha2 = this.paint.getAlpha();
                            this.paint.setColor(-1);
                            this.paint.setAlpha((alpha2 + 255) / 2);
                            this.paint.setStrokeWidth(this.needleWidth);
                        }
                    }
                    if (this.limitRange) {
                        int i13 = this.minValue;
                        if (iRoundToInt > this.maxValue || i13 > iRoundToInt) {
                            i5 = i12;
                            i7 = i10;
                        } else {
                            i5 = i12;
                            i7 = i10;
                            canvas2.drawLine(f10, getPaddingTop(), f10, getHeight() - getPaddingBottom(), this.paint);
                        }
                        if (i7 == i5) {
                            break;
                        }
                        i10 = i7 + 1;
                        canvas2 = canvas;
                        i12 = i5;
                        f8 = f7;
                    }
                }
            }
            float f12 = this.scrollX;
            float f13 = (-((f12 + (r3 / 2)) % this.tickSpacing)) + ((width / 2) * r3);
            this.paint.setColor(this.needleColor);
            this.paint.setStrokeWidth(this.needleWidth);
            canvas.drawLine(f13, 0.0f, f13, getHeight(), this.paint);
            int iRoundToInt2 = MathKt.roundToInt((this.scrollX - this.BASE_SCROLL) / this.tickSpacing);
            if (!this.hasSentPost) {
                this.lastSentPos = iRoundToInt2;
                this.hasSentPost = true;
                return;
            }
            if (this.lastSentPos != iRoundToInt2) {
                this.onSpin.invoke(Float.valueOf(iRoundToInt2 - r2));
                this.onSpinAbs.invoke(Integer.valueOf(iRoundToInt2));
                this.lastSentPos = iRoundToInt2;
                if (getSnapTicks().contains(Integer.valueOf(iRoundToInt2))) {
                    LEl.rl(this).n();
                    return;
                }
                return;
            }
            return;
        }
        float f14 = 1.0f;
        if (this.curve == j.f47347n) {
            int height = getHeight() / this.tickSpacing;
            float f15 = -((this.scrollY + (r2 / 2)) % (r2 * 5));
            int height2 = getHeight() / 2;
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeCap(Paint.Cap.ROUND);
            int i14 = height + 5;
            if (-5 <= i14) {
                int i15 = -5;
                while (true) {
                    float f16 = f15 + (i15 * r2);
                    int iRoundToInt3 = (MathKt.roundToInt(((this.scrollY - this.BASE_SCROLL) + f15) / this.tickSpacing) + i15) - (height / 2);
                    this.paint.setStrokeWidth(this.tickWidth);
                    this.paint.setColor(iRoundToInt3 % this.majorTickInterval == 0 ? this.majorTickColor : this.tickColor);
                    float f17 = height2;
                    int iAbs2 = (int) ((1.0f - (Math.abs(f16 - f17) / f17)) * 255.0f);
                    Paint paint2 = this.paint;
                    paint2.setAlpha(RangesKt.coerceIn((paint2.getAlpha() * iAbs2) / 255, 0, 255));
                    if ((getShowZeroLine() && iRoundToInt3 == 0) || this.brightMarks.contains(Integer.valueOf(iRoundToInt3))) {
                        int alpha3 = this.paint.getAlpha();
                        this.paint.setColor(-1);
                        this.paint.setAlpha((alpha3 + 255) / 2);
                        this.paint.setStrokeWidth(this.needleWidth);
                    }
                    if (this.limitRange) {
                        int i16 = this.minValue;
                        if (iRoundToInt3 <= this.maxValue && i16 <= iRoundToInt3) {
                            canvas.drawLine(getPaddingStart(), f16, getWidth() - getPaddingEnd(), f16, this.paint);
                        }
                        if (i15 == i14) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
            float f18 = this.scrollY;
            float f19 = (-((f18 + (r3 / 2)) % this.tickSpacing)) + ((height / 2) * r3);
            this.paint.setColor(this.needleColor);
            this.paint.setStrokeWidth(this.needleWidth);
            canvas.drawLine(0.0f, f19, getWidth(), f19, this.paint);
            int iRoundToInt4 = MathKt.roundToInt((this.scrollY - this.BASE_SCROLL) / this.tickSpacing);
            if (!this.hasSentPost) {
                this.lastSentPos = iRoundToInt4;
                this.hasSentPost = true;
                return;
            }
            if (this.lastSentPos != iRoundToInt4) {
                this.onSpin.invoke(Float.valueOf(iRoundToInt4 - r2));
                this.onSpinAbs.invoke(Integer.valueOf(iRoundToInt4));
                this.lastSentPos = iRoundToInt4;
                if (getSnapTicks().contains(Integer.valueOf(iRoundToInt4))) {
                    LEl.rl(this).n();
                    return;
                }
                return;
            }
            return;
        }
        float width3 = getWidth() * this.curveBias;
        float f20 = 2.0f;
        float fHypot = (float) Math.hypot(width3, getHeight() / 2.0f);
        float fTan = ((float) Math.tan((getHeight() / 2.0f) / fHypot)) * 2.0f;
        float fTan2 = ((6.28318f * width3) * ((float) Math.tan((getHeight() / 2.0f) / fHypot))) / 3.14159f;
        int i17 = (int) (fTan2 / this.tickSpacing);
        float f21 = fTan / i17;
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        float f22 = this.scrollY;
        int i18 = this.tickSpacing;
        float f23 = -((f22 + (i18 / 2)) % (i18 * 5));
        float f24 = fTan2 / 2.0f;
        float paddingStart = (width3 - (this.trackWidth / 2.0f)) + getPaddingStart();
        float paddingEnd = (width3 + (this.trackWidth / 2.0f)) - getPaddingEnd();
        int i19 = i17 + 5;
        if (-5 <= i19) {
            while (true) {
                f3 = f20;
                float f25 = (i10 * r7) + f23;
                int iRoundToInt5 = (MathKt.roundToInt(((this.scrollY - this.BASE_SCROLL) + f23) / this.tickSpacing) + i10) - (i17 / 2);
                this.paint.setStrokeWidth(this.tickWidth);
                this.paint.setColor(iRoundToInt5 % this.majorTickInterval == 0 ? this.majorTickColor : this.tickColor);
                int iAbs3 = (int) ((f14 - (Math.abs(f25 - f24) / f24)) * 255.0f);
                Paint paint3 = this.paint;
                paint3.setAlpha(RangesKt.coerceIn((iAbs3 * paint3.getAlpha()) / i11, i9, i11));
                if ((getShowZeroLine() && iRoundToInt5 == 0) || this.brightMarks.contains(Integer.valueOf(iRoundToInt5))) {
                    int alpha4 = this.paint.getAlpha();
                    this.paint.setColor(i8);
                    this.paint.setAlpha((alpha4 + i11) / 2);
                    this.paint.setStrokeWidth(this.needleWidth);
                }
                if (this.limitRange) {
                    int i20 = this.minValue;
                    if (iRoundToInt5 > this.maxValue || i20 > iRoundToInt5) {
                        f6 = f23;
                        f5 = paddingStart;
                        i3 = i10;
                        i2 = i19;
                        f4 = 0.0f;
                    } else {
                        Vector2D vector2DRotRadians = GeometryKt.rotRadians(new Vector2D(f14, 0.0f), (((f25 / fTan2) * fTan) + f21) - (fTan / f3));
                        Vector2D vector2DTimes = GeometryKt.times(vector2DRotRadians, paddingStart);
                        Vector2D vector2DTimes2 = GeometryKt.times(vector2DRotRadians, paddingEnd);
                        f5 = paddingStart;
                        i2 = i19;
                        i3 = i10;
                        f4 = 0.0f;
                        f6 = f23;
                        canvas.drawLine(vector2DTimes.getX(), vector2DTimes.getY() + (getHeight() / f3), vector2DTimes2.getX(), vector2DTimes2.getY() + (getHeight() / f3), this.paint);
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i10 = i3 + 1;
                    f23 = f6;
                    paddingStart = f5;
                    i19 = i2;
                    f20 = f3;
                    i8 = -1;
                    i9 = 0;
                    i11 = 255;
                    f14 = 1.0f;
                }
            }
        } else {
            f3 = 2.0f;
            f4 = 0.0f;
            f5 = paddingStart;
        }
        float f26 = this.scrollY;
        int i21 = this.tickSpacing;
        this.paint.setColor(this.needleColor);
        this.paint.setStrokeWidth(this.needleWidth);
        Vector2D vector2DRotRadians2 = GeometryKt.rotRadians(new Vector2D(1.0f, f4), (((((-((f26 + (i21 / 2)) % i21)) + ((i17 / 2) * i21)) / fTan2) * fTan) + f21) - (fTan / f3));
        Vector2D vector2DTimes3 = GeometryKt.times(vector2DRotRadians2, f5 - getPaddingStart());
        Vector2D vector2DTimes4 = GeometryKt.times(vector2DRotRadians2, paddingEnd + getPaddingEnd());
        canvas.drawLine(vector2DTimes3.getX(), (getHeight() / f3) + vector2DTimes3.getY(), vector2DTimes4.getX(), vector2DTimes4.getY() + (getHeight() / f3), this.paint);
        int iRoundToInt6 = MathKt.roundToInt((this.scrollY - this.BASE_SCROLL) / this.tickSpacing);
        if (!this.hasSentPost) {
            this.lastSentPos = iRoundToInt6;
            this.hasSentPost = true;
            return;
        }
        if (this.lastSentPos != iRoundToInt6) {
            this.onSpin.invoke(Float.valueOf(iRoundToInt6 - r2));
            this.onSpinAbs.invoke(Integer.valueOf(iRoundToInt6));
            this.lastSentPos = iRoundToInt6;
            if (getSnapTicks().contains(Integer.valueOf(iRoundToInt6))) {
                LEl.rl(this).n();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled()) {
            return false;
        }
        if (this.ignoringGesture) {
            int actionMasked = event.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                this.ignoringGesture = false;
            }
            return true;
        }
        int actionMasked2 = event.getActionMasked();
        if (actionMasked2 != 0) {
            if (actionMasked2 == 1) {
                this.inGesture = false;
                this.inTouch = false;
            } else if (actionMasked2 != 2) {
                if (actionMasked2 == 3) {
                }
            } else if (this.inTouch && !this.inGesture) {
                float fAbs = Math.abs(event.getRawX() - this.initialX);
                float fAbs2 = Math.abs(event.getRawY() - this.initialY);
                n nVar = this.orientation;
                if (nVar == n.f47351n && fAbs > this.adjTouchSlop) {
                    this.inGesture = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (nVar == n.f47352t && fAbs2 > this.adjTouchSlop) {
                    this.inGesture = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
        } else {
            if (HI0.o7q.rl(HI0.o7q.Uo(this), new Function1() { // from class: com.alightcreative.widget.AZy
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ValueSpinner.ViF(this.f46953n, (View) obj));
                }
            })) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.ignoringGesture = true;
                return true;
            }
            this.initialX = event.getRawX();
            this.initialY = event.getRawY();
            this.inGesture = false;
            this.inTouch = true;
            if (get_flingSettling()) {
                this.inGesture = true;
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        if (this.gestureDetector.onTouchEvent(event)) {
            return true;
        }
        int actionMasked3 = event.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 3) {
            if (this.trackingTouch && !get_flingSettling()) {
                this.trackingTouch = false;
                this.onStopTrackingTouch.invoke();
            }
            if (!this.pendingSnap) {
                this.pendingSnap = true;
                invalidate();
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setBrightMarks(List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.brightMarks = list;
    }

    public final void setHasSentPost(boolean z2) {
        this.hasSentPost = z2;
    }

    public final void setLastSentPos(int i2) {
        this.lastSentPos = i2;
    }

    public final void setLimitRange(boolean z2) {
        this.limitRange = z2;
    }

    public final void setMajorTickColor(int i2) {
        this.majorTickColor = i2;
    }

    public final void setMajorTickInterval(int i2) {
        this.majorTickInterval = i2;
    }

    public final void setMaxValue(int i2) {
        this.maxValue = i2;
    }

    public final void setMinValue(int i2) {
        this.minValue = i2;
    }

    public final void setNeedleColor(int i2) {
        this.needleColor = i2;
    }

    public final void setNeedleWidth(int i2) {
        this.needleWidth = i2;
    }

    public final void setOnSpin(Function1<? super Float, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onSpin = function1;
    }

    public final void setOnSpinAbs(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onSpinAbs = function1;
    }

    public final void setOnStartTrackingTouch(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onStartTrackingTouch = function0;
    }

    public final void setOnStopTrackingTouch(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onStopTrackingTouch = function0;
    }

    public final void setPendingSnap(boolean z2) {
        this.pendingSnap = z2;
    }

    public final void setShowZeroLine(boolean z2) {
        this.showZeroLine.setValue(this, f47318G7[0], Boolean.valueOf(z2));
    }

    public final void setSnapTickColor(int i2) {
        this.snapTickColor = i2;
    }

    public final void setSnapTickWidth(float f3) {
        this.snapTickWidth.setValue(this, f47318G7[2], Float.valueOf(f3));
    }

    public final void setSnapTicks(List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.snapTicks.setValue(this, f47318G7[1], list);
    }

    public final void setTickColor(int i2) {
        this.tickColor = i2;
    }

    public final void setTickSpacing(int i2) {
        this.tickSpacing = i2;
    }

    public final void setTickWidth(int i2) {
        this.tickWidth = i2;
    }

    public final void setTrackWidth(int i2) {
        this.trackWidth = i2;
    }

    public final void setTrackingTouch(boolean z2) {
        this.trackingTouch = z2;
    }

    public final void setValue(int value) {
        this.scroller.forceFinished(true);
        setFlingSettling(false);
        if (getAbsPos() == this.BASE_SCROLL + (this.tickSpacing * value)) {
            return;
        }
        setAbsPos(this.BASE_SCROLL + (value * this.tickSpacing));
    }

    private final void o(Context context, AttributeSet attributeSet) {
        n nVar;
        j jVar;
        int height;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, IvA.eO.f4318O, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.tickSpacing = typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, this.tickSpacing);
            this.tickWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, this.tickWidth);
            this.trackWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, this.trackWidth);
            this.needleWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, this.needleWidth);
            this.tickColor = typedArrayObtainStyledAttributes.getColor(7, this.tickColor);
            this.majorTickColor = typedArrayObtainStyledAttributes.getColor(1, this.majorTickColor);
            this.snapTickColor = typedArrayObtainStyledAttributes.getColor(4, this.snapTickColor);
            this.needleColor = typedArrayObtainStyledAttributes.getColor(2, this.needleColor);
            this.curveBias = typedArrayObtainStyledAttributes.getFloat(0, this.curveBias);
            int i2 = typedArrayObtainStyledAttributes.getInt(6, 0);
            if (i2 != 0) {
                if (i2 == 1) {
                    nVar = n.f47352t;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                nVar = n.f47351n;
            }
            this.orientation = nVar;
            int i3 = typedArrayObtainStyledAttributes.getInt(5, 0);
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        jVar = j.f47346O;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    jVar = j.f47349t;
                }
            } else {
                jVar = j.f47347n;
            }
            this.curve = jVar;
            typedArrayObtainStyledAttributes.recycle();
            if (this.orientation == n.f47351n) {
                height = getWidth();
            } else {
                height = getHeight();
            }
            float f3 = ((((height / this.tickSpacing) + 1) / 2) + 5001.0f) * this.tickSpacing;
            this.BASE_SCROLL = f3;
            this.scrollX = f3;
            this.scrollY = f3;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean nY() {
        if (!get_flingSettling() && !this.trackingTouch) {
            return false;
        }
        this.scroller.forceFinished(true);
        setFlingSettling(false);
        this.trackingTouch = false;
        this.onStopTrackingTouch.invoke();
        postInvalidateOnAnimation();
        return true;
    }
}
