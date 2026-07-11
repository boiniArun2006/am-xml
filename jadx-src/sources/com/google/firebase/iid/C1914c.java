package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.firebase.iid.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class C1914c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final SharedPreferences f60526n;
    final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f60527t = new ArrayMap();

    /* JADX INFO: renamed from: com.google.firebase.iid.c$j */
    static class j {
        private static final long nr = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f60528n;
        final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final long f60529t;

        private j(String str, String str2, long j2) {
            this.f60528n = str;
            this.rl = str2;
            this.f60529t = j2;
        }

        static String rl(j jVar) {
            if (jVar == null) {
                return null;
            }
            return jVar.f60528n;
        }

        static String n(String str, String str2, long j2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(StatsEvent.f62824A, j2);
                return jSONObject.toString();
            } catch (JSONException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        static j nr(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new j(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(StatsEvent.f62824A));
                } catch (JSONException e2) {
                    String strValueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                    sb.append("Failed to parse token: ");
                    sb.append(strValueOf);
                    Log.w("FirebaseInstanceId", sb.toString());
                    return null;
                }
            }
            return new j(str, null, 0L);
        }

        boolean t(String str) {
            if (System.currentTimeMillis() <= this.f60529t + nr && str.equals(this.rl)) {
                return false;
            }
            return true;
        }
    }

    public synchronized j J2(String str, String str2, String str3) {
        return j.nr(this.f60526n.getString(t(str, str2, str3), null));
    }

    public synchronized void KN(String str, String str2, String str3, String str4, String str5) {
        String strN = j.n(str4, str5, System.currentTimeMillis());
        if (strN == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f60526n.edit();
        editorEdit.putString(t(str, str2, str3), strN);
        editorEdit.commit();
    }

    public synchronized boolean Uo() {
        return this.f60526n.getAll().isEmpty();
    }

    public synchronized void nr() {
        this.f60527t.clear();
        this.f60526n.edit().clear().commit();
    }

    public synchronized long xMQ(String str) {
        long jMUb;
        jMUb = mUb(str);
        this.f60527t.put(str, Long.valueOf(jMUb));
        return jMUb;
    }

    private long O(String str) {
        String string = this.f60526n.getString(rl(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    private void n(String str) {
        File file = new File(ContextCompat.getNoBackupFilesDir(this.rl), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || Uo()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            nr();
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public C1914c(Context context) {
        this.rl = context;
        this.f60526n = context.getSharedPreferences("com.google.android.gms.appid", 0);
        n("com.google.android.gms.appid-no-backup");
    }

    private long mUb(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.f60526n.contains(rl(str, "cre"))) {
            SharedPreferences.Editor editorEdit = this.f60526n.edit();
            editorEdit.putString(rl(str, "cre"), String.valueOf(jCurrentTimeMillis));
            editorEdit.commit();
            return jCurrentTimeMillis;
        }
        return O(str);
    }

    static String rl(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
        sb.append(str);
        sb.append("|S|cre");
        return sb.toString();
    }

    private String t(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append(l.ad);
        sb.append(str3);
        return sb.toString();
    }
}
