package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public final class ExtractorUtil {
    public static int peekToLength(ExtractorInput extractorInput, byte[] bArr, int i2, int i3) throws IOException {
        int i5 = 0;
        while (i5 < i3) {
            int iPeek = extractorInput.peek(bArr, i2 + i5, i3 - i5);
            if (iPeek == -1) {
                break;
            }
            i5 += iPeek;
        }
        return i5;
    }

    public static void checkContainerInput(boolean z2, @Nullable String str) throws ParserException {
        if (!z2) {
            throw ParserException.createForMalformedContainer(str, null);
        }
    }

    private ExtractorUtil() {
    }

    public static boolean peekFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        try {
            return extractorInput.peekFully(bArr, i2, i3, z2);
        } catch (EOFException e2) {
            if (z2) {
                return false;
            }
            throw e2;
        }
    }

    public static boolean readFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i2, int i3) throws IOException {
        try {
            extractorInput.readFully(bArr, i2, i3);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(ExtractorInput extractorInput, int i2) throws IOException {
        try {
            extractorInput.skipFully(i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
