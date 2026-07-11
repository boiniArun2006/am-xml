package PMG;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 {

    public static final class j extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f7700n = new j();
        private static final String rl = "https://api.pico.bendingspoonsapps.com";

        private j() {
            super(null);
        }

        @Override // PMG.w6
        public String n() {
            return rl;
        }
    }

    public static final class n extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f7701n = new n();
        private static final String rl = "https://api.staging.pico.bendingspoonsapps.com";

        private n() {
            super(null);
        }

        @Override // PMG.w6
        public String n() {
            return rl;
        }
    }

    public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String n();

    private w6() {
    }
}
