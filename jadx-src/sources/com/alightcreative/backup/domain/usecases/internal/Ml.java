package com.alightcreative.backup.domain.usecases.internal;

import GJW.OU;
import GJW.lej;
import GJW.vd;
import HI0.Lu;
import HI0.Q;
import HI0.afx;
import HI0.gnv;
import LM.iwV;
import QmE.iF;
import QmE.j;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Trmy.yioUaKMByL;
import android.net.Uri;
import com.alightcreative.app.motion.activities.R6;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.alightcreative.backup.domain.usecases.internal.Ml;
import com.alightcreative.backup.domain.usecases.internal.aC;
import com.alightcreative.export.projectpackage.ProjectPackageIDRequest;
import com.alightcreative.export.projectpackage.ProjectPackageIDResponse;
import com.alightcreative.export.projectpackage.SharedProjectInfo;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Timestamp;
import com.google.firebase.storage.qf;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import gIX.h;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Ml implements wtO.j {
    private final wtO.I28 J2;
    private final iF KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final wtO.fuX f46467O;
    private final wtO.w6 Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final kgE.fuX f46468n;
    private final wtO.Wre nr;
    private final wtO.Dsr rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final wtO.n f46469t;
    private String xMQ;
    public static final j mUb = new j(null);
    public static final int gh = 8;

    static final class C extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f46470O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f46471n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f46472o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46474t;

        C(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f46472o |= Integer.MIN_VALUE;
            return Ml.this.n(null, null, null, false, null, null, null, this);
        }
    }

    public static final class Dsr implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ mCM.QJ f46478n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f46479t;

        /* JADX INFO: renamed from: com.alightcreative.backup.domain.usecases.internal.Ml$Dsr$Ml, reason: collision with other inner class name */
        public static final class C0653Ml implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f46480n;

            public C0653Ml(String str) {
                this.f46480n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "WrappedHttpsCallable: " + this.f46480n + " OUT";
            }
        }

        public static final class j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f46481n;

            public j(String str) {
                this.f46481n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "WrappedHttpsCallable: " + this.f46481n + " IN";
            }
        }

        public static final class n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f46482n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f46483t;

            public n(String str, String str2) {
                this.f46482n = str;
                this.f46483t = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "typedCall:" + this.f46482n + ": IN / " + this.f46483t;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public static final class w6 implements com.google.android.gms.tasks.Continuation {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ mCM.QJ f46484n;
            final /* synthetic */ String nr;
            final /* synthetic */ JsonAdapter rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function1 f46485t;

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class CN3 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46486n;

                public CN3(String str) {
                    this.f46486n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f46486n + ": FAIL";
                }
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class I28 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46487n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Throwable f46488t;

                public I28(String str, Throwable th) {
                    this.f46487n = str;
                    this.f46488t = th;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f46487n + ": Parse error! " + this.f46488t;
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.backup.domain.usecases.internal.Ml$Dsr$w6$Ml, reason: collision with other inner class name */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class C0654Ml implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ String f46489O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46490n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f46491t;

                public C0654Ml(String str, int i2, String str2) {
                    this.f46490n = str;
                    this.f46491t = i2;
                    this.f46489O = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f46490n + ": RESPONSE: " + StringsKt.padStart$default(String.valueOf(this.f46491t), 4, (char) 0, 2, (Object) null) + ": " + this.f46489O;
                }
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class Wre implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46492n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f46493t;

                public Wre(String str, Object obj) {
                    this.f46492n = str;
                    this.f46493t = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f46492n + ": RESULT: " + this.f46493t;
                }
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46494n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Task f46495t;

                public j(String str, Task task) {
                    this.f46494n = str;
                    this.f46495t = task;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String message;
                    String str = this.f46494n;
                    Task task = this.f46495t;
                    boolean zIsSuccessful = task.isSuccessful();
                    boolean zIsCanceled = this.f46495t.isCanceled();
                    boolean zIsComplete = this.f46495t.isComplete();
                    Exception exception = this.f46495t.getException();
                    if (exception == null || (message = exception.getMessage()) == null) {
                        message = "NONE";
                    }
                    return "typedCall:" + str + ": CONTINUE (" + task + ") isSuccessful=" + zIsSuccessful + " isCanceled=" + zIsCanceled + " isComplete=" + zIsComplete + " exception=" + message;
                }
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class n implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46496n;

                public n(String str) {
                    this.f46496n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f46496n + ": SUCCESS";
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.backup.domain.usecases.internal.Ml$Dsr$w6$w6, reason: collision with other inner class name */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class C0655w6 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46497n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f46498t;

                public C0655w6(String str, String str2) {
                    this.f46497n = str;
                    this.f46498t = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f46497n + ": RESPONSE: len=" + this.f46498t.length();
                }
            }

            public w6(mCM.QJ qj, JsonAdapter jsonAdapter, Function1 function1, String str) {
                this.f46484n = qj;
                this.rl = jsonAdapter;
                this.f46485t = function1;
                this.nr = str;
            }

            public final void n(Task task) {
                Intrinsics.checkNotNullParameter(task, yioUaKMByL.INbMIAdSBQGDlmS);
                XoT.C.Uo(this.f46484n, new j(this.nr, task));
                if (task.isSuccessful()) {
                    mCM.l3D l3d = (mCM.l3D) task.getResult();
                    if (l3d == null) {
                        Function1 function1 = this.f46485t;
                        Result.Companion companion = Result.INSTANCE;
                        function1.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")))));
                        return;
                    }
                    XoT.C.Uo(this.f46484n, new n(this.nr));
                    Moshi moshiN = Lu.n();
                    Object obj = l3d.f70669n;
                    JsonAdapter jsonAdapterAdapter = moshiN.adapter(Object.class);
                    Intrinsics.checkNotNull(jsonAdapterAdapter);
                    JsonAdapter jsonAdapterIndent = jsonAdapterAdapter.indent("    ");
                    Intrinsics.checkNotNull(jsonAdapterIndent);
                    String json = jsonAdapterIndent.toJson(obj);
                    Intrinsics.checkNotNull(json);
                    XoT.C.Uo(this.f46484n, new C0655w6(this.nr, json));
                    Sequence<String> sequenceLineSequence = StringsKt.lineSequence(json);
                    mCM.QJ qj = this.f46484n;
                    String str = this.nr;
                    int i2 = 0;
                    for (String str2 : sequenceLineSequence) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        XoT.C.Uo(qj, new C0654Ml(str, i2, str2));
                        i2 = i3;
                    }
                    try {
                        Object objFromJson = this.rl.fromJson(json);
                        XoT.C.Uo(this.f46484n, new Wre(this.nr, objFromJson));
                        if (objFromJson != null) {
                            this.f46485t.invoke(Result.m312boximpl(Result.m313constructorimpl(objFromJson)));
                            return;
                        }
                    } catch (Throwable th) {
                        XoT.C.Uo(this.f46484n, new I28(this.nr, th));
                        Function1 function12 = this.f46485t;
                        Result.Companion companion2 = Result.INSTANCE;
                        function12.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(th))));
                        return;
                    }
                }
                XoT.C.Uo(this.f46484n, new CN3(this.nr));
                Exception exception = task.getException();
                if (exception != null) {
                    Function1 function13 = this.f46485t;
                    Result.Companion companion3 = Result.INSTANCE;
                    function13.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(exception))));
                } else {
                    Function1 function14 = this.f46485t;
                    Result.Companion companion4 = Result.INSTANCE;
                    function14.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")))));
                }
            }

            @Override // com.google.android.gms.tasks.Continuation
            public /* bridge */ /* synthetic */ Object then(Task task) {
                n(task);
                return Unit.INSTANCE;
            }
        }

        public Dsr(mCM.QJ qj, String str) {
            this.f46478n = qj;
            this.f46479t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n(obj, (Function1) obj2);
            return Unit.INSTANCE;
        }

        public final void n(Object obj, Function1 cb2) {
            Intrinsics.checkNotNullParameter(cb2, "cb");
            XoT.C.KN("WrappedHttpsCallable", new j(this.f46479t));
            mCM.QJ qj = this.f46478n;
            String str = this.f46479t;
            JsonAdapter jsonAdapterAdapter = Lu.n().adapter(ProjectPackageIDRequest.class);
            Intrinsics.checkNotNull(jsonAdapterAdapter);
            String json = jsonAdapterAdapter.toJson(obj);
            Intrinsics.checkNotNull(json);
            XoT.C.Uo(qj, new n(str, json));
            qj.rl(new JSONObject(json)).continueWith(new w6(qj, Lu.n().adapter(ProjectPackageIDResponse.class), cb2, str));
            XoT.C.KN("WrappedHttpsCallable", new C0653Ml(this.f46479t));
        }
    }

    /* synthetic */ class I28 extends AdaptedFunctionReference implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f46499O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f46501t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(Context context, Function0 function0) {
            super(1, Intrinsics.Kotlin.class, "onFailure", "cancellableInvoke$onFailure$2(Lcom/alightcreative/backup/domain/usecases/internal/BuildAndUploadProjectToCloudUseCaseImpl;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;)Z", 8);
            this.f46501t = context;
            this.f46499O = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void n(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Ml.gh(Ml.this, this.f46501t, this.f46499O, p0);
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.backup.domain.usecases.internal.Ml$Ml, reason: collision with other inner class name */
    /* synthetic */ class C0656Ml extends AdaptedFunctionReference implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f46502O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f46504t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0656Ml(Context context, Function0 function0) {
            super(1, Intrinsics.Kotlin.class, "onFailure", "cancellableInvoke$onFailure$2(Lcom/alightcreative/backup/domain/usecases/internal/BuildAndUploadProjectToCloudUseCaseImpl;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;)Z", 8);
            this.f46504t = context;
            this.f46502O = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void n(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Ml.gh(Ml.this, this.f46504t, this.f46502O, p0);
        }
    }

    /* synthetic */ class Wre extends AdaptedFunctionReference implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f46505O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f46507t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(Context context, Function0 function0) {
            super(1, Intrinsics.Kotlin.class, "onFailure", "cancellableInvoke$onFailure$2(Lcom/alightcreative/backup/domain/usecases/internal/BuildAndUploadProjectToCloudUseCaseImpl;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;)Z", 8);
            this.f46507t = context;
            this.f46505O = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void n(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Ml.gh(Ml.this, this.f46507t, this.f46505O, p0);
        }
    }

    static final class aC extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f46509n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f46510t;

        aC(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f46510t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Ml.this.qie(0L, null, this);
        }
    }

    /* synthetic */ class fuX extends AdaptedFunctionReference implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f46511O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f46513t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(Context context, Function0 function0) {
            super(1, Intrinsics.Kotlin.class, "onFailure", "cancellableInvoke$onFailure$2(Lcom/alightcreative/backup/domain/usecases/internal/BuildAndUploadProjectToCloudUseCaseImpl;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;)Z", 8);
            this.f46513t = context;
            this.f46511O = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void n(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Ml.gh(Ml.this, this.f46513t, this.f46511O, p0);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {
        Object E2;
        Object J2;
        int M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        int f46514N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f46515O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Object f46516S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        boolean f46517T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        /* synthetic */ Object f46518U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        Object f46519X;
        long Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f46520Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46521e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f46522g;
        long jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f46523n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f46524o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46525r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46526t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f46527v;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f46518U = obj;
            this.M7 |= Integer.MIN_VALUE;
            return Ml.this.xMQ(null, null, null, false, null, null, null, null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ File J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Q f46528O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46529n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f46530r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ iwV f46531t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w6(this.f46531t, this.f46528O, this.J2, this.f46530r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(iwV iwv, Q q2, File file, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f46531t = iwv;
            this.f46528O = q2;
            this.J2 = file;
            this.f46530r = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(Function1 function1, int i2, int i3) {
            if (i3 > 0) {
                function1.invoke(Float.valueOf((i2 * 0.05f) / i3));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f46529n == 0) {
                ResultKt.throwOnFailure(obj);
                iwV iwv = this.f46531t;
                Q q2 = this.f46528O;
                File file = this.J2;
                final Function1 function1 = this.f46530r;
                return iwV.aYN(iwv, q2, file, null, new Function2() { // from class: com.alightcreative.backup.domain.usecases.internal.I28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Ml.w6.O(function1, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                    }
                }, 4, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0351, code lost:
    
        if (gIX.vd.n(r11, r5) == r6) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x060a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(Context context, String str, ProjectInfo.n nVar, boolean z2, SceneThumbnailMaker sceneThumbnailMaker, Function1 function1, Function0 function0, File file, Continuation continuation) throws PackageManager.NameNotFoundException {
        n nVar2;
        String str2;
        boolean z3;
        iwV iwv;
        Function0 function02;
        Function1 function12;
        File file2;
        Context context2;
        Ml ml;
        ProjectInfo.n nVar3;
        byte[] bArr;
        ProjectInfo.n nVar4;
        Context context3;
        Set set;
        int iIntValue;
        String str3;
        String str4;
        String str5;
        String str6;
        int iIntValue2;
        long length;
        long j2;
        String strT;
        Set set2;
        int i2;
        byte[] bArr2;
        File file3;
        Object objQie;
        long j3;
        String str7;
        Ml ml2;
        boolean z4;
        Context context4;
        int i3;
        String str8;
        long j4;
        ProjectInfo.n nVar5;
        Object next;
        Set set3;
        boolean z5;
        String str9;
        long j5;
        long j6;
        String str10;
        int i5;
        byte[] bArr3;
        Context context5;
        String str11;
        boolean z6;
        Object obj;
        com.google.firebase.storage.o oVarIk;
        String str12;
        String str13;
        Ml ml3;
        String str14;
        boolean z7;
        File file4;
        ProjectInfo.n nVar6;
        Context context6;
        long j7;
        com.google.firebase.storage.o oVar;
        int i7;
        Context context7;
        int i8;
        ProjectInfo.n nVar7;
        long j9;
        Object obj2;
        Ml ml4;
        boolean z9;
        String str15;
        Object objKN;
        n nVar8;
        Object obj3;
        int i9;
        boolean z10;
        Object obj4;
        Ml ml5;
        long j10;
        Object obj5;
        com.google.firebase.storage.o oVar2;
        String str16;
        long j11;
        Context context8;
        int i10;
        ProjectInfo.n nVar9;
        String str17;
        String str18;
        Object obj6;
        Set set4;
        long j12;
        String str19;
        long j13;
        Object obj7;
        com.google.firebase.storage.o oVar3;
        String str20;
        Context context9;
        Ml ml6;
        String str21;
        boolean z11;
        int i11;
        long j14;
        Object obj8;
        int i12;
        Set set5;
        int i13;
        com.google.firebase.storage.o oVar4;
        long j15;
        Throwable cause;
        Ml ml7;
        boolean z12;
        if (continuation instanceof n) {
            nVar2 = (n) continuation;
            int i14 = nVar2.M7;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar2.M7 = i14 - Integer.MIN_VALUE;
            } else {
                nVar2 = new n(continuation);
            }
        }
        Object objKN2 = nVar2.f46518U;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (nVar2.M7) {
            case 0:
                ResultKt.throwOnFailure(objKN2);
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    return Boxing.boxBoolean(gh(this, context, function0, new Exception("Missing parent directory")));
                }
                parentFile.mkdirs();
                iwV iwv2 = new iwV(context, CollectionsKt.listOf(nVar.getId()));
                lej lejVarRl = OU.rl();
                CN3 cn3 = new CN3(context, nVar, sceneThumbnailMaker, null);
                nVar2.f46523n = this;
                nVar2.f46526t = context;
                str2 = str;
                nVar2.f46515O = str2;
                nVar2.J2 = nVar;
                nVar2.f46525r = function1;
                nVar2.f46524o = function0;
                nVar2.f46520Z = file;
                nVar2.f46516S = iwv2;
                z3 = z2;
                nVar2.f46517T = z3;
                nVar2.M7 = 1;
                Object objUo = GJW.Dsr.Uo(lejVarRl, cn3, nVar2);
                if (objUo != coroutine_suspended) {
                    objKN2 = objUo;
                    iwv = iwv2;
                    function02 = function0;
                    function12 = function1;
                    file2 = file;
                    context2 = context;
                    ml = this;
                    nVar3 = nVar;
                    byte[] bArr4 = (byte[]) objKN2;
                    if (!com.alightcreative.app.motion.persist.j.INSTANCE.getSimulateUpload()) {
                        nVar2.f46523n = null;
                        nVar2.f46526t = null;
                        nVar2.f46515O = null;
                        nVar2.J2 = null;
                        nVar2.f46525r = null;
                        nVar2.f46524o = null;
                        nVar2.f46520Z = null;
                        nVar2.f46516S = null;
                        nVar2.M7 = 2;
                        break;
                    } else {
                        iwV iwv3 = iwv;
                        Q q2 = new Q(context2);
                        lej lejVarRl2 = OU.rl();
                        w6 w6Var = new w6(iwv3, q2, file2, function12, null);
                        nVar2.f46523n = ml;
                        nVar2.f46526t = context2;
                        nVar2.f46515O = str2;
                        nVar2.J2 = nVar3;
                        nVar2.f46525r = function12;
                        nVar2.f46524o = function02;
                        nVar2.f46520Z = file2;
                        nVar2.f46516S = bArr4;
                        nVar2.f46517T = z3;
                        ProjectInfo.n nVar10 = nVar3;
                        nVar2.M7 = 3;
                        Object objUo2 = GJW.Dsr.Uo(lejVarRl2, w6Var, nVar2);
                        if (objUo2 != coroutine_suspended) {
                            bArr = bArr4;
                            nVar4 = nVar10;
                            objKN2 = objUo2;
                            context3 = context2;
                            Pair pair = (Pair) objKN2;
                            set = (Set) pair.component1();
                            iIntValue = ((Number) pair.component2()).intValue();
                            str3 = "putBytes(...)";
                            str4 = "thumb-med.jpg";
                            str5 = "child(...)";
                            PackageInfo packageInfo = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0);
                            Pair pair2 = TuplesKt.to(packageInfo.versionName, Boxing.boxInt(packageInfo.versionCode));
                            str6 = (String) pair2.component1();
                            iIntValue2 = ((Number) pair2.component2()).intValue();
                            length = file2.length();
                            long length2 = ((long) bArr.length) + length;
                            if (z3) {
                                j2 = length2;
                                if (!ml.f46467O.n(XFr.j.J2(length))) {
                                    return Boxing.boxBoolean(mUb(ml, context3, function02, aC.j.f46538n));
                                }
                            } else {
                                j2 = length2;
                            }
                            strT = ml.rl.t(str2, nVar4.getId());
                            if (z3 || strT == null) {
                                boolean z13 = z3;
                                C0656Ml c0656Ml = ml.new C0656Ml(context3, function02);
                                nVar2.f46523n = ml;
                                nVar2.f46526t = context3;
                                nVar2.f46515O = str2;
                                nVar2.J2 = nVar4;
                                nVar2.f46525r = function12;
                                nVar2.f46524o = function02;
                                nVar2.f46520Z = file2;
                                nVar2.f46516S = bArr;
                                set2 = set;
                                nVar2.f46522g = set2;
                                nVar2.E2 = str6;
                                nVar2.f46521e = strT;
                                nVar2.f46517T = z13;
                                nVar2.f46514N = iIntValue;
                                nVar2.f46527v = iIntValue2;
                                i2 = iIntValue2;
                                ProjectInfo.n nVar11 = nVar4;
                                nVar2.Xw = length;
                                bArr2 = bArr;
                                file3 = file2;
                                nVar2.jB = j2;
                                nVar2.M7 = 4;
                                objQie = ml.qie(length, c0656Ml, nVar2);
                                if (objQie != coroutine_suspended) {
                                    j3 = length;
                                    str7 = str6;
                                    ml2 = ml;
                                    z4 = z13;
                                    context4 = context3;
                                    i3 = iIntValue;
                                    str8 = strT;
                                    j4 = j2;
                                    objKN2 = objQie;
                                    nVar5 = nVar11;
                                    file2 = file3;
                                    str15 = (String) objKN2;
                                    if (str15 != null) {
                                        return Boxing.boxBoolean(false);
                                    }
                                    Context context10 = context4;
                                    if (str8 != null) {
                                        ml2.rl.nr(str8);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    boolean z14 = z4;
                                    ml = ml2;
                                    str11 = str2;
                                    z6 = z14;
                                    context5 = context10;
                                    str10 = str15;
                                    j6 = j4;
                                    i5 = i2;
                                    bArr3 = bArr2;
                                    j5 = j3;
                                    str9 = str7;
                                    obj = coroutine_suspended;
                                    int i15 = i5;
                                    com.google.firebase.storage.o oVarRl = com.google.firebase.storage.I28.J2().ty().rl("cloud");
                                    String str22 = str5;
                                    Intrinsics.checkNotNullExpressionValue(oVarRl, str22);
                                    oVarIk = wQ.eO.Ik(oVarRl, str11, str10);
                                    if (z6) {
                                        Context context11 = context5;
                                        str12 = str22;
                                        ProjectInfo.n nVar12 = nVar5;
                                        str13 = str11;
                                        ml3 = ml;
                                        str14 = str10;
                                        z7 = z6;
                                        file4 = file2;
                                        nVar6 = nVar12;
                                        context6 = context11;
                                        j7 = j6;
                                        oVar = oVarIk;
                                        i7 = i15;
                                        long j16 = j5;
                                        ml3.xMQ = str14;
                                        int i16 = i7;
                                        int i17 = i3;
                                        qf qfVarO = oVar.rl("projectfiles.zip").o(new FileInputStream(file4));
                                        Intrinsics.checkNotNullExpressionValue(qfVarO, "putStream(...)");
                                        Wre wre = ml3.new Wre(context6, function02);
                                        nVar2.f46523n = ml3;
                                        nVar2.f46526t = context6;
                                        nVar2.f46515O = str13;
                                        nVar2.J2 = nVar6;
                                        nVar2.f46525r = function12;
                                        nVar2.f46524o = function02;
                                        nVar2.f46520Z = bArr3;
                                        nVar2.f46516S = set2;
                                        nVar2.f46522g = str9;
                                        nVar2.E2 = str14;
                                        nVar2.f46521e = oVar;
                                        nVar2.f46519X = null;
                                        nVar2.f46517T = z7;
                                        nVar2.f46514N = i17;
                                        Context context12 = context6;
                                        nVar2.f46527v = i16;
                                        String str23 = str13;
                                        nVar2.Xw = j16;
                                        long j17 = j7;
                                        nVar2.jB = j17;
                                        nVar2.M7 = 6;
                                        Ml ml8 = ml3;
                                        n nVar13 = nVar2;
                                        objKN = ml8.KN(qfVarO, 0L, j17, function12, wre, nVar13);
                                        nVar8 = nVar13;
                                        obj3 = obj;
                                        if (objKN == obj3) {
                                        }
                                    } else {
                                        str12 = str22;
                                        wtO.w6 w6Var2 = ml.Uo;
                                        nVar2.f46523n = ml;
                                        nVar2.f46526t = context5;
                                        nVar2.f46515O = str11;
                                        nVar2.J2 = nVar5;
                                        nVar2.f46525r = function12;
                                        nVar2.f46524o = function02;
                                        nVar2.f46520Z = file2;
                                        nVar2.f46516S = bArr3;
                                        nVar2.f46522g = set2;
                                        nVar2.E2 = str9;
                                        nVar2.f46521e = str10;
                                        nVar2.f46519X = oVarIk;
                                        nVar2.f46517T = z6;
                                        nVar2.f46514N = i3;
                                        context7 = context5;
                                        nVar2.f46527v = i15;
                                        i8 = i15;
                                        nVar7 = nVar5;
                                        nVar2.Xw = j5;
                                        long j18 = j6;
                                        nVar2.jB = j18;
                                        j9 = j18;
                                        nVar2.M7 = 5;
                                        obj2 = obj;
                                        if (w6Var2.n(str11, str10, nVar2) == obj2) {
                                            return obj2;
                                        }
                                        str13 = str11;
                                        ml4 = ml;
                                        z9 = z6;
                                        String str24 = str10;
                                        z7 = z9;
                                        str14 = str24;
                                        obj = obj2;
                                        ml3 = ml4;
                                        file4 = file2;
                                        oVar = oVarIk;
                                        nVar6 = nVar7;
                                        i7 = i8;
                                        j7 = j9;
                                        context6 = context7;
                                        long j162 = j5;
                                        ml3.xMQ = str14;
                                        int i162 = i7;
                                        int i172 = i3;
                                        qf qfVarO2 = oVar.rl("projectfiles.zip").o(new FileInputStream(file4));
                                        Intrinsics.checkNotNullExpressionValue(qfVarO2, "putStream(...)");
                                        Wre wre2 = ml3.new Wre(context6, function02);
                                        nVar2.f46523n = ml3;
                                        nVar2.f46526t = context6;
                                        nVar2.f46515O = str13;
                                        nVar2.J2 = nVar6;
                                        nVar2.f46525r = function12;
                                        nVar2.f46524o = function02;
                                        nVar2.f46520Z = bArr3;
                                        nVar2.f46516S = set2;
                                        nVar2.f46522g = str9;
                                        nVar2.E2 = str14;
                                        nVar2.f46521e = oVar;
                                        nVar2.f46519X = null;
                                        nVar2.f46517T = z7;
                                        nVar2.f46514N = i172;
                                        Context context122 = context6;
                                        nVar2.f46527v = i162;
                                        String str232 = str13;
                                        nVar2.Xw = j162;
                                        long j172 = j7;
                                        nVar2.jB = j172;
                                        nVar2.M7 = 6;
                                        Ml ml82 = ml3;
                                        n nVar132 = nVar2;
                                        objKN = ml82.KN(qfVarO2, 0L, j172, function12, wre2, nVar132);
                                        nVar8 = nVar132;
                                        obj3 = obj;
                                        if (objKN == obj3) {
                                            return obj3;
                                        }
                                        boolean z15 = z7;
                                        i9 = i172;
                                        z10 = z15;
                                        obj4 = objKN;
                                        ml5 = ml82;
                                        j10 = j172;
                                        obj5 = obj3;
                                        oVar2 = oVar;
                                        str16 = str14;
                                        j11 = j162;
                                        context8 = context122;
                                        i10 = i162;
                                        nVar9 = nVar6;
                                        str17 = str232;
                                        if (((Boolean) obj4).booleanValue()) {
                                            return Boxing.boxBoolean(false);
                                        }
                                        str18 = str4;
                                        int i18 = i10;
                                        qf qfVarR = oVar2.rl(str18).r(bArr3);
                                        String str25 = str3;
                                        Intrinsics.checkNotNullExpressionValue(qfVarR, str25);
                                        fuX fux = ml5.new fuX(context8, function02);
                                        nVar8.f46523n = ml5;
                                        nVar8.f46526t = context8;
                                        nVar8.f46515O = str17;
                                        nVar8.J2 = nVar9;
                                        nVar8.f46525r = function12;
                                        nVar8.f46524o = function02;
                                        nVar8.f46520Z = set2;
                                        nVar8.f46516S = str9;
                                        nVar8.f46522g = str16;
                                        nVar8.E2 = oVar2;
                                        Ml ml9 = ml5;
                                        nVar8.f46521e = null;
                                        nVar8.f46517T = z10;
                                        nVar8.f46514N = i9;
                                        nVar8.f46527v = i18;
                                        Context context13 = context8;
                                        nVar8.Xw = j11;
                                        nVar8.jB = j10;
                                        nVar8.M7 = 7;
                                        Object objKN3 = ml9.KN(qfVarR, j11, j10, function12, fux, nVar8);
                                        long j19 = j11;
                                        Object obj9 = obj5;
                                        long j20 = j10;
                                        if (objKN3 == obj9) {
                                            return obj9;
                                        }
                                        obj6 = objKN3;
                                        set4 = set2;
                                        j12 = j19;
                                        str19 = str16;
                                        j13 = j20;
                                        obj7 = obj9;
                                        oVar3 = oVar2;
                                        str20 = str9;
                                        context9 = context13;
                                        ml6 = ml9;
                                        str21 = str25;
                                        z11 = z10;
                                        i11 = i18;
                                        if (((Boolean) obj6).booleanValue()) {
                                            return Boxing.boxBoolean(false);
                                        }
                                        try {
                                            com.google.firebase.storage.o oVarRl2 = oVar3.rl(str18);
                                            Intrinsics.checkNotNullExpressionValue(oVarRl2, str12);
                                            nVar8.f46523n = ml6;
                                            nVar8.f46526t = context9;
                                            nVar8.f46515O = str17;
                                            nVar8.J2 = nVar9;
                                            nVar8.f46525r = function12;
                                            nVar8.f46524o = function02;
                                            nVar8.f46520Z = set4;
                                            nVar8.f46516S = str20;
                                            nVar8.f46522g = str19;
                                            nVar8.E2 = oVar3;
                                            nVar8.f46517T = z11;
                                            nVar8.f46514N = i9;
                                            nVar8.f46527v = i11;
                                            com.google.firebase.storage.o oVar5 = oVar3;
                                            int i19 = i11;
                                            long j21 = j12;
                                            nVar8.Xw = j21;
                                            long j22 = j13;
                                            nVar8.jB = j22;
                                            j14 = j22;
                                            nVar8.M7 = 8;
                                            Object objCk = wQ.eO.ck(oVarRl2, nVar8);
                                            obj8 = obj7;
                                            if (objCk == obj8) {
                                                return obj8;
                                            }
                                            Set set6 = set4;
                                            objKN2 = objCk;
                                            i12 = i19;
                                            set5 = set6;
                                            i13 = i9;
                                            oVar4 = oVar5;
                                            j15 = j21;
                                            try {
                                                Uri uri = (Uri) objKN2;
                                                String str26 = str20 + " (" + i12 + ")";
                                                List list = CollectionsKt.toList(set5);
                                                String title = nVar9.getTitle();
                                                String string = uri.toString();
                                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                                String packageName = context9.getPackageName();
                                                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                                                Timestamp timestampT = Timestamp.INSTANCE.t();
                                                String title2 = nVar9.getTitle();
                                                ProjectInfo.n nVar14 = nVar9;
                                                long fileSize = nVar14.getFileSize();
                                                String lowerCase = nVar14.getType().name().toLowerCase(Locale.ROOT);
                                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                                CloudProjectPackage cloudProjectPackage = new CloudProjectPackage(1028425, "5.0.273.1028425", str26, AppLovinBridge.f61290h, list, i13, title, string, packageName, timestampT, j15, CollectionsKt.listOf(new SharedProjectInfo(title2, fileSize, lowerCase)), nVar14.getFphs(), nVar14.getDuration(), nVar14.getWidth(), nVar14.getHeight());
                                                ml6.rl.n(str17, nVar14.getId(), str19);
                                                com.google.firebase.storage.o oVarRl3 = oVar4.rl("meta.json");
                                                JsonAdapter jsonAdapterAdapter = Lu.n().adapter(CloudProjectPackage.class);
                                                Intrinsics.checkNotNull(jsonAdapterAdapter);
                                                String json = jsonAdapterAdapter.toJson(cloudProjectPackage);
                                                Intrinsics.checkNotNull(json);
                                                byte[] bytes = json.getBytes(Charsets.UTF_8);
                                                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                                                qf qfVarR2 = oVarRl3.r(bytes);
                                                Intrinsics.checkNotNullExpressionValue(qfVarR2, str21);
                                                I28 i28 = ml6.new I28(context9, function02);
                                                nVar8.f46523n = ml6;
                                                nVar8.f46526t = null;
                                                nVar8.f46515O = null;
                                                nVar8.J2 = null;
                                                nVar8.f46525r = null;
                                                nVar8.f46524o = null;
                                                nVar8.f46520Z = null;
                                                nVar8.f46516S = null;
                                                nVar8.f46522g = null;
                                                nVar8.E2 = null;
                                                nVar8.f46517T = z11;
                                                nVar8.M7 = 9;
                                                Ml ml10 = ml6;
                                                objKN2 = ml10.KN(qfVarR2, j14, j14, function12, i28, nVar8);
                                                ml7 = ml10;
                                                if (objKN2 != obj8) {
                                                    return obj8;
                                                }
                                                z12 = z11;
                                                if (((Boolean) objKN2).booleanValue()) {
                                                    return Boxing.boxBoolean(false);
                                                }
                                                ml7.KN.n(new j.QJ(z12));
                                                ml7.xMQ = null;
                                                return Boxing.boxBoolean(true);
                                            } catch (CancellationException e2) {
                                                e = e2;
                                                cause = e.getCause();
                                                if (cause != null) {
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                return Boxing.boxBoolean(gh(ml6, context9, function02, e));
                                            }
                                        } catch (CancellationException e4) {
                                            e = e4;
                                            cause = e.getCause();
                                            if (cause != null) {
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            return Boxing.boxBoolean(gh(ml6, context9, function02, e));
                                        }
                                    }
                                }
                            } else {
                                Iterator it = ((Iterable) ml.nr.n().getValue()).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        Iterator it2 = it;
                                        if (!Intrinsics.areEqual(((ProjectInfo.j) next).getId(), strT)) {
                                            it = it2;
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                ProjectInfo.j jVar = (ProjectInfo.j) next;
                                if (jVar != null) {
                                    set3 = set;
                                    z5 = z3;
                                    if (!ml.f46467O.n(XFr.j.J2(length - jVar.getFileSize()))) {
                                        return Boxing.boxBoolean(mUb(ml, context3, function02, aC.j.f46538n));
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                } else {
                                    set3 = set;
                                    z5 = z3;
                                }
                                str9 = str6;
                                j5 = length;
                                j6 = j2;
                                set2 = set3;
                                i3 = iIntValue;
                                str10 = strT;
                                i5 = iIntValue2;
                                bArr3 = bArr;
                                nVar5 = nVar4;
                                context5 = context3;
                                str11 = str2;
                                z6 = z5;
                                obj = coroutine_suspended;
                                int i152 = i5;
                                com.google.firebase.storage.o oVarRl4 = com.google.firebase.storage.I28.J2().ty().rl("cloud");
                                String str222 = str5;
                                Intrinsics.checkNotNullExpressionValue(oVarRl4, str222);
                                oVarIk = wQ.eO.Ik(oVarRl4, str11, str10);
                                if (z6) {
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                boolean z16 = nVar2.f46517T;
                iwv = (iwV) nVar2.f46516S;
                file2 = (File) nVar2.f46520Z;
                function02 = (Function0) nVar2.f46524o;
                function12 = (Function1) nVar2.f46525r;
                ProjectInfo.n nVar15 = (ProjectInfo.n) nVar2.J2;
                String str27 = (String) nVar2.f46515O;
                context2 = (Context) nVar2.f46526t;
                Ml ml11 = (Ml) nVar2.f46523n;
                ResultKt.throwOnFailure(objKN2);
                z3 = z16;
                nVar3 = nVar15;
                str2 = str27;
                ml = ml11;
                byte[] bArr42 = (byte[]) objKN2;
                if (!com.alightcreative.app.motion.persist.j.INSTANCE.getSimulateUpload()) {
                }
                return coroutine_suspended;
            case 2:
                ResultKt.throwOnFailure(objKN2);
                return Boxing.boxBoolean(true);
            case 3:
                boolean z17 = nVar2.f46517T;
                bArr = (byte[]) nVar2.f46516S;
                file2 = (File) nVar2.f46520Z;
                function02 = (Function0) nVar2.f46524o;
                function12 = (Function1) nVar2.f46525r;
                ProjectInfo.n nVar16 = (ProjectInfo.n) nVar2.J2;
                String str28 = (String) nVar2.f46515O;
                context2 = (Context) nVar2.f46526t;
                Ml ml12 = (Ml) nVar2.f46523n;
                ResultKt.throwOnFailure(objKN2);
                nVar4 = nVar16;
                str2 = str28;
                ml = ml12;
                z3 = z17;
                context3 = context2;
                Pair pair3 = (Pair) objKN2;
                set = (Set) pair3.component1();
                iIntValue = ((Number) pair3.component2()).intValue();
                str3 = "putBytes(...)";
                str4 = "thumb-med.jpg";
                str5 = "child(...)";
                PackageInfo packageInfo2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0);
                Pair pair22 = TuplesKt.to(packageInfo2.versionName, Boxing.boxInt(packageInfo2.versionCode));
                str6 = (String) pair22.component1();
                iIntValue2 = ((Number) pair22.component2()).intValue();
                length = file2.length();
                long length22 = ((long) bArr.length) + length;
                if (z3) {
                }
                strT = ml.rl.t(str2, nVar4.getId());
                if (z3) {
                }
                boolean z132 = z3;
                C0656Ml c0656Ml2 = ml.new C0656Ml(context3, function02);
                nVar2.f46523n = ml;
                nVar2.f46526t = context3;
                nVar2.f46515O = str2;
                nVar2.J2 = nVar4;
                nVar2.f46525r = function12;
                nVar2.f46524o = function02;
                nVar2.f46520Z = file2;
                nVar2.f46516S = bArr;
                set2 = set;
                nVar2.f46522g = set2;
                nVar2.E2 = str6;
                nVar2.f46521e = strT;
                nVar2.f46517T = z132;
                nVar2.f46514N = iIntValue;
                nVar2.f46527v = iIntValue2;
                i2 = iIntValue2;
                ProjectInfo.n nVar112 = nVar4;
                nVar2.Xw = length;
                bArr2 = bArr;
                file3 = file2;
                nVar2.jB = j2;
                nVar2.M7 = 4;
                objQie = ml.qie(length, c0656Ml2, nVar2);
                if (objQie != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 4:
                long j23 = nVar2.jB;
                long j24 = nVar2.Xw;
                int i20 = nVar2.f46527v;
                int i21 = nVar2.f46514N;
                z4 = nVar2.f46517T;
                String str29 = (String) nVar2.f46521e;
                String str30 = (String) nVar2.E2;
                Set set7 = (Set) nVar2.f46522g;
                byte[] bArr5 = (byte[]) nVar2.f46516S;
                file3 = (File) nVar2.f46520Z;
                Function0 function03 = (Function0) nVar2.f46524o;
                Function1 function13 = (Function1) nVar2.f46525r;
                ProjectInfo.n nVar17 = (ProjectInfo.n) nVar2.J2;
                String str31 = (String) nVar2.f46515O;
                Context context14 = (Context) nVar2.f46526t;
                ml2 = (Ml) nVar2.f46523n;
                ResultKt.throwOnFailure(objKN2);
                bArr2 = bArr5;
                context4 = context14;
                str4 = "thumb-med.jpg";
                str5 = "child(...)";
                j3 = j24;
                str7 = str30;
                i2 = i20;
                function12 = function13;
                str2 = str31;
                i3 = i21;
                str3 = "putBytes(...)";
                str8 = str29;
                set2 = set7;
                function02 = function03;
                j4 = j23;
                nVar5 = nVar17;
                file2 = file3;
                str15 = (String) objKN2;
                if (str15 != null) {
                }
                break;
            case 5:
                long j25 = nVar2.jB;
                long j26 = nVar2.Xw;
                int i22 = nVar2.f46527v;
                int i23 = nVar2.f46514N;
                z9 = nVar2.f46517T;
                com.google.firebase.storage.o oVar6 = (com.google.firebase.storage.o) nVar2.f46519X;
                str10 = (String) nVar2.f46521e;
                String str32 = (String) nVar2.E2;
                Set set8 = (Set) nVar2.f46522g;
                byte[] bArr6 = (byte[]) nVar2.f46516S;
                File file5 = (File) nVar2.f46520Z;
                Function0 function04 = (Function0) nVar2.f46524o;
                Function1 function14 = (Function1) nVar2.f46525r;
                ProjectInfo.n nVar18 = (ProjectInfo.n) nVar2.J2;
                String str33 = (String) nVar2.f46515O;
                Context context15 = (Context) nVar2.f46526t;
                ml4 = (Ml) nVar2.f46523n;
                ResultKt.throwOnFailure(objKN2);
                bArr3 = bArr6;
                nVar7 = nVar18;
                str13 = str33;
                context7 = context15;
                j9 = j25;
                obj2 = coroutine_suspended;
                str4 = "thumb-med.jpg";
                str12 = "child(...)";
                j5 = j26;
                oVarIk = oVar6;
                i8 = i22;
                str9 = str32;
                set2 = set8;
                file2 = file5;
                function12 = function14;
                i3 = i23;
                str3 = "putBytes(...)";
                function02 = function04;
                String str242 = str10;
                z7 = z9;
                str14 = str242;
                obj = obj2;
                ml3 = ml4;
                file4 = file2;
                oVar = oVarIk;
                nVar6 = nVar7;
                i7 = i8;
                j7 = j9;
                context6 = context7;
                long j1622 = j5;
                ml3.xMQ = str14;
                int i1622 = i7;
                int i1722 = i3;
                qf qfVarO22 = oVar.rl("projectfiles.zip").o(new FileInputStream(file4));
                Intrinsics.checkNotNullExpressionValue(qfVarO22, "putStream(...)");
                Wre wre22 = ml3.new Wre(context6, function02);
                nVar2.f46523n = ml3;
                nVar2.f46526t = context6;
                nVar2.f46515O = str13;
                nVar2.J2 = nVar6;
                nVar2.f46525r = function12;
                nVar2.f46524o = function02;
                nVar2.f46520Z = bArr3;
                nVar2.f46516S = set2;
                nVar2.f46522g = str9;
                nVar2.E2 = str14;
                nVar2.f46521e = oVar;
                nVar2.f46519X = null;
                nVar2.f46517T = z7;
                nVar2.f46514N = i1722;
                Context context1222 = context6;
                nVar2.f46527v = i1622;
                String str2322 = str13;
                nVar2.Xw = j1622;
                long j1722 = j7;
                nVar2.jB = j1722;
                nVar2.M7 = 6;
                Ml ml822 = ml3;
                n nVar1322 = nVar2;
                objKN = ml822.KN(qfVarO22, 0L, j1722, function12, wre22, nVar1322);
                nVar8 = nVar1322;
                obj3 = obj;
                if (objKN == obj3) {
                }
                break;
            case 6:
                long j27 = nVar2.jB;
                long j28 = nVar2.Xw;
                int i24 = nVar2.f46527v;
                int i25 = nVar2.f46514N;
                boolean z18 = nVar2.f46517T;
                com.google.firebase.storage.o oVar7 = (com.google.firebase.storage.o) nVar2.f46521e;
                String str34 = (String) nVar2.E2;
                String str35 = (String) nVar2.f46522g;
                Set set9 = (Set) nVar2.f46516S;
                byte[] bArr7 = (byte[]) nVar2.f46520Z;
                Function0 function05 = (Function0) nVar2.f46524o;
                Function1 function15 = (Function1) nVar2.f46525r;
                ProjectInfo.n nVar19 = (ProjectInfo.n) nVar2.J2;
                String str36 = (String) nVar2.f46515O;
                Context context16 = (Context) nVar2.f46526t;
                ml5 = (Ml) nVar2.f46523n;
                ResultKt.throwOnFailure(objKN2);
                context8 = context16;
                obj5 = coroutine_suspended;
                str4 = "thumb-med.jpg";
                str12 = "child(...)";
                z10 = z18;
                i10 = i24;
                str9 = str35;
                obj4 = objKN2;
                str3 = "putBytes(...)";
                oVar2 = oVar7;
                set2 = set9;
                bArr3 = bArr7;
                function02 = function05;
                j11 = j28;
                str16 = str34;
                function12 = function15;
                i9 = i25;
                n nVar20 = nVar2;
                nVar9 = nVar19;
                j10 = j27;
                nVar8 = nVar20;
                str17 = str36;
                if (((Boolean) obj4).booleanValue()) {
                }
                break;
            case 7:
                long j29 = nVar2.jB;
                long j30 = nVar2.Xw;
                int i26 = nVar2.f46527v;
                int i27 = nVar2.f46514N;
                boolean z19 = nVar2.f46517T;
                com.google.firebase.storage.o oVar8 = (com.google.firebase.storage.o) nVar2.E2;
                String str37 = (String) nVar2.f46522g;
                String str38 = (String) nVar2.f46516S;
                Set set10 = (Set) nVar2.f46520Z;
                Function0 function06 = (Function0) nVar2.f46524o;
                Function1 function16 = (Function1) nVar2.f46525r;
                ProjectInfo.n nVar21 = (ProjectInfo.n) nVar2.J2;
                String str39 = (String) nVar2.f46515O;
                Context context17 = (Context) nVar2.f46526t;
                Ml ml13 = (Ml) nVar2.f46523n;
                ResultKt.throwOnFailure(objKN2);
                j13 = j29;
                nVar8 = nVar2;
                obj7 = coroutine_suspended;
                str12 = "child(...)";
                j12 = j30;
                z11 = z19;
                i11 = i26;
                str20 = str38;
                function12 = function16;
                nVar9 = nVar21;
                str17 = str39;
                obj6 = objKN2;
                str21 = "putBytes(...)";
                str18 = "thumb-med.jpg";
                set4 = set10;
                context9 = context17;
                ml6 = ml13;
                oVar3 = oVar8;
                str19 = str37;
                i9 = i27;
                function02 = function06;
                if (((Boolean) obj6).booleanValue()) {
                }
                break;
            case 8:
                long j31 = nVar2.jB;
                long j32 = nVar2.Xw;
                int i29 = nVar2.f46527v;
                int i30 = nVar2.f46514N;
                boolean z20 = nVar2.f46517T;
                oVar4 = (com.google.firebase.storage.o) nVar2.E2;
                String str40 = (String) nVar2.f46522g;
                String str41 = (String) nVar2.f46516S;
                set5 = (Set) nVar2.f46520Z;
                Function0 function07 = (Function0) nVar2.f46524o;
                Function1 function17 = (Function1) nVar2.f46525r;
                ProjectInfo.n nVar22 = (ProjectInfo.n) nVar2.J2;
                String str42 = (String) nVar2.f46515O;
                Context context18 = (Context) nVar2.f46526t;
                Ml ml14 = (Ml) nVar2.f46523n;
                try {
                    ResultKt.throwOnFailure(objKN2);
                    i12 = i29;
                    j14 = j31;
                    nVar8 = nVar2;
                    obj8 = coroutine_suspended;
                    i13 = i30;
                    j15 = j32;
                    z11 = z20;
                    function02 = function07;
                    ml6 = ml14;
                    nVar9 = nVar22;
                    str17 = str42;
                    str21 = "putBytes(...)";
                    str19 = str40;
                    context9 = context18;
                    str20 = str41;
                    function12 = function17;
                    Uri uri2 = (Uri) objKN2;
                    String str262 = str20 + " (" + i12 + ")";
                    List list2 = CollectionsKt.toList(set5);
                    String title3 = nVar9.getTitle();
                    String string2 = uri2.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    String packageName2 = context9.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName2, "getPackageName(...)");
                    Timestamp timestampT2 = Timestamp.INSTANCE.t();
                    String title22 = nVar9.getTitle();
                    ProjectInfo.n nVar142 = nVar9;
                    long fileSize2 = nVar142.getFileSize();
                    String lowerCase2 = nVar142.getType().name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    CloudProjectPackage cloudProjectPackage2 = new CloudProjectPackage(1028425, "5.0.273.1028425", str262, AppLovinBridge.f61290h, list2, i13, title3, string2, packageName2, timestampT2, j15, CollectionsKt.listOf(new SharedProjectInfo(title22, fileSize2, lowerCase2)), nVar142.getFphs(), nVar142.getDuration(), nVar142.getWidth(), nVar142.getHeight());
                    ml6.rl.n(str17, nVar142.getId(), str19);
                    com.google.firebase.storage.o oVarRl32 = oVar4.rl("meta.json");
                    JsonAdapter jsonAdapterAdapter2 = Lu.n().adapter(CloudProjectPackage.class);
                    Intrinsics.checkNotNull(jsonAdapterAdapter2);
                    String json2 = jsonAdapterAdapter2.toJson(cloudProjectPackage2);
                    Intrinsics.checkNotNull(json2);
                    byte[] bytes2 = json2.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                    qf qfVarR22 = oVarRl32.r(bytes2);
                    Intrinsics.checkNotNullExpressionValue(qfVarR22, str21);
                    I28 i282 = ml6.new I28(context9, function02);
                    nVar8.f46523n = ml6;
                    nVar8.f46526t = null;
                    nVar8.f46515O = null;
                    nVar8.J2 = null;
                    nVar8.f46525r = null;
                    nVar8.f46524o = null;
                    nVar8.f46520Z = null;
                    nVar8.f46516S = null;
                    nVar8.f46522g = null;
                    nVar8.E2 = null;
                    nVar8.f46517T = z11;
                    nVar8.M7 = 9;
                    Ml ml102 = ml6;
                    objKN2 = ml102.KN(qfVarR22, j14, j14, function12, i282, nVar8);
                    ml7 = ml102;
                    if (objKN2 != obj8) {
                    }
                } catch (CancellationException e6) {
                    e = e6;
                    function02 = function07;
                    context9 = context18;
                    ml6 = ml14;
                    cause = e.getCause();
                    if (cause != null) {
                        return Boxing.boxBoolean(gh(ml6, context9, function02, cause));
                    }
                    throw e;
                } catch (Exception e7) {
                    e = e7;
                    function02 = function07;
                    context9 = context18;
                    ml6 = ml14;
                    return Boxing.boxBoolean(gh(ml6, context9, function02, e));
                }
                break;
            case 9:
                z12 = nVar2.f46517T;
                ml7 = (Ml) nVar2.f46523n;
                ResultKt.throwOnFailure(objKN2);
                if (((Boolean) objKN2).booleanValue()) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class CN3 extends SuspendLambda implements Function2 {
        final /* synthetic */ SceneThumbnailMaker J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ProjectInfo.n f46475O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46476n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f46477t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(Context context, ProjectInfo.n nVar, SceneThumbnailMaker sceneThumbnailMaker, Continuation continuation) {
            super(2, continuation);
            this.f46477t = context;
            this.f46475O = nVar;
            this.J2 = sceneThumbnailMaker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new CN3(this.f46477t, this.f46475O, this.J2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f46476n == 0) {
                ResultKt.throwOnFailure(obj);
                return ((gIX.Lu) h.n(this.f46477t, CollectionsKt.listOf(this.f46475O), CollectionsKt.listOf(SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(afx.o(this.f46477t, this.f46475O.getId()), null, 1, null), false, true, false, 10, null)), this.J2).component1()).rl();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public Ml(kgE.fuX iapManager, wtO.Dsr linkLocalAndCloudProjectUseCase, wtO.n cleanUpFailedUploadsUseCase, wtO.Wre getCloudProjectsUseCase, wtO.fuX hasEnoughStorageLeftUseCase, wtO.I28 getAllowedStorageUseCase, wtO.w6 deleteFromCloudUseCase, iF eventLogger) {
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(linkLocalAndCloudProjectUseCase, "linkLocalAndCloudProjectUseCase");
        Intrinsics.checkNotNullParameter(cleanUpFailedUploadsUseCase, "cleanUpFailedUploadsUseCase");
        Intrinsics.checkNotNullParameter(getCloudProjectsUseCase, "getCloudProjectsUseCase");
        Intrinsics.checkNotNullParameter(hasEnoughStorageLeftUseCase, "hasEnoughStorageLeftUseCase");
        Intrinsics.checkNotNullParameter(getAllowedStorageUseCase, "getAllowedStorageUseCase");
        Intrinsics.checkNotNullParameter(deleteFromCloudUseCase, "deleteFromCloudUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f46468n = iapManager;
        this.rl = linkLocalAndCloudProjectUseCase;
        this.f46469t = cleanUpFailedUploadsUseCase;
        this.nr = getCloudProjectsUseCase;
        this.f46467O = hasEnoughStorageLeftUseCase;
        this.J2 = getAllowedStorageUseCase;
        this.Uo = deleteFromCloudUseCase;
        this.KN = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(Function0 function0, DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    private final void az(Context context, com.alightcreative.backup.domain.usecases.internal.aC aCVar, final Function0 function0) {
        Pair pair;
        aC.j jVar = aC.j.f46538n;
        int i2 = Intrinsics.areEqual(aCVar, jVar) ? 2132019587 : 2132020387;
        if (Intrinsics.areEqual(aCVar, aC.w6.f46540n)) {
            pair = TuplesKt.to(context.getString(2132020386), "network_error");
        } else if (Intrinsics.areEqual(aCVar, jVar)) {
            long jN = this.J2.n();
            String strJ2 = gnv.J2(jN);
            String string = context.getString(2132019585, strJ2);
            if (jN == 0) {
                strJ2 = "0MB";
            }
            pair = TuplesKt.to(string, "full_storage_" + strJ2);
        } else {
            if (!(aCVar instanceof aC.n)) {
                throw new NoWhenBranchMatchedException();
            }
            String message = ((aC.n) aCVar).n().getMessage();
            if (message == null) {
                message = "Unknown";
            }
            pair = TuplesKt.to("Reason: " + message, "generic_error");
        }
        String str = (String) pair.component1();
        this.KN.n(new j.l3D((String) pair.component2()));
        if (Intrinsics.areEqual(aCVar, jVar)) {
            this.KN.n(j.tI.f8577n);
        }
        R6 r6O = new R6(context).mUb(i2).O(str);
        ((!Intrinsics.areEqual(aCVar, jVar) || function0 == null) ? r6O.xMQ(2132017378, new Function1() { // from class: com.alightcreative.backup.domain.usecases.internal.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.Ik((DialogInterface) obj);
            }
        }) : r6O.xMQ(2132019589, new Function1() { // from class: com.alightcreative.backup.domain.usecases.internal.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.HI(function0, (DialogInterface) obj);
            }
        }).J2(2132017396, new Function1() { // from class: com.alightcreative.backup.domain.usecases.internal.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.ck((DialogInterface) obj);
            }
        })).gh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object qie(long j2, Function1 function1, Continuation continuation) {
        aC aCVar;
        if (continuation instanceof aC) {
            aCVar = (aC) continuation;
            int i2 = aCVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aCVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                aCVar = new aC(continuation);
            }
        }
        Object objN = aCVar.f46510t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aCVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            wQ.QJ qj = new wQ.QJ("makeCloudProjectPackageId", new Dsr(com.google.firebase.functions.n.mUb.t().ck("makeCloudProjectPackageId"), "makeCloudProjectPackageId"));
            ProjectPackageIDRequest projectPackageIDRequest = new ProjectPackageIDRequest(j2, this.f46468n.rl() ? com.alightcreative.app.motion.persist.j.INSTANCE.getAcctTestMode() : "normal");
            aCVar.f46509n = function1;
            aCVar.J2 = 1;
            objN = qj.n(projectPackageIDRequest, aCVar);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) aCVar.f46509n;
            ResultKt.throwOnFailure(objN);
        }
        x0X.n nVar = (x0X.n) objN;
        if (nVar instanceof n.C1266n) {
            function1.invoke((Throwable) ((n.C1266n) nVar).n());
        } else if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        ProjectPackageIDResponse projectPackageIDResponse = (ProjectPackageIDResponse) x0X.w6.nr(nVar);
        if (projectPackageIDResponse == null) {
            return null;
        }
        if (Intrinsics.areEqual(projectPackageIDResponse.getResult(), "success")) {
            return projectPackageIDResponse.getPackageId();
        }
        String errorCode = projectPackageIDResponse.getErrorCode();
        if (errorCode == null) {
            errorCode = "unknown";
        }
        function1.invoke(new Exception(errorCode));
        return null;
    }

    static /* synthetic */ void ty(Ml ml, Context context, com.alightcreative.backup.domain.usecases.internal.aC aCVar, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        ml.az(context, aCVar, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0177 A[PHI: r0 r1 r3 r13
      0x0177: PHI (r0v24 java.lang.String) = (r0v22 java.lang.String), (r0v27 java.lang.String) binds: [B:72:0x0199, B:62:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r1v8 com.alightcreative.backup.domain.usecases.internal.Ml) = 
      (r1v6 com.alightcreative.backup.domain.usecases.internal.Ml)
      (r1v9 com.alightcreative.backup.domain.usecases.internal.Ml)
     binds: [B:72:0x0199, B:62:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r3v9 java.lang.String) = (r3v8 java.lang.String), (r3v10 java.lang.String) binds: [B:72:0x0199, B:62:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r13v3 boolean) = (r13v0 boolean), (r13v5 boolean) binds: [B:72:0x0199, B:62:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // wtO.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Context context, String str, ProjectInfo.n nVar, boolean z2, SceneThumbnailMaker sceneThumbnailMaker, Function1 function1, Function0 function0, Continuation continuation) throws Throwable {
        C c2;
        Ml ml;
        String str2;
        File file;
        String str3;
        String str4;
        if (continuation instanceof C) {
            c2 = (C) continuation;
            int i2 = c2.f46472o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2.f46472o = i2 - Integer.MIN_VALUE;
            } else {
                c2 = new C(continuation);
            }
        }
        C c4 = c2;
        Object objXMQ = c4.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c4.f46472o;
        boolean zBooleanValue = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objXMQ);
            if (!this.f46467O.n(XFr.j.nr(0))) {
                az(context, aC.j.f46538n, function0);
                return Boxing.boxBoolean(false);
            }
            if (!XoT.fuX.Ik(context) && !com.alightcreative.app.motion.persist.j.INSTANCE.getSimulateUpload()) {
                ty(this, context, aC.w6.f46540n, null, 4, null);
                return Boxing.boxBoolean(false);
            }
            String str5 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH).format(new Date());
            String title = nVar.getTitle();
            StringBuilder sb = new StringBuilder();
            int length = title.length();
            for (int i5 = 0; i5 < length; i5++) {
                char cCharAt = title.charAt(i5);
                if (Intrinsics.compare((int) cCharAt, l.f62284f) > 0 || (('A' <= cCharAt && cCharAt < '[') || (('a' <= cCharAt && cCharAt < '{') || (('0' <= cCharAt && cCharAt < ':') || StringsKt.contains$default((CharSequence) "_-.+, ", cCharAt, false, 2, (Object) null))))) {
                    sb.append(cCharAt);
                }
            }
            String str6 = sb.toString() + " " + str5 + ".amproj";
            File cacheDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
            File fileResolve = FilesKt.resolve(FilesKt.resolve(FilesKt.resolve(cacheDir, "cloud"), "t" + System.currentTimeMillis()), str6);
            if (fileResolve.exists()) {
                fileResolve.delete();
            }
            try {
                this.KN.n(j.C1437c.f8483n);
                c4.f46471n = this;
                c4.f46474t = str;
                c4.f46470O = fileResolve;
                c4.f46472o = 1;
                objXMQ = xMQ(context, str, nVar, z2, sceneThumbnailMaker, function1, function0, fileResolve, c4);
                if (objXMQ == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ml = this;
                str2 = str;
                file = fileResolve;
                zBooleanValue = ((Boolean) objXMQ).booleanValue();
                file.delete();
                str4 = ml.xMQ;
                if (str4 != null) {
                }
            } catch (CancellationException unused) {
                ml = this;
                str2 = str;
                file = fileResolve;
                ml.KN.n(j.C1448z.f8603n);
                file.delete();
                str4 = ml.xMQ;
                if (str4 != null) {
                }
                ml.xMQ = null;
                return Boxing.boxBoolean(zBooleanValue);
            } catch (Throwable th) {
                th = th;
                ml = this;
                str2 = str;
                file = fileResolve;
                file.delete();
                str3 = ml.xMQ;
                if (str3 != null) {
                }
                ml.xMQ = null;
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) c4.f46470O;
            str2 = (String) c4.f46474t;
            Ml ml2 = (Ml) c4.f46471n;
            try {
                ResultKt.throwOnFailure(objXMQ);
                ml = ml2;
                try {
                    try {
                        zBooleanValue = ((Boolean) objXMQ).booleanValue();
                        file.delete();
                        str4 = ml.xMQ;
                    } catch (CancellationException unused2) {
                        ml.KN.n(j.C1448z.f8603n);
                        file.delete();
                        str4 = ml.xMQ;
                        if (str4 != null) {
                        }
                        ml.xMQ = null;
                        return Boxing.boxBoolean(zBooleanValue);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    file.delete();
                    str3 = ml.xMQ;
                    if (str3 != null) {
                        ml.f46469t.rl(str2, str3);
                    }
                    ml.xMQ = null;
                    throw th;
                }
            } catch (CancellationException unused3) {
                ml = ml2;
                ml.KN.n(j.C1448z.f8603n);
                file.delete();
                str4 = ml.xMQ;
                if (str4 != null) {
                }
                ml.xMQ = null;
                return Boxing.boxBoolean(zBooleanValue);
            } catch (Throwable th3) {
                th = th3;
                ml = ml2;
                file.delete();
                str3 = ml.xMQ;
                if (str3 != null) {
                }
                ml.xMQ = null;
                throw th;
            }
            if (str4 != null) {
                ml.f46469t.rl(str2, str4);
            }
        }
        ml.xMQ = null;
        return Boxing.boxBoolean(zBooleanValue);
    }

    private final Object KN(qf qfVar, long j2, long j3, Function1 function1, Function1 function12, Continuation continuation) {
        return gIX.QJ.xMQ(CollectionsKt.listOf(qfVar), j2, j3, function1, function12, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gh(Ml ml, Context context, Function0 function0, Throwable th) {
        com.alightcreative.backup.domain.usecases.internal.aC nVar;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        if (StringsKt.contains$default((CharSequence) message, (CharSequence) "permission", false, 2, (Object) null)) {
            nVar = aC.j.f46538n;
        } else {
            nVar = new aC.n(th);
        }
        return mUb(ml, context, function0, nVar);
    }

    private static final boolean mUb(Ml ml, Context context, Function0 function0, com.alightcreative.backup.domain.usecases.internal.aC aCVar) {
        ml.az(context, aCVar, function0);
        return false;
    }
}
