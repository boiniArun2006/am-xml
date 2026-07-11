package dX;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CN3 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f63504O = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f63505n;
    public final float nr;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f63506t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public CN3(int i2, int i3, float f3, float f4) {
        this.f63505n = i2;
        this.rl = i3;
        this.f63506t = f3;
        this.nr = f4;
        if (i2 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i3 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CN3)) {
            return false;
        }
        CN3 cn3 = (CN3) obj;
        return this.f63505n == cn3.f63505n && this.rl == cn3.rl;
    }

    public int hashCode() {
        return vn.j.n(this.f63505n, this.rl);
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f63505n), Integer.valueOf(this.rl)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public /* synthetic */ CN3(int i2, int i3, float f3, float f4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, (i5 & 4) != 0 ? 2048.0f : f3, (i5 & 8) != 0 ? 0.6666667f : f4);
    }
}
