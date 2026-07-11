package HI0;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class P {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View f3829n;
    private final PopupWindow rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p2 = (P) obj;
        return Intrinsics.areEqual(this.f3829n, p2.f3829n) && Intrinsics.areEqual(this.rl, p2.rl);
    }

    public P(View contentView, PopupWindow popupWindow) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(popupWindow, "popupWindow");
        this.f3829n = contentView;
        this.rl = popupWindow;
    }

    public int hashCode() {
        return (this.f3829n.hashCode() * 31) + this.rl.hashCode();
    }

    public final PopupWindow n() {
        return this.rl;
    }

    public String toString() {
        return "PopupWindowInfo(contentView=" + this.f3829n + ", popupWindow=" + this.rl + ")";
    }
}
