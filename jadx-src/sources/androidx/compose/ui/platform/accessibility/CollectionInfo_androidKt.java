package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\n \u0011*\u0004\u0018\u00010\u00160\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001b\u001a\u00020\b*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "", "nr", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "O", "", "rl", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "", "items", c.f62177j, "(Ljava/util/List;)Z", "Landroidx/compose/ui/semantics/CollectionInfo;", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;", "kotlin.jvm.PlatformType", "J2", "(Landroidx/compose/ui/semantics/CollectionInfo;)Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "itemNode", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;", "Uo", "(Landroidx/compose/ui/semantics/CollectionItemInfo;Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;", "t", "(Landroidx/compose/ui/semantics/CollectionInfo;)Z", "isLazyCollection", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCollectionInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,158:1\n34#2,6:159\n34#2,6:165\n367#2,8:171\n375#2,3:189\n398#2,7:192\n65#3:179\n69#3:182\n71#3:199\n65#3:200\n73#3:203\n69#3:204\n60#4:180\n70#4:183\n53#4,3:186\n60#4:201\n70#4:205\n22#5:181\n22#5:184\n22#5:202\n22#5:206\n30#6:185\n*S KotlinDebug\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n*L\n43#1:159,6\n87#1:165,6\n124#1:171,8\n124#1:189,3\n133#1:192,7\n126#1:179\n127#1:182\n131#1:199\n131#1:200\n130#1:203\n130#1:204\n126#1:180\n127#1:183\n125#1:186,3\n131#1:201\n130#1:205\n126#1:181\n127#1:184\n131#1:202\n130#1:206\n125#1:185\n*E\n"})
public final class CollectionInfo_androidKt {
    private static final AccessibilityNodeInfoCompat.CollectionInfoCompat J2(CollectionInfo collectionInfo) {
        return AccessibilityNodeInfoCompat.CollectionInfoCompat.rl(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    public static final void O(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i2;
        int i3;
        SemanticsConfiguration semanticsConfigurationTy = semanticsNode.ty();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.n(semanticsConfigurationTy, semanticsProperties.rl());
        if (collectionItemInfo != null) {
            accessibilityNodeInfoCompat.G7(Uo(collectionItemInfo, semanticsNode));
        }
        SemanticsNode semanticsNodeR = semanticsNode.r();
        if (semanticsNodeR != null && SemanticsConfigurationKt.n(semanticsNodeR.ty(), semanticsProperties.fD()) != null) {
            CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.n(semanticsNodeR.ty(), semanticsProperties.n());
            if ((collectionInfo == null || !t(collectionInfo)) && semanticsNode.ty().J2(semanticsProperties.E2())) {
                ArrayList arrayList = new ArrayList();
                List listZ = semanticsNodeR.Z();
                int size = listZ.size();
                int i5 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    SemanticsNode semanticsNode2 = (SemanticsNode) listZ.get(i7);
                    if (semanticsNode2.ty().J2(SemanticsProperties.f33276n.E2())) {
                        arrayList.add(semanticsNode2);
                        if (semanticsNode2.getLayoutNode().Org() < semanticsNode.getLayoutNode().Org()) {
                            i5++;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean zN = n(arrayList);
                    if (zN) {
                        i2 = 0;
                    } else {
                        i2 = i5;
                    }
                    if (zN) {
                        i3 = i5;
                    } else {
                        i3 = 0;
                    }
                    AccessibilityNodeInfoCompat.CollectionItemInfoCompat collectionItemInfoCompatN = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.n(i2, 1, i3, 1, false, ((Boolean) semanticsNode.ty().mUb(SemanticsProperties.f33276n.E2(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke() {
                            return Boolean.FALSE;
                        }
                    })).booleanValue());
                    if (collectionItemInfoCompatN != null) {
                        accessibilityNodeInfoCompat.G7(collectionItemInfoCompatN);
                    }
                }
            }
        }
    }

    private static final AccessibilityNodeInfoCompat.CollectionItemInfoCompat Uo(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return AccessibilityNodeInfoCompat.CollectionItemInfoCompat.n(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((Boolean) semanticsNode.ty().mUb(SemanticsProperties.f33276n.E2(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue());
    }

    private static final boolean n(List list) {
        List listEmptyList;
        long packedValue;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            Object obj = list.get(0);
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i2 = 0;
            while (i2 < lastIndex) {
                i2++;
                Object obj2 = list.get(i2);
                SemanticsNode semanticsNode = (SemanticsNode) obj2;
                SemanticsNode semanticsNode2 = (SemanticsNode) obj;
                arrayList.add(Offset.nr(Offset.O((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode2.xMQ().az() >> 32)) - Float.intBitsToFloat((int) (semanticsNode.xMQ().az() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode2.xMQ().az() & 4294967295L)) - Float.intBitsToFloat((int) (semanticsNode.xMQ().az() & 4294967295L))))) & 4294967295L))));
                obj = obj2;
            }
            listEmptyList = arrayList;
        }
        if (listEmptyList.size() == 1) {
            packedValue = ((Offset) CollectionsKt.first(listEmptyList)).getPackedValue();
        } else {
            if (listEmptyList.isEmpty()) {
                ListUtilsKt.J2("Empty collection can't be reduced.");
            }
            Object objFirst = CollectionsKt.first((List<? extends Object>) listEmptyList);
            int lastIndex2 = CollectionsKt.getLastIndex(listEmptyList);
            if (1 <= lastIndex2) {
                int i3 = 1;
                while (true) {
                    objFirst = Offset.nr(Offset.Ik(((Offset) objFirst).getPackedValue(), ((Offset) listEmptyList.get(i3)).getPackedValue()));
                    if (i3 == lastIndex2) {
                        break;
                    }
                    i3++;
                }
            }
            packedValue = ((Offset) objFirst).getPackedValue();
        }
        if (Float.intBitsToFloat((int) (4294967295L & packedValue)) < Float.intBitsToFloat((int) (packedValue >> 32))) {
            return true;
        }
        return false;
    }

    public static final void nr(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int size;
        SemanticsConfiguration semanticsConfigurationTy = semanticsNode.ty();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.n(semanticsConfigurationTy, semanticsProperties.n());
        if (collectionInfo != null) {
            accessibilityNodeInfoCompat.Mx(J2(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.n(semanticsNode.ty(), semanticsProperties.fD()) != null) {
            List listZ = semanticsNode.Z();
            int size2 = listZ.size();
            for (int i2 = 0; i2 < size2; i2++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) listZ.get(i2);
                if (semanticsNode2.ty().J2(SemanticsProperties.f33276n.E2())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean zN = n(arrayList);
            int size3 = 1;
            if (zN) {
                size = 1;
            } else {
                size = arrayList.size();
            }
            if (zN) {
                size3 = arrayList.size();
            }
            accessibilityNodeInfoCompat.Mx(AccessibilityNodeInfoCompat.CollectionInfoCompat.rl(size, size3, false, 0));
        }
    }

    public static final boolean rl(SemanticsNode semanticsNode) {
        SemanticsConfiguration semanticsConfigurationTy = semanticsNode.ty();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        if (SemanticsConfigurationKt.n(semanticsConfigurationTy, semanticsProperties.n()) == null && SemanticsConfigurationKt.n(semanticsNode.ty(), semanticsProperties.fD()) == null) {
            return false;
        }
        return true;
    }

    private static final boolean t(CollectionInfo collectionInfo) {
        if (collectionInfo.getRowCount() >= 0 && collectionInfo.getColumnCount() >= 0) {
            return false;
        }
        return true;
    }
}
