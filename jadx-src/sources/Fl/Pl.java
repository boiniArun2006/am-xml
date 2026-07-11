package Fl;

import Dj7.CM;
import Dj7.QaP;
import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.SurfaceKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Pl {

    static final class j implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f3072O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f3073n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function2 f3074t;

        /* JADX INFO: renamed from: Fl.Pl$j$j, reason: collision with other inner class name */
        static final class C0107j implements Function2 {
            final /* synthetic */ String J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function0 f3075O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f3076n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function2 f3077t;

            C0107j(String str, Function2 function2, Function0 function0, String str2) {
                this.f3076n = str;
                this.f3077t = function2;
                this.f3075O = function0;
                this.J2 = str2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1350280181, i2, -1, "com.alightcreative.pptos.ui.PPTOSContent.<anonymous>.<anonymous> (PPTOSFragment.kt:165)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierJ2 = SizeKt.J2(companion, 0.0f, 1, null);
                String str = this.f3076n;
                Function2 function2 = this.f3077t;
                Function0 function0 = this.f3075O;
                String str2 = this.J2;
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                int iN = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk = composer.Ik();
                Modifier modifierO = ComposedModifierKt.O(composer, modifierJ2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion3.n();
                if (composer.getApplier() == null) {
                    ComposablesKt.t();
                }
                composer.T();
                if (composer.getInserting()) {
                    composer.s7N(function0N);
                } else {
                    composer.r();
                }
                Composer composerN = Updater.n(composer);
                Updater.O(composerN, measurePolicyUo, companion3.t());
                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                Function2 function2Rl = companion3.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion3.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                float f3 = -80;
                Pl.mUb(2131232178, OffsetKt.rl(boxScopeInstance.n(SizeKt.Z(companion, Dp.KN(350)), companion2.ty()), Dp.KN(180), Dp.KN(f3)), composer, 6, 0);
                Pl.mUb(2131232179, OffsetKt.rl(boxScopeInstance.n(SizeKt.Z(companion, Dp.KN(237)), companion2.nr()), Dp.KN(f3), Dp.KN(30)), composer, 6, 0);
                Modifier modifierUo = ScrollKt.Uo(SizeKt.J2(WindowInsetsPadding_androidKt.O(companion), 0.0f, 1, null), ScrollKt.t(0, composer, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion2.gh(), composer, 0);
                int iN2 = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composer, modifierUo);
                Function0 function0N2 = companion3.n();
                if (composer.getApplier() == null) {
                    ComposablesKt.t();
                }
                composer.T();
                if (composer.getInserting()) {
                    composer.s7N(function0N2);
                } else {
                    composer.r();
                }
                Composer composerN2 = Updater.n(composer);
                Updater.O(composerN2, measurePolicyN, companion3.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                Function2 function2Rl2 = companion3.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion3.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                SpacerKt.n(ColumnScope.rl(columnScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
                Pl.mUb(2131231546, columnScopeInstance.t(ColumnScope.rl(columnScopeInstance, SizeKt.gh(PaddingKt.az(companion, 0.0f, Dp.KN(10), 0.0f, Dp.KN(32), 5, null), 0.0f, Dp.KN(246), 1, null), 10.0f, false, 2, null), companion2.Uo()), composer, 6, 0);
                SpacerKt.n(ColumnScope.rl(columnScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
                Pl.ty(columnScopeInstance.t(PaddingKt.gh(companion, PrimitiveResources_androidKt.n(2131165965, composer, 6), 0.0f, 2, null), companion2.Uo()), str, function2, composer, 0, 0);
                Pl.Uo(SizeKt.KN(SizeKt.qie(PaddingKt.mUb(companion, PrimitiveResources_androidKt.n(2131165965, composer, 6), PrimitiveResources_androidKt.n(2131165969, composer, 6)), Dp.KN(50)), 0.0f, 1, null), function0, str2, composer, 0, 0);
                composer.XQ();
                composer.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j(String str, Function2 function2, Function0 function0, String str2) {
            this.f3073n = str;
            this.f3074t = function2;
            this.f3072O = function0;
            this.J2 = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1853754545, i2, -1, "com.alightcreative.pptos.ui.PPTOSContent.<anonymous> (PPTOSFragment.kt:162)");
            }
            SurfaceKt.n(null, null, ColorResources_androidKt.n(2131099707, composer, 6), 0L, null, 0.0f, ComposableLambdaKt.nr(1350280181, true, new C0107j(this.f3073n, this.f3074t, this.f3072O, this.J2), composer, 54), composer, 1572864, 59);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(Modifier modifier, Function0 function0, String str, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Function0 function02;
        String str2;
        Function0 function03;
        Modifier modifier3;
        int i7;
        String strT;
        Function0 function04;
        Composer composer2;
        final Function0 function05;
        final String str3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1374923173);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 48) == 0) {
                function02 = function0;
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    str2 = str;
                    int i10 = composerKN.p5(str2) ? 256 : 128;
                    i5 |= i10;
                } else {
                    str2 = str;
                }
                i5 |= i10;
            } else {
                str2 = str;
            }
            if ((i5 & 147) == 146 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i9 == 0) {
                        composerKN.eF(-1043392957);
                        Object objIF = composerKN.iF();
                        if (objIF == Composer.INSTANCE.n()) {
                            objIF = new Function0() { // from class: Fl.Dsr
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Pl.KN();
                                }
                            };
                            composerKN.o(objIF);
                        }
                        function03 = (Function0) objIF;
                        composerKN.Xw();
                    } else {
                        function03 = function02;
                    }
                    if ((i3 & 4) == 0) {
                        strT = StringResources_androidKt.t(2132019943, composerKN, 6);
                        modifier3 = modifier5;
                        i7 = i5 & (-897);
                    } else {
                        modifier3 = modifier5;
                        i7 = i5;
                        strT = str2;
                    }
                    function04 = function03;
                } else {
                    composerKN.wTp();
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    i7 = i5;
                    function04 = function02;
                    strT = str2;
                    modifier3 = modifier2;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1374923173, i7, -1, "com.alightcreative.pptos.ui.AcceptButton (PPTOSFragment.kt:275)");
                }
                int i11 = i7 >> 3;
                composer2 = composerKN;
                Dj7.eO.J2(function04, strT, modifier3, null, Dj7.CN3.f1599r, new TextStyle(ColorResources_androidKt.n(2131099650, composerKN, 6), TextUnitKt.KN(18), FontWeight.INSTANCE.O(), null, null, Fo.w6.n(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777176, null), 0, 0, 0.0f, null, null, null, false, composer2, (i11 & 112) | (i11 & 14) | 24576 | ((i7 << 6) & 896), 0, 8136);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                function05 = function04;
                str3 = strT;
                modifier4 = modifier3;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
                modifier4 = modifier2;
                function05 = function02;
                str3 = str2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: Fl.aC
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Pl.xMQ(modifier4, function05, str3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        function02 = function0;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i5 & 147) == 146) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if ((i3 & 4) == 0) {
                }
                function04 = function03;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                int i112 = i7 >> 3;
                composer2 = composerKN;
                Dj7.eO.J2(function04, strT, modifier3, null, Dj7.CN3.f1599r, new TextStyle(ColorResources_androidKt.n(2131099650, composerKN, 6), TextUnitKt.KN(18), FontWeight.INSTANCE.O(), null, null, Fo.w6.n(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777176, null), 0, 0, 0.0f, null, null, null, false, composer2, (i112 & 112) | (i112 & 14) | 24576 | ((i7 << 6) & 896), 0, 8136);
                if (ComposerKt.v()) {
                }
                function05 = function04;
                str3 = strT;
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(String str, String str2, Function2 function2, Function0 function0, int i2, Composer composer, int i3) {
        qie(str, str2, function2, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(Modifier modifier, String str, Function2 function2, int i2, int i3, Composer composer, int i5) {
        ty(modifier, str, function2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(int i2, Modifier modifier, int i3, int i5, Composer composer, int i7) {
        mUb(i2, modifier, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final void qie(final String description, final String acceptButtonText, final Function2 onLinkClick, final Function0 onAcceptButtonClick, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(acceptButtonText, "acceptButtonText");
        Intrinsics.checkNotNullParameter(onLinkClick, "onLinkClick");
        Intrinsics.checkNotNullParameter(onAcceptButtonClick, "onAcceptButtonClick");
        Composer composerKN = composer.KN(-2029201368);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(description) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(acceptButtonText) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onLinkClick) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onAcceptButtonClick) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-2029201368, i3, -1, "com.alightcreative.pptos.ui.PPTOSContent (PPTOSFragment.kt:160)");
            }
            H9N.CN3.nr(ComposableLambdaKt.nr(1853754545, true, new j(description, onLinkClick, onAcceptButtonClick, acceptButtonText), composerKN, 54), composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Fl.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Pl.az(description, acceptButtonText, onLinkClick, onAcceptButtonClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ty(Modifier modifier, final String text, final Function2 onLinkClick, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onLinkClick, "onLinkClick");
        Composer composerKN = composer.KN(-383768206);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(text) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onLinkClick) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(-383768206, i5, -1, "com.alightcreative.pptos.ui.PPTOSText (PPTOSFragment.kt:247)");
            }
            final Context context = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
            char c2 = 14;
            TextStyle textStyle = new TextStyle(ColorResources_androidKt.n(2131099679, composerKN, 6), TextUnitKt.KN(14), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744444, null);
            composerKN.eF(275335388);
            Set<Map.Entry> setEntrySet = Wre.INSTANCE.n().entrySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                String str = (String) entry.getKey();
                final String str2 = (String) entry.getValue();
                Color colorXMQ = Color.xMQ(ColorResources_androidKt.n(2131099677, composerKN, 6));
                composerKN.eF(-1196189024);
                boolean zE2 = ((i5 & 896) == 256) | composerKN.E2(context) | composerKN.p5(str2);
                char c4 = c2;
                Object objIF = composerKN.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: Fl.o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Pl.HI(onLinkClick, context, str2);
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                arrayList.add(new QaP(str, new P0j.Dsr(true, false, false, false, false, colorXMQ, 0L, (Function0) objIF, 94, null)));
                c2 = c4;
            }
            composerKN.Xw();
            modifier3 = modifier4;
            CM.xMQ(text, modifier3, 0L, null, textStyle, arrayList, composerKN, ((i5 >> 3) & 14) | ((i5 << 3) & 112), 12);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Fl.qz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Pl.ck(modifier3, text, onLinkClick, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(Modifier modifier, Function0 function0, String str, int i2, int i3, Composer composer, int i5) {
        Uo(modifier, function0, str, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(Function2 function2, Context context, String str) {
        function2.invoke(context, str);
        return Unit.INSTANCE;
    }

    public static final void mUb(final int i2, final Modifier modifier, Composer composer, final int i3, final int i5) {
        int i7;
        int i8;
        int i9;
        Composer composerKN = composer.KN(123196411);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (composerKN.t(i2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i3;
        } else {
            i7 = i3;
        }
        int i10 = i5 & 2;
        if (i10 != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            if (composerKN.p5(modifier)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i7 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.v()) {
                ComposerKt.p5(123196411, i7, -1, "com.alightcreative.pptos.ui.CroppedScaleImage (PPTOSFragment.kt:233)");
            }
            ImageKt.n(PainterResources_androidKt.t(i2, composerKN, i7 & 14), null, modifier2, null, ContentScale.INSTANCE.O(), 0.0f, null, composerKN, ((i7 << 3) & 896) | 24624, 104);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Fl.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Pl.gh(i2, modifier, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
