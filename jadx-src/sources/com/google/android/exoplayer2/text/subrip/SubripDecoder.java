package com.google.android.exoplayer2.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class SubripDecoder extends SimpleSubtitleDecoder {
    private static final String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final String ALIGN_MID_LEFT = "{\\an4}";
    private static final String ALIGN_MID_MID = "{\\an5}";
    private static final String ALIGN_MID_RIGHT = "{\\an6}";
    private static final String ALIGN_TOP_LEFT = "{\\an7}";
    private static final String ALIGN_TOP_MID = "{\\an8}";
    private static final String ALIGN_TOP_RIGHT = "{\\an9}";
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";
    private static final String TAG = "SubripDecoder";
    private final ArrayList<String> tags;
    private final StringBuilder textBuilder;
    private static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern SUBRIP_TAG_PATTERN = Pattern.compile("\\{\\\\.*?\\}");

    public SubripDecoder() {
        super(TAG);
        this.textBuilder = new StringBuilder();
        this.tags = new ArrayList<>();
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

    static float getFractionalPositionForAnchorType(int i2) {
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

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected Subtitle decode(byte[] bArr, int i2, boolean z2) {
        String str;
        ArrayList arrayList = new ArrayList();
        LongArray longArray = new LongArray();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i2);
        while (true) {
            String line = parsableByteArray.readLine();
            int i3 = 0;
            if (line == null) {
                break;
            }
            if (line.length() != 0) {
                try {
                    Integer.parseInt(line);
                    String line2 = parsableByteArray.readLine();
                    if (line2 == null) {
                        Log.w(TAG, "Unexpected end");
                        break;
                    }
                    Matcher matcher = SUBRIP_TIMING_LINE.matcher(line2);
                    if (matcher.matches()) {
                        longArray.add(parseTimecode(matcher, 1));
                        longArray.add(parseTimecode(matcher, 6));
                        this.textBuilder.setLength(0);
                        this.tags.clear();
                        for (String line3 = parsableByteArray.readLine(); !TextUtils.isEmpty(line3); line3 = parsableByteArray.readLine()) {
                            if (this.textBuilder.length() > 0) {
                                this.textBuilder.append("<br>");
                            }
                            this.textBuilder.append(processLine(line3, this.tags));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.textBuilder.toString());
                        while (true) {
                            if (i3 >= this.tags.size()) {
                                str = null;
                                break;
                            }
                            str = this.tags.get(i3);
                            if (str.matches(SUBRIP_ALIGNMENT_TAG)) {
                                break;
                            }
                            i3++;
                        }
                        arrayList.add(buildCue(spannedFromHtml, str));
                        arrayList.add(Cue.EMPTY);
                    } else {
                        Log.w(TAG, "Skipping invalid timing: " + line2);
                    }
                } catch (NumberFormatException unused) {
                    Log.w(TAG, "Skipping invalid index: " + line);
                }
            }
        }
        return new j((Cue[]) arrayList.toArray(new Cue[0]), longArray.toArray());
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
