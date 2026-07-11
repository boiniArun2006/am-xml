package D;

import D.qz;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.account.PurchasePeriod;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.internal.d;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final R5.Wre f1123n;
    private static final List rl;

    static final class j implements Function2 {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f1124O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Integer f1125n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f1126o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f1127r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f1128t;

        /* JADX INFO: renamed from: D.qz$j$j, reason: collision with other inner class name */
        static final class C0039j implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ RowScope f1129n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f1130t;

            C0039j(RowScope rowScope, int i2) {
                this.f1129n = rowScope;
                this.f1130t = i2;
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
                    ComposerKt.p5(-1620440682, i2, -1, "com.alightcreative.monetization.ui.components.PaywallOption.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaywallOtherOptionsSheet.kt:200)");
                }
                Modifier modifierT = this.f1129n.t(PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(8)), Alignment.INSTANCE.xMQ());
                String strAz = qz.az(this.f1130t, composer, 0);
                H9N.j jVar = H9N.j.f3810n;
                TextKt.t(strAz, modifierT, jVar.n(composer, 6).n(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).Z(), composer, 0, 0, 65528);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        static final class n implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ int f1131O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f1132n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f1133t;

            n(boolean z2, int i2, int i3) {
                this.f1132n = z2;
                this.f1133t = i2;
                this.f1131O = i3;
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
                    ComposerKt.p5(-203715444, i2, -1, "com.alightcreative.monetization.ui.components.PaywallOption.<anonymous>.<anonymous>.<anonymous> (PaywallOtherOptionsSheet.kt:220)");
                }
                ImageKt.n(PainterResources_androidKt.t(this.f1132n ? this.f1133t : this.f1131O, composer, 0), null, SizeKt.Z(Modifier.INSTANCE, Dp.KN(26)), null, null, 0.0f, null, composer, 432, b.f61769v);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j(Integer num, String str, String str2, boolean z2, int i2, int i3) {
            this.f1125n = num;
            this.f1128t = str;
            this.f1124O = str2;
            this.J2 = z2;
            this.f1127r = i2;
            this.f1126o = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            String str;
            Modifier.Companion companion;
            String str2;
            boolean z2;
            RowScopeInstance rowScopeInstance;
            Integer num;
            float f3;
            int i3;
            int i5;
            int i7;
            TextStyle textStyleIk;
            RowScopeInstance rowScopeInstance2;
            Composer composer2 = composer;
            if ((i2 & 3) == 2 && composer2.xMQ()) {
                composer2.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1396716603, i2, -1, "com.alightcreative.monetization.ui.components.PaywallOption.<anonymous> (PaywallOtherOptionsSheet.kt:156)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f4 = 16;
            Modifier modifierKN = SizeKt.KN(SizeKt.gh(PaddingKt.mUb(companion2, Dp.KN(20), Dp.KN(f4)), Dp.KN(48), 0.0f, 2, null), 0.0f, 1, null);
            Integer num2 = this.f1125n;
            String str3 = this.f1128t;
            String str4 = this.f1124O;
            boolean z3 = this.J2;
            int i8 = this.f1127r;
            int i9 = this.f1126o;
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Horizontal horizontalJ2 = arrangement.J2();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion3.qie(), composer2, 0);
            int iN = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer2, modifierKN);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion4.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N);
            } else {
                composer2.r();
            }
            Composer composerN = Updater.n(composer2);
            Updater.O(composerN, measurePolicyRl, companion4.t());
            Updater.O(composerN, compositionLocalMapIk, companion4.O());
            Function2 function2Rl = companion4.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion4.nr());
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.f17780n;
            Modifier modifierT = rowScopeInstance3.t(RowScope.rl(rowScopeInstance3, companion2, 1.0f, false, 2, null), companion3.xMQ());
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.ty(Dp.KN(2)), companion3.gh(), composer2, 6);
            int iN2 = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierT);
            Function0 function0N2 = companion4.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N2);
            } else {
                composer2.r();
            }
            Composer composerN2 = Updater.n(composer2);
            Updater.O(composerN2, measurePolicyN, companion4.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
            Function2 function2Rl2 = companion4.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion4.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            composer2.eF(732504674);
            if (str3 == null) {
                i5 = i8;
                i3 = i9;
                f3 = f4;
                rowScopeInstance = rowScopeInstance3;
                num = num2;
                str = str3;
                str2 = str4;
                z2 = z3;
                companion = companion2;
                i7 = 6;
            } else {
                H9N.j jVar = H9N.j.f3810n;
                TextStyle textStyleXQ = jVar.rl(composer2, 6).XQ();
                long jN = jVar.n(composer2, 6).n();
                str = str3;
                companion = companion2;
                str2 = str4;
                z2 = z3;
                rowScopeInstance = rowScopeInstance3;
                num = num2;
                f3 = f4;
                i3 = i9;
                i5 = i8;
                i7 = 6;
                TextKt.t(str, companion, jN, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, textStyleXQ, composer, 48, 3072, 57336);
                composer2 = composer;
                Unit unit = Unit.INSTANCE;
            }
            composer2.Xw();
            if (str == null) {
                composer2.eF(1233272083);
                textStyleIk = H9N.j.f3810n.rl(composer2, i7).XQ();
                composer2.Xw();
            } else {
                composer2.eF(1233358356);
                textStyleIk = H9N.j.f3810n.rl(composer2, i7).Ik();
                composer2.Xw();
            }
            TextKt.t(str2, companion, H9N.j.f3810n.n(composer2, i7).n(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleIk, composer, 48, 0, 65528);
            Modifier.Companion companion5 = companion;
            composer.XQ();
            SpacerKt.n(SizeKt.ViF(companion5, Dp.KN(f3)), composer, i7);
            composer.eF(1572916978);
            if (num == null) {
                rowScopeInstance2 = rowScopeInstance;
            } else {
                rowScopeInstance2 = rowScopeInstance;
                CardKt.n(rowScopeInstance2.t(companion5, companion3.xMQ()), RoundedCornerShapeKt.t(Dp.KN(8)), z2 ? Color.INSTANCE.J2() : aD.w6.e(), 0L, null, Dp.KN(0), ComposableLambdaKt.nr(-1620440682, true, new C0039j(rowScopeInstance2, num.intValue()), composer, 54), composer, 1769472, 24);
                SpacerKt.n(SizeKt.ViF(companion5, Dp.KN(f3)), composer, i7);
                Unit unit2 = Unit.INSTANCE;
            }
            composer.Xw();
            CardKt.n(rowScopeInstance2.t(SizeKt.Z(companion5, Dp.KN(26)), companion3.xMQ()), RoundedCornerShapeKt.t(Dp.KN(13)), Color.INSTANCE.J2(), 0L, null, Dp.KN(0), ComposableLambdaKt.nr(-203715444, true, new n(z2, i5, i3), composer, 54), composer, 1769856, 24);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function4 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f1134O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f1135n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f1136r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f1137t;

        n(List list, List list2, boolean z2, Function1 function1, boolean z3) {
            this.f1135n = list;
            this.f1137t = list2;
            this.f1134O = z2;
            this.J2 = function1;
            this.f1136r = z3;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            rl((AnimatedContentScope) obj, (PurchasePeriod) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(AnimatedContentScope AnimatedContent, PurchasePeriod purchasePeriod, Composer composer, int i2) {
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.v()) {
                ComposerKt.p5(-713408107, i2, -1, "com.alightcreative.monetization.ui.components.PaywallOtherOptionsSheet.<anonymous>.<anonymous>.<anonymous> (PaywallOtherOptionsSheet.kt:100)");
            }
            Integer num = null;
            Modifier modifierG = SizeKt.g(Modifier.INSTANCE, 0.0f, Dp.KN(334), 1, null);
            Arrangement.Vertical verticalN = Arrangement.f17400n.n();
            List list = this.f1135n;
            List list2 = this.f1137t;
            boolean z2 = this.f1134O;
            final Function1 function1 = this.J2;
            boolean z3 = this.f1136r;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalN, Alignment.INSTANCE.gh(), composer2, 6);
            int iN = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer2, modifierG);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N);
            } else {
                composer2.r();
            }
            Composer composerN = Updater.n(composer2);
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            composer2.eF(1998055992);
            if (list != null) {
                final int i3 = 0;
                for (Object obj : list) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    R5.Wre wre = (R5.Wre) obj;
                    String str = (String) CollectionsKt.getOrNull(list2, i3);
                    boolean z4 = z2;
                    String strUo = fuX.Uo(wre, z4, false, true, composer2, 3072, 4);
                    Integer numGh = wre.gh();
                    if (!z3) {
                        numGh = num;
                    }
                    boolean zAreEqual = Intrinsics.areEqual(wre.ty(), purchasePeriod);
                    composer2.eF(-1731756228);
                    boolean zP5 = composer2.p5(function1) | composer2.t(i3);
                    Object objIF = composer2.iF();
                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: D.Pl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return qz.n.t(function1, i3);
                            }
                        };
                        composer2.o(objIF);
                    }
                    composer2.Xw();
                    boolean z5 = z3;
                    qz.O((Function0) objIF, str, strUo, zAreEqual, numGh, 0, 0, composer, 0, 96);
                    composer2 = composer;
                    composer2.eF(1998082227);
                    if (!Intrinsics.areEqual(wre, CollectionsKt.last(list))) {
                        SpacerKt.n(SizeKt.xMQ(Modifier.INSTANCE, Dp.KN(8)), composer2, 6);
                    }
                    composer2.Xw();
                    z3 = z5;
                    i3 = i5;
                    z2 = z4;
                    num = null;
                }
            }
            composer2.Xw();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function1 function1, int i2) {
            function1.invoke(Integer.valueOf(i2));
            return Unit.INSTANCE;
        }
    }

    static {
        R5.Wre wre = new R5.Wre("$2.99", 2990000L, "USD", PurchasePeriod.INSTANCE.rl(), null, null, null, null, 7, null, null, null, 3824, null);
        f1123n = wre;
        rl = CollectionsKt.listOf((Object[]) new R5.Wre[]{wre, R5.Wre.rl(wre, "$4.99", 4990000L, null, null, null, null, null, null, null, null, null, null, 4092, null)});
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final R5.Wre wre, final List list, final boolean z2, final Function1 onSubscriptionClicked, List list2, boolean z3, int i2, final Function0 onCloseIconClicked, Composer composer, final int i3, final int i5) {
        int i7;
        boolean z4;
        int i8;
        int i9;
        List listEmptyList;
        int i10;
        boolean z5;
        int i11;
        int i12;
        int i13;
        int i14;
        final int i15;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        boolean z6;
        Object objIF;
        final int i16;
        final List list3;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onSubscriptionClicked, "onSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onCloseIconClicked, "onCloseIconClicked");
        Composer composerKN = composer.KN(1656242590);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.p5(wre) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i7 |= composerKN.E2(list) ? 32 : 16;
            }
            if ((4 & i5) != 0) {
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z4 = z2;
                    i7 |= composerKN.n(z4) ? 256 : 128;
                }
                if ((i5 & 8) != 0) {
                    i7 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i7 |= composerKN.E2(onSubscriptionClicked) ? 2048 : 1024;
                }
                i8 = i5 & 16;
                if (i8 != 0) {
                    i7 |= 24576;
                    listEmptyList = list2;
                    i9 = 64;
                } else {
                    i9 = 64;
                    if ((i3 & 24576) == 0) {
                        listEmptyList = list2;
                        i7 |= composerKN.E2(listEmptyList) ? 16384 : 8192;
                    } else {
                        listEmptyList = list2;
                    }
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                    i7 |= 196608;
                    z5 = z3;
                } else {
                    z5 = z3;
                    if ((i3 & 196608) == 0) {
                        i7 |= composerKN.n(z5) ? 131072 : 65536;
                    }
                }
                i11 = i5 & 64;
                int i17 = i7;
                if (i11 != 0) {
                    i12 = i2;
                    i13 = i17 | 1572864;
                } else {
                    i12 = i2;
                    if ((i3 & 1572864) == 0) {
                        i13 = i17 | (composerKN.t(i12) ? 1048576 : 524288);
                    } else {
                        i13 = i17;
                    }
                }
                if ((128 & i5) != 0) {
                    i13 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i13 |= composerKN.E2(onCloseIconClicked) ? 8388608 : 4194304;
                }
                i14 = i13;
                if ((i14 & 4793491) == 4793490 && composerKN.xMQ()) {
                    composerKN.wTp();
                    list3 = listEmptyList;
                    z7 = z5;
                    i16 = i12;
                } else {
                    if (i8 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    List list4 = listEmptyList;
                    if (i10 != 0) {
                        z5 = true;
                    }
                    i15 = i11 == 0 ? d.f62986a : i12;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1656242590, i14, -1, "com.alightcreative.monetization.ui.components.PaywallOtherOptionsSheet (PaywallOtherOptionsSheet.kt:72)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion3.n();
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
                    Updater.O(composerN, measurePolicyUo, companion3.t());
                    Updater.O(composerN, compositionLocalMapIk, companion3.O());
                    function2Rl = companion3.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion3.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    float f3 = 24;
                    Modifier modifierGh = PaddingKt.gh(BackgroundKt.nr(SizeKt.KN(companion, 0.0f, 1, null), aD.w6.M7(), null, 2, null), Dp.KN(f3), 0.0f, 2, null);
                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.n(), companion2.Uo(), composerKN, 54);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierGh);
                    Function0 function0N2 = companion3.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.r();
                    } else {
                        composerKN.s7N(function0N2);
                    }
                    composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicyN, companion3.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                    function2Rl2 = companion3.rl();
                    if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO2, companion3.nr());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                    Dj7.Ml.rl(columnScopeInstance, 0L, composerKN, 6, 1);
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(20)), composerKN, 6);
                    String strT = StringResources_androidKt.t(2132019809, composerKN, 6);
                    Modifier modifierT = columnScopeInstance.t(companion, companion2.Uo());
                    H9N.j jVar = H9N.j.f3810n;
                    TextKt.t(strT, modifierT, jVar.n(composerKN, 6).t(), 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).XQ(), composerKN, 0, 0, 65016);
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composerKN, 6);
                    PurchasePeriod purchasePeriodTy = wre == null ? wre.ty() : null;
                    composerKN.eF(-1499575534);
                    z6 = (i14 & 3670016) != 1048576;
                    objIF = composerKN.iF();
                    if (!z6 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function1() { // from class: D.Dsr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return qz.xMQ(i15, (AnimatedContentTransitionScope) obj);
                            }
                        };
                        composerKN.o(objIF);
                    }
                    Function1 function1 = (Function1) objIF;
                    composerKN.Xw();
                    boolean z9 = z5;
                    AnimatedContentKt.rl(purchasePeriodTy, null, function1, null, "PaywallOptions", null, ComposableLambdaKt.nr(-713408107, true, new n(list, list4, z4, onSubscriptionClicked, z9), composerKN, 54), composerKN, 1597440, 42);
                    composerKN = composerKN;
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(i9)), composerKN, 6);
                    composerKN.XQ();
                    o.CN3.t(onCloseIconClicked, PaddingKt.az(companion, Dp.KN(f3), Dp.KN(28), 0.0f, 0.0f, 12, null), null, composerKN, ((i14 >> 21) & 14) | 48, 4);
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    i16 = i15;
                    list3 = list4;
                    z7 = z9;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: D.aC
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return qz.mUb(wre, list, z2, onSubscriptionClicked, list3, z7, i16, onCloseIconClicked, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            z4 = z2;
            if ((i5 & 8) != 0) {
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            int i172 = i7;
            if (i11 != 0) {
            }
            if ((128 & i5) != 0) {
            }
            i14 = i13;
            if ((i14 & 4793491) == 4793490) {
                if (i8 != 0) {
                }
                List list42 = listEmptyList;
                if (i10 != 0) {
                }
                if (i11 == 0) {
                }
                if (ComposerKt.v()) {
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion22.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, companion4);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0 function0N3 = companion32.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyUo2, companion32.t());
                Updater.O(composerN, compositionLocalMapIk3, companion32.O());
                function2Rl = companion32.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO3, companion32.nr());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                    float f32 = 24;
                    Modifier modifierGh2 = PaddingKt.gh(BackgroundKt.nr(SizeKt.KN(companion4, 0.0f, 1, null), aD.w6.M7(), null, 2, null), Dp.KN(f32), 0.0f, 2, null);
                    MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.n(), companion22.Uo(), composerKN, 54);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                    Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierGh2);
                    Function0 function0N22 = companion32.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicyN2, companion32.t());
                    Updater.O(composerN2, compositionLocalMapIk22, companion32.O());
                    function2Rl2 = companion32.rl();
                    if (!composerN2.getInserting()) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        Updater.O(composerN2, modifierO22, companion32.nr());
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                        Dj7.Ml.rl(columnScopeInstance2, 0L, composerKN, 6, 1);
                        SpacerKt.n(SizeKt.xMQ(companion4, Dp.KN(20)), composerKN, 6);
                        String strT2 = StringResources_androidKt.t(2132019809, composerKN, 6);
                        Modifier modifierT2 = columnScopeInstance2.t(companion4, companion22.Uo());
                        H9N.j jVar2 = H9N.j.f3810n;
                        TextKt.t(strT2, modifierT2, jVar2.n(composerKN, 6).t(), 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, jVar2.rl(composerKN, 6).XQ(), composerKN, 0, 0, 65016);
                        SpacerKt.n(SizeKt.xMQ(companion4, Dp.KN(f32)), composerKN, 6);
                        if (wre == null) {
                        }
                        composerKN.eF(-1499575534);
                        if ((i14 & 3670016) != 1048576) {
                        }
                        objIF = composerKN.iF();
                        if (!z6) {
                            objIF = new Function1() { // from class: D.Dsr
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return qz.xMQ(i15, (AnimatedContentTransitionScope) obj);
                                }
                            };
                            composerKN.o(objIF);
                            Function1 function12 = (Function1) objIF;
                            composerKN.Xw();
                            boolean z92 = z5;
                            AnimatedContentKt.rl(purchasePeriodTy, null, function12, null, "PaywallOptions", null, ComposableLambdaKt.nr(-713408107, true, new n(list, list42, z4, onSubscriptionClicked, z92), composerKN, 54), composerKN, 1597440, 42);
                            composerKN = composerKN;
                            SpacerKt.n(SizeKt.xMQ(companion4, Dp.KN(i9)), composerKN, 6);
                            composerKN.XQ();
                            o.CN3.t(onCloseIconClicked, PaddingKt.az(companion4, Dp.KN(f32), Dp.KN(28), 0.0f, 0.0f, 12, null), null, composerKN, ((i14 >> 21) & 14) | 48, 4);
                            composerKN.XQ();
                            if (ComposerKt.v()) {
                            }
                            i16 = i15;
                            list3 = list42;
                            z7 = z92;
                        }
                    }
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((4 & i5) != 0) {
        }
        z4 = z2;
        if ((i5 & 8) != 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        int i1722 = i7;
        if (i11 != 0) {
        }
        if ((128 & i5) != 0) {
        }
        i14 = i13;
        if ((i14 & 4793491) == 4793490) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final Function0 function0, final String str, final String str2, final boolean z2, final Integer num, int i2, int i3, Composer composer, final int i5, final int i7) {
        int i8;
        String str3;
        Integer num2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        Object objIF;
        Composer composer2;
        final int i13;
        final int i14;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(276754143);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i8 = (composerKN.E2(function0) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            i8 |= composerKN.p5(str) ? 32 : 16;
        }
        if ((i7 & 4) != 0) {
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                str3 = str2;
                i8 |= composerKN.p5(str3) ? 256 : 128;
            }
            if ((i7 & 8) == 0) {
                i8 |= 3072;
            } else if ((i5 & 3072) == 0) {
                i8 |= composerKN.n(z2) ? 2048 : 1024;
            }
            if ((i7 & 16) == 0) {
                i8 |= 24576;
            } else {
                if ((i5 & 24576) == 0) {
                    num2 = num;
                    i8 |= composerKN.p5(num2) ? 16384 : 8192;
                }
                i9 = i7 & 32;
                if (i9 != 0) {
                    i8 |= 196608;
                } else {
                    if ((196608 & i5) == 0) {
                        i10 = i2;
                        i8 |= composerKN.t(i10) ? 131072 : 65536;
                    }
                    i11 = i7 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i5) == 0) {
                            i12 = i3;
                            i8 |= composerKN.t(i12) ? 1048576 : 524288;
                        }
                        if ((599187 & i8) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            i13 = i10;
                            i14 = i12;
                        } else {
                            if (i9 != 0) {
                                i10 = 2131231869;
                            }
                            if (i11 != 0) {
                                i12 = 2131231868;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(276754143, i8, -1, "com.alightcreative.monetization.ui.components.PaywallOption (PaywallOtherOptionsSheet.kt:143)");
                            }
                            RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(Dp.KN(16));
                            long jE = !z2 ? aD.w6.e() : str != null ? aD.w6.X() : Color.INSTANCE.J2();
                            float fKN = Dp.KN(0);
                            composerKN.eF(-1875451914);
                            z3 = (i8 & 14) == 4;
                            objIF = composerKN.iF();
                            if (!z3 || objIF == Composer.INSTANCE.n()) {
                                objIF = new Function0() { // from class: D.C
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return qz.J2(function0);
                                    }
                                };
                                composerKN.o(objIF);
                            }
                            composerKN.Xw();
                            int i15 = i10;
                            String str4 = str3;
                            int i16 = i12;
                            composer2 = composerKN;
                            CardKt.rl((Function0) objIF, null, false, roundedCornerShapeT, jE, 0L, null, fKN, null, ComposableLambdaKt.nr(-1396716603, true, new j(num2, str, str4, z2, i16, i15), composerKN, 54), composer2, 817889280, 358);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            i13 = i15;
                            i14 = i16;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2() { // from class: D.o
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return qz.Uo(function0, str, str2, z2, num, i13, i14, i5, i7, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 |= 1572864;
                    i12 = i3;
                    if ((599187 & i8) == 599186) {
                        if (i9 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (ComposerKt.v()) {
                        }
                        RoundedCornerShape roundedCornerShapeT2 = RoundedCornerShapeKt.t(Dp.KN(16));
                        if (!z2) {
                        }
                        float fKN2 = Dp.KN(0);
                        composerKN.eF(-1875451914);
                        if ((i8 & 14) == 4) {
                        }
                        objIF = composerKN.iF();
                        if (!z3) {
                            objIF = new Function0() { // from class: D.C
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return qz.J2(function0);
                                }
                            };
                            composerKN.o(objIF);
                            composerKN.Xw();
                            int i152 = i10;
                            String str42 = str3;
                            int i162 = i12;
                            composer2 = composerKN;
                            CardKt.rl((Function0) objIF, null, false, roundedCornerShapeT2, jE, 0L, null, fKN2, null, ComposableLambdaKt.nr(-1396716603, true, new j(num2, str, str42, z2, i162, i152), composerKN, 54), composer2, 817889280, 358);
                            if (ComposerKt.v()) {
                            }
                            i13 = i152;
                            i14 = i162;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i10 = i2;
                i11 = i7 & 64;
                if (i11 != 0) {
                }
                i12 = i3;
                if ((599187 & i8) == 599186) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            num2 = num;
            i9 = i7 & 32;
            if (i9 != 0) {
            }
            i10 = i2;
            i11 = i7 & 64;
            if (i11 != 0) {
            }
            i12 = i3;
            if ((599187 & i8) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        str3 = str2;
        if ((i7 & 8) == 0) {
        }
        if ((i7 & 16) == 0) {
        }
        num2 = num;
        i9 = i7 & 32;
        if (i9 != 0) {
        }
        i10 = i2;
        i11 = i7 & 64;
        if (i11 != 0) {
        }
        i12 = i3;
        if ((599187 & i8) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Function0 function0, String str, String str2, boolean z2, Integer num, int i2, int i3, int i5, int i7, Composer composer, int i8) {
        O(function0, str, str2, z2, num, i2, i3, composer, RecomposeScopeImplKt.n(i5 | 1), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(R5.Wre wre, List list, boolean z2, Function1 function1, List list2, boolean z3, int i2, Function0 function0, int i3, int i5, Composer composer, int i7) {
        KN(wre, list, z2, function1, list2, z3, i2, function0, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform xMQ(int i2, AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.J2(EnterExitTransitionKt.HI(AnimationSpecKt.ty(i2, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.Ik(AnimationSpecKt.ty(i2, 0, null, 6, null), 0.0f, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az(int i2, Composer composer, int i3) {
        composer.eF(-1236583117);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1236583117, i3, -1, "com.alightcreative.monetization.ui.components.getDiscountBadge (PaywallOtherOptionsSheet.kt:233)");
        }
        String strNr = StringResources_androidKt.nr(2132019808, new Object[]{Integer.valueOf(i2)}, composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return strNr;
    }
}
