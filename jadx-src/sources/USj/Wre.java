package USj;

import FjR.C;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Wre implements Ml {
    private final boolean rl(Uri uri) {
        String authority;
        if (Intrinsics.areEqual(uri.getScheme(), "android.resource") && (authority = uri.getAuthority()) != null && !StringsKt.isBlank(authority) && uri.getPathSegments().size() == 2) {
            return true;
        }
        return false;
    }

    @Override // USj.Ml
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Uri n(Uri uri, C c2) throws PackageManager.NameNotFoundException {
        if (!rl(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = c2.Uo().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier != 0) {
            return Uri.parse("android.resource://" + authority + '/' + identifier);
        }
        throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
    }
}
