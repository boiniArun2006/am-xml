package com.bendingspoons.injet.webbridge;

import GJW.DC;
import GJW.Dsr;
import GJW.OU;
import GJW.vd;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bendingspoons.injet.webbridge.AndroidBridge$Companion$registerAndroidBridge$bridge$1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.bendingspoons.injet.webbridge.AndroidBridge$Companion$registerAndroidBridge$bridge$1", f = "AndroidBridge.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
final class AndroidBridge$Companion$registerAndroidBridge$bridge$1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    final /* synthetic */ WebView $this_registerAndroidBridge;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidBridge$Companion$registerAndroidBridge$bridge$1(WebView webView, Continuation<? super AndroidBridge$Companion$registerAndroidBridge$bridge$1> continuation) {
        super(2, continuation);
        this.$this_registerAndroidBridge = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidBridge$Companion$registerAndroidBridge$bridge$1 androidBridge$Companion$registerAndroidBridge$bridge$1 = new AndroidBridge$Companion$registerAndroidBridge$bridge$1(this.$this_registerAndroidBridge, continuation);
        androidBridge$Companion$registerAndroidBridge$bridge$1.L$0 = obj;
        return androidBridge$Companion$registerAndroidBridge$bridge$1;
    }

    /* JADX INFO: renamed from: com.bendingspoons.injet.webbridge.AndroidBridge$Companion$registerAndroidBridge$bridge$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bendingspoons.injet.webbridge.AndroidBridge$Companion$registerAndroidBridge$bridge$1$1", f = "AndroidBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $it;
        final /* synthetic */ WebView $this_registerAndroidBridge;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WebView webView, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_registerAndroidBridge = webView;
            this.$it = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(String str) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_registerAndroidBridge, this.$it, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$this_registerAndroidBridge.evaluateJavascript(this.$it, new ValueCallback() { // from class: com.bendingspoons.injet.webbridge.w6
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        AndroidBridge$Companion$registerAndroidBridge$bridge$1.AnonymousClass1.invokeSuspend$lambda$0((String) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((AndroidBridge$Companion$registerAndroidBridge$bridge$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            DC dcT = OU.t();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_registerAndroidBridge, str, null);
            this.label = 1;
            if (Dsr.Uo(dcT, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
