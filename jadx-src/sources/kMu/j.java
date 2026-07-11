package kMu;

import android.net.Uri;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {
    public static final String n(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (!rl(uri)) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "pathSegments");
        return CollectionsKt.joinToString$default(CollectionsKt.drop(pathSegments, 1), "/", null, null, 0, null, null, 62, null);
    }

    public static final boolean rl(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (!Intrinsics.areEqual(uri.getScheme(), FileUploadManager.f61570h)) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "pathSegments");
        return Intrinsics.areEqual(CollectionsKt.first((List) pathSegments), "android_asset");
    }
}
