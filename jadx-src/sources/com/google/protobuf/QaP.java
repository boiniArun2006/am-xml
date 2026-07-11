package com.google.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class QaP implements InterfaceC1922m {
    private static final int IS_EDITION_BIT = 4;
    private static final int IS_PROTO2_BIT = 1;
    private final yg defaultInstance;
    private final int flags;
    private final String info;
    private final Object[] objects;

    @Override // com.google.protobuf.InterfaceC1922m
    public yg getDefaultInstance() {
        return this.defaultInstance;
    }

    Object[] getObjects() {
        return this.objects;
    }

    String getStringInfo() {
        return this.info;
    }

    @Override // com.google.protobuf.InterfaceC1922m
    public o7q getSyntax() {
        int i2 = this.flags;
        return (i2 & 1) != 0 ? o7q.PROTO2 : (i2 & 4) == 4 ? o7q.EDITIONS : o7q.PROTO3;
    }

    @Override // com.google.protobuf.InterfaceC1922m
    public boolean isMessageSetWireFormat() {
        return (this.flags & 2) == 2;
    }

    QaP(yg ygVar, String str, Object[] objArr) {
        this.defaultInstance = ygVar;
        this.info = str;
        this.objects = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.flags = cCharAt;
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
                this.flags = i2 | (cCharAt2 << i3);
                return;
            }
        }
    }
}
