package com.fyber.inneractive.sdk.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class b0 extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f56531b = Logger.getLogger(b0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f56532c = x3.f56722e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f56533a;

    public static int a(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static long b(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int c(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int d(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public abstract void a(byte b2);

    public abstract void a(int i2, int i3);

    public abstract void a(int i2, long j2);

    public abstract void a(int i2, d2 d2Var);

    public abstract void a(int i2, d2 d2Var, t2 t2Var);

    public abstract void a(int i2, s sVar);

    public abstract void a(int i2, boolean z2);

    public abstract void a(String str, int i2);

    public abstract void b(int i2, int i3);

    public abstract void b(int i2, long j2);

    public abstract void b(int i2, s sVar);

    public abstract void c(int i2, int i3);

    public abstract void c(long j2);

    public abstract void d(int i2, int i3);

    public abstract void d(long j2);

    public abstract void e(int i2);

    public abstract void f(int i2);

    public abstract void g(int i2);

    public static int a(int i2) {
        if (i2 >= 0) {
            return c(i2);
        }
        return 10;
    }

    public static int b(int i2) {
        return c(i2 << 3);
    }

    public static int a(String str) {
        int length;
        try {
            length = d4.a(str);
        } catch (b4 unused) {
            length = str.getBytes(l1.f56612a).length;
        }
        return c(length) + length;
    }

    public static int a(s sVar) {
        int size = sVar.size();
        return c(size) + size;
    }

    public final void a(String str, b4 b4Var) throws z {
        f56531b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) b4Var);
        byte[] bytes = str.getBytes(l1.f56612a);
        try {
            g(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (z e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new z(e3);
        }
    }
}
