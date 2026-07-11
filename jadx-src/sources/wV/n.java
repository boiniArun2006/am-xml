package wV;

import com.bendingspoons.oracle.models.OracleHttpRequestMethod;
import com.bendingspoons.oracle.models.OracleResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import et.I28;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import qu.Dsr;
import qu.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class n {

    public static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f74993n;

        public j(Moshi moshi) {
            this.f74993n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            Moshi moshi = this.f74993n;
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(Map.class, companion.invariant(Reflection.typeOf(String.class)), companion.invariant(Reflection.typeOf(Integer.TYPE))));
        }
    }

    /* JADX INFO: renamed from: wV.n$n, reason: collision with other inner class name */
    public static final class C1257n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f74994n;

        public C1257n(Moshi moshi) {
            this.f74994n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f74994n, Reflection.typeOf(OracleResponse.class));
        }
    }

    public static final Object n(Dsr dsr, Map map, Continuation continuation) {
        return Dsr.w6.n(dsr, new KPz.j("v2/secret/experiments", OracleHttpRequestMethod.PUT, null, null, map, 12, null), new I28(LazyKt.lazy(new j(zQ.j.n()))), new I28(LazyKt.lazy(new C1257n(zQ.j.n()))), new I28(LazyKt.lazy(new aC(zQ.j.n()))), null, continuation, 16, null);
    }
}
