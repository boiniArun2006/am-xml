package wIt;

import android.media.ImageReader;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j implements xgd.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Looper f74885n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageReader f74886t;

    public j(Looper looper) {
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f74885n = looper;
    }

    @Override // w9.fuX
    public void release() {
        ImageReader imageReader = this.f74886t;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f74885n.quit();
    }
}
