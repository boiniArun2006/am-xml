package com.google.gson.internal.bind;

import T6s.Dsr;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Xo;
import com.google.gson.eO;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j extends Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f60999n;
    private final List rl;

    public static abstract class n {
        public static final n rl = new C0816j(Date.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Class f61000n;

        protected abstract Date nr(Date date);

        /* JADX INFO: renamed from: com.google.gson.internal.bind.j$n$j, reason: collision with other inner class name */
        class C0816j extends n {
            @Override // com.google.gson.internal.bind.j.n
            protected Date nr(Date date) {
                return date;
            }

            C0816j(Class cls) {
                super(cls);
            }
        }

        private eO t(j jVar) {
            return TypeAdapters.rl(this.f61000n, jVar);
        }

        public final eO n(int i2, int i3) {
            return t(new j(this, i2, i3));
        }

        public final eO rl(String str) {
            return t(new j(this, str));
        }

        protected n(Class cls) {
            this.f61000n = cls;
        }
    }

    @Override // com.google.gson.Xo
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public void nr(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.rl.get(0);
        synchronized (this.rl) {
            str = dateFormat.format(date);
        }
        jsonWriter.value(str);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.rl.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    private j(n nVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.rl = arrayList;
        Objects.requireNonNull(nVar);
        this.f60999n = nVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private Date O(JsonReader jsonReader) throws IOException {
        String strNextString = jsonReader.nextString();
        synchronized (this.rl) {
            try {
                Iterator it = this.rl.iterator();
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
        return this.f60999n.nr(O(jsonReader));
    }

    private j(n nVar, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.rl = arrayList;
        Objects.requireNonNull(nVar);
        this.f60999n = nVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (T6s.Ml.nr()) {
            arrayList.add(Dsr.t(i2, i3));
        }
    }
}
