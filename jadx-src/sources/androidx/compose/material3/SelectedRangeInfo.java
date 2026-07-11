package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffsetKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0011\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo;", "", "Landroidx/compose/ui/unit/IntOffset;", "gridStartCoordinates", "gridEndCoordinates", "", "firstIsSelectionStart", "lastIsSelectionEnd", "<init>", "(JJZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", c.f62177j, "J", "t", "()J", "rl", "Z", "()Z", "nr", "O", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SelectedRangeInfo {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long gridStartCoordinates;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final boolean lastIsSelectionEnd;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long gridEndCoordinates;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean firstIsSelectionStart;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/internal/CalendarMonth;", "month", "Landroidx/compose/material3/internal/CalendarDate;", "startDate", "endDate", "Landroidx/compose/material3/SelectedRangeInfo;", c.f62177j, "(Landroidx/compose/material3/internal/CalendarMonth;Landroidx/compose/material3/internal/CalendarDate;Landroidx/compose/material3/internal/CalendarDate;)Landroidx/compose/material3/SelectedRangeInfo;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SelectedRangeInfo n(CalendarMonth month, CalendarDate startDate, CalendarDate endDate) {
            boolean z2;
            boolean z3;
            int daysFromStartOfWeekToFirstOfMonth;
            int daysFromStartOfWeekToFirstOfMonth2;
            if (startDate.getUtcTimeMillis() <= month.getEndUtcTimeMillis() && endDate.getUtcTimeMillis() >= month.getStartUtcTimeMillis()) {
                if (startDate.getUtcTimeMillis() >= month.getStartUtcTimeMillis()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (endDate.getUtcTimeMillis() <= month.getEndUtcTimeMillis()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    daysFromStartOfWeekToFirstOfMonth = (month.getDaysFromStartOfWeekToFirstOfMonth() + startDate.getDayOfMonth()) - 1;
                } else {
                    daysFromStartOfWeekToFirstOfMonth = month.getDaysFromStartOfWeekToFirstOfMonth();
                }
                if (z3) {
                    daysFromStartOfWeekToFirstOfMonth2 = (month.getDaysFromStartOfWeekToFirstOfMonth() + endDate.getDayOfMonth()) - 1;
                } else {
                    daysFromStartOfWeekToFirstOfMonth2 = (month.getDaysFromStartOfWeekToFirstOfMonth() + month.getNumberOfDays()) - 1;
                }
                return new SelectedRangeInfo(IntOffsetKt.n(daysFromStartOfWeekToFirstOfMonth % 7, daysFromStartOfWeekToFirstOfMonth / 7), IntOffsetKt.n(daysFromStartOfWeekToFirstOfMonth2 % 7, daysFromStartOfWeekToFirstOfMonth2 / 7), z2, z3, null);
            }
            return null;
        }
    }

    public /* synthetic */ SelectedRangeInfo(long j2, long j3, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, z2, z3);
    }

    private SelectedRangeInfo(long j2, long j3, boolean z2, boolean z3) {
        this.gridStartCoordinates = j2;
        this.gridEndCoordinates = j3;
        this.firstIsSelectionStart = z2;
        this.lastIsSelectionEnd = z3;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final long getGridEndCoordinates() {
        return this.gridEndCoordinates;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getGridStartCoordinates() {
        return this.gridStartCoordinates;
    }
}
