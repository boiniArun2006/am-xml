package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62352a = "(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62353b = "(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62354c = "(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62355d = "(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62356e = "(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62357f = "(?:\\\\+x3D|%3d|=)";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f62358g = "(?:\\\\+x2B|%2b|\\+)";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f62359h = "[\\s\\S]*?";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f62360i = "(?:%26|\\\\+x26|&)";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f62361j = "(?:%24|\\\\+x24|$)";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f62362k = "(?:%21|\\\\+x21|!)";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f62363l = "(?:%5B|\\\\+x5B|\\[|\\\\n)";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f62364m = "(?:%5D|\\\\+x5D|\\])";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f62365n = "\\)";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final String f62366o = "(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)<TAG_NAME>[\\s\\S]*?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)([\\s\\S]*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)<TAG_NAME>(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f62367p = "ParserBase";

    public static String a(String str) {
        return f62366o.replace("<TAG_NAME>", str);
    }

    public static String a(String str, boolean z2) {
        String strG;
        if (z2) {
            try {
                strG = k.g(str);
            } catch (Throwable th) {
                Logger.d(f62367p, "CDATA info decode failed: ", str);
                strG = str;
            }
        } else {
            strG = str;
        }
        List<String> listA = a(a(), strG, 1, false);
        if (listA.size() > 0) {
            str = listA.get(0);
        }
        return str.trim();
    }

    public static List<String> a(Pattern pattern, String str, int i2, boolean z2) {
        String strGroup;
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            if (i2 >= 0) {
                strGroup = matcher.group(i2);
            } else {
                strGroup = matcher.group();
            }
            if (strGroup != null) {
                if (z2) {
                    arrayList.add(k.g(strGroup.trim()));
                } else {
                    arrayList.add(strGroup.trim());
                }
            }
        }
        return arrayList;
    }

    public static List<String> a(Pattern pattern, String str, int i2, int i3, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(i2);
            String strGroup2 = matcher.group(i3);
            if (strGroup != null) {
                if (z2) {
                    arrayList.add(k.g(strGroup.trim()));
                } else {
                    arrayList.add(strGroup.trim());
                }
            }
            if (strGroup2 != null) {
                if (z2) {
                    arrayList.add(k.g(strGroup2.trim()));
                } else {
                    arrayList.add(strGroup2.trim());
                }
            }
        }
        return arrayList;
    }

    public static Pattern a() {
        return com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:%21|\\\\+x21|!)(?:%5B|\\\\+x5B|\\[|\\\\n)CDATA(?:%5B|\\\\+x5B|\\[|\\\\n)([\\s\\S]*)(?:%5D|\\\\+x5D|\\])(?:%5D|\\\\+x5D|\\])(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)");
    }

    public static Pattern b() {
        return com.safedk.android.utils.g.a("(?s)(<html>.+?</html>)|(%3Chtml%3E.+?%3C/html%3E)");
    }

    public static Pattern c() {
        return com.safedk.android.utils.g.a("(<body>.*?</body>)", 32);
    }

    public static Pattern d() {
        return com.safedk.android.utils.g.a("(<body.+?</body>)");
    }

    public static Pattern e() {
        return com.safedk.android.utils.g.a("<img[^>]*src=[\\\"']([^\\\"^']*)(.*)\\/>|image:url((.*))");
    }

    public static Pattern f() {
        return com.safedk.android.utils.g.a("href=\"(.*?)\"", 2);
    }

    public static Pattern g() {
        return com.safedk.android.utils.g.a("<video .*src=\"(\\S*?)\".*</video>");
    }

    public static Pattern h() {
        return com.safedk.android.utils.g.a("!--(.*?)--");
    }

    public static Pattern i() {
        return com.safedk.android.utils.g.a("[0-9]{2,3}\\.[0-9]{2,3}\\.[0-9]{2,3}\\.[0-9]{2,3}");
    }
}
