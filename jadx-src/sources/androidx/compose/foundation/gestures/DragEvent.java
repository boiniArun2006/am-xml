package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent;", "", "()V", "DragCancelled", "DragDelta", "DragStarted", "DragStopped", "Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class DragEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;", "Landroidx/compose/foundation/gestures/DragEvent;", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DragCancelled extends DragEvent {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final DragCancelled f16654n = new DragCancelled();

        private DragCancelled() {
            super(null);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/geometry/Offset;", "delta", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", c.f62177j, "J", "()J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DragDelta extends DragEvent {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final long delta;

        public /* synthetic */ DragDelta(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        private DragDelta(long j2) {
            super(null);
            this.delta = j2;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final long getDelta() {
            return this.delta;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/geometry/Offset;", "startPoint", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", c.f62177j, "J", "()J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DragStarted extends DragEvent {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final long startPoint;

        public /* synthetic */ DragStarted(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        private DragStarted(long j2) {
            super(null);
            this.startPoint = j2;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final long getStartPoint() {
            return this.startPoint;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/unit/Velocity;", "velocity", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", c.f62177j, "J", "()J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DragStopped extends DragEvent {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final long velocity;

        public /* synthetic */ DragStopped(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        private DragStopped(long j2) {
            super(null);
            this.velocity = j2;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final long getVelocity() {
            return this.velocity;
        }
    }

    public /* synthetic */ DragEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DragEvent() {
    }
}
