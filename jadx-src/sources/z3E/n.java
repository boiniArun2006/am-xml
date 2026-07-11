package z3E;

import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class n extends CN3 {
    private final short nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final short f76358t;

    @Override // z3E.CN3
    public void t(x4x.j jVar, byte[] bArr) {
        int i2 = 0;
        while (true) {
            short s2 = this.nr;
            if (i2 >= s2) {
                return;
            }
            if (i2 == 0 || (i2 == 31 && s2 <= 62)) {
                jVar.t(31, 5);
                short s3 = this.nr;
                if (s3 > 62) {
                    jVar.t(s3 - 31, 16);
                } else if (i2 == 0) {
                    jVar.t(Math.min((int) s3, 31), 5);
                } else {
                    jVar.t(s3 - 31, 5);
                }
            }
            jVar.t(bArr[this.f76358t + i2], 8);
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f76358t);
        sb.append("::");
        sb.append((this.f76358t + this.nr) - 1);
        sb.append(Typography.greater);
        return sb.toString();
    }

    n(CN3 cn3, int i2, int i3) {
        super(cn3);
        this.f76358t = (short) i2;
        this.nr = (short) i3;
    }
}
