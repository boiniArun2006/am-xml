package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f57076g = Pattern.compile("max-age=(\\d+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f57077h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f57078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f57079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f57082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f57083f;

    public final boolean a() {
        boolean z2;
        String str;
        if (TextUtils.isEmpty(this.f57083f)) {
            return false;
        }
        loop0: while (true) {
            z2 = true;
            for (String str2 : this.f57079b.keySet()) {
                if (!z2) {
                    break loop0;
                }
                if (str2 == null || !str2.equalsIgnoreCase("Cache-Control")) {
                    if (str2 == null || !str2.equalsIgnoreCase("Vary")) {
                        if (str2 != null && str2.equalsIgnoreCase("Pragma")) {
                            String str3 = (String) this.f57079b.get(str2);
                            if (str3 != null) {
                                z2 = !str3.equalsIgnoreCase("no-cache");
                            }
                        } else if (str2 != null && str2.equalsIgnoreCase("Expires") && (str = (String) this.f57079b.get(str2)) != null) {
                            try {
                                Date date = f57077h.parse(str);
                                if (date != null && date.getTime() + TimeUnit.MILLISECONDS.convert(1L, TimeUnit.HOURS) > System.currentTimeMillis()) {
                                    break;
                                }
                            } catch (ParseException unused) {
                                continue;
                            }
                        }
                    }
                    z2 = false;
                } else {
                    String str4 = (String) this.f57079b.get(str2);
                    if (str4 != null) {
                        Pattern pattern = f57076g;
                        Locale locale = Locale.ENGLISH;
                        Matcher matcher = pattern.matcher(str4.toLowerCase(locale));
                        int iA = (matcher.find() && matcher.groupCount() == 1) ? com.fyber.inneractive.sdk.util.v.a(matcher.group(1), 0) : 0;
                        if ((str4.toLowerCase(locale).contains("public") || str4.toLowerCase(locale).contains("private") || iA > TimeUnit.SECONDS.convert(1L, TimeUnit.HOURS)) && !str4.toLowerCase(locale).contains("no-") && !str4.toLowerCase(locale).contains("must-")) {
                            break;
                        }
                        z2 = false;
                    } else {
                        continue;
                    }
                }
            }
        }
        return z2;
    }

    public c1(byte[] bArr, HashMap map, String str, String str2, int i2, String str3) {
        this.f57078a = bArr;
        this.f57079b = map;
        this.f57080c = str;
        this.f57081d = str2;
        this.f57082e = i2;
        this.f57083f = str3;
    }
}
