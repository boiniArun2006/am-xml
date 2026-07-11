package com.alightcreative.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.SeekBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.internal.ProgressionUtilKt;
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
import kotlin.text.StringsKt;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0002¡\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010 \u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010$J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010$J\u0017\u0010(\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010$R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010)R\u0016\u0010,\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010)R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010)R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010)R\u0016\u00105\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010)R\u0016\u00107\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010)R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010)R+\u0010D\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\u001eR+\u0010H\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010@\u001a\u0004\bF\u0010B\"\u0004\bG\u0010\u001eR+\u0010K\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010\u001eR+\u0010R\u001a\u00020L2\u0006\u0010>\u001a\u00020L8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010@\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR7\u0010Y\u001a\b\u0012\u0004\u0012\u00020\b0S2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0S8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010@\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR7\u0010]\u001a\b\u0012\u0004\u0012\u00020\b0S2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0S8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010@\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR+\u0010a\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010@\u001a\u0004\b_\u0010B\"\u0004\b`\u0010\u001eR+\u0010e\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010@\u001a\u0004\bc\u0010B\"\u0004\bd\u0010\u001eR+\u0010i\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010@\u001a\u0004\bg\u0010B\"\u0004\bh\u0010\u001eR$\u0010q\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR*\u0010y\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR*\u0010}\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010t\u001a\u0004\b{\u0010v\"\u0004\b|\u0010xRG\u0010\u0087\u0001\u001a \u0012\u0014\u0012\u00120\b¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\r\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u0010\u008e\u0001\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010BR\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0095\u0001\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010\u0094\u0001R\u0018\u0010\u0098\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010)R\u0018\u0010\u009a\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010)R\u0019\u0010\u009c\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0089\u0001R\u0017\u0010\u009e\u0001\u001a\u00020\b8Â\u0002X\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010BR\u0017\u0010 \u0001\u001a\u00020\b8Â\u0002X\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010B¨\u0006¢\u0001"}, d2 = {"Lcom/alightcreative/widget/AlightSlider;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "w", CmcdData.STREAMING_FORMAT_HLS, "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", a.f62811a, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "xMQ", "()V", "mUb", "newValue", "gh", "(I)V", "defStyle", "qie", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "v", "Ik", "(I)I", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "J2", "ty", "ck", "I", "trackForeground", "t", "trackBackground", "O", "thumbColor", "tickColor", "r", "tickWidth", "o", "trackWidth", "S", "thumbSize", "g", "snapMargin", "Lcom/alightcreative/widget/AlightSlider$j;", "E2", "Lcom/alightcreative/widget/AlightSlider$j;", "orientation", "e", "disableTrackForeground", "<set-?>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/properties/ReadWriteProperty;", "getMinValue", "()I", "setMinValue", "minValue", "N", "getMaxValue", "setMaxValue", "maxValue", "getValue", "setValue", "value", "", "Xw", "getLogScale", "()F", "setLogScale", "(F)V", "logScale", "", "jB", "getSnapValues", "()Ljava/util/List;", "setSnapValues", "(Ljava/util/List;)V", "snapValues", "U", "getTickMarkValues", "setTickMarkValues", "tickMarkValues", "P5", "getStepSize", "setStepSize", "stepSize", "M7", "getTickSpacing", "setTickSpacing", "tickSpacing", "p5", "getOriginValue", "setOriginValue", "originValue", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "eF", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "getOnSeekBarChangeListener", "()Landroid/widget/SeekBar$OnSeekBarChangeListener;", "setOnSeekBarChangeListener", "(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V", "onSeekBarChangeListener", "Lkotlin/Function0;", "E", "Lkotlin/jvm/functions/Function0;", "getOnStartTrackingTouch", "()Lkotlin/jvm/functions/Function0;", "setOnStartTrackingTouch", "(Lkotlin/jvm/functions/Function0;)V", "onStartTrackingTouch", "M", "getOnStopTrackingTouch", "setOnStopTrackingTouch", "onStopTrackingTouch", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "FX", "Lkotlin/jvm/functions/Function1;", "getOnValueChangeFromUser", "()Lkotlin/jvm/functions/Function1;", "setOnValueChangeFromUser", "(Lkotlin/jvm/functions/Function1;)V", "onValueChangeFromUser", "B", "Z", "trackingTouch", "J", "Lkotlin/Lazy;", "getTouchSlop", "touchSlop", "Landroid/graphics/Paint;", "D", "Landroid/graphics/Paint;", "paint", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "F", "startX", "startY", "GR", "touchWidth", "Nxk", "touchHeight", "k", "inGesture", "getLongAxis", "longAxis", "getUsablePixelSize", "usablePixelSize", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlightSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlightSlider.kt\ncom/alightcreative/widget/AlightSlider\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n127#1,4:392\n132#1:396\n127#1,4:397\n132#1:414\n127#1,4:415\n132#1:419\n127#1,4:420\n33#2,3:277\n33#2,3:280\n33#2,3:283\n33#2,3:286\n33#2,3:289\n33#2,3:292\n33#2,3:295\n33#2,3:298\n33#2,3:301\n33#2,3:304\n33#2,3:307\n33#2,3:310\n33#2,3:313\n33#2,3:316\n33#2,3:319\n33#2,3:322\n33#2,3:325\n33#2,3:328\n33#2,3:331\n33#2,3:334\n33#2,3:337\n33#2,3:340\n33#2,3:343\n33#2,3:346\n33#2,3:349\n1557#3:352\n1628#3,3:353\n774#3:356\n865#3,2:357\n1611#3,9:359\n1863#3:368\n1864#3:370\n1620#3:371\n1557#3:372\n1628#3,3:373\n774#3:376\n865#3,2:377\n1611#3,9:379\n1863#3:388\n1864#3:390\n1620#3:391\n1782#3,4:401\n1755#3,3:405\n295#3,2:408\n1782#3,4:410\n1#4:369\n1#4:389\n*S KotlinDebug\n*F\n+ 1 AlightSlider.kt\ncom/alightcreative/widget/AlightSlider\n*L\n132#1:392,4\n136#1:396\n136#1:397,4\n153#1:414\n153#1:415,4\n156#1:419\n156#1:420,4\n36#1:277,3\n37#1:280,3\n38#1:283,3\n39#1:286,3\n43#1:289,3\n44#1:292,3\n45#1:295,3\n46#1:298,3\n47#1:301,3\n37#1:304,3\n38#1:307,3\n39#1:310,3\n43#1:313,3\n44#1:316,3\n45#1:319,3\n46#1:322,3\n47#1:325,3\n37#1:328,3\n38#1:331,3\n39#1:334,3\n43#1:337,3\n44#1:340,3\n45#1:343,3\n46#1:346,3\n47#1:349,3\n120#1:352\n120#1:353,3\n120#1:356\n120#1:357,2\n120#1:359,9\n120#1:368\n120#1:370\n120#1:371\n121#1:372\n121#1:373,3\n121#1:376\n121#1:377,2\n121#1:379,9\n121#1:388\n121#1:390\n121#1:391\n136#1:401,4\n136#1:405,3\n147#1:408,2\n152#1:410,4\n120#1:369\n121#1:389\n*E\n"})
public final class AlightSlider extends View {
    static final /* synthetic */ KProperty[] dR0 = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AlightSlider.class, aNrWBQYwFf.mhdgOIoFX, "getMinValue()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AlightSlider.class, "maxValue", "getMaxValue()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AlightSlider.class, "value", "getValue()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AlightSlider.class, "logScale", "getLogScale()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AlightSlider.class, "snapValues", "getSnapValues()Ljava/util/List;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AlightSlider.class, "tickMarkValues", "getTickMarkValues()Ljava/util/List;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AlightSlider.class, "stepSize", "getStepSize()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AlightSlider.class, "tickSpacing", "getTickSpacing()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AlightSlider.class, "originValue", "getOriginValue()I", 0))};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f46954z = 8;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean trackingTouch;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Function0 onStartTrackingTouch;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private j orientation;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private Function1 onValueChangeFromUser;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private int touchWidth;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private float startY;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final Lazy touchSlop;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int tickColor;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private Function0 onStopTrackingTouch;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final ReadWriteProperty tickSpacing;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty maxValue;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private int touchHeight;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int thumbColor;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final ReadWriteProperty stepSize;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int thumbSize;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty minValue;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty tickMarkValues;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final ReadWriteProperty logScale;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float startX;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int disableTrackForeground;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private SeekBar.OnSeekBarChangeListener onSeekBarChangeListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int snapMargin;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final ReadWriteProperty snapValues;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean inGesture;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int trackForeground;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int trackWidth;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final ReadWriteProperty originValue;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int tickWidth;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int trackBackground;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty value;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class C extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AlightSlider f46977n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(Object obj, AlightSlider alightSlider) {
            super(obj);
            this.f46977n = alightSlider;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).intValue();
            ((Number) obj).intValue();
            this.f46977n.invalidate();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class CN3 extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AlightSlider f46978n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CN3(Object obj, AlightSlider alightSlider) {
            super(obj);
            this.f46978n = alightSlider;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f46978n.invalidate();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class Dsr extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AlightSlider f46979n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dsr(Object obj, AlightSlider alightSlider) {
            super(obj);
            this.f46979n = alightSlider;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).intValue();
            ((Number) obj).intValue();
            this.f46979n.invalidate();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class I28 extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AlightSlider f46980n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Object obj, AlightSlider alightSlider) {
            super(obj);
            this.f46980n = alightSlider;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).intValue();
            ((Number) obj).intValue();
            this.f46980n.invalidate();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class Ml extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AlightSlider f46981n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Object obj, AlightSlider alightSlider) {
            super(obj);
            this.f46981n = alightSlider;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).intValue();
            ((Number) obj).intValue();
            this.f46981n.invalidate();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class Wre extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AlightSlider f46982n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Object obj, AlightSlider alightSlider) {
            super(obj);
            this.f46982n = alightSlider;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            float fFloatValue = ((Number) obj2).floatValue();
            ((Number) obj).floatValue();
            if (fFloatValue == 0.0f) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this.f46982n.invalidate();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class aC extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AlightSlider f46983n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public aC(Object obj, AlightSlider alightSlider) {
            super(obj);
            this.f46983n = alightSlider;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).intValue();
            ((Number) obj).intValue();
            this.f46983n.invalidate();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class fuX extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AlightSlider f46984n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public fuX(Object obj, AlightSlider alightSlider) {
            super(obj);
            this.f46984n = alightSlider;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f46984n.invalidate();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static final class j {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ j[] f46985O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f46986n = new j("HORIZONTAL", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f46987t = new j("VERTICAL", 1);

        private static final /* synthetic */ j[] n() {
            return new j[]{f46986n, f46987t};
        }

        static {
            j[] jVarArrN = n();
            f46985O = jVarArrN;
            J2 = EnumEntriesKt.enumEntries(jVarArrN);
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f46985O.clone();
        }

        private j(String str, int i2) {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.f46986n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.f46987t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class w6 extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AlightSlider f46988n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Object obj, AlightSlider alightSlider) {
            super(obj);
            this.f46988n = alightSlider;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).intValue();
            ((Number) obj).intValue();
            this.f46988n.invalidate();
        }
    }

    private final void qie(Context context, AttributeSet attributeSet, int defStyle) {
        j jVar;
        List<Integer> listEmptyList;
        List<Integer> listEmptyList2;
        List listSplit$default;
        List listSplit$default2;
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, IvA.eO.f4319n, defStyle, 2132082691);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.trackForeground = typedArrayObtainStyledAttributes.getColor(14, this.trackForeground);
            this.trackBackground = typedArrayObtainStyledAttributes.getColor(13, this.trackBackground);
            this.thumbColor = typedArrayObtainStyledAttributes.getColor(7, this.thumbColor);
            this.tickColor = typedArrayObtainStyledAttributes.getColor(9, this.tickColor);
            this.tickWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, this.tickWidth);
            setTickSpacing(typedArrayObtainStyledAttributes.getInt(11, getTickSpacing()));
            this.trackWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, this.trackWidth);
            this.thumbSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, this.thumbSize);
            setMinValue(typedArrayObtainStyledAttributes.getInt(1, getMinValue()));
            setMaxValue(typedArrayObtainStyledAttributes.getInt(0, getMaxValue()));
            setValue(typedArrayObtainStyledAttributes.getInt(16, getValue()));
            setStepSize(typedArrayObtainStyledAttributes.getInt(6, getStepSize()));
            setOriginValue(typedArrayObtainStyledAttributes.getInt(2, getOriginValue()));
            this.snapMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, this.snapMargin);
            int i2 = typedArrayObtainStyledAttributes.getInt(3, 0);
            if (i2 == 0) {
                jVar = j.f46986n;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException();
                }
                jVar = j.f46987t;
            }
            this.orientation = jVar;
            String string = typedArrayObtainStyledAttributes.getString(5);
            if (string == null || (listSplit$default2 = StringsKt.split$default((CharSequence) string, new char[]{','}, false, 0, 6, (Object) null)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default2, 10));
                Iterator it = listSplit$default2.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!StringsKt.isBlank((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                listEmptyList = new ArrayList<>();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Integer intOrNull = StringsKt.toIntOrNull((String) it2.next());
                    if (intOrNull != null) {
                        listEmptyList.add(intOrNull);
                    }
                }
            }
            setSnapValues(listEmptyList);
            String string2 = typedArrayObtainStyledAttributes.getString(10);
            if (string2 == null || (listSplit$default = StringsKt.split$default((CharSequence) string2, new char[]{','}, false, 0, 6, (Object) null)) == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                Iterator it3 = listSplit$default.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(StringsKt.trim((CharSequence) it3.next()).toString());
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (!StringsKt.isBlank((String) obj2)) {
                        arrayList4.add(obj2);
                    }
                }
                listEmptyList2 = new ArrayList<>();
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    Integer intOrNull2 = StringsKt.toIntOrNull((String) it4.next());
                    if (intOrNull2 != null) {
                        listEmptyList2.add(intOrNull2);
                    }
                }
            }
            setTickMarkValues(listEmptyList2);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float fIk = Ik(getValue());
        j jVar = this.orientation;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientation");
            jVar = null;
        }
        int i2 = n.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                throw new NotImplementedError(null, 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.trackWidth);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        if (getTickSpacing() > 0) {
            this.paint.setColor(this.trackBackground);
            this.paint.setStrokeWidth(this.tickWidth);
            int minValue = getMinValue();
            int maxValue = getMaxValue();
            int tickSpacing = getTickSpacing();
            if (tickSpacing <= 0) {
                throw new IllegalArgumentException("Step must be positive, was: " + tickSpacing + ".");
            }
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(minValue, maxValue, tickSpacing);
            if (minValue <= progressionLastElement) {
                int i3 = minValue;
                while (true) {
                    float fIk2 = Ik(i3);
                    canvas2.drawLine(fIk2, getHeight() / 8.0f, fIk2, getHeight() / 4.0f, this.paint);
                    canvas.drawLine(fIk2, (getHeight() * 3.0f) / 4.0f, fIk2, (getHeight() * 7.0f) / 8.0f, this.paint);
                    if (i3 == progressionLastElement) {
                        break;
                    }
                    i3 += tickSpacing;
                    canvas2 = canvas;
                }
            }
        }
        if (!getTickMarkValues().isEmpty()) {
            this.paint.setColor(this.trackBackground);
            this.paint.setStrokeWidth(this.tickWidth);
            Iterator<Integer> it = getTickMarkValues().iterator();
            while (it.hasNext()) {
                float fIk3 = Ik(it.next().intValue());
                canvas.drawLine(fIk3, getHeight() / 8.0f, fIk3, getHeight() / 4.0f, this.paint);
                canvas.drawLine(fIk3, (getHeight() * 3.0f) / 4.0f, fIk3, (getHeight() * 7.0f) / 8.0f, this.paint);
            }
        }
        this.paint.setStrokeWidth(this.trackWidth);
        this.paint.setColor(this.trackBackground);
        canvas.drawLine(this.thumbSize / 2.0f, getHeight() / 2.0f, getWidth() - (this.thumbSize / 2.0f), getHeight() / 2.0f, this.paint);
        if (isEnabled()) {
            this.paint.setColor(this.trackForeground);
        } else {
            this.paint.setColor(this.disableTrackForeground);
        }
        canvas.drawLine(Ik(getOriginValue()), getHeight() / 2.0f, fIk, getHeight() / 2.0f, this.paint);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(this.thumbColor);
        canvas.drawCircle(fIk, getHeight() / 2.0f, this.thumbSize / 2.0f, this.paint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlightSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968722);
        Intrinsics.checkNotNullParameter(context, "context");
        this.trackForeground = -1;
        this.trackBackground = -16777216;
        this.thumbColor = -1;
        this.tickColor = -1;
        this.tickWidth = 2;
        this.trackWidth = 8;
        this.thumbSize = 35;
        this.snapMargin = 20;
        this.disableTrackForeground = getResources().getColor(2131100119, null);
        Delegates delegates = Delegates.INSTANCE;
        this.minValue = new w6(0, this);
        this.maxValue = new Ml(100, this);
        this.value = new I28(0, this);
        this.logScale = new Wre(Float.valueOf(1.0f), this);
        this.snapValues = new CN3(CollectionsKt.emptyList(), this);
        this.tickMarkValues = new fuX(CollectionsKt.emptyList(), this);
        this.stepSize = new Dsr(1, this);
        this.tickSpacing = new aC(0, this);
        this.originValue = new C(0, this);
        this.touchSlop = LazyKt.lazy(new Function0() { // from class: com.alightcreative.widget.iwV
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(AlightSlider.HI(this.f47418n));
            }
        });
        this.paint = new Paint(1);
        qie(context, attributeSet, 2130968722);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN(int i2, int i3, int i5, int i7, int i8, AlightSlider alightSlider) {
        int width;
        int i9 = alightSlider.thumbSize;
        int minValue = alightSlider.getMinValue();
        int i10 = alightSlider.thumbSize / 2;
        int maxValue = alightSlider.getMaxValue() - alightSlider.getMinValue();
        j jVar = alightSlider.orientation;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientation");
            jVar = null;
        }
        int i11 = n.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i11 == 1) {
            width = alightSlider.inGesture ? alightSlider.touchWidth : alightSlider.getWidth();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            width = alightSlider.inGesture ? alightSlider.touchHeight : alightSlider.getHeight();
        }
        return "coordToValue(" + i2 + ") = " + i3 + " (csmltp=" + i5 + " rawValue=" + i7 + " unscaleRaw=" + i8 + " thumbSize=" + i9 + " :: " + minValue + " + (" + i2 + "-" + i10 + "-" + i5 + ") * " + maxValue + " / " + ((width - alightSlider.thumbSize) - (alightSlider.getSnapValues().size() * alightSlider.snapMargin));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Uo(int i2, Integer num) {
        return "coordToValue(" + i2 + ") = " + num + " (EXACT)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az(int i2, int i3, int i5, int i7) {
        return "onSizeChanged: w = " + i2 + " -> " + i3 + ";   h = " + i5 + " -> " + i7;
    }

    private final int getLongAxis() {
        j jVar = this.orientation;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientation");
            jVar = null;
        }
        int i2 = n.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i2 == 1) {
            return this.inGesture ? this.touchWidth : getWidth();
        }
        if (i2 == 2) {
            return this.inGesture ? this.touchHeight : getHeight();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int getTouchSlop() {
        return ((Number) this.touchSlop.getValue()).intValue();
    }

    private final int getUsablePixelSize() {
        int width;
        j jVar = this.orientation;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientation");
            jVar = null;
        }
        int i2 = n.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i2 == 1) {
            width = this.inGesture ? this.touchWidth : getWidth();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            width = this.inGesture ? this.touchHeight : getHeight();
        }
        return (width - this.thumbSize) - (getSnapValues().size() * this.snapMargin);
    }

    private final void mUb() {
        if (this.trackingTouch) {
            this.trackingTouch = false;
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.onSeekBarChangeListener;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStopTrackingTouch(null);
            }
            Function0 function0 = this.onStopTrackingTouch;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(int i2, int i3) {
        return "valueToCoord(" + i2 + ") = " + i3;
    }

    private final void xMQ() {
        if (this.trackingTouch) {
            return;
        }
        this.trackingTouch = true;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.onSeekBarChangeListener;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(null);
        }
        Function0 function0 = this.onStartTrackingTouch;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final float getLogScale() {
        return ((Number) this.logScale.getValue(this, dR0[3])).floatValue();
    }

    public final int getMaxValue() {
        return ((Number) this.maxValue.getValue(this, dR0[1])).intValue();
    }

    public final int getMinValue() {
        return ((Number) this.minValue.getValue(this, dR0[0])).intValue();
    }

    public final SeekBar.OnSeekBarChangeListener getOnSeekBarChangeListener() {
        return this.onSeekBarChangeListener;
    }

    public final Function0<Unit> getOnStartTrackingTouch() {
        return this.onStartTrackingTouch;
    }

    public final Function0<Unit> getOnStopTrackingTouch() {
        return this.onStopTrackingTouch;
    }

    public final Function1<Integer, Unit> getOnValueChangeFromUser() {
        return this.onValueChangeFromUser;
    }

    public final int getOriginValue() {
        return ((Number) this.originValue.getValue(this, dR0[8])).intValue();
    }

    public final List<Integer> getSnapValues() {
        return (List) this.snapValues.getValue(this, dR0[4]);
    }

    public final int getStepSize() {
        return ((Number) this.stepSize.getValue(this, dR0[6])).intValue();
    }

    public final List<Integer> getTickMarkValues() {
        return (List) this.tickMarkValues.getValue(this, dR0[5]);
    }

    public final int getTickSpacing() {
        return ((Number) this.tickSpacing.getValue(this, dR0[7])).intValue();
    }

    public final int getValue() {
        return ((Number) this.value.getValue(this, dR0[2])).intValue();
    }

    @Override // android.view.View
    protected void onSizeChanged(final int w2, final int h2, final int oldw, final int oldh) {
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.qf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlightSlider.az(oldw, w2, oldh, h2);
            }
        });
        super.onSizeChanged(w2, h2, oldw, oldh);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent event) {
        float rawX;
        float f3;
        float x2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled()) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.startX = event.getRawX();
            this.startY = event.getRawY();
            this.touchWidth = getWidth();
            this.touchHeight = getWidth();
        } else if (actionMasked == 1) {
            mUb();
            this.inGesture = false;
        } else if (actionMasked == 2) {
            j jVar = null;
            if (this.inGesture) {
                j jVar2 = this.orientation;
                if (jVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("orientation");
                } else {
                    jVar = jVar2;
                }
                int i2 = n.$EnumSwitchMapping$0[jVar.ordinal()];
                if (i2 == 1) {
                    x2 = event.getX();
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x2 = event.getY();
                }
                gh(J2((int) x2));
            } else {
                j jVar3 = this.orientation;
                if (jVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("orientation");
                } else {
                    jVar = jVar3;
                }
                int i3 = n.$EnumSwitchMapping$0[jVar.ordinal()];
                if (i3 == 1) {
                    rawX = event.getRawX();
                    f3 = this.startX;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rawX = event.getRawY();
                    f3 = this.startY;
                }
                if (Math.abs(rawX - f3) > getTouchSlop() / 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    xMQ();
                    this.inGesture = true;
                }
            }
        } else if (actionMasked == 3) {
        }
        return true;
    }

    public final void setLogScale(float f3) {
        this.logScale.setValue(this, dR0[3], Float.valueOf(f3));
    }

    public final void setMaxValue(int i2) {
        this.maxValue.setValue(this, dR0[1], Integer.valueOf(i2));
    }

    public final void setMinValue(int i2) {
        this.minValue.setValue(this, dR0[0], Integer.valueOf(i2));
    }

    public final void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.onSeekBarChangeListener = onSeekBarChangeListener;
    }

    public final void setOnStartTrackingTouch(Function0<Unit> function0) {
        this.onStartTrackingTouch = function0;
    }

    public final void setOnStopTrackingTouch(Function0<Unit> function0) {
        this.onStopTrackingTouch = function0;
    }

    public final void setOnValueChangeFromUser(Function1<? super Integer, Unit> function1) {
        this.onValueChangeFromUser = function1;
    }

    public final void setOriginValue(int i2) {
        this.originValue.setValue(this, dR0[8], Integer.valueOf(i2));
    }

    public final void setSnapValues(List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.snapValues.setValue(this, dR0[4], list);
    }

    public final void setStepSize(int i2) {
        this.stepSize.setValue(this, dR0[6], Integer.valueOf(i2));
    }

    public final void setTickMarkValues(List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tickMarkValues.setValue(this, dR0[5], list);
    }

    public final void setTickSpacing(int i2) {
        this.tickSpacing.setValue(this, dR0[7], Integer.valueOf(i2));
    }

    public final void setValue(int i2) {
        this.value.setValue(this, dR0[2], Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int HI(AlightSlider alightSlider) {
        return ViewConfiguration.get(alightSlider.getContext()).getScaledTouchSlop();
    }

    private final int Ik(int v2) {
        int width;
        int i2;
        final int iTy = ty(v2);
        int i3 = this.thumbSize / 2;
        int minValue = iTy - getMinValue();
        j jVar = this.orientation;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientation");
            jVar = null;
        }
        int i5 = n.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                if (this.inGesture) {
                    width = this.touchHeight;
                } else {
                    width = getHeight();
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (this.inGesture) {
            width = this.touchWidth;
        } else {
            width = getWidth();
        }
        int size = i3 + ((minValue * ((width - this.thumbSize) - (getSnapValues().size() * this.snapMargin))) / (getMaxValue() - getMinValue()));
        List<Integer> snapValues = getSnapValues();
        int i7 = 0;
        if (snapValues != null && snapValues.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<T> it = snapValues.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() < v2 && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        int i8 = size + (i2 * this.snapMargin);
        List<Integer> snapValues2 = getSnapValues();
        if (snapValues2 == null || !snapValues2.isEmpty()) {
            Iterator<T> it2 = snapValues2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((Number) it2.next()).intValue() == v2) {
                    i7 = this.snapMargin / 2;
                    break;
                }
            }
        }
        final int i9 = i8 + i7;
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.M
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlightSlider.r(iTy, i9);
            }
        });
        return i9;
    }

    private final int J2(final int n2) {
        j jVar;
        Object next;
        int width;
        Iterator<T> it = getSnapValues().iterator();
        while (true) {
            jVar = null;
            if (it.hasNext()) {
                next = it.next();
                int iIntValue = ((Number) next).intValue();
                if (n2 >= Ik(iIntValue) - (this.snapMargin / 2) && n2 <= Ik(iIntValue) + (this.snapMargin / 2) + 1) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        final Integer num = (Integer) next;
        if (num != null) {
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.Ln
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlightSlider.Uo(n2, num);
                }
            });
            return num.intValue();
        }
        List<Integer> snapValues = getSnapValues();
        int i2 = 0;
        if (snapValues == null || !snapValues.isEmpty()) {
            Iterator<T> it2 = snapValues.iterator();
            while (it2.hasNext()) {
                if (Ik(((Number) it2.next()).intValue()) < n2 && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        final int i3 = i2 * this.snapMargin;
        int minValue = getMinValue();
        int maxValue = ((n2 - (this.thumbSize / 2)) - i3) * (getMaxValue() - getMinValue());
        j jVar2 = this.orientation;
        if (jVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientation");
        } else {
            jVar = jVar2;
        }
        int i5 = n.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                if (this.inGesture) {
                    width = this.touchHeight;
                } else {
                    width = getHeight();
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (this.inGesture) {
            width = this.touchWidth;
        } else {
            width = getWidth();
        }
        final int size = minValue + (maxValue / ((width - this.thumbSize) - (getSnapValues().size() * this.snapMargin)));
        final int iCk = ck(RangesKt.coerceIn(size, getMinValue(), getMaxValue()));
        final int iCoerceIn = RangesKt.coerceIn(iCk - (iCk % Math.max(1, getStepSize())), getMinValue(), getMaxValue());
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.lej
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlightSlider.KN(n2, iCoerceIn, i3, size, iCk, this);
            }
        });
        return iCoerceIn;
    }

    private final int ck(int v2) {
        double maxValue = getMaxValue() - getMinValue();
        double minValue = getMinValue();
        return MathKt.roundToInt((Math.pow((((double) v2) - minValue) / maxValue, getLogScale()) * maxValue) + minValue);
    }

    private final void gh(int newValue) {
        if (newValue != getValue() && this.trackingTouch) {
            setValue(newValue);
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.onSeekBarChangeListener;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(null, getValue(), true);
            }
            Function1 function1 = this.onValueChangeFromUser;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(getValue()));
            }
        }
    }

    private final int ty(int v2) {
        double maxValue = getMaxValue() - getMinValue();
        double minValue = getMinValue();
        return MathKt.roundToInt((Math.pow((Math.max(v2, minValue) - minValue) / maxValue, 1.0d / ((double) getLogScale())) * maxValue) + minValue);
    }
}
