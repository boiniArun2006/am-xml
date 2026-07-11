package T6s;

import com.google.gson.JsonIOException;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f10186n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f10187t;

    class C implements T6s.fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f10188n;

        C(String str) {
            this.f10188n = str;
        }

        @Override // T6s.fuX
        public Object n() {
            throw new JsonIOException(this.f10188n);
        }
    }

    class CN3 implements T6s.fuX {
        @Override // T6s.fuX
        public Object n() {
            return new TreeMap();
        }

        CN3() {
        }
    }

    class Dsr implements T6s.fuX {
        @Override // T6s.fuX
        public Object n() {
            return new T6s.CN3();
        }

        Dsr() {
        }
    }

    class I28 implements T6s.fuX {
        @Override // T6s.fuX
        public Object n() {
            return new ConcurrentSkipListMap();
        }

        I28() {
        }
    }

    class Ml implements T6s.fuX {
        @Override // T6s.fuX
        public Object n() {
            return new ArrayList();
        }

        Ml() {
        }
    }

    class Pl implements T6s.fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Type f10189n;

        Pl(Type type) {
            this.f10189n = type;
        }

        @Override // T6s.fuX
        public Object n() {
            Type type = this.f10189n;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumSet type: " + this.f10189n.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f10189n.toString());
        }
    }

    class QJ implements T6s.fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Constructor f10190n;

        QJ(Constructor constructor) {
            this.f10190n = constructor;
        }

        @Override // T6s.fuX
        public Object n() {
            try {
                return this.f10190n.newInstance(new Object[0]);
            } catch (IllegalAccessException e2) {
                throw MUN.j.O(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Failed to invoke constructor '" + MUN.j.t(this.f10190n) + "' with no args", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to invoke constructor '" + MUN.j.t(this.f10190n) + "' with no args", e4.getCause());
            }
        }
    }

    class Wre implements T6s.fuX {
        @Override // T6s.fuX
        public Object n() {
            return new ConcurrentHashMap();
        }

        Wre() {
        }
    }

    class Xo implements T6s.fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Type f10191n;

        Xo(Type type) {
            this.f10191n = type;
        }

        @Override // T6s.fuX
        public Object n() {
            Type type = this.f10191n;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumMap type: " + this.f10191n.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new JsonIOException("Invalid EnumMap type: " + this.f10191n.toString());
        }
    }

    class aC implements T6s.fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Class f10192n;

        aC(Class cls) {
            this.f10192n = cls;
        }

        @Override // T6s.fuX
        public Object n() {
            try {
                return T6s.qz.f10183n.nr(this.f10192n);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to create instance of " + this.f10192n + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e2);
            }
        }
    }

    class eO implements T6s.fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f10193n;

        eO(String str) {
            this.f10193n = str;
        }

        @Override // T6s.fuX
        public Object n() {
            throw new JsonIOException(this.f10193n);
        }
    }

    class fuX implements T6s.fuX {
        @Override // T6s.fuX
        public Object n() {
            return new LinkedHashMap();
        }

        fuX() {
        }
    }

    class j implements T6s.fuX {
        @Override // T6s.fuX
        public Object n() {
            return new TreeSet();
        }

        j() {
        }
    }

    class n implements T6s.fuX {
        @Override // T6s.fuX
        public Object n() {
            return new LinkedHashSet();
        }

        n() {
        }
    }

    class o implements T6s.fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f10194n;

        o(String str) {
            this.f10194n = str;
        }

        @Override // T6s.fuX
        public Object n() {
            throw new JsonIOException(this.f10194n);
        }
    }

    class qz implements T6s.fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f10195n;

        qz(String str) {
            this.f10195n = str;
        }

        @Override // T6s.fuX
        public Object n() {
            throw new JsonIOException(this.f10195n);
        }
    }

    /* JADX INFO: renamed from: T6s.w6$w6, reason: collision with other inner class name */
    class C0356w6 implements T6s.fuX {
        @Override // T6s.fuX
        public Object n() {
            return new ArrayDeque();
        }

        C0356w6() {
        }
    }

    class z implements T6s.fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f10196n;

        z(String str) {
            this.f10196n = str;
        }

        @Override // T6s.fuX
        public Object n() {
            throw new JsonIOException(this.f10196n);
        }
    }

    private T6s.fuX J2(Class cls) {
        if (this.rl) {
            return new aC(cls);
        }
        return new C("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    private static T6s.fuX O(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new Pl(type);
        }
        if (cls == EnumMap.class) {
            return new Xo(type);
        }
        return null;
    }

    private static T6s.fuX nr(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new j() : Set.class.isAssignableFrom(cls) ? new n() : Queue.class.isAssignableFrom(cls) ? new C0356w6() : new Ml();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new I28() : ConcurrentMap.class.isAssignableFrom(cls) ? new Wre() : SortedMap.class.isAssignableFrom(cls) ? new CN3() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new Dsr() : new fuX();
        }
        return null;
    }

    public String toString() {
        return this.f10186n.toString();
    }

    public w6(Map map, boolean z2, List list) {
        this.f10186n = map;
        this.rl = z2;
        this.f10187t = list;
    }

    static String n(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
        }
        return null;
    }

    private static T6s.fuX t(Class cls, o.j jVar) {
        String strAz;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            o.j jVar2 = o.j.ALLOW;
            if (jVar != jVar2 && (!T6s.C.n(declaredConstructor, null) || (jVar == o.j.BLOCK_ALL && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return new eO("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
            }
            if (jVar == jVar2 && (strAz = MUN.j.az(declaredConstructor)) != null) {
                return new z(strAz);
            }
            return new QJ(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public T6s.fuX rl(TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        android.support.v4.media.j.n(this.f10186n.get(type));
        android.support.v4.media.j.n(this.f10186n.get(rawType));
        T6s.fuX fuxO = O(type, rawType);
        if (fuxO != null) {
            return fuxO;
        }
        o.j jVarRl = T6s.C.rl(this.f10187t, rawType);
        T6s.fuX fuxT = t(rawType, jVarRl);
        if (fuxT != null) {
            return fuxT;
        }
        T6s.fuX fuxNr = nr(type, rawType);
        if (fuxNr != null) {
            return fuxNr;
        }
        String strN = n(rawType);
        if (strN != null) {
            return new o(strN);
        }
        if (jVarRl == o.j.ALLOW) {
            return J2(rawType);
        }
        return new qz("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }
}
