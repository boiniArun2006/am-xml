package eVO;

import Hh.CN3;
import android.webkit.MimeTypeMap;
import androidx.media3.common.MimeTypes;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final MimeTypeMap f63720n = MimeTypeMap.getSingleton();
    private static final Map rl = CN3.of(MimeTypes.IMAGE_HEIF, "heif", MimeTypes.IMAGE_HEIC, "heic");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Map f63721t = CN3.of("heif", MimeTypes.IMAGE_HEIF, "heic", MimeTypes.IMAGE_HEIC);

    public static String n(String str) {
        String str2 = (String) f63721t.get(str);
        return str2 != null ? str2 : f63720n.getMimeTypeFromExtension(str);
    }
}
