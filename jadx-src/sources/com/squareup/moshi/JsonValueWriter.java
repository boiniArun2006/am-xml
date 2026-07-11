package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class JsonValueWriter extends JsonWriter {
    private String deferredName;
    Object[] stack = new Object[32];

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(str);
        }
        add(str);
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginArray() throws IOException {
        if (this.promoteValueToName) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
        }
        int i2 = this.stackSize;
        int i3 = this.flattenStackSize;
        if (i2 == i3 && this.scopes[i2 - 1] == 1) {
            this.flattenStackSize = ~i3;
            return this;
        }
        checkStack();
        ArrayList arrayList = new ArrayList();
        add(arrayList);
        Object[] objArr = this.stack;
        int i5 = this.stackSize;
        objArr[i5] = arrayList;
        this.pathIndices[i5] = 0;
        pushScope(1);
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginObject() throws IOException {
        if (this.promoteValueToName) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
        }
        int i2 = this.stackSize;
        int i3 = this.flattenStackSize;
        if (i2 == i3 && this.scopes[i2 - 1] == 3) {
            this.flattenStackSize = ~i3;
            return this;
        }
        checkStack();
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        add(linkedHashTreeMap);
        this.stack[this.stackSize] = linkedHashTreeMap;
        pushScope(3);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i2 = this.stackSize;
        if (i2 > 1 || (i2 == 1 && this.scopes[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter name(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (peekScope() != 3 || this.deferredName != null || this.promoteValueToName) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.deferredName = str;
        this.pathNames[this.stackSize - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter nullValue() throws IOException {
        if (this.promoteValueToName) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        add(null);
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    public Object root() {
        int i2 = this.stackSize;
        if (i2 > 1 || (i2 == 1 && this.scopes[i2 - 1] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.stack[0];
    }

    @Override // com.squareup.moshi.JsonWriter
    public BufferedSink valueSink() {
        if (this.promoteValueToName) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
        }
        if (peekScope() == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        pushScope(9);
        final Buffer buffer = new Buffer();
        return Okio.buffer(new ForwardingSink(buffer) { // from class: com.squareup.moshi.JsonValueWriter.1
            @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (JsonValueWriter.this.peekScope() == 9) {
                    JsonValueWriter jsonValueWriter = JsonValueWriter.this;
                    Object[] objArr = jsonValueWriter.stack;
                    int i2 = jsonValueWriter.stackSize;
                    if (objArr[i2] == null) {
                        jsonValueWriter.stackSize = i2 - 1;
                        Object jsonValue = JsonReader.of(buffer).readJsonValue();
                        JsonValueWriter jsonValueWriter2 = JsonValueWriter.this;
                        boolean z2 = jsonValueWriter2.serializeNulls;
                        jsonValueWriter2.serializeNulls = true;
                        try {
                            jsonValueWriter2.add(jsonValue);
                            JsonValueWriter jsonValueWriter3 = JsonValueWriter.this;
                            jsonValueWriter3.serializeNulls = z2;
                            int[] iArr = jsonValueWriter3.pathIndices;
                            int i3 = jsonValueWriter3.stackSize - 1;
                            iArr[i3] = iArr[i3] + 1;
                            return;
                        } catch (Throwable th) {
                            JsonValueWriter.this.serializeNulls = z2;
                            throw th;
                        }
                    }
                }
                throw new AssertionError();
            }
        });
    }

    JsonValueWriter() {
        pushScope(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JsonValueWriter add(Object obj) {
        String str;
        Object objPut;
        int iPeekScope = peekScope();
        int i2 = this.stackSize;
        if (i2 == 1) {
            if (iPeekScope == 6) {
                this.scopes[i2 - 1] = 7;
                this.stack[i2 - 1] = obj;
                return this;
            }
            throw new IllegalStateException("JSON must have only one top-level value.");
        }
        if (iPeekScope == 3 && (str = this.deferredName) != null) {
            if ((obj == null && !this.serializeNulls) || (objPut = ((Map) this.stack[i2 - 1]).put(str, obj)) == null) {
                this.deferredName = null;
                return this;
            }
            throw new IllegalArgumentException("Map key '" + this.deferredName + "' has multiple values at path " + getPath() + ": " + objPut + " and " + obj);
        }
        if (iPeekScope == 1) {
            ((List) this.stack[i2 - 1]).add(obj);
            return this;
        }
        if (iPeekScope == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (peekScope() == 1) {
            int i2 = this.stackSize;
            int i3 = this.flattenStackSize;
            if (i2 == (~i3)) {
                this.flattenStackSize = ~i3;
                return this;
            }
            int i5 = i2 - 1;
            this.stackSize = i5;
            this.stack[i5] = null;
            int[] iArr = this.pathIndices;
            int i7 = i2 - 2;
            iArr[i7] = iArr[i7] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (peekScope() == 3) {
            if (this.deferredName == null) {
                int i2 = this.stackSize;
                int i3 = this.flattenStackSize;
                if (i2 == (~i3)) {
                    this.flattenStackSize = ~i3;
                    return this;
                }
                this.promoteValueToName = false;
                int i5 = i2 - 1;
                this.stackSize = i5;
                this.stack[i5] = null;
                this.pathNames[i5] = null;
                int[] iArr = this.pathIndices;
                int i7 = i2 - 2;
                iArr[i7] = iArr[i7] + 1;
                return this;
            }
            throw new IllegalStateException("Dangling name: " + this.deferredName);
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(boolean z2) throws IOException {
        if (!this.promoteValueToName) {
            add(Boolean.valueOf(z2));
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (!this.promoteValueToName) {
            add(bool);
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(double d2) throws IOException {
        if (!this.lenient && (Double.isNaN(d2) || d2 == Double.NEGATIVE_INFINITY || d2 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(Double.toString(d2));
        }
        add(Double.valueOf(d2));
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(long j2) throws IOException {
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(Long.toString(j2));
        }
        add(Long.valueOf(j2));
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (!(number instanceof Byte) && !(number instanceof Short) && !(number instanceof Integer) && !(number instanceof Long)) {
            if ((number instanceof Float) || (number instanceof Double)) {
                return value(number.doubleValue());
            }
            if (number == null) {
                return nullValue();
            }
            BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
            if (this.promoteValueToName) {
                this.promoteValueToName = false;
                return name(bigDecimal.toString());
            }
            add(bigDecimal);
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        return value(number.longValue());
    }
}
