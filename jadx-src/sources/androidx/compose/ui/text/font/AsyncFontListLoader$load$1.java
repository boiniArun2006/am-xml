package androidx.compose.ui.text.font;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {281, l.f62286h}, m = "load", n = {"this", "$this$fastForEach$iv", "font", "index$iv", "this", "$this$fastForEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
final class AsyncFontListLoader$load$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f33619O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f33620S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ AsyncFontListLoader f33621Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f33622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    /* synthetic */ Object f33623o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f33624r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f33625t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, Continuation continuation) {
        super(continuation);
        this.f33621Z = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33623o = obj;
        this.f33620S |= Integer.MIN_VALUE;
        return this.f33621Z.XQ(this);
    }
}
