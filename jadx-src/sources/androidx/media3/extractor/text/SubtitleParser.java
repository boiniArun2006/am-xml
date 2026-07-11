package androidx.media3.extractor.text;

import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.nKK;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@UnstableApi
public interface SubtitleParser {

    public interface Factory {
        public static final Factory UNSUPPORTED = new Factory() { // from class: androidx.media3.extractor.text.SubtitleParser.Factory.1
            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public int getCueReplacementBehavior(Format format) {
                return 1;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public boolean supportsFormat(Format format) {
                return false;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public SubtitleParser create(Format format) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        };

        SubtitleParser create(Format format);

        int getCueReplacementBehavior(Format format);

        boolean supportsFormat(Format format);
    }

    public static class OutputOptions {
        private static final OutputOptions ALL = new OutputOptions(-9223372036854775807L, false);
        public final boolean outputAllCues;
        public final long startTimeUs;

        public static OutputOptions allCues() {
            return ALL;
        }

        public static OutputOptions cuesAfterThenRemainingCuesBefore(long j2) {
            return new OutputOptions(j2, true);
        }

        public static OutputOptions onlyCuesAfter(long j2) {
            return new OutputOptions(j2, false);
        }

        private OutputOptions(long j2, boolean z2) {
            this.startTimeUs = j2;
            this.outputAllCues = z2;
        }
    }

    int getCueReplacementBehavior();

    void parse(byte[] bArr, int i2, int i3, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer);

    default void parse(byte[] bArr, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    default void reset() {
    }

    default Subtitle parseToLegacySubtitle(byte[] bArr, int i2, int i3) {
        final nKK.j jVarGh = nKK.gh();
        OutputOptions outputOptions = OutputOptions.ALL;
        Objects.requireNonNull(jVarGh);
        parse(bArr, i2, i3, outputOptions, new Consumer() { // from class: androidx.media3.extractor.text.Ml
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                jVarGh.n((CuesWithTiming) obj);
            }
        });
        return new CuesWithTimingSubtitle(jVarGh.gh());
    }
}
