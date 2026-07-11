package io.grpc.internal;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class mz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f68639n = TimeUnit.SECONDS.toNanos(1);

    private static int HI(String str) throws ParseException {
        int iCharAt = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            iCharAt *= 10;
            if (i2 < str.length()) {
                if (str.charAt(i2) < '0' || str.charAt(i2) > '9') {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
                iCharAt += str.charAt(i2) - '0';
            }
        }
        return iCharAt;
    }

    private static long az(long j2, int i2) {
        long j3 = i2;
        long j4 = f68639n;
        if (j3 <= (-j4) || j3 >= j4) {
            j2 = OW.I28.n(j2, j3 / j4);
            i2 = (int) (j3 % j4);
        }
        if (j2 > 0 && i2 < 0) {
            i2 = (int) (((long) i2) + j4);
            j2--;
        }
        if (j2 < 0 && i2 > 0) {
            i2 = (int) (((long) i2) - j4);
            j2++;
        }
        if (t(j2, i2)) {
            return ck(TimeUnit.SECONDS.toNanos(j2), i2);
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j2), Integer.valueOf(i2)));
    }

    private static long ck(long j2, long j3) {
        long j4 = j2 + j3;
        return (((j3 ^ j2) > 0L ? 1 : ((j3 ^ j2) == 0L ? 0 : -1)) < 0) | ((j2 ^ j4) >= 0) ? j4 : ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static List n(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!(list.get(i2) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i2), Integer.valueOf(i2), list));
            }
        }
        return list;
    }

    public static List rl(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!(list.get(i2) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", list.get(i2), Integer.valueOf(i2), list));
            }
        }
        return list;
    }

    public static List J2(Map map, String str) {
        List listO = O(map, str);
        if (listO == null) {
            return null;
        }
        return n(listO);
    }

    public static Double KN(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
            }
        }
        throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
    }

    public static List O(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List Uo(Map map, String str) {
        List listO = O(map, str);
        if (listO == null) {
            return null;
        }
        return rl(listO);
    }

    public static String gh(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Map mUb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static Boolean nr(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static Long qie(Map map, String str) {
        String strGh = gh(map, str);
        if (strGh == null) {
            return null;
        }
        try {
            return Long.valueOf(ty(strGh));
        } catch (ParseException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static long ty(String str) throws ParseException {
        boolean z2;
        String strSubstring;
        int iHI;
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 's') {
            if (str.charAt(0) == '-') {
                str = str.substring(1);
                z2 = true;
            } else {
                z2 = false;
            }
            String strSubstring2 = str.substring(0, str.length() - 1);
            int iIndexOf = strSubstring2.indexOf(46);
            if (iIndexOf != -1) {
                strSubstring = strSubstring2.substring(iIndexOf + 1);
                strSubstring2 = strSubstring2.substring(0, iIndexOf);
            } else {
                strSubstring = "";
            }
            long j2 = Long.parseLong(strSubstring2);
            if (strSubstring.isEmpty()) {
                iHI = 0;
            } else {
                iHI = HI(strSubstring);
            }
            if (j2 >= 0) {
                if (z2) {
                    j2 = -j2;
                    iHI = -iHI;
                }
                try {
                    return az(j2, iHI);
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        throw new ParseException("Invalid duration string: " + str, 0);
    }

    public static Integer xMQ(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            Double d2 = (Double) obj;
            int iIntValue = d2.intValue();
            if (iIntValue == d2.doubleValue()) {
                return Integer.valueOf(iIntValue);
            }
            throw new ClassCastException("Number expected to be integer: " + d2);
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
    }

    private static boolean t(long j2, int i2) {
        if (j2 >= -315576000000L && j2 <= 315576000000L) {
            long j3 = i2;
            if (j3 >= -999999999 && j3 < f68639n) {
                if (j2 < 0 || i2 < 0) {
                    if (j2 <= 0 && i2 <= 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
