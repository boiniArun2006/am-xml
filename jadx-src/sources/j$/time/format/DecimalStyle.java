package j$.time.format;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class DecimalStyle {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DecimalStyle f69034d = new DecimalStyle('0', '-', '.');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f69035e = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f69036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f69037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f69038c;

    public static DecimalStyle of(Locale locale) {
        DecimalStyle decimalStyle;
        Objects.requireNonNull(locale, "locale");
        ConcurrentHashMap concurrentHashMap = f69035e;
        DecimalStyle decimalStyle2 = (DecimalStyle) concurrentHashMap.get(locale);
        if (decimalStyle2 != null) {
            return decimalStyle2;
        }
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        if (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') {
            decimalStyle = f69034d;
        } else {
            decimalStyle = new DecimalStyle(zeroDigit, minusSign, decimalSeparator);
        }
        concurrentHashMap.putIfAbsent(locale, decimalStyle);
        return (DecimalStyle) concurrentHashMap.get(locale);
    }

    private DecimalStyle(char c2, char c4, char c5) {
        this.f69036a = c2;
        this.f69037b = c4;
        this.f69038c = c5;
    }

    public final char e() {
        return this.f69036a;
    }

    public final char d() {
        return this.f69037b;
    }

    public final char c() {
        return this.f69038c;
    }

    final int b(char c2) {
        int i2 = c2 - this.f69036a;
        if (i2 < 0 || i2 > 9) {
            return -1;
        }
        return i2;
    }

    final String a(String str) {
        char c2 = this.f69036a;
        if (c2 == '0') {
            return str;
        }
        int i2 = c2 - '0';
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < charArray.length; i3++) {
            charArray[i3] = (char) (charArray[i3] + i2);
        }
        return new String(charArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecimalStyle)) {
            return false;
        }
        DecimalStyle decimalStyle = (DecimalStyle) obj;
        return this.f69036a == decimalStyle.f69036a && this.f69037b == decimalStyle.f69037b && this.f69038c == decimalStyle.f69038c;
    }

    public final int hashCode() {
        return this.f69036a + '+' + this.f69037b + this.f69038c;
    }

    public final String toString() {
        return "DecimalStyle[" + this.f69036a + '+' + this.f69037b + this.f69038c + "]";
    }
}
