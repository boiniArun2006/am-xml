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
public abstract class j {

    /* JADX INFO: renamed from: U2.j$j, reason: collision with other inner class name */
    public static final class C0376j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f10602n;

        public C0376j(Moshi moshi) {
            this.f10602n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f10602n, Reflection.typeOf(Object.class));
        }
    }

    public static final class n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f10603n;

        public n(Moshi moshi) {
            this.f10603n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f10603n, Reflection.typeOf(OracleResponse.class));
        }
    }

    public static final class w6 implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f10604n;

        public w6(Moshi moshi) {
            this.f10604n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f10604n, Reflection.typeOf(ErrorResponse.class));
        }
    }

    public static final Object n(Dsr dsr, Continuation continuation) {
        return Dsr.w6.n(dsr, new KPz.j("v2/secret/privacy_notice", OracleHttpRequestMethod.DELETE, null, null, null, 28, null), new I28(LazyKt.lazy(new C0376j(zQ.j.n()))), new I28(LazyKt.lazy(new n(zQ.j.n()))), new I28(LazyKt.lazy(new w6(zQ.j.n()))), null, continuation, 16, null);
    }
}
