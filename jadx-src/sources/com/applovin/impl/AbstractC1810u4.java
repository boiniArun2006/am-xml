package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.applovin.impl.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class AbstractC1810u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f50572a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f50573b;

    /* JADX INFO: renamed from: com.applovin.impl.u4$a */
    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f50578a;

        public static a a(int i2) {
            return i2 == 0 ? DEFAULT : i2 == 1 ? V2 : DEFAULT;
        }

        public int b() {
            return this.f50578a;
        }

        a(int i2) {
            this.f50578a = i2;
        }
    }

    public static byte[] a(String str, long j2, a aVar, String str2, C1802k c1802k) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() >= 86) {
            return TextUtils.isEmpty(str) ? new byte[0] : a.NONE == aVar ? str.getBytes() : a.V2 == aVar ? a(str, j2, false, str2, c1802k) : a(str, j2, str2, c1802k);
        }
        throw new IllegalArgumentException("SDK key is too short");
    }

    public static String b(String str, long j2, a aVar, String str2, C1802k c1802k) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() < 86) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (TextUtils.isEmpty(str) || a.NONE == aVar) {
            return str;
        }
        byte[] bArrA = a.V2 == aVar ? a(str, j2, true, str2, c1802k) : a(str, j2, str2, c1802k);
        if (bArrA != null) {
            return new String(bArrA);
        }
        return null;
    }

    private static int c(byte[] bArr, String str, C1802k c1802k) {
        int iA;
        int i2;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (iA = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(f50573b, c1802k).getBytes();
        int i3 = iA + 1;
        int length = bytes.length + i3;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i2 = length + 55) || bArr[i2] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i3, bytes.length + i3), bytes)) {
            return 0;
        }
        int i5 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i5;
    }

    static {
        byte[] bArr = new byte[32];
        f50573b = bArr;
        System.arraycopy(new byte[]{18, 12, 28, 20, 17, 23, 26, 9, 21, 3, 14, 29, 4, 0, 2, 7, 10, 29, 6, 20, 1}, 0, bArr, 0, 21);
    }

    private static byte[] a(String str, long j2, String str2, C1802k c1802k) {
        char c2 = ' ';
        try {
            String strSubstring = str2.substring(32);
            byte b2 = 0;
            String strSubstring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes(com.google.android.exoplayer2.C.UTF8_NAME);
            byte[] bArrA = a(strSubstring2, f50572a, c1802k);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j2 & 255)) ^ bArrA[0]);
            char c4 = '\b';
            byteArrayOutputStream.write(((byte) ((j2 >> 8) & 255)) ^ bArrA[1]);
            char c5 = 16;
            byteArrayOutputStream.write(((byte) ((j2 >> 16) & 255)) ^ bArrA[2]);
            byteArrayOutputStream.write(((byte) ((j2 >> 24) & 255)) ^ bArrA[3]);
            byteArrayOutputStream.write(((byte) ((j2 >> 32) & 255)) ^ bArrA[4]);
            byteArrayOutputStream.write(((byte) ((j2 >> 40) & 255)) ^ bArrA[5]);
            byteArrayOutputStream.write(((byte) ((j2 >> 48) & 255)) ^ bArrA[6]);
            byteArrayOutputStream.write(((byte) ((j2 >> 56) & 255)) ^ bArrA[7]);
            int i2 = 0;
            while (i2 < bytes.length) {
                char c6 = c4;
                char c7 = c5;
                long j3 = j2 + ((long) i2);
                long j4 = (j3 ^ (j3 >> 33)) * (-4417276706812531889L);
                long j5 = (j4 ^ (j4 >> 29)) * (-8796714831421723037L);
                long j6 = j5 ^ (j5 >> c2);
                char c8 = c2;
                byteArrayOutputStream.write((byte) (((long) ((i2 >= bytes.length ? b2 : bytes[i2]) ^ bArrA[i2 % bArrA.length])) ^ (j6 & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r4 % bArrA.length] ^ (i2 + 1 >= bytes.length ? (byte) 0 : bytes[r4]))) ^ ((j6 >> c6) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r4 % bArrA.length] ^ (i2 + 2 >= bytes.length ? (byte) 0 : bytes[r4]))) ^ ((j6 >> c7) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r4 % bArrA.length] ^ (i2 + 3 >= bytes.length ? (byte) 0 : bytes[r4]))) ^ ((j6 >> 24) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r4 % bArrA.length] ^ (i2 + 4 >= bytes.length ? (byte) 0 : bytes[r4]))) ^ ((j6 >> c8) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r4 % bArrA.length] ^ (i2 + 5 >= bytes.length ? (byte) 0 : bytes[r4]))) ^ ((j6 >> 40) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r4 % bArrA.length] ^ (i2 + 6 >= bytes.length ? (byte) 0 : bytes[r4]))) ^ ((j6 >> 48) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r4 % bArrA.length] ^ (i2 + 7 >= bytes.length ? (byte) 0 : bytes[r4]))) ^ ((j6 >> 56) & 255)));
                i2 += 8;
                c4 = c6;
                c5 = c7;
                c2 = c8;
                b2 = 0;
            }
            String strC = c(byteArrayOutputStream.toByteArray());
            return ("1:" + a(f50572a, c1802k) + ":" + strSubstring + ":" + strC).getBytes(com.google.android.exoplayer2.C.UTF8_NAME);
        } catch (UnsupportedEncodingException e2) {
            c1802k.D().a("AppLovinSdk", "encode", e2);
            return null;
        }
    }

    public static String b(byte[] bArr, String str, C1802k c1802k) {
        if (str != null) {
            if (str.length() < 86) {
                throw new IllegalArgumentException("SDK key is too short");
            }
            if (bArr == null) {
                return null;
            }
            if (bArr.length == 0) {
                return "";
            }
            a aVarB = b(bArr);
            if (a.NONE == aVarB) {
                return new String(bArr);
            }
            if (aVarB == a.V2) {
                return a(bArr, str, c1802k);
            }
            return a(new String(bArr), str, c1802k);
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static String c(byte[] bArr) {
        return a(Base64.encode(bArr, 2));
    }

    public static a b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char c2 = (char) bArr[0];
            if (c2 == '2') {
                return a.V2;
            }
            if (c2 == '{') {
                return a.NONE;
            }
            return a.DEFAULT;
        }
        return a.NONE;
    }

    private static byte[] b(String str) {
        return Base64.decode(a(str), 0);
    }

    private static byte[] a(String str, long j2, boolean z2, String str2, C1802k c1802k) {
        ByteBuffer byteBufferAllocate;
        try {
            byte[] bytes = str.getBytes(com.google.android.exoplayer2.C.UTF8_NAME);
            int length = bytes.length;
            String strSubstring = str2.substring(32);
            String strSubstring2 = str2.substring(0, 32);
            byte[] bArr = f50573b;
            byte[] bArrA = a(strSubstring2, bArr, c1802k);
            long jC = n7.c(bArrA) ^ j2;
            byte[] bytes2 = String.format("2:%s:%s:", a(bArr, c1802k), strSubstring).getBytes();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
            byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate2.putLong(length);
            byteBufferAllocate2.putLong(jC);
            byteBufferAllocate2.flip();
            byte[] bArrA2 = a(n7.a(bytes), j2, bArrA);
            if (z2) {
                byte[] bytes3 = c(byteBufferAllocate2.array()).getBytes();
                byte[] bytes4 = c(bArrA2).getBytes();
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(bytes3);
                byteBufferAllocate.put(bytes4);
            } else {
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + byteBufferAllocate2.remaining() + bArrA2.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(byteBufferAllocate2);
                byteBufferAllocate.put(bArrA2);
            }
            byteBufferAllocate.flip();
            return byteBufferAllocate.array();
        } catch (UnsupportedEncodingException e2) {
            c1802k.D().a("AppLovinSdk", "encode2", e2);
            throw new RuntimeException("UTF-8 encoding not found", e2);
        } catch (IOException e3) {
            c1802k.D().a("AppLovinSdk", "encode2", e3);
            return null;
        }
    }

    private static byte[] a(byte[] bArr, long j2, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        long j3 = j2;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i2 % 8 == 0) {
                long j4 = ((long) i2) + j2;
                long j5 = (j4 ^ (j4 >>> 33)) * (-4417276706812531889L);
                long j6 = (j5 ^ (j5 >>> 29)) * (-8796714831421723037L);
                j3 = j6 ^ (j6 >>> 32);
            }
            byte b2 = bArrCopyOf[i2];
            bArrCopyOf[i2] = (byte) (((long) b2) ^ (((j3 >> (r4 * 8)) & 255) ^ ((long) bArr2[i2 % bArr2.length])));
        }
        return bArrCopyOf;
    }

    private static String a(String str, String str2, C1802k c1802k) {
        String str3;
        String[] strArrSplit = str.split(":");
        try {
            try {
                if (!"1".equals(strArrSplit[0]) || strArrSplit.length != 4) {
                    return null;
                }
                String str4 = strArrSplit[1];
                char c2 = 2;
                String str5 = strArrSplit[2];
                char c4 = 3;
                byte[] bArrB = b(strArrSplit[3]);
                if (!str2.endsWith(str5)) {
                    return null;
                }
                byte[] bArr = f50572a;
                if (!a(bArr, c1802k).equals(str4)) {
                    return null;
                }
                byte[] bArrA = a(str2.substring(0, 32), bArr, c1802k);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrB);
                char c5 = 5;
                str3 = null;
                char c6 = '(';
                try {
                    char c7 = 7;
                    long j2 = (((long) ((byteArrayInputStream.read() ^ bArrA[1]) & 255)) << 8) | ((long) ((byteArrayInputStream.read() ^ bArrA[0]) & 255)) | (((long) ((byteArrayInputStream.read() ^ bArrA[2]) & 255)) << 16) | (((long) ((byteArrayInputStream.read() ^ bArrA[3]) & 255)) << 24) | (((long) ((byteArrayInputStream.read() ^ bArrA[4]) & 255)) << 32) | (((byteArrayInputStream.read() ^ bArrA[5]) & 255) << 40) | (((long) ((byteArrayInputStream.read() ^ bArrA[6]) & 255)) << 48) | (((long) ((byteArrayInputStream.read() ^ bArrA[7]) & 255)) << 56);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[8];
                    int i2 = byteArrayInputStream.read(bArr2);
                    int i3 = 0;
                    while (i2 >= 0) {
                        char c8 = c7;
                        long j3 = ((long) i3) + j2;
                        long j4 = (j3 ^ (j3 >> 33)) * (-4417276706812531889L);
                        long j5 = (j4 ^ (j4 >> 29)) * (-8796714831421723037L);
                        long j6 = j5 ^ (j5 >> 32);
                        byteArrayOutputStream.write((byte) (((long) (bArr2[0] ^ bArrA[i3 % bArrA.length])) ^ (j6 & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[1] ^ bArrA[(i3 + 1) % bArrA.length])) ^ ((j6 >> 8) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[r23] ^ bArrA[(i3 + 2) % bArrA.length])) ^ ((j6 >> 16) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[r27] ^ bArrA[(i3 + 3) % bArrA.length])) ^ ((j6 >> 24) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[4] ^ bArrA[(i3 + 4) % bArrA.length])) ^ ((j6 >> 32) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[r26] ^ bArrA[(i3 + 5) % bArrA.length])) ^ ((j6 >> r28) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[6] ^ bArrA[(i3 + 6) % bArrA.length])) ^ ((j6 >> 48) & 255)));
                        byteArrayOutputStream.write((byte) (((j6 >> 56) & 255) ^ ((long) (bArr2[c8] ^ bArrA[(i3 + 7) % bArrA.length]))));
                        i3 += 8;
                        c2 = c2;
                        c5 = c5;
                        c4 = c4;
                        c6 = c6;
                        i2 = byteArrayInputStream.read(bArr2);
                        c7 = c8;
                    }
                    return AppLovinNetworkBridge.stringInit(byteArrayOutputStream.toByteArray(), com.google.android.exoplayer2.C.UTF8_NAME).trim();
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (IOException e3) {
                e = e3;
                str3 = null;
            }
            C1804o.b("AppLovinSdk", "Failed to read bytes", e);
            c1802k.D().a("AppLovinSdk", "decode", e);
            return str3;
        } catch (UnsupportedEncodingException e4) {
            c1802k.D().a("AppLovinSdk", "decode", e4);
            throw new RuntimeException("UTF-8 encoding not found", e4);
        }
    }

    private static String a(byte[] bArr, String str, C1802k c1802k) {
        try {
            int iC = c(bArr, str, c1802k);
            if (iC == 0) {
                return null;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iC, bArr.length);
            if (bArrCopyOfRange.length < 16) {
                return null;
            }
            long jA = n7.a(bArrCopyOfRange, 8);
            byte[] bArrA = a(str.substring(0, 32), f50573b, c1802k);
            return AppLovinNetworkBridge.stringInit(n7.d(a(Arrays.copyOfRange(bArrCopyOfRange, 16, bArrCopyOfRange.length), jA ^ n7.c(bArrA), bArrA)), com.google.android.exoplayer2.C.UTF8_NAME);
        } catch (UnsupportedEncodingException e2) {
            c1802k.D().a("AppLovinSdk", "decode2", e2);
            throw new RuntimeException("UTF-8 encoding not found", e2);
        } catch (IOException e3) {
            C1804o.b("AppLovinSdk", "Failed to ungzip decode", e3);
            c1802k.D().a("AppLovinSdk", "decode2", e3);
            return null;
        }
    }

    private static int a(byte[] bArr, byte b2) {
        if (bArr != null && bArr.length != 0) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                if (bArr[i2] == b2) {
                    return i2;
                }
            }
        }
        return -1;
    }

    private static byte[] a(String str, byte[] bArr, C1802k c1802k) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes(com.google.android.exoplayer2.C.UTF8_NAME));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e2) {
            c1802k.D().a("AppLovinSdk", "SHA256", e2);
            throw new RuntimeException("SHA-256 algorithm not found", e2);
        }
    }

    private static String a(byte[] bArr, C1802k c1802k) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            c1802k.D().a("AppLovinSdk", "SHA1", e2);
            throw new RuntimeException("SHA-1 algorithm not found", e2);
        }
    }

    private static String a(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', '=');
    }

    private static String a(byte[] bArr) {
        return AppLovinNetworkBridge.stringInit(bArr, com.google.android.exoplayer2.C.UTF8_NAME).replace('+', '-').replace('/', '_').replace('=', '*');
    }
}
