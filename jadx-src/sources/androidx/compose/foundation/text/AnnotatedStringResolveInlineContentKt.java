package androidx.compose.foundation.text;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.Constraints;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001af\u0010\u000e\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u00060\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a@\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00002'\u0010\u0014\u001a#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u0006H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\"Q\u0010\u0018\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017*:\b\u0000\u0010\u0019\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u00072\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007*\u0018\b\u0000\u0010\u001a\"\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "Landroidx/compose/foundation/text/PlaceholderRange;", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/foundation/text/InlineContentRange;", "t", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/Map;)Lkotlin/Pair;", "", "rl", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "text", "inlineContents", c.f62177j, "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Pair;", "EmptyInlineContent", "InlineContentRange", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,81:1\n34#2,6:82\n34#2,4:88\n39#2:125\n79#3:92\n77#3,8:93\n86#3,3:110\n89#3,2:119\n93#3:124\n347#4,9:101\n356#4,3:121\n4206#5,6:113\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n*L\n47#1:82,6\n69#1:88,4\n69#1:125\n70#1:92\n70#1:93,8\n70#1:110,3\n70#1:119,2\n70#1:124\n70#1:101,9\n70#1:121,3\n70#1:113,6\n*E\n"})
public final class AnnotatedStringResolveInlineContentKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pair f19142n = new Pair(CollectionsKt.emptyList(), CollectionsKt.emptyList());

    public static final void n(final AnnotatedString annotatedString, final List list, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-1794596951);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(annotatedString) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(list) ? 32 : 16;
        }
        int i5 = 0;
        if (composerKN.HI((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1794596951, i3, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list.size();
            int i7 = 0;
            while (i7 < size) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i7);
                Function3 function3 = (Function3) range.n();
                int iRl = range.rl();
                int iT = range.t();
                AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 annotatedStringResolveInlineContentKt$InlineChildren$1$2 = new MeasurePolicy() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list2, long j2) {
                        final ArrayList arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            arrayList.add(((Measurable) list2.get(i8)).dR0(j2));
                        }
                        return MeasureScope.ER(measureScope, Constraints.qie(j2), Constraints.gh(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                n(placementScope);
                                return Unit.INSTANCE;
                            }

                            public final void n(Placeable.PlacementScope placementScope) {
                                List list3 = arrayList;
                                int size3 = list3.size();
                                for (int i9 = 0; i9 < size3; i9++) {
                                    Placeable.PlacementScope.az(placementScope, (Placeable) list3.get(i9), 0, 0, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                Modifier.Companion companion = Modifier.INSTANCE;
                int iN = ComposablesKt.n(composerKN, i5);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
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
                int i8 = i5;
                Updater.O(composerN, annotatedStringResolveInlineContentKt$InlineChildren$1$2, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                Function2 function2Rl = companion2.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                function3.invoke(annotatedString.subSequence(iRl, iT).getText(), composerKN, Integer.valueOf(i8));
                composerKN.XQ();
                i7++;
                i5 = i8;
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    AnnotatedStringResolveInlineContentKt.n(annotatedString, list, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final Pair t(AnnotatedString annotatedString, Map map) {
        if (map == null || map.isEmpty()) {
            return f19142n;
        }
        List listXMQ = annotatedString.xMQ("androidx.compose.foundation.text.inlineContent", 0, annotatedString.getText().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listXMQ.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) listXMQ.get(i2);
            InlineTextContent inlineTextContent = (InlineTextContent) map.get(range.getItem());
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
            }
        }
        return new Pair(arrayList, arrayList2);
    }

    public static final boolean rl(AnnotatedString annotatedString) {
        return annotatedString.HI("androidx.compose.foundation.text.inlineContent", 0, annotatedString.getText().length());
    }
}
