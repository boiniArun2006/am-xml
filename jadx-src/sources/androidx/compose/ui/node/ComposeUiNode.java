package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\ba\u0018\u0000 ,2\u00020\u0001:\u0001-R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u00020 8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010+\u001a\u00020&8&@&X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006.À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "gh", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "rl", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "O", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "az", "(Landroidx/compose/ui/Modifier;)V", "modifier", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "xMQ", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "viewConfiguration", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "ty", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "compositionLocalMap", "", "getCompositeKeyHash", "()I", "J2", "(I)V", "compositeKeyHash", "te", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PublishedApi
public interface ComposeUiNode {

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f32389n;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR.\u0010\u0015\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R.\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0014R.\u0010\u001b\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014R.\u0010\u001e\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014R.\u0010\"\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0014R.\u0010&\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0014R.\u0010)\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b(\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014¨\u0006*"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/ComposeUiNode;", "rl", "Lkotlin/jvm/functions/Function0;", c.f62177j, "()Lkotlin/jvm/functions/Function0;", "Constructor", "t", "J2", "VirtualConstructor", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier;", "", "Lkotlin/ExtensionFunctionType;", "nr", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "SetModifier", "Landroidx/compose/ui/unit/Density;", "O", "getSetDensity", "SetDensity", "Landroidx/compose/runtime/CompositionLocalMap;", "SetResolvedCompositionLocals", "Landroidx/compose/ui/layout/MeasurePolicy;", "Uo", "SetMeasurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "KN", "getSetLayoutDirection", "SetLayoutDirection", "Landroidx/compose/ui/platform/ViewConfiguration;", "xMQ", "getSetViewConfiguration", "SetViewConfiguration", "", "mUb", "SetCompositeKeyHash", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f32389n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final Function0 Constructor = LayoutNode.INSTANCE.n();

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final Function0 VirtualConstructor = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final LayoutNode invoke() {
                return new LayoutNode(true, 0, 2, null);
            }
        };

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private static final Function2 SetModifier = new Function2<ComposeUiNode, Modifier, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, Modifier modifier) {
                n(composeUiNode, modifier);
                return Unit.INSTANCE;
            }

            public final void n(ComposeUiNode composeUiNode, Modifier modifier) {
                composeUiNode.az(modifier);
            }
        };

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private static final Function2 SetDensity = new Function2<ComposeUiNode, Density, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, Density density) {
                n(composeUiNode, density);
                return Unit.INSTANCE;
            }

            public final void n(ComposeUiNode composeUiNode, Density density) {
                composeUiNode.O(density);
            }
        };

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private static final Function2 SetResolvedCompositionLocals = new Function2<ComposeUiNode, CompositionLocalMap, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, CompositionLocalMap compositionLocalMap) {
                n(composeUiNode, compositionLocalMap);
                return Unit.INSTANCE;
            }

            public final void n(ComposeUiNode composeUiNode, CompositionLocalMap compositionLocalMap) {
                composeUiNode.ty(compositionLocalMap);
            }
        };

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private static final Function2 SetMeasurePolicy = new Function2<ComposeUiNode, MeasurePolicy, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
                n(composeUiNode, measurePolicy);
                return Unit.INSTANCE;
            }

            public final void n(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
                composeUiNode.gh(measurePolicy);
            }
        };

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private static final Function2 SetLayoutDirection = new Function2<ComposeUiNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                n(composeUiNode, layoutDirection);
                return Unit.INSTANCE;
            }

            public final void n(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                composeUiNode.rl(layoutDirection);
            }
        };

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
        private static final Function2 SetViewConfiguration = new Function2<ComposeUiNode, ViewConfiguration, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                n(composeUiNode, viewConfiguration);
                return Unit.INSTANCE;
            }

            public final void n(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                composeUiNode.xMQ(viewConfiguration);
            }
        };

        /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
        private static final Function2 SetCompositeKeyHash = new Function2<ComposeUiNode, Integer, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, Integer num) {
                n(composeUiNode, num.intValue());
                return Unit.INSTANCE;
            }

            public final void n(ComposeUiNode composeUiNode, int i2) {
                composeUiNode.J2(i2);
            }
        };

        public final Function0 J2() {
            return VirtualConstructor;
        }

        public final Function2 O() {
            return SetResolvedCompositionLocals;
        }

        public final Function0 n() {
            return Constructor;
        }

        public final Function2 nr() {
            return SetModifier;
        }

        public final Function2 rl() {
            return SetCompositeKeyHash;
        }

        public final Function2 t() {
            return SetMeasurePolicy;
        }

        private Companion() {
        }
    }

    void J2(int i2);

    void O(Density density);

    void az(Modifier modifier);

    void gh(MeasurePolicy measurePolicy);

    void rl(LayoutDirection layoutDirection);

    void ty(CompositionLocalMap compositionLocalMap);

    void xMQ(ViewConfiguration viewConfiguration);
}
