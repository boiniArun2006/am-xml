package com.google.android.exoplayer2.text.ttml;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan;
import com.google.android.exoplayer2.text.span.RubySpan;
import com.google.android.exoplayer2.text.span.SpanUtil;
import com.google.android.exoplayer2.text.span.TextEmphasisSpan;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class Ml {
    public static TtmlStyle J2(TtmlStyle ttmlStyle, String[] strArr, Map map) {
        int i2 = 0;
        if (ttmlStyle == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (TtmlStyle) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                TtmlStyle ttmlStyle2 = new TtmlStyle();
                int length = strArr.length;
                while (i2 < length) {
                    ttmlStyle2.n((TtmlStyle) map.get(strArr[i2]));
                    i2++;
                }
                return ttmlStyle2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return ttmlStyle.n((TtmlStyle) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    ttmlStyle.n((TtmlStyle) map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return ttmlStyle;
    }

    private static n O(n nVar, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(nVar);
        while (!arrayDeque.isEmpty()) {
            n nVar2 = (n) arrayDeque.pop();
            TtmlStyle ttmlStyleJ2 = J2(nVar2.J2, nVar2.qie(), map);
            if (ttmlStyleJ2 != null && ttmlStyleJ2.mUb() == 3) {
                return nVar2;
            }
            for (int iUo = nVar2.Uo() - 1; iUo >= 0; iUo--) {
                arrayDeque.push(nVar2.J2(iUo));
            }
        }
        return null;
    }

    private static n nr(n nVar, Map map) {
        while (nVar != null) {
            TtmlStyle ttmlStyleJ2 = J2(nVar.J2, nVar.qie(), map);
            if (ttmlStyleJ2 != null && ttmlStyleJ2.mUb() == 1) {
                return nVar;
            }
            nVar = nVar.mUb;
        }
        return null;
    }

    static String rl(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void n(Spannable spannable, int i2, int i3, TtmlStyle ttmlStyle, n nVar, Map map, int i5) {
        n nVarO;
        int iXMQ;
        TtmlStyle ttmlStyleJ2;
        int i7;
        if (ttmlStyle.qie() != -1) {
            spannable.setSpan(new StyleSpan(ttmlStyle.qie()), i2, i3, 33);
        }
        if (ttmlStyle.o()) {
            spannable.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (ttmlStyle.Z()) {
            spannable.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (ttmlStyle.Ik()) {
            SpanUtil.addOrReplaceSpan(spannable, new ForegroundColorSpan(ttmlStyle.t()), i2, i3, 33);
        }
        if (ttmlStyle.ck()) {
            SpanUtil.addOrReplaceSpan(spannable, new BackgroundColorSpan(ttmlStyle.rl()), i2, i3, 33);
        }
        if (ttmlStyle.nr() != null) {
            SpanUtil.addOrReplaceSpan(spannable, new TypefaceSpan(ttmlStyle.nr()), i2, i3, 33);
        }
        if (ttmlStyle.HI() != null) {
            TextEmphasis textEmphasis = (TextEmphasis) Assertions.checkNotNull(ttmlStyle.HI());
            int i8 = textEmphasis.f58338n;
            if (i8 == -1) {
                if (i5 != 2 && i5 != 1) {
                    i8 = 1;
                } else {
                    i8 = 3;
                }
                i7 = 1;
            } else {
                i7 = textEmphasis.rl;
            }
            int i9 = textEmphasis.f58339t;
            if (i9 == -2) {
                i9 = 1;
            }
            SpanUtil.addOrReplaceSpan(spannable, new TextEmphasisSpan(i8, i7, i9), i2, i3, 33);
        }
        int iMUb = ttmlStyle.mUb();
        if (iMUb != 2) {
            if (iMUb == 3 || iMUb == 4) {
                spannable.setSpan(new j(), i2, i3, 33);
            }
        } else {
            n nVarNr = nr(nVar, map);
            if (nVarNr != null && (nVarO = O(nVarNr, map)) != null) {
                if (nVarO.Uo() == 1 && nVarO.J2(0).rl != null) {
                    String str = (String) Util.castNonNull(nVarO.J2(0).rl);
                    TtmlStyle ttmlStyleJ22 = J2(nVarO.J2, nVarO.qie(), map);
                    if (ttmlStyleJ22 != null) {
                        iXMQ = ttmlStyleJ22.xMQ();
                    } else {
                        iXMQ = -1;
                    }
                    if (iXMQ == -1 && (ttmlStyleJ2 = J2(nVarNr.J2, nVarNr.qie(), map)) != null) {
                        iXMQ = ttmlStyleJ2.xMQ();
                    }
                    spannable.setSpan(new RubySpan(str, iXMQ), i2, i3, 33);
                } else {
                    Log.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        }
        if (ttmlStyle.ty()) {
            SpanUtil.addOrReplaceSpan(spannable, new HorizontalTextInVerticalContextSpan(), i2, i3, 33);
        }
        int iJ2 = ttmlStyle.J2();
        if (iJ2 != 1) {
            if (iJ2 != 2) {
                if (iJ2 != 3) {
                    return;
                }
                SpanUtil.addOrReplaceSpan(spannable, new RelativeSizeSpan(ttmlStyle.O() / 100.0f), i2, i3, 33);
                return;
            }
            SpanUtil.addOrReplaceSpan(spannable, new RelativeSizeSpan(ttmlStyle.O()), i2, i3, 33);
            return;
        }
        SpanUtil.addOrReplaceSpan(spannable, new AbsoluteSizeSpan((int) ttmlStyle.O(), true), i2, i3, 33);
    }

    static void t(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
