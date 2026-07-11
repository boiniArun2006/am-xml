package sqD;

import android.content.Context;
import fb.AbstractC2109j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import sqD.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface n extends fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f73321n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final n nr(Context context, Wre wre, CZF.I28 i28, rB.Ml ml) {
            return new kuA.Ml(context, wre, i28, ml, null, null, 48, null);
        }

        public final n t(final Context context, final Wre experienceFactory, final CZF.I28 i28, final rB.Ml ml) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(experienceFactory, "experienceFactory");
            return (n) n(new Function0() { // from class: sqD.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.j.nr(context, experienceFactory, i28, ml);
                }
            });
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: sqD.n$n, reason: collision with other inner class name */
    public static final class C1174n {
        public static /* synthetic */ Object n(n nVar, CN3 cn3, JSONObject jSONObject, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: evaluate");
            }
            if ((i2 & 2) != 0) {
                jSONObject = new JSONObject();
            }
            return nVar.nr(cn3, jSONObject, continuation);
        }
    }

    void J2(Function0 function0);

    void O(JSONObject jSONObject);

    TFv.Wre n();

    Object nr(CN3 cn3, JSONObject jSONObject, Continuation continuation);

    x0X.n t(String str);
}
