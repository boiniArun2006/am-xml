package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Stable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0003\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B?\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R(\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0013\u0010\u001f\"\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/material3/DatePickerStateImpl;", "Landroidx/compose/material3/BaseDatePickerStateImpl;", "Landroidx/compose/material3/DatePickerState;", "", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/internal/CalendarDate;", "O", "Landroidx/compose/runtime/MutableState;", "_selectedDate", "J2", "_displayMode", "dateMillis", "xMQ", "()Ljava/lang/Long;", "gh", "(Ljava/lang/Long;)V", "selectedDateMillis", "displayMode", "()I", "nr", "(I)V", "Uo", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DatePickerStateImpl extends BaseDatePickerStateImpl implements DatePickerState {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private MutableState _displayMode;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private MutableState _selectedDate;

    public /* synthetic */ DatePickerStateImpl(Long l2, Long l5, IntRange intRange, int i2, SelectableDates selectableDates, Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(l2, l5, intRange, i2, selectableDates, locale);
    }

    private DatePickerStateImpl(Long l2, Long l5, IntRange intRange, int i2, SelectableDates selectableDates, Locale locale) {
        CalendarDate calendarDateRl;
        super(l5, intRange, selectableDates, locale);
        if (l2 != null) {
            calendarDateRl = getCalendarModel().rl(l2.longValue());
            if (!intRange.contains(calendarDateRl.getYear())) {
                throw new IllegalArgumentException(("The provided initial date's year (" + calendarDateRl.getYear() + ") is out of the years range of " + intRange + '.').toString());
            }
        } else {
            calendarDateRl = null;
        }
        this._selectedDate = SnapshotStateKt__SnapshotStateKt.O(calendarDateRl, null, 2, null);
        this._displayMode = SnapshotStateKt__SnapshotStateKt.O(DisplayMode.t(i2), null, 2, null);
    }

    @Override // androidx.compose.material3.DatePickerState
    public int O() {
        return ((DisplayMode) this._displayMode.getValue()).getValue();
    }

    @Override // androidx.compose.material3.DatePickerState
    public void gh(Long l2) {
        if (l2 == null) {
            this._selectedDate.setValue(null);
            return;
        }
        CalendarDate calendarDateRl = getCalendarModel().rl(l2.longValue());
        if (getYearRange().contains(calendarDateRl.getYear())) {
            this._selectedDate.setValue(calendarDateRl);
            return;
        }
        throw new IllegalArgumentException(("The provided date's year (" + calendarDateRl.getYear() + ") is out of the years range of " + getYearRange() + '.').toString());
    }

    @Override // androidx.compose.material3.DatePickerState
    public Long xMQ() {
        CalendarDate calendarDate = (CalendarDate) this._selectedDate.getValue();
        if (calendarDate != null) {
            return Long.valueOf(calendarDate.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DatePickerState
    public void nr(int i2) {
        Long lXMQ = xMQ();
        if (lXMQ != null) {
            n(getCalendarModel().Uo(lXMQ.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.t(i2));
    }
}
