package com.google.protobuf;

import java.nio.Buffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class qf {
    private qf() {
    }

    static void clear(Buffer buffer) {
        buffer.clear();
    }

    static void flip(Buffer buffer) {
        buffer.flip();
    }

    static void limit(Buffer buffer, int i2) {
        buffer.limit(i2);
    }

    static void mark(Buffer buffer) {
        buffer.mark();
    }

    static void position(Buffer buffer, int i2) {
        buffer.position(i2);
    }

    static void reset(Buffer buffer) {
        buffer.reset();
    }
}
