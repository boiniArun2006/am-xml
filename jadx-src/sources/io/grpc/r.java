package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class r {

    class j implements Comparator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ n f68861n;

        j(n nVar) {
            this.f68861n = nVar;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            int iRl = this.f68861n.rl(obj) - this.f68861n.rl(obj2);
            return iRl != 0 ? iRl : obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
    }

    public interface n {
        boolean n(Object obj);

        int rl(Object obj);
    }

    static boolean nr(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    static Iterable rl(Class cls, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object objN = n(cls, (Class) it.next());
            if (objN != null) {
                arrayList.add(objN);
            }
        }
        return arrayList;
    }

    public static List O(Class cls, Iterable iterable, ClassLoader classLoader, n nVar) {
        Iterable iterableT;
        if (nr(classLoader)) {
            iterableT = rl(cls, iterable);
        } else {
            iterableT = t(cls, classLoader);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterableT) {
            if (nVar.n(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new j(nVar)));
        return Collections.unmodifiableList(arrayList);
    }

    private static Object n(Class cls, Class cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
        }
    }

    public static Iterable t(Class cls, ClassLoader classLoader) {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
        if (!serviceLoaderLoad.iterator().hasNext()) {
            return ServiceLoader.load(cls);
        }
        return serviceLoaderLoad;
    }
}
