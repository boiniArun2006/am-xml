package com.squareup.moshi;

import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueDouble;
import com.caoccao.javet.values.primitive.V8ValueNull;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class JsonUtf8Writer extends JsonWriter {
    private static final String[] REPLACEMENT_CHARS = new String[128];
    private String deferredName;
    private String separator = ":";
    private final BufferedSink sink;

    private JsonWriter close(int i2, int i3, char c2) throws IOException {
        int iPeekScope = peekScope();
        if (iPeekScope != i3 && iPeekScope != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.deferredName != null) {
            throw new IllegalStateException("Dangling name: " + this.deferredName);
        }
        int i5 = this.stackSize;
        int i7 = this.flattenStackSize;
        if (i5 == (~i7)) {
            this.flattenStackSize = ~i7;
            return this;
        }
        int i8 = i5 - 1;
        this.stackSize = i8;
        this.pathNames[i8] = null;
        int[] iArr = this.pathIndices;
        int i9 = i5 - 2;
        iArr[i9] = iArr[i9] + 1;
        if (iPeekScope == i3) {
            newline();
        }
        this.sink.writeByte(c2);
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endArray() throws IOException {
        return close(1, 2, ']');
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endObject() throws IOException {
        this.promoteValueToName = false;
        return close(3, 5, '}');
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(str);
        }
        writeDeferredName();
        beforeValue();
        string(this.sink, str);
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            REPLACEMENT_CHARS[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    private void newline() throws IOException {
        if (this.indent == null) {
            return;
        }
        this.sink.writeByte(10);
        int i2 = this.stackSize;
        for (int i3 = 1; i3 < i2; i3++) {
            this.sink.writeUtf8(this.indent);
        }
    }

    private JsonWriter open(int i2, int i3, char c2) throws IOException {
        int i5 = this.stackSize;
        int i7 = this.flattenStackSize;
        if (i5 == i7) {
            int[] iArr = this.scopes;
            if (iArr[i5 - 1] == i2 || iArr[i5 - 1] == i3) {
                this.flattenStackSize = ~i7;
                return this;
            }
        }
        beforeValue();
        checkStack();
        pushScope(i2);
        this.pathIndices[this.stackSize - 1] = 0;
        this.sink.writeByte(c2);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void string(BufferedSink bufferedSink, String str) throws IOException {
        String str2;
        String[] strArr = REPLACEMENT_CHARS;
        bufferedSink.writeByte(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i2 < i3) {
                        bufferedSink.writeUtf8(str, i2, i3);
                    }
                    bufferedSink.writeUtf8(str2);
                    i2 = i3 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i3) {
                }
                bufferedSink.writeUtf8(str2);
                i2 = i3 + 1;
            }
        }
        if (i2 < length) {
            bufferedSink.writeUtf8(str, i2, length);
        }
        bufferedSink.writeByte(34);
    }

    private void writeDeferredName() throws IOException {
        if (this.deferredName != null) {
            beforeName();
            string(this.sink, this.deferredName);
            this.deferredName = null;
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginArray() throws IOException {
        if (!this.promoteValueToName) {
            writeDeferredName();
            return open(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginObject() throws IOException {
        if (!this.promoteValueToName) {
            writeDeferredName();
            return open(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.sink.flush();
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter name(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iPeekScope = peekScope();
        if ((iPeekScope != 3 && iPeekScope != 5) || this.deferredName != null || this.promoteValueToName) {
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
        if (this.deferredName != null) {
            if (!this.serializeNulls) {
                this.deferredName = null;
                return this;
            }
            writeDeferredName();
        }
        beforeValue();
        this.sink.writeUtf8(V8ValueNull.NULL);
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public BufferedSink valueSink() throws IOException {
        if (this.promoteValueToName) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
        }
        writeDeferredName();
        beforeValue();
        pushScope(9);
        return Okio.buffer(new Sink() { // from class: com.squareup.moshi.JsonUtf8Writer.1
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (JsonUtf8Writer.this.peekScope() != 9) {
                    throw new AssertionError();
                }
                JsonUtf8Writer jsonUtf8Writer = JsonUtf8Writer.this;
                int i2 = jsonUtf8Writer.stackSize;
                jsonUtf8Writer.stackSize = i2 - 1;
                int[] iArr = jsonUtf8Writer.pathIndices;
                int i3 = i2 - 2;
                iArr[i3] = iArr[i3] + 1;
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() throws IOException {
                JsonUtf8Writer.this.sink.flush();
            }

            @Override // okio.Sink
            /* JADX INFO: renamed from: timeout */
            public Timeout getTimeout() {
                return Timeout.NONE;
            }

            @Override // okio.Sink
            public void write(Buffer buffer, long j2) throws IOException {
                JsonUtf8Writer.this.sink.write(buffer, j2);
            }
        });
    }

    JsonUtf8Writer(BufferedSink bufferedSink) {
        if (bufferedSink != null) {
            this.sink = bufferedSink;
            pushScope(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    private void beforeName() throws IOException {
        int iPeekScope = peekScope();
        if (iPeekScope == 5) {
            this.sink.writeByte(44);
        } else if (iPeekScope != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() throws IOException {
        int iPeekScope = peekScope();
        int i2 = 2;
        if (iPeekScope != 1) {
            if (iPeekScope != 2) {
                if (iPeekScope != 4) {
                    if (iPeekScope != 9) {
                        i2 = 7;
                        if (iPeekScope != 6) {
                            if (iPeekScope == 7) {
                                if (!this.lenient) {
                                    throw new IllegalStateException("JSON must have only one top-level value.");
                                }
                            } else {
                                throw new IllegalStateException("Nesting problem.");
                            }
                        }
                    } else {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                } else {
                    this.sink.writeUtf8(this.separator);
                    i2 = 5;
                }
            } else {
                this.sink.writeByte(44);
                newline();
            }
        } else {
            newline();
        }
        replaceTop(i2);
    }

    @Override // com.squareup.moshi.JsonWriter
    public void setIndent(String str) {
        String str2;
        super.setIndent(str);
        if (!str.isEmpty()) {
            str2 = ": ";
        } else {
            str2 = ":";
        }
        this.separator = str2;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(boolean z2) throws IOException {
        if (!this.promoteValueToName) {
            writeDeferredName();
            beforeValue();
            this.sink.writeUtf8(z2 ? "true" : V8ValueBoolean.FALSE);
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.sink.close();
        int i2 = this.stackSize;
        if (i2 <= 1 && (i2 != 1 || this.scopes[i2 - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        return value(bool.booleanValue());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(double d2) throws IOException {
        if (!this.lenient && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(Double.toString(d2));
        }
        writeDeferredName();
        beforeValue();
        this.sink.writeUtf8(Double.toString(d2));
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
        writeDeferredName();
        beforeValue();
        this.sink.writeUtf8(Long.toString(j2));
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        String string = number.toString();
        if (!this.lenient && (string.equals("-Infinity") || string.equals(V8ValueDouble.INFINITY) || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(string);
        }
        writeDeferredName();
        beforeValue();
        this.sink.writeUtf8(string);
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }
}
