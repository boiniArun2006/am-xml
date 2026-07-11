package Ip;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SharedPreferences f4301n;

    private synchronized void KN(String str) {
        try {
            String strO = O(str);
            if (strO == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f4301n.getStringSet(strO, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f4301n.edit().remove(strO).commit();
            } else {
                this.f4301n.edit().putStringSet(strO, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized String O(String str) {
        for (Map.Entry<String, ?> entry : this.f4301n.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void az(String str, String str2) {
        KN(str2);
        HashSet hashSet = new HashSet(this.f4301n.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f4301n.edit().putStringSet(str, hashSet).commit();
    }

    private synchronized void n() {
        try {
            long j2 = this.f4301n.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f4301n.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f4301n.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f4301n.edit().putStringSet(key, hashSet).putLong("fire-count", j2 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized String nr(long j2) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j2)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j2));
    }

    synchronized boolean J2(long j2, long j3) {
        return nr(j2).equals(nr(j3));
    }

    synchronized void Uo() {
        String strNr = nr(System.currentTimeMillis());
        this.f4301n.edit().putString("last-used-date", strNr).commit();
        KN(strNr);
    }

    synchronized void gh(long j2, String str) {
        String strNr = nr(j2);
        if (this.f4301n.getString("last-used-date", "").equals(strNr)) {
            String strO = O(strNr);
            if (strO == null) {
                return;
            }
            if (strO.equals(str)) {
                return;
            }
            az(str, strNr);
            return;
        }
        long j3 = this.f4301n.getLong("fire-count", 0L);
        if (j3 + 1 == 30) {
            n();
            j3 = this.f4301n.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f4301n.getStringSet(str, new HashSet()));
        hashSet.add(strNr);
        this.f4301n.edit().putStringSet(str, hashSet).putLong("fire-count", j3 + 1).putString("last-used-date", strNr).commit();
    }

    synchronized boolean mUb(String str, long j2) {
        if (!this.f4301n.contains(str)) {
            this.f4301n.edit().putLong(str, j2).commit();
            return true;
        }
        if (J2(this.f4301n.getLong(str, -1L), j2)) {
            return false;
        }
        this.f4301n.edit().putLong(str, j2).commit();
        return true;
    }

    synchronized void qie(long j2) {
        this.f4301n.edit().putLong("fire-global", j2).commit();
    }

    synchronized void rl() {
        try {
            SharedPreferences.Editor editorEdit = this.f4301n.edit();
            int i2 = 0;
            for (Map.Entry<String, ?> entry : this.f4301n.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strNr = nr(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strNr)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strNr);
                        i2++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i2 == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i2);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized List t() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f4301n.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(nr(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(o.n(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            qie(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    synchronized boolean xMQ(long j2) {
        return mUb("fire-global", j2);
    }

    public C(Context context, String str) {
        this.f4301n = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }
}
