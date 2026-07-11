package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ \u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0005R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/collection/MutableIntIntMap;", "Landroidx/collection/IntIntMap;", "", "initialCapacity", "<init>", "(I)V", "", "HI", "capacity", "ty", "az", "()V", "key", "qie", "(I)I", "hash1", "gh", "value", "Ik", "(II)V", "xMQ", "KN", "mUb", "newCapacity", "ck", "J2", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntMap.kt\nandroidx/collection/MutableIntIntMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 IntIntMap.kt\nandroidx/collection/IntIntMap\n+ 6 IntSet.kt\nandroidx/collection/IntSet\n+ 7 IntList.kt\nandroidx/collection/IntList\n+ 8 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,1034:1\n59#2,5:1035\n1#3:1040\n1254#4,6:1041\n1399#4:1057\n1270#4:1061\n1399#4:1078\n1270#4:1082\n1399#4:1103\n1270#4:1107\n1230#4:1124\n1254#4,6:1125\n1242#4:1131\n1241#4,4:1132\n1254#4,6:1136\n1175#4:1145\n1179#4:1146\n1372#4,3:1147\n1386#4,3:1150\n1312#4:1153\n1303#4:1154\n1297#4:1155\n1309#4:1156\n1393#4:1157\n1265#4:1158\n1220#4:1159\n1262#4:1160\n1220#4:1161\n1230#4:1162\n1254#4,6:1163\n1242#4:1169\n1241#4,4:1170\n1372#4,3:1174\n1399#4:1177\n1297#4:1178\n1144#4,14:1179\n1220#4:1193\n1175#4:1197\n1179#4:1198\n1254#4,6:1199\n1220#4:1205\n1179#4:1206\n1254#4,6:1207\n1254#4,6:1213\n1179#4:1219\n1254#4,6:1220\n1268#4:1226\n1220#4:1227\n1175#4:1231\n1179#4:1232\n1230#4:1233\n1254#4,6:1234\n1242#4:1240\n1241#4,4:1241\n387#5,4:1047\n359#5,6:1051\n369#5,3:1058\n372#5,9:1062\n391#5:1071\n359#5,6:1072\n369#5,3:1079\n372#5,9:1083\n255#6,4:1092\n225#6,7:1096\n236#6,3:1104\n239#6,9:1108\n259#6:1117\n237#7,6:1118\n880#8,3:1142\n880#8,3:1194\n880#8,3:1228\n*S KotlinDebug\n*F\n+ 1 IntIntMap.kt\nandroidx/collection/MutableIntIntMap\n*L\n639#1:1035,5\n667#1:1041,6\n739#1:1057\n739#1:1061\n770#1:1078\n770#1:1082\n791#1:1103\n791#1:1107\n805#1:1124\n805#1:1125,6\n805#1:1131\n805#1:1132,4\n813#1:1136,6\n826#1:1145\n827#1:1146\n834#1:1147,3\n835#1:1150,3\n836#1:1153\n837#1:1154\n837#1:1155\n841#1:1156\n844#1:1157\n853#1:1158\n853#1:1159\n859#1:1160\n859#1:1161\n860#1:1162\n860#1:1163,6\n860#1:1169\n860#1:1170,4\n875#1:1174,3\n876#1:1177\n878#1:1178\n924#1:1179,14\n930#1:1193\n945#1:1197\n956#1:1198\n957#1:1199,6\n967#1:1205\n970#1:1206\n971#1:1207,6\n972#1:1213,6\n982#1:1219\n983#1:1220,6\n1022#1:1226\n1022#1:1227\n1025#1:1231\n1027#1:1232\n1027#1:1233\n1027#1:1234,6\n1027#1:1240\n1027#1:1241,4\n739#1:1047,4\n739#1:1051,6\n739#1:1058,3\n739#1:1062,9\n739#1:1071\n770#1:1072,6\n770#1:1079,3\n770#1:1083,9\n791#1:1092,4\n791#1:1096,7\n791#1:1104,3\n791#1:1108,9\n791#1:1117\n796#1:1118,6\n825#1:1142,3\n944#1:1194,3\n1024#1:1228,3\n*E\n"})
public final class MutableIntIntMap extends IntIntMap {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int growthLimit;

    public MutableIntIntMap(int i2) {
        super(null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.n("Capacity must be a positive value.");
        }
        HI(ScatterMapKt.J2(i2));
    }

    public final void xMQ() {
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
        az();
    }

