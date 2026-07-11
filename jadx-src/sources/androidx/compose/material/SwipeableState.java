package androidx.compose.material;

import TFv.CN3;
import TFv.Wre;
import TFv.fuX;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 h*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001oBD\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0001\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0001\u0010\u0011J&\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001a\u001a\u00020\u00102\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0015H\u0080@¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00028\u00002\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0005H\u0086@¢\u0006\u0004\b!\u0010\u0011J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R5\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R+\u00104\u001a\u00028\u00002\u0006\u0010-\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u0010:\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\u0014\u0010B\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010=R\u001c\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010/RC\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010/\u001a\u0004\bF\u0010G\"\u0004\bH\u0010\u0018R&\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00150J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010KR\"\u0010S\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010V\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010N\u001a\u0004\bT\u0010P\"\u0004\bU\u0010RRO\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050W2\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050W8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010/\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R+\u0010_\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010=\u001a\u0004\b]\u0010P\"\u0004\b^\u0010RR/\u0010e\u001a\u0004\u0018\u00010`2\b\u0010-\u001a\u0004\u0018\u00010`8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010/\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010j\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00050k8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006p"}, d2 = {"Landroidx/compose/material/SwipeableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "newValue", "", "confirmStateChange", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "target", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "spec", "xMQ", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "newAnchors", "qie", "(Ljava/util/Map;)V", "oldAnchors", "g", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "anim", "mUb", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "nY", "delta", "ViF", "(F)F", c.f62177j, "Landroidx/compose/animation/core/AnimationSpec;", "ty", "()Landroidx/compose/animation/core/AnimationSpec;", "rl", "Lkotlin/jvm/functions/Function1;", "HI", "()Lkotlin/jvm/functions/Function1;", "<set-?>", "t", "Landroidx/compose/runtime/MutableState;", "ck", "()Ljava/lang/Object;", "fD", "(Ljava/lang/Object;)V", "currentValue", "nr", "aYN", "()Z", "iF", "(Z)V", "isAnimationRunning", "Landroidx/compose/runtime/MutableFloatState;", "O", "Landroidx/compose/runtime/MutableFloatState;", "offsetState", "J2", "overflowState", "Uo", "absoluteOffset", "Landroidx/compose/runtime/MutableState;", "KN", "animationTarget", "az", "()Ljava/util/Map;", "te", "anchors", "LTFv/Wre;", "LTFv/Wre;", "latestNonEmptyAnchorsFlow", "gh", "F", "o", "()F", "setMinBound$material_release", "(F)V", "minBound", "r", "setMaxBound$material_release", "maxBound", "Lkotlin/Function2;", "S", "()Lkotlin/jvm/functions/Function2;", "e", "(Lkotlin/jvm/functions/Function2;)V", "thresholds", "WPU", "X", "velocityThreshold", "Landroidx/compose/material/ResistanceConfig;", "XQ", "()Landroidx/compose/material/ResistanceConfig;", "E2", "(Landroidx/compose/material/ResistanceConfig;)V", "resistance", "Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/foundation/gestures/DraggableState;", "Ik", "()Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/runtime/State;", "Z", "()Landroidx/compose/runtime/State;", "offset", "Companion", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@Deprecated(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,881:1\n21#2:882\n23#2:886\n50#3:883\n55#3:885\n107#4:884\n85#5:887\n113#5,2:888\n85#5:890\n113#5,2:891\n85#5:893\n113#5,2:894\n85#5:925\n113#5,2:926\n85#5:931\n113#5,2:932\n1#6:896\n2333#7,14:897\n2333#7,14:911\n79#8:928\n112#8,2:929\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n131#1:882\n131#1:886\n131#1:883\n131#1:885\n131#1:884\n97#1:887\n97#1:888,2\n101#1:890\n101#1:891,2\n128#1:893\n128#1:894,2\n191#1:925\n191#1:926,2\n195#1:931\n195#1:932,2\n170#1:897,14\n176#1:911,14\n193#1:928\n193#1:929,2\n*E\n"})
public class SwipeableState<T> {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final MutableState resistance;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableFloatState overflowState;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MutableState animationTarget;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState offsetState;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableFloatState absoluteOffset;

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

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState isAnimationRunning;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private float maxBound;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function1 confirmStateChange;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState currentValue;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final MutableFloatState velocityThreshold;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MutableState anchors;

