package gIX;

import Dj7.l4Z;
import GJW.OU;
import GJW.P;
import GJW.xuv;
import QmE.iF;
import QmE.j;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import com.alightcreative.app.motion.activities.R6;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.export.projectpackage.ProjectPackageIDRequest;
import com.alightcreative.export.projectpackage.ProjectPackageIDResponse;
import com.alightcreative.export.projectpackage.RegisterAMProjectPackageRequest;
import com.alightcreative.export.projectpackage.RegisterAMProjectPackageResponse;
import com.alightcreative.export.projectpackage.SharedProjectInfo;
import com.alightcreative.export.projectpackage.SharedProjectPackageInfo;
import com.alightcreative.importer.projectpackage.AlightLinkMetadataRequest;
import com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Timestamp;
import com.google.firebase.functions.n;
import com.google.firebase.storage.qf;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import ep.oxM.esLNYym;
import gIX.QJ;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Map f67240n = new LinkedHashMap();

    static final class C extends ContinuationImpl {

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        long f67241B;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f67242D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        int f67243E;
        Object E2;

        /* JADX INFO: renamed from: FX, reason: collision with root package name */
        long f67244FX;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        long f67245J;
        Object J2;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        int f67246M;
        boolean M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        Object f67247N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f67248O;
        Object P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Object f67249S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        Object f67250T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        Object f67251U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        Object f67252X;
        Object Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f67253Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f67254a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f67255e;
        int eF;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f67256g;
        Object jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67257n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f67258o;
        int p5;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f67259r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f67260t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f67261v;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67242D = obj;
            this.f67254a |= Integer.MIN_VALUE;
            return QJ.qie(null, null, null, null, null, null, null, null, false, null, null, null, null, this);
        }

        C(Continuation continuation) {
            super(continuation);
        }
    }

    public static final class CN3 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ mCM.QJ f67262n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f67263t;

        public static final class Ml implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f67264n;

            public Ml(String str) {
                this.f67264n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "WrappedHttpsCallable: " + this.f67264n + " OUT";
            }
        }

        public static final class j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f67265n;

            public j(String str) {
                this.f67265n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "WrappedHttpsCallable: " + this.f67265n + " IN";
            }
        }

        public static final class n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f67266n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f67267t;

            public n(String str, String str2) {
                this.f67266n = str;
                this.f67267t = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "typedCall:" + this.f67266n + ": IN / " + this.f67267t;
            }
        }

        public static final class w6 implements com.google.android.gms.tasks.Continuation {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ mCM.QJ f67268n;
            final /* synthetic */ String nr;
            final /* synthetic */ JsonAdapter rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function1 f67269t;

            /* JADX INFO: renamed from: gIX.QJ$CN3$w6$CN3, reason: collision with other inner class name */
            public static final class C0939CN3 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67270n;

                public C0939CN3(String str) {
                    this.f67270n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67270n + ": FAIL";
                }
            }

            public static final class I28 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67271n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Throwable f67272t;

                public I28(String str, Throwable th) {
                    this.f67271n = str;
                    this.f67272t = th;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67271n + ": Parse error! " + this.f67272t;
                }
            }

            public static final class Ml implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ String f67273O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67274n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f67275t;

                public Ml(String str, int i2, String str2) {
                    this.f67274n = str;
                    this.f67275t = i2;
                    this.f67273O = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67274n + ": RESPONSE: " + StringsKt.padStart$default(String.valueOf(this.f67275t), 4, (char) 0, 2, (Object) null) + ": " + this.f67273O;
                }
            }

            public static final class Wre implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67276n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f67277t;

                public Wre(String str, Object obj) {
                    this.f67276n = str;
                    this.f67277t = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67276n + ": RESULT: " + this.f67277t;
                }
            }

            public static final class j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67278n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Task f67279t;

                public j(String str, Task task) {
                    this.f67278n = str;
                    this.f67279t = task;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String message;
                    String str = this.f67278n;
                    Task task = this.f67279t;
                    boolean zIsSuccessful = task.isSuccessful();
                    boolean zIsCanceled = this.f67279t.isCanceled();
                    boolean zIsComplete = this.f67279t.isComplete();
                    Exception exception = this.f67279t.getException();
                    if (exception == null || (message = exception.getMessage()) == null) {
                        message = "NONE";
                    }
                    return "typedCall:" + str + ": CONTINUE (" + task + ") isSuccessful=" + zIsSuccessful + " isCanceled=" + zIsCanceled + " isComplete=" + zIsComplete + " exception=" + message;
                }
            }

            public static final class n implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67280n;

                public n(String str) {
                    this.f67280n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67280n + ": SUCCESS";
                }
            }

            /* JADX INFO: renamed from: gIX.QJ$CN3$w6$w6, reason: collision with other inner class name */
            public static final class C0940w6 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67281n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f67282t;

                public C0940w6(String str, String str2) {
                    this.f67281n = str;
                    this.f67282t = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67281n + ": RESPONSE: len=" + this.f67282t.length();
                }
            }

            public w6(mCM.QJ qj, JsonAdapter jsonAdapter, Function1 function1, String str) {
                this.f67268n = qj;
                this.rl = jsonAdapter;
                this.f67269t = function1;
                this.nr = str;
            }

            public final void n(Task task) {
                Intrinsics.checkNotNullParameter(task, "task");
                XoT.C.Uo(this.f67268n, new j(this.nr, task));
                if (task.isSuccessful()) {
                    mCM.l3D l3d = (mCM.l3D) task.getResult();
                    if (l3d == null) {
                        Function1 function1 = this.f67269t;
                        Result.Companion companion = Result.INSTANCE;
                        function1.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")))));
                        return;
                    }
                    XoT.C.Uo(this.f67268n, new n(this.nr));
                    Moshi moshiN = HI0.Lu.n();
                    Object obj = l3d.f70669n;
                    JsonAdapter jsonAdapterAdapter = moshiN.adapter(Object.class);
                    Intrinsics.checkNotNull(jsonAdapterAdapter);
                    JsonAdapter jsonAdapterIndent = jsonAdapterAdapter.indent("    ");
                    Intrinsics.checkNotNull(jsonAdapterIndent);
                    String json = jsonAdapterIndent.toJson(obj);
                    Intrinsics.checkNotNull(json);
                    XoT.C.Uo(this.f67268n, new C0940w6(this.nr, json));
                    Sequence<String> sequenceLineSequence = StringsKt.lineSequence(json);
                    mCM.QJ qj = this.f67268n;
                    String str = this.nr;
                    int i2 = 0;
                    for (String str2 : sequenceLineSequence) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        XoT.C.Uo(qj, new Ml(str, i2, str2));
                        i2 = i3;
                    }
                    try {
                        Object objFromJson = this.rl.fromJson(json);
                        XoT.C.Uo(this.f67268n, new Wre(this.nr, objFromJson));
                        if (objFromJson != null) {
                            this.f67269t.invoke(Result.m312boximpl(Result.m313constructorimpl(objFromJson)));
                            return;
                        }
                    } catch (Throwable th) {
                        XoT.C.Uo(this.f67268n, new I28(this.nr, th));
                        Function1 function12 = this.f67269t;
                        Result.Companion companion2 = Result.INSTANCE;
                        function12.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(th))));
                        return;
                    }
                }
                XoT.C.Uo(this.f67268n, new C0939CN3(this.nr));
                Exception exception = task.getException();
                if (exception != null) {
                    Function1 function13 = this.f67269t;
                    Result.Companion companion3 = Result.INSTANCE;
                    function13.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(exception))));
                } else {
                    Function1 function14 = this.f67269t;
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

        public CN3(mCM.QJ qj, String str) {
            this.f67262n = qj;
            this.f67263t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n(obj, (Function1) obj2);
            return Unit.INSTANCE;
        }

        public final void n(Object obj, Function1 cb2) {
            Intrinsics.checkNotNullParameter(cb2, "cb");
            XoT.C.KN("WrappedHttpsCallable", new j(this.f67263t));
            mCM.QJ qj = this.f67262n;
            String str = this.f67263t;
            JsonAdapter jsonAdapterAdapter = HI0.Lu.n().adapter(AlightLinkMetadataRequest.class);
            Intrinsics.checkNotNull(jsonAdapterAdapter);
            String json = jsonAdapterAdapter.toJson(obj);
            Intrinsics.checkNotNull(json);
            XoT.C.Uo(qj, new n(str, json));
            qj.rl(new JSONObject(json)).continueWith(new w6(qj, HI0.Lu.n().adapter(AlightLinkMetadataResponse.class), cb2, str));
            XoT.C.KN("WrappedHttpsCallable", new Ml(this.f67263t));
        }
    }

    public static final class Dsr implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ mCM.QJ f67283n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f67284t;

        public static final class Ml implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f67285n;

            public Ml(String str) {
                this.f67285n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "WrappedHttpsCallable: " + this.f67285n + " OUT";
            }
        }

        public static final class j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f67286n;

            public j(String str) {
                this.f67286n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "WrappedHttpsCallable: " + this.f67286n + " IN";
            }
        }

        public static final class n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f67287n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f67288t;

            public n(String str, String str2) {
                this.f67287n = str;
                this.f67288t = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "typedCall:" + this.f67287n + ": IN / " + this.f67288t;
            }
        }

        public static final class w6 implements com.google.android.gms.tasks.Continuation {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ mCM.QJ f67289n;
            final /* synthetic */ String nr;
            final /* synthetic */ JsonAdapter rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function1 f67290t;

            public static final class CN3 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67291n;

                public CN3(String str) {
                    this.f67291n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67291n + ": FAIL";
                }
            }

            public static final class I28 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67292n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Throwable f67293t;

                public I28(String str, Throwable th) {
                    this.f67292n = str;
                    this.f67293t = th;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67292n + ": Parse error! " + this.f67293t;
                }
            }

            public static final class Ml implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ String f67294O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67295n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f67296t;

                public Ml(String str, int i2, String str2) {
                    this.f67295n = str;
                    this.f67296t = i2;
                    this.f67294O = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67295n + ": RESPONSE: " + StringsKt.padStart$default(String.valueOf(this.f67296t), 4, (char) 0, 2, (Object) null) + ": " + this.f67294O;
                }
            }

            public static final class Wre implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67297n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f67298t;

                public Wre(String str, Object obj) {
                    this.f67297n = str;
                    this.f67298t = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67297n + ": RESULT: " + this.f67298t;
                }
            }

            public static final class j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67299n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Task f67300t;

                public j(String str, Task task) {
                    this.f67299n = str;
                    this.f67300t = task;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String message;
                    String str = this.f67299n;
                    Task task = this.f67300t;
                    boolean zIsSuccessful = task.isSuccessful();
                    boolean zIsCanceled = this.f67300t.isCanceled();
                    boolean zIsComplete = this.f67300t.isComplete();
                    Exception exception = this.f67300t.getException();
                    if (exception == null || (message = exception.getMessage()) == null) {
                        message = "NONE";
                    }
                    return "typedCall:" + str + ": CONTINUE (" + task + ") isSuccessful=" + zIsSuccessful + " isCanceled=" + zIsCanceled + " isComplete=" + zIsComplete + " exception=" + message;
                }
            }

            public static final class n implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67301n;

                public n(String str) {
                    this.f67301n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67301n + ": SUCCESS";
                }
            }

            /* JADX INFO: renamed from: gIX.QJ$Dsr$w6$w6, reason: collision with other inner class name */
            public static final class C0941w6 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67302n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f67303t;

                public C0941w6(String str, String str2) {
                    this.f67302n = str;
                    this.f67303t = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67302n + ": RESPONSE: len=" + this.f67303t.length();
                }
            }

            public w6(mCM.QJ qj, JsonAdapter jsonAdapter, Function1 function1, String str) {
                this.f67289n = qj;
                this.rl = jsonAdapter;
                this.f67290t = function1;
                this.nr = str;
            }

            public final void n(Task task) {
                Intrinsics.checkNotNullParameter(task, "task");
                XoT.C.Uo(this.f67289n, new j(this.nr, task));
                if (task.isSuccessful()) {
                    mCM.l3D l3d = (mCM.l3D) task.getResult();
                    if (l3d == null) {
                        Function1 function1 = this.f67290t;
                        Result.Companion companion = Result.INSTANCE;
                        function1.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")))));
                        return;
                    }
                    XoT.C.Uo(this.f67289n, new n(this.nr));
                    Moshi moshiN = HI0.Lu.n();
                    Object obj = l3d.f70669n;
                    JsonAdapter jsonAdapterAdapter = moshiN.adapter(Object.class);
                    Intrinsics.checkNotNull(jsonAdapterAdapter);
                    JsonAdapter jsonAdapterIndent = jsonAdapterAdapter.indent("    ");
                    Intrinsics.checkNotNull(jsonAdapterIndent);
                    String json = jsonAdapterIndent.toJson(obj);
                    Intrinsics.checkNotNull(json);
                    XoT.C.Uo(this.f67289n, new C0941w6(this.nr, json));
                    Sequence<String> sequenceLineSequence = StringsKt.lineSequence(json);
                    mCM.QJ qj = this.f67289n;
                    String str = this.nr;
                    int i2 = 0;
                    for (String str2 : sequenceLineSequence) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        XoT.C.Uo(qj, new Ml(str, i2, str2));
                        i2 = i3;
                    }
                    try {
                        Object objFromJson = this.rl.fromJson(json);
                        XoT.C.Uo(this.f67289n, new Wre(this.nr, objFromJson));
                        if (objFromJson != null) {
                            this.f67290t.invoke(Result.m312boximpl(Result.m313constructorimpl(objFromJson)));
                            return;
                        }
                    } catch (Throwable th) {
                        XoT.C.Uo(this.f67289n, new I28(this.nr, th));
                        Function1 function12 = this.f67290t;
                        Result.Companion companion2 = Result.INSTANCE;
                        function12.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(th))));
                        return;
                    }
                }
                XoT.C.Uo(this.f67289n, new CN3(this.nr));
                Exception exception = task.getException();
                if (exception != null) {
                    Function1 function13 = this.f67290t;
                    Result.Companion companion3 = Result.INSTANCE;
                    function13.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(exception))));
                } else {
                    Function1 function14 = this.f67290t;
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
            this.f67283n = qj;
            this.f67284t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n(obj, (Function1) obj2);
            return Unit.INSTANCE;
        }

        public final void n(Object obj, Function1 cb2) {
            Intrinsics.checkNotNullParameter(cb2, "cb");
            XoT.C.KN("WrappedHttpsCallable", new j(this.f67284t));
            mCM.QJ qj = this.f67283n;
            String str = this.f67284t;
            JsonAdapter jsonAdapterAdapter = HI0.Lu.n().adapter(RegisterAMProjectPackageRequest.class);
            Intrinsics.checkNotNull(jsonAdapterAdapter);
            String json = jsonAdapterAdapter.toJson(obj);
            Intrinsics.checkNotNull(json);
            XoT.C.Uo(qj, new n(str, json));
            qj.rl(new JSONObject(json)).continueWith(new w6(qj, HI0.Lu.n().adapter(RegisterAMProjectPackageResponse.class), cb2, str));
            XoT.C.KN("WrappedHttpsCallable", new Ml(this.f67284t));
        }
    }

    static final class I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67304n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ P f67305t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(P p2, Continuation continuation) {
            super(1, continuation);
            this.f67305t = p2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new I28(this.f67305t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f67304n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            P p2 = this.f67305t;
            this.f67304n = 1;
            Object objAwait = p2.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objAwait;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Ml implements Function2 {
        final /* synthetic */ P J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MutableState f67306O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f67307n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Dj7.s4 f67308r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f67309t;

        Ml(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, P p2, Dj7.s4 s4Var) {
            this.f67307n = mutableState;
            this.f67309t = mutableState2;
            this.f67306O = mutableState3;
            this.J2 = p2;
            this.f67308r = s4Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1249659846, i2, -1, "com.alightcreative.export.projectpackage.buildAndUploadProjectPackage.<anonymous> (BuildProjectPackage.kt:165)");
            }
            String strT = StringResources_androidKt.t(2132019904, composer, 6);
            String str = (String) this.f67307n.getValue();
            long jKN = ((aF1.j) composer.ty(aF1.w6.t())).KN();
            float fFloatValue = ((Number) this.f67309t.getValue()).floatValue();
            boolean zBooleanValue = ((Boolean) this.f67306O.getValue()).booleanValue();
            composer.eF(498808229);
            boolean zE2 = composer.E2(this.J2) | composer.E2(this.f67308r);
            final P p2 = this.J2;
            final Dj7.s4 s4Var = this.f67308r;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: gIX.l3D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return QJ.Ml.t(p2, s4Var);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            l4Z.J2(strT, fFloatValue, str, jKN, false, (Function0) objIF, zBooleanValue, composer, 0, 16);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(P p2, Dj7.s4 s4Var) {
            if (p2.isActive()) {
                xuv.j.rl(p2, null, 1, null);
                s4Var.n();
            }
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class Pl extends FunctionReferenceImpl implements Function1 {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f67310O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Activity f67311n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f67312r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ iF f67313t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Pl(Activity activity, iF iFVar, int i2, List list, long j2) {
            super(1, Intrinsics.Kotlin.class, "onFail", "buildAndUploadProjectPackageInternal$onFail(Landroid/app/Activity;Lcom/alightcreative/logging/EventLogger;ILjava/util/List;JLjava/lang/Throwable;)V", 0);
            this.f67311n = activity;
            this.f67313t = iFVar;
            this.f67310O = i2;
            this.J2 = list;
            this.f67312r = j2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void n(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            QJ.Ik(this.f67311n, this.f67313t, this.f67310O, this.J2, this.f67312r, p0);
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {
        final /* synthetic */ boolean E2;
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ MutableState f67314N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f67315O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ List f67316S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ Dj7.s4 f67317T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ int f67318X;
        final /* synthetic */ MutableState Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ List f67319Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ File f67320e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SceneThumbnailMaker f67321g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67322n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ kgE.fuX f67323o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ iF f67324r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f67325t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ MutableState f67326v;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(ComponentActivity componentActivity, String str, List list, iF iFVar, kgE.fuX fux, List list2, List list3, SceneThumbnailMaker sceneThumbnailMaker, boolean z2, File file, int i2, Dj7.s4 s4Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
            super(2, continuation);
            this.f67325t = componentActivity;
            this.f67315O = str;
            this.J2 = list;
            this.f67324r = iFVar;
            this.f67323o = fux;
            this.f67319Z = list2;
            this.f67316S = list3;
            this.f67321g = sceneThumbnailMaker;
            this.E2 = z2;
            this.f67320e = file;
            this.f67318X = i2;
            this.f67317T = s4Var;
            this.f67314N = mutableState;
            this.f67326v = mutableState2;
            this.Xw = mutableState3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit qie(MutableState mutableState) {
            mutableState.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Wre(this.f67325t, this.f67315O, this.J2, this.f67324r, this.f67323o, this.f67319Z, this.f67316S, this.f67321g, this.E2, this.f67320e, this.f67318X, this.f67317T, this.f67314N, this.f67326v, this.Xw, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objQie;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f67322n;
            try {
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        ComponentActivity componentActivity = this.f67325t;
                        String str = this.f67315O;
                        List list = this.J2;
                        iF iFVar = this.f67324r;
                        kgE.fuX fux = this.f67323o;
                        List list2 = this.f67319Z;
                        List list3 = this.f67316S;
                        SceneThumbnailMaker sceneThumbnailMaker = this.f67321g;
                        boolean z2 = this.E2;
                        File file = this.f67320e;
                        final MutableState mutableState = this.f67314N;
                        Function1 function1 = new Function1() { // from class: gIX.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return QJ.Wre.mUb(mutableState, ((Float) obj2).floatValue());
                            }
                        };
                        final MutableState mutableState2 = this.f67326v;
                        Function1 function12 = new Function1() { // from class: gIX.s4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return QJ.Wre.gh(mutableState2, (String) obj2);
                            }
                        };
                        final MutableState mutableState3 = this.Xw;
                        Function0 function0 = new Function0() { // from class: gIX.UGc
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return QJ.Wre.qie(mutableState3);
                            }
                        };
                        this.f67322n = 1;
                        objQie = QJ.qie(componentActivity, str, list, iFVar, fux, list2, list3, sceneThumbnailMaker, z2, file, function1, function12, function0, this);
                        if (objQie == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        objQie = obj;
                    }
                    return (gIX.C) objQie;
                } catch (CancellationException unused) {
                    iF iFVar2 = this.f67324r;
                    Integer numBoxInt = Boxing.boxInt(this.f67318X);
                    List list4 = this.J2;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ProjectInfo.n) it.next()).getId());
                    }
                    iFVar2.n(new QmE.fuX(numBoxInt, arrayList));
                    this.f67317T.n();
                    this.f67320e.delete();
                    return null;
                }
            } finally {
                this.f67317T.n();
                this.f67320e.delete();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit gh(MutableState mutableState, String str) {
            mutableState.setValue(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit mUb(MutableState mutableState, float f3) {
            mutableState.setValue(Float.valueOf(f3));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    /* synthetic */ class Xo extends FunctionReferenceImpl implements Function1 {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f67327O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Activity f67328n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f67329r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ iF f67330t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Xo(Activity activity, iF iFVar, int i2, List list, long j2) {
            super(1, Intrinsics.Kotlin.class, esLNYym.iBvqXXL, "buildAndUploadProjectPackageInternal$onFail(Landroid/app/Activity;Lcom/alightcreative/logging/EventLogger;ILjava/util/List;JLjava/lang/Throwable;)V", 0);
            this.f67328n = activity;
            this.f67330t = iFVar;
            this.f67327O = i2;
            this.J2 = list;
            this.f67329r = j2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void n(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            QJ.Ik(this.f67328n, this.f67330t, this.f67327O, this.J2, this.f67329r, p0);
        }
    }

    public static final class aC extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Iterable f67331O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67332n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f67333t;

        public static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Object f67334O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f67335n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f67336t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(Object obj, Continuation continuation) {
                super(2, continuation);
                this.f67334O = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f67334O, continuation);
                jVar.f67336t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f67335n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    com.google.firebase.storage.o oVar = (com.google.firebase.storage.o) this.f67334O;
                    this.f67335n = 1;
                    obj = wQ.eO.ck(oVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Uri) obj).toString();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((aC) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public aC(Iterable iterable, Continuation continuation) {
            super(2, continuation);
            this.f67331O = iterable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            aC aCVar = new aC(this.f67331O, continuation);
            aCVar.f67333t = obj;
            return aCVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f67332n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GJW.vd vdVar = (GJW.vd) this.f67333t;
            Iterable iterable = this.f67331O;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(GJW.C.rl(vdVar, null, null, new j(it.next(), null), 3, null));
            }
            this.f67332n = 1;
            Object objN = GJW.Wre.n(arrayList, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }
    }

    /* synthetic */ class eO extends FunctionReferenceImpl implements Function1 {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f67337O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Activity f67338n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f67339r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ iF f67340t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eO(Activity activity, iF iFVar, int i2, List list, long j2) {
            super(1, Intrinsics.Kotlin.class, "onFail", "buildAndUploadProjectPackageInternal$onFail(Landroid/app/Activity;Lcom/alightcreative/logging/EventLogger;ILjava/util/List;JLjava/lang/Throwable;)V", 0);
            this.f67338n = activity;
            this.f67340t = iFVar;
            this.f67337O = i2;
            this.J2 = list;
            this.f67339r = j2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void n(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            QJ.Ik(this.f67338n, this.f67340t, this.f67337O, this.J2, this.f67339r, p0);
        }
    }

    public static final class fuX implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ mCM.QJ f67341n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f67342t;

        public static final class Ml implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f67343n;

            public Ml(String str) {
                this.f67343n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "WrappedHttpsCallable: " + this.f67343n + " OUT";
            }
        }

        public static final class j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f67344n;

            public j(String str) {
                this.f67344n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "WrappedHttpsCallable: " + this.f67344n + " IN";
            }
        }

        public static final class n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f67345n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f67346t;

            public n(String str, String str2) {
                this.f67345n = str;
                this.f67346t = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "typedCall:" + this.f67345n + ": IN / " + this.f67346t;
            }
        }

        public static final class w6 implements com.google.android.gms.tasks.Continuation {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ mCM.QJ f67347n;
            final /* synthetic */ String nr;
            final /* synthetic */ JsonAdapter rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function1 f67348t;

            public static final class CN3 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67349n;

                public CN3(String str) {
                    this.f67349n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67349n + ": FAIL";
                }
            }

            public static final class I28 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67350n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Throwable f67351t;

                public I28(String str, Throwable th) {
                    this.f67350n = str;
                    this.f67351t = th;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67350n + ": Parse error! " + this.f67351t;
                }
            }

            public static final class Ml implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ String f67352O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67353n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f67354t;

                public Ml(String str, int i2, String str2) {
                    this.f67353n = str;
                    this.f67354t = i2;
                    this.f67352O = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67353n + ": RESPONSE: " + StringsKt.padStart$default(String.valueOf(this.f67354t), 4, (char) 0, 2, (Object) null) + ": " + this.f67352O;
                }
            }

            public static final class Wre implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67355n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f67356t;

                public Wre(String str, Object obj) {
                    this.f67355n = str;
                    this.f67356t = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67355n + ": RESULT: " + this.f67356t;
                }
            }

            public static final class j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67357n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Task f67358t;

                public j(String str, Task task) {
                    this.f67357n = str;
                    this.f67358t = task;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String message;
                    String str = this.f67357n;
                    Task task = this.f67358t;
                    boolean zIsSuccessful = task.isSuccessful();
                    boolean zIsCanceled = this.f67358t.isCanceled();
                    boolean zIsComplete = this.f67358t.isComplete();
                    Exception exception = this.f67358t.getException();
                    if (exception == null || (message = exception.getMessage()) == null) {
                        message = "NONE";
                    }
                    return "typedCall:" + str + ": CONTINUE (" + task + ") isSuccessful=" + zIsSuccessful + " isCanceled=" + zIsCanceled + " isComplete=" + zIsComplete + " exception=" + message;
                }
            }

            public static final class n implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67359n;

                public n(String str) {
                    this.f67359n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67359n + ": SUCCESS";
                }
            }

            /* JADX INFO: renamed from: gIX.QJ$fuX$w6$w6, reason: collision with other inner class name */
            public static final class C0942w6 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f67360n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f67361t;

                public C0942w6(String str, String str2) {
                    this.f67360n = str;
                    this.f67361t = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f67360n + ": RESPONSE: len=" + this.f67361t.length();
                }
            }

            public w6(mCM.QJ qj, JsonAdapter jsonAdapter, Function1 function1, String str) {
                this.f67347n = qj;
                this.rl = jsonAdapter;
                this.f67348t = function1;
                this.nr = str;
            }

            public final void n(Task task) {
                Intrinsics.checkNotNullParameter(task, "task");
                XoT.C.Uo(this.f67347n, new j(this.nr, task));
                if (task.isSuccessful()) {
                    mCM.l3D l3d = (mCM.l3D) task.getResult();
                    if (l3d == null) {
                        Function1 function1 = this.f67348t;
                        Result.Companion companion = Result.INSTANCE;
                        function1.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")))));
                        return;
                    }
                    XoT.C.Uo(this.f67347n, new n(this.nr));
                    Moshi moshiN = HI0.Lu.n();
                    Object obj = l3d.f70669n;
                    JsonAdapter jsonAdapterAdapter = moshiN.adapter(Object.class);
                    Intrinsics.checkNotNull(jsonAdapterAdapter);
                    JsonAdapter jsonAdapterIndent = jsonAdapterAdapter.indent("    ");
                    Intrinsics.checkNotNull(jsonAdapterIndent);
                    String json = jsonAdapterIndent.toJson(obj);
                    Intrinsics.checkNotNull(json);
                    XoT.C.Uo(this.f67347n, new C0942w6(this.nr, json));
                    Sequence<String> sequenceLineSequence = StringsKt.lineSequence(json);
                    mCM.QJ qj = this.f67347n;
                    String str = this.nr;
                    int i2 = 0;
                    for (String str2 : sequenceLineSequence) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        XoT.C.Uo(qj, new Ml(str, i2, str2));
                        i2 = i3;
                    }
                    try {
                        Object objFromJson = this.rl.fromJson(json);
                        XoT.C.Uo(this.f67347n, new Wre(this.nr, objFromJson));
                        if (objFromJson != null) {
                            this.f67348t.invoke(Result.m312boximpl(Result.m313constructorimpl(objFromJson)));
                            return;
                        }
                    } catch (Throwable th) {
                        XoT.C.Uo(this.f67347n, new I28(this.nr, th));
                        Function1 function12 = this.f67348t;
                        Result.Companion companion2 = Result.INSTANCE;
                        function12.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(th))));
                        return;
                    }
                }
                XoT.C.Uo(this.f67347n, new CN3(this.nr));
                Exception exception = task.getException();
                if (exception != null) {
                    Function1 function13 = this.f67348t;
                    Result.Companion companion3 = Result.INSTANCE;
                    function13.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(exception))));
                } else {
                    Function1 function14 = this.f67348t;
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

        public fuX(mCM.QJ qj, String str) {
            this.f67341n = qj;
            this.f67342t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n(obj, (Function1) obj2);
            return Unit.INSTANCE;
        }

        public final void n(Object obj, Function1 cb2) {
            Intrinsics.checkNotNullParameter(cb2, "cb");
            XoT.C.KN("WrappedHttpsCallable", new j(this.f67342t));
            mCM.QJ qj = this.f67341n;
            String str = this.f67342t;
            JsonAdapter jsonAdapterAdapter = HI0.Lu.n().adapter(ProjectPackageIDRequest.class);
            Intrinsics.checkNotNull(jsonAdapterAdapter);
            String json = jsonAdapterAdapter.toJson(obj);
            Intrinsics.checkNotNull(json);
            XoT.C.Uo(qj, new n(str, json));
            qj.rl(new JSONObject(json)).continueWith(new w6(qj, HI0.Lu.n().adapter(ProjectPackageIDResponse.class), cb2, str));
            XoT.C.KN("WrappedHttpsCallable", new Ml(this.f67342t));
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ Map J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Iterable f67362O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ long f67363Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67364n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f67365o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f67366r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f67367t;

        /* JADX INFO: renamed from: gIX.QJ$j$j, reason: collision with other inner class name */
        public static final class C0943j extends SuspendLambda implements Function2 {
            final /* synthetic */ Map J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Object f67368O;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ long f67369Z;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f67370n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ long f67371o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Function1 f67372r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f67373t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((C0943j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0943j(Object obj, Continuation continuation, Map map, Function1 function1, long j2, long j3) {
                super(2, continuation);
                this.f67368O = obj;
                this.J2 = map;
                this.f67372r = function1;
                this.f67371o = j2;
                this.f67369Z = j3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0943j c0943j = new C0943j(this.f67368O, continuation, this.J2, this.f67372r, this.f67371o, this.f67369Z);
                c0943j.f67373t = obj;
                return c0943j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f67370n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    com.google.firebase.storage.qf qfVar = (com.google.firebase.storage.qf) this.f67368O;
                    TFv.Wre wreTy = wQ.eO.ty(qfVar);
                    w6 w6Var = new w6(this.J2, qfVar, this.f67372r, this.f67371o, this.f67369Z);
                    this.f67370n = 1;
                    if (wreTy.n(w6Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Iterable iterable, Continuation continuation, Map map, Function1 function1, long j2, long j3) {
            super(2, continuation);
            this.f67362O = iterable;
            this.J2 = map;
            this.f67366r = function1;
            this.f67365o = j2;
            this.f67363Z = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f67362O, continuation, this.J2, this.f67366r, this.f67365o, this.f67363Z);
            jVar.f67367t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f67364n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GJW.vd vdVar = (GJW.vd) this.f67367t;
            Iterable iterable = this.f67362O;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(GJW.C.rl(vdVar, null, null, new C0943j(it.next(), null, this.J2, this.f67366r, this.f67365o, this.f67363Z), 3, null));
            }
            this.f67364n = 1;
            Object objN = GJW.Wre.n(arrayList, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f67374O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67375n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f67376t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67374O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return QJ.xMQ(null, 0L, 0L, null, null, this);
        }

        n(Continuation continuation) {
            super(continuation);
        }
    }

    static final class o extends SuspendLambda implements Function1 {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f67377O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67378n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ SceneThumbnailMaker f67379r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Activity f67380t;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ List J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ List f67381O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f67382n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ SceneThumbnailMaker f67383r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Activity f67384t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Activity activity, List list, List list2, SceneThumbnailMaker sceneThumbnailMaker, Continuation continuation) {
                super(2, continuation);
                this.f67384t = activity;
                this.f67381O = list;
                this.J2 = list2;
                this.f67383r = sceneThumbnailMaker;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f67384t, this.f67381O, this.J2, this.f67383r, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f67382n == 0) {
                    ResultKt.throwOnFailure(obj);
                    return h.n(this.f67384t, this.f67381O, this.J2, this.f67383r);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Activity activity, List list, List list2, SceneThumbnailMaker sceneThumbnailMaker, Continuation continuation) {
            super(1, continuation);
            this.f67380t = activity;
            this.f67377O = list;
            this.J2 = list2;
            this.f67379r = sceneThumbnailMaker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new o(this.f67380t, this.f67377O, this.J2, this.f67379r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f67378n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GJW.lej lejVarRl = OU.rl();
            j jVar = new j(this.f67380t, this.f67377O, this.J2, this.f67379r, null);
            this.f67378n = 1;
            Object objUo = GJW.Dsr.Uo(lejVarRl, jVar, this);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objUo;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((o) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class qz extends SuspendLambda implements Function2 {
        final /* synthetic */ File J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ HI0.Q f67385O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Activity f67386S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function1 f67387Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f67388g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67389n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f67390o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f67391r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LM.iwV f67392t;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit mUb(Function1 function1, int i2, int i3) {
            if (i3 < 1 || i2 < 1) {
                function1.invoke(Float.valueOf(0.0f));
            } else if (i2 >= i3) {
                function1.invoke(Float.valueOf(0.05f));
            } else {
                function1.invoke(Float.valueOf((i2 * 0.05f) / i3));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((qz) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        qz(LM.iwV iwv, HI0.Q q2, File file, long j2, Ref.BooleanRef booleanRef, Function1 function1, Activity activity, Function1 function12, Continuation continuation) {
            super(2, continuation);
            this.f67392t = iwv;
            this.f67385O = q2;
            this.J2 = file;
            this.f67391r = j2;
            this.f67390o = booleanRef;
            this.f67387Z = function1;
            this.f67386S = activity;
            this.f67388g = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(long j2, Ref.BooleanRef booleanRef, Function1 function1, Activity activity, long j3, long j4) {
            String str;
            if (j3 > j2 && !booleanRef.element) {
                booleanRef.element = true;
                String string = activity.getResources().getString(2132020402);
                if (j4 > j2) {
                    str = " (" + activity.getResources().getString(2132019606) + ")";
                } else {
                    str = "";
                }
                function1.invoke(string + str);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new qz(this.f67392t, this.f67385O, this.J2, this.f67391r, this.f67390o, this.f67387Z, this.f67386S, this.f67388g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f67389n == 0) {
                ResultKt.throwOnFailure(obj);
                LM.iwV iwv = this.f67392t;
                HI0.Q q2 = this.f67385O;
                File file = this.J2;
                final long j2 = this.f67391r;
                final Ref.BooleanRef booleanRef = this.f67390o;
                final Function1 function1 = this.f67387Z;
                final Activity activity = this.f67386S;
                Function2 function2 = new Function2() { // from class: gIX.Q
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return QJ.qz.xMQ(j2, booleanRef, function1, activity, ((Long) obj2).longValue(), ((Long) obj3).longValue());
                    }
                };
                final Function1 function12 = this.f67388g;
                return iwv.WPU(q2, file, function2, new Function2() { // from class: gIX.r
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return QJ.qz.mUb(function12, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                    }
                });
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class w6 implements TFv.CN3 {
        final /* synthetic */ long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f67393O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Map f67394n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f67395r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.storage.qf f67396t;

        w6(Map map, com.google.firebase.storage.qf qfVar, Function1 function1, long j2, long j3) {
            this.f67394n = map;
            this.f67396t = qfVar;
            this.f67393O = function1;
            this.J2 = j2;
            this.f67395r = j3;
        }

        @Override // TFv.CN3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object rl(qf.n nVar, Continuation continuation) {
            this.f67394n.put(this.f67396t, Boxing.boxLong(nVar.n()));
            this.f67393O.invoke(Boxing.boxFloat((((CollectionsKt.sumOfLong(this.f67394n.values()) + this.J2) * 0.95f) / this.f67395r) + 0.05f));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0b05 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0c66 A[LOOP:3: B:157:0x0c60->B:159:0x0c66, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0d61  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0d8e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0d91  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0e16 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0e19  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0ed2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0ee4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0f68  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0f71  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0f80  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0fb9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x102f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x1079 A[LOOP:2: B:227:0x1073->B:229:0x1079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x110c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x111c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x088e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object qie(Activity activity, String str, List list, iF iFVar, kgE.fuX fux, List list2, List list3, SceneThumbnailMaker sceneThumbnailMaker, boolean z2, File file, Function1 function1, Function1 function12, Function0 function0, Continuation continuation) throws Throwable {
        C c2;
        int i2;
        List list4;
        String str2;
        iF iFVar2;
        kgE.fuX fux2;
        Function1 function13;
        boolean z3;
        Object obj;
        int i3;
        int i5;
        List list5;
        File file2;
        Function1 function14;
        Function0 function02;
        Pair pair;
        int i7;
        String acctTestMode;
        Activity activity2;
        boolean z4;
        int i8;
        String str3;
        String str4;
        HI0.Q q2;
        Object obj2;
        Function1 function15;
        Function1 function16;
        Function0 function03;
        wQ.QJ qj;
        File file3;
        com.google.firebase.functions.n nVar;
        LM.iwV iwv;
        kgE.fuX fux3;
        iF iFVar3;
        List list6;
        Activity activity3;
        gIX.aC aCVar;
        int i9;
        Object obj3;
        wQ.QJ qj2;
        Lu lu;
        int i10;
        gIX.aC aCVar2;
        x0X.n nVar2;
        String str5;
        File file4;
        Activity activity4;
        Function1 function17;
        Object obj4;
        com.google.firebase.functions.n nVar3;
        int i11;
        gIX.aC aCVar3;
        wQ.QJ qj3;
        wQ.QJ qj4;
        Object obj5;
        String str6;
        int i12;
        gIX.aC aCVar4;
        Object objN;
        Set set;
        Object obj6;
        String str7;
        List list7;
        int i13;
        iF iFVar4;
        String str8;
        int i14;
        Lu lu2;
        wQ.QJ qj5;
        Object obj7;
        int i15;
        int i16;
        long j2;
        com.google.firebase.functions.n nVar4;
        final x0X.n nVar5;
        com.google.firebase.storage.o oVar;
        Activity activity5;
        gIX.aC aCVar5;
        List listEmptyList;
        List listEmptyList2;
        long length;
        C c4;
        int i17;
        long j3;
        com.google.firebase.storage.o oVar2;
        Object obj8;
        int i18;
        String str9;
        long j4;
        iF iFVar5;
        List list8;
        gIX.aC aCVar6;
        String str10;
        com.google.firebase.storage.o oVar3;
        int i19;
        com.google.firebase.functions.n nVar6;
        int i20;
        Activity activity6;
        long j5;
        Set set2;
        String str11;
        Object obj9;
        List list9;
        wQ.QJ qj6;
        Object obj10;
        iF iFVar6;
        List list10;
        long j6;
        int i21;
        Activity activity7;
        Activity activity8;
        Exception exc;
        iF iFVar7;
        List list11;
        long j7;
        int i22;
        Activity activity9;
        String str12;
        Set set3;
        String str13;
        String str14;
        com.google.firebase.storage.o oVar4;
        int i23;
        String str15;
        long j9;
        long j10;
        Object objJ2;
        Object obj11;
        iF iFVar8;
        int i24;
        iF iFVar9;
        List list12;
        long j11;
        String str16;
        String str17;
        String str18;
        List listListOf;
        long j12;
        long j13;
        Object obj12;
        com.google.firebase.storage.o oVar5;
        Function1 function18;
        Function0 function04;
        wQ.QJ qj7;
        String str19;
        gIX.aC aCVar7;
        Throwable cause;
        Iterator it;
        long j14;
        Function1 function19;
        Object objXMQ;
        long j15;
        C c5;
        SharedProjectPackageInfo sharedProjectPackageInfo;
        gIX.aC aCVar8;
        Object obj13;
        long j16;
        Activity activity10;
        List list13;
        Function0 function05;
        iF iFVar10;
        List list14;
        com.google.firebase.storage.o oVar6;
        String str20;
        String str21;
        wQ.QJ qj8;
        kgE.fuX fux4;
        int i25;
        com.google.firebase.functions.n nVar7;
        String str22;
        Activity activity11;
        iF iFVar11;
        int i26;
        gIX.aC aCVar9;
        long j17;
        List list15;
        SharedProjectPackageInfo sharedProjectPackageInfo2;
        Object obj14;
        Function0 function06;
        List list16;
        String str23;
        String str24;
        wQ.QJ qj9;
        List list17;
        Object obj15;
        Object obj16;
        int i27;
        com.google.firebase.functions.n nVarT;
        gIX.aC aCVar10;
        String str25;
        String str26;
        kgE.fuX fux5;
        long j18;
        String str27;
        Throwable th;
        String str28;
        List list18;
        String str29;
        List list19;
        long j19;
        String str30;
        iF iFVar12;
        Iterator it2;
        int i28;
        if (continuation instanceof C) {
            c2 = (C) continuation;
            int i29 = c2.f67254a;
            if ((i29 & Integer.MIN_VALUE) != 0) {
                c2.f67254a = i29 - Integer.MIN_VALUE;
            } else {
                c2 = new C(continuation);
            }
        }
        C c6 = c2;
        Object obj17 = c6.f67242D;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c6.f67254a) {
            case 0:
                ResultKt.throwOnFailure(obj17);
                if (list == null || !list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (((ProjectInfo.n) it3.next()).getType() != SceneType.PRESET) {
                            i2 = 0;
                            int i30 = i2 != 0 ? 2131361969 : 2131361970;
                            if (i2 == 0) {
                                if (sceneThumbnailMaker == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                list4 = list;
                                o oVar7 = new o(activity, list4, list2, sceneThumbnailMaker, null);
                                c6.f67257n = activity;
                                str2 = str;
                                c6.f67260t = str2;
                                c6.f67248O = list4;
                                iFVar2 = iFVar;
                                c6.J2 = iFVar2;
                                fux2 = fux;
                                c6.f67259r = fux2;
                                c6.f67258o = list3;
                                c6.f67253Z = file;
                                function13 = function1;
                                c6.f67249S = function13;
                                c6.f67256g = function12;
                                c6.E2 = function0;
                                c6.M7 = z2;
                                c6.p5 = i2;
                                c6.eF = i30;
                                c6.f67254a = 1;
                                Object objUo = x0X.w6.Uo(oVar7, c6);
                                if (objUo != coroutine_suspended) {
                                    z3 = z2;
                                    obj = objUo;
                                    i3 = i2;
                                    i5 = i30;
                                    list5 = list3;
                                    file2 = file;
                                    function14 = function12;
                                    function02 = function0;
                                    nVar2 = (x0X.n) obj;
                                    boolean z5 = z3;
                                    if (!(nVar2 instanceof n.C1266n)) {
                                        Throwable th2 = (Throwable) ((n.C1266n) nVar2).n();
                                        Integer numBoxInt = Boxing.boxInt(i5);
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                                        Iterator it4 = list4.iterator();
                                        while (it4.hasNext()) {
                                            arrayList.add(((ProjectInfo.n) it4.next()).getId());
                                        }
                                        String message = th2.getMessage();
                                        if (message == null) {
                                            message = th2.getLocalizedMessage();
                                        }
                                        iFVar2.n(new QmE.aC(numBoxInt, arrayList, new IllegalStateException(message)));
                                        throw th2;
                                    }
                                    if (!(nVar2 instanceof n.w6)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pair = (Pair) ((n.w6) nVar2).n();
                                    i7 = i5;
                                    activity2 = activity;
                                    z4 = z5;
                                    acctTestMode = "normal";
                                    i8 = i3;
                                    str3 = "projectCount";
                                    Lu lu3 = (Lu) pair.component1();
                                    str4 = "uploadSize";
                                    gIX.aC aCVar11 = (gIX.aC) pair.component2();
                                    if (!z4) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                            str2 = str;
                            list4 = list;
                            iFVar2 = iFVar;
                            fux2 = fux;
                            function13 = function1;
                            function14 = function12;
                            function02 = function0;
                            pair = TuplesKt.to(null, null);
                            i7 = i30;
                            acctTestMode = "normal";
                            activity2 = activity;
                            list5 = list3;
                            z4 = z2;
                            i8 = i2;
                            file2 = file;
                            str3 = "projectCount";
                            Lu lu32 = (Lu) pair.component1();
                            str4 = "uploadSize";
                            gIX.aC aCVar112 = (gIX.aC) pair.component2();
                            if (!z4) {
                                c6.f67257n = aCVar112;
                                c6.f67260t = null;
                                c6.f67248O = null;
                                c6.J2 = null;
                                c6.f67259r = null;
                                c6.f67258o = null;
                                c6.f67253Z = null;
                                c6.f67249S = null;
                                c6.f67256g = null;
                                c6.E2 = null;
                                c6.f67254a = 2;
                                if (vd.n(function13, c6) != coroutine_suspended) {
                                    aCVar2 = aCVar112;
                                    return new gIX.C("alight.link/sample", false, false, 0L, "", aCVar2);
                                }
                                return coroutine_suspended;
                            }
                            n.j jVar = com.google.firebase.functions.n.mUb;
                            com.google.firebase.functions.n nVarT2 = jVar.t();
                            int i31 = i7;
                            int i32 = i8;
                            wQ.QJ qj10 = new wQ.QJ("makeAMProjectPackageId", new fuX(jVar.t().ck("makeAMProjectPackageId"), "makeAMProjectPackageId"));
                            wQ.QJ qj11 = new wQ.QJ("registerAMProjectPackage", new Dsr(jVar.t().ck("registerAMProjectPackage"), "registerAMProjectPackage"));
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                            Iterator it5 = list4.iterator();
                            while (it5.hasNext()) {
                                arrayList2.add(((ProjectInfo.n) it5.next()).getId());
                            }
                            LM.iwV iwv2 = new LM.iwV(activity2, arrayList2);
                            HI0.Q q3 = new HI0.Q(activity2);
                            c6.f67257n = activity2;
                            c6.f67260t = str2;
                            c6.f67248O = list4;
                            c6.J2 = iFVar2;
                            c6.f67259r = fux2;
                            c6.f67258o = list5;
                            c6.f67253Z = file2;
                            c6.f67249S = function13;
                            c6.f67256g = function14;
                            c6.E2 = function02;
                            c6.f67255e = lu32;
                            c6.f67252X = aCVar112;
                            Activity activity12 = activity2;
                            c6.f67250T = nVarT2;
                            c6.f67247N = qj10;
                            c6.f67261v = qj11;
                            c6.Xw = iwv2;
                            c6.jB = q3;
                            c6.p5 = i32;
                            c6.eF = i31;
                            c6.f67254a = 3;
                            Object objS = iwv2.S(q3, c6);
                            q2 = q3;
                            obj2 = coroutine_suspended;
                            if (objS != obj2) {
                                function15 = function13;
                                function16 = function14;
                                function03 = function02;
                                qj = qj10;
                                file3 = file2;
                                nVar = nVarT2;
                                iwv = iwv2;
                                fux3 = fux2;
                                iFVar3 = iFVar2;
                                list6 = list4;
                                activity3 = activity12;
                                aCVar = aCVar112;
                                i9 = i32;
                                obj3 = objS;
                                qj2 = qj11;
                                lu = lu32;
                                i10 = i31;
                                final String str31 = (String) obj3;
                                Object obj18 = obj2;
                                XoT.C.Uo(activity3, new Function0() { // from class: gIX.qz
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return QJ.az(str31);
                                    }
                                });
                                str5 = (String) f67240n.get(str31);
                                if (str5 == null) {
                                    return new gIX.C(str5, false, false, 0L, "", aCVar);
                                }
                                gIX.aC aCVar12 = aCVar;
                                long projectPackageFreeUserMaxDownloadSize = com.alightcreative.app.motion.persist.j.INSTANCE.getProjectPackageFreeUserMaxDownloadSize();
                                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                                Activity activity13 = activity3;
                                GJW.lej lejVarRl = OU.rl();
                                qz qzVar = new qz(iwv, q2, file3, projectPackageFreeUserMaxDownloadSize, booleanRef, function16, activity13, function15, null);
                                int i33 = i10;
                                int i34 = i9;
                                file4 = file3;
                                activity4 = activity13;
                                function17 = function15;
                                c6.f67257n = activity4;
                                c6.f67260t = str2;
                                c6.f67248O = list6;
                                c6.J2 = iFVar3;
                                c6.f67259r = fux3;
                                c6.f67258o = list5;
                                c6.f67253Z = file4;
                                c6.f67249S = function17;
                                c6.f67256g = function03;
                                c6.E2 = lu;
                                c6.f67255e = aCVar12;
                                c6.f67252X = nVar;
                                c6.f67250T = qj;
                                c6.f67247N = qj2;
                                c6.f67261v = str31;
                                c6.Xw = null;
                                c6.jB = null;
                                c6.p5 = i34;
                                wQ.QJ qj12 = qj2;
                                c6.eF = i33;
                                c6.f67254a = 4;
                                Object objUo2 = GJW.Dsr.Uo(lejVarRl, qzVar, c6);
                                obj2 = obj18;
                                if (objUo2 != obj2) {
                                    obj4 = objUo2;
                                    nVar3 = nVar;
                                    i11 = i33;
                                    aCVar3 = aCVar12;
                                    qj3 = qj;
                                    qj4 = qj12;
                                    obj5 = obj2;
                                    str6 = str31;
                                    i12 = i34;
                                    Pair pair2 = (Pair) obj4;
                                    int i35 = i12;
                                    Set set4 = (Set) pair2.component1();
                                    int iIntValue = ((Number) pair2.component2()).intValue();
                                    wQ.QJ qj13 = qj4;
                                    long length2 = file4.length();
                                    String str32 = str6;
                                    com.google.firebase.functions.n nVar8 = nVar3;
                                    gIX.aC aCVar13 = aCVar3;
                                    PackageInfo packageInfo = activity4.getPackageManager().getPackageInfo(activity4.getPackageName(), 0);
                                    Pair pair3 = TuplesKt.to(packageInfo.versionName, Boxing.boxInt(packageInfo.versionCode));
                                    String str33 = (String) pair3.component1();
                                    int iIntValue2 = ((Number) pair3.component2()).intValue();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong(str4, length2);
                                    bundle.putInt(str3, list6.size());
                                    Unit unit = Unit.INSTANCE;
                                    iFVar3.n(new j.fuX("share_projectpkg_begin_upload", bundle));
                                    XoT.C.Uo(activity4, new Function0() { // from class: gIX.Pl
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return QJ.ty();
                                        }
                                    });
                                    ProjectPackageIDRequest projectPackageIDRequest = new ProjectPackageIDRequest(length2, !fux3.rl() ? com.alightcreative.app.motion.persist.j.INSTANCE.getAcctTestMode() : acctTestMode);
                                    c6.f67257n = activity4;
                                    c6.f67260t = str2;
                                    c6.f67248O = list6;
                                    c6.J2 = iFVar3;
                                    c6.f67259r = fux3;
                                    c6.f67258o = list5;
                                    c6.f67253Z = file4;
                                    c6.f67249S = function17;
                                    c6.f67256g = function03;
                                    c6.E2 = lu;
                                    aCVar4 = aCVar13;
                                    c6.f67255e = aCVar4;
                                    c6.f67252X = nVar8;
                                    c6.f67250T = qj13;
                                    c6.f67247N = str32;
                                    c6.f67261v = set4;
                                    c6.Xw = str33;
                                    c6.p5 = i35;
                                    c6.eF = i11;
                                    c6.f67243E = iIntValue;
                                    c6.f67244FX = length2;
                                    c6.f67246M = iIntValue2;
                                    c6.f67254a = 5;
                                    objN = qj3.n(projectPackageIDRequest, c6);
                                    obj2 = obj5;
                                    if (objN != obj2) {
                                        List list20 = list6;
                                        set = set4;
                                        obj6 = objN;
                                        str7 = str33;
                                        list7 = list20;
                                        i13 = iIntValue;
                                        iFVar4 = iFVar3;
                                        str8 = str32;
                                        i14 = iIntValue2;
                                        lu2 = lu;
                                        qj5 = qj13;
                                        obj7 = obj2;
                                        i15 = i35;
                                        i16 = i11;
                                        j2 = length2;
                                        nVar4 = nVar8;
                                        nVar5 = (x0X.n) obj6;
                                        int i36 = i15;
                                        XoT.C.Uo(activity4, new Function0() { // from class: gIX.Xo
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return QJ.HI(nVar5);
                                            }
                                        });
                                        if (!x0X.w6.O(nVar5)) {
                                            Throwable exc2 = (Throwable) x0X.w6.rl(nVar5);
                                            if (exc2 == null) {
                                                exc2 = new Exception("Failed to generate link");
                                            }
                                            Ik(activity4, iFVar4, i16, list7, j2, exc2);
                                            return null;
                                        }
                                        iF iFVar13 = iFVar4;
                                        long j20 = j2;
                                        int i37 = i16;
                                        List list21 = list7;
                                        ProjectPackageIDResponse projectPackageIDResponse = (ProjectPackageIDResponse) x0X.w6.nr(nVar5);
                                        if (projectPackageIDResponse == null) {
                                            return null;
                                        }
                                        if (!Intrinsics.areEqual(projectPackageIDResponse.getResult(), "success") || projectPackageIDResponse.getPackageId() == null) {
                                            Activity activity14 = activity4;
                                            String errorMessage = projectPackageIDResponse.getErrorMessage();
                                            if (errorMessage == null && (errorMessage = projectPackageIDResponse.getErrorCode()) == null) {
                                                errorMessage = "Unknown Server Error";
                                            }
                                            Ik(activity14, iFVar13, i37, list21, j20, new Exception(errorMessage));
                                            return null;
                                        }
                                        String packageId = projectPackageIDResponse.getPackageId();
                                        String str34 = str7;
                                        com.google.firebase.storage.o oVarRl = com.google.firebase.storage.I28.J2().ty().rl(AppLovinEventTypes.USER_SHARED_LINK);
                                        Intrinsics.checkNotNullExpressionValue(oVarRl, "child(...)");
                                        com.google.firebase.storage.o oVarIk = wQ.eO.Ik(oVarRl, str2, packageId);
                                        final com.google.firebase.storage.o oVarRl2 = oVarIk.rl("projectfiles.zip");
                                        Intrinsics.checkNotNullExpressionValue(oVarRl2, "child(...)");
                                        Set set5 = set;
                                        com.google.firebase.storage.o oVarRl3 = oVarIk.rl("meta.json");
                                        Intrinsics.checkNotNullExpressionValue(oVarRl3, "child(...)");
                                        com.google.firebase.storage.o oVarRl4 = oVarIk.rl("thumb-large.jpg");
                                        Intrinsics.checkNotNullExpressionValue(oVarRl4, "child(...)");
                                        String str35 = str8;
                                        com.google.firebase.storage.o oVarRl5 = oVarIk.rl("thumb-med.jpg");
                                        Intrinsics.checkNotNullExpressionValue(oVarRl5, "child(...)");
                                        wQ.QJ qj14 = qj5;
                                        com.google.firebase.storage.o oVarRl6 = oVarIk.rl("thumb-small.jpg");
                                        Intrinsics.checkNotNullExpressionValue(oVarRl6, "child(...)");
                                        com.google.firebase.functions.n nVar9 = nVar4;
                                        com.google.firebase.storage.o oVarRl7 = oVarIk.rl("thumb-tiny.jpg");
                                        Intrinsics.checkNotNullExpressionValue(oVarRl7, "child(...)");
                                        XoT.C.Uo(activity4, new Function0() { // from class: gIX.eO
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return QJ.ck(oVarRl2);
                                            }
                                        });
                                        if (lu2 != null) {
                                            com.google.firebase.storage.qf qfVarR = oVarRl4.r(lu2.n());
                                            Intrinsics.checkNotNullExpressionValue(qfVarR, "putBytes(...)");
                                            activity5 = activity4;
                                            com.google.firebase.storage.qf qfVarR2 = oVarRl5.r(lu2.rl());
                                            Intrinsics.checkNotNullExpressionValue(qfVarR2, "putBytes(...)");
                                            oVar = oVarRl2;
                                            com.google.firebase.storage.qf qfVarR3 = oVarRl6.r(lu2.t());
                                            Intrinsics.checkNotNullExpressionValue(qfVarR3, "putBytes(...)");
                                            aCVar5 = aCVar4;
                                            com.google.firebase.storage.qf qfVarR4 = oVarRl7.r(lu2.nr());
                                            Intrinsics.checkNotNullExpressionValue(qfVarR4, "putBytes(...)");
                                            listEmptyList = CollectionsKt.listOf((Object[]) new com.google.firebase.storage.qf[]{qfVarR, qfVarR2, qfVarR3, qfVarR4});
                                            listEmptyList2 = CollectionsKt.listOf((Object[]) new com.google.firebase.storage.o[]{oVarRl4, oVarRl5, oVarRl6, oVarRl7});
                                            length = lu2.n().length + lu2.rl().length + lu2.t().length + lu2.nr().length;
                                        } else {
                                            oVar = oVarRl2;
                                            activity5 = activity4;
                                            aCVar5 = aCVar4;
                                            listEmptyList = CollectionsKt.emptyList();
                                            listEmptyList2 = CollectionsKt.emptyList();
                                            length = 0;
                                        }
                                        List list22 = listEmptyList2;
                                        List list23 = listEmptyList;
                                        long j21 = length + j20;
                                        Activity activity15 = activity5;
                                        Xo xo = new Xo(activity15, iFVar13, i37, list21, j20);
                                        c6.f67257n = activity15;
                                        c6.f67260t = str2;
                                        c6.f67248O = list21;
                                        c6.J2 = iFVar13;
                                        c6.f67259r = fux3;
                                        c6.f67258o = list5;
                                        c6.f67253Z = file4;
                                        c6.f67249S = function17;
                                        c6.f67256g = function03;
                                        c6.E2 = aCVar5;
                                        c6.f67255e = nVar9;
                                        c6.f67252X = qj14;
                                        c6.f67250T = str35;
                                        c6.f67247N = set5;
                                        c6.f67261v = str34;
                                        c6.Xw = packageId;
                                        c6.jB = oVar;
                                        c6.f67251U = oVarRl3;
                                        c6.P5 = list22;
                                        c6.p5 = i36;
                                        c6.eF = i37;
                                        int i38 = i13;
                                        c6.f67243E = i38;
                                        c6.f67244FX = j20;
                                        c6.f67246M = i14;
                                        c6.f67241B = length;
                                        c6.f67245J = j21;
                                        c6.f67254a = 6;
                                        Object objXMQ2 = xMQ(list23, 0L, j21, function17, xo, c6);
                                        c4 = c6;
                                        Object obj19 = obj7;
                                        if (objXMQ2 == obj19) {
                                            return obj19;
                                        }
                                        i17 = i36;
                                        j3 = j20;
                                        oVar2 = oVarRl3;
                                        obj8 = objXMQ2;
                                        i18 = i14;
                                        str9 = packageId;
                                        j4 = length;
                                        iFVar5 = iFVar13;
                                        list8 = list22;
                                        aCVar6 = aCVar5;
                                        str10 = str35;
                                        oVar3 = oVar;
                                        i19 = i37;
                                        nVar6 = nVar9;
                                        i20 = i38;
                                        activity6 = activity15;
                                        j5 = j21;
                                        set2 = set5;
                                        str11 = str34;
                                        obj9 = obj19;
                                        list9 = list21;
                                        qj6 = qj14;
                                        if (((Boolean) obj8).booleanValue()) {
                                            return null;
                                        }
                                        String str36 = str10;
                                        if (i17 != 0) {
                                            iFVar9 = iFVar5;
                                            list12 = list9;
                                            i24 = i18;
                                            j11 = j3;
                                            str16 = str36;
                                            str17 = str9;
                                            str18 = str2;
                                            listListOf = CollectionsKt.listOf((Object[]) new Void[]{null, null, null, null});
                                            j12 = j4;
                                            i23 = i20;
                                            j13 = j5;
                                            obj12 = obj9;
                                            activity7 = activity6;
                                            oVar5 = oVar3;
                                            function18 = function17;
                                            function04 = function03;
                                            qj7 = qj6;
                                            str19 = str11;
                                            aCVar7 = aCVar6;
                                            com.google.firebase.storage.o oVar8 = oVar2;
                                            List list24 = list5;
                                            String str37 = (String) listListOf.get(0);
                                            String str38 = (String) listListOf.get(1);
                                            String str39 = (String) listListOf.get(2);
                                            String str40 = (String) listListOf.get(3);
                                            String str41 = str19 + " (" + i24 + ")";
                                            String title = ((ProjectInfo.n) CollectionsKt.first(list12)).getTitle();
                                            if (list12.size() > 1) {
                                                title = title + " (+" + (list12.size() - 1) + ")";
                                            }
                                            String str42 = title;
                                            String packageName = activity7.getPackageName();
                                            List list25 = CollectionsKt.toList(set2);
                                            Timestamp timestampT = Timestamp.INSTANCE.t();
                                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list12, 10));
                                            it = list12.iterator();
                                            while (it.hasNext()) {
                                                ProjectInfo.n nVar10 = (ProjectInfo.n) it.next();
                                                Iterator it6 = it;
                                                String title2 = nVar10.getTitle();
                                                long fileSize = nVar10.getFileSize();
                                                wQ.QJ qj15 = qj7;
                                                String lowerCase = nVar10.getType().name().toLowerCase(Locale.ROOT);
                                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                                arrayList3.add(new SharedProjectInfo(title2, fileSize, lowerCase));
                                                it = it6;
                                                list12 = list12;
                                                nVar6 = nVar6;
                                                qj7 = qj15;
                                            }
                                            wQ.QJ qj16 = qj7;
                                            com.google.firebase.functions.n nVar11 = nVar6;
                                            List list26 = list12;
                                            SharedProjectPackageInfo sharedProjectPackageInfo3 = new SharedProjectPackageInfo(1028425, "5.0.273.1028425", str41, AppLovinBridge.f61290h, list25, Boxing.boxInt(i23), str42, str37, str38, str39, str40, packageName, null, timestampT, j11, null, arrayList3);
                                            JsonAdapter jsonAdapterAdapter = HI0.Lu.n().adapter(SharedProjectPackageInfo.class);
                                            Intrinsics.checkNotNull(jsonAdapterAdapter);
                                            String json = jsonAdapterAdapter.toJson(sharedProjectPackageInfo3);
                                            Intrinsics.checkNotNull(json);
                                            byte[] bytes = json.getBytes(Charsets.UTF_8);
                                            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                                            List listListOf2 = CollectionsKt.listOf(oVar8.r(bytes));
                                            Activity activity16 = activity7;
                                            int i39 = i19;
                                            long j22 = j11;
                                            Pl pl = new Pl(activity16, iFVar9, i39, list26, j22);
                                            iF iFVar14 = iFVar9;
                                            j14 = j22;
                                            c4.f67257n = activity16;
                                            c4.f67260t = str18;
                                            c4.f67248O = list26;
                                            c4.J2 = iFVar14;
                                            c4.f67259r = fux3;
                                            c4.f67258o = list24;
                                            c4.f67253Z = file4;
                                            c4.f67249S = function18;
                                            c4.f67256g = function04;
                                            c4.E2 = aCVar7;
                                            String str43 = str18;
                                            c4.f67255e = nVar11;
                                            c4.f67252X = qj16;
                                            c4.f67250T = str16;
                                            c4.f67247N = str17;
                                            com.google.firebase.storage.o oVar9 = oVar5;
                                            c4.f67261v = oVar9;
                                            c4.Xw = sharedProjectPackageInfo3;
                                            c4.jB = null;
                                            c4.f67251U = null;
                                            c4.P5 = null;
                                            c4.p5 = i39;
                                            c4.f67244FX = j14;
                                            function19 = function18;
                                            long j23 = j12;
                                            c4.f67241B = j23;
                                            long j24 = j13;
                                            c4.f67245J = j24;
                                            c4.f67254a = 8;
                                            C c7 = c4;
                                            objXMQ = xMQ(listListOf2, j23, j24, function19, pl, c7);
                                            j15 = j23;
                                            c5 = c7;
                                            obj2 = obj12;
                                            if (objXMQ != obj2) {
                                                gIX.aC aCVar14 = aCVar7;
                                                sharedProjectPackageInfo = sharedProjectPackageInfo3;
                                                aCVar8 = aCVar14;
                                                obj13 = objXMQ;
                                                j16 = j24;
                                                activity10 = activity16;
                                                list13 = list26;
                                                function05 = function04;
                                                iFVar10 = iFVar14;
                                                list14 = list24;
                                                oVar6 = oVar9;
                                                str20 = str17;
                                                str21 = str16;
                                                qj8 = qj16;
                                                fux4 = fux3;
                                                i25 = i39;
                                                nVar7 = nVar11;
                                                str22 = str43;
                                                Function1 function110 = function19;
                                                if (((Boolean) obj13).booleanValue()) {
                                                    return null;
                                                }
                                                long j25 = j14;
                                                List listListOf3 = CollectionsKt.listOf(oVar6.o(new FileInputStream(file4)));
                                                int i40 = i25;
                                                eO eOVar = new eO(activity10, iFVar10, i40, list13, j25);
                                                activity11 = activity10;
                                                iFVar11 = iFVar10;
                                                i26 = i40;
                                                List list27 = list13;
                                                c5.f67257n = activity11;
                                                c5.f67260t = str22;
                                                c5.f67248O = list27;
                                                c5.J2 = iFVar11;
                                                c5.f67259r = fux4;
                                                c5.f67258o = list14;
                                                c5.f67253Z = function05;
                                                c5.f67249S = aCVar8;
                                                c5.f67256g = nVar7;
                                                c5.E2 = qj8;
                                                c5.f67255e = str21;
                                                c5.f67252X = str20;
                                                c5.f67250T = sharedProjectPackageInfo;
                                                wQ.QJ qj17 = qj8;
                                                c5.f67247N = null;
                                                c5.f67261v = null;
                                                c5.Xw = null;
                                                c5.p5 = i26;
                                                c5.f67244FX = j25;
                                                String str44 = str21;
                                                c5.f67254a = 9;
                                                Object objXMQ3 = xMQ(listListOf3, j15, j16, function110, eOVar, c5);
                                                if (objXMQ3 != obj2) {
                                                    SharedProjectPackageInfo sharedProjectPackageInfo4 = sharedProjectPackageInfo;
                                                    aCVar9 = aCVar8;
                                                    j17 = j25;
                                                    list15 = list27;
                                                    sharedProjectPackageInfo2 = sharedProjectPackageInfo4;
                                                    obj14 = objXMQ3;
                                                    function06 = function05;
                                                    list16 = list14;
                                                    str23 = str44;
                                                    str24 = str20;
                                                    qj9 = qj17;
                                                    if (((Boolean) obj14).booleanValue()) {
                                                        return null;
                                                    }
                                                    function06.invoke();
                                                    Object obj20 = obj2;
                                                    StringBuilder sb = new StringBuilder();
                                                    wQ.QJ qj18 = qj9;
                                                    sb.append(d.f62220u);
                                                    sb.append("alightcreative.com");
                                                    sb.append("/am/share/u/");
                                                    sb.append(str22);
                                                    sb.append("/p/");
                                                    sb.append(str24);
                                                    String string = sb.toString();
                                                    SharedProjectPackageInfo sharedProjectPackageInfoCopy = sharedProjectPackageInfo2.copy((126975 & 1) != 0 ? sharedProjectPackageInfo2.amVersionCode : 0, (126975 & 2) != 0 ? sharedProjectPackageInfo2.amVersionString : null, (126975 & 4) != 0 ? sharedProjectPackageInfo2.amPackageVersion : null, (126975 & 8) != 0 ? sharedProjectPackageInfo2.amPlatform : null, (126975 & 16) != 0 ? sharedProjectPackageInfo2.requiredEffects : null, (126975 & 32) != 0 ? sharedProjectPackageInfo2.maxFFVer : null, (126975 & 64) != 0 ? sharedProjectPackageInfo2.title : null, (126975 & 128) != 0 ? sharedProjectPackageInfo2.largeThumbUrl : null, (126975 & 256) != 0 ? sharedProjectPackageInfo2.medThumbUrl : null, (126975 & 512) != 0 ? sharedProjectPackageInfo2.smallThumbUrl : null, (126975 & 1024) != 0 ? sharedProjectPackageInfo2.tinyThumbUrl : null, (126975 & 2048) != 0 ? sharedProjectPackageInfo2.amPackageId : null, (126975 & 4096) != 0 ? sharedProjectPackageInfo2.shortLink : string, (126975 & 8192) != 0 ? sharedProjectPackageInfo2.shareDate : null, (126975 & 16384) != 0 ? sharedProjectPackageInfo2.size : 0L, (126975 & 32768) != 0 ? sharedProjectPackageInfo2.unavailableNotice : null, (126975 & 65536) != 0 ? sharedProjectPackageInfo2.projects : null);
                                                    long j26 = j17;
                                                    RegisterAMProjectPackageRequest registerAMProjectPackageRequest = new RegisterAMProjectPackageRequest(sharedProjectPackageInfoCopy, str24, fux4.rl() ? com.alightcreative.app.motion.persist.j.INSTANCE.getAcctTestMode() : acctTestMode);
                                                    c5.f67257n = activity11;
                                                    c5.f67260t = str22;
                                                    c5.f67248O = list15;
                                                    c5.J2 = iFVar11;
                                                    c5.f67259r = fux4;
                                                    c5.f67258o = list16;
                                                    c5.f67253Z = aCVar9;
                                                    c5.f67249S = nVar7;
                                                    c5.f67256g = str23;
                                                    c5.E2 = str24;
                                                    c5.f67255e = string;
                                                    c5.f67252X = null;
                                                    c5.f67250T = null;
                                                    c5.p5 = i26;
                                                    list17 = list15;
                                                    c5.f67244FX = j26;
                                                    c5.f67254a = 10;
                                                    Object objN2 = qj18.n(registerAMProjectPackageRequest, c5);
                                                    obj15 = obj20;
                                                    if (objN2 == obj15) {
                                                        return obj15;
                                                    }
                                                    obj16 = objN2;
                                                    i27 = i26;
                                                    nVarT = nVar7;
                                                    aCVar10 = aCVar9;
                                                    str25 = str23;
                                                    str26 = str24;
                                                    fux5 = fux4;
                                                    j18 = j26;
                                                    str27 = string;
                                                    th = (Throwable) x0X.w6.rl((x0X.n) obj16);
                                                    if (th == null) {
                                                        Ik(activity11, iFVar11, i27, list17, j18, th);
                                                        return null;
                                                    }
                                                    long j27 = j18;
                                                    if (nVarT == null) {
                                                        nVarT = com.google.firebase.functions.n.mUb.t();
                                                    }
                                                    kgE.fuX fux6 = fux5;
                                                    String str45 = str26;
                                                    wQ.QJ qj19 = new wQ.QJ("getProjectMetadata", new CN3(nVarT.ck("getProjectMetadata"), "getProjectMetadata"));
                                                    if (fux6.rl()) {
                                                        acctTestMode = com.alightcreative.app.motion.persist.j.INSTANCE.getAcctTestMode();
                                                    }
                                                    AlightLinkMetadataRequest alightLinkMetadataRequest = new AlightLinkMetadataRequest(str22, str45, AppLovinBridge.f61290h, 1028425, acctTestMode);
                                                    str28 = str45;
                                                    c5.f67257n = list17;
                                                    c5.f67260t = iFVar11;
                                                    c5.f67248O = list16;
                                                    c5.J2 = aCVar10;
                                                    c5.f67259r = str25;
                                                    c5.f67258o = str28;
                                                    c5.f67253Z = str27;
                                                    c5.f67249S = null;
                                                    c5.f67256g = null;
                                                    c5.E2 = null;
                                                    c5.f67255e = null;
                                                    c5.p5 = i27;
                                                    c5.f67244FX = j27;
                                                    c5.f67254a = 11;
                                                    Object objN3 = qj19.n(alightLinkMetadataRequest, c5);
                                                    if (objN3 == obj15) {
                                                        return obj15;
                                                    }
                                                    list18 = list16;
                                                    obj17 = objN3;
                                                    str29 = str27;
                                                    list19 = list17;
                                                    j19 = j27;
                                                    str30 = str25;
                                                    iFVar12 = iFVar11;
                                                }
                                            }
                                        } else {
                                            String str46 = str9;
                                            try {
                                                try {
                                                    try {
                                                        aC aCVar15 = new aC(list8, null);
                                                        c4.f67257n = activity6;
                                                        c4.f67260t = str2;
                                                        c4.f67248O = list9;
                                                        c4.J2 = iFVar5;
                                                        c4.f67259r = fux3;
                                                        c4.f67258o = list5;
                                                        c4.f67253Z = file4;
                                                        c4.f67249S = function17;
                                                        c4.f67256g = function03;
                                                        c4.E2 = aCVar6;
                                                        c4.f67255e = nVar6;
                                                        c4.f67252X = qj6;
                                                        str12 = str36;
                                                        c4.f67250T = str12;
                                                        set3 = set2;
                                                        c4.f67247N = set3;
                                                        activity8 = activity6;
                                                        String str47 = str11;
                                                        try {
                                                            c4.f67261v = str47;
                                                            str13 = str47;
                                                            c4.Xw = str46;
                                                            str14 = str46;
                                                            com.google.firebase.storage.o oVar10 = oVar3;
                                                            c4.jB = oVar10;
                                                            oVar4 = oVar10;
                                                            com.google.firebase.storage.o oVar11 = oVar2;
                                                            c4.f67251U = oVar11;
                                                            oVar2 = oVar11;
                                                            c4.P5 = null;
                                                            int i41 = i19;
                                                            try {
                                                                c4.p5 = i41;
                                                                i19 = i41;
                                                                int i42 = i20;
                                                                c4.eF = i42;
                                                                i23 = i42;
                                                                str15 = str2;
                                                                long j28 = j3;
                                                                try {
                                                                    c4.f67244FX = j28;
                                                                    j3 = j28;
                                                                    int i43 = i18;
                                                                    c4.f67243E = i43;
                                                                    long j29 = j4;
                                                                    c4.f67241B = j29;
                                                                    j9 = j29;
                                                                    long j30 = j5;
                                                                    c4.f67245J = j30;
                                                                    j10 = j30;
                                                                    c4.f67254a = 7;
                                                                    objJ2 = GJW.Lu.J2(aCVar15, c4);
                                                                    obj11 = obj9;
                                                                    if (objJ2 == obj11) {
                                                                        return obj11;
                                                                    }
                                                                    iFVar8 = iFVar5;
                                                                    i24 = i43;
                                                                    activity7 = activity8;
                                                                    try {
                                                                        iFVar9 = iFVar8;
                                                                        set2 = set3;
                                                                        j11 = j3;
                                                                        str17 = str14;
                                                                        str16 = str12;
                                                                        list12 = list9;
                                                                        j12 = j9;
                                                                        listListOf = (List) objJ2;
                                                                        j13 = j10;
                                                                        str18 = str15;
                                                                        obj12 = obj11;
                                                                        function18 = function17;
                                                                        function04 = function03;
                                                                        oVar5 = oVar4;
                                                                        aCVar7 = aCVar6;
                                                                        qj7 = qj6;
                                                                        str19 = str13;
                                                                        com.google.firebase.storage.o oVar82 = oVar2;
                                                                        List list242 = list5;
                                                                        String str372 = (String) listListOf.get(0);
                                                                        String str382 = (String) listListOf.get(1);
                                                                        String str392 = (String) listListOf.get(2);
                                                                        String str402 = (String) listListOf.get(3);
                                                                        String str412 = str19 + " (" + i24 + ")";
                                                                        String title3 = ((ProjectInfo.n) CollectionsKt.first(list12)).getTitle();
                                                                        if (list12.size() > 1) {
                                                                        }
                                                                        String str422 = title3;
                                                                        String packageName2 = activity7.getPackageName();
                                                                        List list252 = CollectionsKt.toList(set2);
                                                                        Timestamp timestampT2 = Timestamp.INSTANCE.t();
                                                                        ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list12, 10));
                                                                        it = list12.iterator();
                                                                        while (it.hasNext()) {
                                                                        }
                                                                        wQ.QJ qj162 = qj7;
                                                                        com.google.firebase.functions.n nVar112 = nVar6;
                                                                        List list262 = list12;
                                                                        SharedProjectPackageInfo sharedProjectPackageInfo32 = new SharedProjectPackageInfo(1028425, "5.0.273.1028425", str412, AppLovinBridge.f61290h, list252, Boxing.boxInt(i23), str422, str372, str382, str392, str402, packageName2, null, timestampT2, j11, null, arrayList32);
                                                                        JsonAdapter jsonAdapterAdapter2 = HI0.Lu.n().adapter(SharedProjectPackageInfo.class);
                                                                        Intrinsics.checkNotNull(jsonAdapterAdapter2);
                                                                        String json2 = jsonAdapterAdapter2.toJson(sharedProjectPackageInfo32);
                                                                        Intrinsics.checkNotNull(json2);
                                                                        byte[] bytes2 = json2.getBytes(Charsets.UTF_8);
                                                                        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                                                                        List listListOf22 = CollectionsKt.listOf(oVar82.r(bytes2));
                                                                        Activity activity162 = activity7;
                                                                        int i392 = i19;
                                                                        long j222 = j11;
                                                                        Pl pl3 = new Pl(activity162, iFVar9, i392, list262, j222);
                                                                        iF iFVar142 = iFVar9;
                                                                        j14 = j222;
                                                                        c4.f67257n = activity162;
                                                                        c4.f67260t = str18;
                                                                        c4.f67248O = list262;
                                                                        c4.J2 = iFVar142;
                                                                        c4.f67259r = fux3;
                                                                        c4.f67258o = list242;
                                                                        c4.f67253Z = file4;
                                                                        c4.f67249S = function18;
                                                                        c4.f67256g = function04;
                                                                        c4.E2 = aCVar7;
                                                                        String str432 = str18;
                                                                        c4.f67255e = nVar112;
                                                                        c4.f67252X = qj162;
                                                                        c4.f67250T = str16;
                                                                        c4.f67247N = str17;
                                                                        com.google.firebase.storage.o oVar92 = oVar5;
                                                                        c4.f67261v = oVar92;
                                                                        c4.Xw = sharedProjectPackageInfo32;
                                                                        c4.jB = null;
                                                                        c4.f67251U = null;
                                                                        c4.P5 = null;
                                                                        c4.p5 = i392;
                                                                        c4.f67244FX = j14;
                                                                        function19 = function18;
                                                                        long j232 = j12;
                                                                        c4.f67241B = j232;
                                                                        long j242 = j13;
                                                                        c4.f67245J = j242;
                                                                        c4.f67254a = 8;
                                                                        C c72 = c4;
                                                                        objXMQ = xMQ(listListOf22, j232, j242, function19, pl3, c72);
                                                                        j15 = j232;
                                                                        c5 = c72;
                                                                        obj2 = obj12;
                                                                        if (objXMQ != obj2) {
                                                                        }
                                                                    } catch (CancellationException e2) {
                                                                        e = e2;
                                                                        iFVar6 = iFVar8;
                                                                        list10 = list9;
                                                                        j6 = j3;
                                                                        i21 = i19;
                                                                        obj10 = null;
                                                                        cause = e.getCause();
                                                                        if (cause != null) {
                                                                        }
                                                                    } catch (Exception e3) {
                                                                        exc = e3;
                                                                        iFVar7 = iFVar8;
                                                                        list11 = list9;
                                                                        activity9 = activity7;
                                                                        j7 = j3;
                                                                        i22 = i19;
                                                                        Ik(activity9, iFVar7, i22, list11, j7, exc);
                                                                        return null;
                                                                    }
                                                                } catch (CancellationException e4) {
                                                                    e = e4;
                                                                    j3 = j28;
                                                                    iFVar6 = iFVar5;
                                                                    list10 = list9;
                                                                    j6 = j3;
                                                                    i21 = i19;
                                                                    activity7 = activity8;
                                                                    obj10 = null;
                                                                    cause = e.getCause();
                                                                    if (cause != null) {
                                                                    }
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    j3 = j28;
                                                                    exc = e;
                                                                    iFVar7 = iFVar5;
                                                                    list11 = list9;
                                                                    j7 = j3;
                                                                    i22 = i19;
                                                                    activity9 = activity8;
                                                                    Ik(activity9, iFVar7, i22, list11, j7, exc);
                                                                    return null;
                                                                }
                                                            } catch (CancellationException e6) {
                                                                e = e6;
                                                                i19 = i41;
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                                i19 = i41;
                                                            }
                                                        } catch (CancellationException e8) {
                                                            e = e8;
                                                        } catch (Exception e9) {
                                                            e = e9;
                                                        }
                                                    } catch (CancellationException e10) {
                                                        e = e10;
                                                        activity8 = activity6;
                                                    }
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    activity8 = activity6;
                                                }
                                            } catch (CancellationException e12) {
                                                e = e12;
                                                obj10 = null;
                                                iFVar6 = iFVar5;
                                                list10 = list9;
                                                j6 = j3;
                                                i21 = i19;
                                                activity7 = activity6;
                                                cause = e.getCause();
                                                if (cause != null) {
                                                    throw e;
                                                }
                                                Ik(activity7, iFVar6, i21, list10, j6, cause);
                                                return obj10;
                                            }
                                        }
                                    }
                                }
                            }
                            return obj2;
                        }
                    }
                    i2 = 1;
                    int i302 = i2 != 0 ? 2131361969 : 2131361970;
                    if (i2 == 0) {
                    }
                } else {
                    i2 = 1;
                    int i3022 = i2 != 0 ? 2131361969 : 2131361970;
                    if (i2 == 0) {
                    }
                }
                String str48 = str28;
                x0X.n nVar12 = (x0X.n) obj17;
                com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
                long projectPackageFreeUserMaxDownloadSize2 = jVar2.getProjectPackageFreeUserMaxDownloadSize();
                boolean z6 = 1 > projectPackageFreeUserMaxDownloadSize2 && projectPackageFreeUserMaxDownloadSize2 < j19;
                AlightLinkMetadataResponse alightLinkMetadataResponse = (AlightLinkMetadataResponse) x0X.w6.nr(nVar12);
                boolean zAreEqual = alightLinkMetadataResponse == null ? Intrinsics.areEqual(alightLinkMetadataResponse.getLiteVersionAvailable(), Boxing.boxBoolean(true)) : false;
                f67240n.put(str30, str29);
                Bundle bundle2 = new Bundle();
                bundle2.putLong(str4, j19);
                bundle2.putInt(str3, list19.size());
                bundle2.putBoolean("sp", jVar2.getUpdateSp());
                Unit unit2 = Unit.INSTANCE;
                iFVar12.n(new j.fuX("share_projectpkg_upload_complete", bundle2));
                int i44 = 0;
                for (Object obj21 : list18) {
                    int i45 = i44 + 1;
                    if (i44 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    list18.set(i44, rWZ.n.rl((rWZ.n) obj21, 0L, 0L, Boxing.boxLong(j19), 0, 0, 0, null, null, null, null, null, null, false, false, 0, 0, 0, 0, null, false, str48, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, false, false, -1048581, 31, null));
                    i44 = i45;
                }
                int i46 = 0;
                for (Object obj22 : list19) {
                    int i47 = i46 + 1;
                    if (i46 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    rWZ.n nVar13 = (rWZ.n) CollectionsKt.getOrNull(list18, i46);
                    if (nVar13 != null) {
                        i28 = i27;
                        iFVar12.n(new j.M5(nVar13, false, 2, null));
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        i28 = i27;
                    }
                    i27 = i28;
                    i46 = i47;
                }
                Integer numBoxInt2 = Boxing.boxInt(i27);
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list19, 10));
                it2 = list19.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((ProjectInfo.n) it2.next()).getId());
                }
                iFVar12.n(new QmE.Dsr(numBoxInt2, arrayList4));
                return new gIX.C(str29, z6, zAreEqual, j19, str48, aCVar10);
            case 1:
                obj = obj17;
                int i48 = c6.eF;
                int i49 = c6.p5;
                boolean z7 = c6.M7;
                Function0 function07 = (Function0) c6.E2;
                Function1 function111 = (Function1) c6.f67256g;
                Function1 function112 = (Function1) c6.f67249S;
                file2 = (File) c6.f67253Z;
                list5 = (List) c6.f67258o;
                kgE.fuX fux7 = (kgE.fuX) c6.f67259r;
                iF iFVar15 = (iF) c6.J2;
                List list28 = (List) c6.f67248O;
                i5 = i48;
                String str49 = (String) c6.f67260t;
                Activity activity17 = (Activity) c6.f67257n;
                ResultKt.throwOnFailure(obj);
                function14 = function111;
                iFVar2 = iFVar15;
                function13 = function112;
                fux2 = fux7;
                i3 = i49;
                z3 = z7;
                list4 = list28;
                function02 = function07;
                str2 = str49;
                activity = activity17;
                nVar2 = (x0X.n) obj;
                boolean z52 = z3;
                if (!(nVar2 instanceof n.C1266n)) {
                }
                break;
            case 2:
                aCVar2 = (gIX.aC) c6.f67257n;
                ResultKt.throwOnFailure(obj17);
                return new gIX.C("alight.link/sample", false, false, 0L, "", aCVar2);
            case 3:
                int i50 = c6.eF;
                int i51 = c6.p5;
                HI0.Q q4 = (HI0.Q) c6.jB;
                LM.iwV iwv3 = (LM.iwV) c6.Xw;
                wQ.QJ qj20 = (wQ.QJ) c6.f67261v;
                wQ.QJ qj21 = (wQ.QJ) c6.f67247N;
                nVar = (com.google.firebase.functions.n) c6.f67250T;
                gIX.aC aCVar16 = (gIX.aC) c6.f67252X;
                Lu lu4 = (Lu) c6.f67255e;
                Function0 function08 = (Function0) c6.E2;
                Function1 function113 = (Function1) c6.f67256g;
                Function1 function114 = (Function1) c6.f67249S;
                File file5 = (File) c6.f67253Z;
                List list29 = (List) c6.f67258o;
                kgE.fuX fux8 = (kgE.fuX) c6.f67259r;
                iF iFVar16 = (iF) c6.J2;
                List list30 = (List) c6.f67248O;
                String str50 = (String) c6.f67260t;
                Activity activity18 = (Activity) c6.f67257n;
                ResultKt.throwOnFailure(obj17);
                function15 = function114;
                str3 = "projectCount";
                str4 = "uploadSize";
                function16 = function113;
                obj3 = obj17;
                i10 = i50;
                i9 = i51;
                qj = qj21;
                obj2 = coroutine_suspended;
                aCVar = aCVar16;
                acctTestMode = "normal";
                lu = lu4;
                function03 = function08;
                list5 = list29;
                fux3 = fux8;
                iFVar3 = iFVar16;
                q2 = q4;
                file3 = file5;
                activity3 = activity18;
                iwv = iwv3;
                qj2 = qj20;
                list6 = list30;
                str2 = str50;
                final String str312 = (String) obj3;
                Object obj182 = obj2;
                XoT.C.Uo(activity3, new Function0() { // from class: gIX.qz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return QJ.az(str312);
                    }
                });
                str5 = (String) f67240n.get(str312);
                if (str5 == null) {
                }
                break;
            case 4:
                int i52 = c6.eF;
                int i53 = c6.p5;
                String str51 = (String) c6.f67261v;
                wQ.QJ qj22 = (wQ.QJ) c6.f67247N;
                wQ.QJ qj23 = (wQ.QJ) c6.f67250T;
                com.google.firebase.functions.n nVar14 = (com.google.firebase.functions.n) c6.f67252X;
                aCVar3 = (gIX.aC) c6.f67255e;
                Lu lu5 = (Lu) c6.E2;
                function03 = (Function0) c6.f67256g;
                Function1 function115 = (Function1) c6.f67249S;
                File file6 = (File) c6.f67253Z;
                List list31 = (List) c6.f67258o;
                kgE.fuX fux9 = (kgE.fuX) c6.f67259r;
                iF iFVar17 = (iF) c6.J2;
                List list32 = (List) c6.f67248O;
                String str52 = (String) c6.f67260t;
                Activity activity19 = (Activity) c6.f67257n;
                ResultKt.throwOnFailure(obj17);
                obj5 = coroutine_suspended;
                str3 = "projectCount";
                str4 = "uploadSize";
                function17 = function115;
                file4 = file6;
                i11 = i52;
                fux3 = fux9;
                i12 = i53;
                str6 = str51;
                qj4 = qj22;
                acctTestMode = "normal";
                str2 = str52;
                activity4 = activity19;
                nVar3 = nVar14;
                lu = lu5;
                list5 = list31;
                iFVar3 = iFVar17;
                obj4 = obj17;
                qj3 = qj23;
                list6 = list32;
                Pair pair22 = (Pair) obj4;
                int i352 = i12;
                Set set42 = (Set) pair22.component1();
                int iIntValue3 = ((Number) pair22.component2()).intValue();
                wQ.QJ qj132 = qj4;
                long length22 = file4.length();
                String str322 = str6;
                com.google.firebase.functions.n nVar82 = nVar3;
                gIX.aC aCVar132 = aCVar3;
                PackageInfo packageInfo2 = activity4.getPackageManager().getPackageInfo(activity4.getPackageName(), 0);
                Pair pair32 = TuplesKt.to(packageInfo2.versionName, Boxing.boxInt(packageInfo2.versionCode));
                String str332 = (String) pair32.component1();
                int iIntValue22 = ((Number) pair32.component2()).intValue();
                Bundle bundle3 = new Bundle();
                bundle3.putLong(str4, length22);
                bundle3.putInt(str3, list6.size());
                Unit unit4 = Unit.INSTANCE;
                iFVar3.n(new j.fuX("share_projectpkg_begin_upload", bundle3));
                XoT.C.Uo(activity4, new Function0() { // from class: gIX.Pl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return QJ.ty();
                    }
                });
                ProjectPackageIDRequest projectPackageIDRequest2 = new ProjectPackageIDRequest(length22, !fux3.rl() ? com.alightcreative.app.motion.persist.j.INSTANCE.getAcctTestMode() : acctTestMode);
                c6.f67257n = activity4;
                c6.f67260t = str2;
                c6.f67248O = list6;
                c6.J2 = iFVar3;
                c6.f67259r = fux3;
                c6.f67258o = list5;
                c6.f67253Z = file4;
                c6.f67249S = function17;
                c6.f67256g = function03;
                c6.E2 = lu;
                aCVar4 = aCVar132;
                c6.f67255e = aCVar4;
                c6.f67252X = nVar82;
                c6.f67250T = qj132;
                c6.f67247N = str322;
                c6.f67261v = set42;
                c6.Xw = str332;
                c6.p5 = i352;
                c6.eF = i11;
                c6.f67243E = iIntValue3;
                c6.f67244FX = length22;
                c6.f67246M = iIntValue22;
                c6.f67254a = 5;
                objN = qj3.n(projectPackageIDRequest2, c6);
                obj2 = obj5;
                if (objN != obj2) {
                }
                return obj2;
            case 5:
                int i54 = c6.f67246M;
                long j31 = c6.f67244FX;
                int i55 = c6.f67243E;
                int i56 = c6.eF;
                int i57 = c6.p5;
                String str53 = (String) c6.Xw;
                Set set6 = (Set) c6.f67261v;
                String str54 = (String) c6.f67247N;
                wQ.QJ qj24 = (wQ.QJ) c6.f67250T;
                com.google.firebase.functions.n nVar15 = (com.google.firebase.functions.n) c6.f67252X;
                gIX.aC aCVar17 = (gIX.aC) c6.f67255e;
                Lu lu6 = (Lu) c6.E2;
                Function0 function09 = (Function0) c6.f67256g;
                Function1 function116 = (Function1) c6.f67249S;
                File file7 = (File) c6.f67253Z;
                List list33 = (List) c6.f67258o;
                kgE.fuX fux10 = (kgE.fuX) c6.f67259r;
                iF iFVar18 = (iF) c6.J2;
                List list34 = (List) c6.f67248O;
                String str55 = (String) c6.f67260t;
                Activity activity20 = (Activity) c6.f67257n;
                ResultKt.throwOnFailure(obj17);
                j2 = j31;
                i13 = i55;
                i15 = i57;
                obj7 = coroutine_suspended;
                str3 = "projectCount";
                str4 = "uploadSize";
                str8 = str54;
                i14 = i54;
                function03 = function09;
                function17 = function116;
                file4 = file7;
                fux3 = fux10;
                list7 = list34;
                str2 = str55;
                activity4 = activity20;
                str7 = str53;
                acctTestMode = "normal";
                qj5 = qj24;
                nVar4 = nVar15;
                aCVar4 = aCVar17;
                lu2 = lu6;
                iFVar4 = iFVar18;
                obj6 = obj17;
                i16 = i56;
                set = set6;
                list5 = list33;
                nVar5 = (x0X.n) obj6;
                int i362 = i15;
                XoT.C.Uo(activity4, new Function0() { // from class: gIX.Xo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return QJ.HI(nVar5);
                    }
                });
                if (!x0X.w6.O(nVar5)) {
                }
                break;
            case 6:
                long j32 = c6.f67245J;
                long j33 = c6.f67241B;
                int i58 = c6.f67246M;
                long j34 = c6.f67244FX;
                int i59 = c6.f67243E;
                int i60 = c6.eF;
                int i61 = c6.p5;
                List list35 = (List) c6.P5;
                com.google.firebase.storage.o oVar12 = (com.google.firebase.storage.o) c6.f67251U;
                com.google.firebase.storage.o oVar13 = (com.google.firebase.storage.o) c6.jB;
                String str56 = (String) c6.Xw;
                String str57 = (String) c6.f67261v;
                Set set7 = (Set) c6.f67247N;
                String str58 = (String) c6.f67250T;
                wQ.QJ qj25 = (wQ.QJ) c6.f67252X;
                com.google.firebase.functions.n nVar16 = (com.google.firebase.functions.n) c6.f67255e;
                gIX.aC aCVar18 = (gIX.aC) c6.E2;
                Function0 function010 = (Function0) c6.f67256g;
                Function1 function117 = (Function1) c6.f67249S;
                File file8 = (File) c6.f67253Z;
                List list36 = (List) c6.f67258o;
                kgE.fuX fux11 = (kgE.fuX) c6.f67259r;
                iF iFVar19 = (iF) c6.J2;
                List list37 = (List) c6.f67248O;
                String str59 = (String) c6.f67260t;
                Activity activity21 = (Activity) c6.f67257n;
                ResultKt.throwOnFailure(obj17);
                oVar2 = oVar12;
                str11 = str57;
                set2 = set7;
                oVar3 = oVar13;
                j4 = j33;
                j3 = j34;
                c4 = c6;
                i20 = i59;
                i19 = i60;
                i17 = i61;
                list8 = list35;
                obj8 = obj17;
                list9 = list37;
                str2 = str59;
                str10 = str58;
                qj6 = qj25;
                aCVar6 = aCVar18;
                function03 = function010;
                list5 = list36;
                activity6 = activity21;
                i18 = i58;
                obj9 = coroutine_suspended;
                j5 = j32;
                iFVar5 = iFVar19;
                str9 = str56;
                fux3 = fux11;
                str3 = "projectCount";
                str4 = "uploadSize";
                acctTestMode = "normal";
                nVar6 = nVar16;
                function17 = function117;
                file4 = file8;
                if (((Boolean) obj8).booleanValue()) {
                }
                break;
            case 7:
                long j35 = c6.f67245J;
                long j36 = c6.f67241B;
                i24 = c6.f67243E;
                j6 = c6.f67244FX;
                int i62 = c6.eF;
                i21 = c6.p5;
                com.google.firebase.storage.o oVar14 = (com.google.firebase.storage.o) c6.f67251U;
                com.google.firebase.storage.o oVar15 = (com.google.firebase.storage.o) c6.jB;
                String str60 = (String) c6.Xw;
                String str61 = (String) c6.f67261v;
                Set set8 = (Set) c6.f67247N;
                String str62 = (String) c6.f67250T;
                wQ.QJ qj26 = (wQ.QJ) c6.f67252X;
                com.google.firebase.functions.n nVar17 = (com.google.firebase.functions.n) c6.f67255e;
                gIX.aC aCVar19 = (gIX.aC) c6.E2;
                Function0 function011 = (Function0) c6.f67256g;
                Function1 function118 = (Function1) c6.f67249S;
                File file9 = (File) c6.f67253Z;
                List list38 = (List) c6.f67258o;
                kgE.fuX fux12 = (kgE.fuX) c6.f67259r;
                iFVar6 = (iF) c6.J2;
                list10 = (List) c6.f67248O;
                String str63 = (String) c6.f67260t;
                activity7 = (Activity) c6.f67257n;
                try {
                    ResultKt.throwOnFailure(obj17);
                    j10 = j35;
                    str14 = str60;
                    str13 = str61;
                    j9 = j36;
                    j3 = j6;
                    c4 = c6;
                    obj11 = coroutine_suspended;
                    oVar4 = oVar15;
                    i23 = i62;
                    i19 = i21;
                    oVar2 = oVar14;
                    objJ2 = obj17;
                    iFVar8 = iFVar6;
                    list9 = list10;
                    str15 = str63;
                    set3 = set8;
                    str12 = str62;
                    qj6 = qj26;
                    aCVar6 = aCVar19;
                    function03 = function011;
                    list5 = list38;
                    fux3 = fux12;
                    str3 = "projectCount";
                    str4 = "uploadSize";
                    acctTestMode = "normal";
                    nVar6 = nVar17;
                    function17 = function118;
                    file4 = file9;
                    iFVar9 = iFVar8;
                    set2 = set3;
                    j11 = j3;
                    str17 = str14;
                    str16 = str12;
                    list12 = list9;
                    j12 = j9;
                    listListOf = (List) objJ2;
                    j13 = j10;
                    str18 = str15;
                    obj12 = obj11;
                    function18 = function17;
                    function04 = function03;
                    oVar5 = oVar4;
                    aCVar7 = aCVar6;
                    qj7 = qj6;
                    str19 = str13;
                    com.google.firebase.storage.o oVar822 = oVar2;
                    List list2422 = list5;
                    String str3722 = (String) listListOf.get(0);
                    String str3822 = (String) listListOf.get(1);
                    String str3922 = (String) listListOf.get(2);
                    String str4022 = (String) listListOf.get(3);
                    String str4122 = str19 + " (" + i24 + ")";
                    String title32 = ((ProjectInfo.n) CollectionsKt.first(list12)).getTitle();
                    if (list12.size() > 1) {
                    }
                    String str4222 = title32;
                    String packageName22 = activity7.getPackageName();
                    List list2522 = CollectionsKt.toList(set2);
                    Timestamp timestampT22 = Timestamp.INSTANCE.t();
                    ArrayList arrayList322 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list12, 10));
                    it = list12.iterator();
                    while (it.hasNext()) {
                    }
                    wQ.QJ qj1622 = qj7;
                    com.google.firebase.functions.n nVar1122 = nVar6;
                    List list2622 = list12;
                    SharedProjectPackageInfo sharedProjectPackageInfo322 = new SharedProjectPackageInfo(1028425, "5.0.273.1028425", str4122, AppLovinBridge.f61290h, list2522, Boxing.boxInt(i23), str4222, str3722, str3822, str3922, str4022, packageName22, null, timestampT22, j11, null, arrayList322);
                    JsonAdapter jsonAdapterAdapter22 = HI0.Lu.n().adapter(SharedProjectPackageInfo.class);
                    Intrinsics.checkNotNull(jsonAdapterAdapter22);
                    String json22 = jsonAdapterAdapter22.toJson(sharedProjectPackageInfo322);
                    Intrinsics.checkNotNull(json22);
                    byte[] bytes22 = json22.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes22, "getBytes(...)");
                    List listListOf222 = CollectionsKt.listOf(oVar822.r(bytes22));
                    Activity activity1622 = activity7;
                    int i3922 = i19;
                    long j2222 = j11;
                    Pl pl32 = new Pl(activity1622, iFVar9, i3922, list2622, j2222);
                    iF iFVar1422 = iFVar9;
                    j14 = j2222;
                    c4.f67257n = activity1622;
                    c4.f67260t = str18;
                    c4.f67248O = list2622;
                    c4.J2 = iFVar1422;
                    c4.f67259r = fux3;
                    c4.f67258o = list2422;
                    c4.f67253Z = file4;
                    c4.f67249S = function18;
                    c4.f67256g = function04;
                    c4.E2 = aCVar7;
                    String str4322 = str18;
                    c4.f67255e = nVar1122;
                    c4.f67252X = qj1622;
                    c4.f67250T = str16;
                    c4.f67247N = str17;
                    com.google.firebase.storage.o oVar922 = oVar5;
                    c4.f67261v = oVar922;
                    c4.Xw = sharedProjectPackageInfo322;
                    c4.jB = null;
                    c4.f67251U = null;
                    c4.P5 = null;
                    c4.p5 = i3922;
                    c4.f67244FX = j14;
                    function19 = function18;
                    long j2322 = j12;
                    c4.f67241B = j2322;
                    long j2422 = j13;
                    c4.f67245J = j2422;
                    c4.f67254a = 8;
                    C c722 = c4;
                    objXMQ = xMQ(listListOf222, j2322, j2422, function19, pl32, c722);
                    j15 = j2322;
                    c5 = c722;
                    obj2 = obj12;
                    if (objXMQ != obj2) {
                    }
                    return obj2;
                } catch (CancellationException e13) {
                    e = e13;
                    obj10 = null;
                    cause = e.getCause();
                    if (cause != null) {
                    }
                } catch (Exception e14) {
                    exc = e14;
                    j7 = j6;
                    i22 = i21;
                    iFVar7 = iFVar6;
                    list11 = list10;
                    activity9 = activity7;
                    Ik(activity9, iFVar7, i22, list11, j7, exc);
                    return null;
                }
                break;
            case 8:
                long j37 = c6.f67245J;
                long j38 = c6.f67241B;
                long j39 = c6.f67244FX;
                int i63 = c6.p5;
                SharedProjectPackageInfo sharedProjectPackageInfo5 = (SharedProjectPackageInfo) c6.Xw;
                com.google.firebase.storage.o oVar16 = (com.google.firebase.storage.o) c6.f67261v;
                String str64 = (String) c6.f67247N;
                String str65 = (String) c6.f67250T;
                wQ.QJ qj27 = (wQ.QJ) c6.f67252X;
                com.google.firebase.functions.n nVar18 = (com.google.firebase.functions.n) c6.f67255e;
                gIX.aC aCVar20 = (gIX.aC) c6.E2;
                Function0 function012 = (Function0) c6.f67256g;
                function19 = (Function1) c6.f67249S;
                File file10 = (File) c6.f67253Z;
                List list39 = (List) c6.f67258o;
                kgE.fuX fux13 = (kgE.fuX) c6.f67259r;
                iF iFVar20 = (iF) c6.J2;
                List list40 = (List) c6.f67248O;
                String str66 = (String) c6.f67260t;
                Activity activity22 = (Activity) c6.f67257n;
                ResultKt.throwOnFailure(obj17);
                j15 = j38;
                str3 = "projectCount";
                str4 = "uploadSize";
                acctTestMode = "normal";
                oVar6 = oVar16;
                qj8 = qj27;
                file4 = file10;
                fux4 = fux13;
                iFVar10 = iFVar20;
                nVar7 = nVar18;
                obj2 = coroutine_suspended;
                sharedProjectPackageInfo = sharedProjectPackageInfo5;
                list14 = list39;
                str22 = str66;
                j16 = j37;
                activity10 = activity22;
                str21 = str65;
                obj13 = obj17;
                i25 = i63;
                function05 = function012;
                list13 = list40;
                aCVar8 = aCVar20;
                c5 = c6;
                str20 = str64;
                j14 = j39;
                Function1 function1102 = function19;
                if (((Boolean) obj13).booleanValue()) {
                }
                break;
            case 9:
                long j40 = c6.f67244FX;
                int i64 = c6.p5;
                SharedProjectPackageInfo sharedProjectPackageInfo6 = (SharedProjectPackageInfo) c6.f67250T;
                String str67 = (String) c6.f67252X;
                String str68 = (String) c6.f67255e;
                wQ.QJ qj28 = (wQ.QJ) c6.E2;
                com.google.firebase.functions.n nVar19 = (com.google.firebase.functions.n) c6.f67256g;
                aCVar9 = (gIX.aC) c6.f67249S;
                Function0 function013 = (Function0) c6.f67253Z;
                List list41 = (List) c6.f67258o;
                kgE.fuX fux14 = (kgE.fuX) c6.f67259r;
                iF iFVar21 = (iF) c6.J2;
                List list42 = (List) c6.f67248O;
                String str69 = (String) c6.f67260t;
                Activity activity23 = (Activity) c6.f67257n;
                ResultKt.throwOnFailure(obj17);
                str23 = str68;
                c5 = c6;
                qj9 = qj28;
                sharedProjectPackageInfo2 = sharedProjectPackageInfo6;
                str3 = "projectCount";
                str4 = "uploadSize";
                acctTestMode = "normal";
                fux4 = fux14;
                activity11 = activity23;
                nVar7 = nVar19;
                list16 = list41;
                i26 = i64;
                str24 = str67;
                j17 = j40;
                list15 = list42;
                function06 = function013;
                obj14 = obj17;
                iFVar11 = iFVar21;
                obj2 = coroutine_suspended;
                str22 = str69;
                if (((Boolean) obj14).booleanValue()) {
                }
                break;
            case 10:
                long j41 = c6.f67244FX;
                i27 = c6.p5;
                String str70 = (String) c6.f67255e;
                String str71 = (String) c6.E2;
                str25 = (String) c6.f67256g;
                nVarT = (com.google.firebase.functions.n) c6.f67249S;
                gIX.aC aCVar21 = (gIX.aC) c6.f67253Z;
                List list43 = (List) c6.f67258o;
                fux5 = (kgE.fuX) c6.f67259r;
                iF iFVar22 = (iF) c6.J2;
                List list44 = (List) c6.f67248O;
                String str72 = (String) c6.f67260t;
                Activity activity24 = (Activity) c6.f67257n;
                ResultKt.throwOnFailure(obj17);
                str3 = "projectCount";
                str4 = "uploadSize";
                acctTestMode = "normal";
                aCVar10 = aCVar21;
                iFVar11 = iFVar22;
                activity11 = activity24;
                list16 = list43;
                str26 = str71;
                obj16 = obj17;
                j18 = j41;
                str27 = str70;
                c5 = c6;
                obj15 = coroutine_suspended;
                list17 = list44;
                str22 = str72;
                th = (Throwable) x0X.w6.rl((x0X.n) obj16);
                if (th == null) {
                }
                break;
            case 11:
                j19 = c6.f67244FX;
                i27 = c6.p5;
                str29 = (String) c6.f67253Z;
                str28 = (String) c6.f67258o;
                str30 = (String) c6.f67259r;
                aCVar10 = (gIX.aC) c6.J2;
                list18 = (List) c6.f67248O;
                iFVar12 = (iF) c6.f67260t;
                list19 = (List) c6.f67257n;
                ResultKt.throwOnFailure(obj17);
                str3 = "projectCount";
                str4 = "uploadSize";
                String str482 = str28;
                x0X.n nVar122 = (x0X.n) obj17;
                com.alightcreative.app.motion.persist.j jVar22 = com.alightcreative.app.motion.persist.j.INSTANCE;
                long projectPackageFreeUserMaxDownloadSize22 = jVar22.getProjectPackageFreeUserMaxDownloadSize();
                if (1 > projectPackageFreeUserMaxDownloadSize22) {
                }
                AlightLinkMetadataResponse alightLinkMetadataResponse2 = (AlightLinkMetadataResponse) x0X.w6.nr(nVar122);
                if (alightLinkMetadataResponse2 == null) {
                }
                f67240n.put(str30, str29);
                Bundle bundle22 = new Bundle();
                bundle22.putLong(str4, j19);
                bundle22.putInt(str3, list19.size());
                bundle22.putBoolean("sp", jVar22.getUpdateSp());
                Unit unit22 = Unit.INSTANCE;
                iFVar12.n(new j.fuX("share_projectpkg_upload_complete", bundle22));
                int i442 = 0;
                while (r2.hasNext()) {
                }
                int i462 = 0;
                while (r2.hasNext()) {
                }
                Integer numBoxInt22 = Boxing.boxInt(i27);
                ArrayList arrayList42 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list19, 10));
                it2 = list19.iterator();
                while (it2.hasNext()) {
                }
                iFVar12.n(new QmE.Dsr(numBoxInt22, arrayList42));
                return new gIX.C(str29, z6, zAreEqual, j19, str482, aCVar10);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HI(x0X.n nVar) {
        return "Called makeAMProjectPackageId: result=" + nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ik(Activity activity, iF iFVar, int i2, List list, long j2, Throwable th) {
        new R6(activity).mUb(2132019031).O("Reason: " + th.getMessage()).xMQ(2132017378, new Function1() { // from class: gIX.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QJ.r((DialogInterface) obj);
            }
        }).gh();
        Bundle bundle = new Bundle();
        bundle.putLong("uploadSize", j2);
        bundle.putInt("projectCount", list.size());
        bundle.putString("failReason", th.getMessage());
        Unit unit = Unit.INSTANCE;
        iFVar.n(new j.fuX("share_projectpkg_upload_fail", bundle));
        Integer numValueOf = Integer.valueOf(i2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProjectInfo.n) it.next()).getId());
        }
        iFVar.n(new QmE.aC(numValueOf, arrayList, new Exception(th)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az(String str) {
        return "ASP packageContentSig: " + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object mUb(ComponentActivity componentActivity, String str, List list, iF iFVar, kgE.fuX fux, List list2, List list3, SceneThumbnailMaker sceneThumbnailMaker, Continuation continuation) {
        int i2;
        String string;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ProjectInfo.n) it.next()).getType() != SceneType.PRESET) {
                    i2 = 2131361970;
                    break;
                }
            }
            i2 = 2131361969;
        } else {
            i2 = 2131361969;
        }
        int i3 = i2;
        boolean zIk = XoT.fuX.Ik(componentActivity);
        boolean simulateUpload = com.alightcreative.app.motion.persist.j.INSTANCE.getSimulateUpload();
        if (!zIk && !simulateUpload) {
            new AlertDialog.Builder(componentActivity).o(2132019733).Uo(2132019735).setNegativeButton(2132017378, new DialogInterface.OnClickListener() { // from class: gIX.o
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    QJ.gh(dialogInterface, i5);
                }
            }).create().show();
            return null;
        }
        if (!simulateUpload) {
            iFVar.n(new j.fuX("share_projectpkg_start", null, 2, null));
        }
        String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH).format(new Date());
        ProjectInfo.n nVar = (ProjectInfo.n) CollectionsKt.singleOrNull(list);
        if (nVar != null) {
            String title = nVar.getTitle();
            StringBuilder sb = new StringBuilder();
            int length = title.length();
            for (int i5 = 0; i5 < length; i5++) {
                char cCharAt = title.charAt(i5);
                if (Intrinsics.compare((int) cCharAt, l.f62284f) > 0 || (('A' <= cCharAt && cCharAt < '[') || (('a' <= cCharAt && cCharAt < '{') || (('0' <= cCharAt && cCharAt < ':') || StringsKt.contains$default((CharSequence) "_-.+, ", cCharAt, false, 2, (Object) null))))) {
                    sb.append(cCharAt);
                }
            }
            string = sb.toString();
            if (string == null) {
                string = "project";
            }
        }
        String str3 = string + " " + str2 + ".amproj";
        File cacheDir = componentActivity.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(FilesKt.resolve(FilesKt.resolve(cacheDir, AppLovinEventTypes.USER_SHARED_LINK), "t" + System.currentTimeMillis()), str3);
        if (fileResolve.exists()) {
            fileResolve.delete();
        }
        File parentFile = fileResolve.getParentFile();
        if (parentFile == null) {
            return null;
        }
        parentFile.mkdirs();
        Integer numBoxInt = Boxing.boxInt(i3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ProjectInfo.n) it2.next()).getId());
        }
        iFVar.n(new QmE.C(numBoxInt, arrayList));
        Dj7.s4 s4Var = new Dj7.s4(componentActivity);
        MutableState mutableStateO = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        MutableState mutableStateO2 = SnapshotStateKt__SnapshotStateKt.O(Boxing.boxFloat(0.0f), null, 2, null);
        MutableState mutableStateO3 = SnapshotStateKt__SnapshotStateKt.O(Boxing.boxBoolean(true), null, 2, null);
        P pRl = GJW.C.rl(LifecycleOwnerKt.n(componentActivity), null, GJW.h.f3489t, new Wre(componentActivity, str, list, iFVar, fux, list2, list3, sceneThumbnailMaker, simulateUpload, fileResolve, i3, s4Var, mutableStateO2, mutableStateO, mutableStateO3, null), 1, null);
        s4Var.rl(ComposableLambdaKt.rl(1249659846, true, new Ml(mutableStateO, mutableStateO2, mutableStateO3, pRl, s4Var)));
        return HI0.Ml.ck(componentActivity, new I28(pRl, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ty() {
        return "ABOUT TO CALL makeAMProjectPackageId";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object xMQ(List list, long j2, long j3, Function1 function1, Function1 function12, Continuation continuation) {
        n nVar;
        Function1 function13;
        List list2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        n nVar2 = nVar;
        Object objJ2 = nVar2.f67374O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar2.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objJ2);
            try {
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                    for (Object obj : list) {
                        try {
                            linkedHashMap.put(obj, Boxing.boxLong(0L));
                        } catch (CancellationException e2) {
                            e = e2;
                            list2 = list;
                            function13 = function12;
                        }
                    }
                    j jVar = new j(list, null, MapsKt.toMutableMap(linkedHashMap), function1, j2, j3);
                    nVar2.f67375n = list;
                    function13 = function12;
                    try {
                        try {
                            nVar2.f67376t = function13;
                            nVar2.J2 = 1;
                            objJ2 = GJW.Lu.J2(jVar, nVar2);
                            if (objJ2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list2 = list;
                            return Boxing.boxBoolean(true);
                        } catch (Exception e3) {
                            e = e3;
                            function13.invoke(e);
                            return Boxing.boxBoolean(false);
                        }
                    } catch (CancellationException e4) {
                        e = e4;
                        list2 = list;
                    }
                } catch (Exception e5) {
                    e = e5;
                    function13 = function12;
                    function13.invoke(e);
                    return Boxing.boxBoolean(false);
                }
            } catch (CancellationException e6) {
                e = e6;
                function13 = function12;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function1 function14 = (Function1) nVar2.f67376t;
            List list3 = (List) nVar2.f67375n;
            try {
                ResultKt.throwOnFailure(objJ2);
                function13 = function14;
                list2 = list3;
                try {
                    return Boxing.boxBoolean(true);
                } catch (CancellationException e7) {
                    e = e7;
                }
            } catch (CancellationException e8) {
                e = e8;
                function13 = function14;
                list2 = list3;
            } catch (Exception e9) {
                e = e9;
                function13 = function14;
                function13.invoke(e);
                return Boxing.boxBoolean(false);
            }
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((com.google.firebase.storage.qf) it.next()).S();
        }
        Throwable cause = e.getCause();
        if (cause == null) {
            throw e;
        }
        function13.invoke(cause);
        return Boxing.boxBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ck(com.google.firebase.storage.o oVar) {
        return "FBS Upload path: " + oVar.qie();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }
}
