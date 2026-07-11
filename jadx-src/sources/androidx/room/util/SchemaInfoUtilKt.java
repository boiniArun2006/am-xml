package androidx.room.util;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u000e\u001a)\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!¨\u0006#"}, d2 = {"", "type", "", c.f62177j, "(Ljava/lang/String;)I", "Landroidx/sqlite/SQLiteConnection;", "connection", "tableName", "Landroidx/room/util/TableInfo;", "Uo", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;", "", "Landroidx/room/util/TableInfo$ForeignKey;", "nr", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Ljava/util/Set;", "Landroidx/sqlite/SQLiteStatement;", "stmt", "", "Landroidx/room/util/ForeignKeyWithSequence;", "t", "(Landroidx/sqlite/SQLiteStatement;)Ljava/util/List;", "", "Landroidx/room/util/TableInfo$Column;", "rl", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Ljava/util/Map;", "Landroidx/room/util/TableInfo$Index;", "J2", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "unique", "O", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;Z)Landroidx/room/util/TableInfo$Index;", "", "[Ljava/lang/String;", "FTS_OPTIONS", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSchemaInfoUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaInfoUtil.kt\nandroidx/room/util/SchemaInfoUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,378:1\n774#2:379\n865#2,2:380\n1863#2,2:382\n1053#2:384\n1557#2:385\n1628#2,3:386\n1053#2:389\n1557#2:390\n1628#2,3:391\n774#2:420\n865#2:421\n866#2:424\n1188#3,2:394\n1190#3:419\n108#4:396\n80#4,22:397\n12567#5,2:422\n*S KotlinDebug\n*F\n+ 1 SchemaInfoUtil.kt\nandroidx/room/util/SchemaInfoUtilKt\n*L\n94#1:379\n94#1:380,2\n95#1:382,2\n256#1:384\n256#1:385\n256#1:386,3\n257#1:389\n257#1:390\n257#1:391,3\n360#1:420\n360#1:421\n360#1:424\n328#1:394,2\n328#1:419\n348#1:396\n348#1:397,22\n360#1:422,2\n*E\n"})
public final class SchemaInfoUtilKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f41854n = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    public static final int n(String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "INT", false, 2, (Object) null)) {
            return 3;
        }
        if (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CHAR", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CLOB", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "TEXT", false, 2, (Object) null)) {
            return 2;
        }
        if (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "BLOB", false, 2, (Object) null)) {
            return 5;
        }
        return (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "REAL", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "FLOA", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "DOUB", false, 2, (Object) null)) ? 4 : 1;
    }

    private static final Set J2(SQLiteConnection sQLiteConnection, String str) {
        SQLiteStatement sQLiteStatementMI = sQLiteConnection.mI("PRAGMA index_list(`" + str + "`)");
        try {
            int iN = SQLiteStatementUtil.n(sQLiteStatementMI, AppMeasurementSdk.ConditionalUserProperty.NAME);
            int iN2 = SQLiteStatementUtil.n(sQLiteStatementMI, "origin");
            int iN3 = SQLiteStatementUtil.n(sQLiteStatementMI, "unique");
            if (iN != -1 && iN2 != -1 && iN3 != -1) {
                Set setCreateSetBuilder = SetsKt.createSetBuilder();
                while (sQLiteStatementMI.RQ()) {
                    if (Intrinsics.areEqual("c", sQLiteStatementMI.HV(iN2))) {
                        TableInfo.Index indexO = O(sQLiteConnection, sQLiteStatementMI.HV(iN), sQLiteStatementMI.getLong(iN3) == 1);
                        if (indexO == null) {
                            AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
                            return null;
                        }
                        setCreateSetBuilder.add(indexO);
                    }
                }
                Set setBuild = SetsKt.build(setCreateSetBuilder);
                AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
                return setBuild;
            }
            AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
            return null;
        } finally {
        }
    }

    private static final TableInfo.Index O(SQLiteConnection sQLiteConnection, String str, boolean z2) {
        SQLiteStatement sQLiteStatementMI = sQLiteConnection.mI("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iN = SQLiteStatementUtil.n(sQLiteStatementMI, "seqno");
            int iN2 = SQLiteStatementUtil.n(sQLiteStatementMI, CmcdConfiguration.KEY_CONTENT_ID);
            int iN3 = SQLiteStatementUtil.n(sQLiteStatementMI, AppMeasurementSdk.ConditionalUserProperty.NAME);
            int iN4 = SQLiteStatementUtil.n(sQLiteStatementMI, "desc");
            if (iN != -1 && iN2 != -1 && iN3 != -1 && iN4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (sQLiteStatementMI.RQ()) {
                    if (((int) sQLiteStatementMI.getLong(iN2)) >= 0) {
                        int i2 = (int) sQLiteStatementMI.getLong(iN);
                        String strHV = sQLiteStatementMI.HV(iN3);
                        String str2 = sQLiteStatementMI.getLong(iN4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i2), strHV);
                        linkedHashMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                List listSortedWith = CollectionsKt.sortedWith(linkedHashMap.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ComparisonsKt.compareValues((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
                    }
                });
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
                Iterator it = listSortedWith.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List list = CollectionsKt.toList(arrayList);
                List listSortedWith2 = CollectionsKt.sortedWith(linkedHashMap2.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$2
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ComparisonsKt.compareValues((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
                    }
                });
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith2, 10));
                Iterator it2 = listSortedWith2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                TableInfo.Index index = new TableInfo.Index(str, z2, list, CollectionsKt.toList(arrayList2));
                AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
                return index;
            }
            AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
            return null;
        } finally {
        }
    }

    public static final TableInfo Uo(SQLiteConnection connection, String tableName) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new TableInfo(tableName, rl(connection, tableName), nr(connection, tableName), J2(connection, tableName));
    }

    private static final Set nr(SQLiteConnection sQLiteConnection, String str) {
        SQLiteStatement sQLiteStatementMI = sQLiteConnection.mI("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int iN = SQLiteStatementUtil.n(sQLiteStatementMI, "id");
            int iN2 = SQLiteStatementUtil.n(sQLiteStatementMI, "seq");
            int iN3 = SQLiteStatementUtil.n(sQLiteStatementMI, "table");
            int iN4 = SQLiteStatementUtil.n(sQLiteStatementMI, "on_delete");
            int iN5 = SQLiteStatementUtil.n(sQLiteStatementMI, "on_update");
            List listT = t(sQLiteStatementMI);
            sQLiteStatementMI.reset();
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            while (sQLiteStatementMI.RQ()) {
                if (sQLiteStatementMI.getLong(iN2) == 0) {
                    int i2 = (int) sQLiteStatementMI.getLong(iN);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : listT) {
                        if (((ForeignKeyWithSequence) obj).getId() == i2) {
                            arrayList3.add(obj);
                        }
                    }
                    for (ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    setCreateSetBuilder.add(new TableInfo.ForeignKey(sQLiteStatementMI.HV(iN3), sQLiteStatementMI.HV(iN4), sQLiteStatementMI.HV(iN5), arrayList, arrayList2));
                }
            }
            Set setBuild = SetsKt.build(setCreateSetBuilder);
            AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
            return setBuild;
        } finally {
        }
    }

    private static final Map rl(SQLiteConnection sQLiteConnection, String str) {
        SQLiteStatement sQLiteStatementMI = sQLiteConnection.mI("PRAGMA table_info(`" + str + "`)");
        try {
            if (!sQLiteStatementMI.RQ()) {
                Map mapEmptyMap = MapsKt.emptyMap();
                AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
                return mapEmptyMap;
            }
            int iN = SQLiteStatementUtil.n(sQLiteStatementMI, AppMeasurementSdk.ConditionalUserProperty.NAME);
            int iN2 = SQLiteStatementUtil.n(sQLiteStatementMI, "type");
            int iN3 = SQLiteStatementUtil.n(sQLiteStatementMI, "notnull");
            int iN4 = SQLiteStatementUtil.n(sQLiteStatementMI, "pk");
            int iN5 = SQLiteStatementUtil.n(sQLiteStatementMI, "dflt_value");
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            do {
                String strHV = sQLiteStatementMI.HV(iN);
                mapCreateMapBuilder.put(strHV, new TableInfo.Column(strHV, sQLiteStatementMI.HV(iN2), sQLiteStatementMI.getLong(iN3) != 0, (int) sQLiteStatementMI.getLong(iN4), sQLiteStatementMI.isNull(iN5) ? null : sQLiteStatementMI.HV(iN5), 2));
            } while (sQLiteStatementMI.RQ());
            Map mapBuild = MapsKt.build(mapCreateMapBuilder);
            AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
            return mapBuild;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementMI, th);
                throw th2;
            }
        }
    }

    private static final List t(SQLiteStatement sQLiteStatement) {
        int iN = SQLiteStatementUtil.n(sQLiteStatement, "id");
        int iN2 = SQLiteStatementUtil.n(sQLiteStatement, "seq");
        int iN3 = SQLiteStatementUtil.n(sQLiteStatement, "from");
        int iN4 = SQLiteStatementUtil.n(sQLiteStatement, "to");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        while (sQLiteStatement.RQ()) {
            listCreateListBuilder.add(new ForeignKeyWithSequence((int) sQLiteStatement.getLong(iN), (int) sQLiteStatement.getLong(iN2), sQLiteStatement.HV(iN3), sQLiteStatement.HV(iN4)));
        }
        return CollectionsKt.sorted(CollectionsKt.build(listCreateListBuilder));
    }
}
