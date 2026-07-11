package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class JsonWriter implements Closeable, Flushable {
    String indent;
    boolean lenient;
    boolean promoteValueToName;
    boolean serializeNulls;
    private Map<Class<?>, Object> tags;
    int stackSize = 0;
    int[] scopes = new int[32];
    String[] pathNames = new String[32];
    int[] pathIndices = new int[32];
    int flattenStackSize = -1;

    public abstract JsonWriter beginArray() throws IOException;

    public abstract JsonWriter beginObject() throws IOException;

    public abstract JsonWriter endArray() throws IOException;

    public abstract JsonWriter endObject() throws IOException;

    public abstract JsonWriter name(String str) throws IOException;

    public abstract JsonWriter nullValue() throws IOException;

    public abstract JsonWriter value(double d2) throws IOException;

    public abstract JsonWriter value(long j2) throws IOException;

    public abstract JsonWriter value(Boolean bool) throws IOException;

    public abstract JsonWriter value(Number number) throws IOException;

    public abstract JsonWriter value(String str) throws IOException;

    public final JsonWriter value(BufferedSource bufferedSource) throws IOException {
        if (this.promoteValueToName) {
            throw new IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + getPath());
        }
        BufferedSink bufferedSinkValueSink = valueSink();
        try {
            bufferedSource.readAll(bufferedSinkValueSink);
            if (bufferedSinkValueSink != null) {
                bufferedSinkValueSink.close();
            }
            return this;
        } catch (Throwable th) {
            if (bufferedSinkValueSink != null) {
                try {
                    bufferedSinkValueSink.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public abstract JsonWriter value(boolean z2) throws IOException;

    public abstract BufferedSink valueSink() throws IOException;

    public static JsonWriter of(BufferedSink bufferedSink) {
        return new JsonUtf8Writer(bufferedSink);
    }

    final boolean checkStack() {
        int i2 = this.stackSize;
        int[] iArr = this.scopes;
        if (i2 != iArr.length) {
            return false;
        }
        if (i2 == 256) {
            throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.pathNames;
        this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.pathIndices;
        this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof JsonValueWriter)) {
            return true;
        }
        JsonValueWriter jsonValueWriter = (JsonValueWriter) this;
        Object[] objArr = jsonValueWriter.stack;
        jsonValueWriter.stack = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    public final void endFlatten(int i2) {
        this.flattenStackSize = i2;
    }

    public final String getIndent() {
        String str = this.indent;
        return str != null ? str : "";
    }

    public final String getPath() {
        return JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    public final JsonWriter jsonValue(Object obj) throws IOException {
        if (obj instanceof Map) {
            beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : "Map keys must be of type String: " + key.getClass().getName());
                }
                name((String) key);
                jsonValue(entry.getValue());
            }
            endObject();
            return this;
        }
        if (obj instanceof List) {
            beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jsonValue(it.next());
            }
            endArray();
            return this;
        }
        if (obj instanceof String) {
            value((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            value(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Double) {
            value(((Double) obj).doubleValue());
            return this;
        }
        if (obj instanceof Long) {
            value(((Long) obj).longValue());
            return this;
        }
        if (obj instanceof Number) {
            value((Number) obj);
            return this;
        }
        if (obj == null) {
            nullValue();
            return this;
        }
        throw new IllegalArgumentException("Unsupported type: " + obj.getClass().getName());
    }

    final int peekScope() {
        int i2 = this.stackSize;
        if (i2 != 0) {
            return this.scopes[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    final void pushScope(int i2) {
        int[] iArr = this.scopes;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr[i3] = i2;
    }

    final void replaceTop(int i2) {
        this.scopes[this.stackSize - 1] = i2;
    }

    public final void setLenient(boolean z2) {
        this.lenient = z2;
    }

    public final void setSerializeNulls(boolean z2) {
        this.serializeNulls = z2;
    }

    public final <T> T tag(Class<T> cls) {
        Map<Class<?>, Object> map = this.tags;
        if (map == null) {
            return null;
        }
        return (T) map.get(cls);
    }

    JsonWriter() {
    }

    public final int beginFlatten() {
        int iPeekScope = peekScope();
        if (iPeekScope != 5 && iPeekScope != 3 && iPeekScope != 2 && iPeekScope != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i2 = this.flattenStackSize;
        this.flattenStackSize = this.stackSize;
        return i2;
    }

    public final void promoteValueToName() throws IOException {
        int iPeekScope = peekScope();
        if (iPeekScope != 5 && iPeekScope != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.promoteValueToName = true;
    }

    public void setIndent(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.indent = str;
    }

    public final <T> void setTag(Class<T> cls, T t3) {
        if (cls.isAssignableFrom(t3.getClass())) {
            if (this.tags == null) {
                this.tags = new LinkedHashMap();
            }
            this.tags.put(cls, t3);
        } else {
            throw new IllegalArgumentException("Tag value must be of type " + cls.getName());
        }
    }
}
