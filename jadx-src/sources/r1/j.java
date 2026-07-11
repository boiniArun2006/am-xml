package r1;

import GJW.OU;
import GJW.lej;
import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import kotlin.ranges.RangesKt;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface j {

    /* JADX INFO: renamed from: r1.j$j, reason: collision with other inner class name */
    public static final class C1145j {
        private long J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Path f72740n;
        private FileSystem rl = FileSystem.SYSTEM;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private double f72741t = 0.02d;
        private long nr = 10485760;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f72739O = 262144000;
        private lej Uo = OU.rl();

        public final j n() {
            long jCoerceIn;
            Path path = this.f72740n;
            if (path == null) {
                throw new IllegalStateException("directory == null");
            }
            if (this.f72741t > 0.0d) {
                try {
                    File file = path.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jCoerceIn = RangesKt.coerceIn((long) (this.f72741t * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.nr, this.f72739O);
                } catch (Exception unused) {
                    jCoerceIn = this.nr;
                }
            } else {
                jCoerceIn = this.J2;
            }
            return new I28(jCoerceIn, path, this.rl, this.Uo);
        }

        public final C1145j nr(double d2) {
            if (0.0d > d2 || d2 > 1.0d) {
                throw new IllegalArgumentException("size must be in the range [0.0, 1.0].");
            }
            this.J2 = 0L;
            this.f72741t = d2;
            return this;
        }

        public final C1145j rl(File file) {
            return t(Path.Companion.get$default(Path.INSTANCE, file, false, 1, (Object) null));
        }

        public final C1145j t(Path path) {
            this.f72740n = path;
            return this;
        }
    }

    public interface n {
        void abort();

        Path getData();

        Path getMetadata();

        w6 n();
    }

    public interface w6 extends Closeable {
        Path getData();

        Path getMetadata();

        n ofS();
    }

    n n(String str);

    w6 rl(String str);

    FileSystem t();
}
