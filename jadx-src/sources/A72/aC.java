package A72;

import Hh.Xo;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class aC extends OutputStream {
    public abstract PooledByteBuffer n();

    public abstract int size();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            super.close();
        } catch (IOException e2) {
            Xo.n(e2);
        }
    }
}
