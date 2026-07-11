package androidx.view;

import androidx.view.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Deprecated
final class ClassesInfoCache {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static ClassesInfoCache f38826t = new ClassesInfoCache();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f38827n = new HashMap();
    private final Map rl = new HashMap();

    @Deprecated
    static class CallbackInfo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Map f38828n = new HashMap();
        final Map rl;

        private static void rl(List list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((MethodReference) list.get(size)).n(lifecycleOwner, event, obj);
                }
            }
        }

        void n(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            rl((List) this.f38828n.get(event), lifecycleOwner, event, obj);
            rl((List) this.f38828n.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
        }

        CallbackInfo(Map map) {
            this.rl = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List arrayList = (List) this.f38828n.get(event);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f38828n.put(event, arrayList);
                }
                arrayList.add((MethodReference) entry.getKey());
            }
        }
    }

    @Deprecated
    static final class MethodReference {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f38829n;
        final Method rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodReference)) {
                return false;
            }
            MethodReference methodReference = (MethodReference) obj;
            return this.f38829n == methodReference.f38829n && this.rl.getName().equals(methodReference.rl.getName());
        }

        public int hashCode() {
            return (this.f38829n * 31) + this.rl.getName().hashCode();
        }

        void n(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            try {
                int i2 = this.f38829n;
                if (i2 == 0) {
                    this.rl.invoke(obj, new Object[0]);
                } else if (i2 == 1) {
                    this.rl.invoke(obj, lifecycleOwner);
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.rl.invoke(obj, lifecycleOwner, event);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to call observer method", e3.getCause());
            }
        }

        MethodReference(int i2, Method method) {
            this.f38829n = i2;
            this.rl = method;
            method.setAccessible(true);
        }
    }

    boolean nr(Class cls) {
        Boolean bool = (Boolean) this.rl.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrRl = rl(cls);
        for (Method method : methodArrRl) {
            if (((OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class)) != null) {
                n(cls, methodArrRl);
                return true;
            }
        }
        this.rl.put(cls, Boolean.FALSE);
        return false;
    }

    CallbackInfo t(Class cls) {
        CallbackInfo callbackInfo = (CallbackInfo) this.f38827n.get(cls);
        return callbackInfo != null ? callbackInfo : n(cls, null);
    }

    ClassesInfoCache() {
    }

    private void O(Map map, MethodReference methodReference, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(methodReference);
        if (event2 != null && event != event2) {
            throw new IllegalArgumentException("Method " + methodReference.rl.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
        }
        if (event2 == null) {
            map.put(methodReference, event);
        }
    }

    private CallbackInfo n(Class cls, Method[] methodArr) {
        int i2;
        CallbackInfo callbackInfoT;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (callbackInfoT = t(superclass)) != null) {
            map.putAll(callbackInfoT.rl);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : t(cls2).rl.entrySet()) {
                O(map, (MethodReference) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = rl(cls);
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        i2 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i2 = 0;
                }
                Lifecycle.Event eventValue = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        if (eventValue == Lifecycle.Event.ON_ANY) {
                            i2 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    O(map, new MethodReference(i2, method), eventValue, cls);
                    z2 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        CallbackInfo callbackInfo = new CallbackInfo(map);
        this.f38827n.put(cls, callbackInfo);
        this.rl.put(cls, Boolean.valueOf(z2));
        return callbackInfo;
    }

    private Method[] rl(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }
}
