package com.google.zxing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final boolean f61037n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final StackTraceElement[] f61038t;

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    static {
        f61037n = System.getProperty("surefire.test.class.path") != null;
        f61038t = new StackTraceElement[0];
    }

    ReaderException() {
    }
}
