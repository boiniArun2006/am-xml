package qE;

import com.bendingspoons.oracle.models.ErrorResponse;
import com.bendingspoons.oracle.models.OracleHttpRequestMethod;
import com.bendingspoons.oracle.models.OracleResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Ew {

    public static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f72189n;

        public j(Moshi moshi) {
            this.f72189n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f72189n, Reflection.typeOf(Object.class));
        }
    }

    public static final class n implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f72190n = new n();

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((kotlinx.serialization.json.I28) obj);
            return Unit.INSTANCE;
        }

        public final void n(kotlinx.serialization.json.I28 Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.J2(true);
            Json.nr(true);
        }
    }

    public static final class w6 implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f72191n = new w6();

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((kotlinx.serialization.json.I28) obj);
            return Unit.INSTANCE;
        }

        public final void n(kotlinx.serialization.json.I28 Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.J2(true);
            Json.nr(true);
        }
    }

    public static final Object n(qu.Dsr dsr, Integer num, Continuation continuation) {
        return dsr.n(new KPz.j("v2/users/setup", OracleHttpRequestMethod.GET, null, null, null, 28, null), new et.I28(LazyKt.lazy(new j(zQ.j.n()))), new et.Ml(OracleResponse.INSTANCE.serializer(), kotlinx.serialization.json.Q.rl(null, n.f72190n, 1, null)), new et.Ml(ErrorResponse.INSTANCE.serializer(), kotlinx.serialization.json.Q.rl(null, w6.f72191n, 1, null)), num, continuation);
    }

    public static /* synthetic */ Object rl(qu.Dsr dsr, Integer num, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        return n(dsr, num, continuation);
    }
}
