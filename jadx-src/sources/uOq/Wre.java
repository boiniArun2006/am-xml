package uOq;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f74373n;
    private final w6 rl;

    private static class n implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Class f74374n;

        private n(Class cls) {
            this.f74374n = cls;
        }

        private Bundle rl(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f74374n), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f74374n + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // uOq.Wre.w6
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public List n(Context context) {
            Bundle bundleRl = rl(context);
            if (bundleRl == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleRl.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleRl.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    interface w6 {
        List n(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar nr(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (InstantiationException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e3);
        } catch (NoSuchMethodException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        } catch (InvocationTargetException e5) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e5);
        }
    }

    public static Wre t(Context context, Class cls) {
        return new Wre(context, new n(cls));
    }

    public List rl() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.rl.n(this.f74373n)) {
            arrayList.add(new oSp.n() { // from class: uOq.I28
                @Override // oSp.n
                public final Object get() {
                    return Wre.nr(str);
                }
            });
        }
        return arrayList;
    }

    Wre(Object obj, w6 w6Var) {
        this.f74373n = obj;
        this.rl = w6Var;
    }
}
