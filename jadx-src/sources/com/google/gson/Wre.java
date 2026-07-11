package com.google.gson;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Wre {
    public boolean J2() {
        return this instanceof CN3;
    }

    public boolean KN() {
        return this instanceof Dsr;
    }

    public boolean O() {
        return this instanceof Ml;
    }

    public boolean Uo() {
        return this instanceof fuX;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            T6s.o.n(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public Dsr nr() {
        if (KN()) {
            return (Dsr) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public Ml rl() {
        if (O()) {
            return (Ml) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public fuX t() {
        if (Uo()) {
            return (fuX) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }
}
