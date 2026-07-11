package OGa;

import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class n extends OutputStream {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f7302n = 0;

    @Override // java.io.OutputStream
    public void write(int i2) {
        this.f7302n++;
    }

    long n() {
        return this.f7302n;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f7302n += (long) bArr.length;
    }

    n() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        int i5;
        if (i2 >= 0 && i2 <= bArr.length && i3 >= 0 && (i5 = i2 + i3) <= bArr.length && i5 >= 0) {
            this.f7302n += (long) i3;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
