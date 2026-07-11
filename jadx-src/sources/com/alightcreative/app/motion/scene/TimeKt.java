package com.alightcreative.app.motion.scene;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0019\u001a \u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\"\u001a\u000e\u0010#\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0001\"\u000e\u0010\f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"frameNumberFromTime", "", "time", "framesPerHundredSeconds", "frameNumberFromNanos", "nanos", "", "frameNumberFromMicros", "micros", "frameNumberFromPTSTime", "frameNumberFromPTSNanos", "frameNumberFromStartTime", "NS_PER_MS", "timeFromFrameNumber", "frameNumber", "microsFromFrameNumber", "nanosFromFrameNumber", "frameStartTimeFromFrameNumber", "frameEndTimeFromFrameNumber", "roundToFrame", "roundToFrameNanos", "roundToFrameStartTime", "roundToFrameEndTime", "differenceFromFrameTime", "zeroPad2", "", "v", "zeroPad3", "formatFrameNumber", "signedFrameNumber", "format", "formatTimeMillis", "signedTimeMillis", "removeHoursIfZero", "", "formatFPS", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TimeKt {
    public static final long NS_PER_MS = 1000000;

    public static final int frameEndTimeFromFrameNumber(int i2, int i3) {
        return (int) ((((((long) i2) + 1) * ((long) 100000)) / ((long) Math.max(1, i3))) - 1);
    }

    public static final int frameNumberFromMicros(long j2, int i2) {
        return (int) ((j2 * ((long) i2)) / 100000000);
    }

    public static final int frameNumberFromNanos(long j2, int i2) {
        return (int) ((j2 * ((long) i2)) / 100000000000L);
    }

    public static final int frameNumberFromPTSNanos(long j2, int i2) {
        return (int) ((j2 * ((long) i2)) / 100000000000L);
    }

    public static final int frameNumberFromPTSTime(int i2, int i3) {
        return (int) ((((long) i2) * ((long) i3)) / ((long) 100000));
    }

    public static final int frameNumberFromTime(int i2, int i3) {
        return (int) ((((long) i2) * ((long) i3)) / ((long) 100000));
    }

    public static final int frameStartTimeFromFrameNumber(int i2, int i3) {
        return (int) ((((long) i2) * ((long) 100000)) / ((long) Math.max(1, i3)));
    }

    public static final long microsFromFrameNumber(int i2, int i3) {
        return ((((long) i2) * 100000000) + 50000000) / ((long) Math.max(1, i3));
    }

    public static final long nanosFromFrameNumber(int i2, int i3) {
        return ((((long) i2) * 100000000000L) + 50000000000L) / ((long) Math.max(1, i3));
    }

    public static final int timeFromFrameNumber(int i2, int i3) {
        return (int) (((((long) i2) * ((long) 100000)) + ((long) 50000)) / ((long) Math.max(1, i3)));
    }

    public static final String formatFPS(int i2) {
        int i3 = i2 % 100;
        if (i3 == 0) {
            return String.valueOf(i2 / 100);
        }
        return (i2 / 100) + "." + StringsKt.padStart(String.valueOf(i3), 2, '0');
    }

    public static final String formatFrameNumber(int i2, int i3, String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        if (i3 == 0) {
            return "";
        }
        int iAbs = Math.abs(i2);
        int iMax = (iAbs * 100) / Math.max(1, i3);
        int i5 = iAbs - ((i3 * iMax) / 100);
        int i7 = iMax % 60;
        int i8 = iMax / 60;
        int i9 = i8 % 60;
        int i10 = i8 / 60;
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(format, "hhh", zeroPad3(i10), false, 4, (Object) null), "hh", zeroPad2(i10), false, 4, (Object) null), "mm", zeroPad2(i9), false, 4, (Object) null), "ss", zeroPad2(i7), false, 4, (Object) null), "ff", zeroPad2(i5), false, 4, (Object) null), CmcdData.STREAMING_FORMAT_HLS, String.valueOf(i10), false, 4, (Object) null), "m", String.valueOf(i9), false, 4, (Object) null), CmcdData.STREAMING_FORMAT_SS, String.valueOf(i7), false, 4, (Object) null), InneractiveMediationDefs.GENDER_FEMALE, String.valueOf(i5), false, 4, (Object) null), "-", i2 < 0 ? "-" : "", false, 4, (Object) null), "+", i2 >= 0 ? "+" : "-", false, 4, (Object) null);
    }

    public static final String formatTimeMillis(int i2, String str, boolean z2) {
        String format = str;
        Intrinsics.checkNotNullParameter(format, "format");
        int iAbs = Math.abs(i2);
        int i3 = iAbs / 1000;
        int i5 = iAbs - (i3 * 1000);
        int i7 = i3 % 60;
        int i8 = i3 / 60;
        int i9 = i8 % 60;
        int i10 = i8 / 60;
        if (z2) {
            if (StringsKt.startsWith$default(format, "hhh:", false, 2, (Object) null) && i10 == 0) {
                format = StringsKt.drop(format, 4);
            } else if (StringsKt.startsWith$default(format, "hh:", false, 2, (Object) null) && i10 == 0) {
                format = StringsKt.drop(format, 3);
            } else if (StringsKt.startsWith$default(format, "h:", false, 2, (Object) null) && i10 == 0) {
                format = StringsKt.drop(format, 2);
            }
        }
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(format, "hhh", zeroPad3(i10), false, 4, (Object) null), "hh", zeroPad2(i10), false, 4, (Object) null), "mm", zeroPad2(i9), false, 4, (Object) null), "ss", zeroPad2(i7), false, 4, (Object) null), "ttt", zeroPad3(i5), false, 4, (Object) null), TtmlNode.TAG_TT, zeroPad2(i5 / 10), false, 4, (Object) null), CmcdData.STREAMING_FORMAT_HLS, String.valueOf(i10), false, 4, (Object) null), "m", String.valueOf(i9), false, 4, (Object) null), CmcdData.STREAMING_FORMAT_SS, String.valueOf(i7), false, 4, (Object) null), InneractiveMediationDefs.GENDER_FEMALE, String.valueOf(i5), false, 4, (Object) null), "-", i2 < 0 ? "-" : "", false, 4, (Object) null), "+", i2 >= 0 ? "+" : "-", false, 4, (Object) null);
    }

    public static /* synthetic */ String formatTimeMillis$default(int i2, String str, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = true;
        }
        return formatTimeMillis(i2, str, z2);
    }

    private static final String zeroPad2(int i2) {
        if (i2 > 99) {
            return "??";
        }
        if (i2 >= 10) {
            return String.valueOf(i2);
        }
        return "0" + i2;
    }

    private static final String zeroPad3(int i2) {
        StringBuilder sb;
        String str;
        if (i2 > 999) {
            return "??";
        }
        if (i2 < 10) {
            sb = new StringBuilder();
            str = "00";
        } else {
            if (i2 >= 100) {
                return String.valueOf(i2);
            }
            sb = new StringBuilder();
            str = "0";
        }
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static final int differenceFromFrameTime(int i2, int i3) {
        return i2 - roundToFrame(i2, i3);
    }

    public static final int frameNumberFromStartTime(int i2, int i3) {
        long j2;
        if (i2 < 0) {
            j2 = ((((long) i2) * ((long) i3)) - ((long) 50000)) / ((long) 100000);
        } else {
            j2 = ((((long) i2) * ((long) i3)) + ((long) 50000)) / ((long) 100000);
        }
        return (int) j2;
    }

    public static final int roundToFrame(int i2, int i3) {
        return timeFromFrameNumber(frameNumberFromTime(i2, i3), i3);
    }

    public static final int roundToFrameEndTime(int i2, int i3) {
        return frameEndTimeFromFrameNumber(frameNumberFromTime(i2, i3), i3);
    }

    public static final long roundToFrameNanos(long j2, int i2) {
        return nanosFromFrameNumber(frameNumberFromNanos(j2, i2), i2);
    }

    public static final int roundToFrameStartTime(int i2, int i3) {
        return frameStartTimeFromFrameNumber(frameNumberFromTime(i2, i3), i3);
    }
}
