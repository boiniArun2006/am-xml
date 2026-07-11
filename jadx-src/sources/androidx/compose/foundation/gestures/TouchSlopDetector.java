package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u00020\b*\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000e\u001a\u00020\b*\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u0019\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/TouchSlopDetector;", "", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/geometry/Offset;", "initialPositionChange", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "touchSlop", "rl", "(F)J", "nr", "(J)F", "t", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "dragEvent", c.f62177j, "(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J", "", "O", "()V", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "J", "totalPositionChange", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/TouchSlopDetector\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,1045:1\n65#2:1046\n69#2:1049\n69#2:1051\n65#2:1054\n60#3:1047\n70#3:1050\n70#3:1052\n60#3:1055\n53#3,3:1057\n53#3,3:1061\n22#4:1048\n22#4:1053\n30#5:1056\n30#5:1060\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/TouchSlopDetector\n*L\n881#1:1046\n881#1:1049\n883#1:1051\n883#1:1054\n881#1:1047\n881#1:1050\n883#1:1052\n883#1:1055\n931#1:1057,3\n933#1:1061,3\n881#1:1048\n883#1:1053\n931#1:1056\n933#1:1060\n*E\n"})
public final class TouchSlopDetector {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private long totalPositionChange;

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, j2);
    }

    private TouchSlopDetector(Orientation orientation, long j2) {
        this.orientation = orientation;
        this.totalPositionChange = j2;
    }

    private final long rl(float touchSlop) {
        if (this.orientation == null) {
            long j2 = this.totalPositionChange;
            return Offset.ck(this.totalPositionChange, Offset.r(Offset.KN(j2, Offset.gh(j2)), touchSlop));
        }
        float fNr = nr(this.totalPositionChange) - (Math.signum(nr(this.totalPositionChange)) * touchSlop);
        float fT = t(this.totalPositionChange);
        if (this.orientation == Orientation.f16970t) {
            return Offset.O((((long) Float.floatToRawIntBits(fNr)) << 32) | (((long) Float.floatToRawIntBits(fT)) & 4294967295L));
        }
        return Offset.O((((long) Float.floatToRawIntBits(fT)) << 32) | (((long) Float.floatToRawIntBits(fNr)) & 4294967295L));
    }

    public final void O() {
        this.totalPositionChange = Offset.INSTANCE.t();
    }

    public final float nr(long j2) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.f16970t ? j2 >> 32 : j2 & 4294967295L));
    }

    public final float t(long j2) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.f16970t ? j2 & 4294967295L : j2 >> 32));
    }

    public final long n(PointerInputChange dragEvent, float touchSlop) {
        float fAbs;
        long jIk = Offset.Ik(this.totalPositionChange, Offset.ck(dragEvent.getPosition(), dragEvent.getPreviousPosition()));
        this.totalPositionChange = jIk;
        if (this.orientation == null) {
            fAbs = Offset.gh(jIk);
        } else {
            fAbs = Math.abs(nr(jIk));
        }
        if (fAbs >= touchSlop) {
            return rl(touchSlop);
        }
        return Offset.INSTANCE.rl();
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : orientation, (i2 & 2) != 0 ? Offset.INSTANCE.t() : j2, null);
    }
}
