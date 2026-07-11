package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f60740n = new HashSet();
    private final Wre nr;
    private final Executor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Wre f60741t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Charset f60739O = Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);
    static final Pattern J2 = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    static final Pattern Uo = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    private static Set J2(Wre wre) {
        HashSet hashSet = new HashSet();
        CN3 cn3O = O(wre);
        if (cn3O != null) {
            Iterator<String> itKeys = cn3O.Uo().keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    private static void qie(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    private void t(final String str, final CN3 cn3) {
        if (cn3 == null) {
            return;
        }
        synchronized (this.f60740n) {
            try {
                for (final BiConsumer biConsumer : this.f60740n) {
                    this.rl.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.Pl
                        @Override // java.lang.Runnable
                        public final void run() {
                            biConsumer.accept(str, cn3);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long Uo(String str) {
        Long lKN = KN(this.f60741t, str);
        if (lKN != null) {
            t(str, O(this.f60741t));
            return lKN.longValue();
        }
        Long lKN2 = KN(this.nr, str);
        if (lKN2 != null) {
            return lKN2.longValue();
        }
        qie(str, "Long");
        return 0L;
    }

    public N67.o gh(String str) {
        String strMUb = mUb(this.f60741t, str);
        if (strMUb != null) {
            t(str, O(this.f60741t));
            return new Q(strMUb, 2);
        }
        String strMUb2 = mUb(this.nr, str);
        if (strMUb2 != null) {
            return new Q(strMUb2, 1);
        }
        qie(str, "FirebaseRemoteConfigValue");
        return new Q("", 0);
    }

    public Map nr() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(J2(this.f60741t));
        hashSet.addAll(J2(this.nr));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            map.put(str, gh(str));
        }
        return map;
    }

    public void rl(BiConsumer biConsumer) {
        synchronized (this.f60740n) {
            this.f60740n.add(biConsumer);
        }
    }

    public String xMQ(String str) {
        String strMUb = mUb(this.f60741t, str);
        if (strMUb != null) {
            t(str, O(this.f60741t));
            return strMUb;
        }
        String strMUb2 = mUb(this.nr, str);
        if (strMUb2 != null) {
            return strMUb2;
        }
        qie(str, "String");
        return "";
    }

    public Xo(Executor executor, Wre wre, Wre wre2) {
        this.rl = executor;
        this.f60741t = wre;
        this.nr = wre2;
    }

    private static Long KN(Wre wre, String str) {
        CN3 cn3O = O(wre);
        if (cn3O == null) {
            return null;
        }
        try {
            return Long.valueOf(cn3O.Uo().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static CN3 O(Wre wre) {
        return wre.J2();
    }

    private static String mUb(Wre wre, String str) {
        CN3 cn3O = O(wre);
        if (cn3O == null) {
            return null;
        }
        try {
            return cn3O.Uo().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }
}
