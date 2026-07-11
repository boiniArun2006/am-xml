package Dj7;

import Dj7.eO;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class eO {

    static final class CN3 implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final CN3 f1754n = new CN3();

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((ConstrainScope) obj);
            return Unit.INSTANCE;
        }

        public final void n(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.n(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            constrainAs.KN(Dimension.INSTANCE.n());
        }

        CN3() {
        }
    }

    static final class Dsr implements Function3 {
        final /* synthetic */ TextStyle J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TextDecoration f1755O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f1756n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f1757t;

        Dsr(String str, long j2, TextDecoration textDecoration, TextStyle textStyle) {
            this.f1756n = str;
            this.f1757t = j2;
            this.f1755O = textDecoration;
            this.J2 = textStyle;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n(((Color) obj).getValue(), (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(long j2, Composer composer, int i2) {
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(243812955, i2, -1, "com.alightcreative.common.compose.components.AlightTextButton.<anonymous> (Button.kt:285)");
            }
            int iN = TextAlign.INSTANCE.n();
            TextKt.t(this.f1756n, null, this.f1757t, 0L, null, null, null, 0L, this.f1755O, TextAlign.KN(iN), 0L, TextOverflow.INSTANCE.rl(), false, 2, 0, null, this.J2, composer, 0, 3120, 54522);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class I28 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Measurer2 f1758n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Measurer2 measurer2) {
            super(1);
            this.f1758n = measurer2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((SemanticsPropertyReceiver) obj);
            return Unit.INSTANCE;
        }

        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            ToolingUtilsKt.n(semanticsPropertyReceiver, this.f1758n);
        }
    }

    static final class Ml extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f1759n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ConstraintSetForInlineDsl f1760t;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2invoke();
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(MutableState mutableState, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
            super(0);
            this.f1759n = mutableState;
            this.f1760t = constraintSetForInlineDsl;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2invoke() {
            this.f1759n.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
            this.f1760t.az(true);
        }
    }

    public static final class Wre extends Lambda implements Function2 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f1761O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ String f1762Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f1763n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f1764o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f1765r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ConstraintLayoutScope f1766t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(MutableState mutableState, ConstraintLayoutScope constraintLayoutScope, Function0 function0, Function0 function02, String str, boolean z2, String str2) {
            super(2);
            this.f1763n = mutableState;
            this.f1766t = constraintLayoutScope;
            this.f1761O = function0;
            this.J2 = function02;
            this.f1765r = str;
            this.f1764o = z2;
            this.f1762Z = str2;
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
                ComposerKt.p5(1200550679, i2, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
            }
            this.f1763n.setValue(Unit.INSTANCE);
            int helpersHashCode = this.f1766t.getHelpersHashCode();
            this.f1766t.Uo();
            ConstraintLayoutScope constraintLayoutScope = this.f1766t;
            composer.eF(-1494874492);
            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesGh = constraintLayoutScope.gh();
            ConstrainedLayoutReference constrainedLayoutReferenceN = constrainedLayoutReferencesGh.n();
            ConstrainedLayoutReference constrainedLayoutReferenceRl = constrainedLayoutReferencesGh.rl();
            Dj7.CN3 cn3 = Dj7.CN3.f1597n;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.eF(921616554);
            Object objIF = composer.iF();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objIF == companion2.n()) {
                objIF = CN3.f1754n;
                composer.o(objIF);
            }
            composer.Xw();
            eO.J2(this.J2, this.f1765r, constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceN, (Function1) objIF), null, cn3, null, 0, 0, 0.0f, null, null, null, this.f1764o, composer, 24576, 0, 4072);
            String str = this.f1762Z;
            composer.eF(921626079);
            boolean zP5 = composer.p5(constrainedLayoutReferenceN);
            Object objIF2 = composer.iF();
            if (zP5 || objIF2 == companion2.n()) {
                objIF2 = new fuX(constrainedLayoutReferenceN);
                composer.o(objIF2);
            }
            composer.Xw();
            eO.HI(str, constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceRl, (Function1) objIF2), composer, 0);
            composer.Xw();
            if (this.f1766t.getHelpersHashCode() != helpersHashCode) {
                EffectsKt.KN(this.f1761O, composer, 6);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class fuX implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ConstrainedLayoutReference f1767n;

        fuX(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f1767n = constrainedLayoutReference;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((ConstrainScope) obj);
            return Unit.INSTANCE;
        }

        public final void n(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.n(constrainAs.getTop(), this.f1767n.getTop(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.n(constrainAs.getBottom(), this.f1767n.getTop(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), Dp.KN(12), 0.0f, 4, null);
        }
    }

    static final class j implements Function3 {
        final /* synthetic */ int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f1768O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Dj7.CN3 f1769n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f1770o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ TextStyle f1771r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f1772t;

        j(Dj7.CN3 cn3, String str, int i2, int i3, TextStyle textStyle, String str2) {
            this.f1769n = cn3;
            this.f1772t = str;
            this.f1768O = i2;
            this.J2 = i3;
            this.f1771r = textStyle;
            this.f1770o = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(float f3, long j2, DrawScope drawBehind) {
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.t() & 4294967295L)) - (f3 / 2);
            DrawScope.mI(drawBehind, j2, Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)), Offset.O((4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.t() >> 32))) << 32)), f3, 0, null, 0.0f, null, 0, 496, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            rl(((Color) obj).getValue(), (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(final long j2, Composer composer, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = i2 | (composer.nr(j2) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i3 & 19) == 18 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1371387147, i3, -1, "com.alightcreative.common.compose.components.AlightButton.<anonymous> (Button.kt:170)");
            }
            final float fL = ((Density) composer.ty(CompositionLocalsKt.J2())).l(Dp.KN(1));
            Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
            Dj7.CN3 cn3 = this.f1769n;
            String str = this.f1772t;
            int i5 = this.f1768O;
            int i7 = this.J2;
            TextStyle textStyle = this.f1771r;
            String str2 = this.f1770o;
            Modifier modifierRl = Modifier.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), horizontalUo, composer, 48);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierRl);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            int i8 = i3;
            Function0 function0N = companion.n();
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
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            composer.eF(-1251618461);
            if (cn3 == Dj7.CN3.J2) {
                composer.eF(-1251615402);
                boolean zRl = composer.rl(fL) | ((i8 & 14) == 4);
                Object objIF = composer.iF();
                if (zRl || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1() { // from class: Dj7.Xo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return eO.j.t(fL, j2, (DrawScope) obj);
                        }
                    };
                    composer.o(objIF);
                }
                composer.Xw();
                modifierRl = DrawModifierKt.rl(modifierRl, (Function1) objIF);
            }
            composer.Xw();
            TextAlign.Companion companion2 = TextAlign.INSTANCE;
            TextKt.t(str, modifierRl, 0L, 0L, null, null, null, 0L, null, TextAlign.KN(companion2.n()), 0L, i5, false, i7, 0, null, textStyle, composer, 0, 0, 54780);
            composer.eF(-1251596040);
            if (str2 != null) {
                TextKt.t(str2, null, 0L, 0L, null, null, null, 0L, null, TextAlign.KN(companion2.n()), 0L, i5, false, i7, 0, null, Dj7.fuX.nr(cn3, composer, 0), composer, 0, 0, 54782);
            }
            composer.Xw();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function3 f1773n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f1774t;

        n(Function3 function3, long j2) {
            this.f1773n = function3;
            this.f1774t = j2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope Button, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-430600649, i2, -1, "com.alightcreative.common.compose.components.AlightButtonWithContent.<anonymous> (Button.kt:245)");
            }
            this.f1773n.invoke(Color.xMQ(this.f1774t), composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final class w6 implements MeasurePolicy {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MutableState f1775O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f1776n;
        final /* synthetic */ int nr;
        final /* synthetic */ Measurer2 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ConstraintSetForInlineDsl f1777t;

        static final class j extends Lambda implements Function1 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Map f1778O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Measurer2 f1779n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f1780t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(Measurer2 measurer2, List list, Map map) {
                super(1);
                this.f1779n = measurer2;
                this.f1780t = list;
                this.f1778O = map;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                this.f1779n.Ik(placementScope, this.f1780t, this.f1778O);
            }
        }

        public w6(MutableState mutableState, Measurer2 measurer2, ConstraintSetForInlineDsl constraintSetForInlineDsl, int i2, MutableState mutableState2) {
            this.f1776n = mutableState;
            this.rl = measurer2;
            this.f1777t = constraintSetForInlineDsl;
            this.nr = i2;
            this.f1775O = mutableState2;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f1776n.getValue();
            long jR = this.rl.r(j2, measureScope.getLayoutDirection(), this.f1777t, list, linkedHashMap, this.nr);
            this.f1775O.getValue();
            return MeasureScope.ER(measureScope, IntSize.Uo(jR), IntSize.J2(jR), null, new j(this.rl, list, linkedHashMap), 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final Function0 onClick, final String title, Modifier modifier, String str, Dj7.CN3 cn3, TextStyle textStyle, int i2, int i3, float f3, Dj7.Dsr dsr, Shape shape, PaddingValues paddingValues, boolean z2, Composer composer, final int i5, final int i7, final int i8) {
        int i9;
        Modifier modifier2;
        int i10;
        String str2;
        int i11;
        Dj7.CN3 cn32;
        TextStyle textStyle2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Modifier modifier3;
        TextStyle textStyleO;
        int iN;
        int i19;
        float fRl;
        Dj7.Dsr dsrN;
        Shape shapeT;
        PaddingValues paddingValuesT;
        int i20;
        int i21;
        boolean z3;
        Modifier modifier4;
        Composer composer2;
        final String str3;
        final Dj7.CN3 cn33;
        final TextStyle textStyle3;
        final int i22;
        final int i23;
        final float f4;
        final Dj7.Dsr dsr2;
        final Shape shape2;
        final boolean z4;
        final PaddingValues paddingValues2;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerKN = composer.KN(1362616622);
        if ((i8 & 1) != 0) {
            i9 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i9 = (composerKN.E2(onClick) ? 4 : 2) | i5;
        } else {
            i9 = i5;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i5 & 48) == 0) {
            i9 |= composerKN.p5(title) ? 32 : 16;
        }
        int i24 = i8 & 4;
        if (i24 != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i10 = i8 & 8;
            if (i10 == 0) {
                i9 |= 3072;
            } else {
                if ((i5 & 3072) == 0) {
                    str2 = str;
                    i9 |= composerKN.p5(str2) ? 2048 : 1024;
                }
                i11 = i8 & 16;
                if (i11 == 0) {
                    if ((i5 & 24576) == 0) {
                        cn32 = cn3;
                        i9 |= composerKN.p5(cn32) ? 16384 : 8192;
                    }
                    if ((i5 & 196608) != 0) {
                        textStyle2 = textStyle;
                        i9 |= ((i8 & 32) == 0 && composerKN.p5(textStyle2)) ? 131072 : 65536;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i12 = i8 & 64;
                    if (i12 == 0) {
                        i9 |= 1572864;
                        i13 = i2;
                    } else {
                        i13 = i2;
                        if ((i5 & 1572864) == 0) {
                            i9 |= composerKN.t(i13) ? 1048576 : 524288;
                        }
                    }
                    i14 = i8 & 128;
                    if (i14 == 0) {
                        i9 |= 12582912;
                        i15 = i3;
                    } else {
                        i15 = i3;
                        if ((i5 & 12582912) == 0) {
                            i9 |= composerKN.t(i15) ? 8388608 : 4194304;
                        }
                    }
                    if ((i5 & 100663296) == 0) {
                        i9 |= ((i8 & 256) == 0 && composerKN.rl(f3)) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i9 |= ((i8 & 512) == 0 && composerKN.p5(dsr)) ? 536870912 : 268435456;
                    }
                    if ((i7 & 6) != 0) {
                        i16 = i7 | (((i8 & 1024) == 0 && composerKN.p5(shape)) ? 4 : 2);
                    } else {
                        i16 = i7;
                    }
                    if ((i7 & 48) == 0) {
                        i16 |= ((i8 & 2048) == 0 && composerKN.p5(paddingValues)) ? 32 : 16;
                    }
                    int i25 = i16;
                    i17 = i8 & 4096;
                    if (i17 == 0) {
                        i18 = i25 | RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else {
                        int i26 = i25;
                        if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i26 |= composerKN.n(z2) ? 256 : 128;
                        }
                        i18 = i26;
                    }
                    if ((i9 & 306783379) != 306783378 && (i18 & 147) == 146 && composerKN.xMQ()) {
                        composerKN.wTp();
                        shape2 = shape;
                        composer2 = composerKN;
                        str3 = str2;
                        cn33 = cn32;
                        textStyle3 = textStyle2;
                        i22 = i13;
                        i23 = i15;
                        modifier5 = modifier2;
                        f4 = f3;
                        dsr2 = dsr;
                        paddingValues2 = paddingValues;
                        z4 = z2;
                    } else {
                        composerKN.e();
                        if ((i5 & 1) != 0 || composerKN.rV9()) {
                            modifier3 = i24 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i10 != 0) {
                                str2 = null;
                            }
                            if (i11 != 0) {
                                cn32 = Dj7.CN3.f1597n;
                            }
                            if ((i8 & 32) == 0) {
                                textStyleO = Dj7.fuX.O(cn32, composerKN, (i9 >> 12) & 14);
                                i9 &= -458753;
                            } else {
                                textStyleO = textStyle2;
                            }
                            iN = i12 == 0 ? TextOverflow.INSTANCE.n() : i13;
                            i19 = i14 == 0 ? Integer.MAX_VALUE : i15;
                            if ((i8 & 256) == 0) {
                                fRl = Dj7.fuX.rl(cn32, str2 != null, composerKN, (i9 >> 12) & 14, 0);
                                i9 &= -234881025;
                            } else {
                                fRl = f3;
                            }
                            if ((i8 & 512) == 0) {
                                dsrN = Dj7.fuX.n(cn32, composerKN, (i9 >> 12) & 14);
                                i9 &= -1879048193;
                            } else {
                                dsrN = dsr;
                            }
                            if ((i8 & 1024) == 0) {
                                shapeT = Dj7.fuX.t(cn32, composerKN, (i9 >> 12) & 14);
                                i18 &= -15;
                            } else {
                                shapeT = shape;
                            }
                            if ((i8 & 2048) == 0) {
                                paddingValuesT = ButtonDefaults.f21598n.t();
                                i18 &= -113;
                            } else {
                                paddingValuesT = paddingValues;
                            }
                            i20 = i9;
                            i21 = i18;
                            if (i17 == 0) {
                                z3 = true;
                            }
                            composerKN.S();
                            boolean z5 = z3;
                            if (ComposerKt.v()) {
                                modifier4 = modifier3;
                                ComposerKt.p5(1362616622, i20, i21, "com.alightcreative.common.compose.components.AlightButton (Button.kt:160)");
                            } else {
                                modifier4 = modifier3;
                            }
                            int i27 = i20;
                            PaddingValues paddingValues3 = paddingValuesT;
                            ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-1371387147, true, new j(cn32, title, iN, i19, textStyleO, str2), composerKN, 54);
                            int i28 = i27 >> 18;
                            int i29 = (i27 & 14) | 12582912 | ((i27 >> 3) & 112) | (i28 & 896) | (i28 & 7168);
                            int i30 = i21 << 12;
                            Modifier modifier6 = modifier4;
                            Uo(onClick, modifier6, fRl, dsrN, shapeT, paddingValues3, z5, composableLambdaNr, composerKN, i29 | (57344 & i30) | (458752 & i30) | (i30 & 3670016));
                            composer2 = composerKN;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            str3 = str2;
                            cn33 = cn32;
                            textStyle3 = textStyleO;
                            i22 = iN;
                            i23 = i19;
                            f4 = fRl;
                            dsr2 = dsrN;
                            shape2 = shapeT;
                            z4 = z5;
                            paddingValues2 = paddingValues3;
                            modifier5 = modifier6;
                        } else {
                            composerKN.wTp();
                            if ((i8 & 32) != 0) {
                                i9 &= -458753;
                            }
                            if ((i8 & 256) != 0) {
                                i9 &= -234881025;
                            }
                            if ((i8 & 512) != 0) {
                                i9 &= -1879048193;
                            }
                            if ((i8 & 1024) != 0) {
                                i18 &= -15;
                            }
                            if ((i8 & 2048) != 0) {
                                i18 &= -113;
                            }
                            fRl = f3;
                            paddingValuesT = paddingValues;
                            i20 = i9;
                            textStyleO = textStyle2;
                            iN = i13;
                            i19 = i15;
                            modifier3 = modifier2;
                            dsrN = dsr;
                            shapeT = shape;
                            i21 = i18;
                        }
                        z3 = z2;
                        composerKN.S();
                        boolean z52 = z3;
                        if (ComposerKt.v()) {
                        }
                        int i272 = i20;
                        PaddingValues paddingValues32 = paddingValuesT;
                        ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(-1371387147, true, new j(cn32, title, iN, i19, textStyleO, str2), composerKN, 54);
                        int i282 = i272 >> 18;
                        int i292 = (i272 & 14) | 12582912 | ((i272 >> 3) & 112) | (i282 & 896) | (i282 & 7168);
                        int i302 = i21 << 12;
                        Modifier modifier62 = modifier4;
                        Uo(onClick, modifier62, fRl, dsrN, shapeT, paddingValues32, z52, composableLambdaNr2, composerKN, i292 | (57344 & i302) | (458752 & i302) | (i302 & 3670016));
                        composer2 = composerKN;
                        if (ComposerKt.v()) {
                        }
                        str3 = str2;
                        cn33 = cn32;
                        textStyle3 = textStyleO;
                        i22 = iN;
                        i23 = i19;
                        f4 = fRl;
                        dsr2 = dsrN;
                        shape2 = shapeT;
                        z4 = z52;
                        paddingValues2 = paddingValues32;
                        modifier5 = modifier62;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.aC
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return eO.mUb(onClick, title, modifier5, str3, cn33, textStyle3, i22, i23, f4, dsr2, shape2, paddingValues2, z4, i5, i7, i8, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i9 |= 24576;
                cn32 = cn3;
                if ((i5 & 196608) != 0) {
                }
                i12 = i8 & 64;
                if (i12 == 0) {
                }
                i14 = i8 & 128;
                if (i14 == 0) {
                }
                if ((i5 & 100663296) == 0) {
                }
                if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                if ((i7 & 6) != 0) {
                }
                if ((i7 & 48) == 0) {
                }
                int i252 = i16;
                i17 = i8 & 4096;
                if (i17 == 0) {
                }
                if ((i9 & 306783379) != 306783378) {
                    composerKN.e();
                    if ((i5 & 1) != 0) {
                        if (i24 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if ((i8 & 32) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if ((i8 & 256) == 0) {
                        }
                        if ((i8 & 512) == 0) {
                        }
                        if ((i8 & 1024) == 0) {
                        }
                        if ((i8 & 2048) == 0) {
                        }
                        i20 = i9;
                        i21 = i18;
                        if (i17 == 0) {
                            z3 = z2;
                        }
                        composerKN.S();
                        boolean z522 = z3;
                        if (ComposerKt.v()) {
                        }
                        int i2722 = i20;
                        PaddingValues paddingValues322 = paddingValuesT;
                        ComposableLambda composableLambdaNr22 = ComposableLambdaKt.nr(-1371387147, true, new j(cn32, title, iN, i19, textStyleO, str2), composerKN, 54);
                        int i2822 = i2722 >> 18;
                        int i2922 = (i2722 & 14) | 12582912 | ((i2722 >> 3) & 112) | (i2822 & 896) | (i2822 & 7168);
                        int i3022 = i21 << 12;
                        Modifier modifier622 = modifier4;
                        Uo(onClick, modifier622, fRl, dsrN, shapeT, paddingValues322, z522, composableLambdaNr22, composerKN, i2922 | (57344 & i3022) | (458752 & i3022) | (i3022 & 3670016));
                        composer2 = composerKN;
                        if (ComposerKt.v()) {
                        }
                        str3 = str2;
                        cn33 = cn32;
                        textStyle3 = textStyleO;
                        i22 = iN;
                        i23 = i19;
                        f4 = fRl;
                        dsr2 = dsrN;
                        shape2 = shapeT;
                        z4 = z522;
                        paddingValues2 = paddingValues322;
                        modifier5 = modifier622;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            str2 = str;
            i11 = i8 & 16;
            if (i11 == 0) {
            }
            cn32 = cn3;
            if ((i5 & 196608) != 0) {
            }
            i12 = i8 & 64;
            if (i12 == 0) {
            }
            i14 = i8 & 128;
            if (i14 == 0) {
            }
            if ((i5 & 100663296) == 0) {
            }
            if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if ((i7 & 6) != 0) {
            }
            if ((i7 & 48) == 0) {
            }
            int i2522 = i16;
            i17 = i8 & 4096;
            if (i17 == 0) {
            }
            if ((i9 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i10 = i8 & 8;
        if (i10 == 0) {
        }
        str2 = str;
        i11 = i8 & 16;
        if (i11 == 0) {
        }
        cn32 = cn3;
        if ((i5 & 196608) != 0) {
        }
        i12 = i8 & 64;
        if (i12 == 0) {
        }
        i14 = i8 & 128;
        if (i14 == 0) {
        }
        if ((i5 & 100663296) == 0) {
        }
        if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((i7 & 6) != 0) {
        }
        if ((i7 & 48) == 0) {
        }
        int i25222 = i16;
        i17 = i8 & 4096;
        if (i17 == 0) {
        }
        if ((i9 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HI(final String str, final Modifier modifier, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerKN = composer.KN(188446866);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerKN.p5(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(188446866, i3, -1, "com.alightcreative.common.compose.components.Tag (Button.kt:104)");
            }
            float f3 = 8;
            Modifier modifierT = BackgroundKt.t(modifier, aD.w6.KN(), RoundedCornerShapeKt.t(Dp.KN(f3)));
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
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
            Updater.O(composerN, measurePolicyUo, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            composer2 = composerKN;
            TextKt.t(str, PaddingKt.mUb(Modifier.INSTANCE, Dp.KN(f3), Dp.KN(4)), aD.w6.xMQ(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(H9N.j.f3810n.rl(composerKN, 6).aYN(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null), composer2, (i3 & 14) | 432, 0, 65528);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.Pl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return eO.ck(str, modifier, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Uo(final Function0 function0, final Modifier modifier, final float f3, Dj7.Dsr dsr, final Shape shape, final PaddingValues paddingValues, final boolean z2, final Function3 function3, Composer composer, final int i2) {
        Function0 function02;
        int i3;
        Dj7.Dsr dsr2;
        Composer composer2;
        Composer composerKN = composer.KN(-686844889);
        if ((i2 & 6) == 0) {
            function02 = function0;
            i3 = (composerKN.E2(function02) ? 4 : 2) | i2;
        } else {
            function02 = function0;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(modifier) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.rl(f3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            dsr2 = dsr;
            i3 |= composerKN.p5(dsr2) ? 2048 : 1024;
        } else {
            dsr2 = dsr;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.p5(shape) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.p5(paddingValues) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.n(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.E2(function3) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) == 4793490 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-686844889, i3, -1, "com.alightcreative.common.compose.components.AlightButtonWithContent (Button.kt:216)");
            }
            composerKN.eF(-420893059);
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = InteractionSourceKt.n();
                composerKN.o(objIF);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
            composerKN.Xw();
            State stateN = PressInteractionKt.n(mutableInteractionSource, composerKN, 6);
            long jKN = KN(stateN) ? dsr2.KN() : dsr2.J2();
            long j2 = jKN;
            ButtonKt.n(function02, SizeKt.gh(modifier, f3, 0.0f, 2, null), z2, mutableInteractionSource, null, shape, null, ButtonDefaults.f21598n.n(KN(stateN) ? dsr2.Uo() : dsr2.O(), j2, dsr2.t(), dsr2.nr(), composerKN, ButtonDefaults.qie << 12, 0), paddingValues, ComposableLambdaKt.nr(-430600649, true, new n(function3, j2), composerKN, 54), composerKN, (i3 & 14) | 805334016 | ((i3 >> 12) & 896) | ((i3 << 3) & 458752) | ((i3 << 9) & 234881024), 64);
            composer2 = composerKN;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final Dj7.Dsr dsr3 = dsr2;
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return eO.xMQ(function0, modifier, f3, dsr3, shape, paddingValues, z2, function3, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void az(final Function0 onClick, final String text, Modifier modifier, Shape shape, PaddingValues paddingValues, TextStyle textStyle, long j2, TextDecoration textDecoration, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        Shape shapeT;
        PaddingValues paddingValuesT;
        TextStyle textStyleO;
        int i7;
        long j3;
        int i8;
        TextDecoration textDecoration2;
        final Shape shape2;
        long j4;
        final PaddingValues paddingValues2;
        final Modifier modifier3;
        Composer composer2;
        final TextStyle textStyle2;
        final TextDecoration textDecoration3;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerKN = composer.KN(-1866352190);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(onClick) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(text) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    shapeT = shape;
                    int i10 = composerKN.p5(shapeT) ? 2048 : 1024;
                    i5 |= i10;
                } else {
                    shapeT = shape;
                }
                i5 |= i10;
            } else {
                shapeT = shape;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    paddingValuesT = paddingValues;
                    int i11 = composerKN.p5(paddingValuesT) ? 16384 : 8192;
                    i5 |= i11;
                } else {
                    paddingValuesT = paddingValues;
                }
                i5 |= i11;
            } else {
                paddingValuesT = paddingValues;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    textStyleO = textStyle;
                    int i12 = composerKN.p5(textStyleO) ? 131072 : 65536;
                    i5 |= i12;
                } else {
                    textStyleO = textStyle;
                }
                i5 |= i12;
            } else {
                textStyleO = textStyle;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    j3 = j2;
                    i5 |= composerKN.nr(j3) ? 1048576 : 524288;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= composerKN.p5(textDecoration) ? 8388608 : 4194304;
                }
                if ((i5 & 4793491) == 4793490 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier3 = modifier2;
                    shape2 = shapeT;
                    paddingValues2 = paddingValuesT;
                    composer2 = composerKN;
                    textStyle2 = textStyleO;
                    j5 = j3;
                    textDecoration3 = textDecoration;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                            shapeT = Dj7.fuX.t(Dj7.CN3.f1593O, composerKN, 6);
                        }
                        if ((i3 & 16) != 0) {
                            i5 &= -57345;
                            paddingValuesT = ButtonDefaults.f21598n.t();
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                            textStyleO = Dj7.fuX.O(Dj7.CN3.f1593O, composerKN, 6);
                        }
                        long jUo = i7 == 0 ? Color.INSTANCE.Uo() : j3;
                        textDecoration2 = i8 == 0 ? null : textDecoration;
                        shape2 = shapeT;
                        j4 = jUo;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                        }
                        textDecoration2 = textDecoration;
                        shape2 = shapeT;
                        j4 = j3;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1866352190, i5, -1, "com.alightcreative.common.compose.components.AlightTextButton (Button.kt:271)");
                    }
                    Dj7.CN3 cn3 = Dj7.CN3.f1593O;
                    TextDecoration textDecoration4 = textDecoration2;
                    TextStyle textStyle3 = textStyleO;
                    int i13 = (i5 & 14) | 14155776 | ((i5 >> 3) & 112);
                    int i14 = i5 << 3;
                    Modifier modifier4 = modifier2;
                    paddingValues2 = paddingValuesT;
                    Uo(onClick, modifier4, Dj7.fuX.rl(cn3, false, composerKN, 54, 0), Dj7.Dsr.rl(Dj7.fuX.n(cn3, composerKN, 6), j4, 0L, j4, 0L, 0L, 0L, 58, null), shape2, paddingValues2, true, ComposableLambdaKt.nr(243812955, true, new Dsr(text, j4, textDecoration4, textStyle3), composerKN, 54), composerKN, i13 | (57344 & i14) | (i14 & 458752));
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                    composer2 = composerKN;
                    textStyle2 = textStyle3;
                    textDecoration3 = textDecoration4;
                    j5 = j4;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.o
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eO.ty(onClick, text, modifier3, shape2, paddingValues2, textStyle2, j5, textDecoration3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 1572864;
            j3 = j2;
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            if ((i5 & 4793491) == 4793490) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    shape2 = shapeT;
                    j4 = jUo;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    Dj7.CN3 cn32 = Dj7.CN3.f1593O;
                    TextDecoration textDecoration42 = textDecoration2;
                    TextStyle textStyle32 = textStyleO;
                    int i132 = (i5 & 14) | 14155776 | ((i5 >> 3) & 112);
                    int i142 = i5 << 3;
                    Modifier modifier42 = modifier2;
                    paddingValues2 = paddingValuesT;
                    Uo(onClick, modifier42, Dj7.fuX.rl(cn32, false, composerKN, 54, 0), Dj7.Dsr.rl(Dj7.fuX.n(cn32, composerKN, 6), j4, 0L, j4, 0L, 0L, 0L, 58, null), shape2, paddingValues2, true, ComposableLambdaKt.nr(243812955, true, new Dsr(text, j4, textDecoration42, textStyle32), composerKN, 54), composerKN, i132 | (57344 & i142) | (i142 & 458752));
                    if (ComposerKt.v()) {
                    }
                    modifier3 = modifier42;
                    composer2 = composerKN;
                    textStyle2 = textStyle32;
                    textDecoration3 = textDecoration42;
                    j5 = j4;
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        j3 = j2;
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        if ((i5 & 4793491) == 4793490) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(String str, Modifier modifier, int i2, Composer composer, int i3) {
        HI(str, modifier, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void gh(final Function0 onClick, final String title, final String tagText, Modifier modifier, boolean z2, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Modifier modifier3;
        Object objIF;
        Composer.Companion companion;
        Measurer2 measurer2;
        Object objIF2;
        Object objIF3;
        MutableState mutableState;
        Object objIF4;
        ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objIF5;
        MutableState mutableState2;
        boolean zE2;
        Object w6Var;
        MutableState mutableState3;
        ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        MutableState mutableState4;
        Object objIF6;
        boolean zE22;
        Object objIF7;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        Composer composerKN = composer.KN(-1242129574);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(onClick) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(title) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(tagText) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 16384 : 8192;
                }
                if ((i5 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier3 = modifier2;
                    composer2 = composerKN;
                } else {
                    modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i7 == 0 ? true : z3;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1242129574, i5, -1, "com.alightcreative.common.compose.components.AlightTaggedButton (Button.kt:74)");
                    }
                    composerKN.eF(-1003410150);
                    composerKN.eF(212064437);
                    composerKN.Xw();
                    Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = new Measurer2(density);
                        composerKN.o(objIF);
                    }
                    measurer2 = (Measurer2) objIF;
                    objIF2 = composerKN.iF();
                    if (objIF2 == companion.n()) {
                        objIF2 = new ConstraintLayoutScope();
                        composerKN.o(objIF2);
                    }
                    ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objIF2;
                    objIF3 = composerKN.iF();
                    if (objIF3 == companion.n()) {
                        objIF3 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                        composerKN.o(objIF3);
                    }
                    mutableState = (MutableState) objIF3;
                    objIF4 = composerKN.iF();
                    if (objIF4 == companion.n()) {
                        objIF4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                        composerKN.o(objIF4);
                    }
                    constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objIF4;
                    objIF5 = composerKN.iF();
                    if (objIF5 == companion.n()) {
                        objIF5 = SnapshotStateKt.xMQ(Unit.INSTANCE, SnapshotStateKt.gh());
                        composerKN.o(objIF5);
                    }
                    mutableState2 = (MutableState) objIF5;
                    zE2 = composerKN.E2(measurer2) | composerKN.t(257);
                    Object objIF8 = composerKN.iF();
                    if (!zE2 || objIF8 == companion.n()) {
                        w6Var = new w6(mutableState2, measurer2, constraintSetForInlineDsl, 257, mutableState);
                        mutableState3 = mutableState2;
                        constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                        mutableState4 = mutableState;
                        composerKN.o(w6Var);
                    } else {
                        mutableState3 = mutableState2;
                        constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                        w6Var = objIF8;
                        mutableState4 = mutableState;
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) w6Var;
                    objIF6 = composerKN.iF();
                    if (objIF6 == companion.n()) {
                        objIF6 = new Ml(mutableState4, constraintSetForInlineDsl2);
                        composerKN.o(objIF6);
                    }
                    Function0 function0 = (Function0) objIF6;
                    zE22 = composerKN.E2(measurer2);
                    objIF7 = composerKN.iF();
                    if (!zE22 || objIF7 == companion.n()) {
                        objIF7 = new I28(measurer2);
                        composerKN.o(objIF7);
                    }
                    Modifier modifierNr = SemanticsModifierKt.nr(modifier3, false, (Function1) objIF7, 1, null);
                    z3 = z4;
                    composer2 = composerKN;
                    LayoutKt.n(modifierNr, ComposableLambdaKt.nr(1200550679, true, new Wre(mutableState3, constraintLayoutScope, function0, onClick, title, z4, tagText), composerKN, 54), measurePolicy, composer2, 48, 0);
                    composer2.Xw();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
                final boolean z5 = z3;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    final Modifier modifier4 = modifier3;
                    scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.qz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eO.qie(onClick, title, tagText, modifier4, z5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 24576;
            z3 = z2;
            if ((i5 & 9363) == 9362) {
                if (i8 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                composerKN.eF(-1003410150);
                composerKN.eF(212064437);
                composerKN.Xw();
                Density density2 = (Density) composerKN.ty(CompositionLocalsKt.J2());
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                }
                measurer2 = (Measurer2) objIF;
                objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                }
                ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objIF2;
                objIF3 = composerKN.iF();
                if (objIF3 == companion.n()) {
                }
                mutableState = (MutableState) objIF3;
                objIF4 = composerKN.iF();
                if (objIF4 == companion.n()) {
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objIF4;
                objIF5 = composerKN.iF();
                if (objIF5 == companion.n()) {
                }
                mutableState2 = (MutableState) objIF5;
                zE2 = composerKN.E2(measurer2) | composerKN.t(257);
                Object objIF82 = composerKN.iF();
                if (zE2) {
                    w6Var = new w6(mutableState2, measurer2, constraintSetForInlineDsl, 257, mutableState);
                    mutableState3 = mutableState2;
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    mutableState4 = mutableState;
                    composerKN.o(w6Var);
                    MeasurePolicy measurePolicy2 = (MeasurePolicy) w6Var;
                    objIF6 = composerKN.iF();
                    if (objIF6 == companion.n()) {
                    }
                    Function0 function02 = (Function0) objIF6;
                    zE22 = composerKN.E2(measurer2);
                    objIF7 = composerKN.iF();
                    if (!zE22) {
                        objIF7 = new I28(measurer2);
                        composerKN.o(objIF7);
                        Modifier modifierNr2 = SemanticsModifierKt.nr(modifier3, false, (Function1) objIF7, 1, null);
                        z3 = z4;
                        composer2 = composerKN;
                        LayoutKt.n(modifierNr2, ComposableLambdaKt.nr(1200550679, true, new Wre(mutableState3, constraintLayoutScope2, function02, onClick, title, z4, tagText), composerKN, 54), measurePolicy2, composer2, 48, 0);
                        composer2.Xw();
                        if (ComposerKt.v()) {
                        }
                    }
                }
            }
            final boolean z52 = z3;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        z3 = z2;
        if ((i5 & 9363) == 9362) {
        }
        final boolean z522 = z3;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(Function0 function0, String str, Modifier modifier, String str2, Dj7.CN3 cn3, TextStyle textStyle, int i2, int i3, float f3, Dj7.Dsr dsr, Shape shape, PaddingValues paddingValues, boolean z2, int i5, int i7, int i8, Composer composer, int i9) {
        J2(function0, str, modifier, str2, cn3, textStyle, i2, i3, f3, dsr, shape, paddingValues, z2, composer, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(Function0 function0, String str, String str2, Modifier modifier, boolean z2, int i2, int i3, Composer composer, int i5) {
        gh(function0, str, str2, modifier, z2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(Function0 function0, String str, Modifier modifier, Shape shape, PaddingValues paddingValues, TextStyle textStyle, long j2, TextDecoration textDecoration, int i2, int i3, Composer composer, int i5) {
        az(function0, str, modifier, shape, paddingValues, textStyle, j2, textDecoration, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(Function0 function0, Modifier modifier, float f3, Dj7.Dsr dsr, Shape shape, PaddingValues paddingValues, boolean z2, Function3 function3, int i2, Composer composer, int i3) {
        Uo(function0, modifier, f3, dsr, shape, paddingValues, z2, function3, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final boolean KN(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
