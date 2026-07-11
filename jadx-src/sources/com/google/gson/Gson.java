package com.google.gson;

import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Gson {
    static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    static final String DEFAULT_DATE_PATTERN = null;
    static final boolean DEFAULT_ESCAPE_HTML = true;
    static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    static final boolean DEFAULT_LENIENT = false;
    static final boolean DEFAULT_PRETTY_PRINT = false;
    static final boolean DEFAULT_SERIALIZE_NULLS = false;
    static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    static final boolean DEFAULT_USE_JDK_UNSAFE = true;
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    final List<eO> builderFactories;
    final List<eO> builderHierarchyFactories;
    final boolean complexMapKeySerialization;
    private final T6s.w6 constructorConstructor;
    final String datePattern;
    final int dateStyle;
    final Excluder excluder;
    final List<eO> factories;
    final FieldNamingStrategy fieldNamingStrategy;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final Map<Type, Object> instanceCreators;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    final boolean lenient;
    final C longSerializationPolicy;
    final Pl numberToNumberStrategy;
    final Pl objectToNumberStrategy;
    final boolean prettyPrinting;
    final List<o> reflectionFilters;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    private final ThreadLocal<Map<TypeToken<?>, Xo>> threadLocalAdapterResults;
    final int timeStyle;
    private final ConcurrentMap<TypeToken<?>, Xo> typeTokenCache;
    final boolean useJdkUnsafe;
    static final FieldNamingStrategy DEFAULT_FIELD_NAMING_STRATEGY = com.google.gson.w6.f61029n;
    static final Pl DEFAULT_OBJECT_TO_NUMBER_STRATEGY = qz.f61023n;
    static final Pl DEFAULT_NUMBER_TO_NUMBER_STRATEGY = qz.f61025t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class I28 extends Xo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Xo f60913n;

        I28(Xo xo) {
            this.f60913n = xo;
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray rl(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f60913n.rl(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                this.f60913n.nr(jsonWriter, Long.valueOf(atomicLongArray.get(i2)));
            }
            jsonWriter.endArray();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class Ml extends Xo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Xo f60914n;

        Ml(Xo xo) {
            this.f60914n = xo;
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, AtomicLong atomicLong) {
            this.f60914n.nr(jsonWriter, Long.valueOf(atomicLong.get()));
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public AtomicLong rl(JsonReader jsonReader) {
            return new AtomicLong(((Number) this.f60914n.rl(jsonReader)).longValue());
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static class Wre extends com.google.gson.internal.bind.Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Xo f60915n = null;

        private Xo J2() {
            Xo xo = this.f60915n;
            if (xo != null) {
                return xo;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        public void Uo(Xo xo) {
            if (this.f60915n != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f60915n = xo;
        }

        Wre() {
        }

        @Override // com.google.gson.internal.bind.Ml
        public Xo O() {
            return J2();
        }

        @Override // com.google.gson.Xo
        public void nr(JsonWriter jsonWriter, Object obj) {
            J2().nr(jsonWriter, obj);
        }

        @Override // com.google.gson.Xo
        public Object rl(JsonReader jsonReader) {
            return J2().rl(jsonReader);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class j extends Xo {
        j() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            double dDoubleValue = number.doubleValue();
            Gson.checkValidFloatingPoint(dDoubleValue);
            jsonWriter.value(dDoubleValue);
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Double rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class n extends Xo {
        n() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            float fFloatValue = number.floatValue();
            Gson.checkValidFloatingPoint(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            jsonWriter.value(number);
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Float rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Float.valueOf((float) jsonReader.nextDouble());
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class w6 extends Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }

        w6() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Number rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Long.valueOf(jsonReader.nextLong());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Gson() {
        Excluder excluder = Excluder.f60921Z;
        FieldNamingStrategy fieldNamingStrategy = DEFAULT_FIELD_NAMING_STRATEGY;
        Map map = Collections.EMPTY_MAP;
        C c2 = C.f60909n;
        String str = DEFAULT_DATE_PATTERN;
        List list = Collections.EMPTY_LIST;
        this(excluder, fieldNamingStrategy, map, false, false, false, true, false, false, false, true, c2, str, 2, 2, list, list, list, DEFAULT_OBJECT_TO_NUMBER_STRATEGY, DEFAULT_NUMBER_TO_NUMBER_STRATEGY, list);
    }

    public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) T6s.aC.rl(cls).cast(fromJson(str, TypeToken.get((Class) cls)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r2.Uo(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Xo getAdapter(TypeToken<T> typeToken) {
        boolean z2;
        Objects.requireNonNull(typeToken, "type must not be null");
        Xo xo = this.typeTokenCache.get(typeToken);
        if (xo != null) {
            return xo;
        }
        Map<? extends TypeToken<?>, ? extends Xo> map = this.threadLocalAdapterResults.get();
        if (map == null) {
            map = new HashMap<>();
            this.threadLocalAdapterResults.set((Map<TypeToken<?>, Xo>) map);
            z2 = true;
        } else {
            Xo xo2 = (Xo) map.get(typeToken);
            if (xo2 != null) {
                return xo2;
            }
            z2 = false;
        }
        try {
            Wre wre = new Wre();
            map.put(typeToken, wre);
            Iterator<eO> it = this.factories.iterator();
            Xo xoN = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                xoN = it.next().n(this, typeToken);
                if (xoN != null) {
                    break;
                }
            }
            if (xoN != null) {
                if (z2) {
                    this.typeTokenCache.putAll(map);
                }
                return xoN;
            }
            throw new IllegalArgumentException(YmsTEL.cSYRgiuDXbgaI + typeToken);
        } finally {
            if (z2) {
                this.threadLocalAdapterResults.remove();
            }
        }
    }

    public String toJson(Object obj) {
        return obj == null ? toJson((com.google.gson.Wre) CN3.f60911n) : toJson(obj, obj.getClass());
    }

    public com.google.gson.Wre toJsonTree(Object obj) {
        return obj == null ? CN3.f60911n : toJsonTree(obj, obj.getClass());
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException(e2);
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            }
        }
    }

    private static Xo atomicLongAdapter(Xo xo) {
        return new Ml(xo).n();
    }

    private static Xo atomicLongArrayAdapter(Xo xo) {
        return new I28(xo).n();
    }

    private Xo doubleAdapter(boolean z2) {
        return z2 ? TypeAdapters.f60970S : new j();
    }

    private Xo floatAdapter(boolean z2) {
        return z2 ? TypeAdapters.XQ : new n();
    }

    private static Xo longAdapter(C c2) {
        return c2 == C.f60909n ? TypeAdapters.f60974Z : new w6();
    }

    @Deprecated
    public Excluder excluder() {
        return this.excluder;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public <T> Xo getDelegateAdapter(eO eOVar, TypeToken<T> typeToken) {
        if (!this.factories.contains(eOVar)) {
            eOVar = this.jsonAdapterFactory;
        }
        boolean z2 = false;
        for (eO eOVar2 : this.factories) {
            if (z2) {
                Xo xoN = eOVar2.n(this, typeToken);
                if (xoN != null) {
                    return xoN;
                }
            } else if (eOVar2 == eOVar) {
                z2 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public boolean htmlSafe() {
        return this.htmlSafe;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.lenient);
        return jsonReader;
    }

    public JsonWriter newJsonWriter(Writer writer) throws IOException {
        if (this.generateNonExecutableJson) {
            writer.write(JSON_NON_EXECUTABLE_PREFIX);
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.prettyPrinting) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setHtmlSafe(this.htmlSafe);
        jsonWriter.setLenient(this.lenient);
        jsonWriter.setSerializeNulls(this.serializeNulls);
        return jsonWriter;
    }

    public boolean serializeNulls() {
        return this.serializeNulls;
    }

    public String toString() {
        return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
    }

    static void checkValidFloatingPoint(double d2) {
        if (!Double.isNaN(d2) && !Double.isInfinite(d2)) {
            return;
        }
        throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public <T> T fromJson(String str, Type type) throws JsonSyntaxException {
        return (T) fromJson(str, TypeToken.get(type));
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public com.google.gson.Wre toJsonTree(Object obj, Type type) {
        com.google.gson.internal.bind.w6 w6Var = new com.google.gson.internal.bind.w6();
        toJson(obj, type, w6Var);
        return w6Var.n();
    }

    public <T> T fromJson(String str, TypeToken<T> typeToken) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new StringReader(str), typeToken);
    }

    Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, Object> map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z9, boolean z10, C c2, String str, int i2, int i3, List<eO> list, List<eO> list2, List<eO> list3, Pl pl, Pl pl3, List<o> list4) {
        this.threadLocalAdapterResults = new ThreadLocal<>();
        this.typeTokenCache = new ConcurrentHashMap();
        this.excluder = excluder;
        this.fieldNamingStrategy = fieldNamingStrategy;
        this.instanceCreators = map;
        T6s.w6 w6Var = new T6s.w6(map, z10, list4);
        this.constructorConstructor = w6Var;
        this.serializeNulls = z2;
        this.complexMapKeySerialization = z3;
        this.generateNonExecutableJson = z4;
        this.htmlSafe = z5;
        this.prettyPrinting = z6;
        this.lenient = z7;
        this.serializeSpecialFloatingPointValues = z9;
        this.useJdkUnsafe = z10;
        this.longSerializationPolicy = c2;
        this.datePattern = str;
        this.dateStyle = i2;
        this.timeStyle = i3;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        this.objectToNumberStrategy = pl;
        this.numberToNumberStrategy = pl3;
        this.reflectionFilters = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f60966E);
        arrayList.add(ObjectTypeAdapter.O(pl));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.iF);
        arrayList.add(TypeAdapters.az);
        arrayList.add(TypeAdapters.Uo);
        arrayList.add(TypeAdapters.xMQ);
        arrayList.add(TypeAdapters.gh);
        Xo xoLongAdapter = longAdapter(c2);
        arrayList.add(TypeAdapters.t(Long.TYPE, Long.class, xoLongAdapter));
        arrayList.add(TypeAdapters.t(Double.TYPE, Double.class, doubleAdapter(z9)));
        arrayList.add(TypeAdapters.t(Float.TYPE, Float.class, floatAdapter(z9)));
        arrayList.add(NumberTypeAdapter.O(pl3));
        arrayList.add(TypeAdapters.HI);
        arrayList.add(TypeAdapters.Ik);
        arrayList.add(TypeAdapters.rl(AtomicLong.class, atomicLongAdapter(xoLongAdapter)));
        arrayList.add(TypeAdapters.rl(AtomicLongArray.class, atomicLongArrayAdapter(xoLongAdapter)));
        arrayList.add(TypeAdapters.f60978o);
        arrayList.add(TypeAdapters.aYN);
        arrayList.add(TypeAdapters.E2);
        arrayList.add(TypeAdapters.f60973X);
        arrayList.add(TypeAdapters.rl(BigDecimal.class, TypeAdapters.nY));
        arrayList.add(TypeAdapters.rl(BigInteger.class, TypeAdapters.f60976g));
        arrayList.add(TypeAdapters.rl(T6s.Wre.class, TypeAdapters.te));
        arrayList.add(TypeAdapters.f60968N);
        arrayList.add(TypeAdapters.s7N);
        arrayList.add(TypeAdapters.bzg);
        arrayList.add(TypeAdapters.jB);
        arrayList.add(TypeAdapters.p5);
        arrayList.add(TypeAdapters.f60981v);
        arrayList.add(TypeAdapters.nr);
        arrayList.add(DateTypeAdapter.rl);
        arrayList.add(TypeAdapters.P5);
        if (com.google.gson.internal.sql.j.f61015n) {
            arrayList.add(com.google.gson.internal.sql.j.f61014O);
            arrayList.add(com.google.gson.internal.sql.j.nr);
            arrayList.add(com.google.gson.internal.sql.j.J2);
        }
        arrayList.add(ArrayTypeAdapter.f60930t);
        arrayList.add(TypeAdapters.rl);
        arrayList.add(new CollectionTypeAdapterFactory(w6Var));
        arrayList.add(new MapTypeAdapterFactory(w6Var, z3));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(w6Var);
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f60967M);
        arrayList.add(new ReflectiveTypeAdapterFactory(w6Var, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.factories = Collections.unmodifiableList(arrayList);
    }

    public <T> T fromJson(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        return (T) T6s.aC.rl(cls).cast(fromJson(reader, TypeToken.get((Class) cls)));
    }

    public void toJson(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((com.google.gson.Wre) CN3.f60911n, appendable);
        }
    }

    public <T> T fromJson(Reader reader, Type type) throws JsonSyntaxException, JsonIOException {
        return (T) fromJson(reader, TypeToken.get(type));
    }

    public void toJson(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            toJson(obj, type, newJsonWriter(T6s.o.rl(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    public <T> T fromJson(Reader reader, TypeToken<T> typeToken) throws JsonSyntaxException, JsonIOException {
        JsonReader jsonReaderNewJsonReader = newJsonReader(reader);
        T t3 = (T) fromJson(jsonReaderNewJsonReader, typeToken);
        assertFullConsumption(t3, jsonReaderNewJsonReader);
        return t3;
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        Xo adapter = getAdapter(TypeToken.get(type));
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                adapter.nr(jsonWriter, obj);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
            }
        } finally {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) throws JsonSyntaxException, JsonIOException {
        return (T) fromJson(jsonReader, TypeToken.get(type));
    }

    public <T> T fromJson(JsonReader jsonReader, TypeToken<T> typeToken) throws JsonSyntaxException, JsonIOException {
        boolean zIsLenient = jsonReader.isLenient();
        boolean z2 = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z2 = false;
                    return (T) getAdapter(typeToken).rl(jsonReader);
                } catch (AssertionError e2) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
                } catch (IllegalStateException e3) {
                    throw new JsonSyntaxException(e3);
                }
            } catch (EOFException e4) {
                if (z2) {
                    jsonReader.setLenient(zIsLenient);
                    return null;
                }
                throw new JsonSyntaxException(e4);
            } catch (IOException e5) {
                throw new JsonSyntaxException(e5);
            }
        } finally {
            jsonReader.setLenient(zIsLenient);
        }
    }

    public <T> Xo getAdapter(Class<T> cls) {
        return getAdapter(TypeToken.get((Class) cls));
    }

    public <T> T fromJson(com.google.gson.Wre wre, Class<T> cls) throws JsonSyntaxException {
        return (T) T6s.aC.rl(cls).cast(fromJson(wre, TypeToken.get((Class) cls)));
    }

    public <T> T fromJson(com.google.gson.Wre wre, Type type) throws JsonSyntaxException {
        return (T) fromJson(wre, TypeToken.get(type));
    }

    public String toJson(com.google.gson.Wre wre) {
        StringWriter stringWriter = new StringWriter();
        toJson(wre, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public <T> T fromJson(com.google.gson.Wre wre, TypeToken<T> typeToken) throws JsonSyntaxException {
        if (wre == null) {
            return null;
        }
        return (T) fromJson(new com.google.gson.internal.bind.n(wre), typeToken);
    }

    public void toJson(com.google.gson.Wre wre, Appendable appendable) throws JsonIOException {
        try {
            toJson(wre, newJsonWriter(T6s.o.rl(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    public void toJson(com.google.gson.Wre wre, JsonWriter jsonWriter) throws JsonIOException {
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                T6s.o.n(wre, jsonWriter);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
            }
        } finally {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }
}
