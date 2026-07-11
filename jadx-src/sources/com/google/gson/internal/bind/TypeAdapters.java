package com.google.gson.internal.bind;

import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class TypeAdapters {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final com.google.gson.eO f60966E;
    public static final com.google.gson.eO E2;
    public static final com.google.gson.eO HI;
    public static final com.google.gson.eO Ik;
    public static final com.google.gson.Xo J2;
    public static final com.google.gson.Xo KN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final com.google.gson.eO f60967M;
    public static final com.google.gson.Xo M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final com.google.gson.eO f60968N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final com.google.gson.Xo f60969O;
    public static final com.google.gson.eO P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final com.google.gson.Xo f60970S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final com.google.gson.Xo f60971T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final com.google.gson.Xo f60972U;
    public static final com.google.gson.eO Uo;
    public static final com.google.gson.Xo ViF;
    public static final com.google.gson.Xo WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final com.google.gson.eO f60973X;
    public static final com.google.gson.Xo XQ;
    public static final com.google.gson.Xo Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final com.google.gson.Xo f60974Z;
    public static final com.google.gson.eO aYN;
    public static final com.google.gson.eO az;
    public static final com.google.gson.eO bzg;
    public static final com.google.gson.Xo ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.gson.Xo f60975e;
    public static final com.google.gson.Xo eF;
    public static final com.google.gson.Xo fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.gson.Xo f60976g;
    public static final com.google.gson.eO gh;
    public static final com.google.gson.eO iF;
    public static final com.google.gson.eO jB;
    public static final com.google.gson.Xo mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.google.gson.Xo f60977n;
    public static final com.google.gson.Xo nHg;
    public static final com.google.gson.Xo nY;
    public static final com.google.gson.eO nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.gson.eO f60978o;
    public static final com.google.gson.eO p5;
    public static final com.google.gson.Xo qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.google.gson.Xo f60979r;
    public static final com.google.gson.Xo rV9;
    public static final com.google.gson.eO rl;
    public static final com.google.gson.eO s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final com.google.gson.Xo f60980t;
    public static final com.google.gson.Xo te;
    public static final com.google.gson.Xo ty;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final com.google.gson.eO f60981v;
    public static final com.google.gson.Xo wTp;
    public static final com.google.gson.eO xMQ;

    class C extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Class rl(JsonReader jsonReader) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        C() {
        }
    }

    private static final class Ew extends com.google.gson.Xo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Map f60995n = new HashMap();
        private final Map rl = new HashMap();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Map f60996t = new HashMap();

        class j implements PrivilegedAction {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Class f60997n;

            j(Class cls) {
                this.f60997n = cls;
            }

            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Field[] run() {
                Field[] declaredFields = this.f60997n.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Enum r3) throws IOException {
            jsonWriter.value(r3 == null ? null : (String) this.f60996t.get(r3));
        }

        public Ew(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new j(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String strName = r42.name();
                    String string = r42.toString();
                    AlA.n nVar = (AlA.n) field.getAnnotation(AlA.n.class);
                    if (nVar != null) {
                        strName = nVar.value();
                        for (String str : nVar.alternate()) {
                            this.f60995n.put(str, r42);
                        }
                    }
                    this.f60995n.put(strName, r42);
                    this.rl.put(string, r42);
                    this.f60996t.put(r42, strName);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Enum rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            Enum r02 = (Enum) this.f60995n.get(strNextString);
            if (r02 == null) {
                return (Enum) this.rl.get(strNextString);
            }
            return r02;
        }
    }

    class I28 extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Character ch) throws IOException {
            jsonWriter.value(ch == null ? null : String.valueOf(ch));
        }

        I28() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Character rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            if (strNextString.length() == 1) {
                return Character.valueOf(strNextString.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + strNextString + "; at " + jsonReader.getPreviousPath());
        }
    }

    class Ml extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.doubleValue());
            }
        }

        Ml() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Number rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    class Pl extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, URI uri) throws IOException {
            jsonWriter.value(uri == null ? null : uri.toASCIIString());
        }

        Pl() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public URI rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                String strNextString = jsonReader.nextString();
                if (V8ValueNull.NULL.equals(strNextString)) {
                    return null;
                }
                return new URI(strNextString);
            } catch (URISyntaxException e2) {
                throw new JsonIOException(e2);
            }
        }
    }

    class QJ extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Calendar calendar) throws IOException {
            if (calendar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("year");
            jsonWriter.value(calendar.get(1));
            jsonWriter.name("month");
            jsonWriter.value(calendar.get(2));
            jsonWriter.name("dayOfMonth");
            jsonWriter.value(calendar.get(5));
            jsonWriter.name("hourOfDay");
            jsonWriter.value(calendar.get(11));
            jsonWriter.name("minute");
            jsonWriter.value(calendar.get(12));
            jsonWriter.name("second");
            jsonWriter.value(calendar.get(13));
            jsonWriter.endObject();
        }

        QJ() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Calendar rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i2 = 0;
            int i3 = 0;
            int i5 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String strNextName = jsonReader.nextName();
                int iNextInt = jsonReader.nextInt();
                if ("year".equals(strNextName)) {
                    i2 = iNextInt;
                } else if ("month".equals(strNextName)) {
                    i3 = iNextInt;
                } else if ("dayOfMonth".equals(strNextName)) {
                    i5 = iNextInt;
                } else if ("hourOfDay".equals(strNextName)) {
                    i7 = iNextInt;
                } else if ("minute".equals(strNextName)) {
                    i8 = iNextInt;
                } else if ("second".equals(strNextName)) {
                    i9 = iNextInt;
                }
            }
            jsonReader.endObject();
            return new GregorianCalendar(i2, i3, i5, i7, i8, i9);
        }
    }

    class SPz extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.byteValue());
            }
        }

        SPz() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Number rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                int iNextInt = jsonReader.nextInt();
                if (iNextInt <= 255 && iNextInt >= -128) {
                    return Byte.valueOf((byte) iNextInt);
                }
                throw new JsonSyntaxException("Lossy conversion from " + iNextInt + " to byte; at path " + jsonReader.getPreviousPath());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
    }

    class Xo extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
            jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
        }

        Xo() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public InetAddress rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return InetAddress.getByName(jsonReader.nextString());
        }
    }

    class Z extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean rl(JsonReader jsonReader) {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        Z() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
            jsonWriter.value(atomicBoolean.get());
        }
    }

    class aC extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
            jsonWriter.value(sb == null ? null : sb.toString());
        }

        aC() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public StringBuilder rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new StringBuilder(jsonReader.nextString());
        }
    }

    class afx extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public AtomicInteger rl(JsonReader jsonReader) {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        afx() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
            jsonWriter.value(atomicInteger.get());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$c, reason: case insensitive filesystem */
    class C1919c extends com.google.gson.Xo {
        private com.google.gson.Wre J2(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i2 = UGc.f60998n[jsonToken.ordinal()];
            if (i2 == 1) {
                return new com.google.gson.Dsr(new T6s.Wre(jsonReader.nextString()));
            }
            if (i2 == 2) {
                return new com.google.gson.Dsr(jsonReader.nextString());
            }
            if (i2 == 3) {
                return new com.google.gson.Dsr(Boolean.valueOf(jsonReader.nextBoolean()));
            }
            if (i2 == 6) {
                jsonReader.nextNull();
                return com.google.gson.CN3.f60911n;
            }
            throw new IllegalStateException("Unexpected token: " + jsonToken);
        }

        private com.google.gson.Wre Uo(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i2 = UGc.f60998n[jsonToken.ordinal()];
            if (i2 == 4) {
                jsonReader.beginArray();
                return new com.google.gson.Ml();
            }
            if (i2 != 5) {
                return null;
            }
            jsonReader.beginObject();
            return new com.google.gson.fuX();
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, com.google.gson.Wre wre) throws IOException {
            if (wre == null || wre.J2()) {
                jsonWriter.nullValue();
                return;
            }
            if (wre.KN()) {
                com.google.gson.Dsr dsrNr = wre.nr();
                if (dsrNr.Ik()) {
                    jsonWriter.value(dsrNr.az());
                    return;
                } else if (dsrNr.HI()) {
                    jsonWriter.value(dsrNr.xMQ());
                    return;
                } else {
                    jsonWriter.value(dsrNr.ty());
                    return;
                }
            }
            if (wre.O()) {
                jsonWriter.beginArray();
                Iterator it = wre.rl().iterator();
                while (it.hasNext()) {
                    nr(jsonWriter, (com.google.gson.Wre) it.next());
                }
                jsonWriter.endArray();
                return;
            }
            if (!wre.Uo()) {
                throw new IllegalArgumentException("Couldn't write " + wre.getClass());
            }
            jsonWriter.beginObject();
            for (Map.Entry entry : wre.t().entrySet()) {
                jsonWriter.name((String) entry.getKey());
                nr(jsonWriter, (com.google.gson.Wre) entry.getValue());
            }
            jsonWriter.endObject();
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public com.google.gson.Wre rl(JsonReader jsonReader) throws IOException {
            if (jsonReader instanceof com.google.gson.internal.bind.n) {
                return ((com.google.gson.internal.bind.n) jsonReader).rl();
            }
            JsonToken jsonTokenPeek = jsonReader.peek();
            com.google.gson.Wre wreUo = Uo(jsonReader, jsonTokenPeek);
            if (wreUo == null) {
                return J2(jsonReader, jsonTokenPeek);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (jsonReader.hasNext()) {
                    String strNextName = wreUo instanceof com.google.gson.fuX ? jsonReader.nextName() : null;
                    JsonToken jsonTokenPeek2 = jsonReader.peek();
                    com.google.gson.Wre wreUo2 = Uo(jsonReader, jsonTokenPeek2);
                    boolean z2 = wreUo2 != null;
                    if (wreUo2 == null) {
                        wreUo2 = J2(jsonReader, jsonTokenPeek2);
                    }
                    if (wreUo instanceof com.google.gson.Ml) {
                        ((com.google.gson.Ml) wreUo).xMQ(wreUo2);
                    } else {
                        ((com.google.gson.fuX) wreUo).xMQ(strNextName, wreUo2);
                    }
                    if (z2) {
                        arrayDeque.addLast(wreUo);
                        wreUo = wreUo2;
                    }
                } else {
                    if (wreUo instanceof com.google.gson.Ml) {
                        jsonReader.endArray();
                    } else {
                        jsonReader.endObject();
                    }
                    if (arrayDeque.isEmpty()) {
                        return wreUo;
                    }
                    wreUo = (com.google.gson.Wre) arrayDeque.removeLast();
                }
            }
        }

        C1919c() {
        }
    }

    class ci extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.shortValue());
            }
        }

        ci() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Number rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                int iNextInt = jsonReader.nextInt();
                if (iNextInt <= 65535 && iNextInt >= -32768) {
                    return Short.valueOf((short) iNextInt);
                }
                throw new JsonSyntaxException("Lossy conversion from " + iNextInt + " to short; at path " + jsonReader.getPreviousPath());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
    }

    class eO extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, UUID uuid) throws IOException {
            jsonWriter.value(uuid == null ? null : uuid.toString());
        }

        eO() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public UUID rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            try {
                return UUID.fromString(strNextString);
            } catch (IllegalArgumentException e2) {
                throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as UUID; at path " + jsonReader.getPreviousPath(), e2);
            }
        }
    }

    class g9s extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.intValue());
            }
        }

        g9s() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Number rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
    }

    class j extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray rl(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        j() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                jsonWriter.value(atomicIntegerArray.get(i2));
            }
            jsonWriter.endArray();
        }
    }

    class l3D extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Locale locale) throws IOException {
            jsonWriter.value(locale == null ? null : locale.toString());
        }

        l3D() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Locale rl(JsonReader jsonReader) throws IOException {
            String strNextToken;
            String strNextToken2;
            String strNextToken3 = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
            if (stringTokenizer.hasMoreElements()) {
                strNextToken = stringTokenizer.nextToken();
            } else {
                strNextToken = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                strNextToken2 = stringTokenizer.nextToken();
            } else {
                strNextToken2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                strNextToken3 = stringTokenizer.nextToken();
            }
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            if (strNextToken3 == null) {
                return new Locale(strNextToken, strNextToken2);
            }
            return new Locale(strNextToken, strNextToken2, strNextToken3);
        }
    }

    class n extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.longValue());
            }
        }

        n() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Number rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
    }

    class o extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
            jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
        }

        o() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public StringBuffer rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new StringBuffer(jsonReader.nextString());
        }
    }

    class qz extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, URL url) throws IOException {
            jsonWriter.value(url == null ? null : url.toExternalForm());
        }

        qz() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public URL rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            if (V8ValueNull.NULL.equals(strNextString)) {
                return null;
            }
            return new URL(strNextString);
        }
    }

    class r extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool == null ? V8ValueNull.NULL : bool.toString());
        }

        r() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Boolean rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Boolean.valueOf(jsonReader.nextString());
        }
    }

    class s4 extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public BitSet rl(JsonReader jsonReader) throws IOException {
            BitSet bitSet = new BitSet();
            jsonReader.beginArray();
            JsonToken jsonTokenPeek = jsonReader.peek();
            int i2 = 0;
            while (jsonTokenPeek != JsonToken.END_ARRAY) {
                int i3 = UGc.f60998n[jsonTokenPeek.ordinal()];
                boolean zNextBoolean = true;
                if (i3 == 1 || i3 == 2) {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt == 0) {
                        zNextBoolean = false;
                    } else if (iNextInt != 1) {
                        throw new JsonSyntaxException("Invalid bitset value " + iNextInt + ", expected 0 or 1; at path " + jsonReader.getPreviousPath());
                    }
                } else {
                    if (i3 != 3) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
                    }
                    zNextBoolean = jsonReader.nextBoolean();
                }
                if (zNextBoolean) {
                    bitSet.set(i2);
                }
                i2++;
                jsonTokenPeek = jsonReader.peek();
            }
            jsonReader.endArray();
            return bitSet;
        }

        s4() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                jsonWriter.value(bitSet.get(i2) ? 1L : 0L);
            }
            jsonWriter.endArray();
        }
    }

    class w6 extends com.google.gson.Xo {
        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            jsonWriter.value(number);
        }

        w6() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Number rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Float.valueOf((float) jsonReader.nextDouble());
        }
    }

    class CN3 extends com.google.gson.Xo {
        CN3() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value(bigDecimal);
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public BigDecimal rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            try {
                return new BigDecimal(strNextString);
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as BigDecimal; at path " + jsonReader.getPreviousPath(), e2);
            }
        }
    }

    class Dsr extends com.google.gson.Xo {
        Dsr() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, T6s.Wre wre) throws IOException {
            jsonWriter.value(wre);
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public T6s.Wre rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new T6s.Wre(jsonReader.nextString());
        }
    }

    class Q extends com.google.gson.Xo {
        Q() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool);
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Boolean rl(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            if (jsonTokenPeek == JsonToken.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
            }
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
    }

    static /* synthetic */ class UGc {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f60998n;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f60998n = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60998n[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60998n[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60998n[JsonToken.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60998n[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60998n[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    class Wre extends com.google.gson.Xo {
        Wre() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public String rl(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            if (jsonTokenPeek == JsonToken.BOOLEAN) {
                return Boolean.toString(jsonReader.nextBoolean());
            }
            return jsonReader.nextString();
        }
    }

    class fuX extends com.google.gson.Xo {
        fuX() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value(bigInteger);
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public BigInteger rl(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            try {
                return new BigInteger(strNextString);
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as BigInteger; at path " + jsonReader.getPreviousPath(), e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$z, reason: case insensitive filesystem */
    class C1920z extends com.google.gson.Xo {
        C1920z() {
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Currency currency) throws IOException {
            jsonWriter.value(currency.getCurrencyCode());
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Currency rl(JsonReader jsonReader) throws IOException {
            String strNextString = jsonReader.nextString();
            try {
                return Currency.getInstance(strNextString);
            } catch (IllegalArgumentException e2) {
                throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as Currency; at path " + jsonReader.getPreviousPath(), e2);
            }
        }
    }

    static {
        com.google.gson.Xo xoN = new C().n();
        f60977n = xoN;
        rl = rl(Class.class, xoN);
        com.google.gson.Xo xoN2 = new s4().n();
        f60980t = xoN2;
        nr = rl(BitSet.class, xoN2);
        Q q2 = new Q();
        f60969O = q2;
        J2 = new r();
        Uo = t(Boolean.TYPE, Boolean.class, q2);
        SPz sPz = new SPz();
        KN = sPz;
        xMQ = t(Byte.TYPE, Byte.class, sPz);
        ci ciVar = new ci();
        mUb = ciVar;
        gh = t(Short.TYPE, Short.class, ciVar);
        g9s g9sVar = new g9s();
        qie = g9sVar;
        az = t(Integer.TYPE, Integer.class, g9sVar);
        com.google.gson.Xo xoN3 = new afx().n();
        ty = xoN3;
        HI = rl(AtomicInteger.class, xoN3);
        com.google.gson.Xo xoN4 = new Z().n();
        ck = xoN4;
        Ik = rl(AtomicBoolean.class, xoN4);
        com.google.gson.Xo xoN5 = new j().n();
        f60979r = xoN5;
        f60978o = rl(AtomicIntegerArray.class, xoN5);
        f60974Z = new n();
        XQ = new w6();
        f60970S = new Ml();
        I28 i28 = new I28();
        WPU = i28;
        aYN = t(Character.TYPE, Character.class, i28);
        Wre wre = new Wre();
        ViF = wre;
        nY = new CN3();
        f60976g = new fuX();
        te = new Dsr();
        iF = rl(String.class, wre);
        aC aCVar = new aC();
        fD = aCVar;
        E2 = rl(StringBuilder.class, aCVar);
        o oVar = new o();
        f60975e = oVar;
        f60973X = rl(StringBuffer.class, oVar);
        qz qzVar = new qz();
        f60971T = qzVar;
        f60968N = rl(URL.class, qzVar);
        Pl pl = new Pl();
        nHg = pl;
        s7N = rl(URI.class, pl);
        Xo xo = new Xo();
        wTp = xo;
        f60981v = O(InetAddress.class, xo);
        eO eOVar = new eO();
        rV9 = eOVar;
        bzg = rl(UUID.class, eOVar);
        com.google.gson.Xo xoN6 = new C1920z().n();
        Xw = xoN6;
        jB = rl(Currency.class, xoN6);
        QJ qj = new QJ();
        f60972U = qj;
        P5 = nr(Calendar.class, GregorianCalendar.class, qj);
        l3D l3d = new l3D();
        M7 = l3d;
        p5 = rl(Locale.class, l3d);
        C1919c c1919c = new C1919c();
        eF = c1919c;
        f60966E = O(com.google.gson.Wre.class, c1919c);
        f60967M = new com.google.gson.eO() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.eO
            public com.google.gson.Xo n(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (Enum.class.isAssignableFrom(rawType) && rawType != Enum.class) {
                    if (!rawType.isEnum()) {
                        rawType = rawType.getSuperclass();
                    }
                    return new Ew(rawType);
                }
                return null;
            }
        };
    }

    public static com.google.gson.eO O(final Class cls, final com.google.gson.Xo xo) {
        return new com.google.gson.eO() { // from class: com.google.gson.internal.bind.TypeAdapters.34

            /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$34$j */
            class j extends com.google.gson.Xo {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Class f60994n;

                j(Class cls) {
                    this.f60994n = cls;
                }

                @Override // com.google.gson.Xo
                public void nr(JsonWriter jsonWriter, Object obj) {
                    xo.nr(jsonWriter, obj);
                }

                @Override // com.google.gson.Xo
                public Object rl(JsonReader jsonReader) {
                    Object objRl = xo.rl(jsonReader);
                    if (objRl == null || this.f60994n.isInstance(objRl)) {
                        return objRl;
                    }
                    throw new JsonSyntaxException("Expected a " + this.f60994n.getName() + " but was " + objRl.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                }
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + xo + "]";
            }

            @Override // com.google.gson.eO
            public com.google.gson.Xo n(Gson gson, TypeToken typeToken) {
                Class<?> rawType = typeToken.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return new j(rawType);
            }
        };
    }

    public static com.google.gson.eO n(final TypeToken typeToken, final com.google.gson.Xo xo) {
        return new com.google.gson.eO() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.eO
            public com.google.gson.Xo n(Gson gson, TypeToken typeToken2) {
                if (typeToken2.equals(typeToken)) {
                    return xo;
                }
                return null;
            }
        };
    }

    public static com.google.gson.eO nr(final Class cls, final Class cls2, final com.google.gson.Xo xo) {
        return new com.google.gson.eO() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + xo + "]";
            }

            @Override // com.google.gson.eO
            public com.google.gson.Xo n(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType != cls && rawType != cls2) {
                    return null;
                }
                return xo;
            }
        };
    }

    public static com.google.gson.eO rl(final Class cls, final com.google.gson.Xo xo) {
        return new com.google.gson.eO() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + xo + "]";
            }

            @Override // com.google.gson.eO
            public com.google.gson.Xo n(Gson gson, TypeToken typeToken) {
                if (typeToken.getRawType() == cls) {
                    return xo;
                }
                return null;
            }
        };
    }

    public static com.google.gson.eO t(final Class cls, final Class cls2, final com.google.gson.Xo xo) {
        return new com.google.gson.eO() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + xo + "]";
            }

            @Override // com.google.gson.eO
            public com.google.gson.Xo n(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType != cls && rawType != cls2) {
                    return null;
                }
                return xo;
            }
        };
    }
}
