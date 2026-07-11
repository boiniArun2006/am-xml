package E;

import Dj7.CM;
import E.qz;
import a.C1498j;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.SurfaceKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import com.alightcreative.template.importpreview.ui.C;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f2182n = Dp.KN(16);
    private static final float rl = Dp.KN(12);

    static final class j implements Function2 {
        final /* synthetic */ MutableState E2;
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f2183O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Function0 f2184S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function0 f2185Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ State f2186e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ C1498j f2187g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f2188n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f2189o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f2190r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C.j f2191t;

        /* JADX INFO: renamed from: E.qz$j$j, reason: collision with other inner class name */
        static final class C0073j implements Function3 {
            final /* synthetic */ State E2;
            final /* synthetic */ Function0 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function0 f2192O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ C1498j f2193S;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ Function0 f2194Z;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ MutableState f2195g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ C.j f2196n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Function0 f2197o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Function1 f2198r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function0 f2199t;

            /* JADX INFO: renamed from: E.qz$j$j$C */
            public static final class C implements MeasurePolicy {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ MutableState f2200O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ MutableState f2201n;
                final /* synthetic */ int nr;
                final /* synthetic */ Measurer2 rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ ConstraintSetForInlineDsl f2202t;

                /* JADX INFO: renamed from: E.qz$j$j$C$j, reason: collision with other inner class name */
                static final class C0074j extends Lambda implements Function1 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Map f2203O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ Measurer2 f2204n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ List f2205t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0074j(Measurer2 measurer2, List list, Map map) {
                        super(1);
                        this.f2204n = measurer2;
                        this.f2205t = list;
                        this.f2203O = map;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        n((Placeable.PlacementScope) obj);
                        return Unit.INSTANCE;
                    }

                    public final void n(Placeable.PlacementScope placementScope) {
                        this.f2204n.Ik(placementScope, this.f2205t, this.f2203O);
                    }
                }

                public C(MutableState mutableState, Measurer2 measurer2, ConstraintSetForInlineDsl constraintSetForInlineDsl, int i2, MutableState mutableState2) {
                    this.f2201n = mutableState;
                    this.rl = measurer2;
                    this.f2202t = constraintSetForInlineDsl;
                    this.nr = i2;
                    this.f2200O = mutableState2;
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    this.f2201n.getValue();
                    long jR = this.rl.r(j2, measureScope.getLayoutDirection(), this.f2202t, list, linkedHashMap, this.nr);
                    this.f2200O.getValue();
                    return MeasureScope.ER(measureScope, IntSize.Uo(jR), IntSize.J2(jR), null, new C0074j(this.rl, list, linkedHashMap), 4, null);
                }
            }

            /* JADX INFO: renamed from: E.qz$j$j$CN3 */
            /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function0 {
                CN3(Object obj) {
                    super(0, obj, C1498j.class, "onDragStart", "onDragStart()V", 0);
                }

                public final void n() {
                    ((C1498j) this.receiver).gh();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    n();
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: E.qz$j$j$Dsr */
            static final class Dsr implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ ConstrainedLayoutReference f2206n;

                Dsr(ConstrainedLayoutReference constrainedLayoutReference) {
                    this.f2206n = constrainedLayoutReference;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((ConstrainScope) obj);
                    return Unit.INSTANCE;
                }

                public final void n(ConstrainScope constrainAs) {
                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                    HorizontalAnchorable.n(constrainAs.getBottom(), this.f2206n.getTop(), 0.0f, 0.0f, 6, null);
                    VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), qz.f2182n, 0.0f, 4, null);
                }
            }

            /* JADX INFO: renamed from: E.qz$j$j$I28 */
            /* synthetic */ class I28 extends FunctionReferenceImpl implements Function1 {
                I28(Object obj) {
                    super(1, obj, C1498j.class, "updateProgressOnInput", "updateProgressOnInput(F)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n(((Number) obj).floatValue());
                    return Unit.INSTANCE;
                }

                public final void n(float f3) {
                    ((C1498j) this.receiver).o(f3);
                }
            }

            /* JADX INFO: renamed from: E.qz$j$j$Ml */
            /* synthetic */ class Ml extends FunctionReferenceImpl implements Function1 {
                Ml(Object obj) {
                    super(1, obj, C1498j.class, "updatePlayerWidthPx", "updatePlayerWidthPx(I)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n(((Number) obj).intValue());
                    return Unit.INSTANCE;
                }

                public final void n(int i2) {
                    ((C1498j) this.receiver).r(i2);
                }
            }

            /* JADX INFO: renamed from: E.qz$j$j$Pl */
            public static final class Pl extends Lambda implements Function2 {
                final /* synthetic */ C1498j E2;
                final /* synthetic */ C.j J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Function0 f2207O;

                /* JADX INFO: renamed from: S, reason: collision with root package name */
                final /* synthetic */ Function0 f2208S;

                /* JADX INFO: renamed from: X, reason: collision with root package name */
                final /* synthetic */ MutableState f2209X;

                /* JADX INFO: renamed from: Z, reason: collision with root package name */
                final /* synthetic */ Function1 f2210Z;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function0 f2211e;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function0 f2212g;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ MutableState f2213n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ float f2214o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Function0 f2215r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ ConstraintLayoutScope f2216t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Pl(MutableState mutableState, ConstraintLayoutScope constraintLayoutScope, Function0 function0, C.j jVar, Function0 function02, float f3, Function1 function1, Function0 function03, Function0 function04, C1498j c1498j, Function0 function05, MutableState mutableState2) {
                    super(2);
                    this.f2213n = mutableState;
                    this.f2216t = constraintLayoutScope;
                    this.f2207O = function0;
                    this.J2 = jVar;
                    this.f2215r = function02;
                    this.f2214o = f3;
                    this.f2210Z = function1;
                    this.f2208S = function03;
                    this.f2212g = function04;
                    this.E2 = c1498j;
                    this.f2211e = function05;
                    this.f2209X = mutableState2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    n((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer, int i2) {
                    Modifier modifier;
                    TextureCropMode textureCropModeNr;
                    ConstraintLayoutScope constraintLayoutScope;
                    ConstrainedLayoutReference constrainedLayoutReference;
                    if ((i2 & 3) == 2 && composer.xMQ()) {
                        composer.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1200550679, i2, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    this.f2213n.setValue(Unit.INSTANCE);
                    int helpersHashCode = this.f2216t.getHelpersHashCode();
                    this.f2216t.Uo();
                    ConstraintLayoutScope constraintLayoutScope2 = this.f2216t;
                    composer.eF(-131734378);
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesGh = constraintLayoutScope2.gh();
                    ConstrainedLayoutReference constrainedLayoutReferenceN = constrainedLayoutReferencesGh.n();
                    ConstrainedLayoutReference constrainedLayoutReferenceRl = constrainedLayoutReferencesGh.rl();
                    ConstrainedLayoutReference constrainedLayoutReferenceT = constrainedLayoutReferencesGh.t();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.eF(1242677432);
                    boolean zP5 = composer.p5(constrainedLayoutReferenceRl);
                    Object objIF = composer.iF();
                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = new C0075j(constrainedLayoutReferenceRl);
                        composer.o(objIF);
                    }
                    composer.Xw();
                    Modifier modifierXMQ = constraintLayoutScope2.xMQ(companion, constrainedLayoutReferenceT, (Function1) objIF);
                    Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composer, 0);
                    int iN = ComposablesKt.n(composer, 0);
                    CompositionLocalMap compositionLocalMapIk = composer.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer, modifierXMQ);
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
                    E.fuX.t(SizeKt.KN(SizeKt.xMQ(PaddingKt.xMQ(companion, qz.f2182n), Dp.KN(56)), 0.0f, 1, null), this.f2208S, this.f2212g, composer, 6, 0);
                    Si.o oVarNr = this.E2.nr();
                    boolean zXMQ = this.E2.xMQ();
                    composer.eF(-1496258455);
                    boolean zP52 = composer.p5(this.E2);
                    Object objIF2 = composer.iF();
                    if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new n(this.E2);
                        composer.o(objIF2);
                    }
                    composer.Xw();
                    Function0 function0 = (Function0) ((KFunction) objIF2);
                    Modifier modifierXMQ2 = PaddingKt.xMQ(columnScopeInstance.n(SizeKt.xMQ(companion, this.f2214o), 1.0f, false), qz.f2182n);
                    Integer numRl = this.J2.rl();
                    if (numRl != null) {
                        zd.Ml ml = (zd.Ml) this.J2.n().get(numRl.intValue());
                        modifier = modifierXMQ2;
                        textureCropModeNr = !Intrinsics.areEqual(ml.t(), ml.O()) ? ml.nr() : null;
                    } else {
                        modifier = modifierXMQ2;
                        textureCropModeNr = null;
                    }
                    s.Wre.J2(oVarNr, zXMQ, function0, modifier, textureCropModeNr, this.f2211e, composer, 0, 0);
                    composer.eF(-1496235779);
                    Object objIF3 = composer.iF();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objIF3 == companion4.n()) {
                        objIF3 = new w6(this.f2209X);
                        composer.o(objIF3);
                    }
                    composer.Xw();
                    float f3 = 12;
                    SpacerKt.n(SizeKt.xMQ(OnGloballyPositionedModifierKt.n(companion, (Function1) objIF3), Dp.KN(f3)), composer, 6);
                    Modifier modifierGh = PaddingKt.gh(companion, qz.f2182n, 0.0f, 2, null);
                    boolean zXMQ2 = this.E2.xMQ();
                    composer.eF(-1496223447);
                    boolean zP53 = composer.p5(this.E2);
                    Object objIF4 = composer.iF();
                    if (zP53 || objIF4 == companion4.n()) {
                        objIF4 = new Ml(this.E2);
                        composer.o(objIF4);
                    }
                    composer.Xw();
                    Function1 function1 = (Function1) ((KFunction) objIF4);
                    composer.eF(-1496221109);
                    boolean zP54 = composer.p5(this.E2);
                    Object objIF5 = composer.iF();
                    if (zP54 || objIF5 == companion4.n()) {
                        objIF5 = new I28(this.E2);
                        composer.o(objIF5);
                    }
                    composer.Xw();
                    Function1 function12 = (Function1) ((KFunction) objIF5);
                    composer.eF(-1496218618);
                    boolean zP55 = composer.p5(this.E2);
                    Object objIF6 = composer.iF();
                    if (zP55 || objIF6 == companion4.n()) {
                        objIF6 = new Wre(this.E2);
                        composer.o(objIF6);
                    }
                    composer.Xw();
                    Function1 function13 = (Function1) ((KFunction) objIF6);
                    long jNO = aD.w6.nO();
                    composer.eF(-1496214527);
                    boolean zP56 = composer.p5(this.E2);
                    Object objIF7 = composer.iF();
                    if (zP56 || objIF7 == companion4.n()) {
                        objIF7 = new CN3(this.E2);
                        composer.o(objIF7);
                    }
                    composer.Xw();
                    Function0 function02 = (Function0) ((KFunction) objIF7);
                    composer.eF(-1496212641);
                    boolean zP57 = composer.p5(this.E2);
                    Object objIF8 = composer.iF();
                    if (zP57 || objIF8 == companion4.n()) {
                        objIF8 = new fuX(this.E2);
                        composer.o(objIF8);
                    }
                    composer.Xw();
                    s.o.J2(modifierGh, zXMQ2, function1, function12, function13, jNO, function02, (Function0) ((KFunction) objIF8), false, composer, 196614, 256);
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(24)), composer, 6);
                    CM.ty(StringResources_androidKt.t(2132020311, composer, 6), CollectionsKt.listOf(H9N.j.f3810n.rl(composer, 6).te()), columnScopeInstance.t(PaddingKt.gh(companion, Dp.KN(16), 0.0f, 2, null), companion2.gh()), 0L, null, null, 0, false, 0, composer, 0, 504);
                    composer.XQ();
                    composer.eF(1242765466);
                    if (this.J2.nr()) {
                        g9s.nr(composer, 0);
                        Function0 function03 = this.f2215r;
                        composer.eF(1242774198);
                        constrainedLayoutReference = constrainedLayoutReferenceRl;
                        boolean zP58 = composer.p5(constrainedLayoutReference);
                        Object objIF9 = composer.iF();
                        if (zP58 || objIF9 == companion4.n()) {
                            objIF9 = new Dsr(constrainedLayoutReference);
                            composer.o(objIF9);
                        }
                        composer.Xw();
                        constraintLayoutScope = constraintLayoutScope2;
                        g9s.Uo(function03, constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceN, (Function1) objIF9), composer, 0, 0);
                    } else {
                        constraintLayoutScope = constraintLayoutScope2;
                        constrainedLayoutReference = constrainedLayoutReferenceRl;
                    }
                    composer.Xw();
                    List listN = this.J2.n();
                    float fKN = Dp.KN(Dp.KN(Dp.KN(this.f2214o - qz.f2182n) - Dp.KN(qz.rl * 3)) / 3.25f);
                    Integer numRl2 = this.J2.rl();
                    Function1 function14 = this.f2210Z;
                    float f4 = qz.rl;
                    float f5 = qz.f2182n;
                    composer.eF(1242801287);
                    Object objIF10 = composer.iF();
                    if (objIF10 == companion4.n()) {
                        objIF10 = aC.f2217n;
                        composer.o(objIF10);
                    }
                    composer.Xw();
                    Q.t(listN, fKN, numRl2, function14, f4, f5, SizeKt.KN(PaddingKt.az(constraintLayoutScope.xMQ(companion, constrainedLayoutReference, (Function1) objIF10), 0.0f, Dp.KN(f3), 0.0f, 0.0f, 13, null), 0.0f, 1, null), composer, 221184, 0);
                    composer.Xw();
                    if (this.f2216t.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.KN(this.f2207O, composer, 6);
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }

            /* JADX INFO: renamed from: E.qz$j$j$Wre */
            /* synthetic */ class Wre extends FunctionReferenceImpl implements Function1 {
                Wre(Object obj) {
                    super(1, obj, C1498j.class, "updatePlayerView", "updatePlayerView(Landroid/view/View;)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((View) obj);
                    return Unit.INSTANCE;
                }

                public final void n(View p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    ((C1498j) this.receiver).te(p0);
                }
            }

            /* JADX INFO: renamed from: E.qz$j$j$aC */
            static final class aC implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final aC f2217n = new aC();

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((ConstrainScope) obj);
                    return Unit.INSTANCE;
                }

                public final void n(ConstrainScope constrainAs) {
                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                    HorizontalAnchorable.n(constrainAs.getBottom(), constrainAs.getParent().getBottom(), qz.f2182n, 0.0f, 4, null);
                    constrainAs.Uo(ConstraintLayoutKt.qie(Dimension.INSTANCE.n()));
                }

                aC() {
                }
            }

            /* JADX INFO: renamed from: E.qz$j$j$fuX */
            /* synthetic */ class fuX extends FunctionReferenceImpl implements Function0 {
                fuX(Object obj) {
                    super(0, obj, C1498j.class, "onDragEnd", "onDragEnd()V", 0);
                }

                public final void n() {
                    ((C1498j) this.receiver).mUb();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    n();
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: E.qz$j$j$j, reason: collision with other inner class name */
            static final class C0075j implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ ConstrainedLayoutReference f2218n;

                C0075j(ConstrainedLayoutReference constrainedLayoutReference) {
                    this.f2218n = constrainedLayoutReference;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((ConstrainScope) obj);
                    return Unit.INSTANCE;
                }

                public final void n(ConstrainScope constrainAs) {
                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                    HorizontalAnchorable.n(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    HorizontalAnchorable.n(constrainAs.getBottom(), this.f2218n.getTop(), 0.0f, 0.0f, 6, null);
                    constrainAs.Uo(Dimension.INSTANCE.rl());
                }
            }

            /* JADX INFO: renamed from: E.qz$j$j$n */
            /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
                n(Object obj) {
                    super(0, obj, C1498j.class, "onPlayButtonClicked", "onPlayButtonClicked()V", 0);
                }

                public final void n() {
                    ((C1498j) this.receiver).qie();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    n();
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: E.qz$j$j$o */
            static final class o extends Lambda implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ MutableState f2219n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ ConstraintSetForInlineDsl f2220t;

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3invoke();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o(MutableState mutableState, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
                    super(0);
                    this.f2219n = mutableState;
                    this.f2220t = constraintSetForInlineDsl;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3invoke() {
                    this.f2219n.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                    this.f2220t.az(true);
                }
            }

            /* JADX INFO: renamed from: E.qz$j$j$qz, reason: collision with other inner class name */
            static final class C0076qz extends Lambda implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Measurer2 f2221n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0076qz(Measurer2 measurer2) {
                    super(1);
                    this.f2221n = measurer2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((SemanticsPropertyReceiver) obj);
                    return Unit.INSTANCE;
                }

                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    ToolingUtilsKt.n(semanticsPropertyReceiver, this.f2221n);
                }
            }

            /* JADX INFO: renamed from: E.qz$j$j$w6 */
            static final class w6 implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ MutableState f2222n;

                w6(MutableState mutableState) {
                    this.f2222n = mutableState;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((LayoutCoordinates) obj);
                    return Unit.INSTANCE;
                }

                public final void n(LayoutCoordinates it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.f2222n.setValue(Float.valueOf(Float.intBitsToFloat((int) (LayoutCoordinatesKt.J2(it) & 4294967295L))));
                }
            }

            C0073j(C.j jVar, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function0 function04, Function0 function05, C1498j c1498j, MutableState mutableState, State state) {
                this.f2196n = jVar;
                this.f2199t = function0;
                this.f2192O = function02;
                this.J2 = function03;
                this.f2198r = function1;
                this.f2197o = function04;
                this.f2194Z = function05;
                this.f2193S = c1498j;
                this.f2195g = mutableState;
                this.E2 = state;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                n((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void n(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
                int i3;
                Function0 function0;
                Measurer2 measurer2;
                ConstraintSetForInlineDsl constraintSetForInlineDsl;
                MutableState mutableState;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.p5(BoxWithConstraints) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i3 & 19) == 18 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1597827244, i3, -1, "com.alightcreative.template.importpreview.ui.components.TemplateImportPreviewContent.<anonymous>.<anonymous> (TemplateImportPreviewContent.kt:71)");
                }
                float fT = BoxWithConstraints.t();
                Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
                C.j jVar = this.f2196n;
                Function0 function02 = this.J2;
                Function1 function1 = this.f2198r;
                Function0 function03 = this.f2197o;
                Function0 function04 = this.f2194Z;
                C1498j c1498j = this.f2193S;
                Function0 function05 = this.f2192O;
                MutableState mutableState2 = this.f2195g;
                composer.eF(-1003410150);
                composer.eF(212064437);
                composer.Xw();
                Density density = (Density) composer.ty(CompositionLocalsKt.J2());
                Object objIF = composer.iF();
                Composer.Companion companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                    objIF = new Measurer2(density);
                    composer.o(objIF);
                }
                Measurer2 measurer22 = (Measurer2) objIF;
                Object objIF2 = composer.iF();
                if (objIF2 == companion.n()) {
                    objIF2 = new ConstraintLayoutScope();
                    composer.o(objIF2);
                }
                ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objIF2;
                Object objIF3 = composer.iF();
                if (objIF3 == companion.n()) {
                    function0 = function03;
                    objIF3 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                    composer.o(objIF3);
                } else {
                    function0 = function03;
                }
                MutableState mutableState3 = (MutableState) objIF3;
                Object objIF4 = composer.iF();
                if (objIF4 == companion.n()) {
                    objIF4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composer.o(objIF4);
                }
                ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objIF4;
                Object objIF5 = composer.iF();
                if (objIF5 == companion.n()) {
                    objIF5 = SnapshotStateKt.xMQ(Unit.INSTANCE, SnapshotStateKt.gh());
                    composer.o(objIF5);
                }
                MutableState mutableState4 = (MutableState) objIF5;
                boolean zE2 = composer.E2(measurer22) | composer.t(257);
                Object objIF6 = composer.iF();
                if (zE2 || objIF6 == companion.n()) {
                    objIF6 = new C(mutableState4, measurer22, constraintSetForInlineDsl2, 257, mutableState3);
                    measurer2 = measurer22;
                    constraintSetForInlineDsl = constraintSetForInlineDsl2;
                    mutableState = mutableState3;
                    composer.o(objIF6);
                } else {
                    measurer2 = measurer22;
                    constraintSetForInlineDsl = constraintSetForInlineDsl2;
                    mutableState = mutableState3;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objIF6;
                Object objIF7 = composer.iF();
                if (objIF7 == companion.n()) {
                    objIF7 = new o(mutableState, constraintSetForInlineDsl);
                    composer.o(objIF7);
                }
                Function0 function06 = (Function0) objIF7;
                boolean zE22 = composer.E2(measurer2);
                Object objIF8 = composer.iF();
                if (zE22 || objIF8 == companion.n()) {
                    objIF8 = new C0076qz(measurer2);
                    composer.o(objIF8);
                }
                LayoutKt.n(SemanticsModifierKt.nr(modifierJ2, false, (Function1) objIF8, 1, null), ComposableLambdaKt.nr(1200550679, true, new Pl(mutableState4, constraintLayoutScope, function06, jVar, function02, fT, function1, function0, function04, c1498j, function05, mutableState2), composer, 54), measurePolicy, composer, 48, 0);
                composer.Xw();
                if (this.f2196n.t()) {
                    E.w6.rl(this.f2199t, this.f2192O, qz.Uo(this.E2), composer, 0);
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j(MutableState mutableState, C.j jVar, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function0 function04, Function0 function05, C1498j c1498j, MutableState mutableState2, State state) {
            this.f2188n = mutableState;
            this.f2191t = jVar;
            this.f2183O = function0;
            this.J2 = function02;
            this.f2190r = function03;
            this.f2189o = function1;
            this.f2185Z = function04;
            this.f2184S = function05;
            this.f2187g = c1498j;
            this.E2 = mutableState2;
            this.f2186e = state;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(MutableState mutableState, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            mutableState.setValue(Offset.nr(LayoutCoordinatesKt.J2(it)));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1454434090, i2, -1, "com.alightcreative.template.importpreview.ui.components.TemplateImportPreviewContent.<anonymous> (TemplateImportPreviewContent.kt:66)");
            }
            Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
            composer.eF(-1397574144);
            final MutableState mutableState = this.f2188n;
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: E.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qz.j.t(mutableState, (LayoutCoordinates) obj);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            BoxWithConstraintsKt.n(OnGloballyPositionedModifierKt.n(modifierJ2, (Function1) objIF), null, false, ComposableLambdaKt.nr(1597827244, true, new C0073j(this.f2191t, this.f2183O, this.J2, this.f2190r, this.f2189o, this.f2185Z, this.f2184S, this.f2187g, this.E2, this.f2186e), composer, 54), composer, 3078, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(C.j jVar, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i2, Composer composer, int i3) {
        nr(jVar, function1, function0, function02, function03, function04, function05, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void nr(final C.j viewState, final Function1 onMediaClicked, final Function0 onCloseButtonClicked, final Function0 onEditButtonClicked, final Function0 onReplaceMediaTooltipDismissed, final Function0 onTextureCropButtonClicked, final Function0 onCropTooltipDismissed, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onMediaClicked, "onMediaClicked");
        Intrinsics.checkNotNullParameter(onCloseButtonClicked, "onCloseButtonClicked");
        Intrinsics.checkNotNullParameter(onEditButtonClicked, "onEditButtonClicked");
        Intrinsics.checkNotNullParameter(onReplaceMediaTooltipDismissed, "onReplaceMediaTooltipDismissed");
        Intrinsics.checkNotNullParameter(onTextureCropButtonClicked, "onTextureCropButtonClicked");
        Intrinsics.checkNotNullParameter(onCropTooltipDismissed, "onCropTooltipDismissed");
        Composer composerKN = composer.KN(-1964074606);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(viewState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onMediaClicked) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onCloseButtonClicked) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onEditButtonClicked) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onReplaceMediaTooltipDismissed) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(onTextureCropButtonClicked) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(onCropTooltipDismissed) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1964074606, i3, -1, "com.alightcreative.template.importpreview.ui.components.TemplateImportPreviewContent (TemplateImportPreviewContent.kt:46)");
            }
            C1498j c1498jO = viewState.O();
            final Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
            composerKN.eF(2013708251);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                MutableState mutableStateO = SnapshotStateKt__SnapshotStateKt.O(Offset.nr(Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L))), null, 2, null);
                composerKN.o(mutableStateO);
                objIF = mutableStateO;
            }
            final MutableState mutableState = (MutableState) objIF;
            composerKN.Xw();
            composerKN.eF(2013710505);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotStateKt.O(new Function0() { // from class: E.Dsr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(qz.O(mutableState));
                    }
                });
                composerKN.o(objIF2);
            }
            final State state = (State) objIF2;
            composerKN.Xw();
            composerKN.eF(2013713295);
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
                objIF3 = SnapshotStateKt__SnapshotStateKt.O(Float.valueOf(0.0f), null, 2, null);
                composerKN.o(objIF3);
            }
            final MutableState mutableState2 = (MutableState) objIF3;
            composerKN.Xw();
            composerKN.eF(2013715095);
            Object objIF4 = composerKN.iF();
            if (objIF4 == companion.n()) {
                objIF4 = SnapshotStateKt.O(new Function0() { // from class: E.aC
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qz.J2(density, mutableState2, state);
                    }
                });
                composerKN.o(objIF4);
            }
            composerKN.Xw();
            composer2 = composerKN;
            SurfaceKt.n(WindowInsetsPadding_androidKt.O(BackgroundKt.nr(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), aD.w6.nO(), null, 2, null)), null, 0L, aD.w6.EF(), null, 0.0f, ComposableLambdaKt.nr(-1454434090, true, new j(mutableState, viewState, onCropTooltipDismissed, onTextureCropButtonClicked, onReplaceMediaTooltipDismissed, onMediaClicked, onCloseButtonClicked, onEditButtonClicked, c1498jO, mutableState2, (State) objIF4), composerKN, 54), composer2, 1575936, 54);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: E.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.KN(viewState, onMediaClicked, onCloseButtonClicked, onEditButtonClicked, onReplaceMediaTooltipDismissed, onTextureCropButtonClicked, onCropTooltipDismissed, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp J2(Density density, MutableState mutableState, State state) {
        return Dp.nr(Dp.KN(Dp.KN(Dp.KN(Dp.KN(density.bzg(((Number) mutableState.getValue()).floatValue()) - f2182n) - Dp.KN(40)) - Dp.KN(16)) - density.bzg(((Number) state.getValue()).floatValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float O(MutableState mutableState) {
        return Float.intBitsToFloat((int) (((Offset) mutableState.getValue()).getPackedValue() & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Uo(State state) {
        return ((Dp) state.getValue()).getValue();
    }
}
