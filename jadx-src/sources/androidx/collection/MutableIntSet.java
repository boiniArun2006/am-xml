package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\u0005R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/collection/MutableIntSet;", "Landroidx/collection/IntSet;", "", "initialCapacity", "<init>", "(I)V", "", "HI", "capacity", "ty", "az", "()V", "index", "Z", "element", "gh", "(I)I", "hash1", "qie", "", "Uo", "(I)Z", "r", "ck", "elements", "o", "(Landroidx/collection/IntSet;)Z", "Ik", "(Landroidx/collection/IntSet;)V", "xMQ", "KN", "mUb", "newCapacity", "XQ", "O", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 IntSet.kt\nandroidx/collection/IntSet\n+ 7 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,884:1\n59#2,5:885\n1#3:890\n1254#4,6:891\n1399#4:910\n1270#4:914\n1179#4:930\n1175#4:933\n1372#4,3:937\n1386#4,3:941\n1312#4:945\n1303#4:947\n1297#4:948\n1309#4:953\n1393#4:955\n1179#4:969\n1175#4:972\n1372#4,3:976\n1386#4,3:980\n1312#4:984\n1303#4:986\n1297#4:987\n1309#4:992\n1393#4:994\n1399#4:1016\n1270#4:1020\n1230#4:1031\n1254#4,6:1032\n1242#4:1038\n1241#4,4:1039\n1254#4,6:1043\n1175#4:1052\n1179#4:1053\n1372#4,3:1054\n1386#4,3:1057\n1312#4:1060\n1303#4:1061\n1297#4:1062\n1309#4:1063\n1393#4:1064\n1265#4:1065\n1220#4:1066\n1262#4:1067\n1220#4:1068\n1230#4:1069\n1254#4,6:1070\n1242#4:1076\n1241#4,4:1077\n1372#4,3:1081\n1399#4:1084\n1297#4:1085\n1144#4,14:1086\n1220#4:1100\n1175#4:1104\n1179#4:1105\n1254#4,6:1106\n1220#4:1112\n1179#4:1113\n1254#4,6:1114\n1254#4,6:1120\n1179#4:1126\n1254#4,6:1127\n1268#4:1133\n1220#4:1134\n1175#4:1138\n1179#4:1139\n1230#4:1140\n1254#4,6:1141\n1242#4:1147\n1241#4,4:1148\n13330#5,2:897\n13330#5,2:1003\n255#6,4:899\n225#6,7:903\n236#6,3:911\n239#6,9:915\n259#6:924\n425#6:925\n426#6:929\n428#6,2:931\n430#6,3:934\n433#6:940\n434#6:944\n435#6:946\n436#6,4:949\n442#6:954\n443#6,8:956\n425#6:964\n426#6:968\n428#6,2:970\n430#6,3:973\n433#6:979\n434#6:983\n435#6:985\n436#6,4:988\n442#6:993\n443#6,8:995\n255#6,4:1005\n225#6,7:1009\n236#6,3:1017\n239#6,9:1021\n259#6:1030\n880#7,3:926\n880#7,3:965\n880#7,3:1049\n880#7,3:1101\n880#7,3:1135\n*S KotlinDebug\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n*L\n477#1:885,5\n504#1:891,6\n577#1:910\n577#1:914\n588#1:930\n588#1:933\n588#1:937,3\n588#1:941,3\n588#1:945\n588#1:947\n588#1:948\n588#1:953\n588#1:955\n602#1:969\n602#1:972\n602#1:976,3\n602#1:980,3\n602#1:984\n602#1:986\n602#1:987\n602#1:992\n602#1:994\n647#1:1016\n647#1:1020\n655#1:1031\n655#1:1032,6\n655#1:1038\n655#1:1039,4\n663#1:1043,6\n676#1:1052\n677#1:1053\n684#1:1054,3\n685#1:1057,3\n686#1:1060\n687#1:1061\n687#1:1062\n691#1:1063\n694#1:1064\n703#1:1065\n703#1:1066\n709#1:1067\n709#1:1068\n710#1:1069\n710#1:1070,6\n710#1:1076\n710#1:1077,4\n724#1:1081,3\n725#1:1084\n727#1:1085\n773#1:1086,14\n779#1:1100\n794#1:1104\n805#1:1105\n806#1:1106,6\n816#1:1112\n819#1:1113\n820#1:1114,6\n821#1:1120,6\n828#1:1126\n829#1:1127,6\n862#1:1133\n862#1:1134\n865#1:1138\n867#1:1139\n867#1:1140\n867#1:1141,6\n867#1:1147\n867#1:1148,4\n555#1:897,2\n626#1:1003,2\n577#1:899,4\n577#1:903,7\n577#1:911,3\n577#1:915,9\n577#1:924\n588#1:925\n588#1:929\n588#1:931,2\n588#1:934,3\n588#1:940\n588#1:944\n588#1:946\n588#1:949,4\n588#1:954\n588#1:956,8\n602#1:964\n602#1:968\n602#1:970,2\n602#1:973,3\n602#1:979\n602#1:983\n602#1:985\n602#1:988,4\n602#1:993\n602#1:995,8\n647#1:1005,4\n647#1:1009,7\n647#1:1017,3\n647#1:1021,9\n647#1:1030\n588#1:926,3\n602#1:965,3\n675#1:1049,3\n793#1:1101,3\n864#1:1135,3\n*E\n"})
public final class MutableIntSet extends IntSet {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public MutableIntSet(int i2) {
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
        this.elements = new int[iMax];
    }

