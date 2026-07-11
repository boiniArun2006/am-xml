package KaW;

import KaW.aC;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.ByteString;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class n implements ISg.w6 {
    private static final Logger J2 = Logger.getLogger(Dsr.class.getName());

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final aC f5597O = new aC(Level.FINE, Dsr.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f5598n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ISg.w6 f5599t;

    interface j {
        void KN(Throwable th);
    }

    @Override // ISg.w6
    public void KN(int i2, ISg.j jVar) {
        this.f5597O.KN(aC.j.OUTBOUND, i2, jVar);
        try {
            this.f5599t.KN(i2, jVar);
        } catch (IOException e2) {
            this.f5598n.KN(e2);
        }
    }

    @Override // ISg.w6
    public void N(ISg.Dsr dsr) {
        this.f5597O.mUb(aC.j.OUTBOUND);
        try {
            this.f5599t.N(dsr);
        } catch (IOException e2) {
            this.f5598n.KN(e2);
        }
    }

    @Override // ISg.w6
    public void QZ6(int i2, ISg.j jVar, byte[] bArr) {
        this.f5597O.t(aC.j.OUTBOUND, i2, jVar, ByteString.of(bArr));
        try {
            this.f5599t.QZ6(i2, jVar, bArr);
            this.f5599t.flush();
        } catch (IOException e2) {
            this.f5598n.KN(e2);
        }
    }

    @Override // ISg.w6
    public void VwL(ISg.Dsr dsr) {
        this.f5597O.xMQ(aC.j.OUTBOUND, dsr);
        try {
            this.f5599t.VwL(dsr);
        } catch (IOException e2) {
            this.f5598n.KN(e2);
        }
    }

    @Override // ISg.w6
    public void W(boolean z2, boolean z3, int i2, int i3, List list) {
        try {
            this.f5599t.W(z2, z3, i2, i3, list);
        } catch (IOException e2) {
            this.f5598n.KN(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f5599t.close();
        } catch (IOException e2) {
            J2.log(n(e2), "Failed closing connection", (Throwable) e2);
        }
    }

    @Override // ISg.w6
    public void connectionPreface() {
        try {
            this.f5599t.connectionPreface();
        } catch (IOException e2) {
            this.f5598n.KN(e2);
        }
    }

    @Override // ISg.w6
    public void data(boolean z2, int i2, Buffer buffer, int i3) {
        this.f5597O.rl(aC.j.OUTBOUND, i2, buffer.getBufferField(), i3, z2);
        try {
            this.f5599t.data(z2, i2, buffer, i3);
        } catch (IOException e2) {
            this.f5598n.KN(e2);
        }
    }

    @Override // ISg.w6
    public void flush() {
        try {
            this.f5599t.flush();
        } catch (IOException e2) {
            this.f5598n.KN(e2);
        }
    }

    @Override // ISg.w6
    public int maxDataLength() {
        return this.f5599t.maxDataLength();
    }

    @Override // ISg.w6
    public void windowUpdate(int i2, long j2) {
        this.f5597O.gh(aC.j.OUTBOUND, i2, j2);
        try {
            this.f5599t.windowUpdate(i2, j2);
        } catch (IOException e2) {
            this.f5598n.KN(e2);
        }
    }

    n(j jVar, ISg.w6 w6Var) {
        this.f5598n = (j) t1.Xo.ck(jVar, "transportExceptionHandler");
        this.f5599t = (ISg.w6) t1.Xo.ck(w6Var, "frameWriter");
    }

    static Level n(Throwable th) {
        if (th.getClass().equals(IOException.class)) {
            return Level.FINE;
        }
        return Level.INFO;
    }

    @Override // ISg.w6
    public void ping(boolean z2, int i2, int i3) {
        if (z2) {
            this.f5597O.J2(aC.j.OUTBOUND, (4294967295L & ((long) i3)) | (((long) i2) << 32));
        } else {
            this.f5597O.O(aC.j.OUTBOUND, (4294967295L & ((long) i3)) | (((long) i2) << 32));
        }
        try {
            this.f5599t.ping(z2, i2, i3);
        } catch (IOException e2) {
            this.f5598n.KN(e2);
        }
    }
}
