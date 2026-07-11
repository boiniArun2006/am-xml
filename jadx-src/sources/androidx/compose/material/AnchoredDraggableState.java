package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
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
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\b\u0001\u0018\u0000 B*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001rBs\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0012B\u0083\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0015J'\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u00020#2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\b\b\u0002\u0010\"\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b&\u0010'J^\u0010/\u001a\u00020#2\b\b\u0002\u0010)\u001a\u00020(2B\u0010.\u001a>\b\u0001\u0012\u0004\u0012\u00020+\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0,\u0012\u0006\u0012\u0004\u0018\u00010\u00020*¢\u0006\u0002\b-H\u0086@¢\u0006\u0004\b/\u00100J{\u00102\u001a\u00020#2\u0006\u0010\u001d\u001a\u00028\u00002\b\b\u0002\u0010)\u001a\u00020(2W\u0010.\u001aS\b\u0001\u0012\u0004\u0012\u00020+\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0,\u0012\u0006\u0012\u0004\u0018\u00010\u000201¢\u0006\u0002\b-H\u0086@¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0005H\u0000¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0005¢\u0006\u0004\b7\u00106R5\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR5\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u00109\u001a\u0004\bE\u0010;R\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010O\u001a\u00020J8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR+\u0010\u0017\u001a\u00028\u00002\u0006\u0010P\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001b\u0010\u001d\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010TR\u001b\u0010[\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b/\u0010X\u001a\u0004\bZ\u0010TR+\u0010\u0016\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\\\u001a\u0004\b]\u0010 \"\u0004\b^\u0010_R\u001b\u0010b\u001a\u00020\u00058GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b`\u0010X\u001a\u0004\ba\u0010 R+\u0010e\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\\\u001a\u0004\bc\u0010 \"\u0004\bd\u0010_R/\u0010h\u001a\u0004\u0018\u00018\u00002\b\u0010P\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010R\u001a\u0004\bf\u0010T\"\u0004\bg\u0010VR7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010R\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010mR\u0011\u0010q\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006s"}, d2 = {"Landroidx/compose/material/AnchoredDraggableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "initialValue", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "totalDistance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "newValue", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/material/DraggableAnchors;", "anchors", "(Ljava/lang/Object;Landroidx/compose/material/DraggableAnchors;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "offset", "currentValue", "velocity", "qie", "(FLjava/lang/Object;F)Ljava/lang/Object;", "az", "(FLjava/lang/Object;)Ljava/lang/Object;", "targetValue", "(Ljava/lang/Object;)Z", "g", "()F", "newAnchors", "newTarget", "", "N", "(Landroidx/compose/material/DraggableAnchors;Ljava/lang/Object;)V", "X", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/material/AnchoredDragScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "xMQ", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function4;", "mUb", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "nY", "(F)F", "ty", c.f62177j, "Lkotlin/jvm/functions/Function1;", "getPositionalThreshold$material_release", "()Lkotlin/jvm/functions/Function1;", "rl", "Lkotlin/jvm/functions/Function0;", "getVelocityThreshold$material_release", "()Lkotlin/jvm/functions/Function0;", "t", "Landroidx/compose/animation/core/AnimationSpec;", "ck", "()Landroidx/compose/animation/core/AnimationSpec;", "nr", "r", "Landroidx/compose/material/InternalMutatorMutex;", "O", "Landroidx/compose/material/InternalMutatorMutex;", "dragMutex", "Landroidx/compose/foundation/gestures/DraggableState;", "J2", "Landroidx/compose/foundation/gestures/DraggableState;", "XQ", "()Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "<set-?>", "Uo", "Landroidx/compose/runtime/MutableState;", "o", "()Ljava/lang/Object;", "iF", "(Ljava/lang/Object;)V", "KN", "Landroidx/compose/runtime/State;", "aYN", "Ik", "closestValue", "Landroidx/compose/runtime/MutableFloatState;", "WPU", "e", "(F)V", "gh", "getProgress", "progress", "S", "E2", "lastVelocity", "Z", "fD", "dragTarget", "HI", "()Landroidx/compose/material/DraggableAnchors;", "te", "(Landroidx/compose/material/DraggableAnchors;)V", "Landroidx/compose/material/AnchoredDragScope;", "anchoredDragScope", "ViF", "()Z", "isAnimationRunning", "Companion", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,879:1\n85#2:880\n113#2,2:881\n85#2:883\n85#2:884\n85#2:888\n85#2:892\n113#2,2:893\n85#2:895\n113#2,2:896\n79#3:885\n112#3,2:886\n79#3:889\n112#3,2:890\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState\n*L\n292#1:880\n292#1:881,2\n300#1:883\n315#1:884\n360#1:888\n379#1:892\n379#1:893,2\n381#1:895\n381#1:896,2\n333#1:885\n333#1:886,2\n376#1:889\n376#1:890,2\n*E\n"})
public final class AnchoredDraggableState<T> {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final AnchoredDragScope anchoredDragScope;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final DraggableState draggableState;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final State targetValue;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final InternalMutatorMutex dragMutex;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableState currentValue;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final MutableState dragTarget;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final State progress;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final MutableFloatState offset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function1 positionalThreshold;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Function1 confirmValueChange;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final MutableFloatState lastVelocity;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function0 velocityThreshold;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AnimationSpec animationSpec;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final MutableState anchors;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final State closestValue;

