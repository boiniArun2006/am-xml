package j$.time.format;

import j$.time.chrono.Chronology;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f69003a = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator f69004b = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final B f69005c = new B();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f69006d = 0;

    static B c() {
        return f69005c;
    }

    public String e(j$.time.temporal.p pVar, long j2, TextStyle textStyle, Locale locale) {
        Object objB = b(pVar, locale);
        if (objB instanceof A) {
            return ((A) objB).a(j2, textStyle);
        }
        return null;
    }

    public String d(Chronology chronology, j$.time.temporal.p pVar, long j2, TextStyle textStyle, Locale locale) {
        if (chronology == j$.time.chrono.p.f68978e || !(pVar instanceof j$.time.temporal.a)) {
            return e(pVar, j2, textStyle, locale);
        }
        return null;
    }

    public Iterator g(j$.time.temporal.p pVar, TextStyle textStyle, Locale locale) {
        Object objB = b(pVar, locale);
        if (objB instanceof A) {
            return ((A) objB).b(textStyle);
        }
        return null;
    }

    public Iterator f(Chronology chronology, j$.time.temporal.p pVar, TextStyle textStyle, Locale locale) {
        if (chronology == j$.time.chrono.p.f68978e || !(pVar instanceof j$.time.temporal.a)) {
            return g(pVar, textStyle, locale);
        }
        return null;
    }

    private static Object b(j$.time.temporal.p pVar, Locale locale) {
        Object a2;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(pVar, locale);
        ConcurrentHashMap concurrentHashMap = f69003a;
        Object obj = concurrentHashMap.get(simpleImmutableEntry);
        if (obj != null) {
            return obj;
        }
        HashMap map = new HashMap();
        if (pVar == j$.time.temporal.a.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i2 = 0; i2 < eras.length; i2++) {
                if (!eras[i2].isEmpty()) {
                    long j2 = i2;
                    map2.put(Long.valueOf(j2), eras[i2]);
                    Long lValueOf = Long.valueOf(j2);
                    String str = eras[i2];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            a2 = new A(map);
        } else if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            j$.time.c.e(map, DateFormatSymbols.getInstance(locale), locale);
            a2 = new A(map);
        } else if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            j$.time.c.d(map, DateFormatSymbols.getInstance(locale), locale);
            a2 = new A(map);
        } else if (pVar == j$.time.temporal.a.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
            for (int i3 = 0; i3 < amPmStrings.length; i3++) {
                if (!amPmStrings[i3].isEmpty()) {
                    long j3 = i3;
                    map4.put(Long.valueOf(j3), amPmStrings[i3]);
                    Long lValueOf2 = Long.valueOf(j3);
                    String str2 = amPmStrings[i3];
                    map5.put(lValueOf2, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                }
            }
            if (!map4.isEmpty()) {
                map.put(TextStyle.FULL, map4);
                map.put(TextStyle.SHORT, map4);
                map.put(TextStyle.NARROW, map5);
            }
            a2 = new A(map);
        } else {
            a2 = "";
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, a2);
        return concurrentHashMap.get(simpleImmutableEntry);
    }
}
