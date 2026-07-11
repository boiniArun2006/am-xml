package GRR;

import LJY.n;
import TFv.rv6;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0125j f3542n = C0125j.f3543n;

    /* JADX INFO: renamed from: GRR.j$j, reason: collision with other inner class name */
    public static final class C0125j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C0125j f3543n = new C0125j();

        public final j n(rv6 developmentDeviceFlow, n.C0204n config, w6 listener) {
            Intrinsics.checkNotNullParameter(developmentDeviceFlow, "developmentDeviceFlow");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(listener, "listener");
            return new n(developmentDeviceFlow, config, listener, sJa.w6.rl);
        }

        private C0125j() {
        }
    }

    void onTouchEvent(MotionEvent motionEvent);
}
