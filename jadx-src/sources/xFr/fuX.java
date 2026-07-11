package xFr;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class fuX {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            try {
                iArr[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JsonReader.Token.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JsonReader.Token.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[JsonReader.Token.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(JsonReader jsonReader, z zVar, int i2, Integer num, Integer num2, boolean z2, z addKeyValuePair) throws IOException {
        Intrinsics.checkNotNullParameter(addKeyValuePair, "$this$addKeyValuePair");
        qie(jsonReader, zVar, i2, num, num2, z2);
        return Unit.INSTANCE;
    }

    public static final String J2(JsonReader jsonReader, int i2, int i3, Integer num, Integer num2, boolean z2) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        z zVar = new z(i3);
        JsonReader.Token tokenPeek = jsonReader.peek();
        switch (tokenPeek == null ? -1 : j.$EnumSwitchMapping$0[tokenPeek.ordinal()]) {
            case 1:
                az(jsonReader, zVar, i2, num, num2, z2);
                break;
            case 2:
                mUb(jsonReader, zVar, i2, num, num2, z2);
                break;
            case 3:
            case 4:
                zVar.o(jsonReader);
                break;
            case 5:
                String strNextString = jsonReader.nextString();
                Intrinsics.checkNotNullExpressionValue(strNextString, "nextString(...)");
                zVar.r(strNextString);
                break;
            case 6:
                zVar.o(V8ValueNull.NULL);
                break;
            default:
                throw new JSONException("Unexpected token: " + jsonReader.peek());
        }
        return zVar.toString();
    }

    public static final pq.w6 KN(JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        pq.w6 w6Var = new pq.w6();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof Boolean) {
                w6Var.J2(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                w6Var.rl((Number) obj);
            } else if (obj instanceof Long) {
                w6Var.rl((Number) obj);
            } else if (obj instanceof Double) {
                w6Var.rl((Number) obj);
            } else if (obj instanceof String) {
                w6Var.t((String) obj);
            } else if (obj instanceof JSONArray) {
                w6Var.nr(KN((JSONArray) obj));
            } else if (obj instanceof JSONObject) {
                w6Var.O(xMQ((JSONObject) obj));
            } else {
                Intrinsics.areEqual(obj, JSONObject.NULL);
            }
        }
        return w6Var;
    }

    public static /* synthetic */ String O(String str, int i2, int i3, Integer num, Integer num2, boolean z2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 1;
        }
        if ((i5 & 2) != 0) {
            i3 = 4;
        }
        if ((i5 & 4) != 0) {
            num = 200;
        }
        if ((i5 & 8) != 0) {
            num2 = 150;
        }
        if ((i5 & 16) != 0) {
            z2 = true;
        }
        return nr(str, i2, i3, num, num2, z2);
    }

    public static /* synthetic */ String Uo(JsonReader jsonReader, int i2, int i3, Integer num, Integer num2, boolean z2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 1;
        }
        if ((i5 & 2) != 0) {
            i3 = 4;
        }
        if ((i5 & 4) != 0) {
            num = 200;
        }
        if ((i5 & 8) != 0) {
            num2 = 150;
        }
        if ((i5 & 16) != 0) {
            z2 = true;
        }
        return J2(jsonReader, i2, i3, num, num2, z2);
    }

    private static final void az(final JsonReader jsonReader, final z zVar, final int i2, final Integer num, final Integer num2, final boolean z2) {
        if (i2 > 0) {
            z.ty(zVar, i2 <= 1 && z2, 0, new Function1() { // from class: xFr.Wre
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fuX.ty(jsonReader, zVar, i2, num, num2, z2, (z) obj);
                }
            }, 2, null);
            return;
        }
        zVar.o("{ " + aC.O(jsonReader).size() + " keys }");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(JsonReader jsonReader, z zVar, int i2, Integer num, Integer num2, boolean z2, z addArray) throws IOException {
        Intrinsics.checkNotNullParameter(addArray, "$this$addArray");
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            qie(jsonReader, zVar, i2, num, num2, z2);
        }
        Unit unit = Unit.INSTANCE;
        jsonReader.endArray();
        return Unit.INSTANCE;
    }

    private static final void mUb(final JsonReader jsonReader, final z zVar, final int i2, final Integer num, final Integer num2, final boolean z2) throws IOException {
        if (i2 > 0) {
            z.KN(zVar, i2 <= 1 && z2, 0, new Function1() { // from class: xFr.I28
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fuX.gh(jsonReader, zVar, i2, num, num2, z2, (z) obj);
                }
            }, 2, null);
            return;
        }
        jsonReader.beginArray();
        zVar.o("[ " + aC.rl(jsonReader) + " elements ]");
        Unit unit = Unit.INSTANCE;
        jsonReader.endArray();
    }

    public static final String nr(String str, int i2, int i3, Integer num, Integer num2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        JsonReader jsonReaderOf = JsonReader.of(new Buffer().writeUtf8(str));
        try {
            Intrinsics.checkNotNull(jsonReaderOf);
            String strJ2 = J2(jsonReaderOf, i2, i3, num, num2, z2);
            CloseableKt.closeFinally(jsonReaderOf, null);
            return strJ2;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(final JsonReader jsonReader, final z zVar, final int i2, final Integer num, final Integer num2, final boolean z2, z addObject) throws IOException {
        Intrinsics.checkNotNullParameter(addObject, "$this$addObject");
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Intrinsics.checkNotNullExpressionValue(strNextName, "nextName(...)");
            addObject.qie(strNextName, new Function1() { // from class: xFr.CN3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fuX.HI(jsonReader, zVar, i2, num, num2, z2, (z) obj);
                }
            });
        }
        Unit unit = Unit.INSTANCE;
        jsonReader.endObject();
        return Unit.INSTANCE;
    }

    public static final pq.Ml xMQ(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        pq.Ml ml = new pq.Ml();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof Boolean) {
                Intrinsics.checkNotNull(next);
                ml.KN(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                Intrinsics.checkNotNull(next);
                ml.nr(next, (Number) obj);
            } else if (obj instanceof Long) {
                Intrinsics.checkNotNull(next);
                ml.nr(next, (Number) obj);
            } else if (obj instanceof Double) {
                Intrinsics.checkNotNull(next);
                ml.nr(next, (Number) obj);
            } else if (obj instanceof String) {
                Intrinsics.checkNotNull(next);
                ml.O(next, (String) obj);
            } else if (obj instanceof JSONArray) {
                Intrinsics.checkNotNull(next);
                ml.J2(next, KN((JSONArray) obj));
            } else if (obj instanceof JSONObject) {
                Intrinsics.checkNotNull(next);
                ml.Uo(next, xMQ((JSONObject) obj));
            } else {
                Intrinsics.areEqual(obj, JSONObject.NULL);
            }
        }
        return ml;
    }

    private static final void qie(JsonReader jsonReader, z zVar, int i2, Integer num, Integer num2, boolean z2) throws IOException {
        int i3;
        JsonReader.Token tokenPeek = jsonReader.peek();
        if (tokenPeek == null) {
            i3 = -1;
        } else {
            i3 = j.$EnumSwitchMapping$0[tokenPeek.ordinal()];
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 5) {
                    zVar.o(String.valueOf(jsonReader.readJsonValue()));
                    return;
                }
                String strNextString = jsonReader.nextString();
                Intrinsics.checkNotNullExpressionValue(strNextString, pTYaLzzmJSGAPQ.wNDHyNjyiJmJ);
                zVar.r(s4.J2(strNextString, num, num2, zVar.S()));
                return;
            }
            mUb(jsonReader, zVar, i2 - 1, num, num2, z2);
            return;
        }
        az(jsonReader, zVar, i2 - 1, num, num2, z2);
    }
}
