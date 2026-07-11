package USj;

import android.net.Uri;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.io.File;
import kYF.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements Ml {
    private final boolean rl(Uri uri) {
        String scheme;
        if (!C.ck(uri) && ((scheme = uri.getScheme()) == null || Intrinsics.areEqual(scheme, FileUploadManager.f61570h))) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (StringsKt.startsWith$default((CharSequence) path, '/', false, 2, (Object) null) && C.KN(uri) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // USj.Ml
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public File n(Uri uri, FjR.C c2) {
        if (!rl(uri)) {
            return null;
        }
        if (Intrinsics.areEqual(uri.getScheme(), FileUploadManager.f61570h)) {
            String path = uri.getPath();
            if (path == null) {
                return null;
            }
            return new File(path);
        }
        return new File(uri.toString());
    }
}
