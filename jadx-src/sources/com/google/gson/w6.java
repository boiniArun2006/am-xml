package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class w6 implements FieldNamingStrategy {
    public static final w6 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final w6 f61026O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ w6[] f61027S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final w6 f61028Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f61029n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final w6 f61030o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final w6 f61031r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final w6 f61032t;

    private w6(String str, int i2) {
    }

    enum j extends w6 {
        j(String str, int i2) {
            super(str, i2, null);
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        j jVar = new j("IDENTITY", 0);
        f61029n = jVar;
        w6 w6Var = new w6("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.w6.n
            {
                j jVar2 = null;
            }

            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return w6.rl(field.getName());
            }
        };
        f61032t = w6Var;
        w6 w6Var2 = new w6("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.w6.w6
            {
                j jVar2 = null;
            }

            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return w6.rl(w6.n(field.getName(), ' '));
            }
        };
        f61026O = w6Var2;
        w6 w6Var3 = new w6("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.w6.Ml
            {
                j jVar2 = null;
            }

            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return w6.n(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        J2 = w6Var3;
        w6 w6Var4 = new w6("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.w6.I28
            {
                j jVar2 = null;
            }

            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return w6.n(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f61031r = w6Var4;
        w6 w6Var5 = new w6("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.w6.Wre
            {
                j jVar2 = null;
            }

            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return w6.n(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f61030o = w6Var5;
        w6 w6Var6 = new w6("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.w6.CN3
            {
                j jVar2 = null;
            }

            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return w6.n(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        f61028Z = w6Var6;
        f61027S = new w6[]{jVar, w6Var, w6Var2, w6Var3, w6Var4, w6Var5, w6Var6};
    }

    /* synthetic */ w6(String str, int i2, j jVar) {
        this(str, i2);
    }

    static String n(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static w6 valueOf(String str) {
        return (w6) Enum.valueOf(w6.class, str);
    }

    public static w6[] values() {
        return (w6[]) f61027S.clone();
    }

    static String rl(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (Character.isLetter(cCharAt)) {
                if (!Character.isUpperCase(cCharAt)) {
                    char upperCase = Character.toUpperCase(cCharAt);
                    if (i2 == 0) {
                        return upperCase + str.substring(1);
                    }
                    return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
                }
            } else {
                i2++;
            }
        }
        return str;
    }
}
