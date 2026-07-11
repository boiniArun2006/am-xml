package androidx.room.util;

import ScC.FuwU.XIvb;
import androidx.room.util.TableInfo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0006*\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\t*\u00020\fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\u0003*\u00020\u00182\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\u0006*\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\t*\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010 \u001a\u00020\u0003*\u00020\u001f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u0006*\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010(\u001a\u00020\t2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010+\u001a\u00020**\u0006\u0012\u0002\b\u00030&H\u0002¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010-\u001a\u00020**\u0006\u0012\u0002\b\u00030&H\u0002¢\u0006\u0004\b-\u0010,¨\u0006."}, d2 = {"Landroidx/room/util/TableInfo;", "", InneractiveMediationNameConsts.OTHER, "", "J2", "(Landroidx/room/util/TableInfo;Ljava/lang/Object;)Z", "", "gh", "(Landroidx/room/util/TableInfo;)I", "", "Ik", "(Landroidx/room/util/TableInfo;)Ljava/lang/String;", "Landroidx/room/util/TableInfo$Column;", "t", "(Landroidx/room/util/TableInfo$Column;Ljava/lang/Object;)Z", "current", "rl", "(Ljava/lang/String;Ljava/lang/String;)Z", c.f62177j, "(Ljava/lang/String;)Z", "KN", "(Landroidx/room/util/TableInfo$Column;)I", "ty", "(Landroidx/room/util/TableInfo$Column;)Ljava/lang/String;", "Landroidx/room/util/TableInfo$ForeignKey;", "nr", "(Landroidx/room/util/TableInfo$ForeignKey;Ljava/lang/Object;)Z", "xMQ", "(Landroidx/room/util/TableInfo$ForeignKey;)I", "HI", "(Landroidx/room/util/TableInfo$ForeignKey;)Ljava/lang/String;", "Landroidx/room/util/TableInfo$Index;", "O", "(Landroidx/room/util/TableInfo$Index;Ljava/lang/Object;)Z", "mUb", "(Landroidx/room/util/TableInfo$Index;)I", "ck", "(Landroidx/room/util/TableInfo$Index;)Ljava/lang/String;", "", "collection", "Uo", "(Ljava/util/Collection;)Ljava/lang/String;", "", "az", "(Ljava/util/Collection;)V", "qie", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,397:1\n1053#2:398\n1053#2:399\n1188#3,3:400\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n*L\n192#1:398\n194#1:399\n261#1:400,3\n*E\n"})
public final class TableInfoKt {
    private static final void az(Collection collection) {
        StringsKt.prependIndent$default(CollectionsKt.joinToString$default(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        StringsKt.prependIndent$default("},", null, 1, null);
    }

    private static final void qie(Collection collection) {
        StringsKt.prependIndent$default(CollectionsKt.joinToString$default(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        StringsKt.prependIndent$default(" }", null, 1, null);
    }

    public static final String HI(TableInfo.ForeignKey foreignKey) {
        Intrinsics.checkNotNullParameter(foreignKey, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(foreignKey.referenceTable);
        sb.append("',\n            |   onDelete = '");
        sb.append(foreignKey.onDelete);
        sb.append("',\n            |   onUpdate = '");
        sb.append(foreignKey.onUpdate);
        sb.append("',\n            |   columnNames = {");
        az(CollectionsKt.sorted(foreignKey.columnNames));
        Unit unit = Unit.INSTANCE;
        sb.append(unit);
        sb.append("\n            |   referenceColumnNames = {");
        qie(CollectionsKt.sorted(foreignKey.referenceColumnNames));
        sb.append(unit);
        sb.append("\n            |}\n        ");
        return StringsKt.prependIndent$default(StringsKt.trimMargin$default(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final String Ik(TableInfo tableInfo) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(tableInfo, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("\n            |TableInfo {\n            |    name = '");
        sb.append(tableInfo.name);
        sb.append("',\n            |    columns = {");
        sb.append(Uo(CollectionsKt.sortedWith(tableInfo.columns.values(), new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(((TableInfo.Column) obj).name, ((TableInfo.Column) obj2).name);
            }
        })));
        sb.append("\n            |    foreignKeys = {");
        sb.append(Uo(tableInfo.foreignKeys));
        sb.append("\n            |    indices = {");
        Set set = tableInfo.indices;
        if (set == null || (listEmptyList = CollectionsKt.sortedWith(set, new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(((TableInfo.Index) obj).name, ((TableInfo.Index) obj2).name);
            }
        })) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        sb.append(Uo(listEmptyList));
        sb.append(XIvb.LhC);
        return StringsKt.trimMargin$default(sb.toString(), null, 1, null);
    }

    public static final boolean J2(TableInfo tableInfo, Object obj) {
        Set set;
        Intrinsics.checkNotNullParameter(tableInfo, "<this>");
        if (tableInfo == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo2 = (TableInfo) obj;
        if (!Intrinsics.areEqual(tableInfo.name, tableInfo2.name) || !Intrinsics.areEqual(tableInfo.columns, tableInfo2.columns) || !Intrinsics.areEqual(tableInfo.foreignKeys, tableInfo2.foreignKeys)) {
            return false;
        }
        Set set2 = tableInfo.indices;
        if (set2 == null || (set = tableInfo2.indices) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public static final int KN(TableInfo.Column column) {
        Intrinsics.checkNotNullParameter(column, "<this>");
        return (((((column.name.hashCode() * 31) + column.affinity) * 31) + (column.notNull ? 1231 : 1237)) * 31) + column.primaryKeyPosition;
    }

    public static final boolean O(TableInfo.Index index, Object obj) {
        Intrinsics.checkNotNullParameter(index, "<this>");
        if (index == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Index)) {
            return false;
        }
        TableInfo.Index index2 = (TableInfo.Index) obj;
        if (index.unique == index2.unique && Intrinsics.areEqual(index.columns, index2.columns) && Intrinsics.areEqual(index.orders, index2.orders)) {
            return StringsKt.startsWith$default(index.name, "index_", false, 2, (Object) null) ? StringsKt.startsWith$default(index2.name, "index_", false, 2, (Object) null) : Intrinsics.areEqual(index.name, index2.name);
        }
        return false;
    }

    public static final String Uo(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return StringsKt.prependIndent$default(CollectionsKt.joinToString$default(collection, ",\n", "\n", "\n", 0, null, null, 56, null), null, 1, null) + "},";
    }

    public static final String ck(TableInfo.Index index) {
        Intrinsics.checkNotNullParameter(index, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("\n            |Index {\n            |   name = '");
        sb.append(index.name);
        sb.append("',\n            |   unique = '");
        sb.append(index.unique);
        sb.append("',\n            |   columns = {");
        az(index.columns);
        Unit unit = Unit.INSTANCE;
        sb.append(unit);
        sb.append("\n            |   orders = {");
        qie(index.orders);
        sb.append(unit);
        sb.append("\n            |}\n        ");
        return StringsKt.prependIndent$default(StringsKt.trimMargin$default(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final int gh(TableInfo tableInfo) {
        Intrinsics.checkNotNullParameter(tableInfo, "<this>");
        return (((tableInfo.name.hashCode() * 31) + tableInfo.columns.hashCode()) * 31) + tableInfo.foreignKeys.hashCode();
    }

    public static final int mUb(TableInfo.Index index) {
        Intrinsics.checkNotNullParameter(index, "<this>");
        return ((((((StringsKt.startsWith$default(index.name, "index_", false, 2, (Object) null) ? -1184239155 : index.name.hashCode()) * 31) + (index.unique ? 1 : 0)) * 31) + index.columns.hashCode()) * 31) + index.orders.hashCode();
    }

    public static final boolean nr(TableInfo.ForeignKey foreignKey, Object obj) {
        Intrinsics.checkNotNullParameter(foreignKey, "<this>");
        if (foreignKey == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.ForeignKey)) {
            return false;
        }
        TableInfo.ForeignKey foreignKey2 = (TableInfo.ForeignKey) obj;
        if (Intrinsics.areEqual(foreignKey.referenceTable, foreignKey2.referenceTable) && Intrinsics.areEqual(foreignKey.onDelete, foreignKey2.onDelete) && Intrinsics.areEqual(foreignKey.onUpdate, foreignKey2.onUpdate) && Intrinsics.areEqual(foreignKey.columnNames, foreignKey2.columnNames)) {
            return Intrinsics.areEqual(foreignKey.referenceColumnNames, foreignKey2.referenceColumnNames);
        }
        return false;
    }

    public static final boolean rl(String current, String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.areEqual(current, str)) {
            return true;
        }
        if (!n(current)) {
            return false;
        }
        String strSubstring = current.substring(1, current.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return Intrinsics.areEqual(StringsKt.trim((CharSequence) strSubstring).toString(), str);
    }

    public static final boolean t(TableInfo.Column column, Object obj) {
        Intrinsics.checkNotNullParameter(column, "<this>");
        if (column == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Column)) {
            return false;
        }
        TableInfo.Column column2 = (TableInfo.Column) obj;
        if (column.n() != column2.n() || !Intrinsics.areEqual(column.name, column2.name) || column.notNull != column2.notNull) {
            return false;
        }
        String str = column.defaultValue;
        String str2 = column2.defaultValue;
        if (column.createdFrom == 1 && column2.createdFrom == 2 && str != null && !rl(str, str2)) {
            return false;
        }
        if (column.createdFrom == 2 && column2.createdFrom == 1 && str2 != null && !rl(str2, str)) {
            return false;
        }
        int i2 = column.createdFrom;
        return (i2 == 0 || i2 != column2.createdFrom || (str == null ? str2 == null : rl(str, str2))) && column.affinity == column2.affinity;
    }

    public static final String ty(TableInfo.Column column) {
        Intrinsics.checkNotNullParameter(column, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("\n            |Column {\n            |   name = '");
        sb.append(column.name);
        sb.append("',\n            |   type = '");
        sb.append(column.type);
        sb.append("',\n            |   affinity = '");
        sb.append(column.affinity);
        sb.append("',\n            |   notNull = '");
        sb.append(column.notNull);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(column.primaryKeyPosition);
        sb.append("',\n            |   defaultValue = '");
        String str = column.defaultValue;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return StringsKt.prependIndent$default(StringsKt.trimMargin$default(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final int xMQ(TableInfo.ForeignKey foreignKey) {
        Intrinsics.checkNotNullParameter(foreignKey, "<this>");
        return (((((((foreignKey.referenceTable.hashCode() * 31) + foreignKey.onDelete.hashCode()) * 31) + foreignKey.onUpdate.hashCode()) * 31) + foreignKey.columnNames.hashCode()) * 31) + foreignKey.referenceColumnNames.hashCode();
    }

    private static final boolean n(String str) {
        if (str.length() == 0) {
            return false;
        }
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            int i7 = i5 + 1;
            if (i5 == 0 && cCharAt != '(') {
                return false;
            }
            if (cCharAt != '(') {
                if (cCharAt == ')' && i3 - 1 == 0 && i5 != str.length() - 1) {
                    return false;
                }
            } else {
                i3++;
            }
            i2++;
            i5 = i7;
        }
        if (i3 != 0) {
            return false;
        }
        return true;
    }
}
