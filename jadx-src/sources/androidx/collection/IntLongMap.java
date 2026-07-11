package androidx.collection;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u0012\u0004\b\u0015\u0010\u0003R\u001c\u0010\u001b\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u0003R\u001c\u0010\u001e\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u0012\u0004\b\u001d\u0010\u0003R\u001c\u0010!\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u0012\u0004\b \u0010\u0003R\u001c\u0010$\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\"\u0010\u001f\u0012\u0004\b#\u0010\u0003R\u0011\u0010%\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\tR\u0011\u0010&\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\t\u0082\u0001\u0001'¨\u0006("}, d2 = {"Landroidx/collection/IntLongMap;", "", "<init>", "()V", "", "nr", "()Z", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "key", c.f62177j, "(I)I", "", "[J", "getMetadata$annotations", TtmlNode.TAG_METADATA, "", "rl", "[I", "getKeys$annotations", IV8ValueMap.FUNCTION_KEYS, "t", "getValues$annotations", IV8ValueMap.FUNCTION_VALUES, "I", "get_capacity$collection$annotations", "_capacity", "O", "get_size$collection$annotations", "_size", "capacity", "size", "Landroidx/collection/MutableIntLongMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntLongMap.kt\nandroidx/collection/IntLongMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,1034:1\n359#1,6:1037\n369#1,3:1044\n372#1,9:1048\n359#1,6:1057\n369#1,3:1064\n372#1,9:1068\n359#1,6:1077\n369#1,3:1084\n372#1,9:1088\n387#1,4:1097\n359#1,6:1101\n369#1,3:1108\n372#1,9:1112\n391#1:1121\n387#1,4:1122\n359#1,6:1126\n369#1,3:1133\n372#1,9:1137\n391#1:1146\n387#1,4:1147\n359#1,6:1151\n369#1,3:1158\n372#1,9:1162\n391#1:1171\n402#1,3:1172\n359#1,6:1175\n369#1,3:1182\n372#1,9:1186\n405#1:1195\n387#1,4:1196\n359#1,6:1200\n369#1,3:1207\n372#1,9:1211\n391#1:1220\n387#1,4:1221\n359#1,6:1225\n369#1,3:1232\n372#1,9:1236\n391#1:1245\n387#1,4:1246\n359#1,6:1250\n369#1,3:1257\n372#1,9:1261\n391#1:1270\n387#1,4:1271\n359#1,6:1275\n369#1,3:1282\n372#1,9:1286\n391#1:1295\n387#1,4:1296\n359#1,6:1300\n369#1,3:1307\n372#1,9:1311\n391#1:1320\n387#1,4:1321\n359#1,6:1325\n369#1,3:1332\n372#1,9:1336\n391#1:1345\n484#1,11:1362\n387#1,4:1373\n359#1,6:1377\n369#1,3:1384\n372#1,2:1388\n495#1,10:1390\n375#1,6:1400\n391#1:1406\n505#1,2:1407\n484#1,11:1409\n387#1,4:1420\n359#1,6:1424\n369#1,3:1431\n372#1,2:1435\n495#1,10:1437\n375#1,6:1447\n391#1:1453\n505#1,2:1454\n484#1,11:1456\n387#1,4:1467\n359#1,6:1471\n369#1,3:1478\n372#1,2:1482\n495#1,10:1484\n375#1,6:1494\n391#1:1500\n505#1,2:1501\n484#1,11:1503\n387#1,4:1514\n359#1,6:1518\n369#1,3:1525\n372#1,2:1529\n495#1,10:1531\n375#1,6:1541\n391#1:1547\n505#1,2:1548\n484#1,11:1550\n387#1,4:1561\n359#1,6:1565\n369#1,3:1572\n372#1,2:1576\n495#1,10:1578\n375#1,6:1588\n391#1:1594\n505#1,2:1595\n1399#2:1035\n1270#2:1036\n1399#2:1043\n1270#2:1047\n1399#2:1063\n1270#2:1067\n1399#2:1083\n1270#2:1087\n1399#2:1107\n1270#2:1111\n1399#2:1132\n1270#2:1136\n1399#2:1157\n1270#2:1161\n1399#2:1181\n1270#2:1185\n1399#2:1206\n1270#2:1210\n1399#2:1231\n1270#2:1235\n1399#2:1256\n1270#2:1260\n1399#2:1281\n1270#2:1285\n1399#2:1306\n1270#2:1310\n1399#2:1331\n1270#2:1335\n1179#2:1349\n1175#2:1350\n1372#2,3:1351\n1386#2,3:1354\n1312#2:1357\n1303#2:1358\n1297#2:1359\n1309#2:1360\n1393#2:1361\n1399#2:1383\n1270#2:1387\n1399#2:1430\n1270#2:1434\n1399#2:1477\n1270#2:1481\n1399#2:1524\n1270#2:1528\n1399#2:1571\n1270#2:1575\n880#3,3:1346\n*S KotlinDebug\n*F\n+ 1 IntLongMap.kt\nandroidx/collection/IntLongMap\n*L\n390#1:1037,6\n390#1:1044,3\n390#1:1048,9\n397#1:1057,6\n397#1:1064,3\n397#1:1068,9\n404#1:1077,6\n404#1:1084,3\n404#1:1088,9\n409#1:1097,4\n409#1:1101,6\n409#1:1108,3\n409#1:1112,9\n409#1:1121\n415#1:1122,4\n415#1:1126,6\n415#1:1133,3\n415#1:1137,9\n415#1:1146\n425#1:1147,4\n425#1:1151,6\n425#1:1158,3\n425#1:1162,9\n425#1:1171\n437#1:1172,3\n437#1:1175,6\n437#1:1182,3\n437#1:1186,9\n437#1:1195\n459#1:1196,4\n459#1:1200,6\n459#1:1207,3\n459#1:1211,9\n459#1:1220\n494#1:1221,4\n494#1:1225,6\n494#1:1232,3\n494#1:1236,9\n494#1:1245\n494#1:1246,4\n494#1:1250,6\n494#1:1257,3\n494#1:1261,9\n494#1:1270\n515#1:1271,4\n515#1:1275,6\n515#1:1282,3\n515#1:1286,9\n515#1:1295\n539#1:1296,4\n539#1:1300,6\n539#1:1307,3\n539#1:1311,9\n539#1:1320\n561#1:1321,4\n561#1:1325,6\n561#1:1332,3\n561#1:1336,9\n561#1:1345\n-1#1:1362,11\n-1#1:1373,4\n-1#1:1377,6\n-1#1:1384,3\n-1#1:1388,2\n-1#1:1390,10\n-1#1:1400,6\n-1#1:1406\n-1#1:1407,2\n-1#1:1409,11\n-1#1:1420,4\n-1#1:1424,6\n-1#1:1431,3\n-1#1:1435,2\n-1#1:1437,10\n-1#1:1447,6\n-1#1:1453\n-1#1:1454,2\n-1#1:1456,11\n-1#1:1467,4\n-1#1:1471,6\n-1#1:1478,3\n-1#1:1482,2\n-1#1:1484,10\n-1#1:1494,6\n-1#1:1500\n-1#1:1501,2\n-1#1:1503,11\n-1#1:1514,4\n-1#1:1518,6\n-1#1:1525,3\n-1#1:1529,2\n-1#1:1531,10\n-1#1:1541,6\n-1#1:1547\n-1#1:1548,2\n-1#1:1550,11\n-1#1:1561,4\n-1#1:1565,6\n-1#1:1572,3\n-1#1:1576,2\n-1#1:1578,10\n-1#1:1588,6\n-1#1:1594\n-1#1:1595,2\n364#1:1035\n371#1:1036\n390#1:1043\n390#1:1047\n397#1:1063\n397#1:1067\n404#1:1083\n404#1:1087\n409#1:1107\n409#1:1111\n415#1:1132\n415#1:1136\n425#1:1157\n425#1:1161\n437#1:1181\n437#1:1185\n459#1:1206\n459#1:1210\n494#1:1231\n494#1:1235\n494#1:1256\n494#1:1260\n515#1:1281\n515#1:1285\n539#1:1306\n539#1:1310\n561#1:1331\n561#1:1335\n581#1:1349\n584#1:1350\n588#1:1351,3\n589#1:1354,3\n590#1:1357\n591#1:1358\n591#1:1359\n595#1:1360\n598#1:1361\n-1#1:1383\n-1#1:1387\n-1#1:1430\n-1#1:1434\n-1#1:1477\n-1#1:1481\n-1#1:1524\n-1#1:1528\n-1#1:1571\n-1#1:1575\n580#1:1346,3\n*E\n"})
public abstract class IntLongMap {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public int _size;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public int _capacity;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public int[] keys;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public long[] values;

