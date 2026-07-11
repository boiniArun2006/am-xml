package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b(\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B[\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R+\u0010'\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u001c\"\u0004\b%\u0010&R*\u0010.\u001a\u00028\u00012\u0006\u0010\"\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001e\u001a\u0004\b\u001d\u0010 \"\u0004\b/\u00100R*\u00103\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001e\u001a\u0004\b\u0019\u0010 \"\u0004\b2\u00100R+\u0010\u000e\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b1\u00104\"\u0004\b5\u00106R\u0011\u00107\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b(\u0010\u001c¨\u00068"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "initialValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialVelocityVector", "", "lastFrameTimeNanos", "targetValue", "startTimeNanos", "", "isRunning", "Lkotlin/Function0;", "", "onCancel", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationVector;JLjava/lang/Object;JZLkotlin/jvm/functions/Function0;)V", c.f62177j, "()V", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "rl", "Ljava/lang/Object;", "getTargetValue", "()Ljava/lang/Object;", "t", "J", "nr", "()J", "Lkotlin/jvm/functions/Function0;", "<set-?>", "O", "Landroidx/compose/runtime/MutableState;", "qie", "(Ljava/lang/Object;)V", "value", "J2", "Landroidx/compose/animation/core/AnimationVector;", "Uo", "()Landroidx/compose/animation/core/AnimationVector;", "az", "(Landroidx/compose/animation/core/AnimationVector;)V", "velocityVector", "mUb", "(J)V", "KN", "xMQ", "finishedTimeNanos", "()Z", "gh", "(Z)V", "velocity", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,329:1\n85#2:330\n113#2,2:331\n85#2:333\n113#2,2:334\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n*L\n129#1:330\n129#1:331,2\n161#1:333\n161#1:334,2\n*E\n"})
public final class AnimationScope<T, V extends AnimationVector> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private AnimationVector velocityVector;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private long finishedTimeNanos = Long.MIN_VALUE;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableState value;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private long lastFrameTimeNanos;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TwoWayConverter typeConverter;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Function0 onCancel;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Object targetValue;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long startTimeNanos;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MutableState isRunning;

    public final void n() {
        gh(false);
        this.onCancel.invoke();
    }

    public final Object J2() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public final boolean KN() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final Object O() {
        return this.value.getValue();
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final AnimationVector getVelocityVector() {
        return this.velocityVector;
    }

    public final void az(AnimationVector animationVector) {
        this.velocityVector = animationVector;
    }

    public final void gh(boolean z2) {
        this.isRunning.setValue(Boolean.valueOf(z2));
    }

    public final void mUb(long j2) {
        this.lastFrameTimeNanos = j2;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final void qie(Object obj) {
        this.value.setValue(obj);
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final void xMQ(long j2) {
        this.finishedTimeNanos = j2;
    }

    public AnimationScope(Object obj, TwoWayConverter twoWayConverter, AnimationVector animationVector, long j2, Object obj2, long j3, boolean z2, Function0 function0) {
        this.typeConverter = twoWayConverter;
        this.targetValue = obj2;
        this.startTimeNanos = j3;
        this.onCancel = function0;
        this.value = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
        this.velocityVector = AnimationVectorsKt.O(animationVector);
        this.lastFrameTimeNanos = j2;
        this.isRunning = SnapshotStateKt__SnapshotStateKt.O(Boolean.valueOf(z2), null, 2, null);
    }
}
