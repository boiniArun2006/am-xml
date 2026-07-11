package QNA;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class g9s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8116n;
    private final E8K.CN3 rl;

    private File rl() {
        return this.rl.Uo(this.f8116n);
    }

    public g9s(String str, E8K.CN3 cn3) {
        this.f8116n = str;
        this.rl = cn3;
    }

    public boolean n() {
        try {
            return rl().createNewFile();
        } catch (IOException e2) {
            h1M.CN3.J2().O("Error creating marker: " + this.f8116n, e2);
            return false;
        }
    }

    public boolean nr() {
        return rl().delete();
    }

    public boolean t() {
        return rl().exists();
    }
}
