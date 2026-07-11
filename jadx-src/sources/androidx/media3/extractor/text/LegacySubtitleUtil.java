package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@UnstableApi
public class LegacySubtitleUtil {
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void toCuesWithTiming(Subtitle subtitle, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        boolean z2;
        int startIndex = getStartIndex(subtitle, outputOptions.startTimeUs);
        if (outputOptions.startTimeUs == -9223372036854775807L || startIndex >= subtitle.getEventTimeCount()) {
            z2 = false;
        } else {
            List<Cue> cues = subtitle.getCues(outputOptions.startTimeUs);
            long eventTime = subtitle.getEventTime(startIndex);
            if (!cues.isEmpty()) {
                long j2 = outputOptions.startTimeUs;
                if (j2 < eventTime) {
                    consumer.accept(new CuesWithTiming(cues, j2, eventTime - j2));
                    z2 = true;
                }
            }
        }
        for (int i2 = startIndex; i2 < subtitle.getEventTimeCount(); i2++) {
            outputSubtitleEvent(subtitle, i2, consumer);
        }
        if (outputOptions.outputAllCues) {
            if (z2) {
                startIndex--;
            }
            for (int i3 = 0; i3 < startIndex; i3++) {
                outputSubtitleEvent(subtitle, i3, consumer);
            }
            if (z2) {
                consumer.accept(new CuesWithTiming(subtitle.getCues(outputOptions.startTimeUs), subtitle.getEventTime(startIndex), outputOptions.startTimeUs - subtitle.getEventTime(startIndex)));
            }
        }
    }

    private LegacySubtitleUtil() {
    }

    private static void outputSubtitleEvent(Subtitle subtitle, int i2, Consumer<CuesWithTiming> consumer) {
        long eventTime = subtitle.getEventTime(i2);
        List<Cue> cues = subtitle.getCues(eventTime);
        if (!cues.isEmpty()) {
            if (i2 != subtitle.getEventTimeCount() - 1) {
                long eventTime2 = subtitle.getEventTime(i2 + 1) - subtitle.getEventTime(i2);
                if (eventTime2 > 0) {
                    consumer.accept(new CuesWithTiming(cues, eventTime, eventTime2));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    private static int getStartIndex(Subtitle subtitle, long j2) {
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        int nextEventTimeIndex = subtitle.getNextEventTimeIndex(j2);
        if (nextEventTimeIndex == -1) {
            nextEventTimeIndex = subtitle.getEventTimeCount();
        }
        if (nextEventTimeIndex > 0 && subtitle.getEventTime(nextEventTimeIndex - 1) == j2) {
            return nextEventTimeIndex - 1;
        }
        return nextEventTimeIndex;
    }
}
