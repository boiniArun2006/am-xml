package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class UGc implements M {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final UGc f59933n = new UGc();

    public static UGc n() {
        return f59933n;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public boolean isSupported(Class cls) {
        return Q.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public iwV messageInfoFor(Class cls) {
        if (!Q.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (iwV) Q.ck(cls.asSubclass(Q.class)).O();
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e2);
        }
    }

    private UGc() {
    }
}
