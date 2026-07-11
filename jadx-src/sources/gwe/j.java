package gwe;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f67916n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Pj0.j f67917t;

    public j(int i2, Pj0.j bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f67916n = i2;
        this.f67917t = bitmap;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f67917t.close();
    }

    public final Pj0.j n() {
        return this.f67917t;
    }

    public final int rl() {
        return this.f67916n;
    }
}
