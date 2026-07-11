package androidx.collection;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u0012\u0004\b\u001c\u0010\u0003R\u001c\u0010 \u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b\u001f\u0010\u0003R\u0016\u0010\"\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0016\u0010$\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0011\u0010%\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014\u0082\u0001\u0001&¨\u0006'"}, d2 = {"Landroidx/collection/LongSet;", "", "<init>", "()V", "", "element", "", c.f62177j, "(J)Z", "", "separator", "prefix", "postfix", "", "limit", "truncated", "", "t", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "[J", "getMetadata$annotations", TtmlNode.TAG_METADATA, "rl", "getElements$annotations", "elements", "I", "_capacity", "nr", "_size", "capacity", "Landroidx/collection/MutableLongSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,885:1\n256#1,4:886\n226#1,7:890\n237#1,3:898\n240#1,9:902\n260#1:911\n256#1,4:912\n226#1,7:916\n237#1,3:924\n240#1,9:928\n260#1:937\n226#1,7:940\n237#1,3:948\n240#1,9:952\n256#1,4:961\n226#1,7:965\n237#1,3:973\n240#1,9:977\n260#1:986\n256#1,4:987\n226#1,7:991\n237#1,3:999\n240#1,9:1003\n260#1:1012\n256#1,4:1013\n226#1,7:1017\n237#1,3:1025\n240#1,9:1029\n260#1:1038\n426#1:1039\n427#1:1043\n429#1,2:1045\n431#1,3:1048\n434#1:1054\n435#1:1058\n436#1:1060\n437#1,4:1063\n443#1:1068\n444#1,8:1070\n256#1,4:1078\n226#1,7:1082\n237#1,3:1090\n240#1,9:1094\n260#1:1103\n256#1,4:1104\n226#1,7:1108\n237#1,3:1116\n240#1,9:1120\n260#1:1129\n256#1,4:1130\n226#1,7:1134\n237#1,3:1142\n240#1,9:1146\n260#1:1155\n256#1,4:1156\n226#1,7:1160\n237#1,3:1168\n240#1,9:1172\n260#1:1181\n256#1,4:1182\n226#1,7:1186\n237#1,3:1194\n240#1,9:1198\n260#1:1207\n351#1,11:1224\n256#1,4:1235\n226#1,7:1239\n237#1,3:1247\n240#1,2:1251\n362#1,10:1253\n243#1,6:1263\n260#1:1269\n372#1,2:1270\n351#1,11:1272\n256#1,4:1283\n226#1,7:1287\n237#1,3:1295\n240#1,2:1299\n362#1,10:1301\n243#1,6:1311\n260#1:1317\n372#1,2:1318\n351#1,11:1320\n256#1,4:1331\n226#1,7:1335\n237#1,3:1343\n240#1,2:1347\n362#1,10:1349\n243#1,6:1359\n260#1:1365\n372#1,2:1366\n351#1,11:1368\n256#1,4:1379\n226#1,7:1383\n237#1,3:1391\n240#1,2:1395\n362#1,10:1397\n243#1,6:1407\n260#1:1413\n372#1,2:1414\n351#1,11:1416\n256#1,4:1427\n226#1,7:1431\n237#1,3:1439\n240#1,2:1443\n362#1,10:1445\n243#1,6:1455\n260#1:1461\n372#1,2:1462\n1399#2:897\n1270#2:901\n1399#2:923\n1270#2:927\n1399#2:938\n1270#2:939\n1399#2:947\n1270#2:951\n1399#2:972\n1270#2:976\n1399#2:998\n1270#2:1002\n1399#2:1024\n1270#2:1028\n1179#2:1044\n1175#2:1047\n1372#2,3:1051\n1386#2,3:1055\n1312#2:1059\n1303#2:1061\n1297#2:1062\n1309#2:1067\n1393#2:1069\n1399#2:1089\n1270#2:1093\n1399#2:1115\n1270#2:1119\n1399#2:1141\n1270#2:1145\n1399#2:1167\n1270#2:1171\n1399#2:1193\n1270#2:1197\n1179#2:1211\n1175#2:1212\n1372#2,3:1213\n1386#2,3:1216\n1312#2:1219\n1303#2:1220\n1297#2:1221\n1309#2:1222\n1393#2:1223\n1399#2:1246\n1270#2:1250\n1399#2:1294\n1270#2:1298\n1399#2:1342\n1270#2:1346\n1399#2:1390\n1270#2:1394\n1399#2:1438\n1270#2:1442\n881#3,3:1040\n881#3,3:1208\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n*L\n198#1:886,4\n198#1:890,7\n198#1:898,3\n198#1:902,9\n198#1:911\n219#1:912,4\n219#1:916,7\n219#1:924,3\n219#1:928,9\n219#1:937\n259#1:940,7\n259#1:948,3\n259#1:952,9\n270#1:961,4\n270#1:965,7\n270#1:973,3\n270#1:977,9\n270#1:986\n282#1:987,4\n282#1:991,7\n282#1:999,3\n282#1:1003,9\n282#1:1012\n299#1:1013,4\n299#1:1017,7\n299#1:1025,3\n299#1:1029,9\n299#1:1038\n308#1:1039\n308#1:1043\n308#1:1045,2\n308#1:1048,3\n308#1:1054\n308#1:1058\n308#1:1060\n308#1:1063,4\n308#1:1068\n308#1:1070,8\n328#1:1078,4\n328#1:1082,7\n328#1:1090,3\n328#1:1094,9\n328#1:1103\n361#1:1104,4\n361#1:1108,7\n361#1:1116,3\n361#1:1120,9\n361#1:1129\n361#1:1130,4\n361#1:1134,7\n361#1:1142,3\n361#1:1146,9\n361#1:1155\n382#1:1156,4\n382#1:1160,7\n382#1:1168,3\n382#1:1172,9\n382#1:1181\n406#1:1182,4\n406#1:1186,7\n406#1:1194,3\n406#1:1198,9\n406#1:1207\n-1#1:1224,11\n-1#1:1235,4\n-1#1:1239,7\n-1#1:1247,3\n-1#1:1251,2\n-1#1:1253,10\n-1#1:1263,6\n-1#1:1269\n-1#1:1270,2\n-1#1:1272,11\n-1#1:1283,4\n-1#1:1287,7\n-1#1:1295,3\n-1#1:1299,2\n-1#1:1301,10\n-1#1:1311,6\n-1#1:1317\n-1#1:1318,2\n-1#1:1320,11\n-1#1:1331,4\n-1#1:1335,7\n-1#1:1343,3\n-1#1:1347,2\n-1#1:1349,10\n-1#1:1359,6\n-1#1:1365\n-1#1:1366,2\n-1#1:1368,11\n-1#1:1379,4\n-1#1:1383,7\n-1#1:1391,3\n-1#1:1395,2\n-1#1:1397,10\n-1#1:1407,6\n-1#1:1413\n-1#1:1414,2\n-1#1:1416,11\n-1#1:1427,4\n-1#1:1431,7\n-1#1:1439,3\n-1#1:1443,2\n-1#1:1445,10\n-1#1:1455,6\n-1#1:1461\n-1#1:1462,2\n198#1:897\n198#1:901\n219#1:923\n219#1:927\n232#1:938\n239#1:939\n259#1:947\n259#1:951\n270#1:972\n270#1:976\n282#1:998\n282#1:1002\n299#1:1024\n299#1:1028\n308#1:1044\n308#1:1047\n308#1:1051,3\n308#1:1055,3\n308#1:1059\n308#1:1061\n308#1:1062\n308#1:1067\n308#1:1069\n328#1:1089\n328#1:1093\n361#1:1115\n361#1:1119\n361#1:1141\n361#1:1145\n382#1:1167\n382#1:1171\n406#1:1193\n406#1:1197\n427#1:1211\n430#1:1212\n433#1:1213,3\n434#1:1216,3\n435#1:1219\n436#1:1220\n436#1:1221\n440#1:1222\n443#1:1223\n-1#1:1246\n-1#1:1250\n-1#1:1294\n-1#1:1298\n-1#1:1342\n-1#1:1346\n-1#1:1390\n-1#1:1394\n-1#1:1438\n-1#1:1442\n308#1:1040,3\n426#1:1208,3\n*E\n"})
public abstract class LongSet {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public int _size;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public long[] elements;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public int _capacity;

