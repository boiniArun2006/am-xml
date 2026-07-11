package androidx.core.view;

import android.content.Context;
import android.view.PointerIcon;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class PointerIconCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PointerIcon f36750n;

    @RequiresApi
    static class Api24Impl {
        static PointerIcon n(Context context, int i2) {
            return PointerIcon.getSystemIcon(context, i2);
        }
    }

    public static PointerIconCompat rl(Context context, int i2) {
        return new PointerIconCompat(Api24Impl.n(context, i2));
    }

    public Object n() {
        return this.f36750n;
    }

    private PointerIconCompat(PointerIcon pointerIcon) {
        this.f36750n = pointerIcon;
    }
}
