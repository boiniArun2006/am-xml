package j$.time.format;

import androidx.media3.container.MdtaMetadataEntry;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class DateTimeFormatterBuilder {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C2188a f69024h = new C2188a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final HashMap f69025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f69026j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DateTimeFormatterBuilder f69027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DateTimeFormatterBuilder f69028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f69029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f69030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private char f69032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69033g;

    static {
        HashMap map = new HashMap();
        f69025i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.p pVar = j$.time.temporal.i.f69159a;
        map.put('Q', pVar);
        map.put('q', pVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.k.f69167a);
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        DateFormat dateTimeInstance;
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (formatStyle2 == null) {
            dateTimeInstance = DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        } else if (formatStyle == null) {
            dateTimeInstance = DateFormat.getTimeInstance(formatStyle2.ordinal(), locale);
        } else {
            dateTimeInstance = DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        }
        if (dateTimeInstance instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
            if (pattern == null) {
                return null;
            }
            int i2 = 0;
            boolean z2 = pattern.indexOf(66) != -1;
            boolean z3 = pattern.indexOf(98) != -1;
            if (!z2 && !z3) {
                return pattern;
            }
            StringBuilder sb = new StringBuilder(pattern.length());
            char c2 = ' ';
            while (i2 < pattern.length()) {
                char cCharAt = pattern.charAt(i2);
                if (cCharAt != ' ') {
                    if (cCharAt != 'B' && cCharAt != 'b') {
                        sb.append(cCharAt);
                    }
                } else if (i2 == 0 || (c2 != 'B' && c2 != 'b')) {
                    sb.append(cCharAt);
                }
                i2++;
                c2 = cCharAt;
            }
            int length = sb.length() - 1;
            if (length >= 0 && sb.charAt(length) == ' ') {
                sb.deleteCharAt(length);
            }
            return sb.toString();
        }
        throw new UnsupportedOperationException("Can't determine pattern from " + dateTimeInstance);
    }

    public DateTimeFormatterBuilder() {
        this.f69027a = this;
        this.f69029c = new ArrayList();
        this.f69033g = -1;
        this.f69028b = null;
        this.f69030d = false;
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.f69027a = this;
        this.f69029c = new ArrayList();
        this.f69033g = -1;
        this.f69028b = dateTimeFormatterBuilder;
        this.f69030d = true;
    }

    public final void s() {
        d(r.SENSITIVE);
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        d(r.INSENSITIVE);
        return this;
    }

    public final void u() {
        d(r.STRICT);
    }

    public final void t() {
        d(r.LENIENT);
    }

    public final void m(j$.time.temporal.p pVar) {
        l(new k(pVar, 1, 19, E.NORMAL));
    }

    public final void n(j$.time.temporal.p pVar, int i2) {
        Objects.requireNonNull(pVar, "field");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
        l(new k(pVar, i2, i2, E.NOT_NEGATIVE));
    }

    public final void o(j$.time.temporal.p pVar, int i2, int i3, E e2) {
        if (i2 == i3 && e2 == E.NOT_NEGATIVE) {
            n(pVar, i3);
            return;
        }
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(e2, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
        }
        l(new k(pVar, i2, i3, e2));
    }

    private void l(k kVar) {
        k kVarE;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f69027a;
        int i2 = dateTimeFormatterBuilder.f69033g;
        if (i2 >= 0) {
            k kVar2 = (k) dateTimeFormatterBuilder.f69029c.get(i2);
            int i3 = kVar.f69062b;
            int i5 = kVar.f69063c;
            if (i3 == i5 && kVar.f69064d == E.NOT_NEGATIVE) {
                kVarE = kVar2.f(i5);
                d(kVar.e());
                this.f69027a.f69033g = i2;
            } else {
                kVarE = kVar2.e();
                this.f69027a.f69033g = d(kVar);
            }
            this.f69027a.f69029c.set(i2, kVarE);
            return;
        }
        dateTimeFormatterBuilder.f69033g = d(kVar);
    }

    public final void b(j$.time.temporal.a aVar, int i2, int i3, boolean z2) {
        if (i2 == i3 && !z2) {
            l(new g(aVar, i2, i3, z2));
        } else {
            d(new g(aVar, i2, i3, z2));
        }
    }

    public final void k(j$.time.temporal.p pVar, TextStyle textStyle) {
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        d(new s(pVar, textStyle, B.c()));
    }

    public final void j(j$.time.temporal.a aVar, HashMap map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        d(new s(aVar, textStyle, new C2189b(new A(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void c() {
        d(new h());
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        d(l.f69067e);
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        d(new l(str, str2));
        return this;
    }

    public final void h(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        d(new i(textStyle, 0));
    }

    public final void p() {
        d(new u(f69024h, "ZoneRegionId()"));
    }

    public final void g(FormatStyle formatStyle) {
        d(new j(formatStyle));
    }

    public final void e(char c2) {
        d(new C2191d(c2));
    }

    public final void f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            d(new C2191d(str.charAt(0)));
        } else {
            d(new i(str, 1));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.f());
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        int i2;
        int i3;
        char c2;
        boolean z2;
        int i5;
        int i7;
        Objects.requireNonNull(str, "pattern");
        int i8 = 0;
        while (i8 < str.length()) {
            char cCharAt = str.charAt(i8);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i9 = i8 + 1;
                while (i9 < str.length() && str.charAt(i9) == cCharAt) {
                    i9++;
                }
                int i10 = i9 - i8;
                if (cCharAt == 'p') {
                    if (i9 >= str.length() || (((cCharAt = str.charAt(i9)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i5 = i9;
                        i7 = i10;
                        i10 = 0;
                    } else {
                        i5 = i9 + 1;
                        while (i5 < str.length() && str.charAt(i5) == cCharAt) {
                            i5++;
                        }
                        i7 = i5 - i9;
                    }
                    if (i10 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i10 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i10);
                    }
                    DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f69027a;
                    dateTimeFormatterBuilder.f69031e = i10;
                    dateTimeFormatterBuilder.f69032f = ' ';
                    dateTimeFormatterBuilder.f69033g = -1;
                    i10 = i7;
                    i2 = i5;
                } else {
                    i2 = i9;
                }
                j$.time.temporal.p pVar = (j$.time.temporal.p) f69025i.get(Character.valueOf(cCharAt));
                if (pVar == null) {
                    char c4 = cCharAt;
                    if (c4 == 'z') {
                        if (i10 > 4) {
                            throw new IllegalArgumentException("Too many pattern letters: " + c4);
                        }
                        if (i10 == 4) {
                            d(new v(TextStyle.FULL, false));
                        } else {
                            d(new v(TextStyle.SHORT, false));
                        }
                    } else if (c4 == 'V') {
                        if (i10 != 2) {
                            throw new IllegalArgumentException("Pattern letter count must be 2: " + c4);
                        }
                        d(new u(j$.time.temporal.q.g(), "ZoneId()"));
                    } else if (c4 != 'v') {
                        String str2 = "+0000";
                        if (c4 == 'Z') {
                            if (i10 < 4) {
                                appendOffset("+HHMM", "+0000");
                            } else if (i10 == 4) {
                                h(TextStyle.FULL);
                            } else {
                                if (i10 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + c4);
                                }
                                appendOffset("+HH:MM:ss", "Z");
                            }
                        } else if (c4 == 'O') {
                            if (i10 == 1) {
                                h(TextStyle.SHORT);
                            } else {
                                if (i10 != 4) {
                                    throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + c4);
                                }
                                h(TextStyle.FULL);
                            }
                        } else if (c4 == 'X') {
                            if (i10 > 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + c4);
                            }
                            appendOffset(l.f69066d[i10 + (i10 == 1 ? 0 : 1)], "Z");
                        } else if (c4 == 'x') {
                            if (i10 > 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + c4);
                            }
                            if (i10 == 1) {
                                str2 = "+00";
                            } else if (i10 % 2 != 0) {
                                str2 = "+00:00";
                            }
                            appendOffset(l.f69066d[i10 + (i10 == 1 ? 0 : 1)], str2);
                        } else if (c4 != 'W') {
                            int i11 = i10;
                            if (c4 == 'w') {
                                if (i11 > 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + c4);
                                }
                                l(new t(c4, i11, i11, 2, 0));
                            } else {
                                if (c4 != 'Y') {
                                    throw new IllegalArgumentException("Unknown pattern letter: " + c4);
                                }
                                if (i11 == 2) {
                                    l(new t(c4, i11, i11, 2, 0));
                                } else {
                                    l(new t(c4, i11, i11, 19, 0));
                                }
                            }
                        } else {
                            if (i10 > 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + c4);
                            }
                            l(new t(c4, i10, i10, i10, 0));
                        }
                    } else if (i10 == 1) {
                        d(new v(TextStyle.SHORT, true));
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Wrong number of  pattern letters: " + c4);
                        }
                        d(new v(TextStyle.FULL, true));
                    }
                } else if (cCharAt == 'A') {
                    o(pVar, i10, 19, E.NOT_NEGATIVE);
                } else if (cCharAt == 'Q') {
                    i3 = i10;
                    c2 = cCharAt;
                    z2 = false;
                    if (i3 == 1 || i3 == 2) {
                        if (c2 != 'e') {
                            l(new t(c2, i3, i3, i3, 0));
                        } else {
                            int i12 = i3;
                            if (c2 == 'E') {
                                k(pVar, TextStyle.SHORT);
                            } else if (i12 == 1) {
                                m(pVar);
                            } else {
                                n(pVar, 2);
                            }
                        }
                    } else if (i3 == 3) {
                        k(pVar, z2 ? TextStyle.SHORT_STANDALONE : TextStyle.SHORT);
                    } else if (i3 == 4) {
                        k(pVar, z2 ? TextStyle.FULL_STANDALONE : TextStyle.FULL);
                    } else {
                        if (i3 != 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + c2);
                        }
                        k(pVar, z2 ? TextStyle.NARROW_STANDALONE : TextStyle.NARROW);
                    }
                } else if (cCharAt == 'S') {
                    int i13 = i10;
                    b(j$.time.temporal.a.NANO_OF_SECOND, i13, i13, false);
                } else if (cCharAt == 'a') {
                    char c5 = cCharAt;
                    if (i10 != 1) {
                        throw new IllegalArgumentException("Too many pattern letters: " + c5);
                    }
                    k(pVar, TextStyle.SHORT);
                } else if (cCharAt == 'k') {
                    int i14 = i10;
                    char c6 = cCharAt;
                    if (i14 == 1) {
                        m(pVar);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + c6);
                        }
                        n(pVar, i14);
                    }
                } else if (cCharAt == 'q') {
                    i3 = i10;
                    c2 = cCharAt;
                    z2 = true;
                    if (i3 == 1) {
                        if (c2 != 'e') {
                        }
                    }
                } else if (cCharAt != 's') {
                    if (cCharAt == 'u' || cCharAt == 'y') {
                        int i15 = i10;
                        if (i15 == 2) {
                            LocalDate localDate = q.f69085h;
                            Objects.requireNonNull(localDate, "baseDate");
                            l(new q(pVar, localDate));
                        } else if (i15 < 4) {
                            o(pVar, i15, 19, E.NORMAL);
                        } else {
                            o(pVar, i15, 19, E.EXCEEDS_PAD);
                        }
                    } else if (cCharAt == 'g') {
                        o(pVar, i10, 19, E.NORMAL);
                    } else if (cCharAt != 'h' && cCharAt != 'm') {
                        if (cCharAt != 'n') {
                            switch (cCharAt) {
                                case 'D':
                                    int i16 = i10;
                                    char c7 = cCharAt;
                                    if (i16 == 1) {
                                        m(pVar);
                                    } else {
                                        if (i16 != 2 && i16 != 3) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + c7);
                                        }
                                        o(pVar, i16, 3, E.NOT_NEGATIVE);
                                    }
                                    break;
                                case 'E':
                                    break;
                                case 'F':
                                    char c8 = cCharAt;
                                    if (i10 != 1) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + c8);
                                    }
                                    m(pVar);
                                    break;
                                    break;
                                case 'G':
                                    int i17 = i10;
                                    char c9 = cCharAt;
                                    if (i17 == 1 || i17 == 2 || i17 == 3) {
                                        k(pVar, TextStyle.SHORT);
                                    } else if (i17 == 4) {
                                        k(pVar, TextStyle.FULL);
                                    } else {
                                        if (i17 != 5) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + c9);
                                        }
                                        k(pVar, TextStyle.NARROW);
                                    }
                                    break;
                                case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'K':
                                            break;
                                        case 'L':
                                            break;
                                        case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                                            break;
                                        case MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64 /* 78 */:
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case 'c':
                                                    if (i10 == 1) {
                                                        l(new t(cCharAt, i10, i10, i10, 0));
                                                        break;
                                                    } else {
                                                        i3 = i10;
                                                        c2 = cCharAt;
                                                        if (i3 == 2) {
                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                        }
                                                        z2 = true;
                                                        if (i3 == 1) {
                                                        }
                                                    }
                                                    break;
                                                case 'd':
                                                    break;
                                                case 'e':
                                                    break;
                                                default:
                                                    if (i10 != 1) {
                                                        n(pVar, i10);
                                                    } else {
                                                        m(pVar);
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
                    }
                }
                i8 = i2 - 1;
            } else if (cCharAt == '\'') {
                int i18 = i8 + 1;
                int i19 = i18;
                while (i19 < str.length()) {
                    if (str.charAt(i19) == '\'') {
                        int i20 = i19 + 1;
                        if (i20 < str.length() && str.charAt(i20) == '\'') {
                            i19 = i20;
                        } else {
                            if (i19 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            String strSubstring = str.substring(i18, i19);
                            if (strSubstring.isEmpty()) {
                                e('\'');
                            } else {
                                f(strSubstring.replace("''", "'"));
                            }
                            i8 = i19;
                        }
                    }
                    i19++;
                }
                if (i19 < str.length()) {
                }
            } else if (cCharAt == '[') {
                r();
            } else if (cCharAt == ']') {
                if (this.f69027a.f69028b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                q();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                e(cCharAt);
            }
            i8++;
        }
    }

    public final void r() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f69027a;
        dateTimeFormatterBuilder.f69033g = -1;
        this.f69027a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final void q() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f69027a;
        if (dateTimeFormatterBuilder.f69028b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dateTimeFormatterBuilder.f69029c.size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f69027a;
            C2192e c2192e = new C2192e(dateTimeFormatterBuilder2.f69029c, dateTimeFormatterBuilder2.f69030d);
            this.f69027a = this.f69027a.f69028b;
            d(c2192e);
            return;
        }
        this.f69027a = this.f69027a.f69028b;
    }

    private int d(InterfaceC2193f interfaceC2193f) {
        Objects.requireNonNull(interfaceC2193f, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f69027a;
        int i2 = dateTimeFormatterBuilder.f69031e;
        if (i2 > 0) {
            m mVar = new m(interfaceC2193f, i2, dateTimeFormatterBuilder.f69032f);
            dateTimeFormatterBuilder.f69031e = 0;
            dateTimeFormatterBuilder.f69032f = (char) 0;
            interfaceC2193f = mVar;
        }
        dateTimeFormatterBuilder.f69029c.add(interfaceC2193f);
        this.f69027a.f69033g = -1;
        return r5.f69029c.size() - 1;
    }

    public DateTimeFormatter toFormatter() {
        return w(Locale.getDefault());
    }

    public final DateTimeFormatter w(Locale locale) {
        return x(locale, D.SMART, null);
    }

    final DateTimeFormatter v(D d2, j$.time.chrono.p pVar) {
        return x(Locale.getDefault(), d2, pVar);
    }

    private DateTimeFormatter x(Locale locale, D d2, j$.time.chrono.p pVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f69027a.f69028b != null) {
            q();
        }
        return new DateTimeFormatter(new C2192e(this.f69029c, false), locale, DecimalStyle.f69034d, d2, pVar);
    }
}
