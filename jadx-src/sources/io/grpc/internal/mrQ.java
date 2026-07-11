package io.grpc.internal;

import com.google.common.io.BaseEncoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class mrQ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f68638n = Logger.getLogger(mrQ.class.getName());
    private static final byte[] rl = "-bin".getBytes(t1.I28.f73395n);

    public static byte[][] O(byte[][] bArr) {
        for (int i2 = 0; i2 < bArr.length; i2 += 2) {
            byte[] bArr2 = bArr[i2];
            int i3 = i2 + 1;
            byte[] bArr3 = bArr[i3];
            if (n(bArr2, rl)) {
                for (byte b2 : bArr3) {
                    if (b2 == 44) {
                        return t(bArr, i2);
                    }
                }
                bArr[i3] = BaseEncoding.n().rl(new String(bArr3, t1.I28.f73395n));
            }
        }
        return bArr;
    }

    private static boolean n(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i2 = length; i2 < bArr.length; i2++) {
            if (bArr[i2] != bArr2[i2 - length]) {
                return false;
            }
        }
        return true;
    }

    private static boolean rl(byte[] bArr) {
        for (byte b2 : bArr) {
            if (b2 < 32 || b2 > 126) {
                return false;
            }
        }
        return true;
    }

    private static byte[][] t(byte[][] bArr, int i2) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(bArr[i3]);
        }
        while (i2 < bArr.length) {
            byte[] bArr2 = bArr[i2];
            byte[] bArr3 = bArr[i2 + 1];
            if (n(bArr2, rl)) {
                int i5 = 0;
                for (int i7 = 0; i7 <= bArr3.length; i7++) {
                    if (i7 == bArr3.length || bArr3[i7] == 44) {
                        byte[] bArrRl = BaseEncoding.n().rl(new String(bArr3, i5, i7 - i5, t1.I28.f73395n));
                        arrayList.add(bArr2);
                        arrayList.add(bArrRl);
                        i5 = i7 + 1;
                    }
                }
            } else {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            }
            i2 += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    public static byte[][] nr(io.grpc.QJ qj) {
        byte[][] bArrNr = io.grpc.C.nr(qj);
        if (bArrNr == null) {
            return new byte[0][];
        }
        int i2 = 0;
        for (int i3 = 0; i3 < bArrNr.length; i3 += 2) {
            byte[] bArr = bArrNr[i3];
            byte[] bArr2 = bArrNr[i3 + 1];
            if (n(bArr, rl)) {
                bArrNr[i2] = bArr;
                bArrNr[i2 + 1] = io.grpc.C.rl.O(bArr2).getBytes(t1.I28.f73395n);
            } else if (rl(bArr2)) {
                bArrNr[i2] = bArr;
                bArrNr[i2 + 1] = bArr2;
            } else {
                String str = new String(bArr, t1.I28.f73395n);
                f68638n.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i2 += 2;
        }
        if (i2 == bArrNr.length) {
            return bArrNr;
        }
        return (byte[][]) Arrays.copyOfRange(bArrNr, 0, i2);
    }
}
