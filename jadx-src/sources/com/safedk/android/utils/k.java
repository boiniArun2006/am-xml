package com.safedk.android.utils;

import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63212a = "StringUtils";

    public static boolean a(String str, String str2) {
        return str.contains(str2) && str.indexOf(str2) != str.lastIndexOf(str2);
    }

    public static int b(String str, String str2) {
        if (!str.contains(str2)) {
            return -1;
        }
        int iIndexOf = str.indexOf(str2);
        String strSubstring = str.substring(iIndexOf + 1);
        if (strSubstring.contains(str2)) {
            return iIndexOf + strSubstring.indexOf(str2) + 1;
        }
        return -1;
    }

    public static boolean c(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        Logger.printFullVerboseLog(f63212a, "stringSimilarity: s1 is: ", str);
        Logger.printFullVerboseLog(f63212a, "stringSimilarity: s2 is: ", str2);
        if (str.length() != str2.length()) {
            Logger.d(f63212a, "stringSimilarity: they don't have the same length s1=", Integer.valueOf(str.length()), " s2=", Integer.valueOf(str2.length()));
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) != str2.charAt(i2)) {
                Logger.d(f63212a, "stringSimilarity: they are not equal at char number i: s1[i]=", Character.valueOf(str.charAt(i2)), " s2[i]=", Character.valueOf(str2.charAt(i2)));
                return false;
            }
        }
        Logger.d(f63212a, "stringSimilarity: they are equal!");
        return true;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("\\\\x21", "!").replace("\\\\x22", "\"").replace("\\\\x23", "#").replace("\\\\x24", "$").replace("\\\\x25", "%").replace("\\\\x26", "&").replace("\\\\x27", "'").replace("\\\\x28", "(").replace("\\\\x29", ")").replace("\\\\x2a", "*").replace("\\\\x2b", "+").replace("\\\\x2c", ",").replace("\\\\x2d", "-").replace("\\\\x2e", ".").replace("\\\\x2f", "/").replace("\\\\x3a", ":").replace("\\\\x3b", ";").replace("\\\\x3c", "<").replace("\\\\x3d", com.safedk.android.analytics.brandsafety.l.ae).replace(KfLR.aMxq, ">").replace("\\\\x3f", "?").replace("\\\\x40", "@").replace("\\\\x5b", "[").replace("\\\\x5d", "]").replace("\\x21", "!").replace("\\x22", "\"").replace("\\x23", "#").replace("\\x24", "$").replace("\\x25", "%").replace("\\x26", "&").replace("\\x27", "'").replace("\\x28", "(").replace("\\x29", ")").replace("\\x2a", "*").replace("\\x2b", "+").replace("\\x2c", ",").replace("\\x2f", "/").replace("\\x3a", ":").replace("\\x3b", ";").replace("\\x3c", "<").replace("\\x3d", com.safedk.android.analytics.brandsafety.l.ae).replace("\\x3e", ">").replace("\\x3f", "?").replace("\\x40", "@").replace("\\x5b", "[").replace("\\x5d", "]").replace("&amp;", "&");
        } catch (Throwable th) {
            Logger.e(f63212a, "exception in unescapeUnicodeHex. input param is ", str, "' , error : ", th.getMessage());
            return str;
        }
    }

    public static String b(String str) {
        try {
            return new URI(c(str)).getHost();
        } catch (URISyntaxException e2) {
            Logger.e(f63212a, "getURLDomain - exception occurred: ", e2);
            return null;
        }
    }

    public static Map<String, String> a(String str, boolean z2) {
        try {
            if (!str.contains("?")) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf("?") + 1);
            Logger.d(f63212a, "splitQuery query = ", strSubstring);
            return b(strSubstring, z2);
        } catch (Throwable th) {
            Logger.e(f63212a, "Exception in splitQuery, url = ", str, th);
            return null;
        }
    }

    public static String d(String str, String str2) {
        Map<String, String> mapA;
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && (mapA = a(str, true)) != null && mapA.containsKey(str2)) {
                return mapA.get(str2);
            }
        } catch (Throwable th) {
            Logger.e(f63212a, "Exception in getting query param decoded : ", th.getMessage(), th);
        }
        return null;
    }

    public static String e(String str, String str2) {
        Map<String, String> mapA;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || (mapA = a(str, true)) == null || !mapA.containsKey(str2)) {
            return null;
        }
        Logger.d(f63212a, "param ", str2, " value is ", mapA.get(str2));
        return mapA.get(str2);
    }

    public static Map<String, String> b(String str, boolean z2) {
        String[] strArrSplit;
        String strSubstring;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str.contains("&")) {
            strArrSplit = str.split("&");
        } else {
            strArrSplit = new String[]{str};
        }
        try {
            Logger.d(f63212a, "splitQueryParams started , queryParams = ", str);
            for (String str2 : strArrSplit) {
                int iIndexOf = str2.indexOf(com.safedk.android.analytics.brandsafety.l.ae);
                if (iIndexOf != -1) {
                    String strSubstring2 = str2.substring(0, iIndexOf);
                    if (z2) {
                        strSubstring2 = URLDecoder.decode(strSubstring2, C.UTF8_NAME);
                    }
                    int i2 = iIndexOf + 1;
                    if (i2 >= str2.length()) {
                        strSubstring = null;
                    } else {
                        strSubstring = str2.substring(i2);
                        if (z2) {
                            strSubstring = URLDecoder.decode(strSubstring, C.UTF8_NAME);
                        }
                    }
                    linkedHashMap.put(strSubstring2, strSubstring);
                }
            }
            return linkedHashMap;
        } catch (UnsupportedEncodingException e2) {
            Logger.e(f63212a, "Exception in splitQuery, queryParams = ", str, e2);
            return null;
        } catch (Throwable th) {
            Logger.e(f63212a, "Exception in splitQuery: ", th);
            return null;
        }
    }

    public static String f(String str, String str2) {
        if (!str.contains("?")) {
            return str;
        }
        return str.replaceFirst("(?<=[?&])" + str2 + "=.*?(&|$)", "").replaceFirst("[?&]$", "");
    }

    public static String c(String str) {
        if (str != null) {
            String str2 = jhotmBbwMbr.tYBTNeTmxr;
            if (str.contains(str2)) {
                return str.substring(0, str.indexOf(str2));
            }
        }
        return str;
    }

    public static String a(String str, String[] strArr) {
        if (strArr == null) {
            return str;
        }
        int length = strArr.length;
        String str2 = str;
        int i2 = 0;
        while (i2 < length) {
            String str3 = strArr[i2];
            String strF = f(str2, str3);
            if (!strF.equals(str2)) {
                Logger.d(f63212a, "remove query param from Url removed query param '", str3, "', url = ", str);
            }
            i2++;
            str2 = strF;
        }
        return str2;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
    }

    public static String e(String str) {
        int iLastIndexOf;
        if (!TextUtils.isEmpty(str)) {
            int iLastIndexOf2 = str.lastIndexOf(35);
            if (iLastIndexOf2 > 0) {
                str = str.substring(0, iLastIndexOf2);
            }
            int iLastIndexOf3 = str.lastIndexOf(63);
            if (iLastIndexOf3 > 0) {
                str = str.substring(0, iLastIndexOf3);
            }
            int iLastIndexOf4 = str.lastIndexOf(47);
            if (iLastIndexOf4 >= 0) {
                str = str.substring(iLastIndexOf4 + 1);
            }
            if (!str.isEmpty() && (iLastIndexOf = str.lastIndexOf(46)) >= 0) {
                return str.substring(iLastIndexOf + 1);
            }
            return "";
        }
        return "";
    }

    public static String f(String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            i2++;
            if (cCharAt == '\\' && i2 < str.length()) {
                char cCharAt2 = str.charAt(i2);
                i2++;
                if (cCharAt2 == '\\' || cCharAt2 == '/' || cCharAt2 == '\"' || cCharAt2 == '\'') {
                    sb.append(cCharAt2);
                } else if (cCharAt2 == 'n') {
                    sb.append('\n');
                } else if (cCharAt2 == 'r') {
                    sb.append('\r');
                } else if (cCharAt2 == 't') {
                    sb.append('\t');
                } else if (cCharAt2 == 'b') {
                    sb.append('\b');
                } else if (cCharAt2 == 'f') {
                    sb.append('\f');
                } else if (cCharAt2 == 'u') {
                    StringBuilder sb2 = new StringBuilder();
                    int i3 = i2 + 4;
                    if (i3 > str.length()) {
                        throw new RuntimeException("Not enough unicode digits! ");
                    }
                    for (char c2 : str.substring(i2, i3).toCharArray()) {
                        if (!Character.isLetterOrDigit(c2)) {
                            throw new RuntimeException("Bad character in unicode escape.");
                        }
                        sb2.append(Character.toLowerCase(c2));
                    }
                    sb.append((char) Integer.parseInt(sb2.toString(), 16));
                    i2 = i3;
                } else {
                    throw new RuntimeException("Illegal escape sequence: \\" + cCharAt2);
                }
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            System.currentTimeMillis();
            String strReplace = j(i(str)).replace("&amp;", "&").replace("\\/", "/");
            while (strReplace.contains("&amp;")) {
                strReplace = strReplace.replace("&amp;", "&");
            }
            while (strReplace.contains("&apos;")) {
                strReplace = strReplace.replace("&apos;", "'");
            }
            while (strReplace.contains("&#39;")) {
                strReplace = strReplace.replace("&#39;", "'");
            }
            while (strReplace.contains("&nbsp;")) {
                strReplace = strReplace.replace("&nbsp;", " ");
            }
            if (strReplace.contains("[CDATA[") && strReplace.contains("&lt;") && strReplace.contains("&gt;") && strReplace.contains("&quot;")) {
                int iIndexOf = strReplace.indexOf(com.safedk.android.analytics.brandsafety.creatives.g.f62375e);
                int iLastIndexOf = strReplace.lastIndexOf("&quot;");
                if (iLastIndexOf != -1 && iLastIndexOf > iIndexOf && !strReplace.substring(iLastIndexOf).contains("[CDATA[")) {
                    strReplace = strReplace.substring(0, iLastIndexOf);
                }
            }
            return h(strReplace);
        } catch (Throwable th) {
            Logger.e(f63212a, "exception in selective decode. input param is ", str, "' , error : ", th.getMessage());
            return str;
        }
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("[\\u00A0\\u1680\\u180E\\u2000-\\u200A\\u202F\\u205F\\u3000\\uFEFF]", " ").replaceAll(" +", " ");
    }

    public static String i(String str) {
        Matcher matcher = g.a("\\\\+u([0-9a-f]{4})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, String.valueOf((char) Integer.parseInt(matcher.group(1), 16)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static String j(String str) {
        Matcher matcher = g.a("\\\\+x([0-9a-f]{2})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, String.valueOf((char) Integer.parseInt(matcher.group(1), 16)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static boolean k(String str) {
        String lowerCase = str.toLowerCase();
        return (lowerCase.contains("<html") && lowerCase.contains("</html>")) || (lowerCase.contains("<div") && lowerCase.contains("</div>")) || ((lowerCase.contains("<script") && lowerCase.contains("</script>")) || (lowerCase.contains("<span") && lowerCase.contains("</span>")));
    }

    public static String a(String str, int i2) {
        int iIndexOf = str.indexOf("<div", i2);
        int iIndexOf2 = str.indexOf("</div", i2);
        int i3 = 0;
        int i5 = i2;
        while (i5 < str.length()) {
            if (iIndexOf < iIndexOf2) {
                i3++;
                i5 = iIndexOf + 1;
                iIndexOf = str.indexOf("<div", i5);
            } else {
                i3--;
                i5 = iIndexOf2 + 1;
                if (i3 == 0) {
                    return str.substring(i2, iIndexOf2);
                }
                iIndexOf2 = str.indexOf("</div", i5);
            }
        }
        return null;
    }

    public static String l(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.replace("&nbsp;", " ").replace("&quot;", "\"").replace("&apos;", "'").replace("&#39;", "'").replace("&lt;", "<").replace("&gt;", ">").replace("&amp;", "&").replaceAll("<\\s*?br\\s*?/\\s*?>", "\n").replaceAll("<\\s*?" + TtmlNode.TAG_SPAN + "\\s+?style\\s*?" + com.safedk.android.analytics.brandsafety.l.ae + "\\s*?\"white-space:pre\"\\s*?>&#9;<\\s*?/\\s*?" + TtmlNode.TAG_SPAN + "\\s*?>", "\t");
    }

    public static String m(String str) {
        return b(str, 0);
    }

    public static String b(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return new String(Base64.decode(str, i2));
        } catch (IllegalArgumentException e2) {
            Logger.d(f63212a, "base64Decoder - failed to Base64 decode buffer (decoded): ", e2.getMessage());
            return str;
        }
    }

    public static boolean n(String str) {
        if (str.contains("{") && str.contains("}") && str.contains(":") && str.contains("\"")) {
            return n.n(str);
        }
        return false;
    }

    public static String o(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & UByte.MAX_VALUE);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Throwable th) {
            Logger.d(f63212a, "Exception in get Sha1 : ", th.getMessage(), th);
            return null;
        }
    }

    public static String p(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & UByte.MAX_VALUE);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Throwable th) {
            Logger.d(f63212a, "SHA-256 algorithm not found!", th);
            return null;
        }
    }

    public static HashSet<String> a(HashSet<String> hashSet, String str) {
        HashSet<String> hashSet2 = new HashSet<>();
        for (String str2 : hashSet) {
            if (!str2.startsWith(str)) {
                hashSet2.add(str2);
            }
        }
        return hashSet2;
    }

    public static HashSet<String> b(HashSet<String> hashSet, String str) {
        HashSet<String> hashSet2 = new HashSet<>();
        for (String str2 : hashSet) {
            if (str2.startsWith(str)) {
                hashSet2.add(str2);
            }
        }
        return hashSet2;
    }

    public static int c(String str, int i2) {
        int i3 = 0;
        while (i2 < str.length()) {
            if (str.charAt(i2) == '{') {
                i3++;
            } else if (str.charAt(i2) == '}' && i3 - 1 == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static String a(String str, String str2, String str3) {
        return a(str, str2, str3, false, false);
    }

    public static String a(String str, String str2, String str3, boolean z2, boolean z3) {
        try {
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf == -1) {
                return null;
            }
            int length = z2 ? iIndexOf : str2.length() + iIndexOf;
            if (str3.equals("")) {
                return str.substring(length);
            }
            int iIndexOf2 = str.indexOf(str3, iIndexOf + str2.length());
            if (iIndexOf2 == -1) {
                return str.substring(length);
            }
            if (z3) {
                iIndexOf2 += str3.length();
            }
            return str.substring(length, iIndexOf2);
        } catch (Throwable th) {
            Logger.d(f63212a, "Caught exception in safedkCreateSubstringWithPrefix: ", th.getMessage(), th);
            return null;
        }
    }

    public static String q(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(C.UTF8_NAME));
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(String.format("%02x", Integer.valueOf(b2 & UByte.MAX_VALUE)));
            }
            return sb.toString();
        } catch (Exception e2) {
            throw new RuntimeException("MD5 hashing failed", e2);
        }
    }

    public static String r(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\\\/", "/").replaceAll("\\\\\\\\", "\\\\").replaceAll("\\\\\"", "\"").replaceAll("\\\\'", "'").replaceAll("\\\\n", "\n").replaceAll("\\\\r", "\r").replaceAll("\\\\t", "\t");
    }
}
