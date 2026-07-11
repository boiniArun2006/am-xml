package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class fuX {
    private static fuX nr;
    public static final long rl = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f60550t = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final BV.j f60551n;

    static boolean KN(String str) {
        return str.contains(":");
    }

    static boolean Uo(String str) {
        return f60550t.matcher(str).matches();
    }

    public static fuX nr(BV.j jVar) {
        if (nr == null) {
            nr = new fuX(jVar);
        }
        return nr;
    }

    public long n() {
        return this.f60551n.currentTimeMillis();
    }

    public long rl() {
        return TimeUnit.MILLISECONDS.toSeconds(n());
    }

    private fuX(BV.j jVar) {
        this.f60551n = jVar;
    }

    public static fuX t() {
        return nr(BV.n.n());
    }

    public boolean J2(X7.Ml ml) {
        if (TextUtils.isEmpty(ml.rl()) || ml.KN() + ml.t() < rl() + rl) {
            return true;
        }
        return false;
    }

    public long O() {
        return (long) (Math.random() * 1000.0d);
    }
}
