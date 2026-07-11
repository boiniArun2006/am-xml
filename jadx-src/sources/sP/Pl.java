package sP;

import GJW.OU;
import GJW.lej;
import GJW.vd;
import KW9.n;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import d8q.j;
import defpackage.VersioningFile;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.zip.ZipInputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import sP.Pl;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class Pl implements sP.j {
    private final rB.Ml J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final fuX f73221O;
    private String Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f73222n;
    private final OkHttpClient nr;
    private final Function1 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final sP.w6 f73223t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f73225n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73226t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f73226t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Pl.this.n(this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f73228n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73229t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f73229t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Pl.this.Z(this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f73230O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f73231n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f73232t;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ byte[] J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ String f73233O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f73234n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Pl f73235t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Pl pl, String str, byte[] bArr, Continuation continuation) {
                super(2, continuation);
                this.f73235t = pl;
                this.f73233O = str;
                this.J2 = bArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f73235t, this.f73233O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f73234n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    sP.w6 w6Var = this.f73235t.f73223t;
                    String str = this.f73233O;
                    ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(this.J2));
                    this.f73234n = 1;
                    if (w6Var.mUb(str, zipInputStream, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        static final class n extends SuspendLambda implements Function2 {
            final /* synthetic */ Pl J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f73236O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f73237n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f73238t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(Pl pl, Continuation continuation) {
                super(2, continuation);
                this.J2 = pl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new n(this.J2, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
            
                if (r7 == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Request.Builder builder;
                OkHttpClient okHttpClient;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f73236O;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            x0X.n nVarViF = (x0X.n) obj;
                            if (nVarViF instanceof n.C1266n) {
                                nVarViF = new n.C1266n(new j.n((IOException) ((n.C1266n) nVarViF).n()));
                            } else if (!(nVarViF instanceof n.w6)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Pl pl = this.J2;
                            if (!(nVarViF instanceof n.C1266n)) {
                                if (nVarViF instanceof n.w6) {
                                    nVarViF = pl.ViF((Response) ((n.w6) nVarViF).n());
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            if (nVarViF instanceof n.C1266n) {
                                return nVarViF;
                            }
                            if (nVarViF instanceof n.w6) {
                                return VersioningFile.INSTANCE.t((String) ((n.w6) nVarViF).n());
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    builder = (Request.Builder) this.f73238t;
                    okHttpClient = (OkHttpClient) this.f73237n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    OkHttpClient okHttpClient2 = this.J2.nr;
                    builder = new Request.Builder();
                    Function1 function1 = this.J2.rl;
                    this.f73237n = okHttpClient2;
                    this.f73238t = builder;
                    this.f73236O = 1;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke != coroutine_suspended) {
                        okHttpClient = okHttpClient2;
                        obj = objInvoke;
                    }
                    return coroutine_suspended;
                }
                Call callNewCall = okHttpClient.newCall(builder.url((String) obj).build());
                this.f73237n = null;
                this.f73238t = null;
                this.f73236O = 2;
                obj = Ht.j.n(callNewCall, this);
            }
        }

        /* JADX INFO: renamed from: sP.Pl$w6$w6, reason: collision with other inner class name */
        static final class C1168w6 extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ URL f73239O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f73240n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Pl f73241t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1168w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1168w6(Pl pl, URL url, Continuation continuation) {
                super(2, continuation);
                this.f73241t = pl;
                this.f73239O = url;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1168w6(this.f73241t, this.f73239O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f73240n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Call callNewCall = this.f73241t.nr.newCall(new Request.Builder().url(this.f73239O).build());
                    this.f73240n = 1;
                    obj = Ht.j.n(callNewCall, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Object c1266n = (x0X.n) obj;
                if (c1266n instanceof n.C1266n) {
                    c1266n = new n.C1266n(new j.n((IOException) ((n.C1266n) c1266n).n()));
                } else if (!(c1266n instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Pl pl = this.f73241t;
                if (c1266n instanceof n.C1266n) {
                    return c1266n;
                }
                if (c1266n instanceof n.w6) {
                    return pl.S((Response) ((n.w6) c1266n).n());
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        w6(Continuation continuation) {
            super(1, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String gh() {
            return "Cleaning Up existing assets [If Any].";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String mUb() {
            return "File is cached";
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return Pl.this.new w6(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0160 A[PHI: r1 r3 r12
          0x0160: PHI (r1v18 java.lang.String) = (r1v15 java.lang.String), (r1v21 java.lang.String) binds: [B:38:0x015d, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0160: PHI (r3v16 java.net.URL) = (r3v13 java.net.URL), (r3v18 java.net.URL) binds: [B:38:0x015d, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0160: PHI (r12v36 java.lang.Object) = (r12v35 java.lang.Object), (r12v0 java.lang.Object) binds: [B:38:0x015d, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0169  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0X.n nVar;
            URL urlComponent1;
            Object objXMQ;
            String str;
            URL url;
            x0X.n nVar2;
            String str2;
            URL url2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f73230O) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    lej lejVarRl = OU.rl();
                    n nVar3 = new n(Pl.this, null);
                    this.f73230O = 1;
                    obj = GJW.Dsr.Uo(lejVarRl, nVar3, this);
                    if (obj != coroutine_suspended) {
                        nVar = (x0X.n) obj;
                        if (!(nVar instanceof n.C1266n)) {
                            return (n.C1266n) nVar;
                        }
                        if (nVar instanceof n.w6) {
                            urlComponent1 = ((VersioningFile) ((n.w6) nVar).n()).getWebAppUrlAndSignature(Pl.this.f73222n).component1();
                            KW9.Wre wreJ2 = KW9.Wre.rl.J2();
                            if (wreJ2 != null) {
                                String string = urlComponent1.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                this.f73231n = urlComponent1;
                                this.f73230O = 2;
                                if (wreJ2.HI(string, this) != coroutine_suspended) {
                                }
                            }
                            KW9.w6.rl(Pl.this.J2, new n.w6.j.C0185j(urlComponent1));
                            String path = urlComponent1.getPath();
                            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                            String str3 = (String) CollectionsKt.last(StringsKt.split$default((CharSequence) StringsKt.removeSuffix(path, (CharSequence) "/archive.zip"), new String[]{"/"}, false, 0, 6, (Object) null));
                            sP.w6 w6Var = Pl.this.f73223t;
                            this.f73231n = urlComponent1;
                            this.f73232t = str3;
                            this.f73230O = 3;
                            objXMQ = w6Var.xMQ(str3, this);
                            if (objXMQ != coroutine_suspended) {
                                URL url3 = urlComponent1;
                                str = str3;
                                obj = objXMQ;
                                url = url3;
                                if (!((Boolean) obj).booleanValue()) {
                                    KW9.j.f5464n.n("RemoteAssetProvider", new Function0() { // from class: sP.Xo
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Pl.w6.mUb();
                                        }
                                    });
                                    KW9.w6.rl(Pl.this.J2, new n.w6.j.C0187w6(str));
                                    return new n.w6(Pl.this.r(str));
                                }
                                KW9.j.f5464n.n("LocalAssetProvider", new Function0() { // from class: sP.eO
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Pl.w6.gh();
                                    }
                                });
                                sP.w6 w6Var2 = Pl.this.f73223t;
                                this.f73231n = url;
                                this.f73232t = str;
                                this.f73230O = 4;
                                if (w6Var2.nr(this) != coroutine_suspended) {
                                    lej lejVarRl2 = OU.rl();
                                    C1168w6 c1168w6 = new C1168w6(Pl.this, url, null);
                                    this.f73231n = url;
                                    this.f73232t = str;
                                    this.f73230O = 5;
                                    obj = GJW.Dsr.Uo(lejVarRl2, c1168w6, this);
                                    if (obj != coroutine_suspended) {
                                        nVar2 = (x0X.n) obj;
                                        if (!(nVar2 instanceof n.C1266n)) {
                                            return (n.C1266n) nVar2;
                                        }
                                        if (nVar2 instanceof n.w6) {
                                            byte[] bArr = (byte[]) ((n.w6) nVar2).n();
                                            lej lejVarRl3 = OU.rl();
                                            j jVar = new j(Pl.this, str, bArr, null);
                                            this.f73231n = url;
                                            this.f73232t = str;
                                            this.f73230O = 6;
                                            if (GJW.Dsr.Uo(lejVarRl3, jVar, this) != coroutine_suspended) {
                                                str2 = str;
                                                url2 = url;
                                                KW9.w6.rl(Pl.this.J2, new n.w6.j.Wre(url2));
                                                KW9.w6.rl(Pl.this.J2, new n.w6.j.Ml(str2));
                                                return new n.w6(Pl.this.r(str2));
                                            }
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    nVar = (x0X.n) obj;
                    if (!(nVar instanceof n.C1266n)) {
                    }
                    break;
                case 2:
                    urlComponent1 = (URL) this.f73231n;
                    ResultKt.throwOnFailure(obj);
                    KW9.w6.rl(Pl.this.J2, new n.w6.j.C0185j(urlComponent1));
                    String path2 = urlComponent1.getPath();
                    Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
                    String str32 = (String) CollectionsKt.last(StringsKt.split$default((CharSequence) StringsKt.removeSuffix(path2, (CharSequence) "/archive.zip"), new String[]{"/"}, false, 0, 6, (Object) null));
                    sP.w6 w6Var3 = Pl.this.f73223t;
                    this.f73231n = urlComponent1;
                    this.f73232t = str32;
                    this.f73230O = 3;
                    objXMQ = w6Var3.xMQ(str32, this);
                    if (objXMQ != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    str = (String) this.f73232t;
                    url = (URL) this.f73231n;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    break;
                case 4:
                    str = (String) this.f73232t;
                    url = (URL) this.f73231n;
                    ResultKt.throwOnFailure(obj);
                    lej lejVarRl22 = OU.rl();
                    C1168w6 c1168w62 = new C1168w6(Pl.this, url, null);
                    this.f73231n = url;
                    this.f73232t = str;
                    this.f73230O = 5;
                    obj = GJW.Dsr.Uo(lejVarRl22, c1168w62, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 5:
                    str = (String) this.f73232t;
                    url = (URL) this.f73231n;
                    ResultKt.throwOnFailure(obj);
                    nVar2 = (x0X.n) obj;
                    if (!(nVar2 instanceof n.C1266n)) {
                    }
                    break;
                case 6:
                    str2 = (String) this.f73232t;
                    url2 = (URL) this.f73231n;
                    ResultKt.throwOnFailure(obj);
                    KW9.w6.rl(Pl.this.J2, new n.w6.j.Wre(url2));
                    KW9.w6.rl(Pl.this.J2, new n.w6.j.Ml(str2));
                    return new n.w6(Pl.this.r(str2));
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public Pl(int i2, Function1 getAssetUrl, sP.w6 fileManager, OkHttpClient okHttpClient, fuX local, rB.Ml spiderSense) {
        Intrinsics.checkNotNullParameter(getAssetUrl, "getAssetUrl");
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        this.f73222n = i2;
        this.rl = getAssetUrl;
        this.f73223t = fileManager;
        this.nr = okHttpClient;
        this.f73221O = local;
        this.J2 = spiderSense;
        this.Uo = "";
    }

    private final d8q.j Ik(Throwable th) {
        return ((th instanceof SocketTimeoutException) || (th instanceof IOException)) ? new j.n(th) : new j.w6(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0X.n S(Response response) {
        x0X.n nVarRl = x0X.n.f75185n.rl(response.body(), new Function0() { // from class: sP.aC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.WPU();
            }
        });
        if (!(nVarRl instanceof n.C1266n)) {
            if (!(nVarRl instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            final ResponseBody responseBody = (ResponseBody) ((n.w6) nVarRl).n();
            nVarRl = x0X.w6.n(new Function0() { // from class: sP.C
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Pl.aYN(responseBody);
                }
            });
        }
        if (nVarRl instanceof n.C1266n) {
            return new n.C1266n(Ik((Throwable) ((n.C1266n) nVarRl).n()));
        }
        if (nVarRl instanceof n.w6) {
            return nVarRl;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0X.n ViF(Response response) {
        x0X.n nVarRl = x0X.n.f75185n.rl(response.body(), new Function0() { // from class: sP.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.g();
            }
        });
        if (!(nVarRl instanceof n.C1266n)) {
            if (!(nVarRl instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            final ResponseBody responseBody = (ResponseBody) ((n.w6) nVarRl).n();
            nVarRl = x0X.w6.n(new Function0() { // from class: sP.qz
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Pl.nY(responseBody);
                }
            });
        }
        if (nVarRl instanceof n.C1266n) {
            return new n.C1266n(Ik((Throwable) ((n.C1266n) nVarRl).n()));
        }
        if (nVarRl instanceof n.w6) {
            return nVarRl;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String WPU() {
        return "Empty Response";
    }

    private final Object XQ(Continuation continuation) {
        return K6D.Wre.t(this.J2, n.C0184n.nr.rl(), null, null, new w6(null), continuation, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z(Continuation continuation) {
        n nVar;
        Pl pl;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objN = nVar.f73229t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            fuX fux = this.f73221O;
            nVar.f73228n = this;
            nVar.J2 = 1;
            objN = fux.n(nVar);
            if (objN != coroutine_suspended) {
                pl = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException(KfLR.hYcuO);
            }
            ResultKt.throwOnFailure(objN);
            return new n.w6((String) objN);
        }
        pl = (Pl) nVar.f73228n;
        ResultKt.throwOnFailure(objN);
        x0X.n nVar2 = (x0X.n) objN;
        if (nVar2 instanceof n.C1266n) {
            return nVar2;
        }
        if (!(nVar2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        KW9.w6.rl(pl.J2, n.w6.j.I28.J2);
        fuX fux2 = pl.f73221O;
        nVar.f73228n = null;
        nVar.J2 = 2;
        objN = fux2.rl(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g() {
        return "Empty Response";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(d8q.j jVar) {
        return "Injet Remote failed: " + jVar + ". Falling back to local.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String r(String str) {
        return "https://appassets.androidplatform.net/injet/" + str + "/index.html";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sP.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        j jVar;
        Pl pl;
        Pl pl3;
        x0X.n nVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objZ = jVar.f73226t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        boolean z2 = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objZ);
            KW9.Wre wreJ2 = KW9.Wre.rl.J2();
            if (wreJ2 != null) {
                jVar.f73225n = this;
                jVar.J2 = 1;
                objZ = wreJ2.Z(jVar);
                if (objZ != coroutine_suspended) {
                    pl = this;
                }
                return coroutine_suspended;
            }
            pl = this;
            if (z2) {
                jVar.f73225n = pl;
                jVar.J2 = 3;
                objZ = pl.XQ(jVar);
                if (objZ != coroutine_suspended) {
                    nVar = (x0X.n) objZ;
                    if (!(nVar instanceof n.C1266n)) {
                    }
                }
            } else {
                jVar.f73225n = pl;
                jVar.J2 = 2;
                objZ = pl.Z(jVar);
                if (objZ != coroutine_suspended) {
                    pl3 = pl;
                    nVar = (x0X.n) objZ;
                    if (nVar instanceof n.C1266n) {
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            pl = (Pl) jVar.f73225n;
            ResultKt.throwOnFailure(objZ);
        } else if (i3 == 2) {
            pl3 = (Pl) jVar.f73225n;
            ResultKt.throwOnFailure(objZ);
            nVar = (x0X.n) objZ;
            if (nVar instanceof n.C1266n) {
            }
        } else {
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pl3 = (Pl) jVar.f73225n;
                ResultKt.throwOnFailure(objZ);
                nVar = (x0X.n) objZ;
                if (nVar instanceof n.C1266n) {
                    return nVar;
                }
                if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                pl3.Uo = (String) ((n.w6) nVar).n();
                return new n.w6(Unit.INSTANCE);
            }
            pl = (Pl) jVar.f73225n;
            ResultKt.throwOnFailure(objZ);
            nVar = (x0X.n) objZ;
            if (!(nVar instanceof n.C1266n)) {
                final d8q.j jVar2 = (d8q.j) ((n.C1266n) nVar).n();
                KW9.w6.rl(pl.J2, new n.w6.j.C0186n(jVar2));
                KW9.j.f5464n.n("RemoteAssetProvider", new Function0() { // from class: sP.Dsr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Pl.o(jVar2);
                    }
                });
                jVar.f73225n = pl;
                jVar.J2 = 4;
                objZ = pl.Z(jVar);
                if (objZ != coroutine_suspended) {
                    pl3 = pl;
                    nVar = (x0X.n) objZ;
                    if (nVar instanceof n.C1266n) {
                    }
                }
                return coroutine_suspended;
            }
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            pl3 = pl;
            if (nVar instanceof n.C1266n) {
            }
        }
        if (((Boolean) objZ).booleanValue()) {
            z2 = true;
        }
        if (z2) {
        }
        return coroutine_suspended;
    }

    @Override // sP.j
    public Object rl(Continuation continuation) {
        return this.Uo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] aYN(ResponseBody responseBody) {
        return responseBody.bytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nY(ResponseBody responseBody) {
        return responseBody.string();
    }
}
