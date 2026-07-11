package nKt;

import Dk.InterfaceC1335n;
import android.content.Context;
import fb.AbstractC2109j;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nKt.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f71040n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final n nr(Context context, InterfaceC1063n interfaceC1063n, InterfaceC1335n interfaceC1335n) {
            return Dsr.qie.t(context, interfaceC1063n, interfaceC1335n);
        }

        public final n t(final Context context, final InterfaceC1063n config, final InterfaceC1335n concierge) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            return (n) n(new Function0() { // from class: nKt.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.j.nr(context, config, concierge);
                }
            });
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: nKt.n$n, reason: collision with other inner class name */
    public interface InterfaceC1063n {

        /* JADX INFO: renamed from: nKt.n$n$j */
        public static final class j {
            public static String J2(InterfaceC1063n interfaceC1063n) {
                return "android@0.5.0";
            }

            public static Object n(InterfaceC1063n interfaceC1063n, Continuation continuation) {
                return new HashMap();
            }

            public static int rl(InterfaceC1063n interfaceC1063n) {
                return 100;
            }

            public static String t(InterfaceC1063n interfaceC1063n) {
                return "https://api.picox.bendingspoons.com/v1/events";
            }

            public static long O(InterfaceC1063n interfaceC1063n) {
                return o.f71042t;
            }

            public static long Uo(InterfaceC1063n interfaceC1063n) {
                return o.f71041n;
            }

            public static long nr(InterfaceC1063n interfaceC1063n) {
                return o.rl;
            }
        }

        boolean J2();

        Object KN(Continuation continuation);

        long O();

        long Uo();

        String getSdkVersion();

        Object n(Continuation continuation);

        int nr();

        String rl();

        String t();

        long xMQ();
    }

    void n(String str, pq.Ml ml);

    Kz.n rl();

    void start();
}
