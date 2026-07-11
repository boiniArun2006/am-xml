package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f54228a = null;

    public static void a(Context context, String str, String str2, com.fyber.inneractive.sdk.flow.x xVar) {
        int i2;
        if (context == null || str == null || xVar.f53978b == null) {
            IAlog.a("Invalid report request parameters!", new Object[0]);
            return;
        }
        b0 b0Var = a0.f54225a;
        if (b0Var.f54228a == null) {
            b0Var.f54228a = context.getSharedPreferences("AutoWebActionPrefs", 0);
        }
        IAlog.e("IAautoWebActionReporter: reporting action: %s", str);
        IAlog.e("IAautoWebActionReporter: url: %s", str2);
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        if (!iAConfigManager.f53283i.f53395c) {
            IAlog.a("IAautoWebActionReporter: Report of Non user web actions disabled!", new Object[0]);
            return;
        }
        t tVar = t.MRAID_AUTO_ACTION_DETECTED;
        InneractiveAdRequest inneractiveAdRequest = xVar.f53977a;
        com.fyber.inneractive.sdk.response.e eVar = xVar.f53978b;
        JSONArray jSONArrayB = xVar.f53979c.b();
        w wVar = new w(eVar);
        wVar.f54358b = tVar;
        wVar.f54357a = inneractiveAdRequest;
        wVar.f54360d = jSONArrayB;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FileUploadManager.f61572j, str);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", FileUploadManager.f61572j, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("url", str2);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "url", str2);
            }
        }
        long j2 = b0Var.f54228a.getLong("lastReportTS", 0L);
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(timeZone);
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTimeInMillis(j2);
        if (j2 <= 0 || calendar.get(6) != calendar2.get(6)) {
            i2 = 0;
        } else {
            IAlog.e("IAautoWebActionReporter: encountered same date", new Object[0]);
            i2 = b0Var.f54228a.getInt("numReportsToday", 0);
        }
        int i3 = iAConfigManager.f53283i.f53396d;
        int i5 = i2 + 1;
        IAlog.e("IAautoWebActionReporter: day counter: %d max: %d", Integer.valueOf(i5), Integer.valueOf(i3));
        if (i2 < i3) {
            IAlog.e("IAautoWebActionReporter: adding ad data", new Object[0]);
            wVar.f54363g = true;
        } else {
            IAlog.e("IAautoWebActionReporter: not adding ad data", new Object[0]);
        }
        Integer numValueOf = Integer.valueOf(i5);
        try {
            jSONObject.put("daily_count", numValueOf);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "daily_count", numValueOf);
        }
        wVar.f54362f.put(jSONObject);
        wVar.a((String) null);
        SharedPreferences.Editor editorEdit = b0Var.f54228a.edit();
        editorEdit.putLong("lastReportTS", calendar.getTimeInMillis());
        editorEdit.putInt("numReportsToday", i5);
        editorEdit.apply();
    }
}
