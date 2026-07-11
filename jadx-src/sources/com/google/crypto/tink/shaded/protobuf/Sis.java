package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Sis implements iwV {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final rv6 f59931n;
    private final int nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object[] f59932t;

    @Override // com.google.crypto.tink.shaded.protobuf.iwV
    public rv6 getDefaultInstance() {
        return this.f59931n;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.iwV
    public iF getSyntax() {
        return (this.nr & 1) == 1 ? iF.PROTO2 : iF.PROTO3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.iwV
    public boolean isMessageSetWireFormat() {
        return (this.nr & 2) == 2;
    }

    Object[] n() {
        return this.f59932t;
    }

    String rl() {
        return this.rl;
    }

    Sis(rv6 rv6Var, String str, Object[] objArr) {
        this.f59931n = rv6Var;
        this.rl = str;
        this.f59932t = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.nr = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i5 = 1;
        while (true) {
            int i7 = i5 + 1;
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 >= 55296) {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i5 = i7;
            } else {
                this.nr = i2 | (cCharAt2 << i3);
                return;
            }
        }
    }
}
