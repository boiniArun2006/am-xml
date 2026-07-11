package io.grpc.internal;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Lu implements RGN {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RGN f68298n;

    @Override // io.grpc.internal.RGN
    public void ER(OutputStream outputStream, int i2) {
        this.f68298n.ER(outputStream, i2);
    }

    @Override // io.grpc.internal.RGN
    public void I(ByteBuffer byteBuffer) {
        this.f68298n.I(byteBuffer);
    }

    @Override // io.grpc.internal.RGN
    public void Po6() {
        this.f68298n.Po6();
    }

    @Override // io.grpc.internal.RGN
    public void Rl(byte[] bArr, int i2, int i3) {
        this.f68298n.Rl(bArr, i2, i3);
    }

    @Override // io.grpc.internal.RGN
    public RGN S(int i2) {
        return this.f68298n.S(i2);
    }

    @Override // io.grpc.internal.RGN
    public boolean markSupported() {
        return this.f68298n.markSupported();
    }

    @Override // io.grpc.internal.RGN
    public int nr() {
        return this.f68298n.nr();
    }

    @Override // io.grpc.internal.RGN
    public int readUnsignedByte() {
        return this.f68298n.readUnsignedByte();
    }

    @Override // io.grpc.internal.RGN
    public void reset() {
        this.f68298n.reset();
    }

    @Override // io.grpc.internal.RGN
    public void skipBytes(int i2) {
        this.f68298n.skipBytes(i2);
    }

    protected Lu(RGN rgn) {
        this.f68298n = (RGN) t1.Xo.ck(rgn, "buf");
    }

    public String toString() {
        return t1.Dsr.t(this).nr("delegate", this.f68298n).toString();
    }
}
