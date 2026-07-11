package j$.time;

import j$.time.format.TextStyle;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ List c(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void e(HashMap map, DateFormatSymbols dateFormatSymbols, Locale locale) {
        int length = dateFormatSymbols.getMonths().length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (long j2 = 1; j2 <= length; j2++) {
            String strB = b(j2, "LLLL", locale);
            linkedHashMap.put(Long.valueOf(j2), strB);
            linkedHashMap2.put(Long.valueOf(j2), strB.substring(0, Character.charCount(strB.codePointAt(0))));
            linkedHashMap3.put(Long.valueOf(j2), b(j2, "LLL", locale));
        }
        if (length > 0) {
            map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
            map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
            map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
            map.put(TextStyle.FULL, linkedHashMap);
            map.put(TextStyle.NARROW, linkedHashMap2);
            map.put(TextStyle.SHORT, linkedHashMap3);
        }
    }

    private static String b(long j2, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j2, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static void d(HashMap map, DateFormatSymbols dateFormatSymbols, Locale locale) {
        String strSubstring;
        int length = dateFormatSymbols.getWeekdays().length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        boolean z2 = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
        for (long j2 = 1; j2 <= length; j2++) {
            String strA = a(j2, "cccc", locale);
            linkedHashMap.put(Long.valueOf(j2), strA);
            Long lValueOf = Long.valueOf(j2);
            if (!z2) {
                strSubstring = strA.substring(0, Character.charCount(strA.codePointAt(0)));
            } else {
                strSubstring = new StringBuilder().appendCodePoint(strA.codePointBefore(strA.length())).toString();
            }
            linkedHashMap2.put(lValueOf, strSubstring);
            linkedHashMap3.put(Long.valueOf(j2), a(j2, "ccc", locale));
        }
        if (length > 0) {
            map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
            map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
            map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
            map.put(TextStyle.FULL, linkedHashMap);
            map.put(TextStyle.NARROW, linkedHashMap2);
            map.put(TextStyle.SHORT, linkedHashMap3);
        }
    }

    private static String a(long j2, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j2, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }
}
