package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class UninitializedMessageException extends RuntimeException {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f59934n;

    public UninitializedMessageException(rv6 rv6Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f59934n = null;
    }

    public InvalidProtocolBufferException n() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
