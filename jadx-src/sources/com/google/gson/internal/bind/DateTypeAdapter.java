package com.google.gson.internal.bind;

import T6s.Dsr;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Xo;
import com.google.gson.eO;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class DateTypeAdapter extends Xo {
    public static final eO rl = new eO() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.eO
        public Xo n(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f60934n;

    @Override // com.google.gson.Xo
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public void nr(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f60934n.get(0);
        synchronized (this.f60934n) {
            str = dateFormat.format(date);
        }
        jsonWriter.value(str);
    }

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f60934n = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (T6s.Ml.nr()) {
            arrayList.add(Dsr.t(2, 2));
        }
    }

    private Date O(JsonReader jsonReader) throws IOException {
        String strNextString = jsonReader.nextString();
        synchronized (this.f60934n) {
            try {
                Iterator it = this.f60934n.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(strNextString);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return B3.j.t(strNextString, new ParsePosition(0));
                } catch (ParseException e2) {
                    throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as Date; at path " + jsonReader.getPreviousPath(), e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.gson.Xo
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public Date rl(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return O(jsonReader);
    }
}
