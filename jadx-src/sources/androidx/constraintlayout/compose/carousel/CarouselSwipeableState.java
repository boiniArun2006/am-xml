package androidx.constraintlayout.compose.carousel;

import TFv.CN3;
import TFv.Wre;
import TFv.fuX;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u0000 j*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001qBD\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0001\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0001\u0010\u0011J&\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001a\u001a\u00020\u00102\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0015H\u0080@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010 \u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00028\u00002\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086@¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b#\u0010\u0011J\u0015\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b%\u0010&R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R5\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R+\u00106\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R+\u0010<\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u0014\u0010D\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010?R\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00101RC\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u00101\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\u0018R&\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00150L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010MR\"\u0010U\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010X\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010P\u001a\u0004\bV\u0010R\"\u0004\bW\u0010TRO\u0010^\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050Y2\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050Y8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bH\u00101\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R+\u0010a\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010?\u001a\u0004\b_\u0010R\"\u0004\b`\u0010TR/\u0010g\u001a\u0004\u0018\u00010b2\b\u0010/\u001a\u0004\u0018\u00010b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b-\u00101\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001a\u0010l\u001a\u00020h8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010i\u001a\u0004\bj\u0010kR\u0011\u0010p\u001a\u00020m8F¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006r"}, d2 = {"Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "newValue", "", "confirmStateChange", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "target", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "spec", "xMQ", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "newAnchors", "qie", "(Ljava/util/Map;)V", "oldAnchors", "g", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "N", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "anim", "mUb", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "nY", "delta", "ViF", "(F)F", c.f62177j, "Landroidx/compose/animation/core/AnimationSpec;", "ty", "()Landroidx/compose/animation/core/AnimationSpec;", "rl", "Lkotlin/jvm/functions/Function1;", "HI", "()Lkotlin/jvm/functions/Function1;", "<set-?>", "t", "Landroidx/compose/runtime/MutableState;", "ck", "()Ljava/lang/Object;", "fD", "(Ljava/lang/Object;)V", "currentValue", "nr", "aYN", "()Z", "iF", "(Z)V", "isAnimationRunning", "Landroidx/compose/runtime/MutableFloatState;", "O", "Landroidx/compose/runtime/MutableFloatState;", "offsetState", "J2", "overflowState", "Uo", "absoluteOffset", "Landroidx/compose/runtime/MutableState;", "KN", "animationTarget", "az", "()Ljava/util/Map;", "te", "anchors", "LTFv/Wre;", "LTFv/Wre;", "latestNonEmptyAnchorsFlow", "gh", "F", "o", "()F", "setMinBound$constraintlayout_compose_release", "(F)V", "minBound", "r", "setMaxBound$constraintlayout_compose_release", "maxBound", "Lkotlin/Function2;", "S", "()Lkotlin/jvm/functions/Function2;", "e", "(Lkotlin/jvm/functions/Function2;)V", "thresholds", "WPU", "X", "velocityThreshold", "Landroidx/constraintlayout/compose/carousel/ResistanceConfig;", "XQ", "()Landroidx/constraintlayout/compose/carousel/ResistanceConfig;", "E2", "(Landroidx/constraintlayout/compose/carousel/ResistanceConfig;)V", "resistance", "Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/foundation/gestures/DraggableState;", "Ik", "()Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/runtime/FloatState;", "Z", "()Landroidx/compose/runtime/FloatState;", "offset", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nCarouselSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableState\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,850:1\n21#2:851\n23#2:855\n50#3:852\n55#3:854\n107#4:853\n81#5:856\n107#5,2:857\n81#5:859\n107#5,2:860\n81#5:862\n107#5,2:863\n81#5:894\n107#5,2:895\n81#5:900\n107#5,2:901\n1#6:865\n2333#7,14:866\n2333#7,14:880\n79#8:897\n112#8,2:898\n*S KotlinDebug\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableState\n*L\n123#1:851\n123#1:855\n123#1:852\n123#1:854\n123#1:853\n89#1:856\n89#1:857,2\n93#1:859\n93#1:860,2\n120#1:862\n120#1:863,2\n183#1:894\n183#1:895,2\n187#1:900\n187#1:901,2\n162#1:866,14\n168#1:880,14\n185#1:897\n185#1:898,2\n*E\n"})
public class CarouselSwipeableState<T> {

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final MutableState resistance;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final MutableState thresholds;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final DraggableState draggableState;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private float minBound;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final Wre latestNonEmptyAnchorsFlow;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnimationSpec animationSpec;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private float maxBound;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function1 confirmStateChange;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState currentValue;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final MutableFloatState velocityThreshold;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState isAnimationRunning = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState offsetState = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableFloatState overflowState = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableFloatState absoluteOffset = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MutableState animationTarget = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MutableState anchors = SnapshotStateKt__SnapshotStateKt.O(MapsKt.emptyMap(), null, 2, null);

