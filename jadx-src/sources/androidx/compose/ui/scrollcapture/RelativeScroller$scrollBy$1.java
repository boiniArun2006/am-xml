package androidx.compose.ui.scrollcapture;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", i = {0}, l = {l.f62284f}, m = "scrollBy", n = {"this"}, s = {"L$0"})
final class RelativeScroller$scrollBy$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ RelativeScroller f33218O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f33219n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f33220t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RelativeScroller$scrollBy$1(RelativeScroller relativeScroller, Continuation continuation) {
        super(continuation);
        this.f33218O = relativeScroller;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33220t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f33218O.O(0.0f, this);
    }
}
