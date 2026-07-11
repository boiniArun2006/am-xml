package com.fyber.inneractive.sdk.protobuf;

import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f56612a = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f56613b;

    public static String a(byte[] bArr) {
        return new String(bArr, f56612a);
    }

    static {
        Charset.forName(C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        f56613b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static z0 a(Object obj, Object obj2) {
        d2 d2Var = (d2) obj2;
        t0 t0Var = (t0) ((d2) obj).toBuilder();
        if (!t0Var.f56665a.getClass().isInstance(d2Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        t0Var.c();
        t0.a(t0Var.f56666b, (z0) ((b) d2Var));
        return t0Var.b();
    }
}
