package eu;

import com.bendingspoons.networking.NetworkError;
import com.bendingspoons.pico.domain.uploader.internal.network.PicoNetworkInterface;
import com.bendingspoons.pico.domain.uploader.internal.network.entities.PicoNetworkPacket;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;
import x0X.n;

/* JADX INFO: renamed from: eu.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C1971j implements PicoNetworkInterface {
    private final nLb.n rl;

    /* JADX INFO: renamed from: eu.j$j, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class C0858j extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ PicoNetworkPacket f63894O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f63895n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C1971j f63896t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0858j(Continuation continuation, C1971j c1971j, PicoNetworkPacket picoNetworkPacket) {
            super(1, continuation);
            this.f63896t = c1971j;
            this.f63894O = picoNetworkPacket;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new C0858j(continuation, this.f63896t, this.f63894O);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f63895n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            nLb.n nVar = this.f63896t.rl;
            PicoNetworkPacket picoNetworkPacket = this.f63894O;
            this.f63895n = 1;
            Object objN = nVar.n(picoNetworkPacket, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C0858j) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: eu.j$n */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ResponseBody f63897n;

        public n(ResponseBody responseBody) {
            this.f63897n = responseBody;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws IOException {
            Moshi moshiRl = et.w6.rl();
            return moshiRl.adapter(PicoNetworkInterface.ErrorResponse.class).fromJson(this.f63897n.string());
        }
    }

    /* JADX INFO: renamed from: eu.j$w6 */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f63898O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f63899n;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63899n = obj;
            this.f63898O |= Integer.MIN_VALUE;
            return C1971j.this.n(null, this);
        }
    }

    public C1971j(nLb.n picoApiService) {
        Intrinsics.checkNotNullParameter(picoApiService, "picoApiService");
        this.rl = picoApiService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.bendingspoons.pico.domain.uploader.internal.network.PicoNetworkInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(PicoNetworkPacket picoNetworkPacket, Continuation continuation) {
        w6 w6Var;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f63898O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f63898O = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objUo = w6Var.f63899n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f63898O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            C0858j c0858j = new C0858j(null, this, picoNetworkPacket);
            w6Var.f63898O = 1;
            objUo = x0X.w6.Uo(c0858j, w6Var);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUo);
        }
        x0X.n c1266n = (x0X.n) objUo;
        if (c1266n instanceof n.C1266n) {
            Throwable th = (Throwable) ((n.C1266n) c1266n).n();
            c1266n = new n.C1266n(th instanceof SocketTimeoutException ? new NetworkError.Ml((SocketTimeoutException) th) : th instanceof IOException ? new NetworkError.n((IOException) th) : th instanceof JsonDataException ? new NetworkError.w6((Exception) th, null, 2, null) : new NetworkError.I28(th));
        } else if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (c1266n instanceof n.C1266n) {
            return c1266n;
        }
        if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        Response response = (Response) ((n.w6) c1266n).n();
        if (response.isSuccessful()) {
            Object objBody = response.body();
            return objBody != null ? new n.w6(objBody) : new n.C1266n(new NetworkError.I28(new Throwable(jhotmBbwMbr.FSAPhIzojH)));
        }
        int iCode = response.code();
        ResponseBody responseBodyErrorBody = response.errorBody();
        return new n.C1266n(new NetworkError.j(iCode, responseBodyErrorBody != null ? x0X.w6.nr(x0X.w6.n(new n(responseBodyErrorBody))) : null));
    }
}
