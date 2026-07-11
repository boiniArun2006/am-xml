package ISg;

import java.io.Closeable;
import java.util.List;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface n extends Closeable {

    public interface j {
        void KN(int i2, ISg.j jVar);

        void ackSettings();

        void gh(boolean z2, int i2, BufferedSource bufferedSource, int i3, int i5);

        void mUb(int i2, ISg.j jVar, ByteString byteString);

        void ping(boolean z2, int i2, int i3);

        void priority(int i2, int i3, int i5, boolean z2);

        void pushPromise(int i2, int i3, List list);

        void qie(boolean z2, boolean z3, int i2, int i3, List list, I28 i28);

        void windowUpdate(int i2, long j2);

        void xMQ(boolean z2, Dsr dsr);
    }

    boolean rV9(j jVar);
}
