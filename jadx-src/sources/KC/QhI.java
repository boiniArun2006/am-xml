package KC;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class QhI {
    public static final Intent n(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            if (packageManager.getPackageInfo("com.instagram.android", 0) != null) {
                intent.setData(Uri.parse("http://instagram.com/_u/" + StringsKt.substringAfterLast$default(StringsKt.endsWith$default(url, "/", false, 2, (Object) null) ? StringsKt.dropLast(url, 1) : url, "/", (String) null, 2, (Object) null)));
                intent.setPackage("com.instagram.android");
                return intent;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        intent.setData(Uri.parse(url));
        return intent;
    }
}
