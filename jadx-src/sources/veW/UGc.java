package veW;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class UGc implements Closeable {

    interface j {
        UGc build();

        j n(Context context);
    }

    abstract ePt.Ml n();

    abstract s4 rl();

    UGc() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        n().close();
    }
}
