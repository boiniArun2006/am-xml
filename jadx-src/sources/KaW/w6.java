package KaW;

import java.io.IOException;
import java.util.List;
import okio.Buffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class w6 implements ISg.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ISg.w6 f5601n;

    @Override // ISg.w6
    public void KN(int i2, ISg.j jVar) {
        this.f5601n.KN(i2, jVar);
    }

    @Override // ISg.w6
    public void N(ISg.Dsr dsr) {
        this.f5601n.N(dsr);
    }

    @Override // ISg.w6
    public void QZ6(int i2, ISg.j jVar, byte[] bArr) {
        this.f5601n.QZ6(i2, jVar, bArr);
    }

    @Override // ISg.w6
    public void VwL(ISg.Dsr dsr) {
        this.f5601n.VwL(dsr);
    }

    @Override // ISg.w6
    public void W(boolean z2, boolean z3, int i2, int i3, List list) {
        this.f5601n.W(z2, z3, i2, i3, list);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5601n.close();
    }

    @Override // ISg.w6
    public void connectionPreface() {
        this.f5601n.connectionPreface();
    }

    @Override // ISg.w6
    public void data(boolean z2, int i2, Buffer buffer, int i3) {
        this.f5601n.data(z2, i2, buffer, i3);
    }

    @Override // ISg.w6
    public void flush() {
        this.f5601n.flush();
    }

    @Override // ISg.w6
    public int maxDataLength() {
        return this.f5601n.maxDataLength();
    }

    @Override // ISg.w6
    public void ping(boolean z2, int i2, int i3) {
        this.f5601n.ping(z2, i2, i3);
    }

    @Override // ISg.w6
    public void windowUpdate(int i2, long j2) {
        this.f5601n.windowUpdate(i2, j2);
    }

    public w6(ISg.w6 w6Var) {
        this.f5601n = (ISg.w6) t1.Xo.ck(w6Var, "delegate");
    }
}
