package com.fyber.inneractive.sdk.protobuf;

import com.safedk.android.internal.SafeDKWebAppInterface;
import java.lang.reflect.Field;
import java.nio.Buffer;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class v3 extends w3 {
    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        try {
            Class<?> cls = this.f56706a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            x3.a(th);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[PHI: r4
      0x0038: PHI (r4v9 java.lang.reflect.Field) = (r4v5 java.lang.reflect.Field), (r4v12 java.lang.reflect.Field) binds: [B:22:0x004a, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.w3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        Field declaredField;
        Class<?> cls = Long.TYPE;
        Unsafe unsafe = this.f56706a;
        if (unsafe != null) {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                Field field = null;
                if (d.a()) {
                    try {
                        declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (Throwable unused) {
                        declaredField = null;
                    }
                    if (declaredField != null) {
                        field = declaredField;
                        if (field != null) {
                            try {
                                Class<?> cls3 = this.f56706a.getClass();
                                cls3.getMethod("getByte", cls);
                                cls3.getMethod("putByte", cls, Byte.TYPE);
                                cls3.getMethod("getInt", cls);
                                cls3.getMethod("putInt", cls, Integer.TYPE);
                                cls3.getMethod("getLong", cls);
                                cls3.getMethod("putLong", cls, cls);
                                cls3.getMethod("copyMemory", cls, cls, cls);
                                cls3.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                                return true;
                            } catch (Throwable th) {
                                x3.a(th);
                                return false;
                            }
                        }
                    } else {
                        try {
                            declaredField = Buffer.class.getDeclaredField(SafeDKWebAppInterface.f62924j);
                        } catch (Throwable unused2) {
                            declaredField = null;
                        }
                        if (declaredField != null) {
                            if (declaredField.getType() == cls) {
                            }
                        }
                        if (field != null) {
                        }
                    }
                }
            } catch (Throwable th2) {
                x3.a(th2);
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final double c(Object obj, long j2) {
        return this.f56706a.getDouble(obj, j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final float d(Object obj, long j2) {
        return this.f56706a.getFloat(obj, j2);
    }

    public v3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j2, byte b2) {
        this.f56706a.putByte(obj, j2, b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a(Object obj, long j2) {
        return this.f56706a.getBoolean(obj, j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j2, boolean z2) {
        this.f56706a.putBoolean(obj, j2, z2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j2, float f3) {
        this.f56706a.putFloat(obj, j2, f3);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j2, double d2) {
        this.f56706a.putDouble(obj, j2, d2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte a(long j2) {
        return this.f56706a.getByte(j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(long j2, byte[] bArr, long j3) {
        this.f56706a.copyMemory((Object) null, j2, bArr, x3.f56723f, j3);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte b(Object obj, long j2) {
        return this.f56706a.getByte(obj, j2);
    }
}
