package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0003\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001(BI\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010!R*\u0010$\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0019\u0010%\"\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/material3/DateRangePickerStateImpl;", "Landroidx/compose/material3/BaseDatePickerStateImpl;", "Landroidx/compose/material3/DateRangePickerState;", "", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "startDateMillis", "endDateMillis", "", "KN", "(Ljava/lang/Long;Ljava/lang/Long;)V", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/internal/CalendarDate;", "O", "Landroidx/compose/runtime/MutableState;", "_selectedStartDate", "J2", "_selectedEndDate", "Uo", "_displayMode", "mUb", "()Ljava/lang/Long;", "selectedStartDateMillis", "selectedEndDateMillis", "displayMode", "()I", "nr", "(I)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerStateImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1072:1\n1#2:1073\n*E\n"})
final class DateRangePickerStateImpl extends BaseDatePickerStateImpl implements DateRangePickerState {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private MutableState _selectedEndDate;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private MutableState _selectedStartDate;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private MutableState _displayMode;

    public /* synthetic */ DateRangePickerStateImpl(Long l2, Long l5, Long l6, IntRange intRange, int i2, SelectableDates selectableDates, Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(l2, l5, l6, intRange, i2, selectableDates, locale);
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public void KN(Long startDateMillis, Long endDateMillis) {
        CalendarDate calendarDateRl = startDateMillis != null ? getCalendarModel().rl(startDateMillis.longValue()) : null;
        CalendarDate calendarDateRl2 = endDateMillis != null ? getCalendarModel().rl(endDateMillis.longValue()) : null;
        if (calendarDateRl != null && !getYearRange().contains(calendarDateRl.getYear())) {
            throw new IllegalArgumentException(("The provided start date year (" + calendarDateRl.getYear() + ") is out of the years range of " + getYearRange() + '.').toString());
        }
        if (calendarDateRl2 != null && !getYearRange().contains(calendarDateRl2.getYear())) {
            throw new IllegalArgumentException(("The provided end date year (" + calendarDateRl2.getYear() + ") is out of the years range of " + getYearRange() + '.').toString());
        }
        if (calendarDateRl2 != null) {
            if (calendarDateRl == null) {
                throw new IllegalArgumentException("An end date was provided without a start date.");
            }
            if (calendarDateRl.getUtcTimeMillis() > calendarDateRl2.getUtcTimeMillis()) {
                throw new IllegalArgumentException("The provided end date appears before the start date.");
            }
        }
        this._selectedStartDate.setValue(calendarDateRl);
        this._selectedEndDate.setValue(calendarDateRl2);
    }

    private DateRangePickerStateImpl(Long l2, Long l5, Long l6, IntRange intRange, int i2, SelectableDates selectableDates, Locale locale) {
        super(l6, intRange, selectableDates, locale);
        this._selectedStartDate = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this._selectedEndDate = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        KN(l2, l5);
        this._displayMode = SnapshotStateKt__SnapshotStateKt.O(DisplayMode.t(i2), null, 2, null);
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public int O() {
        return ((DisplayMode) this._displayMode.getValue()).getValue();
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public Long Uo() {
        CalendarDate calendarDate = (CalendarDate) this._selectedEndDate.getValue();
        if (calendarDate != null) {
            return Long.valueOf(calendarDate.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public Long mUb() {
        CalendarDate calendarDate = (CalendarDate) this._selectedStartDate.getValue();
        if (calendarDate != null) {
            return Long.valueOf(calendarDate.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public void nr(int i2) {
        Long lMUb = mUb();
        if (lMUb != null) {
            n(getCalendarModel().Uo(lMUb.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.t(i2));
    }
}
