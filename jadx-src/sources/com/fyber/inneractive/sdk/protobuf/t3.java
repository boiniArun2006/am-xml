package com.fyber.inneractive.sdk.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class t3 extends w3 {
    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j2, byte b2) {
        if (x3.f56725h) {
            x3.a(obj, j2, b2);
        } else {
            x3.b(obj, j2, b2);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte b(Object obj, long j2) {
        return x3.f56725h ? x3.a(obj, j2) : x3.b(obj, j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final double c(Object obj, long j2) {
        return Double.longBitsToDouble(this.f56706a.getLong(obj, j2));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final float d(Object obj, long j2) {
        return Float.intBitsToFloat(this.f56706a.getInt(obj, j2));
    }

    public t3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a(Object obj, long j2) {
        return x3.f56725h ? x3.a(obj, j2) != 0 : x3.b(obj, j2) != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j2, boolean z2) {
        if (x3.f56725h) {
            x3.a(obj, j2, z2 ? (byte) 1 : (byte) 0);
        } else {
            x3.b(obj, j2, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j2, float f3) {
        this.f56706a.putInt(obj, j2, Float.floatToIntBits(f3));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j2, double d2) {
        this.f56706a.putLong(obj, j2, Double.doubleToLongBits(d2));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte a(long j2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(long j2, byte[] bArr, long j3) {
        throw new UnsupportedOperationException();
    }
}
