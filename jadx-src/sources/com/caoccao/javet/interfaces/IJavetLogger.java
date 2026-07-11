package com.caoccao.javet.interfaces;

import java.text.MessageFormat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface IJavetLogger {
    void debug(String str);

    void error(String str);

    void error(String str, Throwable th);

    void info(String str);

    default void logError(Throwable th, String str, Object... objArr) {
        error(MessageFormat.format(str, objArr), th);
    }

    void warn(String str);

    default void logError(String str, Object... objArr) {
        error(MessageFormat.format(str, objArr));
    }

    default void logDebug(String str, Object... objArr) {
        debug(MessageFormat.format(str, objArr));
    }

    default void logInfo(String str, Object... objArr) {
        info(MessageFormat.format(str, objArr));
    }

    default void logWarn(String str, Object... objArr) {
        warn(MessageFormat.format(str, objArr));
    }
}
