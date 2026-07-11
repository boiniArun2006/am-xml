package nN;

import Dj7.hQ;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f71091n = new j();
    public static Function2 rl = ComposableLambdaKt.rl(466387106, false, C1067j.f71092n);

    /* JADX INFO: renamed from: nN.j$j, reason: collision with other inner class name */
    static final class C1067j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1067j f71092n = new C1067j();

        /* JADX INFO: renamed from: nN.j$j$CN3 */
        public static final class CN3 extends Lambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function0 f71093O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MutableState f71094n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ConstraintLayoutScope f71095t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CN3(MutableState mutableState, ConstraintLayoutScope constraintLayoutScope, Function0 function0) {
                super(2);
                this.f71094n = mutableState;
                this.f71095t = constraintLayoutScope;
                this.f71093O = function0;
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
                this.f71094n.setValue(Unit.INSTANCE);
                int helpersHashCode = this.f71095t.getHelpersHashCode();
                this.f71095t.Uo();
                ConstraintLayoutScope constraintLayoutScope = this.f71095t;
                composer.eF(-1965633649);
                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesGh = constraintLayoutScope.gh();
                ConstrainedLayoutReference constrainedLayoutReferenceN = constrainedLayoutReferencesGh.n();
                ConstrainedLayoutReference constrainedLayoutReferenceRl = constrainedLayoutReferencesGh.rl();
                ConstrainedLayoutReference constrainedLayoutReferenceT = constrainedLayoutReferencesGh.t();
                String strT = StringResources_androidKt.t(2132017602, composer, 6);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierAz = PaddingKt.az(companion, 0.0f, 0.0f, Dp.KN(8), 0.0f, 11, null);
                composer.eF(1183525729);
                Object objIF = composer.iF();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objIF == companion2.n()) {
                    objIF = C1069j.f71105n;
                    composer.o(objIF);
                }
                composer.Xw();
                Modifier modifierXMQ = constraintLayoutScope.xMQ(modifierAz, constrainedLayoutReferenceN, (Function1) objIF);
                H9N.j jVar = H9N.j.f3810n;
                TextKt.t(strT, modifierXMQ, aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).g(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                String strT2 = StringResources_androidKt.t(2132017542, composer, 6);
                composer.eF(1183540369);
                boolean zP5 = composer.p5(constrainedLayoutReferenceN);
                Object objIF2 = composer.iF();
                if (zP5 || objIF2 == companion2.n()) {
                    objIF2 = new n(constrainedLayoutReferenceN);
                    composer.o(objIF2);
                }
                composer.Xw();
                hQ.rl(strT2, constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceT, (Function1) objIF2), PaddingKt.rl(Dp.KN(6), Dp.KN(2)), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                String strT3 = StringResources_androidKt.t(2132017599, composer, 6);
                composer.eF(1183554626);
                boolean zP52 = composer.p5(constrainedLayoutReferenceN);
                Object objIF3 = composer.iF();
                if (zP52 || objIF3 == companion2.n()) {
                    objIF3 = new w6(constrainedLayoutReferenceN);
                    composer.o(objIF3);
                }
                composer.Xw();
                TextKt.t(strT3, constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceRl, (Function1) objIF3), aD.w6.s(), 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).s7N(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65016);
                composer.Xw();
                if (this.f71095t.getHelpersHashCode() != helpersHashCode) {
                    EffectsKt.KN(this.f71093O, composer, 6);
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        /* JADX INFO: renamed from: nN.j$j$I28 */
        static final class I28 extends Lambda implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MutableState f71096n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ConstraintSetForInlineDsl f71097t;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m1788invoke();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public I28(MutableState mutableState, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
                super(0);
                this.f71096n = mutableState;
                this.f71097t = constraintSetForInlineDsl;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m1788invoke() {
                this.f71096n.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                this.f71097t.az(true);
            }
        }

        /* JADX INFO: renamed from: nN.j$j$Ml */
        public static final class Ml implements MeasurePolicy {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ MutableState f71098O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MutableState f71099n;
            final /* synthetic */ int nr;
            final /* synthetic */ Measurer2 rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ConstraintSetForInlineDsl f71100t;

            /* JADX INFO: renamed from: nN.j$j$Ml$j, reason: collision with other inner class name */
            static final class C1068j extends Lambda implements Function1 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Map f71101O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Measurer2 f71102n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ List f71103t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1068j(Measurer2 measurer2, List list, Map map) {
                    super(1);
                    this.f71102n = measurer2;
                    this.f71103t = list;
                    this.f71101O = map;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((Placeable.PlacementScope) obj);
                    return Unit.INSTANCE;
                }

                public final void n(Placeable.PlacementScope placementScope) {
                    this.f71102n.Ik(placementScope, this.f71103t, this.f71101O);
                }
            }

            public Ml(MutableState mutableState, Measurer2 measurer2, ConstraintSetForInlineDsl constraintSetForInlineDsl, int i2, MutableState mutableState2) {
                this.f71099n = mutableState;
                this.rl = measurer2;
                this.f71100t = constraintSetForInlineDsl;
                this.nr = i2;
                this.f71098O = mutableState2;
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.f71099n.getValue();
                long jR = this.rl.r(j2, measureScope.getLayoutDirection(), this.f71100t, list, linkedHashMap, this.nr);
                this.f71098O.getValue();
                return MeasureScope.ER(measureScope, IntSize.Uo(jR), IntSize.J2(jR), null, new C1068j(this.rl, list, linkedHashMap), 4, null);
            }
        }

        /* JADX INFO: renamed from: nN.j$j$Wre */
        static final class Wre extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Measurer2 f71104n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Wre(Measurer2 measurer2) {
                super(1);
                this.f71104n = measurer2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            }

            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                ToolingUtilsKt.n(semanticsPropertyReceiver, this.f71104n);
            }
        }

        /* JADX INFO: renamed from: nN.j$j$j, reason: collision with other inner class name */
        static final class C1069j implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C1069j f71105n = new C1069j();

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), 0.0f, 0.0f, 6, null);
            }

            C1069j() {
            }
        }

        /* JADX INFO: renamed from: nN.j$j$n */
        static final class n implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71106n;

            n(ConstrainedLayoutReference constrainedLayoutReference) {
                this.f71106n = constrainedLayoutReference;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71106n.getTop(), 0.0f, 0.0f, 6, null);
                HorizontalAnchorable.n(constrainAs.getBottom(), this.f71106n.getBottom(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), this.f71106n.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), Dp.KN(8), 0.0f, 4, null);
            }
        }

        /* JADX INFO: renamed from: nN.j$j$w6 */
        static final class w6 implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71107n;

            w6(ConstrainedLayoutReference constrainedLayoutReference) {
                this.f71107n = constrainedLayoutReference;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71107n.getBottom(), Dp.KN(8), 0.0f, 4, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), 0.0f, 0.0f, 6, null);
            }
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
                ComposerKt.p5(466387106, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.optin.ComposableSingletons$CreatorSuspendedCardKt.lambda-1.<anonymous> (CreatorSuspendedCard.kt:28)");
            }
            Modifier modifierKN = SizeKt.KN(PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(16)), 0.0f, 1, null);
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
            Measurer2 measurer2 = (Measurer2) objIF;
            Object objIF2 = composer.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new ConstraintLayoutScope();
                composer.o(objIF2);
            }
            ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objIF2;
            Object objIF3 = composer.iF();
            if (objIF3 == companion.n()) {
                objIF3 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composer.o(objIF3);
            }
            MutableState mutableState = (MutableState) objIF3;
            Object objIF4 = composer.iF();
            if (objIF4 == companion.n()) {
                objIF4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composer.o(objIF4);
            }
            ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objIF4;
            Object objIF5 = composer.iF();
            if (objIF5 == companion.n()) {
                objIF5 = SnapshotStateKt.xMQ(Unit.INSTANCE, SnapshotStateKt.gh());
                composer.o(objIF5);
            }
            MutableState mutableState2 = (MutableState) objIF5;
            boolean zE2 = composer.E2(measurer2) | composer.t(257);
            Object objIF6 = composer.iF();
            if (zE2 || objIF6 == companion.n()) {
                Object ml = new Ml(mutableState2, measurer2, constraintSetForInlineDsl, 257, mutableState);
                composer.o(ml);
                objIF6 = ml;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF6;
            Object objIF7 = composer.iF();
            if (objIF7 == companion.n()) {
                objIF7 = new I28(mutableState, constraintSetForInlineDsl);
                composer.o(objIF7);
            }
            Function0 function0 = (Function0) objIF7;
            boolean zE22 = composer.E2(measurer2);
            Object objIF8 = composer.iF();
            if (zE22 || objIF8 == companion.n()) {
                objIF8 = new Wre(measurer2);
                composer.o(objIF8);
            }
            LayoutKt.n(SemanticsModifierKt.nr(modifierKN, false, (Function1) objIF8, 1, null), ComposableLambdaKt.nr(1200550679, true, new CN3(mutableState2, constraintLayoutScope, function0), composer, 54), measurePolicy, composer, 48, 0);
            composer.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C1067j() {
        }
    }

    public final Function2 n() {
        return rl;
    }
}
