package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\n \r*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/Font;", "font", "Landroid/graphics/Typeface;", "nr", "(Landroidx/compose/ui/text/font/Font;)Landroid/graphics/Typeface;", "t", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin.jvm.PlatformType", c.f62177j, "Landroid/content/Context;", "", "rl", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public final class AndroidFontLoader implements PlatformFontLoader {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Object cacheKey;

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public android.graphics.Typeface n(Font font) {
        Object objM313constructorimpl;
        android.graphics.Typeface typefaceT;
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            return androidFont.getTypefaceLoader().rl(this.context, androidFont);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
        if (FontLoadingStrategy.J2(loadingStrategy, companion.rl())) {
            typefaceT = AndroidFontLoader_androidKt.t((ResourceFont) font, this.context);
        } else {
            if (!FontLoadingStrategy.J2(loadingStrategy, companion.t())) {
                if (FontLoadingStrategy.J2(loadingStrategy, companion.n())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.KN(font.getLoadingStrategy())));
            }
            try {
                Result.Companion companion2 = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(AndroidFontLoader_androidKt.t((ResourceFont) font, this.context));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            typefaceT = (android.graphics.Typeface) (Result.m319isFailureimpl(objM313constructorimpl) ? null : objM313constructorimpl);
        }
        return PlatformTypefaces_androidKt.t(typefaceT, ((ResourceFont) font).getVariationSettings(), this.context);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /* JADX INFO: renamed from: rl, reason: from getter */
    public Object getCacheKey() {
        return this.cacheKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Font font, Continuation continuation) {
        AndroidFontLoader$awaitLoad$1 androidFontLoader$awaitLoad$1;
        AndroidFontLoader androidFontLoader;
        if (continuation instanceof AndroidFontLoader$awaitLoad$1) {
            androidFontLoader$awaitLoad$1 = (AndroidFontLoader$awaitLoad$1) continuation;
            int i2 = androidFontLoader$awaitLoad$1.f33608r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidFontLoader$awaitLoad$1.f33608r = i2 - Integer.MIN_VALUE;
            } else {
                androidFontLoader$awaitLoad$1 = new AndroidFontLoader$awaitLoad$1(this, continuation);
            }
        }
        Object objNr = androidFontLoader$awaitLoad$1.f33606O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = androidFontLoader$awaitLoad$1.f33608r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objNr);
            if (font instanceof AndroidFont) {
                AndroidFont androidFont = (AndroidFont) font;
                AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
                Context context = this.context;
                androidFontLoader$awaitLoad$1.f33608r = 1;
                Object objN = typefaceLoader.n(context, androidFont, androidFontLoader$awaitLoad$1);
                if (objN != coroutine_suspended) {
                    return objN;
                }
            } else {
                if (!(font instanceof ResourceFont)) {
                    throw new IllegalArgumentException("Unknown font type: " + font);
                }
                Context context2 = this.context;
                androidFontLoader$awaitLoad$1.f33607n = this;
                androidFontLoader$awaitLoad$1.f33609t = font;
                androidFontLoader$awaitLoad$1.f33608r = 2;
                objNr = AndroidFontLoader_androidKt.nr((ResourceFont) font, context2, androidFontLoader$awaitLoad$1);
                if (objNr != coroutine_suspended) {
                    androidFontLoader = this;
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            ResultKt.throwOnFailure(objNr);
            return objNr;
        }
        if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        font = (Font) androidFontLoader$awaitLoad$1.f33609t;
        androidFontLoader = (AndroidFontLoader) androidFontLoader$awaitLoad$1.f33607n;
        ResultKt.throwOnFailure(objNr);
        return PlatformTypefaces_androidKt.t((android.graphics.Typeface) objNr, ((ResourceFont) font).getVariationSettings(), androidFontLoader.context);
    }

    public AndroidFontLoader(Context context) {
        this.context = context.getApplicationContext();
    }
}
