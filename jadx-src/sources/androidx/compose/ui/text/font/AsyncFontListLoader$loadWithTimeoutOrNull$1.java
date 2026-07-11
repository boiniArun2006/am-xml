package androidx.compose.ui.text.font;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0}, l = {Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE}, m = "loadWithTimeoutOrNull$ui_text_release", n = {"$this$loadWithTimeoutOrNull"}, s = {"L$0"})
final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ AsyncFontListLoader f33629O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f33630n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f33631t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, Continuation continuation) {
        super(continuation);
        this.f33629O = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33631t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f33629O.te(null, this);
    }
}
