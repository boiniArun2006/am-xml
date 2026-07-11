package Hh;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final Logger f3937n = Logger.getLogger(n.class.getName());

    public static void rl(InputStream inputStream) {
        try {
            n(inputStream, true);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public static void n(Closeable closeable, boolean z2) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e2) {
            if (!z2) {
                throw e2;
            }
            f3937n.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e2);
        }
    }
}
