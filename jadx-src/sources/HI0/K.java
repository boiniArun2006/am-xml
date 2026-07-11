package HI0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class K {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fg f3820n;
    private final KH[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f3819t = new j(null);
    public static final int nr = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final fg f3818O = new n();
    private static final KH J2 = new w6();

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public static final class w6 implements KH {
        @Override // HI0.KH
        public boolean n(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            for (int i2 = 0; i2 < token.length(); i2++) {
                if (!CharsKt.isWhitespace(token.charAt(i2))) {
                    return false;
                }
            }
            return true;
        }
    }

    public K(fg tokenBoundaryChecker, KH... ignorableTokens) {
        Intrinsics.checkNotNullParameter(tokenBoundaryChecker, "tokenBoundaryChecker");
        Intrinsics.checkNotNullParameter(ignorableTokens, "ignorableTokens");
        this.f3820n = tokenBoundaryChecker;
        this.rl = ignorableTokens;
    }

    public static final class n implements fg {
        @Override // HI0.fg
        public boolean isBoundary(char c2, char c4) {
            if (CharsKt.isWhitespace(c2) != CharsKt.isWhitespace(c4)) {
                return true;
            }
            return false;
        }
    }

    public final KH[] n() {
        return this.rl;
    }

    public final fg rl() {
        return this.f3820n;
    }

    public /* synthetic */ K(fg fgVar, KH[] khArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? f3818O : fgVar, (i2 & 2) != 0 ? new KH[]{J2} : khArr);
    }
}
