package z3E;

import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class I28 extends CN3 {
    private final short nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final short f76347t;

    @Override // z3E.CN3
    void t(x4x.j jVar, byte[] bArr) {
        jVar.t(this.f76347t, this.nr);
    }

    public String toString() {
        short s2 = this.f76347t;
        short s3 = this.nr;
        return "<" + Integer.toBinaryString((s2 & ((1 << s3) - 1)) | (1 << s3) | (1 << this.nr)).substring(1) + Typography.greater;
    }

    I28(CN3 cn3, int i2, int i3) {
        super(cn3);
        this.f76347t = (short) i2;
        this.nr = (short) i3;
    }
}