    private final void HI(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.O(initialCapacity)) : 0;
        this._capacity = iMax;
        ty(iMax);
        this.keys = new int[iMax];
        this.values = new int[iMax];
    }

    private final int gh(int hash1) {
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

    private final int qie(int key) {
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
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
                j5 &= j5 - 1;
                i12 = i14;
            }
            int i15 = i12;
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iGh = gh(i3);
                if (this.growthLimit == 0 && ((this.metadata[iGh >> 3] >> ((iGh & 7) << 3)) & 255) != 254) {
                    KN();
                    iGh = gh(i3);
                }
                this._size++;
                int i16 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i17 = iGh >> 3;
                long j6 = jArr2[i17];
                int i18 = (iGh & 7) << 3;
                this.growthLimit = i16 - (((j6 >> i18) & 255) == 128 ? i15 : 0);
                int i19 = this._capacity;
                long j7 = ((~(255 << i18)) & j6) | (j3 << i18);
                jArr2[i17] = j7;
                jArr2[(((iGh - 7) & i19) + (i19 & 7)) >> 3] = j7;
                return ~iGh;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
        }
    }

    private final void ty(int capacity) {
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
        az();
    }

    public final void KN() {
        if (this._capacity <= 8 || Long.compare(ULong.m487constructorimpl(ULong.m487constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m487constructorimpl(ULong.m487constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            ck(ScatterMapKt.nr(this._capacity));
        } else {
            mUb();
        }
    }

    public final void ck(int newCapacity) {
        long[] jArr;
        MutableIntIntMap mutableIntIntMap = this;
        long[] jArr2 = mutableIntIntMap.metadata;
        int[] iArr = mutableIntIntMap.keys;
        int[] iArr2 = mutableIntIntMap.values;
        int i2 = mutableIntIntMap._capacity;
        HI(newCapacity);
        long[] jArr3 = mutableIntIntMap.metadata;
        int[] iArr3 = mutableIntIntMap.keys;
        int[] iArr4 = mutableIntIntMap.values;
        int i3 = mutableIntIntMap._capacity;
        int i5 = 0;
        while (i5 < i2) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                int i7 = iArr[i5];
                int iHashCode = Integer.hashCode(i7) * (-862048943);
                int i8 = iHashCode ^ (iHashCode << 16);
                int iGh = mutableIntIntMap.gh(i8 >>> 7);
                long j2 = i8 & 127;
                int i9 = iGh >> 3;
                int i10 = (iGh & 7) << 3;
                jArr = jArr2;
                long j3 = (jArr3[i9] & (~(255 << i10))) | (j2 << i10);
                jArr3[i9] = j3;
                jArr3[(((iGh - 7) & i3) + (i3 & 7)) >> 3] = j3;
                iArr3[iGh] = i7;
                iArr4[iGh] = iArr2[i5];
            } else {
                jArr = jArr2;
            }
            i5++;
            mutableIntIntMap = this;
            jArr2 = jArr;
        }
    }

    public final void mUb() {
        long j2;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
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
                int iGh = gh(i13);
                int i14 = i13 & i2;
                int i15 = i5;
                if (((iGh - i14) & i2) / 8 == ((i9 - i14) & i2) / 8) {
                    jArr[i10] = (((long) (i12 & 127)) << i11) | ((~(255 << i11)) & jArr[i10]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i15] & j4) | Long.MIN_VALUE;
                    i9++;
                    i5 = i15;
                } else {
                    int i16 = iGh >> 3;
                    long j6 = jArr[i16];
                    int i17 = (iGh & 7) << 3;
                    if (((j6 >> i17) & 255) == 128) {
                        j2 = j4;
                        jArr[i16] = (((long) (i12 & 127)) << i17) | (j6 & (~(255 << i17)));
                        jArr[i10] = (jArr[i10] & (~(255 << i11))) | (128 << i11);
                        iArr[iGh] = iArr[i9];
                        iArr[i9] = i15;
                        iArr2[iGh] = iArr2[i9];
                        iArr2[i9] = i15;
                    } else {
                        j2 = j4;
                        jArr[i16] = (((long) (i12 & 127)) << i17) | (j6 & (~(255 << i17)));
                        int i18 = iArr[iGh];
                        iArr[iGh] = iArr[i9];
                        iArr[i9] = i18;
                        int i19 = iArr2[iGh];
                        iArr2[iGh] = iArr2[i9];
                        iArr2[i9] = i19;
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
        az();
    }

    private final void az() {
        this.growthLimit = ScatterMapKt.rl(get_capacity()) - this._size;
    }

    public final void Ik(int key, int value) {
        int iQie = qie(key);
        if (iQie < 0) {
            iQie = ~iQie;
        }
        this.keys[iQie] = key;
        this.values[iQie] = value;
    }

    public /* synthetic */ MutableIntIntMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }
}
