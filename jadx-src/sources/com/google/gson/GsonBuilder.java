package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.bind.j;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private Excluder excluder;
    private final List<eO> factories;
    private FieldNamingStrategy fieldNamingPolicy;
    private boolean generateNonExecutableJson;
    private final List<eO> hierarchyFactories;
    private final Map<Type, Object> instanceCreators;
    private boolean lenient;
    private C longSerializationPolicy;
    private Pl numberToNumberStrategy;
    private Pl objectToNumberStrategy;
    private boolean prettyPrinting;
    private final LinkedList<o> reflectionFilters;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private int timeStyle;
    private boolean useJdkUnsafe;

    public GsonBuilder() {
        this.excluder = Excluder.f60921Z;
        this.longSerializationPolicy = C.f60909n;
        this.fieldNamingPolicy = w6.f61029n;
        this.instanceCreators = new HashMap();
        this.factories = new ArrayList();
        this.hierarchyFactories = new ArrayList();
        this.serializeNulls = false;
        this.datePattern = Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        this.reflectionFilters = new LinkedList<>();
    }

    public GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public GsonBuilder disableJdkUnsafe() {
        this.useJdkUnsafe = false;
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }

    public GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public GsonBuilder setDateFormat(String str) {
        this.datePattern = str;
        return this;
    }

    public GsonBuilder setLenient() {
        this.lenient = true;
        return this;
    }

    public GsonBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    private void addTypeAdaptersForDate(String str, int i2, int i3, List<eO> list) {
        eO eOVarRl;
        eO eOVarRl2;
        boolean z2 = com.google.gson.internal.sql.j.f61015n;
        eO eOVarN = null;
        if (str != null && !str.trim().isEmpty()) {
            eOVarRl = j.n.rl.rl(str);
            if (z2) {
                eOVarN = com.google.gson.internal.sql.j.f61016t.rl(str);
                eOVarRl2 = com.google.gson.internal.sql.j.rl.rl(str);
            } else {
                eOVarRl2 = null;
            }
        } else {
            if (i2 == 2 || i3 == 2) {
                return;
            }
            eO eOVarN2 = j.n.rl.n(i2, i3);
            if (z2) {
                eOVarN = com.google.gson.internal.sql.j.f61016t.n(i2, i3);
                eO eOVarN3 = com.google.gson.internal.sql.j.rl.n(i2, i3);
                eOVarRl = eOVarN2;
                eOVarRl2 = eOVarN3;
            } else {
                eOVarRl = eOVarN2;
                eOVarRl2 = null;
            }
        }
        list.add(eOVarRl);
        if (z2) {
            list.add(eOVarN);
            list.add(eOVarRl2);
        }
    }

    public Gson create() {
        List<eO> arrayList = new ArrayList<>(this.factories.size() + this.hierarchyFactories.size() + 3);
        arrayList.addAll(this.factories);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.hierarchyFactories);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList);
        return new Gson(this.excluder, this.fieldNamingPolicy, new HashMap(this.instanceCreators), this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.lenient, this.serializeSpecialFloatingPointValues, this.useJdkUnsafe, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, new ArrayList(this.factories), new ArrayList(this.hierarchyFactories), arrayList, this.objectToNumberStrategy, this.numberToNumberStrategy, new ArrayList(this.reflectionFilters));
    }

    public GsonBuilder disableInnerClassSerialization() {
        this.excluder = this.excluder.t();
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.excluder = this.excluder.xMQ();
        return this;
    }

    public GsonBuilder setDateFormat(int i2) {
        this.dateStyle = i2;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder addDeserializationExclusionStrategy(j jVar) {
        Objects.requireNonNull(jVar);
        this.excluder = this.excluder.ck(jVar, false, true);
        return this;
    }

    public GsonBuilder addReflectionAccessFilter(o oVar) {
        Objects.requireNonNull(oVar);
        this.reflectionFilters.addFirst(oVar);
        return this;
    }

    public GsonBuilder addSerializationExclusionStrategy(j jVar) {
        Objects.requireNonNull(jVar);
        this.excluder = this.excluder.ck(jVar, true, false);
        return this;
    }

    public GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        Objects.requireNonNull(iArr);
        this.excluder = this.excluder.Ik(iArr);
        return this;
    }

    public GsonBuilder registerTypeAdapter(Type type, Object obj) {
        Objects.requireNonNull(type);
        T6s.j.n(obj instanceof Xo);
        if (obj instanceof Xo) {
            this.factories.add(TypeAdapters.n(TypeToken.get(type), (Xo) obj));
        }
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(eO eOVar) {
        Objects.requireNonNull(eOVar);
        this.factories.add(eOVar);
        return this;
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
        Objects.requireNonNull(cls);
        T6s.j.n(obj instanceof Xo);
        if (obj instanceof Xo) {
            this.factories.add(TypeAdapters.O(cls, (Xo) obj));
        }
        return this;
    }

    public GsonBuilder setExclusionStrategies(j... jVarArr) {
        Objects.requireNonNull(jVarArr);
        for (j jVar : jVarArr) {
            this.excluder = this.excluder.ck(null, true, true);
        }
        return this;
    }

    public GsonBuilder setFieldNamingPolicy(w6 w6Var) {
        return setFieldNamingStrategy(w6Var);
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
        Objects.requireNonNull(fieldNamingStrategy);
        this.fieldNamingPolicy = fieldNamingStrategy;
        return this;
    }

    public GsonBuilder setLongSerializationPolicy(C c2) {
        Objects.requireNonNull(c2);
        this.longSerializationPolicy = c2;
        return this;
    }

    public GsonBuilder setNumberToNumberStrategy(Pl pl) {
        Objects.requireNonNull(pl);
        this.numberToNumberStrategy = pl;
        return this;
    }

    public GsonBuilder setObjectToNumberStrategy(Pl pl) {
        Objects.requireNonNull(pl);
        this.objectToNumberStrategy = pl;
        return this;
    }

    public GsonBuilder setVersion(double d2) {
        if (!Double.isNaN(d2) && d2 >= 0.0d) {
            this.excluder = this.excluder.r(d2);
            return this;
        }
        throw new IllegalArgumentException("Invalid version: " + d2);
    }

    public GsonBuilder setDateFormat(int i2, int i3) {
        this.dateStyle = i2;
        this.timeStyle = i3;
        this.datePattern = null;
        return this;
    }

    GsonBuilder(Gson gson) {
        this.excluder = Excluder.f60921Z;
        this.longSerializationPolicy = C.f60909n;
        this.fieldNamingPolicy = w6.f61029n;
        HashMap map = new HashMap();
        this.instanceCreators = map;
        ArrayList arrayList = new ArrayList();
        this.factories = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.hierarchyFactories = arrayList2;
        this.serializeNulls = false;
        this.datePattern = Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        LinkedList<o> linkedList = new LinkedList<>();
        this.reflectionFilters = linkedList;
        this.excluder = gson.excluder;
        this.fieldNamingPolicy = gson.fieldNamingStrategy;
        map.putAll(gson.instanceCreators);
        this.serializeNulls = gson.serializeNulls;
        this.complexMapKeySerialization = gson.complexMapKeySerialization;
        this.generateNonExecutableJson = gson.generateNonExecutableJson;
        this.escapeHtmlChars = gson.htmlSafe;
        this.prettyPrinting = gson.prettyPrinting;
        this.lenient = gson.lenient;
        this.serializeSpecialFloatingPointValues = gson.serializeSpecialFloatingPointValues;
        this.longSerializationPolicy = gson.longSerializationPolicy;
        this.datePattern = gson.datePattern;
        this.dateStyle = gson.dateStyle;
        this.timeStyle = gson.timeStyle;
        arrayList.addAll(gson.builderFactories);
        arrayList2.addAll(gson.builderHierarchyFactories);
        this.useJdkUnsafe = gson.useJdkUnsafe;
        this.objectToNumberStrategy = gson.objectToNumberStrategy;
        this.numberToNumberStrategy = gson.numberToNumberStrategy;
        linkedList.addAll(gson.reflectionFilters);
    }
}
