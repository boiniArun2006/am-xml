package WD;

import WD.Ml;
import fb.AbstractC2109j;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f11440n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Ml t(Function0 function0) {
            return new CN3(function0);
        }

        public final Ml nr(final Function0 timestampProvider) {
            Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
            return (Ml) n(new Function0() { // from class: WD.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Ml.j.t(timestampProvider);
                }
            });
        }

        private j() {
        }
    }

    x0X.n n(List list, String str);

    x0X.n rl(List list, String str);
}
