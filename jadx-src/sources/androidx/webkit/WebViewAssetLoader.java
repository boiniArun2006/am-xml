package androidx.webkit;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import androidx.webkit.internal.AssetHelper;
import com.safedk.android.analytics.brandsafety.creatives.g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class WebViewAssetLoader {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f42491n;

    public static final class AssetsPathHandler implements PathHandler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AssetHelper f42492n;

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public WebResourceResponse n(String str) {
            try {
                return new WebResourceResponse(AssetHelper.J2(str), null, this.f42492n.KN(str));
            } catch (IOException e2) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e2);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f42493n;
        private String rl = "appassets.androidplatform.net";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f42494t = new ArrayList();

        public Builder n(String str, PathHandler pathHandler) {
            this.f42494t.add(Pair.n(str, pathHandler));
            return this;
        }

        public WebViewAssetLoader rl() {
            ArrayList arrayList = new ArrayList();
            for (Pair pair : this.f42494t) {
                arrayList.add(new PathMatcher(this.rl, (String) pair.f36686n, this.f42493n, (PathHandler) pair.rl));
            }
            return new WebViewAssetLoader(arrayList);
        }
    }

    public static final class InternalStoragePathHandler implements PathHandler {
        private static final String[] rl = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final File f42495n;

        private boolean rl(Context context) throws IOException {
            String strN = AssetHelper.n(this.f42495n);
            String strN2 = AssetHelper.n(context.getCacheDir());
            String strN3 = AssetHelper.n(AssetHelper.t(context));
            if ((!strN.startsWith(strN2) && !strN.startsWith(strN3)) || strN.equals(strN2) || strN.equals(strN3)) {
                return false;
            }
            for (String str : rl) {
                if (strN.startsWith(strN3 + str)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public WebResourceResponse n(String str) {
            File fileRl;
            try {
                fileRl = AssetHelper.rl(this.f42495n, str);
            } catch (IOException e2) {
                Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e2);
            }
            if (fileRl != null) {
                return new WebResourceResponse(AssetHelper.J2(str), null, AssetHelper.xMQ(fileRl));
            }
            Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, this.f42495n));
            return new WebResourceResponse(null, null, null);
        }

        public InternalStoragePathHandler(Context context, File file) {
            try {
                this.f42495n = new File(AssetHelper.n(file));
                if (rl(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e2) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e2);
            }
        }
    }

    public interface PathHandler {
        WebResourceResponse n(String str);
    }

    @VisibleForTesting
    static class PathMatcher {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final boolean f42496n;
        final PathHandler nr;
        final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final String f42497t;

        public String n(String str) {
            return str.replaceFirst(this.f42497t, "");
        }

        PathMatcher(String str, String str2, boolean z2, PathHandler pathHandler) {
            if (!str2.isEmpty() && str2.charAt(0) == '/') {
                if (str2.endsWith("/")) {
                    this.rl = str;
                    this.f42497t = str2;
                    this.f42496n = z2;
                    this.nr = pathHandler;
                    return;
                }
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }

        public PathHandler rl(Uri uri) {
            if (uri.getScheme().equals(g.f62375e) && !this.f42496n) {
                return null;
            }
            if ((!uri.getScheme().equals(g.f62375e) && !uri.getScheme().equals("https")) || !uri.getAuthority().equals(this.rl) || !uri.getPath().startsWith(this.f42497t)) {
                return null;
            }
            return this.nr;
        }
    }

    public static final class ResourcesPathHandler implements PathHandler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AssetHelper f42498n;

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public WebResourceResponse n(String str) {
            try {
                return new WebResourceResponse(AssetHelper.J2(str), null, this.f42498n.mUb(str));
            } catch (Resources.NotFoundException e2) {
                Log.e("WebViewAssetLoader", "Resource not found from the path: " + str, e2);
                return new WebResourceResponse(null, null, null);
            } catch (IOException e3) {
                Log.e("WebViewAssetLoader", "Error opening resource from the path: " + str, e3);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    public WebResourceResponse n(Uri uri) {
        WebResourceResponse webResourceResponseN;
        for (PathMatcher pathMatcher : this.f42491n) {
            PathHandler pathHandlerRl = pathMatcher.rl(uri);
            if (pathHandlerRl != null && (webResourceResponseN = pathHandlerRl.n(pathMatcher.n(uri.getPath()))) != null) {
                return webResourceResponseN;
            }
        }
        return null;
    }

    WebViewAssetLoader(List list) {
        this.f42491n = list;
    }
}
