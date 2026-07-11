package androidx.webkit;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class UserAgentMetadata {
    private final String J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f42484O;
    private boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f42485n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f42486t;
    private boolean xMQ;

    public static final class BrandVersion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f42487n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f42488t;

        public static final class Builder {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandVersion)) {
                return false;
            }
            BrandVersion brandVersion = (BrandVersion) obj;
            return Objects.equals(this.f42487n, brandVersion.f42487n) && Objects.equals(this.rl, brandVersion.rl) && Objects.equals(this.f42488t, brandVersion.f42488t);
        }

        public int hashCode() {
            return Objects.hash(this.f42487n, this.rl, this.f42488t);
        }

        public String toString() {
            return this.f42487n + "," + this.rl + "," + this.f42488t;
        }
    }

    public static final class Builder {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAgentMetadata)) {
            return false;
        }
        UserAgentMetadata userAgentMetadata = (UserAgentMetadata) obj;
        return this.Uo == userAgentMetadata.Uo && this.KN == userAgentMetadata.KN && this.xMQ == userAgentMetadata.xMQ && Objects.equals(this.f42485n, userAgentMetadata.f42485n) && Objects.equals(this.rl, userAgentMetadata.rl) && Objects.equals(this.f42486t, userAgentMetadata.f42486t) && Objects.equals(this.nr, userAgentMetadata.nr) && Objects.equals(this.f42484O, userAgentMetadata.f42484O) && Objects.equals(this.J2, userAgentMetadata.J2);
    }

    public int hashCode() {
        return Objects.hash(this.f42485n, this.rl, this.f42486t, this.nr, this.f42484O, this.J2, Boolean.valueOf(this.Uo), Integer.valueOf(this.KN), Boolean.valueOf(this.xMQ));
    }
}
