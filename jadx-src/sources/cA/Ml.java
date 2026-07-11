package cA;

import android.content.Context;
import cA.Ml;
import com.bendingspoons.spidersense.domain.entities.j;
import ifA.w6;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f43547n = j.f43548n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f43548n = new j();
        private static final Lazy rl = LazyKt.lazy(new Function0() { // from class: cA.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ml.j.Uo();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public static final j.C0739j J2(Context context) {
            YgZ.n nVarKN = f43548n.KN();
            YgZ.w6 w6Var = YgZ.w6.f12217n;
            return new j.C0739j(w6Var.t(context), w6Var.rl(context), nVarKN.rl(), nVarKN.KN(), nVarKN.J2(), (String) CollectionsKt.last(StringsKt.split$default((CharSequence) nVarKN.J2(), new String[]{"_"}, false, 0, 6, (Object) null)));
        }

        private final YgZ.n KN() {
            return (YgZ.n) rl.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x0X.n O(final Context context) {
            x0X.n nVarN = x0X.w6.n(new Function0() { // from class: cA.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Ml.j.J2(context);
                }
            });
            if (nVarN instanceof n.C1266n) {
                return new n.C1266n(new ifA.w6("DeviceInfoProvider", w6.n.f68148O, w6.j.f68145n, "Device info could not be retrieved. More info in throwable.", (Throwable) ((n.C1266n) nVarN).n(), null, 32, null));
            }
            if (nVarN instanceof n.w6) {
                return nVarN;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final YgZ.n Uo() {
            return new YgZ.n();
        }

        public final Ml nr(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Ml() { // from class: cA.n
                @Override // cA.Ml
                public final x0X.n n() {
                    return Ml.j.O(context);
                }
            };
        }

        private j() {
        }
    }

    x0X.n n();
}
