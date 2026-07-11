package com.google.gson.internal.bind;

import T6s.C;
import T6s.aC;
import T6s.fuX;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Xo;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.eO;
import com.google.gson.internal.Excluder;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import d8q.jqQ.QTafcm;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class ReflectiveTypeAdapterFactory implements eO {
    private final JsonAdapterAnnotationTypeAdapterFactory J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Excluder f60949O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final T6s.w6 f60950n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f60951r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FieldNamingStrategy f60952t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    private static final class I28 extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        static final Map f60953O = mUb();
        private final Map nr;
        private final Constructor rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Object[] f60954t;

        private static Map mUb() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.n
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public Object[] O() {
            return (Object[]) this.f60954t.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.n
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public void Uo(Object[] objArr, JsonReader jsonReader, w6 w6Var) {
            Integer num = (Integer) this.nr.get(w6Var.f60958t);
            if (num != null) {
                w6Var.n(jsonReader, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException(QTafcm.wVw + MUN.j.t(this.rl) + "' for field with name '" + w6Var.f60958t + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.n
        /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
        public Object J2(Object[] objArr) {
            try {
                return this.rl.newInstance(objArr);
            } catch (IllegalAccessException e2) {
                throw MUN.j.O(e2);
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new RuntimeException("Failed to invoke constructor '" + MUN.j.t(this.rl) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e4) {
                e = e4;
                throw new RuntimeException("Failed to invoke constructor '" + MUN.j.t(this.rl) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Failed to invoke constructor '" + MUN.j.t(this.rl) + "' with args " + Arrays.toString(objArr), e5.getCause());
            }
        }

        I28(Class cls, Map map, boolean z2) {
            super(map);
            this.nr = new HashMap();
            Constructor constructorXMQ = MUN.j.xMQ(cls);
            this.rl = constructorXMQ;
            if (z2) {
                ReflectiveTypeAdapterFactory.t(null, constructorXMQ);
            } else {
                MUN.j.qie(constructorXMQ);
            }
            String[] strArrMUb = MUN.j.mUb(cls);
            for (int i2 = 0; i2 < strArrMUb.length; i2++) {
                this.nr.put(strArrMUb[i2], Integer.valueOf(i2));
            }
            Class<?>[] parameterTypes = this.rl.getParameterTypes();
            this.f60954t = new Object[parameterTypes.length];
            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                this.f60954t[i3] = f60953O.get(parameterTypes[i3]);
            }
        }
    }

    private static final class Ml extends n {
        private final fuX rl;

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.n
        Object J2(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.n
        Object O() {
            return this.rl.n();
        }

        Ml(fuX fux, Map map) {
            super(map);
            this.rl = fux;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.n
        void Uo(Object obj, JsonReader jsonReader, w6 w6Var) {
            w6Var.rl(jsonReader, obj);
        }
    }

    class j extends w6 {
        final /* synthetic */ boolean J2;
        final /* synthetic */ boolean KN;
        final /* synthetic */ Method Uo;
        final /* synthetic */ boolean az;
        final /* synthetic */ TypeToken gh;
        final /* synthetic */ Gson mUb;
        final /* synthetic */ boolean qie;
        final /* synthetic */ Xo xMQ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Field field, boolean z2, boolean z3, boolean z4, Method method, boolean z5, Xo xo, Gson gson, TypeToken typeToken, boolean z6, boolean z7) {
            super(str, field, z2, z3);
            this.J2 = z4;
            this.Uo = method;
            this.KN = z5;
            this.xMQ = xo;
            this.mUb = gson;
            this.gh = typeToken;
            this.qie = z6;
            this.az = z7;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.w6
        void n(JsonReader jsonReader, int i2, Object[] objArr) {
            Object objRl = this.xMQ.rl(jsonReader);
            if (objRl != null || !this.qie) {
                objArr[i2] = objRl;
                return;
            }
            throw new JsonParseException("null is not allowed as value for record component '" + this.f60958t + "' of primitive type; at path " + jsonReader.getPath());
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.w6
        void rl(JsonReader jsonReader, Object obj) throws IllegalAccessException {
            Object objRl = this.xMQ.rl(jsonReader);
            if (objRl == null && this.qie) {
                return;
            }
            if (this.J2) {
                ReflectiveTypeAdapterFactory.t(obj, this.rl);
            } else if (this.az) {
                throw new JsonIOException("Cannot set value of 'static final' " + MUN.j.Uo(this.rl, false));
            }
            this.rl.set(obj, objRl);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.w6
        void t(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
            Object objInvoke;
            if (this.nr) {
                if (this.J2) {
                    Method method = this.Uo;
                    if (method == null) {
                        ReflectiveTypeAdapterFactory.t(obj, this.rl);
                    } else {
                        ReflectiveTypeAdapterFactory.t(obj, method);
                    }
                }
                Method method2 = this.Uo;
                if (method2 != null) {
                    try {
                        objInvoke = method2.invoke(obj, new Object[0]);
                    } catch (InvocationTargetException e2) {
                        throw new JsonIOException("Accessor " + MUN.j.Uo(this.Uo, false) + " threw exception", e2.getCause());
                    }
                } else {
                    objInvoke = this.rl.get(obj);
                }
                if (objInvoke == obj) {
                    return;
                }
                jsonWriter.name(this.f60957n);
                (this.KN ? this.xMQ : new com.google.gson.internal.bind.I28(this.mUb, this.xMQ, this.gh.getType())).nr(jsonWriter, objInvoke);
            }
        }
    }

    public static abstract class n extends Xo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Map f60955n;

        abstract Object J2(Object obj);

        abstract Object O();

        abstract void Uo(Object obj, JsonReader jsonReader, w6 w6Var);

        @Override // com.google.gson.Xo
        public void nr(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator it = this.f60955n.values().iterator();
                while (it.hasNext()) {
                    ((w6) it.next()).t(jsonWriter, obj);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e2) {
                throw MUN.j.O(e2);
            }
        }

        n(Map map) {
            this.f60955n = map;
        }

        @Override // com.google.gson.Xo
        public Object rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Object objO = O();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    w6 w6Var = (w6) this.f60955n.get(jsonReader.nextName());
                    if (w6Var != null && w6Var.f60956O) {
                        Uo(objO, jsonReader, w6Var);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return J2(objO);
            } catch (IllegalAccessException e2) {
                throw MUN.j.O(e2);
            } catch (IllegalStateException e3) {
                throw new JsonSyntaxException(e3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void t(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (C.n(accessibleObject, obj)) {
            return;
        }
        throw new JsonIOException(MUN.j.Uo(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    static abstract class w6 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final boolean f60956O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f60957n;
        final boolean nr;
        final Field rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final String f60958t;

        abstract void n(JsonReader jsonReader, int i2, Object[] objArr);

        abstract void rl(JsonReader jsonReader, Object obj);

        abstract void t(JsonWriter jsonWriter, Object obj);

        protected w6(String str, Field field, boolean z2, boolean z3) {
            this.f60957n = str;
            this.rl = field;
            this.f60958t = field.getName();
            this.nr = z2;
            this.f60956O = z3;
        }
    }

    private List J2(Field field) {
        AlA.n nVar = (AlA.n) field.getAnnotation(AlA.n.class);
        if (nVar == null) {
            return Collections.singletonList(this.f60952t.translateName(field));
        }
        String strValue = nVar.value();
        String[] strArrAlternate = nVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        Collections.addAll(arrayList, strArrAlternate);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0121 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Map O(Gson gson, TypeToken typeToken, Class cls, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        Method method;
        int size;
        TypeToken typeToken2;
        w6 w6Var;
        int i3;
        int i5;
        int i7;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        Class cls2 = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls2.isInterface()) {
            TypeToken typeToken3 = typeToken;
            boolean z5 = z2;
            Class rawType = cls2;
            while (rawType != Object.class) {
                Field[] declaredFields = rawType.getDeclaredFields();
                boolean z6 = true;
                boolean z7 = false;
                if (rawType != cls2 && declaredFields.length > 0) {
                    o.j jVarRl = C.rl(reflectiveTypeAdapterFactory.f60951r, rawType);
                    if (jVarRl == o.j.BLOCK_ALL) {
                        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + " (supertype of " + cls2 + "). Register a TypeAdapter for this type or adjust the access filter.");
                    }
                    z5 = jVarRl == o.j.BLOCK_INACCESSIBLE;
                }
                boolean z9 = z5;
                int length = declaredFields.length;
                int i8 = 0;
                while (i8 < length) {
                    int i9 = i8;
                    Field field = declaredFields[i9];
                    boolean zUo = reflectiveTypeAdapterFactory.Uo(field, z6);
                    boolean zUo2 = reflectiveTypeAdapterFactory.Uo(field, z7);
                    if (zUo || zUo2) {
                        if (!z3) {
                            z4 = zUo2;
                            i2 = i9;
                        } else if (Modifier.isStatic(field.getModifiers())) {
                            i2 = i9;
                            z4 = z7;
                        } else {
                            Method methodKN = MUN.j.KN(rawType, field);
                            if (!z9) {
                                MUN.j.qie(methodKN);
                            }
                            if (methodKN.getAnnotation(AlA.n.class) != null && field.getAnnotation(AlA.n.class) == null) {
                                throw new JsonIOException("@SerializedName on " + MUN.j.Uo(methodKN, z7) + " is not supported");
                            }
                            i2 = i9;
                            method = methodKN;
                            z4 = zUo2;
                            if (!z9 && method == null) {
                                MUN.j.qie(field);
                            }
                            Type typeHI = T6s.n.HI(typeToken3.getType(), rawType, field.getGenericType());
                            List listJ2 = reflectiveTypeAdapterFactory.J2(field);
                            size = listJ2.size();
                            typeToken2 = typeToken3;
                            w6Var = null;
                            i3 = 0;
                            while (i3 < size) {
                                String str = (String) listJ2.get(i3);
                                if (i3 != 0) {
                                    zUo = false;
                                }
                                int i10 = i2;
                                List list = listJ2;
                                boolean z10 = zUo;
                                int i11 = length;
                                w6 w6Var2 = (w6) linkedHashMap.put(str, reflectiveTypeAdapterFactory.nr(gson, field, method, str, TypeToken.get(typeHI), z10, z4, z9));
                                if (w6Var == null) {
                                    w6Var = w6Var2;
                                }
                                i3++;
                                reflectiveTypeAdapterFactory = this;
                                zUo = z10;
                                length = i11;
                                i2 = i10;
                                listJ2 = list;
                            }
                            i5 = length;
                            i7 = i2;
                            if (w6Var == null) {
                                throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + w6Var.f60957n + "'; conflict is caused by fields " + MUN.j.J2(w6Var.rl) + " and " + MUN.j.J2(field));
                            }
                        }
                        method = null;
                        if (!z9) {
                            MUN.j.qie(field);
                        }
                        Type typeHI2 = T6s.n.HI(typeToken3.getType(), rawType, field.getGenericType());
                        List listJ22 = reflectiveTypeAdapterFactory.J2(field);
                        size = listJ22.size();
                        typeToken2 = typeToken3;
                        w6Var = null;
                        i3 = 0;
                        while (i3 < size) {
                        }
                        i5 = length;
                        i7 = i2;
                        if (w6Var == null) {
                        }
                    } else {
                        i5 = length;
                        i7 = i9;
                        typeToken2 = typeToken3;
                    }
                    i8 = i7 + 1;
                    reflectiveTypeAdapterFactory = this;
                    typeToken3 = typeToken2;
                    length = i5;
                    z6 = true;
                    z7 = false;
                }
                typeToken3 = TypeToken.get(T6s.n.HI(typeToken3.getType(), rawType, rawType.getGenericSuperclass()));
                rawType = typeToken3.getRawType();
                reflectiveTypeAdapterFactory = this;
                cls2 = cls;
                z5 = z9;
            }
        }
        return linkedHashMap;
    }

    private boolean Uo(Field field, boolean z2) {
        return (this.f60949O.nr(field.getType(), z2) || this.f60949O.KN(field, z2)) ? false : true;
    }

    private w6 nr(Gson gson, Field field, Method method, String str, TypeToken typeToken, boolean z2, boolean z3, boolean z4) {
        boolean zN = aC.n(typeToken.getRawType());
        int modifiers = field.getModifiers();
        boolean z5 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        Xo xoRl = jsonAdapter != null ? this.J2.rl(this.f60950n, gson, typeToken, jsonAdapter) : null;
        boolean z6 = xoRl != null;
        if (xoRl == null) {
            xoRl = gson.getAdapter(typeToken);
        }
        return new j(str, field, z2, z3, z4, method, z6, xoRl, gson, typeToken, zN, z5);
    }

    public ReflectiveTypeAdapterFactory(T6s.w6 w6Var, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f60950n = w6Var;
        this.f60952t = fieldNamingStrategy;
        this.f60949O = excluder;
        this.J2 = jsonAdapterAnnotationTypeAdapterFactory;
        this.f60951r = list;
    }

    @Override // com.google.gson.eO
    public Xo n(Gson gson, TypeToken typeToken) {
        boolean z2;
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        o.j jVarRl = C.rl(this.f60951r, rawType);
        if (jVarRl != o.j.BLOCK_ALL) {
            if (jVarRl == o.j.BLOCK_INACCESSIBLE) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = z2;
            if (MUN.j.gh(rawType)) {
                return new I28(rawType, O(gson, typeToken, rawType, z3, true), z3);
            }
            return new Ml(this.f60950n.rl(typeToken), O(gson, typeToken, rawType, z3, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
