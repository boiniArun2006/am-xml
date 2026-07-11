package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48963c = a(z4.f51009l);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f48964d = a(z4.f51010m);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f48965e = (String) a5.a(z4.f51011n, (Object) null, C1802k.o());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f48966f = (String) a5.a(z4.f51012o, (Object) null, C1802k.o());

    public String a() {
        return this.f48964d;
    }

    public String b() {
        return this.f48965e;
    }

    public String c() {
        return this.f48963c;
    }

    private String a(z4 z4Var) {
        String str = (String) a5.a(z4Var, (Object) null, C1802k.o());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a5.b(z4Var, lowerCase, C1802k.o());
        return lowerCase;
    }

    private String f() {
        if (!((Boolean) this.f48961a.a(x4.K3)).booleanValue()) {
            this.f48961a.c(z4.f51008k);
        }
        String str = (String) this.f48961a.a(z4.f51008k);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f48961a.O();
        if (C1804o.a()) {
            this.f48961a.O().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public void b(String str) {
        this.f48965e = str;
        a5.b(z4.f51011n, str, C1802k.o());
    }

    public void c(String str) {
        this.f48966f = str;
        a5.b(z4.f51012o, str, C1802k.o());
    }

    public String d() {
        return this.f48966f;
    }

    public String e() {
        return this.f48962b;
    }

    public m7(C1802k c1802k) {
        this.f48961a = c1802k;
        a(f());
    }

    public void a(String str) {
        if (((Boolean) this.f48961a.a(x4.K3)).booleanValue()) {
            this.f48961a.b(z4.f51008k, str);
        }
        this.f48962b = str;
        this.f48961a.t().b(str, a());
    }

    public static String a(C1802k c1802k) {
        z4 z4Var = z4.f51013p;
        String str = (String) c1802k.a(z4Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        c1802k.b(z4Var, strValueOf);
        return strValueOf;
    }
}