    /* JADX INFO: renamed from: androidx.compose.material.AnchoredDraggableState$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "", c.f62177j, "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    final class AnonymousClass1 extends Lambda implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AnonymousClass1 f21098n = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    public AnchoredDraggableState(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12) {
        this.positionalThreshold = function1;
        this.velocityThreshold = function0;
        this.animationSpec = animationSpec;
        this.confirmValueChange = function12;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        this.currentValue = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
        this.targetValue = SnapshotStateKt.O(new Function0<T>() { // from class: androidx.compose.material.AnchoredDraggableState$targetValue$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objZ = this.f21132n.Z();
                if (objZ != null) {
                    return objZ;
                }
                AnchoredDraggableState anchoredDraggableState = this.f21132n;
                float fWPU = anchoredDraggableState.WPU();
                return !Float.isNaN(fWPU) ? anchoredDraggableState.qie(fWPU, anchoredDraggableState.o(), 0.0f) : anchoredDraggableState.o();
            }
        });
        this.closestValue = SnapshotStateKt.O(new Function0<T>() { // from class: androidx.compose.material.AnchoredDraggableState$closestValue$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objZ = this.f21125n.Z();
                if (objZ != null) {
                    return objZ;
                }
                AnchoredDraggableState anchoredDraggableState = this.f21125n;
                float fWPU = anchoredDraggableState.WPU();
                return !Float.isNaN(fWPU) ? anchoredDraggableState.az(fWPU, anchoredDraggableState.o()) : anchoredDraggableState.o();
            }
        });
        this.offset = PrimitiveSnapshotStateKt.n(Float.NaN);
        this.progress = SnapshotStateKt.nr(SnapshotStateKt.r(), new Function0<Float>() { // from class: androidx.compose.material.AnchoredDraggableState$progress$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                float fT = this.f21131n.HI().t(this.f21131n.o());
                float fT2 = this.f21131n.HI().t(this.f21131n.Ik()) - fT;
                float fAbs = Math.abs(fT2);
                float f3 = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fG = (this.f21131n.g() - fT) / fT2;
                    if (fG < 1.0E-6f) {
                        f3 = 0.0f;
                    } else if (fG <= 0.999999f) {
                        f3 = fG;
                    }
                }
                return Float.valueOf(f3);
            }
        });
        this.lastVelocity = PrimitiveSnapshotStateKt.n(0.0f);
        this.dragTarget = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.anchors = SnapshotStateKt__SnapshotStateKt.O(AnchoredDraggableKt.xMQ(), null, 2, null);
        this.anchoredDragScope = new AnchoredDragScope() { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1
            @Override // androidx.compose.material.AnchoredDragScope
            public void n(float newOffset, float lastKnownVelocity) {
                this.f21124n.e(newOffset);
                this.f21124n.E2(lastKnownVelocity);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2(float f3) {
        this.lastVelocity.Z(f3);
    }

    private final boolean T(final Object targetValue) {
        return this.dragMutex.O(new Function0<Unit>() { // from class: androidx.compose.material.AnchoredDraggableState$trySnapTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AnchoredDragScope anchoredDragScope = this.f21133n.anchoredDragScope;
                AnchoredDraggableState anchoredDraggableState = this.f21133n;
                Object obj = targetValue;
                float fT = anchoredDraggableState.HI().t(obj);
                if (!Float.isNaN(fT)) {
                    AnchoredDragScope.rl(anchoredDragScope, fT, 0.0f, 2, null);
                    anchoredDraggableState.fD(null);
                }
                anchoredDraggableState.iF(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Z() {
        return this.dragTarget.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(float f3) {
        this.offset.Z(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fD(Object obj) {
        this.dragTarget.setValue(obj);
    }

    public static /* synthetic */ Object gh(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, Function4 function4, Continuation continuation, int i2, Object obj2) throws Throwable {
        if ((i2 & 2) != 0) {
            mutatePriority = MutatePriority.f16227n;
        }
        return anchoredDraggableState.mUb(obj, mutatePriority, function4, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iF(Object obj) {
        this.currentValue.setValue(obj);
    }

    public static /* synthetic */ void nHg(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i2, Object obj2) {
        if ((i2 & 2) != 0 && (Float.isNaN(anchoredDraggableState.WPU()) || (obj = draggableAnchors.rl(anchoredDraggableState.WPU())) == null)) {
            obj = anchoredDraggableState.aYN();
        }
        anchoredDraggableState.N(draggableAnchors, obj);
    }

    private final void te(DraggableAnchors draggableAnchors) {
        this.anchors.setValue(draggableAnchors);
    }

    public final DraggableAnchors HI() {
        return (DraggableAnchors) this.anchors.getValue();
    }

    public final Object Ik() {
        return this.closestValue.getValue();
    }

    public final float S() {
        return this.lastVelocity.n();
    }

    public final float WPU() {
        return this.offset.n();
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    public final Object aYN() {
        return this.targetValue.getValue();
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final AnimationSpec getAnimationSpec() {
        return this.animationSpec;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mUb(Object obj, MutatePriority mutatePriority, Function4 function4, Continuation continuation) throws Throwable {
        AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        AnchoredDraggableState<T> anchoredDraggableState;
        Object objRl;
        Object objRl2;
        if (continuation instanceof AnchoredDraggableState$anchoredDrag$3) {
            anchoredDraggableState$anchoredDrag$3 = (AnchoredDraggableState$anchoredDrag$3) continuation;
            int i2 = anchoredDraggableState$anchoredDrag$3.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableState$anchoredDrag$3.J2 = i2 - Integer.MIN_VALUE;
            } else {
                anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, continuation);
            }
        }
        Object obj2 = anchoredDraggableState$anchoredDrag$3.f21116t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anchoredDraggableState$anchoredDrag$3.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            if (HI().nr(obj)) {
                try {
                    InternalMutatorMutex internalMutatorMutex = this.dragMutex;
                    AnchoredDraggableState$anchoredDrag$4 anchoredDraggableState$anchoredDrag$4 = new AnchoredDraggableState$anchoredDrag$4(this, obj, function4, null);
                    anchoredDraggableState$anchoredDrag$3.f21115n = this;
                    anchoredDraggableState$anchoredDrag$3.J2 = 1;
                    if (internalMutatorMutex.nr(mutatePriority, anchoredDraggableState$anchoredDrag$4, anchoredDraggableState$anchoredDrag$3) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    anchoredDraggableState = this;
                    anchoredDraggableState.fD(null);
                    objRl2 = anchoredDraggableState.HI().rl(anchoredDraggableState.WPU());
                    if (objRl2 != null) {
                        anchoredDraggableState.iF(objRl2);
                    }
                } catch (Throwable th) {
                    th = th;
                    anchoredDraggableState = this;
                    anchoredDraggableState.fD(null);
                    objRl = anchoredDraggableState.HI().rl(anchoredDraggableState.WPU());
                    if (objRl != null) {
                        anchoredDraggableState.iF(objRl);
                    }
                    throw th;
                }
            } else {
                iF(obj);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anchoredDraggableState = (AnchoredDraggableState) anchoredDraggableState$anchoredDrag$3.f21115n;
            try {
                ResultKt.throwOnFailure(obj2);
                anchoredDraggableState.fD(null);
                objRl2 = anchoredDraggableState.HI().rl(anchoredDraggableState.WPU());
                if (objRl2 != null && Math.abs(anchoredDraggableState.WPU() - anchoredDraggableState.HI().t(objRl2)) <= 0.5f && ((Boolean) anchoredDraggableState.confirmValueChange.invoke(objRl2)).booleanValue()) {
                    anchoredDraggableState.iF(objRl2);
                }
            } catch (Throwable th2) {
                th = th2;
                anchoredDraggableState.fD(null);
                objRl = anchoredDraggableState.HI().rl(anchoredDraggableState.WPU());
                if (objRl != null && Math.abs(anchoredDraggableState.WPU() - anchoredDraggableState.HI().t(objRl)) <= 0.5f && ((Boolean) anchoredDraggableState.confirmValueChange.invoke(objRl)).booleanValue()) {
                    anchoredDraggableState.iF(objRl);
                }
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object o() {
        return this.currentValue.getValue();
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Function1 getConfirmValueChange() {
        return this.confirmValueChange;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(MutatePriority mutatePriority, Function3 function3, Continuation continuation) throws Throwable {
        AnchoredDraggableState$anchoredDrag$1 anchoredDraggableState$anchoredDrag$1;
        AnchoredDraggableState<T> anchoredDraggableState;
        Object objRl;
        Object objRl2;
        if (continuation instanceof AnchoredDraggableState$anchoredDrag$1) {
            anchoredDraggableState$anchoredDrag$1 = (AnchoredDraggableState$anchoredDrag$1) continuation;
            int i2 = anchoredDraggableState$anchoredDrag$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableState$anchoredDrag$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                anchoredDraggableState$anchoredDrag$1 = new AnchoredDraggableState$anchoredDrag$1(this, continuation);
            }
        }
        Object obj = anchoredDraggableState$anchoredDrag$1.f21106t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anchoredDraggableState$anchoredDrag$1.J2;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anchoredDraggableState = (AnchoredDraggableState) anchoredDraggableState$anchoredDrag$1.f21105n;
            try {
                ResultKt.throwOnFailure(obj);
                objRl2 = anchoredDraggableState.HI().rl(anchoredDraggableState.WPU());
                if (objRl2 != null && Math.abs(anchoredDraggableState.WPU() - anchoredDraggableState.HI().t(objRl2)) <= 0.5f && ((Boolean) anchoredDraggableState.confirmValueChange.invoke(objRl2)).booleanValue()) {
                    anchoredDraggableState.iF(objRl2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                objRl = anchoredDraggableState.HI().rl(anchoredDraggableState.WPU());
                if (objRl != null) {
                    anchoredDraggableState.iF(objRl);
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            InternalMutatorMutex internalMutatorMutex = this.dragMutex;
            AnchoredDraggableState$anchoredDrag$2 anchoredDraggableState$anchoredDrag$2 = new AnchoredDraggableState$anchoredDrag$2(this, function3, null);
            anchoredDraggableState$anchoredDrag$1.f21105n = this;
            anchoredDraggableState$anchoredDrag$1.J2 = 1;
            if (internalMutatorMutex.nr(mutatePriority, anchoredDraggableState$anchoredDrag$2, anchoredDraggableState$anchoredDrag$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            anchoredDraggableState = this;
            objRl2 = anchoredDraggableState.HI().rl(anchoredDraggableState.WPU());
            if (objRl2 != null) {
                anchoredDraggableState.iF(objRl2);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            anchoredDraggableState = this;
            objRl = anchoredDraggableState.HI().rl(anchoredDraggableState.WPU());
            if (objRl != null && Math.abs(anchoredDraggableState.WPU() - anchoredDraggableState.HI().t(objRl)) <= 0.5f && ((Boolean) anchoredDraggableState.confirmValueChange.invoke(objRl)).booleanValue()) {
                anchoredDraggableState.iF(objRl);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object az(float offset, Object currentValue) {
        DraggableAnchors draggableAnchorsHI = HI();
        float fT = draggableAnchorsHI.t(currentValue);
        if (fT != offset && !Float.isNaN(fT)) {
            if (fT < offset) {
                Object objN = draggableAnchorsHI.n(offset, true);
                if (objN != null) {
                    return objN;
                }
            } else {
                Object objN2 = draggableAnchorsHI.n(offset, false);
                if (objN2 != null) {
                    return objN2;
                }
            }
        }
        return currentValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object qie(float offset, Object currentValue, float velocity) {
        DraggableAnchors draggableAnchorsHI = HI();
        float fT = draggableAnchorsHI.t(currentValue);
        float fFloatValue = ((Number) this.velocityThreshold.invoke()).floatValue();
        if (fT != offset && !Float.isNaN(fT)) {
            if (fT < offset) {
                if (velocity >= fFloatValue) {
                    Object objN = draggableAnchorsHI.n(offset, true);
                    Intrinsics.checkNotNull(objN);
                    return objN;
                }
                Object objN2 = draggableAnchorsHI.n(offset, true);
                Intrinsics.checkNotNull(objN2);
                if (offset >= Math.abs(fT + Math.abs(((Number) this.positionalThreshold.invoke(Float.valueOf(Math.abs(draggableAnchorsHI.t(objN2) - fT)))).floatValue()))) {
                    return objN2;
                }
            } else {
                if (velocity <= (-fFloatValue)) {
                    Object objN3 = draggableAnchorsHI.n(offset, false);
                    Intrinsics.checkNotNull(objN3);
                    return objN3;
                }
                Object objN4 = draggableAnchorsHI.n(offset, false);
                Intrinsics.checkNotNull(objN4);
                float fAbs = Math.abs(fT - Math.abs(((Number) this.positionalThreshold.invoke(Float.valueOf(Math.abs(fT - draggableAnchorsHI.t(objN4))))).floatValue()));
                if (offset >= 0.0f ? offset <= fAbs : Math.abs(offset) >= fAbs) {
                    return objN4;
                }
            }
        }
        return currentValue;
    }

    public final void N(DraggableAnchors newAnchors, Object newTarget) {
        if (!Intrinsics.areEqual(HI(), newAnchors)) {
            te(newAnchors);
            if (!T(newTarget)) {
                fD(newTarget);
            }
        }
    }

    public final boolean ViF() {
        if (Z() != null) {
            return true;
        }
        return false;
    }

    public final Object X(float f3, Continuation continuation) throws Throwable {
        Object objO = o();
        Object objQie = qie(g(), objO, f3);
        if (((Boolean) this.confirmValueChange.invoke(objQie)).booleanValue()) {
            Object objJ2 = AnchoredDraggableKt.J2(this, objQie, f3, continuation);
            if (objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objJ2;
            }
            return Unit.INSTANCE;
        }
        Object objJ22 = AnchoredDraggableKt.J2(this, objO, f3, continuation);
        if (objJ22 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objJ22;
        }
        return Unit.INSTANCE;
    }

    public final float g() {
        if (!Float.isNaN(WPU())) {
            return WPU();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    public final float nY(float delta) {
        float fWPU;
        if (Float.isNaN(WPU())) {
            fWPU = 0.0f;
        } else {
            fWPU = WPU();
        }
        return RangesKt.coerceIn(fWPU + delta, HI().O(), HI().J2());
    }

    public final float ty(float delta) {
        float fWPU;
        float fNY = nY(delta);
        if (Float.isNaN(WPU())) {
            fWPU = 0.0f;
        } else {
            fWPU = WPU();
        }
        e(fNY);
        return fNY - fWPU;
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, draggableAnchors, function1, function0, animationSpec, (i2 & 32) != 0 ? new Function1<T, Boolean>() { // from class: androidx.compose.material.AnchoredDraggableState.2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj2) {
                return Boolean.TRUE;
            }
        } : function12);
    }

    public AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12) {
        this(obj, function1, function0, animationSpec, function12);
        te(draggableAnchors);
        T(obj);
    }
}
