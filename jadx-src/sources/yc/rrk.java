package yc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface rrk {

    public static final class j implements rrk {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Zs f76107O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f76108n;
        private final String nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f76109t;

        public j(int i2, int i3, boolean z2, String mimeType, Zs cursorInfo) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            Intrinsics.checkNotNullParameter(cursorInfo, "cursorInfo");
            this.f76108n = i2;
            this.rl = i3;
            this.f76109t = z2;
            this.nr = mimeType;
            this.f76107O = cursorInfo;
        }

        public final int O() {
            return this.f76108n;
        }

        public final Zs n() {
            return this.f76107O;
        }

        public final boolean nr() {
            return this.f76109t;
        }

        public final int rl() {
            return this.rl;
        }

        public final String t() {
            return this.nr;
        }
    }

    public static final class n implements rrk {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final tu.aC f76110n;
        private final Zs rl;

        public n(tu.aC mediaInfo, Zs cursorInfo) {
            Intrinsics.checkNotNullParameter(mediaInfo, "mediaInfo");
            Intrinsics.checkNotNullParameter(cursorInfo, "cursorInfo");
            this.f76110n = mediaInfo;
            this.rl = cursorInfo;
        }

        public final Zs n() {
            return this.rl;
        }

        public final tu.aC rl() {
            return this.f76110n;
        }
    }
}
