package androidx.compose.animation.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001am\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015\u001ak\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/AnimationState;", "value", "velocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "J2", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)Landroidx/compose/animation/core/AnimationState;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "velocity", "O", "(Landroidx/compose/animation/core/AnimationState;FFJJZ)Landroidx/compose/animation/core/AnimationState;", "initialValue", "initialVelocity", c.f62177j, "(FFJJZ)Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "rl", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;JJZ)Landroidx/compose/animation/core/AnimationState;", "xMQ", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n1#2:330\n*E\n"})
public final class AnimationStateKt {
    public static final AnimationState J2(AnimationState animationState, Object obj, AnimationVector animationVector, long j2, long j3, boolean z2) {
        return new AnimationState(animationState.getTypeConverter(), obj, animationVector, j2, j3, z2);
    }

    public static /* synthetic */ AnimationState KN(AnimationState animationState, Object obj, AnimationVector animationVector, long j2, long j3, boolean z2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = animationState.getValue();
        }
        if ((i2 & 2) != 0) {
            animationVector = AnimationVectorsKt.O(animationState.getVelocityVector());
        }
        if ((i2 & 4) != 0) {
            j2 = animationState.getLastFrameTimeNanos();
        }
        if ((i2 & 8) != 0) {
            j3 = animationState.getFinishedTimeNanos();
        }
        if ((i2 & 16) != 0) {
            z2 = animationState.getIsRunning();
        }
        boolean z3 = z2;
        long j4 = j3;
        return J2(animationState, obj, animationVector, j2, j4, z3);
    }

    public static final AnimationState O(AnimationState animationState, float f3, float f4, long j2, long j3, boolean z2) {
        return new AnimationState(animationState.getTypeConverter(), Float.valueOf(f3), AnimationVectorsKt.n(f4), j2, j3, z2);
    }

    public static /* synthetic */ AnimationState Uo(AnimationState animationState, float f3, float f4, long j2, long j3, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = ((Number) animationState.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f4 = ((AnimationVector1D) animationState.getVelocityVector()).getValue();
        }
        if ((i2 & 4) != 0) {
            j2 = animationState.getLastFrameTimeNanos();
        }
        if ((i2 & 8) != 0) {
            j3 = animationState.getFinishedTimeNanos();
        }
        if ((i2 & 16) != 0) {
            z2 = animationState.getIsRunning();
        }
        boolean z3 = z2;
        long j4 = j3;
        return O(animationState, f3, f4, j2, j4, z3);
    }

    public static final AnimationState n(float f3, float f4, long j2, long j3, boolean z2) {
        return new AnimationState(VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE), Float.valueOf(f3), AnimationVectorsKt.n(f4), j2, j3, z2);
    }

    public static /* synthetic */ AnimationState nr(TwoWayConverter twoWayConverter, Object obj, Object obj2, long j2, long j3, boolean z2, int i2, Object obj3) {
        if ((i2 & 8) != 0) {
            j2 = Long.MIN_VALUE;
        }
        if ((i2 & 16) != 0) {
            j3 = Long.MIN_VALUE;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        }
        return rl(twoWayConverter, obj, obj2, j2, j3, z2);
    }

    public static final AnimationState rl(TwoWayConverter twoWayConverter, Object obj, Object obj2, long j2, long j3, boolean z2) {
        return new AnimationState(twoWayConverter, obj, (AnimationVector) twoWayConverter.getConvertToVector().invoke(obj2), j2, j3, z2);
    }

    public static /* synthetic */ AnimationState t(float f3, float f4, long j2, long j3, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            j2 = Long.MIN_VALUE;
        }
        if ((i2 & 8) != 0) {
            j3 = Long.MIN_VALUE;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        return n(f3, f4, j2, j3, z2);
    }

    public static final AnimationVector xMQ(TwoWayConverter twoWayConverter, Object obj) {
        AnimationVector animationVector = (AnimationVector) twoWayConverter.getConvertToVector().invoke(obj);
        animationVector.nr();
        return animationVector;
    }
}
