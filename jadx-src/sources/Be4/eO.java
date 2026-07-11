package Be4;

import Be4.psW;
import java.io.Closeable;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class eO extends psW {
    private final Closeable J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f543O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private BufferedSource f544Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f546o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final psW.j f547r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FileSystem f548t;

    public eO(Path path, FileSystem fileSystem, String str, Closeable closeable, psW.j jVar) {
        super(null);
        this.f545n = path;
        this.f548t = fileSystem;
        this.f543O = str;
        this.J2 = closeable;
        this.f547r = jVar;
    }

    @Override // Be4.psW
    public synchronized BufferedSource Z() {
        T();
        BufferedSource bufferedSource = this.f544Z;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        BufferedSource bufferedSourceBuffer = Okio.buffer(U().source(this.f545n));
        this.f544Z = bufferedSourceBuffer;
        return bufferedSourceBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f546o = true;
            BufferedSource bufferedSource = this.f544Z;
            if (bufferedSource != null) {
                kYF.C.nr(bufferedSource);
            }
            Closeable closeable = this.J2;
            if (closeable != null) {
                kYF.C.nr(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Be4.psW
    public synchronized Path n() {
        T();
        return this.f545n;
    }

    private final void T() {
        if (this.f546o) {
            throw new IllegalStateException("closed");
        }
    }

    public FileSystem U() {
        return this.f548t;
    }

    @Override // Be4.psW
    public psW.j Uo() {
        return this.f547r;
    }

    public final String jB() {
        return this.f543O;
    }

    @Override // Be4.psW
    public Path rl() {
        return n();
    }
}
