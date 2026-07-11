package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\b\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b$\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u000e\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b \u0010+R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b&\u00103R\u001d\u0010\u0013\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u001d\u0010\u0014\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b)\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "uptime", "Landroidx/compose/ui/geometry/Offset;", "positionOnScreen", "position", "", "down", "", "pressure", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "activeHover", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "scrollDelta", "originalEventPosition", "<init>", "(JJJJZFIZLjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", c.f62177j, "J", "nr", "()J", "rl", "gh", "t", "Uo", "J2", "O", "Z", "()Z", "F", "KN", "()F", "I", "mUb", "xMQ", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PointerInputEventData {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final float pressure;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata and from toString */
    private final boolean activeHover;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean down;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata and from toString */
    private final long originalEventPosition;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata and from toString */
    private final long scrollDelta;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final long position;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final long uptime;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long positionOnScreen;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata and from toString */
    private final List historical;

    public /* synthetic */ PointerInputEventData(long j2, long j3, long j4, long j5, boolean z2, float f3, int i2, boolean z3, List list, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, z2, f3, i2, z3, list, j6, j7);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) other;
        return PointerId.t(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.mUb(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.mUb(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.KN(this.type, pointerInputEventData.type) && this.activeHover == pointerInputEventData.activeHover && Intrinsics.areEqual(this.historical, pointerInputEventData.historical) && Offset.mUb(this.scrollDelta, pointerInputEventData.scrollDelta) && Offset.mUb(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    public int hashCode() {
        return (((((((((((((((((((PointerId.nr(this.id) * 31) + Long.hashCode(this.uptime)) * 31) + Offset.HI(this.positionOnScreen)) * 31) + Offset.HI(this.position)) * 31) + Boolean.hashCode(this.down)) * 31) + Float.hashCode(this.pressure)) * 31) + PointerType.xMQ(this.type)) * 31) + Boolean.hashCode(this.activeHover)) * 31) + this.historical.hashCode()) * 31) + Offset.HI(this.scrollDelta)) * 31) + Offset.HI(this.originalEventPosition);
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.O(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.o(this.positionOnScreen)) + ", position=" + ((Object) Offset.o(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.mUb(this.type)) + ", activeHover=" + this.activeHover + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.o(this.scrollDelta)) + ", originalEventPosition=" + ((Object) Offset.o(this.originalEventPosition)) + ')';
    }

    private PointerInputEventData(long j2, long j3, long j4, long j5, boolean z2, float f3, int i2, boolean z3, List list, long j6, long j7) {
        this.id = j2;
        this.uptime = j3;
        this.positionOnScreen = j4;
        this.position = j5;
        this.down = z2;
        this.pressure = f3;
        this.type = i2;
        this.activeHover = z3;
        this.historical = list;
        this.scrollDelta = j6;
        this.originalEventPosition = j7;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final long getPositionOnScreen() {
        return this.positionOnScreen;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getActiveHover() {
        return this.activeHover;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final boolean getDown() {
        return this.down;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final List getHistorical() {
        return this.historical;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }
}
