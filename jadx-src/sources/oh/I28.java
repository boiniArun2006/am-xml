package oh;

import android.content.Context;
import com.bendingspoons.oracle.models.IdentityToken;
import fb.AbstractC2109j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oh.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f71526n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final I28 nr(Context context, rB.Ml ml) {
            return new Wre(context, ml);
        }

        public final I28 O() {
            return new w6();
        }

        public final I28 t(final Context context, final rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return (I28) n(new Function0() { // from class: oh.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return I28.j.nr(context, spiderSense);
                }
            });
        }

        private j() {
        }
    }

    TFv.Wre n();

    Object nr(String str, Continuation continuation);

    Object rl(IdentityToken identityToken, Continuation continuation);

    TFv.Wre t();
}
