package com.fyber.inneractive.sdk.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class s implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f56654b = new q(l1.f56613b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f56655c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56656a = 0;

    public static q a(String str) {
        return new q(str.getBytes(l1.f56612a));
    }

    public abstract int a(int i2, int i3);

    public abstract void a(int i2, byte[] bArr);

    public abstract void a(k kVar);

    public abstract byte c(int i2);

    public abstract boolean c();

    public abstract byte d(int i2);

    public abstract w d();

    public abstract s e(int i2);

    public abstract String e();

    public abstract int size();

    static {
        f56655c = d.a() ? new r() : new m();
    }

    public static int a(int i2, int i3, int i5) {
        int i7 = i3 - i2;
        if ((i2 | i3 | i7 | (i5 - i3)) >= 0) {
            return i7;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i5);
    }

    public final String f() {
        Charset charset = l1.f56612a;
        return size() == 0 ? "" : e();
    }

    public final int hashCode() {
        int iA = this.f56656a;
        if (iA == 0) {
            int size = size();
            iA = a(size, size);
            if (iA == 0) {
                iA = 1;
            }
            this.f56656a = iA;
        }
        return iA;
    }

    public final String toString() {
        String strA;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strA = h3.a(this);
        } else {
            strA = h3.a(e(47)) + "...";
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + strA + "\">";
    }
}
