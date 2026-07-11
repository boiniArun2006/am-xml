package androidx.compose.foundation.lazy.layout;

import GJW.vd;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003YZ[B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0005J3\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0012\b\u0002\u0010\u000f\u001a\f0\u000eR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\f*\u00020\u00162\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0089\u0001\u0010,\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\u0005J\u001f\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\f¢\u0006\u0004\b1\u00102R*\u00106\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\u000eR\b\u0012\u0004\u0012\u00028\u00000\u0000038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010@R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u0002000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010@R\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0017\u0010Q\u001a\u00020N8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bK\u0010PR\u0018\u0010S\u001a\u00020\u0012*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010RR\u0018\u0010\r\u001a\u00020\f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010TR\u0018\u0010U\u001a\u00020\f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010TR\u0017\u0010X\u001a\u00020V8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bH\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "<init>", "()V", "key", "", "HI", "(Ljava/lang/Object;)V", "ty", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "itemInfo", "gh", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V", "", "isMovingAway", "Ik", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V", "", "o", "([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "itemProvider", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "LGJW/vd;", "coroutineScope", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "az", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILGJW/vd;Landroidx/compose/ui/graphics/GraphicsContext;)V", "ck", "placeableIndex", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "O", "(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "Landroidx/collection/MutableScatterMap;", c.f62177j, "Landroidx/collection/MutableScatterMap;", "keyToItemInfoMap", "rl", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "t", "I", "firstVisibleIndex", "Landroidx/collection/MutableScatterSet;", "nr", "Landroidx/collection/MutableScatterSet;", "movingAwayKeys", "Ljava/util/List;", "movingInFromStartBound", "J2", "movingInFromEndBound", "Uo", "movingAwayToStartBound", "KN", "movingAwayToEndBound", "xMQ", "disappearingItems", "Landroidx/compose/ui/node/DrawModifierNode;", "mUb", "Landroidx/compose/ui/node/DrawModifierNode;", "displayingNode", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "modifier", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z", "hasAnimations", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "crossAxisOffset", "Landroidx/compose/ui/unit/IntSize;", "()J", "minSizeToFitDisappearingItems", "DisplayingDisappearingItemsElement", "DisplayingDisappearingItemsNode", "ItemInfo", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,587:1\n102#2,2:588\n34#2,6:590\n104#2:596\n34#2,4:625\n39#2:636\n34#2,6:639\n34#2,6:647\n34#2,6:684\n34#2,6:692\n34#2,4:731\n39#2:741\n32#3:597\n32#3:599\n80#4:598\n80#4:600\n85#4:736\n90#4:738\n80#4:740\n365#5,3:601\n329#5,6:604\n339#5,3:611\n342#5,9:615\n368#5:624\n372#5,3:700\n329#5,6:703\n339#5,3:710\n342#5,2:714\n345#5,6:718\n375#5:724\n1399#6:610\n1270#6:614\n1399#6:663\n1270#6:667\n1399#6:709\n1270#6:713\n1#7:629\n13309#8,2:630\n13309#8,2:632\n13309#8,2:634\n13374#8,3:670\n12474#8,2:673\n13309#8,2:698\n13309#8,2:716\n13374#8,3:725\n13374#8,3:728\n1011#9,2:637\n1002#9,2:645\n1011#9,2:682\n1002#9,2:690\n231#10,3:653\n200#10,7:656\n211#10,3:664\n214#10,2:668\n217#10,6:675\n234#10:681\n54#11:735\n59#11:737\n30#12:739\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n*L\n89#1:588,2\n89#1:590,6\n89#1:596\n113#1:625,4\n113#1:636\n189#1:639,6\n199#1:647,6\n289#1:684,6\n314#1:692,6\n433#1:731,4\n433#1:741\n102#1:597\n104#1:599\n102#1:598\n104#1:600\n438#1:736\n439#1:738\n437#1:740\n111#1:601,3\n111#1:604,6\n111#1:611,3\n111#1:615,9\n111#1:624\n368#1:700,3\n368#1:703,6\n368#1:710,3\n368#1:714,2\n368#1:718,6\n368#1:724\n111#1:610\n111#1:614\n210#1:663\n210#1:667\n368#1:709\n368#1:713\n145#1:630,2\n157#1:632,2\n166#1:634,2\n226#1:670,3\n264#1:673,2\n353#1:698,2\n369#1:716,2\n390#1:725,3\n401#1:728,3\n188#1:637,2\n198#1:645,2\n288#1:682,2\n313#1:690,2\n210#1:653,3\n210#1:656,7\n210#1:664,3\n210#1:668,2\n210#1:675,6\n210#1:681\n438#1:735\n439#1:737\n437#1:739\n*E\n"})
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private DrawModifierNode displayingNode;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private LazyLayoutKeyIndexMap keyIndexMap;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int firstVisibleIndex;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterMap keyToItemInfoMap = ScatterMapKt.t();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableScatterSet movingAwayKeys = ScatterSetKt.n();

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final List movingInFromStartBound = new ArrayList();

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final List movingInFromEndBound = new ArrayList();

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final List movingAwayToStartBound = new ArrayList();

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final List movingAwayToEndBound = new ArrayList();

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final List disappearingItems = new ArrayList();

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final Modifier modifier = new DisplayingDisappearingItemsElement(this);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "t", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "node", "", "O", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final LazyLayoutItemAnimator animator;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public void rl(DisplayingDisappearingItemsNode node) {
            node.UR(this.animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public DisplayingDisappearingItemsNode getNode() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "c", "()V", "Sax", "UR", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "v", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,587:1\n34#2,4:588\n39#2:599\n120#3,7:592\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode\n*L\n552#1:588,4\n552#1:599\n556#1:592,7\n*E\n"})
    private static final /* data */ class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private LazyLayoutItemAnimator animator;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsNode) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsNode) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void N(ContentDrawScope contentDrawScope) {
            List list = this.animator.disappearingItems;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i2);
                GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float fGh = IntOffset.gh(lazyLayoutItemAnimation.getFinalOffset());
                    float fGh2 = fGh - IntOffset.gh(layer.getTopLeft());
                    float fQie = IntOffset.qie(lazyLayoutItemAnimation.getFinalOffset()) - IntOffset.qie(layer.getTopLeft());
                    contentDrawScope.getDrawContext().getTransform().nr(fGh2, fQie);
                    try {
                        GraphicsLayerKt.n(contentDrawScope, layer);
                    } finally {
                        contentDrawScope.getDrawContext().getTransform().nr(-fGh2, -fQie);
                    }
                }
            }
            contentDrawScope.l2();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void Sax() {
            this.animator.ck();
        }

        public final void UR(LazyLayoutItemAnimator animator) {
            if (Intrinsics.areEqual(this.animator, animator) || !getNode().getIsAttached()) {
                return;
            }
            this.animator.ck();
            animator.displayingNode = this;
            this.animator = animator;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void c() {
            this.animator.displayingNode = this;
        }

        public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR4\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R*\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\"\u0010%\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R$\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b*\u0010 R$\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b&\u0010 R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "positionedItem", "LGJW/vd;", "coroutineScope", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "", "layoutMinOffset", "layoutMaxOffset", "crossAxisOffset", "", "gh", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;LGJW/vd;Landroidx/compose/ui/graphics/GraphicsContext;III)V", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "<set-?>", c.f62177j, "[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "animations", "Landroidx/compose/ui/unit/Constraints;", "rl", "Landroidx/compose/ui/unit/Constraints;", "()Landroidx/compose/ui/unit/Constraints;", "setConstraints-_Sx5XlM", "(Landroidx/compose/ui/unit/Constraints;)V", "constraints", "t", "I", "()I", "setCrossAxisOffset", "(I)V", "nr", "xMQ", "lane", "O", "Uo", "mUb", TtmlNode.TAG_SPAN, "J2", "", "KN", "()Z", "isRunningPlacement", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n12474#2,2:588\n1#3:590\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo\n*L\n479#1:588,2\n*E\n"})
    private final class ItemInfo {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private int layoutMinOffset;

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private int layoutMaxOffset;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private int lane;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private Constraints constraints;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private int crossAxisOffset;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private LazyLayoutItemAnimation[] animations = LazyLayoutItemAnimatorKt.f18461n;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private int span = 1;

        public ItemInfo() {
        }

        private final boolean KN() {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : this.animations) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.getIsRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void qie(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, vd vdVar, GraphicsContext graphicsContext, int i2, int i3, int i5, int i7, Object obj) {
            if ((i7 & 32) != 0) {
                i5 = LazyLayoutItemAnimator.this.J2(lazyLayoutMeasuredItem);
            }
            itemInfo.gh(lazyLayoutMeasuredItem, vdVar, graphicsContext, i2, i3, i5);
        }

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        /* JADX INFO: renamed from: Uo, reason: from getter */
        public final int getSpan() {
            return this.span;
        }

        public final void mUb(int i2) {
            this.span = i2;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final int getLane() {
            return this.lane;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final Constraints getConstraints() {
            return this.constraints;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        public final void xMQ(int i2) {
            this.lane = i2;
        }

        public final void gh(LazyLayoutMeasuredItem positionedItem, vd coroutineScope, GraphicsContext graphicsContext, int layoutMinOffset, int layoutMaxOffset, int crossAxisOffset) {
            if (!KN()) {
                this.layoutMinOffset = layoutMinOffset;
                this.layoutMaxOffset = layoutMaxOffset;
            }
            int length = this.animations.length;
            for (int iT = positionedItem.t(); iT < length; iT++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = this.animations[iT];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.ViF();
                }
            }
            if (this.animations.length != positionedItem.t()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.animations, positionedItem.t());
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                this.animations = (LazyLayoutItemAnimation[]) objArrCopyOf;
            }
            this.constraints = Constraints.n(positionedItem.getConstraints());
            this.crossAxisOffset = crossAxisOffset;
            this.lane = positionedItem.getLane();
            this.span = positionedItem.getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_SPAN java.lang.String();
            int iT2 = positionedItem.t();
            final LazyLayoutItemAnimator lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i2 = 0; i2 < iT2; i2++) {
                LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNodeT = LazyLayoutItemAnimatorKt.t(positionedItem.ty(i2));
                if (lazyLayoutAnimationSpecsNodeT == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.animations[i2];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.ViF();
                    }
                    this.animations[i2] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.animations[i2];
                    if (lazyLayoutItemAnimation3 == null) {
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(coroutineScope, graphicsContext, new Function0<Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1
                            {
                                super(0);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                DrawModifierNode drawModifierNode = lazyLayoutItemAnimator.displayingNode;
                                if (drawModifierNode != null) {
                                    DrawModifierNodeKt.n(drawModifierNode);
                                }
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        });
                        this.animations[i2] = lazyLayoutItemAnimation3;
                    }
                    lazyLayoutItemAnimation3.iF(lazyLayoutAnimationSpecsNodeT.getFadeInSpec());
                    lazyLayoutItemAnimation3.N(lazyLayoutAnimationSpecsNodeT.getPlacementSpec());
                    lazyLayoutItemAnimation3.fD(lazyLayoutAnimationSpecsNodeT.getFadeOutSpec());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int J2(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jHI = lazyLayoutMeasuredItem.HI(0);
        return !lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.qie(jHI) : IntOffset.gh(jHI);
    }

    private final int KN(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jHI = lazyLayoutMeasuredItem.HI(0);
        return lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.qie(jHI) : IntOffset.gh(jHI);
    }

    private final void gh(LazyLayoutMeasuredItem item, int mainAxisOffset, ItemInfo itemInfo) {
        int i2 = 0;
        long jHI = item.HI(0);
        long jKN = item.getIsVertical() ? IntOffset.KN(jHI, 0, mainAxisOffset, 1, null) : IntOffset.KN(jHI, mainAxisOffset, 0, 2, null);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i3 = 0;
        while (i2 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i2];
            int i5 = i3 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.nHg(IntOffset.HI(jKN, IntOffset.ty(item.HI(i3), jHI)));
            }
            i2++;
            i3 = i5;
        }
    }

    public final void az(int consumedScroll, int layoutWidth, int layoutHeight, List positionedItems, final LazyLayoutKeyIndexMap keyIndexMap, LazyLayoutMeasuredItemProvider itemProvider, boolean isVertical, boolean isLookingAhead, int laneCount, boolean hasLookaheadOccurred, int layoutMinOffset, int layoutMaxOffset, vd coroutineScope, GraphicsContext graphicsContext) {
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap;
        boolean z2;
        int i2;
        int i3;
        int i5;
        int layoutMaxOffset2;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i7;
        int i8;
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        int i9;
        int i10;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2;
        int i11;
        int iT;
        int i12;
        long[] jArr3;
        long[] jArr4;
        int i13;
        int i14 = laneCount;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3 = this.keyIndexMap;
        this.keyIndexMap = keyIndexMap;
        int size = positionedItems.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                if (this.keyToItemInfoMap.KN()) {
                    ty();
                    return;
                }
            } else if (Uo((LazyLayoutMeasuredItem) positionedItems.get(i15))) {
                break;
            } else {
                i15++;
            }
        }
        int i16 = this.firstVisibleIndex;
        LazyLayoutMeasuredItem lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) CollectionsKt.firstOrNull(positionedItems);
        this.firstVisibleIndex = lazyLayoutMeasuredItem != null ? lazyLayoutMeasuredItem.getIndex() : 0;
        long jJ2 = isVertical ? IntOffset.J2((((long) consumedScroll) & 4294967295L) | (((long) 0) << 32)) : IntOffset.J2((((long) consumedScroll) << 32) | (((long) 0) & 4294967295L));
        boolean z3 = isLookingAhead || !hasLookaheadOccurred;
        MutableScatterMap mutableScatterMap = this.keyToItemInfoMap;
        Object[] objArr3 = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        long[] jArr5 = mutableScatterMap.metadata;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i17 = 0;
            z2 = z3;
            while (true) {
                long j2 = jArr5[i17];
                lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap3;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j2 & 255) < 128) {
                            jArr4 = jArr5;
                            i13 = i19;
                            this.movingAwayKeys.xMQ(objArr3[(i17 << 3) + i19]);
                        } else {
                            jArr4 = jArr5;
                            i13 = i19;
                        }
                        j2 >>= 8;
                        i19 = i13 + 1;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    if (i18 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                }
                if (i17 == length) {
                    break;
                }
                i17++;
                lazyLayoutKeyIndexMap3 = lazyLayoutKeyIndexMap;
                jArr5 = jArr3;
            }
        } else {
            lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap3;
            z2 = z3;
        }
        int size2 = positionedItems.size();
        int i20 = 0;
        while (i20 < size2) {
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = (LazyLayoutMeasuredItem) positionedItems.get(i20);
            this.movingAwayKeys.nY(lazyLayoutMeasuredItem2.getKey());
            if (Uo(lazyLayoutMeasuredItem2)) {
                ItemInfo itemInfo = (ItemInfo) this.keyToItemInfoMap.O(lazyLayoutMeasuredItem2.getKey());
                if (lazyLayoutKeyIndexMap != null) {
                    lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap;
                    iT = lazyLayoutKeyIndexMap2.t(lazyLayoutMeasuredItem2.getKey());
                } else {
                    lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap;
                    iT = -1;
                }
                boolean z4 = iT == -1 && lazyLayoutKeyIndexMap2 != null;
                if (itemInfo == null) {
                    ItemInfo itemInfo2 = new ItemInfo();
                    ItemInfo.qie(itemInfo2, lazyLayoutMeasuredItem2, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                    i11 = size2;
                    this.keyToItemInfoMap.aYN(lazyLayoutMeasuredItem2.getKey(), itemInfo2);
                    if (lazyLayoutMeasuredItem2.getIndex() == iT || iT == -1) {
                        long jHI = lazyLayoutMeasuredItem2.HI(0);
                        gh(lazyLayoutMeasuredItem2, lazyLayoutMeasuredItem2.getIsVertical() ? IntOffset.qie(jHI) : IntOffset.gh(jHI), itemInfo2);
                        if (z4) {
                            LazyLayoutItemAnimation[] animations = itemInfo2.getAnimations();
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
                                if (lazyLayoutItemAnimation != null) {
                                    lazyLayoutItemAnimation.gh();
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                        }
                    } else if (iT < i16) {
                        this.movingInFromStartBound.add(lazyLayoutMeasuredItem2);
                    } else {
                        this.movingInFromEndBound.add(lazyLayoutMeasuredItem2);
                    }
                } else {
                    i11 = size2;
                    if (z2) {
                        ItemInfo.qie(itemInfo, lazyLayoutMeasuredItem2, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                        LazyLayoutItemAnimation[] animations2 = itemInfo.getAnimations();
                        int length2 = animations2.length;
                        int i21 = 0;
                        while (i21 < length2) {
                            LazyLayoutItemAnimation lazyLayoutItemAnimation2 = animations2[i21];
                            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr2 = animations2;
                            int i22 = i16;
                            if (lazyLayoutItemAnimation2 != null) {
                                i12 = i20;
                                if (!IntOffset.mUb(lazyLayoutItemAnimation2.getRawOffset(), LazyLayoutItemAnimation.INSTANCE.n())) {
                                    lazyLayoutItemAnimation2.nHg(IntOffset.HI(lazyLayoutItemAnimation2.getRawOffset(), jJ2));
                                }
                            } else {
                                i12 = i20;
                            }
                            i21++;
                            i16 = i22;
                            animations2 = lazyLayoutItemAnimationArr2;
                            i20 = i12;
                        }
                        i9 = i16;
                        i10 = i20;
                        if (z4) {
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation3 : itemInfo.getAnimations()) {
                                if (lazyLayoutItemAnimation3 != null) {
                                    if (lazyLayoutItemAnimation3.S()) {
                                        this.disappearingItems.remove(lazyLayoutItemAnimation3);
                                        DrawModifierNode drawModifierNode = this.displayingNode;
                                        if (drawModifierNode != null) {
                                            DrawModifierNodeKt.n(drawModifierNode);
                                            Unit unit2 = Unit.INSTANCE;
                                        }
                                    }
                                    lazyLayoutItemAnimation3.gh();
                                }
                            }
                        }
                        r(this, lazyLayoutMeasuredItem2, false, 2, null);
                    }
                }
                i9 = i16;
                i10 = i20;
            } else {
                i9 = i16;
                i10 = i20;
                lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap;
                i11 = size2;
                HI(lazyLayoutMeasuredItem2.getKey());
            }
            i20 = i10 + 1;
            size2 = i11;
            i16 = i9;
            lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap2;
        }
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap4 = lazyLayoutKeyIndexMap;
        int i23 = 2;
        int[] iArr = new int[i14];
        if (!z2 || lazyLayoutKeyIndexMap4 == null) {
            i2 = 2;
        } else {
            if (this.movingInFromStartBound.isEmpty()) {
                i2 = 2;
            } else {
                List list = this.movingInFromStartBound;
                if (list.size() > 1) {
                    CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap4.t(((LazyLayoutMeasuredItem) obj2).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap4.t(((LazyLayoutMeasuredItem) obj).getKey())));
                        }
                    });
                }
                List list2 = this.movingInFromStartBound;
                int size3 = list2.size();
                int i24 = 0;
                while (i24 < size3) {
                    LazyLayoutMeasuredItem lazyLayoutMeasuredItem3 = (LazyLayoutMeasuredItem) list2.get(i24);
                    int i25 = i23;
                    qie(this, lazyLayoutMeasuredItem3, layoutMinOffset - o(iArr, lazyLayoutMeasuredItem3), null, 4, null);
                    r(this, lazyLayoutMeasuredItem3, false, i25, null);
                    i24++;
                    i23 = i25;
                }
                i2 = i23;
                ArraysKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
            }
            if (!this.movingInFromEndBound.isEmpty()) {
                List list3 = this.movingInFromEndBound;
                if (list3.size() > 1) {
                    CollectionsKt.sortWith(list3, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap4.t(((LazyLayoutMeasuredItem) obj).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap4.t(((LazyLayoutMeasuredItem) obj2).getKey())));
                        }
                    });
                }
                List list4 = this.movingInFromEndBound;
                int size4 = list4.size();
                for (int i26 = 0; i26 < size4; i26++) {
                    LazyLayoutMeasuredItem lazyLayoutMeasuredItem4 = (LazyLayoutMeasuredItem) list4.get(i26);
                    qie(this, lazyLayoutMeasuredItem4, (layoutMaxOffset + o(iArr, lazyLayoutMeasuredItem4)) - lazyLayoutMeasuredItem4.getMainAxisSizeWithSpacings(), null, 4, null);
                    r(this, lazyLayoutMeasuredItem4, false, i2, null);
                }
                ArraysKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
            }
        }
        MutableScatterSet mutableScatterSet = this.movingAwayKeys;
        Object[] objArr4 = mutableScatterSet.elements;
        long[] jArr6 = mutableScatterSet.metadata;
        int length3 = jArr6.length - i2;
        if (length3 >= 0) {
            int i27 = 0;
            while (true) {
                long j3 = jArr6[i27];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i28 = 8 - ((~(i27 - length3)) >>> 31);
                    long j4 = j3;
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j4 & 255) < 128) {
                            Object obj = objArr4[(i27 << 3) + i29];
                            jArr2 = jArr6;
                            ItemInfo itemInfo3 = (ItemInfo) this.keyToItemInfoMap.O(obj);
                            if (itemInfo3 != null) {
                                objArr2 = objArr4;
                                int iT2 = keyIndexMap.t(obj);
                                i7 = i29;
                                itemInfo3.mUb(Math.min(i14, itemInfo3.getSpan()));
                                itemInfo3.xMQ(Math.min(i14 - itemInfo3.getSpan(), itemInfo3.getLane()));
                                if (iT2 == -1) {
                                    LazyLayoutItemAnimation[] animations3 = itemInfo3.getAnimations();
                                    int length4 = animations3.length;
                                    int i30 = 0;
                                    int i31 = 0;
                                    boolean z5 = false;
                                    while (i30 < length4) {
                                        ItemInfo itemInfo4 = itemInfo3;
                                        LazyLayoutItemAnimation lazyLayoutItemAnimation4 = animations3[i30];
                                        int i32 = i31 + 1;
                                        if (lazyLayoutItemAnimation4 != null) {
                                            if (lazyLayoutItemAnimation4.S()) {
                                                lazyLayoutItemAnimationArr = animations3;
                                            } else if (lazyLayoutItemAnimation4.XQ()) {
                                                lazyLayoutItemAnimation4.ViF();
                                                itemInfo4.getAnimations()[i31] = null;
                                                lazyLayoutItemAnimationArr = animations3;
                                                this.disappearingItems.remove(lazyLayoutItemAnimation4);
                                                DrawModifierNode drawModifierNode2 = this.displayingNode;
                                                if (drawModifierNode2 != null) {
                                                    DrawModifierNodeKt.n(drawModifierNode2);
                                                    Unit unit3 = Unit.INSTANCE;
                                                }
                                            } else {
                                                lazyLayoutItemAnimationArr = animations3;
                                                if (lazyLayoutItemAnimation4.getLayer() != null) {
                                                    lazyLayoutItemAnimation4.qie();
                                                }
                                                if (lazyLayoutItemAnimation4.S()) {
                                                    this.disappearingItems.add(lazyLayoutItemAnimation4);
                                                    DrawModifierNode drawModifierNode3 = this.displayingNode;
                                                    if (drawModifierNode3 != null) {
                                                        DrawModifierNodeKt.n(drawModifierNode3);
                                                        Unit unit4 = Unit.INSTANCE;
                                                    }
                                                } else {
                                                    lazyLayoutItemAnimation4.ViF();
                                                    itemInfo4.getAnimations()[i31] = null;
                                                    i30++;
                                                    itemInfo3 = itemInfo4;
                                                    i31 = i32;
                                                    animations3 = lazyLayoutItemAnimationArr;
                                                }
                                            }
                                            z5 = true;
                                            i30++;
                                            itemInfo3 = itemInfo4;
                                            i31 = i32;
                                            animations3 = lazyLayoutItemAnimationArr;
                                        } else {
                                            lazyLayoutItemAnimationArr = animations3;
                                        }
                                        i30++;
                                        itemInfo3 = itemInfo4;
                                        i31 = i32;
                                        animations3 = lazyLayoutItemAnimationArr;
                                    }
                                    if (!z5) {
                                        HI(obj);
                                    }
                                } else {
                                    Constraints constraints = itemInfo3.getConstraints();
                                    Intrinsics.checkNotNull(constraints);
                                    LazyLayoutMeasuredItem lazyLayoutMeasuredItemN = itemProvider.n(iT2, itemInfo3.getLane(), itemInfo3.getSpan(), constraints.getValue());
                                    lazyLayoutMeasuredItemN.J2(true);
                                    LazyLayoutItemAnimation[] animations4 = itemInfo3.getAnimations();
                                    int length5 = animations4.length;
                                    int i33 = 0;
                                    while (true) {
                                        if (i33 < length5) {
                                            LazyLayoutItemAnimation lazyLayoutItemAnimation5 = animations4[i33];
                                            int i34 = i33;
                                            if (lazyLayoutItemAnimation5 != null) {
                                                boolean zWPU = lazyLayoutItemAnimation5.WPU();
                                                i8 = length5;
                                                if (zWPU) {
                                                    break;
                                                }
                                            } else {
                                                i8 = length5;
                                            }
                                            i33 = i34 + 1;
                                            length5 = i8;
                                        } else if (lazyLayoutKeyIndexMap4 == null || iT2 != lazyLayoutKeyIndexMap4.t(obj)) {
                                            break;
                                        } else {
                                            HI(obj);
                                        }
                                    }
                                    itemInfo3.gh(lazyLayoutMeasuredItemN, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, itemInfo3.getCrossAxisOffset());
                                    if (iT2 < this.firstVisibleIndex) {
                                        this.movingAwayToStartBound.add(lazyLayoutMeasuredItemN);
                                    } else {
                                        this.movingAwayToEndBound.add(lazyLayoutMeasuredItemN);
                                    }
                                }
                            }
                            j4 >>= 8;
                            i29 = i7 + 1;
                            i14 = laneCount;
                            jArr6 = jArr2;
                            objArr4 = objArr2;
                        } else {
                            jArr2 = jArr6;
                        }
                        objArr2 = objArr4;
                        i7 = i29;
                        j4 >>= 8;
                        i29 = i7 + 1;
                        i14 = laneCount;
                        jArr6 = jArr2;
                        objArr4 = objArr2;
                    }
                    jArr = jArr6;
                    objArr = objArr4;
                    i3 = 1;
                    if (i28 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    objArr = objArr4;
                    i3 = 1;
                }
                if (i27 == length3) {
                    break;
                }
                i27 += i3;
                i14 = laneCount;
                jArr6 = jArr;
                objArr4 = objArr;
            }
        } else {
            i3 = 1;
        }
        if (this.movingAwayToStartBound.isEmpty()) {
            i5 = layoutWidth;
        } else {
            List list5 = this.movingAwayToStartBound;
            if (list5.size() > i3) {
                CollectionsKt.sortWith(list5, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return ComparisonsKt.compareValues(Integer.valueOf(keyIndexMap.t(((LazyLayoutMeasuredItem) obj3).getKey())), Integer.valueOf(keyIndexMap.t(((LazyLayoutMeasuredItem) obj2).getKey())));
                    }
                });
            }
            List list6 = this.movingAwayToStartBound;
            int size5 = list6.size();
            for (int i35 = 0; i35 < size5; i35++) {
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem5 = (LazyLayoutMeasuredItem) list6.get(i35);
                Object objO = this.keyToItemInfoMap.O(lazyLayoutMeasuredItem5.getKey());
                Intrinsics.checkNotNull(objO);
                ItemInfo itemInfo5 = (ItemInfo) objO;
                lazyLayoutMeasuredItem5.qie((isLookingAhead ? KN((LazyLayoutMeasuredItem) CollectionsKt.first(positionedItems)) : itemInfo5.getLayoutMinOffset()) - o(iArr, lazyLayoutMeasuredItem5), itemInfo5.getCrossAxisOffset(), layoutWidth, layoutHeight);
                if (z2) {
                    Ik(lazyLayoutMeasuredItem5, true);
                }
            }
            i5 = layoutWidth;
            ArraysKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List list7 = this.movingAwayToEndBound;
            if (list7.size() > 1) {
                CollectionsKt.sortWith(list7, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return ComparisonsKt.compareValues(Integer.valueOf(keyIndexMap.t(((LazyLayoutMeasuredItem) obj2).getKey())), Integer.valueOf(keyIndexMap.t(((LazyLayoutMeasuredItem) obj3).getKey())));
                    }
                });
            }
            List list8 = this.movingAwayToEndBound;
            int size6 = list8.size();
            for (int i36 = 0; i36 < size6; i36++) {
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem6 = (LazyLayoutMeasuredItem) list8.get(i36);
                Object objO2 = this.keyToItemInfoMap.O(lazyLayoutMeasuredItem6.getKey());
                Intrinsics.checkNotNull(objO2);
                ItemInfo itemInfo6 = (ItemInfo) objO2;
                int iO = o(iArr, lazyLayoutMeasuredItem6);
                if (isLookingAhead) {
                    LazyLayoutMeasuredItem lazyLayoutMeasuredItem7 = (LazyLayoutMeasuredItem) CollectionsKt.last(positionedItems);
                    layoutMaxOffset2 = KN(lazyLayoutMeasuredItem7) + lazyLayoutMeasuredItem7.getMainAxisSizeWithSpacings();
                } else {
                    layoutMaxOffset2 = itemInfo6.getLayoutMaxOffset();
                }
                lazyLayoutMeasuredItem6.qie((layoutMaxOffset2 - lazyLayoutMeasuredItem6.getMainAxisSizeWithSpacings()) + iO, itemInfo6.getCrossAxisOffset(), i5, layoutHeight);
                if (z2) {
                    Ik(lazyLayoutMeasuredItem6, true);
                }
            }
        }
        List list9 = this.movingAwayToStartBound;
        CollectionsKt.reverse(list9);
        Unit unit5 = Unit.INSTANCE;
        positionedItems.addAll(0, list9);
        positionedItems.addAll(this.movingAwayToEndBound);
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.ty();
    }

    private final void HI(Object key) {
        LazyLayoutItemAnimation[] animations;
        ItemInfo itemInfo = (ItemInfo) this.keyToItemInfoMap.XQ(key);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.ViF();
            }
        }
    }

    private final void Ik(LazyLayoutMeasuredItem item, boolean isMovingAway) {
        Object objO = this.keyToItemInfoMap.O(item.getKey());
        Intrinsics.checkNotNull(objO);
        LazyLayoutItemAnimation[] animations = ((ItemInfo) objO).getAnimations();
        int length = animations.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i2];
            int i5 = i3 + 1;
            if (lazyLayoutItemAnimation != null) {
                long jHI = item.HI(i3);
                long rawOffset = lazyLayoutItemAnimation.getRawOffset();
                if (!IntOffset.mUb(rawOffset, LazyLayoutItemAnimation.INSTANCE.n()) && !IntOffset.mUb(rawOffset, jHI)) {
                    lazyLayoutItemAnimation.az(IntOffset.ty(jHI, rawOffset), isMovingAway);
                }
                lazyLayoutItemAnimation.nHg(jHI);
            }
            i2++;
            i3 = i5;
        }
    }

    static /* synthetic */ void qie(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i2, ItemInfo itemInfo, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            Object objO = lazyLayoutItemAnimator.keyToItemInfoMap.O(lazyLayoutMeasuredItem.getKey());
            Intrinsics.checkNotNull(objO);
            itemInfo = (ItemInfo) objO;
        }
        lazyLayoutItemAnimator.gh(lazyLayoutMeasuredItem, i2, itemInfo);
    }

    static /* synthetic */ void r(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        lazyLayoutItemAnimator.Ik(lazyLayoutMeasuredItem, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void ty() {
        if (this.keyToItemInfoMap.xMQ()) {
            MutableScatterMap mutableScatterMap = this.keyToItemInfoMap;
            Object[] objArr = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i3; i5++) {
                            if ((255 & j2) < 128) {
                                for (LazyLayoutItemAnimation lazyLayoutItemAnimation : ((ItemInfo) objArr[(i2 << 3) + i5]).getAnimations()) {
                                    if (lazyLayoutItemAnimation != null) {
                                        lazyLayoutItemAnimation.ViF();
                                    }
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            this.keyToItemInfoMap.gh();
        }
    }

    public final LazyLayoutItemAnimation O(Object key, int placeableIndex) {
        LazyLayoutItemAnimation[] animations;
        ItemInfo itemInfo = (ItemInfo) this.keyToItemInfoMap.O(key);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    public final long xMQ() {
        long jN = IntSize.INSTANCE.n();
        List list = this.disappearingItems;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i2);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                int iMax = Math.max((int) (jN >> 32), IntOffset.gh(lazyLayoutItemAnimation.getRawOffset()) + ((int) (layer.getSize() >> 32)));
                jN = IntSize.t((((long) Math.max((int) (jN & 4294967295L), IntOffset.qie(lazyLayoutItemAnimation.getRawOffset()) + ((int) (layer.getSize() & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32));
            }
        }
        return jN;
    }

    private final boolean Uo(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        int iT = lazyLayoutMeasuredItem.t();
        for (int i2 = 0; i2 < iT; i2++) {
            if (LazyLayoutItemAnimatorKt.t(lazyLayoutMeasuredItem.ty(i2)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int o(int[] iArr, LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        int iNr = lazyLayoutMeasuredItem.getLane();
        int iKN = lazyLayoutMeasuredItem.getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_SPAN java.lang.String() + iNr;
        int iMax = 0;
        while (iNr < iKN) {
            int iAz = iArr[iNr] + lazyLayoutMeasuredItem.getMainAxisSizeWithSpacings();
            iArr[iNr] = iAz;
            iMax = Math.max(iMax, iAz);
            iNr++;
        }
        return iMax;
    }

    public final void ck() {
        ty();
        this.keyIndexMap = null;
        this.firstVisibleIndex = -1;
    }
}
