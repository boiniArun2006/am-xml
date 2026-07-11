package androidx.compose.material3;

import androidx.compose.material3.InputIdentifier;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Stable
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u001b\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b\u001f\u0010-R$\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,\"\u0004\b\u001d\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/material3/DateInputValidator;", "", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Landroidx/compose/material3/internal/DateInputFormat;", "dateInputFormat", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "", "errorDatePattern", "errorDateOutOfYearRange", "errorInvalidNotAllowed", "errorInvalidRangeInput", "", "currentStartDateMillis", "currentEndDateMillis", "<init>", "(Lkotlin/ranges/IntRange;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/DateInputFormat;Landroidx/compose/material3/DatePickerFormatter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "Landroidx/compose/material3/internal/CalendarDate;", "dateToValidate", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "t", "(Landroidx/compose/material3/internal/CalendarDate;ILjava/util/Locale;)Ljava/lang/String;", c.f62177j, "Lkotlin/ranges/IntRange;", "rl", "Landroidx/compose/material3/SelectableDates;", "Landroidx/compose/material3/internal/DateInputFormat;", "nr", "Landroidx/compose/material3/DatePickerFormatter;", "O", "Ljava/lang/String;", "J2", "Uo", "KN", "xMQ", "Ljava/lang/Long;", "getCurrentStartDateMillis$material3_release", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "mUb", "getCurrentEndDateMillis$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DateInputValidator {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final String errorDateOutOfYearRange;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final String errorInvalidRangeInput;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final String errorDatePattern;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final String errorInvalidNotAllowed;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private Long currentEndDateMillis;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final IntRange yearRange;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final DatePickerFormatter dateFormatter;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final SelectableDates selectableDates;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final DateInputFormat dateInputFormat;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private Long currentStartDateMillis;

    public DateInputValidator(IntRange intRange, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4, Long l2, Long l5) {
        this.yearRange = intRange;
        this.selectableDates = selectableDates;
        this.dateInputFormat = dateInputFormat;
        this.dateFormatter = datePickerFormatter;
        this.errorDatePattern = str;
        this.errorDateOutOfYearRange = str2;
        this.errorInvalidNotAllowed = str3;
        this.errorInvalidRangeInput = str4;
        this.currentStartDateMillis = l2;
        this.currentEndDateMillis = l5;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String t(CalendarDate dateToValidate, int inputIdentifier, Locale locale) {
        if (dateToValidate == null) {
            String str = this.errorDatePattern;
            String upperCase = this.dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String str2 = String.format(str, Arrays.copyOf(new Object[]{upperCase}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(this, *args)");
            return str2;
        }
        if (!this.yearRange.contains(dateToValidate.getYear())) {
            String str3 = String.format(this.errorDateOutOfYearRange, Arrays.copyOf(new Object[]{CalendarLocale_jvmKt.t(this.yearRange.getFirst(), 0, 0, false, 7, null), CalendarLocale_jvmKt.t(this.yearRange.getLast(), 0, 0, false, 7, null)}, 2));
            Intrinsics.checkNotNullExpressionValue(str3, "format(this, *args)");
            return str3;
        }
        SelectableDates selectableDates = this.selectableDates;
        if (!selectableDates.n(dateToValidate.getYear()) || !selectableDates.rl(dateToValidate.getUtcTimeMillis())) {
            String str4 = String.format(this.errorInvalidNotAllowed, Arrays.copyOf(new Object[]{DatePickerFormatter.n(this.dateFormatter, Long.valueOf(dateToValidate.getUtcTimeMillis()), locale, false, 4, null)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(this, *args)");
            return str4;
        }
        InputIdentifier.Companion companion = InputIdentifier.INSTANCE;
        if (InputIdentifier.J2(inputIdentifier, companion.t())) {
            long utcTimeMillis = dateToValidate.getUtcTimeMillis();
            Long l2 = this.currentEndDateMillis;
            if (utcTimeMillis < (l2 != null ? l2.longValue() : Long.MAX_VALUE)) {
                if (!InputIdentifier.J2(inputIdentifier, companion.n())) {
                    return "";
                }
                long utcTimeMillis2 = dateToValidate.getUtcTimeMillis();
                Long l5 = this.currentStartDateMillis;
                if (utcTimeMillis2 >= (l5 != null ? l5.longValue() : Long.MIN_VALUE)) {
                    return "";
                }
            }
        }
        return this.errorInvalidRangeInput;
    }

    public final void n(Long l2) {
        this.currentEndDateMillis = l2;
    }

    public final void rl(Long l2) {
        this.currentStartDateMillis = l2;
    }

    public /* synthetic */ DateInputValidator(IntRange intRange, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4, Long l2, Long l5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(intRange, selectableDates, dateInputFormat, datePickerFormatter, str, str2, str3, str4, (i2 & 256) != 0 ? null : l2, (i2 & 512) != 0 ? null : l5);
    }
}
