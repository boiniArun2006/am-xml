package O6;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class n {
    private static final Runtime J2 = Runtime.getRuntime();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InputStream f7282n;
    private byte[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f7283t = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f7281O = true;
    private boolean nr = false;

    private int Uo(int i2) {
        int iMax = Math.max(this.rl.length * 2, i2);
        Runtime runtime = J2;
        long jMaxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        if (!this.f7281O || iMax >= jMaxMemory) {
            Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
        } else {
            try {
                byte[] bArr = new byte[iMax];
                System.arraycopy(this.rl, 0, bArr, 0, this.f7283t);
                this.rl = bArr;
            } catch (OutOfMemoryError unused) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                this.f7281O = false;
            }
        }
        return this.rl.length;
    }

    public boolean J2() {
        return this.nr;
    }

    public byte[] O() {
        return this.rl;
    }

    public int n(int i2) {
        int i3 = this.f7283t;
        int i5 = 0;
        if (i2 <= i3) {
            int i7 = i3 - i2;
            this.f7283t = i7;
            byte[] bArr = this.rl;
            System.arraycopy(bArr, i2, bArr, 0, i7);
            return i2;
        }
        this.f7283t = 0;
        while (i5 < i2) {
            int iSkip = (int) this.f7282n.skip(i2 - i5);
            if (iSkip > 0) {
                i5 += iSkip;
            } else if (iSkip != 0) {
                continue;
            } else {
                if (this.f7282n.read() == -1) {
                    break;
                }
                i5++;
            }
        }
        return i5;
    }

    public int nr(int i2) throws IOException {
        if (i2 > this.rl.length) {
            i2 = Math.min(i2, Uo(i2));
        }
        while (true) {
            int i3 = this.f7283t;
            if (i3 >= i2) {
                break;
            }
            int i5 = this.f7282n.read(this.rl, i3, i2 - i3);
            if (i5 == -1) {
                this.nr = true;
                break;
            }
            this.f7283t += i5;
        }
        return this.f7283t;
    }

    public int rl() {
        return this.f7283t;
    }

    public void t() throws IOException {
        this.f7282n.close();
    }

    public n(InputStream inputStream, int i2) {
        this.f7282n = inputStream;
        this.rl = new byte[i2];
    }
}