    private final void Z(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = index >> 3;
        int i5 = (index & 7) << 3;
        long j2 = (jArr[i3] & (~(255 << i5))) | (254 << i5);
        jArr[i3] = j2;
        jArr[(((index - 7) & i2) + (i2 & 7)) >> 3] = j2;
    }

    private final int gh(int element) {
        int iHashCode = Integer.hashCode(element) * (-862048943);
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
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    return iNumberOfTrailingZeros;
                }
                j5 &= j5 - 1;
                i12 = i14;
            }
            int i15 = i12;
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iQie = qie(i3);
                if (this.growthLimit == 0 && ((this.metadata[iQie >> 3] >> ((iQie & 7) << 3)) & 255) != 254) {
                    KN();
                    iQie = qie(i3);
                }
                this._size++;
                int i16 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i17 = iQie >> 3;
                long j6 = jArr2[i17];
                int i18 = (iQie & 7) << 3;
                this.growthLimit = i16 - (((j6 >> i18) & 255) == 128 ? i15 : 0);
                int i19 = this._capacity;
                long j7 = ((~(255 << i18)) & j6) | (j3 << i18);
                jArr2[i17] = j7;
                jArr2[(((iQie - 7) & i19) + (i19 & 7)) >> 3] = j7;
                return iQie;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
        }
    }

    private final int qie(int hash1) {
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

    public final void Ik(IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.elements;
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
                        ck(iArr[(i2 << 3) + i5]);
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

    public final void KN() {
        if (this._capacity <= 8 || Long.compare(ULong.m487constructorimpl(ULong.m487constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m487constructorimpl(ULong.m487constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            XQ(ScatterMapKt.nr(this._capacity));
        } else {
            mUb();
        }
    }

    public final boolean Uo(int element) {
        int i2 = this._size;
        this.elements[gh(element)] = element;
        return this._size != i2;
    }

    public final void XQ(int newCapacity) {
        long[] jArr = this.metadata;
        int[] iArr = this.elements;
        int i2 = this._capacity;
        HI(newCapacity);
        long[] jArr2 = this.metadata;
        int[] iArr2 = this.elements;
        int i3 = this._capacity;
        for (int i5 = 0; i5 < i2; i5++) {
            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                int i7 = iArr[i5];
                int iHashCode = Integer.hashCode(i7) * (-862048943);
                int i8 = iHashCode ^ (iHashCode << 16);
                int iQie = qie(i8 >>> 7);
                long j2 = i8 & 127;
                int i9 = iQie >> 3;
                int i10 = (iQie & 7) << 3;
                long j3 = (jArr2[i9] & (~(255 << i10))) | (j2 << i10);
                jArr2[i9] = j3;
                jArr2[(((iQie - 7) & i3) + (i3 & 7)) >> 3] = j3;
                iArr2[iQie] = i7;
            }
        }
    }

    public final void mUb() {
        long j2;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int[] iArr = this.elements;
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
                int iQie = qie(i13);
                int i14 = i13 & i2;
                int i15 = i5;
                if (((iQie - i14) & i2) / 8 == ((i9 - i14) & i2) / 8) {
                    jArr[i10] = (((long) (i12 & 127)) << i11) | ((~(255 << i11)) & jArr[i10]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i15] & j4) | Long.MIN_VALUE;
                    i9++;
                    i5 = i15;
                } else {
                    int i16 = iQie >> 3;
                    long j6 = jArr[i16];
                    int i17 = (iQie & 7) << 3;
                    if (((j6 >> i17) & 255) == 128) {
                        j2 = j4;
                        jArr[i16] = (((long) (i12 & 127)) << i17) | (j6 & (~(255 << i17)));
                        jArr[i10] = (jArr[i10] & (~(255 << i11))) | (128 << i11);
                        iArr[iQie] = iArr[i9];
                        iArr[i9] = i15;
                    } else {
                        j2 = j4;
                        jArr[i16] = (((long) (i12 & 127)) << i17) | (j6 & (~(255 << i17)));
                        int i18 = iArr[iQie];
                        iArr[iQie] = iArr[i9];
                        iArr[i9] = i18;
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

    public final boolean o(IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        Ik(elements);
        return i2 != this._size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(int element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(element) * (-862048943);
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
            Z(iNumberOfTrailingZeros);
        }
        return z2;
    }

    private final void az() {
        this.growthLimit = ScatterMapKt.rl(get_capacity()) - this._size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ck(int element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(element) * (-862048943);
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
                } else {
                    j4 &= j4 - 1;
                }
            }
            i8 += 8;
            i7 = (i7 + i8) & i5;
        }
        if (iNumberOfTrailingZeros >= 0) {
            Z(iNumberOfTrailingZeros);
        }
    }

    public /* synthetic */ MutableIntSet(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }
}
