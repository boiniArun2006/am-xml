package YgZ;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Wre f12214n = new Wre();
    private static int rl = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f12215t = -1;

    public final double n(Context context, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ((double) i2) / ((double) context.getResources().getDisplayMetrics().xdpi);
    }

    public final double rl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("display");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display.Mode mode = ((DisplayManager) systemService).getDisplay(0).getMode();
        return xFr.w6.n(n(context, (int) Math.sqrt(Math.pow(mode.getPhysicalWidth(), 2.0d) + Math.pow(mode.getPhysicalHeight(), 2.0d))), 1);
    }

    private Wre() {
    }
}
