package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f48183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f48185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f48186e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Deque f48187f = new ArrayDeque();

    public Long a() {
        return this.f48185d;
    }

    public Deque b() {
        return this.f48187f;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || this.f48184c <= 0) {
            return;
        }
        Map map = (Map) this.f48186e.remove(str);
        if (CollectionUtils.isEmpty(map)) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("cc_ms", Long.valueOf(System.currentTimeMillis()));
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!CollectionUtils.isEmpty(list)) {
                Iterator it = list.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                map2.put((String) entry.getKey(), Long.valueOf(jLongValue / ((long) list.size())));
            }
        }
        if (this.f48187f.size() == this.f48184c) {
            this.f48187f.pollLast();
        }
        this.f48187f.addFirst(map2);
    }

    public void b(long j2, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!CollectionUtils.isEmpty(this.f48183b) && this.f48184c > 0) {
            Iterator it = this.f48183b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (StringUtils.isValidString(str3) && str.endsWith(str3)) {
                    a(j2, str3, str2);
                    break;
                }
            }
        }
        if (StringUtils.isValidString(this.f48182a) && str.endsWith(this.f48182a)) {
            this.f48185d = Long.valueOf(j2);
        }
    }

    public c4(C1802k c1802k) {
        this.f48182a = (String) c1802k.a(x4.u4);
        this.f48183b = c1802k.c(x4.v4);
        this.f48184c = ((Integer) c1802k.a(x4.w4)).intValue();
    }

    private void a(long j2, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f48186e.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f48186e.put(str2, map);
        }
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j2));
    }
}
