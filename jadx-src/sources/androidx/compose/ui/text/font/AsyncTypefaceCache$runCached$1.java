package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0}, l = {412}, m = "runCached", n = {"this", "key", "forever"}, s = {"L$0", "L$1", "Z$0"})
final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f33639O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f33640n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f33641o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ AsyncTypefaceCache f33642r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f33643t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, Continuation continuation) {
        super(continuation);
        this.f33642r = asyncTypefaceCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f33641o |= Integer.MIN_VALUE;
        return this.f33642r.Uo(null, null, false, null, this);
    }
}
