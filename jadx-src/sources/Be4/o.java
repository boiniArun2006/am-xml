package Be4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class o extends InputStream {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InputStream f558n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f559t = 1073741824;

    private final int n(int i2) {
        if (i2 == -1) {
            this.f559t = 0;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public int read() {
        return n(this.f558n.read());
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f559t;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f558n.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return n(this.f558n.read(bArr));
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        return this.f558n.skip(j2);
    }

    public o(InputStream inputStream) {
        this.f558n = inputStream;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        return n(this.f558n.read(bArr, i2, i3));
    }
}
