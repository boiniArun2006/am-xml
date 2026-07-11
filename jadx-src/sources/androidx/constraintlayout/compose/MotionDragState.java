package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/constraintlayout/compose/MotionDragState;", "", "", "isDragging", "Landroidx/compose/ui/geometry/Offset;", "dragAmount", "Landroidx/compose/ui/unit/Velocity;", "velocity", "<init>", "(ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Z", "t", "()Z", "rl", "J", "()J", "nr", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MotionDragState {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDragging;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final long dragAmount;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long velocity;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/constraintlayout/compose/MotionDragState$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "dragAmount", "Landroidx/constraintlayout/compose/MotionDragState;", c.f62177j, "(J)Landroidx/constraintlayout/compose/MotionDragState;", "Landroidx/compose/ui/unit/Velocity;", "velocity", "rl", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MotionDragState n(long dragAmount) {
            return new MotionDragState(true, dragAmount, Velocity.INSTANCE.n(), null);
        }

        public final MotionDragState rl(long velocity) {
            return new MotionDragState(false, Offset.INSTANCE.rl(), velocity, null);
        }
    }

    public /* synthetic */ MotionDragState(boolean z2, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, j2, j3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MotionDragState)) {
            return false;
        }
        MotionDragState motionDragState = (MotionDragState) other;
        return this.isDragging == motionDragState.isDragging && Offset.mUb(this.dragAmount, motionDragState.dragAmount) && Velocity.Uo(this.velocity, motionDragState.velocity);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isDragging) * 31) + Offset.HI(this.dragAmount)) * 31) + Velocity.mUb(this.velocity);
    }

    public String toString() {
        return "MotionDragState(isDragging=" + this.isDragging + ", dragAmount=" + ((Object) Offset.o(this.dragAmount)) + ", velocity=" + ((Object) Velocity.ty(this.velocity)) + ')';
    }

    private MotionDragState(boolean z2, long j2, long j3) {
        this.isDragging = z2;
        this.dragAmount = j2;
        this.velocity = j3;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getDragAmount() {
        return this.dragAmount;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final long getVelocity() {
        return this.velocity;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsDragging() {
        return this.isDragging;
    }
}
