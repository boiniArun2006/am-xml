package com.caoccao.javet.enums;

import com.caoccao.javet.enums.JavetPromiseRejectEvent;
import java.util.function.Consumer;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public enum JavetPromiseRejectEvent {
    PromiseRejectWithNoHandler(0, "PromiseRejectWithNoHandler"),
    PromiseHandlerAddedAfterReject(1, "PromiseHandlerAddedAfterReject"),
    PromiseResolveAfterResolved(2, "PromiseResolveAfterResolved"),
    PromiseRejectAfterResolved(3, "PromiseRejectAfterResolved");

    private static final JavetPromiseRejectEvent[] EVENTS;
    private static final int LENGTH;
    private final int code;
    private final String name;

    static {
        int length = values().length;
        LENGTH = length;
        EVENTS = new JavetPromiseRejectEvent[length];
        Stream.of((Object[]) values()).forEach(new Consumer() { // from class: Flz.Dsr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                JavetPromiseRejectEvent.n((JavetPromiseRejectEvent) obj);
            }
        });
    }

    public static /* synthetic */ void n(JavetPromiseRejectEvent javetPromiseRejectEvent) {
        EVENTS[javetPromiseRejectEvent.getCode()] = javetPromiseRejectEvent;
    }

    public static JavetPromiseRejectEvent parse(int i2) {
        if (i2 < 0 || i2 >= LENGTH) {
            return null;
        }
        return EVENTS[i2];
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    JavetPromiseRejectEvent(int i2, String str) {
        this.code = i2;
        this.name = str;
    }
}
