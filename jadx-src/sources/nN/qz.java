package nN;

import Dj7.hQ;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
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
import com.safedk.android.analytics.brandsafety.b;
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
public abstract class qz {

    static final class j implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f71117O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f71118n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f71119t;

        static final class C implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71120n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71121t;

            C(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
                this.f71120n = constrainedLayoutReference;
                this.f71121t = constrainedLayoutReference2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71120n.getBottom(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), this.f71120n.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), this.f71120n.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), 0.0f, 0.0f, 6, null);
                HorizontalAnchorable.n(constrainAs.getBottom(), this.f71121t.getTop(), 0.0f, 0.0f, 6, null);
                constrainAs.Uo(Dimension.INSTANCE.n());
            }
        }

        static final class CN3 implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71122n;

            CN3(ConstrainedLayoutReference constrainedLayoutReference) {
                this.f71122n = constrainedLayoutReference;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71122n.getBottom(), Dp.KN(18), 0.0f, 4, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), 0.0f, 0.0f, 6, null);
            }
        }

        static final class Dsr implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71123n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71124t;

            Dsr(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
                this.f71123n = constrainedLayoutReference;
                this.f71124t = constrainedLayoutReference2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71123n.getBottom(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), this.f71123n.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), this.f71123n.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), 0.0f, 0.0f, 6, null);
                HorizontalAnchorable.n(constrainAs.getBottom(), this.f71124t.getTop(), 0.0f, 0.0f, 6, null);
                constrainAs.Uo(Dimension.INSTANCE.n());
            }
        }

        static final class I28 implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71125n;

            I28(ConstrainedLayoutReference constrainedLayoutReference) {
                this.f71125n = constrainedLayoutReference;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71125n.getBottom(), Dp.KN(8), 0.0f, 4, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), 0.0f, 0.0f, 6, null);
            }
        }

        static final class Ml implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71126n;

            Ml(ConstrainedLayoutReference constrainedLayoutReference) {
                this.f71126n = constrainedLayoutReference;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71126n.getBottom(), Dp.KN(24), 0.0f, 4, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), 0.0f, 0.0f, 6, null);
                constrainAs.KN(Dimension.INSTANCE.n());
            }
        }

        public static final class Pl implements MeasurePolicy {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ MutableState f71127O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MutableState f71128n;
            final /* synthetic */ int nr;
            final /* synthetic */ Measurer2 rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ConstraintSetForInlineDsl f71129t;

            /* JADX INFO: renamed from: nN.qz$j$Pl$j, reason: collision with other inner class name */
            static final class C1070j extends Lambda implements Function1 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Map f71130O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Measurer2 f71131n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ List f71132t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1070j(Measurer2 measurer2, List list, Map map) {
                    super(1);
                    this.f71131n = measurer2;
                    this.f71132t = list;
                    this.f71130O = map;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((Placeable.PlacementScope) obj);
                    return Unit.INSTANCE;
                }

                public final void n(Placeable.PlacementScope placementScope) {
                    this.f71131n.Ik(placementScope, this.f71132t, this.f71130O);
                }
            }

            public Pl(MutableState mutableState, Measurer2 measurer2, ConstraintSetForInlineDsl constraintSetForInlineDsl, int i2, MutableState mutableState2) {
                this.f71128n = mutableState;
                this.rl = measurer2;
                this.f71129t = constraintSetForInlineDsl;
                this.nr = i2;
                this.f71127O = mutableState2;
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.f71128n.getValue();
                long jR = this.rl.r(j2, measureScope.getLayoutDirection(), this.f71129t, list, linkedHashMap, this.nr);
                this.f71127O.getValue();
                return MeasureScope.ER(measureScope, IntSize.Uo(jR), IntSize.J2(jR), null, new C1070j(this.rl, list, linkedHashMap), 4, null);
            }
        }

        static final class Wre implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71133n;

            Wre(ConstrainedLayoutReference constrainedLayoutReference) {
                this.f71133n = constrainedLayoutReference;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71133n.getBottom(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), 0.0f, 0.0f, 6, null);
            }
        }

        static final class Xo extends Lambda implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MutableState f71134n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ConstraintSetForInlineDsl f71135t;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m1789invoke();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Xo(MutableState mutableState, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
                super(0);
                this.f71134n = mutableState;
                this.f71135t = constraintSetForInlineDsl;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m1789invoke() {
                this.f71134n.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                this.f71135t.az(true);
            }
        }

        static final class aC implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71136n;

            aC(ConstrainedLayoutReference constrainedLayoutReference) {
                this.f71136n = constrainedLayoutReference;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71136n.getTop(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), Dp.KN(7), 0.0f, 4, null);
                HorizontalAnchorable.n(constrainAs.getBottom(), this.f71136n.getBottom(), 0.0f, 0.0f, 6, null);
            }
        }

        static final class eO extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Measurer2 f71137n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public eO(Measurer2 measurer2) {
                super(1);
                this.f71137n = measurer2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            }

            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                ToolingUtilsKt.n(semanticsPropertyReceiver, this.f71137n);
            }
        }

        static final class fuX implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71138n;

            fuX(ConstrainedLayoutReference constrainedLayoutReference) {
                this.f71138n = constrainedLayoutReference;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71138n.getTop(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), Dp.KN(7), 0.0f, 4, null);
                HorizontalAnchorable.n(constrainAs.getBottom(), this.f71138n.getBottom(), 0.0f, 0.0f, 6, null);
            }
        }

        /* JADX INFO: renamed from: nN.qz$j$j, reason: collision with other inner class name */
        static final class C1071j implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C1071j f71139n = new C1071j();

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), 0.0f, 0.0f, 6, null);
            }

            C1071j() {
            }
        }

        static final class n implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71140n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71141t;

            n(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
                this.f71140n = constrainedLayoutReference;
                this.f71141t = constrainedLayoutReference2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71140n.getBottom(), Dp.KN(20), 0.0f, 4, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), this.f71141t.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), Dp.KN(8), 0.0f, 4, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), 0.0f, 0.0f, 6, null);
                constrainAs.KN(Dimension.INSTANCE.n());
            }
        }

        static final class o implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71142n;

            o(ConstrainedLayoutReference constrainedLayoutReference) {
                this.f71142n = constrainedLayoutReference;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71142n.getTop(), 0.0f, 0.0f, 6, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), Dp.KN(7), 0.0f, 4, null);
                HorizontalAnchorable.n(constrainAs.getBottom(), this.f71142n.getBottom(), 0.0f, 0.0f, 6, null);
            }
        }

        /* JADX INFO: renamed from: nN.qz$j$qz, reason: collision with other inner class name */
        static final class C1072qz implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71143n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71144t;

            C1072qz(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
                this.f71143n = constrainedLayoutReference;
                this.f71144t = constrainedLayoutReference2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71143n.getBottom(), Dp.KN(26), 0.0f, 4, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), this.f71144t.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), Dp.KN(8), 0.0f, 4, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), 0.0f, 0.0f, 6, null);
                constrainAs.KN(Dimension.INSTANCE.n());
            }
        }

        static final class w6 implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71145n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ConstrainedLayoutReference f71146t;

            w6(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
                this.f71145n = constrainedLayoutReference;
                this.f71146t = constrainedLayoutReference2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ConstrainScope) obj);
                return Unit.INSTANCE;
            }

            public final void n(ConstrainScope constrainAs) {
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                HorizontalAnchorable.n(constrainAs.getTop(), this.f71145n.getBottom(), Dp.KN(20), 0.0f, 4, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), this.f71146t.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), Dp.KN(8), 0.0f, 4, null);
                VerticalAnchorable.rl(constrainAs.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), constrainAs.getParent().getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), 0.0f, 0.0f, 6, null);
                constrainAs.KN(Dimension.INSTANCE.n());
            }
        }

        public static final class z extends Lambda implements Function2 {
            final /* synthetic */ Function0 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function0 f71147O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MutableState f71148n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Function0 f71149o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ boolean f71150r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ConstraintLayoutScope f71151t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public z(MutableState mutableState, ConstraintLayoutScope constraintLayoutScope, Function0 function0, Function0 function02, boolean z2, Function0 function03) {
                super(2);
                this.f71148n = mutableState;
                this.f71151t = constraintLayoutScope;
                this.f71147O = function0;
                this.J2 = function02;
                this.f71150r = z2;
                this.f71149o = function03;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer, int i2) {
                String strT;
                if ((i2 & 3) == 2 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1200550679, i2, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                }
                this.f71148n.setValue(Unit.INSTANCE);
                int helpersHashCode = this.f71151t.getHelpersHashCode();
                this.f71151t.Uo();
                ConstraintLayoutScope constraintLayoutScope = this.f71151t;
                composer.eF(37072410);
                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesGh = constraintLayoutScope.gh();
                ConstrainedLayoutReference constrainedLayoutReferenceN = constrainedLayoutReferencesGh.n();
                ConstrainedLayoutReference constrainedLayoutReferenceRl = constrainedLayoutReferencesGh.rl();
                ConstrainedLayoutReference constrainedLayoutReferenceT = constrainedLayoutReferencesGh.t();
                String strT2 = StringResources_androidKt.t(2132017542, composer, 6);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.eF(971028296);
                Object objIF = composer.iF();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objIF == companion2.n()) {
                    objIF = C1071j.f71139n;
                    composer.o(objIF);
                }
                composer.Xw();
                hQ.rl(strT2, constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceRl, (Function1) objIF), null, composer, 0, 4);
                Painter painterT = PainterResources_androidKt.t(2131231317, composer, 6);
                Modifier modifierXMQ = SizeKt.xMQ(companion, Dp.KN(60));
                composer.eF(971040795);
                boolean zP5 = composer.p5(constrainedLayoutReferenceRl);
                Object objIF2 = composer.iF();
                if (zP5 || objIF2 == companion2.n()) {
                    objIF2 = new Wre(constrainedLayoutReferenceRl);
                    composer.o(objIF2);
                }
                composer.Xw();
                ImageKt.n(painterT, null, constraintLayoutScope.xMQ(modifierXMQ, constrainedLayoutReferenceN, (Function1) objIF2), null, null, 0.0f, null, composer, 48, b.f61769v);
                String strT3 = StringResources_androidKt.t(2132017602, composer, 6);
                composer.eF(971051453);
                boolean zP52 = composer.p5(constrainedLayoutReferenceN);
                Object objIF3 = composer.iF();
                if (zP52 || objIF3 == companion2.n()) {
                    objIF3 = new CN3(constrainedLayoutReferenceN);
                    composer.o(objIF3);
                }
                composer.Xw();
                Modifier modifierXMQ2 = constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceT, (Function1) objIF3);
                H9N.j jVar = H9N.j.f3810n;
                TextKt.t(strT3, modifierXMQ2, aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).iF(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesGh2 = constraintLayoutScope.gh();
                ConstrainedLayoutReference constrainedLayoutReferenceN2 = constrainedLayoutReferencesGh2.n();
                ConstrainedLayoutReference constrainedLayoutReferenceRl2 = constrainedLayoutReferencesGh2.rl();
                ConstrainedLayoutReference constrainedLayoutReferenceT2 = constrainedLayoutReferencesGh2.t();
                ConstrainedLayoutReference constrainedLayoutReferenceNr = constrainedLayoutReferencesGh2.nr();
                ConstrainedLayoutReference constrainedLayoutReferenceO = constrainedLayoutReferencesGh2.O();
                ConstrainedLayoutReference constrainedLayoutReferenceJ2 = constrainedLayoutReferencesGh2.J2();
                ConstrainedLayoutReference constrainedLayoutReferenceUo = constrainedLayoutReferencesGh2.Uo();
                ConstrainedLayoutReference constrainedLayoutReferenceKN = constrainedLayoutReferencesGh2.KN();
                composer.eF(971067854);
                boolean zP53 = composer.p5(constrainedLayoutReferenceNr);
                Object objIF4 = composer.iF();
                if (zP53 || objIF4 == companion2.n()) {
                    objIF4 = new fuX(constrainedLayoutReferenceNr);
                    composer.o(objIF4);
                }
                composer.Xw();
                qz.t("1", constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceN2, (Function1) objIF4), composer, 6, 0);
                float f3 = 4;
                Modifier modifierViF = SizeKt.ViF(BackgroundKt.nr(companion, aD.w6.n(), null, 2, null), Dp.KN(f3));
                composer.eF(971080081);
                boolean zP54 = composer.p5(constrainedLayoutReferenceN2) | composer.p5(constrainedLayoutReferenceRl2);
                Object objIF5 = composer.iF();
                if (zP54 || objIF5 == companion2.n()) {
                    objIF5 = new Dsr(constrainedLayoutReferenceN2, constrainedLayoutReferenceRl2);
                    composer.o(objIF5);
                }
                composer.Xw();
                BoxKt.n(constraintLayoutScope.xMQ(modifierViF, constrainedLayoutReferenceUo, (Function1) objIF5), composer, 0);
                composer.eF(971093678);
                boolean zP55 = composer.p5(constrainedLayoutReferenceO);
                Object objIF6 = composer.iF();
                if (zP55 || objIF6 == companion2.n()) {
                    objIF6 = new aC(constrainedLayoutReferenceO);
                    composer.o(objIF6);
                }
                composer.Xw();
                qz.t("2", constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceRl2, (Function1) objIF6), composer, 6, 0);
                Modifier modifierViF2 = SizeKt.ViF(BackgroundKt.nr(companion, aD.w6.n(), null, 2, null), Dp.KN(f3));
                composer.eF(971105873);
                boolean zP56 = composer.p5(constrainedLayoutReferenceRl2) | composer.p5(constrainedLayoutReferenceT2);
                Object objIF7 = composer.iF();
                if (zP56 || objIF7 == companion2.n()) {
                    objIF7 = new C(constrainedLayoutReferenceRl2, constrainedLayoutReferenceT2);
                    composer.o(objIF7);
                }
                composer.Xw();
                BoxKt.n(constraintLayoutScope.xMQ(modifierViF2, constrainedLayoutReferenceKN, (Function1) objIF7), composer, 0);
                composer.eF(971119470);
                boolean zP57 = composer.p5(constrainedLayoutReferenceJ2);
                Object objIF8 = composer.iF();
                if (zP57 || objIF8 == companion2.n()) {
                    objIF8 = new o(constrainedLayoutReferenceJ2);
                    composer.o(objIF8);
                }
                composer.Xw();
                qz.t("3", constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceT2, (Function1) objIF8), composer, 6, 0);
                String strT4 = StringResources_androidKt.t(2132017548, composer, 6);
                composer.eF(971131043);
                boolean zP58 = composer.p5(constrainedLayoutReferenceT) | composer.p5(constrainedLayoutReferenceN2);
                Object objIF9 = composer.iF();
                if (zP58 || objIF9 == companion2.n()) {
                    objIF9 = new C1072qz(constrainedLayoutReferenceT, constrainedLayoutReferenceN2);
                    composer.o(objIF9);
                }
                composer.Xw();
                TextKt.t(strT4, constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceNr, (Function1) objIF9), aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).v(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                String strT5 = StringResources_androidKt.t(2132017549, composer, 6);
                composer.eF(971147363);
                boolean zP59 = composer.p5(constrainedLayoutReferenceNr) | composer.p5(constrainedLayoutReferenceRl2);
                Object objIF10 = composer.iF();
                if (zP59 || objIF10 == companion2.n()) {
                    objIF10 = new n(constrainedLayoutReferenceNr, constrainedLayoutReferenceRl2);
                    composer.o(objIF10);
                }
                composer.Xw();
                TextKt.t(strT5, constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceO, (Function1) objIF10), aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).v(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                String strT6 = StringResources_androidKt.t(2132017550, composer, 6);
                composer.eF(971163683);
                boolean zP510 = composer.p5(constrainedLayoutReferenceO) | composer.p5(constrainedLayoutReferenceT2);
                Object objIF11 = composer.iF();
                if (zP510 || objIF11 == companion2.n()) {
                    objIF11 = new w6(constrainedLayoutReferenceO, constrainedLayoutReferenceT2);
                    composer.o(objIF11);
                }
                composer.Xw();
                TextKt.t(strT6, constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceJ2, (Function1) objIF11), aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).v(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesGh3 = constraintLayoutScope.gh();
                ConstrainedLayoutReference constrainedLayoutReferenceN3 = constrainedLayoutReferencesGh3.n();
                ConstrainedLayoutReference constrainedLayoutReferenceRl3 = constrainedLayoutReferencesGh3.rl();
                Function0 function0 = this.J2;
                if (this.f71150r) {
                    composer.eF(41823469);
                    strT = StringResources_androidKt.t(2132017594, composer, 6);
                    composer.Xw();
                } else {
                    composer.eF(41926947);
                    strT = StringResources_androidKt.t(2132017593, composer, 6);
                    composer.Xw();
                }
                composer.eF(971189399);
                boolean zP511 = composer.p5(constrainedLayoutReferenceT2);
                Object objIF12 = composer.iF();
                if (zP511 || objIF12 == companion2.n()) {
                    objIF12 = new Ml(constrainedLayoutReferenceT2);
                    composer.o(objIF12);
                }
                composer.Xw();
                Dj7.eO.J2(function0, strT, constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceN3, (Function1) objIF12), null, null, null, 0, 0, 0.0f, null, null, null, false, composer, 0, 0, 8184);
                String strT7 = StringResources_androidKt.t(2132017547, composer, 6);
                Function0 function02 = this.f71149o;
                composer.eF(971204514);
                boolean zP512 = composer.p5(constrainedLayoutReferenceN3);
                Object objIF13 = composer.iF();
                if (zP512 || objIF13 == companion2.n()) {
                    objIF13 = new I28(constrainedLayoutReferenceN3);
                    composer.o(objIF13);
                }
                composer.Xw();
                cg.z.t(strT7, function02, constraintLayoutScope.xMQ(companion, constrainedLayoutReferenceRl3, (Function1) objIF13), composer, 0, 0);
                composer.Xw();
                if (this.f71151t.getHelpersHashCode() != helpersHashCode) {
                    EffectsKt.KN(this.f71147O, composer, 6);
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j(Function0 function0, boolean z2, Function0 function02) {
            this.f71118n = function0;
            this.f71119t = z2;
            this.f71117O = function02;
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
                ComposerKt.p5(1150946519, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.optin.CreatorOptInCard.<anonymous> (CreatorOptInCard.kt:38)");
            }
            Modifier modifierKN = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
            Function0 function0 = this.f71118n;
            boolean z2 = this.f71119t;
            Function0 function02 = this.f71117O;
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
            MutableState mutableState2 = (MutableState) objIF3;
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
            MutableState mutableState3 = (MutableState) objIF5;
            boolean zE2 = composer.E2(measurer2) | composer.t(257);
            Object objIF6 = composer.iF();
            if (zE2 || objIF6 == companion.n()) {
                Object pl = new Pl(mutableState3, measurer2, constraintSetForInlineDsl2, 257, mutableState2);
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState2;
                composer.o(pl);
                objIF6 = pl;
            } else {
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState2;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF6;
            Object objIF7 = composer.iF();
            if (objIF7 == companion.n()) {
                objIF7 = new Xo(mutableState, constraintSetForInlineDsl);
                composer.o(objIF7);
            }
            Function0 function03 = (Function0) objIF7;
            boolean zE22 = composer.E2(measurer2);
            Object objIF8 = composer.iF();
            if (zE22 || objIF8 == companion.n()) {
                objIF8 = new eO(measurer2);
                composer.o(objIF8);
            }
            LayoutKt.n(SemanticsModifierKt.nr(modifierKN, false, (Function1) objIF8, 1, null), ComposableLambdaKt.nr(1200550679, true, new z(mutableState3, constraintLayoutScope, function03, function0, z2, function02), composer, 54), measurePolicy, composer, 48, 0);
            composer.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(boolean z2, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        O(z2, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void O(final boolean z2, final Function0 onOptInButtonClick, final Function0 onHowItWorksButtonClick, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onOptInButtonClick, "onOptInButtonClick");
        Intrinsics.checkNotNullParameter(onHowItWorksButtonClick, "onHowItWorksButtonClick");
        Composer composerKN = composer.KN(1818116393);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onOptInButtonClick) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onHowItWorksButtonClick) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1818116393, i3, -1, "com.alightcreative.app.motion.activities.creatorprogram.optin.CreatorOptInCard (CreatorOptInCard.kt:36)");
            }
            Dj7.QJ.rl(ComposableLambdaKt.nr(1150946519, true, new j(onOptInButtonClick, z2, onHowItWorksButtonClick), composerKN, 54), composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: nN.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.J2(z2, onOptInButtonClick, onHowItWorksButtonClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(String str, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        t(str, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final String str, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        final Modifier modifier2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(148158209);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (composerKN.p5(str) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i5 & 19) == 18 || !composerKN.xMQ()) {
                Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(148158209, i5, -1, "com.alightcreative.app.motion.activities.creatorprogram.optin.Bullet (CreatorOptInCard.kt:191)");
                }
                Modifier modifierNr = BackgroundKt.nr(ClipKt.n(SizeKt.Z(modifier3, Dp.KN(24)), RoundedCornerShapeKt.J2()), aD.w6.n(), null, 2, null);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
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
                Updater.O(composerN, measurePolicyUo, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                function2Rl = companion.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                Modifier modifier4 = modifier3;
                composer2 = composerKN;
                TextKt.t(str, null, Color.INSTANCE.KN(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).ViF(), composer2, (i5 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier2 = modifier4;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: nN.o
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qz.nr(str, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i5 & 19) == 18) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier modifierNr2 = BackgroundKt.nr(ClipKt.n(SizeKt.Z(modifier3, Dp.KN(24)), RoundedCornerShapeKt.J2()), aD.w6.n(), null, 2, null);
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.O(), false);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierNr2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion2.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo2, companion2.t());
            Updater.O(composerN, compositionLocalMapIk2, companion2.O());
            function2Rl = companion2.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion2.nr());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                Modifier modifier42 = modifier3;
                composer2 = composerKN;
                TextKt.t(str, null, Color.INSTANCE.KN(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).ViF(), composer2, (i5 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                composer2.XQ();
                if (ComposerKt.v()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
