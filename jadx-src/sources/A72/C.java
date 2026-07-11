package A72;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f6n;
    private final j rl;

    public C(j jVar) {
        this(jVar, 16384);
    }

    public C(j jVar, int i2) {
        Hh.C.rl(Boolean.valueOf(i2 > 0));
        this.f6n = i2;
        this.rl = jVar;
    }

    public long n(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = (byte[]) this.rl.get(this.f6n);
        long j2 = 0;
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, this.f6n);
                if (i2 == -1) {
                    return j2;
                }
                outputStream.write(bArr, 0, i2);
                j2 += (long) i2;
            } finally {
                this.rl.n(bArr);
            }
        }
    }
}
