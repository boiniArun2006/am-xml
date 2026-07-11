package BQ;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class CN3 {

    public static final class Ml extends Lambda implements Function4 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f437O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f438n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TemplateFiltersItem.Content f439t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(List list, TemplateFiltersItem.Content content, Function1 function1) {
            super(4);
            this.f438n = list;
            this.f439t = content;
            this.f437O = function1;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i5;
            Composer composer2;
            if ((i3 & 6) == 0) {
                i5 = (composer.p5(lazyItemScope) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
            if ((i3 & 48) == 0) {
                i5 |= composer.t(i2) ? 32 : 16;
            }
            if (!composer.HI((i5 & 147) != 146, i5 & 1)) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            TemplateFiltersItem templateFiltersItem = (TemplateFiltersItem) this.f438n.get(i2);
            composer.eF(1632631365);
            if (Intrinsics.areEqual(templateFiltersItem, TemplateFiltersItem.LoadingPlaceholder.f45452n)) {
                composer.eF(-1886995135);
                BQ.Ml.O(null, composer, 0, 1);
                composer.Xw();
                composer2 = composer;
            } else {
                if (!(templateFiltersItem instanceof TemplateFiltersItem.Content)) {
                    composer.eF(-1886997122);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composer.eF(1632775080);
                TemplateFiltersItem.Content content = (TemplateFiltersItem.Content) templateFiltersItem;
                boolean zAreEqual = Intrinsics.areEqual(templateFiltersItem, this.f439t);
                composer.eF(-1886989149);
                boolean zP5 = composer.p5(this.f437O) | composer.E2(templateFiltersItem);
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new j(this.f437O, templateFiltersItem);
                    composer.o(objIF);
                }
                composer.Xw();
                composer2 = composer;
                BQ.Ml.t(content, zAreEqual, (Function0) objIF, null, composer2, 0, 8);
                composer2.Xw();
            }
            composer2.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f440n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TemplateFiltersItem f441t;

        j(Function1 function1, TemplateFiltersItem templateFiltersItem) {
            this.f440n = function1;
            this.f441t = templateFiltersItem;
        }

        public final void n() {
            this.f440n.invoke(this.f441t);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    public static final class n extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f442n = new n();

        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    public static final class w6 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f443n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f444t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Function1 function1, List list) {
            super(1);
            this.f443n = function1;
            this.f444t = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final Object n(int i2) {
            return this.f443n.invoke(this.f444t.get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LazyListState lazyListState, List list, Function1 function1, TemplateFiltersItem.Content content, PaddingValues paddingValues, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        t(lazyListState, list, function1, content, paddingValues, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(List list, TemplateFiltersItem.Content content, Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyRow.qie(list.size(), null, new w6(n.f442n, list), ComposableLambdaKt.rl(-632812321, true, new Ml(list, content, function1)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final LazyListState state, final List filters, final Function1 onFilterClicked, final TemplateFiltersItem.Content content, final PaddingValues contentPadding, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        boolean zE2;
        Object objIF;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(onFilterClicked, "onFilterClicked");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Composer composerKN = composer.KN(469936711);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(state) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(filters) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onFilterClicked) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.p5(content) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= composerKN.p5(contentPadding) ? 16384 : 8192;
        }
        int i7 = i3 & 32;
        if (i7 == 0) {
            if ((196608 & i2) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i5) == 74898 || !composerKN.xMQ()) {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(469936711, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.composables.TemplateFiltersRow (TemplateFiltersRow.kt:20)");
                }
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(8));
                composerKN.eF(-1904146782);
                zE2 = composerKN.E2(filters) | ((i5 & 7168) != 2048) | ((i5 & 896) == 256);
                objIF = composerKN.iF();
                if (!zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1() { // from class: BQ.I28
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CN3.nr(filters, content, onFilterClicked, (LazyListScope) obj);
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                Modifier modifier4 = modifier2;
                LazyDslKt.O(modifier4, state, contentPadding, false, horizontalOrVerticalTy, null, null, false, null, (Function1) objIF, composerKN, ((i5 >> 15) & 14) | 24576 | ((i5 << 3) & 112) | ((i5 >> 6) & 896), 488);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: BQ.Wre
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CN3.O(state, filters, onFilterClicked, content, contentPadding, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 196608;
        modifier2 = modifier;
        if ((74899 & i5) == 74898) {
            if (i7 != 0) {
            }
            if (ComposerKt.v()) {
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy2 = Arrangement.f17400n.ty(Dp.KN(8));
            composerKN.eF(-1904146782);
            zE2 = composerKN.E2(filters) | ((i5 & 7168) != 2048) | ((i5 & 896) == 256);
            objIF = composerKN.iF();
            if (!zE2) {
                objIF = new Function1() { // from class: BQ.I28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CN3.nr(filters, content, onFilterClicked, (LazyListScope) obj);
                    }
                };
                composerKN.o(objIF);
                composerKN.Xw();
                Modifier modifier42 = modifier2;
                LazyDslKt.O(modifier42, state, contentPadding, false, horizontalOrVerticalTy2, null, null, false, null, (Function1) objIF, composerKN, ((i5 >> 15) & 14) | 24576 | ((i5 << 3) & 112) | ((i5 >> 6) & 896), 488);
                if (ComposerKt.v()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
