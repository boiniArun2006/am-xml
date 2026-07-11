package nfZ;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.media3.common.MimeTypes;
import androidx.webkit.WebViewAssetLoader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class fuX extends WebViewClient {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WebViewAssetLoader f71217n;

    public fuX(sP.w6 fileManager) {
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        this.f71217n = fileManager.O();
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String path = request.getUrl().getPath();
        return (path == null || !StringsKt.endsWith$default(path, "/favicon.ico", false, 2, (Object) null)) ? this.f71217n.n(request.getUrl()) : new WebResourceResponse(MimeTypes.IMAGE_PNG, null, null);
    }
}
