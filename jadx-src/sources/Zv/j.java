package Zv;

import Dk.InterfaceC1335n;
import GJW.vd;
import androidx.content.core.DataStore;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0457j f12606n = C0457j.f12607n;

    /* JADX INFO: renamed from: Zv.j$j, reason: collision with other inner class name */
    public static final class C0457j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C0457j f12607n = new C0457j();

        public final j n(Function2 track, InterfaceC1335n concierge, vd scope, PI.j lifecycleObserver, DataStore dataStore, String appVersion, long j2, Boolean bool) {
            Intrinsics.checkNotNullParameter(track, "track");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
            Intrinsics.checkNotNullParameter(dataStore, "dataStore");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            return new n(track, concierge, lifecycleObserver, scope, dataStore, appVersion, j2, bool);
        }

        private C0457j() {
        }
    }

    void n();
}
