package U2;

import com.bendingspoons.oracle.models.ErrorResponse;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {

    public static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f10605n;

        public j(Moshi moshi) {
            this.f10605n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f10605n, Reflection.typeOf(Object.class));
        }
    }

    /* JADX INFO: renamed from: U2.n$n, reason: collision with other inner class name */
    public static final class C0377n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f10606n;

        public C0377n(Moshi moshi) {
            this.f10606n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f10606n, Reflection.typeOf(OracleResponse.class));
        }
    }

    public static final class w6 implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f10607n;

        public w6(Moshi moshi) {
            this.f10607n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f10607n, Reflection.typeOf(ErrorResponse.class));
        }
    }

    public static final Object n(Dsr dsr, Continuation continuation) {
        return Dsr.w6.n(dsr, new KPz.j("v2/secret/terms_of_service", OracleHttpRequestMethod.DELETE, null, null, null, 28, null), new I28(LazyKt.lazy(new j(zQ.j.n()))), new I28(LazyKt.lazy(new C0377n(zQ.j.n()))), new I28(LazyKt.lazy(new w6(zQ.j.n()))), null, continuation, 16, null);
    }
}
