package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.R;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.LayoutDirection;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a)\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u000f\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001aY\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00132\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0019j\b\u0012\u0004\u0012\u00020\u0013`\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00150\u001c2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001aS\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0011\u001a\u00020\u00022\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0019j\b\u0012\u0004\u0012\u00020\u0013`\u001a2\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00150\u001cH\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010)\u001a!\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010,\u001a!\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010,\u001a\u0017\u0010.\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b.\u0010/\u001aS\u00103\u001a\u00020\u00022:\u00102\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0015000\u0019j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001500`\u001a2\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b3\u00104\u001a\u0013\u00105\u001a\u00020\u0002*\u00020\u0013H\u0002¢\u0006\u0004\b5\u0010/\u001a\u001b\u00108\u001a\u00020\u0002*\u00020\u00132\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109\u001a\u0013\u0010:\u001a\u00020\u0002*\u00020\u0013H\u0002¢\u0006\u0004\b:\u0010/\u001a!\u0010>\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030;2\b\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b>\u0010?\"*\u0010E\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130Aj\b\u0012\u0004\u0012\u00020\u0013`B0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D\"&\u0010J\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020G0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I\"\u0018\u0010L\u001a\u00020\u0002*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010/¨\u0006M"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "", "selector", "Ik", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/LayoutNode;", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "Landroidx/collection/MutableIntIntMap;", "outputBeforeMap", "outputAfterMap", "Landroid/content/res/Resources;", "resources", "", "nY", "(Landroidx/collection/IntObjectMap;Landroidx/collection/MutableIntIntMap;Landroidx/collection/MutableIntIntMap;Landroid/content/res/Resources;)V", "layoutIsRtl", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "listToSort", "", "iF", "(ZLjava/util/List;Landroidx/collection/IntObjectMap;Landroid/content/res/Resources;)Ljava/util/List;", "currNode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "geometryList", "Landroidx/collection/MutableIntObjectMap;", "containerMapToChildren", "r", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/ArrayList;Landroidx/collection/MutableIntObjectMap;Landroidx/collection/IntObjectMap;Landroid/content/res/Resources;)V", "parentListToSort", "containerChildrenMapping", "g", "(ZLjava/util/ArrayList;Landroid/content/res/Resources;Landroidx/collection/MutableIntObjectMap;)Ljava/util/List;", "node", "WPU", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroid/content/res/Resources;)Z", "Landroidx/compose/ui/text/AnnotatedString;", "XQ", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/text/AnnotatedString;", "", "Z", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroid/content/res/Resources;)Ljava/lang/String;", "ty", "o", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "rowGroupings", "aYN", "(Ljava/util/ArrayList;Landroidx/compose/ui/semantics/SemanticsNode;)Z", "HI", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "oldConfig", "ViF", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "ck", "Landroidx/compose/ui/semantics/AccessibilityAction;", "", InneractiveMediationNameConsts.OTHER, "az", "(Landroidx/compose/ui/semantics/AccessibilityAction;Ljava/lang/Object;)Z", "", "Ljava/util/Comparator;", "Lkotlin/Comparator;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "[Ljava/util/Comparator;", "semanticComparators", "Lkotlin/Function2;", "", "rl", "Lkotlin/jvm/functions/Function2;", "UnmergedConfigComparator", "S", "isRtl", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3362:1\n34#2,6:3363\n34#2,6:3369\n34#2,6:3375\n65#3,10:3381\n26#4:3391\n1#5:3392\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n*L\n2997#1:3363,6\n3041#1:3369,6\n3089#1:3375,6\n3208#1:3381,10\n3215#1:3391\n*E\n"})
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Comparator[] f32770n;
    private static final Function2 rl;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.f33331n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.f33333t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.f33330O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i2 = 0;
        while (i2 < 2) {
            final Comparator comparator = i2 == 0 ? RtlBoundsComparator.f33047n : LtrBoundsComparator.f33002n;
            final Comparator comparatorRl = LayoutNode.INSTANCE.rl();
            final Comparator comparator2 = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int iCompare = comparator.compare(obj, obj2);
                    return iCompare != 0 ? iCompare : comparatorRl.compare(((SemanticsNode) obj).getLayoutNode(), ((SemanticsNode) obj2).getLayoutNode());
                }
            };
            comparatorArr[i2] = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int iCompare = comparator2.compare(obj, obj2);
                    return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(Integer.valueOf(((SemanticsNode) obj).getId()), Integer.valueOf(((SemanticsNode) obj2).getId()));
                }
            };
            i2++;
        }
        f32770n = comparatorArr;
        rl = new Function2<SemanticsNode, SemanticsNode, Integer>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
                SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
                SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
                return Integer.valueOf(Float.compare(((Number) unmergedConfig.mUb(semanticsProperties.wTp(), new Function0<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue(), ((Number) semanticsNode2.getUnmergedConfig().mUb(semanticsProperties.wTp(), new Function0<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue()));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean az(AccessibilityAction accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!Intrinsics.areEqual(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.getAction() != null || accessibilityAction2.getAction() == null) {
            return accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null;
        }
        return false;
    }

    private static final List g(boolean z2, ArrayList arrayList, Resources resources, MutableIntObjectMap mutableIntObjectMap) {
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int lastIndex = CollectionsKt.getLastIndex(arrayList);
        int size = 0;
        if (lastIndex >= 0) {
            int i2 = 0;
            while (true) {
                SemanticsNode semanticsNode = (SemanticsNode) arrayList.get(i2);
                if (i2 == 0 || !aYN(arrayList2, semanticsNode)) {
                    arrayList2.add(new Pair(semanticsNode.mUb(), CollectionsKt.mutableListOf(semanticsNode)));
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        CollectionsKt.sortWith(arrayList2, TopBottomBoundsComparator.f33063n);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f32770n[!z2 ? 1 : 0];
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Pair pair = (Pair) arrayList2.get(i3);
            CollectionsKt.sortWith((List) pair.getSecond(), comparator);
            arrayList3.addAll((Collection) pair.getSecond());
        }
        final Function2 function2 = rl;
        CollectionsKt.sortWith(arrayList3, new Comparator() { // from class: androidx.compose.ui.platform.aC
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AndroidComposeViewAccessibilityDelegateCompat_androidKt.te(function2, obj, obj2);
            }
        });
        while (size <= CollectionsKt.getLastIndex(arrayList3)) {
            List list = (List) mutableIntObjectMap.rl(((SemanticsNode) arrayList3.get(size)).getId());
            if (list != null) {
                if (WPU((SemanticsNode) arrayList3.get(size), resources)) {
                    size++;
                } else {
                    arrayList3.remove(size);
                }
                arrayList3.addAll(size, list);
                size += list.size();
            } else {
                size++;
            }
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HI(SemanticsNode semanticsNode) {
        return !semanticsNode.ty().J2(SemanticsProperties.f33276n.J2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode Ik(LayoutNode layoutNode, Function1 function1) {
        for (LayoutNode layoutNodeMYa = layoutNode.mYa(); layoutNodeMYa != null; layoutNodeMYa = layoutNodeMYa.mYa()) {
            if (((Boolean) function1.invoke(layoutNodeMYa)).booleanValue()) {
                return layoutNodeMYa;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S(SemanticsNode semanticsNode) {
        if (semanticsNode.ck().getLayoutDirection() == LayoutDirection.f34161t) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ViF(SemanticsNode semanticsNode, SemanticsConfiguration semanticsConfiguration) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!semanticsNode.ty().J2(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WPU(SemanticsNode semanticsNode, Resources resources) {
        String str;
        boolean z2;
        List list = (List) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), SemanticsProperties.f33276n.nr());
        if (list != null) {
            str = (String) CollectionsKt.firstOrNull(list);
        } else {
            str = null;
        }
        if (str == null && XQ(semanticsNode) == null && Z(semanticsNode, resources) == null && !o(semanticsNode)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!SemanticsUtils_androidKt.J2(semanticsNode) && (semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || (semanticsNode.g() && z2))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString XQ(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        AnnotatedString annotatedString2 = (AnnotatedString) SemanticsConfigurationKt.n(unmergedConfig, semanticsProperties.Uo());
        List list = (List) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.T());
        if (list != null) {
            annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list);
        } else {
            annotatedString = null;
        }
        if (annotatedString2 == null) {
            return annotatedString;
        }
        return annotatedString2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String Z(SemanticsNode semanticsNode, Resources resources) {
        boolean z2;
        float current;
        boolean z3;
        boolean zAz;
        boolean zAz2;
        boolean zAz3;
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        Object objN = SemanticsConfigurationKt.n(unmergedConfig, semanticsProperties.e());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.s7N());
        Role role = (Role) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.iF());
        int iCoerceIn = 0;
        if (toggleableState != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3 && objN == null) {
                        objN = resources.getString(R.string.KN);
                    }
                } else {
                    int iUo = Role.INSTANCE.Uo();
                    if (role == null) {
                        zAz3 = false;
                    } else {
                        zAz3 = Role.az(role.getValue(), iUo);
                    }
                    if (zAz3 && objN == null) {
                        objN = resources.getString(R.string.HI);
                    }
                }
            } else {
                int iUo2 = Role.INSTANCE.Uo();
                if (role == null) {
                    zAz2 = false;
                } else {
                    zAz2 = Role.az(role.getValue(), iUo2);
                }
                if (zAz2 && objN == null) {
                    objN = resources.getString(R.string.ck);
                }
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.E2());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            int iKN = Role.INSTANCE.KN();
            if (role == null) {
                zAz = false;
            } else {
                zAz = Role.az(role.getValue(), iKN);
            }
            if (!zAz && objN == null) {
                if (zBooleanValue) {
                    objN = resources.getString(R.string.az);
                } else {
                    objN = resources.getString(R.string.mUb);
                }
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.te());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.n()) {
                if (objN == null) {
                    ClosedFloatingPointRange range = progressBarRangeInfo.getRange();
                    if (((Number) range.getEndInclusive()).floatValue() - ((Number) range.getStart()).floatValue() == 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        current = 0.0f;
                    } else {
                        current = (progressBarRangeInfo.getCurrent() - ((Number) range.getStart()).floatValue()) / (((Number) range.getEndInclusive()).floatValue() - ((Number) range.getStart()).floatValue());
                    }
                    if (current < 0.0f) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    if (current == 0.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        if (current == 1.0f) {
                            iCoerceIn = 1;
                        }
                        if (iCoerceIn != 0) {
                            iCoerceIn = 100;
                        } else {
                            iCoerceIn = RangesKt.coerceIn(Math.round(current * 100), 1, 99);
                        }
                    }
                    objN = resources.getString(R.string.f31093o, Integer.valueOf(iCoerceIn));
                }
            } else if (objN == null) {
                objN = resources.getString(R.string.Uo);
            }
        }
        if (semanticsNode.getUnmergedConfig().J2(semanticsProperties.Uo())) {
            objN = ty(semanticsNode, resources);
        }
        return (String) objN;
    }

    private static final boolean aYN(ArrayList arrayList, SemanticsNode semanticsNode) {
        boolean z2;
        boolean z3;
        float top = semanticsNode.mUb().getTop();
        float fXMQ = semanticsNode.mUb().xMQ();
        if (top >= fXMQ) {
            z2 = true;
        } else {
            z2 = false;
        }
        int lastIndex = CollectionsKt.getLastIndex(arrayList);
        if (lastIndex >= 0) {
            int i2 = 0;
            while (true) {
                Rect rect = (Rect) ((Pair) arrayList.get(i2)).getFirst();
                if (rect.getTop() >= rect.xMQ()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z2 && !z3 && Math.max(top, rect.getTop()) < Math.min(fXMQ, rect.xMQ())) {
                    arrayList.set(i2, new Pair(rect.WPU(0.0f, top, Float.POSITIVE_INFINITY, fXMQ), ((Pair) arrayList.get(i2)).getSecond()));
                    ((List) ((Pair) arrayList.get(i2)).getSecond()).add(semanticsNode);
                    return true;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ck(SemanticsNode semanticsNode) {
        boolean zAreEqual;
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        if (unmergedConfig.J2(semanticsProperties.Uo()) && !Intrinsics.areEqual(SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.xMQ()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode layoutNodeIk = Ik(semanticsNode.getLayoutNode(), new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
            /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(LayoutNode layoutNode) {
                boolean z2;
                SemanticsConfiguration semanticsConfigurationD = layoutNode.D();
                if (semanticsConfigurationD != null) {
                    z2 = true;
                    if (!semanticsConfigurationD.getIsMergingSemanticsOfDescendants() || !semanticsConfigurationD.J2(SemanticsProperties.f33276n.Uo())) {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            }
        });
        if (layoutNodeIk != null) {
            SemanticsConfiguration semanticsConfigurationD = layoutNodeIk.D();
            if (semanticsConfigurationD != null) {
                zAreEqual = Intrinsics.areEqual(SemanticsConfigurationKt.n(semanticsConfigurationD, semanticsProperties.xMQ()), Boolean.TRUE);
            } else {
                zAreEqual = false;
            }
            if (!zAreEqual) {
                return true;
            }
        }
        return false;
    }

    private static final List iF(boolean z2, List list, IntObjectMap intObjectMap, Resources resources) {
        MutableIntObjectMap mutableIntObjectMapT = IntObjectMapKt.t();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            r((SemanticsNode) list.get(i2), arrayList, mutableIntObjectMapT, intObjectMap, resources);
        }
        return g(z2, arrayList, resources, mutableIntObjectMapT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nY(IntObjectMap intObjectMap, MutableIntIntMap mutableIntIntMap, MutableIntIntMap mutableIntIntMap2, Resources resources) {
        SemanticsNode semanticsNode;
        mutableIntIntMap.xMQ();
        mutableIntIntMap2.xMQ();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) intObjectMap.rl(-1);
        if (semanticsNodeWithAdjustedBounds != null) {
            semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        } else {
            semanticsNode = null;
        }
        Intrinsics.checkNotNull(semanticsNode);
        List listIF = iF(S(semanticsNode), CollectionsKt.listOf(semanticsNode), intObjectMap, resources);
        int lastIndex = CollectionsKt.getLastIndex(listIF);
        int i2 = 1;
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int id = ((SemanticsNode) listIF.get(i2 - 1)).getId();
            int id2 = ((SemanticsNode) listIF.get(i2)).getId();
            mutableIntIntMap.Ik(id, id2);
            mutableIntIntMap2.Ik(id2, id);
            if (i2 != lastIndex) {
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(SemanticsNode semanticsNode) {
        boolean z2;
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.n(unmergedConfig, semanticsProperties.s7N());
        Role role = (Role) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.iF());
        boolean zAz = false;
        if (toggleableState != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((Boolean) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.E2())) != null) {
            int iKN = Role.INSTANCE.KN();
            if (role != null) {
                zAz = Role.az(role.getValue(), iKN);
            }
            if (!zAz) {
                return true;
            }
        }
        return z2;
    }

    private static final void r(SemanticsNode semanticsNode, ArrayList arrayList, MutableIntObjectMap mutableIntObjectMap, IntObjectMap intObjectMap, Resources resources) {
        boolean zS = S(semanticsNode);
        boolean zBooleanValue = ((Boolean) semanticsNode.getUnmergedConfig().mUb(SemanticsProperties.f33276n.S(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$geometryDepthFirstSearch$isTraversalGroup$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue();
        if ((zBooleanValue || WPU(semanticsNode, resources)) && intObjectMap.n(semanticsNode.getId())) {
            arrayList.add(semanticsNode);
        }
        if (zBooleanValue) {
            mutableIntObjectMap.r(semanticsNode.getId(), iF(zS, semanticsNode.gh(), intObjectMap, resources));
            return;
        }
        List listGh = semanticsNode.gh();
        int size = listGh.size();
        for (int i2 = 0; i2 < size; i2++) {
            r((SemanticsNode) listGh.get(i2), arrayList, mutableIntObjectMap, intObjectMap, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int te(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private static final String ty(SemanticsNode semanticsNode, Resources resources) {
        SemanticsConfiguration semanticsConfigurationTy = semanticsNode.n().ty();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        Collection collection = (Collection) SemanticsConfigurationKt.n(semanticsConfigurationTy, semanticsProperties.nr());
        if (collection == null || collection.isEmpty()) {
            Collection collection2 = (Collection) SemanticsConfigurationKt.n(semanticsConfigurationTy, semanticsProperties.T());
            if (collection2 == null || collection2.isEmpty()) {
                CharSequence charSequence = (CharSequence) SemanticsConfigurationKt.n(semanticsConfigurationTy, semanticsProperties.Uo());
                if (charSequence != null && charSequence.length() != 0) {
                    return null;
                }
                return resources.getString(R.string.ty);
            }
            return null;
        }
        return null;
    }
}
