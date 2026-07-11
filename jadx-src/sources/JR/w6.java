package JR;

import GJW.OU;
import GJW.vd;
import JR.w6;
import SpD.Dsr;
import cO.NetworkPayload;
import cO.NetworkResponse;
import com.bendingspoons.picox.network.models.NetworkException;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.serialization.json.n;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 implements JR.j {
    private final v8.j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final OkHttpClient f4573O;
    private final boolean nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f4574t;

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ w6 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Dsr f4575O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4576n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f4577t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(List list, Dsr dsr, w6 w6Var, Continuation continuation) {
            super(2, continuation);
            this.f4577t = list;
            this.f4575O = dsr;
            this.J2 = w6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String O(Exception exc) {
            return "Failed to parse response: " + exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f4577t, this.f4575O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws NetworkException {
            String strString;
            int iN;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f4576n == 0) {
                ResultKt.throwOnFailure(obj);
                MediaType mediaType = MediaType.INSTANCE.get("application/json; charset=utf-8");
                NetworkPayload networkPayload = new NetworkPayload(this.f4577t, this.f4575O.n(), this.f4575O.rl(), Ba.j.f504n.n());
                try {
                    n.j jVar = kotlinx.serialization.json.n.nr;
                    try {
                        Response responseExecute = FirebasePerfOkHttpClient.execute(this.J2.f4573O.newCall(new Request.Builder().url(this.J2.rl).post(RequestBody.INSTANCE.create(jVar.rl(NetworkPayload.INSTANCE.serializer(), networkPayload), mediaType)).header("Content-Type", "application/json").header("X-Pico-Auth", this.J2.f4574t).header("X-Pico-Is-Development", String.valueOf(this.J2.nr)).build()));
                        int iCode = responseExecute.code();
                        IntRange intRange = Ml.f4569n;
                        int first = intRange.getFirst();
                        if (iCode <= intRange.getLast() && first <= iCode) {
                            throw new NetworkException(cO.j.f43648t, "Client error: " + iCode, null, 4, null);
                        }
                        if (iCode < 500) {
                            ResponseBody responseBodyBody = responseExecute.body();
                            if (responseBodyBody != null) {
                                strString = responseBodyBody.string();
                            } else {
                                strString = null;
                            }
                            if (strString != null && strString.length() != 0) {
                                try {
                                    NetworkResponse networkResponse = (NetworkResponse) jVar.t(NetworkResponse.INSTANCE.serializer(), strString);
                                    Integer delta = networkResponse.getDelta();
                                    if (delta != null) {
                                        iN = delta.intValue();
                                    } else {
                                        iN = this.f4575O.n();
                                    }
                                    String lastEventTimestamp = networkResponse.getLastEventTimestamp();
                                    if (lastEventTimestamp == null) {
                                        lastEventTimestamp = this.f4575O.rl();
                                    }
                                    return new Dsr(iN, lastEventTimestamp);
                                } catch (Exception e2) {
                                    v8.n.t(this.J2.J2, new Function0() { // from class: JR.n
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return w6.j.O(e2);
                                        }
                                    });
                                    return this.f4575O;
                                }
                            }
                            return this.f4575O;
                        }
                        throw new NetworkException(cO.j.f43646n, "Server error: " + iCode, null, 4, null);
                    } catch (NetworkException e3) {
                        throw e3;
                    } catch (IOException e4) {
                        throw new NetworkException(cO.j.f43646n, "Network connection error", e4);
                    }
                } catch (Exception e5) {
                    throw new NetworkException(cO.j.f43645O, "Failed to serialize payload", e5);
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public w6(String endpoint, String identificationToken, boolean z2, OkHttpClient httpClient, v8.j localLogger) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(identificationToken, "identificationToken");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(localLogger, "localLogger");
        this.rl = endpoint;
        this.f4574t = identificationToken;
        this.nr = z2;
        this.f4573O = httpClient;
        this.J2 = localLogger;
    }

    @Override // JR.j
    public Object n(List list, Dsr dsr, Continuation continuation) {
        if (list.isEmpty()) {
            return dsr;
        }
        return GJW.Dsr.Uo(OU.rl(), new j(list, dsr, this, null), continuation);
    }
}
