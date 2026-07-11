package com.google.gson.internal.bind;

import T6s.fuX;
import com.google.gson.Gson;
import com.google.gson.Xo;
import com.google.gson.eO;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class CollectionTypeAdapterFactory implements eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final T6s.w6 f60932n;

    private static final class j extends Xo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Xo f60933n;
        private final fuX rl;

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Collection collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.f60933n.nr(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }

        public j(Gson gson, Type type, Xo xo, fuX fux) {
            this.f60933n = new I28(gson, xo, type);
            this.rl = fux;
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Collection rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection collection = (Collection) this.rl.n();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collection.add(this.f60933n.rl(jsonReader));
            }
            jsonReader.endArray();
            return collection;
        }
    }

    public CollectionTypeAdapterFactory(T6s.w6 w6Var) {
        this.f60932n = w6Var;
    }

    @Override // com.google.gson.eO
    public Xo n(Gson gson, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeKN = T6s.n.KN(type, rawType);
        return new j(gson, typeKN, gson.getAdapter(TypeToken.get(typeKN)), this.f60932n.rl(typeToken));
    }
}
