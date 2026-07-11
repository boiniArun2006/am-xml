package Hh;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {
    public static long n(InputStream inputStream, OutputStream outputStream) throws IOException {
        C.Uo(inputStream);
        C.Uo(outputStream);
        byte[] bArr = new byte[4096];
        long j2 = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return j2;
            }
            outputStream.write(bArr, 0, i2);
            j2 += (long) i2;
        }
    }

    public static int rl(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
        C.Uo(inputStream);
        C.Uo(bArr);
        if (i3 >= 0) {
            int i5 = 0;
            while (i5 < i3) {
                int i7 = inputStream.read(bArr, i2 + i5, i3 - i5);
                if (i7 == -1) {
                    break;
                }
                i5 += i7;
            }
            return i5;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }
}
