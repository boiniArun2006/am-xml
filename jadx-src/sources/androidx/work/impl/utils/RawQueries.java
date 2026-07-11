package androidx.work.impl.utils;

import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class RawQueries {
    private static void n(StringBuilder sb, int i2) {
        if (i2 <= 0) {
            return;
        }
        sb.append("?");
        for (int i3 = 1; i3 < i2; i3++) {
            sb.append(",");
            sb.append("?");
        }
    }

    public static SupportSQLiteQuery rl(WorkQuery workQuery) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        List listRl = workQuery.rl();
        String str = " AND";
        String str2 = " WHERE";
        if (!listRl.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(listRl.size());
            Iterator it = listRl.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(WorkTypeConverters.mUb((WorkInfo.State) it.next())));
            }
            sb.append(" WHERE");
            sb.append(" state IN (");
            n(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        List listN = workQuery.n();
        if (!listN.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(listN.size());
            Iterator it2 = listN.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((UUID) it2.next()).toString());
            }
            sb.append(str2);
            sb.append(" id IN (");
            n(sb, listN.size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        List listT = workQuery.t();
        if (listT.isEmpty()) {
            str = str2;
        } else {
            sb.append(str2);
            sb.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            n(sb, listT.size());
            sb.append("))");
            arrayList.addAll(listT);
        }
        List listNr = workQuery.nr();
        if (!listNr.isEmpty()) {
            sb.append(str);
            sb.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            n(sb, listNr.size());
            sb.append("))");
            arrayList.addAll(listNr);
        }
        sb.append(";");
        return new SimpleSQLiteQuery(sb.toString(), arrayList.toArray());
    }
}
