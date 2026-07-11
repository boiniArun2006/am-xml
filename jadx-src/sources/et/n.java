package et;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public interface n {

    public static final class j {
        public static x0X.n n(n nVar, BufferedSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return nVar.n(source.readUtf8());
        }
    }

    x0X.n n(String str);

    x0X.n rl(BufferedSource bufferedSource);

    x0X.n t(Object obj);
}
