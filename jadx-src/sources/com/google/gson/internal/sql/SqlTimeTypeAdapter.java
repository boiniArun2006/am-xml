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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class SqlTimeTypeAdapter extends Xo {
    static final eO rl = new eO() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.eO
        public Xo n(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() != Time.class) {
                return null;
            }
            return new SqlTimeTypeAdapter();
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DateFormat f61012n;

    private SqlTimeTypeAdapter() {
        this.f61012n = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.Xo
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public void nr(JsonWriter jsonWriter, Time time) throws IOException {
        String str;
        if (time == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.f61012n.format((Date) time);
        }
        jsonWriter.value(str);
    }

    @Override // com.google.gson.Xo
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public Time rl(JsonReader jsonReader) throws IOException {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        try {
            synchronized (this) {
                time = new Time(this.f61012n.parse(strNextString).getTime());
            }
            return time;
        } catch (ParseException e2) {
            throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as SQL Time; at path " + jsonReader.getPreviousPath(), e2);
        }
    }
}
