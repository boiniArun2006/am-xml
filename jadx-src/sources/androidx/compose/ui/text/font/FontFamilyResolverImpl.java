package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "platformFamilyTypefaceAdapter", "<init>", "(Landroidx/compose/ui/text/font/PlatformFontLoader;Landroidx/compose/ui/text/font/PlatformResolveInterceptor;Landroidx/compose/ui/text/font/TypefaceRequestCache;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;)V", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/runtime/State;", "", "xMQ", "(Landroidx/compose/ui/text/font/TypefaceRequest;)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/text/font/FontFamily;", TtmlNode.ATTR_TTS_FONT_FAMILY, "", "KN", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", c.f62177j, "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Uo", "()Landroidx/compose/ui/text/font/PlatformFontLoader;", "rl", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "t", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "nr", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "O", "Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "Lkotlin/Function1;", "J2", "Lkotlin/jvm/functions/Function1;", "createDefaultTypeface", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,259:1\n150#2,3:260\n34#2,6:263\n153#2:269\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n*L\n46#1:260,3\n46#1:263,6\n46#1:269\n*E\n"})
public final class FontFamilyResolverImpl implements FontFamily.Resolver {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Function1 createDefaultTypeface;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final PlatformFontLoader platformFontLoader;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final PlatformResolveInterceptor platformResolveInterceptor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final TypefaceRequestCache typefaceRequestCache;

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter) {
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFontFamilyTypefaceAdapter;
        this.createDefaultTypeface = new Function1<TypefaceRequest, Object>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TypefaceRequest typefaceRequest) {
                return this.f33660n.xMQ(TypefaceRequest.rl(typefaceRequest, null, null, 0, 0, null, 30, null)).getValue();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State xMQ(final TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.nr(typefaceRequest, new Function1<Function1<? super TypefaceResult, ? extends Unit>, TypefaceResult>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final TypefaceResult invoke(Function1 function1) {
                TypefaceResult typefaceResultT = this.f33668n.fontListFontFamilyTypefaceAdapter.t(typefaceRequest, this.f33668n.getPlatformFontLoader(), function1, this.f33668n.createDefaultTypeface);
                if (typefaceResultT != null) {
                    return typefaceResultT;
                }
                TypefaceResult typefaceResultN = this.f33668n.platformFamilyTypefaceAdapter.n(typefaceRequest, this.f33668n.getPlatformFontLoader(), function1, this.f33668n.createDefaultTypeface);
                if (typefaceResultN != null) {
                    return typefaceResultN;
                }
                throw new IllegalStateException("Could not load font");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KN(FontFamily fontFamily, Continuation continuation) {
        FontFamilyResolverImpl$preload$1 fontFamilyResolverImpl$preload$1;
        final FontFamilyResolverImpl fontFamilyResolverImpl;
        if (continuation instanceof FontFamilyResolverImpl$preload$1) {
            fontFamilyResolverImpl$preload$1 = (FontFamilyResolverImpl$preload$1) continuation;
            int i2 = fontFamilyResolverImpl$preload$1.f33663r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fontFamilyResolverImpl$preload$1.f33663r = i2 - Integer.MIN_VALUE;
            } else {
                fontFamilyResolverImpl$preload$1 = new FontFamilyResolverImpl$preload$1(this, continuation);
            }
        }
        Object obj = fontFamilyResolverImpl$preload$1.f33661O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fontFamilyResolverImpl$preload$1.f33663r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!(fontFamily instanceof FontListFontFamily)) {
                return Unit.INSTANCE;
            }
            FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.fontListFontFamilyTypefaceAdapter;
            PlatformFontLoader platformFontLoader = this.platformFontLoader;
            fontFamilyResolverImpl$preload$1.f33662n = this;
            fontFamilyResolverImpl$preload$1.f33664t = fontFamily;
            fontFamilyResolverImpl$preload$1.f33663r = 1;
            if (fontListFontFamilyTypefaceAdapter.rl(fontFamily, platformFontLoader, fontFamilyResolverImpl$preload$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            fontFamilyResolverImpl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fontFamily = (FontFamily) fontFamilyResolverImpl$preload$1.f33664t;
            fontFamilyResolverImpl = (FontFamilyResolverImpl) fontFamilyResolverImpl$preload$1.f33662n;
            ResultKt.throwOnFailure(obj);
        }
        List fonts = ((FontListFontFamily) fontFamily).getFonts();
        ArrayList arrayList = new ArrayList(fonts.size());
        int size = fonts.size();
        for (int i5 = 0; i5 < size; i5++) {
            Font font = (Font) fonts.get(i5);
            arrayList.add(new TypefaceRequest(fontFamilyResolverImpl.platformResolveInterceptor.nr(fontFamily), fontFamilyResolverImpl.platformResolveInterceptor.n(font.getWeight()), fontFamilyResolverImpl.platformResolveInterceptor.rl(font.getStyle()), FontSynthesis.INSTANCE.n(), fontFamilyResolverImpl.platformFontLoader.getCacheKey(), null));
        }
        fontFamilyResolverImpl.typefaceRequestCache.t(arrayList, new Function1<TypefaceRequest, TypefaceResult>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final TypefaceResult invoke(TypefaceRequest typefaceRequest) {
                TypefaceResult typefaceResultT = this.f33665n.fontListFontFamilyTypefaceAdapter.t(typefaceRequest, this.f33665n.getPlatformFontLoader(), new Function1<TypefaceResult.Immutable, Unit>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.1
                    public final void n(TypefaceResult.Immutable immutable) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TypefaceResult.Immutable immutable) {
                        n(immutable);
                        return Unit.INSTANCE;
                    }
                }, this.f33665n.createDefaultTypeface);
                if (typefaceResultT != null) {
                    return typefaceResultT;
                }
                TypefaceResult typefaceResultN = this.f33665n.platformFamilyTypefaceAdapter.n(typefaceRequest, this.f33665n.getPlatformFontLoader(), new Function1<TypefaceResult.Immutable, Unit>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.2
                    public final void n(TypefaceResult.Immutable immutable) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TypefaceResult.Immutable immutable) {
                        n(immutable);
                        return Unit.INSTANCE;
                    }
                }, this.f33665n.createDefaultTypeface);
                if (typefaceResultN != null) {
                    return typefaceResultN;
                }
                throw new IllegalStateException("Could not load font");
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final PlatformFontLoader getPlatformFontLoader() {
        return this.platformFontLoader;
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    public State n(FontFamily fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis) {
        return xMQ(new TypefaceRequest(this.platformResolveInterceptor.nr(fontFamily), this.platformResolveInterceptor.n(fontWeight), this.platformResolveInterceptor.rl(fontStyle), this.platformResolveInterceptor.t(fontSynthesis), this.platformFontLoader.getCacheKey(), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(platformFontLoader, (i2 & 2) != 0 ? PlatformResolveInterceptor.INSTANCE.n() : platformResolveInterceptor, (i2 & 4) != 0 ? FontFamilyResolverKt.rl() : typefaceRequestCache, (i2 & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.n(), null, 2, 0 == true ? 1 : 0) : fontListFontFamilyTypefaceAdapter, (i2 & 16) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }
}
