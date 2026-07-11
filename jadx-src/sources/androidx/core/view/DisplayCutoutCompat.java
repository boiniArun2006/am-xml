package androidx.core.view;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class DisplayCutoutCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DisplayCutout f36729n;

    @RequiresApi
    static class Api29Impl {
    }

    @RequiresApi
    static class Api31Impl {
    }

    @RequiresApi
    static class Api33Impl {
    }

    @RequiresApi
    static class Api28Impl {
        static int n(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int nr(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }

        static int rl(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int t(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }
    }

    @RequiresApi
    static class Api30Impl {
        static Insets n(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    static DisplayCutoutCompat J2(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new DisplayCutoutCompat(displayCutout);
    }

    public androidx.core.graphics.Insets O() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.Insets.O(Api30Impl.n(this.f36729n)) : androidx.core.graphics.Insets.f36409O;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DisplayCutoutCompat.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.n(this.f36729n, ((DisplayCutoutCompat) obj).f36729n);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f36729n;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public int n() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.n(this.f36729n);
        }
        return 0;
    }

    public int nr() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.nr(this.f36729n);
        }
        return 0;
    }

    public int rl() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.rl(this.f36729n);
        }
        return 0;
    }

    public int t() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.t(this.f36729n);
        }
        return 0;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f36729n + "}";
    }

    private DisplayCutoutCompat(DisplayCutout displayCutout) {
        this.f36729n = displayCutout;
    }
}
