package wQ;

import HI0.Lu;
import QmE.iF;
import QmE.j;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import androidx.view.ComponentActivity;
import com.alightcreative.firebase.DynamicLinkRequest;
import com.alightcreative.firebase.DynamicLinkResult;
import com.google.android.gms.tasks.Task;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import mCM.l3D;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class w6 {

    static final class j extends ContinuationImpl {
        boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f74949O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74950n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f74951o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f74952r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f74953t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74952r = obj;
            this.f74951o |= Integer.MIN_VALUE;
            return w6.nr(null, null, null, false, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    public static final class n extends SuspendLambda implements Function2 {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f74954O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74955n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ mCM.QJ f74956o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f74957r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f74958t;

        public static final class j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f74959n;

            public j(String str) {
                this.f74959n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FFunc/Calling: " + this.f74959n;
            }
        }

        /* JADX INFO: renamed from: wQ.w6$n$n, reason: collision with other inner class name */
        public static final class C1250n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f74960n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f74961t;

            public C1250n(String str, String str2) {
                this.f74960n = str;
                this.f74961t = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "typedCall:" + this.f74960n + ": IN / " + this.f74961t;
            }
        }

        /* JADX INFO: renamed from: wQ.w6$n$w6, reason: collision with other inner class name */
        public static final class C1251w6 implements com.google.android.gms.tasks.Continuation {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ mCM.QJ f74962n;
            final /* synthetic */ Continuation nr;
            final /* synthetic */ JsonAdapter rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f74963t;

            /* JADX INFO: renamed from: wQ.w6$n$w6$CN3 */
            public static final class CN3 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f74964n;

                public CN3(String str) {
                    this.f74964n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f74964n + ": FAIL";
                }
            }

            /* JADX INFO: renamed from: wQ.w6$n$w6$I28 */
            public static final class I28 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f74965n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Throwable f74966t;

                public I28(String str, Throwable th) {
                    this.f74965n = str;
                    this.f74966t = th;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f74965n + ": Parse error! " + this.f74966t;
                }
            }

            /* JADX INFO: renamed from: wQ.w6$n$w6$Ml */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
            public static final class Ml implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ String f74967O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f74968n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f74969t;

                public Ml(String str, int i2, String str2) {
                    this.f74968n = str;
                    this.f74969t = i2;
                    this.f74967O = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return qUrazMnwDskFs.ZdqMQSeqEw + this.f74968n + ": RESPONSE: " + StringsKt.padStart$default(String.valueOf(this.f74969t), 4, (char) 0, 2, (Object) null) + ": " + this.f74967O;
                }
            }

            /* JADX INFO: renamed from: wQ.w6$n$w6$Wre */
            public static final class Wre implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f74970n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f74971t;

                public Wre(String str, Object obj) {
                    this.f74970n = str;
                    this.f74971t = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f74970n + ": RESULT: " + this.f74971t;
                }
            }

            /* JADX INFO: renamed from: wQ.w6$n$w6$j */
            public static final class j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f74972n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Task f74973t;

                public j(String str, Task task) {
                    this.f74972n = str;
                    this.f74973t = task;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String message;
                    String str = this.f74972n;
                    Task task = this.f74973t;
                    boolean zIsSuccessful = task.isSuccessful();
                    boolean zIsCanceled = this.f74973t.isCanceled();
                    boolean zIsComplete = this.f74973t.isComplete();
                    Exception exception = this.f74973t.getException();
                    if (exception == null || (message = exception.getMessage()) == null) {
                        message = "NONE";
                    }
                    return "typedCall:" + str + ": CONTINUE (" + task + ") isSuccessful=" + zIsSuccessful + " isCanceled=" + zIsCanceled + " isComplete=" + zIsComplete + " exception=" + message;
                }
            }

            /* JADX INFO: renamed from: wQ.w6$n$w6$n, reason: collision with other inner class name */
            public static final class C1252n implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f74974n;

                public C1252n(String str) {
                    this.f74974n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f74974n + ": SUCCESS";
                }
            }

            /* JADX INFO: renamed from: wQ.w6$n$w6$w6, reason: collision with other inner class name */
            public static final class C1253w6 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f74975n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f74976t;

                public C1253w6(String str, String str2) {
                    this.f74975n = str;
                    this.f74976t = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f74975n + ": RESPONSE: len=" + this.f74976t.length();
                }
            }

            public C1251w6(mCM.QJ qj, JsonAdapter jsonAdapter, String str, Continuation continuation) {
                this.f74962n = qj;
                this.rl = jsonAdapter;
                this.f74963t = str;
                this.nr = continuation;
            }

            public final void n(Task task) {
                Object objM313constructorimpl;
                Object obj;
                Object objM313constructorimpl2;
                Object objM313constructorimpl3;
                Object objM313constructorimpl4;
                Object objM313constructorimpl5;
                Intrinsics.checkNotNullParameter(task, "task");
                XoT.C.Uo(this.f74962n, new j(this.f74963t, task));
                if (task.isSuccessful()) {
                    l3D l3d = (l3D) task.getResult();
                    if (l3d == null) {
                        Result.Companion companion = Result.INSTANCE;
                        Object objM313constructorimpl6 = Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")));
                        Continuation continuation = this.nr;
                        if (Result.m320isSuccessimpl(objM313constructorimpl6)) {
                            obj = Result.m319isFailureimpl(objM313constructorimpl6) ? null : objM313constructorimpl6;
                            Intrinsics.checkNotNull(obj);
                            objM313constructorimpl3 = Result.m313constructorimpl(obj);
                        } else {
                            Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl6);
                            Intrinsics.checkNotNull(thM316exceptionOrNullimpl);
                            objM313constructorimpl3 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl));
                        }
                        continuation.resumeWith(objM313constructorimpl3);
                        return;
                    }
                    XoT.C.Uo(this.f74962n, new C1252n(this.f74963t));
                    Moshi moshiN = Lu.n();
                    Object obj2 = l3d.f70669n;
                    JsonAdapter jsonAdapterAdapter = moshiN.adapter(Object.class);
                    Intrinsics.checkNotNull(jsonAdapterAdapter);
                    JsonAdapter jsonAdapterIndent = jsonAdapterAdapter.indent("    ");
                    Intrinsics.checkNotNull(jsonAdapterIndent);
                    String json = jsonAdapterIndent.toJson(obj2);
                    Intrinsics.checkNotNull(json);
                    XoT.C.Uo(this.f74962n, new C1253w6(this.f74963t, json));
                    Sequence<String> sequenceLineSequence = StringsKt.lineSequence(json);
                    mCM.QJ qj = this.f74962n;
                    String str = this.f74963t;
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
                        XoT.C.Uo(this.f74962n, new Wre(this.f74963t, objFromJson));
                        if (objFromJson != null) {
                            Object objM313constructorimpl7 = Result.m313constructorimpl(objFromJson);
                            Continuation continuation2 = this.nr;
                            if (Result.m320isSuccessimpl(objM313constructorimpl7)) {
                                obj = Result.m319isFailureimpl(objM313constructorimpl7) ? null : objM313constructorimpl7;
                                Intrinsics.checkNotNull(obj);
                                objM313constructorimpl5 = Result.m313constructorimpl(obj);
                            } else {
                                Throwable thM316exceptionOrNullimpl2 = Result.m316exceptionOrNullimpl(objM313constructorimpl7);
                                Intrinsics.checkNotNull(thM316exceptionOrNullimpl2);
                                objM313constructorimpl5 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl2));
                            }
                            continuation2.resumeWith(objM313constructorimpl5);
                            return;
                        }
                    } catch (Throwable th) {
                        XoT.C.Uo(this.f74962n, new I28(this.f74963t, th));
                        Result.Companion companion2 = Result.INSTANCE;
                        Object objM313constructorimpl8 = Result.m313constructorimpl(ResultKt.createFailure(th));
                        Continuation continuation3 = this.nr;
                        if (Result.m320isSuccessimpl(objM313constructorimpl8)) {
                            obj = Result.m319isFailureimpl(objM313constructorimpl8) ? null : objM313constructorimpl8;
                            Intrinsics.checkNotNull(obj);
                            objM313constructorimpl4 = Result.m313constructorimpl(obj);
                        } else {
                            Throwable thM316exceptionOrNullimpl3 = Result.m316exceptionOrNullimpl(objM313constructorimpl8);
                            Intrinsics.checkNotNull(thM316exceptionOrNullimpl3);
                            objM313constructorimpl4 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl3));
                        }
                        continuation3.resumeWith(objM313constructorimpl4);
                        return;
                    }
                }
                XoT.C.Uo(this.f74962n, new CN3(this.f74963t));
                Exception exception = task.getException();
                if (exception != null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Object objM313constructorimpl9 = Result.m313constructorimpl(ResultKt.createFailure(exception));
                    Continuation continuation4 = this.nr;
                    if (Result.m320isSuccessimpl(objM313constructorimpl9)) {
                        obj = Result.m319isFailureimpl(objM313constructorimpl9) ? null : objM313constructorimpl9;
                        Intrinsics.checkNotNull(obj);
                        objM313constructorimpl2 = Result.m313constructorimpl(obj);
                    } else {
                        Throwable thM316exceptionOrNullimpl4 = Result.m316exceptionOrNullimpl(objM313constructorimpl9);
                        Intrinsics.checkNotNull(thM316exceptionOrNullimpl4);
                        objM313constructorimpl2 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl4));
                    }
                    continuation4.resumeWith(objM313constructorimpl2);
                    return;
                }
                Result.Companion companion4 = Result.INSTANCE;
                Object objM313constructorimpl10 = Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")));
                Continuation continuation5 = this.nr;
                if (Result.m320isSuccessimpl(objM313constructorimpl10)) {
                    obj = Result.m319isFailureimpl(objM313constructorimpl10) ? null : objM313constructorimpl10;
                    Intrinsics.checkNotNull(obj);
                    objM313constructorimpl = Result.m313constructorimpl(obj);
                } else {
                    Throwable thM316exceptionOrNullimpl5 = Result.m316exceptionOrNullimpl(objM313constructorimpl10);
                    Intrinsics.checkNotNull(thM316exceptionOrNullimpl5);
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl5));
                }
                continuation5.resumeWith(objM313constructorimpl);
            }

            @Override // com.google.android.gms.tasks.Continuation
            public /* bridge */ /* synthetic */ Object then(Task task) {
                n(task);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, mCM.QJ qj, Continuation continuation) {
            super(2, continuation);
            this.f74957r = str;
            this.f74956o = qj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f74957r, this.f74956o, continuation);
            nVar.J2 = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74954O;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.J2;
            XoT.C.KN("FFunc", new j(this.f74957r));
            mCM.QJ qj = this.f74956o;
            String str = this.f74957r;
            this.J2 = obj2;
            this.f74955n = qj;
            this.f74958t = str;
            this.f74954O = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            JsonAdapter jsonAdapterAdapter = Lu.n().adapter(DynamicLinkRequest.class);
            Intrinsics.checkNotNull(jsonAdapterAdapter);
            String json = jsonAdapterAdapter.toJson(obj2);
            Intrinsics.checkNotNull(json);
            XoT.C.Uo(qj, new C1250n(str, json));
            qj.rl(new JSONObject(json)).continueWith(new C1251w6(qj, Lu.n().adapter(DynamicLinkResult.class), str, safeContinuation));
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
            return orThrow;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Continuation continuation) {
            return ((n) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: wQ.w6$w6, reason: collision with other inner class name */
    static final class C1254w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f74977O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74978n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f74979t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74979t = obj;
            this.f74977O |= Integer.MIN_VALUE;
            return w6.Uo(null, null, this);
        }

        C1254w6(Continuation continuation) {
            super(continuation);
        }
    }

    public static /* synthetic */ Object J2(ComponentActivity componentActivity, String str, iF iFVar, boolean z2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return O(componentActivity, str, iFVar, z2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN(DynamicLinkResult dynamicLinkResult) {
        return "resolveDynamicLink: failed: " + dynamicLinkResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Uo(String str, iF iFVar, Continuation continuation) {
        C1254w6 c1254w6;
        if (continuation instanceof C1254w6) {
            c1254w6 = (C1254w6) continuation;
            int i2 = c1254w6.f74977O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1254w6.f74977O = i2 - Integer.MIN_VALUE;
            } else {
                c1254w6 = new C1254w6(continuation);
            }
        }
        Object objInvoke = c1254w6.f74979t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c1254w6.f74977O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            DynamicLinkRequest dynamicLinkRequest = new DynamicLinkRequest(str);
            iFVar.n(QmE.CN3.f8341n);
            n nVar = new n("resolveDynamicLink", com.google.firebase.functions.n.mUb.t().ck("resolveDynamicLink"), null);
            c1254w6.f74978n = iFVar;
            c1254w6.f74977O = 1;
            objInvoke = nVar.invoke(dynamicLinkRequest, c1254w6);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iFVar = (iF) c1254w6.f74978n;
            ResultKt.throwOnFailure(objInvoke);
        }
        final DynamicLinkResult dynamicLinkResult = (DynamicLinkResult) objInvoke;
        if (dynamicLinkResult.getLongLink() != null) {
            iFVar.n(new QmE.I28(dynamicLinkResult.getReason()));
            return dynamicLinkResult.getLongLink();
        }
        XoT.C.KN("resolveDynamicLink", new Function0() { // from class: wQ.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.KN(dynamicLinkResult);
            }
        });
        iFVar.n(new QmE.Wre(dynamicLinkResult.getReason()));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nr(ComponentActivity componentActivity, Intent intent, iF iFVar, boolean z2, Continuation continuation) throws Exception {
        j jVar;
        String queryParameter;
        boolean z3;
        Object objUo;
        String path;
        Uri uri;
        Uri data;
        Intent intent2 = intent;
        iF iFVar2 = iFVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f74951o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f74951o = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f74952r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f74951o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Uri data2 = intent2.getData();
            queryParameter = data2 != null ? data2.getQueryParameter("source") : null;
            String dataString = intent2.getDataString();
            intent2.setData(dataString != null ? Uri.parse(StringsKt.replace$default(dataString, "//alight.link/", "//alight.page.link/", false, 4, (Object) null)) : null);
            String dataString2 = intent2.getDataString();
            if (dataString2 == null) {
                throw new Exception("No link to resolve");
            }
            iFVar2.n(new j.Dsr(dataString2, queryParameter));
            Uri data3 = intent2.getData();
            if (data3 != null && (path = data3.getPath()) != null && StringsKt.startsWith$default(path, "/am/share/u/", false, 2, (Object) null)) {
                return data3;
            }
            jVar.f74950n = intent2;
            jVar.f74953t = iFVar2;
            jVar.f74949O = queryParameter;
            z3 = z2;
            jVar.J2 = z3;
            jVar.f74951o = 1;
            objUo = Uo(dataString2, iFVar2, jVar);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z4 = jVar.J2;
            String str = (String) jVar.f74949O;
            iF iFVar3 = (iF) jVar.f74953t;
            Intent intent3 = (Intent) jVar.f74950n;
            ResultKt.throwOnFailure(obj);
            z3 = z4;
            intent2 = intent3;
            objUo = obj;
            queryParameter = str;
            iFVar2 = iFVar3;
        }
        String str2 = (String) objUo;
        if (str2 == null || (uri = Uri.parse(str2)) == null) {
            throw new Exception("Failed to resolve dynamic link");
        }
        if (z3 && (data = intent2.getData()) != null) {
            String string = data.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            iFVar2.n(new j.Dsr(string, queryParameter));
        }
        String path2 = uri.getPath();
        if (path2 != null && StringsKt.startsWith$default(path2, "/am/share/u/", false, 2, (Object) null)) {
            return uri;
        }
        throw new Exception("Invalid project package link:\n" + uri);
    }

    private static final Intent t(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return intent;
    }

    public static final Object O(ComponentActivity componentActivity, String str, iF iFVar, boolean z2, Continuation continuation) {
        return nr(componentActivity, t(str), iFVar, z2, continuation);
    }
}
