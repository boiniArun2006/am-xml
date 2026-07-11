package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.Xo;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.eO;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final T6s.w6 f60937n;

    public JsonAdapterAnnotationTypeAdapterFactory(T6s.w6 w6Var) {
        this.f60937n = w6Var;
    }

    @Override // com.google.gson.eO
    public Xo n(Gson gson, TypeToken typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return rl(this.f60937n, gson, typeToken, jsonAdapter);
    }

    Xo rl(T6s.w6 w6Var, Gson gson, TypeToken typeToken, JsonAdapter jsonAdapter) {
        Xo xoN;
        Object objN = w6Var.rl(TypeToken.get(jsonAdapter.value())).n();
        boolean zNullSafe = jsonAdapter.nullSafe();
        if (objN instanceof Xo) {
            xoN = (Xo) objN;
        } else if (objN instanceof eO) {
            xoN = ((eO) objN).n(gson, typeToken);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objN.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (xoN != null && zNullSafe) {
            return xoN.n();
        }
        return xoN;
    }
}
