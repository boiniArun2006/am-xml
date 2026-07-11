package Lf;

import Be4.P;
import Lf.Dsr;
import android.webkit.MimeTypeMap;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.io.FilesKt;
import okio.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class aC implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f6169n;

    public static final class j implements Dsr.j {
        @Override // Lf.Dsr.j
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Dsr n(File file, FjR.C c2, eQ.fuX fux) {
            return new aC(file);
        }
    }

    @Override // Lf.Dsr
    public Object n(Continuation continuation) {
        return new qz(P.KN(Path.Companion.get$default(Path.INSTANCE, this.f6169n, false, 1, (Object) null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.getExtension(this.f6169n)), Be4.CN3.f516O);
    }

    public aC(File file) {
        this.f6169n = file;
    }
}
