package androidx.core.util;

import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.Writer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
@Deprecated
public class LogWriter extends Writer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f36675n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private StringBuilder f36676t;

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i5 = 0; i5 < i3; i5++) {
            char c2 = cArr[i2 + i5];
            if (c2 == '\n') {
                n();
            } else {
                this.f36676t.append(c2);
            }
        }
    }

    private void n() {
        if (this.f36676t.length() > 0) {
            Log.d(this.f36675n, this.f36676t.toString());
            StringBuilder sb = this.f36676t;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        n();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        n();
    }
}
