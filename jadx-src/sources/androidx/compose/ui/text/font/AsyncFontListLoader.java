package androidx.compose.ui.text.font;

import GJW.AbstractC1363t;
import GJW.Qik;
import GJW.iwV;
import GJW.s6u;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.TypefaceResult;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R+\u0010(\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "", "Landroidx/compose/ui/text/font/Font;", "fontList", "initialType", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "onCompletion", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", "XQ", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "te", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "Ljava/util/List;", "t", "Landroidx/compose/ui/text/font/TypefaceRequest;", "O", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "J2", "Lkotlin/jvm/functions/Function1;", "r", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "<set-?>", "o", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "Z", "ck", "()Z", "setCacheable$ui_text_release", "(Z)V", "cacheable", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,444:1\n85#2:445\n113#2,2:446\n34#3,6:448\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n264#1:445\n264#1:446,2\n271#1:448,6\n*E\n"})
public final class AsyncFontListLoader implements State<Object> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Function1 onCompletion;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final AsyncTypefaceCache asyncTypefaceCache;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean cacheable = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List fontList;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final MutableState value;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final PlatformFontLoader platformFontLoader;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final TypefaceRequest typefaceRequest;

    private void setValue(Object obj) {
        this.value.setValue(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x00b1, B:38:0x00e5, B:20:0x005a), top: B:54:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x00b1, B:38:0x00e5, B:20:0x005a), top: B:54:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:45:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f8 -> B:42:0x00f9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object XQ(Continuation continuation) throws Throwable {
        AsyncFontListLoader$load$1 asyncFontListLoader$load$1;
        AsyncFontListLoader asyncFontListLoader;
        List list;
        int size;
        AsyncFontListLoader$load$1 asyncFontListLoader$load$12;
        int i2;
        AsyncFontListLoader asyncFontListLoader2;
        AsyncFontListLoader asyncFontListLoader3;
        Font font;
        List list2;
        int i3;
        if (continuation instanceof AsyncFontListLoader$load$1) {
            asyncFontListLoader$load$1 = (AsyncFontListLoader$load$1) continuation;
            int i5 = asyncFontListLoader$load$1.f33620S;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                asyncFontListLoader$load$1.f33620S = i5 - Integer.MIN_VALUE;
            } else {
                asyncFontListLoader$load$1 = new AsyncFontListLoader$load$1(this, continuation);
            }
        }
        Object obj = asyncFontListLoader$load$1.f33623o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = asyncFontListLoader$load$1.f33620S;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                list = this.fontList;
                size = list.size();
                asyncFontListLoader$load$12 = asyncFontListLoader$load$1;
                i2 = 0;
                asyncFontListLoader2 = this;
                if (i2 < size) {
                }
            } catch (Throwable th) {
                th = th;
                asyncFontListLoader = this;
            }
        } else if (i7 == 1) {
            size = asyncFontListLoader$load$1.f33624r;
            i3 = asyncFontListLoader$load$1.J2;
            Font font2 = (Font) asyncFontListLoader$load$1.f33619O;
            List list3 = (List) asyncFontListLoader$load$1.f33625t;
            asyncFontListLoader3 = (AsyncFontListLoader) asyncFontListLoader$load$1.f33622n;
            try {
                ResultKt.throwOnFailure(obj);
                font = font2;
                list2 = list3;
                if (obj == null) {
                }
            } catch (Throwable th2) {
                th = th2;
                asyncFontListLoader = asyncFontListLoader3;
            }
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = asyncFontListLoader$load$1.f33624r;
            i3 = asyncFontListLoader$load$1.J2;
            list2 = (List) asyncFontListLoader$load$1.f33625t;
            asyncFontListLoader = (AsyncFontListLoader) asyncFontListLoader$load$1.f33622n;
            try {
                ResultKt.throwOnFailure(obj);
                asyncFontListLoader$load$12 = asyncFontListLoader$load$1;
                i2 = i3;
                list = list2;
                asyncFontListLoader2 = asyncFontListLoader;
                i2++;
                if (i2 < size) {
                    try {
                        Font font3 = (Font) list.get(i2);
                        if (FontLoadingStrategy.J2(font3.getLoadingStrategy(), FontLoadingStrategy.INSTANCE.n())) {
                            AsyncTypefaceCache asyncTypefaceCache = asyncFontListLoader2.asyncTypefaceCache;
                            PlatformFontLoader platformFontLoader = asyncFontListLoader2.platformFontLoader;
                            AsyncFontListLoader$load$2$typeface$1 asyncFontListLoader$load$2$typeface$1 = new AsyncFontListLoader$load$2$typeface$1(asyncFontListLoader2, font3, null);
                            asyncFontListLoader$load$12.f33622n = asyncFontListLoader2;
                            asyncFontListLoader$load$12.f33625t = list;
                            asyncFontListLoader$load$12.f33619O = font3;
                            asyncFontListLoader$load$12.J2 = i2;
                            asyncFontListLoader$load$12.f33624r = size;
                            asyncFontListLoader$load$12.f33620S = 1;
                            Object objUo = asyncTypefaceCache.Uo(font3, platformFontLoader, false, asyncFontListLoader$load$2$typeface$1, asyncFontListLoader$load$12);
                            if (objUo != coroutine_suspended) {
                                asyncFontListLoader3 = asyncFontListLoader2;
                                font = font3;
                                asyncFontListLoader$load$1 = asyncFontListLoader$load$12;
                                list2 = list;
                                obj = objUo;
                                i3 = i2;
                                if (obj == null) {
                                    asyncFontListLoader3.setValue(FontSynthesis_androidKt.n(asyncFontListLoader3.typefaceRequest.getFontSynthesis(), obj, font, asyncFontListLoader3.typefaceRequest.getFontWeight(), asyncFontListLoader3.typefaceRequest.getFontStyle()));
                                    Unit unit = Unit.INSTANCE;
                                    boolean zCk = AbstractC1363t.ck(asyncFontListLoader$load$1.getContext());
                                    asyncFontListLoader3.cacheable = false;
                                    asyncFontListLoader3.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader3.getValue(), zCk));
                                    return unit;
                                }
                                asyncFontListLoader$load$1.f33622n = asyncFontListLoader3;
                                asyncFontListLoader$load$1.f33625t = list2;
                                asyncFontListLoader$load$1.f33619O = null;
                                asyncFontListLoader$load$1.J2 = i3;
                                asyncFontListLoader$load$1.f33624r = size;
                                asyncFontListLoader$load$1.f33620S = 2;
                                if (s6u.n(asyncFontListLoader$load$1) != coroutine_suspended) {
                                    asyncFontListLoader = asyncFontListLoader3;
                                    asyncFontListLoader$load$12 = asyncFontListLoader$load$1;
                                    i2 = i3;
                                    list = list2;
                                    asyncFontListLoader2 = asyncFontListLoader;
                                }
                            }
                            return coroutine_suspended;
                        }
                        i2++;
                        if (i2 < size) {
                            boolean zCk2 = AbstractC1363t.ck(asyncFontListLoader$load$12.getContext());
                            asyncFontListLoader2.cacheable = false;
                            asyncFontListLoader2.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader2.getValue(), zCk2));
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        asyncFontListLoader = asyncFontListLoader2;
                        asyncFontListLoader$load$1 = asyncFontListLoader$load$12;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        boolean zCk3 = AbstractC1363t.ck(asyncFontListLoader$load$1.getContext());
        asyncFontListLoader.cacheable = false;
        asyncFontListLoader.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader.getValue(), zCk3));
        throw th;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        return this.value.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object te(Font font, Continuation continuation) {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        if (continuation instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) continuation;
            int i2 = asyncFontListLoader$loadWithTimeoutOrNull$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asyncFontListLoader$loadWithTimeoutOrNull$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, continuation);
            }
        }
        Object obj = asyncFontListLoader$loadWithTimeoutOrNull$1.f33631t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = asyncFontListLoader$loadWithTimeoutOrNull$1.J2;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, font, null);
            asyncFontListLoader$loadWithTimeoutOrNull$1.f33630n = font;
            asyncFontListLoader$loadWithTimeoutOrNull$1.J2 = 1;
            Object objO = Qik.O(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
            return objO == coroutine_suspended ? coroutine_suspended : objO;
        } catch (CancellationException e2) {
            if (!AbstractC1363t.ck(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext())) {
                throw e2;
            }
            return null;
        } catch (Exception e3) {
            iwV iwv = (iwV) asyncFontListLoader$loadWithTimeoutOrNull$1.getContext().get(iwV.rl);
            if (iwv != null) {
                iwv.a(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext(), new IllegalStateException("Unable to load font " + font, e3));
            }
            return null;
        }
    }

    public AsyncFontListLoader(List list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, Function1 function1, PlatformFontLoader platformFontLoader) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = function1;
        this.platformFontLoader = platformFontLoader;
        this.value = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
    }
}
