package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Utf8Old extends Utf8 {
    private static final ThreadLocal rl;

    /* JADX INFO: Access modifiers changed from: private */
    static class Cache {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final CharsetEncoder f38389n;
        final CharsetDecoder rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        CharSequence f38390t = null;
        ByteBuffer nr = null;

        Cache() {
            Charset charset = StandardCharsets.UTF_8;
            this.f38389n = charset.newEncoder();
            this.rl = charset.newDecoder();
        }
    }

    static {
        final Supplier supplier = new Supplier() { // from class: androidx.emoji2.text.flatbuffer.j
            @Override // java.util.function.Supplier
            public final Object get() {
                return Utf8Old.rl();
            }
        };
        rl = new ThreadLocal() { // from class: androidx.emoji2.text.flatbuffer.n
            @Override // java.lang.ThreadLocal
            protected /* synthetic */ Object initialValue() {
                return supplier.get();
            }
        };
    }

    public static /* synthetic */ Cache rl() {
        return new Cache();
    }
}
