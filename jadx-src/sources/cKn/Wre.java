package cKn;

import Dk.InterfaceC1335n;
import android.content.Context;
import androidx.content.core.DataStoreFactory;
import cKn.Wre;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import fb.AbstractC2109j;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Q;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f43632n = j.rl;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: renamed from: cKn.Wre$j$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
        public static final class C0590j implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0590j f43633n = new C0590j();

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((kotlinx.serialization.json.I28) obj);
                return Unit.INSTANCE;
            }

            public final void n(kotlinx.serialization.json.I28 Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.J2(true);
                Json.nr(true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final rB.Ml mUb(rB.Ml ml) {
            return ml;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Wre KN(n nVar, final Context context, InterfaceC1335n interfaceC1335n, K0.n nVar2, final rB.Ml ml, bH.CN3 cn3, final Function2 function2) {
            return new CN3(nVar, context, interfaceC1335n, nVar2, new Function0() { // from class: cKn.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wre.j.xMQ(context, function2, ml);
                }
            }, new S2.Ml(DataStoreFactory.t(DataStoreFactory.f37387n, new et.j(new et.Ml(S2.j.INSTANCE.serializer(), Q.rl(null, C0590j.f43633n, 1, null))), null, null, null, new Function0() { // from class: cKn.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wre.j.gh(context);
                }
            }, 14, null)), new Function0() { // from class: cKn.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wre.j.qie();
                }
            }, new DTN.fuX(context, ml, cn3), null, 256, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File gh(Context context) {
            return androidx.content.Context.n(context, "install_referrer_data");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jXF.j qie() {
            return new jXF.I28();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final S2.CN3 xMQ(Context context, Function2 function2, final rB.Ml ml) {
            return S2.CN3.J2.t(context, function2, new Function0() { // from class: cKn.I28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wre.j.mUb(ml);
                }
            });
        }

        public final Wre Uo(final n config, final Context context, final InterfaceC1335n interfaceC1335n, final Function2 trackEvent, final rB.Ml spiderSense, final K0.n nVar, final bH.CN3 cn3) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(interfaceC1335n, wDgKoYAES.VQJzwa);
            Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return (Wre) n(new Function0() { // from class: cKn.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wre.j.KN(config, context, interfaceC1335n, nVar, spiderSense, cn3, trackEvent);
                }
            });
        }

        private j() {
        }
    }

    public interface n {
        boolean n();

        boolean rl();
    }

    jXF.j n();
}
