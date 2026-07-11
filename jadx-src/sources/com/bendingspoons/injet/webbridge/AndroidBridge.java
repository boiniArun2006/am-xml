package com.bendingspoons.injet.webbridge;

import GJW.C;
import GJW.vd;
import KW9.n;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.time.Kw.znsSxz;
import com.bendingspoons.injet.webbridge.AndroidBridge;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'BÃ\u0001\u00122\u0010\n\u001a.\u0012\u0004\u0012\u00020\u0003\u0012$\u0012\"\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\b0\u0004j\u0002`\t0\u0002\u0012C\u0010\u0011\u001a?\u0012\u0004\u0012\u00020\u0003\u00125\u00123\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\u00100\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00121\u0010\u0015\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u0003H\u0007¢\u0006\u0004\b!\u0010\"R@\u0010\n\u001a.\u0012\u0004\u0012\u00020\u0003\u0012$\u0012\"\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\b0\u0004j\u0002`\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#RQ\u0010\u0011\u001a?\u0012\u0004\u0012\u00020\u0003\u00125\u00123\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\u00100\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R?\u0010\u0015\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&¨\u0006("}, d2 = {"Lcom/bendingspoons/injet/webbridge/AndroidBridge;", "", "", "", "Lkotlin/Function1;", "Lx0X/n;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "Lcom/bendingspoons/injet/webbridge/InjetFunctionCallback;", "functionCallbacks", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "input", "Lkotlin/coroutines/Continuation;", "Lcom/bendingspoons/injet/webbridge/InjetNativeFunction;", "nativeFunctions", "LrB/Ml;", "spiderSense", "js", "evaluateJavascript", "LGJW/vd;", "coroutineScope", "<init>", "(Ljava/util/Map;Ljava/util/Map;LrB/Ml;Lkotlin/jvm/functions/Function2;LGJW/vd;)V", "jsOutput", "nativeCallbackId", "executeWebFunction", "(Ljava/lang/String;Ljava/lang/String;)V", "functionName", "jsonInput", "callbackId", "callNativeFunction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/Map;", "LrB/Ml;", "Lkotlin/jvm/functions/Function2;", "LGJW/vd;", "Companion", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidBridge.kt\ncom/bendingspoons/injet/webbridge/AndroidBridge\n+ 2 JsonUtils.kt\ncom/bendingspoons/serialization/json/JsonUtilsKt\n*L\n1#1,133:1\n80#2,9:134\n*S KotlinDebug\n*F\n+ 1 AndroidBridge.kt\ncom/bendingspoons/injet/webbridge/AndroidBridge\n*L\n36#1:134,9\n*E\n"})
public final class AndroidBridge {
    private static final String INTERFACE = "androidBridge";
    private final vd coroutineScope;
    private final Function2<String, Continuation<? super Unit>, Object> evaluateJavascript;
    private final Map<String, Function1<x0X.n, Unit>> functionCallbacks;
    private final Map<String, Function2<String, Continuation<? super String>, Object>> nativeFunctions;
    private final rB.Ml spiderSense;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009a\u0001\u0010\u0019\u001a\u00020\u000b*\u00020\u000422\u0010\r\u001a.\u0012\u0004\u0012\u00020\u0006\u0012$\u0012\"\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u00060\b\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\f0\u00052C\u0010\u0014\u001a?\u0012\u0004\u0012\u00020\u0006\u00125\u00123\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000ej\u0002`\u00130\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/bendingspoons/injet/webbridge/AndroidBridge$Companion;", "", "<init>", "()V", "Landroid/webkit/WebView;", "", "", "Lkotlin/Function1;", "Lx0X/n;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "Lcom/bendingspoons/injet/webbridge/InjetFunctionCallback;", "functionCallbacks", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "input", "Lkotlin/coroutines/Continuation;", "Lcom/bendingspoons/injet/webbridge/InjetNativeFunction;", "nativeFunctions", "LrB/Ml;", "spiderSense", "LGJW/vd;", "coroutineScope", "registerAndroidBridge", "(Landroid/webkit/WebView;Ljava/util/Map;Ljava/util/Map;LrB/Ml;LGJW/vd;)V", "INTERFACE", "Ljava/lang/String;", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void registerAndroidBridge(WebView webView, Map<String, ? extends Function1<? super x0X.n, Unit>> functionCallbacks, Map<String, ? extends Function2<? super String, ? super Continuation<? super String>, ? extends Object>> nativeFunctions, rB.Ml spiderSense, vd coroutineScope) {
            Intrinsics.checkNotNullParameter(webView, znsSxz.SBMAsV);
            Intrinsics.checkNotNullParameter(functionCallbacks, "functionCallbacks");
            Intrinsics.checkNotNullParameter(nativeFunctions, "nativeFunctions");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            webView.addJavascriptInterface(new AndroidBridge(functionCallbacks, nativeFunctions, spiderSense, new AndroidBridge$Companion$registerAndroidBridge$bridge$1(webView, null), coroutineScope), AndroidBridge.INTERFACE);
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.injet.webbridge.AndroidBridge$callNativeFunction$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bendingspoons.injet.webbridge.AndroidBridge$callNativeFunction$2", f = "AndroidBridge.kt", i = {0, 1}, l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER, 83}, m = "invokeSuspend", n = {"mark$iv$iv", "functionDuration"}, s = {"J$0", "J$0"})
    @SourceDebugExtension({"SMAP\nAndroidBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidBridge.kt\ncom/bendingspoons/injet/webbridge/AndroidBridge$callNativeFunction$2\n+ 2 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,133:1\n95#2:134\n135#2,3:135\n*S KotlinDebug\n*F\n+ 1 AndroidBridge.kt\ncom/bendingspoons/injet/webbridge/AndroidBridge$callNativeFunction$2\n*L\n74#1:134\n74#1:135,3\n*E\n"})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $callbackId;
        final /* synthetic */ String $functionName;
        final /* synthetic */ String $jsonInput;
        final /* synthetic */ Function2<String, Continuation<? super String>, Object> $nativeFunction;
        long J$0;
        int label;
        final /* synthetic */ AndroidBridge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, AndroidBridge androidBridge, String str2, String str3, Function2<? super String, ? super Continuation<? super String>, ? extends Object> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callbackId = str;
            this.this$0 = androidBridge;
            this.$functionName = str2;
            this.$jsonInput = str3;
            this.$nativeFunction = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$callbackId, this.this$0, this.$functionName, this.$jsonInput, this.$nativeFunction, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$1(String str, String str2, String str3, long j2) {
            return str + "(" + str2 + ")->" + CollectionsKt.joinToString$default(StringsKt.lines(str3), null, null, null, 0, null, null, 63, null) + " " + Duration.m1663getInWholeMillisecondsimpl(j2);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j2;
            long j3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        j3 = this.J$0;
                        ResultKt.throwOnFailure(obj);
                        Duration.Companion companion = Duration.INSTANCE;
                        if (Duration.m1651compareToLRDsOJo(j3, DurationKt.toDuration(100, DurationUnit.MILLISECONDS)) > 0) {
                            KW9.w6.rl(this.this$0.spiderSense, new n.I28.j(this.$functionName, Duration.m1663getInWholeMillisecondsimpl(j3), this.$jsonInput));
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = this.J$0;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Function2<String, Continuation<? super String>, Object> function2 = this.$nativeFunction;
                String str = this.$jsonInput;
                long jM1761markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1761markNowz9LOYto();
                this.J$0 = jM1761markNowz9LOYto;
                this.label = 1;
                obj = function2.invoke(str, this);
                if (obj != coroutine_suspended) {
                    j2 = jM1761markNowz9LOYto;
                }
                return coroutine_suspended;
            }
            TimedValue timedValue = new TimedValue((String) obj, TimeSource.Monotonic.ValueTimeMark.m1766elapsedNowUwyO8pc(j2), null);
            String str2 = (String) timedValue.component1();
            final long duration = timedValue.getDuration();
            final String strTrimIndent = StringsKt.trimIndent("\n                handleNativeResponse('" + this.$callbackId + "', " + str2 + ");\n            ");
            KW9.j jVar = KW9.j.f5464n;
            final String str3 = this.$functionName;
            final String str4 = this.$jsonInput;
            jVar.n("callNativeFunction", new Function0() { // from class: com.bendingspoons.injet.webbridge.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AndroidBridge.AnonymousClass2.invokeSuspend$lambda$1(str3, str4, strTrimIndent, duration);
                }
            });
            Function2 function22 = this.this$0.evaluateJavascript;
            this.J$0 = duration;
            this.label = 2;
            if (function22.invoke(strTrimIndent, this) != coroutine_suspended) {
                j3 = duration;
                Duration.Companion companion2 = Duration.INSTANCE;
                if (Duration.m1651compareToLRDsOJo(j3, DurationKt.toDuration(100, DurationUnit.MILLISECONDS)) > 0) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidBridge(Map<String, ? extends Function1<? super x0X.n, Unit>> functionCallbacks, Map<String, ? extends Function2<? super String, ? super Continuation<? super String>, ? extends Object>> nativeFunctions, rB.Ml spiderSense, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> evaluateJavascript, vd coroutineScope) {
        Intrinsics.checkNotNullParameter(functionCallbacks, "functionCallbacks");
        Intrinsics.checkNotNullParameter(nativeFunctions, "nativeFunctions");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(evaluateJavascript, "evaluateJavascript");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.functionCallbacks = functionCallbacks;
        this.nativeFunctions = nativeFunctions;
        this.spiderSense = spiderSense;
        this.evaluateJavascript = evaluateJavascript;
        this.coroutineScope = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String callNativeFunction$lambda$1(String str) {
        return "[WARNING] native function " + str + " could not be found.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String executeWebFunction$lambda$0(String str, String str2) {
        return str + ", " + str2;
    }

    @JavascriptInterface
    public final void callNativeFunction(final String functionName, String jsonInput, String callbackId) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Function2<String, Continuation<? super String>, Object> function2 = this.nativeFunctions.get(functionName);
        if (function2 != null) {
            C.nr(this.coroutineScope, null, null, new AnonymousClass2(callbackId, this, functionName, jsonInput, function2, null), 3, null);
        } else {
            KW9.j.f5464n.n("callNativeFunction", new Function0() { // from class: com.bendingspoons.injet.webbridge.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AndroidBridge.callNativeFunction$lambda$1(functionName);
                }
            });
            KW9.w6.n(this.spiderSense, new n.j.fuX(functionName));
        }
    }