    /* JADX INFO: renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "", c.f62177j, "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    final class AnonymousClass1 extends Lambda implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AnonymousClass1 f34917n = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState$Companion;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;", c.f62177j, "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n(final AnimationSpec animationSpec, final Function1 confirmStateChange) {
            return SaverKt.n(new Function2<SaverScope, CarouselSwipeableState<Object>, Object>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(SaverScope saverScope, CarouselSwipeableState carouselSwipeableState) {
                    return carouselSwipeableState.ck();
                }
            }, new Function1<Object, CarouselSwipeableState<Object>>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final CarouselSwipeableState invoke(Object obj) {
                    return new CarouselSwipeableState(obj, animationSpec, confirmStateChange);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T(float f3, Continuation continuation) {
        Object objT = DraggableState.t(this.draggableState, null, new CarouselSwipeableState$snapInternalToOffset$2(f3, this, null), continuation, 1, null);
        return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fD(Object obj) {
        this.currentValue.setValue(obj);
    }

    public static /* synthetic */ Object gh(CarouselSwipeableState carouselSwipeableState, Object obj, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i2 & 2) != 0) {
            animationSpec = carouselSwipeableState.animationSpec;
        }
        return carouselSwipeableState.mUb(obj, animationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iF(boolean z2) {
        this.isAnimationRunning.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object xMQ(float f3, AnimationSpec animationSpec, Continuation continuation) {
        Object objT = DraggableState.t(this.draggableState, null, new CarouselSwipeableState$animateInternalToOffset$2(this, f3, animationSpec, null), continuation, 1, null);
        return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : Unit.INSTANCE;
    }

    public final void E2(ResistanceConfig resistanceConfig) {
        this.resistance.setValue(resistanceConfig);
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final Function1 getConfirmStateChange() {
        return this.confirmStateChange;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    public final Object N(Object obj, Continuation continuation) {
        Object objN = this.latestNonEmptyAnchorsFlow.n(new CarouselSwipeableState$snapTo$2(obj, this), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public final Function2 S() {
        return (Function2) this.thresholds.getValue();
    }

    public final float ViF(float delta) {
        float fCoerceIn = RangesKt.coerceIn(this.absoluteOffset.n() + delta, this.minBound, this.maxBound) - this.absoluteOffset.n();
        if (Math.abs(fCoerceIn) > 0.0f) {
            this.draggableState.rl(fCoerceIn);
        }
        return fCoerceIn;
    }

    public final float WPU() {
        return this.velocityThreshold.n();
    }

    public final void X(float f3) {
        this.velocityThreshold.Z(f3);
    }

    public final ResistanceConfig XQ() {
        return (ResistanceConfig) this.resistance.getValue();
    }

    public final FloatState Z() {
        return this.offsetState;
    }

    public final boolean aYN() {
        return ((Boolean) this.isAnimationRunning.getValue()).booleanValue();
    }

    public final Map az() {
        return (Map) this.anchors.getValue();
    }

    public final Object ck() {
        return this.currentValue.getValue();
    }

    public final void e(Function2 function2) {
        this.thresholds.setValue(function2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (T(r10, r0) == r1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Map map, Map map2, Continuation continuation) throws Throwable {
        CarouselSwipeableState$processNewAnchors$1 carouselSwipeableState$processNewAnchors$1;
        float fFloatValue;
        CarouselSwipeableState<T> carouselSwipeableState;
        CarouselSwipeableState<T> carouselSwipeableState2;
        if (continuation instanceof CarouselSwipeableState$processNewAnchors$1) {
            carouselSwipeableState$processNewAnchors$1 = (CarouselSwipeableState$processNewAnchors$1) continuation;
            int i2 = carouselSwipeableState$processNewAnchors$1.f34940o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carouselSwipeableState$processNewAnchors$1.f34940o = i2 - Integer.MIN_VALUE;
            } else {
                carouselSwipeableState$processNewAnchors$1 = new CarouselSwipeableState$processNewAnchors$1(this, continuation);
            }
        }
        Object obj = carouselSwipeableState$processNewAnchors$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = carouselSwipeableState$processNewAnchors$1.f34940o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (map.isEmpty()) {
                Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                Intrinsics.checkNotNull(fMinOrNull);
                this.minBound = fMinOrNull.floatValue();
                Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                Intrinsics.checkNotNull(fMaxOrNull);
                this.maxBound = fMaxOrNull.floatValue();
                Float fUo = CarouselSwipeableKt.Uo(map2, ck());
                if (fUo == null) {
                    throw new IllegalArgumentException("The initial value must have an associated anchor.");
                }
                float fFloatValue2 = fUo.floatValue();
                carouselSwipeableState$processNewAnchors$1.f34940o = 1;
            } else if (!Intrinsics.areEqual(map2, map)) {
                this.minBound = Float.NEGATIVE_INFINITY;
                this.maxBound = Float.POSITIVE_INFINITY;
                Float f3 = (Float) this.animationTarget.getValue();
                Object next = null;
                if (f3 != null) {
                    Float fUo2 = CarouselSwipeableKt.Uo(map2, map.get(f3));
                    if (fUo2 != null) {
                        fFloatValue = fUo2.floatValue();
                    } else {
                        Iterator<T> it = map2.keySet().iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                float fAbs = Math.abs(((Number) next).floatValue() - f3.floatValue());
                                do {
                                    Object next2 = it.next();
                                    float fAbs2 = Math.abs(((Number) next2).floatValue() - f3.floatValue());
                                    if (Float.compare(fAbs, fAbs2) > 0) {
                                        next = next2;
                                        fAbs = fAbs2;
                                    }
                                } while (it.hasNext());
                            }
                        }
                        Intrinsics.checkNotNull(next);
                        fFloatValue = ((Number) next).floatValue();
                    }
                } else {
                    Object objCk = map.get(Boxing.boxFloat(Z().n()));
                    if (Intrinsics.areEqual(objCk, ck())) {
                        objCk = ck();
                    }
                    Float fUo3 = CarouselSwipeableKt.Uo(map2, objCk);
                    if (fUo3 != null) {
                        fFloatValue = fUo3.floatValue();
                    } else {
                        Iterator<T> it2 = map2.keySet().iterator();
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (it2.hasNext()) {
                                float fAbs3 = Math.abs(((Number) next).floatValue() - Z().n());
                                do {
                                    Object next3 = it2.next();
                                    float fAbs4 = Math.abs(((Number) next3).floatValue() - Z().n());
                                    if (Float.compare(fAbs3, fAbs4) > 0) {
                                        next = next3;
                                        fAbs3 = fAbs4;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        Intrinsics.checkNotNull(next);
                        fFloatValue = ((Number) next).floatValue();
                    }
                }
                try {
                    AnimationSpec animationSpec = this.animationSpec;
                    carouselSwipeableState$processNewAnchors$1.f34939n = this;
                    carouselSwipeableState$processNewAnchors$1.f34942t = map2;
                    carouselSwipeableState$processNewAnchors$1.f34938O = fFloatValue;
                    carouselSwipeableState$processNewAnchors$1.f34940o = 2;
                    if (xMQ(fFloatValue, animationSpec, carouselSwipeableState$processNewAnchors$1) != coroutine_suspended) {
                        carouselSwipeableState2 = this;
                        carouselSwipeableState2.fD(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                        Float fMinOrNull2 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(fMinOrNull2);
                        carouselSwipeableState2.minBound = fMinOrNull2.floatValue();
                        Float fMaxOrNull2 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(fMaxOrNull2);
                        carouselSwipeableState2.maxBound = fMaxOrNull2.floatValue();
                    }
                } catch (CancellationException unused) {
                    carouselSwipeableState2 = this;
                    carouselSwipeableState$processNewAnchors$1.f34939n = carouselSwipeableState2;
                    carouselSwipeableState$processNewAnchors$1.f34942t = map2;
                    carouselSwipeableState$processNewAnchors$1.f34938O = fFloatValue;
                    carouselSwipeableState$processNewAnchors$1.f34940o = 3;
                    if (carouselSwipeableState2.T(fFloatValue, carouselSwipeableState$processNewAnchors$1) != coroutine_suspended) {
                    }
                } catch (Throwable th) {
                    th = th;
                    carouselSwipeableState = this;
                    carouselSwipeableState.fD(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                    Float fMinOrNull3 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMinOrNull3);
                    carouselSwipeableState.minBound = fMinOrNull3.floatValue();
                    Float fMaxOrNull3 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMaxOrNull3);
                    carouselSwipeableState.maxBound = fMaxOrNull3.floatValue();
                    throw th;
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        if (i3 == 2) {
            fFloatValue = carouselSwipeableState$processNewAnchors$1.f34938O;
            map2 = (Map) carouselSwipeableState$processNewAnchors$1.f34942t;
            carouselSwipeableState2 = (CarouselSwipeableState) carouselSwipeableState$processNewAnchors$1.f34939n;
            try {
                try {
                    ResultKt.throwOnFailure(obj);
                    carouselSwipeableState2.fD(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                    Float fMinOrNull22 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMinOrNull22);
                    carouselSwipeableState2.minBound = fMinOrNull22.floatValue();
                    Float fMaxOrNull22 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMaxOrNull22);
                    carouselSwipeableState2.maxBound = fMaxOrNull22.floatValue();
                } catch (CancellationException unused2) {
                    carouselSwipeableState$processNewAnchors$1.f34939n = carouselSwipeableState2;
                    carouselSwipeableState$processNewAnchors$1.f34942t = map2;
                    carouselSwipeableState$processNewAnchors$1.f34938O = fFloatValue;
                    carouselSwipeableState$processNewAnchors$1.f34940o = 3;
                    if (carouselSwipeableState2.T(fFloatValue, carouselSwipeableState$processNewAnchors$1) != coroutine_suspended) {
                        carouselSwipeableState = carouselSwipeableState2;
                        carouselSwipeableState.fD(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                        Float fMinOrNull4 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(fMinOrNull4);
                        carouselSwipeableState.minBound = fMinOrNull4.floatValue();
                        Float fMaxOrNull4 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(fMaxOrNull4);
                        carouselSwipeableState.maxBound = fMaxOrNull4.floatValue();
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                carouselSwipeableState = carouselSwipeableState2;
                carouselSwipeableState.fD(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                Float fMinOrNull32 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                Intrinsics.checkNotNull(fMinOrNull32);
                carouselSwipeableState.minBound = fMinOrNull32.floatValue();
                Float fMaxOrNull32 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                Intrinsics.checkNotNull(fMaxOrNull32);
                carouselSwipeableState.maxBound = fMaxOrNull32.floatValue();
                throw th;
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fFloatValue = carouselSwipeableState$processNewAnchors$1.f34938O;
            map2 = (Map) carouselSwipeableState$processNewAnchors$1.f34942t;
            carouselSwipeableState = (CarouselSwipeableState) carouselSwipeableState$processNewAnchors$1.f34939n;
            try {
                ResultKt.throwOnFailure(obj);
                carouselSwipeableState.fD(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                Float fMinOrNull42 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                Intrinsics.checkNotNull(fMinOrNull42);
                carouselSwipeableState.minBound = fMinOrNull42.floatValue();
                Float fMaxOrNull42 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                Intrinsics.checkNotNull(fMaxOrNull42);
                carouselSwipeableState.maxBound = fMaxOrNull42.floatValue();
            } catch (Throwable th3) {
                th = th3;
                carouselSwipeableState.fD(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                Float fMinOrNull322 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                Intrinsics.checkNotNull(fMinOrNull322);
                carouselSwipeableState.minBound = fMinOrNull322.floatValue();
                Float fMaxOrNull322 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                Intrinsics.checkNotNull(fMaxOrNull322);
                carouselSwipeableState.maxBound = fMaxOrNull322.floatValue();
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object mUb(Object obj, AnimationSpec animationSpec, Continuation continuation) {
        Object objN = this.latestNonEmptyAnchorsFlow.n(new CarouselSwipeableState$animateTo$2(obj, this, animationSpec), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public final Object nY(final float f3, Continuation continuation) {
        Object objN = this.latestNonEmptyAnchorsFlow.n(new CN3() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$performFling$2
            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(Map map, Continuation continuation2) {
                Float fUo = CarouselSwipeableKt.Uo(map, this.f34936n.ck());
                Intrinsics.checkNotNull(fUo);
                float fFloatValue = fUo.floatValue();
                Object obj = map.get(Boxing.boxFloat(CarouselSwipeableKt.O(this.f34936n.Z().n(), fFloatValue, map.keySet(), this.f34936n.S(), f3, this.f34936n.WPU())));
                if (obj != null && ((Boolean) this.f34936n.getConfirmStateChange().invoke(obj)).booleanValue()) {
                    Object objGh = CarouselSwipeableState.gh(this.f34936n, obj, null, continuation2, 2, null);
                    return objGh == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objGh : Unit.INSTANCE;
                }
                CarouselSwipeableState carouselSwipeableState = this.f34936n;
                Object objXMQ = carouselSwipeableState.xMQ(fFloatValue, carouselSwipeableState.getAnimationSpec(), continuation2);
                return objXMQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objXMQ : Unit.INSTANCE;
            }
        }, continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getMinBound() {
        return this.minBound;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getMaxBound() {
        return this.maxBound;
    }

    public final void te(Map map) {
        this.anchors.setValue(map);
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final AnimationSpec getAnimationSpec() {
        return this.animationSpec;
    }

    public CarouselSwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1) {
        this.animationSpec = animationSpec;
        this.confirmStateChange = function1;
        this.currentValue = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
        final Wre wreIk = SnapshotStateKt.Ik(new Function0<Map<Float, ? extends T>>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$latestNonEmptyAnchorsFlow$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Map invoke() {
                return this.f34935n.az();
            }
        });
        this.latestNonEmptyAnchorsFlow = fuX.jB(new Wre() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1

            /* JADX INFO: renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "", "rl", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableState\n*L\n1#1,222:1\n22#2:223\n23#2:225\n123#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ CN3 f34952n;

                /* JADX INFO: renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2", f = "CarouselSwipeable.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f34954n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f34955t;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f34954n = obj;
                        this.f34955t |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.rl(null, this);
                    }
                }

                public AnonymousClass2(CN3 cn3) {
                    this.f34952n = cn3;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.f34955t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f34955t = i2 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.f34954n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = anonymousClass1.f34955t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        CN3 cn3 = this.f34952n;
                        if (!((Map) obj).isEmpty()) {
                            anonymousClass1.f34955t = 1;
                            if (cn3.rl(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // TFv.Wre
            public Object n(CN3 cn3, Continuation continuation) {
                Object objN = wreIk.n(new AnonymousClass2(cn3), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds = SnapshotStateKt__SnapshotStateKt.O(new Function2<Float, Float, Float>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$thresholds$2
            public final Float n(float f3, float f4) {
                return Float.valueOf(0.0f);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(Float f3, Float f4) {
                return n(f3.floatValue(), f4.floatValue());
            }
        }, null, 2, null);
        this.velocityThreshold = PrimitiveSnapshotStateKt.n(0.0f);
        this.resistance = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.draggableState = DraggableKt.n(new Function1<Float, Unit>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$draggableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                n(f3.floatValue());
                return Unit.INSTANCE;
            }

            public final void n(float f3) {
                float fN = this.f34934n.absoluteOffset.n() + f3;
                float fCoerceIn = RangesKt.coerceIn(fN, this.f34934n.getMinBound(), this.f34934n.getMaxBound());
                float f4 = fN - fCoerceIn;
                ResistanceConfig resistanceConfigXQ = this.f34934n.XQ();
                this.f34934n.offsetState.Z(fCoerceIn + (resistanceConfigXQ != null ? resistanceConfigXQ.n(f4) : 0.0f));
                this.f34934n.overflowState.Z(f4);
                this.f34934n.absoluteOffset.Z(fN);
            }
        });
    }

    public final void qie(Map newAnchors) {
        if (az().isEmpty()) {
            Float fUo = CarouselSwipeableKt.Uo(newAnchors, ck());
            if (fUo != null) {
                this.offsetState.Z(fUo.floatValue());
                this.absoluteOffset.Z(fUo.floatValue());
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.");
        }
    }
}
