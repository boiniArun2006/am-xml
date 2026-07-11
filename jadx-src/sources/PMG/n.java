package PMG;

import La.Ml;
import PMG.n;
import com.bendingspoons.pico.domain.uploader.internal.network.PicoNetworkInterface;
import java.util.Date;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f7696n = j.f7697n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f7697n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Date t() {
            return new Date();
        }

        public final n rl(Ml.n.InterfaceC0214n.j picoIdsConfig, Ml.n.j picoBackendConfig, rB.Ml spiderSense, OkHttpClient okHttpClient, v8.j localLogger) {
            Intrinsics.checkNotNullParameter(picoIdsConfig, "picoIdsConfig");
            Intrinsics.checkNotNullParameter(picoBackendConfig, "picoBackendConfig");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(localLogger, "localLogger");
            return new Dx.w6(PicoNetworkInterface.f51504n.n(picoIdsConfig, picoBackendConfig, spiderSense, okHttpClient), new Function0() { // from class: PMG.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.j.t();
                }
            }, spiderSense, localLogger);
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: PMG.n$n, reason: collision with other inner class name */
    public static abstract class AbstractC0271n {

        /* JADX INFO: renamed from: PMG.n$n$j */
        public static final class j extends AbstractC0271n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final j f7698n = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public String toString() {
                return "RejectedEvents";
            }

            public int hashCode() {
                return 1904719287;
            }
        }

        /* JADX INFO: renamed from: PMG.n$n$n, reason: collision with other inner class name */
        public static final class C0272n extends AbstractC0271n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0272n f7699n = new C0272n();

            private C0272n() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0272n);
            }

            public String toString() {
                return "Unknown";
            }

            public int hashCode() {
                return -406138422;
            }
        }

        public /* synthetic */ AbstractC0271n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0271n() {
        }
    }

    Object n(List list, Continuation continuation);
}
