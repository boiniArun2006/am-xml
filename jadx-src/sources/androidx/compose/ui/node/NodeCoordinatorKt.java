package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/layout/AlignmentLine;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "", "", "b", "", "t", "(Landroidx/collection/MutableObjectIntMap;Ljava/util/Map;)Z", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/NodeKind;", "type", "stopType", "Landroidx/compose/ui/Modifier$Node;", "nr", "(Landroidx/compose/ui/node/DelegatableNode;II)Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinatorKt\n+ 2 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1619:1\n395#2,4:1620\n367#2,6:1624\n377#2,3:1631\n380#2,9:1635\n399#2:1644\n1399#3:1630\n1270#3:1634\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinatorKt\n*L\n1548#1:1620,4\n1548#1:1624,6\n1548#1:1631,3\n1548#1:1635,9\n1548#1:1644\n1548#1:1630\n1548#1:1634\n*E\n"})
public final class NodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean t(MutableObjectIntMap mutableObjectIntMap, Map map) {
        if (mutableObjectIntMap == null || mutableObjectIntMap.get_size() != map.size()) {
            return false;
        }
        Object[] objArr = mutableObjectIntMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        int[] iArr = mutableObjectIntMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = mutableObjectIntMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        loop0: while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i3; i5++) {
                    if ((255 & j2) < 128) {
                        int i7 = (i2 << 3) + i5;
                        Object obj = objArr[i7];
                        int i8 = iArr[i7];
                        Integer num = (Integer) map.get((AlignmentLine) obj);
                        if (num == null || num.intValue() != i8) {
                            break loop0;
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return true;
                }
            }
            if (i2 == length) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node nr(DelegatableNode delegatableNode, int i2, int i3) {
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i2) == 0) {
            return null;
        }
        while (child != null) {
            int kindSet = child.getKindSet();
            if ((kindSet & i3) != 0) {
                return null;
            }
            if ((kindSet & i2) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
