package com.fyber.inneractive.sdk.metrics;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54067a;

    public static boolean a(int i2, int i3, JSONArray jSONArray, CopyOnWriteArrayList copyOnWriteArrayList) {
        if (i2 > 0 && i3 > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(i2);
            int i5 = 0;
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                long jOptLong = jSONArray.optLong(i7, 0L);
                if (jOptLong > jCurrentTimeMillis) {
                    i5++;
                    copyOnWriteArrayList.add(Long.valueOf(jOptLong));
                }
            }
            if (i5 >= i3) {
                return true;
            }
        }
        return false;
    }

    public a(String str) {
        this.f54067a = str;
    }
}
