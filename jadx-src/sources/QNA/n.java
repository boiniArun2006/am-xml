package QNA;

import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class n extends Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final tq6.DAz f8129n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final File f8130t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Z) {
            Z z2 = (Z) obj;
            if (this.f8129n.equals(z2.rl()) && this.rl.equals(z2.nr()) && this.f8130t.equals(z2.t())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f8129n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f8130t.hashCode();
    }

    @Override // QNA.Z
    public String nr() {
        return this.rl;
    }

    @Override // QNA.Z
    public tq6.DAz rl() {
        return this.f8129n;
    }

    @Override // QNA.Z
    public File t() {
        return this.f8130t;
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f8129n + ", sessionId=" + this.rl + ", reportFile=" + this.f8130t + "}";
    }

    n(tq6.DAz dAz, String str, File file) {
        if (dAz != null) {
            this.f8129n = dAz;
            if (str != null) {
                this.rl = str;
                if (file != null) {
                    this.f8130t = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }
}
