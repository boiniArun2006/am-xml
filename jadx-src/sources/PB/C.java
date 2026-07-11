package PB;

import PB.Wre;
import android.content.Context;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.templates.Template;
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
public abstract class C {

    public static final class Ml extends Lambda implements Function4 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ eQ.fuX f7607O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f7608n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f7609t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(List list, Function1 function1, eQ.fuX fux) {
            super(4);
            this.f7608n = list;
            this.f7609t = function1;
            this.f7607O = fux;
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
            Wre wre = (Wre) this.f7608n.get(i2);
            composer.eF(376470289);
            if (wre instanceof Wre.j) {
                composer.eF(-819137779);
                Wre.j jVar = (Wre.j) wre;
                String strN = jVar.n();
                String strRl = jVar.rl();
                boolean zT2 = jVar.t();
                composer.eF(-819132203);
                boolean zP5 = composer.p5(this.f7609t) | composer.E2(wre);
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new j(this.f7609t, wre);
                    composer.o(objIF);
                }
                composer.Xw();
                composer2 = composer;
                C.mUb(strN, strRl, zT2, (Function0) objIF, null, this.f7607O, composer2, 0, 16);
                composer2.Xw();
            } else {
                composer2 = composer;
                if (!Intrinsics.areEqual(wre, Wre.n.f7626n)) {
                    composer2.eF(-819139790);
                    composer2.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.eF(-819127218);
                C.O(null, composer2, 0, 1);
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
        final /* synthetic */ Function1 f7610n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Wre f7611t;

        j(Function1 function1, Wre wre) {
            this.f7610n = function1;
            this.f7611t = wre;
        }

        public final void n() {
            this.f7610n.invoke(Template.Tag.rl(((Wre.j) this.f7611t).n()));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    public static final class n extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f7612n = new n();

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
        final /* synthetic */ Function1 f7613n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f7614t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Function1 function1, List list) {
            super(1);
            this.f7613n = function1;
            this.f7614t = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final Object n(int i2) {
            return this.f7613n.invoke(this.f7614t.get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(Modifier modifier, int i2, int i3, Composer composer, int i5) {
        O(modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(List list, Function1 function1, eQ.fuX fux, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyRow.qie(list.size(), null, new w6(n.f7612n, list), ComposableLambdaKt.rl(-632812321, true, new Ml(list, function1, fux)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(final List items, final Function1 onTagClicked, Modifier modifier, PaddingValues paddingValues, eQ.fuX fux, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        PaddingValues paddingValues2;
        int i8;
        eQ.fuX fux2;
        final eQ.fuX fux3;
        boolean zE2;
        Object objIF;
        Composer composer2;
        final Modifier modifier3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onTagClicked, "onTagClicked");
        Composer composerKN = composer.KN(1880548440);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(items) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onTagClicked) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    paddingValues2 = paddingValues;
                    i5 |= composerKN.p5(paddingValues2) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 == 0) {
                    if ((i2 & 24576) == 0) {
                        fux2 = fux;
                        i5 |= composerKN.E2(fux2) ? 16384 : 8192;
                    }
                    if ((i5 & 9363) == 9362 || !composerKN.xMQ()) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        PaddingValues paddingValuesT = i7 == 0 ? PaddingKt.t(0.0f, 0.0f, 3, null) : paddingValues2;
                        fux3 = i8 == 0 ? fux2 : null;
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1880548440, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.composables.TemplatesTagCarousel (TemplatesTagCarousel.kt:53)");
                        }
                        Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(10));
                        Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                        composerKN.eF(-1987835310);
                        zE2 = composerKN.E2(items) | ((i5 & 112) != 32) | composerKN.E2(fux3);
                        objIF = composerKN.iF();
                        if (!zE2 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function1() { // from class: PB.CN3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C.KN(items, onTagClicked, fux3, (LazyListScope) obj);
                                }
                            };
                            composerKN.o(objIF);
                        }
                        composerKN.Xw();
                        Modifier modifier4 = modifier2;
                        composer2 = composerKN;
                        LazyDslKt.O(modifier4, null, paddingValuesT, false, horizontalOrVerticalTy, verticalXMQ, null, false, null, (Function1) objIF, composer2, ((i5 >> 6) & 14) | 221184 | ((i5 >> 3) & 896), 458);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier4;
                        paddingValues3 = paddingValuesT;
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                        modifier3 = modifier2;
                        paddingValues3 = paddingValues2;
                        fux3 = fux2;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: PB.fuX
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return C.xMQ(items, onTagClicked, modifier3, paddingValues3, fux3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                fux2 = fux;
                if ((i5 & 9363) == 9362) {
                    if (i9 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    Arrangement.HorizontalOrVertical horizontalOrVerticalTy2 = Arrangement.f17400n.ty(Dp.KN(10));
                    Alignment.Vertical verticalXMQ2 = Alignment.INSTANCE.xMQ();
                    composerKN.eF(-1987835310);
                    zE2 = composerKN.E2(items) | ((i5 & 112) != 32) | composerKN.E2(fux3);
                    objIF = composerKN.iF();
                    if (!zE2) {
                        objIF = new Function1() { // from class: PB.CN3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C.KN(items, onTagClicked, fux3, (LazyListScope) obj);
                            }
                        };
                        composerKN.o(objIF);
                        composerKN.Xw();
                        Modifier modifier42 = modifier2;
                        composer2 = composerKN;
                        LazyDslKt.O(modifier42, null, paddingValuesT, false, horizontalOrVerticalTy2, verticalXMQ2, null, false, null, (Function1) objIF, composer2, ((i5 >> 6) & 14) | 221184 | ((i5 >> 3) & 896), 458);
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier42;
                        paddingValues3 = paddingValuesT;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            paddingValues2 = paddingValues;
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            fux2 = fux;
            if ((i5 & 9363) == 9362) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        paddingValues2 = paddingValues;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        fux2 = fux;
        if ((i5 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(String str, String str2, boolean z2, Function0 function0, Modifier modifier, eQ.fuX fux, int i2, int i3, Composer composer, int i5) {
        mUb(str, str2, z2, function0, modifier, fux, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void mUb(final String str, final String str2, final boolean z2, final Function0 function0, Modifier modifier, eQ.fuX fux, Composer composer, final int i2, final int i3) {
        int i5;
        Object obj;
        int i7;
        Modifier modifier2;
        int i8;
        eQ.fuX fux2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        final eQ.fuX fux3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1392919921);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                obj = str2;
                i5 |= composerKN.p5(obj) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.n(z2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i5 |= composerKN.E2(function0) ? 2048 : 1024;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        modifier2 = modifier;
                        i5 |= composerKN.p5(modifier2) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 != 0) {
                        if ((196608 & i2) == 0) {
                            fux2 = fux;
                            i5 |= composerKN.E2(fux2) ? 131072 : 65536;
                        }
                        if ((i5 & 74899) == 74898 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier3 = modifier2;
                            fux3 = fux2;
                        } else {
                            Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            eQ.fuX fux4 = i8 == 0 ? null : fux2;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1392919921, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.composables.TemplatesTagCircle (TemplatesTagCarousel.kt:83)");
                            }
                            aF1.j jVar = (aF1.j) composerKN.ty(aF1.w6.t());
                            long jO = !z2 ? jVar.O() : jVar.ck();
                            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.ty(Dp.KN(4)), Alignment.INSTANCE.Uo(), composerKN, 54);
                            iN = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier4);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0 function0N = companion.n();
                            if (composerKN.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composerKN.T();
                            if (composerKN.getInserting()) {
                                composerKN.r();
                            } else {
                                composerKN.s7N(function0N);
                            }
                            composerN = Updater.n(composerKN);
                            Updater.O(composerN, measurePolicyN, companion.t());
                            Updater.O(composerN, compositionLocalMapIk, companion.O());
                            function2Rl = companion.rl();
                            if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO, companion.nr());
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                            composerKN.eF(-1055027076);
                            eQ.fuX fuxN = fux4 != null ? eQ.j.n((Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo())) : fux4;
                            composerKN.Xw();
                            c0.w6.nr(obj, "Thumbnail", fuxN, ClickableKt.J2(ClipKt.n(SizeKt.Z(BorderKt.J2(modifier4, Dp.KN(3), jO, RoundedCornerShapeKt.J2()), Dp.KN(72)), RoundedCornerShapeKt.J2()), false, null, null, function0, 7, null), new ColorPainter(((aF1.j) composerKN.ty(aF1.w6.t())).J2(), null), null, null, null, null, null, null, null, 0.0f, null, 0, false, null, composerKN, ((i5 >> 3) & 14) | 48, 0, 131040);
                            TextKt.t(com.alightcreative.app.motion.templates.Ml.ck(str, (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo())), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(aD.w6.gh(), TextUnitKt.KN(10), FontWeight.INSTANCE.nr(), null, null, FontFamilyKt.rl(FontKt.rl(2131296270, null, 0, 0, 14, null)), null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.KN(12), null, null, null, 0, 0, null, 16646104, null), composerKN, 0, 0, 65534);
                            composer2 = composerKN;
                            composer2.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            fux3 = fux4;
                            modifier3 = modifier4;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2() { // from class: PB.aC
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return C.gh(str, str2, z2, function0, modifier3, fux3, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    fux2 = fux;
                    if ((i5 & 74899) == 74898) {
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.v()) {
                        }
                        aF1.j jVar2 = (aF1.j) composerKN.ty(aF1.w6.t());
                        if (!z2) {
                        }
                        MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.ty(Dp.KN(4)), Alignment.INSTANCE.Uo(), composerKN, 54);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifier4);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 function0N2 = companion2.n();
                        if (composerKN.getApplier() == null) {
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                        }
                        composerN = Updater.n(composerKN);
                        Updater.O(composerN, measurePolicyN2, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk2, companion2.O());
                        function2Rl = companion2.rl();
                        if (!composerN.getInserting()) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                            Updater.O(composerN, modifierO2, companion2.nr());
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                            composerKN.eF(-1055027076);
                            if (fux4 != null) {
                            }
                            composerKN.Xw();
                            c0.w6.nr(obj, "Thumbnail", fuxN, ClickableKt.J2(ClipKt.n(SizeKt.Z(BorderKt.J2(modifier4, Dp.KN(3), jO, RoundedCornerShapeKt.J2()), Dp.KN(72)), RoundedCornerShapeKt.J2()), false, null, null, function0, 7, null), new ColorPainter(((aF1.j) composerKN.ty(aF1.w6.t())).J2(), null), null, null, null, null, null, null, null, 0.0f, null, 0, false, null, composerKN, ((i5 >> 3) & 14) | 48, 0, 131040);
                            TextKt.t(com.alightcreative.app.motion.templates.Ml.ck(str, (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo())), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(aD.w6.gh(), TextUnitKt.KN(10), FontWeight.INSTANCE.nr(), null, null, FontFamilyKt.rl(FontKt.rl(2131296270, null, 0, 0, 14, null)), null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.KN(12), null, null, null, 0, 0, null, 16646104, null), composerKN, 0, 0, 65534);
                            composer2 = composerKN;
                            composer2.XQ();
                            if (ComposerKt.v()) {
                            }
                            fux3 = fux4;
                            modifier3 = modifier4;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                modifier2 = modifier;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                fux2 = fux;
                if ((i5 & 74899) == 74898) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            modifier2 = modifier;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            fux2 = fux;
            if ((i5 & 74899) == 74898) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        obj = str2;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        fux2 = fux;
        if ((i5 & 74899) == 74898) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(List list, Function1 function1, Modifier modifier, PaddingValues paddingValues, eQ.fuX fux, int i2, int i3, Composer composer, int i5) {
        Uo(list, function1, modifier, paddingValues, fux, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Composer composerKN = composer.KN(1609837686);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.p5(modifier)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        if ((i5 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i8 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1609837686, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.composables.PlaceholderCircle (TemplatesTagCarousel.kt:121)");
            }
            PB.w6.rl(modifier, PB.j.f7640n.n(), composerKN, (i5 & 14) | 48, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: PB.Dsr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C.J2(modifier, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
