package bA;

/* JADX INFO: renamed from: bA.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class C1665w6 extends AbstractC1660fuX {
    private X1.I28 J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f43205r;

    @Override // bA.InterfaceC1656I28, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                X1.I28 i28 = this.J2;
                if (i28 == null) {
                    return;
                }
                this.J2 = null;
                i28.n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized X1.w6 fcU() {
        X1.I28 i28;
        i28 = this.J2;
        return i28 == null ? null : i28.nr();
    }

    @Override // bA.InterfaceC1656I28
    public synchronized int getHeight() {
        X1.I28 i28;
        i28 = this.J2;
        return i28 == null ? 0 : i28.nr().getHeight();
    }

    @Override // bA.InterfaceC1656I28
    public synchronized int getSizeInBytes() {
        X1.I28 i28;
        i28 = this.J2;
        return i28 == null ? 0 : i28.nr().getSizeInBytes();
    }

    @Override // bA.InterfaceC1656I28
    public synchronized int getWidth() {
        X1.I28 i28;
        i28 = this.J2;
        return i28 == null ? 0 : i28.nr().getWidth();
    }

    @Override // bA.InterfaceC1656I28
    public synchronized boolean isClosed() {
        return this.J2 == null;
    }

    public synchronized X1.I28 n1() {
        return this.J2;
    }

    @Override // bA.AbstractC1661j, bA.InterfaceC1656I28
    public boolean F() {
        return this.f43205r;
    }

    public C1665w6(X1.I28 i28, boolean z2) {
        this.J2 = i28;
        this.f43205r = z2;
    }
}
