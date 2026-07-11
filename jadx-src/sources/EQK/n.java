package EQK;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class n extends FilterInputStream {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f2300O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f2301n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2302t;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i2 = ((FilterInputStream) this).in.read();
        return i2 != -1 ? i2 : n();
    }

    private int n() {
        int i2 = this.f2302t;
        byte[] bArr = this.f2301n;
        if (i2 >= bArr.length) {
            return -1;
        }
        this.f2302t = i2 + 1;
        return bArr[i2] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i2);
            this.f2300O = this.f2302t;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f2302t = this.f2300O;
    }

    public n(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.f2301n = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i5 = ((FilterInputStream) this).in.read(bArr, i2, i3);
        if (i5 != -1) {
            return i5;
        }
        int i7 = 0;
        if (i3 == 0) {
            return 0;
        }
        while (i7 < i3) {
            int iN = n();
            if (iN == -1) {
                break;
            }
            bArr[i2 + i7] = (byte) iN;
            i7++;
        }
        if (i7 > 0) {
            return i7;
        }
        return -1;
    }
}
