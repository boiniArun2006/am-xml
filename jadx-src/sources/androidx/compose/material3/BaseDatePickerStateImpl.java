package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Stable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R$\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b\r\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/material3/BaseDatePickerStateImpl;", "", "", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Lkotlin/ranges/IntRange;Landroidx/compose/material3/SelectableDates;Ljava/util/Locale;)V", c.f62177j, "Lkotlin/ranges/IntRange;", "t", "()Lkotlin/ranges/IntRange;", "Landroidx/compose/material3/internal/CalendarModel;", "rl", "Landroidx/compose/material3/internal/CalendarModel;", "qie", "()Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "<set-?>", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/material3/SelectableDates;", "setSelectableDates", "(Landroidx/compose/material3/SelectableDates;)V", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/internal/CalendarMonth;", "nr", "_displayedMonth", "monthMillis", "J2", "()J", "(J)V", "displayedMonthMillis", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/BaseDatePickerStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2272:1\n81#2:2273\n107#2,2:2274\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/BaseDatePickerStateImpl\n*L\n1083#1:2273\n1083#1:2274,2\n*E\n"})
public abstract class BaseDatePickerStateImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final IntRange yearRange;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private MutableState _displayedMonth;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final CalendarModel calendarModel;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState selectableDates;

    public final long J2() {
        return ((CalendarMonth) this._displayedMonth.getValue()).getStartUtcTimeMillis();
    }

    public final void n(long j2) {
        CalendarMonth calendarMonthUo = this.calendarModel.Uo(j2);
        if (this.yearRange.contains(calendarMonthUo.getYear())) {
            this._displayedMonth.setValue(calendarMonthUo);
            return;
        }
        throw new IllegalArgumentException(("The display month's year (" + calendarMonthUo.getYear() + ") is out of the years range of " + this.yearRange + '.').toString());
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final CalendarModel getCalendarModel() {
        return this.calendarModel;
    }

    public final SelectableDates rl() {
        return (SelectableDates) this.selectableDates.getValue();
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final IntRange getYearRange() {
        return this.yearRange;
    }

    public BaseDatePickerStateImpl(Long l2, IntRange intRange, SelectableDates selectableDates, Locale locale) {
        CalendarMonth calendarMonthKN;
        this.yearRange = intRange;
        CalendarModel calendarModelN = CalendarModel_androidKt.n(locale);
        this.calendarModel = calendarModelN;
        this.selectableDates = SnapshotStateKt__SnapshotStateKt.O(selectableDates, null, 2, null);
        if (l2 != null) {
            calendarMonthKN = calendarModelN.Uo(l2.longValue());
            if (!intRange.contains(calendarMonthKN.getYear())) {
                throw new IllegalArgumentException(("The initial display month's year (" + calendarMonthKN.getYear() + ") is out of the years range of " + intRange + '.').toString());
            }
        } else {
            calendarMonthKN = calendarModelN.KN(calendarModelN.xMQ());
        }
        this._displayedMonth = SnapshotStateKt__SnapshotStateKt.O(calendarMonthKN, null, 2, null);
    }
}
