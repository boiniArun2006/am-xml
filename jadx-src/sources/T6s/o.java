package T6s;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class o {

    private static final class n extends Writer {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Appendable f10179n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final j f10180t = new j();

        private static class j implements CharSequence {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private char[] f10181n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private String f10182t;

            private j() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i2) {
                return this.f10181n[i2];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f10181n.length;
            }

            void n(char[] cArr) {
                this.f10181n = cArr;
                this.f10182t = null;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i2, int i3) {
                return new String(this.f10181n, i2, i3 - i2);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f10182t == null) {
                    this.f10182t = new String(this.f10181n);
                }
                return this.f10182t;
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) throws IOException {
            this.f10180t.n(cArr);
            this.f10179n.append(this.f10180t, i2, i3 + i2);
        }

        n(Appendable appendable) {
            this.f10179n = appendable;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f10179n.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i2) throws IOException {
            this.f10179n.append((char) i2);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i2, int i3) throws IOException {
            this.f10179n.append(charSequence, i2, i3);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i2, int i3) throws IOException {
            Objects.requireNonNull(str);
            this.f10179n.append(str, i2, i3 + i2);
        }
    }

    public static void n(com.google.gson.Wre wre, JsonWriter jsonWriter) {
        TypeAdapters.eF.nr(jsonWriter, wre);
    }

    public static Writer rl(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new n(appendable);
    }
}
