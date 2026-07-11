package com.google.gson.internal.bind;

import com.google.gson.CN3;
import com.google.gson.Dsr;
import com.google.gson.Wre;
import com.google.gson.fuX;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 extends JsonWriter {
    private static final Writer J2 = new j();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Dsr f61007r = new Dsr("closed");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Wre f61008O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f61009n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f61010t;

    class j extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }

        j() {
        }
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        Uo(new Dsr(str));
        return this;
    }

    public w6() {
        super(J2);
        this.f61009n = new ArrayList();
        this.f61008O = CN3.f60911n;
    }

    private void Uo(Wre wre) {
        if (this.f61010t != null) {
            if (!wre.J2() || getSerializeNulls()) {
                ((fuX) rl()).xMQ(this.f61010t, wre);
            }
            this.f61010t = null;
            return;
        }
        if (this.f61009n.isEmpty()) {
            this.f61008O = wre;
            return;
        }
        Wre wreRl = rl();
        if (!(wreRl instanceof com.google.gson.Ml)) {
            throw new IllegalStateException();
        }
        ((com.google.gson.Ml) wreRl).xMQ(wre);
    }

    private Wre rl() {
        return (Wre) this.f61009n.get(r0.size() - 1);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() {
        com.google.gson.Ml ml = new com.google.gson.Ml();
        Uo(ml);
        this.f61009n.add(ml);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() {
        fuX fux = new fuX();
        Uo(fux);
        this.f61009n.add(fux);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f61009n.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f61009n.add(f61007r);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() {
        if (this.f61009n.isEmpty() || this.f61010t != null) {
            throw new IllegalStateException();
        }
        if (!(rl() instanceof com.google.gson.Ml)) {
            throw new IllegalStateException();
        }
        this.f61009n.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() {
        if (this.f61009n.isEmpty() || this.f61010t != null) {
            throw new IllegalStateException();
        }
        if (!(rl() instanceof fuX)) {
            throw new IllegalStateException();
        }
        this.f61009n.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) {
        throw new UnsupportedOperationException();
    }

    public Wre n() {
        if (this.f61009n.isEmpty()) {
            return this.f61008O;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f61009n);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f61009n.isEmpty() || this.f61010t != null) {
            throw new IllegalStateException();
        }
        if (!(rl() instanceof fuX)) {
            throw new IllegalStateException();
        }
        this.f61010t = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() {
        Uo(CN3.f60911n);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z2) {
        Uo(new Dsr(Boolean.valueOf(z2)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) {
        if (bool == null) {
            return nullValue();
        }
        Uo(new Dsr(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(float f3) {
        if (!isLenient() && (Float.isNaN(f3) || Float.isInfinite(f3))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f3);
        }
        Uo(new Dsr(Float.valueOf(f3)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d2) {
        if (!isLenient() && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d2);
        }
        Uo(new Dsr(Double.valueOf(d2)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j2) {
        Uo(new Dsr(Long.valueOf(j2)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        Uo(new Dsr(number));
        return this;
    }
}
