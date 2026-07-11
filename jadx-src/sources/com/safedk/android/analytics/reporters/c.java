package com.safedk.android.analytics.reporters;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62863a = "application";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StackTraceElement f62864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f62865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f62866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f62867e;

    public c(StackTraceElement stackTraceElement, String str) {
        this.f62864b = stackTraceElement;
        this.f62865c = str;
    }

    public c(StackTraceElement stackTraceElement) {
        this.f62864b = stackTraceElement;
        this.f62865c = "application";
    }

    public StackTraceElement a() {
        return this.f62864b;
    }

    public String b() {
        return this.f62865c;
    }

    public int c() {
        return this.f62867e;
    }

    public void a(int i2) {
        this.f62867e = i2;
    }
}