    @JavascriptInterface
    public final void executeWebFunction(final String jsOutput, final String nativeCallbackId) {
        x0X.n c1266n;
        Intrinsics.checkNotNullParameter(jsOutput, "jsOutput");
        Intrinsics.checkNotNullParameter(nativeCallbackId, "nativeCallbackId");
        KW9.j.f5464n.n("executeWebFunction", new Function0() { // from class: com.bendingspoons.injet.webbridge.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidBridge.executeWebFunction$lambda$0(jsOutput, nativeCallbackId);
            }
        });
        WebOutput webOutput = (WebOutput) et.w6.rl().adapter(WebOutput.class).fromJson(jsOutput);
        if (webOutput == null) {
            KW9.w6.n(this.spiderSense, new n.j.aC(jsOutput));
        }
        if (Intrinsics.areEqual(webOutput != null ? webOutput.getType() : null, "success")) {
            String data = webOutput.getData();
            if (data == null) {
                data = "";
            }
            c1266n = new n.w6(data);
        } else {
            c1266n = new n.C1266n(new Exception(webOutput != null ? webOutput.getData() : null));
        }
        Function1<x0X.n, Unit> function1 = this.functionCallbacks.get(nativeCallbackId);
        if (function1 == null) {
            KW9.w6.n(this.spiderSense, new n.j.Dsr(nativeCallbackId));
        } else {
            function1.invoke(c1266n);
        }
    }
}
