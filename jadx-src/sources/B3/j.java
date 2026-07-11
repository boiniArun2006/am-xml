package B3;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final TimeZone f221n = DesugarTimeZone.getTimeZone("UTC");

    private static int nr(String str, int i2, int i3) {
        int i5;
        int i7;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i7 = i2 + 1;
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i5 = -iDigit;
        } else {
            i5 = 0;
            i7 = i2;
        }
        while (i7 < i3) {
            int i8 = i7 + 1;
            int iDigit2 = Character.digit(str.charAt(i7), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i5 = (i5 * 10) - iDigit2;
            i7 = i8;
        }
        return -i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2 A[Catch: IllegalArgumentException -> 0x004e, NumberFormatException -> 0x0051, IndexOutOfBoundsException -> 0x0054, TryCatch #2 {IndexOutOfBoundsException -> 0x0054, NumberFormatException -> 0x0051, IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:23:0x005e, B:25:0x006e, B:26:0x0070, B:28:0x007c, B:29:0x007f, B:31:0x0085, B:35:0x008f, B:40:0x009f, B:42:0x00a7, B:53:0x00dc, B:55:0x00e2, B:57:0x00e8, B:81:0x0195, B:61:0x00f2, B:62:0x010d, B:63:0x010e, B:67:0x012a, B:69:0x0137, B:72:0x0140, B:74:0x015f, B:77:0x016e, B:78:0x0190, B:80:0x0193, B:66:0x0119, B:83:0x01c6, B:84:0x01cd, B:46:0x00bf, B:47:0x00c2), top: B:95:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c6 A[Catch: IllegalArgumentException -> 0x004e, NumberFormatException -> 0x0051, IndexOutOfBoundsException -> 0x0054, TryCatch #2 {IndexOutOfBoundsException -> 0x0054, NumberFormatException -> 0x0051, IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:23:0x005e, B:25:0x006e, B:26:0x0070, B:28:0x007c, B:29:0x007f, B:31:0x0085, B:35:0x008f, B:40:0x009f, B:42:0x00a7, B:53:0x00dc, B:55:0x00e2, B:57:0x00e8, B:81:0x0195, B:61:0x00f2, B:62:0x010d, B:63:0x010e, B:67:0x012a, B:69:0x0137, B:72:0x0140, B:74:0x015f, B:77:0x016e, B:78:0x0190, B:80:0x0193, B:66:0x0119, B:83:0x01c6, B:84:0x01cd, B:46:0x00bf, B:47:0x00c2), top: B:95:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date t(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i2;
        int i3;
        int i5;
        int iNr;
        int length;
        TimeZone timeZone;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i7 = index + 4;
            int iNr2 = nr(str, index, i7);
            if (n(str, i7, '-')) {
                i7 = index + 5;
            }
            int i8 = i7 + 2;
            int iNr3 = nr(str, i7, i8);
            if (n(str, i8, '-')) {
                i8 = i7 + 3;
            }
            int i9 = i8 + 2;
            int iNr4 = nr(str, i8, i9);
            boolean zN = n(str, i9, 'T');
            if (!zN && str.length() <= i9) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iNr2, iNr3 - 1, iNr4);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i9);
                return gregorianCalendar.getTime();
            }
            if (zN) {
                int i10 = i8 + 5;
                int iNr5 = nr(str, i8 + 3, i10);
                if (n(str, i10, ':')) {
                    i10 = i8 + 6;
                }
                int i11 = i10 + 2;
                int iNr6 = nr(str, i10, i11);
                if (n(str, i11, ':')) {
                    i11 = i10 + 3;
                }
                if (str.length() > i11 && (cCharAt = str.charAt(i11)) != 'Z' && cCharAt != '+' && cCharAt != '-') {
                    int i12 = i11 + 2;
                    iNr = nr(str, i11, i12);
                    if (iNr > 59 && iNr < 63) {
                        iNr = 59;
                    }
                    if (n(str, i12, '.')) {
                        int i13 = i11 + 3;
                        int iRl = rl(str, i11 + 4);
                        int iMin = Math.min(iRl, i11 + 6);
                        int iNr7 = nr(str, i13, iMin);
                        int i14 = iMin - i13;
                        if (i14 == 1) {
                            iNr7 *= 100;
                        } else if (i14 == 2) {
                            iNr7 *= 10;
                        }
                        i2 = iNr5;
                        i9 = iRl;
                        i3 = iNr6;
                        i5 = iNr7;
                    } else {
                        i2 = iNr5;
                        i9 = i12;
                        i3 = iNr6;
                        i5 = 0;
                    }
                    if (str.length() > i9) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char cCharAt2 = str.charAt(i9);
                    if (cCharAt2 == 'Z') {
                        timeZone = f221n;
                        length = i9 + 1;
                    } else {
                        if (cCharAt2 != '+' && cCharAt2 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                        }
                        String strSubstring = str.substring(i9);
                        if (strSubstring.length() < 5) {
                            strSubstring = strSubstring + "00";
                        }
                        length = i9 + strSubstring.length();
                        if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                            timeZone = f221n;
                        } else {
                            String str3 = "GMT" + strSubstring;
                            TimeZone timeZone2 = DesugarTimeZone.getTimeZone(str3);
                            String id = timeZone2.getID();
                            if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                            }
                            timeZone = timeZone2;
                        }
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, iNr2);
                    gregorianCalendar2.set(2, iNr3 - 1);
                    gregorianCalendar2.set(5, iNr4);
                    gregorianCalendar2.set(11, i2);
                    gregorianCalendar2.set(12, i3);
                    gregorianCalendar2.set(13, iNr);
                    gregorianCalendar2.set(14, i5);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i9 = i11;
                i2 = iNr5;
                i3 = iNr6;
            } else {
                i2 = 0;
                i3 = 0;
            }
            i5 = 0;
            iNr = 0;
            if (str.length() > i9) {
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            if (str == null) {
                str2 = null;
            } else {
                str2 = Typography.quote + str + Typography.quote;
            }
            message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (NumberFormatException e3) {
            e = e3;
            if (str == null) {
            }
            message = e.getMessage();
            if (message == null) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (IllegalArgumentException e4) {
            e = e4;
            if (str == null) {
            }
            message = e.getMessage();
            if (message == null) {
            }
            ParseException parseException22 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException22.initCause(e);
            throw parseException22;
        }
    }

    private static boolean n(String str, int i2, char c2) {
        if (i2 < str.length() && str.charAt(i2) == c2) {
            return true;
        }
        return false;
    }

    private static int rl(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= '0' && cCharAt <= '9') {
                i2++;
            } else {
                return i2;
            }
        }
        return str.length();
    }
}
