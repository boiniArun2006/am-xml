package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.collection.MultiValueMap;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b#\u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\"\u0010.\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010(\u001a\u0004\b$\u0010*\"\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R-\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003048FX\u0086\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b+\u00107R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003098F¢\u0006\u0006\u001a\u0004\b5\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/runtime/Pending;", "", "", "Landroidx/compose/runtime/KeyInfo;", "keyInfos", "", "startIndex", "<init>", "(Ljava/util/List;I)V", "key", "dataKey", "nr", "(ILjava/lang/Object;)Landroidx/compose/runtime/KeyInfo;", "keyInfo", "", "KN", "(Landroidx/compose/runtime/KeyInfo;)Z", "from", "to", "", "gh", "(II)V", JavetError.PARAMETER_COUNT, "mUb", "(III)V", "insertIndex", "xMQ", "(Landroidx/compose/runtime/KeyInfo;I)V", "group", "newCount", "ty", "(II)Z", "az", "(Landroidx/compose/runtime/KeyInfo;)I", "Uo", "HI", c.f62177j, "Ljava/util/List;", "rl", "()Ljava/util/List;", "I", "O", "()I", "t", "qie", "(I)V", "groupIndex", "usedKeys", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/runtime/GroupInfo;", "Landroidx/collection/MutableIntObjectMap;", "groupInfos", "Landroidx/compose/runtime/collection/MultiValueMap;", "J2", "Lkotlin/Lazy;", "()Landroidx/collection/MutableScatterMap;", "keyMap", "", "used", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,4891:1\n33#2,5:4892\n397#3,3:4897\n354#3,6:4900\n364#3,3:4907\n367#3,9:4911\n400#3:4920\n397#3,3:4921\n354#3,6:4924\n364#3,3:4931\n367#3,9:4935\n400#3:4944\n397#3,3:4945\n354#3,6:4948\n364#3,3:4955\n367#3,9:4959\n400#3:4968\n397#3,3:4969\n354#3,6:4972\n364#3,3:4979\n367#3,9:4983\n400#3:4992\n397#3,3:4993\n354#3,6:4996\n364#3,3:5003\n367#3,9:5007\n400#3:5016\n1399#4:4906\n1270#4:4910\n1399#4:4930\n1270#4:4934\n1399#4:4954\n1270#4:4958\n1399#4:4978\n1270#4:4982\n1399#4:5002\n1270#4:5006\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n*L\n135#1:4892,5\n179#1:4897,3\n179#1:4900,6\n179#1:4907,3\n179#1:4911,9\n179#1:4920\n185#1:4921,3\n185#1:4924,6\n185#1:4931,3\n185#1:4935,9\n185#1:4944\n195#1:4945,3\n195#1:4948,6\n195#1:4955,3\n195#1:4959,9\n195#1:4968\n201#1:4969,3\n201#1:4972,6\n201#1:4979,3\n201#1:4983,9\n201#1:4992\n221#1:4993,3\n221#1:4996,6\n221#1:5003,3\n221#1:5007,9\n221#1:5016\n179#1:4906\n179#1:4910\n185#1:4930\n185#1:4934\n195#1:4954\n195#1:4958\n201#1:4978\n201#1:4982\n221#1:5002\n221#1:5006\n*E\n"})
final class Pending {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Lazy keyMap;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableIntObjectMap groupInfos;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List keyInfos;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final List usedKeys;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int startIndex;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int groupIndex;

