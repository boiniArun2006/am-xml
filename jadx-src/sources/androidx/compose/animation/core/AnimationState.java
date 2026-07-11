package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0001\u0010\u001cR*\u0010$\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R*\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u00105\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b4\u0010\u001b¨\u00066"}, d2 = {"Landroidx/compose/animation/core/AnimationState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "initialVelocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "<init>", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)V", "", "toString", "()Ljava/lang/String;", c.f62177j, "Landroidx/compose/animation/core/TwoWayConverter;", "XQ", "()Landroidx/compose/animation/core/TwoWayConverter;", "<set-?>", "t", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "value", "O", "Landroidx/compose/animation/core/AnimationVector;", "iF", "()Landroidx/compose/animation/core/AnimationVector;", "N", "(Landroidx/compose/animation/core/AnimationVector;)V", "velocityVector", "J2", "J", "ck", "()J", "e", "(J)V", "r", "HI", "E2", "o", "Z", "fD", "()Z", "X", "(Z)V", "te", "velocity", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,329:1\n85#2:330\n113#2,2:331\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n*L\n49#1:330\n49#1:331,2\n*E\n"})
public final class AnimationState<T, V extends AnimationVector> implements State<T> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private long lastFrameTimeNanos;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private AnimationVector velocityVector;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TwoWayConverter typeConverter;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isRunning;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private long finishedTimeNanos;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState value;

    public AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j2, long j3, boolean z2) {
        AnimationVector animationVectorO;
        this.typeConverter = twoWayConverter;
        this.value = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
        this.velocityVector = (animationVector == null || (animationVectorO = AnimationVectorsKt.O(animationVector)) == null) ? AnimationStateKt.xMQ(twoWayConverter, obj) : animationVectorO;
        this.lastFrameTimeNanos = j2;
        this.finishedTimeNanos = j3;
        this.isRunning = z2;
    }

    public final void E2(long j2) {
        this.finishedTimeNanos = j2;
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final void N(AnimationVector animationVector) {
        this.velocityVector = animationVector;
    }

    public void T(Object obj) {
        this.value.setValue(obj);
    }

    public final void X(boolean z2) {
        this.isRunning = z2;
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final TwoWayConverter getTypeConverter() {
        return this.typeConverter;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final void e(long j2) {
        this.lastFrameTimeNanos = j2;
    }

    /* JADX INFO: renamed from: fD, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        return this.value.getValue();
    }

    /* JADX INFO: renamed from: iF, reason: from getter */
    public final AnimationVector getVelocityVector() {
        return this.velocityVector;
    }

    public final Object te() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + te() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
    }

    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j2, long j3, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(twoWayConverter, obj, (i2 & 4) != 0 ? null : animationVector, (i2 & 8) != 0 ? Long.MIN_VALUE : j2, (i2 & 16) != 0 ? Long.MIN_VALUE : j3, (i2 & 32) != 0 ? false : z2);
    }
}
