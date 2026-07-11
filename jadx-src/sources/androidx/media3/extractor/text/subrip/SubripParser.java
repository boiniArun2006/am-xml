package androidx.media3.extractor.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.nKK;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@UnstableApi
public final class SubripParser implements SubtitleParser {
    private static final String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final String ALIGN_MID_LEFT = "{\\an4}";
    private static final String ALIGN_MID_MID = "{\\an5}";
    private static final String ALIGN_MID_RIGHT = "{\\an6}";
    private static final String ALIGN_TOP_LEFT = "{\\an7}";
    private static final String ALIGN_TOP_MID = "{\\an8}";
    private static final String ALIGN_TOP_RIGHT = "{\\an9}";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?";
    private static final String TAG = "SubripParser";
    private static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern SUBRIP_TAG_PATTERN = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder textBuilder = new StringBuilder();
    private final ArrayList<String> tags = new ArrayList<>();
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Cue buildCue(Spanned spanned, @Nullable String str) {
        byte b2;
        byte b4;
        Cue.Builder text = new Cue.Builder().setText(spanned);
        if (str == null) {
            return text.build();
        }
        switch (str.hashCode()) {
            case -685620710:
                b2 = !str.equals(ALIGN_BOTTOM_LEFT) ? (byte) -1 : (byte) 0;
                break;
            case -685620679:
                if (str.equals(ALIGN_BOTTOM_MID)) {
                    b2 = 6;
                    break;
                }
                break;
            case -685620648:
                if (str.equals(ALIGN_BOTTOM_RIGHT)) {
                    b2 = 3;
                    break;
                }
                break;
            case -685620617:
                if (str.equals(ALIGN_MID_LEFT)) {
                    b2 = 1;
                    break;
                }
                break;
            case -685620586:
                if (str.equals(ALIGN_MID_MID)) {
                    b2 = 7;
                    break;
                }
                break;
            case -685620555:
                if (str.equals(ALIGN_MID_RIGHT)) {
                    b2 = 4;
                    break;
                }
                break;
            case -685620524:
                if (str.equals(ALIGN_TOP_LEFT)) {
                    b2 = 2;
                    break;
                }
                break;
            case -685620493:
                if (str.equals(ALIGN_TOP_MID)) {
                    b2 = 8;
                    break;
                }
                break;
            case -685620462:
                if (str.equals(ALIGN_TOP_RIGHT)) {
                    b2 = 5;
                    break;
                }
                break;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2) {
            text.setPositionAnchor(0);
        } else if (b2 == 3 || b2 == 4 || b2 == 5) {
            text.setPositionAnchor(2);
        } else {
            text.setPositionAnchor(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                b4 = !str.equals(ALIGN_BOTTOM_LEFT) ? (byte) -1 : (byte) 0;
                break;
            case -685620679:
                if (str.equals(ALIGN_BOTTOM_MID)) {
                    b4 = 1;
                    break;
                }
                break;
            case -685620648:
                if (str.equals(ALIGN_BOTTOM_RIGHT)) {
                    b4 = 2;
                    break;
                }
                break;
            case -685620617:
                if (str.equals(ALIGN_MID_LEFT)) {
                    b4 = 6;
                    break;
                }
                break;
            case -685620586:
                if (str.equals(ALIGN_MID_MID)) {
                    b4 = 7;
                    break;
                }
                break;
            case -685620555:
                if (str.equals(ALIGN_MID_RIGHT)) {
                    b4 = 8;
                    break;
                }
                break;
            case -685620524:
                if (str.equals(ALIGN_TOP_LEFT)) {
                    b4 = 3;
                    break;
                }
                break;
            case -685620493:
                if (str.equals(ALIGN_TOP_MID)) {
                    b4 = 4;
                    break;
                }
                break;
            case -685620462:
                if (str.equals(ALIGN_TOP_RIGHT)) {
                    b4 = 5;
                    break;
                }
                break;
        }
        if (b4 == 0 || b4 == 1 || b4 == 2) {
            text.setLineAnchor(2);
        } else if (b4 == 3 || b4 == 4 || b4 == 5) {
            text.setLineAnchor(0);
        } else {
            text.setLineAnchor(1);
        }
        return text.setPosition(getFractionalPositionForAnchorType(text.getPositionAnchor())).setLine(getFractionalPositionForAnchorType(text.getLineAnchor()), 0).build();
    }

    @VisibleForTesting
    public static float getFractionalPositionForAnchorType(int i2) {
        if (i2 == 0) {
            return 0.08f;
        }
        if (i2 == 1) {
            return 0.5f;
        }
        if (i2 == 2) {
            return END_FRACTION;
        }
        throw new IllegalArgumentException();
    }

    private static long parseTimecode(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2 + 1);
        long j2 = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i2 + 2))) * 60000) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i2 + 3))) * 1000);
        String strGroup2 = matcher.group(i2 + 4);
        if (strGroup2 != null) {
            j2 += Long.parseLong(strGroup2);
        }
        return j2 * 1000;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        long j2;
        String line;
        String str;
        this.parsableByteArray.reset(bArr, i2 + i3);
        this.parsableByteArray.setPosition(i2);
        Charset charsetDetectUtfCharset = detectUtfCharset(this.parsableByteArray);
        long j3 = -9223372036854775807L;
        ArrayList arrayList = (outputOptions.startTimeUs == -9223372036854775807L || !outputOptions.outputAllCues) ? null : new ArrayList();
        while (true) {
            String line2 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
            if (line2 == null) {
                break;
            }
            if (line2.length() != 0) {
                try {
                    Integer.parseInt(line2);
                    line = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                } catch (NumberFormatException unused) {
                    j2 = j3;
                    Log.w(TAG, "Skipping invalid index: " + line2);
                }
                if (line == null) {
                    Log.w(TAG, "Unexpected end");
                    break;
                }
                Matcher matcher = SUBRIP_TIMING_LINE.matcher(line);
                if (matcher.matches()) {
                    long timecode = parseTimecode(matcher, 1);
                    long timecode2 = parseTimecode(matcher, 6);
                    int i5 = 0;
                    this.textBuilder.setLength(0);
                    this.tags.clear();
                    String line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                    while (!TextUtils.isEmpty(line3)) {
                        if (this.textBuilder.length() > 0) {
                            this.textBuilder.append("<br>");
                        }
                        this.textBuilder.append(processLine(line3, this.tags));
                        line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                    }
                    Spanned spannedFromHtml = Html.fromHtml(this.textBuilder.toString());
                    while (true) {
                        if (i5 >= this.tags.size()) {
                            str = null;
                            break;
                        }
                        str = this.tags.get(i5);
                        if (str.matches(SUBRIP_ALIGNMENT_TAG)) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    j2 = j3;
                    long j4 = outputOptions.startTimeUs;
                    if (j4 == j2 || timecode >= j4) {
                        consumer.accept(new CuesWithTiming(nKK.o(buildCue(spannedFromHtml, str)), timecode, timecode2 - timecode));
                    } else if (arrayList != null) {
                        arrayList.add(new CuesWithTiming(nKK.o(buildCue(spannedFromHtml, str)), timecode, timecode2 - timecode));
                    }
                } else {
                    j2 = j3;
                    Log.w(TAG, "Skipping invalid timing: " + line);
                }
                j3 = j2;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                consumer.accept((CuesWithTiming) it.next());
            }
        }
    }

    private Charset detectUtfCharset(ParsableByteArray parsableByteArray) {
        Charset utfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        if (utfCharsetFromBom != null) {
            return utfCharsetFromBom;
        }
        return StandardCharsets.UTF_8;
    }

    private String processLine(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = SUBRIP_TAG_PATTERN.matcher(strTrim);
        int i2 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i2;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i2 += length;
        }
        return sb.toString();
    }
}
