package FX;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface Ml {

    public static final class j implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f2626n;
        private final String rl;

        public j(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f2626n = username;
            this.rl = "https://www.instagram.com/" + rl();
        }

        @Override // FX.Ml
        public String n() {
            return this.rl;
        }

        @Override // FX.Ml
        public String rl() {
            return this.f2626n;
        }
    }

    public static final class n implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f2627n;
        private final String rl;

        public n(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f2627n = username;
            this.rl = "https://www.tiktok.com/@" + rl();
        }

        @Override // FX.Ml
        public String n() {
            return this.rl;
        }

        @Override // FX.Ml
        public String rl() {
            return this.f2627n;
        }
    }

    public static final class w6 implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f2628n;
        private final String rl;

        public w6(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f2628n = username;
            this.rl = "https://www.youtube.com/@" + rl();
        }

        @Override // FX.Ml
        public String n() {
            return this.rl;
        }

        @Override // FX.Ml
        public String rl() {
            return this.f2628n;
        }
    }

    String n();

    String rl();
}
