package Be4;

import Be4.psW;
import java.io.File;
import kotlin.ExceptionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class iF extends psW {
    private Function0 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private BufferedSource f550O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final psW.j f551n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Path f552r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f553t;

    public iF(BufferedSource bufferedSource, Function0 function0, psW.j jVar) {
        super(null);
        this.f551n = jVar;
        this.f550O = bufferedSource;
        this.J2 = function0;
    }

    @Override // Be4.psW
    public synchronized BufferedSource Z() {
        T();
        BufferedSource bufferedSource = this.f550O;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        FileSystem fileSystemU = U();
        Path path = this.f552r;
        Intrinsics.checkNotNull(path);
        BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystemU.source(path));
        this.f550O = bufferedSourceBuffer;
        return bufferedSourceBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f553t = true;
            BufferedSource bufferedSource = this.f550O;
            if (bufferedSource != null) {
                kYF.C.nr(bufferedSource);
            }
            Path path = this.f552r;
            if (path != null) {
                U().delete(path);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Be4.psW
    public synchronized Path n() {
        Throwable th;
        try {
            T();
            Path path = this.f552r;
            if (path != null) {
                return path;
            }
            Path pathJB = jB();
            BufferedSink bufferedSinkBuffer = Okio.buffer(U().sink(pathJB, false));
            try {
                BufferedSource bufferedSource = this.f550O;
                Intrinsics.checkNotNull(bufferedSource);
                bufferedSinkBuffer.writeAll(bufferedSource);
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    th = null;
                }
            } catch (Throwable th3) {
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th4) {
                        ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            this.f550O = null;
            this.f552r = pathJB;
            this.J2 = null;
            return pathJB;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    @Override // Be4.psW
    public synchronized Path rl() {
        T();
        return this.f552r;
    }

    private final void T() {
        if (this.f553t) {
            throw new IllegalStateException("closed");
        }
    }

    private final Path jB() {
        Function0 function0 = this.J2;
        Intrinsics.checkNotNull(function0);
        File file = (File) function0.invoke();
        if (file.isDirectory()) {
            return Path.Companion.get$default(Path.INSTANCE, File.createTempFile("tmp", null, file), false, 1, (Object) null);
        }
        throw new IllegalStateException("cacheDirectory must be a directory.");
    }

    public FileSystem U() {
        return FileSystem.SYSTEM;
    }

    @Override // Be4.psW
    public psW.j Uo() {
        return this.f551n;
    }
}
