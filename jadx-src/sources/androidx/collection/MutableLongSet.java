package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u0005R\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/collection/MutableLongSet;", "Landroidx/collection/LongSet;", "", "initialCapacity", "<init>", "(I)V", "", "gh", "capacity", "mUb", "xMQ", "()V", "index", "ty", "", "element", "Uo", "(J)I", "hash1", "KN", "(I)I", "qie", "(J)V", "", "az", "(J)Z", "O", "J2", "newCapacity", "HI", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 LongSet.kt\nandroidx/collection/LongSet\n+ 7 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,885:1\n59#2,5:886\n1#3:891\n1254#4,6:892\n1399#4:911\n1270#4:915\n1179#4:931\n1175#4:934\n1372#4,3:938\n1386#4,3:942\n1312#4:946\n1303#4:948\n1297#4:949\n1309#4:954\n1393#4:956\n1179#4:970\n1175#4:973\n1372#4,3:977\n1386#4,3:981\n1312#4:985\n1303#4:987\n1297#4:988\n1309#4:993\n1393#4:995\n1399#4:1017\n1270#4:1021\n1230#4:1032\n1254#4,6:1033\n1242#4:1039\n1241#4,4:1040\n1254#4,6:1044\n1175#4:1053\n1179#4:1054\n1372#4,3:1055\n1386#4,3:1058\n1312#4:1061\n1303#4:1062\n1297#4:1063\n1309#4:1064\n1393#4:1065\n1265#4:1066\n1220#4:1067\n1262#4:1068\n1220#4:1069\n1230#4:1070\n1254#4,6:1071\n1242#4:1077\n1241#4,4:1078\n1372#4,3:1082\n1399#4:1085\n1297#4:1086\n1144#4,14:1087\n1220#4:1101\n1175#4:1105\n1179#4:1106\n1254#4,6:1107\n1220#4:1113\n1179#4:1114\n1254#4,6:1115\n1254#4,6:1121\n1179#4:1127\n1254#4,6:1128\n1268#4:1134\n1220#4:1135\n1175#4:1139\n1179#4:1140\n1230#4:1141\n1254#4,6:1142\n1242#4:1148\n1241#4,4:1149\n13337#5,2:898\n13337#5,2:1004\n256#6,4:900\n226#6,7:904\n237#6,3:912\n240#6,9:916\n260#6:925\n426#6:926\n427#6:930\n429#6,2:932\n431#6,3:935\n434#6:941\n435#6:945\n436#6:947\n437#6,4:950\n443#6:955\n444#6,8:957\n426#6:965\n427#6:969\n429#6,2:971\n431#6,3:974\n434#6:980\n435#6:984\n436#6:986\n437#6,4:989\n443#6:994\n444#6,8:996\n256#6,4:1006\n226#6,7:1010\n237#6,3:1018\n240#6,9:1022\n260#6:1031\n881#7,3:927\n881#7,3:966\n881#7,3:1050\n881#7,3:1102\n881#7,3:1136\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n*L\n478#1:886,5\n505#1:892,6\n578#1:911\n578#1:915\n589#1:931\n589#1:934\n589#1:938,3\n589#1:942,3\n589#1:946\n589#1:948\n589#1:949\n589#1:954\n589#1:956\n603#1:970\n603#1:973\n603#1:977,3\n603#1:981,3\n603#1:985\n603#1:987\n603#1:988\n603#1:993\n603#1:995\n648#1:1017\n648#1:1021\n656#1:1032\n656#1:1033,6\n656#1:1039\n656#1:1040,4\n664#1:1044,6\n677#1:1053\n678#1:1054\n685#1:1055,3\n686#1:1058,3\n687#1:1061\n688#1:1062\n688#1:1063\n692#1:1064\n695#1:1065\n704#1:1066\n704#1:1067\n710#1:1068\n710#1:1069\n711#1:1070\n711#1:1071,6\n711#1:1077\n711#1:1078,4\n725#1:1082,3\n726#1:1085\n728#1:1086\n774#1:1087,14\n780#1:1101\n795#1:1105\n806#1:1106\n807#1:1107,6\n817#1:1113\n820#1:1114\n821#1:1115,6\n822#1:1121,6\n829#1:1127\n830#1:1128,6\n863#1:1134\n863#1:1135\n866#1:1139\n868#1:1140\n868#1:1141\n868#1:1142,6\n868#1:1148\n868#1:1149,4\n556#1:898,2\n627#1:1004,2\n578#1:900,4\n578#1:904,7\n578#1:912,3\n578#1:916,9\n578#1:925\n589#1:926\n589#1:930\n589#1:932,2\n589#1:935,3\n589#1:941\n589#1:945\n589#1:947\n589#1:950,4\n589#1:955\n589#1:957,8\n603#1:965\n603#1:969\n603#1:971,2\n603#1:974,3\n603#1:980\n603#1:984\n603#1:986\n603#1:989,4\n603#1:994\n603#1:996,8\n648#1:1006,4\n648#1:1010,7\n648#1:1018,3\n648#1:1022,9\n648#1:1031\n589#1:927,3\n603#1:966,3\n676#1:1050,3\n794#1:1102,3\n865#1:1136,3\n*E\n"})
public final class MutableLongSet extends LongSet {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public MutableLongSet(int i2) {
        super(null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.n("Capacity must be a positive value.");
        }
        gh(ScatterMapKt.J2(i2));
    }

