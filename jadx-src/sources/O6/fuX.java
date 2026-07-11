package O6;

import android.net.Uri;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f7274n;
    private final Uri rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Uri f7275t;

    public Uri n() {
        return this.f7275t;
    }

    public Uri rl() {
        return this.f7274n;
    }

    public Uri t() {
        return this.rl;
    }

    public fuX(Uri uri, E8.j jVar) {
        Uri uri2;
        this.f7275t = uri;
        if (jVar == null) {
            uri2 = X3O.I28.gh;
        } else {
            uri2 = Uri.parse(d.f62221v + jVar.n() + ":" + jVar.rl() + "/v0");
        }
        this.f7274n = uri2;
        Uri.Builder builderAppendEncodedPath = uri2.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String strN = Ml.n(uri.getPath());
        if (strN.length() > 0 && !"/".equals(strN)) {
            builderAppendEncodedPath = builderAppendEncodedPath.appendPath("o").appendPath(strN);
        }
        this.rl = builderAppendEncodedPath.build();
    }
}
