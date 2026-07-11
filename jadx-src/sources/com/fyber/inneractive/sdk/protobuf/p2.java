package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2 f56635c = new p2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f56637b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f56636a = new x1();

    public final t2 a(Class cls) {
        t2 t2VarA;
        Class cls2;
        Charset charset = l1.f56612a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        t2 t2Var = (t2) this.f56637b.get(cls);
        if (t2Var != null) {
            return t2Var;
        }
        x1 x1Var = this.f56636a;
        x1Var.getClass();
        Class cls3 = u2.f56681a;
        if (!z0.class.isAssignableFrom(cls) && (cls2 = u2.f56681a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        r2 r2VarB = x1Var.f56716a.b(cls);
        if ((r2VarB.f56652d & 2) == 2) {
            if (z0.class.isAssignableFrom(cls)) {
                t2VarA = new j2(u2.f56684d, k0.f56606a, r2VarB.f56649a);
            } else {
                o3 o3Var = u2.f56682b;
                j0 j0Var = k0.f56607b;
                if (j0Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                t2VarA = new j2(o3Var, j0Var, r2VarB.f56649a);
            }
        } else if (z0.class.isAssignableFrom(cls)) {
            t2VarA = ((r2VarB.f56652d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO2 ? i2.a(r2VarB, l2.f56615b, t1.f56669b, u2.f56684d, k0.f56606a, a2.f56528b) : i2.a(r2VarB, l2.f56615b, t1.f56669b, u2.f56684d, (j0) null, a2.f56528b);
        } else {
            if (((r2VarB.f56652d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO2) {
                k2 k2Var = l2.f56614a;
                r1 r1Var = t1.f56668a;
                o3 o3Var2 = u2.f56682b;
                j0 j0Var2 = k0.f56607b;
                if (j0Var2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                t2VarA = i2.a(r2VarB, k2Var, r1Var, o3Var2, j0Var2, a2.f56527a);
            } else {
                t2VarA = i2.a(r2VarB, l2.f56614a, t1.f56668a, u2.f56683c, (j0) null, a2.f56527a);
            }
        }
        t2 t2Var2 = (t2) this.f56637b.putIfAbsent(cls, t2VarA);
        return t2Var2 != null ? t2Var2 : t2VarA;
    }
}
