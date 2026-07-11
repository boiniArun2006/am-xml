package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ \u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0019\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\fJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001d\u0010\fJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001f\u0010\u0006R\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010 ¨\u0006\""}, d2 = {"Landroidx/collection/MutableIntObjectMap;", "V", "Landroidx/collection/IntObjectMap;", "", "initialCapacity", "<init>", "(I)V", "", "az", "capacity", "qie", "gh", "()V", "key", "xMQ", "(I)I", "hash1", "mUb", "value", "r", "(ILjava/lang/Object;)V", "ty", "(ILjava/lang/Object;)Ljava/lang/Object;", "HI", "(I)Ljava/lang/Object;", "index", "ck", "Uo", "J2", "KN", "newCapacity", "Ik", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 6 IntSet.kt\nandroidx/collection/IntSetKt\n+ 7 IntSet.kt\nandroidx/collection/IntSet\n+ 8 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,1017:1\n757#1,2:1173\n757#1,2:1186\n59#2,5:1018\n1#3:1023\n1254#4,6:1024\n1399#4:1040\n1270#4:1044\n1179#4:1060\n1175#4:1063\n1372#4,3:1068\n1386#4,3:1072\n1312#4:1076\n1303#4:1078\n1297#4:1079\n1309#4:1084\n1393#4:1086\n1179#4:1100\n1175#4:1103\n1372#4,3:1108\n1386#4,3:1112\n1312#4:1116\n1303#4:1118\n1297#4:1119\n1309#4:1124\n1393#4:1126\n1399#4:1141\n1270#4:1145\n1399#4:1166\n1270#4:1170\n1230#4:1189\n1254#4,6:1190\n1242#4:1196\n1241#4,4:1197\n1254#4,6:1201\n1175#4:1210\n1179#4:1211\n1372#4,3:1212\n1386#4,3:1215\n1312#4:1218\n1303#4:1219\n1297#4:1220\n1309#4:1221\n1393#4:1222\n1265#4:1223\n1220#4:1224\n1262#4:1225\n1220#4:1226\n1230#4:1227\n1254#4,6:1228\n1242#4:1234\n1241#4,4:1235\n1372#4,3:1239\n1399#4:1242\n1297#4:1243\n1144#4,14:1244\n1220#4:1258\n1175#4:1262\n1179#4:1263\n1254#4,6:1264\n1220#4:1270\n1179#4:1271\n1254#4,6:1272\n1254#4,6:1278\n1179#4:1284\n1254#4,6:1285\n1268#4:1291\n1220#4:1292\n1175#4:1296\n1179#4:1297\n1230#4:1298\n1254#4,6:1299\n1242#4:1305\n1241#4,4:1306\n382#5,4:1030\n354#5,6:1034\n364#5,3:1041\n367#5,9:1045\n386#5:1054\n577#5:1055\n578#5:1059\n580#5,2:1061\n582#5,4:1064\n586#5:1071\n587#5:1075\n588#5:1077\n589#5,4:1080\n595#5:1085\n596#5,8:1087\n577#5:1095\n578#5:1099\n580#5,2:1101\n582#5,4:1104\n586#5:1111\n587#5:1115\n588#5:1117\n589#5,4:1120\n595#5:1125\n596#5,8:1127\n354#5,6:1135\n364#5,3:1142\n367#5,9:1146\n880#6,3:1056\n880#6,3:1096\n880#6,3:1207\n880#6,3:1259\n880#6,3:1293\n255#7,4:1155\n225#7,7:1159\n236#7,3:1167\n239#7,2:1171\n242#7,6:1175\n259#7:1181\n237#8,4:1182\n242#8:1188\n*S KotlinDebug\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n*L\n769#1:1173,2\n774#1:1186,2\n637#1:1018,5\n665#1:1024,6\n712#1:1040\n712#1:1044\n723#1:1060\n723#1:1063\n723#1:1068,3\n723#1:1072,3\n723#1:1076\n723#1:1078\n723#1:1079\n723#1:1084\n723#1:1086\n735#1:1100\n735#1:1103\n735#1:1108,3\n735#1:1112,3\n735#1:1116\n735#1:1118\n735#1:1119\n735#1:1124\n735#1:1126\n747#1:1141\n747#1:1145\n769#1:1166\n769#1:1170\n783#1:1189\n783#1:1190,6\n783#1:1196\n783#1:1197,4\n795#1:1201,6\n809#1:1210\n810#1:1211\n817#1:1212,3\n818#1:1215,3\n819#1:1218\n820#1:1219\n820#1:1220\n824#1:1221\n827#1:1222\n836#1:1223\n836#1:1224\n842#1:1225\n842#1:1226\n843#1:1227\n843#1:1228,6\n843#1:1234\n843#1:1235,4\n858#1:1239,3\n859#1:1242\n861#1:1243\n907#1:1244,14\n913#1:1258\n928#1:1262\n939#1:1263\n940#1:1264,6\n950#1:1270\n953#1:1271\n954#1:1272,6\n955#1:1278,6\n965#1:1284\n966#1:1285,6\n1005#1:1291\n1005#1:1292\n1008#1:1296\n1010#1:1297\n1010#1:1298\n1010#1:1299,6\n1010#1:1305\n1010#1:1306,4\n712#1:1030,4\n712#1:1034,6\n712#1:1041,3\n712#1:1045,9\n712#1:1054\n723#1:1055\n723#1:1059\n723#1:1061,2\n723#1:1064,4\n723#1:1071\n723#1:1075\n723#1:1077\n723#1:1080,4\n723#1:1085\n723#1:1087,8\n735#1:1095\n735#1:1099\n735#1:1101,2\n735#1:1104,4\n735#1:1111\n735#1:1115\n735#1:1117\n735#1:1120,4\n735#1:1125\n735#1:1127,8\n747#1:1135,6\n747#1:1142,3\n747#1:1146,9\n723#1:1056,3\n735#1:1096,3\n808#1:1207,3\n927#1:1259,3\n1007#1:1293,3\n769#1:1155,4\n769#1:1159,7\n769#1:1167,3\n769#1:1171,2\n769#1:1175,6\n769#1:1181\n774#1:1182,4\n774#1:1188\n*E\n"})
public final class MutableIntObjectMap<V> extends IntObjectMap<V> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int growthLimit;

    public /* synthetic */ MutableIntObjectMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    public final void Uo() {
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
        gh();
    }

    public MutableIntObjectMap(int i2) {
        super(null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.n("Capacity must be a positive value.");
        }
        az(ScatterMapKt.J2(i2));
    }

    private final void az(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.O(initialCapacity)) : 0;
        this._capacity = iMax;
        qie(iMax);
        this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String = new int[iMax];
        this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String = new Object[iMax];
    }

    private final int mUb(int hash1) {
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

    private final void qie(int capacity) {
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
        gh();
    }

    private final int xMQ(int key) {
        int iHashCode = Integer.hashCode(key) * (-862048943);
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
            int i12 = 1;
            long j2 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j3 = i5;
            int i13 = i9;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (j5 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i7;
                int i14 = i12;
                if (this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
                j5 &= j5 - 1;
                i12 = i14;
            }
            int i15 = i12;
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iMUb = mUb(i3);
                if (this.growthLimit == 0 && ((this.metadata[iMUb >> 3] >> ((iMUb & 7) << 3)) & 255) != 254) {
                    J2();
                    iMUb = mUb(i3);
                }
                this._size++;
                int i16 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i17 = iMUb >> 3;
                long j6 = jArr2[i17];
                int i18 = (iMUb & 7) << 3;
                this.growthLimit = i16 - (((j6 >> i18) & 255) == 128 ? i15 : 0);
                int i19 = this._capacity;
                long j7 = ((~(255 << i18)) & j6) | (j3 << i18);
                jArr2[i17] = j7;
                jArr2[(((iMUb - 7) & i19) + (i19 & 7)) >> 3] = j7;
                return iMUb;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
        }
    }

    public final void Ik(int newCapacity) {
        long[] jArr;
        MutableIntObjectMap<V> mutableIntObjectMap = this;
        long[] jArr2 = mutableIntObjectMap.metadata;
        int[] iArr = mutableIntObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr = mutableIntObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        int i2 = mutableIntObjectMap._capacity;
        az(newCapacity);
        long[] jArr3 = mutableIntObjectMap.metadata;
        int[] iArr2 = mutableIntObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr2 = mutableIntObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        int i3 = mutableIntObjectMap._capacity;
        int i5 = 0;
        while (i5 < i2) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                int i7 = iArr[i5];
                int iHashCode = Integer.hashCode(i7) * (-862048943);
                int i8 = iHashCode ^ (iHashCode << 16);
                int iMUb = mutableIntObjectMap.mUb(i8 >>> 7);
                long j2 = i8 & 127;
                int i9 = iMUb >> 3;
                int i10 = (iMUb & 7) << 3;
                jArr = jArr2;
                long j3 = (jArr3[i9] & (~(255 << i10))) | (j2 << i10);
                jArr3[i9] = j3;
                jArr3[(((iMUb - 7) & i3) + (i3 & 7)) >> 3] = j3;
                iArr2[iMUb] = i7;
                objArr2[iMUb] = objArr[i5];
            } else {
                jArr = jArr2;
            }
            i5++;
            mutableIntObjectMap = this;
            jArr2 = jArr;
        }
    }

    public final void J2() {
        if (this._capacity <= 8 || Long.compare(ULong.m487constructorimpl(ULong.m487constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m487constructorimpl(ULong.m487constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            Ik(ScatterMapKt.nr(this._capacity));
        } else {
            KN();
        }
    }

    public final void KN() {
        long j2;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int[] iArr = this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr = this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
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
                int iHashCode = Integer.hashCode(iArr[i9]) * (-862048943);
                int i12 = iHashCode ^ (iHashCode << 16);
                int i13 = i12 >>> 7;
                int iMUb = mUb(i13);
                int i14 = i13 & i2;
                int i15 = i5;
                if (((iMUb - i14) & i2) / 8 == ((i9 - i14) & i2) / 8) {
                    jArr[i10] = (((long) (i12 & 127)) << i11) | ((~(255 << i11)) & jArr[i10]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i15] & j4) | Long.MIN_VALUE;
                    i9++;
                    i5 = i15;
                } else {
                    int i16 = iMUb >> 3;
                    long j6 = jArr[i16];
                    int i17 = (iMUb & 7) << 3;
                    if (((j6 >> i17) & 255) == 128) {
                        j2 = j4;
                        jArr[i16] = (((long) (i12 & 127)) << i17) | (j6 & (~(255 << i17)));
                        jArr[i10] = (jArr[i10] & (~(255 << i11))) | (128 << i11);
                        iArr[iMUb] = iArr[i9];
                        iArr[i9] = i15;
                        objArr[iMUb] = objArr[i9];
                        objArr[i9] = null;
                    } else {
                        j2 = j4;
                        jArr[i16] = (((long) (i12 & 127)) << i17) | (j6 & (~(255 << i17)));
                        int i18 = iArr[iMUb];
                        iArr[iMUb] = iArr[i9];
                        iArr[i9] = i18;
                        Object obj = objArr[iMUb];
                        objArr[iMUb] = objArr[i9];
                        objArr[i9] = obj;
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
        gh();
    }

    public final Object ck(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = index >> 3;
        int i5 = (index & 7) << 3;
        long j2 = (jArr[i3] & (~(255 << i5))) | (254 << i5);
        jArr[i3] = j2;
        jArr[(((index - 7) & i2) + (i2 & 7)) >> 3] = j2;
        Object[] objArr = this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        Object obj = objArr[index];
        objArr[index] = null;
        return obj;
    }

    private final void gh() {
        this.growthLimit = ScatterMapKt.rl(get_capacity()) - this._size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object HI(int key) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(key) * (-862048943);
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
                if (this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[iNumberOfTrailingZeros] == key) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i5;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return ck(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final void r(int key, Object value) {
        int iXMQ = xMQ(key);
        this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[iXMQ] = key;
        this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[iXMQ] = value;
    }

    public final Object ty(int key, Object value) {
        int iXMQ = xMQ(key);
        Object[] objArr = this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        Object obj = objArr[iXMQ];
        this.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[iXMQ] = key;
        objArr[iXMQ] = value;
        return obj;
    }
}
