package pUk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: pUk.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C2331c extends I28 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C2331c f72012t = new C2331c(Collections.EMPTY_LIST);

    public static C2331c o(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException("Invalid path (" + str + "). Paths must not contain // in them.");
        }
        String[] strArrSplit = str.split("/");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new C2331c(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // pUk.I28
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public C2331c Uo(List list) {
        return new C2331c(list);
    }

    @Override // pUk.I28
    public String t() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.f71991n.size(); i2++) {
            if (i2 > 0) {
                sb.append("/");
            }
            sb.append((String) this.f71991n.get(i2));
        }
        return sb.toString();
    }

    private C2331c(List list) {
        super(list);
    }

    public static C2331c r(List list) {
        if (list.isEmpty()) {
            return f72012t;
        }
        return new C2331c(list);
    }
}
