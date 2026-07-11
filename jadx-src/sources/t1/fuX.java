package t1;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73417n;

    public static fuX J2(char c2) {
        return new fuX(String.valueOf(c2));
    }

    public static fuX Uo(String str) {
        return new fuX(str);
    }

    public final String O(Iterator it) {
        return t(new StringBuilder(), it).toString();
    }

    private fuX(String str) {
        this.f73417n = (String) Xo.HI(str);
    }

    CharSequence KN(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public Appendable n(Appendable appendable, Iterator it) throws IOException {
        Xo.HI(appendable);
        if (it.hasNext()) {
            appendable.append(KN(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f73417n);
                appendable.append(KN(it.next()));
            }
        }
        return appendable;
    }

    public final String nr(Iterable iterable) {
        return O(iterable.iterator());
    }

    public final StringBuilder rl(StringBuilder sb, Iterable iterable) {
        return t(sb, iterable.iterator());
    }

    public final StringBuilder t(StringBuilder sb, Iterator it) {
        try {
            n(sb, it);
            return sb;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
