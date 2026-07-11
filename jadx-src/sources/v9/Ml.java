package v9;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ml {
    public static final LQ.j n(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String strN = kMu.j.n(uri);
        if (strN != null) {
            AssetManager assets = context.getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "assets");
            return j.n(assets, strN);
        }
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "contentResolver");
        return w6.rl(contentResolver, uri);
    }
}
