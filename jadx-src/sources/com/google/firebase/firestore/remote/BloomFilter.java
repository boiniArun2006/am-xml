package com.google.firebase.firestore.remote;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class BloomFilter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f60367n;
    private final MessageDigest nr;
    private final com.google.protobuf.C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f60368t;

    private int nr(long j2, long j3, int i2) {
        return (int) xMQ(j2 + (j3 * ((long) i2)), this.f60367n);
    }

    private static long xMQ(long j2, long j3) {
        long j4 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
        if (j4 < j3) {
            j3 = 0;
        }
        return j4 - j3;
    }

    public static final class BloomFilterCreateException extends Exception {
        public BloomFilterCreateException(String str) {
            super(str);
        }
    }

    private boolean J2(int i2) {
        return ((1 << (i2 % 8)) & this.rl.byteAt(i2 / 8)) != 0;
    }

    private static long O(byte[] bArr, int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            j2 |= (((long) bArr[i2 + i3]) & 255) << (i3 * 8);
        }
        return j2;
    }

    private byte[] Uo(String str) {
        return this.nr.digest(str.getBytes(StandardCharsets.UTF_8));
    }

    public static BloomFilter n(com.google.protobuf.C c2, int i2, int i3) throws BloomFilterCreateException {
        if (i2 < 0 || i2 >= 8) {
            throw new BloomFilterCreateException("Invalid padding: " + i2);
        }
        if (i3 < 0) {
            throw new BloomFilterCreateException("Invalid hash count: " + i3);
        }
        if (c2.size() > 0 && i3 == 0) {
            throw new BloomFilterCreateException("Invalid hash count: " + i3);
        }
        if (c2.size() != 0 || i2 == 0) {
            return new BloomFilter(c2, i2, i3);
        }
        throw new BloomFilterCreateException("Expected padding of 0 when bitmap length is 0, but got " + i2);
    }

    private static MessageDigest rl() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e2);
        }
    }

    public boolean KN(String str) {
        if (this.f60367n == 0) {
            return false;
        }
        byte[] bArrUo = Uo(str);
        if (bArrUo.length != 16) {
            throw new RuntimeException("Invalid md5 hash array length: " + bArrUo.length + " (expected 16)");
        }
        long jO = O(bArrUo, 0);
        long jO2 = O(bArrUo, 8);
        for (int i2 = 0; i2 < this.f60368t; i2++) {
            if (!J2(nr(jO, jO2, i2))) {
                return false;
            }
        }
        return true;
    }

    int t() {
        return this.f60367n;
    }

    public String toString() {
        return "BloomFilter{hashCount=" + this.f60368t + ", size=" + this.f60367n + ", bitmap=\"" + Base64.encodeToString(this.rl.toByteArray(), 2) + "\"}";
    }

    public BloomFilter(com.google.protobuf.C c2, int i2, int i3) {
        if (i2 >= 0 && i2 < 8) {
            if (i3 >= 0) {
                if (c2.size() > 0 && i3 == 0) {
                    throw new IllegalArgumentException("Invalid hash count: " + i3);
                }
                if (c2.size() == 0 && i2 != 0) {
                    throw new IllegalArgumentException("Expected padding of 0 when bitmap length is 0, but got " + i2);
                }
                this.rl = c2;
                this.f60368t = i3;
                this.f60367n = (c2.size() * 8) - i2;
                this.nr = rl();
                return;
            }
            throw new IllegalArgumentException("Invalid hash count: " + i3);
        }
        throw new IllegalArgumentException("Invalid padding: " + i2);
    }
}