    private final int KN(int hash1) {
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

    private final int Uo(long element) {
        int iHashCode = Long.hashCode(element) * (-862048943);
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
            int i12 = i9;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i7;
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iKN = KN(i3);
                if (this.growthLimit == 0 && ((this.metadata[iKN >> 3] >> ((iKN & 7) << 3)) & 255) != 254) {
                    O();
                    iKN = KN(i3);
                }
                this._size++;
                int i13 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i14 = iKN >> 3;
                long j6 = jArr2[i14];
                int i15 = (iKN & 7) << 3;
                this.growthLimit = i13 - (((j6 >> i15) & 255) == 128 ? 1 : 0);
                int i16 = this._capacity;
                long j7 = ((~(255 << i15)) & j6) | (j3 << i15);
                jArr2[i14] = j7;
                jArr2[(((iKN - 7) & i16) + (i16 & 7)) >> 3] = j7;
                return iKN;
            }
            i9 = i12 + 8;
            i8 = (i8 + i9) & i7;
        }
    }

    private final void gh(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.O(initialCapacity)) : 0;
        this._capacity = iMax;
        mUb(iMax);
        this.elements = new long[iMax];
    }

    private final void mUb(int capacity) {
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
        xMQ();
    }

    private final void ty(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = index >> 3;
        int i5 = (index & 7) << 3;
        long j2 = (jArr[i3] & (~(255 << i5))) | (254 << i5);
        jArr[i3] = j2;
        jArr[(((index - 7) & i2) + (i2 & 7)) >> 3] = j2;
    }

    public final void HI(int newCapacity) {
        long[] jArr = this.metadata;
        long[] jArr2 = this.elements;
        int i2 = this._capacity;
        gh(newCapacity);
        long[] jArr3 = this.metadata;
        long[] jArr4 = this.elements;
        int i3 = this._capacity;
        for (int i5 = 0; i5 < i2; i5++) {
            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                long j2 = jArr2[i5];
                int iHashCode = Long.hashCode(j2) * (-862048943);
                int i7 = iHashCode ^ (iHashCode << 16);
                int iKN = KN(i7 >>> 7);
                long j3 = i7 & 127;
                int i8 = iKN >> 3;
                int i9 = (iKN & 7) << 3;
                long j4 = (jArr3[i8] & (~(255 << i9))) | (j3 << i9);
                jArr3[i8] = j4;
                jArr3[(((iKN - 7) & i3) + (i3 & 7)) >> 3] = j4;
                jArr4[iKN] = j2;
            }
        }
    }

    public final void J2() {
        long j2;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        long[] jArr2 = this.elements;
        int i3 = (i2 + 7) >> 3;
        char c2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = jArr[i5] & (-9187201950435737472L);
            jArr[i5] = (-72340172838076674L) & ((~j3) + (j3 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i7 = lastIndex - 1;
        long j4 = 72057594037927935L;
        jArr[i7] = (jArr[i7] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i8 = 0;
        while (i8 != i2) {
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j5 = (jArr[i9] >> i10) & 255;
            if (j5 != 128 && j5 == 254) {
                int iHashCode = Long.hashCode(jArr2[i8]) * (-862048943);
                int i11 = iHashCode ^ (iHashCode << 16);
                int i12 = i11 >>> 7;
                int iKN = KN(i12);
                int i13 = i12 & i2;
                char c4 = c2;
                if (((iKN - i13) & i2) / 8 == ((i8 - i13) & i2) / 8) {
                    jArr[i9] = (((long) (i11 & 127)) << i10) | ((~(255 << i10)) & jArr[i9]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[c4] & j4) | Long.MIN_VALUE;
                    i8++;
                    c2 = c4;
                } else {
                    int i14 = iKN >> 3;
                    long j6 = jArr[i14];
                    int i15 = (iKN & 7) << 3;
                    if (((j6 >> i15) & 255) == 128) {
                        j2 = j4;
                        jArr[i14] = (((long) (i11 & 127)) << i15) | (j6 & (~(255 << i15)));
                        jArr[i9] = (jArr[i9] & (~(255 << i10))) | (128 << i10);
                        jArr2[iKN] = jArr2[i8];
                        jArr2[i8] = 0;
                    } else {
                        j2 = j4;
                        jArr[i14] = (((long) (i11 & 127)) << i15) | (j6 & (~(255 << i15)));
                        long j7 = jArr2[iKN];
                        jArr2[iKN] = jArr2[i8];
                        jArr2[i8] = j7;
                        i8--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[c4] & j2) | Long.MIN_VALUE;
                    i8++;
                    c2 = c4;
                    j4 = j2;
                }
            } else {
                i8++;
            }
        }
        xMQ();
    }

    public final void O() {
        if (this._capacity <= 8 || Long.compare(ULong.m487constructorimpl(ULong.m487constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m487constructorimpl(ULong.m487constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            HI(ScatterMapKt.nr(this._capacity));
        } else {
            J2();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean az(long element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(element) * (-862048943);
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
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i5;
        }
        boolean z2 = iNumberOfTrailingZeros >= 0;
        if (z2) {
            ty(iNumberOfTrailingZeros);
        }
        return z2;
    }

    private final void xMQ() {
        this.growthLimit = ScatterMapKt.rl(get_capacity()) - this._size;
    }

    public final void qie(long element) {
        this.elements[Uo(element)] = element;
    }
}
