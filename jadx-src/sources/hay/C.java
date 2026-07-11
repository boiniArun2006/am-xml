package hay;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class C implements I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f67960n;
    private final Dsr rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f67961t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Context f67962n;
        private Map rl = null;

        private static Bundle nr(Context context) {
            String str = Apsps.IgxJzDmPhIHhVR;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(str, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(str, "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(str, "Application info not found.");
                return null;
            }
        }

        private Map t() {
            if (this.rl == null) {
                this.rl = n(this.f67962n);
            }
            return this.rl;
        }

        Ml rl(String str) {
            String str2 = (String) t().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (Ml) Class.forName(str2).asSubclass(Ml.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e2);
                return null;
            } catch (IllegalAccessException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (InstantiationException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e6);
                return null;
            }
        }

        j(Context context) {
            this.f67962n = context;
        }

        private Map n(Context context) {
            Bundle bundleNr = nr(context);
            if (bundleNr == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : bundleNr.keySet()) {
                Object obj = bundleNr.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }
    }

    C(Context context, Dsr dsr) {
        this(new j(context), dsr);
    }

    @Override // hay.I28
    public synchronized qz get(String str) {
        if (this.f67961t.containsKey(str)) {
            return (qz) this.f67961t.get(str);
        }
        Ml mlRl = this.f67960n.rl(str);
        if (mlRl == null) {
            return null;
        }
        qz qzVarCreate = mlRl.create(this.rl.n(str));
        this.f67961t.put(str, qzVarCreate);
        return qzVarCreate;
    }

    C(j jVar, Dsr dsr) {
        this.f67961t = new HashMap();
        this.f67960n = jVar;
        this.rl = dsr;
    }
}
