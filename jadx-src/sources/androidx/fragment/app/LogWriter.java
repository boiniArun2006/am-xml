package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class LogWriter extends Writer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f38706n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private StringBuilder f38707t = new StringBuilder(128);

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i5 = 0; i5 < i3; i5++) {
            char c2 = cArr[i2 + i5];
            if (c2 == '\n') {
                n();
            } else {
                this.f38707t.append(c2);
            }
        }
    }

    private void n() {
        if (this.f38707t.length() > 0) {
            Log.d(this.f38706n, this.f38707t.toString());
            StringBuilder sb = this.f38707t;
            sb.delete(0, sb.length());
        }
    }

    LogWriter(String str) {
        this.f38706n = str;
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
