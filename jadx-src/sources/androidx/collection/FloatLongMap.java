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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u0012\u0004\b\u0016\u0010\u0003R\u001c\u0010\u001c\u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u0003R\u001c\u0010\u001f\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u0012\u0004\b\u001e\u0010\u0003R\u001c\u0010\"\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0005\u0010 \u0012\u0004\b!\u0010\u0003R\u001c\u0010%\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b#\u0010 \u0012\u0004\b$\u0010\u0003R\u0011\u0010&\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0011\u0010'\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\t\u0082\u0001\u0001(¨\u0006)"}, d2 = {"Landroidx/collection/FloatLongMap;", "", "<init>", "()V", "", "nr", "()Z", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "key", c.f62177j, "(F)I", "", "[J", "getMetadata$annotations", TtmlNode.TAG_METADATA, "", "rl", "[F", "getKeys$annotations", IV8ValueMap.FUNCTION_KEYS, "t", "getValues$annotations", IV8ValueMap.FUNCTION_VALUES, "I", "get_capacity$collection$annotations", "_capacity", "O", "get_size$collection$annotations", "_size", "capacity", "size", "Landroidx/collection/MutableFloatLongMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatLongMap.kt\nandroidx/collection/FloatLongMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1036:1\n361#1,6:1039\n371#1,3:1046\n374#1,9:1050\n361#1,6:1059\n371#1,3:1066\n374#1,9:1070\n361#1,6:1079\n371#1,3:1086\n374#1,9:1090\n389#1,4:1099\n361#1,6:1103\n371#1,3:1110\n374#1,9:1114\n393#1:1123\n389#1,4:1124\n361#1,6:1128\n371#1,3:1135\n374#1,9:1139\n393#1:1148\n389#1,4:1149\n361#1,6:1153\n371#1,3:1160\n374#1,9:1164\n393#1:1173\n404#1,3:1174\n361#1,6:1177\n371#1,3:1184\n374#1,9:1188\n407#1:1197\n389#1,4:1198\n361#1,6:1202\n371#1,3:1209\n374#1,9:1213\n393#1:1222\n389#1,4:1223\n361#1,6:1227\n371#1,3:1234\n374#1,9:1238\n393#1:1247\n389#1,4:1248\n361#1,6:1252\n371#1,3:1259\n374#1,9:1263\n393#1:1272\n389#1,4:1273\n361#1,6:1277\n371#1,3:1284\n374#1,9:1288\n393#1:1297\n389#1,4:1298\n361#1,6:1302\n371#1,3:1309\n374#1,9:1313\n393#1:1322\n389#1,4:1323\n361#1,6:1327\n371#1,3:1334\n374#1,9:1338\n393#1:1347\n486#1,11:1364\n389#1,4:1375\n361#1,6:1379\n371#1,3:1386\n374#1,2:1390\n497#1,10:1392\n377#1,6:1402\n393#1:1408\n507#1,2:1409\n486#1,11:1411\n389#1,4:1422\n361#1,6:1426\n371#1,3:1433\n374#1,2:1437\n497#1,10:1439\n377#1,6:1449\n393#1:1455\n507#1,2:1456\n486#1,11:1458\n389#1,4:1469\n361#1,6:1473\n371#1,3:1480\n374#1,2:1484\n497#1,10:1486\n377#1,6:1496\n393#1:1502\n507#1,2:1503\n486#1,11:1505\n389#1,4:1516\n361#1,6:1520\n371#1,3:1527\n374#1,2:1531\n497#1,10:1533\n377#1,6:1543\n393#1:1549\n507#1,2:1550\n486#1,11:1552\n389#1,4:1563\n361#1,6:1567\n371#1,3:1574\n374#1,2:1578\n497#1,10:1580\n377#1,6:1590\n393#1:1596\n507#1,2:1597\n1399#2:1037\n1270#2:1038\n1399#2:1045\n1270#2:1049\n1399#2:1065\n1270#2:1069\n1399#2:1085\n1270#2:1089\n1399#2:1109\n1270#2:1113\n1399#2:1134\n1270#2:1138\n1399#2:1159\n1270#2:1163\n1399#2:1183\n1270#2:1187\n1399#2:1208\n1270#2:1212\n1399#2:1233\n1270#2:1237\n1399#2:1258\n1270#2:1262\n1399#2:1283\n1270#2:1287\n1399#2:1308\n1270#2:1312\n1399#2:1333\n1270#2:1337\n1179#2:1351\n1175#2:1352\n1372#2,3:1353\n1386#2,3:1356\n1312#2:1359\n1303#2:1360\n1297#2:1361\n1309#2:1362\n1393#2:1363\n1399#2:1385\n1270#2:1389\n1399#2:1432\n1270#2:1436\n1399#2:1479\n1270#2:1483\n1399#2:1526\n1270#2:1530\n1399#2:1573\n1270#2:1577\n882#3,3:1348\n*S KotlinDebug\n*F\n+ 1 FloatLongMap.kt\nandroidx/collection/FloatLongMap\n*L\n392#1:1039,6\n392#1:1046,3\n392#1:1050,9\n399#1:1059,6\n399#1:1066,3\n399#1:1070,9\n406#1:1079,6\n406#1:1086,3\n406#1:1090,9\n411#1:1099,4\n411#1:1103,6\n411#1:1110,3\n411#1:1114,9\n411#1:1123\n417#1:1124,4\n417#1:1128,6\n417#1:1135,3\n417#1:1139,9\n417#1:1148\n427#1:1149,4\n427#1:1153,6\n427#1:1160,3\n427#1:1164,9\n427#1:1173\n439#1:1174,3\n439#1:1177,6\n439#1:1184,3\n439#1:1188,9\n439#1:1197\n461#1:1198,4\n461#1:1202,6\n461#1:1209,3\n461#1:1213,9\n461#1:1222\n496#1:1223,4\n496#1:1227,6\n496#1:1234,3\n496#1:1238,9\n496#1:1247\n496#1:1248,4\n496#1:1252,6\n496#1:1259,3\n496#1:1263,9\n496#1:1272\n517#1:1273,4\n517#1:1277,6\n517#1:1284,3\n517#1:1288,9\n517#1:1297\n541#1:1298,4\n541#1:1302,6\n541#1:1309,3\n541#1:1313,9\n541#1:1322\n563#1:1323,4\n563#1:1327,6\n563#1:1334,3\n563#1:1338,9\n563#1:1347\n-1#1:1364,11\n-1#1:1375,4\n-1#1:1379,6\n-1#1:1386,3\n-1#1:1390,2\n-1#1:1392,10\n-1#1:1402,6\n-1#1:1408\n-1#1:1409,2\n-1#1:1411,11\n-1#1:1422,4\n-1#1:1426,6\n-1#1:1433,3\n-1#1:1437,2\n-1#1:1439,10\n-1#1:1449,6\n-1#1:1455\n-1#1:1456,2\n-1#1:1458,11\n-1#1:1469,4\n-1#1:1473,6\n-1#1:1480,3\n-1#1:1484,2\n-1#1:1486,10\n-1#1:1496,6\n-1#1:1502\n-1#1:1503,2\n-1#1:1505,11\n-1#1:1516,4\n-1#1:1520,6\n-1#1:1527,3\n-1#1:1531,2\n-1#1:1533,10\n-1#1:1543,6\n-1#1:1549\n-1#1:1550,2\n-1#1:1552,11\n-1#1:1563,4\n-1#1:1567,6\n-1#1:1574,3\n-1#1:1578,2\n-1#1:1580,10\n-1#1:1590,6\n-1#1:1596\n-1#1:1597,2\n366#1:1037\n373#1:1038\n392#1:1045\n392#1:1049\n399#1:1065\n399#1:1069\n406#1:1085\n406#1:1089\n411#1:1109\n411#1:1113\n417#1:1134\n417#1:1138\n427#1:1159\n427#1:1163\n439#1:1183\n439#1:1187\n461#1:1208\n461#1:1212\n496#1:1233\n496#1:1237\n496#1:1258\n496#1:1262\n517#1:1283\n517#1:1287\n541#1:1308\n541#1:1312\n563#1:1333\n563#1:1337\n583#1:1351\n586#1:1352\n590#1:1353,3\n591#1:1356,3\n592#1:1359\n593#1:1360\n593#1:1361\n597#1:1362\n600#1:1363\n-1#1:1385\n-1#1:1389\n-1#1:1432\n-1#1:1436\n-1#1:1479\n-1#1:1483\n-1#1:1526\n-1#1:1530\n-1#1:1573\n-1#1:1577\n582#1:1348,3\n*E\n"})
public abstract class FloatLongMap {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public int _size;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public int _capacity;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public float[] keys;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public long[] values;

    public /* synthetic */ FloatLongMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FloatLongMap() {
        this.metadata = ScatterMapKt.f14890n;
        this.keys = FloatSetKt.n();
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
        if (!(other instanceof FloatLongMap)) {
            return false;
        }
        FloatLongMap floatLongMap = (FloatLongMap) other;
        if (floatLongMap.get_size() != get_size()) {
            return false;
        }
        float[] fArr = this.keys;
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
                            float f3 = fArr[i7];
                            long j3 = jArr[i7];
                            int iN = floatLongMap.n(f3);
                            if (iN < 0 || j3 != floatLongMap.values[iN]) {
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
        float[] fArr = this.keys;
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
                        iHashCode += Float.hashCode(fArr[i7]) ^ Long.hashCode(jArr[i7]);
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
        float[] fArr = this.keys;
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
                            float f3 = fArr[i10];
                            i3 = i5;
                            long j3 = jArr[i10];
                            sb.append(f3);
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
                    int i11 = i5;
                    if (i8 != 8) {
                        break;
                    }
                    i2 = i11;
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

    public final int n(float key) {
        int iHashCode = Float.hashCode(key) * (-862048943);
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
