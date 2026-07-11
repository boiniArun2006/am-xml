package androidx.content.preferences.protobuf;

import java.nio.Buffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Java8Compatibility {
    static void n(Buffer buffer, int i2) {
        buffer.limit(i2);
    }

    static void nr(Buffer buffer) {
        buffer.reset();
    }

    static void rl(Buffer buffer) {
        buffer.mark();
    }

    static void t(Buffer buffer, int i2) {
        buffer.position(i2);
    }
}
