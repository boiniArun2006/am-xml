package androidx.content.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class UninitializedMessageException extends RuntimeException {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f38177n;

    public UninitializedMessageException(MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f38177n = null;
    }

    public InvalidProtocolBufferException n() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