    public SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1) {
        this.animationSpec = animationSpec;
        this.confirmStateChange = function1;
        this.currentValue = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
        this.isAnimationRunning = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
        this.offsetState = PrimitiveSnapshotStateKt.n(0.0f);
        this.overflowState = PrimitiveSnapshotStateKt.n(0.0f);
        this.absoluteOffset = PrimitiveSnapshotStateKt.n(0.0f);
        this.animationTarget = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.anchors = SnapshotStateKt__SnapshotStateKt.O(MapsKt.emptyMap(), null, 2, null);
        final Wre wreIk = SnapshotStateKt.Ik(new Function0<Map<Float, ? extends T>>() { // from class: androidx.compose.material.SwipeableState$latestNonEmptyAnchorsFlow$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Map invoke() {
                return this.f23274n.az();
            }
        });
        this.latestNonEmptyAnchorsFlow = fuX.jB(new Wre() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1

            /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "", "rl", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n1#1,222:1\n22#2:223\n23#2:225\n131#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ CN3 f23291n;

                /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f23293n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f23294t;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f23293n = obj;
                        this.f23294t |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.rl(null, this);
                    }
                }

                public AnonymousClass2(CN3 cn3) {
                    this.f23291n = cn3;
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
                        int i2 = anonymousClass1.f23294t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f23294t = i2 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.f23293n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = anonymousClass1.f23294t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        CN3 cn3 = this.f23291n;
                        if (!((Map) obj).isEmpty()) {
                            anonymousClass1.f23294t = 1;
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
        this.thresholds = SnapshotStateKt__SnapshotStateKt.O(new Function2<Float, Float, Float>() { // from class: androidx.compose.material.SwipeableState$thresholds$2
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
        this.draggableState = DraggableKt.n(new Function1<Float, Unit>() { // from class: androidx.compose.material.SwipeableState$draggableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                n(f3.floatValue());
                return Unit.INSTANCE;
            }

            public final void n(float f3) {
                float fN = this.f23273n.absoluteOffset.n() + f3;
                float fCoerceIn = RangesKt.coerceIn(fN, this.f23273n.getMinBound(), this.f23273n.getMaxBound());
                float f4 = fN - fCoerceIn;
                ResistanceConfig resistanceConfigXQ = this.f23273n.XQ();
                this.f23273n.offsetState.Z(fCoerceIn + (resistanceConfigXQ != null ? resistanceConfigXQ.n(f4) : 0.0f));
                this.f23273n.overflowState.Z(f4);
                this.f23273n.absoluteOffset.Z(fN);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T(float f3, Continuation continuation) {
        Object objT = DraggableState.t(this.draggableState, null, new SwipeableState$snapInternalToOffset$2(f3, this, null), continuation, 1, null);
        return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fD(Object obj) {
        this.currentValue.setValue(obj);
    }

    public static /* synthetic */ Object gh(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i2 & 2) != 0) {
            animationSpec = swipeableState.animationSpec;
        }
        return swipeableState.mUb(obj, animationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iF(boolean z2) {
        this.isAnimationRunning.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object xMQ(float f3, AnimationSpec animationSpec, Continuation continuation) {
        Object objT = DraggableState.t(this.draggableState, null, new SwipeableState$animateInternalToOffset$2(this, f3, animationSpec, null), continuation, 1, null);
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

    public final State Z() {
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0218  */
    /* JADX WARN: Type inference failed for: r10v21, types: [float] */
    /* JADX WARN: Type inference failed for: r10v76, types: [float] */
    /* JADX WARN: Type inference failed for: r10v78, types: [float] */
    /* JADX WARN: Type inference failed for: r10v83 */
    /* JADX WARN: Type inference failed for: r10v84 */
    /* JADX WARN: Type inference failed for: r10v85 */
    /* JADX WARN: Type inference failed for: r10v86 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Map map, Map map2, Continuation continuation) throws Throwable {
        SwipeableState$processNewAnchors$1 swipeableState$processNewAnchors$1;
        SwipeableState swipeableState;
        SwipeableState swipeableState2;
        SwipeableState swipeableState3;
        float f3;
        float f4;
        if (continuation instanceof SwipeableState$processNewAnchors$1) {
            swipeableState$processNewAnchors$1 = (SwipeableState$processNewAnchors$1) continuation;
            int i2 = swipeableState$processNewAnchors$1.f23279o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                swipeableState$processNewAnchors$1.f23279o = i2 - Integer.MIN_VALUE;
            } else {
                swipeableState$processNewAnchors$1 = new SwipeableState$processNewAnchors$1(this, continuation);
            }
        }
        Object obj = swipeableState$processNewAnchors$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = swipeableState$processNewAnchors$1.f23279o;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (map.isEmpty()) {
                    Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMinOrNull);
                    this.minBound = fMinOrNull.floatValue();
                    Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMaxOrNull);
                    this.maxBound = fMaxOrNull.floatValue();
                    Float fO = SwipeableKt.O(map2, ck());
                    if (fO == null) {
                        throw new IllegalArgumentException("The initial value must have an associated anchor.");
                    }
                    float fFloatValue = fO.floatValue();
                    swipeableState$processNewAnchors$1.f23279o = 1;
                } else if (!Intrinsics.areEqual(map2, map)) {
                    this.minBound = Float.NEGATIVE_INFINITY;
                    this.maxBound = Float.POSITIVE_INFINITY;
                    Float f5 = (Float) this.animationTarget.getValue();
                    Object next = null;
                    if (f5 != null) {
                        Float fO2 = SwipeableKt.O(map2, map.get(f5));
                        if (fO2 != null) {
                            map = fO2.floatValue();
                        } else {
                            Iterator<T> it = map2.keySet().iterator();
                            if (it.hasNext()) {
                                next = it.next();
                                if (it.hasNext()) {
                                    float fAbs = Math.abs(((Number) next).floatValue() - f5.floatValue());
                                    do {
                                        Object next2 = it.next();
                                        float fAbs2 = Math.abs(((Number) next2).floatValue() - f5.floatValue());
                                        if (Float.compare(fAbs, fAbs2) > 0) {
                                            next = next2;
                                            fAbs = fAbs2;
                                        }
                                    } while (it.hasNext());
                                }
                            }
                            Intrinsics.checkNotNull(next);
                            map = ((Number) next).floatValue();
                        }
                    } else {
                        Object objCk = map.get(Z().getValue());
                        if (Intrinsics.areEqual(objCk, ck())) {
                            objCk = ck();
                        }
                        Float fO3 = SwipeableKt.O(map2, objCk);
                        if (fO3 != null) {
                            map = fO3.floatValue();
                        } else {
                            Iterator<T> it2 = map2.keySet().iterator();
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    float fAbs3 = Math.abs(((Number) next).floatValue() - ((Number) Z().getValue()).floatValue());
                                    do {
                                        Object next3 = it2.next();
                                        float fAbs4 = Math.abs(((Number) next3).floatValue() - ((Number) Z().getValue()).floatValue());
                                        if (Float.compare(fAbs3, fAbs4) > 0) {
                                            next = next3;
                                            fAbs3 = fAbs4;
                                        }
                                    } while (it2.hasNext());
                                }
                            }
                            Intrinsics.checkNotNull(next);
                            map = ((Number) next).floatValue();
                        }
                    }
                    try {
                        AnimationSpec animationSpec = this.animationSpec;
                        swipeableState$processNewAnchors$1.f23278n = this;
                        swipeableState$processNewAnchors$1.f23281t = map2;
                        swipeableState$processNewAnchors$1.f23277O = map;
                        swipeableState$processNewAnchors$1.f23279o = 2;
                        if (xMQ(map, animationSpec, swipeableState$processNewAnchors$1) != coroutine_suspended) {
                            swipeableState2 = this;
                            f3 = map;
                            swipeableState2.fD(MapsKt.getValue(map2, Boxing.boxFloat(f3)));
                            Float fMinOrNull2 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                            Intrinsics.checkNotNull(fMinOrNull2);
                            swipeableState2.minBound = fMinOrNull2.floatValue();
                            Float fMaxOrNull2 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                            Intrinsics.checkNotNull(fMaxOrNull2);
                            swipeableState2.maxBound = fMaxOrNull2.floatValue();
                        }
                    } catch (CancellationException unused) {
                        swipeableState2 = this;
                        swipeableState$processNewAnchors$1.f23278n = swipeableState2;
                        swipeableState$processNewAnchors$1.f23281t = map2;
                        swipeableState$processNewAnchors$1.f23277O = map;
                        swipeableState$processNewAnchors$1.f23279o = 3;
                        if (swipeableState2.T(map, swipeableState$processNewAnchors$1) != coroutine_suspended) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        swipeableState = this;
                        swipeableState.fD(MapsKt.getValue(map2, Boxing.boxFloat(map)));
                        Float fMinOrNull3 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(fMinOrNull3);
                        swipeableState.minBound = fMinOrNull3.floatValue();
                        Float fMaxOrNull3 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(fMaxOrNull3);
                        swipeableState.maxBound = fMaxOrNull3.floatValue();
                        throw th;
                    }
                }
                return coroutine_suspended;
            }
            if (r2 == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (r2 == 2) {
                map = swipeableState$processNewAnchors$1.f23277O;
                map2 = (Map) swipeableState$processNewAnchors$1.f23281t;
                swipeableState2 = (SwipeableState) swipeableState$processNewAnchors$1.f23278n;
                try {
                    ResultKt.throwOnFailure(obj);
                    f3 = map;
                    swipeableState2.fD(MapsKt.getValue(map2, Boxing.boxFloat(f3)));
                    Float fMinOrNull22 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMinOrNull22);
                    swipeableState2.minBound = fMinOrNull22.floatValue();
                    Float fMaxOrNull22 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMaxOrNull22);
                    swipeableState2.maxBound = fMaxOrNull22.floatValue();
                } catch (CancellationException unused2) {
                    swipeableState$processNewAnchors$1.f23278n = swipeableState2;
                    swipeableState$processNewAnchors$1.f23281t = map2;
                    swipeableState$processNewAnchors$1.f23277O = map;
                    swipeableState$processNewAnchors$1.f23279o = 3;
                    if (swipeableState2.T(map, swipeableState$processNewAnchors$1) != coroutine_suspended) {
                        swipeableState3 = swipeableState2;
                        f4 = map;
                        swipeableState3.fD(MapsKt.getValue(map2, Boxing.boxFloat(f4)));
                        Float fMinOrNull4 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(fMinOrNull4);
                        swipeableState3.minBound = fMinOrNull4.floatValue();
                        Float fMaxOrNull4 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(fMaxOrNull4);
                        swipeableState3.maxBound = fMaxOrNull4.floatValue();
                    }
                    return coroutine_suspended;
                }
            } else {
                if (r2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = swipeableState$processNewAnchors$1.f23277O;
                map2 = (Map) swipeableState$processNewAnchors$1.f23281t;
                swipeableState = (SwipeableState) swipeableState$processNewAnchors$1.f23278n;
                try {
                    ResultKt.throwOnFailure(obj);
                    swipeableState3 = swipeableState;
                    f4 = map;
                    swipeableState3.fD(MapsKt.getValue(map2, Boxing.boxFloat(f4)));
                    Float fMinOrNull42 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMinOrNull42);
                    swipeableState3.minBound = fMinOrNull42.floatValue();
                    Float fMaxOrNull42 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMaxOrNull42);
                    swipeableState3.maxBound = fMaxOrNull42.floatValue();
                } catch (Throwable th2) {
                    th = th2;
                    swipeableState.fD(MapsKt.getValue(map2, Boxing.boxFloat(map)));
                    Float fMinOrNull32 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMinOrNull32);
                    swipeableState.minBound = fMinOrNull32.floatValue();
                    Float fMaxOrNull32 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMaxOrNull32);
                    swipeableState.maxBound = fMaxOrNull32.floatValue();
                    throw th;
                }
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            swipeableState = r2;
        }
    }

    public final Object mUb(Object obj, AnimationSpec animationSpec, Continuation continuation) {
        Object objN = this.latestNonEmptyAnchorsFlow.n(new SwipeableState$animateTo$2(obj, this, animationSpec), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public final Object nY(final float f3, Continuation continuation) {
        Object objN = this.latestNonEmptyAnchorsFlow.n(new CN3() { // from class: androidx.compose.material.SwipeableState$performFling$2
            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(Map map, Continuation continuation2) {
                Float fO = SwipeableKt.O(map, this.f23275n.ck());
                Intrinsics.checkNotNull(fO);
                float fFloatValue = fO.floatValue();
                Object obj = map.get(Boxing.boxFloat(SwipeableKt.t(((Number) this.f23275n.Z().getValue()).floatValue(), fFloatValue, map.keySet(), this.f23275n.S(), f3, this.f23275n.WPU())));
                if (obj != null && ((Boolean) this.f23275n.getConfirmStateChange().invoke(obj)).booleanValue()) {
                    Object objGh = SwipeableState.gh(this.f23275n, obj, null, continuation2, 2, null);
                    return objGh == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objGh : Unit.INSTANCE;
                }
                SwipeableState swipeableState = this.f23275n;
                Object objXMQ = swipeableState.xMQ(fFloatValue, swipeableState.getAnimationSpec(), continuation2);
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

    public final void qie(Map newAnchors) {
        if (az().isEmpty()) {
            Float fO = SwipeableKt.O(newAnchors, ck());
            if (fO != null) {
                this.offsetState.Z(fO.floatValue());
                this.absoluteOffset.Z(fO.floatValue());
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.");
        }
    }

    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? SwipeableDefaults.f23201n.n() : animationSpec, (i2 & 4) != 0 ? new Function1<T, Boolean>() { // from class: androidx.compose.material.SwipeableState.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj2) {
                return Boolean.TRUE;
            }
        } : function1);
    }
}
