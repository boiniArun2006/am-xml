package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f53867a = b("app_screen_%d");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f53868b = "document.getElementById(\"app_screen_%d\").src = app_screen_%d;\n";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f53869c = b("app_video_url_%d");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f53870d = "document.getElementById(\"app_video_url_%d\").src = app_video_url_%d;\n";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f53871e = b("app_icon");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f53872f = "document.getElementById(\"app_icon\").src = app_icon;\n";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f53873g = b("app_name");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f53874h = a("app_name");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f53875i = b("app_pub_name");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f53876j = a("app_pub_name");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f53877k = b("app_label");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f53878l = a("app_label");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f53879m = b("app_size");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f53880n = a("app_size");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f53881o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f53882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f53883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f53884r;

    public static String a(String str) {
        return "document.getElementById(\"" + str + "\").innerHTML = `${" + str + "}`;\n";
    }

    static {
        String str = LHbnkhI.vklNdiKQP;
        f53881o = b(str);
        f53882p = a(str);
        f53883q = b("app_rating_icon");
        f53884r = "document.getElementById(\"app_rating_icon\").src = app_rating_icon;\n";
    }

    public static String a(boolean z2, String str) {
        StringBuilder sb = new StringBuilder("document.getElementById(\"");
        sb.append(str);
        sb.append("\").style.display = ");
        sb.append(z2 ? "'block'" : "'none'");
        sb.append(";\n");
        return sb.toString();
    }

    public static String b(String str) {
        return "var " + str + " = `%s`;\n";
    }
}
