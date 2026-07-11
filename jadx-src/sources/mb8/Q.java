package mb8;

import Dj7.CM;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.compose.ChainStyle;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.LayoutReference;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.internal.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import mb8.Q;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Q {

    static final class CN3 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f70741n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ConstraintSetForInlineDsl f70742t;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1786invoke();
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CN3(MutableState mutableState, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
            super(0);
            this.f70741n = mutableState;
            this.f70742t = constraintSetForInlineDsl;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1786invoke() {
            this.f70741n.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
            this.f70742t.az(true);
        }
    }

    public static final class Dsr extends Lambda implements Function2 {
        final /* synthetic */ long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f70743O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f70744n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f70745o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f70746r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ConstraintLayoutScope f70747t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dsr(MutableState mutableState, ConstraintLayoutScope constraintLayoutScope, Function0 function0, long j2, long j3, int i2) {
            super(2);
            this.f70744n = mutableState;
            this.f70747t = constraintLayoutScope;
            this.f70743O = function0;
            this.J2 = j2;
            this.f70746r = j3;
            this.f70745o = i2;
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
            this.f70744n.setValue(Unit.INSTANCE);
            int helpersHashCode = this.f70747t.getHelpersHashCode();
            this.f70747t.Uo();
            ConstraintLayoutScope constraintLayoutScope = this.f70747t;
            composer.eF(1408979662);
            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesGh = constraintLayoutScope.gh();
            ConstrainedLayoutReference constrainedLayoutReferenceN = constrainedLayoutReferencesGh.n();
            ConstrainedLayoutReference constrainedLayoutReferenceRl = constrainedLayoutReferencesGh.rl();
            ConstrainedLayoutReference constrainedLayoutReferenceT = constrainedLayoutReferencesGh.t();
            String strT = StringResources_androidKt.t(2132019427, composer, 6);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.eF(322550915);
            boolean zP5 = composer.p5(constrainedLayoutReferenceRl) | composer.p5(constrainedLayoutReferenceT);
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new n(constrainedLayoutReferenceRl, constrainedLayoutReferenceT);
                composer.o(objIF);
            }
            composer.Xw();
            float f3 = 12;
            TextKt.t(strT, PaddingKt.az(constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceN, (Function1) objIF), 0.0f, Dp.KN(f3), 0.0f, 0.0f, 13, null), this.J2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).XQ(), composer, 0, 0, 65528);
            String strT2 = StringResources_androidKt.t(2132020038, composer, 6);
            composer.eF(322570470);
            boolean zP52 = composer.p5(constrainedLayoutReferenceN) | composer.p5(constrainedLayoutReferenceT);
            Object objIF2 = composer.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new w6(constrainedLayoutReferenceN, constrainedLayoutReferenceT);
                composer.o(objIF2);
            }
            composer.Xw();
            Modifier modifierAz = PaddingKt.az(constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceRl, (Function1) objIF2), 0.0f, 0.0f, 0.0f, Dp.KN(f3), 7, null);
            composer.eF(322581974);
            IntRange intRange = new IntRange(10, 20);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                arrayList.add(CM.nY(H9N.j.f3810n.rl(composer, 6).ck(), ((IntIterator) it).nextInt() / 20.0f));
            }
            composer.Xw();
            CM.ty(strT2, arrayList, modifierAz, this.f70746r, null, null, 0, false, 4, composer, 100663296, 240);
            constraintLayoutScope.nr(new LayoutReference[]{constrainedLayoutReferenceN, constrainedLayoutReferenceRl}, ChainStyle.INSTANCE.rl());
            Modifier modifierZ = SizeKt.Z(Modifier.INSTANCE, Dp.KN(26));
            composer.eF(322593483);
            Object objIF3 = composer.iF();
            if (objIF3 == Composer.INSTANCE.n()) {
                objIF3 = Ml.f70749n;
                composer.o(objIF3);
            }
            composer.Xw();
            CardKt.n(constraintLayoutScope.xMQ(modifierZ, constrainedLayoutReferenceT, (Function1) objIF3), RoundedCornerShapeKt.t(Dp.KN(13)), Color.INSTANCE.J2(), 0L, null, Dp.KN(0), ComposableLambdaKt.nr(1302016558, true, new I28(this.f70745o), composer, 54), composer, 1769856, 24);
            composer.Xw();
            if (this.f70747t.getHelpersHashCode() != helpersHashCode) {
                EffectsKt.KN(this.f70743O, composer, 6);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class I28 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f70748n;

        I28(int i2) {
            this.f70748n = i2;
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
                ComposerKt.p5(1302016558, i2, -1, "com.alightcreative.monetization.ui.components.switches.EnabledTrialControllerContent.<anonymous>.<anonymous> (TrialController.kt:168)");
            }
            ImageKt.n(PainterResources_androidKt.t(this.f70748n, composer, 0), null, SizeKt.Z(Modifier.INSTANCE, Dp.KN(26)), null, null, 0.0f, null, composer, 432, b.f61769v);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class Ml implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f70749n = new Ml();

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((ConstrainScope) obj);
            return Unit.INSTANCE;
        }

        public final void n(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.n(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.n(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), Dp.KN(20), 0.0f, 4, null);
        }

        Ml() {
        }
    }

    public static final class Wre implements MeasurePolicy {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MutableState f70750O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f70751n;
        final /* synthetic */ int nr;
        final /* synthetic */ Measurer2 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ConstraintSetForInlineDsl f70752t;

        static final class j extends Lambda implements Function1 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Map f70753O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Measurer2 f70754n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f70755t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(Measurer2 measurer2, List list, Map map) {
                super(1);
                this.f70754n = measurer2;
                this.f70755t = list;
                this.f70753O = map;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                this.f70754n.Ik(placementScope, this.f70755t, this.f70753O);
            }
        }

        public Wre(MutableState mutableState, Measurer2 measurer2, ConstraintSetForInlineDsl constraintSetForInlineDsl, int i2, MutableState mutableState2) {
            this.f70751n = mutableState;
            this.rl = measurer2;
            this.f70752t = constraintSetForInlineDsl;
            this.nr = i2;
            this.f70750O = mutableState2;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f70751n.getValue();
            long jR = this.rl.r(j2, measureScope.getLayoutDirection(), this.f70752t, list, linkedHashMap, this.nr);
            this.f70750O.getValue();
            return MeasureScope.ER(measureScope, IntSize.Uo(jR), IntSize.J2(jR), null, new j(this.rl, list, linkedHashMap), 4, null);
        }
    }

    static final class aC implements Function4 {
        final /* synthetic */ long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f70756O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f70757n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f70758o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f70759r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f70760t;

        static final class j implements Function2 {
            final /* synthetic */ int J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ long f70761O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f70762n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ int f70763r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ long f70764t;

            static final class I28 extends Lambda implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Measurer2 f70765n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I28(Measurer2 measurer2) {
                    super(1);
                    this.f70765n = measurer2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((SemanticsPropertyReceiver) obj);
                    return Unit.INSTANCE;
                }

                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    ToolingUtilsKt.n(semanticsPropertyReceiver, this.f70765n);
                }
            }

            static final class Ml extends Lambda implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ MutableState f70766n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ ConstraintSetForInlineDsl f70767t;

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m1787invoke();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ml(MutableState mutableState, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
                    super(0);
                    this.f70766n = mutableState;
                    this.f70767t = constraintSetForInlineDsl;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m1787invoke() {
                    this.f70766n.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                    this.f70767t.az(true);
                }
            }

            public static final class Wre extends Lambda implements Function2 {
                final /* synthetic */ boolean J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Function0 f70768O;

                /* JADX INFO: renamed from: S, reason: collision with root package name */
                final /* synthetic */ int f70769S;

                /* JADX INFO: renamed from: Z, reason: collision with root package name */
                final /* synthetic */ int f70770Z;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ MutableState f70771n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ long f70772o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ long f70773r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ ConstraintLayoutScope f70774t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Wre(MutableState mutableState, ConstraintLayoutScope constraintLayoutScope, Function0 function0, boolean z2, long j2, long j3, int i2, int i3) {
                    super(2);
                    this.f70771n = mutableState;
                    this.f70774t = constraintLayoutScope;
                    this.f70768O = function0;
                    this.J2 = z2;
                    this.f70773r = j2;
                    this.f70772o = j3;
                    this.f70770Z = i2;
                    this.f70769S = i3;
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
                    this.f70771n.setValue(Unit.INSTANCE);
                    int helpersHashCode = this.f70774t.getHelpersHashCode();
                    this.f70774t.Uo();
                    ConstraintLayoutScope constraintLayoutScope = this.f70774t;
                    composer.eF(-256492754);
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesGh = constraintLayoutScope.gh();
                    ConstrainedLayoutReference constrainedLayoutReferenceN = constrainedLayoutReferencesGh.n();
                    ConstrainedLayoutReference constrainedLayoutReferenceRl = constrainedLayoutReferencesGh.rl();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierN = AlphaKt.n(companion, this.J2 ? 1.0f : 0.0f);
                    composer.eF(961564944);
                    Object objIF = composer.iF();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objIF == companion2.n()) {
                        objIF = C1057j.f70775n;
                        composer.o(objIF);
                    }
                    composer.Xw();
                    Q.Uo(constraintLayoutScope.xMQ(modifierN, constrainedLayoutReferenceN, (Function1) objIF), this.f70773r, this.f70772o, this.f70770Z, composer, 0);
                    Modifier modifierN2 = AlphaKt.n(companion, this.J2 ? 0.0f : 1.0f);
                    composer.eF(961582544);
                    Object objIF2 = composer.iF();
                    if (objIF2 == companion2.n()) {
                        objIF2 = n.f70776n;
                        composer.o(objIF2);
                    }
                    composer.Xw();
                    Q.O(constraintLayoutScope.xMQ(modifierN2, constrainedLayoutReferenceRl, (Function1) objIF2), this.f70773r, this.f70772o, this.f70769S, composer, 0);
                    composer.Xw();
                    if (this.f70774t.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.KN(this.f70768O, composer, 6);
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }

            /* JADX INFO: renamed from: mb8.Q$aC$j$j, reason: collision with other inner class name */
            static final class C1057j implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final C1057j f70775n = new C1057j();

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((ConstrainScope) obj);
                    return Unit.INSTANCE;
                }

                public final void n(ConstrainScope constrainAs) {
                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                    HorizontalAnchorable.n(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    HorizontalAnchorable.n(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                }

                C1057j() {
                }
            }

            static final class n implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final n f70776n = new n();

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((ConstrainScope) obj);
                    return Unit.INSTANCE;
                }

                public final void n(ConstrainScope constrainAs) {
                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                    HorizontalAnchorable.n(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    HorizontalAnchorable.n(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                }

                n() {
                }
            }

            public static final class w6 implements MeasurePolicy {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ MutableState f70777O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ MutableState f70778n;
                final /* synthetic */ int nr;
                final /* synthetic */ Measurer2 rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ ConstraintSetForInlineDsl f70779t;

                /* JADX INFO: renamed from: mb8.Q$aC$j$w6$j, reason: collision with other inner class name */
                static final class C1058j extends Lambda implements Function1 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Map f70780O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ Measurer2 f70781n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ List f70782t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1058j(Measurer2 measurer2, List list, Map map) {
                        super(1);
                        this.f70781n = measurer2;
                        this.f70782t = list;
                        this.f70780O = map;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        n((Placeable.PlacementScope) obj);
                        return Unit.INSTANCE;
                    }

                    public final void n(Placeable.PlacementScope placementScope) {
                        this.f70781n.Ik(placementScope, this.f70782t, this.f70780O);
                    }
                }

                public w6(MutableState mutableState, Measurer2 measurer2, ConstraintSetForInlineDsl constraintSetForInlineDsl, int i2, MutableState mutableState2) {
                    this.f70778n = mutableState;
                    this.rl = measurer2;
                    this.f70779t = constraintSetForInlineDsl;
                    this.nr = i2;
                    this.f70777O = mutableState2;
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    this.f70778n.getValue();
                    long jR = this.rl.r(j2, measureScope.getLayoutDirection(), this.f70779t, list, linkedHashMap, this.nr);
                    this.f70777O.getValue();
                    return MeasureScope.ER(measureScope, IntSize.Uo(jR), IntSize.J2(jR), null, new C1058j(this.rl, list, linkedHashMap), 4, null);
                }
            }

            j(boolean z2, long j2, long j3, int i2, int i3) {
                this.f70762n = z2;
                this.f70764t = j2;
                this.f70761O = j3;
                this.J2 = i2;
                this.f70763r = i3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer, int i2) {
                ConstraintSetForInlineDsl constraintSetForInlineDsl;
                MutableState mutableState;
                if ((i2 & 3) == 2 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1562293430, i2, -1, "com.alightcreative.monetization.ui.components.switches.TrialController.<anonymous>.<anonymous> (TrialController.kt:77)");
                }
                boolean z2 = this.f70762n;
                long j2 = this.f70764t;
                long j3 = this.f70761O;
                int i3 = this.J2;
                int i5 = this.f70763r;
                composer.eF(-1003410150);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.eF(212064437);
                composer.Xw();
                Density density = (Density) composer.ty(CompositionLocalsKt.J2());
                Object objIF = composer.iF();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objIF == companion2.n()) {
                    objIF = new Measurer2(density);
                    composer.o(objIF);
                }
                Measurer2 measurer2 = (Measurer2) objIF;
                Object objIF2 = composer.iF();
                if (objIF2 == companion2.n()) {
                    objIF2 = new ConstraintLayoutScope();
                    composer.o(objIF2);
                }
                ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objIF2;
                Object objIF3 = composer.iF();
                if (objIF3 == companion2.n()) {
                    objIF3 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                    composer.o(objIF3);
                }
                MutableState mutableState2 = (MutableState) objIF3;
                Object objIF4 = composer.iF();
                if (objIF4 == companion2.n()) {
                    objIF4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composer.o(objIF4);
                }
                ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objIF4;
                Object objIF5 = composer.iF();
                if (objIF5 == companion2.n()) {
                    objIF5 = SnapshotStateKt.xMQ(Unit.INSTANCE, SnapshotStateKt.gh());
                    composer.o(objIF5);
                }
                MutableState mutableState3 = (MutableState) objIF5;
                boolean zE2 = composer.E2(measurer2) | composer.t(257);
                Object objIF6 = composer.iF();
                if (zE2 || objIF6 == companion2.n()) {
                    objIF6 = new w6(mutableState3, measurer2, constraintSetForInlineDsl2, 257, mutableState2);
                    constraintSetForInlineDsl = constraintSetForInlineDsl2;
                    mutableState = mutableState2;
                    composer.o(objIF6);
                } else {
                    constraintSetForInlineDsl = constraintSetForInlineDsl2;
                    mutableState = mutableState2;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objIF6;
                Object objIF7 = composer.iF();
                if (objIF7 == companion2.n()) {
                    objIF7 = new Ml(mutableState, constraintSetForInlineDsl);
                    composer.o(objIF7);
                }
                Function0 function0 = (Function0) objIF7;
                boolean zE22 = composer.E2(measurer2);
                Object objIF8 = composer.iF();
                if (zE22 || objIF8 == companion2.n()) {
                    objIF8 = new I28(measurer2);
                    composer.o(objIF8);
                }
                LayoutKt.n(SemanticsModifierKt.nr(companion, false, (Function1) objIF8, 1, null), ComposableLambdaKt.nr(1200550679, true, new Wre(mutableState3, constraintLayoutScope, function0, z2, j2, j3, i3, i5), composer, 54), measurePolicy, composer, 48, 0);
                composer.Xw();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        aC(Function0 function0, long j2, long j3, long j4, int i2, int i3) {
            this.f70757n = function0;
            this.f70760t = j2;
            this.f70756O = j3;
            this.J2 = j4;
            this.f70759r = i2;
            this.f70758o = i3;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            rl((AnimatedContentScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(AnimatedContentScope AnimatedContent, boolean z2, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.v()) {
                ComposerKt.p5(90881232, i2, -1, "com.alightcreative.monetization.ui.components.switches.TrialController.<anonymous> (TrialController.kt:71)");
            }
            RoundedCornerShape roundedCornerShapeN = RoundedCornerShapeKt.n(25);
            float fKN = Dp.KN(0);
            composer.eF(-918104279);
            boolean zP5 = composer.p5(this.f70757n);
            final Function0 function0 = this.f70757n;
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: mb8.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Q.aC.t(function0);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            CardKt.rl((Function0) objIF, null, false, roundedCornerShapeN, this.f70760t, 0L, null, fKN, null, ComposableLambdaKt.nr(1562293430, true, new j(z2, this.f70756O, this.J2, this.f70759r, this.f70758o), composer, 54), composer, 817889280, 358);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    static final class fuX extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Measurer2 f70783n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public fuX(Measurer2 measurer2) {
            super(1);
            this.f70783n = measurer2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((SemanticsPropertyReceiver) obj);
            return Unit.INSTANCE;
        }

        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            ToolingUtilsKt.n(semanticsPropertyReceiver, this.f70783n);
        }
    }

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f70784n;

        j(int i2) {
            this.f70784n = i2;
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
                ComposerKt.p5(-1360951944, i2, -1, "com.alightcreative.monetization.ui.components.switches.DisabledTrialControllerContent.<anonymous>.<anonymous> (TrialController.kt:221)");
            }
            IconKt.n(PainterResources_androidKt.t(this.f70784n, composer, 0), null, SizeKt.Z(Modifier.INSTANCE, Dp.KN(26)), 0L, composer, 432, 8);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ConstrainedLayoutReference f70785n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ConstrainedLayoutReference f70786t;

        n(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f70785n = constrainedLayoutReference;
            this.f70786t = constrainedLayoutReference2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((ConstrainScope) obj);
            return Unit.INSTANCE;
        }

        public final void n(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.n(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.n(constrainAs.getBottom(), this.f70785n.getTop(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), Dp.KN(20), 0.0f, 4, null);
            VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), this.f70786t.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), Dp.KN(16), 0.0f, 4, null);
            constrainAs.KN(Dimension.INSTANCE.n());
        }
    }

    static final class w6 implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ConstrainedLayoutReference f70787n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ConstrainedLayoutReference f70788t;

        w6(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f70787n = constrainedLayoutReference;
            this.f70788t = constrainedLayoutReference2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((ConstrainScope) obj);
            return Unit.INSTANCE;
        }

        public final void n(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.n(constrainAs.getTop(), this.f70787n.getBottom(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.n(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), Dp.KN(20), 0.0f, 4, null);
            VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), this.f70788t.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), Dp.KN(16), 0.0f, 4, null);
            constrainAs.KN(Dimension.INSTANCE.n());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(Modifier modifier, long j2, long j3, int i2, int i3, Composer composer, int i5) {
        O(modifier, j2, j3, i2, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(Modifier modifier, long j2, long j3, int i2, int i3, Composer composer, int i5) {
        Uo(modifier, j2, j3, i2, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final Modifier modifier, final long j2, final long j3, final int i2, Composer composer, final int i3) {
        int i5;
        Composer composer2;
        Composer composerKN = composer.KN(154677681);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.nr(j2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.nr(j3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerKN.t(i2) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(154677681, i5, -1, "com.alightcreative.monetization.ui.components.switches.DisabledTrialControllerContent (TrialController.kt:190)");
            }
            Modifier modifierKN = SizeKt.KN(PaddingKt.gh(modifier, Dp.KN(20), 0.0f, 2, null), 0.0f, 1, null);
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Horizontal horizontalJ2 = arrangement.J2();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion.qie(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
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
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierT = rowScopeInstance.t(RowScope.rl(rowScopeInstance, companion3, 1.0f, false, 2, null), companion.xMQ());
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.rl(), companion.gh(), composerKN, 6);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierT);
            Function0 function0N2 = companion2.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N2);
            } else {
                composerKN.r();
            }
            Composer composerN2 = Updater.n(composerKN);
            Updater.O(composerN2, measurePolicyN, companion2.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
            Function2 function2Rl2 = companion2.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            String strT = StringResources_androidKt.t(2132019429, composerKN, 6);
            H9N.j jVar = H9N.j.f3810n;
            TextKt.t(strT, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).XQ(), composerKN, (i5 << 3) & 896, 0, 65530);
            TextKt.t(StringResources_androidKt.t(2132019428, composerKN, 6), null, j3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).Ik(), composerKN, i5 & 896, 0, 65530);
            composerKN.XQ();
            CardKt.n(rowScopeInstance.t(SizeKt.Z(companion3, Dp.KN(26)), companion.xMQ()), RoundedCornerShapeKt.t(Dp.KN(13)), Color.INSTANCE.J2(), 0L, null, Dp.KN(0), ComposableLambdaKt.nr(-1360951944, true, new j(i2), composerKN, 54), composerKN, 1769856, 24);
            composer2 = composerKN;
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: mb8.s4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Q.J2(modifier, j2, j3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(final Modifier modifier, final long j2, final long j3, final int i2, Composer composer, final int i3) {
        int i5;
        long j4;
        int i7;
        ConstraintSetForInlineDsl constraintSetForInlineDsl;
        MutableState mutableState;
        MutableState mutableState2;
        Composer composerKN = composer.KN(1009184744);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            j4 = j2;
            i5 |= composerKN.nr(j4) ? 32 : 16;
        } else {
            j4 = j2;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.nr(j3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i7 = i2;
            i5 |= composerKN.t(i7) ? 2048 : 1024;
        } else {
            i7 = i2;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1009184744, i5, -1, "com.alightcreative.monetization.ui.components.switches.EnabledTrialControllerContent (TrialController.kt:118)");
            }
            Modifier modifierKN = SizeKt.KN(modifier, 0.0f, 1, null);
            composerKN.eF(-1003410150);
            composerKN.eF(212064437);
            composerKN.Xw();
            Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = new Measurer2(density);
                composerKN.o(objIF);
            }
            Measurer2 measurer2 = (Measurer2) objIF;
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new ConstraintLayoutScope();
                composerKN.o(objIF2);
            }
            ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objIF2;
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
                objIF3 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composerKN.o(objIF3);
            }
            MutableState mutableState3 = (MutableState) objIF3;
            Object objIF4 = composerKN.iF();
            if (objIF4 == companion.n()) {
                objIF4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerKN.o(objIF4);
            }
            ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objIF4;
            Object objIF5 = composerKN.iF();
            if (objIF5 == companion.n()) {
                objIF5 = SnapshotStateKt.xMQ(Unit.INSTANCE, SnapshotStateKt.gh());
                composerKN.o(objIF5);
            }
            MutableState mutableState4 = (MutableState) objIF5;
            boolean zE2 = composerKN.E2(measurer2) | composerKN.t(257);
            Object objIF6 = composerKN.iF();
            if (zE2 || objIF6 == companion.n()) {
                objIF6 = new Wre(mutableState4, measurer2, constraintSetForInlineDsl2, 257, mutableState3);
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState3;
                mutableState2 = mutableState4;
                composerKN.o(objIF6);
            } else {
                mutableState2 = mutableState4;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState3;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF6;
            Object objIF7 = composerKN.iF();
            if (objIF7 == companion.n()) {
                objIF7 = new CN3(mutableState, constraintSetForInlineDsl);
                composerKN.o(objIF7);
            }
            Function0 function0 = (Function0) objIF7;
            boolean zE22 = composerKN.E2(measurer2);
            Object objIF8 = composerKN.iF();
            if (zE22 || objIF8 == companion.n()) {
                objIF8 = new fuX(measurer2);
                composerKN.o(objIF8);
            }
            LayoutKt.n(SemanticsModifierKt.nr(modifierKN, false, (Function1) objIF8, 1, null), ComposableLambdaKt.nr(1200550679, true, new Dsr(mutableState2, constraintLayoutScope, function0, j4, j3, i7), composerKN, 54), measurePolicy, composerKN, 48, 0);
            composerKN.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: mb8.UGc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Q.KN(modifier, j2, j3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(boolean z2, Function0 function0, Modifier modifier, long j2, long j3, long j4, int i2, int i3, int i5, int i7, int i8, Composer composer, int i9) {
        xMQ(z2, function0, modifier, j2, j3, j4, i2, i3, i5, composer, RecomposeScopeImplKt.n(i7 | 1), i8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform mUb(int i2, AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.J2(EnterExitTransitionKt.HI(AnimationSpecKt.ty(i2, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.Ik(AnimationSpecKt.ty(i2, 0, null, 6, null), 0.0f, 2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void xMQ(final boolean z2, final Function0 onTrialControllerClicked, Modifier modifier, long j2, long j3, long j4, int i2, int i3, int i5, Composer composer, final int i7, final int i8) {
        int i9;
        Modifier modifier2;
        long j5;
        int i10;
        long j6;
        int i11;
        long j7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Modifier modifier3;
        long jN;
        long jN2;
        long jE;
        int i18;
        int i19;
        final int i20;
        long j9;
        boolean z3;
        Object objIF;
        Composer composer2;
        final int i21;
        final Modifier modifier4;
        final int i22;
        final int i23;
        final long j10;
        final long j11;
        final long j12;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onTrialControllerClicked, "onTrialControllerClicked");
        Composer composerKN = composer.KN(-994206221);
        if ((i8 & 1) != 0) {
            i9 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i9 = (composerKN.n(z2) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i7 & 48) == 0) {
            i9 |= composerKN.E2(onTrialControllerClicked) ? 32 : 16;
        }
        int i24 = i8 & 4;
        if (i24 != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i7 & 3072) != 0) {
                if ((i8 & 8) == 0) {
                    j5 = j2;
                    int i25 = composerKN.nr(j5) ? 2048 : 1024;
                    i9 |= i25;
                } else {
                    j5 = j2;
                }
                i9 |= i25;
            } else {
                j5 = j2;
            }
            i10 = i8 & 16;
            if (i10 == 0) {
                i9 |= 24576;
            } else {
                if ((i7 & 24576) == 0) {
                    j6 = j3;
                    i9 |= composerKN.nr(j6) ? 16384 : 8192;
                }
                i11 = i8 & 32;
                if (i11 != 0) {
                    i9 |= 196608;
                } else {
                    if ((i7 & 196608) == 0) {
                        j7 = j4;
                        i12 = i9 | (composerKN.nr(j7) ? 131072 : 65536);
                    }
                    i13 = i8 & 64;
                    if (i13 == 0) {
                        i12 |= 1572864;
                    } else if ((i7 & 1572864) == 0) {
                        i12 |= composerKN.t(i2) ? 1048576 : 524288;
                    }
                    i14 = i8 & 128;
                    if (i14 != 0) {
                        if ((i7 & 12582912) == 0) {
                            i15 = i14;
                            i12 |= composerKN.t(i3) ? 8388608 : 4194304;
                        }
                        i16 = i8 & 256;
                        if (i16 != 0) {
                            i12 |= 100663296;
                        } else if ((i7 & 100663296) == 0) {
                            i12 |= composerKN.t(i5) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i17 = i12;
                        if ((i17 & 38347923) == 38347922 && composerKN.xMQ()) {
                            composerKN.wTp();
                            long j13 = j5;
                            j12 = j7;
                            j10 = j13;
                            i23 = i2;
                            composer2 = composerKN;
                            modifier4 = modifier2;
                            j11 = j6;
                            i22 = i3;
                            i21 = i5;
                        } else {
                            composerKN.e();
                            if ((i7 & 1) != 0 || composerKN.rV9()) {
                                modifier3 = i24 == 0 ? Modifier.INSTANCE : modifier2;
                                if ((i8 & 8) == 0) {
                                    jN = H9N.j.f3810n.n(composerKN, 6).n();
                                    i17 &= -7169;
                                } else {
                                    jN = j5;
                                }
                                jN2 = i10 == 0 ? aD.w6.N() : j6;
                                jE = i11 == 0 ? aD.w6.e() : j7;
                                i18 = i13 == 0 ? 2131231869 : i2;
                                i19 = i15 == 0 ? 2131231868 : i3;
                                if (i16 == 0) {
                                    i20 = d.f62986a;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    j9 = jE;
                                    ComposerKt.p5(-994206221, i17, -1, "com.alightcreative.monetization.ui.components.switches.TrialController (TrialController.kt:61)");
                                } else {
                                    j9 = jE;
                                }
                                Modifier modifierGh = SizeKt.gh(modifier3, Dp.KN(72), 0.0f, 2, null);
                                Boolean boolValueOf = Boolean.valueOf(z2);
                                composerKN.eF(477386819);
                                z3 = (234881024 & i17) == 67108864;
                                objIF = composerKN.iF();
                                if (z3 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new Function1() { // from class: mb8.l3D
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return Q.mUb(i20, (AnimatedContentTransitionScope) obj);
                                        }
                                    };
                                    composerKN.o(objIF);
                                }
                                composerKN.Xw();
                                long j14 = j9;
                                Modifier modifier5 = modifier3;
                                AnimatedContentKt.rl(boolValueOf, modifierGh, (Function1) objIF, null, "TrialController", null, ComposableLambdaKt.nr(90881232, true, new aC(onTrialControllerClicked, j9, jN, jN2, i19, i18), composerKN, 54), composerKN, (i17 & 14) | 1597440, 40);
                                composer2 = composerKN;
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                i21 = i20;
                                modifier4 = modifier5;
                                i22 = i19;
                                i23 = i18;
                                j10 = jN;
                                j11 = jN2;
                                j12 = j14;
                            } else {
                                composerKN.wTp();
                                if ((i8 & 8) != 0) {
                                    i17 &= -7169;
                                }
                                i19 = i3;
                                jE = j7;
                                modifier3 = modifier2;
                                jN = j5;
                                jN2 = j6;
                                i18 = i2;
                            }
                            i20 = i5;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            Modifier modifierGh2 = SizeKt.gh(modifier3, Dp.KN(72), 0.0f, 2, null);
                            Boolean boolValueOf2 = Boolean.valueOf(z2);
                            composerKN.eF(477386819);
                            if ((234881024 & i17) == 67108864) {
                            }
                            objIF = composerKN.iF();
                            if (z3) {
                                objIF = new Function1() { // from class: mb8.l3D
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Q.mUb(i20, (AnimatedContentTransitionScope) obj);
                                    }
                                };
                                composerKN.o(objIF);
                                composerKN.Xw();
                                long j142 = j9;
                                Modifier modifier52 = modifier3;
                                AnimatedContentKt.rl(boolValueOf2, modifierGh2, (Function1) objIF, null, "TrialController", null, ComposableLambdaKt.nr(90881232, true, new aC(onTrialControllerClicked, j9, jN, jN2, i19, i18), composerKN, 54), composerKN, (i17 & 14) | 1597440, 40);
                                composer2 = composerKN;
                                if (ComposerKt.v()) {
                                }
                                i21 = i20;
                                modifier4 = modifier52;
                                i22 = i19;
                                i23 = i18;
                                j10 = jN;
                                j11 = jN2;
                                j12 = j142;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2() { // from class: mb8.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return Q.gh(z2, onTrialControllerClicked, modifier4, j10, j11, j12, i23, i22, i21, i7, i8, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i12 |= 12582912;
                    i15 = i14;
                    i16 = i8 & 256;
                    if (i16 != 0) {
                    }
                    i17 = i12;
                    if ((i17 & 38347923) == 38347922) {
                        composerKN.e();
                        if ((i7 & 1) != 0) {
                            if (i24 == 0) {
                            }
                            if ((i8 & 8) == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                                i20 = i5;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            Modifier modifierGh22 = SizeKt.gh(modifier3, Dp.KN(72), 0.0f, 2, null);
                            Boolean boolValueOf22 = Boolean.valueOf(z2);
                            composerKN.eF(477386819);
                            if ((234881024 & i17) == 67108864) {
                            }
                            objIF = composerKN.iF();
                            if (z3) {
                            }
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i12 = i9;
                j7 = j4;
                i13 = i8 & 64;
                if (i13 == 0) {
                }
                i14 = i8 & 128;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i8 & 256;
                if (i16 != 0) {
                }
                i17 = i12;
                if ((i17 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            j6 = j3;
            i11 = i8 & 32;
            if (i11 != 0) {
            }
            i12 = i9;
            j7 = j4;
            i13 = i8 & 64;
            if (i13 == 0) {
            }
            i14 = i8 & 128;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i8 & 256;
            if (i16 != 0) {
            }
            i17 = i12;
            if ((i17 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i7 & 3072) != 0) {
        }
        i10 = i8 & 16;
        if (i10 == 0) {
        }
        j6 = j3;
        i11 = i8 & 32;
        if (i11 != 0) {
        }
        i12 = i9;
        j7 = j4;
        i13 = i8 & 64;
        if (i13 == 0) {
        }
        i14 = i8 & 128;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i8 & 256;
        if (i16 != 0) {
        }
        i17 = i12;
        if ((i17 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
