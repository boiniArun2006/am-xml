package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class xZD {
    private static final xZD INSTANCE = new xZD();
    private final ConcurrentMap<Class<?>, R6> schemaCache = new ConcurrentHashMap();
    private final RzR schemaFactory = new h();

    public <T> void mergeFrom(T t3, FKk fKk) throws IOException {
        mergeFrom(t3, fKk, QJ.getEmptyRegistry());
    }

    public <T> R6 schemaFor(Class<T> cls) {
        R6 r6RegisterSchema;
        nKK.checkNotNull(cls, "messageType");
        R6 r6CreateSchema = this.schemaCache.get(cls);
        return (r6CreateSchema != null || (r6RegisterSchema = registerSchema(cls, (r6CreateSchema = this.schemaFactory.createSchema(cls)))) == null) ? r6CreateSchema : r6RegisterSchema;
    }

    public static xZD getInstance() {
        return INSTANCE;
    }

    int getTotalSchemaSize() {
        int schemaSize = 0;
        for (R6 r6 : this.schemaCache.values()) {
            if (r6 instanceof l4Z) {
                schemaSize += ((l4Z) r6).getSchemaSize();
            }
        }
        return schemaSize;
    }

    public <T> void mergeFrom(T t3, FKk fKk, QJ qj) throws IOException {
        schemaFor(t3).mergeFrom(t3, fKk, qj);
    }

    public R6 registerSchema(Class<?> cls, R6 r6) {
        nKK.checkNotNull(cls, "messageType");
        nKK.checkNotNull(r6, "schema");
        return this.schemaCache.putIfAbsent(cls, r6);
    }

    public R6 registerSchemaOverride(Class<?> cls, R6 r6) {
        nKK.checkNotNull(cls, "messageType");
        nKK.checkNotNull(r6, "schema");
        return this.schemaCache.put(cls, r6);
    }

    private xZD() {
    }

    <T> boolean isInitialized(T t3) {
        return schemaFor(t3).isInitialized(t3);
    }

    public <T> void makeImmutable(T t3) {
        schemaFor(t3).makeImmutable(t3);
    }

    public <T> void writeTo(T t3, crp crpVar) throws IOException {
        schemaFor(t3).writeTo(t3, crpVar);
    }

    public <T> R6 schemaFor(T t3) {
        return schemaFor((Class) t3.getClass());
    }
}
