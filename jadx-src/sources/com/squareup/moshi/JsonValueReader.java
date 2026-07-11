package com.squareup.moshi;

import com.caoccao.javet.values.primitive.V8ValueNull;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class JsonValueReader extends JsonReader {
    private static final Object JSON_READER_CLOSED = new Object();
    private Object[] stack;

    static final class JsonIterator implements Iterator<Object>, Cloneable {
        final Object[] array;
        final JsonReader.Token endToken;
        int next;

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public JsonIterator m195clone() {
            return new JsonIterator(this.endToken, this.array, this.next);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next < this.array.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.array;
            int i2 = this.next;
            this.next = i2 + 1;
            return objArr[i2];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        JsonIterator(JsonReader.Token token, Object[] objArr, int i2) {
            this.endToken = token;
            this.array = objArr;
            this.next = i2;
        }
    }

    JsonValueReader(Object obj) {
        int[] iArr = this.scopes;
        int i2 = this.stackSize;
        iArr[i2] = 7;
        Object[] objArr = new Object[32];
        this.stack = objArr;
        this.stackSize = i2 + 1;
        objArr[i2] = obj;
    }

    private void push(Object obj) {
        int i2 = this.stackSize;
        if (i2 == this.stack.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            int[] iArr = this.scopes;
            this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.pathNames;
            this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.pathIndices;
            this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.stack;
            this.stack = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.stack;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        objArr2[i3] = obj;
    }

    private void remove() {
        int i2 = this.stackSize;
        int i3 = i2 - 1;
        this.stackSize = i3;
        Object[] objArr = this.stack;
        objArr[i3] = null;
        this.scopes[i3] = 0;
        if (i3 > 0) {
            int[] iArr = this.pathIndices;
            int i5 = i2 - 2;
            iArr[i5] = iArr[i5] + 1;
            Object obj = objArr[i2 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    push(it.next());
                }
            }
        }
    }

    private <T> T require(Class<T> cls, JsonReader.Token token) throws IOException {
        int i2 = this.stackSize;
        Object obj = i2 != 0 ? this.stack[i2 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && token == JsonReader.Token.NULL) {
            return null;
        }
        if (obj == JSON_READER_CLOSED) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw typeMismatch(obj, token);
    }

    @Override // com.squareup.moshi.JsonReader
    public void beginArray() throws IOException {
        List list = (List) require(List.class, JsonReader.Token.BEGIN_ARRAY);
        JsonIterator jsonIterator = new JsonIterator(JsonReader.Token.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.stack;
        int i2 = this.stackSize;
        objArr[i2 - 1] = jsonIterator;
        this.scopes[i2 - 1] = 1;
        this.pathIndices[i2 - 1] = 0;
        if (jsonIterator.hasNext()) {
            push(jsonIterator.next());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void beginObject() throws IOException {
        Map map = (Map) require(Map.class, JsonReader.Token.BEGIN_OBJECT);
        JsonIterator jsonIterator = new JsonIterator(JsonReader.Token.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.stack;
        int i2 = this.stackSize;
        objArr[i2 - 1] = jsonIterator;
        this.scopes[i2 - 1] = 3;
        if (jsonIterator.hasNext()) {
            push(jsonIterator.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Arrays.fill(this.stack, 0, this.stackSize, (Object) null);
        this.stack[0] = JSON_READER_CLOSED;
        this.scopes[0] = 8;
        this.stackSize = 1;
    }

    @Override // com.squareup.moshi.JsonReader
    public void endArray() throws IOException {
        JsonReader.Token token = JsonReader.Token.END_ARRAY;
        JsonIterator jsonIterator = (JsonIterator) require(JsonIterator.class, token);
        if (jsonIterator.endToken != token || jsonIterator.hasNext()) {
            throw typeMismatch(jsonIterator, token);
        }
        remove();
    }

    @Override // com.squareup.moshi.JsonReader
    public void endObject() throws IOException {
        JsonReader.Token token = JsonReader.Token.END_OBJECT;
        JsonIterator jsonIterator = (JsonIterator) require(JsonIterator.class, token);
        if (jsonIterator.endToken != token || jsonIterator.hasNext()) {
            throw typeMismatch(jsonIterator, token);
        }
        this.pathNames[this.stackSize - 1] = null;
        remove();
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean hasNext() throws IOException {
        int i2 = this.stackSize;
        if (i2 == 0) {
            return false;
        }
        Object obj = this.stack[i2 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean nextBoolean() throws IOException {
        Boolean bool = (Boolean) require(Boolean.class, JsonReader.Token.BOOLEAN);
        remove();
        return bool.booleanValue();
    }

    @Override // com.squareup.moshi.JsonReader
    public double nextDouble() throws IOException {
        double dDoubleValue;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object objRequire = require(Object.class, token);
        if (objRequire instanceof Number) {
            dDoubleValue = ((Number) objRequire).doubleValue();
        } else {
            if (!(objRequire instanceof String)) {
                throw typeMismatch(objRequire, token);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objRequire);
            } catch (NumberFormatException unused) {
                throw typeMismatch(objRequire, JsonReader.Token.NUMBER);
            }
        }
        if (this.lenient || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            remove();
            return dDoubleValue;
        }
        throw new JsonEncodingException("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    public int nextInt() throws IOException {
        int iIntValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object objRequire = require(Object.class, token);
        if (objRequire instanceof Number) {
            iIntValueExact = ((Number) objRequire).intValue();
        } else {
            if (!(objRequire instanceof String)) {
                throw typeMismatch(objRequire, token);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objRequire);
                } catch (NumberFormatException unused) {
                    throw typeMismatch(objRequire, JsonReader.Token.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objRequire).intValueExact();
            }
        }
        remove();
        return iIntValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public long nextLong() throws IOException {
        long jLongValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object objRequire = require(Object.class, token);
        if (objRequire instanceof Number) {
            jLongValueExact = ((Number) objRequire).longValue();
        } else {
            if (!(objRequire instanceof String)) {
                throw typeMismatch(objRequire, token);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objRequire);
                } catch (NumberFormatException unused) {
                    throw typeMismatch(objRequire, JsonReader.Token.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objRequire).longValueExact();
            }
        }
        remove();
        return jLongValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextName() throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) require(Map.Entry.class, JsonReader.Token.NAME);
        String strStringKey = stringKey(entry);
        this.stack[this.stackSize - 1] = entry.getValue();
        this.pathNames[this.stackSize - 2] = strStringKey;
        return strStringKey;
    }

    @Override // com.squareup.moshi.JsonReader
    public <T> T nextNull() throws IOException {
        require(Void.class, JsonReader.Token.NULL);
        remove();
        return null;
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextString() throws IOException {
        int i2 = this.stackSize;
        Object obj = i2 != 0 ? this.stack[i2 - 1] : null;
        if (obj instanceof String) {
            remove();
            return (String) obj;
        }
        if (obj instanceof Number) {
            remove();
            return obj.toString();
        }
        if (obj == JSON_READER_CLOSED) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw typeMismatch(obj, JsonReader.Token.STRING);
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader.Token peek() throws IOException {
        int i2 = this.stackSize;
        if (i2 == 0) {
            return JsonReader.Token.END_DOCUMENT;
        }
        Object obj = this.stack[i2 - 1];
        if (obj instanceof JsonIterator) {
            return ((JsonIterator) obj).endToken;
        }
        if (obj instanceof List) {
            return JsonReader.Token.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return JsonReader.Token.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return JsonReader.Token.NAME;
        }
        if (obj instanceof String) {
            return JsonReader.Token.STRING;
        }
        if (obj instanceof Boolean) {
            return JsonReader.Token.BOOLEAN;
        }
        if (obj instanceof Number) {
            return JsonReader.Token.NUMBER;
        }
        if (obj == null) {
            return JsonReader.Token.NULL;
        }
        if (obj == JSON_READER_CLOSED) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw typeMismatch(obj, "a JSON value");
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader peekJson() {
        return new JsonValueReader(this);
    }

    @Override // com.squareup.moshi.JsonReader
    public int selectName(JsonReader.Options options) throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) require(Map.Entry.class, JsonReader.Token.NAME);
        String strStringKey = stringKey(entry);
        int length = options.strings.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (options.strings[i2].equals(strStringKey)) {
                this.stack[this.stackSize - 1] = entry.getValue();
                this.pathNames[this.stackSize - 2] = strStringKey;
                return i2;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public int selectString(JsonReader.Options options) throws IOException {
        int i2 = this.stackSize;
        Object obj = i2 != 0 ? this.stack[i2 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != JSON_READER_CLOSED) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = options.strings.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (options.strings[i3].equals(str)) {
                remove();
                return i3;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipName() throws IOException {
        if (!this.failOnUnknown) {
            this.stack[this.stackSize - 1] = ((Map.Entry) require(Map.Entry.class, JsonReader.Token.NAME)).getValue();
            this.pathNames[this.stackSize - 2] = V8ValueNull.NULL;
            return;
        }
        JsonReader.Token tokenPeek = peek();
        nextName();
        throw new JsonDataException("Cannot skip unexpected " + tokenPeek + " at " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipValue() throws IOException {
        if (this.failOnUnknown) {
            throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int i2 = this.stackSize;
        if (i2 > 1) {
            this.pathNames[i2 - 2] = V8ValueNull.NULL;
        }
        Object obj = i2 != 0 ? this.stack[i2 - 1] : null;
        if (obj instanceof JsonIterator) {
            throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.stack;
            objArr[i2 - 1] = ((Map.Entry) objArr[i2 - 1]).getValue();
        } else {
            if (i2 > 0) {
                remove();
                return;
            }
            throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
        }
    }

    private String stringKey(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw typeMismatch(key, JsonReader.Token.NAME);
    }

    @Override // com.squareup.moshi.JsonReader
    public BufferedSource nextSource() throws IOException {
        Object jsonValue = readJsonValue();
        Buffer buffer = new Buffer();
        JsonWriter jsonWriterOf = JsonWriter.of(buffer);
        try {
            jsonWriterOf.jsonValue(jsonValue);
            jsonWriterOf.close();
            return buffer;
        } catch (Throwable th) {
            if (jsonWriterOf != null) {
                try {
                    jsonWriterOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void promoteNameToValue() throws IOException {
        if (hasNext()) {
            push(nextName());
        }
    }

    JsonValueReader(JsonValueReader jsonValueReader) {
        super(jsonValueReader);
        this.stack = (Object[]) jsonValueReader.stack.clone();
        for (int i2 = 0; i2 < this.stackSize; i2++) {
            Object[] objArr = this.stack;
            Object obj = objArr[i2];
            if (obj instanceof JsonIterator) {
                objArr[i2] = ((JsonIterator) obj).m195clone();
            }
        }
    }
}
