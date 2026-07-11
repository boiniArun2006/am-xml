package P6;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[][] f7578n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f7579t;

    public void J2(int i2, int i3, int i5) {
        this.f7578n[i3][i2] = (byte) i5;
    }

    public int O() {
        return this.rl;
    }

    public void Uo(int i2, int i3, boolean z2) {
        this.f7578n[i3][i2] = z2 ? (byte) 1 : (byte) 0;
    }

    public void n(byte b2) {
        for (byte[] bArr : this.f7578n) {
            Arrays.fill(bArr, b2);
        }
    }

    public int nr() {
        return this.f7579t;
    }

    public byte rl(int i2, int i3) {
        return this.f7578n[i3][i2];
    }

    public byte[][] t() {
        return this.f7578n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.rl * 2 * this.f7579t) + 2);
        for (int i2 = 0; i2 < this.f7579t; i2++) {
            byte[] bArr = this.f7578n[i2];
            for (int i3 = 0; i3 < this.rl; i3++) {
                byte b2 = bArr[i3];
                if (b2 == 0) {
                    sb.append(" 0");
                } else if (b2 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public n(int i2, int i3) {
        this.f7578n = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3, i2);
        this.rl = i2;
        this.f7579t = i3;
    }
}
