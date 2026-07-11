package mCM;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f70665n = 70;
    private TimeUnit rl = f70664O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f70666t = false;
    private static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final TimeUnit f70664O = TimeUnit.SECONDS;

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public final OkHttpClient n(OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        OkHttpClient okHttpClientBuild = client.newBuilder().callTimeout(this.f70665n, this.rl).readTimeout(this.f70665n, this.rl).build();
        Intrinsics.checkNotNullExpressionValue(okHttpClientBuild, "client\n      .newBuilder…eoutUnits)\n      .build()");
        return okHttpClientBuild;
    }
}
