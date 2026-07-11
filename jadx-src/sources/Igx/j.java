package Igx;

import GjB.n;
import com.bendingspoons.serialization.json.adapters.BSNumberSerializationAdapterKt;
import com.bendingspoons.spidersense.domain.network.entities.NetworkPacket;
import com.bendingspoons.spidersense.domain.network.entities.sampling.SpiderSenseServerSettings;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0011J4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LIgx/j;", "", "", "bspId", "userId", "appVersion", "Lretrofit2/Response;", "Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SpiderSenseServerSettings;", "rl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "shouldBackendSample", "Lcom/bendingspoons/spidersense/domain/network/entities/NetworkPacket;", "networkPacket", "", c.f62177j, "(Ljava/lang/String;ZLcom/bendingspoons/spidersense/domain/network/entities/NetworkPacket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f4297n;

    /* JADX INFO: renamed from: Igx.j$j, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f4297n = new Companion();

        public final j n(n endpoint, OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Object objCreate = new Retrofit.Builder().baseUrl(endpoint.n()).client(okHttpClient).addConverterFactory(MoshiConverterFactory.create(new Moshi.Builder().add(BSNumberSerializationAdapterKt.n()).add((JsonAdapter.Factory) zz.j.n()).add((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).build()).asLenient()).build().create(j.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            return (j) objCreate;
        }

        private Companion() {
        }
    }

    @POST("/v2/public/apps/{bspId}/events")
    Object n(@Path("bspId") String str, @Query("should_sample") boolean z2, @Body NetworkPacket networkPacket, Continuation<? super Response<Unit>> continuation);

    @GET("/v1/public/setup/{bspId}")
    Object rl(@Path("bspId") String str, @Query("user_id") String str2, @Query("app_version") String str3, Continuation<? super Response<SpiderSenseServerSettings>> continuation);
}
