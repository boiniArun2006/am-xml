package com.google.zxing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class NotFoundException extends ReaderException {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final NotFoundException f61036O;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f61036O = notFoundException;
        notFoundException.setStackTrace(ReaderException.f61038t);
    }

    private NotFoundException() {
    }
}
