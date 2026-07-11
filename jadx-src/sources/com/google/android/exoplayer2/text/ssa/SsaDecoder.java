package com.google.android.exoplayer2.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.ssa.SsaStyle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t1.AbstractC2372w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class SsaDecoder extends SimpleSubtitleDecoder {
    private static final float DEFAULT_MARGIN = 0.05f;
    private static final String DIALOGUE_LINE_PREFIX = "Dialogue:";
    static final String FORMAT_LINE_PREFIX = "Format:";
    private static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    static final String STYLE_LINE_PREFIX = "Style:";
    private static final String TAG = "SsaDecoder";

    @Nullable
    private final j dialogueFormatFromInitializationData;
    private final boolean haveInitializationData;
    private float screenHeight;
    private float screenWidth;
    private Map<String, SsaStyle> styles;

    public SsaDecoder() {
        this(null);
    }

    private static float computeDefaultLineOrPosition(int i2) {
        if (i2 == 0) {
            return DEFAULT_MARGIN;
        }
        if (i2 != 1) {
            return i2 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    @Nullable
    private static Layout.Alignment toTextAlignment(int i2) {
        switch (i2) {
            case -1:
                return null;
            case 0:
            default:
                Log.w(TAG, "Unknown alignment: " + i2);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public SsaDecoder(@Nullable List<byte[]> list) {
        super(TAG);
        this.screenWidth = -3.4028235E38f;
        this.screenHeight = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.haveInitializationData = false;
            this.dialogueFormatFromInitializationData = null;
            return;
        }
        this.haveInitializationData = true;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(list.get(0));
        Assertions.checkArgument(strFromUtf8Bytes.startsWith(FORMAT_LINE_PREFIX));
        this.dialogueFormatFromInitializationData = (j) Assertions.checkNotNull(j.n(strFromUtf8Bytes));
        parseHeader(new ParsableByteArray(list.get(1)));
    }

    private static Cue createCue(String str, @Nullable SsaStyle ssaStyle, SsaStyle.n nVar, float f3, float f4) {
        SpannableString spannableString = new SpannableString(str);
        Cue.Builder text = new Cue.Builder().setText(spannableString);
        if (ssaStyle != null) {
            if (ssaStyle.f58319t != null) {
                spannableString.setSpan(new ForegroundColorSpan(ssaStyle.f58319t.intValue()), 0, spannableString.length(), 33);
            }
            if (ssaStyle.mUb == 3 && ssaStyle.nr != null) {
                spannableString.setSpan(new BackgroundColorSpan(ssaStyle.nr.intValue()), 0, spannableString.length(), 33);
            }
            float f5 = ssaStyle.f58317O;
            if (f5 != -3.4028235E38f && f4 != -3.4028235E38f) {
                text.setTextSize(f5 / f4, 1);
            }
            boolean z2 = ssaStyle.J2;
            if (z2 && ssaStyle.Uo) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z2) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (ssaStyle.Uo) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (ssaStyle.KN) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (ssaStyle.xMQ) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i2 = nVar.f58325n;
        if (i2 == -1) {
            i2 = ssaStyle != null ? ssaStyle.rl : -1;
        }
        text.setTextAlignment(toTextAlignment(i2)).setPositionAnchor(toPositionAnchor(i2)).setLineAnchor(toLineAnchor(i2));
        PointF pointF = nVar.rl;
        if (pointF == null || f4 == -3.4028235E38f || f3 == -3.4028235E38f) {
            text.setPosition(computeDefaultLineOrPosition(text.getPositionAnchor()));
            text.setLine(computeDefaultLineOrPosition(text.getLineAnchor()), 0);
        } else {
            text.setPosition(pointF.x / f3);
            text.setLine(nVar.rl.y / f4, 0);
        }
        return text.build();
    }

    private void parseDialogueLine(String str, j jVar, List<List<Cue>> list, List<Long> list2) {
        int i2;
        Assertions.checkArgument(str.startsWith(DIALOGUE_LINE_PREFIX));
        String[] strArrSplit = str.substring(9).split(",", jVar.f58326O);
        if (strArrSplit.length != jVar.f58326O) {
            Log.w(TAG, "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long timecodeUs = parseTimecodeUs(strArrSplit[jVar.f58327n]);
        if (timecodeUs == -9223372036854775807L) {
            Log.w(TAG, "Skipping invalid timing: " + str);
            return;
        }
        long timecodeUs2 = parseTimecodeUs(strArrSplit[jVar.rl]);
        if (timecodeUs2 == -9223372036854775807L) {
            Log.w(TAG, "Skipping invalid timing: " + str);
            return;
        }
        Map<String, SsaStyle> map = this.styles;
        SsaStyle ssaStyle = (map == null || (i2 = jVar.f58328t) == -1) ? null : map.get(strArrSplit[i2].trim());
        String str2 = strArrSplit[jVar.nr];
        Cue cueCreateCue = createCue(SsaStyle.n.nr(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), ssaStyle, SsaStyle.n.rl(str2), this.screenWidth, this.screenHeight);
        int iAddCuePlacerholderByTime = addCuePlacerholderByTime(timecodeUs2, list2, list);
        for (int iAddCuePlacerholderByTime2 = addCuePlacerholderByTime(timecodeUs, list2, list); iAddCuePlacerholderByTime2 < iAddCuePlacerholderByTime; iAddCuePlacerholderByTime2++) {
            list.get(iAddCuePlacerholderByTime2).add(cueCreateCue);
        }
    }

    private void parseEventBody(ParsableByteArray parsableByteArray, List<List<Cue>> list, List<Long> list2) {
        j jVarN = this.haveInitializationData ? this.dialogueFormatFromInitializationData : null;
        while (true) {
            String line = parsableByteArray.readLine();
            if (line == null) {
                return;
            }
            if (line.startsWith(FORMAT_LINE_PREFIX)) {
                jVarN = j.n(line);
            } else if (line.startsWith(DIALOGUE_LINE_PREFIX)) {
                if (jVarN == null) {
                    Log.w(TAG, "Skipping dialogue line before complete format: " + line);
                } else {
                    parseDialogueLine(line, jVarN, list, list2);
                }
            }
        }
    }

    private static Map<String, SsaStyle> parseStyles(ParsableByteArray parsableByteArray) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SsaStyle.j jVarN = null;
        while (true) {
            String line = parsableByteArray.readLine();
            if (line == null || (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekUnsignedByte() == 91)) {
                break;
            }
            if (line.startsWith(FORMAT_LINE_PREFIX)) {
                jVarN = SsaStyle.j.n(line);
            } else if (line.startsWith(STYLE_LINE_PREFIX)) {
                if (jVarN == null) {
                    Log.w(TAG, "Skipping 'Style:' line before 'Format:' line: " + line);
                } else {
                    SsaStyle ssaStyleRl = SsaStyle.rl(line, jVarN);
                    if (ssaStyleRl != null) {
                        linkedHashMap.put(ssaStyleRl.f58318n, ssaStyleRl);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long parseTimecodeUs(String str) {
        Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) Util.castNonNull(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) Util.castNonNull(matcher.group(2))) * 60000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(3))) * 1000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int toLineAnchor(int i2) {
        switch (i2) {
            case -1:
                break;
            case 0:
            default:
                Log.w(TAG, "Unknown alignment: " + i2);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int toPositionAnchor(int i2) {
        switch (i2) {
            case -1:
                break;
            case 0:
            default:
                Log.w(TAG, "Unknown alignment: " + i2);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected Subtitle decode(byte[] bArr, int i2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i2);
        if (!this.haveInitializationData) {
            parseHeader(parsableByteArray);
        }
        parseEventBody(parsableByteArray, arrayList, arrayList2);
        return new n(arrayList, arrayList2);
    }

    private static int addCuePlacerholderByTime(long j2, List<Long> list, List<List<Cue>> list2) {
        int i2;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size >= 0) {
                if (list.get(size).longValue() == j2) {
                    return size;
                }
                if (list.get(size).longValue() < j2) {
                    i2 = size + 1;
                    break;
                }
                size--;
            } else {
                i2 = 0;
                break;
            }
        }
        list.add(i2, Long.valueOf(j2));
        if (i2 == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(list2.get(i2 - 1));
        }
        list2.add(i2, arrayList);
        return i2;
    }

    private void parseHeader(ParsableByteArray parsableByteArray) {
        while (true) {
            String line = parsableByteArray.readLine();
            if (line != null) {
                if ("[Script Info]".equalsIgnoreCase(line)) {
                    parseScriptInfo(parsableByteArray);
                } else if ("[V4+ Styles]".equalsIgnoreCase(line)) {
                    this.styles = parseStyles(parsableByteArray);
                } else if ("[V4 Styles]".equalsIgnoreCase(line)) {
                    Log.i(TAG, "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(line)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void parseScriptInfo(ParsableByteArray parsableByteArray) {
        while (true) {
            String line = parsableByteArray.readLine();
            if (line != null) {
                if (parsableByteArray.bytesLeft() == 0 || parsableByteArray.peekUnsignedByte() != 91) {
                    String[] strArrSplit = line.split(":");
                    if (strArrSplit.length == 2) {
                        String strO = AbstractC2372w6.O(strArrSplit[0].trim());
                        strO.getClass();
                        if (!strO.equals("playresx")) {
                            if (strO.equals("playresy")) {
                                try {
                                    this.screenHeight = Float.parseFloat(strArrSplit[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        } else {
                            this.screenWidth = Float.parseFloat(strArrSplit[1].trim());
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
