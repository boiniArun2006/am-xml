package com.google.android.exoplayer2.text.webvtt;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan;
import com.google.android.exoplayer2.text.span.RubySpan;
import com.google.android.exoplayer2.text.span.SpanUtil;
import com.google.android.exoplayer2.text.webvtt.WebvttCueParser;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class WebvttCueParser {
    private static final char CHAR_AMPERSAND = '&';
    private static final char CHAR_GREATER_THAN = '>';
    private static final char CHAR_LESS_THAN = '<';
    private static final char CHAR_SEMI_COLON = ';';
    private static final char CHAR_SLASH = '/';
    private static final char CHAR_SPACE = ' ';
    public static final Pattern CUE_HEADER_PATTERN = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern CUE_SETTING_PATTERN = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map<String, Integer> DEFAULT_BACKGROUND_COLORS;
    static final float DEFAULT_POSITION = 0.5f;
    private static final Map<String, Integer> DEFAULT_TEXT_COLORS;
    private static final String ENTITY_AMPERSAND = "amp";
    private static final String ENTITY_GREATER_THAN = "gt";
    private static final String ENTITY_LESS_THAN = "lt";
    private static final String ENTITY_NON_BREAK_SPACE = "nbsp";
    private static final int STYLE_BOLD = 1;
    private static final int STYLE_ITALIC = 2;
    private static final String TAG = "WebvttCueParser";
    private static final String TAG_BOLD = "b";
    private static final String TAG_CLASS = "c";
    private static final String TAG_ITALIC = "i";
    private static final String TAG_LANG = "lang";
    private static final String TAG_RUBY = "ruby";
    private static final String TAG_RUBY_TEXT = "rt";
    private static final String TAG_UNDERLINE = "u";
    private static final String TAG_VOICE = "v";
    private static final int TEXT_ALIGNMENT_CENTER = 2;
    private static final int TEXT_ALIGNMENT_END = 3;
    private static final int TEXT_ALIGNMENT_LEFT = 4;
    private static final int TEXT_ALIGNMENT_RIGHT = 5;
    private static final int TEXT_ALIGNMENT_START = 1;

    private static final class I28 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public CharSequence f58363t;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f58362n = 0;
        public long rl = 0;
        public int nr = 2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f58361O = -3.4028235E38f;
        public int J2 = 1;
        public int Uo = 0;
        public float KN = -3.4028235E38f;
        public int xMQ = Integer.MIN_VALUE;
        public float mUb = 1.0f;
        public int gh = Integer.MIN_VALUE;

        private static int J2(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 3) {
                return 2;
            }
            if (i2 != 4) {
                return i2 != 5 ? 1 : 2;
            }
            return 0;
        }

        private static float O(int i2) {
            if (i2 != 4) {
                return i2 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static float rl(float f3, int i2) {
            if (f3 == -3.4028235E38f || i2 != 0 || (f3 >= 0.0f && f3 <= 1.0f)) {
                return f3 != -3.4028235E38f ? f3 : i2 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment t(int i2) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            Log.w(WebvttCueParser.TAG, "Unknown textAlignment: " + i2);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float nr(int i2, float f3) {
            if (i2 == 0) {
                return 1.0f - f3;
            }
            if (i2 == 1) {
                return f3 <= 0.5f ? f3 * 2.0f : (1.0f - f3) * 2.0f;
            }
            if (i2 == 2) {
                return f3;
            }
            throw new IllegalStateException(String.valueOf(i2));
        }

        public Cue.Builder Uo() {
            float fO = this.KN;
            if (fO == -3.4028235E38f) {
                fO = O(this.nr);
            }
            int iJ2 = this.xMQ;
            if (iJ2 == Integer.MIN_VALUE) {
                iJ2 = J2(this.nr);
            }
            Cue.Builder verticalType = new Cue.Builder().setTextAlignment(t(this.nr)).setLine(rl(this.f58361O, this.J2), this.J2).setLineAnchor(this.Uo).setPosition(fO).setPositionAnchor(iJ2).setSize(Math.min(this.mUb, nr(iJ2, fO))).setVerticalType(this.gh);
            CharSequence charSequence = this.f58363t;
            if (charSequence != null) {
                verticalType.setText(charSequence);
            }
            return verticalType;
        }

        public WebvttCueInfo n() {
            return new WebvttCueInfo(Uo().build(), this.f58362n, this.rl);
        }
    }

    private static final class Ml implements Comparable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58364n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final WebvttCssStyle f58365t;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(Ml ml) {
            return Integer.compare(this.f58364n, ml.f58364n);
        }

        public Ml(int i2, WebvttCssStyle webvttCssStyle) {
            this.f58364n = i2;
            this.f58365t = webvttCssStyle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class n {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final Comparator f58366t = new Comparator() { // from class: com.google.android.exoplayer2.text.webvtt.w6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((WebvttCueParser.n) obj).f58367n.rl, ((WebvttCueParser.n) obj2).f58367n.rl);
            }
        };

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final w6 f58367n;
        private final int rl;

        private n(w6 w6Var, int i2) {
            this.f58367n = w6Var;
            this.rl = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f58368n;
        public final Set nr;
        public final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final String f58369t;

        public static w6 rl() {
            return new w6("", 0, "", Collections.EMPTY_SET);
        }

        private w6(String str, int i2, String str2, Set set) {
            this.rl = i2;
            this.f58368n = str;
            this.f58369t = str2;
            this.nr = set;
        }

        public static w6 n(String str, int i2) {
            String str2;
            String strTrim = str.trim();
            Assertions.checkArgument(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrSplit = Util.split(strTrim, "\\.");
            String str3 = strArrSplit[0];
            HashSet hashSet = new HashSet();
            for (int i3 = 1; i3 < strArrSplit.length; i3++) {
                hashSet.add(strArrSplit[i3]);
            }
            return new w6(str3, i2, str2, hashSet);
        }
    }

    private static void applySpansForTag(@Nullable String str, w6 w6Var, List<n> list, SpannableStringBuilder spannableStringBuilder, List<WebvttCssStyle> list2) {
        int i2;
        int length;
        i2 = w6Var.rl;
        length = spannableStringBuilder.length();
        String str2 = w6Var.f58368n;
        str2.getClass();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case "c":
                applyDefaultColors(spannableStringBuilder, w6Var.nr, i2, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case "ruby":
                applyRubySpans(spannableStringBuilder, str, w6Var, list, list2);
                break;
            default:
                return;
        }
        List<Ml> applicableStyles = getApplicableStyles(list2, str, w6Var);
        for (int i3 = 0; i3 < applicableStyles.size(); i3++) {
            applyStyleToText(spannableStringBuilder, applicableStyles.get(i3).f58365t, i2, length);
        }
    }

    private static int firstKnownRubyPosition(int i2, int i3, int i5) {
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        if (i5 != -1) {
            return i5;
        }
        throw new IllegalArgumentException();
    }

    private static boolean isSupportedTag(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    @Nullable
    public static WebvttCueInfo parseCue(ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
        String line = parsableByteArray.readLine();
        if (line == null) {
            return null;
        }
        Pattern pattern = CUE_HEADER_PATTERN;
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return parseCue(null, matcher, parsableByteArray, list);
        }
        String line2 = parsableByteArray.readLine();
        if (line2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(line2);
        if (matcher2.matches()) {
            return parseCue(line.trim(), matcher2, parsableByteArray, list);
        }
        return null;
    }

    static Cue.Builder parseCueSettingsList(String str) {
        I28 i28 = new I28();
        parseCueSettingsList(str, i28);
        return i28.Uo();
    }

    private static int parseLineAnchor(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                Log.w(TAG, "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static int parsePositionAnchor(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                Log.w(TAG, "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static int parseTextAlignment(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                Log.w(TAG, "Invalid alignment value: " + str);
                return 2;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        DEFAULT_TEXT_COLORS = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        DEFAULT_BACKGROUND_COLORS = Collections.unmodifiableMap(map2);
    }

    private static void applyStyleToText(SpannableStringBuilder spannableStringBuilder, WebvttCssStyle webvttCssStyle, int i2, int i3) {
        if (webvttCssStyle == null) {
            return;
        }
        if (webvttCssStyle.getStyle() != -1) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new StyleSpan(webvttCssStyle.getStyle()), i2, i3, 33);
        }
        if (webvttCssStyle.isLinethrough()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (webvttCssStyle.isUnderline()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (webvttCssStyle.hasFontColor()) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new ForegroundColorSpan(webvttCssStyle.getFontColor()), i2, i3, 33);
        }
        if (webvttCssStyle.hasBackgroundColor()) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new BackgroundColorSpan(webvttCssStyle.getBackgroundColor()), i2, i3, 33);
        }
        if (webvttCssStyle.getFontFamily() != null) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new TypefaceSpan(webvttCssStyle.getFontFamily()), i2, i3, 33);
        }
        int fontSizeUnit = webvttCssStyle.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new AbsoluteSizeSpan((int) webvttCssStyle.getFontSize(), true), i2, i3, 33);
        } else if (fontSizeUnit == 2) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.getFontSize()), i2, i3, 33);
        } else if (fontSizeUnit == 3) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.getFontSize() / 100.0f), i2, i3, 33);
        }
        if (webvttCssStyle.getCombineUpright()) {
            spannableStringBuilder.setSpan(new HorizontalTextInVerticalContextSpan(), i2, i3, 33);
        }
    }

    private static int findEndOfTag(String str, int i2) {
        int iIndexOf = str.indexOf(62, i2);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static List<Ml> getApplicableStyles(List<WebvttCssStyle> list, @Nullable String str, w6 w6Var) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            WebvttCssStyle webvttCssStyle = list.get(i2);
            int specificityScore = webvttCssStyle.getSpecificityScore(str, w6Var.f58368n, w6Var.nr, w6Var.f58369t);
            if (specificityScore > 0) {
                arrayList.add(new Ml(specificityScore, webvttCssStyle));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    static Cue newCueForText(CharSequence charSequence) {
        I28 i28 = new I28();
        i28.f58363t = charSequence;
        return i28.Uo().build();
    }

    static SpannedString parseCueText(@Nullable String str, String str2, List<WebvttCssStyle> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str2.length()) {
            char cCharAt = str2.charAt(i2);
            if (cCharAt == '&') {
                i2++;
                int iIndexOf = str2.indexOf(59, i2);
                int iIndexOf2 = str2.indexOf(32, i2);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    applyEntity(str2.substring(i2, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i2 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i2++;
            } else {
                int iFindEndOfTag = i2 + 1;
                if (iFindEndOfTag < str2.length()) {
                    boolean z2 = str2.charAt(iFindEndOfTag) == '/';
                    iFindEndOfTag = findEndOfTag(str2, iFindEndOfTag);
                    int i3 = iFindEndOfTag - 2;
                    boolean z3 = str2.charAt(i3) == '/';
                    int i5 = i2 + (z2 ? 2 : 1);
                    if (!z3) {
                        i3 = iFindEndOfTag - 1;
                    }
                    String strSubstring = str2.substring(i5, i3);
                    if (!strSubstring.trim().isEmpty()) {
                        String tagName = getTagName(strSubstring);
                        if (isSupportedTag(tagName)) {
                            if (z2) {
                                while (!arrayDeque.isEmpty()) {
                                    w6 w6Var = (w6) arrayDeque.pop();
                                    applySpansForTag(str, w6Var, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new n(w6Var, spannableStringBuilder.length()));
                                    }
                                    if (w6Var.f58368n.equals(tagName)) {
                                        break;
                                    }
                                }
                            } else if (!z3) {
                                arrayDeque.push(w6.n(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i2 = iFindEndOfTag;
            }
        }
        while (!arrayDeque.isEmpty()) {
            applySpansForTag(str, (w6) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        applySpansForTag(str, w6.rl(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static void parseLineAttribute(String str, I28 i28) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            i28.Uo = parseLineAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            i28.f58361O = WebvttParserUtil.parsePercentage(str);
            i28.J2 = 0;
        } else {
            i28.f58361O = Integer.parseInt(str);
            i28.J2 = 1;
        }
    }

    private static void parsePositionAttribute(String str, I28 i28) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            i28.xMQ = parsePositionAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        i28.KN = WebvttParserUtil.parsePercentage(str);
    }

    private static void applyDefaultColors(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i2, int i3) {
        for (String str : set) {
            Map<String, Integer> map = DEFAULT_TEXT_COLORS;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i2, i3, 33);
            } else {
                Map<String, Integer> map2 = DEFAULT_BACKGROUND_COLORS;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i2, i3, 33);
                }
            }
        }
    }

    private static void applyEntity(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(CHAR_SPACE);
                break;
            default:
                Log.w(TAG, "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void applyRubySpans(SpannableStringBuilder spannableStringBuilder, @Nullable String str, w6 w6Var, List<n> list, List<WebvttCssStyle> list2) {
        int rubyPosition = getRubyPosition(list2, str, w6Var);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, n.f58366t);
        int i2 = w6Var.rl;
        int length = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (TAG_RUBY_TEXT.equals(((n) arrayList.get(i3)).f58367n.f58368n)) {
                n nVar = (n) arrayList.get(i3);
                int iFirstKnownRubyPosition = firstKnownRubyPosition(getRubyPosition(list2, str, nVar.f58367n), rubyPosition, 1);
                int i5 = nVar.f58367n.rl - length;
                int i7 = nVar.rl - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i7);
                spannableStringBuilder.delete(i5, i7);
                spannableStringBuilder.setSpan(new RubySpan(charSequenceSubSequence.toString(), iFirstKnownRubyPosition), i2, i5, 33);
                length += charSequenceSubSequence.length();
                i2 = i5;
            }
        }
    }

    private static int getRubyPosition(List<WebvttCssStyle> list, @Nullable String str, w6 w6Var) {
        List<Ml> applicableStyles = getApplicableStyles(list, str, w6Var);
        for (int i2 = 0; i2 < applicableStyles.size(); i2++) {
            WebvttCssStyle webvttCssStyle = applicableStyles.get(i2).f58365t;
            if (webvttCssStyle.getRubyPosition() != -1) {
                return webvttCssStyle.getRubyPosition();
            }
        }
        return -1;
    }

    private static String getTagName(String str) {
        String strTrim = str.trim();
        Assertions.checkArgument(!strTrim.isEmpty());
        return Util.splitAtFirst(strTrim, "[ \\.]")[0];
    }

    private static int parseVerticalAttribute(String str) {
        str.getClass();
        if (!str.equals("lr")) {
            if (!str.equals("rl")) {
                Log.w(TAG, "Invalid 'vertical' value: " + str);
                return Integer.MIN_VALUE;
            }
            return 1;
        }
        return 2;
    }

    private static void parseCueSettingsList(String str, I28 i28) {
        Matcher matcher = CUE_SETTING_PATTERN.matcher(str);
        while (matcher.find()) {
            String str2 = (String) Assertions.checkNotNull(matcher.group(1));
            String str3 = (String) Assertions.checkNotNull(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    parseLineAttribute(str3, i28);
                } else if ("align".equals(str2)) {
                    i28.nr = parseTextAlignment(str3);
                } else if ("position".equals(str2)) {
                    parsePositionAttribute(str3, i28);
                } else if ("size".equals(str2)) {
                    i28.mUb = WebvttParserUtil.parsePercentage(str3);
                } else if ("vertical".equals(str2)) {
                    i28.gh = parseVerticalAttribute(str3);
                } else {
                    Log.w(TAG, "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                Log.w(TAG, "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    @Nullable
    private static WebvttCueInfo parseCue(@Nullable String str, Matcher matcher, ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
        I28 i28 = new I28();
        try {
            i28.f58362n = WebvttParserUtil.parseTimestampUs((String) Assertions.checkNotNull(matcher.group(1)));
            i28.rl = WebvttParserUtil.parseTimestampUs((String) Assertions.checkNotNull(matcher.group(2)));
            parseCueSettingsList((String) Assertions.checkNotNull(matcher.group(3)), i28);
            StringBuilder sb = new StringBuilder();
            String line = parsableByteArray.readLine();
            while (!TextUtils.isEmpty(line)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(line.trim());
                line = parsableByteArray.readLine();
            }
            i28.f58363t = parseCueText(str, sb.toString(), list);
            return i28.n();
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }
}
