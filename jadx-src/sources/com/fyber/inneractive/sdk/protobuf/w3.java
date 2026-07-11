package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f56706a;

    public abstract byte a(long j2);

    public abstract void a(long j2, byte[] bArr, long j3);

    public abstract void a(Object obj, long j2, byte b2);

    public abstract void a(Object obj, long j2, double d2);

    public abstract void a(Object obj, long j2, float f3);

    public abstract void a(Object obj, long j2, boolean z2);

    public boolean a() {
        Unsafe unsafe = this.f56706a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            x3.a(th);
            return false;
        }
    }

    public abstract boolean a(Object obj, long j2);

    public abstract byte b(Object obj, long j2);

    public abstract boolean b();

    public abstract double c(Object obj, long j2);

    public abstract float d(Object obj, long j2);

    public w3(Unsafe unsafe) {
        this.f56706a = unsafe;
    }
}
