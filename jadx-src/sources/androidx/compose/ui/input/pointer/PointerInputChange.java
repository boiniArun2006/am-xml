package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b-\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014Bw\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJz\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0084\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b+\u0010*R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b5\u0010*R\u001d\u0010\r\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010*R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b8\u00100R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\u0012\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b<\u0010*R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010=R(\u0010\u0018\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b6\u0010*\"\u0004\b?\u0010@R\"\u0010D\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010.\u001a\u0004\bA\u00100\"\u0004\bB\u0010CR\"\u0010G\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010.\u001a\u0004\bE\u00100\"\u0004\bF\u0010CR$\u0010M\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F¢\u0006\f\u0012\u0004\bO\u0010\u001c\u001a\u0004\b1\u0010NR\u0011\u0010Q\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bP\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "uptimeMillis", "Landroidx/compose/ui/geometry/Offset;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "scrollDelta", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", c.f62177j, "()V", "currentTime", "currentPosition", "currentPressed", "previousTime", "rl", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "nr", "(JJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "toString", "()Ljava/lang/String;", "J", "J2", "()J", "HI", "t", "KN", "Z", "xMQ", "()Z", "O", "F", "mUb", "()F", "getPreviousUptimeMillis", "Uo", "gh", "qie", "I", "ty", "()I", "az", "Ljava/util/List;", "_historical", "setOriginalEventPosition-k-4lQ0M$ui_release", "(J)V", "getDownChange$ui_release", "setDownChange$ui_release", "(Z)V", "downChange", "getPositionChange$ui_release", "setPositionChange$ui_release", "positionChange", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "getConsumedDelegate$ui_release", "()Landroidx/compose/ui/input/pointer/PointerInputChange;", "setConsumedDelegate$ui_release", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "consumedDelegate", "()Ljava/util/List;", "getHistorical$annotations", "ck", "isConsumed", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointerInputChange {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private PointerInputChange consumedDelegate;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final long previousUptimeMillis;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata and from toString */
    private final boolean previousPressed;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final float pressure;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata and from toString */
    private final long previousPosition;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private boolean downChange;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private List _historical;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final long scrollDelta;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final boolean pressed;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private long originalEventPosition;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final long uptimeMillis;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long position;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private boolean positionChange;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata and from toString */
    private final int type;

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z2, float f3, long j5, long j6, boolean z3, boolean z4, int i2, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z2, f3, j5, j6, z3, z4, i2, j7);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z2, float f3, long j5, long j6, boolean z3, boolean z4, int i2, List list, long j7, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z2, f3, j5, j6, z3, z4, i2, list, j7, j9);
    }

    public static /* synthetic */ PointerInputChange t(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, int i2, List list, long j7, int i3, Object obj) {
        long j9;
        long j10 = (i3 & 1) != 0 ? pointerInputChange.id : j2;
        long j11 = (i3 & 2) != 0 ? pointerInputChange.uptimeMillis : j3;
        long j12 = (i3 & 4) != 0 ? pointerInputChange.position : j4;
        boolean z4 = (i3 & 8) != 0 ? pointerInputChange.pressed : z2;
        long j13 = (i3 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j5;
        long j14 = (i3 & 32) != 0 ? pointerInputChange.previousPosition : j6;
        boolean z5 = (i3 & 64) != 0 ? pointerInputChange.previousPressed : z3;
        int i5 = (i3 & 128) != 0 ? pointerInputChange.type : i2;
        if ((i3 & 512) != 0) {
            j9 = pointerInputChange.scrollDelta;
            j10 = j10;
        } else {
            j9 = j7;
        }
        return pointerInputChange.rl(j10, j11, j12, z4, j13, j14, z5, i5, list, j9);
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    public final List O() {
        List list = this._historical;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    public final boolean ck() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        return pointerInputChange != null ? pointerInputChange.ck() : this.downChange || this.positionChange;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    public final void n() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            this.downChange = true;
            this.positionChange = true;
        } else if (pointerInputChange != null) {
            pointerInputChange.n();
        }
    }

    public final PointerInputChange nr(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, List historical, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, historical, scrollDelta, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final PointerInputChange rl(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, List historical, long scrollDelta) {
        PointerInputChange pointerInputChangeNr = nr(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, historical, scrollDelta);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        pointerInputChangeNr.consumedDelegate = pointerInputChange;
        return pointerInputChangeNr;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.O(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.o(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.o(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + ck() + ", type=" + ((Object) PointerType.mUb(this.type)) + ", historical=" + O() + ",scrollDelta=" + ((Object) Offset.o(this.scrollDelta)) + ')';
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final boolean getPressed() {
        return this.pressed;
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z2, float f3, long j5, long j6, boolean z3, boolean z4, int i2, long j7) {
        this.id = j2;
        this.uptimeMillis = j3;
        this.position = j4;
        this.pressed = z2;
        this.pressure = f3;
        this.previousUptimeMillis = j5;
        this.previousPosition = j6;
        this.previousPressed = z3;
        this.type = i2;
        this.scrollDelta = j7;
        this.originalEventPosition = Offset.INSTANCE.t();
        this.downChange = z4;
        this.positionChange = z4;
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z2, float f3, long j5, long j6, boolean z3, boolean z4, int i2, long j7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z2, f3, j5, j6, z3, z4, (i3 & 512) != 0 ? PointerType.INSTANCE.nr() : i2, (i3 & 1024) != 0 ? Offset.INSTANCE.t() : j7, null);
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z2, float f3, long j5, long j6, boolean z3, boolean z4, int i2, List list, long j7, long j9) {
        this(j2, j3, j4, z2, f3, j5, j6, z3, z4, i2, j7, null);
        this._historical = list;
        this.originalEventPosition = j9;
    }
}
