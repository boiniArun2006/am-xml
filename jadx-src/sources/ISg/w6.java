package ISg;

import java.io.Closeable;
import java.util.List;
import okio.Buffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface w6 extends Closeable {
    void KN(int i2, j jVar);

    void N(Dsr dsr);

    void QZ6(int i2, j jVar, byte[] bArr);

    void VwL(Dsr dsr);

    void W(boolean z2, boolean z3, int i2, int i3, List list);

    void connectionPreface();

    void data(boolean z2, int i2, Buffer buffer, int i3);

    void flush();

    int maxDataLength();

    void ping(boolean z2, int i2, int i3);

    void windowUpdate(int i2, long j2);
}
