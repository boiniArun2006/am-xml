package wV;

import com.bendingspoons.experiments.network.OracleExperiment;
import com.bendingspoons.oracle.models.OracleHttpRequestMethod;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import et.I28;
import java.util.List;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import qu.Dsr;
import qu.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 {

    public static final class Ml implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f74995n;

        public Ml(Moshi moshi) {
            this.f74995n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f74995n, Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(OracleExperiment.class))));
        }
    }

    public static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f74996n;

        public j(Moshi moshi) {
            this.f74996n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f74996n, Reflection.typeOf(Object.class));
        }
    }

    public static final class n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f74997n;

        public n(Moshi moshi) {
            this.f74997n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f74997n, Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(OracleExperiment.class))));
        }
    }

    /* JADX INFO: renamed from: wV.w6$w6, reason: collision with other inner class name */
    public static final class C1258w6 implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f74998n;

        public C1258w6(Moshi moshi) {
            this.f74998n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f74998n, Reflection.typeOf(Object.class));
        }
    }

    public static final Object n(Dsr dsr, Continuation continuation) {
        return Dsr.w6.n(dsr, new KPz.j("v2/secret/all-experiments", OracleHttpRequestMethod.GET, null, null, null, 28, null), new I28(LazyKt.lazy(new j(zQ.j.n()))), new I28(LazyKt.lazy(new n(zQ.j.n()))), new I28(LazyKt.lazy(new aC(zQ.j.n()))), null, continuation, 16, null);
    }

    public static final Object rl(Dsr dsr, Continuation continuation) {
        return Dsr.w6.n(dsr, new KPz.j("v2/secret/experiments", OracleHttpRequestMethod.GET, null, null, null, 28, null), new I28(LazyKt.lazy(new C1258w6(zQ.j.n()))), new I28(LazyKt.lazy(new Ml(zQ.j.n()))), new I28(LazyKt.lazy(new aC(zQ.j.n()))), null, continuation, 16, null);
    }
}