    public /* synthetic */ IntLongMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IntLongMap() {
        this.metadata = ScatterMapKt.f14890n;
        this.keys = IntSetKt.n();
        this.values = LongSetKt.n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IntLongMap)) {
            return false;
        }
        IntLongMap intLongMap = (IntLongMap) other;
        if (intLongMap.get_size() != get_size()) {
            return false;
        }
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            loop0: while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i2 << 3) + i5;
                            int i8 = iArr[i7];
                            long j3 = jArr[i7];
                            int iN = intLongMap.n(i8);
                            if (iN < 0 || j3 != intLongMap.values[iN]) {
                                break loop0;
                            }
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
        int[] iArr = this.keys;
        long[] jArr = this.values;
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
                        int i7 = (i2 << 3) + i5;
                        iHashCode += Integer.hashCode(iArr[i7]) ^ Long.hashCode(jArr[i7]);
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

    public final boolean nr() {
        return this._size == 0;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public String toString() {
        int i2;
        int i3;
        if (nr()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i7 = 0;
            while (true) {
                long j2 = jArr2[i5];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i5 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((255 & j2) < 128) {
                            int i10 = (i5 << 3) + i9;
                            int i11 = iArr[i10];
                            i3 = i5;
                            long j3 = jArr[i10];
                            sb.append(i11);
                            sb.append(l.ae);
                            sb.append(j3);
                            i7++;
                            if (i7 < this._size) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        } else {
                            i3 = i5;
                        }
                        j2 >>= 8;
                        i9++;
                        i5 = i3;
                    }
                    int i12 = i5;
                    if (i8 != 8) {
                        break;
                    }
                    i2 = i12;
                } else {
                    i2 = i5;
                }
                if (i2 == length) {
                    break;
                }
                i5 = i2 + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final int n(int key) {
        int iHashCode = Integer.hashCode(key) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i5 = this._capacity;
        int i7 = (i2 >>> 7) & i5;
        int i8 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j2 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j3 = (((long) i3) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i7) & i5;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i5;
        }
    }
}
