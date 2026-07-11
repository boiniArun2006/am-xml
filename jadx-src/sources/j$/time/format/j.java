package j$.time.format;

import j$.time.chrono.Chronology;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class j implements InterfaceC2193f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f69058b = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FormatStyle f69059a;

    j(FormatStyle formatStyle) {
        this.f69059a = formatStyle;
    }

    @Override // j$.time.format.InterfaceC2193f
    public final boolean q(y yVar, StringBuilder sb) {
        a(yVar.c(), Chronology.G(yVar.d())).f().q(yVar, sb);
        return true;
    }

    @Override // j$.time.format.InterfaceC2193f
    public final int s(w wVar, CharSequence charSequence, int i2) {
        return a(wVar.i(), wVar.h()).f().s(wVar, charSequence, i2);
    }

    private DateTimeFormatter a(Locale locale, Chronology chronology) {
        String strU = chronology.u();
        String string = locale.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(strU);
        sb.append(com.safedk.android.analytics.brandsafety.l.ad);
        sb.append(string);
        sb.append(com.safedk.android.analytics.brandsafety.l.ad);
        FormatStyle formatStyle = this.f69059a;
        sb.append(formatStyle);
        sb.append((Object) null);
        String string2 = sb.toString();
        ConcurrentHashMap concurrentHashMap = f69058b;
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.get(string2);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        String localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(formatStyle, null, chronology, locale);
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.i(localizedDateTimePattern);
        DateTimeFormatter dateTimeFormatterW = dateTimeFormatterBuilder.w(locale);
        DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.putIfAbsent(string2, dateTimeFormatterW);
        return dateTimeFormatter2 != null ? dateTimeFormatter2 : dateTimeFormatterW;
    }

    public final String toString() {
        return "Localized(" + this.f69059a + "," + ((Object) "") + ")";
    }
}
