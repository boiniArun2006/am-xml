package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", i = {1, 1}, l = {55, 57}, m = "awaitLoad", n = {"this", "font"}, s = {"L$0", "L$1"})
final class AndroidFontLoader$awaitLoad$1 extends ContinuationImpl {
    final /* synthetic */ AndroidFontLoader J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f33606O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f33607n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f33608r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f33609t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, Continuation continuation) {
        super(continuation);
        this.J2 = androidFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33606O = obj;
        this.f33608r |= Integer.MIN_VALUE;
        return this.J2.t(null, this);
    }
}
