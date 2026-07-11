package Lf;

import Be4.P;
import Be4.psW;
import Lf.Dsr;
import Lvl.Ml;
import android.net.Uri;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import coil.network.HttpException;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.safedk.android.analytics.brandsafety.creatives.g;
import java.io.IOException;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import r1.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C implements Dsr {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f6152O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f6153n;
    private final Lazy nr;
    private final FjR.C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f6154t;
    public static final j J2 = new j(null);
    private static final CacheControl Uo = new CacheControl.Builder().noCache().noStore().build();
    private static final CacheControl KN = new CacheControl.Builder().noCache().onlyIfCached().build();

    static final class Ml extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f6155O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6156n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f6157o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f6159t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f6157o |= Integer.MIN_VALUE;
            return C.this.n(this);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f6162O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f6163n;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6163n = obj;
            this.f6162O |= Integer.MIN_VALUE;
            return C.this.t(null, this);
        }
    }

    private final Lvl.w6 mUb(j.w6 w6Var) throws Throwable {
        Throwable th;
        Lvl.w6 w6Var2;
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(O().source(w6Var.getMetadata()));
            try {
                w6Var2 = new Lvl.w6(bufferedSourceBuffer);
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    th = null;
                }
            } catch (Throwable th3) {
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (Throwable th4) {
                        ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                th = th3;
                w6Var2 = null;
            }
            if (th == null) {
                return w6Var2;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public final String J2(String str, MediaType mediaType) {
        String strMUb;
        String mediaType2 = mediaType != null ? mediaType.getMediaType() : null;
        if ((mediaType2 == null || StringsKt.startsWith$default(mediaType2, "text/plain", false, 2, (Object) null)) && (strMUb = kYF.C.mUb(MimeTypeMap.getSingleton(), str)) != null) {
            return strMUb;
        }
        if (mediaType2 != null) {
            return StringsKt.substringBefore$default(mediaType2, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    public static final class n implements Dsr.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Lazy f6160n;
        private final Lazy rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f6161t;

        public n(Lazy lazy, Lazy lazy2, boolean z2) {
            this.f6160n = lazy;
            this.rl = lazy2;
            this.f6161t = z2;
        }

        private final boolean t(Uri uri) {
            if (!Intrinsics.areEqual(uri.getScheme(), g.f62375e) && !Intrinsics.areEqual(uri.getScheme(), "https")) {
                return false;
            }
            return true;
        }

        @Override // Lf.Dsr.j
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Dsr n(Uri uri, FjR.C c2, eQ.fuX fux) {
            if (!t(uri)) {
                return null;
            }
            return new C(uri.toString(), c2, this.f6160n, this.rl, this.f6161t);
        }
    }

    private final Request KN() {
        Request.Builder builderHeaders = new Request.Builder().url(this.f6153n).headers(this.rl.mUb());
        for (Map.Entry entry : this.rl.ck().n().entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkNotNull(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            builderHeaders.tag((Class) key, entry.getValue());
        }
        boolean zRl = this.rl.xMQ().rl();
        boolean zRl2 = this.rl.gh().rl();
        if (!zRl2 && zRl) {
            builderHeaders.cacheControl(CacheControl.FORCE_CACHE);
        } else if (!zRl2 || zRl) {
            if (!zRl2 && !zRl) {
                builderHeaders.cacheControl(KN);
            }
        } else if (this.rl.xMQ().t()) {
            builderHeaders.cacheControl(CacheControl.FORCE_NETWORK);
        } else {
            builderHeaders.cacheControl(Uo);
        }
        return builderHeaders.build();
    }

    private final FileSystem O() {
        Object value = this.nr.getValue();
        Intrinsics.checkNotNull(value);
        return ((r1.j) value).t();
    }

    private final boolean Uo(Request request, Response response) {
        if (this.rl.xMQ().t()) {
            return !this.f6152O || Lvl.Ml.f6235t.t(request, response);
        }
        return false;
    }

    private final String nr() {
        String strKN = this.rl.KN();
        return strKN == null ? this.f6153n : strKN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(Request request, Continuation continuation) throws IOException {
        w6 w6Var;
        Response responseExecute;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f6162O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f6162O = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objN = w6Var.f6163n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f6162O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            if (kYF.C.Ik()) {
                if (this.rl.gh().rl()) {
                    throw new NetworkOnMainThreadException();
                }
                responseExecute = FirebasePerfOkHttpClient.execute(((Call.Factory) this.f6154t.getValue()).newCall(request));
                if (!responseExecute.isSuccessful() || responseExecute.code() == 304) {
                    return responseExecute;
                }
                ResponseBody responseBodyBody = responseExecute.body();
                if (responseBodyBody != null) {
                    kYF.C.nr(responseBodyBody);
                }
                throw new HttpException(responseExecute);
            }
            Call callNewCall = ((Call.Factory) this.f6154t.getValue()).newCall(request);
            w6Var.f6162O = 1;
            objN = kYF.n.n(callNewCall, w6Var);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objN);
        }
        responseExecute = (Response) objN;
        if (responseExecute.isSuccessful()) {
        }
        return responseExecute;
    }

    private final j.w6 xMQ() {
        r1.j jVar;
        if (!this.rl.xMQ().rl() || (jVar = (r1.j) this.nr.getValue()) == null) {
            return null;
        }
        return jVar.rl(nr());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012d A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:72:0x018d, B:54:0x011f, B:56:0x012d, B:58:0x013b, B:61:0x0144, B:63:0x014e, B:65:0x015a, B:67:0x0172), top: B:81:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:72:0x018d, B:54:0x011f, B:56:0x012d, B:58:0x013b, B:61:0x0144, B:63:0x014e, B:65:0x015a, B:67:0x0172), top: B:81:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Lf.Dsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) throws Exception {
        Ml ml;
        j.w6 w6Var;
        Exception e2;
        Lvl.Ml mlRl;
        j.w6 w6VarTy;
        Lvl.Ml ml2;
        C c2;
        Response response;
        Response response2;
        Exception e3;
        C c4;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f6157o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f6157o = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object obj = ml.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f6157o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            j.w6 w6VarXMQ = xMQ();
            try {
                if (w6VarXMQ != null) {
                    Long size = O().metadata(w6VarXMQ.getMetadata()).getSize();
                    if (size != null && size.longValue() == 0) {
                        return new qz(az(w6VarXMQ), J2(this.f6153n, null), Be4.CN3.f516O);
                    }
                    if (!this.f6152O) {
                        psW pswAz = az(w6VarXMQ);
                        String str = this.f6153n;
                        Lvl.w6 w6VarMUb = mUb(w6VarXMQ);
                        return new qz(pswAz, J2(str, w6VarMUb != null ? w6VarMUb.J2() : null), Be4.CN3.f516O);
                    }
                    mlRl = new Ml.n(KN(), mUb(w6VarXMQ)).rl();
                    if (mlRl.rl() == null && mlRl.n() != null) {
                        return new qz(az(w6VarXMQ), J2(this.f6153n, mlRl.n().J2()), Be4.CN3.f516O);
                    }
                } else {
                    mlRl = new Ml.n(KN(), null).rl();
                }
                Request requestRl = mlRl.rl();
                Intrinsics.checkNotNull(requestRl);
                ml.f6156n = this;
                ml.f6159t = w6VarXMQ;
                ml.f6155O = mlRl;
                ml.f6157o = 1;
                Object objT = t(requestRl, ml);
                if (objT != coroutine_suspended) {
                    Lvl.Ml ml3 = mlRl;
                    w6VarTy = w6VarXMQ;
                    obj = objT;
                    ml2 = ml3;
                    c2 = this;
                    response = (Response) obj;
                    ResponseBody responseBodyAYN = kYF.C.aYN(response);
                    w6VarTy = c2.ty(w6VarTy, ml2.rl(), response, ml2.n());
                    if (w6VarTy == null) {
                    }
                }
                return coroutine_suspended;
            } catch (Exception e4) {
                w6Var = w6VarXMQ;
                e2 = e4;
                if (w6Var != null) {
                }
                throw e2;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            response2 = (Response) ml.f6155O;
            w6VarTy = (j.w6) ml.f6159t;
            c4 = (C) ml.f6156n;
            try {
                ResultKt.throwOnFailure(obj);
                Response response3 = (Response) obj;
                ResponseBody responseBodyAYN2 = kYF.C.aYN(response3);
                return new qz(c4.qie(responseBodyAYN2), c4.J2(c4.f6153n, responseBodyAYN2.getContentType()), c4.gh(response3));
            } catch (Exception e5) {
                e3 = e5;
                kYF.C.nr(response2);
                throw e3;
            }
        }
        Lvl.Ml ml4 = (Lvl.Ml) ml.f6155O;
        w6Var = (j.w6) ml.f6159t;
        c2 = (C) ml.f6156n;
        try {
            ResultKt.throwOnFailure(obj);
            ml2 = ml4;
            w6VarTy = w6Var;
            try {
                response = (Response) obj;
                ResponseBody responseBodyAYN3 = kYF.C.aYN(response);
                try {
                    w6VarTy = c2.ty(w6VarTy, ml2.rl(), response, ml2.n());
                    if (w6VarTy == null) {
                        psW pswAz2 = c2.az(w6VarTy);
                        String str2 = c2.f6153n;
                        Lvl.w6 w6VarMUb2 = c2.mUb(w6VarTy);
                        return new qz(pswAz2, c2.J2(str2, w6VarMUb2 != null ? w6VarMUb2.J2() : null), Be4.CN3.J2);
                    }
                    if (responseBodyAYN3.getDelegateSource().request(1L)) {
                        return new qz(c2.qie(responseBodyAYN3), c2.J2(c2.f6153n, responseBodyAYN3.getContentType()), c2.gh(response));
                    }
                    kYF.C.nr(response);
                    Request requestKN = c2.KN();
                    ml.f6156n = c2;
                    ml.f6159t = w6VarTy;
                    ml.f6155O = response;
                    ml.f6157o = 2;
                    Object objT2 = c2.t(requestKN, ml);
                    if (objT2 != coroutine_suspended) {
                        response2 = response;
                        obj = objT2;
                        c4 = c2;
                        Response response32 = (Response) obj;
                        ResponseBody responseBodyAYN22 = kYF.C.aYN(response32);
                        return new qz(c4.qie(responseBodyAYN22), c4.J2(c4.f6153n, responseBodyAYN22.getContentType()), c4.gh(response32));
                    }
                    return coroutine_suspended;
                } catch (Exception e6) {
                    response2 = response;
                    e3 = e6;
                    kYF.C.nr(response2);
                    throw e3;
                }
            } catch (Exception e7) {
                e2 = e7;
                w6Var = w6VarTy;
                if (w6Var != null) {
                    kYF.C.nr(w6Var);
                }
                throw e2;
            }
        } catch (Exception e8) {
            e2 = e8;
            if (w6Var != null) {
            }
            throw e2;
        }
    }

    public C(String str, FjR.C c2, Lazy lazy, Lazy lazy2, boolean z2) {
        this.f6153n = str;
        this.rl = c2;
        this.f6154t = lazy;
        this.nr = lazy2;
        this.f6152O = z2;
    }

    private final psW az(j.w6 w6Var) {
        return P.Uo(w6Var.getData(), O(), nr(), w6Var);
    }

    private final Be4.CN3 gh(Response response) {
        if (response.networkResponse() != null) {
            return Be4.CN3.J2;
        }
        return Be4.CN3.f516O;
    }

    private final psW qie(ResponseBody responseBody) {
        return P.O(responseBody.getDelegateSource(), this.rl.Uo());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc A[Catch: all -> 0x007f, Exception -> 0x0082, TRY_LEAVE, TryCatch #9 {Exception -> 0x0082, blocks: (B:15:0x002b, B:18:0x0036, B:70:0x00f0, B:38:0x0089, B:31:0x007b, B:39:0x008a, B:55:0x00bc, B:73:0x00f8, B:68:0x00eb, B:74:0x00f9, B:52:0x00b6), top: B:97:0x002b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9 A[Catch: all -> 0x007f, Exception -> 0x0082, TRY_LEAVE, TryCatch #9 {Exception -> 0x0082, blocks: (B:15:0x002b, B:18:0x0036, B:70:0x00f0, B:38:0x0089, B:31:0x007b, B:39:0x008a, B:55:0x00bc, B:73:0x00f8, B:68:0x00eb, B:74:0x00f9, B:52:0x00b6), top: B:97:0x002b, outer: #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final j.w6 ty(j.w6 w6Var, Request request, Response response, Lvl.w6 w6Var2) {
        j.n nVarN;
        Throwable th;
        Throwable th2 = null;
        if (!Uo(request, response)) {
            if (w6Var != null) {
                kYF.C.nr(w6Var);
            }
            return null;
        }
        if (w6Var != null) {
            nVarN = w6Var.ofS();
        } else {
            r1.j jVar = (r1.j) this.nr.getValue();
            if (jVar != null) {
                nVarN = jVar.n(nr());
            } else {
                nVarN = null;
            }
        }
        try {
            if (nVarN == null) {
                return null;
            }
            try {
                if (response.code() == 304 && w6Var2 != null) {
                    Response responseBuild = response.newBuilder().headers(Lvl.Ml.f6235t.n(w6Var2.KN(), response.headers())).build();
                    BufferedSink bufferedSinkBuffer = Okio.buffer(O().sink(nVarN.getMetadata(), false));
                    try {
                        new Lvl.w6(responseBuild).gh(bufferedSinkBuffer);
                        Unit unit = Unit.INSTANCE;
                        if (bufferedSinkBuffer != null) {
                            try {
                                bufferedSinkBuffer.close();
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (bufferedSinkBuffer != null) {
                            try {
                                bufferedSinkBuffer.close();
                            } catch (Throwable th5) {
                                ExceptionsKt.addSuppressed(th2, th5);
                            }
                        }
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                } else {
                    BufferedSink bufferedSinkBuffer2 = Okio.buffer(O().sink(nVarN.getMetadata(), false));
                    try {
                        new Lvl.w6(response).gh(bufferedSinkBuffer2);
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th6) {
                        if (bufferedSinkBuffer2 != null) {
                            try {
                                bufferedSinkBuffer2.close();
                            } catch (Throwable th7) {
                                ExceptionsKt.addSuppressed(th6, th7);
                            }
                        }
                        th = th6;
                    }
                    if (bufferedSinkBuffer2 != null) {
                        try {
                            bufferedSinkBuffer2.close();
                            th = null;
                        } catch (Throwable th8) {
                            th = th8;
                        }
                        if (th != null) {
                            BufferedSink bufferedSinkBuffer3 = Okio.buffer(O().sink(nVarN.getData(), false));
                            try {
                                ResponseBody responseBodyBody = response.body();
                                Intrinsics.checkNotNull(responseBodyBody);
                                responseBodyBody.getDelegateSource().readAll(bufferedSinkBuffer3);
                                if (bufferedSinkBuffer3 != null) {
                                    try {
                                        bufferedSinkBuffer3.close();
                                    } catch (Throwable th9) {
                                        th2 = th9;
                                    }
                                }
                            } catch (Throwable th10) {
                                th2 = th10;
                                if (bufferedSinkBuffer3 != null) {
                                    try {
                                        bufferedSinkBuffer3.close();
                                    } catch (Throwable th11) {
                                        ExceptionsKt.addSuppressed(th2, th11);
                                    }
                                }
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        } else {
                            throw th;
                        }
                    } else {
                        th = null;
                        if (th != null) {
                        }
                    }
                }
                j.w6 w6VarN = nVarN.n();
                kYF.C.nr(response);
                return w6VarN;
            } catch (Exception e2) {
                kYF.C.n(nVarN);
                throw e2;
            }
        } catch (Throwable th12) {
            kYF.C.nr(response);
            throw th12;
        }
    }
}
