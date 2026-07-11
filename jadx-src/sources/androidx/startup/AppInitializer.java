package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class AppInitializer {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Object f42065O = new Object();
    private static volatile AppInitializer nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Context f42067t;
    final Set rl = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Map f42066n = new HashMap();

    public static AppInitializer O(Context context) {
        if (nr == null) {
            synchronized (f42065O) {
                try {
                    if (nr == null) {
                        nr = new AppInitializer(context);
                    }
                } finally {
                }
            }
        }
        return nr;
    }

    public boolean Uo(Class cls) {
        return this.rl.contains(cls);
    }

    void n() {
        try {
            try {
                Trace.t("Startup");
                rl(this.f42067t.getPackageManager().getProviderInfo(new ComponentName(this.f42067t.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new StartupException(e2);
            }
        } finally {
            Trace.J2();
        }
    }

    void rl(Bundle bundle) {
        String string = this.f42067t.getString(R.string.f42068n);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (Initializer.class.isAssignableFrom(cls)) {
                            this.rl.add(cls);
                        }
                    }
                }
                Iterator it = this.rl.iterator();
                while (it.hasNext()) {
                    nr((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    Object t(Class cls) {
        Object objNr;
        synchronized (f42065O) {
            try {
                objNr = this.f42066n.get(cls);
                if (objNr == null) {
                    objNr = nr(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objNr;
    }

    AppInitializer(Context context) {
        this.f42067t = context.getApplicationContext();
    }

    private Object nr(Class cls, Set set) {
        Object objCreate;
        if (Trace.KN()) {
            try {
                Trace.t(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.J2();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f42066n.containsKey(cls)) {
                set.add(cls);
                try {
                    Initializer initializer = (Initializer) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class> listN = initializer.n();
                    if (!listN.isEmpty()) {
                        for (Class cls2 : listN) {
                            if (!this.f42066n.containsKey(cls2)) {
                                nr(cls2, set);
                            }
                        }
                    }
                    objCreate = initializer.create(this.f42067t);
                    set.remove(cls);
                    this.f42066n.put(cls, objCreate);
                } catch (Throwable th2) {
                    throw new StartupException(th2);
                }
            } else {
                objCreate = this.f42066n.get(cls);
            }
            Trace.J2();
            return objCreate;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    public Object J2(Class cls) {
        return t(cls);
    }
}
