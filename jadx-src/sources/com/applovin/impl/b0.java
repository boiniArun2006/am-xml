package com.applovin.impl;

import com.applovin.impl.s5;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class b0 implements u5.b, s5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f48082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1816z f48083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f48084d;

    public interface a {
        void a(b bVar, String str);

        void a(C1816z c1816z, String str);
    }

    public enum b {
        APP_DETAILS_NOT_FOUND,
        INVALID_DEVELOPER_URI,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public void a() {
        C1816z c1816z = this.f48083c;
        if (c1816z != null) {
            this.f48082b.a(c1816z, this.f48084d);
        } else {
            this.f48081a.q0().a(new u5(this.f48081a, this));
        }
    }

    public b0(C1802k c1802k, a aVar) {
        this.f48081a = c1802k;
        this.f48082b = aVar;
    }

    public static List a(C1816z c1816z, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            List list2 = (List) c1816z.a().get(a0Var.b());
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((a0) it2.next()).a(a0Var)) {
                        break;
                    }
                }
            }
            arrayList.add(a0Var);
        }
        return arrayList;
    }

    @Override // com.applovin.impl.u5.b
    public void a(String str) {
        this.f48081a.q0().a(new s5(this.f48081a, str, this));
    }

    @Override // com.applovin.impl.u5.b
    public void a(b bVar) {
        this.f48082b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.s5.b
    public void a(String str, String str2) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        for (String str3 : str.split("\n")) {
            String strTrim = str3.split("#", 2)[0].trim();
            if (StringUtils.isValidString(strTrim)) {
                a0 a0Var = new a0(strTrim, i2);
                if (a0Var.h()) {
                    String strB = a0Var.b();
                    List arrayList2 = map.containsKey(strB) ? (List) map.get(strB) : new ArrayList();
                    if (arrayList2 != null) {
                        arrayList2.add(a0Var);
                        map.put(strB, arrayList2);
                    }
                } else {
                    arrayList.add(a0Var);
                }
            }
            i2++;
        }
        this.f48083c = new C1816z(map, arrayList);
        this.f48084d = str2;
        this.f48081a.O();
        if (C1804o.a()) {
            this.f48081a.O().a("AppAdsTxtService", "app-ads.txt fetched: " + this.f48083c);
        }
        this.f48082b.a(this.f48083c, str2);
    }

    @Override // com.applovin.impl.s5.b
    public void a(b bVar, String str) {
        this.f48082b.a(bVar, str);
    }
}
