package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class Encoding {
    static void Ik(OutputStream outputStream, long j2) throws IOException {
        HI(outputStream, j2, 4);
    }

    static int KN(InputStream inputStream) {
        return (int) Uo(inputStream, 2);
    }

    static void az(OutputStream outputStream, byte[] bArr) throws IOException {
        Ik(outputStream, bArr.length);
        byte[] bArrRl = rl(bArr);
        Ik(outputStream, bArrRl.length);
        outputStream.write(bArrRl);
    }

    static void ck(OutputStream outputStream, int i2) throws IOException {
        HI(outputStream, i2, 2);
    }

    static int mUb(InputStream inputStream) {
        return (int) Uo(inputStream, 1);
    }

    static void r(OutputStream outputStream, int i2) throws IOException {
        HI(outputStream, i2, 1);
    }

    static long xMQ(InputStream inputStream) {
        return Uo(inputStream, 4);
    }

    static void HI(OutputStream outputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static String J2(InputStream inputStream, int i2) {
        return new String(nr(inputStream, i2), StandardCharsets.UTF_8);
    }

    static byte[] O(InputStream inputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i5 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i5 < i2) {
                int i7 = inputStream.read(bArr2);
                if (i7 < 0) {
                    throw t("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i7);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i5 += i7;
                } catch (DataFormatException e2) {
                    throw t(e2.getMessage());
                }
            }
            if (i5 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw t("Inflater did not finish");
            }
            throw t("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i5);
        } finally {
            inflater.end();
        }
    }

    static int gh(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static int n(int i2) {
        return ((i2 + 7) & (-8)) / 8;
    }

    static byte[] nr(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i5 = inputStream.read(bArr, i3, i2 - i3);
            if (i5 < 0) {
                throw t("Not enough bytes to read: " + i2);
            }
            i3 += i5;
        }
        return bArr;
    }

    static void qie(InputStream inputStream, OutputStream outputStream, FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i2);
            }
        }
    }

    static byte[] rl(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    static RuntimeException t(String str) {
        return new IllegalStateException(str);
    }

    static void ty(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static long Uo(InputStream inputStream, int i2) throws IOException {
        byte[] bArrNr = nr(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArrNr[i3] & UByte.MAX_VALUE)) << (i3 * 8);
        }
        return j2;
    }
}
