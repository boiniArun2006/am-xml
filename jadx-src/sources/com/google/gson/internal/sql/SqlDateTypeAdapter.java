package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Xo;
import com.google.gson.eO;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class SqlDateTypeAdapter extends Xo {
    static final eO rl = new eO() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.eO
        public Xo n(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() != Date.class) {
                return null;
            }
            return new SqlDateTypeAdapter();
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DateFormat f61011n;

    private SqlDateTypeAdapter() {
        this.f61011n = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.Xo
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public void nr(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.f61011n.format((java.util.Date) date);
        }
        jsonWriter.value(str);
    }

    @Override // com.google.gson.Xo
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public Date rl(JsonReader jsonReader) throws IOException {
        java.util.Date date;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        try {
            synchronized (this) {
                date = this.f61011n.parse(strNextString);
            }
            return new Date(date.getTime());
        } catch (ParseException e2) {
            throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as SQL Date; at path " + jsonReader.getPreviousPath(), e2);
        }
    }
}
