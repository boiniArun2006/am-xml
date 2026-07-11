package androidx.view;

import androidx.annotation.RestrictTo;
import cS.Zv.SzFNXybiSxdx;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR2\u0010 \u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u001f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "<init>", "()V", "object", "Landroidx/lifecycle/LifecycleEventObserver;", "J2", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleEventObserver;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "constructor", c.f62177j, "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/GeneratedAdapter;", "Ljava/lang/Class;", "klass", "rl", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", "nr", "(Ljava/lang/Class;)I", "Uo", "", "O", "(Ljava/lang/Class;)Z", "", "className", "t", "(Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/util/Map;", "callbackCache", "", "classToAdapters", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
public final class Lifecycling {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Lifecycling f38910n = new Lifecycling();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final Map callbackCache = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final Map classToAdapters = new HashMap();

    public static final LifecycleEventObserver J2(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z2 = object instanceof LifecycleEventObserver;
        boolean z3 = object instanceof DefaultLifecycleObserver;
        if (z2 && z3) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
        }
        if (z3) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z2) {
            return (LifecycleEventObserver) object;
        }
        Class<?> cls = object.getClass();
        Lifecycling lifecycling = f38910n;
        if (lifecycling.nr(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        Object obj = classToAdapters.get(cls);
        Intrinsics.checkNotNull(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(lifecycling.n((Constructor) list.get(0), object));
        }
        int size = list.size();
        GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
        for (int i2 = 0; i2 < size; i2++) {
            generatedAdapterArr[i2] = f38910n.n((Constructor) list.get(i2), object);
        }
        return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
    }

    private final boolean O(Class klass) {
        return klass != null && LifecycleObserver.class.isAssignableFrom(klass);
    }

    private final int nr(Class klass) {
        Map map = callbackCache;
        Integer num = (Integer) map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int iUo = Uo(klass);
        map.put(klass, Integer.valueOf(iUo));
        return iUo;
    }

    public static final String t(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt.replace$default(className, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    private Lifecycling() {
    }

    private final int Uo(Class klass) {
        ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorRl = rl(klass);
        if (constructorRl != null) {
            classToAdapters.put(klass, CollectionsKt.listOf(constructorRl));
            return 2;
        }
        if (ClassesInfoCache.f38826t.nr(klass)) {
            return 1;
        }
        Class superclass = klass.getSuperclass();
        if (O(superclass)) {
            Intrinsics.checkNotNull(superclass);
            if (nr(superclass) == 1) {
                return 1;
            }
            Object obj = classToAdapters.get(superclass);
            Intrinsics.checkNotNull(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Iterator it = ArrayIteratorKt.iterator(klass.getInterfaces());
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (O(cls)) {
                Intrinsics.checkNotNull(cls);
                if (nr(cls) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = classToAdapters.get(cls);
                Intrinsics.checkNotNull(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(klass, arrayList);
        return 2;
    }

    private final GeneratedAdapter n(Constructor constructor, Object object) {
        try {
            Object objNewInstance = constructor.newInstance(object);
            Intrinsics.checkNotNull(objNewInstance);
            return (GeneratedAdapter) objNewInstance;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private final Constructor rl(Class klass) {
        String name;
        try {
            Package r02 = klass.getPackage();
            String canonicalName = klass.getCanonicalName();
            if (r02 != null) {
                name = r02.getName();
            } else {
                name = "";
            }
            Intrinsics.checkNotNull(name);
            if (name.length() != 0) {
                Intrinsics.checkNotNull(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "substring(...)");
            }
            Intrinsics.checkNotNull(canonicalName);
            String strT = t(canonicalName);
            if (name.length() != 0) {
                strT = name + '.' + strT;
            }
            Class<?> cls = Class.forName(strT);
            Intrinsics.checkNotNull(cls, SzFNXybiSxdx.LKwYHLoUjl);
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(klass);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }
}