    public final int HI(KeyInfo keyInfo) {
        GroupInfo groupInfo = (GroupInfo) this.groupInfos.rl(keyInfo.getLocation());
        return groupInfo != null ? groupInfo.getNodeCount() : keyInfo.getNodes();
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final List getUsedKeys() {
        return this.usedKeys;
    }

    public final boolean KN(KeyInfo keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int Uo(KeyInfo keyInfo) {
        GroupInfo groupInfo = (GroupInfo) this.groupInfos.rl(keyInfo.getLocation());
        if (groupInfo != null) {
            return groupInfo.getNodeIndex();
        }
        return -1;
    }

    public final int az(KeyInfo keyInfo) {
        GroupInfo groupInfo = (GroupInfo) this.groupInfos.rl(keyInfo.getLocation());
        if (groupInfo != null) {
            return groupInfo.getSlotIndex();
        }
        return -1;
    }

    public final void gh(int from, int to) {
        char c2;
        long j2;
        char c4;
        long j3;
        char c5 = 7;
        long j4 = -9187201950435737472L;
        if (from > to) {
            MutableIntObjectMap mutableIntObjectMap = this.groupInfos;
            Object[] objArr = mutableIntObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j5 = jArr[i2];
                if ((((~j5) << c5) & j5 & j4) != j4) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i3) {
                        if ((j5 & 255) < 128) {
                            c4 = c5;
                            GroupInfo groupInfo = (GroupInfo) objArr[(i2 << 3) + i5];
                            j3 = j4;
                            int slotIndex = groupInfo.getSlotIndex();
                            if (slotIndex == from) {
                                groupInfo.J2(to);
                            } else if (to <= slotIndex && slotIndex < from) {
                                groupInfo.J2(slotIndex + 1);
                            }
                        } else {
                            c4 = c5;
                            j3 = j4;
                        }
                        j5 >>= 8;
                        i5++;
                        c5 = c4;
                        j4 = j3;
                    }
                    c2 = c5;
                    j2 = j4;
                    if (i3 != 8) {
                        return;
                    }
                } else {
                    c2 = c5;
                    j2 = j4;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                c5 = c2;
                j4 = j2;
            }
        } else {
            if (to <= from) {
                return;
            }
            MutableIntObjectMap mutableIntObjectMap2 = this.groupInfos;
            Object[] objArr2 = mutableIntObjectMap2.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr2 = mutableIntObjectMap2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i7 = 0;
            while (true) {
                long j6 = jArr2[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((j6 & 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i7 << 3) + i9];
                            int slotIndex2 = groupInfo2.getSlotIndex();
                            if (slotIndex2 == from) {
                                groupInfo2.J2(to);
                            } else if (from + 1 <= slotIndex2 && slotIndex2 < to) {
                                groupInfo2.J2(slotIndex2 - 1);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        return;
                    }
                }
                if (i7 == length2) {
                    return;
                } else {
                    i7++;
                }
            }
        }
    }

