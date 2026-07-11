package KfI;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class CN3 implements fuX {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oSp.n f5640n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public CN3(oSp.n transportFactoryProvider) {
        Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.f5640n = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] t(SPz sPz) {
        String strRl = ci.f5695n.t().rl(sPz);
        Intrinsics.checkNotNullExpressionValue(strRl, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event Type: " + sPz.rl().name());
        byte[] bytes = strRl.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // KfI.fuX
    public void n(SPz sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "sessionEvent");
        ((bF.Dsr) this.f5640n.get()).n("FIREBASE_APPQUALITY_SESSION", SPz.class, bF.n.rl("json"), new bF.CN3() { // from class: KfI.Wre
            @Override // bF.CN3
            public final Object apply(Object obj) {
                return this.f5686n.t((SPz) obj);
            }
        }).n(bF.w6.J2(sessionEvent));
    }
}
