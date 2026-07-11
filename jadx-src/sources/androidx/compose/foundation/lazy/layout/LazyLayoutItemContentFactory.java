package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0002\b\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0019R\u00020\u00000\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function0;)V", "key", "t", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "index", "contentType", "", "Landroidx/compose/runtime/Composable;", "rl", "(ILjava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;", c.f62177j, "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Lkotlin/jvm/functions/Function0;", "nr", "()Lkotlin/jvm/functions/Function0;", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "Landroidx/collection/MutableScatterMap;", "lambdasCache", "CachedItemContent", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutItemContentFactory {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SaveableStateHolder saveableStateHolder;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function0 itemProvider;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterMap lambdasCache = ScatterMapKt.t();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\f¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "", "", "index", "key", "contentType", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "t", "()Lkotlin/jvm/functions/Function2;", c.f62177j, "Ljava/lang/Object;", "Uo", "()Ljava/lang/Object;", "rl", "O", "<set-?>", "I", "J2", "()I", "nr", "Lkotlin/jvm/functions/Function2;", "_content", AppLovinEventTypes.USER_VIEWED_CONTENT, "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    final class CachedItemContent {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Object key;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private Function2 _content;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final Object contentType;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private int index;

        public CachedItemContent(int i2, Object obj, Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i2;
        }

        private final Function2 t() {
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = LazyLayoutItemContentFactory.this;
            return ComposableLambdaKt.rl(1403994769, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    n(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer, int i2) {
                    Composer composer2;
                    if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
                        composer.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1403994769, i2, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:87)");
                    }
                    LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) lazyLayoutItemContentFactory.getItemProvider().invoke();
                    int index = this.getIndex();
                    if ((index >= lazyLayoutItemProvider.n() || !Intrinsics.areEqual(lazyLayoutItemProvider.nr(index), this.getKey())) && (index = lazyLayoutItemProvider.t(this.getKey())) != -1) {
                        this.index = index;
                    }
                    int i3 = index;
                    if (i3 != -1) {
                        composer.eF(-660404355);
                        composer2 = composer;
                        LazyLayoutItemContentFactoryKt.n(lazyLayoutItemProvider, StableValue.n(lazyLayoutItemContentFactory.saveableStateHolder), i3, StableValue.n(this.getKey()), composer2, 0);
                        composer2.Xw();
                    } else {
                        composer2 = composer;
                        composer2.eF(-660169871);
                        composer2.Xw();
                    }
                    Object key = this.getKey();
                    boolean zE2 = composer2.E2(this);
                    final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this;
                    Object objIF = composer2.iF();
                    if (zE2 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent2 = cachedItemContent;
                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void n() {
                                        cachedItemContent2._content = null;
                                    }
                                };
                            }
                        };
                        composer2.o(objIF);
                    }
                    EffectsKt.rl(key, (Function1) objIF, composer2, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            });
        }

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final Object getContentType() {
            return this.contentType;
        }

        /* JADX INFO: renamed from: Uo, reason: from getter */
        public final Object getKey() {
            return this.key;
        }

        public final Function2 nr() {
            Function2 function2 = this._content;
            if (function2 != null) {
                return function2;
            }
            Function2 function2T = t();
            this._content = function2T;
            return function2T;
        }
    }

    public final Object t(Object key) {
        if (key == null) {
            return null;
        }
        CachedItemContent cachedItemContent = (CachedItemContent) this.lambdasCache.O(key);
        if (cachedItemContent != null) {
            return cachedItemContent.getContentType();
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.itemProvider.invoke();
        int iT = lazyLayoutItemProvider.t(key);
        if (iT != -1) {
            return lazyLayoutItemProvider.J2(iT);
        }
        return null;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final Function0 getItemProvider() {
        return this.itemProvider;
    }

    public final Function2 rl(int index, Object key, Object contentType) {
        CachedItemContent cachedItemContent = (CachedItemContent) this.lambdasCache.O(key);
        if (cachedItemContent != null && cachedItemContent.getIndex() == index && Intrinsics.areEqual(cachedItemContent.getContentType(), contentType)) {
            return cachedItemContent.nr();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(index, key, contentType);
        this.lambdasCache.aYN(key, cachedItemContent2);
        return cachedItemContent2.nr();
    }

    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, Function0 function0) {
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = function0;
    }
}
