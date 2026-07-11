package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.internal.InlineClassHelperKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\b\u000b*\u0001p\b\u0007\u0018\u0000 j*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001yB\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005B4\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\u0004\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0087@¢\u0006\u0004\b\u0011\u0010\u0012J^\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u0014\u001a\u00020\u00132B\u0010\u001c\u001a>\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015¢\u0006\u0002\b\u001bH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ{\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00028\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132W\u0010\u001c\u001aS\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(!\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00020 ¢\u0006\u0002\b\u001bH\u0086@¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rH\u0000¢\u0006\u0004\b%\u0010&R=\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R=\u00101\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\r0\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R(\u00109\u001a\b\u0012\u0004\u0012\u00020\r028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R<\u0010D\u001a\b\u0012\u0004\u0012\u00020\r0:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0:8\u0006@@X\u0087.¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bB\u0010C\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR<\u0010M\u001a\b\u0012\u0004\u0012\u00020\r0E2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0E8\u0006@@X\u0087.¢\u0006\u0018\n\u0004\bF\u0010G\u0012\u0004\bL\u0010C\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR+\u0010W\u001a\u00028\u00002\u0006\u0010;\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010\u0005R+\u0010Y\u001a\u00028\u00002\u0006\u0010;\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010S\u001a\u0004\bX\u0010U\"\u0004\b\u0001\u0010\u0005R\u001b\u0010\u001f\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010Z\u001a\u0004\b[\u0010UR+\u0010a\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010\u000f\"\u0004\b_\u0010`R!\u0010e\u001a\u00020\r8GX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bb\u0010Z\u0012\u0004\bd\u0010C\u001a\u0004\bc\u0010\u000fR+\u0010i\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010]\u001a\u0004\bg\u0010\u000f\"\u0004\bh\u0010`R/\u0010l\u001a\u0004\u0018\u00018\u00002\b\u0010;\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010S\u001a\u0004\bj\u0010U\"\u0004\bk\u0010\u0005R7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010S\u001a\u0004\bf\u0010m\"\u0004\bn\u0010oR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010qR\u001a\u0010v\u001a\u00020\n8@X\u0080\u0004¢\u0006\f\u0012\u0004\bu\u0010C\u001a\u0004\bs\u0010tR\u0011\u0010x\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bw\u0010t¨\u0006z"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "newValue", "", "confirmValueChange", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "", "g", "()F", "velocity", "s7N", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "anchors", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "KN", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "Lkotlin/Function4;", "anchor", "xMQ", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "nY", "(F)F", c.f62177j, "Lkotlin/jvm/functions/Function1;", "az", "()Lkotlin/jvm/functions/Function1;", "setConfirmValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "totalDistance", "rl", "o", "X", "positionalThreshold", "Lkotlin/Function0;", "t", "Lkotlin/jvm/functions/Function0;", "aYN", "()Lkotlin/jvm/functions/Function0;", "nHg", "(Lkotlin/jvm/functions/Function0;)V", "velocityThreshold", "Landroidx/compose/animation/core/AnimationSpec;", "<set-?>", "nr", "Landroidx/compose/animation/core/AnimationSpec;", "XQ", "()Landroidx/compose/animation/core/AnimationSpec;", "N", "(Landroidx/compose/animation/core/AnimationSpec;)V", "getSnapAnimationSpec$annotations", "()V", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "O", "Landroidx/compose/animation/core/DecayAnimationSpec;", "HI", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "iF", "(Landroidx/compose/animation/core/DecayAnimationSpec;)V", "getDecayAnimationSpec$annotations", "decayAnimationSpec", "Landroidx/compose/foundation/MutatorMutex;", "J2", "Landroidx/compose/foundation/MutatorMutex;", "dragMutex", "Uo", "Landroidx/compose/runtime/MutableState;", "ty", "()Ljava/lang/Object;", "te", "currentValue", "Z", "settledValue", "Landroidx/compose/runtime/State;", "S", "mUb", "Landroidx/compose/runtime/MutableFloatState;", "r", "e", "(F)V", "offset", "gh", "getProgress", "getProgress$annotations", "progress", "qie", "Ik", "E2", "lastVelocity", "ck", "fD", "dragTarget", "()Landroidx/compose/foundation/gestures/DraggableAnchors;", "setAnchors", "(Landroidx/compose/foundation/gestures/DraggableAnchors;)V", "androidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1", "Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1;", "anchoredDragScope", "WPU", "()Z", "getUsePreModifierChangeBehavior$foundation_release$annotations", "usePreModifierChangeBehavior", "ViF", "isAnimationRunning", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 5 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex\n*L\n1#1,1753:1\n85#2:1754\n113#2,2:1755\n85#2:1757\n113#2,2:1758\n85#2:1760\n85#2:1769\n85#2:1773\n113#2,2:1774\n85#2:1776\n113#2,2:1777\n79#3:1761\n112#3,2:1762\n79#3:1770\n112#3,2:1771\n50#4,5:1764\n96#4,5:1779\n186#5,9:1784\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n*L\n851#1:1754\n851#1:1755,2\n860#1:1757\n860#1:1758,2\n867#1:1760\n940#1:1769\n959#1:1773\n959#1:1774,2\n961#1:1776\n961#1:1777,2\n885#1:1761\n885#1:1762,2\n956#1:1770\n956#1:1771,2\n895#1:1764,5\n1029#1:1779,5\n1226#1:1784,9\n*E\n"})
public final class AnchoredDraggableState<T> {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final AnchoredDraggableState$anchoredDragScope$1 anchoredDragScope;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutatorMutex dragMutex;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MutableState settledValue;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public DecayAnimationSpec decayAnimationSpec;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableState currentValue;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final MutableState dragTarget;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final State progress;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final MutableFloatState offset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Function1 confirmValueChange;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public AnimationSpec snapAnimationSpec;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final MutableFloatState lastVelocity;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public Function1 positionalThreshold;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Function0 velocityThreshold;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final MutableState anchors;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final State targetValue;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "", c.f62177j, "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    final class AnonymousClass1 extends Lambda implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AnonymousClass1 f16537n = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    public AnchoredDraggableState(Object obj) {
        this.confirmValueChange = new Function1<T, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$confirmValueChange$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj2) {
                return Boolean.TRUE;
            }
        };
        this.dragMutex = new MutatorMutex();
        this.currentValue = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
        this.settledValue = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
        this.targetValue = SnapshotStateKt.O(new Function0<T>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$targetValue$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objCk = this.f16570n.ck();
                if (objCk != null) {
                    return objCk;
                }
                AnchoredDraggableState anchoredDraggableState = this.f16570n;
                if (Float.isNaN(anchoredDraggableState.r())) {
                    return anchoredDraggableState.ty();
                }
                Object objRl = anchoredDraggableState.qie().rl(anchoredDraggableState.r());
                return objRl == null ? anchoredDraggableState.ty() : objRl;
            }
        });
        this.offset = PrimitiveSnapshotStateKt.n(Float.NaN);
        this.progress = SnapshotStateKt.nr(SnapshotStateKt.r(), new Function0<Float>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$progress$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                float fT = this.f16569n.qie().t(this.f16569n.Z());
                float fT2 = this.f16569n.qie().t(this.f16569n.S()) - fT;
                float fAbs = Math.abs(fT2);
                float f3 = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fG = (this.f16569n.g() - fT) / fT2;
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
        this.anchors = SnapshotStateKt__SnapshotStateKt.O(AnchoredDraggableKt.ck(), null, 2, null);
        this.anchoredDragScope = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2(float f3) {
        this.lastVelocity.Z(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Object obj) {
        this.settledValue.setValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ck() {
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

    public static /* synthetic */ Object gh(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, Function4 function4, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            mutatePriority = MutatePriority.f16227n;
        }
        return anchoredDraggableState.xMQ(obj, mutatePriority, function4, continuation);
    }

    public static /* synthetic */ Object mUb(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, Function3 function3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.f16227n;
        }
        return anchoredDraggableState.KN(mutatePriority, function3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void te(Object obj) {
        this.currentValue.setValue(obj);
    }

    public final DecayAnimationSpec HI() {
        DecayAnimationSpec decayAnimationSpec = this.decayAnimationSpec;
        if (decayAnimationSpec != null) {
            return decayAnimationSpec;
        }
        Intrinsics.throwUninitializedPropertyAccessException("decayAnimationSpec");
        return null;
    }

    public final float Ik() {
        return this.lastVelocity.n();
    }

    public final Object KN(MutatePriority mutatePriority, Function3 function3, Continuation continuation) {
        Object objNr = this.dragMutex.nr(mutatePriority, new AnchoredDraggableState$anchoredDrag$2(this, function3, null), continuation);
        return objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNr : Unit.INSTANCE;
    }

    public final void N(AnimationSpec animationSpec) {
        this.snapAnimationSpec = animationSpec;
    }

    public final Object S() {
        return this.targetValue.getValue();
    }

    public final boolean WPU() {
        return (this.positionalThreshold == null || this.velocityThreshold == null || this.snapAnimationSpec == null || this.decayAnimationSpec == null) ? false : true;
    }

    public final void X(Function1 function1) {
        this.positionalThreshold = function1;
    }

    public final AnimationSpec XQ() {
        AnimationSpec animationSpec = this.snapAnimationSpec;
        if (animationSpec != null) {
            return animationSpec;
        }
        Intrinsics.throwUninitializedPropertyAccessException("snapAnimationSpec");
        return null;
    }

    public final Object Z() {
        return this.settledValue.getValue();
    }

    public final Function0 aYN() {
        Function0 function0 = this.velocityThreshold;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityThreshold");
        return null;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final Function1 getConfirmValueChange() {
        return this.confirmValueChange;
    }

    public final void iF(DecayAnimationSpec decayAnimationSpec) {
        this.decayAnimationSpec = decayAnimationSpec;
    }

    public final void nHg(Function0 function0) {
        this.velocityThreshold = function0;
    }

    public final Function1 o() {
        Function1 function1 = this.positionalThreshold;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("positionalThreshold");
        return null;
    }

    public final DraggableAnchors qie() {
        return (DraggableAnchors) this.anchors.getValue();
    }

    public final float r() {
        return this.offset.n();
    }

    public final Object ty() {
        return this.currentValue.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(Object obj, MutatePriority mutatePriority, Function4 function4, Continuation continuation) throws Throwable {
        AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        AnchoredDraggableState<T> anchoredDraggableState;
        if (continuation instanceof AnchoredDraggableState$anchoredDrag$3) {
            anchoredDraggableState$anchoredDrag$3 = (AnchoredDraggableState$anchoredDrag$3) continuation;
            int i2 = anchoredDraggableState$anchoredDrag$3.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableState$anchoredDrag$3.J2 = i2 - Integer.MIN_VALUE;
            } else {
                anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, continuation);
            }
        }
        Object obj2 = anchoredDraggableState$anchoredDrag$3.f16558t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anchoredDraggableState$anchoredDrag$3.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            if (qie().nr(obj)) {
                try {
                    MutatorMutex mutatorMutex = this.dragMutex;
                    AnchoredDraggableState$anchoredDrag$4 anchoredDraggableState$anchoredDrag$4 = new AnchoredDraggableState$anchoredDrag$4(this, obj, function4, null);
                    anchoredDraggableState$anchoredDrag$3.f16557n = this;
                    anchoredDraggableState$anchoredDrag$3.J2 = 1;
                    if (mutatorMutex.nr(mutatePriority, anchoredDraggableState$anchoredDrag$4, anchoredDraggableState$anchoredDrag$3) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    anchoredDraggableState = this;
                    anchoredDraggableState.fD(null);
                } catch (Throwable th) {
                    th = th;
                    anchoredDraggableState = this;
                    anchoredDraggableState.fD(null);
                    throw th;
                }
            } else if (((Boolean) this.confirmValueChange.invoke(obj)).booleanValue()) {
                T(obj);
                te(obj);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anchoredDraggableState = (AnchoredDraggableState) anchoredDraggableState$anchoredDrag$3.f16557n;
            try {
                ResultKt.throwOnFailure(obj2);
                anchoredDraggableState.fD(null);
            } catch (Throwable th2) {
                th = th2;
                anchoredDraggableState.fD(null);
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    public final boolean ViF() {
        if (ck() != null) {
            return true;
        }
        return false;
    }

    public final float g() {
        if (Float.isNaN(r())) {
            InlineClassHelperKt.t("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return r();
    }

    public final float nY(float delta) {
        float fR;
        if (Float.isNaN(r())) {
            fR = 0.0f;
        } else {
            fR = r();
        }
        return RangesKt.coerceIn(fR + delta, qie().O(), qie().J2());
    }

    public final Object s7N(float f3, Continuation continuation) {
        if (!WPU()) {
            InlineClassHelperKt.n("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        Object objTy = ty();
        Object objHI = AnchoredDraggableKt.HI(qie(), g(), f3, o(), aYN());
        if (((Boolean) this.confirmValueChange.invoke(objHI)).booleanValue()) {
            return AnchoredDraggableKt.az(this, objHI, f3, null, null, continuation, 12, null);
        }
        return AnchoredDraggableKt.az(this, objTy, f3, null, null, continuation, 12, null);
    }

    public AnchoredDraggableState(Object obj, Function1 function1) {
        this(obj);
        this.confirmValueChange = function1;
    }
}
