package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0015\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\rJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0001¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0000¢\u0006\u0004\b%\u0010\rJ\u000f\u0010&\u001a\u00020\bH\u0000¢\u0006\u0004\b&\u0010\rJ\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0004H\u0000¢\u0006\u0004\b(\u0010\u0007R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/collection/MutableScatterMap;", "K", "V", "Landroidx/collection/ScatterMap;", "", "initialCapacity", "<init>", "(I)V", "", "Ik", "capacity", "ck", "HI", "()V", "hash1", "az", "(I)I", "key", "value", "aYN", "(Ljava/lang/Object;Ljava/lang/Object;)V", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "Z", "(Ljava/util/Map;)V", "o", "(Landroidx/collection/ScatterMap;)V", "XQ", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "S", "(I)Ljava/lang/Object;", "gh", "ty", "(Ljava/lang/Object;)I", "mUb", "qie", "newCapacity", "WPU", "J2", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1787:1\n59#2,5:1788\n1254#3,6:1793\n1399#3:1812\n1270#3:1816\n1165#3,3:1828\n1179#3:1832\n1175#3:1835\n1372#3,3:1840\n1386#3,3:1844\n1312#3:1848\n1303#3:1850\n1297#3:1851\n1309#3:1856\n1393#3:1858\n1165#3,3:1868\n1179#3:1872\n1175#3:1875\n1372#3,3:1880\n1386#3,3:1884\n1312#3:1888\n1303#3:1890\n1297#3:1891\n1309#3:1896\n1393#3:1898\n1399#3:1913\n1270#3:1917\n1399#3:1937\n1270#3:1941\n1230#3:1958\n1254#3,6:1959\n1242#3:1965\n1241#3,4:1966\n1254#3,6:1970\n1165#3,3:1976\n1175#3:1979\n1179#3:1980\n1372#3,3:1981\n1386#3,3:1984\n1312#3:1987\n1303#3:1988\n1297#3:1989\n1309#3:1990\n1393#3:1991\n1265#3:1992\n1220#3:1993\n1262#3:1994\n1220#3:1995\n1230#3:1996\n1254#3,6:1997\n1242#3:2003\n1241#3,4:2004\n1372#3,3:2008\n1399#3:2011\n1297#3:2012\n1144#3,14:2013\n1220#3:2027\n1165#3,3:2028\n1175#3:2031\n1179#3:2032\n1254#3,6:2033\n1220#3:2039\n1179#3:2040\n1254#3,6:2041\n1254#3,6:2047\n1179#3:2053\n1254#3,6:2054\n1268#3:2060\n1220#3:2061\n1165#3,3:2062\n1175#3:2065\n1179#3:2066\n1230#3:2067\n1254#3,6:2068\n1242#3:2074\n1241#3,4:2075\n1#4:1799\n215#5,2:1800\n357#6,4:1802\n329#6,6:1806\n339#6,3:1813\n342#6,9:1817\n361#6:1826\n555#6:1827\n556#6:1831\n558#6,2:1833\n560#6,4:1836\n564#6:1843\n565#6:1847\n566#6:1849\n567#6,4:1852\n573#6:1857\n574#6,8:1859\n555#6:1867\n556#6:1871\n558#6,2:1873\n560#6,4:1876\n564#6:1883\n565#6:1887\n566#6:1889\n567#6,4:1892\n573#6:1897\n574#6,8:1899\n329#6,6:1907\n339#6,3:1914\n342#6,9:1918\n231#7,3:1927\n200#7,7:1930\n211#7,3:1938\n214#7,9:1942\n234#7:1951\n287#8,6:1952\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n639#1:1788,5\n667#1:1793,6\n776#1:1812\n776#1:1816\n818#1:1828,3\n818#1:1832\n818#1:1835\n818#1:1840,3\n818#1:1844,3\n818#1:1848\n818#1:1850\n818#1:1851\n818#1:1856\n818#1:1858\n830#1:1868,3\n830#1:1872\n830#1:1875\n830#1:1880,3\n830#1:1884,3\n830#1:1888\n830#1:1890\n830#1:1891\n830#1:1896\n830#1:1898\n842#1:1913\n842#1:1917\n878#1:1937\n878#1:1941\n892#1:1958\n892#1:1959,6\n892#1:1965\n892#1:1966,4\n905#1:1970,6\n920#1:1976,3\n921#1:1979\n922#1:1980\n929#1:1981,3\n930#1:1984,3\n931#1:1987\n932#1:1988\n932#1:1989\n936#1:1990\n939#1:1991\n948#1:1992\n948#1:1993\n954#1:1994\n954#1:1995\n955#1:1996\n955#1:1997,6\n955#1:2003\n955#1:2004,4\n970#1:2008,3\n971#1:2011\n973#1:2012\n1019#1:2013,14\n1025#1:2027\n1039#1:2028,3\n1040#1:2031\n1051#1:2032\n1052#1:2033,6\n1061#1:2039\n1064#1:2040\n1065#1:2041,6\n1066#1:2047,6\n1076#1:2053\n1077#1:2054,6\n1116#1:2060\n1116#1:2061\n1118#1:2062,3\n1119#1:2065\n1121#1:2066\n1121#1:2067\n1121#1:2068,6\n1121#1:2074\n1121#1:2075,4\n771#1:1800,2\n776#1:1802,4\n776#1:1806,6\n776#1:1813,3\n776#1:1817,9\n776#1:1826\n818#1:1827\n818#1:1831\n818#1:1833,2\n818#1:1836,4\n818#1:1843\n818#1:1847\n818#1:1849\n818#1:1852,4\n818#1:1857\n818#1:1859,8\n830#1:1867\n830#1:1871\n830#1:1873,2\n830#1:1876,4\n830#1:1883\n830#1:1887\n830#1:1889\n830#1:1892,4\n830#1:1897\n830#1:1899,8\n842#1:1907,6\n842#1:1914,3\n842#1:1918,9\n878#1:1927,3\n878#1:1930,7\n878#1:1938,3\n878#1:1942,9\n878#1:1951\n883#1:1952,6\n*E\n"})
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int growthLimit;

    public /* synthetic */ MutableScatterMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object XQ(Object key) {
        int iNumberOfTrailingZeros;
        int i2 = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
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
                if (Intrinsics.areEqual(this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[iNumberOfTrailingZeros], key)) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i2 += 8;
            i8 = i9 + i2;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return S(iNumberOfTrailingZeros);
        }
        return null;
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
        ArraysKt.fill(this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String, (Object) null, 0, this._capacity);
        ArraysKt.fill(this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String, (Object) null, 0, this._capacity);
        HI();
    }

    public MutableScatterMap(int i2) {
        super(null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.n("Capacity must be a positive value.");
        }
        Ik(ScatterMapKt.J2(i2));
    }

    private final void Ik(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.O(initialCapacity)) : 0;
        this._capacity = iMax;
        ck(iMax);
        this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String = iMax == 0 ? ContainerHelpersKt.f14932t : new Object[iMax];
        this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String = iMax == 0 ? ContainerHelpersKt.f14932t : new Object[iMax];
    }

    private final int az(int hash1) {
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

    private final void ck(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.f14890n;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            int i2 = capacity >> 3;
            long j2 = 255 << ((capacity & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j2)) | j2;
            jArr = jArr2;
        }
        this.metadata = jArr;
        HI();
    }

    public final Object S(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = index >> 3;
        int i5 = (index & 7) << 3;
        long j2 = (jArr[i3] & (~(255 << i5))) | (254 << i5);
        jArr[i3] = j2;
        jArr[(((index - 7) & i2) + (i2 & 7)) >> 3] = j2;
        this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[index] = null;
        Object[] objArr = this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        Object obj = objArr[index];
        objArr[index] = null;
        return obj;
    }

    public final void WPU(int newCapacity) {
        int i2;
        long[] jArr = this.metadata;
        Object[] objArr = this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr2 = this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        int i3 = this._capacity;
        Ik(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr3 = this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr4 = this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        int i5 = this._capacity;
        int i7 = 0;
        while (i7 < i3) {
            if (((jArr[i7 >> 3] >> ((i7 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i7];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i8 = iHashCode ^ (iHashCode << 16);
                int iAz = az(i8 >>> 7);
                i2 = i7;
                long j2 = i8 & 127;
                int i9 = iAz >> 3;
                int i10 = (iAz & 7) << 3;
                long j3 = (j2 << i10) | (jArr2[i9] & (~(255 << i10)));
                jArr2[i9] = j3;
                jArr2[(((iAz - 7) & i5) + (i5 & 7)) >> 3] = j3;
                objArr3[iAz] = obj;
                objArr4[iAz] = objArr2[i2];
            } else {
                i2 = i7;
            }
            i7 = i2 + 1;
        }
    }

    public final void Z(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<K, V> entry : from.entrySet()) {
            aYN(entry.getKey(), entry.getValue());
        }
    }

    public final void mUb() {
        if (this._capacity <= 8 || Long.compare(ULong.m487constructorimpl(ULong.m487constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m487constructorimpl(ULong.m487constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            WPU(ScatterMapKt.nr(this._capacity));
        } else {
            qie();
        }
    }

    public final void o(ScatterMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr2 = from.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = from.metadata;
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
                        int i7 = (i2 << 3) + i5;
                        aYN(objArr[i7], objArr2[i7]);
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

    public final void qie() {
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        Object[] objArr = this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr2 = this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        int i3 = (i2 + 7) >> 3;
        int i5 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            long j2 = jArr[i7] & (-9187201950435737472L);
            jArr[i7] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i8 = lastIndex - 1;
        jArr[i8] = (jArr[i8] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i9 = 0;
        while (i9 != i2) {
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j3 = (jArr[i10] >> i11) & 255;
            if (j3 != 128 && j3 == 254) {
                Object obj = objArr[i9];
                int iHashCode = (obj != null ? obj.hashCode() : i5) * (-862048943);
                int i12 = iHashCode ^ (iHashCode << 16);
                int i13 = i12 >>> 7;
                int iAz = az(i13);
                int i14 = i13 & i2;
                int i15 = i5;
                if (((iAz - i14) & i2) / 8 == ((i9 - i14) & i2) / 8) {
                    jArr[i10] = (((long) (i12 & 127)) << i11) | ((~(255 << i11)) & jArr[i10]);
                    jArr[ArraysKt.getLastIndex(jArr)] = jArr[i15];
                } else {
                    int i16 = iAz >> 3;
                    long j4 = jArr[i16];
                    int i17 = (iAz & 7) << 3;
                    if (((j4 >> i17) & 255) == 128) {
                        jArr[i16] = (((long) (i12 & 127)) << i17) | (j4 & (~(255 << i17)));
                        jArr[i10] = (jArr[i10] & (~(255 << i11))) | (128 << i11);
                        objArr[iAz] = objArr[i9];
                        objArr[i9] = null;
                        objArr2[iAz] = objArr2[i9];
                        objArr2[i9] = null;
                    } else {
                        jArr[i16] = (((long) (i12 & 127)) << i17) | (j4 & (~(255 << i17)));
                        Object obj2 = objArr[iAz];
                        objArr[iAz] = objArr[i9];
                        objArr[i9] = obj2;
                        Object obj3 = objArr2[iAz];
                        objArr2[iAz] = objArr2[i9];
                        objArr2[i9] = obj3;
                        i9--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = jArr[i15];
                }
                i9++;
                i5 = i15;
            } else {
                i9++;
            }
        }
        HI();
    }

    public final int ty(Object key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
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
                if (Intrinsics.areEqual(this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iAz = az(i3);
                if (this.growthLimit == 0 && ((this.metadata[iAz >> 3] >> ((iAz & 7) << 3)) & 255) != 254) {
                    mUb();
                    iAz = az(i3);
                }
                this._size++;
                int i13 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i14 = iAz >> 3;
                long j6 = jArr2[i14];
                int i15 = (iAz & 7) << 3;
                this.growthLimit = i13 - (((j6 >> i15) & 255) == 128 ? 1 : 0);
                int i16 = this._capacity;
                long j7 = ((~(255 << i15)) & j6) | (j3 << i15);
                jArr2[i14] = j7;
                jArr2[(((iAz - 7) & i16) + (i16 & 7)) >> 3] = j7;
                return ~iAz;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i5 = i12;
        }
    }

    private final void HI() {
        this.growthLimit = ScatterMapKt.rl(get_capacity()) - this._size;
    }

    public final void aYN(Object key, Object value) {
        int iTy = ty(key);
        if (iTy < 0) {
            iTy = ~iTy;
        }
        this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[iTy] = key;
        this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[iTy] = value;
    }

    public final Object r(Object key, Object value) {
        int iTy = ty(key);
        if (iTy < 0) {
            iTy = ~iTy;
        }
        Object[] objArr = this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        Object obj = objArr[iTy];
        this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[iTy] = key;
        objArr[iTy] = value;
        return obj;
    }
}
