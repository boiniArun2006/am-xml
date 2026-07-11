package ixS;

import K7m.CN3;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f68868n = Pattern.compile("<(head)( [^>]*)?>", 2);
    private static final Pattern rl = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f68869t = Pattern.compile("<(body)( [^>]*?)?>", 2);
    private static final Pattern nr = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Pattern f68867O = Pattern.compile("<(html)( [^>]*?)?>", 2);
    private static final Pattern J2 = Pattern.compile("<(html)( [^>]*?)?/>", 2);
    private static final Pattern Uo = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    private static boolean rl(int i2, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i2 >= iArr2[0] && i2 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    static String O(String str, String str2) {
        return n(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    static String n(String str, String str2) {
        CN3.J2(str, "HTML is null or empty");
        int[][] iArrNr = nr(str);
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
        if (J2(str, sb, rl, str2, iArrNr)) {
            return sb.toString();
        }
        if (t(str, sb, f68868n, str2, iArrNr)) {
            return sb.toString();
        }
        if (J2(str, sb, nr, str2, iArrNr)) {
            return sb.toString();
        }
        if (t(str, sb, f68869t, str2, iArrNr)) {
            return sb.toString();
        }
        if (J2(str, sb, J2, str2, iArrNr)) {
            return sb.toString();
        }
        if (t(str, sb, f68867O, str2, iArrNr)) {
            return sb.toString();
        }
        if (t(str, sb, Uo, str2, iArrNr)) {
            return sb.toString();
        }
        return str2 + str;
    }

    private static int[][] nr(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int iIndexOf = str.indexOf("<!--", i2);
            if (iIndexOf >= 0) {
                int iIndexOf2 = str.indexOf("-->", iIndexOf);
                if (iIndexOf2 >= 0) {
                    arrayList.add(new int[]{iIndexOf, iIndexOf2});
                    i2 = iIndexOf2 + 3;
                } else {
                    arrayList.add(new int[]{iIndexOf, length});
                }
            }
            i2 = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
    }

    private static boolean J2(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i2 = 0;
        while (matcher.find(i2)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!rl(iStart, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i2 = iEnd;
        }
        return false;
    }

    private static boolean t(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i2 = 0;
        while (matcher.find(i2)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!rl(iStart, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i2 = iEnd;
        }
        return false;
    }
}
