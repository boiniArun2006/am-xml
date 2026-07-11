package r1;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml extends ForwardingSink {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f72737n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f72738t;

    @Override // okio.ForwardingSink, okio.Sink
    public void write(Buffer buffer, long j2) throws EOFException {
        if (this.f72738t) {
            buffer.skip(j2);
            return;
        }
        try {
            super.write(buffer, j2);
        } catch (IOException e2) {
            this.f72738t = true;
            this.f72737n.invoke(e2);
        }
    }

    public Ml(Sink sink, Function1 function1) {
        super(sink);
        this.f72737n = function1;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e2) {
            this.f72738t = true;
            this.f72737n.invoke(e2);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e2) {
            this.f72738t = true;
            this.f72737n.invoke(e2);
        }
    }
}
