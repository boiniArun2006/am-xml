package j$.time.format;

import j$.time.DateTimeException;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DateTimeFormatter f69016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DateTimeFormatter f69017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DateTimeFormatter f69018h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2192e f69019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Locale f69020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DecimalStyle f69021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D f69022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j$.time.chrono.p f69023e;

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.i(str);
        return dateTimeFormatterBuilder.toFormatter();
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.i(str);
        return dateTimeFormatterBuilder.w(locale);
    }

    public static DateTimeFormatter ofLocalizedDate(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "dateStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.g(formatStyle);
        return dateTimeFormatterBuilder.v(D.SMART, j$.time.chrono.p.f68978e);
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        E e2 = E.EXCEEDS_PAD;
        dateTimeFormatterBuilder.o(aVar, 4, 10, e2);
        dateTimeFormatterBuilder.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.n(aVar2, 2);
        dateTimeFormatterBuilder.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        dateTimeFormatterBuilder.n(aVar3, 2);
        D d2 = D.STRICT;
        j$.time.chrono.p pVar = j$.time.chrono.p.f68978e;
        DateTimeFormatter dateTimeFormatterV = dateTimeFormatterBuilder.v(d2, pVar);
        ISO_LOCAL_DATE = dateTimeFormatterV;
        DateTimeFormatterBuilder caseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive.a(dateTimeFormatterV);
        caseInsensitive.appendOffsetId().v(d2, pVar);
        DateTimeFormatterBuilder caseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive2.a(dateTimeFormatterV);
        caseInsensitive2.r();
        caseInsensitive2.appendOffsetId().v(d2, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        dateTimeFormatterBuilder2.n(aVar4, 2);
        dateTimeFormatterBuilder2.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder2.n(aVar5, 2);
        dateTimeFormatterBuilder2.r();
        dateTimeFormatterBuilder2.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder2.n(aVar6, 2);
        dateTimeFormatterBuilder2.r();
        dateTimeFormatterBuilder2.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterV2 = dateTimeFormatterBuilder2.v(d2, null);
        f69016f = dateTimeFormatterV2;
        DateTimeFormatterBuilder caseInsensitive3 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive3.a(dateTimeFormatterV2);
        caseInsensitive3.appendOffsetId().v(d2, null);
        DateTimeFormatterBuilder caseInsensitive4 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive4.a(dateTimeFormatterV2);
        caseInsensitive4.r();
        caseInsensitive4.appendOffsetId().v(d2, null);
        DateTimeFormatterBuilder caseInsensitive5 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive5.a(dateTimeFormatterV);
        caseInsensitive5.e('T');
        caseInsensitive5.a(dateTimeFormatterV2);
        DateTimeFormatter dateTimeFormatterV3 = caseInsensitive5.v(d2, pVar);
        DateTimeFormatterBuilder caseInsensitive6 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive6.a(dateTimeFormatterV3);
        caseInsensitive6.t();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId = caseInsensitive6.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId.u();
        DateTimeFormatter dateTimeFormatterV4 = dateTimeFormatterBuilderAppendOffsetId.v(d2, pVar);
        f69017g = dateTimeFormatterV4;
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.a(dateTimeFormatterV4);
        dateTimeFormatterBuilder3.r();
        dateTimeFormatterBuilder3.e('[');
        dateTimeFormatterBuilder3.s();
        dateTimeFormatterBuilder3.p();
        dateTimeFormatterBuilder3.e(']');
        dateTimeFormatterBuilder3.v(d2, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.a(dateTimeFormatterV3);
        dateTimeFormatterBuilder4.r();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId2 = dateTimeFormatterBuilder4.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId2.r();
        dateTimeFormatterBuilderAppendOffsetId2.e('[');
        dateTimeFormatterBuilderAppendOffsetId2.s();
        dateTimeFormatterBuilderAppendOffsetId2.p();
        dateTimeFormatterBuilderAppendOffsetId2.e(']');
        dateTimeFormatterBuilderAppendOffsetId2.v(d2, pVar);
        DateTimeFormatterBuilder caseInsensitive7 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive7.o(aVar, 4, 10, e2);
        caseInsensitive7.e('-');
        caseInsensitive7.n(j$.time.temporal.a.DAY_OF_YEAR, 3);
        caseInsensitive7.r();
        caseInsensitive7.appendOffsetId().v(d2, pVar);
        DateTimeFormatterBuilder caseInsensitive8 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive8.o(j$.time.temporal.i.f69161c, 4, 10, e2);
        caseInsensitive8.f("-W");
        caseInsensitive8.n(j$.time.temporal.i.f69160b, 2);
        caseInsensitive8.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        caseInsensitive8.n(aVar7, 1);
        caseInsensitive8.r();
        caseInsensitive8.appendOffsetId().v(d2, pVar);
        DateTimeFormatterBuilder caseInsensitive9 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive9.c();
        f69018h = caseInsensitive9.v(d2, null);
        DateTimeFormatterBuilder caseInsensitive10 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive10.n(aVar, 4);
        caseInsensitive10.n(aVar2, 2);
        caseInsensitive10.n(aVar3, 2);
        caseInsensitive10.r();
        caseInsensitive10.t();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffset = caseInsensitive10.appendOffset("+HHMMss", "Z");
        dateTimeFormatterBuilderAppendOffset.u();
        dateTimeFormatterBuilderAppendOffset.v(d2, pVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder caseInsensitive11 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive11.t();
        caseInsensitive11.r();
        caseInsensitive11.j(aVar7, map);
        caseInsensitive11.f(", ");
        caseInsensitive11.q();
        caseInsensitive11.o(aVar3, 1, 2, E.NOT_NEGATIVE);
        caseInsensitive11.e(' ');
        caseInsensitive11.j(aVar2, map2);
        caseInsensitive11.e(' ');
        caseInsensitive11.n(aVar, 4);
        caseInsensitive11.e(' ');
        caseInsensitive11.n(aVar4, 2);
        caseInsensitive11.e(':');
        caseInsensitive11.n(aVar5, 2);
        caseInsensitive11.r();
        caseInsensitive11.e(':');
        caseInsensitive11.n(aVar6, 2);
        caseInsensitive11.q();
        caseInsensitive11.e(' ');
        caseInsensitive11.appendOffset("+HHMM", "GMT").v(D.SMART, pVar);
    }

    DateTimeFormatter(C2192e c2192e, Locale locale, DecimalStyle decimalStyle, D d2, j$.time.chrono.p pVar) {
        Objects.requireNonNull(c2192e, "printerParser");
        this.f69019a = c2192e;
        Objects.requireNonNull(locale, "locale");
        this.f69020b = locale;
        Objects.requireNonNull(decimalStyle, "decimalStyle");
        this.f69021c = decimalStyle;
        Objects.requireNonNull(d2, "resolverStyle");
        this.f69022d = d2;
        this.f69023e = pVar;
    }

    public final Locale d() {
        return this.f69020b;
    }

    public final DecimalStyle c() {
        return this.f69021c;
    }

    public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) {
        if (this.f69021c.equals(decimalStyle)) {
            return this;
        }
        return new DateTimeFormatter(this.f69019a, this.f69020b, decimalStyle, this.f69022d, this.f69023e);
    }

    public final Chronology b() {
        return this.f69023e;
    }

    public final String a(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        try {
            this.f69019a.q(new y(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new DateTimeException(e2.getMessage(), e2);
        }
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(temporalQuery, "query");
        try {
            return (T) ((C) e(charSequence)).e(temporalQuery);
        } catch (DateTimeParseException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e3.getMessage(), e3);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    private TemporalAccessor e(CharSequence charSequence) {
        String string;
        ParsePosition parsePosition = new ParsePosition(0);
        w wVar = new w(this);
        int iS = this.f69019a.s(wVar, charSequence, parsePosition.getIndex());
        if (iS < 0) {
            parsePosition.setErrorIndex(~iS);
            wVar = null;
        } else {
            parsePosition.setIndex(iS);
        }
        if (wVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new DateTimeParseException(str, charSequence);
            }
            String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new DateTimeParseException(str2, charSequence);
        }
        return wVar.t(this.f69022d);
    }

    final C2192e f() {
        return this.f69019a.a();
    }

    public final String toString() {
        String string = this.f69019a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
