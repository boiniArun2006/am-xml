package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00072\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b#\u0010$R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b&\u0010'R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R&\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f04038&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Landroidx/compose/material3/internal/CalendarModel;", "", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/util/Locale;)V", "Landroidx/compose/material3/internal/DateInputFormat;", "t", "(Ljava/util/Locale;)Landroidx/compose/material3/internal/DateInputFormat;", "", "timeInMillis", "Landroidx/compose/material3/internal/CalendarDate;", "rl", "(J)Landroidx/compose/material3/internal/CalendarDate;", "Landroidx/compose/material3/internal/CalendarMonth;", "Uo", "(J)Landroidx/compose/material3/internal/CalendarMonth;", "date", "KN", "(Landroidx/compose/material3/internal/CalendarDate;)Landroidx/compose/material3/internal/CalendarMonth;", "", "year", "month", "J2", "(II)Landroidx/compose/material3/internal/CalendarMonth;", "from", "addedMonthsCount", "qie", "(Landroidx/compose/material3/internal/CalendarMonth;I)Landroidx/compose/material3/internal/CalendarMonth;", "utcTimeMillis", "", "pattern", c.f62177j, "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "gh", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/internal/CalendarDate;", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "", "Ljava/util/Map;", "O", "()Ljava/util/Map;", "formatterCache", "xMQ", "()Landroidx/compose/material3/internal/CalendarDate;", "today", "nr", "()I", "firstDayOfWeek", "", "Lkotlin/Pair;", "mUb", "()Ljava/util/List;", "weekdayNames", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CalendarModel {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Map formatterCache = new LinkedHashMap();

    public abstract CalendarMonth J2(int year, int month);

    public abstract CalendarMonth KN(CalendarDate date);

    public abstract CalendarMonth Uo(long timeInMillis);

    public abstract CalendarDate gh(String date, String pattern);

    /* JADX INFO: renamed from: mUb */
    public abstract List getWeekdayNames();

    public abstract String n(long utcTimeMillis, String pattern, Locale locale);

    /* JADX INFO: renamed from: nr */
    public abstract int getFirstDayOfWeek();

    public abstract CalendarMonth qie(CalendarMonth from, int addedMonthsCount);

    public abstract CalendarDate rl(long timeInMillis);

    public abstract DateInputFormat t(Locale locale);

    public abstract CalendarDate xMQ();

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Map getFormatterCache() {
        return this.formatterCache;
    }

    public CalendarModel(Locale locale) {
        this.locale = locale;
    }
}
