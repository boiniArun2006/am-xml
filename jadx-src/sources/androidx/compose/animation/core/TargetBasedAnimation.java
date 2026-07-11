package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BG\b\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\rBG\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR*\u0010'\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u00008\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010+\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u00008\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u0016\u0010-\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0016\u0010.\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0014\u0010\u000b\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010,R\u0014\u00106\u001a\u00028\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00105R\u0011\u0010\t\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b3\u0010$R\u0014\u0010\n\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010$R\u0014\u00109\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u00108R\u0014\u0010;\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010:¨\u0006<"}, d2 = {"Landroidx/compose/animation/core/TargetBasedAnimation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/Animation;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "targetValue", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "", "playTimeNanos", "J2", "(J)Ljava/lang/Object;", "rl", "(J)Landroidx/compose/animation/core/AnimationVector;", "", "toString", "()Ljava/lang/String;", c.f62177j, "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "getAnimationSpec$animation_core_release", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/TwoWayConverter;", "O", "()Landroidx/compose/animation/core/TwoWayConverter;", "value", "t", "Ljava/lang/Object;", "getMutableTargetValue$animation_core_release", "()Ljava/lang/Object;", "gh", "(Ljava/lang/Object;)V", "mutableTargetValue", "nr", "getMutableInitialValue$animation_core_release", "mUb", "mutableInitialValue", "Landroidx/compose/animation/core/AnimationVector;", "initialValueVector", "targetValueVector", "Uo", "KN", "J", "_durationNanos", "xMQ", "_endVelocity", "()Landroidx/compose/animation/core/AnimationVector;", "endVelocity", "", "()Z", "isInfinite", "()J", "durationNanos", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,497:1\n52#2,5:498\n1#3:503\n*S KotlinDebug\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n*L\n274#1:498,5\n*E\n"})
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private AnimationVector targetValueVector;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private long _durationNanos;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private AnimationVector initialValueVector;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final AnimationVector initialVelocityVector;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final VectorizedAnimationSpec animationSpec;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Object mutableInitialValue;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final TwoWayConverter typeConverter;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Object mutableTargetValue;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private AnimationVector _endVelocity;

    public TargetBasedAnimation(VectorizedAnimationSpec vectorizedAnimationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector) {
        AnimationVector animationVectorO;
        this.animationSpec = vectorizedAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.mutableTargetValue = obj2;
        this.mutableInitialValue = obj;
        this.initialValueVector = (AnimationVector) getTypeConverter().getConvertToVector().invoke(obj);
        this.targetValueVector = (AnimationVector) getTypeConverter().getConvertToVector().invoke(obj2);
        this.initialVelocityVector = (animationVector == null || (animationVectorO = AnimationVectorsKt.O(animationVector)) == null) ? AnimationVectorsKt.Uo((AnimationVector) getTypeConverter().getConvertToVector().invoke(obj)) : animationVectorO;
        this._durationNanos = -1L;
    }

    private final AnimationVector KN() {
        AnimationVector animationVector = this._endVelocity;
        if (animationVector != null) {
            return animationVector;
        }
        AnimationVector animationVectorO = this.animationSpec.O(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        this._endVelocity = animationVectorO;
        return animationVectorO;
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: O, reason: from getter */
    public TwoWayConverter getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: Uo, reason: from getter */
    public Object getMutableTargetValue() {
        return this.mutableTargetValue;
    }

    public final void gh(Object obj) {
        if (Intrinsics.areEqual(this.mutableTargetValue, obj)) {
            return;
        }
        this.mutableTargetValue = obj;
        this.targetValueVector = (AnimationVector) getTypeConverter().getConvertToVector().invoke(obj);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public final void mUb(Object obj) {
        if (Intrinsics.areEqual(obj, this.mutableInitialValue)) {
            return;
        }
        this.mutableInitialValue = obj;
        this.initialValueVector = (AnimationVector) getTypeConverter().getConvertToVector().invoke(obj);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean n() {
        return this.animationSpec.n();
    }

    @Override // androidx.compose.animation.core.Animation
    public long nr() {
        if (this._durationNanos < 0) {
            this._durationNanos = this.animationSpec.t(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        }
        return this._durationNanos;
    }

    public String toString() {
        return "TargetBasedAnimation: " + getMutableInitialValue() + " -> " + getMutableTargetValue() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + AnimationKt.t(this) + " ms,animationSpec: " + this.animationSpec;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final Object getMutableInitialValue() {
        return this.mutableInitialValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public Object J2(long playTimeNanos) {
        if (!t(playTimeNanos)) {
            AnimationVector animationVectorUo = this.animationSpec.Uo(playTimeNanos, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
            int size = animationVectorUo.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                if (Float.isNaN(animationVectorUo.n(i2))) {
                    PreconditionsKt.rl("AnimationVector cannot contain a NaN. " + animationVectorUo + ". Animation: " + this + ", playTimeNanos: " + playTimeNanos);
                }
            }
            return getTypeConverter().getConvertFromVector().invoke(animationVectorUo);
        }
        return getMutableTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public AnimationVector rl(long playTimeNanos) {
        if (!t(playTimeNanos)) {
            return this.animationSpec.J2(playTimeNanos, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        }
        return KN();
    }

    public /* synthetic */ TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(animationSpec, twoWayConverter, obj, obj2, (i2 & 16) != 0 ? null : animationVector);
    }

    public TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector) {
        this(animationSpec.n(twoWayConverter), twoWayConverter, obj, obj2, animationVector);
    }
}
