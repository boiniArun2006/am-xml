package dX;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f63520n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f63519t = new j(null);
    private static final fuX nr = new fuX(-1, false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final fuX f63518O = new fuX(-2, false);
    private static final fuX J2 = new fuX(-1, true);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final fuX n() {
            return fuX.nr;
        }

        public final fuX rl() {
            return fuX.J2;
        }
    }

    public static final fuX nr() {
        return f63519t.rl();
    }

    public static final fuX t() {
        return f63519t.n();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return false;
        }
        fuX fux = (fuX) obj;
        return this.f63520n == fux.f63520n && this.rl == fux.rl;
    }

    public final boolean KN() {
        return this.f63520n == -1;
    }

    public final boolean O() {
        return this.rl;
    }

    public final boolean Uo() {
        return this.f63520n != -2;
    }

    public int hashCode() {
        return vn.j.rl(Integer.valueOf(this.f63520n), Boolean.valueOf(this.rl));
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.f63520n), Boolean.valueOf(this.rl)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private fuX(int i2, boolean z2) {
        this.f63520n = i2;
        this.rl = z2;
    }

    public final int J2() {
        if (!KN()) {
            return this.f63520n;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }
}
