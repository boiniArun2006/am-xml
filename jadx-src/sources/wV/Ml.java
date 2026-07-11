package wV;

import com.bendingspoons.oracle.models.OracleHttpRequestMethod;
import com.bendingspoons.oracle.models.OracleResponse;
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
public abstract class Ml {

    public static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f74989n;

        public j(Moshi moshi) {
            this.f74989n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f74989n, Reflection.typeOf(Object.class));
        }
    }

    public static final class n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f74990n;

        public n(Moshi moshi) {
            this.f74990n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f74990n, Reflection.typeOf(OracleResponse.class));
        }
    }

    public static final Object n(Dsr dsr, Continuation continuation) {
        return Dsr.w6.n(dsr, new KPz.j("v2/secret/exclude-from-segmentation", OracleHttpRequestMethod.DELETE, null, null, null, 28, null), new I28(LazyKt.lazy(new j(zQ.j.n()))), new I28(LazyKt.lazy(new n(zQ.j.n()))), new I28(LazyKt.lazy(new aC(zQ.j.n()))), null, continuation, 16, null);
    }
}