    public final void mUb(int from, int to, int count) {
        char c2;
        long j2;
        char c4;
        long j3;
        char c5 = 7;
        long j4 = -9187201950435737472L;
        if (from > to) {
            MutableIntObjectMap mutableIntObjectMap = this.groupInfos;
            Object[] objArr = mutableIntObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j5 = jArr[i2];
                if ((((~j5) << c5) & j5 & j4) != j4) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i3) {
                        if ((j5 & 255) < 128) {
                            c4 = c5;
                            GroupInfo groupInfo = (GroupInfo) objArr[(i2 << 3) + i5];
                            j3 = j4;
                            int nodeIndex = groupInfo.getNodeIndex();
                            if (from <= nodeIndex && nodeIndex < from + count) {
                                groupInfo.O((nodeIndex - from) + to);
                            } else if (to <= nodeIndex && nodeIndex < from) {
                                groupInfo.O(nodeIndex + count);
                            }
                        } else {
                            c4 = c5;
                            j3 = j4;
                        }
                        j5 >>= 8;
                        i5++;
                        c5 = c4;
                        j4 = j3;
                    }
                    c2 = c5;
                    j2 = j4;
                    if (i3 != 8) {
                        return;
                    }
                } else {
                    c2 = c5;
                    j2 = j4;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                c5 = c2;
                j4 = j2;
            }
        } else {
            if (to <= from) {
                return;
            }
            MutableIntObjectMap mutableIntObjectMap2 = this.groupInfos;
            Object[] objArr2 = mutableIntObjectMap2.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr2 = mutableIntObjectMap2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i7 = 0;
            while (true) {
                long j6 = jArr2[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((j6 & 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i7 << 3) + i9];
                            int nodeIndex2 = groupInfo2.getNodeIndex();
                            if (from <= nodeIndex2 && nodeIndex2 < from + count) {
                                groupInfo2.O((nodeIndex2 - from) + to);
                            } else if (from + 1 <= nodeIndex2 && nodeIndex2 < to) {
                                groupInfo2.O(nodeIndex2 - count);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        return;
                    }
                }
                if (i7 == length2) {
                    return;
                } else {
                    i7++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final KeyInfo nr(int key, Object dataKey) {
        return (KeyInfo) MultiValueMap.qie(t(), dataKey != null ? new JoinedKey(Integer.valueOf(key), dataKey) : Integer.valueOf(key));
    }

    public final void qie(int i2) {
        this.groupIndex = i2;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final List getKeyInfos() {
        return this.keyInfos;
    }

    public final MutableScatterMap t() {
        return ((MultiValueMap) this.keyMap.getValue()).getMap();
    }

    public final boolean ty(int group, int newCount) {
        int nodeIndex;
        GroupInfo groupInfo = (GroupInfo) this.groupInfos.rl(group);
        if (groupInfo == null) {
            return false;
        }
        int nodeIndex2 = groupInfo.getNodeIndex();
        int nodeCount = newCount - groupInfo.getNodeCount();
        groupInfo.nr(newCount);
        if (nodeCount == 0) {
            return true;
        }
        MutableIntObjectMap mutableIntObjectMap = this.groupInfos;
        Object[] objArr = mutableIntObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i3; i5++) {
                    if ((255 & j2) < 128) {
                        GroupInfo groupInfo2 = (GroupInfo) objArr[(i2 << 3) + i5];
                        if (groupInfo2.getNodeIndex() >= nodeIndex2 && !Intrinsics.areEqual(groupInfo2, groupInfo) && (nodeIndex = groupInfo2.getNodeIndex() + nodeCount) >= 0) {
                            groupInfo2.O(nodeIndex);
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

    public final void xMQ(KeyInfo keyInfo, int insertIndex) {
        this.groupInfos.r(keyInfo.getLocation(), new GroupInfo(-1, insertIndex, 0));
    }

    public Pending(List list, int i2) {
        boolean z2;
        this.keyInfos = list;
        this.startIndex = i2;
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            PreconditionsKt.n("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        int size = list.size();
        int nodes = 0;
        for (int i3 = 0; i3 < size; i3++) {
            KeyInfo keyInfo = (KeyInfo) this.keyInfos.get(i3);
            mutableIntObjectMap.r(keyInfo.getLocation(), new GroupInfo(i3, nodes, keyInfo.getNodes()));
            nodes += keyInfo.getNodes();
        }
        this.groupInfos = mutableIntObjectMap;
        this.keyMap = LazyKt.lazy(new Function0<MultiValueMap<Object, KeyInfo>>() { // from class: androidx.compose.runtime.Pending$keyMap$2
            {
                super(0);
            }

            public final MutableScatterMap n() {
                MutableScatterMap mutableScatterMapRV9 = ComposerKt.rV9(this.f30258n.getKeyInfos().size());
                Pending pending = this.f30258n;
                int size2 = pending.getKeyInfos().size();
                for (int i5 = 0; i5 < size2; i5++) {
                    KeyInfo keyInfo2 = (KeyInfo) pending.getKeyInfos().get(i5);
                    MultiValueMap.n(mutableScatterMapRV9, ComposerKt.E2(keyInfo2), keyInfo2);
                }
                return mutableScatterMapRV9;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ MultiValueMap<Object, KeyInfo> invoke() {
                return MultiValueMap.rl(n());
            }
        });
    }
}
