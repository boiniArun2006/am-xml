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
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b%\u0010\u001cJ\u0018\u0010&\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b&\u0010\u001eJ\u001b\u0010'\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b'\u0010\"J\u001e\u0010(\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002¢\u0006\u0004\b(\u0010$J\u001b\u0010*\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000)¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0003H\u0001¢\u0006\u0004\b-\u0010\u0006J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\fJ\u0015\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0003¢\u0006\u0004\b0\u0010\u0006J\u000f\u00101\u001a\u00020\u0007H\u0000¢\u0006\u0004\b1\u0010\fJ\u000f\u00102\u001a\u00020\u0007H\u0000¢\u0006\u0004\b2\u0010\fJ\u0017\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0003H\u0000¢\u0006\u0004\b4\u0010\u0006J\u0013\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005¢\u0006\u0004\b6\u00107R\u0016\u00109\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00108¨\u0006:"}, d2 = {"Landroidx/collection/MutableOrderedScatterSet;", "E", "Landroidx/collection/OrderedScatterSet;", "", "initialCapacity", "<init>", "(I)V", "", "o", "capacity", "r", "Ik", "()V", "element", "az", "(Ljava/lang/Object;)I", "hash1", "ty", "(I)I", "", "mapping", "ck", "([J)V", "", "HI", "([I)V", "", "Uo", "(Ljava/lang/Object;)Z", "WPU", "(Ljava/lang/Object;)V", "", "elements", "KN", "(Ljava/lang/Iterable;)Z", "S", "(Ljava/lang/Iterable;)V", "aYN", "XQ", "ViF", "Z", "", "te", "(Ljava/util/Collection;)Z", "index", "nY", "gh", "maxSize", "iF", "xMQ", "qie", "newCapacity", "g", "", "mUb", "()Ljava/util/Set;", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedScatterSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 9 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 10 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 11 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1511:1\n1033#1:1524\n1035#1,2:1526\n1038#1,6:1529\n1033#1:1535\n1035#1,2:1537\n1038#1,6:1540\n1046#1,3:1839\n1049#1:1843\n1051#1,2:1845\n1054#1,5:1848\n1060#1,5:1854\n59#2,5:1512\n1#3:1517\n1254#4,6:1518\n1399#4:1574\n1270#4:1578\n1165#4,3:1596\n1179#4:1600\n1175#4:1603\n1372#4,3:1607\n1386#4,3:1611\n1312#4:1615\n1303#4:1617\n1297#4:1618\n1309#4:1623\n1393#4:1625\n1165#4,3:1635\n1179#4:1639\n1175#4:1642\n1372#4,3:1646\n1386#4,3:1650\n1312#4:1654\n1303#4:1656\n1297#4:1657\n1309#4:1662\n1393#4:1664\n1399#4:1701\n1270#4:1705\n1399#4:1729\n1270#4:1733\n1399#4:1750\n1270#4:1754\n1399#4:1771\n1270#4:1775\n1399#4:1792\n1270#4:1796\n1399#4:1813\n1270#4:1817\n1230#4:1827\n1254#4,6:1828\n1242#4:1834\n1241#4,4:1835\n1254#4,6:1865\n1165#4,3:1871\n1175#4:1874\n1179#4:1875\n1372#4,3:1876\n1386#4,3:1879\n1312#4:1882\n1303#4:1883\n1297#4:1884\n1309#4:1885\n1393#4:1886\n1265#4:1887\n1220#4:1888\n1262#4:1889\n1220#4:1890\n1230#4:1891\n1254#4,6:1892\n1242#4:1898\n1241#4,4:1899\n1372#4,3:1903\n1399#4:1906\n1297#4:1907\n1144#4,14:1909\n1220#4:1923\n1165#4,3:1924\n1175#4:1927\n1179#4:1928\n1254#4,6:1929\n1220#4:1936\n1179#4:1937\n1254#4,6:1938\n1254#4,6:1944\n1179#4:1955\n1254#4,6:1956\n1268#4:1967\n1220#4:1968\n1165#4,3:1969\n1175#4:1972\n1179#4:1973\n1230#4:1974\n1254#4,6:1975\n1242#4:1981\n1241#4,4:1982\n1111#5:1525\n1114#5:1528\n1111#5:1536\n1114#5:1539\n1123#5:1559\n1123#5:1686\n1123#5:1842\n1127#5:1844\n1117#5:1847\n1114#5:1853\n1111#5:1859\n1114#5:1860\n1123#5:1861\n1127#5:1862\n1117#5:1863\n1114#5:1864\n1127#5:1908\n1132#5:1935\n1144#5:1950\n1138#5:1951\n1141#5:1952\n1132#5:1953\n1132#5:1954\n1144#5:1962\n1138#5:1963\n1135#5:1964\n1132#5:1965\n1132#5:1966\n1123#5:1986\n1127#5:1987\n1096#5,2:1988\n1147#5:1990\n1098#5,2:1991\n1147#5:1993\n1147#5:1994\n1147#5:1995\n1123#5:1996\n1127#5:1997\n1103#5,4:1998\n13309#6,2:1546\n13309#6,2:1673\n1855#7,2:1548\n1855#7,2:1677\n1313#8,2:1550\n1313#8,2:1675\n301#9,7:1552\n308#9,4:1560\n510#9:1595\n511#9:1599\n513#9,2:1601\n515#9,3:1604\n518#9:1610\n519#9:1614\n520#9:1616\n521#9,4:1619\n527#9:1624\n528#9,8:1626\n510#9:1634\n511#9:1638\n513#9,2:1640\n515#9,3:1643\n518#9:1649\n519#9:1653\n520#9:1655\n521#9,4:1658\n527#9:1663\n528#9,8:1665\n301#9,7:1679\n308#9,4:1687\n269#9,7:1722\n280#9,3:1730\n283#9,9:1734\n269#9,7:1743\n280#9,3:1751\n283#9,9:1755\n269#9,7:1764\n280#9,3:1772\n283#9,9:1776\n269#9,7:1785\n280#9,3:1793\n283#9,9:1797\n269#9,7:1806\n280#9,3:1814\n283#9,9:1818\n231#10,3:1564\n200#10,7:1567\n211#10,3:1575\n214#10,9:1579\n234#10:1588\n231#10,3:1691\n200#10,7:1694\n211#10,3:1702\n214#10,9:1706\n234#10:1715\n287#11,6:1589\n287#11,6:1716\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedScatterSet\n*L\n635#1:1524\n635#1:1526,2\n635#1:1529,6\n647#1:1535\n647#1:1537,2\n647#1:1540,6\n1029#1:1839,3\n1029#1:1843\n1029#1:1845,2\n1029#1:1848,5\n1029#1:1854,5\n587#1:1512,5\n616#1:1518,6\n770#1:1574\n770#1:1578\n790#1:1596,3\n790#1:1600\n790#1:1603\n790#1:1607,3\n790#1:1611,3\n790#1:1615\n790#1:1617\n790#1:1618\n790#1:1623\n790#1:1625\n804#1:1635,3\n804#1:1639\n804#1:1642\n804#1:1646,3\n804#1:1650,3\n804#1:1654\n804#1:1656\n804#1:1657\n804#1:1662\n804#1:1664\n924#1:1701\n924#1:1705\n939#1:1729\n939#1:1733\n956#1:1750\n956#1:1754\n973#1:1771\n973#1:1775\n991#1:1792\n991#1:1796\n1011#1:1813\n1011#1:1817\n1026#1:1827\n1026#1:1828,6\n1026#1:1834\n1026#1:1835,4\n1071#1:1865,6\n1087#1:1871,3\n1088#1:1874\n1089#1:1875\n1096#1:1876,3\n1097#1:1879,3\n1098#1:1882\n1099#1:1883\n1099#1:1884\n1103#1:1885\n1106#1:1886\n1115#1:1887\n1115#1:1888\n1121#1:1889\n1121#1:1890\n1122#1:1891\n1122#1:1892,6\n1122#1:1898\n1122#1:1899,4\n1136#1:1903,3\n1137#1:1906\n1139#1:1907\n1250#1:1909,14\n1256#1:1923\n1270#1:1924,3\n1271#1:1927\n1282#1:1928\n1283#1:1929,6\n1297#1:1936\n1300#1:1937\n1301#1:1938,6\n1302#1:1944,6\n1321#1:1955\n1322#1:1956,6\n1377#1:1967\n1377#1:1968\n1379#1:1969,3\n1380#1:1972\n1382#1:1973\n1382#1:1974\n1382#1:1975,6\n1382#1:1981\n1382#1:1982,4\n635#1:1525\n635#1:1528\n647#1:1536\n647#1:1539\n761#1:1559\n915#1:1686\n1029#1:1842\n1029#1:1844\n1029#1:1847\n1029#1:1853\n1033#1:1859\n1036#1:1860\n1048#1:1861\n1049#1:1862\n1052#1:1863\n1058#1:1864\n1173#1:1908\n1287#1:1935\n1311#1:1950\n1313#1:1951\n1314#1:1952\n1316#1:1953\n1318#1:1954\n1333#1:1962\n1335#1:1963\n1336#1:1964\n1338#1:1965\n1342#1:1966\n1397#1:1986\n1398#1:1987\n1399#1:1988,2\n1399#1:1990\n1399#1:1991,2\n1399#1:1993\n1401#1:1994\n1402#1:1995\n1409#1:1996\n1410#1:1997\n1411#1:1998,4\n734#1:1546,2\n888#1:1673,2\n743#1:1548,2\n906#1:1677,2\n752#1:1550,2\n897#1:1675,2\n761#1:1552,7\n761#1:1560,4\n790#1:1595\n790#1:1599\n790#1:1601,2\n790#1:1604,3\n790#1:1610\n790#1:1614\n790#1:1616\n790#1:1619,4\n790#1:1624\n790#1:1626,8\n804#1:1634\n804#1:1638\n804#1:1640,2\n804#1:1643,3\n804#1:1649\n804#1:1653\n804#1:1655\n804#1:1658,4\n804#1:1663\n804#1:1665,8\n915#1:1679,7\n915#1:1687,4\n939#1:1722,7\n939#1:1730,3\n939#1:1734,9\n956#1:1743,7\n956#1:1751,3\n956#1:1755,9\n973#1:1764,7\n973#1:1772,3\n973#1:1776,9\n991#1:1785,7\n991#1:1793,3\n991#1:1797,9\n1011#1:1806,7\n1011#1:1814,3\n1011#1:1818,9\n770#1:1564,3\n770#1:1567,7\n770#1:1575,3\n770#1:1579,9\n770#1:1588\n924#1:1691,3\n924#1:1694,7\n924#1:1702,3\n924#1:1706,9\n924#1:1715\n779#1:1589,6\n933#1:1716,6\n*E\n"})
public final class MutableOrderedScatterSet<E> extends OrderedScatterSet<E> {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private int growthLimit;

    public /* synthetic */ MutableOrderedScatterSet(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
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
    public final void XQ(Object element) {
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
            nY(iNumberOfTrailingZeros);
        }
    }

    public final void gh() {
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
        ArraysKt.fill$default(this.nodes, DurationKt.MAX_MILLIS, 0, 0, 6, (Object) null);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        Ik();
    }

    public MutableOrderedScatterSet(int i2) {
        super(null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.n("Capacity must be a positive value.");
        }
        o(ScatterMapKt.J2(i2));
    }

    private final void HI(int[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i2 = 0;
        while (true) {
            int i3 = Integer.MAX_VALUE;
            if (i2 >= length) {
                break;
            }
            long j2 = jArr[i2];
            int i5 = (int) ((j2 >> 31) & 2147483647L);
            int i7 = (int) (j2 & 2147483647L);
            long j3 = ((j2 & (-4611686018427387904L)) | ((long) (i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[i5]))) << 31;
            if (i7 != Integer.MAX_VALUE) {
                i3 = mapping[i7];
            }
            jArr[i2] = j3 | ((long) i3);
            i2++;
        }
        int i8 = this.head;
        if (i8 != Integer.MAX_VALUE) {
            this.head = mapping[i8];
        }
        int i9 = this.tail;
        if (i9 != Integer.MAX_VALUE) {
            this.tail = mapping[i9];
        }
    }

    private final int az(Object element) {
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
                int iTy = ty(i3);
                if (this.growthLimit == 0 && ((this.metadata[iTy >> 3] >> ((iTy & 7) << 3)) & 255) != 254) {
                    xMQ();
                    iTy = ty(i3);
                }
                this._size++;
                int i13 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i14 = iTy >> 3;
                long j6 = jArr2[i14];
                int i15 = (iTy & 7) << 3;
                this.growthLimit = i13 - (((j6 >> i15) & 255) == 128 ? 1 : 0);
                int i16 = this._capacity;
                long j7 = ((~(255 << i15)) & j6) | (j3 << i15);
                jArr2[i14] = j7;
                jArr2[(((iTy - 7) & i16) + (i16 & 7)) >> 3] = j7;
                return iTy;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i5 = i12;
        }
    }

    private final void ck(long[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i2 = 0;
        while (true) {
            int i3 = Integer.MAX_VALUE;
            if (i2 >= length) {
                break;
            }
            long j2 = jArr[i2];
            int i5 = (int) ((j2 >> 31) & 2147483647L);
            int i7 = (int) (j2 & 2147483647L);
            long j3 = ((j2 & (-4611686018427387904L)) | ((long) (i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[i5] & 4294967295L)))) << 31;
            if (i7 != Integer.MAX_VALUE) {
                i3 = (int) (4294967295L & mapping[i7]);
            }
            jArr[i2] = ((long) i3) | j3;
            i2++;
        }
        int i8 = this.head;
        if (i8 != Integer.MAX_VALUE) {
            this.head = (int) (mapping[i8] & 4294967295L);
        }
        int i9 = this.tail;
        if (i9 != Integer.MAX_VALUE) {
            this.tail = (int) (mapping[i9] & 4294967295L);
        }
    }

    private final void o(int initialCapacity) {
        long[] jArrN;
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.O(initialCapacity)) : 0;
        this._capacity = iMax;
        r(iMax);
        this.elements = iMax == 0 ? ContainerHelpersKt.f14932t : new Object[iMax];
        if (iMax == 0) {
            jArrN = SieveCacheKt.n();
        } else {
            long[] jArr = new long[iMax];
            ArraysKt.fill$default(jArr, DurationKt.MAX_MILLIS, 0, 0, 6, (Object) null);
            jArrN = jArr;
        }
        this.nodes = jArrN;
    }

    private final void r(int capacity) {
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
        Ik();
    }

    private final int ty(int hash1) {
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

    public final boolean KN(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = get_size();
        S(elements);
        return iT != get_size();
    }

    public final void S(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            WPU(it.next());
        }
    }

    public final boolean ViF(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = get_size();
        Z(elements);
        return iT != get_size();
    }

    public final void Z(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            XQ(it.next());
        }
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
    public final boolean aYN(Object element) {
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
            nY(iNumberOfTrailingZeros);
        }
        return z2;
    }

    public final void g(int newCapacity) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        long[] jArr3 = this.nodes;
        int i2 = this._capacity;
        int[] iArr = new int[i2];
        o(newCapacity);
        long[] jArr4 = this.metadata;
        Object[] objArr3 = this.elements;
        long[] jArr5 = this.nodes;
        int i3 = this._capacity;
        int i5 = 0;
        while (i5 < i2) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i5];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i7 = iHashCode ^ (iHashCode << 16);
                int iTy = ty(i7 >>> 7);
                long j2 = i7 & 127;
                int i8 = iTy >> 3;
                int i9 = (iTy & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j3 = (jArr4[i8] & (~(255 << i9))) | (j2 << i9);
                jArr4[i8] = j3;
                jArr4[(((iTy - 7) & i3) + (i3 & 7)) >> 3] = j3;
                objArr3[iTy] = obj;
                jArr5[iTy] = jArr3[i5];
                iArr[i5] = iTy;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i5++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        HI(iArr);
    }

    public final void iF(int maxSize) {
        int i2;
        long[] jArr = this.nodes;
        int i3 = this.head;
        while (i3 != Integer.MAX_VALUE && (i2 = this._size) > maxSize && i2 != 0) {
            int i5 = (int) (jArr[i3] & 2147483647L);
            nY(i3);
            i3 = i5;
        }
    }

    public final Set mUb() {
        return new MutableOrderedSetWrapper(this);
    }

    public final void nY(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = index >> 3;
        int i5 = (index & 7) << 3;
        long j2 = (jArr[i3] & (~(255 << i5))) | (254 << i5);
        jArr[i3] = j2;
        jArr[(((index - 7) & i2) + (i2 & 7)) >> 3] = j2;
        this.elements[index] = null;
        long[] jArr2 = this.nodes;
        long j3 = jArr2[index];
        int i7 = (int) ((j3 >> 31) & 2147483647L);
        int i8 = (int) (j3 & 2147483647L);
        if (i7 != Integer.MAX_VALUE) {
            jArr2[i7] = (jArr2[i7] & (-2147483648L)) | (((long) i8) & 2147483647L);
        } else {
            this.head = i8;
        }
        if (i8 != Integer.MAX_VALUE) {
            jArr2[i8] = ((((long) i7) & 2147483647L) << 31) | (jArr2[i8] & (-4611686016279904257L));
        } else {
            this.tail = i7;
        }
        jArr2[index] = 4611686018427387903L;
    }

    public final void qie() {
        int i2;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i3 = this._capacity;
        Object[] objArr = this.elements;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i3];
        long j2 = 9223372034707292159L;
        int i5 = 0;
        ArraysKt.fill(jArr3, 9223372034707292159L, 0, i3);
        int i7 = (i3 + 7) >> 3;
        for (int i8 = 0; i8 < i7; i8++) {
            long j3 = jArr[i8] & (-9187201950435737472L);
            jArr[i8] = (-72340172838076674L) & ((~j3) + (j3 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i9 = lastIndex - 1;
        jArr[i9] = (jArr[i9] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i10 = 0;
        while (i10 != i3) {
            int i11 = i10 >> 3;
            int i12 = (i10 & 7) << 3;
            long j4 = (jArr[i11] >> i12) & 255;
            if (j4 != 128 && j4 == 254) {
                Object obj = objArr[i10];
                int iHashCode = (obj != null ? obj.hashCode() : i5) * (-862048943);
                int i13 = iHashCode ^ (iHashCode << 16);
                int i14 = i13 >>> 7;
                long j5 = j2;
                int iTy = ty(i14);
                int i15 = i14 & i3;
                if (((iTy - i15) & i3) / 8 == ((i10 - i15) & i3) / 8) {
                    jArr[i11] = (((long) (i13 & 127)) << i12) | (jArr[i11] & (~(255 << i12)));
                    if (jArr3[i10] == j5) {
                        long j6 = i10;
                        jArr3[i10] = j6 | (j6 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i5];
                    i10++;
                    j2 = j5;
                } else {
                    int i16 = iTy >> 3;
                    long j7 = jArr[i16];
                    int i17 = (iTy & 7) << 3;
                    int i18 = i5;
                    if (((j7 >> i17) & 255) == 128) {
                        int i19 = i10;
                        jArr[i16] = (j7 & (~(255 << i17))) | (((long) (i13 & 127)) << i17);
                        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (128 << i12);
                        objArr[iTy] = objArr[i19];
                        objArr[i19] = null;
                        jArr2[iTy] = jArr2[i19];
                        jArr2[i19] = 4611686018427387903L;
                        int i20 = (int) ((jArr3[i19] >> 32) & 4294967295L);
                        if (i20 != Integer.MAX_VALUE) {
                            jArr3[i20] = (jArr3[i20] & (-4294967296L)) | ((long) iTy);
                            jArr3[i19] = (jArr3[i19] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i19] = (((long) Integer.MAX_VALUE) << 32) | ((long) iTy);
                        }
                        i2 = i19;
                        jArr3[iTy] = ((long) Integer.MAX_VALUE) | (((long) i2) << 32);
                    } else {
                        jArr[i16] = (((long) (i13 & 127)) << i17) | (j7 & (~(255 << i17)));
                        Object obj2 = objArr[iTy];
                        objArr[iTy] = objArr[i10];
                        objArr[i10] = obj2;
                        long j9 = jArr2[iTy];
                        jArr2[iTy] = jArr2[i10];
                        jArr2[i10] = j9;
                        int i21 = (int) ((jArr3[i10] >> 32) & 4294967295L);
                        if (i21 != Integer.MAX_VALUE) {
                            long j10 = iTy;
                            jArr3[i21] = (jArr3[i21] & (-4294967296L)) | j10;
                            jArr3[i10] = (jArr3[i10] & 4294967295L) | (j10 << 32);
                        } else {
                            long j11 = iTy;
                            jArr3[i10] = j11 | (j11 << 32);
                            i21 = i10;
                        }
                        jArr3[iTy] = (((long) i21) << 32) | ((long) i10);
                        i2 = i10 - 1;
                    }
                    jArr[jArr.length - 1] = jArr[i18];
                    i10 = i2 + 1;
                    j2 = j5;
                    i5 = i18;
                }
            } else {
                i10++;
            }
        }
        Ik();
        ck(jArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean te(Collection elements) {
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
                                nY(i8);
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

    public final void xMQ() {
        if (this._capacity <= 8 || Long.compare(ULong.m487constructorimpl(ULong.m487constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m487constructorimpl(ULong.m487constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            g(ScatterMapKt.nr(this._capacity));
        } else {
            qie();
        }
    }

    private final void Ik() {
        this.growthLimit = ScatterMapKt.rl(get_capacity()) - this._size;
    }

    public final boolean Uo(Object element) {
        int iT = get_size();
        int iAz = az(element);
        this.elements[iAz] = element;
        long[] jArr = this.nodes;
        int i2 = this.head;
        jArr[iAz] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) iAz) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.head = iAz;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iAz;
        }
        if (get_size() != iT) {
            return true;
        }
        return false;
    }

    public final void WPU(Object element) {
        int iAz = az(element);
        this.elements[iAz] = element;
        long[] jArr = this.nodes;
        int i2 = this.head;
        jArr[iAz] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) iAz) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.head = iAz;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iAz;
        }
    }
}
