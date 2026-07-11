package Yd3;

import com.bendingspoons.oracle.models.OracleHttpRequestMethod;
import com.bendingspoons.oracle.models.OracleResponse;
import com.bendingspoons.oracle.secretmenu.requests.GiftCodeRedemptionRequest;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import et.I28;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import qu.Dsr;
import qu.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {

    public static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f12210n;

        public j(Moshi moshi) {
            this.f12210n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f12210n, Reflection.typeOf(GiftCodeRedemptionRequest.class));
        }
    }

    /* JADX INFO: renamed from: Yd3.n$n, reason: collision with other inner class name */
    public static final class C0441n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f12211n;

        public C0441n(Moshi moshi) {
            this.f12211n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f12211n, Reflection.typeOf(OracleResponse.class));
        }
    }

    public static final Object n(Dsr dsr, String str, Continuation continuation) {
        return Dsr.w6.n(dsr, new KPz.j("v2/users/gift_code/redeem", OracleHttpRequestMethod.POST, null, null, new GiftCodeRedemptionRequest(str), 12, null), new I28(LazyKt.lazy(new j(zQ.j.n()))), new I28(LazyKt.lazy(new C0441n(zQ.j.n()))), new I28(LazyKt.lazy(new aC(zQ.j.n()))), null, continuation, 16, null);
    }
}