    public /* synthetic */ LongSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LongSet() {
        this.metadata = ScatterMapKt.f14890n;
        this.elements = LongSetKt.n();
    }

    public static /* synthetic */ String nr(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return longSet.t(charSequence, charSequence2, charSequence6, i2, charSequence5);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LongSet)) {
            return false;
        }
        LongSet longSet = (LongSet) other;
        if (longSet._size != this._size) {
            return false;
        }
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128 && !longSet.n(jArr[(i2 << 3) + i5])) {
                            return false;
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iHashCode = 0;
        while (true) {
            long j2 = jArr2[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i3; i5++) {
                    if ((255 & j2) < 128) {
                        iHashCode += Long.hashCode(jArr[(i2 << 3) + i5]);
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return iHashCode;
                }
            }
            if (i2 == length) {
                return iHashCode;
            }
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(long element) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public final String t(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        int i2;
        int i3;
        int i5;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            loop0: while (true) {
                long j2 = jArr2[i7];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j2 & 255) < 128) {
                            i3 = i7;
                            long j3 = jArr[(i7 << 3) + i11];
                            i5 = i9;
                            if (i8 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i8 != 0) {
                                sb.append(separator);
                            }
                            sb.append(j3);
                            i8++;
                        } else {
                            i3 = i7;
                            i5 = i9;
                        }
                        j2 >>= i5;
                        i11++;
                        i9 = i5;
                        i7 = i3;
                    }
                    int i12 = i7;
                    if (i10 != i9) {
                        break;
                    }
                    i2 = i12;
                } else {
                    i2 = i7;
                }
                if (i2 == length) {
                    break;
                }
                i7 = i2 + 1;
            }
            sb.append(postfix);
        } else {
            sb.append(postfix);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public String toString() {
        return nr(this, null, "[", "]", 0, null, 25, null);
    }
}
