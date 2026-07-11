package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.Xo;
import com.google.gson.eO;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class SqlTimestampTypeAdapter extends Xo {
    static final eO rl = new eO() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.eO
        public Xo n(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            return new SqlTimestampTypeAdapter(gson.getAdapter(Date.class));
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Xo f61013n;

    private SqlTimestampTypeAdapter(Xo xo) {
        this.f61013n = xo;
    }

    @Override // com.google.gson.Xo
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public void nr(JsonWriter jsonWriter, Timestamp timestamp) {
        this.f61013n.nr(jsonWriter, timestamp);
    }

    @Override // com.google.gson.Xo
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public Timestamp rl(JsonReader jsonReader) {
        Date date = (Date) this.f61013n.rl(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }
}
