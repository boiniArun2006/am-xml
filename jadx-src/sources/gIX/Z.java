package gIX;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f67402n;
    private final String nr;
    private final Bitmap rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DAz f67403t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z2 = (Z) obj;
        return Intrinsics.areEqual(this.f67402n, z2.f67402n) && Intrinsics.areEqual(this.rl, z2.rl) && this.f67403t == z2.f67403t && Intrinsics.areEqual(this.nr, z2.nr);
    }

    public Z(String link, Bitmap bitmap, DAz type, String filename) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(filename, "filename");
        this.f67402n = link;
        this.rl = bitmap;
        this.f67403t = type;
        this.nr = filename;
    }

    public int hashCode() {
        return (((((this.f67402n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f67403t.hashCode()) * 31) + this.nr.hashCode();
    }

    public final Bitmap n() {
        return this.rl;
    }

    public final DAz nr() {
        return this.f67403t;
    }

    public final String rl() {
        return this.nr;
    }

    public final String t() {
        return this.f67402n;
    }

    public String toString() {
        return "ProjectPackageSaveItem(link=" + this.f67402n + ", bitmap=" + this.rl + ", type=" + this.f67403t + ", filename=" + this.nr + ")";
    }
}
