package androidx.compose.animation.core;

import GJW.Pl;
import GJW.eO;
import androidx.collection.MutableObjectList;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import yB.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 k*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002lmB\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00028\u00002\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b&\u0010\u001cJ\u000f\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010\u0017J\u000f\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010\u0017R+\u0010\u0006\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010\u0005R+\u00101\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010+\u001a\u0004\b/\u0010,\"\u0004\b0\u0010\u0005R\"\u00105\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00102\u001a\u0004\b3\u0010,\"\u0004\b4\u0010\u0005R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010=\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00070>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010?R+\u0010\u000b\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010N\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010T\u001a\u00020O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00108R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001f0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R \u0010e\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010h\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR \u0010j\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010d¨\u0006n"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState;", "S", "Landroidx/compose/animation/core/TransitionState;", "initialState", "<init>", "(Ljava/lang/Object;)V", "targetState", "", "M", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fraction", "Xw", "(FLjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "te", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Transition;", "transition", "J2", "(Landroidx/compose/animation/core/Transition;)V", "Uo", "()V", "wTp", "v", "E2", "bzg", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fD", "g", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "animation", "", "deltaPlayTimeNanos", "rV9", "(Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;J)V", "B", "FX", "s7N", "U", "<set-?>", "rl", "Landroidx/compose/runtime/MutableState;", "()Ljava/lang/Object;", "eF", "t", c.f62177j, "nr", "currentState", "Ljava/lang/Object;", "e", "P5", "composedTargetState", "O", "Landroidx/compose/animation/core/Transition;", "J", "nHg", "()J", "E", "(J)V", "totalDurationNanos", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "recalculateTotalDurationNanos", "KN", "Landroidx/compose/runtime/MutableFloatState;", "N", "()F", "p5", "(F)V", "LGJW/Pl;", "xMQ", "LGJW/Pl;", "X", "()LGJW/Pl;", "M7", "(LGJW/Pl;)V", "compositionContinuation", "LyB/j;", "mUb", "LyB/j;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()LyB/j;", "compositionContinuationMutex", "Landroidx/compose/animation/core/MutatorMutex;", "gh", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "qie", "lastFrameTimeNanos", "Landroidx/collection/MutableObjectList;", "az", "Landroidx/collection/MutableObjectList;", "initialValueAnimations", "ty", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "currentAnimation", "Lkotlin/Function1;", "HI", "Lkotlin/jvm/functions/Function1;", "firstFrameLambda", "ck", "F", "durationScale", "Ik", "animateOneFrameLambda", "r", "Companion", "SeekingAnimationState", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt\n+ 5 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,2141:1\n85#2:2142\n113#2,2:2143\n85#2:2145\n113#2,2:2146\n79#3:2148\n112#3,2:2149\n71#4:2151\n33#5,5:2152\n52#5,5:2181\n314#6,11:2157\n314#6,11:2168\n919#7,2:2179\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n*L\n218#1:2142\n218#1:2143,2\n221#1:2145\n221#1:2146,2\n250#1:2148\n250#1:2149,2\n413#1:2151\n482#1:2152,5\n679#1:2181,5\n523#1:2157,11\n544#1:2168,11\n573#1:2179,2\n*E\n"})
public final class SeekableTransitionState<S> extends TransitionState<S> {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final Function1 firstFrameLambda;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final Function1 animateOneFrameLambda;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private long totalDurationNanos;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MutableFloatState fraction;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Transition transition;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Function0 recalculateTotalDurationNanos;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final MutableObjectList initialValueAnimations;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private float durationScale;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MutatorMutex mutatorMutex;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final yB.j compositionContinuationMutex;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Object composedTargetState;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private long lastFrameTimeNanos;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableState targetState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState currentState;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private SeekingAnimationState currentAnimation;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private Pl compositionContinuation;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Companion f15572r = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f15571o = 8;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final AnimationVector1D f15570Z = new AnimationVector1D(0.0f);
    private static final AnimationVector1D XQ = new AnimationVector1D(1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/core/AnimationVector1D;", "ZeroVelocity", "Landroidx/compose/animation/core/AnimationVector1D;", "rl", "()Landroidx/compose/animation/core/AnimationVector1D;", "Target1", c.f62177j, "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AnimationVector1D n() {
            return SeekableTransitionState.XQ;
        }

        public final AnimationVector1D rl() {
            return SeekableTransitionState.f15570Z;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010.\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010'\u001a\u0004\b \u0010)\"\u0004\b-\u0010+R\"\u00100\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b/\u0010\rR\"\u00102\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b1\u0010\r¨\u00063"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", c.f62177j, "J", "O", "()J", "ty", "(J)V", "progressNanos", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", "rl", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "xMQ", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;)V", "animationSpec", "", "t", "Z", "KN", "()Z", "gh", "(Z)V", "isComplete", "", "nr", "F", "Uo", "()F", "HI", "(F)V", "value", "Landroidx/compose/animation/core/AnimationVector1D;", "J2", "()Landroidx/compose/animation/core/AnimationVector1D;", "setStart", "(Landroidx/compose/animation/core/AnimationVector1D;)V", TtmlNode.START, "az", "initialVelocity", "qie", "durationNanos", "mUb", "animationSpecDuration", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SeekingAnimationState {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private AnimationVector1D initialVelocity;

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private long animationSpecDuration;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private AnimationVector1D start = new AnimationVector1D(0.0f);

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private long durationNanos;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private long progressNanos;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private float value;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private VectorizedAnimationSpec animationSpec;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private boolean isComplete;

        public final void HI(float f3) {
            this.value = f3;
        }

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final AnimationVector1D getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: KN, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final long getProgressNanos() {
            return this.progressNanos;
        }

        /* JADX INFO: renamed from: Uo, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        public final void az(AnimationVector1D animationVector1D) {
            this.initialVelocity = animationVector1D;
        }

        public final void gh(boolean z2) {
            this.isComplete = z2;
        }

        public final void mUb(long j2) {
            this.animationSpecDuration = j2;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final VectorizedAnimationSpec getAnimationSpec() {
            return this.animationSpec;
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final AnimationVector1D getInitialVelocity() {
            return this.initialVelocity;
        }

        public final void qie(long j2) {
            this.durationNanos = j2;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final long getAnimationSpecDuration() {
            return this.animationSpecDuration;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final long getDurationNanos() {
            return this.durationNanos;
        }

        public String toString() {
            return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
        }

        public final void ty(long j2) {
            this.progressNanos = j2;
        }

        public final void xMQ(VectorizedAnimationSpec vectorizedAnimationSpec) {
            this.animationSpec = vectorizedAnimationSpec;
        }
    }

    public SeekableTransitionState(Object obj) {
        super(null);
        this.targetState = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
        this.currentState = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
        this.composedTargetState = obj;
        this.recalculateTotalDurationNanos = new Function0<Unit>() { // from class: androidx.compose.animation.core.SeekableTransitionState$recalculateTotalDurationNanos$1
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
                SeekableTransitionState seekableTransitionState = this.f15590n;
                Transition transition = seekableTransitionState.transition;
                seekableTransitionState.E(transition != null ? transition.r() : 0L);
            }
        };
        this.fraction = PrimitiveSnapshotStateKt.n(0.0f);
        this.compositionContinuationMutex = yB.CN3.rl(false, 1, null);
        this.mutatorMutex = new MutatorMutex();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new MutableObjectList(0, 1, null);
        this.firstFrameLambda = new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.SeekableTransitionState$firstFrameLambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                n(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void n(long j2) {
                this.f15589n.lastFrameTimeNanos = j2;
            }
        };
        this.animateOneFrameLambda = new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.SeekableTransitionState$animateOneFrameLambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                n(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void n(long j2) {
                long j3 = j2 - this.f15578n.lastFrameTimeNanos;
                this.f15578n.lastFrameTimeNanos = j2;
                long jRoundToLong = MathKt.roundToLong(j3 / ((double) this.f15578n.durationScale));
                if (this.f15578n.initialValueAnimations.KN()) {
                    MutableObjectList mutableObjectList = this.f15578n.initialValueAnimations;
                    SeekableTransitionState seekableTransitionState = this.f15578n;
                    Object[] objArr = mutableObjectList.content;
                    int i2 = mutableObjectList._size;
                    int i3 = 0;
                    for (int i5 = 0; i5 < i2; i5++) {
                        SeekableTransitionState.SeekingAnimationState seekingAnimationState = (SeekableTransitionState.SeekingAnimationState) objArr[i5];
                        seekableTransitionState.rV9(seekingAnimationState, jRoundToLong);
                        seekingAnimationState.gh(true);
                    }
                    Transition transition = this.f15578n.transition;
                    if (transition != null) {
                        transition.U();
                    }
                    MutableObjectList mutableObjectList2 = this.f15578n.initialValueAnimations;
                    int i7 = mutableObjectList2._size;
                    Object[] objArr2 = mutableObjectList2.content;
                    IntRange intRangeUntil = RangesKt.until(0, i7);
                    int first = intRangeUntil.getFirst();
                    int last = intRangeUntil.getLast();
                    if (first <= last) {
                        while (true) {
                            objArr2[first - i3] = objArr2[first];
                            if (((SeekableTransitionState.SeekingAnimationState) objArr2[first]).getIsComplete()) {
                                i3++;
                            }
                            if (first == last) {
                                break;
                            } else {
                                first++;
                            }
                        }
                    }
                    ArraysKt.fill(objArr2, (Object) null, i7 - i3, i7);
                    mutableObjectList2._size -= i3;
                }
                SeekableTransitionState.SeekingAnimationState seekingAnimationState2 = this.f15578n.currentAnimation;
                if (seekingAnimationState2 != null) {
                    seekingAnimationState2.qie(this.f15578n.getTotalDurationNanos());
                    this.f15578n.rV9(seekingAnimationState2, jRoundToLong);
                    this.f15578n.p5(seekingAnimationState2.getValue());
                    if (seekingAnimationState2.getValue() == 1.0f) {
                        this.f15578n.currentAnimation = null;
                    }
                    this.f15578n.U();
                }
            }
        };
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void Uo() {
        this.transition = null;
        TransitionKt.Uo().qie(this);
    }

    public final Object Xw(float f3, Object obj, Continuation continuation) {
        boolean z2 = false;
        if (0.0f <= f3 && f3 <= 1.0f) {
            z2 = true;
        }
        if (!z2) {
            PreconditionsKt.n("Expecting fraction between 0 and 1. Got " + f3);
        }
        Transition transition = this.transition;
        if (transition == null) {
            return Unit.INSTANCE;
        }
        Object objO = MutatorMutex.O(this.mutatorMutex, null, new SeekableTransitionState$seekTo$3(obj, rl(), this, transition, f3, null), continuation, 1, null);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(Continuation continuation) {
        SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 seekableTransitionState$waitForCompositionAfterTargetStateChange$1;
        Object objRl;
        SeekableTransitionState<S> seekableTransitionState;
        Object obj;
        SeekableTransitionState<S> seekableTransitionState2;
        if (continuation instanceof SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) {
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = (SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) continuation;
            int i2 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15616r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15616r = i2 - Integer.MIN_VALUE;
            } else {
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = new SeekableTransitionState$waitForCompositionAfterTargetStateChange$1(this, continuation);
            }
        }
        Object obj2 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15614O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15616r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            objRl = rl();
            yB.j jVar = this.compositionContinuationMutex;
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15615n = this;
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15617t = objRl;
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15616r = 1;
            if (j.C1281j.n(jVar, null, seekableTransitionState$waitForCompositionAfterTargetStateChange$1, 1, null) != coroutine_suspended) {
                seekableTransitionState = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15617t;
            seekableTransitionState2 = (SeekableTransitionState) seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15615n;
            ResultKt.throwOnFailure(obj2);
            if (!Intrinsics.areEqual(obj2, obj)) {
                seekableTransitionState2.lastFrameTimeNanos = Long.MIN_VALUE;
                throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
            }
            return Unit.INSTANCE;
        }
        Object obj3 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15617t;
        seekableTransitionState = (SeekableTransitionState) seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15615n;
        ResultKt.throwOnFailure(obj2);
        objRl = obj3;
        if (Intrinsics.areEqual(objRl, seekableTransitionState.composedTargetState)) {
            j.C1281j.t(seekableTransitionState.compositionContinuationMutex, null, 1, null);
            return Unit.INSTANCE;
        }
        seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15615n = seekableTransitionState;
        seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15617t = objRl;
        seekableTransitionState$waitForCompositionAfterTargetStateChange$1.f15616r = 2;
        eO eOVar = new eO(IntrinsicsKt.intercepted(seekableTransitionState$waitForCompositionAfterTargetStateChange$1), 1);
        eOVar.e();
        seekableTransitionState.M7(eOVar);
        j.C1281j.t(seekableTransitionState.getCompositionContinuationMutex(), null, 1, null);
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(seekableTransitionState$waitForCompositionAfterTargetStateChange$1);
        }
        if (objWPU != coroutine_suspended) {
            obj = objRl;
            obj2 = objWPU;
            seekableTransitionState2 = seekableTransitionState;
            if (!Intrinsics.areEqual(obj2, obj)) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2() {
        Transition transition = this.transition;
        if (transition != null) {
            transition.Uo();
        }
        this.initialValueAnimations.Z();
        if (this.currentAnimation != null) {
            this.currentAnimation = null;
            p5(1.0f);
            U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object FX(Continuation continuation) {
        SeekableTransitionState$waitForComposition$1 seekableTransitionState$waitForComposition$1;
        Object objRl;
        SeekableTransitionState<S> seekableTransitionState;
        Object obj;
        SeekableTransitionState<S> seekableTransitionState2;
        if (continuation instanceof SeekableTransitionState$waitForComposition$1) {
            seekableTransitionState$waitForComposition$1 = (SeekableTransitionState$waitForComposition$1) continuation;
            int i2 = seekableTransitionState$waitForComposition$1.f15612r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                seekableTransitionState$waitForComposition$1.f15612r = i2 - Integer.MIN_VALUE;
            } else {
                seekableTransitionState$waitForComposition$1 = new SeekableTransitionState$waitForComposition$1(this, continuation);
            }
        }
        Object obj2 = seekableTransitionState$waitForComposition$1.f15610O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = seekableTransitionState$waitForComposition$1.f15612r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            objRl = rl();
            yB.j jVar = this.compositionContinuationMutex;
            seekableTransitionState$waitForComposition$1.f15611n = this;
            seekableTransitionState$waitForComposition$1.f15613t = objRl;
            seekableTransitionState$waitForComposition$1.f15612r = 1;
            if (j.C1281j.n(jVar, null, seekableTransitionState$waitForComposition$1, 1, null) != coroutine_suspended) {
                seekableTransitionState = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = seekableTransitionState$waitForComposition$1.f15613t;
            seekableTransitionState2 = (SeekableTransitionState) seekableTransitionState$waitForComposition$1.f15611n;
            ResultKt.throwOnFailure(obj2);
            if (!Intrinsics.areEqual(obj2, obj)) {
                return Unit.INSTANCE;
            }
            seekableTransitionState2.lastFrameTimeNanos = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        Object obj3 = seekableTransitionState$waitForComposition$1.f15613t;
        seekableTransitionState = (SeekableTransitionState) seekableTransitionState$waitForComposition$1.f15611n;
        ResultKt.throwOnFailure(obj2);
        objRl = obj3;
        seekableTransitionState$waitForComposition$1.f15611n = seekableTransitionState;
        seekableTransitionState$waitForComposition$1.f15613t = objRl;
        seekableTransitionState$waitForComposition$1.f15612r = 2;
        eO eOVar = new eO(IntrinsicsKt.intercepted(seekableTransitionState$waitForComposition$1), 1);
        eOVar.e();
        seekableTransitionState.M7(eOVar);
        j.C1281j.t(seekableTransitionState.getCompositionContinuationMutex(), null, 1, null);
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(seekableTransitionState$waitForComposition$1);
        }
        if (objWPU != coroutine_suspended) {
            obj = objRl;
            obj2 = objWPU;
            seekableTransitionState2 = seekableTransitionState;
            if (!Intrinsics.areEqual(obj2, obj)) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U() {
        Transition transition = this.transition;
        if (transition == null) {
            return;
        }
        transition.N(MathKt.roundToLong(((double) N()) * transition.r()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.t(r10, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bzg(Continuation continuation) {
        SeekableTransitionState$runAnimations$1 seekableTransitionState$runAnimations$1;
        SeekableTransitionState<S> seekableTransitionState;
        if (continuation instanceof SeekableTransitionState$runAnimations$1) {
            seekableTransitionState$runAnimations$1 = (SeekableTransitionState$runAnimations$1) continuation;
            int i2 = seekableTransitionState$runAnimations$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                seekableTransitionState$runAnimations$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                seekableTransitionState$runAnimations$1 = new SeekableTransitionState$runAnimations$1(this, continuation);
            }
        }
        Object obj = seekableTransitionState$runAnimations$1.f15593t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = seekableTransitionState$runAnimations$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.initialValueAnimations.Uo() && this.currentAnimation == null) {
                return Unit.INSTANCE;
            }
            if (SuspendAnimationKt.HI(seekableTransitionState$runAnimations$1.get$context()) == 0.0f) {
                E2();
                this.lastFrameTimeNanos = Long.MIN_VALUE;
                return Unit.INSTANCE;
            }
            if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
                Function1 function1 = this.firstFrameLambda;
                seekableTransitionState$runAnimations$1.f15592n = this;
                seekableTransitionState$runAnimations$1.J2 = 1;
            }
            seekableTransitionState = this;
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            seekableTransitionState = (SeekableTransitionState) seekableTransitionState$runAnimations$1.f15592n;
            ResultKt.throwOnFailure(obj);
        }
        do {
            if (!seekableTransitionState.initialValueAnimations.KN() && seekableTransitionState.currentAnimation == null) {
                seekableTransitionState.lastFrameTimeNanos = Long.MIN_VALUE;
                return Unit.INSTANCE;
            }
            seekableTransitionState$runAnimations$1.f15592n = seekableTransitionState;
            seekableTransitionState$runAnimations$1.J2 = 2;
        } while (seekableTransitionState.g(seekableTransitionState$runAnimations$1) != coroutine_suspended);
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fD(Continuation continuation) {
        if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
            Object objT = MonotonicFrameClockKt.t(this.firstFrameLambda, continuation);
            return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : Unit.INSTANCE;
        }
        Object objG = g(continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : Unit.INSTANCE;
    }

    public static /* synthetic */ Object iF(SeekableTransitionState seekableTransitionState, Object obj, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = seekableTransitionState.rl();
        }
        if ((i2 & 2) != 0) {
            finiteAnimationSpec = null;
        }
        return seekableTransitionState.te(obj, finiteAnimationSpec, continuation);
    }

    public static /* synthetic */ Object jB(SeekableTransitionState seekableTransitionState, float f3, Object obj, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            obj = seekableTransitionState.rl();
        }
        return seekableTransitionState.Xw(f3, obj, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p5(float f3) {
        this.fraction.Z(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s7N() {
        Transition transition = this.transition;
        if (transition == null) {
            return;
        }
        SeekingAnimationState seekingAnimationState = this.currentAnimation;
        if (seekingAnimationState == null) {
            if (this.totalDurationNanos <= 0 || N() == 1.0f || Intrinsics.areEqual(n(), rl())) {
                seekingAnimationState = null;
            } else {
                seekingAnimationState = new SeekingAnimationState();
                seekingAnimationState.HI(N());
                long j2 = this.totalDurationNanos;
                seekingAnimationState.qie(j2);
                seekingAnimationState.mUb(MathKt.roundToLong(j2 * (1.0d - ((double) N()))));
                seekingAnimationState.getStart().O(0, N());
            }
        }
        if (seekingAnimationState != null) {
            seekingAnimationState.qie(this.totalDurationNanos);
            this.initialValueAnimations.ty(seekingAnimationState);
            transition.nHg(seekingAnimationState);
        }
        this.currentAnimation = null;
    }

    public final void E(long j2) {
        this.totalDurationNanos = j2;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void J2(Transition transition) {
        Transition transition2 = this.transition;
        if (!(transition2 == null || Intrinsics.areEqual(transition, transition2))) {
            PreconditionsKt.rl("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition);
        }
        this.transition = transition;
    }

    public final Object M(Object obj, Continuation continuation) {
        Transition transition = this.transition;
        if (transition == null) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(n(), obj) && Intrinsics.areEqual(rl(), obj)) {
            return Unit.INSTANCE;
        }
        Object objO = MutatorMutex.O(this.mutatorMutex, null, new SeekableTransitionState$snapTo$2(this, obj, transition, null), continuation, 1, null);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    public final void M7(Pl pl) {
        this.compositionContinuation = pl;
    }

    public final float N() {
        return this.fraction.n();
    }

    public final void P5(Object obj) {
        this.composedTargetState = obj;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final yB.j getCompositionContinuationMutex() {
        return this.compositionContinuationMutex;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final Pl getCompositionContinuation() {
        return this.compositionContinuation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Object getComposedTargetState() {
        return this.composedTargetState;
    }

    public void eF(Object obj) {
        this.targetState.setValue(obj);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public Object n() {
        return this.currentState.getValue();
    }

    /* JADX INFO: renamed from: nHg, reason: from getter */
    public final long getTotalDurationNanos() {
        return this.totalDurationNanos;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void nr(Object obj) {
        this.currentState.setValue(obj);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public Object rl() {
        return this.targetState.getValue();
    }

    public final Object te(Object obj, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation) {
        Transition transition = this.transition;
        if (transition == null) {
            return Unit.INSTANCE;
        }
        Object objO = MutatorMutex.O(this.mutatorMutex, null, new SeekableTransitionState$animateTo$2(transition, this, obj, finiteAnimationSpec, null), continuation, 1, null);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    public final void v() {
        long j2 = this.totalDurationNanos;
        wTp();
        long j3 = this.totalDurationNanos;
        if (j2 != j3) {
            SeekingAnimationState seekingAnimationState = this.currentAnimation;
            if (seekingAnimationState == null) {
                if (j3 != 0) {
                    U();
                    return;
                }
                return;
            }
            long progressNanos = seekingAnimationState.getProgressNanos();
            long j4 = this.totalDurationNanos;
            if (progressNanos > j4) {
                E2();
                return;
            }
            seekingAnimationState.qie(j4);
            if (seekingAnimationState.getAnimationSpec() == null) {
                seekingAnimationState.mUb(MathKt.roundToLong((1.0d - ((double) seekingAnimationState.getStart().n(0))) * this.totalDurationNanos));
            }
        }
    }

    private final Object g(Continuation continuation) {
        float fHI = SuspendAnimationKt.HI(continuation.get$context());
        if (fHI <= 0.0f) {
            E2();
            return Unit.INSTANCE;
        }
        this.durationScale = fHI;
        Object objT = MonotonicFrameClockKt.t(this.animateOneFrameLambda, continuation);
        if (objT == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objT;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rV9(SeekingAnimationState animation, long deltaPlayTimeNanos) {
        long progressNanos = animation.getProgressNanos() + deltaPlayTimeNanos;
        animation.ty(progressNanos);
        long animationSpecDuration = animation.getAnimationSpecDuration();
        if (progressNanos >= animationSpecDuration) {
            animation.HI(1.0f);
            return;
        }
        VectorizedAnimationSpec animationSpec = animation.getAnimationSpec();
        if (animationSpec != null) {
            AnimationVector1D start = animation.getStart();
            AnimationVector1D animationVector1D = XQ;
            AnimationVector1D initialVelocity = animation.getInitialVelocity();
            if (initialVelocity == null) {
                initialVelocity = f15570Z;
            }
            animation.HI(RangesKt.coerceIn(((AnimationVector1D) animationSpec.Uo(progressNanos, start, animationVector1D, initialVelocity)).n(0), 0.0f, 1.0f));
            return;
        }
        float f3 = progressNanos / animationSpecDuration;
        animation.HI((animation.getStart().n(0) * (1 - f3)) + (f3 * 1.0f));
    }

    public final void wTp() {
        TransitionKt.Uo().ck(this, TransitionKt.f15689n, this.recalculateTotalDurationNanos);
    }
}
