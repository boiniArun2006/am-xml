package HX;

import HX.Dsr;
import android.content.Context;
import android.provider.Settings;
import com.bendingspoons.concierge.domain.entities.Id;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f3907n = j.f3908n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f3908n = new j();

        public final Dsr t(final Context context, Map mockedIds) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mockedIds, "mockedIds");
            return new uN.I28(mockedIds, YgZ.w6.f12217n.n(context), new Function0() { // from class: HX.CN3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Dsr.j.nr(context);
                }
            }, new Function0() { // from class: HX.fuX
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Dsr.j.O();
                }
            });
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String O() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String nr(Context context) {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
    }

    Object n(Id.Predefined.Internal.j jVar, Continuation continuation);
}
