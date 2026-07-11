package JP;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface Dsr extends C, InterfaceC1378z {

    public static final class j implements Dsr {
        @Override // JP.C, JP.InterfaceC1378z
        public String n() {
            return "gzip";
        }

        @Override // JP.InterfaceC1378z
        public InputStream rl(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        @Override // JP.C
        public OutputStream t(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    }

    public static final class n implements Dsr {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Dsr f4494n = new n();

        @Override // JP.InterfaceC1378z
        public InputStream rl(InputStream inputStream) {
            return inputStream;
        }

        @Override // JP.C
        public OutputStream t(OutputStream outputStream) {
            return outputStream;
        }

        @Override // JP.C, JP.InterfaceC1378z
        public String n() {
            return "identity";
        }

        private n() {
        }
    }
}
