package androidx.compose.ui.platform;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", i = {}, l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE}, m = "textInputSession", n = {}, s = {})
final class ChainedPlatformTextInputInterceptor$textInputSession$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f32873O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f32874n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ ChainedPlatformTextInputInterceptor f32875t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChainedPlatformTextInputInterceptor$textInputSession$1(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, Continuation continuation) {
        super(continuation);
        this.f32875t = chainedPlatformTextInputInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32874n = obj;
        this.f32873O |= Integer.MIN_VALUE;
        return this.f32875t.nr(null, null, this);
    }
}
