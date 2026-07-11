package Yz;

import Yz.qz;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class qz {

    public static final class I28 extends Lambda implements Function4 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f12251n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(List list) {
            super(4);
            this.f12251n = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i5;
            if ((i3 & 6) == 0) {
                i5 = (composer.p5(lazyItemScope) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
            if ((i3 & 48) == 0) {
                i5 |= composer.t(i2) ? 32 : 16;
            }
            if ((i5 & 147) == 146 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            Map.Entry entry = (Map.Entry) this.f12251n.get(i2);
            composer.eF(-426799272);
            SelectionContainerKt.t(null, ComposableLambdaKt.nr(1901878815, true, new n((String) entry.getKey(), (String) entry.getValue()), composer, 54), composer, 48, 1);
            qz.S(composer, 0);
            composer.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final class Ml extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f12252n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f12253t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Function1 function1, List list) {
            super(1);
            this.f12252n = function1;
            this.f12253t = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final Object n(int i2) {
            return this.f12252n.invoke(this.f12253t.get(i2));
        }
    }

    public static final class Wre implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
        }
    }

    static final class j implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MutableState f12254O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f12255n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f12256t;

        j(String str, MutableState mutableState, MutableState mutableState2) {
            this.f12255n = str;
            this.f12256t = mutableState;
            this.f12254O = mutableState2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KN(KeyboardActionScope KeyboardActions) {
            Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
            KeyboardActions.n(ImeAction.INSTANCE.rl());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(MutableState mutableState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            qz.XQ(mutableState, it);
            return Unit.INSTANCE;
        }

        public final void O(Composer composer, int i2) {
            final MutableState mutableState;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(918173815, i2, -1, "com.bendingspoons.oracle.secretmenu.oracleSettings.OracleSettingsContent.<anonymous>.<anonymous> (OracleSettingsScreen.kt:82)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 8;
            Modifier modifierMUb = PaddingKt.mUb(companion, Dp.KN(16), Dp.KN(f3));
            String str = this.f12255n;
            MutableState mutableState2 = this.f12256t;
            final MutableState mutableState3 = this.f12254O;
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Vertical verticalUo = arrangement.Uo();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierMUb);
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
            Updater.O(composerN, measurePolicyN, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            String str2 = "Last updated: " + str;
            MaterialTheme materialTheme = MaterialTheme.f26164n;
            int i3 = MaterialTheme.rl;
            TextKt.t(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(materialTheme.t(composer, i3).getBodySmall(), Color.INSTANCE.t(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer, 0, 0, 65534);
            Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
            composer.eF(1760591411);
            Object objIF = composer.iF();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objIF == companion4.n()) {
                mutableState = mutableState2;
                objIF = new Function0() { // from class: Yz.Dsr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qz.j.J2(mutableState);
                    }
                };
                composer.o(objIF);
            } else {
                mutableState = mutableState2;
            }
            composer.Xw();
            Modifier modifierJ2 = ClickableKt.J2(modifierKN, false, null, null, (Function0) objIF, 7, null);
            MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.nr(), companion2.xMQ(), composer, 54);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierJ2);
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
            Updater.O(composerN2, measurePolicyRl, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            final MutableState mutableState4 = mutableState;
            TextKt.t("Show All Settings", PaddingKt.gh(companion, 0.0f, Dp.KN(f3), 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.t(composer, i3).getBodyLarge(), composer, 54, 0, 65532);
            boolean zR = qz.r(mutableState4);
            composer.eF(1648762139);
            Object objIF2 = composer.iF();
            if (objIF2 == companion4.n()) {
                objIF2 = new Function1() { // from class: Yz.aC
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qz.j.Uo(mutableState4, ((Boolean) obj).booleanValue());
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            SwitchKt.n(zR, (Function1) objIF2, null, null, false, null, null, composer, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            composer.XQ();
            Modifier modifierKN2 = SizeKt.KN(companion, 0.0f, 1, null);
            String strZ = qz.Z(mutableState3);
            RoundedCornerShape roundedCornerShapeN = RoundedCornerShapeKt.n(100);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.Uo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, (DefaultConstructorMarker) null);
            composer.eF(1760637879);
            Object objIF3 = composer.iF();
            if (objIF3 == companion4.n()) {
                objIF3 = new Function1() { // from class: Yz.C
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qz.j.KN((KeyboardActionScope) obj);
                    }
                };
                composer.o(objIF3);
            }
            composer.Xw();
            KeyboardActions keyboardActions = new KeyboardActions(null, null, null, null, (Function1) objIF3, null, 47, null);
            composer.eF(1760624857);
            Object objIF4 = composer.iF();
            if (objIF4 == companion4.n()) {
                objIF4 = new Function1() { // from class: Yz.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qz.j.xMQ(mutableState3, (String) obj);
                    }
                };
                composer.o(objIF4);
            }
            Function1 function1 = (Function1) objIF4;
            composer.Xw();
            Yz.j jVar = Yz.j.f12243n;
            OutlinedTextFieldKt.rl(strZ, function1, modifierKN2, false, false, null, jVar.n(), null, null, jVar.rl(), null, null, null, false, null, keyboardOptions, keyboardActions, false, 0, 0, null, roundedCornerShapeN, null, composer, 806879664, 196608, 0, 6192568);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            O((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(MutableState mutableState) {
            qz.o(mutableState, !qz.r(mutableState));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(MutableState mutableState, boolean z2) {
            qz.o(mutableState, z2);
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f12257n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f12258t;

        n(String str, String str2) {
            this.f12257n = str;
            this.f12258t = str2;
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
                ComposerKt.p5(1901878815, i2, -1, "com.bendingspoons.oracle.secretmenu.oracleSettings.OracleSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OracleSettingsScreen.kt:136)");
            }
            qz.KN(null, this.f12257n, this.f12258t, composer, 0, 1);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final class w6 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f12259n = new w6();

        public w6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(Map map, String str, int i2, Composer composer, int i3) {
        az(map, str, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(Modifier modifier, final String str, final String str2, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Object objIF;
        Composer.Companion companion;
        final MutableState mutableState;
        Object objIF2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1895352916);
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
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.p5(str) ? 32 : 16;
            }
            if ((i3 & 4) != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i5 |= composerKN.p5(str2) ? 256 : 128;
                }
                if ((i5 & 147) == 146 && composerKN.xMQ()) {
                    composerKN.wTp();
                    composer2 = composerKN;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1895352916, i5, -1, "com.bendingspoons.oracle.secretmenu.oracleSettings.ComposeSettingRow (OracleSettingsScreen.kt:152)");
                    }
                    composerKN.eF(180801456);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                        composerKN.o(objIF);
                    }
                    mutableState = (MutableState) objIF;
                    composerKN.Xw();
                    Modifier modifierKN = SizeKt.KN(modifier4, 0.0f, 1, null);
                    composerKN.eF(180805482);
                    objIF2 = composerKN.iF();
                    if (objIF2 == companion.n()) {
                        objIF2 = new Function0() { // from class: Yz.Wre
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return qz.gh(mutableState);
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    composerKN.Xw();
                    Modifier modifierMUb = PaddingKt.mUb(ClickableKt.J2(modifierKN, false, null, null, (Function0) objIF2, 7, null), Dp.KN(16), Dp.KN(8));
                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierMUb);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion2.n();
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
                    Updater.O(composerN, measurePolicyN, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    function2Rl = companion2.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierAz = PaddingKt.az(companion3, 0.0f, 0.0f, 0.0f, Dp.KN(4), 7, null);
                    MaterialTheme materialTheme = MaterialTheme.f26164n;
                    int i8 = MaterialTheme.rl;
                    int i9 = i5;
                    int i10 = 2;
                    TextKt.t(str, modifierAz, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(materialTheme.t(composerKN, i8).getBodyLarge(), 0L, 0L, FontWeight.INSTANCE.n(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerKN, ((i5 >> 3) & 14) | 48, 0, 65532);
                    Modifier modifierAz2 = PaddingKt.az(companion3, 0.0f, 0.0f, 0.0f, Dp.KN(2), 7, null);
                    if (xMQ(mutableState)) {
                        i10 = Integer.MAX_VALUE;
                    }
                    composer2 = composerKN;
                    TextKt.t(str2, modifierAz2, 0L, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.rl(), false, i10, 0, null, TextStyle.t(materialTheme.t(composerKN, i8).getBodyMedium(), 0L, 0L, null, FontStyle.t(!xMQ(mutableState) ? FontStyle.INSTANCE.rl() : FontStyle.INSTANCE.n()), null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777207, null), composer2, ((i9 >> 6) & 14) | 48, 48, 55292);
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: Yz.CN3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return qz.qie(modifier3, str, str2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            if ((i5 & 147) == 146) {
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                composerKN.eF(180801456);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                }
                mutableState = (MutableState) objIF;
                composerKN.Xw();
                Modifier modifierKN2 = SizeKt.KN(modifier4, 0.0f, 1, null);
                composerKN.eF(180805482);
                objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                }
                composerKN.Xw();
                Modifier modifierMUb2 = PaddingKt.mUb(ClickableKt.J2(modifierKN2, false, null, null, (Function0) objIF2, 7, null), Dp.KN(16), Dp.KN(8));
                MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierMUb2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyN2, companion22.t());
                Updater.O(composerN, compositionLocalMapIk2, companion22.O());
                function2Rl = companion22.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO2, companion22.nr());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierAz3 = PaddingKt.az(companion32, 0.0f, 0.0f, 0.0f, Dp.KN(4), 7, null);
                    MaterialTheme materialTheme2 = MaterialTheme.f26164n;
                    int i82 = MaterialTheme.rl;
                    int i92 = i5;
                    int i102 = 2;
                    TextKt.t(str, modifierAz3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(materialTheme2.t(composerKN, i82).getBodyLarge(), 0L, 0L, FontWeight.INSTANCE.n(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerKN, ((i5 >> 3) & 14) | 48, 0, 65532);
                    Modifier modifierAz22 = PaddingKt.az(companion32, 0.0f, 0.0f, 0.0f, Dp.KN(2), 7, null);
                    if (xMQ(mutableState)) {
                    }
                    composer2 = composerKN;
                    TextKt.t(str2, modifierAz22, 0L, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.rl(), false, i102, 0, null, TextStyle.t(materialTheme2.t(composerKN, i82).getBodyMedium(), 0L, 0L, null, FontStyle.t(!xMQ(mutableState) ? FontStyle.INSTANCE.rl() : FontStyle.INSTANCE.n()), null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777207, null), composer2, ((i92 >> 6) & 14) | 48, 48, 55292);
                    composer2.XQ();
                    if (ComposerKt.v()) {
                    }
                    modifier3 = modifier4;
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i3 & 4) != 0) {
        }
        if ((i5 & 147) == 146) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU(int i2, Composer composer, int i3) {
        S(composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void aYN(TFv.Wre settingsFlow, TFv.Wre lastUpdatedFlow, Composer composer, final int i2) {
        int i3;
        final TFv.Wre wre;
        final TFv.Wre wre2;
        Intrinsics.checkNotNullParameter(settingsFlow, "settingsFlow");
        Intrinsics.checkNotNullParameter(lastUpdatedFlow, "lastUpdatedFlow");
        Composer composerKN = composer.KN(978057126);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(settingsFlow) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(lastUpdatedFlow) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
            wre = settingsFlow;
            wre2 = lastUpdatedFlow;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(978057126, i3, -1, "com.bendingspoons.oracle.secretmenu.oracleSettings.OracleSettingsScreen (OracleSettingsScreen.kt:47)");
            }
            wre = settingsFlow;
            wre2 = lastUpdatedFlow;
            az(ViF(SnapshotStateKt.n(settingsFlow, MapsKt.emptyMap(), null, composerKN, (i3 & 14) | 48, 2)), nY(SnapshotStateKt.n(wre2, "", null, composerKN, ((i3 >> 3) & 14) | 48, 2)), composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Yz.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.g(wre, wre2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void az(final Map map, final String str, Composer composer, final int i2) {
        Map mapHI;
        Composer composerKN = composer.KN(657138150);
        int i3 = (i2 & 6) == 0 ? (composerKN.E2(map) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(str) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(657138150, i3, -1, "com.bendingspoons.oracle.secretmenu.oracleSettings.OracleSettingsContent (OracleSettingsScreen.kt:54)");
            }
            composerKN.eF(-1753165896);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composerKN.o(objIF);
            }
            MutableState mutableState = (MutableState) objIF;
            composerKN.Xw();
            composerKN.eF(-1753163735);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotStateKt__SnapshotStateKt.O("", null, 2, null);
                composerKN.o(objIF2);
            }
            final MutableState mutableState2 = (MutableState) objIF2;
            composerKN.Xw();
            composerKN.eF(-1753161496);
            boolean zP5 = composerKN.p5(map);
            Object objIF3 = composerKN.iF();
            if (zP5 || objIF3 == companion.n()) {
                objIF3 = SnapshotStateKt.O(new Function0() { // from class: Yz.w6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qz.ty(map, mutableState2);
                    }
                });
                composerKN.o(objIF3);
            }
            State state = (State) objIF3;
            composerKN.Xw();
            if (r(mutableState)) {
                mapHI = HI(state);
            } else {
                Map mapHI2 = HI(state);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapHI2.entrySet()) {
                    if (!StringsKt.startsWith$default((String) entry.getKey(), "__", false, 2, (Object) null)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                mapHI = linkedHashMap;
            }
            Modifier modifierRl = WindowInsetsPadding_androidKt.rl(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null));
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierRl);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            final Map map2 = mapHI;
            SurfaceKt.n(null, null, Color.INSTANCE.KN(), 0L, 0.0f, Dp.KN(8), null, ComposableLambdaKt.nr(918173815, true, new j(str, mutableState, mutableState2), composerKN, 54), composerKN, 12779904, 91);
            composerKN = composerKN;
            composerKN.eF(164945621);
            boolean zE2 = composerKN.E2(map2);
            Object objIF4 = composerKN.iF();
            if (zE2 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Function1() { // from class: Yz.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qz.ck(map2, (LazyListScope) obj);
                    }
                };
                composerKN.o(objIF4);
            }
            composerKN.Xw();
            LazyDslKt.t(null, null, null, false, null, null, null, false, (Function1) objIF4, composerKN, 0, 255);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Yz.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.Ik(map, str, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(Map map, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List listSortedWith = CollectionsKt.sortedWith(CollectionsKt.toList(map.entrySet()), new Wre());
        LazyColumn.qie(listSortedWith.size(), null, new Ml(w6.f12259n, listSortedWith), ComposableLambdaKt.rl(-632812321, true, new I28(listSortedWith)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(TFv.Wre wre, TFv.Wre wre2, int i2, Composer composer, int i3) {
        aYN(wre, wre2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(Modifier modifier, String str, String str2, int i2, int i3, Composer composer, int i5) {
        KN(modifier, str, str2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map ty(Map map, MutableState mutableState) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = Z(mutableState).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null)) {
                String lowerCase3 = ((String) entry.getValue()).toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = Z(mutableState).toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) lowerCase4, false, 2, (Object) null)) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    private static final Map HI(State state) {
        return (Map) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Composer composer, final int i2) {
        Composer composerKN = composer.KN(-1317400953);
        if (i2 == 0 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1317400953, i2, -1, "com.bendingspoons.oracle.secretmenu.oracleSettings.OracleSettingsDivider (OracleSettingsScreen.kt:180)");
            }
            DividerKt.rl(null, Dp.KN(1), 0L, composerKN, 48, 5);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Yz.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.WPU(i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Map ViF(State state) {
        return (Map) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XQ(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Z(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(MutableState mutableState) {
        mUb(mutableState, !xMQ(mutableState));
        return Unit.INSTANCE;
    }

    private static final void mUb(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    private static final String nY(State state) {
        return (String) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    private static final boolean xMQ(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
