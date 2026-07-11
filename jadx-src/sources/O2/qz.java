package O2;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final URL f7265n;

    public URLConnection n() {
        return this.f7265n.openConnection();
    }

    public String toString() {
        return this.f7265n.toString();
    }

    public qz(URL url) {
        this.f7265n = url;
    }
}
