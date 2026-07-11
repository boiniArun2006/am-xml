package com.bendingspoons.legal.network;

import com.bendingspoons.legal.network.LegalRequest;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: com.bendingspoons.legal.network.j$j, reason: collision with other inner class name */
    public static final class C0723j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f51385n;

        public C0723j(Moshi moshi) {
            this.f51385n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f51385n, Reflection.typeOf(LegalRequest.class));
        }
    }

    public static final class n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f51386n;

        public n(Moshi moshi) {
            this.f51386n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f51386n, Reflection.typeOf(OracleResponse.class));
        }
    }

    public static final class w6 implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f51387n;

        public w6(Moshi moshi) {
            this.f51387n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f51387n, Reflection.typeOf(ErrorResponse.class));
        }
    }

    public static final Object n(Dsr dsr, String str, String str2, Continuation continuation) {
        return Dsr.w6.n(dsr, new KPz.j("v2/users/legal", OracleHttpRequestMethod.POST, null, null, new LegalRequest(new LegalRequest.PrivacyPolicy(str), new LegalRequest.TermsOfService(str2)), 12, null), new I28(LazyKt.lazy(new C0723j(zQ.j.n()))), new I28(LazyKt.lazy(new n(zQ.j.n()))), new I28(LazyKt.lazy(new w6(zQ.j.n()))), null, continuation, 16, null);
    }
}
