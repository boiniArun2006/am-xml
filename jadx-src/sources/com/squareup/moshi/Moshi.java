package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Moshi {
    static final List<JsonAdapter.Factory> BUILT_IN_FACTORIES;
    private final List<JsonAdapter.Factory> factories;
    private final int lastOffset;
    private final ThreadLocal<LookupChain> lookupChainThreadLocal = new ThreadLocal<>();
    private final Map<Object, JsonAdapter<?>> adapterCache = new LinkedHashMap();

    public static final class Builder {
        final List<JsonAdapter.Factory> factories = new ArrayList();
        int lastOffset = 0;

        public <T> Builder add(Type type, JsonAdapter<T> jsonAdapter) {
            return add(Moshi.newAdapterFactory(type, jsonAdapter));
        }

        public <T> Builder addLast(Type type, JsonAdapter<T> jsonAdapter) {
            return addLast(Moshi.newAdapterFactory(type, jsonAdapter));
        }

        public <T> Builder add(Type type, Class<? extends Annotation> cls, JsonAdapter<T> jsonAdapter) {
            return add(Moshi.newAdapterFactory(type, cls, jsonAdapter));
        }

        public <T> Builder addLast(Type type, Class<? extends Annotation> cls, JsonAdapter<T> jsonAdapter) {
            return addLast(Moshi.newAdapterFactory(type, cls, jsonAdapter));
        }

        public Moshi build() {
            return new Moshi(this);
        }

        public Builder add(JsonAdapter.Factory factory) {
            if (factory != null) {
                List<JsonAdapter.Factory> list = this.factories;
                int i2 = this.lastOffset;
                this.lastOffset = i2 + 1;
                list.add(i2, factory);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        public Builder addLast(JsonAdapter.Factory factory) {
            if (factory != null) {
                this.factories.add(factory);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        public Builder add(Object obj) {
            if (obj != null) {
                return add((JsonAdapter.Factory) AdapterMethodsFactory.get(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        public Builder addLast(Object obj) {
            if (obj != null) {
                return addLast((JsonAdapter.Factory) AdapterMethodsFactory.get(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }
    }

    static final class Lookup<T> extends JsonAdapter<T> {
        JsonAdapter<T> adapter;
        final Object cacheKey;
        final String fieldName;
        final Type type;

        @Override // com.squareup.moshi.JsonAdapter
        public T fromJson(JsonReader jsonReader) throws IOException {
            JsonAdapter<T> jsonAdapter = this.adapter;
            if (jsonAdapter != null) {
                return jsonAdapter.fromJson(jsonReader);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, T t3) throws IOException {
            JsonAdapter<T> jsonAdapter = this.adapter;
            if (jsonAdapter == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            jsonAdapter.toJson(jsonWriter, t3);
        }

        public String toString() {
            JsonAdapter<T> jsonAdapter = this.adapter;
            return jsonAdapter != null ? jsonAdapter.toString() : super.toString();
        }

        Lookup(Type type, String str, Object obj) {
            this.type = type;
            this.fieldName = str;
            this.cacheKey = obj;
        }
    }

    final class LookupChain {
        boolean exceptionAnnotated;
        final List<Lookup<?>> callLookups = new ArrayList();
        final Deque<Lookup<?>> stack = new ArrayDeque();

        LookupChain() {
        }

        <T> void adapterFound(JsonAdapter<T> jsonAdapter) {
            this.stack.getLast().adapter = jsonAdapter;
        }

        IllegalArgumentException exceptionWithLookupStack(IllegalArgumentException illegalArgumentException) {
            if (!this.exceptionAnnotated) {
                this.exceptionAnnotated = true;
                if (this.stack.size() != 1 || this.stack.getFirst().fieldName != null) {
                    StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator<Lookup<?>> itDescendingIterator = this.stack.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        Lookup<?> next = itDescendingIterator.next();
                        sb.append("\nfor ");
                        sb.append(next.type);
                        if (next.fieldName != null) {
                            sb.append(' ');
                            sb.append(next.fieldName);
                        }
                    }
                    return new IllegalArgumentException(sb.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        void pop(boolean z2) {
            this.stack.removeLast();
            if (this.stack.isEmpty()) {
                Moshi.this.lookupChainThreadLocal.remove();
                if (z2) {
                    synchronized (Moshi.this.adapterCache) {
                        try {
                            int size = this.callLookups.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                Lookup<?> lookup = this.callLookups.get(i2);
                                JsonAdapter<T> jsonAdapter = (JsonAdapter) Moshi.this.adapterCache.put(lookup.cacheKey, lookup.adapter);
                                if (jsonAdapter != 0) {
                                    lookup.adapter = jsonAdapter;
                                    Moshi.this.adapterCache.put(lookup.cacheKey, jsonAdapter);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }

        <T> JsonAdapter<T> push(Type type, String str, Object obj) {
            int size = this.callLookups.size();
            for (int i2 = 0; i2 < size; i2++) {
                Lookup<?> lookup = this.callLookups.get(i2);
                if (lookup.cacheKey.equals(obj)) {
                    this.stack.add(lookup);
                    JsonAdapter<T> jsonAdapter = (JsonAdapter<T>) lookup.adapter;
                    return jsonAdapter != null ? jsonAdapter : lookup;
                }
            }
            Lookup<?> lookup2 = new Lookup<>(type, str, obj);
            this.callLookups.add(lookup2);
            this.stack.add(lookup2);
            return null;
        }
    }

    static <T> JsonAdapter.Factory newAdapterFactory(final Type type, final JsonAdapter<T> jsonAdapter) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (jsonAdapter != null) {
            return new JsonAdapter.Factory() { // from class: com.squareup.moshi.Moshi.1
                @Override // com.squareup.moshi.JsonAdapter.Factory
                public JsonAdapter<?> create(Type type2, Set<? extends Annotation> set, Moshi moshi) {
                    if (set.isEmpty() && Util.typesMatch(type, type2)) {
                        return jsonAdapter;
                    }
                    return null;
                }
            };
        }
        throw new IllegalArgumentException("jsonAdapter == null");
    }

    public <T> JsonAdapter<T> adapter(Type type) {
        return adapter(type, Util.NO_ANNOTATIONS);
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        BUILT_IN_FACTORIES = arrayList;
        arrayList.add(StandardJsonAdapters.FACTORY);
        arrayList.add(CollectionJsonAdapter.FACTORY);
        arrayList.add(MapJsonAdapter.FACTORY);
        arrayList.add(ArrayJsonAdapter.FACTORY);
        arrayList.add(RecordJsonAdapter.FACTORY);
        arrayList.add(ClassJsonAdapter.FACTORY);
    }

    public <T> JsonAdapter<T> adapter(Class<T> cls) {
        return adapter(cls, Util.NO_ANNOTATIONS);
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        int i2 = this.lastOffset;
        for (int i3 = 0; i3 < i2; i3++) {
            builder.add(this.factories.get(i3));
        }
        int size = this.factories.size() - BUILT_IN_FACTORIES.size();
        for (int i5 = this.lastOffset; i5 < size; i5++) {
            builder.addLast(this.factories.get(i5));
        }
        return builder;
    }

    public <T> JsonAdapter<T> nextAdapter(JsonAdapter.Factory factory, Type type, Set<? extends Annotation> set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeRemoveSubtypeWildcard = Util.removeSubtypeWildcard(Util.canonicalize(type));
        int iIndexOf = this.factories.indexOf(factory);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + factory);
        }
        int size = this.factories.size();
        for (int i2 = iIndexOf + 1; i2 < size; i2++) {
            JsonAdapter<T> jsonAdapter = (JsonAdapter<T>) this.factories.get(i2).create(typeRemoveSubtypeWildcard, set, this);
            if (jsonAdapter != null) {
                return jsonAdapter;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + Util.typeAnnotatedWithAnnotations(typeRemoveSubtypeWildcard, set));
    }

    Moshi(Builder builder) {
        int size = builder.factories.size();
        List<JsonAdapter.Factory> list = BUILT_IN_FACTORIES;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(builder.factories);
        arrayList.addAll(list);
        this.factories = Collections.unmodifiableList(arrayList);
        this.lastOffset = builder.lastOffset;
    }

    private Object cacheKey(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(type, set);
    }

    public <T> JsonAdapter<T> adapter(Type type, Class<? extends Annotation> cls) {
        if (cls != null) {
            return adapter(type, Collections.singleton(Types.createJsonQualifierImplementation(cls)));
        }
        throw new NullPointerException("annotationType == null");
    }

    static <T> JsonAdapter.Factory newAdapterFactory(final Type type, final Class<? extends Annotation> cls, final JsonAdapter<T> jsonAdapter) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (cls == null) {
            throw new IllegalArgumentException("annotation == null");
        }
        if (jsonAdapter != null) {
            if (cls.isAnnotationPresent(JsonQualifier.class)) {
                if (cls.getDeclaredMethods().length <= 0) {
                    return new JsonAdapter.Factory() { // from class: com.squareup.moshi.Moshi.2
                        @Override // com.squareup.moshi.JsonAdapter.Factory
                        public JsonAdapter<?> create(Type type2, Set<? extends Annotation> set, Moshi moshi) {
                            if (Util.typesMatch(type, type2) && set.size() == 1 && Util.isAnnotationPresent(set, cls)) {
                                return jsonAdapter;
                            }
                            return null;
                        }
                    };
                }
                throw new IllegalArgumentException("Use JsonAdapter.Factory for annotations with elements");
            }
            throw new IllegalArgumentException(cls + " does not have @JsonQualifier");
        }
        throw new IllegalArgumentException("jsonAdapter == null");
    }

    public <T> JsonAdapter<T> adapter(Type type, Class<? extends Annotation>... clsArr) {
        if (clsArr.length == 1) {
            return adapter(type, clsArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(clsArr.length);
        for (Class<? extends Annotation> cls : clsArr) {
            linkedHashSet.add(Types.createJsonQualifierImplementation(cls));
        }
        return adapter(type, Collections.unmodifiableSet(linkedHashSet));
    }

    public <T> JsonAdapter<T> adapter(Type type, Set<? extends Annotation> set) {
        return adapter(type, set, null);
    }

    public <T> JsonAdapter<T> adapter(Type type, Set<? extends Annotation> set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set != null) {
            Type typeRemoveSubtypeWildcard = Util.removeSubtypeWildcard(Util.canonicalize(type));
            Object objCacheKey = cacheKey(typeRemoveSubtypeWildcard, set);
            synchronized (this.adapterCache) {
                try {
                    JsonAdapter<T> jsonAdapter = (JsonAdapter) this.adapterCache.get(objCacheKey);
                    if (jsonAdapter != null) {
                        return jsonAdapter;
                    }
                    LookupChain lookupChain = this.lookupChainThreadLocal.get();
                    if (lookupChain == null) {
                        lookupChain = new LookupChain();
                        this.lookupChainThreadLocal.set(lookupChain);
                    }
                    JsonAdapter<T> jsonAdapterPush = lookupChain.push(typeRemoveSubtypeWildcard, str, objCacheKey);
                    try {
                        if (jsonAdapterPush != null) {
                            return jsonAdapterPush;
                        }
                        try {
                            int size = this.factories.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                JsonAdapter<T> jsonAdapter2 = (JsonAdapter<T>) this.factories.get(i2).create(typeRemoveSubtypeWildcard, set, this);
                                if (jsonAdapter2 != null) {
                                    lookupChain.adapterFound(jsonAdapter2);
                                    lookupChain.pop(true);
                                    return jsonAdapter2;
                                }
                            }
                            throw new IllegalArgumentException("No JsonAdapter for " + Util.typeAnnotatedWithAnnotations(typeRemoveSubtypeWildcard, set));
                        } catch (IllegalArgumentException e2) {
                            throw lookupChain.exceptionWithLookupStack(e2);
                        }
                    } finally {
                        lookupChain.pop(false);
                    }
                } finally {
                }
            }
        }
        throw new NullPointerException("annotations == null");
    }
}
