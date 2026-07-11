package j$.sun.nio.cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CoderResult f68897a = CoderResult.UNDERFLOW;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f68898b;

    public final CoderResult a() {
        return this.f68897a;
    }

    public final CoderResult d() {
        return CoderResult.unmappableForLength(this.f68898b ? 2 : 1);
    }

    public final int b(char c2, CharBuffer charBuffer) {
        if (Character.isHighSurrogate(c2)) {
            if (!charBuffer.hasRemaining()) {
                this.f68897a = CoderResult.UNDERFLOW;
                return -1;
            }
            char c4 = charBuffer.get();
            if (Character.isLowSurrogate(c4)) {
                int codePoint = Character.toCodePoint(c2, c4);
                this.f68898b = true;
                this.f68897a = null;
                return codePoint;
            }
            this.f68897a = CoderResult.malformedForLength(1);
            return -1;
        }
        if (Character.isLowSurrogate(c2)) {
            this.f68897a = CoderResult.malformedForLength(1);
            return -1;
        }
        this.f68898b = false;
        this.f68897a = null;
        return c2;
    }

    public final int c(char c2, char[] cArr, int i2, int i3) {
        if (!Character.isHighSurrogate(c2)) {
            if (Character.isLowSurrogate(c2)) {
                this.f68897a = CoderResult.malformedForLength(1);
                return -1;
            }
            this.f68898b = false;
            this.f68897a = null;
            return c2;
        }
        if (i3 - i2 < 2) {
            this.f68897a = CoderResult.UNDERFLOW;
            return -1;
        }
        char c4 = cArr[i2 + 1];
        if (Character.isLowSurrogate(c4)) {
            int codePoint = Character.toCodePoint(c2, c4);
            this.f68898b = true;
            this.f68897a = null;
            return codePoint;
        }
        this.f68897a = CoderResult.malformedForLength(1);
        return -1;
    }
}
