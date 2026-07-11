package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ColorParser;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t1.AbstractC2372w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ParsableByteArray f58372n = new ParsableByteArray();
    private final StringBuilder rl = new StringBuilder();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f58371t = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern nr = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    private static String J2(ParsableByteArray parsableByteArray, StringBuilder sb) {
        boolean z2 = false;
        sb.setLength(0);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && !z2) {
            char c2 = (char) parsableByteArray.getData()[position];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z2 = true;
            } else {
                position++;
                sb.append(c2);
            }
        }
        parsableByteArray.skipBytes(position - parsableByteArray.getPosition());
        return sb.toString();
    }

    private static void O(String str, WebvttCssStyle webvttCssStyle) {
        Matcher matcher = nr.matcher(AbstractC2372w6.O(str));
        if (!matcher.matches()) {
            Log.w("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) Assertions.checkNotNull(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                webvttCssStyle.setFontSizeUnit(3);
                break;
            case "em":
                webvttCssStyle.setFontSizeUnit(2);
                break;
            case "px":
                webvttCssStyle.setFontSizeUnit(1);
                break;
            default:
                throw new IllegalStateException();
        }
        webvttCssStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
    }

    static void ty(ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z2 = true; parsableByteArray.bytesLeft() > 0 && z2; z2 = false) {
                if (t(parsableByteArray) || rl(parsableByteArray)) {
                    break;
                }
            }
            return;
        }
    }

    private static String KN(ParsableByteArray parsableByteArray, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z2 = false;
        while (!z2) {
            int position = parsableByteArray.getPosition();
            String strUo = Uo(parsableByteArray, sb);
            if (strUo == null) {
                return null;
            }
            if ("}".equals(strUo) || ";".equals(strUo)) {
                parsableByteArray.setPosition(position);
                z2 = true;
            } else {
                sb2.append(strUo);
            }
        }
        return sb2.toString();
    }

    private void n(WebvttCssStyle webvttCssStyle, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f58371t.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                webvttCssStyle.setTargetVoice((String) Assertions.checkNotNull(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = Util.split(str, "\\.");
        String str2 = strArrSplit[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            webvttCssStyle.setTargetTagName(str2.substring(0, iIndexOf2));
            webvttCssStyle.setTargetId(str2.substring(iIndexOf2 + 1));
        } else {
            webvttCssStyle.setTargetTagName(str2);
        }
        if (strArrSplit.length > 1) {
            webvttCssStyle.setTargetClasses((String[]) Util.nullSafeArrayCopyOfRange(strArrSplit, 1, strArrSplit.length));
        }
    }

    public List nr(ParsableByteArray parsableByteArray) {
        this.rl.setLength(0);
        int position = parsableByteArray.getPosition();
        az(parsableByteArray);
        this.f58372n.reset(parsableByteArray.getData(), parsableByteArray.getPosition());
        this.f58372n.setPosition(position);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strXMQ = xMQ(this.f58372n, this.rl);
            if (strXMQ == null || !"{".equals(Uo(this.f58372n, this.rl))) {
                break;
            }
            WebvttCssStyle webvttCssStyle = new WebvttCssStyle();
            n(webvttCssStyle, strXMQ);
            String str = null;
            boolean z2 = false;
            while (!z2) {
                int position2 = this.f58372n.getPosition();
                String strUo = Uo(this.f58372n, this.rl);
                boolean z3 = strUo == null || "}".equals(strUo);
                if (!z3) {
                    this.f58372n.setPosition(position2);
                    mUb(this.f58372n, webvttCssStyle, this.rl);
                }
                str = strUo;
                z2 = z3;
            }
            if ("}".equals(str)) {
                arrayList.add(webvttCssStyle);
            }
        }
        return arrayList;
    }

    static String Uo(ParsableByteArray parsableByteArray, StringBuilder sb) {
        ty(parsableByteArray);
        if (parsableByteArray.bytesLeft() == 0) {
            return null;
        }
        String strJ2 = J2(parsableByteArray, sb);
        if (!"".equals(strJ2)) {
            return strJ2;
        }
        return "" + ((char) parsableByteArray.readUnsignedByte());
    }

    static void az(ParsableByteArray parsableByteArray) {
        while (!TextUtils.isEmpty(parsableByteArray.readLine())) {
        }
    }

    private static char gh(ParsableByteArray parsableByteArray, int i2) {
        return (char) parsableByteArray.getData()[i2];
    }

    private static void mUb(ParsableByteArray parsableByteArray, WebvttCssStyle webvttCssStyle, StringBuilder sb) {
        ty(parsableByteArray);
        String strJ2 = J2(parsableByteArray, sb);
        if (!"".equals(strJ2) && ":".equals(Uo(parsableByteArray, sb))) {
            ty(parsableByteArray);
            String strKN = KN(parsableByteArray, sb);
            if (strKN != null && !"".equals(strKN)) {
                int position = parsableByteArray.getPosition();
                String strUo = Uo(parsableByteArray, sb);
                if (!";".equals(strUo)) {
                    if ("}".equals(strUo)) {
                        parsableByteArray.setPosition(position);
                    } else {
                        return;
                    }
                }
                if (TtmlNode.ATTR_TTS_COLOR.equals(strJ2)) {
                    webvttCssStyle.setFontColor(ColorParser.parseCssColor(strKN));
                    return;
                }
                if ("background-color".equals(strJ2)) {
                    webvttCssStyle.setBackgroundColor(ColorParser.parseCssColor(strKN));
                    return;
                }
                boolean z2 = true;
                if ("ruby-position".equals(strJ2)) {
                    if ("over".equals(strKN)) {
                        webvttCssStyle.setRubyPosition(1);
                        return;
                    } else {
                        if (HrvQKfmFZJudBc.JTjiycGbBKQZuJR.equals(strKN)) {
                            webvttCssStyle.setRubyPosition(2);
                            return;
                        }
                        return;
                    }
                }
                if ("text-combine-upright".equals(strJ2)) {
                    if (!"all".equals(strKN) && !strKN.startsWith("digits")) {
                        z2 = false;
                    }
                    webvttCssStyle.setCombineUpright(z2);
                    return;
                }
                if ("text-decoration".equals(strJ2)) {
                    if (TtmlNode.UNDERLINE.equals(strKN)) {
                        webvttCssStyle.setUnderline(true);
                        return;
                    }
                    return;
                }
                if ("font-family".equals(strJ2)) {
                    webvttCssStyle.setFontFamily(strKN);
                    return;
                }
                if ("font-weight".equals(strJ2)) {
                    if (TtmlNode.BOLD.equals(strKN)) {
                        webvttCssStyle.setBold(true);
                    }
                } else if ("font-style".equals(strJ2)) {
                    if (TtmlNode.ITALIC.equals(strKN)) {
                        webvttCssStyle.setItalic(true);
                    }
                } else if ("font-size".equals(strJ2)) {
                    O(strKN, webvttCssStyle);
                }
            }
        }
    }

    private static String qie(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        boolean z2 = false;
        while (position < iLimit && !z2) {
            int i2 = position + 1;
            if (((char) parsableByteArray.getData()[position]) == ')') {
                z2 = true;
            } else {
                z2 = false;
            }
            position = i2;
        }
        return parsableByteArray.readString((position - 1) - parsableByteArray.getPosition()).trim();
    }

    private static boolean rl(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        if (position + 2 <= iLimit) {
            int i2 = position + 1;
            if (data[position] == 47) {
                int i3 = position + 2;
                if (data[i2] != 42) {
                    return false;
                }
                while (true) {
                    int i5 = i3 + 1;
                    if (i5 < iLimit) {
                        if (((char) data[i3]) == '*' && ((char) data[i5]) == '/') {
                            i3 += 2;
                            iLimit = i3;
                        } else {
                            i3 = i5;
                        }
                    } else {
                        parsableByteArray.skipBytes(iLimit - parsableByteArray.getPosition());
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private static boolean t(ParsableByteArray parsableByteArray) {
        char cGh = gh(parsableByteArray, parsableByteArray.getPosition());
        if (cGh != '\t' && cGh != '\n' && cGh != '\f' && cGh != '\r' && cGh != ' ') {
            return false;
        }
        parsableByteArray.skipBytes(1);
        return true;
    }

    private static String xMQ(ParsableByteArray parsableByteArray, StringBuilder sb) {
        String strQie;
        ty(parsableByteArray);
        if (parsableByteArray.bytesLeft() < 5 || !"::cue".equals(parsableByteArray.readString(5))) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        String strUo = Uo(parsableByteArray, sb);
        if (strUo == null) {
            return null;
        }
        if ("{".equals(strUo)) {
            parsableByteArray.setPosition(position);
            return "";
        }
        if ("(".equals(strUo)) {
            strQie = qie(parsableByteArray);
        } else {
            strQie = null;
        }
        if (!")".equals(Uo(parsableByteArray, sb))) {
            return null;
        }
        return strQie;
    }
}
