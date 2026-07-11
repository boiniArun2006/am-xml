package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Xo {

    class j extends Xo {
        j() {
        }

        @Override // com.google.gson.Xo
        public void nr(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
            } else {
                Xo.this.nr(jsonWriter, obj);
            }
        }

        @Override // com.google.gson.Xo
        public Object rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Xo.this.rl(jsonReader);
        }
    }

    public abstract void nr(JsonWriter jsonWriter, Object obj);

    public abstract Object rl(JsonReader jsonReader);

    public final Xo n() {
        return new j();
    }

    public final Wre t(Object obj) {
        try {
            com.google.gson.internal.bind.w6 w6Var = new com.google.gson.internal.bind.w6();
            nr(w6Var, obj);
            return w6Var.n();
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }
}
