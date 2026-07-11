package com.caoccao.javet.enums;

import com.caoccao.javet.enums.JSFunctionType;
import java.util.function.Consumer;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum JSFunctionType {
    Native(0, "Native"),
    API(1, "API"),
    UserDefined(2, "UserDefined"),
    Unknown(3, "Unknown");

    private static final int LENGTH;
    private static final JSFunctionType[] TYPES;
    private final int id;
    private final String name;

    static {
        int length = values().length;
        LENGTH = length;
        TYPES = new JSFunctionType[length];
        Stream.of((Object[]) values()).forEach(new Consumer() { // from class: Flz.j
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                JSFunctionType.n((JSFunctionType) obj);
            }
        });
    }

    public static /* synthetic */ void n(JSFunctionType jSFunctionType) {
        TYPES[jSFunctionType.getId()] = jSFunctionType;
    }

    public static JSFunctionType parse(int i2) {
        return (i2 < 0 || i2 >= LENGTH) ? Unknown : TYPES[i2];
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAPI() {
        return this == API;
    }

    public boolean isNative() {
        return this == Native;
    }

    public boolean isUserDefined() {
        return this == UserDefined;
    }

    JSFunctionType(int i2, String str) {
        this.id = i2;
        this.name = str;
    }
}
