package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class KH extends gnv {
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    boolean Ik(l4Z l4z) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void rl(fg fgVar, int i2, long j2) {
        fgVar.ty(M5.t(i2, 1), Long.valueOf(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public void O(fg fgVar, int i2, long j2) {
        fgVar.ty(M5.t(i2, 0), Long.valueOf(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public void t(fg fgVar, int i2, fg fgVar2) {
        fgVar.ty(M5.t(i2, 3), fgVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public void n(fg fgVar, int i2, int i3) {
        fgVar.ty(M5.t(i2, 5), Integer.valueOf(i3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public void nr(fg fgVar, int i2, fuX fux) {
        fgVar.ty(M5.t(i2, 2), fux);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void ck(Object obj, fg fgVar) {
        ((Q) obj).unknownFields = fgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public fg Uo(Object obj) {
        return ((Q) obj).unknownFields;
    }

    KH() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: E2, reason: merged with bridge method [inline-methods] */
    public fg ty() {
        return fg.gh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void o(fg fgVar, YzO yzO) {
        fgVar.ck(yzO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public fg r(fg fgVar) {
        fgVar.KN();
        return fgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void HI(Object obj, fg fgVar) {
        ck(obj, fgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: fD, reason: merged with bridge method [inline-methods] */
    public fg gh(fg fgVar, fg fgVar2) {
        if (fg.t().equals(fgVar2)) {
            return fgVar;
        }
        if (fg.t().equals(fgVar)) {
            return fg.mUb(fgVar, fgVar2);
        }
        return fgVar.xMQ(fgVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: iF, reason: merged with bridge method [inline-methods] */
    public int xMQ(fg fgVar) {
        return fgVar.O();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    void mUb(Object obj) {
        Uo(obj).KN();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: nHg, reason: merged with bridge method [inline-methods] */
    public void Z(fg fgVar, YzO yzO) {
        fgVar.r(yzO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public fg J2(Object obj) {
        fg fgVarUo = Uo(obj);
        if (fgVarUo == fg.t()) {
            fg fgVarGh = fg.gh();
            ck(obj, fgVarGh);
            return fgVarGh;
        }
        return fgVarUo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.gnv
    /* JADX INFO: renamed from: te, reason: merged with bridge method [inline-methods] */
    public int KN(fg fgVar) {
        return fgVar.nr();
    }
}
