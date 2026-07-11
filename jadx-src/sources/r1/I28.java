package r1;

import GJW.lej;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import okio.FileSystem;
import okio.Path;
import r1.j;
import r1.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 implements r1.j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f72732O = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f72733n;
    private final r1.w6 nr;
    private final Path rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FileSystem f72734t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    private static final class n implements j.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final w6.n f72735n;

        @Override // r1.j.n
        public void abort() {
            this.f72735n.n();
        }

        @Override // r1.j.n
        public Path getData() {
            return this.f72735n.J2(1);
        }

        @Override // r1.j.n
        public Path getMetadata() {
            return this.f72735n.J2(0);
        }

        @Override // r1.j.n
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public w6 n() {
            w6.Ml mlT = this.f72735n.t();
            if (mlT != null) {
                return new w6(mlT);
            }
            return null;
        }

        public n(w6.n nVar) {
            this.f72735n = nVar;
        }
    }

    private static final class w6 implements j.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final w6.Ml f72736n;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f72736n.close();
        }

        @Override // r1.j.w6
        public Path getData() {
            return this.f72736n.rl(1);
        }

        @Override // r1.j.w6
        public Path getMetadata() {
            return this.f72736n.rl(0);
        }

        @Override // r1.j.w6
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public n ofS() {
            w6.n nVarN = this.f72736n.n();
            if (nVarN != null) {
                return new n(nVarN);
            }
            return null;
        }

        public w6(w6.Ml ml) {
            this.f72736n = ml;
        }
    }

    private final String J2(String str) {
        return ByteString.INSTANCE.encodeUtf8(str).sha256().hex();
    }

    public long O() {
        return this.f72733n;
    }

    @Override // r1.j
    public j.n n(String str) {
        w6.n nVarQm = this.nr.qm(J2(str));
        if (nVarQm != null) {
            return new n(nVarQm);
        }
        return null;
    }

    public Path nr() {
        return this.rl;
    }

    @Override // r1.j
    public j.w6 rl(String str) {
        w6.Ml mlOrg = this.nr.Org(J2(str));
        if (mlOrg != null) {
            return new w6(mlOrg);
        }
        return null;
    }

    @Override // r1.j
    public FileSystem t() {
        return this.f72734t;
    }

    public I28(long j2, Path path, FileSystem fileSystem, lej lejVar) {
        this.f72733n = j2;
        this.rl = path;
        this.f72734t = fileSystem;
        this.nr = new r1.w6(t(), nr(), lejVar, O(), 1, 2);
    }
}
