package KaW;

import io.grpc.internal.N;
import okio.Buffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class eO implements N {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Buffer f5569n;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5570t;

    @Override // io.grpc.internal.N
    public void release() {
    }

    @Override // io.grpc.internal.N
    public int n() {
        return this.rl;
    }

    @Override // io.grpc.internal.N
    public int nr() {
        return this.f5570t;
    }

    @Override // io.grpc.internal.N
    public void rl(byte b2) {
        this.f5569n.writeByte((int) b2);
        this.rl--;
        this.f5570t++;
    }

    Buffer t() {
        return this.f5569n;
    }

    @Override // io.grpc.internal.N
    public void write(byte[] bArr, int i2, int i3) {
        this.f5569n.write(bArr, i2, i3);
        this.rl -= i3;
        this.f5570t += i3;
    }

    eO(Buffer buffer, int i2) {
        this.f5569n = buffer;
        this.rl = i2;
    }
}
