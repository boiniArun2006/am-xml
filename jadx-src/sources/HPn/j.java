package HPn;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0133j f3890n = C0133j.f3891n;

    /* JADX INFO: renamed from: HPn.j$j, reason: collision with other inner class name */
    public static final class C0133j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C0133j f3891n = new C0133j();

        public final j n(n config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return new Ml(config);
        }

        private C0133j() {
        }
    }

    Function1 n();
}
