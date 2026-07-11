package nLb;

import GJW.aC;
import GJW.vd;
import La.Ml;
import ajd.j;
import com.bendingspoons.pico.domain.uploader.internal.network.PicoNetworkInterface;
import com.bendingspoons.pico.domain.uploader.internal.network.entities.PicoNetworkPacket;
import com.bendingspoons.pico.domain.uploader.internal.network.retrofit.PicoNetworkUserAdapter;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nLb.n;
import okhttp3.CertificatePinner;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import rB.I28;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00062\u00020\u0001:\u0001\bJ \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"LnLb/n;", "", "Lcom/bendingspoons/pico/domain/uploader/internal/network/entities/PicoNetworkPacket;", "networkPacket", "Lretrofit2/Response;", "Lcom/bendingspoons/pico/domain/uploader/internal/network/PicoNetworkInterface$SuccessResponse;", c.f62177j, "(Lcom/bendingspoons/pico/domain/uploader/internal/network/entities/PicoNetworkPacket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface n {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f71052n;

    /* JADX INFO: renamed from: nLb.n$j, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f71052n = new Companion();
        private static final HttpLoggingInterceptor rl;

        /* JADX INFO: renamed from: nLb.n$j$j, reason: collision with other inner class name */
        static final class C1065j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f71053n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Ml.n.InterfaceC0214n.j f71054t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1065j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1065j(Ml.n.InterfaceC0214n.j jVar, Continuation continuation) {
                super(2, continuation);
                this.f71054t = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1065j(this.f71054t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f71053n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1 function1N = this.f71054t.n();
                this.f71053n = 1;
                Object objInvoke = function1N.invoke(this);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
            httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
            rl = httpLoggingInterceptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Response t(Ml.n.j jVar, Ml.n.InterfaceC0214n.j jVar2, rB.Ml ml, Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            Request.Builder builderAddHeader = chain.request().newBuilder().addHeader("Pico-Version", "2.8.3");
            x0X.n nVar = (x0X.n) aC.rl(null, new C1065j(jVar2, null), 1, null);
            boolean z2 = nVar instanceof n.C1266n;
            if (!z2) {
                if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                builderAddHeader.addHeader("Pico-Client-ID", (String) ((n.w6) nVar).n());
            }
            if (z2) {
                I28.rl(ml, CollectionsKt.listOf((Object[]) new String[]{"header", "clientId", MRAIDPresenter.ERROR}), j.EnumC0481j.f13104r, "Sent if Pico is not able to retrieve theclient id.", null, ((WN.j) ((n.C1266n) nVar).n()).n(), 8, null);
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return chain.proceed(builderAddHeader.addHeader("Pico-Tester", String.valueOf(((Boolean) jVar.rl().invoke()).booleanValue())).addHeader("Bsp-Id", jVar2.t()).build());
        }

        public final n nr(final Ml.n.j backendConfig, final Ml.n.InterfaceC0214n.j idsConfig, Interceptor compressionInterceptor, rB.Ml spiderSense, OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(backendConfig, "backendConfig");
            Intrinsics.checkNotNullParameter(idsConfig, "idsConfig");
            Intrinsics.checkNotNullParameter(compressionInterceptor, "compressionInterceptor");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            final rB.Ml mlNr = d3.j.nr(spiderSense, a.f62814d);
            Interceptor interceptor = new Interceptor() { // from class: nLb.j
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    return n.Companion.t(backendConfig, idsConfig, mlNr, chain);
                }
            };
            OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
            builderNewBuilder.addInterceptor(compressionInterceptor);
            builderNewBuilder.addInterceptor(backendConfig.n().t());
            builderNewBuilder.addInterceptor(interceptor);
            builderNewBuilder.addInterceptor(rl);
            CertificatePinner certificatePinner = (CertificatePinner) backendConfig.n().n().invoke();
            if (certificatePinner != null) {
                builderNewBuilder.certificatePinner(certificatePinner);
            }
            Object objCreate = new Retrofit.Builder().baseUrl(backendConfig.n().rl().n()).client(builderNewBuilder.build()).addConverterFactory(MoshiConverterFactory.create(new Moshi.Builder().add(new PicoNetworkUserAdapter()).add((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).add(Date.class, new Rfc3339DateJsonAdapter().nullSafe()).build()).asLenient()).build().create(n.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            return (n) objCreate;
        }

        public final n rl(Ml.n.InterfaceC0214n.j idsConfig, Ml.n.j backendConfig, rB.Ml spiderSense, OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(idsConfig, "idsConfig");
            Intrinsics.checkNotNullParameter(backendConfig, "backendConfig");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            return nr(backendConfig, idsConfig, new rN0.j(), spiderSense, okHttpClient);
        }

        private Companion() {
        }
    }

    @POST("/v4/events")
    Object n(@Body PicoNetworkPacket picoNetworkPacket, Continuation<? super retrofit2.Response<PicoNetworkInterface.SuccessResponse>> continuation);
}
