package HX;

import HX.Wre;
import android.content.Context;
import com.bendingspoons.concierge.domain.entities.Id;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f3910n = j.f3911n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f3911n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final long Uo() {
            return new Date().getTime();
        }

        public final Wre nr(final Context context, Map mockedIds) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mockedIds, "mockedIds");
            return new uN.j(mockedIds, new Function0() { // from class: HX.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wre.j.O(context);
                }
            }, new Function0() { // from class: HX.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wre.j.J2(context);
                }
            }, new Function0() { // from class: HX.I28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(Wre.j.Uo());
                }
            }, sJa.Ml.f73203n.n());
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AppSetIdInfo J2(Context context) throws ExecutionException, InterruptedException {
            Object objAwait = Tasks.await(AppSet.getClient(context).getAppSetIdInfo());
            Intrinsics.checkNotNullExpressionValue(objAwait, "await(...)");
            return (AppSetIdInfo) objAwait;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AdvertisingIdClient.Info O(Context context) throws Throwable {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(...)");
            return advertisingIdInfo;
        }
    }

    Object n(Id.Predefined.External.j jVar, Continuation continuation);
}
