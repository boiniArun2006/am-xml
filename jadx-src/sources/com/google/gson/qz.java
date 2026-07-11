package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class qz implements Pl {
    public static final qz J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final qz f61022O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qz f61023n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ qz[] f61024r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final qz f61025t;

    private qz(String str, int i2) {
    }

    enum j extends qz {
        j(String str, int i2) {
            super(str, i2, null);
        }

        @Override // com.google.gson.Pl
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Double n(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    static {
        j jVar = new j("DOUBLE", 0);
        f61023n = jVar;
        qz qzVar = new qz("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.qz.n
            {
                j jVar2 = null;
            }

            @Override // com.google.gson.Pl
            public Number n(JsonReader jsonReader) {
                return new T6s.Wre(jsonReader.nextString());
            }
        };
        f61025t = qzVar;
        qz qzVar2 = new qz("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.qz.w6
            {
                j jVar2 = null;
            }

            @Override // com.google.gson.Pl
            public Number n(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(strNextString));
                    } catch (NumberFormatException unused) {
                        Double dValueOf = Double.valueOf(strNextString);
                        if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                            if (!jsonReader.isLenient()) {
                                throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.getPreviousPath());
                            }
                        }
                        return dValueOf;
                    }
                } catch (NumberFormatException e2) {
                    throw new JsonParseException("Cannot parse " + strNextString + "; at path " + jsonReader.getPreviousPath(), e2);
                }
            }
        };
        f61022O = qzVar2;
        qz qzVar3 = new qz("BIG_DECIMAL", 3) { // from class: com.google.gson.qz.Ml
            {
                j jVar2 = null;
            }

            @Override // com.google.gson.Pl
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public BigDecimal n(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    return new BigDecimal(strNextString);
                } catch (NumberFormatException e2) {
                    throw new JsonParseException("Cannot parse " + strNextString + "; at path " + jsonReader.getPreviousPath(), e2);
                }
            }
        };
        J2 = qzVar3;
        f61024r = new qz[]{jVar, qzVar, qzVar2, qzVar3};
    }

    /* synthetic */ qz(String str, int i2, j jVar) {
        this(str, i2);
    }

    public static qz valueOf(String str) {
        return (qz) Enum.valueOf(qz.class, str);
    }

    public static qz[] values() {
        return (qz[]) f61024r.clone();
    }
}
