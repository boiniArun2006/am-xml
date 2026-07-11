package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.Enum;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
    final T[] constants;
    final Class<T> enumType;
    final T fallbackValue;
    final String[] nameStrings;
    final JsonReader.Options options;
    final boolean useFallbackValue;

    public static <T extends Enum<T>> EnumJsonAdapter<T> create(Class<T> cls) {
        return new EnumJsonAdapter<>(cls, null, false);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(JsonReader jsonReader) throws IOException {
        int iSelectString = jsonReader.selectString(this.options);
        if (iSelectString != -1) {
            return this.constants[iSelectString];
        }
        String path = jsonReader.getPath();
        if (this.useFallbackValue) {
            if (jsonReader.peek() == JsonReader.Token.STRING) {
                jsonReader.skipValue();
                return this.fallbackValue;
            }
            throw new JsonDataException("Expected a string but was " + jsonReader.peek() + " at path " + path);
        }
        throw new JsonDataException("Expected one of " + Arrays.asList(this.nameStrings) + " but was " + jsonReader.nextString() + " at path " + path);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, T t3) throws IOException {
        if (t3 == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.value(this.nameStrings[t3.ordinal()]);
    }

    public String toString() {
        return "EnumJsonAdapter(" + this.enumType.getName() + ")";
    }

    public EnumJsonAdapter<T> withUnknownFallback(T t3) {
        return new EnumJsonAdapter<>(this.enumType, t3, true);
    }

    EnumJsonAdapter(Class<T> cls, T t3, boolean z2) {
        this.enumType = cls;
        this.fallbackValue = t3;
        this.useFallbackValue = z2;
        try {
            T[] enumConstants = cls.getEnumConstants();
            this.constants = enumConstants;
            this.nameStrings = new String[enumConstants.length];
            int i2 = 0;
            while (true) {
                T[] tArr = this.constants;
                if (i2 < tArr.length) {
                    String strName = tArr[i2].name();
                    this.nameStrings[i2] = Util.jsonName(strName, cls.getField(strName));
                    i2++;
                } else {
                    this.options = JsonReader.Options.of(this.nameStrings);
                    return;
                }
            }
        } catch (NoSuchFieldException e2) {
            throw new AssertionError("Missing field in " + cls.getName(), e2);
        }
    }
}
