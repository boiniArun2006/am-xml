package com.google.zxing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final FormatException f61034O;

    static {
        FormatException formatException = new FormatException();
        f61034O = formatException;
        formatException.setStackTrace(ReaderException.f61038t);
    }

    public static FormatException n() {
        return ReaderException.f61037n ? new FormatException() : f61034O;
    }

    private FormatException() {
    }
}
