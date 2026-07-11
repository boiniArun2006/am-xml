package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f53774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f53775b;

    static {
        String strB = com.fyber.inneractive.sdk.util.o.b("ia_js_load_monitor.txt");
        f53774a = "<html><head>" + strB + "<script src='%s'></script></head><body></body></html>";
        f53775b = "<html><head>" + strB + "%s</head><body></body></html>";
    }

    public static boolean a(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }

    public static String b(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        if (str.startsWith(iAConfigManager.f53291q ? "https" : com.safedk.android.analytics.brandsafety.creatives.g.f62375e)) {
            return String.format(f53774a, str);
        }
        if (iAConfigManager.f53291q && !str.startsWith("https")) {
            return null;
        }
        if (!str.startsWith("<script")) {
            str = "<script type='text/javascript'>".concat(str);
        }
        if (!str.endsWith("</script>")) {
            str = str.concat("</script>");
        }
        return String.format(f53775b, str);
    }
}
