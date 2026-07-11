package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0015\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001Bâ\u0001\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u00128\b\u0002\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u0007\u0012%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\r\u0012d\b\u0002\u0010\u0015\u001a^\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010*\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u001a\u00100\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b4\u0010\u0019J\u000f\u00105\u001a\u00020\u0014H\u0000¢\u0006\u0004\b5\u0010\u001dJ\u000f\u00106\u001a\u00020\u0014H\u0000¢\u0006\u0004\b6\u0010\u001dJ\u0017\u00108\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u0004H\u0000¢\u0006\u0004\b8\u0010\u0019J\u000f\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b9\u0010\u001fJ\u001a\u0010;\u001a\u00020\u00122\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?RD\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010@R1\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010ARp\u0010\u0015\u001a^\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010BR\u001c\u0010E\u001a\u00020)8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b'\u0010C\u0012\u0004\bD\u0010\u001dR$\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010F8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b%\u0010G\u0012\u0004\bH\u0010\u001dR$\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010F8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b#\u0010G\u0012\u0004\bJ\u0010\u001dR\u0016\u0010L\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010CR\u0016\u0010N\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010MR\u0016\u0010O\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010MR\u0016\u0010Q\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010MR\u0016\u0010S\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010MR\u0016\u0010T\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010MR\u0016\u0010U\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010MR\u0016\u0010V\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010MR\u0016\u0010W\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010MR\u0011\u0010X\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bR\u0010\u001fR\u001a\u0010Z\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bY\u0010\u001d\u001a\u0004\bP\u0010\u001f¨\u0006["}, d2 = {"Landroidx/collection/SieveCache;", "", "K", "V", "", "maxSize", "initialCapacity", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "key", "value", "sizeOf", "Lkotlin/Function1;", "createValueFromKey", "Lkotlin/Function4;", "oldValue", "newValue", "", "evicted", "", "onEntryRemoved", "<init>", "(IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "ty", "(I)V", "capacity", "az", "qie", "()V", "t", "()I", "index", "ck", "(I)Ljava/lang/Object;", "J2", "(Ljava/lang/Object;)I", "O", "hash1", "nr", "(I)I", "", "mapping", "KN", "([J)V", "", "Uo", "([I)V", "xMQ", "(Ljava/lang/Object;)Ljava/lang/Object;", "HI", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "r", c.f62177j, "rl", "newCapacity", "Ik", "hashCode", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function4;", "[J", "getMetadata$annotations", TtmlNode.TAG_METADATA, "", "[Ljava/lang/Object;", "getKeys$annotations", IV8ValueMap.FUNCTION_KEYS, "getValues$annotations", IV8ValueMap.FUNCTION_VALUES, "nodes", "I", "_capacity", "growthLimit", "mUb", "_count", "gh", "_maxSize", "_size", TtmlNode.TAG_HEAD, "tail", "hand", "size", "getCount$annotations", JavetError.PARAMETER_COUNT, "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSieveCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCache\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1148:1\n684#1,2:1161\n633#1:1163\n635#1,2:1165\n638#1,6:1168\n251#1,2:1174\n251#1,2:1176\n251#1,2:1178\n251#1,2:1181\n251#1,2:1201\n548#1,4:1210\n1025#1,6:1214\n1035#1,3:1221\n1038#1,2:1225\n251#1,2:1227\n1041#1,6:1229\n552#1:1235\n251#1,2:1236\n1025#1,6:1238\n1035#1,3:1245\n1038#1,9:1249\n1025#1,6:1289\n1035#1,3:1296\n1038#1,9:1300\n1025#1,6:1309\n1035#1,3:1316\n1038#1,9:1320\n1025#1,6:1329\n1035#1,3:1336\n1038#1,9:1340\n548#1,4:1349\n1025#1,6:1353\n1035#1,3:1360\n1038#1,9:1364\n552#1:1373\n548#1,4:1374\n1025#1,6:1378\n1035#1,3:1385\n1038#1,9:1389\n552#1:1398\n548#1,4:1399\n1025#1,6:1403\n1035#1,3:1410\n1038#1,9:1414\n552#1:1423\n1025#1,6:1424\n1035#1,3:1431\n1038#1,9:1435\n660#1,3:1462\n663#1:1466\n665#1,2:1468\n668#1,5:1471\n674#1,8:1477\n548#1,4:1638\n1025#1,6:1642\n1035#1,3:1649\n1038#1,9:1653\n552#1:1662\n548#1,4:1663\n1025#1,6:1667\n1035#1,3:1674\n1038#1,9:1678\n552#1:1687\n59#2,5:1149\n1#3:1154\n1254#4,6:1155\n1399#4:1194\n1270#4:1198\n1399#4:1220\n1270#4:1224\n1399#4:1244\n1270#4:1248\n1399#4:1268\n1270#4:1272\n1399#4:1295\n1270#4:1299\n1399#4:1315\n1270#4:1319\n1399#4:1335\n1270#4:1339\n1399#4:1359\n1270#4:1363\n1399#4:1384\n1270#4:1388\n1399#4:1409\n1270#4:1413\n1399#4:1430\n1270#4:1434\n1230#4:1450\n1254#4,6:1451\n1242#4:1457\n1241#4,4:1458\n1165#4,3:1489\n1179#4:1492\n1175#4:1493\n1372#4,3:1494\n1386#4,3:1497\n1312#4:1500\n1303#4:1501\n1297#4:1502\n1309#4:1503\n1393#4:1504\n1165#4,3:1505\n1175#4:1508\n1179#4:1509\n1372#4,3:1510\n1386#4,3:1513\n1312#4:1516\n1303#4:1517\n1297#4:1518\n1309#4:1519\n1393#4:1520\n1265#4:1521\n1220#4:1522\n1262#4:1523\n1220#4:1524\n1230#4:1525\n1254#4,6:1526\n1242#4:1532\n1241#4,4:1533\n1372#4,3:1537\n1399#4:1540\n1297#4:1541\n1144#4,14:1542\n1220#4:1556\n1165#4,3:1557\n1175#4:1560\n1179#4:1561\n1254#4,6:1562\n1220#4:1569\n1179#4:1570\n1254#4,6:1571\n1254#4,6:1577\n1179#4:1588\n1254#4,6:1589\n1268#4:1600\n1220#4:1601\n1165#4,3:1602\n1175#4:1605\n1179#4:1606\n1230#4:1607\n1254#4,6:1608\n1242#4:1614\n1241#4,4:1615\n1399#4:1636\n1270#4:1637\n1399#4:1648\n1270#4:1652\n1399#4:1673\n1270#4:1677\n1111#5:1164\n1114#5:1167\n1130#5:1444\n1123#5:1445\n1119#5:1446\n1123#5:1447\n1111#5:1448\n1114#5:1449\n1123#5:1465\n1127#5:1467\n1117#5:1470\n1114#5:1476\n1123#5:1485\n1127#5:1486\n1117#5:1487\n1114#5:1488\n1132#5:1568\n1144#5:1583\n1138#5:1584\n1141#5:1585\n1132#5:1586\n1132#5:1587\n1144#5:1595\n1138#5:1596\n1135#5:1597\n1132#5:1598\n1132#5:1599\n1123#5:1619\n1127#5:1620\n1096#5,2:1621\n1147#5:1623\n1098#5,2:1624\n1147#5:1626\n1147#5:1627\n1147#5:1628\n1147#5:1629\n1123#5:1630\n1127#5:1631\n1103#5,4:1632\n215#6:1180\n216#6:1183\n357#7,4:1184\n329#7,6:1188\n339#7,3:1195\n342#7,2:1199\n345#7,6:1203\n361#7:1209\n231#8,3:1258\n200#8,7:1261\n211#8,3:1269\n214#8,9:1273\n234#8:1282\n287#9,6:1283\n*S KotlinDebug\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCache\n*L\n229#1:1161,2\n288#1:1163\n288#1:1165,2\n288#1:1168,6\n300#1:1174,2\n311#1:1176,2\n322#1:1178,2\n332#1:1181,2\n341#1:1201,2\n350#1:1210,4\n350#1:1214,6\n350#1:1221,3\n350#1:1225,2\n350#1:1227,2\n350#1:1229,6\n350#1:1235\n358#1:1236,2\n447#1:1238,6\n447#1:1245,3\n447#1:1249,9\n551#1:1289,6\n551#1:1296,3\n551#1:1300,9\n563#1:1309,6\n563#1:1316,3\n563#1:1320,9\n575#1:1329,6\n575#1:1336,3\n575#1:1340,9\n580#1:1349,4\n580#1:1353,6\n580#1:1360,3\n580#1:1364,9\n580#1:1373\n586#1:1374,4\n586#1:1378,6\n586#1:1385,3\n586#1:1389,9\n586#1:1398\n596#1:1399,4\n596#1:1403,6\n596#1:1410,3\n596#1:1414,9\n596#1:1423\n609#1:1424,6\n609#1:1431,3\n609#1:1435,9\n654#1:1462,3\n654#1:1466\n654#1:1468,2\n654#1:1471,5\n654#1:1477,8\n1055#1:1638,4\n1055#1:1642,6\n1055#1:1649,3\n1055#1:1653,9\n1055#1:1662\n1081#1:1663,4\n1081#1:1667,6\n1081#1:1674,3\n1081#1:1678,9\n1081#1:1687\n131#1:1149,5\n211#1:1155,6\n341#1:1194\n341#1:1198\n350#1:1220\n350#1:1224\n447#1:1244\n447#1:1248\n486#1:1268\n486#1:1272\n551#1:1295\n551#1:1299\n563#1:1315\n563#1:1319\n575#1:1335\n575#1:1339\n580#1:1359\n580#1:1363\n586#1:1384\n586#1:1388\n596#1:1409\n596#1:1413\n609#1:1430\n609#1:1434\n648#1:1450\n648#1:1451,6\n648#1:1457\n648#1:1458,4\n688#1:1489,3\n689#1:1492\n692#1:1493\n696#1:1494,3\n697#1:1497,3\n698#1:1500\n699#1:1501\n699#1:1502\n703#1:1503\n706#1:1504\n718#1:1505,3\n719#1:1508\n720#1:1509\n727#1:1510,3\n728#1:1513,3\n729#1:1516\n730#1:1517\n730#1:1518\n734#1:1519\n737#1:1520\n746#1:1521\n746#1:1522\n752#1:1523\n752#1:1524\n753#1:1525\n753#1:1526,6\n753#1:1532\n753#1:1533,4\n764#1:1537,3\n765#1:1540\n767#1:1541\n841#1:1542,14\n847#1:1556\n861#1:1557,3\n862#1:1560\n873#1:1561\n874#1:1562,6\n888#1:1569\n891#1:1570\n892#1:1571,6\n893#1:1577,6\n915#1:1588\n916#1:1589,6\n980#1:1600\n980#1:1601\n982#1:1602,3\n983#1:1605\n985#1:1606\n985#1:1607\n985#1:1608,6\n985#1:1614\n985#1:1615,4\n1030#1:1636\n1037#1:1637\n1055#1:1648\n1055#1:1652\n1081#1:1673\n1081#1:1677\n288#1:1164\n288#1:1167\n619#1:1444\n621#1:1445\n622#1:1446\n626#1:1447\n633#1:1448\n636#1:1449\n654#1:1465\n654#1:1467\n654#1:1470\n654#1:1476\n662#1:1485\n663#1:1486\n666#1:1487\n672#1:1488\n878#1:1568\n905#1:1583\n907#1:1584\n908#1:1585\n910#1:1586\n912#1:1587\n931#1:1595\n933#1:1596\n934#1:1597\n936#1:1598\n940#1:1599\n1001#1:1619\n1002#1:1620\n1003#1:1621,2\n1003#1:1623\n1003#1:1624,2\n1003#1:1626\n1005#1:1627\n1006#1:1628\n1007#1:1629\n1014#1:1630\n1015#1:1631\n1016#1:1632,4\n332#1:1180\n332#1:1183\n341#1:1184,4\n341#1:1188,6\n341#1:1195,3\n341#1:1199,2\n341#1:1203,6\n341#1:1209\n486#1:1258,3\n486#1:1261,7\n486#1:1269,3\n486#1:1273,9\n486#1:1282\n491#1:1283,6\n*E\n"})
public final class SieveCache<K, V> {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private int hand;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public Object[] values;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata and from toString */
    private int capacity;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public Object[] keys;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private long[] nodes;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private int head;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private int _maxSize;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata and from toString */
    private int count;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function2 sizeOf;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata and from toString */
    private int size;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function1 createValueFromKey;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function4 onEntryRemoved;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private int tail;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private int growthLimit;

