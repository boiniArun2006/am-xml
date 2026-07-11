package Kre;

import com.bendingspoons.networking.NetworkError;
import com.bendingspoons.spidersense.domain.network.entities.NetworkPacket;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j implements lA5.j {
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Igx.j f5886t;

    public static final class I28 implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ResponseBody f5887n;

        public I28(ResponseBody responseBody) {
            this.f5887n = responseBody;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws IOException {
            Moshi moshiRl = et.w6.rl();
            return moshiRl.adapter(Unit.class).fromJson(this.f5887n.string());
        }
    }

    public static final class Ml extends SuspendLambda implements Function1 {
        final /* synthetic */ NetworkPacket J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f5888O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5889n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ j f5890t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Continuation continuation, j jVar, boolean z2, NetworkPacket networkPacket) {
            super(1, continuation);
            this.f5890t = jVar;
            this.f5888O = z2;
            this.J2 = networkPacket;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Ml(continuation, this.f5890t, this.f5888O, this.J2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5889n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Igx.j jVar = this.f5890t.f5886t;
            String str = this.f5890t.rl;
            boolean z2 = this.f5888O;
            NetworkPacket networkPacket = this.J2;
            this.f5889n = 1;
            Object objN = jVar.n(str, z2, networkPacket, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Wre extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f5891O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5892n;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5892n = obj;
            this.f5891O |= Integer.MIN_VALUE;
            return j.this.n(null, false, this);
        }
    }

    /* JADX INFO: renamed from: Kre.j$j, reason: collision with other inner class name */
    public static final class C0201j extends SuspendLambda implements Function1 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f5894O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5895n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ j f5896t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0201j(Continuation continuation, j jVar, String str, String str2) {
            super(1, continuation);
            this.f5896t = jVar;
            this.f5894O = str;
            this.J2 = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new C0201j(continuation, this.f5896t, this.f5894O, this.J2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5895n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Igx.j jVar = this.f5896t.f5886t;
            String str = this.f5896t.rl;
            String str2 = this.f5894O;
            String str3 = this.J2;
            this.f5895n = 1;
            Object objRl = jVar.rl(str, str2, str3, this);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objRl;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C0201j) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ResponseBody f5897n;

        public n(ResponseBody responseBody) {
            this.f5897n = responseBody;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws IOException {
            Moshi moshiRl = et.w6.rl();
            return moshiRl.adapter(Unit.class).fromJson(this.f5897n.string());
        }
    }

    static final class w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f5898O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5899n;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5899n = obj;
            this.f5898O |= Integer.MIN_VALUE;
            return j.this.rl(null, null, this);
        }
    }

    public j(String appName, Igx.j apiService) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        this.rl = appName;
        this.f5886t = apiService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // lA5.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(NetworkPacket networkPacket, boolean z2, Continuation continuation) {
        Wre wre;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.f5891O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.f5891O = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object objUo = wre.f5892n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.f5891O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            Ml ml = new Ml(null, this, z2, networkPacket);
            wre.f5891O = 1;
            objUo = x0X.w6.Uo(ml, wre);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUo);
        }
        Object c1266n = (x0X.n) objUo;
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
            return objBody != null ? new n.w6(objBody) : new n.w6(Unit.INSTANCE);
        }
        int iCode = response.code();
        ResponseBody responseBodyErrorBody = response.errorBody();
        return new n.C1266n(new NetworkError.j(iCode, responseBodyErrorBody != null ? x0X.w6.nr(x0X.w6.n(new I28(responseBodyErrorBody))) : null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // lA5.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(String str, String str2, Continuation continuation) {
        w6 w6Var;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f5898O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f5898O = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objUo = w6Var.f5899n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f5898O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            C0201j c0201j = new C0201j(null, this, str, str2);
            w6Var.f5898O = 1;
            objUo = x0X.w6.Uo(c0201j, w6Var);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUo);
        }
        Object c1266n = (x0X.n) objUo;
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
            return objBody != null ? new n.w6(objBody) : new n.C1266n(new NetworkError.I28(new Throwable("Response is success, but body is null.")));
        }
        int iCode = response.code();
        ResponseBody responseBodyErrorBody = response.errorBody();
        return new n.C1266n(new NetworkError.j(iCode, responseBodyErrorBody != null ? x0X.w6.nr(x0X.w6.n(new n(responseBodyErrorBody))) : null));
    }
}
