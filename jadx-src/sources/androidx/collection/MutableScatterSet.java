package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\r\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0015J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b#\u0010\u0017J\u001b\u0010$\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b$\u0010\u001bJ\u001e\u0010%\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\u0002¢\u0006\u0004\b%\u0010\u001fJ\u001b\u0010'\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0001¢\u0006\u0004\b*\u0010\u0006J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\fJ\u000f\u0010,\u001a\u00020\u0007H\u0000¢\u0006\u0004\b,\u0010\fJ\u000f\u0010-\u001a\u00020\u0007H\u0000¢\u0006\u0004\b-\u0010\fJ\u0017\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0003H\u0000¢\u0006\u0004\b/\u0010\u0006J\u0013\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000¢\u0006\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Landroidx/collection/MutableScatterSet;", "E", "Landroidx/collection/ScatterSet;", "", "initialCapacity", "<init>", "(I)V", "", "Z", "capacity", "o", "r", "()V", "element", "ck", "(Ljava/lang/Object;)I", "hash1", "Ik", "(I)I", "", "xMQ", "(Ljava/lang/Object;)Z", "ViF", "(Ljava/lang/Object;)V", "", "elements", "gh", "(Ljava/lang/Iterable;)Z", "mUb", "(Landroidx/collection/ScatterSet;)Z", "aYN", "(Ljava/lang/Iterable;)V", "WPU", "(Landroidx/collection/ScatterSet;)V", "nY", "S", "g", "XQ", "", "fD", "(Ljava/util/Collection;)Z", "index", "te", "ty", "qie", "HI", "newCapacity", "iF", "", "az", "()Ljava/util/Set;", "O", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 10 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 11 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1210:1\n59#2,5:1211\n1#3:1216\n1254#4,6:1217\n1399#4:1239\n1270#4:1243\n1165#4,3:1273\n1179#4:1277\n1175#4:1280\n1372#4,3:1284\n1386#4,3:1288\n1312#4:1292\n1303#4:1294\n1297#4:1295\n1309#4:1300\n1393#4:1302\n1165#4,3:1312\n1179#4:1316\n1175#4:1319\n1372#4,3:1323\n1386#4,3:1327\n1312#4:1331\n1303#4:1333\n1297#4:1334\n1309#4:1339\n1393#4:1341\n1399#4:1366\n1270#4:1370\n1399#4:1406\n1270#4:1410\n1399#4:1427\n1270#4:1431\n1399#4:1448\n1270#4:1452\n1399#4:1469\n1270#4:1473\n1399#4:1490\n1270#4:1494\n1230#4:1504\n1254#4,6:1505\n1242#4:1511\n1241#4,4:1512\n1254#4,6:1516\n1165#4,3:1522\n1175#4:1525\n1179#4:1526\n1372#4,3:1527\n1386#4,3:1530\n1312#4:1533\n1303#4:1534\n1297#4:1535\n1309#4:1536\n1393#4:1537\n1265#4:1538\n1220#4:1539\n1262#4:1540\n1220#4:1541\n1230#4:1542\n1254#4,6:1543\n1242#4:1549\n1241#4,4:1550\n1372#4,3:1554\n1399#4:1557\n1297#4:1558\n1144#4,14:1559\n1220#4:1573\n1165#4,3:1574\n1175#4:1577\n1179#4:1578\n1254#4,6:1579\n1220#4:1585\n1179#4:1586\n1254#4,6:1587\n1254#4,6:1593\n1179#4:1599\n1254#4,6:1600\n1268#4:1606\n1220#4:1607\n1165#4,3:1608\n1175#4:1611\n1179#4:1612\n1230#4:1613\n1254#4,6:1614\n1242#4:1620\n1241#4,4:1621\n13309#5,2:1223\n13309#5,2:1350\n1855#6,2:1225\n1855#6,2:1354\n1313#7,2:1227\n1313#7,2:1352\n231#8,3:1229\n200#8,7:1232\n211#8,3:1240\n214#8,9:1244\n234#8:1253\n390#8:1272\n391#8:1276\n393#8,2:1278\n395#8,3:1281\n398#8:1287\n399#8:1291\n400#8:1293\n401#8,4:1296\n407#8:1301\n408#8,8:1303\n390#8:1311\n391#8:1315\n393#8,2:1317\n395#8,3:1320\n398#8:1326\n399#8:1330\n400#8:1332\n401#8,4:1335\n407#8:1340\n408#8,8:1342\n231#8,3:1356\n200#8,7:1359\n211#8,3:1367\n214#8,9:1371\n234#8:1380\n200#8,7:1399\n211#8,3:1407\n214#8,9:1411\n200#8,7:1420\n211#8,3:1428\n214#8,9:1432\n200#8,7:1441\n211#8,3:1449\n214#8,9:1453\n200#8,7:1462\n211#8,3:1470\n214#8,9:1474\n200#8,7:1483\n211#8,3:1491\n214#8,9:1495\n301#9,7:1254\n308#9,4:1262\n301#9,7:1381\n308#9,4:1389\n1123#10:1261\n1123#10:1388\n287#11,6:1266\n287#11,6:1393\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n462#1:1211,5\n489#1:1217,6\n632#1:1239\n632#1:1243\n661#1:1273,3\n661#1:1277\n661#1:1280\n661#1:1284,3\n661#1:1288,3\n661#1:1292\n661#1:1294\n661#1:1295\n661#1:1300\n661#1:1302\n675#1:1312,3\n675#1:1316\n675#1:1319\n675#1:1323,3\n675#1:1327,3\n675#1:1331\n675#1:1333\n675#1:1334\n675#1:1339\n675#1:1341\n786#1:1366\n786#1:1370\n810#1:1406\n810#1:1410\n827#1:1427\n827#1:1431\n844#1:1448\n844#1:1452\n862#1:1469\n862#1:1473\n882#1:1490\n882#1:1494\n897#1:1504\n897#1:1505,6\n897#1:1511\n897#1:1512,4\n906#1:1516,6\n919#1:1522,3\n920#1:1525\n921#1:1526\n928#1:1527,3\n929#1:1530,3\n930#1:1533\n931#1:1534\n931#1:1535\n935#1:1536\n938#1:1537\n947#1:1538\n947#1:1539\n953#1:1540\n953#1:1541\n954#1:1542\n954#1:1543,6\n954#1:1549\n954#1:1550,4\n968#1:1554,3\n969#1:1557\n971#1:1558\n1017#1:1559,14\n1023#1:1573\n1037#1:1574,3\n1038#1:1577\n1049#1:1578\n1050#1:1579,6\n1060#1:1585\n1063#1:1586\n1064#1:1587,6\n1065#1:1593,6\n1072#1:1599\n1073#1:1600,6\n1106#1:1606\n1106#1:1607\n1108#1:1608,3\n1109#1:1611\n1111#1:1612\n1111#1:1613\n1111#1:1614,6\n1111#1:1620\n1111#1:1621,4\n605#1:1223,2\n759#1:1350,2\n614#1:1225,2\n777#1:1354,2\n623#1:1227,2\n768#1:1352,2\n632#1:1229,3\n632#1:1232,7\n632#1:1240,3\n632#1:1244,9\n632#1:1253\n661#1:1272\n661#1:1276\n661#1:1278,2\n661#1:1281,3\n661#1:1287\n661#1:1291\n661#1:1293\n661#1:1296,4\n661#1:1301\n661#1:1303,8\n675#1:1311\n675#1:1315\n675#1:1317,2\n675#1:1320,3\n675#1:1326\n675#1:1330\n675#1:1332\n675#1:1335,4\n675#1:1340\n675#1:1342,8\n786#1:1356,3\n786#1:1359,7\n786#1:1367,3\n786#1:1371,9\n786#1:1380\n810#1:1399,7\n810#1:1407,3\n810#1:1411,9\n827#1:1420,7\n827#1:1428,3\n827#1:1432,9\n844#1:1441,7\n844#1:1449,3\n844#1:1453,9\n862#1:1462,7\n862#1:1470,3\n862#1:1474,9\n882#1:1483,7\n882#1:1491,3\n882#1:1495,9\n641#1:1254,7\n641#1:1262,4\n795#1:1381,7\n795#1:1389,4\n641#1:1261\n795#1:1388\n650#1:1266,6\n804#1:1393,6\n*E\n"})
public final class MutableScatterSet<E> extends ScatterSet<E> {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public MutableScatterSet(int i2) {
        super(null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.n("Capacity must be a positive value.");
        }
        Z(ScatterMapKt.J2(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(Object element) {
        int iNumberOfTrailingZeros;
        int i2 = 0;
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i5 = i3 & 127;
        int i7 = this._capacity;
        int i8 = i3 >>> 7;
        loop0: while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.metadata;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j2 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j3 = (((long) i5) * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i9) & i7;
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], element)) {
                    break loop0;
                } else {
                    j4 &= j4 - 1;
                }
            }
            i2 += 8;
            i8 = i9 + i2;
        }
        if (iNumberOfTrailingZeros >= 0) {
            te(iNumberOfTrailingZeros);
        }
    }

    public final void ty() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.f14890n) {
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.metadata;
            int i2 = this._capacity;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        ArraysKt.fill(this.elements, (Object) null, 0, this._capacity);
        r();
    }

    private final int Ik(int hash1) {
        int i2 = this._capacity;
        int i3 = hash1 & i2;
        int i5 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i3 >> 3;
            int i8 = (i3 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = j2 & ((~j2) << 7) & (-9187201950435737472L);
            if (j3 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j3) >> 3)) & i2;
            }
            i5 += 8;
            i3 = (i3 + i5) & i2;
        }
    }

    private final void Z(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.O(initialCapacity)) : 0;
        this._capacity = iMax;
        o(iMax);
        this.elements = iMax == 0 ? ContainerHelpersKt.f14932t : new Object[iMax];
    }

    private final int ck(Object element) {
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i5 = i2 & 127;
        int i7 = this._capacity;
        int i8 = i3 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j2 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j3 = i5;
            int i12 = i5;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j5) >> 3)) & i7;
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iIk = Ik(i3);
                if (this.growthLimit == 0 && ((this.metadata[iIk >> 3] >> ((iIk & 7) << 3)) & 255) != 254) {
                    qie();
                    iIk = Ik(i3);
                }
                this._size++;
                int i13 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i14 = iIk >> 3;
                long j6 = jArr2[i14];
                int i15 = (iIk & 7) << 3;
                this.growthLimit = i13 - (((j6 >> i15) & 255) == 128 ? 1 : 0);
                int i16 = this._capacity;
                long j7 = ((~(255 << i15)) & j6) | (j3 << i15);
                jArr2[i14] = j7;
                jArr2[(((iIk - 7) & i16) + (i16 & 7)) >> 3] = j7;
                return iIk;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i5 = i12;
        }
    }

    private final void o(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.f14890n;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i2 = capacity >> 3;
        long j2 = 255 << ((capacity & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j2)) | j2;
        r();
    }

    public final void HI() {
        long j2;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        Object[] objArr = this.elements;
        int i3 = (i2 + 7) >> 3;
        int i5 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            long j3 = jArr[i7] & (-9187201950435737472L);
            jArr[i7] = (-72340172838076674L) & ((~j3) + (j3 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i8 = lastIndex - 1;
        long j4 = 72057594037927935L;
        jArr[i8] = (jArr[i8] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i9 = 0;
        while (i9 != i2) {
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j5 = (jArr[i10] >> i11) & 255;
            if (j5 != 128 && j5 == 254) {
                Object obj = objArr[i9];
                int iHashCode = (obj != null ? obj.hashCode() : i5) * (-862048943);
                int i12 = iHashCode ^ (iHashCode << 16);
                int i13 = i12 >>> 7;
                int iIk = Ik(i13);
                int i14 = i13 & i2;
                int i15 = i5;
                if (((iIk - i14) & i2) / 8 == ((i9 - i14) & i2) / 8) {
                    jArr[i10] = (((long) (i12 & 127)) << i11) | ((~(255 << i11)) & jArr[i10]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i15] & j4) | Long.MIN_VALUE;
                    i9++;
                    i5 = i15;
                } else {
                    int i16 = iIk >> 3;
                    long j6 = jArr[i16];
                    int i17 = (iIk & 7) << 3;
                    if (((j6 >> i17) & 255) == 128) {
                        j2 = j4;
                        jArr[i16] = (((long) (i12 & 127)) << i17) | (j6 & (~(255 << i17)));
                        jArr[i10] = (jArr[i10] & (~(255 << i11))) | (128 << i11);
                        objArr[iIk] = objArr[i9];
                        objArr[i9] = null;
                    } else {
                        j2 = j4;
                        jArr[i16] = (((long) (i12 & 127)) << i17) | (j6 & (~(255 << i17)));
                        Object obj2 = objArr[iIk];
                        objArr[iIk] = objArr[i9];
                        objArr[i9] = obj2;
                        i9--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i15] & j2) | Long.MIN_VALUE;
                    i9++;
                    i5 = i15;
                    j4 = j2;
                }
            } else {
                i9++;
            }
        }
        r();
    }

    public final void WPU(ScatterSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i3; i5++) {
                    if ((255 & j2) < 128) {
                        ViF(objArr[(i2 << 3) + i5]);
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void XQ(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            S(it.next());
        }
    }

    public final void aYN(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            ViF(it.next());
        }
    }

    public final Set az() {
        return new MutableSetWrapper(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean fD(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.elements;
        int i2 = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i7 = 0; i7 < i5; i7++) {
                        if ((255 & j2) < 128) {
                            int i8 = (i3 << 3) + i7;
                            if (!CollectionsKt.contains(elements, objArr[i8])) {
                                te(i8);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return i2 != this._size;
    }

    public final boolean g(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = get_size();
        XQ(elements);
        return i2 != get_size();
    }

    public final boolean gh(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = get_size();
        aYN(elements);
        return i2 != get_size();
    }

    public final void iF(int newCapacity) {
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        int i2 = this._capacity;
        Z(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        int i3 = this._capacity;
        for (int i5 = 0; i5 < i2; i5++) {
            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i5];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i7 = iHashCode ^ (iHashCode << 16);
                int iIk = Ik(i7 >>> 7);
                long j2 = i7 & 127;
                int i8 = iIk >> 3;
                int i9 = (iIk & 7) << 3;
                long j3 = (jArr2[i8] & (~(255 << i9))) | (j2 << i9);
                jArr2[i8] = j3;
                jArr2[(((iIk - 7) & i3) + (i3 & 7)) >> 3] = j3;
                objArr2[iIk] = obj;
            }
        }
    }

    public final boolean mUb(ScatterSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = get_size();
        WPU(elements);
        return i2 != get_size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean nY(Object element) {
        int iNumberOfTrailingZeros;
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i5 = this._capacity;
        int i7 = (i2 >>> 7) & i5;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j2 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j3 = (((long) i3) * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i7) & i5;
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], element)) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i5;
        }
        boolean z2 = iNumberOfTrailingZeros >= 0;
        if (z2) {
            te(iNumberOfTrailingZeros);
        }
        return z2;
    }

    public final void qie() {
        if (this._capacity <= 8 || Long.compare(ULong.m487constructorimpl(ULong.m487constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m487constructorimpl(ULong.m487constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            iF(ScatterMapKt.nr(this._capacity));
        } else {
            HI();
        }
    }

    public final void te(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = index >> 3;
        int i5 = (index & 7) << 3;
        long j2 = (jArr[i3] & (~(255 << i5))) | (254 << i5);
        jArr[i3] = j2;
        jArr[(((index - 7) & i2) + (i2 & 7)) >> 3] = j2;
        this.elements[index] = null;
    }

    private final void r() {
        this.growthLimit = ScatterMapKt.rl(get_capacity()) - this._size;
    }

    public final void ViF(Object element) {
        this.elements[ck(element)] = element;
    }

    public final boolean xMQ(Object element) {
        int i2 = get_size();
        this.elements[ck(element)] = element;
        if (get_size() != i2) {
            return true;
        }
        return false;
    }

    public /* synthetic */ MutableScatterSet(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }
}
