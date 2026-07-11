package androidx.compose.ui.text.font;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", f = "FontFamilyResolver.kt", i = {0, 0}, l = {43}, m = "preload", n = {"this", TtmlNode.ATTR_TTS_FONT_FAMILY}, s = {"L$0", "L$1"})
final class FontFamilyResolverImpl$preload$1 extends ContinuationImpl {
    final /* synthetic */ FontFamilyResolverImpl J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f33661O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f33662n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f33663r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f33664t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontFamilyResolverImpl$preload$1(FontFamilyResolverImpl fontFamilyResolverImpl, Continuation continuation) {
        super(continuation);
        this.J2 = fontFamilyResolverImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33661O = obj;
        this.f33663r |= Integer.MIN_VALUE;
        return this.J2.KN(null, this);
    }
}
