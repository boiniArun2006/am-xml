package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJY\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\f2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010$\u001a\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001f\u0010\"\u0012\u0004\b#\u0010\u0004R$\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020%8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\n\u0010&\u0012\u0004\b'\u0010\u0004R\u0016\u0010+\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0011\u0010.\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b)\u0010\u0019R\u0011\u0010/\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b,\u0010\u0019\u0082\u0001\u00010¨\u00061"}, d2 = {"Landroidx/collection/ScatterSet;", "E", "", "<init>", "()V", "", "O", "()Z", "J2", "element", "rl", "(Ljava/lang/Object;)Z", "", "separator", "prefix", "postfix", "", "limit", "truncated", "Lkotlin/Function1;", "transform", "", "Uo", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "toString", "()Ljava/lang/String;", "", c.f62177j, "()Ljava/util/Set;", "", "[J", "getMetadata$annotations", TtmlNode.TAG_METADATA, "", "[Ljava/lang/Object;", "getElements$annotations", "elements", "t", "I", "_capacity", "nr", "_size", "capacity", "size", "Landroidx/collection/MutableScatterSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1210:1\n231#1,3:1211\n200#1,7:1214\n211#1,3:1222\n214#1,9:1226\n234#1:1235\n231#1,3:1236\n200#1,7:1239\n211#1,3:1247\n214#1,9:1251\n234#1:1260\n231#1,3:1261\n200#1,7:1264\n211#1,3:1272\n214#1,9:1276\n234#1:1285\n200#1,7:1288\n211#1,3:1296\n214#1,9:1300\n231#1,3:1309\n200#1,7:1312\n211#1,3:1320\n214#1,9:1324\n234#1:1333\n231#1,3:1334\n200#1,7:1337\n211#1,3:1345\n214#1,9:1349\n234#1:1358\n231#1,3:1359\n200#1,7:1362\n211#1,3:1370\n214#1,9:1374\n234#1:1383\n390#1:1384\n391#1:1388\n393#1,2:1390\n395#1,3:1393\n398#1:1399\n399#1:1403\n400#1:1405\n401#1,4:1408\n407#1:1413\n408#1,8:1415\n231#1,3:1423\n200#1,7:1426\n211#1,3:1434\n214#1,9:1438\n234#1:1447\n231#1,3:1448\n200#1,7:1451\n211#1,3:1459\n214#1,9:1463\n234#1:1472\n231#1,3:1473\n200#1,7:1476\n211#1,3:1484\n214#1,9:1488\n234#1:1497\n1399#2:1221\n1270#2:1225\n1399#2:1246\n1270#2:1250\n1399#2:1271\n1270#2:1275\n1399#2:1286\n1270#2:1287\n1399#2:1295\n1270#2:1299\n1399#2:1319\n1270#2:1323\n1399#2:1344\n1270#2:1348\n1399#2:1369\n1270#2:1373\n1165#2,3:1385\n1179#2:1389\n1175#2:1392\n1372#2,3:1396\n1386#2,3:1400\n1312#2:1404\n1303#2:1406\n1297#2:1407\n1309#2:1412\n1393#2:1414\n1399#2:1433\n1270#2:1437\n1399#2:1458\n1270#2:1462\n1399#2:1483\n1270#2:1487\n1165#2,3:1498\n1179#2:1501\n1175#2:1502\n1372#2,3:1503\n1386#2,3:1506\n1312#2:1509\n1303#2:1510\n1297#2:1511\n1309#2:1512\n1393#2:1513\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n163#1:1211,3\n163#1:1214,7\n163#1:1222,3\n163#1:1226,9\n163#1:1235\n179#1:1236,3\n179#1:1239,7\n179#1:1247,3\n179#1:1251,9\n179#1:1260\n193#1:1261,3\n193#1:1264,7\n193#1:1272,3\n193#1:1276,9\n193#1:1285\n233#1:1288,7\n233#1:1296,3\n233#1:1300,9\n245#1:1309,3\n245#1:1312,7\n245#1:1320,3\n245#1:1324,9\n245#1:1333\n257#1:1334,3\n257#1:1337,7\n257#1:1345,3\n257#1:1349,9\n257#1:1358\n274#1:1359,3\n274#1:1362,7\n274#1:1370,3\n274#1:1374,9\n274#1:1383\n283#1:1384\n283#1:1388\n283#1:1390,2\n283#1:1393,3\n283#1:1399\n283#1:1403\n283#1:1405\n283#1:1408,4\n283#1:1413\n283#1:1415,8\n306#1:1423,3\n306#1:1426,7\n306#1:1434,3\n306#1:1438,9\n306#1:1447\n333#1:1448,3\n333#1:1451,7\n333#1:1459,3\n333#1:1463,9\n333#1:1472\n363#1:1473,3\n363#1:1476,7\n363#1:1484,3\n363#1:1488,9\n363#1:1497\n163#1:1221\n163#1:1225\n179#1:1246\n179#1:1250\n193#1:1271\n193#1:1275\n206#1:1286\n213#1:1287\n233#1:1295\n233#1:1299\n245#1:1319\n245#1:1323\n257#1:1344\n257#1:1348\n274#1:1369\n274#1:1373\n283#1:1385,3\n283#1:1389\n283#1:1392\n283#1:1396,3\n283#1:1400,3\n283#1:1404\n283#1:1406\n283#1:1407\n283#1:1412\n283#1:1414\n306#1:1433\n306#1:1437\n333#1:1458\n333#1:1462\n363#1:1483\n363#1:1487\n390#1:1498,3\n391#1:1501\n394#1:1502\n397#1:1503,3\n398#1:1506,3\n399#1:1509\n400#1:1510\n400#1:1511\n404#1:1512\n407#1:1513\n*E\n"})
public abstract class ScatterSet<E> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public int _size;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public Object[] elements;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public int _capacity;

    public /* synthetic */ ScatterSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ScatterSet() {
        this.metadata = ScatterMapKt.f14890n;
        this.elements = ContainerHelpersKt.f14932t;
    }

    public static /* synthetic */ String KN(ScatterSet scatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
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
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return scatterSet.Uo(charSequence, charSequence2, charSequence3, i2, charSequence5, function12);
    }

    public final boolean J2() {
        return this._size != 0;
    }

    public final boolean O() {
        return this._size == 0;
    }

    public final String Uo(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1 transform) {
        int i2;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i3 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j2 & 255) < 128) {
                            i2 = i7;
                            Object obj = objArr[(i3 << 3) + i9];
                            if (i5 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb.append(separator);
                            }
                            if (transform == null) {
                                sb.append(obj);
                            } else {
                                sb.append((CharSequence) transform.invoke(obj));
                            }
                            i5++;
                        } else {
                            i2 = i7;
                        }
                        j2 >>= i2;
                        i9++;
                        i7 = i2;
                    }
                    if (i8 != i7) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
            sb.append(postfix);
        } else {
            sb.append(postfix);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ScatterSet)) {
            return false;
        }
        ScatterSet scatterSet = (ScatterSet) other;
        if (scatterSet.get_size() != get_size()) {
            return false;
        }
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128 && !scatterSet.rl(objArr[(i2 << 3) + i5])) {
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
        int iHashCode = (this._capacity * 31) + this._size;
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128) {
                            Object obj = objArr[(i2 << 3) + i5];
                            if (!Intrinsics.areEqual(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return iHashCode;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return iHashCode;
    }

    public final Set n() {
        return new SetWrapper(this);
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean rl(Object element) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public String toString() {
        return KN(this, null, "[", "]", 0, null, new Function1<E, CharSequence>() { // from class: androidx.collection.ScatterSet.toString.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Object obj) {
                return obj == ScatterSet.this ? "(this)" : String.valueOf(obj);
            }
        }, 25, null);
    }
}