    public SieveCache(int i2, int i3, Function2 sizeOf, Function1 createValueFromKey, Function4 onEntryRemoved) {
        Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        Intrinsics.checkNotNullParameter(createValueFromKey, "createValueFromKey");
        Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        this.sizeOf = sizeOf;
        this.createValueFromKey = createValueFromKey;
        this.onEntryRemoved = onEntryRemoved;
        this.metadata = ScatterMapKt.f14890n;
        Object[] objArr = ContainerHelpersKt.f14932t;
        this.keys = objArr;
        this.values = objArr;
        this.nodes = SieveCacheKt.n();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        this.hand = Integer.MAX_VALUE;
        if (!(i2 > 0)) {
            RuntimeHelpersKt.n("maxSize must be > 0");
        }
        this._maxSize = i2;
        ty(ScatterMapKt.J2(i3));
    }

    private final int J2(Object key) {
        int i2 = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i5 = i3 & 127;
        int i7 = this.capacity;
        int i8 = i3 >>> 7;
        while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.metadata;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j2 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j3 = (((long) i5) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i9) & i7;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i8 = i9 + i2;
        }
    }

    private final void KN(long[] mapping) {
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
        int i10 = this.hand;
        if (i10 != Integer.MAX_VALUE) {
            this.hand = (int) (mapping[i10] & 4294967295L);
        }
    }

    private final int O(Object key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i5 = i2 & 127;
        int i7 = this.capacity;
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
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iNr = nr(i3);
                if (this.growthLimit == 0 && ((this.metadata[iNr >> 3] >> ((iNr & 7) << 3)) & 255) != 254) {
                    n();
                    iNr = nr(i3);
                }
                this.count++;
                int i13 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i14 = iNr >> 3;
                long j6 = jArr2[i14];
                int i15 = (iNr & 7) << 3;
                this.growthLimit = i13 - (((j6 >> i15) & 255) == 128 ? 1 : 0);
                int i16 = this.capacity;
                long j7 = ((~(255 << i15)) & j6) | (j3 << i15);
                jArr2[i14] = j7;
                jArr2[(((iNr - 7) & i16) + (i16 & 7)) >> 3] = j7;
                return ~iNr;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i5 = i12;
        }
    }

    private final void Uo(int[] mapping) {
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
        int i10 = this.hand;
        if (i10 != Integer.MAX_VALUE) {
            this.hand = mapping[i10];
        }
    }

    private final void az(int capacity) {
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
        qie();
    }

    private final Object ck(int index) {
        this.count--;
        long[] jArr = this.metadata;
        int i2 = this.capacity;
        int i3 = index >> 3;
        int i5 = (index & 7) << 3;
        long j2 = (jArr[i3] & (~(255 << i5))) | (254 << i5);
        jArr[i3] = j2;
        jArr[(((index - 7) & i2) + (i2 & 7)) >> 3] = j2;
        this.keys[index] = null;
        Object[] objArr = this.values;
        Object obj = objArr[index];
        objArr[index] = null;
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
        if (this.hand == index) {
            this.hand = i7;
        }
        jArr2[index] = 4611686018427387903L;
        return obj;
    }

    private final int nr(int hash1) {
        int i2 = this.capacity;
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

    private final void qie() {
        this.growthLimit = ScatterMapKt.rl(this.capacity) - getCount();
    }

    private final int t() {
        long[] jArr = this.nodes;
        int i2 = this.hand;
        if (i2 == Integer.MAX_VALUE) {
            i2 = this.tail;
        }
        while (i2 != Integer.MAX_VALUE) {
            long j2 = jArr[i2];
            if (((int) ((j2 >> 62) & 1)) == 0) {
                break;
            }
            int i3 = (int) (2147483647L & (j2 >> 31));
            jArr[i2] = DurationKt.MAX_MILLIS & j2;
            i2 = i3 != Integer.MAX_VALUE ? i3 : this.tail;
        }
        int i5 = (int) (2147483647L & (jArr[i2] >> 31));
        this.hand = i5 != Integer.MAX_VALUE ? i5 : Integer.MAX_VALUE;
        return i2;
    }

    private final void ty(int initialCapacity) {
        long[] jArrN;
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.O(initialCapacity)) : 0;
        this.capacity = iMax;
        az(iMax);
        this.keys = iMax == 0 ? ContainerHelpersKt.f14932t : new Object[iMax];
        this.values = iMax == 0 ? ContainerHelpersKt.f14932t : new Object[iMax];
        if (iMax == 0) {
            jArrN = SieveCacheKt.n();
        } else {
            long[] jArr = new long[iMax];
            ArraysKt.fill$default(jArr, DurationKt.MAX_MILLIS, 0, 0, 6, (Object) null);
            jArrN = jArr;
        }
        this.nodes = jArrN;
    }

    public final Object HI(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int iO = O(key);
        if (iO < 0) {
            iO = ~iO;
        }
        Object[] objArr = this.values;
        Object obj = objArr[iO];
        objArr[iO] = value;
        this.keys[iO] = key;
        int iIntValue = this.size + ((Number) this.sizeOf.invoke(key, value)).intValue();
        this.size = iIntValue;
        if (obj != null) {
            this.size = iIntValue - ((Number) this.sizeOf.invoke(key, obj)).intValue();
            this.onEntryRemoved.invoke(key, obj, value, Boolean.FALSE);
            r(this._maxSize);
            return obj;
        }
        r(this._maxSize);
        long[] jArr = this.nodes;
        int i2 = this.head;
        jArr[iO] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = (jArr[i2] & (-4611686016279904257L)) | ((2147483647L & ((long) iO)) << 31);
        }
        this.head = iO;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iO;
        }
        return obj;
    }

    public final void Ik(int newCapacity) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
        long[] jArr3 = this.nodes;
        int i2 = this.capacity;
        int[] iArr = new int[i2];
        ty(newCapacity);
        long[] jArr4 = this.metadata;
        Object[] objArr4 = this.keys;
        Object[] objArr5 = this.values;
        long[] jArr5 = this.nodes;
        int i3 = this.capacity;
        int i5 = 0;
        while (i5 < i2) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i5];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i7 = iHashCode ^ (iHashCode << 16);
                int iNr = nr(i7 >>> 7);
                jArr = jArr2;
                objArr = objArr2;
                long j2 = i7 & 127;
                int i8 = iNr >> 3;
                int i9 = (iNr & 7) << 3;
                long j3 = (jArr4[i8] & (~(255 << i9))) | (j2 << i9);
                jArr4[i8] = j3;
                jArr4[(((iNr - 7) & i3) + (i3 & 7)) >> 3] = j3;
                objArr4[iNr] = obj;
                objArr5[iNr] = objArr3[i5];
                jArr5[iNr] = jArr3[i5];
                iArr[i5] = iNr;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i5++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        Uo(iArr);
    }

    public boolean equals(Object other) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (other == this) {
            return true;
        }
        if (!(other instanceof SieveCache)) {
            return false;
        }
        SieveCache sieveCache = (SieveCache) other;
        if (sieveCache.getSize() != getSize() || sieveCache.count != this.count) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i3) {
                    if ((255 & j2) < 128) {
                        int i7 = (i2 << 3) + i5;
                        Object obj = objArr[i7];
                        z3 = z4;
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i7];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (!Intrinsics.areEqual(obj2, sieveCache.xMQ(obj))) {
                            return false;
                        }
                    } else {
                        z3 = z4;
                    }
                    j2 >>= 8;
                    i5++;
                    z4 = z3;
                }
                z2 = z4;
                if (i3 != 8) {
                    return z2;
                }
            } else {
                z2 = z4;
            }
            if (i2 == length) {
                return z2;
            }
            i2++;
            z4 = z2;
        }
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iHashCode = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i3; i5++) {
                    if ((255 & j2) < 128) {
                        int i7 = (i2 << 3) + i5;
                        Object obj = objArr[i7];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i7];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        iHashCode += obj2.hashCode() ^ obj.hashCode();
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

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final void n() {
        if (this.capacity <= 8 || Long.compare(ULong.m487constructorimpl(ULong.m487constructorimpl(getCount()) * 32) ^ Long.MIN_VALUE, ULong.m487constructorimpl(ULong.m487constructorimpl(this.capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            Ik(ScatterMapKt.nr(this.capacity));
        } else {
            rl();
        }
    }

    public final void r(int maxSize) {
        int iT;
        while (this.size > maxSize && getCount() != 0 && (iT = t()) != Integer.MAX_VALUE) {
            Object obj = this.keys[iT];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
            Object objCk = ck(iT);
            if (objCk != null) {
                this.size -= ((Number) this.sizeOf.invoke(obj, objCk)).intValue();
                this.onEntryRemoved.invoke(obj, objCk, null, Boolean.TRUE);
            }
        }
    }

    public final void rl() {
        int i2;
        Object[] objArr;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i3 = this.capacity;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
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
                Object obj = objArr2[i10];
                int iHashCode = (obj != null ? obj.hashCode() : i5) * (-862048943);
                int i13 = iHashCode ^ (iHashCode << 16);
                int i14 = i13 >>> 7;
                long j5 = j2;
                int iNr = nr(i14);
                int i15 = i14 & i3;
                if (((iNr - i15) & i3) / 8 == ((i10 - i15) & i3) / 8) {
                    int i16 = i5;
                    int i17 = i10;
                    jArr[i11] = (((long) (i13 & 127)) << i12) | ((~(255 << i12)) & jArr[i11]);
                    if (jArr3[i17] == j5) {
                        long j6 = i17;
                        jArr3[i17] = j6 | (j6 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i16];
                    i10 = i17 + 1;
                    j2 = j5;
                    i5 = i16;
                } else {
                    int i18 = i5;
                    int i19 = iNr >> 3;
                    long j7 = jArr[i19];
                    int i20 = (iNr & 7) << 3;
                    if (((j7 >> i20) & 255) == 128) {
                        i2 = i3;
                        objArr = objArr2;
                        jArr[i19] = (j7 & (~(255 << i20))) | (((long) (i13 & 127)) << i20);
                        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (128 << i12);
                        objArr[iNr] = objArr[i10];
                        objArr[i10] = null;
                        objArr3[iNr] = objArr3[i10];
                        objArr3[i10] = null;
                        jArr2[iNr] = jArr2[i10];
                        jArr2[i10] = 4611686018427387903L;
                        int i21 = (int) ((jArr3[i10] >> 32) & 4294967295L);
                        if (i21 != Integer.MAX_VALUE) {
                            jArr3[i21] = (jArr3[i21] & (-4294967296L)) | ((long) iNr);
                            jArr3[i10] = (jArr3[i10] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i10] = (((long) Integer.MAX_VALUE) << 32) | ((long) iNr);
                        }
                        jArr3[iNr] = (((long) i10) << 32) | ((long) Integer.MAX_VALUE);
                    } else {
                        i2 = i3;
                        objArr = objArr2;
                        jArr[i19] = (((long) (i13 & 127)) << i20) | (j7 & (~(255 << i20)));
                        Object obj2 = objArr[iNr];
                        objArr[iNr] = objArr[i10];
                        objArr[i10] = obj2;
                        Object obj3 = objArr3[iNr];
                        objArr3[iNr] = objArr3[i10];
                        objArr3[i10] = obj3;
                        long j9 = jArr2[iNr];
                        jArr2[iNr] = jArr2[i10];
                        jArr2[i10] = j9;
                        int i22 = (int) ((jArr3[i10] >> 32) & 4294967295L);
                        if (i22 != Integer.MAX_VALUE) {
                            long j10 = iNr;
                            jArr3[i22] = (jArr3[i22] & (-4294967296L)) | j10;
                            jArr3[i10] = (jArr3[i10] & 4294967295L) | (j10 << 32);
                        } else {
                            long j11 = iNr;
                            jArr3[i10] = j11 | (j11 << 32);
                            i22 = i10;
                        }
                        jArr3[iNr] = (((long) i22) << 32) | ((long) i10);
                        i10--;
                    }
                    jArr[jArr.length - 1] = jArr[i18];
                    i10++;
                    i3 = i2;
                    j2 = j5;
                    i5 = i18;
                    objArr2 = objArr;
                }
            } else {
                i10++;
            }
        }
        qie();
        KN(jArr3);
    }

    public String toString() {
        return "SieveCache[maxSize=" + this._maxSize + ", size=" + this.size + ", capacity=" + this.capacity + ", count=" + this.count + ']';
    }

    public final Object xMQ(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iJ2 = J2(key);
        if (iJ2 >= 0) {
            long[] jArr = this.nodes;
            jArr[iJ2] = (jArr[iJ2] & DurationKt.MAX_MILLIS) | 4611686018427387904L;
            return this.values[iJ2];
        }
        Object objInvoke = this.createValueFromKey.invoke(key);
        if (objInvoke == null) {
            return null;
        }
        HI(key, objInvoke);
        return objInvoke;
    }

    public /* synthetic */ SieveCache(int i2, int i3, Function2 function2, Function1 function1, Function4 function4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i5 & 2) != 0 ? 6 : i3, (i5 & 4) != 0 ? new Function2<K, V, Integer>() { // from class: androidx.collection.SieveCache.1
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(Object obj, Object obj2) {
                Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(obj2, "<anonymous parameter 1>");
                return 1;
            }
        } : function2, (i5 & 8) != 0 ? new Function1() { // from class: androidx.collection.SieveCache.2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return null;
            }
        } : function1, (i5 & 16) != 0 ? new Function4<K, V, V, Boolean, Unit>() { // from class: androidx.collection.SieveCache.3
            public final void n(Object obj, Object obj2, Object obj3, boolean z2) {
                Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(obj2, "<anonymous parameter 1>");
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Boolean bool) {
                n(obj, obj2, obj3, bool.booleanValue());
                return Unit.INSTANCE;
            }
        } : function4);
    }
}
