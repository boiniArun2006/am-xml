package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001>B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010&J+\u0010*\u001a\u00020(2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020(H\u0016¢\u0006\u0004\b.\u0010/R\u001a\u00103\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102R,\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(05048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Landroidx/compose/material3/internal/LegacyCalendarModelImpl;", "Landroidx/compose/material3/internal/CalendarModel;", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/util/Locale;)V", "", "day", "ty", "(I)I", "Ljava/util/Calendar;", "firstDayCalendar", "Landroidx/compose/material3/internal/CalendarMonth;", "HI", "(Ljava/util/Calendar;)Landroidx/compose/material3/internal/CalendarMonth;", "ck", "(Landroidx/compose/material3/internal/CalendarMonth;)Ljava/util/Calendar;", "Landroidx/compose/material3/internal/DateInputFormat;", "t", "(Ljava/util/Locale;)Landroidx/compose/material3/internal/DateInputFormat;", "", "timeInMillis", "Landroidx/compose/material3/internal/CalendarDate;", "rl", "(J)Landroidx/compose/material3/internal/CalendarDate;", "Uo", "(J)Landroidx/compose/material3/internal/CalendarMonth;", "date", "KN", "(Landroidx/compose/material3/internal/CalendarDate;)Landroidx/compose/material3/internal/CalendarMonth;", "year", "month", "J2", "(II)Landroidx/compose/material3/internal/CalendarMonth;", "from", "addedMonthsCount", "qie", "(Landroidx/compose/material3/internal/CalendarMonth;I)Landroidx/compose/material3/internal/CalendarMonth;", "utcTimeMillis", "", "pattern", c.f62177j, "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "gh", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/internal/CalendarDate;", "toString", "()Ljava/lang/String;", "I", "nr", "()I", "firstDayOfWeek", "", "Lkotlin/Pair;", "Ljava/util/List;", "mUb", "()Ljava/util/List;", "weekdayNames", "xMQ", "()Landroidx/compose/material3/internal/CalendarDate;", "today", "O", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLegacyCalendarModelImpl.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/internal/LegacyCalendarModelImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,241:1\n69#2,6:242\n*S KotlinDebug\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/internal/LegacyCalendarModelImpl\n*L\n61#1:242,6\n*E\n"})
public final class LegacyCalendarModelImpl extends CalendarModel {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final List weekdayNames;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int firstDayOfWeek;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int J2 = 8;
    private static final TimeZone Uo = DesugarTimeZone.getTimeZone("UTC");

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/internal/LegacyCalendarModelImpl$Companion;", "", "<init>", "()V", "", "pattern", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "", "cache", "Ljava/text/SimpleDateFormat;", "rl", "(Ljava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/text/SimpleDateFormat;", "", "utcTimeMillis", c.f62177j, "(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;", "Ljava/util/TimeZone;", "utcTimeZone", "Ljava/util/TimeZone;", "t", "()Ljava/util/TimeZone;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLegacyCalendarModelImpl.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/internal/LegacyCalendarModelImpl$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,241:1\n361#2,7:242\n*S KotlinDebug\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/internal/LegacyCalendarModelImpl$Companion\n*L\n192#1:242,7\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final SimpleDateFormat rl(String pattern, Locale locale, Map cache) {
            String str = pattern + locale.toLanguageTag();
            Object obj = cache.get(str);
            Object obj2 = obj;
            if (obj == null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);
                simpleDateFormat.setTimeZone(LegacyCalendarModelImpl.INSTANCE.t());
                cache.put(str, simpleDateFormat);
                obj2 = simpleDateFormat;
            }
            return (SimpleDateFormat) obj2;
        }

        public final String n(long utcTimeMillis, String pattern, Locale locale, Map cache) {
            SimpleDateFormat simpleDateFormatRl = rl(pattern, locale, cache);
            Calendar calendar = Calendar.getInstance(t());
            calendar.setTimeInMillis(utcTimeMillis);
            return simpleDateFormatRl.format(Long.valueOf(calendar.getTimeInMillis()));
        }

        public final TimeZone t() {
            return LegacyCalendarModelImpl.Uo;
        }
    }

    private final CalendarMonth HI(Calendar firstDayCalendar) {
        int iTy = ty(firstDayCalendar.get(7)) - getFirstDayOfWeek();
        if (iTy < 0) {
            iTy += 7;
        }
        return new CalendarMonth(firstDayCalendar.get(1), firstDayCalendar.get(2) + 1, firstDayCalendar.getActualMaximum(5), iTy, firstDayCalendar.getTimeInMillis());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public DateInputFormat t(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        Intrinsics.checkNotNull(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return CalendarModelKt.n(((SimpleDateFormat) dateInstance).toPattern());
    }

    private final Calendar ck(CalendarMonth calendarMonth) {
        Calendar calendar = Calendar.getInstance(Uo);
        calendar.setTimeInMillis(calendarMonth.getStartUtcTimeMillis());
        return calendar;
    }

    private final int ty(int day) {
        int i2 = (day + 6) % 7;
        if (i2 == 0) {
            return 7;
        }
        return i2;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth J2(int year, int month) {
        Calendar calendar = Calendar.getInstance(Uo);
        calendar.clear();
        calendar.set(1, year);
        calendar.set(2, month - 1);
        calendar.set(5, 1);
        return HI(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth Uo(long timeInMillis) {
        Calendar calendar = Calendar.getInstance(Uo);
        calendar.setTimeInMillis(timeInMillis);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return HI(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate gh(String date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        TimeZone timeZone = Uo;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date2 = simpleDateFormat.parse(date);
            if (date2 == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date2);
            return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    /* JADX INFO: renamed from: mUb, reason: from getter */
    public List getWeekdayNames() {
        return this.weekdayNames;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public String n(long utcTimeMillis, String pattern, Locale locale) {
        return INSTANCE.n(utcTimeMillis, pattern, locale, getFormatterCache());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    /* JADX INFO: renamed from: nr, reason: from getter */
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth qie(CalendarMonth from, int addedMonthsCount) {
        if (addedMonthsCount <= 0) {
            return from;
        }
        Calendar calendarCk = ck(from);
        calendarCk.add(2, addedMonthsCount);
        return HI(calendarCk);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate rl(long timeInMillis) {
        Calendar calendar = Calendar.getInstance(Uo);
        calendar.setTimeInMillis(timeInMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    public String toString() {
        return "LegacyCalendarModel";
    }

    public LegacyCalendarModelImpl(Locale locale) {
        super(locale);
        this.firstDayOfWeek = ty(Calendar.getInstance(locale).getFirstDayOfWeek());
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        List listDrop = ArraysKt.drop(weekdays, 2);
        int size = listDrop.size();
        for (int i2 = 0; i2 < size; i2++) {
            listCreateListBuilder.add(new Pair((String) listDrop.get(i2), shortWeekdays[i2 + 2]));
        }
        listCreateListBuilder.add(new Pair(weekdays[1], shortWeekdays[1]));
        this.weekdayNames = CollectionsKt.build(listCreateListBuilder);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth KN(CalendarDate date) {
        return J2(date.getYear(), date.getMonth());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate xMQ() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), 1 + calendar.get(2), calendar.get(5), calendar.getTimeInMillis() + ((long) (calendar.get(15) + calendar.get(16))));
    }
}
