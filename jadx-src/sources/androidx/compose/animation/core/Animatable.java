package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ_\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000f\u001a\u00028\u00002%\u0010\u0013\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJg\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u001c\u001a\u00028\u00002\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010\u000f\u001a\u00028\u00002'\b\u0002\u0010\u0013\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b&\u0010'R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R&\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R+\u0010?\u001a\u0002082\u0006\u00109\u001a\u0002088F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010\u001c\u001a\u00028\u00002\u0006\u00109\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010FR \u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010O\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001a\u0010M\u0012\u0004\bN\u0010\u001bR\u001a\u0010Q\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b5\u0010M\u0012\u0004\bP\u0010\u001bR\u0016\u0010R\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010MR\u0016\u0010S\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010MR\u0011\u0010\u0017\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bT\u0010BR\u0011\u0010W\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0011\u0010Y\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bX\u0010B¨\u0006Z"}, d2 = {"Landroidx/compose/animation/core/Animatable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "initialValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "visibilityThreshold", "", "label", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "Landroidx/compose/animation/core/Animation;", "animation", "initialVelocity", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/animation/core/AnimationResult;", "r", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "KN", "(Ljava/lang/Object;)Ljava/lang/Object;", "xMQ", "()V", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "O", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "XQ", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "S", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "Uo", "()Landroidx/compose/runtime/State;", c.f62177j, "Landroidx/compose/animation/core/TwoWayConverter;", "az", "()Landroidx/compose/animation/core/TwoWayConverter;", "rl", "Ljava/lang/Object;", "t", "Ljava/lang/String;", "gh", "()Ljava/lang/String;", "Landroidx/compose/animation/core/AnimationState;", "nr", "Landroidx/compose/animation/core/AnimationState;", "mUb", "()Landroidx/compose/animation/core/AnimationState;", "internalState", "", "<set-?>", "Landroidx/compose/runtime/MutableState;", "Ik", "()Z", "o", "(Z)V", "isRunning", "J2", "qie", "()Ljava/lang/Object;", "Z", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/MutatorMutex;", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "defaultSpringSpec", "Landroidx/compose/animation/core/AnimationVector;", "getNegativeInfinityBounds$annotations", "negativeInfinityBounds", "getPositiveInfinityBounds$annotations", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", "ty", "ck", "()Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "HI", "velocity", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,492:1\n85#2:493\n113#2,2:494\n85#2:496\n113#2,2:497\n1#3:499\n52#4,5:500\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n86#1:493\n86#1:494,2\n93#1:496\n93#1:497,2\n171#1:500,5\n*E\n"})
public final class Animatable<T, V extends AnimationVector> {
    public static final int az = 8;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableState targetValue;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final SpringSpec defaultSpringSpec;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableState isRunning;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutatorMutex mutatorMutex;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private AnimationVector lowerBoundVector;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final AnimationVector positiveInfinityBounds;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TwoWayConverter typeConverter;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final AnimationState internalState;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private AnimationVector upperBoundVector;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Object visibilityThreshold;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final AnimationVector negativeInfinityBounds;

    public Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str) {
        this.typeConverter = twoWayConverter;
        this.visibilityThreshold = obj2;
        this.label = str;
        this.internalState = new AnimationState(twoWayConverter, obj, null, 0L, 0L, false, 60, null);
        this.isRunning = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
        this.targetValue = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec(0.0f, 0.0f, obj2, 3, null);
        AnimationVector animationVectorCk = ck();
        AnimationVector animationVector = animationVectorCk instanceof AnimationVector1D ? AnimatableKt.f15415O : animationVectorCk instanceof AnimationVector2D ? AnimatableKt.J2 : animationVectorCk instanceof AnimationVector3D ? AnimatableKt.Uo : AnimatableKt.KN;
        Intrinsics.checkNotNull(animationVector, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = animationVector;
        AnimationVector animationVectorCk2 = ck();
        AnimationVector animationVector2 = animationVectorCk2 instanceof AnimationVector1D ? AnimatableKt.f15416n : animationVectorCk2 instanceof AnimationVector2D ? AnimatableKt.rl : animationVectorCk2 instanceof AnimationVector3D ? AnimatableKt.f15417t : AnimatableKt.nr;
        Intrinsics.checkNotNull(animationVector2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = animationVector2;
        this.lowerBoundVector = animationVector;
        this.upperBoundVector = animationVector2;
    }

    public static /* synthetic */ Object J2(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation, int i2, Object obj3) {
        if ((i2 & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            obj2 = animatable.HI();
        }
        Object obj4 = obj2;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        return animatable.O(obj, animationSpec2, obj4, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object KN(Object value) {
        if (Intrinsics.areEqual(this.lowerBoundVector, this.negativeInfinityBounds) && Intrinsics.areEqual(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        AnimationVector animationVector = (AnimationVector) this.typeConverter.getConvertToVector().invoke(value);
        int size = animationVector.getSize();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (animationVector.n(i2) < this.lowerBoundVector.n(i2) || animationVector.n(i2) > this.upperBoundVector.n(i2)) {
                animationVector.O(i2, RangesKt.coerceIn(animationVector.n(i2), this.lowerBoundVector.n(i2), this.upperBoundVector.n(i2)));
                z2 = true;
            }
        }
        return z2 ? this.typeConverter.getConvertFromVector().invoke(animationVector) : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(Object obj) {
        this.targetValue.setValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(boolean z2) {
        this.isRunning.setValue(Boolean.valueOf(z2));
    }

    private final Object r(Animation animation, Object obj, Function1 function1, Continuation continuation) {
        return MutatorMutex.O(this.mutatorMutex, null, new Animatable$runAnimation$2(this, obj, animation, this.internalState.getLastFrameTimeNanos(), function1, null), continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xMQ() {
        AnimationState animationState = this.internalState;
        animationState.getVelocityVector().nr();
        animationState.e(Long.MIN_VALUE);
        o(false);
    }

    public final Object HI() {
        return this.typeConverter.getConvertFromVector().invoke(ck());
    }

    public final boolean Ik() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final Object S(Continuation continuation) {
        Object objO = MutatorMutex.O(this.mutatorMutex, null, new Animatable$stop$2(this, null), continuation, 1, null);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    public final State Uo() {
        return this.internalState;
    }

    public final Object XQ(Object obj, Continuation continuation) {
        Object objO = MutatorMutex.O(this.mutatorMutex, null, new Animatable$snapTo$2(this, obj, null), continuation, 1, null);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final TwoWayConverter getTypeConverter() {
        return this.typeConverter;
    }

    public final AnimationVector ck() {
        return this.internalState.getVelocityVector();
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final AnimationState getInternalState() {
        return this.internalState;
    }

    public final Object qie() {
        return this.targetValue.getValue();
    }

    public final Object ty() {
        return this.internalState.getValue();
    }

    public final Object O(Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation) {
        return r(AnimationKt.rl(animationSpec, this.typeConverter, ty(), obj, obj2), obj2, function1, continuation);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i2 & 4) != 0 ? null : obj2, (i2 & 8) != 0 ? "Animatable" : str);
    }
}
