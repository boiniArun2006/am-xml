package qE;

import android.content.Context;
import androidx.content.core.DataStoreFactory;
import com.bendingspoons.oracle.models.OracleResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import fb.AbstractC2109j;
import java.io.File;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import qE.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f72300n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        public static final class Ml implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final Ml f72301n = new Ml();

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

        /* JADX INFO: renamed from: qE.fuX$j$j, reason: collision with other inner class name */
        public static final class C1115j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Moshi f72302n;

            public C1115j(Moshi moshi) {
                this.f72302n = moshi;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final JsonAdapter invoke() {
                return _MoshiKotlinExtensionsKt.adapter(this.f72302n, Reflection.typeOf(OracleResponse.class));
            }
        }

        public static final class n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Moshi f72303n;

            public n(Moshi moshi) {
                this.f72303n = moshi;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final JsonAdapter invoke() {
                return _MoshiKotlinExtensionsKt.adapter(this.f72303n, Reflection.typeOf(OracleResponse.class));
            }
        }

        public static final class w6 implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final w6 f72304n = new w6();

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

        /* JADX INFO: Access modifiers changed from: private */
        public static final File J2(Context context) {
            return androidx.content.Context.n(context, "oracle_response");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fuX O(boolean z2, final Context context, rB.Ml ml) {
            return new Dsr(DataStoreFactory.t(DataStoreFactory.f37387n, z2 ? new et.j(new et.Ml(OracleResponse.INSTANCE.serializer(), kotlinx.serialization.json.Q.rl(null, w6.f72304n, 1, null))) : new et.j(new et.I28(LazyKt.lazy(new C1115j(zQ.j.n())))), null, CollectionsKt.listOf(new qE.Ml(context, z2 ? new et.Ml(OracleResponse.INSTANCE.serializer(), kotlinx.serialization.json.Q.rl(null, Ml.f72301n, 1, null)) : new et.I28(LazyKt.lazy(new n(zQ.j.n()))))), null, new Function0() { // from class: qE.CN3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return fuX.j.J2(context);
                }
            }, 10, null), qz.t(context), ml);
        }

        public final fuX nr(final Context context, final rB.Ml spiderSense, final boolean z2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return (fuX) n(new Function0() { // from class: qE.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return fuX.j.O(z2, context, spiderSense);
                }
            });
        }

        private j() {
        }
    }

    TFv.Wre O();

    TFv.Wre getResponse();

    TFv.Wre n();

    TFv.Wre nr();

    Object rl(Continuation continuation);

    Object t(OracleResponse oracleResponse, Integer num, Continuation continuation);
}
