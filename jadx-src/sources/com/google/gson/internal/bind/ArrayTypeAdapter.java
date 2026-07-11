package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.Xo;
import com.google.gson.eO;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class ArrayTypeAdapter extends Xo {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final eO f60930t = new eO() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.eO
        public Xo n(Gson gson, TypeToken typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type typeUo = T6s.n.Uo(type);
            return new ArrayTypeAdapter(gson, gson.getAdapter(TypeToken.get(typeUo)), T6s.n.gh(typeUo));
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f60931n;
    private final Xo rl;

    @Override // com.google.gson.Xo
    public void nr(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.rl.nr(jsonWriter, Array.get(obj, i2));
        }
        jsonWriter.endArray();
    }

    public ArrayTypeAdapter(Gson gson, Xo xo, Class cls) {
        this.rl = new I28(gson, xo, cls);
        this.f60931n = cls;
    }

    @Override // com.google.gson.Xo
    public Object rl(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.rl.rl(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        if (this.f60931n.isPrimitive()) {
            Object objNewInstance = Array.newInstance((Class<?>) this.f60931n, size);
            for (int i2 = 0; i2 < size; i2++) {
                Array.set(objNewInstance, i2, arrayList.get(i2));
            }
            return objNewInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f60931n, size));
    }
}
