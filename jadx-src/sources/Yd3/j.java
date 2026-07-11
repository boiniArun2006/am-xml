package Yd3;

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
public abstract class j {

    /* JADX INFO: renamed from: Yd3.j$j, reason: collision with other inner class name */
    public static final class C0440j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f12208n;

        public C0440j(Moshi moshi) {
            this.f12208n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f12208n, Reflection.typeOf(Object.class));
        }
    }

    public static final class n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f12209n;

        public n(Moshi moshi) {
            this.f12209n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f12209n, Reflection.typeOf(OracleResponse.class));
        }
    }

    public static final Object n(Dsr dsr, Continuation continuation) {
        return Dsr.w6.n(dsr, new KPz.j("v2/secret/users", OracleHttpRequestMethod.DELETE, null, null, null, 28, null), new I28(LazyKt.lazy(new C0440j(zQ.j.n()))), new I28(LazyKt.lazy(new n(zQ.j.n()))), new I28(LazyKt.lazy(new aC(zQ.j.n()))), null, continuation, 16, null);
    }
}
