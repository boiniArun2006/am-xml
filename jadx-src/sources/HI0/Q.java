package HI0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f3831n;
    private final WeakReference rl;

    public Q(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3831n = context.getApplicationContext();
        this.rl = new WeakReference(context);
    }

    public final Cursor J2(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return this.f3831n.getContentResolver().query(uri, strArr, str, strArr2, str2);
    }

    public final boolean O(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            CloseableKt.closeFinally(t(uri), null);
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    public final AssetManager n() {
        AssetManager assets = this.f3831n.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        return assets;
    }

    public final AssetFileDescriptor nr(Uri uri, String mode) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (Intrinsics.areEqual(uri.getScheme(), FileUploadManager.f61570h)) {
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (Intrinsics.areEqual(CollectionsKt.firstOrNull((List) pathSegments), "android_asset")) {
                AssetManager assets = this.f3831n.getAssets();
                List<String> pathSegments2 = uri.getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
                AssetFileDescriptor assetFileDescriptorOpenFd = assets.openFd(CollectionsKt.joinToString$default(CollectionsKt.drop(pathSegments2, 1), "/", null, null, 0, null, null, 62, null));
                Intrinsics.checkNotNull(assetFileDescriptorOpenFd);
                return assetFileDescriptorOpenFd;
            }
        }
        if (Intrinsics.areEqual(uri.getScheme(), kPg.fuX.f69922n.rl())) {
            throw new IllegalStateException("sample media should not be opened via this method");
        }
        if (!Intrinsics.areEqual(uri.getScheme(), "am")) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f3831n.getContentResolver().openAssetFileDescriptor(uri, mode);
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                return assetFileDescriptorOpenAssetFileDescriptor;
            }
            throw new FileNotFoundException("Asset not found; path='" + uri + "'");
        }
        Context appContext = this.f3831n;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        File fileGh = afx.gh(appContext);
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        Intrinsics.checkNotNullExpressionValue(schemeSpecificPart, "getSchemeSpecificPart(...)");
        File fileResolve = FilesKt.resolve(fileGh, schemeSpecificPart);
        try {
            return new AssetFileDescriptor(ParcelFileDescriptor.open(fileResolve, 268435456), 0L, fileResolve.length());
        } catch (FileNotFoundException e2) {
            throw new FileNotFoundException(e2.getMessage() + " path='" + fileResolve.getAbsolutePath() + "' uri='" + uri + "'");
        }
    }

    public final Context rl() {
        return (Context) this.rl.get();
    }

    public final InputStream t(Uri uri) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.areEqual(uri.getScheme(), FileUploadManager.f61570h)) {
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (Intrinsics.areEqual(CollectionsKt.firstOrNull((List) pathSegments), "android_asset")) {
                AssetManager assetManagerN = n();
                List<String> pathSegments2 = uri.getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
                return assetManagerN.open(CollectionsKt.joinToString$default(CollectionsKt.drop(pathSegments2, 1), "/", null, null, 0, null, null, 62, null));
            }
        }
        if (!Intrinsics.areEqual(uri.getScheme(), "am")) {
            return this.f3831n.getContentResolver().openInputStream(uri);
        }
        Context appContext = this.f3831n;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        File fileGh = afx.gh(appContext);
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        Intrinsics.checkNotNullExpressionValue(schemeSpecificPart, "getSchemeSpecificPart(...)");
        File fileResolve = FilesKt.resolve(fileGh, schemeSpecificPart);
        try {
            return new FileInputStream(fileResolve);
        } catch (FileNotFoundException e2) {
            throw new FileNotFoundException(e2.getMessage() + " path='" + fileResolve.getAbsolutePath() + "' uri='" + uri + "'");
        }
    }
}
