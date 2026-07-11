package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class BidiFormatter {
    private static final String J2;
    static final BidiFormatter KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f36624O;
    static final BidiFormatter Uo;
    static final TextDirectionHeuristicCompat nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f36625n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TextDirectionHeuristicCompat f36626t;

    public static final class Builder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f36627n;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private TextDirectionHeuristicCompat f36628t;

        private static BidiFormatter rl(boolean z2) {
            return z2 ? BidiFormatter.KN : BidiFormatter.Uo;
        }

        private void t(boolean z2) {
            this.f36627n = z2;
            this.f36628t = BidiFormatter.nr;
            this.rl = 2;
        }

        public BidiFormatter n() {
            return (this.rl == 2 && this.f36628t == BidiFormatter.nr) ? rl(this.f36627n) : new BidiFormatter(this.f36627n, this.rl, this.f36628t);
        }

        public Builder() {
            t(BidiFormatter.O(Locale.getDefault()));
        }
    }

    private static class DirectionalityEstimator {
        private static final byte[] J2 = new byte[1792];

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private char f36629O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CharSequence f36630n;
        private int nr;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f36631t;

        int nr() {
            this.nr = 0;
            int i2 = 0;
            int i3 = 0;
            int i5 = 0;
            while (this.nr < this.f36631t && i2 == 0) {
                byte bRl = rl();
                if (bRl != 0) {
                    if (bRl == 1 || bRl == 2) {
                        if (i5 == 0) {
                            return 1;
                        }
                    } else if (bRl != 9) {
                        switch (bRl) {
                            case 14:
                            case 15:
                                i5++;
                                i3 = -1;
                                continue;
                            case 16:
                            case 17:
                                i5++;
                                i3 = 1;
                                continue;
                            case 18:
                                i5--;
                                i3 = 0;
                                continue;
                        }
                    }
                } else if (i5 == 0) {
                    return -1;
                }
                i2 = i5;
            }
            if (i2 == 0) {
                return 0;
            }
            if (i3 != 0) {
                return i3;
            }
            while (this.nr > 0) {
                switch (n()) {
                    case 14:
                    case 15:
                        if (i2 == i5) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i2 == i5) {
                            return 1;
                        }
                        break;
                    case 18:
                        i5++;
                        continue;
                }
                i5--;
            }
            return 0;
        }

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                J2[i2] = Character.getDirectionality(i2);
            }
        }

        private byte J2() {
            char cCharAt;
            int i2 = this.nr;
            do {
                int i3 = this.nr;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f36630n;
                int i5 = i3 - 1;
                this.nr = i5;
                cCharAt = charSequence.charAt(i5);
                this.f36629O = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.nr = i2;
            this.f36629O = ';';
            return (byte) 13;
        }

        private byte KN() {
            char cCharAt;
            int i2 = this.nr;
            while (true) {
                int i3 = this.nr;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f36630n;
                int i5 = i3 - 1;
                this.nr = i5;
                char cCharAt2 = charSequence.charAt(i5);
                this.f36629O = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i7 = this.nr;
                        if (i7 > 0) {
                            CharSequence charSequence2 = this.f36630n;
                            int i8 = i7 - 1;
                            this.nr = i8;
                            cCharAt = charSequence2.charAt(i8);
                            this.f36629O = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.nr = i2;
            this.f36629O = Typography.greater;
            return (byte) 13;
        }

        private byte Uo() {
            char cCharAt;
            do {
                int i2 = this.nr;
                if (i2 >= this.f36631t) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f36630n;
                this.nr = i2 + 1;
                cCharAt = charSequence.charAt(i2);
                this.f36629O = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private static byte t(char c2) {
            return c2 < 1792 ? J2[c2] : Character.getDirectionality(c2);
        }

        private byte xMQ() {
            char cCharAt;
            int i2 = this.nr;
            while (true) {
                int i3 = this.nr;
                if (i3 >= this.f36631t) {
                    this.nr = i2;
                    this.f36629O = Typography.less;
                    return (byte) 13;
                }
                CharSequence charSequence = this.f36630n;
                this.nr = i3 + 1;
                char cCharAt2 = charSequence.charAt(i3);
                this.f36629O = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i5 = this.nr;
                        if (i5 < this.f36631t) {
                            CharSequence charSequence2 = this.f36630n;
                            this.nr = i5 + 1;
                            cCharAt = charSequence2.charAt(i5);
                            this.f36629O = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        int O() {
            this.nr = this.f36631t;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                while (this.nr > 0) {
                    byte bN = n();
                    if (bN == 0) {
                        if (i2 == 0) {
                            return -1;
                        }
                        if (i3 == 0) {
                            break;
                        }
                    } else if (bN == 1 || bN == 2) {
                        if (i2 == 0) {
                            return 1;
                        }
                        if (i3 == 0) {
                            break;
                        }
                    } else if (bN != 9) {
                        switch (bN) {
                            case 14:
                            case 15:
                                if (i3 == i2) {
                                    return -1;
                                }
                                i2--;
                                break;
                            case 16:
                            case 17:
                                if (i3 == i2) {
                                    return 1;
                                }
                                i2--;
                                break;
                            case 18:
                                i2++;
                                break;
                            default:
                                if (i3 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }

        byte n() {
            char cCharAt = this.f36630n.charAt(this.nr - 1);
            this.f36629O = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f36630n, this.nr);
                this.nr -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.nr--;
            byte bT = t(this.f36629O);
            if (!this.rl) {
                return bT;
            }
            char c2 = this.f36629O;
            return c2 == '>' ? KN() : c2 == ';' ? J2() : bT;
        }

        byte rl() {
            char cCharAt = this.f36630n.charAt(this.nr);
            this.f36629O = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f36630n, this.nr);
                this.nr += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.nr++;
            byte bT = t(this.f36629O);
            if (!this.rl) {
                return bT;
            }
            char c2 = this.f36629O;
            return c2 == '<' ? xMQ() : c2 == '&' ? Uo() : bT;
        }

        DirectionalityEstimator(CharSequence charSequence, boolean z2) {
            this.f36630n = charSequence;
            this.rl = z2;
            this.f36631t = charSequence.length();
        }
    }

    static {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f36644t;
        nr = textDirectionHeuristicCompat;
        f36624O = Character.toString((char) 8206);
        J2 = Character.toString((char) 8207);
        Uo = new BidiFormatter(false, 2, textDirectionHeuristicCompat);
        KN = new BidiFormatter(true, 2, textDirectionHeuristicCompat);
    }

    private static int n(CharSequence charSequence) {
        return new DirectionalityEstimator(charSequence, false).nr();
    }

    private static int rl(CharSequence charSequence) {
        return new DirectionalityEstimator(charSequence, false).O();
    }

    public static BidiFormatter t() {
        return new Builder().n();
    }

    public CharSequence KN(CharSequence charSequence) {
        return xMQ(charSequence, this.f36626t, true);
    }

    public String gh(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z2) {
        if (str == null) {
            return null;
        }
        return xMQ(str, textDirectionHeuristicCompat, z2).toString();
    }

    public String mUb(String str) {
        return gh(str, this.f36626t, true);
    }

    public boolean nr() {
        return (this.rl & 2) != 0;
    }

    public CharSequence xMQ(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z2) {
        if (charSequence == null) {
            return null;
        }
        boolean zN = textDirectionHeuristicCompat.n(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (nr() && z2) {
            spannableStringBuilder.append((CharSequence) Uo(charSequence, zN ? TextDirectionHeuristicsCompat.rl : TextDirectionHeuristicsCompat.f36643n));
        }
        if (zN != this.f36625n) {
            spannableStringBuilder.append(zN ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z2) {
            spannableStringBuilder.append((CharSequence) J2(charSequence, zN ? TextDirectionHeuristicsCompat.rl : TextDirectionHeuristicsCompat.f36643n));
        }
        return spannableStringBuilder;
    }

    BidiFormatter(boolean z2, int i2, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.f36625n = z2;
        this.rl = i2;
        this.f36626t = textDirectionHeuristicCompat;
    }

    private String J2(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean zN = textDirectionHeuristicCompat.n(charSequence, 0, charSequence.length());
        if (!this.f36625n && (zN || rl(charSequence) == 1)) {
            return f36624O;
        }
        if (this.f36625n) {
            if (!zN || rl(charSequence) == -1) {
                return J2;
            }
            return "";
        }
        return "";
    }

    static boolean O(Locale locale) {
        if (TextUtilsCompat.n(locale) == 1) {
            return true;
        }
        return false;
    }

    private String Uo(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean zN = textDirectionHeuristicCompat.n(charSequence, 0, charSequence.length());
        if (!this.f36625n && (zN || n(charSequence) == 1)) {
            return f36624O;
        }
        if (this.f36625n) {
            if (!zN || n(charSequence) == -1) {
                return J2;
            }
            return "";
        }
        return "";
    }
}
