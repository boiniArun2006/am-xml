package EQK;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class j extends FilterInputStream {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2298n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2299t;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f2298n == 0) {
            return -1;
        }
        int i2 = ((FilterInputStream) this).in.read();
        if (i2 != -1) {
            this.f2298n--;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.f2298n);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i2);
            this.f2299t = this.f2298n;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.f2299t == -1) {
            throw new IOException("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f2298n = this.f2299t;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j2, this.f2298n));
        this.f2298n = (int) (((long) this.f2298n) - jSkip);
        return jSkip;
    }

    public j(InputStream inputStream, int i2) {
        super(inputStream);
        inputStream.getClass();
        if (i2 >= 0) {
            this.f2298n = i2;
            this.f2299t = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i5 = this.f2298n;
        if (i5 == 0) {
            return -1;
        }
        int i7 = ((FilterInputStream) this).in.read(bArr, i2, Math.min(i3, i5));
        if (i7 > 0) {
            this.f2298n -= i7;
        }
        return i7;
    }
}
