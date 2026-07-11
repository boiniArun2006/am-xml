package nI;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f71017n;
    private int rl = 0;

    void n(boolean z2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i5 = this.rl;
            this.rl = i5 + 1;
            t(i5, z2);
        }
    }

    private void t(int i2, boolean z2) {
        this.f71017n[i2] = z2 ? (byte) 1 : (byte) 0;
    }

    byte[] rl(int i2) {
        int length = this.f71017n.length * i2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i3] = this.f71017n[i3 / i2];
        }
        return bArr;
    }

    n(int i2) {
        this.f71017n = new byte[i2];
    }
}
