package com.alightcreative.importer.xml.data;

import HI0.Lu;
import XoT.C;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.importer.xml.data.XmlValidationBackend;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.functions.n;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import mCM.QJ;
import mCM.l3D;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\r\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R7\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/alightcreative/importer/xml/data/XmlValidationBackend;", "", "<init>", "()V", "validateXMLBeforeImporting", "Lkotlin/Function2;", "Lcom/alightcreative/importer/xml/data/XmlValidationBackend$ValidateXmlRequest;", "Lkotlin/coroutines/Continuation;", "Lcom/alightcreative/importer/xml/data/XmlValidationBackend$ValidateXmlResponse;", "getValidateXMLBeforeImporting", "()Lkotlin/jvm/functions/Function2;", "validateXMLBeforeImporting$delegate", "Lkotlin/Lazy;", "ValidateXmlRequest", "ValidateXmlResponse", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nXmlValidationBackend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlValidationBackend.kt\ncom/alightcreative/importer/xml/data/XmlValidationBackend\n+ 2 Functions.kt\ncom/alightcreative/firebase/FunctionsKt\n*L\n1#1,23:1\n48#2,2:24\n*S KotlinDebug\n*F\n+ 1 XmlValidationBackend.kt\ncom/alightcreative/importer/xml/data/XmlValidationBackend\n*L\n11#1:24,2\n*E\n"})
public final class XmlValidationBackend {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: validateXMLBeforeImporting$delegate, reason: from kotlin metadata */
    private final Lazy validateXMLBeforeImporting = LazyKt.lazy(new Function0() { // from class: X.Ml
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return XmlValidationBackend.validateXMLBeforeImporting_delegate$lambda$0();
        }
    });

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/alightcreative/importer/xml/data/XmlValidationBackend$ValidateXmlRequest;", "", "xmlString", "", "<init>", "(Ljava/lang/String;)V", "getXmlString", "()Ljava/lang/String;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ValidateXmlRequest {
        public static final int $stable = 0;
        private final String xmlString;

        public static /* synthetic */ ValidateXmlRequest copy$default(ValidateXmlRequest validateXmlRequest, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = validateXmlRequest.xmlString;
            }
            return validateXmlRequest.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getXmlString() {
            return this.xmlString;
        }

        public final ValidateXmlRequest copy(String xmlString) {
            Intrinsics.checkNotNullParameter(xmlString, "xmlString");
            return new ValidateXmlRequest(xmlString);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidateXmlRequest) && Intrinsics.areEqual(this.xmlString, ((ValidateXmlRequest) other).xmlString);
        }

        public int hashCode() {
            return this.xmlString.hashCode();
        }

        public String toString() {
            return "ValidateXmlRequest(xmlString=" + this.xmlString + ")";
        }

        public ValidateXmlRequest(String xmlString) {
            Intrinsics.checkNotNullParameter(xmlString, "xmlString");
            this.xmlString = xmlString;
        }

        public final String getXmlString() {
            return this.xmlString;
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/alightcreative/importer/xml/data/XmlValidationBackend$ValidateXmlResponse;", "", "xmlIsSafe", "", "<init>", "(Z)V", "getXmlIsSafe", "()Z", "component1", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ValidateXmlResponse {
        public static final int $stable = 0;
        private final boolean xmlIsSafe;

        public static /* synthetic */ ValidateXmlResponse copy$default(ValidateXmlResponse validateXmlResponse, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = validateXmlResponse.xmlIsSafe;
            }
            return validateXmlResponse.copy(z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getXmlIsSafe() {
            return this.xmlIsSafe;
        }

        public final ValidateXmlResponse copy(boolean xmlIsSafe) {
            return new ValidateXmlResponse(xmlIsSafe);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidateXmlResponse) && this.xmlIsSafe == ((ValidateXmlResponse) other).xmlIsSafe;
        }

        public int hashCode() {
            return Boolean.hashCode(this.xmlIsSafe);
        }

        public String toString() {
            return "ValidateXmlResponse(xmlIsSafe=" + this.xmlIsSafe + ")";
        }

        public final boolean getXmlIsSafe() {
            return this.xmlIsSafe;
        }

        public ValidateXmlResponse(boolean z2) {
            this.xmlIsSafe = z2;
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f46636O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f46637n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ QJ f46638o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f46639r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46640t;

        /* JADX INFO: renamed from: com.alightcreative.importer.xml.data.XmlValidationBackend$j$j, reason: collision with other inner class name */
        public static final class C0659j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f46641n;

            public C0659j(String str) {
                this.f46641n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FFunc/Calling: " + this.f46641n;
            }
        }

        public static final class n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f46642n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f46643t;

            public n(String str, String str2) {
                this.f46642n = str;
                this.f46643t = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "typedCall:" + this.f46642n + ": IN / " + this.f46643t;
            }
        }

        public static final class w6 implements Continuation {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ QJ f46644n;
            final /* synthetic */ kotlin.coroutines.Continuation nr;
            final /* synthetic */ JsonAdapter rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f46645t;

            public static final class CN3 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46646n;

                public CN3(String str) {
                    this.f46646n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f46646n + ": FAIL";
                }
            }

            public static final class I28 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46647n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Throwable f46648t;

                public I28(String str, Throwable th) {
                    this.f46647n = str;
                    this.f46648t = th;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f46647n + ": Parse error! " + this.f46648t;
                }
            }

            public static final class Ml implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ String f46649O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46650n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f46651t;

                public Ml(String str, int i2, String str2) {
                    this.f46650n = str;
                    this.f46651t = i2;
                    this.f46649O = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f46650n + ": RESPONSE: " + StringsKt.padStart$default(String.valueOf(this.f46651t), 4, (char) 0, 2, (Object) null) + ": " + this.f46649O;
                }
            }

            public static final class Wre implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46652n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f46653t;

                public Wre(String str, Object obj) {
                    this.f46652n = str;
                    this.f46653t = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f46652n + ": RESULT: " + this.f46653t;
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.importer.xml.data.XmlValidationBackend$j$w6$j, reason: collision with other inner class name */
            public static final class C0660j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46654n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Task f46655t;

                public C0660j(String str, Task task) {
                    this.f46654n = str;
                    this.f46655t = task;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String message;
                    String str = this.f46654n;
                    Task task = this.f46655t;
                    boolean zIsSuccessful = task.isSuccessful();
                    boolean zIsCanceled = this.f46655t.isCanceled();
                    boolean zIsComplete = this.f46655t.isComplete();
                    Exception exception = this.f46655t.getException();
                    if (exception == null || (message = exception.getMessage()) == null) {
                        message = "NONE";
                    }
                    return "typedCall:" + str + ": CONTINUE (" + task + ") isSuccessful=" + zIsSuccessful + " isCanceled=" + zIsCanceled + " isComplete=" + zIsComplete + " exception=" + message;
                }
            }

            public static final class n implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46656n;

                public n(String str) {
                    this.f46656n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f46656n + ": SUCCESS";
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.importer.xml.data.XmlValidationBackend$j$w6$w6, reason: collision with other inner class name */
            public static final class C0661w6 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f46657n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f46658t;

                public C0661w6(String str, String str2) {
                    this.f46657n = str;
                    this.f46658t = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f46657n + ": RESPONSE: len=" + this.f46658t.length();
                }
            }

            public w6(QJ qj, JsonAdapter jsonAdapter, String str, kotlin.coroutines.Continuation continuation) {
                this.f46644n = qj;
                this.rl = jsonAdapter;
                this.f46645t = str;
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
                C.Uo(this.f46644n, new C0660j(this.f46645t, task));
                if (task.isSuccessful()) {
                    l3D l3d = (l3D) task.getResult();
                    if (l3d == null) {
                        Result.Companion companion = Result.INSTANCE;
                        Object objM313constructorimpl6 = Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")));
                        kotlin.coroutines.Continuation continuation = this.nr;
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
                    C.Uo(this.f46644n, new n(this.f46645t));
                    Moshi moshiN = Lu.n();
                    Object obj2 = l3d.f70669n;
                    JsonAdapter jsonAdapterAdapter = moshiN.adapter(Object.class);
                    Intrinsics.checkNotNull(jsonAdapterAdapter);
                    JsonAdapter jsonAdapterIndent = jsonAdapterAdapter.indent("    ");
                    Intrinsics.checkNotNull(jsonAdapterIndent);
                    String json = jsonAdapterIndent.toJson(obj2);
                    Intrinsics.checkNotNull(json);
                    C.Uo(this.f46644n, new C0661w6(this.f46645t, json));
                    Sequence<String> sequenceLineSequence = StringsKt.lineSequence(json);
                    QJ qj = this.f46644n;
                    String str = this.f46645t;
                    int i2 = 0;
                    for (String str2 : sequenceLineSequence) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        C.Uo(qj, new Ml(str, i2, str2));
                        i2 = i3;
                    }
                    try {
                        Object objFromJson = this.rl.fromJson(json);
                        C.Uo(this.f46644n, new Wre(this.f46645t, objFromJson));
                        if (objFromJson != null) {
                            Object objM313constructorimpl7 = Result.m313constructorimpl(objFromJson);
                            kotlin.coroutines.Continuation continuation2 = this.nr;
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
                        C.Uo(this.f46644n, new I28(this.f46645t, th));
                        Result.Companion companion2 = Result.INSTANCE;
                        Object objM313constructorimpl8 = Result.m313constructorimpl(ResultKt.createFailure(th));
                        kotlin.coroutines.Continuation continuation3 = this.nr;
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
                C.Uo(this.f46644n, new CN3(this.f46645t));
                Exception exception = task.getException();
                if (exception != null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Object objM313constructorimpl9 = Result.m313constructorimpl(ResultKt.createFailure(exception));
                    kotlin.coroutines.Continuation continuation4 = this.nr;
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
                kotlin.coroutines.Continuation continuation5 = this.nr;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation create(Object obj, kotlin.coroutines.Continuation continuation) {
            j jVar = new j(this.f46639r, this.f46638o, continuation);
            jVar.J2 = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kotlin.coroutines.Continuation continuation) {
            return ((j) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, QJ qj, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.f46639r = str;
            this.f46638o = qj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46636O;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.J2;
            C.KN("FFunc", new C0659j(this.f46639r));
            QJ qj = this.f46638o;
            String str = this.f46639r;
            this.J2 = obj2;
            this.f46637n = qj;
            this.f46640t = str;
            this.f46636O = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            JsonAdapter jsonAdapterAdapter = Lu.n().adapter(ValidateXmlRequest.class);
            Intrinsics.checkNotNull(jsonAdapterAdapter);
            String json = jsonAdapterAdapter.toJson(obj2);
            Intrinsics.checkNotNull(json);
            C.Uo(qj, new n(str, json));
            qj.rl(new JSONObject(json)).continueWith(new w6(qj, Lu.n().adapter(ValidateXmlResponse.class), str, safeContinuation));
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
            return orThrow;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2 validateXMLBeforeImporting_delegate$lambda$0() {
        return new j("validateProjectPackageXML", n.mUb.t().ck("validateProjectPackageXML"), null);
    }

    public final Function2<ValidateXmlRequest, kotlin.coroutines.Continuation<? super ValidateXmlResponse>, Object> getValidateXMLBeforeImporting() {
        return (Function2) this.validateXMLBeforeImporting.getValue();
    }
}
