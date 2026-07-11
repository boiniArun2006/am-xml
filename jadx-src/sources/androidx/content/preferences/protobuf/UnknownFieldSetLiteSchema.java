package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@CheckReturnValue
class UnknownFieldSetLiteSchema extends UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> {
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    boolean Ik(Reader reader) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void rl(UnknownFieldSetLite unknownFieldSetLite, int i2, long j2) {
        unknownFieldSetLite.ty(WireFormat.t(i2, 1), Long.valueOf(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public void O(UnknownFieldSetLite unknownFieldSetLite, int i2, long j2) {
        unknownFieldSetLite.ty(WireFormat.t(i2, 0), Long.valueOf(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public void t(UnknownFieldSetLite unknownFieldSetLite, int i2, UnknownFieldSetLite unknownFieldSetLite2) {
        unknownFieldSetLite.ty(WireFormat.t(i2, 3), unknownFieldSetLite2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public void n(UnknownFieldSetLite unknownFieldSetLite, int i2, int i3) {
        unknownFieldSetLite.ty(WireFormat.t(i2, 5), Integer.valueOf(i3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public void nr(UnknownFieldSetLite unknownFieldSetLite, int i2, ByteString byteString) {
        unknownFieldSetLite.ty(WireFormat.t(i2, 2), byteString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void ck(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public UnknownFieldSetLite Uo(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    UnknownFieldSetLiteSchema() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: E2, reason: merged with bridge method [inline-methods] */
    public UnknownFieldSetLite ty() {
        return UnknownFieldSetLite.gh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void o(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.ck(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public UnknownFieldSetLite r(UnknownFieldSetLite unknownFieldSetLite) {
        unknownFieldSetLite.KN();
        return unknownFieldSetLite;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void HI(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ck(obj, unknownFieldSetLite);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: fD, reason: merged with bridge method [inline-methods] */
    public UnknownFieldSetLite gh(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        if (UnknownFieldSetLite.t().equals(unknownFieldSetLite2)) {
            return unknownFieldSetLite;
        }
        if (UnknownFieldSetLite.t().equals(unknownFieldSetLite)) {
            return UnknownFieldSetLite.mUb(unknownFieldSetLite, unknownFieldSetLite2);
        }
        return unknownFieldSetLite.xMQ(unknownFieldSetLite2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: iF, reason: merged with bridge method [inline-methods] */
    public int xMQ(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.O();
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    void mUb(Object obj) {
        Uo(obj).KN();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: nHg, reason: merged with bridge method [inline-methods] */
    public void Z(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.r(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public UnknownFieldSetLite J2(Object obj) {
        UnknownFieldSetLite unknownFieldSetLiteUo = Uo(obj);
        if (unknownFieldSetLiteUo == UnknownFieldSetLite.t()) {
            UnknownFieldSetLite unknownFieldSetLiteGh = UnknownFieldSetLite.gh();
            ck(obj, unknownFieldSetLiteGh);
            return unknownFieldSetLiteGh;
        }
        return unknownFieldSetLiteUo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    /* JADX INFO: renamed from: te, reason: merged with bridge method [inline-methods] */
    public int KN(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.nr();
    }
}
